/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;

/* originally called gj */
public final class StandaloneClient
extends Minecraft {
    final Frame a;

    public StandaloneClient(Component component, Canvas canvas, MinecraftApplet minecraftApplet, int n2, int n3, boolean bl2, Frame frame) {
        super(component, canvas, minecraftApplet, n2, n3, bl2);
        this.a = frame;
    }

    public void a(hr hr2) {
        this.a.removeAll();
        this.a.add((Component)new av(hr2), "Center");
        this.a.validate();
    }
}

