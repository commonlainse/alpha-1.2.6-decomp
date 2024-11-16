/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ab {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static iq a(InputStream inputStream) throws IOException {
        try (DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(inputStream));){
            return ab.a((DataInput)dataInputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(iq iq2, OutputStream outputStream) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(outputStream));){
            ab.a(iq2, (DataOutput)dataOutputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static iq a(byte[] byArray) throws IOException {
        try (DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray)));){
            iq iq2 = ab.a((DataInput)dataInputStream);
            return iq2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(iq iq2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream));){
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static iq a(DataInput dataInput) throws IOException {
        fd fd2 = fd.b(dataInput);
        if (fd2 instanceof iq) {
            return (iq)fd2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(iq iq2, DataOutput dataOutput) throws IOException {
        fd.a(iq2, dataOutput);
    }
}

