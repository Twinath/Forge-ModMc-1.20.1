package net.twinath.galaxia.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.twinath.galaxia.Galaxia;
import net.twinath.galaxia.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier MILKIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 5000, 12f, 5f, 25,
                    ModTags.Blocks.NEEDS_MILKIUM_TOOL, () -> Ingredient.of(ModItems.MILKIUM_BAR.get())),
            ResourceLocation.fromNamespaceAndPath(Galaxia.MOD_ID, "milkium_bar"), List.of(Tiers.NETHERITE), List.of());

}
