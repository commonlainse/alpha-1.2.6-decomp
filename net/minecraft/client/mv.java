/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class mv {
    private Object[][] a = new Object[][]{{HeadBanger1337.ah, dx.n}, {HeadBanger1337.ai, dx.m}, {HeadBanger1337.ax, dx.l}};

    public void a(RecipeRegistry en2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            HeadBanger1337 nq2 = (HeadBanger1337)this.a[i2][0];
            dx dx2 = (dx)this.a[i2][1];
            en2.a(new Item(nq2), "###", "###", "###", Character.valueOf('#'), dx2);
            en2.a(new Item(dx2, 9), "#", Character.valueOf('#'), nq2);
        }
    }
}

