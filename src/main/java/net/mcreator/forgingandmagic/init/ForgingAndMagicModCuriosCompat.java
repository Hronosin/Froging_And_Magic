package net.mcreator.forgingandmagic.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.forgingandmagic.procedures.*;

public class ForgingAndMagicModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public boolean canWalkOnPowderedSnow(SlotContext slotContext) {
				return true;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("particle.soul_escape")).value(), 1, 1);
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				SoulOfSpeedCuriosWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ());
			}

			@Override
			public void onEquip(SlotContext slotContext, ItemStack prevStack) {
				SoulOfSpeedCuriosBaubleIsEquippedProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				SoulOfSpeedCuriosBaubleIsUnequippedProcedure.execute(slotContext.entity());
			}
		}, ForgingAndMagicModItems.SOUL_OF_SPEED.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan) {
				return true;
			}

			@Override
			public boolean makesPiglinsNeutral(SlotContext slotContext) {
				return true;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("particle.soul_escape")).value(), 1, 1);
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				SoulofMinerCuriosWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
			}

			@Override
			public void onEquip(SlotContext slotContext, ItemStack prevStack) {
				SoulofMinerCuriosBaubleIsEquippedProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				SoulofMinerCuriosBaubleIsUnequippedProcedure.execute(slotContext.entity());
			}
		}, ForgingAndMagicModItems.SOULOF_MINER.get());
	}
}