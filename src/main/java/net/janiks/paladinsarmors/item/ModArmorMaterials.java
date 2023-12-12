package net.janiks.paladinsarmors.item;

import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    PLATINUM("platinum", 26,new int[]{4, 9, 7, 4}, 25,
            SoundEvents.ARMOR_EQUIP_IRON,4.0F,0.2F,()-> Ingredient.of(ModItems.PlATINUM_INGOT.get())),
    DARK_TITANIUM("dark_titanium", 26,new int[]{5, 10, 8, 5}, 25,
    SoundEvents.ARMOR_EQUIP_IRON,5.0F,0.3F,()-> Ingredient.of(ModItems.DARK_TITANIUM_INGOT.get())),
    RED_STEEL("red_steel", 26,new int[]{6, 11, 9, 6}, 25,
    SoundEvents.ARMOR_EQUIP_IRON,6.0F,0.4F,()-> Ingredient.of(ModItems.RED_STEEL_INGOT.get())),
    PLADIUM("pladium", 26,new int[]{10, 15, 13, 10}, 25,
    SoundEvents.ARMOR_EQUIP_IRON,10.0F,1.0F,()-> Ingredient.of(ModItems.PlADIUM_INGOT.get()));

    private  final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return paladinsarmors.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
