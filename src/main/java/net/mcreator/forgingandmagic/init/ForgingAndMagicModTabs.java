/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgingandmagic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.forgingandmagic.ForgingAndMagicMod;

@EventBusSubscriber
public class ForgingAndMagicModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgingAndMagicMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SOULS = REGISTRY.register("souls",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forging_and_magic.souls")).icon(() -> new ItemStack(ForgingAndMagicModItems.SOUL_OF_SPEED.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForgingAndMagicModItems.SOUL_OF_SPEED.get());
				tabData.accept(ForgingAndMagicModItems.SOULOF_MINER.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ForgingAndMagicModItems.AQUATINT_INGOT.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ForgingAndMagicModBlocks.AQUATINT_ORE.get().asItem());
			tabData.accept(ForgingAndMagicModBlocks.AQUATINT_BLOCK.get().asItem());
			tabData.accept(ForgingAndMagicModBlocks.TERRALITE_ORE.get().asItem());
			tabData.accept(ForgingAndMagicModBlocks.TERRALITE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ForgingAndMagicModItems.AQUATINT_PICKAXE.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_AXE.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_SHOVEL.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_HOE.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_PICKAXE.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_AXE.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_SHOVEL.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ForgingAndMagicModItems.AQUATINT_SWORD.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_ARMOR_HELMET.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_ARMOR_CHESTPLATE.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_ARMOR_LEGGINGS.get());
			tabData.accept(ForgingAndMagicModItems.AQUATINT_ARMOR_BOOTS.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_SWORD.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_ARMOR_HELMET.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_ARMOR_CHESTPLATE.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_ARMOR_LEGGINGS.get());
			tabData.accept(ForgingAndMagicModItems.TERRALITE_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(ForgingAndMagicModBlocks.AQUATINT_ANVIL.get().asItem());
			tabData.accept(ForgingAndMagicModBlocks.COREOFINFERNALFURNACE.get().asItem());
		}
	}
}