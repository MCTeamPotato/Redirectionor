package com.teampotato.redirector.mixin.net.minecraft.world.level.pathfinder;

import com.teampotato.redirector.utils.values.CommonValues;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.Target;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Target.class)
public abstract class TargetMixin {
    @Redirect(method = "createFromStream", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/pathfinder/BlockPathTypes;values()[Lnet/minecraft/world/level/pathfinder/BlockPathTypes;"))
    private static BlockPathTypes[] redirectBlockPathTypes() {
        return CommonValues.BLOCK_PATH_TYPES;
    }
}
