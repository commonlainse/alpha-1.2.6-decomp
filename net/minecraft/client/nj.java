/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class nj
extends fd {
    public short a;

    public nj() {
    }

    public nj(short s2) {
        this.a = s2;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeShort(this.a);
        } catch (IOException ex) {
            Logger.getLogger(nj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readShort();
        } catch (IOException ex) {
            Logger.getLogger(nj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 2;
    }

    public String toString() {
        return "" + this.a;
    }
}

