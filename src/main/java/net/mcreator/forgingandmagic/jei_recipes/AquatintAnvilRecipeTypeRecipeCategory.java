package net.mcreator.forgingandmagic.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.NonNullList;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.forgingandmagic.init.ForgingAndMagicModJeiPlugin;
import net.mcreator.forgingandmagic.init.ForgingAndMagicModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

import java.util.List;
import java.util.ArrayList;

public class AquatintAnvilRecipeTypeRecipeCategory implements IRecipeCategory<AquatintAnvilRecipeTypeRecipe> {
	public final static ResourceLocation UID = ResourceLocation.parse("forging_and_magic:aquatint_anvil_recipe_type");
	public final static ResourceLocation TEXTURE = ResourceLocation.parse("forging_and_magic:textures/screens/aquatint_anvil_gui.png");
	private final IDrawable background;
	private final IDrawable icon;
	private final Minecraft mc = Minecraft.getInstance();

	public AquatintAnvilRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 365, 185);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ForgingAndMagicModBlocks.AQUATINT_ANVIL.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<AquatintAnvilRecipeTypeRecipe> getRecipeType() {
		return ForgingAndMagicModJeiPlugin.AquatintAnvilRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Aquatint Anvil Recipe Type");
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public int getWidth() {
		return this.background.getWidth();
	}

	@Override
	public int getHeight() {
		return this.background.getHeight();
	}

	@Override
	public void draw(AquatintAnvilRecipeTypeRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
		this.background.draw(guiGraphics);

	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, AquatintAnvilRecipeTypeRecipe recipe, IFocusGroup focuses) {
		List<ItemStack> stacks = new ArrayList<>();
		List<ItemStack> recipeOutputs = recipe.getResultItems();
		List<ItemStack> actualOutputs = NonNullList.withSize(1, ItemStack.EMPTY);
		for (int i = 0; i < recipeOutputs.size(); i++) {
			actualOutputs.set(i, recipeOutputs.get(i));
		}
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(0).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(0)));
		builder.addSlot(RecipeIngredientRole.INPUT, 208, 25).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(1).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(1)));
		builder.addSlot(RecipeIngredientRole.INPUT, 271, 25).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(2).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(2)));
		builder.addSlot(RecipeIngredientRole.INPUT, 334, 25).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(3).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(3)));
		builder.addSlot(RecipeIngredientRole.INPUT, 334, 53).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(4).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(4)));
		builder.addSlot(RecipeIngredientRole.INPUT, 334, 81).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(5).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(5)));
		builder.addSlot(RecipeIngredientRole.INPUT, 271, 81).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(6).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(6)));
		builder.addSlot(RecipeIngredientRole.INPUT, 208, 81).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(7).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(7)));
		builder.addSlot(RecipeIngredientRole.INPUT, 208, 53).addItemStacks(stacks);
		stacks.clear();
		for (ItemStack item : (List<ItemStack>) List.of(recipe.getIngredients().get(8).getItems()))
			stacks.add(new ItemStack(item.getItem(), recipe.integers().get(8)));
		builder.addSlot(RecipeIngredientRole.INPUT, 271, 53).addItemStacks(stacks);
		builder.addSlot(RecipeIngredientRole.OUTPUT, 271, 116).addItemStack(actualOutputs.get(9));
	}
}