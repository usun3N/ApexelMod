package net.mcreator.apexel.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.apexel.ApexelMod;

import java.util.Map;

public class SmokeEntityEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApexelMod.LOGGER.warn("Failed to load dependency x for procedure SmokeEntityEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApexelMod.LOGGER.warn("Failed to load dependency y for procedure SmokeEntityEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApexelMod.LOGGER.warn("Failed to load dependency z for procedure SmokeEntityEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApexelMod.LOGGER.warn("Failed to load dependency world for procedure SmokeEntityEvent!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, x, y, z, (int) 50, 2, 2, 2, 0.1);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, (int) 10, 0, 0, 0, 0);
		}
	}
}
