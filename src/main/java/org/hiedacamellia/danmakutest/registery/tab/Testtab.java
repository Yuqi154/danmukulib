package org.hiedacamellia.danmakutest.registery.tab;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import org.hiedacamellia.danmakutest.Danmukutest;
import org.hiedacamellia.danmakutest.registery.Regitem;


public class Testtab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Danmukutest.MODID);
    public static final RegistryObject<CreativeModeTab> DANMUKTEST = REGISTRY.register("danmukutest",
            () -> CreativeModeTab.builder().title(Component.translatable("item_group.danmukutest.test")).icon(() -> new ItemStack(Regitem.TESTDANMUKU.get())).displayItems((parameters, tabData) -> {
                        tabData.accept(Regitem.TESTDANMUKU.get());
                    })

                    .build());
}
