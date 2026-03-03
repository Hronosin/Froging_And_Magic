package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class TerralitePickaxePriRazrushieniiBlokaInstrumientomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.DIG_SPEED))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, false, false));
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) >= 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 40, (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getAmplifier() : 0) + 1, false, false));
		}
	}
}