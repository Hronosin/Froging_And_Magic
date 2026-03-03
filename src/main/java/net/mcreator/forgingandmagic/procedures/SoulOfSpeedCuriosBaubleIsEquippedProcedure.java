package net.mcreator.forgingandmagic.procedures;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class SoulOfSpeedCuriosBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name"),
					((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity0.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.MOVEMENT_SPEED).addPermanentModifier(modifier);
			}
		}
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name"),
					((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MOVEMENT_EFFICIENCY) ? _livingEntity2.getAttribute(Attributes.MOVEMENT_EFFICIENCY).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(Attributes.MOVEMENT_EFFICIENCY).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.MOVEMENT_EFFICIENCY).addPermanentModifier(modifier);
			}
		}
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name"),
					((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.SNEAKING_SPEED) ? _livingEntity4.getAttribute(Attributes.SNEAKING_SPEED).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(Attributes.SNEAKING_SPEED).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.SNEAKING_SPEED).addPermanentModifier(modifier);
			}
		}
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name"),
					((entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.STEP_HEIGHT) ? _livingEntity6.getAttribute(Attributes.STEP_HEIGHT).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(NeoForgeMod.SWIM_SPEED).hasModifier(modifier.id())) {
				_entity.getAttribute(NeoForgeMod.SWIM_SPEED).addPermanentModifier(modifier);
			}
		}
	}
}