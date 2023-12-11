package net.janiks.paladinsarmors.block;

import net.janiks.paladinsarmors.block.custom.ThePrimordiumForgeBlock;
import net.janiks.paladinsarmors.item.ModItems;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, paladinsarmors.MODID);
    //NORMAL BLOCKS
    public static final RegistryObject<Block> THE_PRIMORDIUM_FORGE = registerBlock("the_primordium_forge",
            () -> new ThePrimordiumForgeBlock(BlockBehaviour.Properties.copy(Blocks.ANVIL).noOcclusion()));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> PINK_AZURE_BLOCK = registerBlock("pink_azure_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_PINK_AZURE_BLOCK = registerBlock("raw_pink_azure_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DARK_TITANIUM_BLOCK = registerBlock("dark_titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_DARK_TITANIUM_BLOCK = registerBlock("raw_dark_titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RED_STEEL_BLOCK = registerBlock("red_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_RED_STEEL_BLOCK = registerBlock("raw_red_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> PLADIUM_BLOCK = registerBlock("pladium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    //ORE
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3.5F,4.0F),
                    UniformInt.of(3,8)));
    public static final RegistryObject<Block> NETHER_PLATINUM_ORE = registerBlock("nether_platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)
                    .strength(3.0F,4.0F),
                    UniformInt.of(4,8)));
    public static final RegistryObject<Block> END_PLATINUM_ORE = registerBlock("end_platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3.5F,4.0F)
                    .sound(SoundType.STONE),
                    UniformInt.of(5,9)));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3.5F,4.0F),
                    UniformInt.of(3,8)));
    public static final RegistryObject<Block> DEEPSLATE_PINK_AZURE_ORE = registerBlock("deepslate_pink_azure_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3.7F,5.0F),
                    UniformInt.of(3,8)));
    public static final RegistryObject<Block> PINK_AZURE_ORE = registerBlock("pink_azure_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3.5F,4.0F),
                    UniformInt.of(3,8)));

    public static final RegistryObject<Block> RED_STEEL_ORE = registerBlock("red_steel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(4.0F,6.0F)
                    .sound(SoundType.STONE),
                    UniformInt.of(5,9)));
    public static final RegistryObject<Block> DARK_TITANIUM_ORE = registerBlock("dark_titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)
                    .strength(3.0F,4.0F),
                    UniformInt.of(4,8)));
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
         RegistryObject<T> toReturn = BLOCKS.register(name, block);
         registerBlockItem(name, toReturn);
         return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
