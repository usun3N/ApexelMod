package net.mcreator.apexel.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.apexel.potion.DoubleJumpEffectPotionEffect;
import net.mcreator.apexel.ApexelMod;

import java.util.Map;
import java.util.Collection;

public class DoubleJumpEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure DoubleJumpEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApexelMod.LOGGER.warn("Failed to load dependency x for procedure DoubleJumpEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApexelMod.LOGGER.warn("Failed to load dependency y for procedure DoubleJumpEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApexelMod.LOGGER.warn("Failed to load dependency z for procedure DoubleJumpEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApexelMod.LOGGER.warn("Failed to load dependency world for procedure DoubleJumpEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == DoubleJumpEffectPotionEffect.potion)
							return effect.getDuration();
					}
				}
				return 0;
			}
		}.check(entity)) > 0)) {
			if ((!(entity.isOnGround()))) {
				entity.setMotion(((entity.getMotion().getX()) * 3), 0.8, ((entity.getMotion().getZ()) * 3));
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(DoubleJumpEffectPotionEffect.potion);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, x, y, z, (int) 5, 0.5, 0, 0.5, 0.5);
				}
			}
		}
	}
}
