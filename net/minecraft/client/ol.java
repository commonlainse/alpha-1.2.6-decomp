/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class ol
extends cb {
    static private nq[] bb = new nq[]{nq.u, nq.v, nq.E, nq.F, nq.aS, nq.aU, nq.aW};

    public ol(int n2, int n3) {
        super(n2, 1, n3, bb);
    }

    @Override
    public boolean a(nq nq2) {
        if (nq2 == nq.aS) {
            return true;
        }
        return nq2 == nq.aU;
    }
}

