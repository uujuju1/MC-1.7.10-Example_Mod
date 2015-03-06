package com.keller23.mc17.ExampleMod.gui;

import com.keller23.mc17.ExampleMod.lib.Constants;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiSmasher extends GuiScreen {

    private ResourceLocation bgImage = new ResourceLocation(Constants.ModID.toLowerCase() + ":" + "textures/client/gui/smasherGUI.png");

    private int x, y, z;
    private EntityPlayer player;
    private World world;
    private int xSize, ySize;

    public GuiSmasher(EntityPlayer player, World world, int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.player = player;
        this.world = world;
        xSize = 176;
        ySize = 214;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float renderPartialTicks) {
        this.mc.getTextureManager().bindTexture(bgImage);
        int x = (this.width - xSize) / 2;
        int y = (this.height - ySize) / 2;
        drawTexturedModalRect(x,y,0,0,xSize,ySize);
    }
}
