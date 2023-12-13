package net.janiks.paladinsarmors.item;

import net.janiks.paladinsarmors.item.custom.PlatinumArmorItem;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


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

//Armors
    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS,new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}


