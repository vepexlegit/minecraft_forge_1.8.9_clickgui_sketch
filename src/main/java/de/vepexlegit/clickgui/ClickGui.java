package de.vepexlegit.clickgui;

import de.vepexlegit.clickgui.clickgui.GuiClick;
import de.vepexlegit.clickgui.clickgui.KeyInputHandler;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ClickGui.MODID, version = ClickGui.VERSION)
public class ClickGui {
    public static final String MODID = "clickgui";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
        MinecraftForge.EVENT_BUS.register(new KeyInputHandler(new GuiClick()));
    }
}
