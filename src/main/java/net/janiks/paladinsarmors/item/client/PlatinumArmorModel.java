package net.janiks.paladinsarmors.item.client;

import net.janiks.paladinsarmors.item.custom.PlatinumArmorItem;
import net.janiks.paladinsarmors.paladinsarmors;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PlatinumArmorModel extends GeoModel<PlatinumArmorItem> {
    @Override
    public ResourceLocation getModelResource(PlatinumArmorItem animatable) {
        return new ResourceLocation(paladinsarmors.MODID,"geo/platinum_armor.json");
    }

    @Override
    public ResourceLocation getTextureResource(PlatinumArmorItem animatable) {
        return new ResourceLocation(paladinsarmors.MODID,"textures/armor/platinum_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PlatinumArmorItem animatable) {
        return new ResourceLocation(paladinsarmors.MODID,"animations/platinum_armor_animation.json");
    }
}
