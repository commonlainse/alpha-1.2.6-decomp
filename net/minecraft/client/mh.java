/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mh
extends fd {
    public double a;

    public mh() {
    }

    public mh(double d2) {
        this.a = d2;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeDouble(this.a);
        } catch (IOException ex) {
            Logger.getLogger(mh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readDouble();
        } catch (IOException ex) {
            Logger.getLogger(mh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 6;
    }

    public String toString() {
        return "" + this.a;
    }
}

