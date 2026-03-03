/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgingandmagic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.forgingandmagic.item.*;
import net.mcreator.forgingandmagic.ForgingAndMagicMod;

public class ForgingAndMagicModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ForgingAndMagicMod.MODID);
	public static final DeferredItem<Item> AQUATINT_INGOT;
	public static final DeferredItem<Item> AQUATINT_ORE;
	public static final DeferredItem<Item> AQUATINT_BLOCK;
	public static final DeferredItem<Item> AQUATINT_PICKAXE;
	public static final DeferredItem<Item> AQUATINT_AXE;
	public static final DeferredItem<Item> AQUATINT_SWORD;
	public static final DeferredItem<Item> AQUATINT_SHOVEL;
	public static final DeferredItem<Item> AQUATINT_HOE;
	public static final DeferredItem<Item> AQUATINT_ARMOR_HELMET;
	public static final DeferredItem<Item> AQUATINT_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> AQUATINT_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> AQUATINT_ARMOR_BOOTS;
	public static final DeferredItem<Item> AQUATINT_ANVIL;
	public static final DeferredItem<Item> SOUL_OF_SPEED;
	public static final DeferredItem<Item> TERRALITE_INGOT;
	public static final DeferredItem<Item> TERRALITE_ORE;
	public static final DeferredItem<Item> TERRALITE_BLOCK;
	public static final DeferredItem<Item> TERRALITE_PICKAXE;
	public static final DeferredItem<Item> TERRALITE_AXE;
	public static final DeferredItem<Item> TERRALITE_SWORD;
	public static final DeferredItem<Item> TERRALITE_SHOVEL;
	public static final DeferredItem<Item> TERRALITE_HOE;
	public static final DeferredItem<Item> TERRALITE_ARMOR_HELMET;
	public static final DeferredItem<Item> TERRALITE_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> TERRALITE_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> TERRALITE_ARMOR_BOOTS;
	public static final DeferredItem<Item> SOULOF_MINER;
	public static final DeferredItem<Item> COREOF_INFERNAL_FURNACE;
	static {
		AQUATINT_INGOT = REGISTRY.register("aquatint_ingot", AquatintIngotItem::new);
		AQUATINT_ORE = block(ForgingAndMagicModBlocks.AQUATINT_ORE);
		AQUATINT_BLOCK = block(ForgingAndMagicModBlocks.AQUATINT_BLOCK);
		AQUATINT_PICKAXE = REGISTRY.register("aquatint_pickaxe", AquatintPickaxeItem::new);
		AQUATINT_AXE = REGISTRY.register("aquatint_axe", AquatintAxeItem::new);
		AQUATINT_SWORD = REGISTRY.register("aquatint_sword", AquatintSwordItem::new);
		AQUATINT_SHOVEL = REGISTRY.register("aquatint_shovel", AquatintShovelItem::new);
		AQUATINT_HOE = REGISTRY.register("aquatint_hoe", AquatintHoeItem::new);
		AQUATINT_ARMOR_HELMET = REGISTRY.register("aquatint_armor_helmet", AquatintArmorItem.Helmet::new);
		AQUATINT_ARMOR_CHESTPLATE = REGISTRY.register("aquatint_armor_chestplate", AquatintArmorItem.Chestplate::new);
		AQUATINT_ARMOR_LEGGINGS = REGISTRY.register("aquatint_armor_leggings", AquatintArmorItem.Leggings::new);
		AQUATINT_ARMOR_BOOTS = REGISTRY.register("aquatint_armor_boots", AquatintArmorItem.Boots::new);
		AQUATINT_ANVIL = block(ForgingAndMagicModBlocks.AQUATINT_ANVIL, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
		SOUL_OF_SPEED = REGISTRY.register("soul_of_speed", SoulOfSpeedItem::new);
		TERRALITE_INGOT = REGISTRY.register("terralite_ingot", TerraliteIngotItem::new);
		TERRALITE_ORE = block(ForgingAndMagicModBlocks.TERRALITE_ORE, new Item.Properties().rarity(Rarity.UNCOMMON));
		TERRALITE_BLOCK = block(ForgingAndMagicModBlocks.TERRALITE_BLOCK);
		TERRALITE_PICKAXE = REGISTRY.register("terralite_pickaxe", TerralitePickaxeItem::new);
		TERRALITE_AXE = REGISTRY.register("terralite_axe", TerraliteAxeItem::new);
		TERRALITE_SWORD = REGISTRY.register("terralite_sword", TerraliteSwordItem::new);
		TERRALITE_SHOVEL = REGISTRY.register("terralite_shovel", TerraliteShovelItem::new);
		TERRALITE_HOE = REGISTRY.register("terralite_hoe", TerraliteHoeItem::new);
		TERRALITE_ARMOR_HELMET = REGISTRY.register("terralite_armor_helmet", TerraliteArmorItem.Helmet::new);
		TERRALITE_ARMOR_CHESTPLATE = REGISTRY.register("terralite_armor_chestplate", TerraliteArmorItem.Chestplate::new);
		TERRALITE_ARMOR_LEGGINGS = REGISTRY.register("terralite_armor_leggings", TerraliteArmorItem.Leggings::new);
		TERRALITE_ARMOR_BOOTS = REGISTRY.register("terralite_armor_boots", TerraliteArmorItem.Boots::new);
		SOULOF_MINER = REGISTRY.register("soulof_miner", SoulofMinerItem::new);
		COREOF_INFERNAL_FURNACE = block(ForgingAndMagicModBlocks.COREOF_INFERNAL_FURNACE, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}