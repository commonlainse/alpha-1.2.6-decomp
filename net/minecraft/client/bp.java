/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class bp
extends nb {
    protected Minecraft b;
    public int c;
    public int d;
    protected List e = new ArrayList();
    public boolean f = false;
    protected ls g;
    private gh a = null;

    public void a(int n2, int n3, float f2) {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            gh gh2 = (gh)this.e.get(i2);
            gh2.a(this.b, n2, n3);
        }
    }

    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.b.a((bp)null);
            this.b.e();
        }
    }

    public static String c() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
                return string;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            for (int i2 = 0; i2 < this.e.size(); ++i2) {
                gh gh2 = (gh)this.e.get(i2);
                if (!gh2.c(this.b, n2, n3)) continue;
                this.a = gh2;
                this.b.A.a("random.click", 1.0f, 1.0f);
                this.a(gh2);
            }
        }
    }

    protected void b(int n2, int n3, int n4) {
        if (this.a != null && n4 == 0) {
            this.a.a(n2, n3);
            this.a = null;
        }
    }

    protected void a(gh gh2) {
    }

    public void a(Minecraft minecraft, int n2, int n3) {
        this.b = minecraft;
        this.g = minecraft.o;
        this.c = n2;
        this.d = n3;
        this.e.clear();
        this.a();
    }

    public void a() {
    }

    public void d() {
        while (Mouse.next()) {
            this.e();
        }
        while (Keyboard.next()) {
            this.f();
        }
    }

    public void e() {
        if (Mouse.getEventButtonState()) {
            int n2 = Mouse.getEventX() * this.c / this.b.c;
            int n3 = this.d - Mouse.getEventY() * this.d / this.b.d - 1;
            this.a(n2, n3, Mouse.getEventButton());
        } else {
            int n4 = Mouse.getEventX() * this.c / this.b.c;
            int n5 = this.d - Mouse.getEventY() * this.d / this.b.d - 1;
            this.b(n4, n5, Mouse.getEventButton());
        }
    }

    public void f() {
        if (Keyboard.getEventKeyState()) {
            if (Keyboard.getEventKey() == 87) {
                this.b.h();
                return;
            }
            this.a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
        this.a(0);
    }

    public void a(int n2) {
        if (this.b.e != null) {
            this.a(0, 0, this.c, this.d, -1072689136, -804253680);
        } else {
            this.b(n2);
        }
    }

    public void b(int n2) {
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        is is2 = is.a;
        GL11.glBindTexture(3553, (int)this.b.n.a("/gui/background.png"));
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        is2.b();
        is2.b(0x404040);
        is2.a(0.0, this.d, 0.0, 0.0, (float)this.d / f2 + (float)n2);
        is2.a(this.c, this.d, 0.0, (float)this.c / f2, (float)this.d / f2 + (float)n2);
        is2.a(this.c, 0.0, 0.0, (float)this.c / f2, 0 + n2);
        is2.a(0.0, 0.0, 0.0, 0.0, 0 + n2);
        is2.a();
    }

    public boolean b() {
        return true;
    }

    public void a(boolean bl2, int n2) {
    }
}

