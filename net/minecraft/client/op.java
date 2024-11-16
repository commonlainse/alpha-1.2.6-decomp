/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class op
extends ak {
    public boolean a = false;

    public op(cy cy2) {
        super(cy2);
        this.z = "/mob/pig.png";
        this.a(0.9f, 0.9f);
        this.a = false;
    }

    @Override
    public void a(iq iq2) {
        super.a(iq2);
        iq2.a("Saddle", this.a);
    }

    @Override
    public void b(iq iq2) {
        super.b(iq2);
        this.a = iq2.m("Saddle");
    }

    @Override
    protected String d() {
        return "mob.pig";
    }

    @Override
    protected String f_() {
        return "mob.pig";
    }

    @Override
    protected String f() {
        return "mob.pigdeath";
    }

    @Override
    public boolean a(eb eb2) {
        if (this.a) {
            eb2.h(this);
            return true;
        }
        return false;
    }

    @Override
    protected int g_() {
        return dx.ao.aW;
    }
}

