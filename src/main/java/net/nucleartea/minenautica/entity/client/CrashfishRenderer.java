package net.nucleartea.minenautica.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.custom.CrabSquid;
import net.nucleartea.minenautica.entity.custom.Crashfish;
import org.jetbrains.annotations.Nullable;

public class CrashfishRenderer extends MobRenderer<Crashfish, CrashfishModel<Crashfish>> {
    public CrashfishRenderer (EntityRendererProvider.Context pContext) {
        super(pContext, new CrashfishModel<>(pContext.bakeLayer(ModModelLayers.CRASHFISH_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Crashfish p_114482_) {
        return new ResourceLocation(Minenautica.MOD_ID, "textures/entity/crashfish/crashfish_texture.png");
    }


    @Override
    public void render(Crashfish crashfish, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(0.7F,0.7F,0.7F);
        super.render(crashfish, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);

    }
}