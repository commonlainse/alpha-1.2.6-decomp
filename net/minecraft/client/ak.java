/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public abstract class ak
extends fc {
    public ak(cy cy2) {
        super(cy2);
    }

    @Override
    protected float a(int n2, int n3, int n4) {
        if (this.as.a(n2, n3 - 1, n4) == nq.u.bh) {
            return 10.0f;
        }
        return this.as.c(n2, n3, n4) - 0.5f;
    }

    @Override
    public void a(iq iq2) {
        super.a(iq2);
    }

    @Override
    public void b(iq iq2) {
        super.b(iq2);
    }

    @Override
    public boolean a() {
        int n2;
        int n3;
        int n4 = fi.b(this.aw);
        return this.as.a(n4, (n3 = fi.b(this.aG.b)) - 1, n2 = fi.b(this.ay)) == nq.u.bh && this.as.j(n4, n3, n2) > 8 && super.a();
    }

    @Override
    public int b() {
        return 120;
    }
}

