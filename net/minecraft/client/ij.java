/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class ij
extends gm {
    public ka d = new ka(0, 0);
    public ka e;
    public ka f;
    public ka g;
    public ka h;
    public ka i;

    public ij(int n2, float f2) {
        this.d.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f2);
        this.d.a(0.0f, 18 - n2, -6.0f);
        this.e = new ka(28, 8);
        this.e.a(-5.0f, -10.0f, -7.0f, 10, 16, 8, f2);
        this.e.a(0.0f, 17 - n2, 2.0f);
        this.f = new ka(0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.f.a(-3.0f, 24 - n2, 7.0f);
        this.g = new ka(0, 16);
        this.g.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.g.a(3.0f, 24 - n2, 7.0f);
        this.h = new ka(0, 16);
        this.h.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.h.a(-3.0f, 24 - n2, -5.0f);
        this.i = new ka(0, 16);
        this.i.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.i.a(3.0f, 24 - n2, -5.0f);
    }

    @Override
    public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
        this.g.a(f7);
        this.h.a(f7);
        this.i.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.d.d = -(f6 / 57.295776f);
        this.d.e = f5 / 57.295776f;
        this.e.d = 1.5707964f;
        this.f.d = TrigLookup.b(f2 * 0.6662f) * 1.4f * f3;
        this.g.d = TrigLookup.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.h.d = TrigLookup.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.i.d = TrigLookup.b(f2 * 0.6662f) * 1.4f * f3;
    }
}

