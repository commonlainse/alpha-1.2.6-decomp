/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class Recipe {
    private int b;
    private int c;
    private int[] d;
    private InventoryItem e;
    public final int a;

    public Recipe(int n2, int n3, int[] nArray, InventoryItem fp2) {
        this.a = fp2.id;
        this.b = n2;
        this.c = n3;
        this.d = nArray;
        this.e = fp2;
    }

    public boolean a(int[] nArray) {
        for (int i2 = 0; i2 <= 3 - this.b; ++i2) {
            for (int i3 = 0; i3 <= 3 - this.c; ++i3) {
                if (this.a(nArray, i2, i3, true)) {
                    return true;
                }
                if (!this.a(nArray, i2, i3, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(int[] nArray, int n2, int n3, boolean bl2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                int n4 = i2 - n2;
                int n5 = i3 - n3;
                int n6 = -1;
                if (n4 >= 0 && n5 >= 0 && n4 < this.b && n5 < this.c) {
                    n6 = bl2 ? this.d[this.b - n4 - 1 + n5 * this.b] : this.d[n4 + n5 * this.b];
                }
                if (nArray[i2 + i3 * 3] == n6) continue;
                return false;
            }
        }
        return true;
    }

    public InventoryItem b(int[] nArray) {
        return new InventoryItem(this.e.id, this.e.count);
    }

    public int a() {
        return this.b * this.c;
    }
}

