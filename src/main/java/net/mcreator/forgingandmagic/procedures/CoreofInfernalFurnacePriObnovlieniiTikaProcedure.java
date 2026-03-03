package net.mcreator.forgingandmagic.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.forgingandmagic.init.ForgingAndMagicModBlocks;

public class CoreofInfernalFurnacePriObnovlieniiTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "Fuel Count") >= 1) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("Fuel Count", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "Fuel Count") - 1));
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (Items.COAL == (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 15).copy()).getItem() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 15).getCount() >= 1
							&& getBlockNBTNumber(world, BlockPos.containing(x, y, z), "Fuel Count") == 0) {
						if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
							int _slotid = 15;
							ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
							_stk.shrink(1);
							_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putDouble("Fuel Count", 800);
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else if (Items.COAL == (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 15).copy()).getItem() && itemFromBlockInventory(world, BlockPos.containing(x, y, z), 15).getCount() >= 1
							&& getBlockNBTNumber(world, BlockPos.containing(x, y, z), "Fuel Count") >= 1) {
						if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
							int _slotid = 15;
							ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
							_stk.shrink(1);
							_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null) {
								_blockEntity.getPersistentData().putDouble("Fuel Count", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "Fuel Count") + 800));
							}
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}