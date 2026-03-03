/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgingandmagic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgingandmagic.block.*;
import net.mcreator.forgingandmagic.ForgingAndMagicMod;

public class ForgingAndMagicModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ForgingAndMagicMod.MODID);
	public static final DeferredBlock<Block> AQUATINT_ORE;
	public static final DeferredBlock<Block> AQUATINT_BLOCK;
	public static final DeferredBlock<Block> AQUATINT_ANVIL;
	public static final DeferredBlock<Block> TERRALITE_ORE;
	public static final DeferredBlock<Block> TERRALITE_BLOCK;
	public static final DeferredBlock<Block> COREOF_INFERNAL_FURNACE;
	static {
		AQUATINT_ORE = REGISTRY.register("aquatint_ore", AquatintOreBlock::new);
		AQUATINT_BLOCK = REGISTRY.register("aquatint_block", AquatintBlockBlock::new);
		AQUATINT_ANVIL = REGISTRY.register("aquatint_anvil", AquatintAnvilBlock::new);
		TERRALITE_ORE = REGISTRY.register("terralite_ore", TerraliteOreBlock::new);
		TERRALITE_BLOCK = REGISTRY.register("terralite_block", TerraliteBlockBlock::new);
		COREOF_INFERNAL_FURNACE = REGISTRY.register("coreof_infernal_furnace", CoreofInfernalFurnaceBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}