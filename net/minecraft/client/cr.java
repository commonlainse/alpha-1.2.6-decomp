/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cr
extends fa {
    public cr() {
        this.i = true;
        this.h = true;
    }

    public cr(double d2, double d3, double d4, double d5, float f2, float f3, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.d = d4;
        this.c = d5;
        this.e = f2;
        this.f = f3;
        this.g = bl2;
        this.i = true;
        this.h = true;
    }

    @Override
    public void a(DataInputStream dataInputStream) {
        try {
            this.a = dataInputStream.readDouble();
            this.b = dataInputStream.readDouble();
            this.d = dataInputStream.readDouble();
            this.c = dataInputStream.readDouble();
            this.e = dataInputStream.readFloat();
            this.f = dataInputStream.readFloat();
            super.a(dataInputStream);
        } catch (IOException ex) {
            Logger.getLogger(cr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void a(DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.writeDouble(this.a);
            dataOutputStream.writeDouble(this.b);
            dataOutputStream.writeDouble(this.d);
            dataOutputStream.writeDouble(this.c);
            dataOutputStream.writeFloat(this.e);
            dataOutputStream.writeFloat(this.f);
            super.a(dataOutputStream);
        } catch (IOException ex) {
            Logger.getLogger(cr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int a() {
        return 41;
    }
}

