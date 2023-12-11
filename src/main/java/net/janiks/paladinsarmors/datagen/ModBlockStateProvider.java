package net.janiks.paladinsarmors.datagen;

import net.janiks.paladinsarmors.paladinsarmors;
import net.janiks.paladinsarmors.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, paladinsarmors.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLADIUM_BLOCK);
        blockWithItem(ModBlocks.DARK_TITANIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_DARK_TITANIUM_BLOCK);
        blockWithItem(ModBlocks.RED_STEEL_BLOCK);
        blockWithItem(ModBlocks.RAW_RED_STEEL_BLOCK);
        blockWithItem(ModBlocks.PINK_AZURE_BLOCK);
        blockWithItem(ModBlocks.RAW_PINK_AZURE_BLOCK);

//ORES
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockWithItem(ModBlocks.NETHER_PLATINUM_ORE);
        blockWithItem(ModBlocks.END_PLATINUM_ORE);
        blockWithItem(ModBlocks.PINK_AZURE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PINK_AZURE_ORE);
        blockWithItem(ModBlocks.DARK_TITANIUM_ORE);
        blockWithItem(ModBlocks.RED_STEEL_ORE);

        //THE PRIMORDIUM FORGE
        simpleBlockWithItem(ModBlocks.THE_PRIMORDIUM_FORGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/the_primordium_forge")));




    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}