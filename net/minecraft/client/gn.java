/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.client.Minecraft;

public final class gn
extends WindowAdapter {
    final Minecraft a;
    final Thread b;

    public gn(Minecraft minecraft, Thread thread) {
        this.a = minecraft;
        this.b = thread;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.a.d();
        try {
            this.b.join();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.exit(0);
    }
}

