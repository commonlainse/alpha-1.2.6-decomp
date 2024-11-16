/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ep
extends fd {
    public byte[] a;

    public ep() {
    }

    public ep(byte[] byArray) {
        this.a = byArray;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeInt(this.a.length);
            dataOutput.write(this.a);
        } catch (IOException ex) {
            Logger.getLogger(ep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            int n2 = dataInput.readInt();
            this.a = new byte[n2];
            dataInput.readFully(this.a);
        } catch (IOException ex) {
            Logger.getLogger(ep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 7;
    }

    public String toString() {
        return "[" + this.a.length + " bytes]";
    }
}

