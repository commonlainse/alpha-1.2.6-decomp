/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public final class Item {
    public int count = 0;
    public int probablyCooldown;
    public int id;
    public int damage;

    public Item(HeadBanger1337 nq2) {
        this(nq2, 1);
    }

    public Item(HeadBanger1337 nq2, int n2) {
        this(nq2.bh, n2);
    }

    public Item(dx dx2) {
        this(dx2, 1);
    }

    public Item(dx dx2, int n2) {
        this(dx2.aW, n2);
    }

    public Item(int n2) {
        this(n2, 1);
    }

    public Item(int n2, int n3) {
        this.id = n2;
        this.count = n3;
    }

    public Item(int n2, int n3, int n4) {
        this.id = n2;
        this.count = n3;
        this.damage = n4;
    }

    public Item(NBTCompoundTag iq2) {
        this.b(iq2);
    }

    public Item a(int n2) {
        this.count -= n2;
        return new Item(this.id, n2, this.damage);
    }

    public dx a() {
        return dx.c[this.id];
    }

    public int b() {
        return this.a().a(this);
    }

    public boolean a(Player eb2, Session cy2, int n2, int n3, int n4, int n5) {
        return this.a().a(this, eb2, cy2, n2, n3, n4, n5);
    }

    public float a(HeadBanger1337 nq2) {
        return this.a().a(this, nq2);
    }

    public Item a(Session cy2, Player eb2) {
        return this.a().a(this, cy2, eb2);
    }

    public NBTCompoundTag a(NBTCompoundTag iq2) {
        iq2.storeShort("id", (short)this.id);
        iq2.storeByte("Count", (byte)this.count);
        iq2.storeShort("Damage", (short)this.damage);
        return iq2;
    }

    public void b(NBTCompoundTag iq2) {
        this.id = iq2.getShort("id");
        this.count = iq2.getByte("Count");
        this.damage = iq2.getShort("Damage");
    }

    public int c() {
        return this.a().c();
    }

    public int d() {
        return dx.c[this.id].d();
    }

    public void b(int n2) {
        this.damage += n2;
        if (this.damage > this.d()) {
            --this.count;
            if (this.count < 0) {
                this.count = 0;
            }
            this.damage = 0;
        }
    }

    public void a(Mob hf2) {
        dx.c[this.id].a(this, hf2);
    }

    public void a(int n2, int n3, int n4, int n5) {
        dx.c[this.id].a(this, n2, n3, n4, n5);
    }

    public int a(lw lw2) {
        return dx.c[this.id].a(lw2);
    }

    public boolean b(HeadBanger1337 nq2) {
        return dx.c[this.id].a(nq2);
    }

    public void a(Player eb2) {
    }

    public void b(Mob hf2) {
        dx.c[this.id].b(this, hf2);
    }

    public Item e() {
        return new Item(this.id, this.count, this.damage);
    }
}

