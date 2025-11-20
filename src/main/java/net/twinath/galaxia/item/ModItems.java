package net.twinath.galaxia.item;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twinath.galaxia.Galaxia;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Galaxia.MOD_ID);

    public static final RegistryObject<Item> MIDNIGHT_RAILGUN = ITEMS.register("midnight_railgun",
            () -> new BowItem(new Item.Properties().durability(5000)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
