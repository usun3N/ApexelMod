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

import net.mcreator.apexel.entity.BlackMarketEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlackMarketRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlackMarketEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelblackmarket(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apexel:textures/blackmarket.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelblackmarket extends EntityModel<Entity> {
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		public Modelblackmarket() {
			textureWidth = 16;
			textureHeight = 16;
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(8.0F, 24.0F, -8.0F);
			bone2.setTextureOffset(0, 2).addBox(-9.0F, -33.0F, 7.0F, 2.0F, 33.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(0, 1).addBox(-9.0F, -24.9498F, 2.0503F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 1).addBox(-9.0F, -24.9498F, 12.9497F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 1).addBox(-3.0503F, -24.9498F, 7.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(0, 1).addBox(-13.9497F, -24.9498F, 7.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -29.1924F, 8.2929F);
			bone2.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 2).addBox(-9.0F, -1.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -17.8787F, -3.6066F);
			bone2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 2).addBox(-9.0F, -1.0F, 9.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.7574F, -24.2426F, 0.0F);
			bone2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
			cube_r3.setTextureOffset(0, 2).addBox(-7.0F, -1.0F, 7.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-8.2929F, -29.1924F, 0.0F);
			bone2.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
			cube_r4.setTextureOffset(0, 2).addBox(-7.0F, -1.0F, 7.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -17.9498F, 2.0503F);
			bone2.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 2).addBox(-9.0F, -1.0F, 0.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, -6.636F, 2.636F);
			bone2.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 2).addBox(-9.0F, -1.0F, 9.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-9.0F, -13.0F, 0.0F);
			bone2.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
			cube_r7.setTextureOffset(0, 2).addBox(-7.0F, -1.0F, 7.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-2.0503F, -17.9498F, 0.0F);
			bone2.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
			cube_r8.setTextureOffset(0, 2).addBox(-7.0F, -1.0F, 7.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(22.2132F, -24.5147F, -7.0F);
			bone.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
			cube_r9.setTextureOffset(0, 1).addBox(-22.0F, 9.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(21.6274F, -24.5147F, -7.0F);
			bone.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
			cube_r10.setTextureOffset(0, 1).addBox(-22.0F, 9.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(8.0F, -9.6132F, 0.028F);
			bone.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(0, 3).addBox(-9.0F, -22.0F, 5.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
