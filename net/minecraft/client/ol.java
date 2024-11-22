/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class ol
extends cb {
    static private HeadBanger1337[] bb = new HeadBanger1337[]{HeadBanger1337.u, HeadBanger1337.v, HeadBanger1337.E, HeadBanger1337.F, HeadBanger1337.aS, HeadBanger1337.aU, HeadBanger1337.aW};

    public ol(int n2, int n3) {
        super(n2, 1, n3, bb);
    }

    @Override
    public boolean a(HeadBanger1337 nq2) {
        if (nq2 == HeadBanger1337.aS) {
            return true;
        }
        return nq2 == HeadBanger1337.aU;
    }
}

