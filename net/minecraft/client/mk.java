/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class mk
extends gm {
    public ka a;
    public ka b;
    public ka c;
    public ka d;
    public ka e;
    public ka f;
    public ka g;
    public ka h;

    public mk() {
        int n2 = 16;
        this.a = new ka(0, 0);
        this.a.a(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.a.a(0.0f, -1 + n2, -4.0f);
        this.g = new ka(14, 0);
        this.g.a(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.g.a(0.0f, -1 + n2, -4.0f);
        this.h = new ka(14, 4);
        this.h.a(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.h.a(0.0f, -1 + n2, -4.0f);
        this.b = new ka(0, 9);
        this.b.a(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.b.a(0.0f, 0 + n2, 0.0f);
        this.c = new ka(26, 0);
        this.c.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.c.a(-2.0f, 3 + n2, 1.0f);
        this.d = new ka(26, 0);
        this.d.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.d.a(1.0f, 3 + n2, 1.0f);
        this.e = new ka(24, 13);
        this.e.a(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.e.a(-4.0f, -3 + n2, 0.0f);
        this.f = new ka(24, 13);
        this.f.a(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.f.a(4.0f, -3 + n2, 0.0f);
    }

    @Override
    public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7);
        this.a.a(f7);
        this.g.a(f7);
        this.h.a(f7);
        this.b.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a.d = -(f6 / 57.295776f);
        this.a.e = f5 / 57.295776f;
        this.g.d = this.a.d;
        this.g.e = this.a.e;
        this.h.d = this.a.d;
        this.h.e = this.a.e;
        this.b.d = 1.5707964f;
        this.c.d = fi.b(f2 * 0.6662f) * 1.4f * f3;
        this.d.d = fi.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.e.f = f4;
        this.f.f = -f4;
    }
}

