package net.mcreator.forgingandmagic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.forgingandmagic.jei_recipes.AquatintAnvilRecipeTypeRecipe;

@EventBusSubscriber
public class ForgingAndMagicModRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, "forging_and_magic");
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "forging_and_magic");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = ModList.get().getModContainerById("forging_and_magic").get().getEventBus();
		event.enqueueWork(() -> {
			RECIPE_TYPES.register(bus);
			SERIALIZERS.register(bus);
			RECIPE_TYPES.register("aquatint_anvil_recipe_type", () -> AquatintAnvilRecipeTypeRecipe.Type.INSTANCE);
			SERIALIZERS.register("aquatint_anvil_recipe_type", () -> AquatintAnvilRecipeTypeRecipe.Serializer.INSTANCE);
		});
	}
}