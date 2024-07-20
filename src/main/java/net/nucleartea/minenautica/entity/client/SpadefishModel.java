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


public class SpadefishModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart spadefish;
//	private final ModelPart body;
//	private final ModelPart back;
//	private final ModelPart eye;

	public SpadefishModel(ModelPart root) {
		this.spadefish = root.getChild("spadefish");
//		this.body = root.getChild("body");
//		this.back = root.getChild("back");
//		this.eye = root.getChild("eye");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition spadefish = partdefinition.addOrReplaceChild("spadefish", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = spadefish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 34).addBox(-5.0F, -2.0F, -1.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 10).addBox(5.0F, -6.0F, 1.0F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(16, 21).addBox(-5.0F, -6.0F, 1.0F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -3.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(0.0F, -6.0F, -1.0F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, 1.0F, 0.0F, 10.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition eye = body.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(30, 0).addBox(-2.5F, -1.0F, -3.5F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(13, 10).addBox(-1.5F, -2.0F, -2.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 39).addBox(0.0F, -2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -0.3F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Spadefish) entity).idleAnimationState, ModAnimationDefinitions.SPADEFISH_IDLE, ageInTicks, 1f);
		this.animate(((Spadefish) entity).flopAnimationState, ModAnimationDefinitions.SPADEFISH_OUT_OF_WATER, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		spadefish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}


	@Override
	public ModelPart root() {
		return spadefish;
	}
}