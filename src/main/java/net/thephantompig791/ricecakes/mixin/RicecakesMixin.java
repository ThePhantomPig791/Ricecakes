package net.thephantompig791.ricecakes.mixin;

import net.thephantompig791.ricecakes.Ricecakes;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class RicecakesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Ricecakes.LOGGER.info("Brought to you by Ricecakes' mixin.");
	}
}
