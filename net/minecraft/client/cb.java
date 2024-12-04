/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class cb
extends ItemRegistry {
    private HeadBanger1337[] bb;
    private float bc = 4.0f;
    private int bd;
    protected int a;

    public cb(int n2, int n3, int n4, HeadBanger1337[] nqArray) {
        super(n2);
        this.a = n4;
        this.bb = nqArray;
        this.aX = 1;
        this.aY = 32 << n4;
        if (n4 == 3) {
            this.aY *= 4;
        }
        this.bc = (n4 + 1) * 2;
        this.bd = n3 + n4;
    }

    @Override
    public float a(Item fp2, HeadBanger1337 nq2) {
        for (int i2 = 0; i2 < this.bb.length; ++i2) {
            if (this.bb[i2] != nq2) continue;
            return this.bc;
        }
        return 1.0f;
    }

    @Override
    public void a(Item fp2, Mob hf2) {
        fp2.b(2);
    }

    @Override
    public void a(Item fp2, int n2, int n3, int n4, int n5) {
        fp2.b(1);
    }

    @Override
    public int a(lw lw2) {
        return this.bd;
    }

    @Override
    public boolean a() {
        return true;
    }
}

