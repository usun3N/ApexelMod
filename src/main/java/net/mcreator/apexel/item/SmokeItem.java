
package net.mcreator.apexel.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.apexel.itemgroup.ApexelItemGroup;
import net.mcreator.apexel.ApexelModElements;

@ApexelModElements.ModElement.Tag
public class SmokeItem extends ApexelModElements.ModElement {
	@ObjectHolder("apexel:smoke")
	public static final Item block = null;
	public SmokeItem(ApexelModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ApexelItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("smoke");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
