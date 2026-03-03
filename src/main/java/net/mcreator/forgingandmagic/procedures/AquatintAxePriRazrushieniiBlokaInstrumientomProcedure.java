package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.Registries;

public class AquatintAxePriRazrushieniiBlokaInstrumientomProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		itemstack.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS),
				itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS)) + 1);
	}
}