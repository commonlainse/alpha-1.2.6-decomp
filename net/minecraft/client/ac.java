/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class ac
extends cb {
    static private HeadBanger1337[] bb = new HeadBanger1337[]{HeadBanger1337.w, HeadBanger1337.aj, HeadBanger1337.ak, HeadBanger1337.t, HeadBanger1337.ao, HeadBanger1337.H, HeadBanger1337.ai, HeadBanger1337.I, HeadBanger1337.ah, HeadBanger1337.G, HeadBanger1337.aw, HeadBanger1337.ax, HeadBanger1337.aT, HeadBanger1337.bb};
    private int bc;

    public ac(int n2, int n3) {
        super(n2, 2, n3, bb);
        this.bc = n3;
    }

    @Override
    public boolean a(HeadBanger1337 nq2) {
        if (nq2 == HeadBanger1337.ap) {
            return this.bc == 3;
        }
        if (nq2 == HeadBanger1337.ax || nq2 == HeadBanger1337.aw) {
            return this.bc >= 2;
        }
        if (nq2 == HeadBanger1337.ah || nq2 == HeadBanger1337.G) {
            return this.bc >= 2;
        }
        if (nq2 == HeadBanger1337.ai || nq2 == HeadBanger1337.H) {
            return this.bc >= 1;
        }
        if (nq2 == HeadBanger1337.aN || nq2 == HeadBanger1337.aO) {
            return this.bc >= 2;
        }
        if (nq2.bs == hb.d) {
            return true;
        }
        return nq2.bs == hb.e;
    }
}

