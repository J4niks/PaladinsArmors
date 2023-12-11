package net.janiks.paladinsarmors.datagen.loot;

import net.janiks.paladinsarmors.block.ModBlocks;
import net.janiks.paladinsarmors.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PLADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RED_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RED_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_DARK_TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PINK_AZURE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PINK_AZURE_BLOCK.get());
        this.dropSelf(ModBlocks.THE_PRIMORDIUM_FORGE.get());




        this.add(ModBlocks.RED_STEEL_ORE.get(),
                block -> createEndLikeOreDrops(ModBlocks.RED_STEEL_ORE.get(), ModItems.RAW_RED_STEEL.get()));
        this.add(ModBlocks.END_PLATINUM_ORE.get(),
                block -> createOverwordLikeOreDrops(ModBlocks.END_PLATINUM_ORE.get(), ModItems.RAW_PlATINUM.get()));
        this.add(ModBlocks.DARK_TITANIUM_ORE.get(),
                block -> createNetherLikeOreDrops(ModBlocks.DARK_TITANIUM_ORE.get(), ModItems.RAW_DARK_TITANIUM.get()));
        this.add(ModBlocks.NETHER_PLATINUM_ORE.get(),
                block -> createOverwordLikeOreDrops(ModBlocks.NETHER_PLATINUM_ORE.get(), ModItems.RAW_PlATINUM.get()));
        this.add(ModBlocks.DEEPSLATE_PINK_AZURE_ORE.get(),
                block -> createOverwordLikeOreDrops(ModBlocks.DEEPSLATE_PINK_AZURE_ORE.get(), ModItems.RAW_PINK_AZURE.get()));
        this.add(ModBlocks.PINK_AZURE_ORE.get(),
                block -> createOverwordLikeOreDrops(ModBlocks.PINK_AZURE_ORE.get(), ModItems.RAW_PINK_AZURE.get()));
        this.add(ModBlocks.PLATINUM_ORE.get(),
                block -> createOverwordLikeOreDrops(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PlATINUM.get()));
        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createOverwordLikeOreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PlATINUM.get()));

    }

    protected LootTable.Builder createOverwordLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createNetherLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
        protected LootTable.Builder createEndLikeOreDrops(Block pBlock, Item item) {
            return createSilkTouchDispatchTable(pBlock,
                    this.applyExplosionDecay(pBlock,
                            LootItem.lootTableItem(item)
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}