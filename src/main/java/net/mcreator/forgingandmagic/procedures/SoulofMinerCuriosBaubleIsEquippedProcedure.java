package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class SoulofMinerCuriosBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name1"),
					((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.BLOCK_BREAK_SPEED) ? _livingEntity0.getAttribute(Attributes.BLOCK_BREAK_SPEED).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(Attributes.BLOCK_BREAK_SPEED).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.BLOCK_BREAK_SPEED).addPermanentModifier(modifier);
			}
		}
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name1"),
					((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MINING_EFFICIENCY) ? _livingEntity2.getAttribute(Attributes.MINING_EFFICIENCY).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(Attributes.MINING_EFFICIENCY).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.MINING_EFFICIENCY).addPermanentModifier(modifier);
			}
		}
		if (entity instanceof LivingEntity _entity) {
			AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("forging_and_magic:name1"),
					((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.SUBMERGED_MINING_SPEED) ? _livingEntity4.getAttribute(Attributes.SUBMERGED_MINING_SPEED).getBaseValue() : 0) + 0.5),
					AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
			if (!_entity.getAttribute(Attributes.SUBMERGED_MINING_SPEED).hasModifier(modifier.id())) {
				_entity.getAttribute(Attributes.SUBMERGED_MINING_SPEED).addPermanentModifier(modifier);
			}
		}
	}
}