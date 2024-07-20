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

public class CrashfishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart crashfish;
//	private final ModelPart body;
//	private final ModelPart lower_body;
//	private final ModelPart butt;
//	private final ModelPart right_horn;
//	private final ModelPart bone;
//	private final ModelPart left_horn;
//	private final ModelPart bone2;
//	private final ModelPart right_fins;
//	private final ModelPart top_horn;
//	private final ModelPart fin;
//	private final ModelPart fin3;
//	private final ModelPart fin2;
//	private final ModelPart top_horn2;
//	private final ModelPart left_fins;
//	private final ModelPart top_horn3;
//	private final ModelPart fin4;
//	private final ModelPart fin5;
//	private final ModelPart fin6;
//	private final ModelPart top_horn4;

	public CrashfishModel(ModelPart root) {
		this.crashfish = root.getChild("crashfish");
//		this.body = root.getChild("body");
//		this.lower_body = root.getChild("lower_body");
//		this.butt = root.getChild("butt");
//		this.right_horn = root.getChild("right_horn");
//		this.bone = root.getChild("bone");
//		this.left_horn = root.getChild("left_horn");
//		this.bone2 = root.getChild("bone2");
//		this.right_fins = root.getChild("right_fins");
//		this.top_horn = root.getChild("top_horn");
//		this.fin = root.getChild("fin");
//		this.fin3 = root.getChild("fin3");
//		this.fin2 = root.getChild("fin2");
//		this.top_horn2 = root.getChild("top_horn2");
//		this.left_fins = root.getChild("left_fins");
//		this.top_horn3 = root.getChild("top_horn3");
//		this.fin4 = root.getChild("fin4");
//		this.fin5 = root.getChild("fin5");
//		this.fin6 = root.getChild("fin6");
//		this.top_horn4 = root.getChild("top_horn4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition crashfish = partdefinition.addOrReplaceChild("crashfish", CubeListBuilder.create(), PartPose.offset(1.0F, 24.0F, 15.0F));

		PartDefinition body = crashfish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -14.0F, -22.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_spine_r1 = body.addOrReplaceChild("top_spine_r1", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -14.0F, -12.5F, -0.0573F, 0.2106F, -0.2679F));

		PartDefinition top_spine_r2 = body.addOrReplaceChild("top_spine_r2", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -14.0F, -12.5F, -0.0573F, -0.2106F, 0.2679F));

		PartDefinition top_spine_r3 = body.addOrReplaceChild("top_spine_r3", CubeListBuilder.create().texOffs(46, 52).mirror().addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 52).addBox(3.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -17.0F, -4.7F, 2.0944F, 0.0F, 0.0F));

		PartDefinition lower_body = body.addOrReplaceChild("lower_body", CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -4.5F, -1.0F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.5F, -8.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition top_spine_r4 = lower_body.addOrReplaceChild("top_spine_r4", CubeListBuilder.create().texOffs(46, 52).mirror().addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 52).addBox(5.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -8.5F, 6.3F, 2.0944F, 0.0F, 0.0F));

		PartDefinition top_spine_r5 = lower_body.addOrReplaceChild("top_spine_r5", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -4.5F, 3.5F, -0.0573F, 0.2106F, -0.2679F));

		PartDefinition top_spine_r6 = lower_body.addOrReplaceChild("top_spine_r6", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.5F, 3.5F, -0.0573F, -0.2106F, 0.2679F));

		PartDefinition butt = lower_body.addOrReplaceChild("butt", CubeListBuilder.create().texOffs(37, 29).addBox(-3.0F, -3.5F, -1.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition top_spine_r7 = butt.addOrReplaceChild("top_spine_r7", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.5F, 2.5F, -0.0817F, 0.2224F, -0.1691F));

		PartDefinition top_spine_r8 = butt.addOrReplaceChild("top_spine_r8", CubeListBuilder.create().texOffs(25, 52).addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.5F, 2.5F, -0.0817F, -0.2224F, 0.1691F));

		PartDefinition right_horn = lower_body.addOrReplaceChild("right_horn", CubeListBuilder.create().texOffs(11, 47).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 1.5F, 7.0F, -1.1151F, -0.5401F, 2.8296F));

		PartDefinition cube_r1 = right_horn.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone = right_horn.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.2F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 47).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_horn = lower_body.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(11, 47).mirror().addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, 1.5F, 7.0F, -1.1151F, 0.5401F, -2.8296F));

		PartDefinition cube_r3 = left_horn.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = left_horn.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.2F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 47).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_fins = body.addOrReplaceChild("right_fins", CubeListBuilder.create(), PartPose.offset(1.0F, -14.0F, -19.0F));

		PartDefinition top_horn = right_fins.addOrReplaceChild("top_horn", CubeListBuilder.create().texOffs(20, 47).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6527F, 0.0531F, 0.0693F));

		PartDefinition fin = right_fins.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, -5.0F, 1.0F, 10.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 8.0F, 0.0F, -0.5585F, -1.0297F, 0.3665F));

		PartDefinition fin3 = right_fins.addOrReplaceChild("fin3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 8.0F, -1.0F, -0.3054F, -0.4363F, 0.0F));

		PartDefinition cube_r5 = fin3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 43).addBox(-2.0F, -3.0F, -1.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.0F, 2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition fin2 = right_fins.addOrReplaceChild("fin2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 7.0F, 7.0F, -0.3054F, -0.4363F, 0.0F));

		PartDefinition cube_r6 = fin2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 1.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition top_horn2 = right_fins.addOrReplaceChild("top_horn2", CubeListBuilder.create().texOffs(37, 43).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 10.0F, -1.1868F, 0.1047F, -0.2443F));

		PartDefinition cube_r7 = top_horn2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 52).addBox(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -8.0F, -0.7F, -0.6545F, 0.0F, 0.0F));

		PartDefinition left_fins = body.addOrReplaceChild("left_fins", CubeListBuilder.create(), PartPose.offset(-3.0F, -14.0F, -19.0F));

		PartDefinition top_horn3 = left_fins.addOrReplaceChild("top_horn3", CubeListBuilder.create().texOffs(20, 47).mirror().addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6527F, -0.0531F, -0.0693F));

		PartDefinition fin4 = left_fins.addOrReplaceChild("fin4", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(-9.0F, -5.0F, 1.0F, 10.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 8.0F, 0.0F, -0.5585F, 1.0297F, -0.3665F));

		PartDefinition fin5 = left_fins.addOrReplaceChild("fin5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 8.0F, -1.0F, -0.3054F, 0.4363F, 0.0F));

		PartDefinition cube_r8 = fin5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 43).mirror().addBox(-3.0F, -3.0F, -1.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 5.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition fin6 = left_fins.addOrReplaceChild("fin6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 7.0F, 7.0F, -0.3054F, 0.4363F, 0.0F));

		PartDefinition cube_r9 = fin6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, -7.0F, -1.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.0F, 1.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition top_horn4 = left_fins.addOrReplaceChild("top_horn4", CubeListBuilder.create().texOffs(37, 43).mirror().addBox(-1.0F, -8.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.0F, 10.0F, -1.1868F, -0.1047F, 0.2443F));

		PartDefinition cube_r10 = top_horn4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 52).mirror().addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -8.0F, -0.7F, -0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		crashfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return crashfish;
	}
}