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

public class HolefishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart holefish;
//	private final ModelPart body;
//	private final ModelPart back;
//	private final ModelPart tail_fin;

	public HolefishModel(ModelPart root) {
		this.holefish = root.getChild("holefish");
//		this.body = root.getChild("body");
//		this.back = root.getChild("back");
//		this.tail_fin = root.getChild("tail_fin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition holefish = partdefinition.addOrReplaceChild("holefish", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 3.0F));

		PartDefinition body = holefish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(6, 9).addBox(-1.0F, -3.0F, -1.125F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -4.0F, -0.125F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 8).addBox(-1.0F, -2.0F, -2.125F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 0).addBox(-0.5F, -3.0F, 0.875F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.875F));

		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(3, 15).addBox(0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(13, 14).addBox(0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 4).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 0).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.875F));

		PartDefinition tail_fin = back.addOrReplaceChild("tail_fin", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Holefish) entity).idleAnimationState, ModAnimationDefinitions.HOLEFISH_IDLE, ageInTicks, 1f);
		this.animate(((Holefish) entity).flopAnimationState, ModAnimationDefinitions.HOLEFISH_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		holefish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return holefish;
	}
}