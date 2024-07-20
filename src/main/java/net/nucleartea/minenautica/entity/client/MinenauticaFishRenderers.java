package net.nucleartea.minenautica.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.custom.MinenauticaFish.*;

public class MinenauticaFishRenderers {
    public static class PeeperRenderer extends MobRenderer<Peeper, PeeperModel<Peeper>> {
        public PeeperRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new PeeperModel<>(pContext.bakeLayer(ModModelLayers.PEEPER_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Peeper p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/peeper/peeper_texture.png");
        }

        @Override
        public void render(Peeper peeper, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {

            super.render(peeper, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);

        }
    }
    public static class BoomerangRenderer extends MobRenderer<Boomerang, BoomerangModel<Boomerang>> {
        public BoomerangRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new BoomerangModel<>(pContext.bakeLayer(ModModelLayers.BOOMERANG_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Boomerang p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/boomerang/boomerang_texture.png");
        }

        @Override
        public void render(Boomerang boomerang, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(boomerang, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class BladderfishRenderer extends MobRenderer<Bladderfish, BladderfishModel<Bladderfish>> {
        public BladderfishRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new BladderfishModel<>(pContext.bakeLayer(ModModelLayers.BLADDERFISH_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Bladderfish p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/bladderfish/bladderfish_texture.png");
        }

        @Override
        public void render(Bladderfish bladderfish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(bladderfish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class GarryfishRenderer extends MobRenderer<Garryfish, GarryfishModel<Garryfish>> {
        public GarryfishRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new GarryfishModel<>(pContext.bakeLayer(ModModelLayers.GARRYFISH_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Garryfish p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/garryfish/garryfish_texture.png");
        }

        @Override
        public void render(Garryfish Garryfish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(Garryfish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class EyeyeRenderer extends MobRenderer<Eyeye, EyeyeModel<Eyeye>> {
        public EyeyeRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new EyeyeModel<>(pContext.bakeLayer(ModModelLayers.EYEYE_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Eyeye p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/eyeye/eyeye_texture.png");
        }

        @Override
        public void render(Eyeye eyeye, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(eyeye, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class HolefishRenderer extends MobRenderer<Holefish, HolefishModel<Holefish>> {
        public HolefishRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new HolefishModel<>(pContext.bakeLayer(ModModelLayers.HOLEFISH_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Holefish p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/holefish/holefish_texture.png");
        }

        @Override
        public void render(Holefish holefish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(holefish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class HoopfishRenderer extends MobRenderer<Hoopfish, HoopfishModel<Hoopfish>> {
        public HoopfishRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new HoopfishModel<>(pContext.bakeLayer(ModModelLayers.HOOPFISH_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Hoopfish p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/hoopfish/hoopfish_texture.png");
        }

        @Override
        public void render(Hoopfish hoopfish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(hoopfish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class HoverfishRenderer extends MobRenderer<Hoverfish, HoverfishModel<Hoverfish>> {
        public HoverfishRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new HoverfishModel<>(pContext.bakeLayer(ModModelLayers.HOVERFISH_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Hoverfish p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/hoverfish/hoverfish_texture.png");
        }

        @Override
        public void render(Hoverfish hoverfish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(hoverfish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class ReginaldRenderer extends MobRenderer<Reginald, ReginaldModel<Reginald>> {
        public ReginaldRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new ReginaldModel<>(pContext.bakeLayer(ModModelLayers.REGINALD_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Reginald p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/reginald/reginald_texture.png");
        }

        @Override
        public void render(Reginald reginald, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(reginald, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

    public static class SpadefishRenderer extends MobRenderer<Spadefish, SpadefishModel<Spadefish>> {
        public SpadefishRenderer (EntityRendererProvider.Context pContext) {
            super(pContext, new SpadefishModel<>(pContext.bakeLayer(ModModelLayers.SPADEFISH_LAYER)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Spadefish p_114482_) {
            return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/spadefish/spadefish_texture.png");
        }

        @Override
        public void render(Spadefish spadefish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            super.render(spadefish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }

}
