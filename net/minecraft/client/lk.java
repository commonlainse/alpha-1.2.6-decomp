/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class lk
extends ItemRegistry {
    public lk(int n2) {
        super(n2);
        this.aX = 1;
        this.aY = 64;
    }

    @Override
    public void b(Item fp2, Mob hf2) {
        if (hf2 instanceof Pig) {
            Pig op2 = (Pig)hf2;
            if (!op2.a) {
                op2.a = true;
                --fp2.count;
            }
        }
    }

    @Override
    public void a(Item fp2, Mob hf2) {
        this.b(fp2, hf2);
    }
}

