/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client;
import org.lwjgl.opengl.GL11;

public class dy
extends aq {
    private bk a = new bk();

    public dy() {
        this.c = 0.5f;
    }

    public void a(gb gb2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        this.a("/terrain.png");
        nq nq2 = nq.m[gb2.a];
        cy cy2 = gb2.k();
        GL11.glDisable(2896);
        this.a.a(nq2, cy2, fi.b(gb2.aw), fi.b(gb2.ax), fi.b(gb2.ay));
        GL11.glEnable(2896);
        GL11.glPopMatrix();
    }

    @Override
    public void a(lw lw2, double d2, double d3, double d4, float f2, float f3) {
        this.a((gb)lw2, d2, d3, d4, f2, f3);
    }
}

