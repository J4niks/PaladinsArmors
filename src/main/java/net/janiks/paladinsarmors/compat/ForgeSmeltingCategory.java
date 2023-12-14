package net.janiks.paladinsarmors.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.janiks.paladinsarmors.paladinsarmors;
import net.janiks.paladinsarmors.block.ModBlocks;
import net.janiks.paladinsarmors.recipe.ThePrimordiumForgeRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class ForgeSmeltingCategory implements IRecipeCategory<ThePrimordiumForgeRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(paladinsarmors.MODID, "forge_smelting");
    public static final ResourceLocation TEXTURE = new ResourceLocation(paladinsarmors.MODID,
            "textures/gui/the_primordium_forge_gui.png");

    public static final RecipeType<ThePrimordiumForgeRecipe> FORGE_SMELTING_TYPE =
            new RecipeType<>(UID, ThePrimordiumForgeRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public ForgeSmeltingCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE,0,0,176,85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.THE_PRIMORDIUM_FORGE.get()));
    }

    @Override
    public RecipeType<ThePrimordiumForgeRecipe> getRecipeType() {
        return FORGE_SMELTING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.paladinsarmors.the_primordium_forge");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ThePrimordiumForgeRecipe recipe, IFocusGroup focuses) {

        builder.addSlot(RecipeIngredientRole.INPUT, 8, 17).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 17).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 17).addIngredients(recipe.getIngredients().get(2));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 44, 62).addItemStack(recipe.getResultItem(null));
    }
}