package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.forgingandmagic.world.inventory.InfernalFurnaceGUIMenu;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModBlocks;

import io.netty.buffer.Unpooled;

public class CoreofInfernalFurnacePriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForgingAndMagicModBlocks.COREOFINFERNALFURNACE.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CRYING_OBSIDIAN && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CRYING_OBSIDIAN
					&& (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.NETHER_BRICKS && (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.ANCIENT_DEBRIS
					&& (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.ANCIENT_DEBRIS && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.NETHER_BRICKS
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.NETHER_BRICKS && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.ANCIENT_DEBRIS
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.NETHER_BRICKS && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.ANCIENT_DEBRIS
					&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == ForgingAndMagicModBlocks.TERRALITE_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == ForgingAndMagicModBlocks.TERRALITE_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == ForgingAndMagicModBlocks.TERRALITE_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == ForgingAndMagicModBlocks.TERRALITE_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == ForgingAndMagicModBlocks.AQUATINT_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == ForgingAndMagicModBlocks.AQUATINT_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == ForgingAndMagicModBlocks.AQUATINT_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == ForgingAndMagicModBlocks.AQUATINT_BLOCK.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.BONE_BLOCK
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.BONE_BLOCK && (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.BONE_BLOCK
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.BONE_BLOCK) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					_ent.openMenu(new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("InfernalFurnaceGUI");
						}

						@Override
						public boolean shouldTriggerClientSideContainerClosingOnOpen() {
							return false;
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new InfernalFurnaceGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}