package net.mcreator.forgingandmagic.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AquatintIngotItem extends Item {
	public AquatintIngotItem() {
		super(new Item.Properties().fireResistant());
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}