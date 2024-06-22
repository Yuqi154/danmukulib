package org.hiedacamellia.danmakutest.registery;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import org.hiedacamellia.danmakutest.Danmukutest;
import org.hiedacamellia.danmakutest.item.Testdanmuku;

public class Regitem {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Danmukutest.MODID);
    public static final RegistryObject<Item> TESTDANMUKU = REGISTRY.register("testdanmuku", () -> new Testdanmuku());
}
