/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class j
extends Canvas {
    final MinecraftApplet a;

    public j(MinecraftApplet minecraftApplet) {
        this.a = minecraftApplet;
    }

    @Override
    public synchronized void addNotify() {
        super.addNotify();
        this.a.a();
    }

    @Override
    public synchronized void removeNotify() {
        this.a.b();
        super.removeNotify();
    }
}

