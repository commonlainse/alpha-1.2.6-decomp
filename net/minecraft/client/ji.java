/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.HashMap;
import java.util.Map;

public class ji {
    static private Map a = new HashMap();
    static private Map b = new HashMap();
    public cy e;
    public int f;
    public int g;
    public int h;

    private static void a(Class clazz, String string) {
        if (b.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        a.put(string, clazz);
        b.put(clazz, string);
    }

    public void a(iq iq2) {
        this.f = iq2.e("x");
        this.g = iq2.e("y");
        this.h = iq2.e("z");
    }

    public void b(iq iq2) {
        String string = (String)b.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        iq2.a("id", string);
        iq2.a("x", this.f);
        iq2.a("y", this.g);
        iq2.a("z", this.h);
    }

    public void b() {
    }

    public static ji c(iq iq2) {
        ji ji2 = null;
        try {
            Class clazz = (Class)a.get(iq2.i("id"));
            if (clazz != null) {
                ji2 = (ji)clazz.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (ji2 != null) {
            ji2.a(iq2);
        } else {
            System.out.println("Skipping TileEntity with id " + iq2.i("id"));
        }
        return ji2;
    }

    public int f() {
        return this.e.e(this.f, this.g, this.h);
    }

    public void h() {
        this.e.b(this.f, this.g, this.h, this);
    }

    public double a(double d2, double d3, double d4) {
        double d5 = (double)this.f + 0.5 - d2;
        double d6 = (double)this.g + 0.5 - d3;
        double d7 = (double)this.h + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public nq g() {
        return nq.m[this.e.a(this.f, this.g, this.h)];
    }

    static {
        ji.a(lt.class, "Furnace");
        ji.a(ga.class, "Chest");
        ji.a(qc.class, "Sign");
        ji.a(bl.class, "MobSpawner");
    }
}

