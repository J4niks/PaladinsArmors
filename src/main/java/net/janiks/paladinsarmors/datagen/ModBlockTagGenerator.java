package net.janiks.paladinsarmors.datagen;

import net.janiks.paladinsarmors.block.ModBlocks;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, paladinsarmors.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(ModBlocks.NETHER_PLATINUM_ORE.get())
                .add(ModBlocks.END_PLATINUM_ORE.get())
                .add(ModBlocks.PINK_AZURE_ORE.get())
                .add(ModBlocks.PINK_AZURE_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_PINK_AZURE_ORE.get())
                .add(ModBlocks.RAW_PINK_AZURE_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.PLADIUM_BLOCK.get())
                .add(ModBlocks.DARK_TITANIUM_BLOCK.get())
                .add(ModBlocks.RAW_DARK_TITANIUM_BLOCK.get())
                .add(ModBlocks.DARK_TITANIUM_ORE.get())
                .add(ModBlocks.RED_STEEL_BLOCK.get())
                .add(ModBlocks.RAW_RED_STEEL_BLOCK.get())
                .add(ModBlocks.RED_STEEL_ORE.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get(),
                ModBlocks.PLATINUM_ORE.get(),
                ModBlocks.PLATINUM_BLOCK.get(),
                ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                ModBlocks.NETHER_PLATINUM_ORE.get(),
                ModBlocks.END_PLATINUM_ORE.get(),
                ModBlocks.PINK_AZURE_ORE.get(),
                ModBlocks.PINK_AZURE_BLOCK.get(),
                ModBlocks.DEEPSLATE_PINK_AZURE_ORE.get(),
                ModBlocks.RAW_PINK_AZURE_BLOCK.get(),
                ModBlocks.PLADIUM_BLOCK.get(),
                ModBlocks.DARK_TITANIUM_BLOCK.get(),
                ModBlocks.RAW_DARK_TITANIUM_BLOCK.get(),
                ModBlocks.RED_STEEL_BLOCK.get(),
                ModBlocks.RAW_RED_STEEL_BLOCK.get(),
                ModBlocks.DARK_TITANIUM_ORE.get(),
                ModBlocks.RED_STEEL_ORE.get());

    }
}
