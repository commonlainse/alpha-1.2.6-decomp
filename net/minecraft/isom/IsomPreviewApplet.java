/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.isom;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Component;
import net.minecraft.client.ah;

public class IsomPreviewApplet
extends Applet {
    private ah a = new ah();

    public IsomPreviewApplet() {
        this.setLayout(new BorderLayout());
        this.add((Component)this.a, "Center");
    }

    @Override
    public void start() {
        this.a.b();
    }

    @Override
    public void stop() {
        this.a.c();
    }
}

