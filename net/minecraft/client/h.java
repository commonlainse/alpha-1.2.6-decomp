/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class h
extends fd {
    public float a;

    public h() {
    }

    public h(float f2) {
        this.a = f2;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeFloat(this.a);
        } catch (IOException ex) {
            Logger.getLogger(h.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readFloat();
        } catch (IOException ex) {
            Logger.getLogger(h.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 5;
    }

    public String toString() {
        return "" + this.a;
    }
}

