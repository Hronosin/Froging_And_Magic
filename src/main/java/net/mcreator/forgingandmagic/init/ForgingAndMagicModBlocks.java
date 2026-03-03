/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgingandmagic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgingandmagic.block.TerraliteOreBlock;
import net.mcreator.forgingandmagic.block.TerraliteBlockBlock;
import net.mcreator.forgingandmagic.block.AquatintOreBlock;
import net.mcreator.forgingandmagic.block.AquatintBlockBlock;
import net.mcreator.forgingandmagic.block.AquatintAnvilBlock;
import net.mcreator.forgingandmagic.ForgingAndMagicMod;

public class ForgingAndMagicModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ForgingAndMagicMod.MODID);
	public static final DeferredBlock<Block> AQUATINT_ORE;
	public static final DeferredBlock<Block> AQUATINT_BLOCK;
	public static final DeferredBlock<Block> AQUATINT_ANVIL;
	public static final DeferredBlock<Block> TERRALITE_ORE;
	public static final DeferredBlock<Block> TERRALITE_BLOCK;
	static {
		AQUATINT_ORE = REGISTRY.register("aquatint_ore", AquatintOreBlock::new);
		AQUATINT_BLOCK = REGISTRY.register("aquatint_block", AquatintBlockBlock::new);
		AQUATINT_ANVIL = REGISTRY.register("aquatint_anvil", AquatintAnvilBlock::new);
		TERRALITE_ORE = REGISTRY.register("terralite_ore", TerraliteOreBlock::new);
		TERRALITE_BLOCK = REGISTRY.register("terralite_block", TerraliteBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}