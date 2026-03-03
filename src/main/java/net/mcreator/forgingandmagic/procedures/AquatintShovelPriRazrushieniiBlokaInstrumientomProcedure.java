package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class AquatintShovelPriRazrushieniiBlokaInstrumientomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		for (int index0 = 0; index0 < 6; index0++) {
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
	}
}