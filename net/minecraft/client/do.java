/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

class _do
extends Canvas {
    private BufferedImage a;

    public _do() {
        try {
            this.a = ImageIO.read(CrashDialog.class.getResource("/gui/logo.png"));
        }
        catch (IOException iOException) {
            // empty catch block
        }
        int n2 = 100;
        this.setPreferredSize(new Dimension(n2, n2));
        this.setMinimumSize(new Dimension(n2, n2));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawImage(this.a, this.getWidth() / 2 - this.a.getWidth() / 2, 32, null);
    }
}

