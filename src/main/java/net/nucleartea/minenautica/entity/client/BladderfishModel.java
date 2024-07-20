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


public class BladderfishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart bladderfish;
//	private final ModelPart body;
//	private final ModelPart top_bladder;
//	private final ModelPart bottom_bladder;

	public BladderfishModel(ModelPart root) {
		this.bladderfish = root.getChild("bladderfish");
//		this.body = root.getChild("body");
//		this.top_bladder = root.getChild("top_bladder");
//		this.bottom_bladder = root.getChild("bottom_bladder");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bladderfish = partdefinition.addOrReplaceChild("bladderfish", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = bladderfish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.0F, -3.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-0.6F, -5.5F, -2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.6F, -5.5F, -2.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition top_bladder = body.addOrReplaceChild("top_bladder", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(19, 19).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 16).addBox(-1.0F, -2.0F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 5).addBox(-1.0F, -3.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, -1.0F));

		PartDefinition cube_r1 = top_bladder.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 7.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r2 = top_bladder.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 5).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r3 = top_bladder.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bottom_bladder = body.addOrReplaceChild("bottom_bladder", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-1.0F, -4.0F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 19).mirror().addBox(-1.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(11, 16).mirror().addBox(-1.0F, -2.0F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 5).mirror().addBox(-1.0F, -3.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.0F, -1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r4 = bottom_bladder.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, 7.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bottom_bladder.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bottom_bladder.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Bladderfish) entity).idleAnimationState, ModAnimationDefinitions.BLADDERFISH_IDLE, ageInTicks, 1f);
		this.animate(((Bladderfish) entity).flopAnimationState, ModAnimationDefinitions.BLADDERFISH_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bladderfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return bladderfish;
	}
}