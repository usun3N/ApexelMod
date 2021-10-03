
package net.mcreator.apexel.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.apexel.item.ApexelLogoItem;
import net.mcreator.apexel.ApexelModElements;

@ApexelModElements.ModElement.Tag
public class ApexelItemGroup extends ApexelModElements.ModElement {
	public ApexelItemGroup(ApexelModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabapexel") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ApexelLogoItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
