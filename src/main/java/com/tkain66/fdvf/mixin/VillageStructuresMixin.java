package com.tkain66.fdvf.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vectorwing.farmersdelight.world.VillageStructures;

import java.util.Random;

@Mixin(VillageStructures.class)
public class VillageStructuresMixin {

    private static final Random seededRandom = new Random(3257840388504953787L);

    @ModifyArg(method = "addToPool", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/feature/jigsaw/JigsawPattern;getShuffledTemplates(Ljava/util/Random;)Ljava/util/List;"), index = 0)
    private static Random useSeededRandom(Random ignoredUnseededRandom) {
        return seededRandom;
    }
}
