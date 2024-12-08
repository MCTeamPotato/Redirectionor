package com.Hileb.teampotato.redirectionor;

import nilloader.api.ClassTransformer;
import nilloader.api.ModRemapper;
import nilloader.api.NilLogger;

// All entrypoint classes must implement Runnable.
public class RedirectionorPremain implements Runnable {

	// NilLoader comes with a logger abstraction that Does The Right Thing depending on the environment.
	// You should always use it.
	public static final NilLogger log = NilLogger.get("Redirectionor");
	
	@Override
	public void run() {
		// You can change your desired mapping here. Setting it to "default" doesn't accomplish
		// anything, but it's here for illustration.
		ModRemapper.setTargetMapping("default");
		
		// Any class transformers need to be registered with NilLoader like this.
		ClassTransformer.register(new ExampleTransformer());
	}

	public static java.io.File tryGetMinecraftHome() {
		try {
			return (java.io.File)Class.of("net.minecraft.launchwrapper.Launch").getField("minecraftHome").get(null);
		} catch (Throwable ignored){}

		try {
			Object launcher = Class.of("cpw.mods.modlauncher.Launcher").getField("INSTANCE").get(null);
			Object environment = Class.of("cpw.mods.modlauncher.Launcher").getField("environment").get(launcher);
			java.util.Optional<java.nio.file.Path> path = (java.util.Optional<java.nio.file.Path>) Class.of("cpw.mods.modlauncher.api.IEnvironment").getMethod("getProperty").invoke(environment, Class.of("cpw.mods.modlauncher.api.IEnvironment$Keys").getField("GAMEDIR").get(null));
			return path.get().toFile();
		} catch (Throwable ignored){}

		return null;
	}

}
