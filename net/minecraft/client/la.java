/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class la
extends dx {
    private int a;

    public la(int n2, int n3) {
        super(n2);
        this.a = n3;
    }

    @Override
    public boolean a(fp fp2, eb eb2, cy cy2, int n2, int n3, int n4, int n5) {
        if (n5 != 1) {
            return false;
        }
        int n6 = cy2.a(n2, n3, n4);
        if (n6 == nq.aA.bh) {
            cy2.d(n2, n3 + 1, n4, this.a);
            --fp2.a;
            return true;
        }
        return false;
    }
}

