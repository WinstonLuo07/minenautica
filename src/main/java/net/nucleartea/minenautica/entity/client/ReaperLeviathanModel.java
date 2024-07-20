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

public class ReaperLeviathanModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart reaper;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart lower_jaw;
	private final ModelPart teef;
	private final ModelPart teefffff;
	private final ModelPart teefffff2;
	private final ModelPart upper_jaw;
	private final ModelPart teef2;
	private final ModelPart teef3;
	private final ModelPart teefffff3;
	private final ModelPart teefffff4;
	private final ModelPart claws;
	private final ModelPart bottom_left_claw;
	private final ModelPart bottom_right_claw;
	private final ModelPart body_sub_17;
	private final ModelPart top_left_claw;
	private final ModelPart top_right_claw;
	private final ModelPart body_sub_20;
	private final ModelPart body_segment1;
	private final ModelPart body_segment2;
	private final ModelPart left_fin;
	private final ModelPart right_fin;
	private final ModelPart body_sub_25;
	private final ModelPart body_segment3;
	private final ModelPart body_segment4;
	private final ModelPart body_segment5;
	private final ModelPart body_segment6;
	private final ModelPart body_segment7;
	private final ModelPart body_segment8;
	private final ModelPart body_segment9;
	private final ModelPart body_segment10;
	private final ModelPart tail_fins;
	private final ModelPart bottom_left_fin;
	private final ModelPart bottom_right_fin;
	private final ModelPart body_sub_37;
	private final ModelPart top_left_fin;
	private final ModelPart top_right_fin;
	private final ModelPart body_sub_40;

	public ReaperLeviathanModel(ModelPart root) {
		this.reaper = root.getChild("reaper");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.lower_jaw = root.getChild("lower_jaw");
		this.teef = root.getChild("teef");
		this.teefffff = root.getChild("teefffff");
		this.teefffff2 = root.getChild("teefffff2");
		this.upper_jaw = root.getChild("upper_jaw");
		this.teef2 = root.getChild("teef2");
		this.teef3 = root.getChild("teef3");
		this.teefffff3 = root.getChild("teefffff3");
		this.teefffff4 = root.getChild("teefffff4");
		this.claws = root.getChild("claws");
		this.bottom_left_claw = root.getChild("bottom_left_claw");
		this.bottom_right_claw = root.getChild("bottom_right_claw");
		this.body_sub_17 = root.getChild("body_sub_17");
		this.top_left_claw = root.getChild("top_left_claw");
		this.top_right_claw = root.getChild("top_right_claw");
		this.body_sub_20 = root.getChild("body_sub_20");
		this.body_segment1 = root.getChild("body_segment1");
		this.body_segment2 = root.getChild("body_segment2");
		this.left_fin = root.getChild("left_fin");
		this.right_fin = root.getChild("right_fin");
		this.body_sub_25 = root.getChild("body_sub_25");
		this.body_segment3 = root.getChild("body_segment3");
		this.body_segment4 = root.getChild("body_segment4");
		this.body_segment5 = root.getChild("body_segment5");
		this.body_segment6 = root.getChild("body_segment6");
		this.body_segment7 = root.getChild("body_segment7");
		this.body_segment8 = root.getChild("body_segment8");
		this.body_segment9 = root.getChild("body_segment9");
		this.body_segment10 = root.getChild("body_segment10");
		this.tail_fins = root.getChild("tail_fins");
		this.bottom_left_fin = root.getChild("bottom_left_fin");
		this.bottom_right_fin = root.getChild("bottom_right_fin");
		this.body_sub_37 = root.getChild("body_sub_37");
		this.top_left_fin = root.getChild("top_left_fin");
		this.top_right_fin = root.getChild("top_right_fin");
		this.body_sub_40 = root.getChild("body_sub_40");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition reaper = partdefinition.addOrReplaceChild("reaper", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = reaper.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create().texOffs(84, 98).addBox(-4.5F, 0.0F, -8.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(130, 131).addBox(-3.5F, -1.0F, -8.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 73).addBox(-2.5F, -1.0F, -10.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(-3.5F, 0.0F, -9.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 69).addBox(-2.5F, 0.0F, -11.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-0.5F, 3.0F, -13.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(23, 7).addBox(-0.5F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-1.5F, 2.0F, -11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 3).addBox(-2.5F, 1.0F, -12.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(0.5F, 1.0F, -12.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 5).addBox(0.5F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 3).addBox(-1.5F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-0.5F, 2.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -6.0F, -19.0F));

		PartDefinition teef = lower_jaw.addOrReplaceChild("teef", CubeListBuilder.create().texOffs(20, 22).addBox(-2.0F, -1.0F, -1.6F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -7.0F));

		PartDefinition teefffff = teef.addOrReplaceChild("teefffff", CubeListBuilder.create().texOffs(10, 27).addBox(-2.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.5F, 1.4F, 0.0F, 1.5272F, 0.0F));

		PartDefinition teefffff2 = teef.addOrReplaceChild("teefffff2", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.5F, 0.4F, -3.1416F, -1.5533F, 3.1416F));

		PartDefinition upper_jaw = head.addOrReplaceChild("upper_jaw", CubeListBuilder.create().texOffs(75, 0).addBox(-2.5F, -3.2F, -2.45F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(42, 53).addBox(-3.5F, 2.8F, -0.45F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 60).addBox(-2.5F, 2.8F, -2.45F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5F, -6.2F, -4.45F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-0.5F, -9.2F, -6.45F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(9, 9).addBox(-0.5F, -3.2F, -5.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 0).addBox(-0.5F, -0.2F, -3.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(127, 61).addBox(-4.5F, -1.2F, 2.55F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(32, 102).addBox(-3.5F, -3.2F, 2.55F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-3.5F, 3.8F, 2.55F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -11.8F, -25.55F, 0.0436F, 0.0F, 0.0F));

		PartDefinition teef2 = upper_jaw.addOrReplaceChild("teef2", CubeListBuilder.create(), PartPose.offset(1.5F, 12.8F, 25.55F));

		PartDefinition teef3 = teef2.addOrReplaceChild("teef3", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0F, -1.0F, -1.6F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -8.0F, -26.0F));

		PartDefinition teefffff3 = teef3.addOrReplaceChild("teefffff3", CubeListBuilder.create().texOffs(10, 26).addBox(-2.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.5F, 1.4F, 0.0F, 1.5272F, 0.0F));

		PartDefinition teefffff4 = teef3.addOrReplaceChild("teefffff4", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.5F, 0.4F, -3.1416F, -1.5533F, 3.1416F));

		PartDefinition claws = head.addOrReplaceChild("claws", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -2.0F));

		PartDefinition bottom_left_claw = claws.addOrReplaceChild("bottom_left_claw", CubeListBuilder.create().texOffs(130, 45).addBox(0.0F, -1.0F, -2.0F, 14.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 64).addBox(0.0F, -2.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(131, 83).addBox(9.0F, -1.0F, -5.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 76).addBox(18.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(53, 46).addBox(19.0F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 43).addBox(20.0F, -1.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -11.0F, -18.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bottom_right_claw = claws.addOrReplaceChild("bottom_right_claw", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -11.0F, -18.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition body_sub_17 = bottom_right_claw.addOrReplaceChild("body_sub_17", CubeListBuilder.create().texOffs(130, 45).mirror().addBox(-14.0F, -1.0F, -2.0F, 14.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 64).mirror().addBox(-4.0F, -2.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(131, 83).mirror().addBox(-21.0F, -1.0F, -5.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 76).mirror().addBox(-21.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 46).mirror().addBox(-21.0F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 43).mirror().addBox(-21.0F, -1.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_left_claw = claws.addOrReplaceChild("top_left_claw", CubeListBuilder.create().texOffs(130, 45).addBox(0.0F, -1.0F, -2.0F, 14.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 64).addBox(0.0F, -2.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(131, 83).addBox(9.0F, -1.0F, -5.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 76).addBox(18.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(53, 46).addBox(19.0F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 43).addBox(20.0F, -1.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -16.0F, -18.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition top_right_claw = claws.addOrReplaceChild("top_right_claw", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -16.0F, -18.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition body_sub_20 = top_right_claw.addOrReplaceChild("body_sub_20", CubeListBuilder.create().texOffs(130, 45).mirror().addBox(-14.0F, -1.0F, -2.0F, 14.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 64).mirror().addBox(-4.0F, -2.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(131, 83).mirror().addBox(-21.0F, -1.0F, -5.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 76).mirror().addBox(-21.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 46).mirror().addBox(-21.0F, -1.0F, -10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 43).mirror().addBox(-21.0F, -1.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_segment1 = head.addOrReplaceChild("body_segment1", CubeListBuilder.create().texOffs(30, 69).addBox(-5.5F, -6.0F, 0.0F, 11.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(43, 41).addBox(-0.5F, -9.0F, 0.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(130, 33).addBox(-4.5F, 4.0F, 1.0F, 9.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -8.0F, -17.0F));

		PartDefinition body_segment2 = body_segment1.addOrReplaceChild("body_segment2", CubeListBuilder.create().texOffs(120, 104).addBox(-5.5F, 4.0F, -1.0F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(45, 97).addBox(-6.5F, -7.0F, -1.0F, 13.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -11.0F, -1.0F, 1.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 9.0F));

		PartDefinition left_fin = body_segment2.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(92, 73).addBox(-1.0F, -3.0F, -2.0F, 28.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(131, 87).addBox(-1.0F, -3.0F, -5.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(50, 17).addBox(24.0F, -3.0F, -5.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(21.0F, -3.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 52).addBox(31.0F, -3.0F, -7.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 6.0F, 6.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition right_fin = body_segment2.addOrReplaceChild("right_fin", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 6.0F, 6.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition body_sub_25 = right_fin.addOrReplaceChild("body_sub_25", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-27.0F, -3.0F, -2.0F, 28.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(131, 87).mirror().addBox(-7.0F, -3.0F, -5.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 17).mirror().addBox(-34.0F, -3.0F, -5.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 56).mirror().addBox(-24.0F, -3.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 52).mirror().addBox(-34.0F, -3.0F, -7.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_segment3 = body_segment2.addOrReplaceChild("body_segment3", CubeListBuilder.create().texOffs(42, 40).addBox(-7.5F, -7.0F, 0.0F, 15.0F, 7.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(78, 30).addBox(-6.5F, 0.0F, 4.0F, 13.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(127, 51).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(82, 123).addBox(-5.5F, 0.0F, 8.0F, 11.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(92, 30).addBox(-4.5F, 6.0F, 0.0F, 9.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(60, 121).addBox(-0.5F, -11.0F, 0.0F, 1.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 12.0F));

		PartDefinition body_segment4 = body_segment3.addOrReplaceChild("body_segment4", CubeListBuilder.create().texOffs(78, 0).addBox(-6.5F, -6.0F, 0.0F, 13.0F, 13.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(96, 80).addBox(-4.5F, 7.0F, 0.0F, 9.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(111, 124).addBox(-0.5F, -10.0F, 0.0F, 1.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 20.0F));

		PartDefinition body_segment5 = body_segment4.addOrReplaceChild("body_segment5", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -4.0F, 0.0F, 11.0F, 12.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-3.5F, 8.0F, 0.0F, 7.0F, 1.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(-0.5F, -9.0F, 0.0F, 1.0F, 5.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 17.0F));

		PartDefinition body_segment6 = body_segment5.addOrReplaceChild("body_segment6", CubeListBuilder.create().texOffs(49, 67).addBox(-5.5F, -3.0F, 0.0F, 11.0F, 9.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(92, 51).addBox(-3.5F, 6.0F, 0.0F, 7.0F, 1.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(3, 46).addBox(-4.5F, 6.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(3.5F, 6.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 57).addBox(-3.5F, 7.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(97, 98).addBox(-0.5F, -7.0F, 0.0F, 1.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 28.0F));

		PartDefinition body_segment7 = body_segment6.addOrReplaceChild("body_segment7", CubeListBuilder.create().texOffs(34, 121).addBox(-5.5F, -5.0F, 0.0F, 11.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(121, 0).addBox(-4.5F, 3.0F, 0.0F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(-0.5F, -8.0F, 0.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(13, 40).addBox(-0.5F, -8.0F, 6.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 21.0F));

		PartDefinition body_segment8 = body_segment7.addOrReplaceChild("body_segment8", CubeListBuilder.create().texOffs(0, 107).addBox(-4.5F, -3.0F, 0.0F, 9.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(130, 16).addBox(-0.5F, -6.0F, 0.0F, 1.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 12.0F));

		PartDefinition body_segment9 = body_segment8.addOrReplaceChild("body_segment9", CubeListBuilder.create().texOffs(0, 127).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 4.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(97, 108).addBox(-0.5F, -6.0F, 0.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(30, 87).addBox(-0.5F, -4.0F, 7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 14.0F));

		PartDefinition body_segment10 = body_segment9.addOrReplaceChild("body_segment10", CubeListBuilder.create().texOffs(50, 0).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 14.0F));

		PartDefinition tail_fins = body_segment10.addOrReplaceChild("tail_fins", CubeListBuilder.create(), PartPose.offset(1.5F, -1.0F, 13.0F));

		PartDefinition bottom_left_fin = tail_fins.addOrReplaceChild("bottom_left_fin", CubeListBuilder.create().texOffs(42, 40).addBox(3.0F, -5.4476F, -10.1207F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bottom_right_fin = tail_fins.addOrReplaceChild("bottom_right_fin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body_sub_37 = bottom_right_fin.addOrReplaceChild("body_sub_37", CubeListBuilder.create().texOffs(42, 40).mirror().addBox(-4.0F, -5.4476F, -10.1207F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_left_fin = tail_fins.addOrReplaceChild("top_left_fin", CubeListBuilder.create().texOffs(0, 81).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(1.0F, -1.0F, 8.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.1694F, 1.0417F, -0.3959F));

		PartDefinition top_right_fin = tail_fins.addOrReplaceChild("top_right_fin", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.1694F, -1.0417F, 0.3959F));

		PartDefinition body_sub_40 = top_right_fin.addOrReplaceChild("body_sub_40", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 69).mirror().addBox(-2.0F, -1.0F, 8.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		reaper.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}