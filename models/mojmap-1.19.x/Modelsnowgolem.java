// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsnowgolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "snowgolem"), "main");
	private final ModelPart piece2;

	public Modelsnowgolem(ModelPart root) {
		this.piece2 = root.getChild("piece2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition piece2 = partdefinition.addOrReplaceChild("piece2", CubeListBuilder.create().texOffs(0, 36)
				.addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition piece1 = piece2.addOrReplaceChild("piece1", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F,
				-10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition head = piece1.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F,
				-8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition arm1 = piece1.addOrReplaceChild("arm1",
				CubeListBuilder.create().texOffs(32, 0).addBox(1.0F, -4.0F, -1.0F, 12.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition arm2 = piece1.addOrReplaceChild("arm2",
				CubeListBuilder.create().texOffs(32, 0).addBox(1.0F, 2.0F, -1.0F, 12.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 2.3562F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		piece2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}