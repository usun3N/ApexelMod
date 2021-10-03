package net.mcreator.apexel.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.apexel.ApexelMod;

import java.util.Map;

public class VoidEndEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure VoidEndEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.disableDamage = (false);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.INVISIBILITY);
		}
	}
}
