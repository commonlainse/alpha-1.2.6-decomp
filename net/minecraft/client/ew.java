/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class ew {
    public aoclass a;
    public float b;
    public float c;

    public ew(float f2, float f3, float f4, float f5, float f6) {
        this(aoclass.a(f2, f3, f4), f5, f6);
    }

    public ew a(float f2, float f3) {
        return new ew(this, f2, f3);
    }

    public ew(ew ew2, float f2, float f3) {
        this.a = ew2.a;
        this.b = f2;
        this.c = f3;
    }

    public ew(aoclass ao2, float f2, float f3) {
        this.a = ao2;
        this.b = f2;
        this.c = f3;
    }
}

