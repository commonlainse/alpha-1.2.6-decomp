/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pb
extends fd {
    public String a;

    public pb() {
    }

    public pb(String string) {
        this.a = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void a(DataOutput dataOutput) {
        try {
            dataOutput.writeUTF(this.a);
        } catch (IOException ex) {
            Logger.getLogger(pb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.a = dataInput.readUTF();
        } catch (IOException ex) {
            Logger.getLogger(pb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 8;
    }

    public String toString() {
        return "" + this.a;
    }
}

