/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class eg {
    private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] b = new Object[][]{{Block.x, Block.w, ItemRegistry.m, ItemRegistry.l, ItemRegistry.n}, {ItemRegistry.r, ItemRegistry.v, ItemRegistry.e, ItemRegistry.z, ItemRegistry.G}, {ItemRegistry.q, ItemRegistry.u, ItemRegistry.d, ItemRegistry.y, ItemRegistry.F}, {ItemRegistry.s, ItemRegistry.w, ItemRegistry.f, ItemRegistry.A, ItemRegistry.H}, {ItemRegistry.L, ItemRegistry.M, ItemRegistry.N, ItemRegistry.O, ItemRegistry.P}};

    public void a(RecipeRegistry en2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                ItemRegistry dx2 = (ItemRegistry)this.b[i3 + 1][i2];
                en2.a(new Item(dx2), this.a[i3], Character.valueOf('#'), ItemRegistry.B, Character.valueOf('X'), object);
            }
        }
    }
}

