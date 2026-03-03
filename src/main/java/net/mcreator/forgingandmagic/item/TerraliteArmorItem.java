package net.mcreator.forgingandmagic.item;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import net.mcreator.forgingandmagic.init.ForgingAndMagicModItems;

import java.util.List;
import java.util.EnumMap;

@EventBusSubscriber
public abstract class TerraliteArmorItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 14);
				map.put(ArmorItem.Type.LEGGINGS, 22);
				map.put(ArmorItem.Type.CHESTPLATE, 28);
				map.put(ArmorItem.Type.HELMET, 14);
				map.put(ArmorItem.Type.BODY, 28);
			}), 46, BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), () -> Ingredient.of(new ItemStack(ForgingAndMagicModItems.TERRALITE_INGOT.get())),
					List.of(new ArmorMaterial.Layer(ResourceLocation.parse("forging_and_magic:terralite"))), 6.5f, 0.3f);
			registerHelper.register(ResourceLocation.parse("forging_and_magic:terralite_armor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public TerraliteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends TerraliteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(80)).fireResistant());
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Chestplate extends TerraliteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(80)).fireResistant());
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Leggings extends TerraliteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(80)).fireResistant());
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Boots extends TerraliteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(80)).fireResistant());
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}
}