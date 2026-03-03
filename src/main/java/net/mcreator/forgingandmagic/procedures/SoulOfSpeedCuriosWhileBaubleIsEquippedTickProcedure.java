package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class SoulOfSpeedCuriosWhileBaubleIsEquippedTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SCULK_SOUL, x, y, z, 3, 1, 1, 1, 3);
	}
}