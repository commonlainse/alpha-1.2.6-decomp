/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class o {
    private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Object[][] b = new Object[][]{{ItemRegistry.aD, HeadBanger1337.ar, ItemRegistry.m, ItemRegistry.l, ItemRegistry.n}, {ItemRegistry.T, ItemRegistry.X, ItemRegistry.ab, ItemRegistry.af, ItemRegistry.aj}, {ItemRegistry.U, ItemRegistry.Y, ItemRegistry.ac, ItemRegistry.ag, ItemRegistry.ak}, {ItemRegistry.V, ItemRegistry.Z, ItemRegistry.ad, ItemRegistry.ah, ItemRegistry.al}, {ItemRegistry.W, ItemRegistry.aa, ItemRegistry.ae, ItemRegistry.ai, ItemRegistry.am}};

    public void a(RecipeRegistry en2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                ItemRegistry dx2 = (ItemRegistry)this.b[i3 + 1][i2];
                en2.a(new Item(dx2), this.a[i3], Character.valueOf('X'), object);
            }
        }
    }
}

