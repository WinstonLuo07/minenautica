package net.nucleartea.minenautica.entity.client;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.nucleartea.minenautica.entity.animations.ModAnimationDefinitions;
import net.nucleartea.minenautica.entity.custom.CrabSquid;

public class CrabSquidModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart crabsquid;
//	private final ModelPart outer_layer;
//	private final ModelPart torso_layer;
//	private final ModelPart bulb;
//	private final ModelPart eye_layer;
//	private final ModelPart mouth;
//	private final ModelPart body;
//	private final ModelPart torso;
//	private final ModelPart main_torso;
//	private final ModelPart left_side_fin;
//	private final ModelPart right_side_fin;
//	private final ModelPart eyes;
//	private final ModelPart upper_eyes;
//	private final ModelPart upper_left_eye;
//	private final ModelPart upper_right_eye;
//	private final ModelPart lower_eyes;
//	private final ModelPart left_lower_eye;
//	private final ModelPart right_lower_eye;
//	private final ModelPart left_legs;
//	private final ModelPart leg;
//	private final ModelPart leg_segment;
//	private final ModelPart leg_segment2;
//	private final ModelPart leg_segment3;
//	private final ModelPart leg_claw;
//	private final ModelPart bone3;
//	private final ModelPart leg2;
//	private final ModelPart leg_segment4;
//	private final ModelPart leg_segment5;
//	private final ModelPart leg_segment6;
//	private final ModelPart leg_claw2;
//	private final ModelPart bone2;
//	private final ModelPart leg3;
//	private final ModelPart leg_segment7;
//	private final ModelPart leg_segment8;
//	private final ModelPart leg_segment9;
//	private final ModelPart leg_claw3;
//	private final ModelPart bone6;
//	private final ModelPart leg4;
//	private final ModelPart leg_segment10;
//	private final ModelPart leg_segment11;
//	private final ModelPart leg_segment12;
//	private final ModelPart leg_claw4;
//	private final ModelPart bone7;
//	private final ModelPart right_legs;
//	private final ModelPart leg5;
//	private final ModelPart leg_segment13;
//	private final ModelPart leg_segment14;
//	private final ModelPart leg_segment15;
//	private final ModelPart leg_claw5;
//	private final ModelPart bone8;
//	private final ModelPart leg6;
//	private final ModelPart leg_segment16;
//	private final ModelPart leg_segment17;
//	private final ModelPart leg_segment18;
//	private final ModelPart leg_claw6;
//	private final ModelPart bone9;
//	private final ModelPart leg7;
//	private final ModelPart leg_segment19;
//	private final ModelPart leg_segment20;
//	private final ModelPart leg_segment21;
//	private final ModelPart leg_claw7;
//	private final ModelPart bone10;
//	private final ModelPart leg8;
//	private final ModelPart leg_segment22;
//	private final ModelPart leg_segment23;
//	private final ModelPart leg_segment24;
//	private final ModelPart leg_claw8;
//	private final ModelPart bone11;
//	private final ModelPart left_arm;
//	private final ModelPart arm_segment;
//	private final ModelPart arm_segment2;
//	private final ModelPart arm_claw;
//	private final ModelPart bone4;
//	private final ModelPart bone5;
//	private final ModelPart right_arm;
//	private final ModelPart arm_segment3;
//	private final ModelPart arm_segment4;
//	private final ModelPart arm_claw2;
//	private final ModelPart bone12;
//	private final ModelPart bone13;

	public CrabSquidModel(ModelPart root) {
		this.crabsquid = root.getChild("crabsquid");
//		this.outer_layer = root.getChild("outer_layer");
//		this.torso_layer = root.getChild("torso_layer");
//		this.bulb = root.getChild("bulb");
//		this.eye_layer = root.getChild("eye_layer");
//		this.mouth = root.getChild("mouth");
//		this.body = root.getChild("body");
//		this.torso = root.getChild("torso");
//		this.main_torso = root.getChild("main_torso");
//		this.left_side_fin = root.getChild("left_side_fin");
//		this.right_side_fin = root.getChild("right_side_fin");
//		this.eyes = root.getChild("eyes");
//		this.upper_eyes = root.getChild("upper_eyes");
//		this.upper_left_eye = root.getChild("upper_left_eye");
//		this.upper_right_eye = root.getChild("upper_right_eye");
//		this.lower_eyes = root.getChild("lower_eyes");
//		this.left_lower_eye = root.getChild("left_lower_eye");
//		this.right_lower_eye = root.getChild("right_lower_eye");
//		this.left_legs = root.getChild("left_legs");
//		this.leg = root.getChild("leg");
//		this.leg_segment = root.getChild("leg_segment");
//		this.leg_segment2 = root.getChild("leg_segment2");
//		this.leg_segment3 = root.getChild("leg_segment3");
//		this.leg_claw = root.getChild("leg_claw");
//		this.bone3 = root.getChild("bone3");
//		this.leg2 = root.getChild("leg2");
//		this.leg_segment4 = root.getChild("leg_segment4");
//		this.leg_segment5 = root.getChild("leg_segment5");
//		this.leg_segment6 = root.getChild("leg_segment6");
//		this.leg_claw2 = root.getChild("leg_claw2");
//		this.bone2 = root.getChild("bone2");
//		this.leg3 = root.getChild("leg3");
//		this.leg_segment7 = root.getChild("leg_segment7");
//		this.leg_segment8 = root.getChild("leg_segment8");
//		this.leg_segment9 = root.getChild("leg_segment9");
//		this.leg_claw3 = root.getChild("leg_claw3");
//		this.bone6 = root.getChild("bone6");
//		this.leg4 = root.getChild("leg4");
//		this.leg_segment10 = root.getChild("leg_segment10");
//		this.leg_segment11 = root.getChild("leg_segment11");
//		this.leg_segment12 = root.getChild("leg_segment12");
//		this.leg_claw4 = root.getChild("leg_claw4");
//		this.bone7 = root.getChild("bone7");
//		this.right_legs = root.getChild("right_legs");
//		this.leg5 = root.getChild("leg5");
//		this.leg_segment13 = root.getChild("leg_segment13");
//		this.leg_segment14 = root.getChild("leg_segment14");
//		this.leg_segment15 = root.getChild("leg_segment15");
//		this.leg_claw5 = root.getChild("leg_claw5");
//		this.bone8 = root.getChild("bone8");
//		this.leg6 = root.getChild("leg6");
//		this.leg_segment16 = root.getChild("leg_segment16");
//		this.leg_segment17 = root.getChild("leg_segment17");
//		this.leg_segment18 = root.getChild("leg_segment18");
//		this.leg_claw6 = root.getChild("leg_claw6");
//		this.bone9 = root.getChild("bone9");
//		this.leg7 = root.getChild("leg7");
//		this.leg_segment19 = root.getChild("leg_segment19");
//		this.leg_segment20 = root.getChild("leg_segment20");
//		this.leg_segment21 = root.getChild("leg_segment21");
//		this.leg_claw7 = root.getChild("leg_claw7");
//		this.bone10 = root.getChild("bone10");
//		this.leg8 = root.getChild("leg8");
//		this.leg_segment22 = root.getChild("leg_segment22");
//		this.leg_segment23 = root.getChild("leg_segment23");
//		this.leg_segment24 = root.getChild("leg_segment24");
//		this.leg_claw8 = root.getChild("leg_claw8");
//		this.bone11 = root.getChild("bone11");
//		this.left_arm = root.getChild("left_arm");
//		this.arm_segment = root.getChild("arm_segment");
//		this.arm_segment2 = root.getChild("arm_segment2");
//		this.arm_claw = root.getChild("arm_claw");
//		this.bone4 = root.getChild("bone4");
//		this.bone5 = root.getChild("bone5");
//		this.right_arm = root.getChild("right_arm");
//		this.arm_segment3 = root.getChild("arm_segment3");
//		this.arm_segment4 = root.getChild("arm_segment4");
//		this.arm_claw2 = root.getChild("arm_claw2");
//		this.bone12 = root.getChild("bone12");
//		this.bone13 = root.getChild("bone13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition crabsquid = partdefinition.addOrReplaceChild("crabsquid", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition outer_layer = crabsquid.addOrReplaceChild("outer_layer", CubeListBuilder.create(), PartPose.offset(-80.0F, -80.0F, -1.0F));

		PartDefinition torso_layer = outer_layer.addOrReplaceChild("torso_layer", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -68.0F, -19.0F, 48.0F, 44.0F, 50.0F, new CubeDeformation(0.0F))
		.texOffs(0, 174).addBox(-12.0F, -14.0F, -15.0F, 24.0F, 15.0F, 27.0F, new CubeDeformation(0.0F))
		.texOffs(145, 95).addBox(-19.0F, -24.0F, -15.0F, 38.0F, 10.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(80.0F, 36.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bulb = torso_layer.addOrReplaceChild("bulb", CubeListBuilder.create(), PartPose.offset(0.0F, -36.0F, 0.0F));

		PartDefinition eye_layer = torso_layer.addOrReplaceChild("eye_layer", CubeListBuilder.create().texOffs(43, 269).addBox(1.0F, -10.0F, 24.0F, 14.0F, 14.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(43, 269).addBox(-15.0F, -10.0F, 24.0F, 14.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -15.0F, -46.0F));

		PartDefinition cube_r1 = eye_layer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 270).addBox(0.0F, -6.5F, -3.0F, 14.0F, 13.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(43, 270).addBox(16.0F, -6.5F, -3.0F, 14.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 10.5F, 28.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition mouth = outer_layer.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(87, 331).addBox(-4.0F, -8.0F, -8.0F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(40, 378).addBox(3.0F, -4.0F, -8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 378).addBox(-3.0F, -4.0F, -8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 378).addBox(-2.0F, -4.0F, -8.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(43, 378).addBox(1.0F, -4.0F, -8.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(21, 291).addBox(-6.0F, -16.0F, -8.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(80.0F, 50.0F, -9.0F));

		PartDefinition cube_r2 = mouth.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 378).addBox(0.0F, -3.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 378).addBox(8.0F, -3.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.0F, -5.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = mouth.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 378).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 378).addBox(-8.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, -7.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body = crabsquid.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-80.0F, -80.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(103, 174).addBox(-11.0F, -27.082F, -8.6024F, 22.0F, 27.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(80.0F, 35.0F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = torso.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 220).addBox(-9.6818F, -18.6879F, -3.5554F, 21.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8182F, -20.3941F, 5.953F, -0.6545F, 0.0F, 0.0F));

		PartDefinition main_torso = torso.addOrReplaceChild("main_torso", CubeListBuilder.create().texOffs(0, 95).addBox(-13.6818F, -26.1879F, -13.0554F, 28.0F, 34.0F, 44.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3182F, -34.8941F, 3.453F));

		PartDefinition left_side_fin = torso.addOrReplaceChild("left_side_fin", CubeListBuilder.create(), PartPose.offset(-17.8182F, -46.3941F, -1.547F));

		PartDefinition cube_r5 = left_side_fin.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(77, 243).addBox(-1.6818F, -2.1879F, -6.5554F, 9.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -8.5F, 9.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r6 = left_side_fin.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(144, 331).addBox(1.8182F, -10.6879F, -2.0554F, 2.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(83, 291).addBox(3.8182F, -10.6879F, -2.0554F, 7.0F, 21.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_side_fin = torso.addOrReplaceChild("right_side_fin", CubeListBuilder.create(), PartPose.offset(16.8182F, -46.3941F, -1.547F));

		PartDefinition cube_r7 = right_side_fin.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 220).addBox(-7.3182F, -2.1879F, -6.5554F, 9.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -8.5F, 9.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r8 = right_side_fin.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(131, 331).addBox(-3.8182F, -10.6879F, -2.0554F, 2.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(60, 291).addBox(-10.8182F, -10.6879F, -2.0554F, 7.0F, 21.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition eyes = body.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(85.0F, 31.0F, -13.0F));

		PartDefinition upper_eyes = eyes.addOrReplaceChild("upper_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition upper_left_eye = upper_eyes.addOrReplaceChild("upper_left_eye", CubeListBuilder.create().texOffs(39, 366).addBox(-2.25F, -2.25F, 0.25F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(58, 331).addBox(-5.25F, -5.25F, -3.75F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.75F, -13.75F, -1.25F, 0.0F, 0.1309F, 0.0F));

		PartDefinition upper_right_eye = upper_eyes.addOrReplaceChild("upper_right_eye", CubeListBuilder.create().texOffs(58, 331).addBox(-4.75F, -5.25F, -3.75F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(39, 366).addBox(-2.75F, -2.25F, 0.25F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -13.75F, -1.25F, 0.0F, -0.1309F, 0.0F));

		PartDefinition lower_eyes = eyes.addOrReplaceChild("lower_eyes", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -1.75F, -2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_lower_eye = lower_eyes.addOrReplaceChild("left_lower_eye", CubeListBuilder.create().texOffs(58, 331).addBox(-5.0F, -19.0F, -5.0F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(39, 366).addBox(-1.0F, -16.0F, -1.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 13.75F, 1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition right_lower_eye = lower_eyes.addOrReplaceChild("right_lower_eye", CubeListBuilder.create().texOffs(58, 331).addBox(-2.0F, -19.0F, -5.0F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(39, 366).addBox(-1.0F, -16.0F, -1.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 13.75F, 1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition left_legs = body.addOrReplaceChild("left_legs", CubeListBuilder.create(), PartPose.offset(68.5F, 39.5F, -8.5F));

		PartDefinition leg = left_legs.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(26, 357).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, -0.3491F, 0.9599F, 0.0F));

		PartDefinition leg_segment = leg.addOrReplaceChild("leg_segment", CubeListBuilder.create().texOffs(13, 357).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment2 = leg_segment.addOrReplaceChild("leg_segment2", CubeListBuilder.create().texOffs(0, 291).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment3 = leg_segment2.addOrReplaceChild("leg_segment3", CubeListBuilder.create().texOffs(118, 331).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw = leg_segment3.addOrReplaceChild("leg_claw", CubeListBuilder.create().texOffs(82, 366).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone3 = leg_claw.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(32, 378).addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(95, 357).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leg2 = left_legs.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(26, 357).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, -2.4599F, 1.5343F, -2.1755F));

		PartDefinition leg_segment4 = leg2.addOrReplaceChild("leg_segment4", CubeListBuilder.create().texOffs(13, 357).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment5 = leg_segment4.addOrReplaceChild("leg_segment5", CubeListBuilder.create().texOffs(0, 291).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment6 = leg_segment5.addOrReplaceChild("leg_segment6", CubeListBuilder.create().texOffs(118, 331).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw2 = leg_segment6.addOrReplaceChild("leg_claw2", CubeListBuilder.create().texOffs(82, 366).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone2 = leg_claw2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(32, 378).addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(95, 357).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leg3 = left_legs.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(26, 357).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 10.0F, 2.9623F, 0.9188F, -3.095F));

		PartDefinition leg_segment7 = leg3.addOrReplaceChild("leg_segment7", CubeListBuilder.create().texOffs(13, 357).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment8 = leg_segment7.addOrReplaceChild("leg_segment8", CubeListBuilder.create().texOffs(0, 291).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment9 = leg_segment8.addOrReplaceChild("leg_segment9", CubeListBuilder.create().texOffs(118, 331).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw3 = leg_segment9.addOrReplaceChild("leg_claw3", CubeListBuilder.create().texOffs(82, 366).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone6 = leg_claw3.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(32, 378).addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(95, 357).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leg4 = left_legs.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(26, 357).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, 12.0F, 2.9915F, 0.1889F, -3.1305F));

		PartDefinition leg_segment10 = leg4.addOrReplaceChild("leg_segment10", CubeListBuilder.create().texOffs(13, 357).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment11 = leg_segment10.addOrReplaceChild("leg_segment11", CubeListBuilder.create().texOffs(0, 291).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment12 = leg_segment11.addOrReplaceChild("leg_segment12", CubeListBuilder.create().texOffs(118, 331).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw4 = leg_segment12.addOrReplaceChild("leg_claw4", CubeListBuilder.create().texOffs(82, 366).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone7 = leg_claw4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(32, 378).addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(95, 357).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_legs = body.addOrReplaceChild("right_legs", CubeListBuilder.create(), PartPose.offset(92.5F, 39.5F, -8.5F));

		PartDefinition leg5 = right_legs.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(26, 357).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, -0.3491F, -0.9599F, 0.0F));

		PartDefinition leg_segment13 = leg5.addOrReplaceChild("leg_segment13", CubeListBuilder.create().texOffs(13, 357).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment14 = leg_segment13.addOrReplaceChild("leg_segment14", CubeListBuilder.create().texOffs(0, 291).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment15 = leg_segment14.addOrReplaceChild("leg_segment15", CubeListBuilder.create().texOffs(118, 331).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw5 = leg_segment15.addOrReplaceChild("leg_claw5", CubeListBuilder.create().texOffs(82, 366).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone8 = leg_claw5.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(32, 378).mirror().addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(95, 357).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leg6 = right_legs.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(26, 357).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, -2.4599F, -1.5343F, 2.1755F));

		PartDefinition leg_segment16 = leg6.addOrReplaceChild("leg_segment16", CubeListBuilder.create().texOffs(13, 357).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment17 = leg_segment16.addOrReplaceChild("leg_segment17", CubeListBuilder.create().texOffs(0, 291).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment18 = leg_segment17.addOrReplaceChild("leg_segment18", CubeListBuilder.create().texOffs(118, 331).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw6 = leg_segment18.addOrReplaceChild("leg_claw6", CubeListBuilder.create().texOffs(82, 366).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone9 = leg_claw6.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(32, 378).mirror().addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(95, 357).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leg7 = right_legs.addOrReplaceChild("leg7", CubeListBuilder.create().texOffs(26, 357).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 10.0F, 2.9623F, -0.9188F, 3.095F));

		PartDefinition leg_segment19 = leg7.addOrReplaceChild("leg_segment19", CubeListBuilder.create().texOffs(13, 357).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment20 = leg_segment19.addOrReplaceChild("leg_segment20", CubeListBuilder.create().texOffs(0, 291).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment21 = leg_segment20.addOrReplaceChild("leg_segment21", CubeListBuilder.create().texOffs(118, 331).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw7 = leg_segment21.addOrReplaceChild("leg_claw7", CubeListBuilder.create().texOffs(82, 366).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone10 = leg_claw7.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(32, 378).mirror().addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(95, 357).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leg8 = right_legs.addOrReplaceChild("leg8", CubeListBuilder.create().texOffs(26, 357).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 0.0F, 12.0F, 2.9915F, -0.1889F, 3.1305F));

		PartDefinition leg_segment22 = leg8.addOrReplaceChild("leg_segment22", CubeListBuilder.create().texOffs(13, 357).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition leg_segment23 = leg_segment22.addOrReplaceChild("leg_segment23", CubeListBuilder.create().texOffs(0, 291).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg_segment24 = leg_segment23.addOrReplaceChild("leg_segment24", CubeListBuilder.create().texOffs(118, 331).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 22.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg_claw8 = leg_segment24.addOrReplaceChild("leg_claw8", CubeListBuilder.create().texOffs(82, 366).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 22.0F, 0.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition bone11 = leg_claw8.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(32, 378).mirror().addBox(-0.5F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(95, 357).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(82, 357).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(72.5F, 34.0F, -11.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition arm_segment = left_arm.addOrReplaceChild("arm_segment", CubeListBuilder.create().texOffs(0, 357).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, -0.0477F, -0.0376F, 0.215F));

		PartDefinition arm_segment2 = arm_segment.addOrReplaceChild("arm_segment2", CubeListBuilder.create().texOffs(73, 357).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 16.5F, -0.5F, -0.4232F, -0.1096F, -0.2382F));

		PartDefinition arm_claw = arm_segment2.addOrReplaceChild("arm_claw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.0F, 1.1345F, 0.0F));

		PartDefinition bone4 = arm_claw.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(15, 378).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 378).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone5 = arm_claw.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(10, 378).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r10 = bone5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 378).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(82, 357).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(87.5F, 34.0F, -11.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition arm_segment3 = right_arm.addOrReplaceChild("arm_segment3", CubeListBuilder.create().texOffs(0, 357).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, -0.0477F, 0.0376F, -0.215F));

		PartDefinition arm_segment4 = arm_segment3.addOrReplaceChild("arm_segment4", CubeListBuilder.create().texOffs(73, 357).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 16.5F, -0.5F, -0.4232F, 0.1096F, 0.2382F));

		PartDefinition arm_claw2 = arm_segment4.addOrReplaceChild("arm_claw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.0F, -1.1345F, 0.0F));

		PartDefinition bone12 = arm_claw2.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(15, 378).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r11 = bone12.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 378).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone13 = arm_claw2.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(10, 378).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r12 = bone13.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 378).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((CrabSquid) entity).idleAnimationState, ModAnimationDefinitions.CRABSQUID_IDLE, ageInTicks, 0.4f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		crabsquid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return crabsquid;
	}
}