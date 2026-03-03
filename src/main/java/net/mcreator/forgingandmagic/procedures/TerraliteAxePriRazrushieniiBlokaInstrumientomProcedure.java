package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class TerraliteAxePriRazrushieniiBlokaInstrumientomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + Mth.nextInt(RandomSource.create(), 1, 2));
	}
}