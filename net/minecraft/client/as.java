/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class as
extends ak {
    public boolean a = false;

    public as(cy cy2) {
        super(cy2);
        this.z = "/mob/cow.png";
        this.a(0.9f, 1.3f);
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
    protected String d() {
        return "mob.cow";
    }

    @Override
    protected String f_() {
        return "mob.cowhurt";
    }

    @Override
    protected String f() {
        return "mob.cowhurt";
    }

    @Override
    protected float h() {
        return 0.4f;
    }

    @Override
    protected int g_() {
        return dx.aD.aW;
    }

    @Override
    public boolean a(eb eb2) {
        fp fp2 = eb2.e.a();
        if (fp2 != null && fp2.c == dx.au.aW) {
            eb2.e.a(eb2.e.d, new fp(dx.aE));
            return true;
        }
        return false;
    }
}

