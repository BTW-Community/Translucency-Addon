package net.fabricmc.translucency.mixin;

import net.minecraft.src.Gui;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiReturnMixin {

    @Inject(method = "drawTexturedModalRect", at = @At("RETURN"), cancellable = true)
    void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6, CallbackInfo info) {
        // Code to be injected at the end of drawTexturedModalRect

        //GL11.glEnable(GL11.GL_LIGHTING); //Breaks all rendering!
        GL11.glDisable(GL11.GL_BLEND);

        //GL11.glDepthMask(true);
        //GL11.glEnable(GL11.GL_DEPTH_TEST);
        //GL11.glDisable(GL11.GL_ALPHA_TEST); //Breaks text rendering
    }
}