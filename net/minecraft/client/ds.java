/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class ds {
    static private List a = new ArrayList();
    static private List b = new ArrayList();

    public static synchronized int a(int n2) {
        int n3 = GL11.glGenLists((int)n2);
        a.add(n3);
        a.add(n2);
        return n3;
    }

    public static synchronized void a(IntBuffer intBuffer) {
        GL11.glGenTextures((IntBuffer)intBuffer);
        for (int i2 = intBuffer.position(); i2 < intBuffer.limit(); ++i2) {
            b.add(intBuffer.get(i2));
        }
    }

    public static synchronized void a() {
        for (int i2 = 0; i2 < a.size(); i2 += 2) {
            GL11.glDeleteLists((int)((Integer)a.get(i2)), (int)((Integer)a.get(i2 + 1)));
        }
        IntBuffer intBuffer = ds.c(b.size());
        intBuffer.flip();
        GL11.glDeleteTextures((IntBuffer)intBuffer);
        for (int i3 = 0; i3 < b.size(); ++i3) {
            intBuffer.put((Integer)b.get(i3));
        }
        intBuffer.flip();
        GL11.glDeleteTextures((IntBuffer)intBuffer);
        a.clear();
        b.clear();
    }

    public static synchronized ByteBuffer b(int n2) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
        return byteBuffer;
    }

    public static IntBuffer c(int n2) {
        return ds.b(n2 << 2).asIntBuffer();
    }

    public static FloatBuffer d(int n2) {
        return ds.b(n2 << 2).asFloatBuffer();
    }
}

