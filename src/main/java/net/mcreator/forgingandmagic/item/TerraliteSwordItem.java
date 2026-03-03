package net.mcreator.forgingandmagic.item;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;

import net.mcreator.forgingandmagic.procedures.TerraliteSwordPriRazrushieniiBlokaInstrumientomProcedure;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModItems;

public class TerraliteSwordItem extends SwordItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 5466;
		}

		@Override
		public float getSpeed() {
			return 16f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 70;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ForgingAndMagicModItems.TERRALITE_INGOT.get()));
		}
	};

	public TerraliteSwordItem() {
		super(TOOL_TIER, new Item.Properties().attributes(SwordItem.createAttributes(TOOL_TIER, 15f, -1.6f)).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TerraliteSwordPriRazrushieniiBlokaInstrumientomProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), itemstack);
		return retval;
	}
}