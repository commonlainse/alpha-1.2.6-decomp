/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class oq
implements hi {
    private Item[] a = new Item[1];

    @Override
    public int c() {
        return 1;
    }

    @Override
    public Item c(int n2) {
        return this.a[n2];
    }

    @Override
    public String d() {
        return "Result";
    }

    @Override
    public Item a(int n2, int n3) {
        if (this.a[n2] != null) {
            Item fp2 = this.a[n2];
            this.a[n2] = null;
            return fp2;
        }
        return null;
    }

    @Override
    public void a(int n2, Item fp2) {
        this.a[n2] = fp2;
    }

    @Override
    public int o_() {
        return 64;
    }

    @Override
    public void h() {
    }
}

