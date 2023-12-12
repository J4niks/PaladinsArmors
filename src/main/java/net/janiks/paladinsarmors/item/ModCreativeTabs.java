package net.janiks.paladinsarmors.item;

import net.janiks.paladinsarmors.block.ModBlocks;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, paladinsarmors.MODID);

    public static final RegistryObject<CreativeModeTab> paladinsarmors_TAB = CREATIVE_MODE_TABS.register("paladinsarmors_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PlATINUM_INGOT.get()))
                    .title(Component.translatable("creativetab.paladinsarmors_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
//INGOTS=========================
//RAW
                        output.accept(ModItems.RAW_PlATINUM.get());
                        output.accept(ModItems.RAW_PINK_AZURE.get());
                        output.accept(ModItems.RAW_DARK_TITANIUM.get());
                        output.accept(ModItems.RAW_RED_STEEL.get());

//INGOT
                        output.accept(ModItems.PlATINUM_INGOT.get());
                        output.accept(ModItems.PINK_AZURE_INGOT.get());
                        output.accept(ModItems.DARK_TITANIUM_INGOT.get());
                        output.accept(ModItems.RED_STEEL_INGOT.get());
                        output.accept(ModItems.PlADIUM_INGOT.get());

//BLOCKS=========================
//BLOCK
                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.PINK_AZURE_BLOCK.get());
                        output.accept(ModBlocks.RAW_PINK_AZURE_BLOCK.get());
                        output.accept(ModBlocks.DARK_TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_DARK_TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.RED_STEEL_BLOCK.get());
                        output.accept(ModBlocks.RAW_RED_STEEL_BLOCK.get());
                        output.accept(ModBlocks.PLADIUM_BLOCK.get());
                        output.accept(ModBlocks.THE_PRIMORDIUM_FORGE.get());
//ORE
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.END_PLATINUM_ORE.get());
                        output.accept(ModBlocks.NETHER_PLATINUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        output.accept(ModBlocks.PINK_AZURE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PINK_AZURE_ORE.get());
                        output.accept(ModBlocks.DARK_TITANIUM_ORE.get());
                        output.accept(ModBlocks.RED_STEEL_ORE.get());
//ARMORS
                        output.accept(ModItems.PLATINUM_HELMET.get());
                        output.accept(ModItems.PLATINUM_CHESTPLATE.get());
                        output.accept(ModItems.PLATINUM_LEGGINGS.get());
                        output.accept(ModItems.PLATINUM_BOOTS.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
