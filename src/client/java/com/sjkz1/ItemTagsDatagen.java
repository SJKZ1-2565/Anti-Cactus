package com.sjkz1;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ItemTagsDatagen extends FabricTagProvider<Item>
{
    public ItemTagsDatagen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(output, Registries.ITEM, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        this.getOrCreateTagBuilder(AntiCactus.IMMUNE_TO_CACTUS).add(Items.NETHERITE_SCRAP).add(Items.NETHERITE_INGOT)
                .add(Items.NETHERITE_BLOCK)
                .add(Items.NETHERITE_HELMET).add(Items.NETHERITE_CHESTPLATE).add(Items.NETHERITE_LEGGINGS)
                .add(Items.NETHERITE_BOOTS).add(Items.NETHERITE_SWORD).add(Items.NETHERITE_PICKAXE)
                .add(Items.NETHERITE_AXE).add(Items.NETHERITE_SHOVEL).add(Items.NETHERITE_HOE)
                .add(Items.ANCIENT_DEBRIS);
    }
}
