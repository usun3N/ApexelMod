package net.mcreator.apexel.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.apexel.potion.StimEffectPotionEffect;
import net.mcreator.apexel.ApexelMod;

import java.util.Map;

public class StimUseEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ApexelMod.LOGGER.warn("Failed to load dependency entity for procedure StimUseEvent!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ApexelMod.LOGGER.warn("Failed to load dependency itemstack for procedure StimUseEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 4)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(StimEffectPotionEffect.potion, (int) 80, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 80, (int) 3, (false), (false)));
			entity.attackEntityFrom(DamageSource.SWEET_BERRY_BUSH, (float) 4);
			((itemstack)).shrink((int) 1);
		}
	}
}
