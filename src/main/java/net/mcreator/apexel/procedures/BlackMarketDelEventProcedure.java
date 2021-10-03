package net.mcreator.apexel.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.apexel.ApexelMod;

import java.util.Map;

public class BlackMarketDelEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure BlackMarketDelEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote())
			entity.remove();
	}
}
