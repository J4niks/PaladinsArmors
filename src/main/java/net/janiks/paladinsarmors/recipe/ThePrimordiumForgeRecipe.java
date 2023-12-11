package net.janiks.paladinsarmors.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.datafixers.TypedOptic;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ThePrimordiumForgeRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;
    private final ResourceLocation id;

    public ThePrimordiumForgeRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.id = id;
    }

    @Override
    public boolean matches(SimpleContainer simpleContainer, Level level) {
        if (level.isClientSide()) {
            return false;
        }
        return inputItems.get(0).test(simpleContainer.getItem(0)) &&
                inputItems.get(1).test(simpleContainer.getItem(1)) &&
                inputItems.get(2).test(simpleContainer.getItem(2));
    }

    @Override
    public ItemStack assemble(SimpleContainer simpleContainer, RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<ThePrimordiumForgeRecipe> {

        public static final Type INSTANCE = new Type();
        public static final String ID = "pladium_ingot";
    }

    public static class Serializer implements RecipeSerializer<ThePrimordiumForgeRecipe>{
        public static final  Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(paladinsarmors.MODID,"pladium_ingot");
        @Override
        public ThePrimordiumForgeRecipe fromJson(ResourceLocation resourceLocation, JsonObject jsonObject) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(jsonObject, "output"));
            JsonArray ingredients = GsonHelper.getAsJsonArray(jsonObject,"ingredients");
            NonNullList<Ingredient> inputs =  NonNullList.withSize(3,Ingredient.EMPTY);

            for (int i= 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }
            return new ThePrimordiumForgeRecipe(inputs, output, resourceLocation);
        }

        @Override
        public @Nullable ThePrimordiumForgeRecipe fromNetwork(ResourceLocation resourceLocation, FriendlyByteBuf friendlyByteBuf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(friendlyByteBuf.readInt(), Ingredient.EMPTY);
            for (int i = 0; i <inputs.size(); i++){
                inputs.set(i, Ingredient.fromNetwork(friendlyByteBuf));
            }
            ItemStack output = friendlyByteBuf.readItem();
            return new ThePrimordiumForgeRecipe(inputs, output, resourceLocation);
        }

        @Override
        public void toNetwork(FriendlyByteBuf friendlyByteBuf, ThePrimordiumForgeRecipe thePrimordiumForgeRecipe) {
            friendlyByteBuf.writeInt(thePrimordiumForgeRecipe.inputItems.size());

            for(Ingredient ingredient: thePrimordiumForgeRecipe.getIngredients()) {
                ingredient.toNetwork(friendlyByteBuf);
            }
            friendlyByteBuf.writeItemStack(thePrimordiumForgeRecipe.getResultItem(null),false);

        }
    }
}
