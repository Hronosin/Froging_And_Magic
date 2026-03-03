package net.mcreator.forgingandmagic.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;

import net.mcreator.forgingandmagic.procedures.TerraliteHoePriRazrushieniiBlokaInstrumientomProcedure;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModItems;

public class TerraliteHoeItem extends HoeItem {
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

	public TerraliteHoeItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 14f, -2.6f)).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		TerraliteHoePriRazrushieniiBlokaInstrumientomProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), itemstack);
		return retval;
	}
}