/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client;
import org.lwjgl.opengl.GL11;

public class fb
extends aq {
    public void a(Snowball at2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        GL11.glEnable(32826);
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        int n2 = Item.aB.a((InventoryItem)null);
        this.a("/gui/items.png");
        is is2 = is.a;
        float f4 = (float)(n2 % 16 * 16 + 0) / 256.0f;
        float f5 = (float)(n2 % 16 * 16 + 16) / 256.0f;
        float f6 = (float)(n2 / 16 * 16 + 0) / 256.0f;
        float f7 = (float)(n2 / 16 * 16 + 16) / 256.0f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        GL11.glRotatef((float)(180.0f - this.b.i), 0.0f, 1.0f, 0.0f);
        GL11.glRotatef((float)(-this.b.j), 1.0f, 0.0f, 0.0f);
        is2.b();
        is2.b(0.0f, 1.0f, 0.0f);
        is2.a(0.0f - f9, 0.0f - f10, 0.0, f4, f7);
        is2.a(f8 - f9, 0.0f - f10, 0.0, f5, f7);
        is2.a(f8 - f9, 1.0f - f10, 0.0, f5, f6);
        is2.a(0.0f - f9, 1.0f - f10, 0.0, f4, f6);
        is2.a();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    @Override
    public void a(lw lw2, double d2, double d3, double d4, float f2, float f3) {
        this.a((Snowball)lw2, d2, d3, d4, f2, f3);
    }
}

