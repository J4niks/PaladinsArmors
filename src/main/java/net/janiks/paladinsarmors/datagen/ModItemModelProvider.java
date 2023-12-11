package net.janiks.paladinsarmors.datagen;

import net.janiks.paladinsarmors.paladinsarmors;
import net.janiks.paladinsarmors.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, paladinsarmors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.DARK_TITANIUM_INGOT);
        simpleItem(ModItems.RAW_DARK_TITANIUM);
        simpleItem(ModItems.PlADIUM_INGOT);
        simpleItem(ModItems.PlATINUM_INGOT);
        simpleItem(ModItems.RAW_PlATINUM);
        simpleItem(ModItems.PINK_AZURE_INGOT);
        simpleItem(ModItems.RAW_PINK_AZURE);
        simpleItem(ModItems.RED_STEEL_INGOT);
        simpleItem(ModItems.RAW_RED_STEEL);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(paladinsarmors.MODID,"item/" + item.getId().getPath()));
    }
}