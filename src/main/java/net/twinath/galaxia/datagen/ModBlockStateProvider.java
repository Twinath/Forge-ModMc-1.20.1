package net.twinath.galaxia.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.twinath.galaxia.Galaxia;
import net.twinath.galaxia.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output,  ExistingFileHelper exFileHelper) {
        super(output, Galaxia.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
         blockWithItem(ModBlocks.MILKIUM_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
