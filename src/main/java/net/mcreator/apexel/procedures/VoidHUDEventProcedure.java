package net.mcreator.apexel.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.apexel.potion.VoidEffectPotionEffect;
import net.mcreator.apexel.ApexelMod;

import java.util.Map;
import java.util.Collection;

public class VoidHUDEventProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure VoidHUDEvent!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean TorF = false;
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == VoidEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			TorF = (boolean) (true);
		}
		return TorF;
	}
}
