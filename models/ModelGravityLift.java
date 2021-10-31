// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelGravityLift extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public ModelGravityLift() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.2819F, -2.4142F, -0.3155F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.5236F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -6.0F, -1.0F, 3.0F, 10, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.1355F, 2.5355F, -0.1629F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, -0.5236F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -5.0F, -1.0F, -4.0F, 10, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.2426F, -3.8284F, 1.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, -1.5708F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -6.0F, -1.0F, 5.0F, 10, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, 0.0F, 1.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -6.0F, -1.0F, 5.0F, 11, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.1962F, 0.0F, -0.4641F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.5236F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -6.0F, -1.0F, 3.0F, 11, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.3038F, 0.0F, 0.5981F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.5236F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -6.0F, -1.0F, -4.0F, 11, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bb_main.rotateAngleY = f2 / 20.f;
	}
}