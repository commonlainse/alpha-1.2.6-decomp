/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class lk
extends dx {
    public lk(int n2) {
        super(n2);
        this.aX = 1;
        this.aY = 64;
    }

    @Override
    public void b(fp fp2, hf hf2) {
        if (hf2 instanceof op) {
            op op2 = (op)hf2;
            if (!op2.a) {
                op2.a = true;
                --fp2.a;
            }
        }
    }

    @Override
    public void a(fp fp2, hf hf2) {
        this.b(fp2, hf2);
    }
}

