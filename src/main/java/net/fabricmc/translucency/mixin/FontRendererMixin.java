package net.fabricmc.translucency.mixin;

import net.minecraft.src.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FontRenderer.class)
public class FontRendererMixin {

    @ModifyArg(method = "drawString(Ljava/lang/String;III)I", at = @At(value = "INVOKE", target = "Lnet/minecraft/src/FontRenderer;drawString(Ljava/lang/String;IIIZ)I"), index = 3)
    private int modifyColorArgument(int originalColor) {
        if (!TexturePackAPI.isDefaultTexturePack()) {
            // Modify the color argument to 0xFFFFFFFF
            return 0xFFFFFFFF;
        } else {
            return originalColor;
        }
    }
}
