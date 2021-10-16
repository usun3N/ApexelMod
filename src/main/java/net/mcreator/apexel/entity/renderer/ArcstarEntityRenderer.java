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

import net.mcreator.apexel.entity.ArcstarEntityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ArcstarEntityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ArcstarEntityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("apexel:textures/arcstar.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1_r1;
		private final ModelRenderer cube_r1_r2;
		public Modelcustom_model() {
			textureWidth = 16;
			textureHeight = 16;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(8, 0).addBox(-1.0F, -6.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(-1.0F, -12.5F, -0.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(-11.3253F, 0.616F, 0.0F);
			bb_main.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, 0.0F, 0.0F, 1.0472F);
			cube_r1_r1.setTextureOffset(0, 0).addBox(-1.0F, -12.5F, -0.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			cube_r1_r2 = new ModelRenderer(this);
			cube_r1_r2.setRotationPoint(11.3253F, 0.616F, 0.0F);
			bb_main.addChild(cube_r1_r2);
			setRotationAngle(cube_r1_r2, 0.0F, 0.0F, -1.0472F);
			cube_r1_r2.setTextureOffset(0, 0).addBox(-1.0F, -12.5F, -0.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
