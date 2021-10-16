package net.mcreator.apexel.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.apexel.item.FlagGranadeItem;
import net.mcreator.apexel.ApexelMod;

import java.util.Random;
import java.util.Map;

public class FlagGranadeUseEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure FlagGranadeUseEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				FlagGranadeItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 0.5, (float) 1, (int) 0);
			}
		}
	}
}
