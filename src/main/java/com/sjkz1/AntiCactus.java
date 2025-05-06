package com.sjkz1;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AntiCactus implements ModInitializer
{
    public static final String MOD_ID = "anti-cactus";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final TagKey<Item> IMMUNE_TO_CACTUS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID,"immune_to_cactus"));

    @Override
    public void onInitialize()
    {

    }
}