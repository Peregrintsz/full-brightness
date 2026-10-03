package com.fullbrightness;

import com.fullbrightness.mixin.OptionInstanceAccessor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.resources.Identifier;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class FullBrightnessClient implements ClientModInitializer {
	private static final double FULL_GAMMA = 16.0;

	private static KeyMapping toggleKey;
	private static final KeyMapping.Category CATEGORY =
			KeyMapping.Category.register(Identifier.fromNamespaceAndPath("full-brightness", "main"));
	private static boolean enabled = false;
	private static double previousGamma = 1.0;

	@Override
	public void onInitializeClient() {
		toggleKey = KeyMappingHelper.registerKeyMapping(new KeyMapping(
				"key.fullbrightness.toggle",
				GLFW.GLFW_KEY_G,
				CATEGORY
		));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (toggleKey.consumeClick()) {
				toggle(client);
			}
			if (enabled) {
				setGamma(client, FULL_GAMMA);
			}
		});

		ClientLifecycleEvents.CLIENT_STOPPING.register(client -> {
			if (enabled) {
				setGamma(client, previousGamma);
				enabled = false;
			}
		});
	}

	private static void toggle(Minecraft client) {
		if (client.options == null) return;
		if (!enabled) {
			previousGamma = client.options.gamma().get();
			enabled = true;
		} else {
			enabled = false;
			setGamma(client, previousGamma);
		}
	}

	private static void setGamma(Minecraft client, double value) {
		if (client.options == null) return;
		((OptionInstanceAccessor) (Object) client.options.gamma()).fullbrightness$setValue(value);
	}
}