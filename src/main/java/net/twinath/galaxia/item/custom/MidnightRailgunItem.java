package net.twinath.galaxia.item.custom;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;

public class MidnightRailgunItem extends BowItem {
    public MidnightRailgunItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public int getUseDuration(ItemStack pStack) {
        return 720000;
    }
}
