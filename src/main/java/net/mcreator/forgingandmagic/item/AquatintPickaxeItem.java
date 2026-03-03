package net.mcreator.forgingandmagic.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;

import net.mcreator.forgingandmagic.procedures.AquatintPickaxePriRazrushieniiBlokaInstrumientomProcedure;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModItems;

public class AquatintPickaxeItem extends PickaxeItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 4566;
		}

		@Override
		public float getSpeed() {
			return 14f;
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
			return 56;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of(new ItemStack(ForgingAndMagicModItems.AQUATINT_INGOT.get()));
		}
	};

	public AquatintPickaxeItem() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 8f, -2.9f)).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		AquatintPickaxePriRazrushieniiBlokaInstrumientomProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}