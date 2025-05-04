package com.sjkz1.mixin;

import com.sjkz1.AntiCactus;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CactusBlock.class)
public class CactusBlockMixin extends Block
{
    CactusBlockMixin()
    {
        super(null);
    }

    @Inject(method = "entityInside", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"), cancellable = true)
    protected void anticactuss$modifyentityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity, CallbackInfo ci)
    {
        if (entity instanceof ItemEntity itemEntity)
        {
            if (itemEntity.getItem().is(AntiCactus.IMMUNE_TO_CACTUS))
            {
                ci.cancel();
            }
        }
    }
}
