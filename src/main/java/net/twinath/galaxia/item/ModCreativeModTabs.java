package net.twinath.galaxia.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.twinath.galaxia.Galaxia;
import net.twinath.galaxia.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Galaxia.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GALAXIA_TAB = CREATIVE_MODE_TABS.register("galaxia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MIDNIGHT_RAILGUN.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MIDNIGHT_RAILGUN.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
