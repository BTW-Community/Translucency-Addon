package net.fabricmc.translucency.mixin;

import net.minecraft.src.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiScreen.class)
public class GuiScreenMixin {

	@ModifyConstant(method = "drawWorldBackground", constant = @Constant(intValue = 0xC0101010))
	private int modifyDrawWorldBackground1(int original) {
		return 0x0;
	}

	@ModifyConstant(method = "drawWorldBackground", constant = @Constant(intValue = 0xD0101010))
	private int modifyDrawWorldBackground2(int original) {
		return 0x0;
	}
}
