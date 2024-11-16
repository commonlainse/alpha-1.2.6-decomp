/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class hp
extends ec {
    public hp(gm gm2, gm gm3, float f2) {
        super(gm2, f2);
        this.a(gm3);
    }

    protected boolean a(op op2, int n2) {
        this.a("/mob/saddle.png");
        return n2 == 0 && op2.a;
    }

    @Override
    protected boolean a(hf hf2, int n2) {
        return this.a((op)hf2, n2);
    }
}

