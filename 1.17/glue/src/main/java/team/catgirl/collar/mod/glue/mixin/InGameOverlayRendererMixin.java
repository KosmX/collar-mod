package team.catgirl.collar.mod.glue.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import team.catgirl.plastic.Plastic;
import team.catgirl.collar.mod.glue.render.RenderOverlaysEvent;

@Mixin(InGameOverlayRenderer.class)
public class InGameOverlayRendererMixin {

    @Inject(method = "renderOverlays", at = @At("HEAD"))
    private static void renderOverlays(MinecraftClient minecraftClient, MatrixStack matrixStack, CallbackInfo callbackInfo) {
//        Plastic.getPlastic().onRenderOverlays();
        Plastic.getPlastic().eventBus.dispatch(new RenderOverlaysEvent(matrixStack, minecraftClient.getTickDelta()));
    }
}
