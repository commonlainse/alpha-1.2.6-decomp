/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
public class go {
    public static final int[] a;

    static {
        // notch i fucking hate you for this code
        a = new int[jp.values().length];
        try {
            go.a[jp.linux.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            go.a[jp.solaris.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            go.a[jp.windows.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            go.a[jp.macos.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

