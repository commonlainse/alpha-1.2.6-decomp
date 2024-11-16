/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class fk
extends ec {
    public fk(gm gm2, float f2) {
        super(gm2, f2);
    }

    public void a(ou ou2, double d2, double d3, double d4, float f2, float f3) {
        super.a(ou2, d2, d3, d4, f2, f3);
    }

    protected float a(ou ou2, float f2) {
        float f3 = ou2.e + (ou2.b - ou2.e) * f2;
        float f4 = ou2.d + (ou2.c - ou2.d) * f2;
        return (fi.a(f3) + 1.0f) * f4;
    }

    @Override
    protected float d(hf hf2, float f2) {
        return this.a((ou)hf2, f2);
    }

    @Override
    public void a(hf hf2, double d2, double d3, double d4, float f2, float f3) {
        this.a((ou)hf2, d2, d3, d4, f2, f3);
    }

    @Override
    public void a(lw lw2, double d2, double d3, double d4, float f2, float f3) {
        this.a((ou)lw2, d2, d3, d4, f2, f3);
    }
}

