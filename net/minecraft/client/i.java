/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public class i
extends Minecraft {
    final MinecraftApplet a;

    public i(MinecraftApplet minecraftApplet, Component component, Canvas canvas, MinecraftApplet minecraftApplet2, int n2, int n3, boolean bl2) {
        super(component, canvas, minecraftApplet2, n2, n3, bl2);
        this.a = minecraftApplet;
    }

    @Override
    public void a(hr hr2) {
        this.a.removeAll();
        this.a.setLayout(new BorderLayout());
        this.a.add((Component)new av(hr2), "Center");
        this.a.validate();
    }
}

