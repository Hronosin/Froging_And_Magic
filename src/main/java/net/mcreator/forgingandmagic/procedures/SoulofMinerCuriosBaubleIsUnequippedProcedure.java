package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.resources.ResourceLocation;

public class SoulofMinerCuriosBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.BLOCK_BREAK_SPEED).removeModifier(ResourceLocation.parse("forging_and_magic:name1"));
		}
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.MINING_EFFICIENCY).removeModifier(ResourceLocation.parse("forging_and_magic:name1"));
		}
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.SUBMERGED_MINING_SPEED).removeModifier(ResourceLocation.parse("forging_and_magic:name1"));
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.NIGHT_VISION);
	}
}