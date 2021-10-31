package net.mcreator.apexel.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.apexel.entity.GravityLiftEntityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GravityLiftEntityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GravityLiftEntityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGravityLift(), 0.3f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apexel:textures/gravitylifttexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelGravityLift extends EntityModel<Entity> {
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
			addBoxHelper(cube_r1, 0, 14, -6.0F, -1.0F, 3.0F, 10, 1, 1, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.1355F, 2.5355F, -0.1629F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.7854F, -0.5236F, 0.0F);
			addBoxHelper(cube_r2, 0, 14, -5.0F, -1.0F, -4.0F, 10, 1, 1, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(1.2426F, -3.8284F, 1.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, -1.5708F, 0.0F);
			addBoxHelper(cube_r3, 0, 14, -6.0F, -1.0F, 5.0F, 10, 1, 1, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(2.0F, 0.0F, 1.0F);
			bb_main.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
			addBoxHelper(cube_r4, 0, 0, -6.0F, -1.0F, 5.0F, 11, 1, 1, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.1962F, 0.0F, -0.4641F);
			bb_main.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.5236F, 0.0F);
			addBoxHelper(cube_r5, 0, 0, -6.0F, -1.0F, 3.0F, 11, 1, 1, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.3038F, 0.0F, 0.5981F);
			bb_main.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, -0.5236F, 0.0F);
			addBoxHelper(cube_r6, 0, 0, -6.0F, -1.0F, -4.0F, 11, 1, 1, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bb_main.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.bb_main.rotateAngleY = f2 / 20.f;
		}
	}
	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
