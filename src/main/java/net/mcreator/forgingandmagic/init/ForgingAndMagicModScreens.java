/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgingandmagic.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.forgingandmagic.client.gui.InfernalFurnaceGUIScreen;
import net.mcreator.forgingandmagic.client.gui.AquatintAnvilGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class ForgingAndMagicModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ForgingAndMagicModMenus.AQUATINT_ANVIL_GUI.get(), AquatintAnvilGUIScreen::new);
		event.register(ForgingAndMagicModMenus.INFERNAL_FURNACE_GUI.get(), InfernalFurnaceGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}