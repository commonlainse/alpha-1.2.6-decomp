/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class io
extends gk {
    public int a;
    public int b;

    @Override
    public int a() {
        return 8;
    }

    @Override
    public void a(DataInputStream dataInputStream) {
        try {
            this.a = dataInputStream.readInt();
            this.b = dataInputStream.readInt();
        } catch (IOException ex) {
            Logger.getLogger(io.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void a(DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.b);
        } catch (IOException ex) {
            Logger.getLogger(io.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void a(mo mo2) {
        mo2.a(this);
    }
}

