package net.janiks.paladinsarmors.datagen;

import net.janiks.paladinsarmors.paladinsarmors;
import net.janiks.paladinsarmors.block.ModBlocks;
import net.janiks.paladinsarmors.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(
            ModItems.RAW_PlATINUM.get(),
            ModBlocks.PLATINUM_ORE.get(),
            ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
            ModBlocks.NETHER_PLATINUM_ORE.get(),
            ModBlocks.END_PLATINUM_ORE.get());
    private static final List<ItemLike> PINK_AZURE_SMELTABLES = List.of(
            ModItems.RAW_PINK_AZURE.get(),
            ModBlocks.PINK_AZURE_ORE.get(),
            ModBlocks.DEEPSLATE_PINK_AZURE_ORE.get());
    private static final List<ItemLike> RED_STEEL_SMELTABLES = List.of(
            ModItems.RAW_RED_STEEL.get(),
            ModBlocks.RED_STEEL_ORE.get());
    private static final List<ItemLike> DARK_TITANIUM_SMELTABLES = List.of(
            ModItems.RAW_DARK_TITANIUM.get(),
            ModBlocks.DARK_TITANIUM_ORE.get());
    private static final List<ItemLike> RAW_PLATINUM_BLOCKS_SMELTABLES = List.of(
            ModBlocks.RAW_PLATINUM_BLOCK.get());
    private static final List<ItemLike> RAW_PINK_AZURE_BLOCK_SMELTABLES = List.of(
            ModBlocks.RAW_PINK_AZURE_BLOCK.get());
    private static final List<ItemLike> RAW_DARK_TITANIUM_BLOCK_SMELTABLES = List.of(
            ModBlocks.RAW_DARK_TITANIUM_BLOCK.get());
    private static final List<ItemLike> RAW_RED_STEEL_BLOCK_SMELTABLES = List.of(
            ModBlocks.RAW_RED_STEEL_BLOCK.get());



    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PlATINUM_INGOT.get(), 0.3f, 200, "platinum_ingot");
        oreBlasting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PlATINUM_INGOT.get(), 0.3f, 100, "platinum_ingot");

        oreSmelting(pWriter, PINK_AZURE_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_AZURE_INGOT.get(), 0.35f, 200, "pink_azure_ingot");
        oreBlasting(pWriter, PINK_AZURE_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_AZURE_INGOT.get(), 0.35f, 100, "pink_azure_ingot");

        oreSmelting(pWriter, RED_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.RED_STEEL_INGOT.get(), 0.60f, 300, "red_steel_ingot");
        oreBlasting(pWriter, RED_STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.RED_STEEL_INGOT.get(), 0.60f, 200, "red_steel_ingot");

        oreSmelting(pWriter, DARK_TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.DARK_TITANIUM_INGOT.get(), 0.45f, 250, "dark_titanium_ingot");
        oreBlasting(pWriter, DARK_TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.DARK_TITANIUM_INGOT.get(), 0.45f, 150, "dark_titanium_ingot");

        //RAW BLOCKS
        oreSmelting(pWriter, RAW_PLATINUM_BLOCKS_SMELTABLES, RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get(), 0.3f, 2000, "platinum_block");
        oreBlasting(pWriter, RAW_PLATINUM_BLOCKS_SMELTABLES, RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get(), 0.3f, 1000, "platinum_block");
        oreSmelting(pWriter, RAW_PINK_AZURE_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.PINK_AZURE_BLOCK.get(), 0.3f, 200, "pink_azure_block");
        oreBlasting(pWriter, RAW_PINK_AZURE_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.PINK_AZURE_BLOCK.get(), 0.3f, 1000, "pink_azure_block");
        oreSmelting(pWriter, RAW_RED_STEEL_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.RED_STEEL_BLOCK.get(), 0.3f, 2000, "red_steel_block");
        oreBlasting(pWriter, RAW_RED_STEEL_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.RED_STEEL_BLOCK.get(), 0.3f, 1000, "red_steel_block");
        oreSmelting(pWriter, RAW_DARK_TITANIUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.DARK_TITANIUM_BLOCK.get(), 0.3f, 2000, "dark_titanium_block");
        oreBlasting(pWriter, RAW_DARK_TITANIUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.DARK_TITANIUM_BLOCK.get(), 0.3f, 1000, "dark_titanium_block");



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PlATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PlATINUM_INGOT.get()), has(ModItems.PlATINUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PlATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PLATINUM_BLOCK.get()), has(ModBlocks.PLATINUM_BLOCK.get()))
                .save(pWriter);

        //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_AZURE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PINK_AZURE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PINK_AZURE_INGOT.get()), has(ModItems.PINK_AZURE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PINK_AZURE_INGOT.get(), 9)
                .requires(ModBlocks.PINK_AZURE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PINK_AZURE_BLOCK.get()), has(ModBlocks.PINK_AZURE_BLOCK.get()))
                .save(pWriter);
        //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_TITANIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.DARK_TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.DARK_TITANIUM_INGOT.get()), has(ModItems.DARK_TITANIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DARK_TITANIUM_INGOT.get(), 9)
                .requires(ModBlocks.DARK_TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.DARK_TITANIUM_BLOCK.get()), has(ModBlocks.DARK_TITANIUM_BLOCK.get()))
                .save(pWriter);
        //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RED_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.RED_STEEL_INGOT.get()), has(ModItems.RED_STEEL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RED_STEEL_INGOT.get(), 9)
                .requires(ModBlocks.RED_STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RED_STEEL_BLOCK.get()), has(ModBlocks.RED_STEEL_BLOCK.get()))
                .save(pWriter);
        //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLADIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PlADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PlADIUM_INGOT.get()), has(ModItems.PlADIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PlADIUM_INGOT.get(), 9)
                .requires(ModBlocks.PLADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PLADIUM_BLOCK.get()), has(ModBlocks.PLADIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_PlATINUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PlATINUM.get()), has(ModItems.RAW_PlATINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PINK_AZURE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_PINK_AZURE.get())
                .unlockedBy(getHasName(ModItems.RAW_PINK_AZURE.get()), has(ModItems.RAW_PINK_AZURE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_DARK_TITANIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_DARK_TITANIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_DARK_TITANIUM.get()), has(ModItems.RAW_DARK_TITANIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RED_STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_RED_STEEL.get())
                .unlockedBy(getHasName(ModItems.RAW_RED_STEEL.get()), has(ModItems.RAW_RED_STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_HELMET.get())
                .pattern("SSS")
                .pattern("SZS")
                .pattern("   ")
                .define('S', ModItems.PlATINUM_INGOT.get())
                .define('Z', Items.RED_WOOL)
                .unlockedBy(getHasName(ModItems.PlATINUM_INGOT.get()), has(ModItems.PlATINUM_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_CHESTPLATE.get())
                .pattern("SZS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.PlATINUM_INGOT.get())
                .define('Z', Items.RED_WOOL)
                .unlockedBy(getHasName(ModItems.PlATINUM_INGOT.get()), has(ModItems.PlATINUM_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_LEGGINGS.get())
                .pattern("SSS")
                .pattern("ZSZ")
                .pattern("SSS")
                .define('S', ModItems.PlATINUM_INGOT.get())
                .define('Z', Items.RED_WOOL)
                .unlockedBy(getHasName(ModItems.PlATINUM_INGOT.get()), has(ModItems.PlATINUM_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .pattern("Z Z")
                .define('S', ModItems.PlATINUM_INGOT.get())
                .define('Z', Items.RED_WOOL)

                .unlockedBy(getHasName(ModItems.PlATINUM_INGOT.get()), has(ModItems.PlATINUM_INGOT.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  paladinsarmors.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}