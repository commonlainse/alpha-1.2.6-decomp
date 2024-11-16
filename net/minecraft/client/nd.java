/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
class nd {
    static final int[] a;

    static {
        a = new int[fw.values().length];
        try {
            nd.a[fw.linux.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            nd.a[fw.solaris.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            nd.a[fw.windows.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            nd.a[fw.macos.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

