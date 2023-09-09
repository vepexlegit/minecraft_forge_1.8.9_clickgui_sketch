package de.vepexlegit.clickgui.clickgui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ChatComponentText;

public class GuiClick extends GuiScreen {
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 20;
    private static final int BUTTON_MARGIN = 10;
    private static final int GUI_WIDTH = 300;
    private static final int GUI_HEIGHT = 200;

    @Override
    public void initGui() {
        int buttonX = (width - BUTTON_WIDTH) / 2;
        int buttonY = (height - BUTTON_HEIGHT) / 2;

        buttonList.add(new GuiButton(0, buttonX, buttonY, BUTTON_WIDTH, BUTTON_HEIGHT, "Button 1"));
        buttonList.add(new GuiButton(1, buttonX, buttonY + BUTTON_HEIGHT + BUTTON_MARGIN, BUTTON_WIDTH, BUTTON_HEIGHT, "Button 2"));
        buttonList.add(new GuiButton(2, buttonX, buttonY + 2 * (BUTTON_HEIGHT + BUTTON_MARGIN), BUTTON_WIDTH, BUTTON_HEIGHT, "Button 3"));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawRect(0, 0, width, height, 0x80000000);
        drawRect((width - GUI_WIDTH) / 2, (height - GUI_HEIGHT) / 2, (width + GUI_WIDTH) / 2, (height + GUI_HEIGHT) / 2, 0xFF333333); // Цвет рамки

        String title = "My Custom GUI";
        int titleWidth = fontRendererObj.getStringWidth(title);
        int titleX = (width - titleWidth) / 2;
        int titleY = (height - GUI_HEIGHT) / 2 + 10;
        fontRendererObj.drawString(title, titleX, titleY, 0xFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            mc.thePlayer.addChatMessage(new ChatComponentText("Button 1"));
        } else if (button.id == 1) {
            mc.thePlayer.addChatMessage(new ChatComponentText("Button 2"));
        } else if (button.id == 2) {
            mc.thePlayer.addChatMessage(new ChatComponentText("Button 3"));
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }

    public boolean isFocused() {
        return false;
    }
}
