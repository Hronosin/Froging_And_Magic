package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class SoulOfSpeedCuriosBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(ResourceLocation.parse("forging_and_magic:name"));
		}
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.MOVEMENT_EFFICIENCY).removeModifier(ResourceLocation.parse("forging_and_magic:name"));
		}
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.SNEAKING_SPEED).removeModifier(ResourceLocation.parse("forging_and_magic:name"));
		}
		if (entity instanceof LivingEntity _entity) {
			_entity.getAttribute(Attributes.STEP_HEIGHT).removeModifier(ResourceLocation.parse("forging_and_magic:name"));
		}
	}
}