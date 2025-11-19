package net.twinath.galaxia.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.twinath.galaxia.block.ModBlocks;
import net.twinath.galaxia.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MILKIUM_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.MILKIUM_BAR.get())
                .unlockedBy(getHasName(ModItems.MILKIUM_BAR.get()), has(ModItems.MILKIUM_BAR.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MILKIUM_SCYTHE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern("S  ")
                .define('M', ModItems.MILKIUM_BAR.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.MILKIUM_BAR.get()), has(ModItems.MILKIUM_BAR.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MILKIUM_BAR.get(), 9)
                .requires(ModBlocks.MILKIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MILKIUM_BLOCK.get()), has(ModBlocks.MILKIUM_BLOCK.get()))
                .save(pWriter);
    }
}
