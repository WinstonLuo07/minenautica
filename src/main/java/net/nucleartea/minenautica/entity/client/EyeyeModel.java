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



public class EyeyeModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart eyeye;
//	private final ModelPart body;
//	private final ModelPart pupil;
//	private final ModelPart top_fin;
//	private final ModelPart bone2;
//	private final ModelPart bone;
//	private final ModelPart top_fin2;
//	private final ModelPart bone3;
//	private final ModelPart bone4;
//	private final ModelPart top_fin3;
//	private final ModelPart bone5;
//	private final ModelPart bone6;
//	private final ModelPart top_fin4;
//	private final ModelPart bone7;
//	private final ModelPart bone8;

	public EyeyeModel(ModelPart root) {
		this.eyeye = root.getChild("eyeye");
//		this.body = root.getChild("body");
//		this.pupil = root.getChild("pupil");
//		this.top_fin = root.getChild("top_fin");
//		this.bone2 = root.getChild("bone2");
//		this.bone = root.getChild("bone");
//		this.top_fin2 = root.getChild("top_fin2");
//		this.bone3 = root.getChild("bone3");
//		this.bone4 = root.getChild("bone4");
//		this.top_fin3 = root.getChild("top_fin3");
//		this.bone5 = root.getChild("bone5");
//		this.bone6 = root.getChild("bone6");
//		this.top_fin4 = root.getChild("top_fin4");
//		this.bone7 = root.getChild("bone7");
//		this.bone8 = root.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition eyeye = partdefinition.addOrReplaceChild("eyeye", CubeListBuilder.create(), PartPose.offset(0.5F, 19.5F, 0.0F));

		PartDefinition body = eyeye.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.0F, -1.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-1.0F, -6.0F, 3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 10).addBox(-1.5F, -6.5F, -2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 16).addBox(0.0F, -5.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(8, 10).addBox(0.0F, -6.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 2).addBox(-1.0F, -5.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(1.0F, -5.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 4.5F, 0.0F));

		PartDefinition pupil = body.addOrReplaceChild("pupil", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -4.5F, -2.01F));

		PartDefinition top_fin = body.addOrReplaceChild("top_fin", CubeListBuilder.create(), PartPose.offset(0.5F, -4.5F, -1.0F));

		PartDefinition bone2 = top_fin.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5132F, -2.1096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, 2.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(9, 13).addBox(0.0F, -4.8333F, -2.8333F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(0.0F, -0.8333F, -0.8333F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8201F, 2.1238F, 0.1833F, 0.0F, 0.0F));

		PartDefinition top_fin2 = body.addOrReplaceChild("top_fin2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -4.5F, -1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone3 = top_fin2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5132F, -2.1096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, 2.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(9, 13).addBox(0.0F, -4.8333F, -2.8333F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(0.0F, -0.8333F, -0.8333F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8201F, 2.1238F, 0.1833F, 0.0F, 0.0F));

		PartDefinition top_fin3 = body.addOrReplaceChild("top_fin3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -4.5F, -1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone5 = top_fin3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5132F, -2.1096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, 2.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(9, 13).addBox(0.0F, -4.8333F, -2.8333F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(0.0F, -0.8333F, -0.8333F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8201F, 2.1238F, 0.1833F, 0.0F, 0.0F));

		PartDefinition top_fin4 = body.addOrReplaceChild("top_fin4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -4.5F, -1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition bone7 = top_fin4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5132F, -2.1096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, 2.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(9, 13).addBox(0.0F, -4.8333F, -2.8333F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(0.0F, -0.8333F, -0.8333F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8201F, 2.1238F, 0.1833F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Eyeye) entity).idleAnimationState, ModAnimationDefinitions.EYEYE_IDLE, ageInTicks, 1f);
		this.animate(((Eyeye) entity).flopAnimationState, ModAnimationDefinitions.EYEYE_OUT_OF_WATER, ageInTicks, 1f);
		// TODO: add look at player functionality for the eyeeye
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		eyeye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return eyeye;
	}
}