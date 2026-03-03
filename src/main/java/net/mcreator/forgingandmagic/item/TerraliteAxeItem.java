package net.mcreator.forgingandmagic.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;

import net.mcreator.forgingandmagic.procedures.TerraliteAxePriRazrushieniiBlokaInstrumientomProcedure;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModItems;

public class TerraliteAxeItem extends AxeItem {
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
			return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
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

	public TerraliteAxeItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 19f, -3f)).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		TerraliteAxePriRazrushieniiBlokaInstrumientomProcedure.execute(entity);
		return retval;
	}
}