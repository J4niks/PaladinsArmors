package net.janiks.paladinsarmors.item.client;

import net.janiks.paladinsarmors.item.custom.PlatinumArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PlatinumArmorRenderer extends GeoArmorRenderer<PlatinumArmorItem> {
    public PlatinumArmorRenderer() {
        super(new PlatinumArmorModel());
    }
}
