package net.mcreator.apexel.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.apexel.ApexelMod;

import java.util.Map;

public class SmokeTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ApexelMod.LOGGER.warn("Failed to load dependency x for procedure SmokeTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ApexelMod.LOGGER.warn("Failed to load dependency y for procedure SmokeTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ApexelMod.LOGGER.warn("Failed to load dependency z for procedure SmokeTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ApexelMod.LOGGER.warn("Failed to load dependency world for procedure SmokeTickEvent!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(ParticleTypes.CLOUD, x, y, z, 0, 0, 0);
	}
}
