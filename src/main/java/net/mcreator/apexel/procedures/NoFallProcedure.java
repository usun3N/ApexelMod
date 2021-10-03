package net.mcreator.apexel.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.apexel.ApexelMod;

import java.util.Map;

public class NoFallProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure NoFall!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.fallDistance = (float) (0);
	}
}
