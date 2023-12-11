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

    public static final RegistryObject<RecipeSerializer<ThePrimordiumForgeRecipe>> PLADIUM_INGOT_SERIALIZER =
            SERIALIZERS.register("pladium_ingot",()-> ThePrimordiumForgeRecipe.Serializer.INSTANCE);
    public static void  register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);


    }
}
