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


public class HoverfishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart hoverfish;
//	private final ModelPart body;
//	private final ModelPart right_legs;
//	private final ModelPart back_leg;
//	private final ModelPart mid_leg;
//	private final ModelPart front_leg;
//	private final ModelPart left_legs;
//	private final ModelPart back_leg2;
//	private final ModelPart mid_leg2;
//	private final ModelPart front_leg2;

	public HoverfishModel(ModelPart root) {
		this.hoverfish = root.getChild("hoverfish");
//		this.body = root.getChild("body");
//		this.right_legs = root.getChild("right_legs");
//		this.back_leg = root.getChild("back_leg");
//		this.mid_leg = root.getChild("mid_leg");
//		this.front_leg = root.getChild("front_leg");
//		this.left_legs = root.getChild("left_legs");
//		this.back_leg2 = root.getChild("back_leg2");
//		this.mid_leg2 = root.getChild("mid_leg2");
//		this.front_leg2 = root.getChild("front_leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hoverfish = partdefinition.addOrReplaceChild("hoverfish", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 2.0F));

		PartDefinition body = hoverfish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(13, 18).addBox(-2.0F, -2.0F, 9.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.0F, -4.0F));

		PartDefinition right_legs = body.addOrReplaceChild("right_legs", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0F, 0.0F));

		PartDefinition back_leg = right_legs.addOrReplaceChild("back_leg", CubeListBuilder.create(), PartPose.offset(1.0F, 0.6F, 8.0F));

		PartDefinition cube_r1 = back_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.3F, -0.2F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = back_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -0.7F, 0.0F, 0.0F, 0.6981F));

		PartDefinition mid_leg = right_legs.addOrReplaceChild("mid_leg", CubeListBuilder.create(), PartPose.offset(1.0F, 0.6F, 4.0F));

		PartDefinition cube_r3 = mid_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 13).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.3F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r4 = mid_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition front_leg = right_legs.addOrReplaceChild("front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(3.0F, 0.3F, -3.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.6F, 1.0F));

		PartDefinition cube_r5 = front_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 3).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -0.5F, 0.0F, 0.2182F, 0.4363F));

		PartDefinition left_legs = body.addOrReplaceChild("left_legs", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0F, 0.0F));

		PartDefinition back_leg2 = left_legs.addOrReplaceChild("back_leg2", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.6F, 8.0F));

		PartDefinition cube_r6 = back_leg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.3F, -0.2F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r7 = back_leg2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -0.7F, 0.0F, 0.0F, -0.6981F));

		PartDefinition mid_leg2 = left_legs.addOrReplaceChild("mid_leg2", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.6F, 4.0F));

		PartDefinition cube_r8 = mid_leg2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 13).mirror().addBox(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.3F, 0.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r9 = mid_leg2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition front_leg2 = left_legs.addOrReplaceChild("front_leg2", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-6.0F, 0.3F, -3.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 0.6F, 1.0F));

		PartDefinition cube_r10 = front_leg2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 3).mirror().addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -0.5F, 0.0F, -0.2182F, -0.4363F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Hoverfish) entity).idleAnimationState, ModAnimationDefinitions.HOVERFISH_IDLE, ageInTicks, 0.5f);
		this.animate(((Hoverfish) entity).flopAnimationState, ModAnimationDefinitions.HOVERFISH_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hoverfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return hoverfish;
	}
}