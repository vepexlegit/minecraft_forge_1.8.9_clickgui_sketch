package de.vepexlegit.clickgui.clickgui;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class KeyInputHandler {

    private final GuiClick guiClick;

    public KeyInputHandler(GuiClick guiClick) {
        this.guiClick = guiClick;
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            if (!guiClick.isFocused()) {
                Minecraft.getMinecraft().displayGuiScreen(guiClick);
            }
        } else {
            if (guiClick.isFocused()) {
                Minecraft.getMinecraft().displayGuiScreen(null);
            }
        }
    }
}
