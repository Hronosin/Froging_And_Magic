package net.mcreator.forgingandmagic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.forgingandmagic.init.ForgingAndMagicModMenus;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModItems;

public class AquatintAnvilCraftProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == ForgingAndMagicModItems.AQUATINT_INGOT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.RABBIT_FOOT
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == ForgingAndMagicModItems.AQUATINT_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Items.RABBIT_FOOT
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(8).getItem() : ItemStack.EMPTY).getItem() == Items.NETHER_STAR) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 9, 3, 3, 3, 1);
			if (entity instanceof Player _player && _player.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu) {
				ItemStack _setstack19 = new ItemStack(ForgingAndMagicModItems.SOUL_OF_SPEED.get()).copy();
				_setstack19.setCount(1);
				_menu.getSlots().get(9).set(_setstack19);
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(7).remove(1);
				_menu.getSlots().get(8).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu29 ? _menu29.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu31 ? _menu31.getSlots().get(1).getItem() : ItemStack.EMPTY)
						.getItem() == ForgingAndMagicModItems.TERRALITE_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu33 ? _menu33.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu35 ? _menu35.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Items.SPYGLASS
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu37 ? _menu37.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu39 ? _menu39.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == ForgingAndMagicModItems.TERRALITE_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu41 ? _menu41.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Items.ECHO_SHARD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu43 ? _menu43.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Items.TORCH
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu45 ? _menu45.getSlots().get(8).getItem() : ItemStack.EMPTY).getItem() == Items.NETHER_STAR) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, x, y, z, 9, 3, 3, 3, 1);
			if (entity instanceof Player _player && _player.containerMenu instanceof ForgingAndMagicModMenus.MenuAccessor _menu) {
				ItemStack _setstack48 = new ItemStack(ForgingAndMagicModItems.SOULOF_MINER.get()).copy();
				_setstack48.setCount(1);
				_menu.getSlots().get(9).set(_setstack48);
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				_menu.getSlots().get(2).remove(1);
				_menu.getSlots().get(3).remove(1);
				_menu.getSlots().get(4).remove(1);
				_menu.getSlots().get(5).remove(1);
				_menu.getSlots().get(6).remove(1);
				_menu.getSlots().get(7).remove(1);
				_menu.getSlots().get(8).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}