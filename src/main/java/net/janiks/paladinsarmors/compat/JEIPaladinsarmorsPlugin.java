package net.janiks.paladinsarmors.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.janiks.paladinsarmors.paladinsarmors;
import net.janiks.paladinsarmors.recipe.ThePrimordiumForgeRecipe;
import net.janiks.paladinsarmors.screen.ThePrimordiumForgeScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIPaladinsarmorsPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(paladinsarmors.MODID,"jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ForgeMeltingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<ThePrimordiumForgeRecipe> forgeMeltingRecipes = recipeManager.getAllRecipesFor(ThePrimordiumForgeRecipe.Type.INSTANCE);
        registration.addRecipes(ForgeMeltingCategory.PRIMORDIUM_FORGE_RECIPE_RECIPE_TYPE,forgeMeltingRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(ThePrimordiumForgeScreen.class, 48,38,20,30,
        ForgeMeltingCategory.PRIMORDIUM_FORGE_RECIPE_RECIPE_TYPE);
    }
}
