package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class TerraliteHoePriRazrushieniiBlokaInstrumientomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		int horizontalRadiusSquare = (int) 5 - 1;
		int verticalRadiusSquare = (int) 5 - 1;
		int yIterationsSquare = verticalRadiusSquare;
		for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
			for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
				for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
					// Execute the desired statements within the square/cube
					if (world instanceof Level _level) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
				}
			}
		}
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 4), _level, null, _stkprov -> {
			});
		}
	}
}