/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ek
extends gk {
    public long a;

    @Override
    public void a(DataInputStream dataInputStream) {
        try {
            this.a = dataInputStream.readLong();
        } catch (IOException ex) {
            Logger.getLogger(ek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void a(DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.writeLong(this.a);
        } catch (IOException ex) {
            Logger.getLogger(ek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void a(mo mo2) {
        mo2.a(this);
    }

    @Override
    public int a() {
        return 8;
    }
}
