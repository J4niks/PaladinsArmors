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
        return new ResourceLocation(paladinsarmors.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ForgeSmeltingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<ThePrimordiumForgeRecipe> forgeRecipes = recipeManager.getAllRecipesFor(ThePrimordiumForgeRecipe.Type.INSTANCE);
        registration.addRecipes(ForgeSmeltingCategory.FORGE_SMELTING_TYPE, forgeRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(ThePrimordiumForgeScreen.class, 40, 30, 20, 30,
                ForgeSmeltingCategory.FORGE_SMELTING_TYPE);
    }
}