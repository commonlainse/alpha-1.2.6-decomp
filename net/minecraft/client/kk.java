/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class kk
extends fd {
    public byte a;

    public kk() {
    }

    public kk(byte by2) {
        this.a = by2;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeByte(this.a);
        } catch (IOException ex) {
            Logger.getLogger(kk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readByte();
        } catch (IOException ex) {
            Logger.getLogger(kk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 1;
    }

    public String toString() {
        return "" + this.a;
    }
}

