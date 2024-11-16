/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jy
extends fd {
    public int a;

    public jy() {
    }

    public jy(int n2) {
        this.a = n2;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeInt(this.a);
        } catch (IOException ex) {
            Logger.getLogger(jy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readInt();
        } catch (IOException ex) {
            Logger.getLogger(jy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 3;
    }

    public String toString() {
        return "" + this.a;
    }
}

