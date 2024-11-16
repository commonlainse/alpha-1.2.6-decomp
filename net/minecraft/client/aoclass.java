/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.ArrayList;
import java.util.List;

public class aoclass {
    static private List d = new ArrayList();
    static private int e = 0;
    public double a;
    public double b;
    public double c;

    public static aoclass a(double d2, double d3, double d4) {
        return new aoclass(d2, d3, d4);
    }

    public static void a() {
        e = 0;
    }

    public static aoclass b(double d2, double d3, double d4) {
        if (e >= d.size()) {
            d.add(aoclass.a(0.0, 0.0, 0.0));
        }
        return ((aoclass)d.get(e++)).e(d2, d3, d4);
    }

    private aoclass(double d2, double d3, double d4) {
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        if (d4 == -0.0) {
            d4 = 0.0;
        }
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }

    private aoclass e(double d2, double d3, double d4) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        return this;
    }

    public aoclass a(aoclass ao2) {
        return ao2.b(ao2.a - this.a, ao2.b - this.b, ao2.c - this.c);
    }

    public aoclass b() {
        double d2 = fi.a(this.a * this.a + this.b * this.b + this.c * this.c);
        if (d2 < 1.0E-4) {
            return aoclass.b(0.0, 0.0, 0.0);
        }
        return aoclass.b(this.a / d2, this.b / d2, this.c / d2);
    }

    public aoclass b(aoclass ao2) {
        return ao2.b(this.b * ao2.c - this.c * ao2.b, this.c * ao2.a - this.a * ao2.c, this.a * ao2.b - this.b * ao2.a);
    }

    public aoclass c(double d2, double d3, double d4) {
        return aoclass.b(this.a + d2, this.b + d3, this.c + d4);
    }

    public double c(aoclass ao2) {
        double d2 = ao2.a - this.a;
        double d3 = ao2.b - this.b;
        double d4 = ao2.c - this.c;
        return fi.a(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double d(aoclass ao2) {
        double d2 = ao2.a - this.a;
        double d3 = ao2.b - this.b;
        double d4 = ao2.c - this.c;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public double d(double d2, double d3, double d4) {
        double d5 = d2 - this.a;
        double d6 = d3 - this.b;
        double d7 = d4 - this.c;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double c() {
        return fi.a(this.a * this.a + this.b * this.b + this.c * this.c);
    }

    public aoclass a(aoclass ao2, double d2) {
        double d3 = ao2.a - this.a;
        double d4 = ao2.b - this.b;
        double d5 = ao2.c - this.c;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.a) / d3;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return ao2.b(this.a + d3 * d6, this.b + d4 * d6, this.c + d5 * d6);
    }

    public aoclass b(aoclass ao2, double d2) {
        double d3 = ao2.a - this.a;
        double d4 = ao2.b - this.b;
        double d5 = ao2.c - this.c;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.b) / d4;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return ao2.b(this.a + d3 * d6, this.b + d4 * d6, this.c + d5 * d6);
    }

    public aoclass c(aoclass ao2, double d2) {
        double d3 = ao2.a - this.a;
        double d4 = ao2.b - this.b;
        double d5 = ao2.c - this.c;
        if (d5 * d5 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.c) / d5;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return ao2.b(this.a + d3 * d6, this.b + d4 * d6, this.c + d5 * d6);
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }

    public void a(float f2) {
        float f3 = fi.b(f2);
        float f4 = fi.a(f2);
        double d2 = this.a;
        double d3 = this.b * (double)f3 + this.c * (double)f4;
        double d4 = this.c * (double)f3 - this.b * (double)f4;
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }

    public void b(float f2) {
        float f3 = fi.b(f2);
        float f4 = fi.a(f2);
        double d2 = this.a * (double)f3 + this.c * (double)f4;
        double d3 = this.b;
        double d4 = this.c * (double)f3 - this.a * (double)f4;
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }
}

