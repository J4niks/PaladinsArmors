package net.janiks.paladinsarmors.items;

import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, paladinsarmors.MODID);

    public static final RegistryObject<Item> PlATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_AZURE_INGOT = ITEMS.register("pink_azure_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_TITANIUM_INGOT= ITEMS.register("dark_titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_STEEL_INGOT = ITEMS.register("red_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PlADIUM_INGOT = ITEMS.register("pladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PlATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PINK_AZURE = ITEMS.register("raw_pink_azure",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DARK_TITANIUM= ITEMS.register("raw_dark_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RED_STEEL = ITEMS.register("raw_red_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PlADIUM_COMPOUND = ITEMS.register("raw_pladium_compound",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}


