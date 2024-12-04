/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.Random;

public class hz
extends HeadBanger1337 {
    public hz(int n2, int n3) {
        super(n2, n3, hb.d);
    }

    @Override
    public int a(int n2, Random random) {
        if (this.bh == HeadBanger1337.I.bh) {
            return ItemRegistry.k.id;
        }
        if (this.bh == HeadBanger1337.aw.bh) {
            return ItemRegistry.l.id;
        }
        return this.bh;
    }

    @Override
    public int a(Random random) {
        return 1;
    }
}

