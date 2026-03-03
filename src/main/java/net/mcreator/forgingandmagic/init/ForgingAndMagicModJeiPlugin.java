package net.mcreator.forgingandmagic.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.forgingandmagic.jei_recipes.AquatintAnvilRecipeTypeRecipeCategory;
import net.mcreator.forgingandmagic.jei_recipes.AquatintAnvilRecipeTypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;

@JeiPlugin
public class ForgingAndMagicModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<AquatintAnvilRecipeTypeRecipe> AquatintAnvilRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(AquatintAnvilRecipeTypeRecipeCategory.UID, AquatintAnvilRecipeTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("forging_and_magic:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new AquatintAnvilRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<AquatintAnvilRecipeTypeRecipe> AquatintAnvilRecipeTypeRecipes = recipeManager.getAllRecipesFor(AquatintAnvilRecipeTypeRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(AquatintAnvilRecipeType_Type, AquatintAnvilRecipeTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ForgingAndMagicModBlocks.AQUATINT_ANVIL.get().asItem()), AquatintAnvilRecipeType_Type);
	}
}