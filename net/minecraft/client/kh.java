/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class kh
extends bp {
    private int a = 0;

    @Override
    public void g() {
        ++this.a;
    }

    @Override
    public void a() {
        this.e.clear();
        this.e.add(new gh(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Back to title screen"));
    }

    @Override
    protected void a(gh gh2) {
        if (!gh2.g) {
            return;
        }
        if (gh2.f == 0) {
            this.b.a(new dj());
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.i();
        this.a(this.g, "Level save conflict", this.c / 2, this.d / 4 - 60 + 20, 0xFFFFFF);
        this.b(this.g, "Minecraft detected a conflict in the level save data.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 0, 0xA0A0A0);
        this.b(this.g, "This could be caused by two copies of the game", this.c / 2 - 140, this.d / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.b(this.g, "accessing the same level.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.b(this.g, "To prevent level corruption, the current game has quit.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 45, 0xA0A0A0);
        super.a(n2, n3, f2);
    }
}

