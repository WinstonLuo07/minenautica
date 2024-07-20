package net.nucleartea.minenautica.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.custom.CrabSquid;
import org.jetbrains.annotations.Nullable;

public class CrabSquidRenderer extends MobRenderer<CrabSquid, CrabSquidModel<CrabSquid>> {
    public CrabSquidRenderer (EntityRendererProvider.Context pContext) {
        super(pContext, new CrabSquidModel<>(pContext.bakeLayer(ModModelLayers.CRABSQUID_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(CrabSquid p_114482_) {
        return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/crabsquid/crabsquid_texture.png");
    }

    @Nullable
    @Override
    protected RenderType getRenderType(CrabSquid pLivingEntity, boolean pBodyVisible, boolean pTranslucent, boolean pGlowing) {
        return super.getRenderType(pLivingEntity, pBodyVisible, true, pGlowing);
    }

    @Override
    public void render(CrabSquid crabsquid, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {

        super.render(crabsquid, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);

    }
}
