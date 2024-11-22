/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class Cow
extends Creature {
    public boolean a = false;

    public Cow(Session cy2) {
        super(cy2);
        this.z = "/mob/cow.png";
        this.a(0.9f, 1.3f);
    }

    @Override
    public void a(NBTCompoundTag iq2) {
        super.a(iq2);
    }

    @Override
    public void b(NBTCompoundTag iq2) {
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
    protected String soundOnDeath() {
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
    public boolean a(Player eb2) {
        Item fp2 = eb2.e.a();
        if (fp2 != null && fp2.id == dx.au.aW) {
            eb2.e.a(eb2.e.d, new Item(dx.aE));
            return true;
        }
        return false;
    }
}

