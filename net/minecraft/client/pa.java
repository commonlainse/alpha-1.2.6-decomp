/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class pa {
    private String[][] a = new String[][]{{"X", "X", "#"}};
    private Object[][] b = new Object[][]{{HeadBanger1337.x, HeadBanger1337.w, ItemRegistry.m, ItemRegistry.l, ItemRegistry.n}, {ItemRegistry.p, ItemRegistry.t, ItemRegistry.o, ItemRegistry.x, ItemRegistry.E}};

    public void a(RecipeRegistry en2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                ItemRegistry dx2 = (ItemRegistry)this.b[i3 + 1][i2];
                en2.a(new Item(dx2), this.a[i3], Character.valueOf('#'), ItemRegistry.B, Character.valueOf('X'), object);
            }
        }
        en2.a(new Item(ItemRegistry.i, 1), " #X", "# X", " #X", Character.valueOf('X'), ItemRegistry.I, Character.valueOf('#'), ItemRegistry.B);
        en2.a(new Item(ItemRegistry.j, 4), "X", "#", "Y", Character.valueOf('Y'), ItemRegistry.J, Character.valueOf('X'), ItemRegistry.an, Character.valueOf('#'), ItemRegistry.B);
    }
}

