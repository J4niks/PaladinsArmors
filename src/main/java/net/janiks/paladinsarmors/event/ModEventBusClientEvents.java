package net.janiks.paladinsarmors.event;

import net.janiks.paladinsarmors.block.entity.ModBlockEntities;
import net.janiks.paladinsarmors.block.entity.renderer.ThePrimordiumForgeBlockEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.janiks.paladinsarmors.paladinsarmors;


@Mod.EventBusSubscriber(modid = paladinsarmors.MODID, bus =  Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PRIMORDIUM_FORGE_BE.get(), ThePrimordiumForgeBlockEntityRenderer::new);

    }
}

