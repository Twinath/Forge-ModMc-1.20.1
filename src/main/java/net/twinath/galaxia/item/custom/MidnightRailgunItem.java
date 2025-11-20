package net.twinath.galaxia.item.custom;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class MidnightRailgunItem extends BowItem {
    public MidnightRailgunItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return super.getUseAnimation(pStack);
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 720000;
    }
}
