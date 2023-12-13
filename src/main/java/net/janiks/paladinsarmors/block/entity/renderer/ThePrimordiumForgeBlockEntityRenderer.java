package net.janiks.paladinsarmors.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.janiks.paladinsarmors.block.entity.ThePrimordiumForgeBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;

public class ThePrimordiumForgeBlockEntityRenderer implements BlockEntityRenderer<ThePrimordiumForgeBlockEntity> {
    public ThePrimordiumForgeBlockEntityRenderer(BlockEntityRendererProvider.Context context) {

    }
    @Override
    public void render(ThePrimordiumForgeBlockEntity thePrimordiumForgeBlockEntity, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int i1) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack itemStack = thePrimordiumForgeBlockEntity.getRenderStack();

        poseStack.pushPose();
        poseStack.translate(0.6F,0.94F,0.8F);
        poseStack.scale(0.35F,0.35F,0.35F);
        poseStack.mulPose(Axis.XP.rotationDegrees(270));

        itemRenderer.renderStatic(itemStack, ItemDisplayContext.FIXED, getLightLevel(thePrimordiumForgeBlockEntity.getLevel(),thePrimordiumForgeBlockEntity.getBlockPos()),
                OverlayTexture.NO_OVERLAY,poseStack,multiBufferSource,thePrimordiumForgeBlockEntity.getLevel(),1);
        poseStack.popPose();

    }

    private int getLightLevel(Level level, BlockPos pos){
        int blight = level.getBrightness(LightLayer.BLOCK, pos);
        int slight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(blight, slight);
    }
}
