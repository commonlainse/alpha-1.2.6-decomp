/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hq
extends fd {
    public long a;

    public hq() {
    }

    public hq(long l2) {
        this.a = l2;
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeLong(this.a);
        } catch (IOException ex) {
            Logger.getLogger(hq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readLong();
        } catch (IOException ex) {
            Logger.getLogger(hq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 4;
    }

    public String toString() {
        return "" + this.a;
    }
}

