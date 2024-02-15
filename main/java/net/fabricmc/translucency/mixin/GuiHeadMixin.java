package net.fabricmc.translucency.mixin;

import net.minecraft.src.Gui;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiHeadMixin {

    @Inject(method = "drawTexturedModalRect", at = @At("HEAD"), cancellable = true)
    void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6, CallbackInfo info) {
        // Code to be injected at the beginning of drawTexturedModalRect
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
    }
}