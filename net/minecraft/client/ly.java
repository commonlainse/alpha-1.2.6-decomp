/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ly
extends fd {
    private List a = new ArrayList();
    private byte b;

    @Override
    void a(DataOutput dataOutput) {
        try {
            this.b = this.a.size() > 0 ? ((fd)this.a.get(0)).a() : (byte)1;
            dataOutput.writeByte(this.b);
            dataOutput.writeInt(this.a.size());
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                ((fd)this.a.get(i2)).a(dataOutput);
            }
        } catch (IOException ex) {
            Logger.getLogger(ly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void a(DataInput dataInput) {
        try {
            this.b = dataInput.readByte();
            int n2 = dataInput.readInt();
            this.a = new ArrayList();
            for (int i2 = 0; i2 < n2; ++i2) {
                fd fd2 = fd.a(this.b);
                fd2.a(dataInput);
                this.a.add(fd2);
            }
        } catch (IOException ex) {
            Logger.getLogger(ly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public byte a() {
        return 9;
    }

    public String toString() {
        return "" + this.a.size() + " entries of type " + fd.b(this.b);
    }

    public void a(fd fd2) {
        this.b = fd2.a();
        this.a.add(fd2);
    }

    public fd a(int n2) {
        return (fd)this.a.get(n2);
    }

    public int c() {
        return this.a.size();
    }
}

