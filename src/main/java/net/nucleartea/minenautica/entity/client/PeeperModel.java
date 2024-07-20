package net.nucleartea.minenautica.entity.client;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.nucleartea.minenautica.entity.animations.ModAnimationDefinitions;
import net.nucleartea.minenautica.entity.custom.MinenauticaFish.*;

public class PeeperModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart peeper;
	private final ModelPart body;
	private final ModelPart fin_bottom;
	private final ModelPart lower_body;
	private final ModelPart tail_fin;
	private final ModelPart fin_top;

	public PeeperModel(ModelPart root) {
		this.peeper = root.getChild("peeper");
		this.body = peeper.getChild("body");
		this.fin_bottom = body.getChild("fin_bottom");
		this.lower_body = body.getChild("lower_body");
		this.tail_fin = lower_body.getChild("tail_fin");
		this.fin_top = body.getChild("fin_top");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition peeper = partdefinition.addOrReplaceChild("peeper", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 3.0F));

		PartDefinition body = peeper.addOrReplaceChild("body", CubeListBuilder.create().texOffs(11, 0).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 12).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -3.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition fin_bottom = body.addOrReplaceChild("fin_bottom", CubeListBuilder.create(), PartPose.offset(0.0481F, 4.4833F, -0.5691F));

		PartDefinition fin_bottom_r1 = fin_bottom.addOrReplaceChild("fin_bottom_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0481F, -1.4833F, -1.4309F, 0.5222F, -0.0079F, -0.04F));

		PartDefinition lower_body = body.addOrReplaceChild("lower_body", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition tail_fin = lower_body.addOrReplaceChild("tail_fin", CubeListBuilder.create().texOffs(17, 18).addBox(0.0F, -1.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 13).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 16).addBox(0.0F, -3.0F, 2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition fin_top = body.addOrReplaceChild("fin_top", CubeListBuilder.create(), PartPose.offset(0.0355F, -4.5778F, -1.0962F));

		PartDefinition fin_top_r1 = fin_top.addOrReplaceChild("fin_top_r1", CubeListBuilder.create().texOffs(17, 5).addBox(0.0F, -4.0F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0355F, 1.5778F, 0.0962F, -0.2609F, -0.0017F, 0.0224F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Peeper) entity).idleAnimationState, ModAnimationDefinitions.PEEPER_IDLE, ageInTicks, 1f);
		this.animate(((Peeper) entity).flopAnimationState, ModAnimationDefinitions.PEEPER_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		peeper.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return peeper;
	}
}