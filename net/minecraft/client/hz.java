/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.Random;

public class hz
extends nq {
    public hz(int n2, int n3) {
        super(n2, n3, hb.d);
    }

    @Override
    public int a(int n2, Random random) {
        if (this.bh == nq.I.bh) {
            return dx.k.aW;
        }
        if (this.bh == nq.aw.bh) {
            return dx.l.aW;
        }
        return this.bh;
    }

    @Override
    public int a(Random random) {
        return 1;
    }
}

