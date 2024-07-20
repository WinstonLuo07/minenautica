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


public class HoopfishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart hoopfish;
//	private final ModelPart body;
//	private final ModelPart tail;

	public HoopfishModel(ModelPart root) {
		this.hoopfish = root.getChild("hoopfish");
//		this.body = root.getChild("body");
//		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hoopfish = partdefinition.addOrReplaceChild("hoopfish", CubeListBuilder.create(), PartPose.offset(0.0F, 18.5F, 3.0F));

		PartDefinition body = hoopfish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -7.0F, -4.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(11, 6).addBox(0.0F, -12.0F, -4.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.5F, -3.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, 5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Hoopfish) entity).idleAnimationState, ModAnimationDefinitions.HOOPFISH_IDLE, ageInTicks, 1f);
		this.animate(((Hoopfish) entity).flopAnimationState, ModAnimationDefinitions.HOOPFISH_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hoopfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return hoopfish;
	}
}