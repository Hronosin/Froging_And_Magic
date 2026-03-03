package net.mcreator.forgingandmagic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SoulofMinerItem extends Item {
	public SoulofMinerItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}