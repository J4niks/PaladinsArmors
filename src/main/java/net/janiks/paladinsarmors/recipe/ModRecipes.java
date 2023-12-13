package net.janiks.paladinsarmors.recipe;

import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, paladinsarmors.MODID);

    public static final RegistryObject<RecipeSerializer<ThePrimordiumForgeRecipe>> FORGE_SMELTING_SERIALIZER =
            SERIALIZERS.register("forge_smelting",()-> ThePrimordiumForgeRecipe.Serializer.INSTANCE);
    //                                  Ou pladium_ingot
    public static void  register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);


    }
}
