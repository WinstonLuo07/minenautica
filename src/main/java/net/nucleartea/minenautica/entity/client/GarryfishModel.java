package net.nucleartea.minenautica.entity.client;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.nucleartea.minenautica.entity.animations.ModAnimationDefinitions;
import net.nucleartea.minenautica.entity.custom.MinenauticaFish.*;


public class GarryfishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart garryfish;
//	private final ModelPart body;
//	private final ModelPart back;
//	private final ModelPart right_tail_fin;
//	private final ModelPart left_tail_fin;
//	private final ModelPart left_eye;
//	private final ModelPart right_eye;
//	private final ModelPart left_fin;
//	private final ModelPart right_fin;

	public GarryfishModel(ModelPart root) {
		this.garryfish = root.getChild("garryfish");
//		this.body = root.getChild("body");
//		this.back = root.getChild("back");
//		this.right_tail_fin = root.getChild("right_tail_fin");
//		this.left_tail_fin = root.getChild("left_tail_fin");
//		this.left_eye = root.getChild("left_eye");
//		this.right_eye = root.getChild("right_eye");
//		this.left_fin = root.getChild("left_fin");
//		this.right_fin = root.getChild("right_fin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition garryfish = partdefinition.addOrReplaceChild("garryfish", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition body = garryfish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -7.0F, -4.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(22, 19).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 21).addBox(-1.0F, -4.1F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 3).addBox(-1.0F, -6.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 3.0F));

		PartDefinition right_tail_fin = back.addOrReplaceChild("right_tail_fin", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 11.5F, 0.2561F, 0.3608F, 0.2913F));

		PartDefinition left_tail_fin = back.addOrReplaceChild("left_tail_fin", CubeListBuilder.create().texOffs(16, 9).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 11.5F, 0.2561F, -0.3608F, -0.2913F));

		PartDefinition left_eye = body.addOrReplaceChild("left_eye", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.0F, -2.4F, 0.0F, 0.0F, 0.48F));

		PartDefinition right_eye = body.addOrReplaceChild("right_eye", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.0F, -2.4F, 0.0F, 0.0F, -0.48F));

		PartDefinition left_fin = body.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, 0.0F, -1.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -1.5F, 0.2561F, -0.3608F, -0.2913F));

		PartDefinition right_fin = body.addOrReplaceChild("right_fin", CubeListBuilder.create().texOffs(11, 15).addBox(-6.0F, 0.0F, -1.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, -1.5F, 0.2561F, 0.3608F, 0.2913F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Garryfish) entity).idleAnimationState, ModAnimationDefinitions.GARRYFISH_IDLE, ageInTicks, 1f);
		this.animate(((Garryfish) entity).flopAnimationState, ModAnimationDefinitions.GARRYFISH_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		garryfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return garryfish;
	}
}