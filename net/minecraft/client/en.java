/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class en {
    static private final en a = new en();
    private List recipes = new ArrayList();

    public static final en a() {
        return a;
    }

    private en() {
        new eg().a(this);
        new pa().a(this);
        new mv().a(this);
        new iw().a(this);
        new gf().a(this);
        new o().a(this);
        this.a(new Item(dx.aI, 3), "###", Character.valueOf('#'), dx.aH);
        this.a(new Item(dx.aJ, 1), "#", "#", "#", Character.valueOf('#'), dx.aI);
        this.a(new Item(HeadBanger1337.aZ, 2), "###", "###", Character.valueOf('#'), dx.B);
        this.a(new Item(HeadBanger1337.aY, 1), "###", "#X#", "###", Character.valueOf('#'), HeadBanger1337.x, Character.valueOf('X'), dx.l);
        this.a(new Item(HeadBanger1337.an, 1), "###", "XXX", "###", Character.valueOf('#'), HeadBanger1337.x, Character.valueOf('X'), dx.aJ);
        this.a(new Item(HeadBanger1337.aU, 1), "##", "##", Character.valueOf('#'), dx.aB);
        this.a(new Item(HeadBanger1337.aW, 1), "##", "##", Character.valueOf('#'), dx.aG);
        this.a(new Item(HeadBanger1337.al, 1), "##", "##", Character.valueOf('#'), dx.aF);
        this.a(new Item(HeadBanger1337.bd, 1), "###", "###", "###", Character.valueOf('#'), dx.aR);
        this.a(new Item(HeadBanger1337.ab, 1), "###", "###", "###", Character.valueOf('#'), dx.I);
        this.a(new Item(HeadBanger1337.am, 1), "X#X", "#X#", "X#X", Character.valueOf('X'), dx.K, Character.valueOf('#'), HeadBanger1337.E);
        this.a(new Item(HeadBanger1337.ak, 3), "###", Character.valueOf('#'), HeadBanger1337.w);
        this.a(new Item(HeadBanger1337.aF, 1), "# #", "###", "# #", Character.valueOf('#'), dx.B);
        this.a(new Item(dx.at, 1), "##", "##", "##", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(dx.az, 1), "##", "##", "##", Character.valueOf('#'), dx.m);
        this.a(new Item(dx.as, 1), "###", "###", " X ", Character.valueOf('#'), HeadBanger1337.x, Character.valueOf('X'), dx.B);
        this.a(new Item(HeadBanger1337.x, 4), "#", Character.valueOf('#'), HeadBanger1337.J);
        this.a(new Item(dx.B, 4), "#", "#", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(HeadBanger1337.aq, 4), "X", "#", Character.valueOf('X'), dx.k, Character.valueOf('#'), dx.B);
        this.a(new Item(dx.C, 4), "# #", " # ", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(HeadBanger1337.aG, 16), "X X", "X#X", "X X", Character.valueOf('X'), dx.m, Character.valueOf('#'), dx.B);
        this.a(new Item(dx.ax, 1), "# #", "###", Character.valueOf('#'), dx.m);
        this.a(new Item(HeadBanger1337.bf, 1), "A", "B", Character.valueOf('A'), HeadBanger1337.ba, Character.valueOf('B'), HeadBanger1337.aq);
        this.a(new Item(dx.aL, 1), "A", "B", Character.valueOf('A'), HeadBanger1337.au, Character.valueOf('B'), dx.ax);
        this.a(new Item(dx.aM, 1), "A", "B", Character.valueOf('A'), HeadBanger1337.aB, Character.valueOf('B'), dx.ax);
        this.a(new Item(dx.aC, 1), "# #", "###", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(dx.au, 1), "# #", " # ", Character.valueOf('#'), dx.m);
        this.a(new Item(dx.g, 1), "A ", " B", Character.valueOf('A'), dx.m, Character.valueOf('B'), dx.an);
        this.a(new Item(dx.S, 1), "###", Character.valueOf('#'), dx.R);
        this.a(new Item(HeadBanger1337.at, 4), "#  ", "## ", "###", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(dx.aP, 1), "  #", " #X", "# X", Character.valueOf('#'), dx.B, Character.valueOf('X'), dx.I);
        this.a(new Item(HeadBanger1337.aH, 4), "#  ", "## ", "###", Character.valueOf('#'), HeadBanger1337.w);
        this.a(new Item(dx.aq, 1), "###", "#X#", "###", Character.valueOf('#'), dx.B, Character.valueOf('X'), HeadBanger1337.ab);
        this.a(new Item(dx.ar, 1), "###", "#X#", "###", Character.valueOf('#'), HeadBanger1337.ah, Character.valueOf('X'), dx.h);
        this.a(new Item(HeadBanger1337.aJ, 1), "X", "#", Character.valueOf('#'), HeadBanger1337.w, Character.valueOf('X'), dx.B);
        this.a(new Item(HeadBanger1337.aQ, 1), "X", "#", Character.valueOf('#'), dx.B, Character.valueOf('X'), dx.aA);
        this.a(new Item(dx.aQ, 1), " # ", "#X#", " # ", Character.valueOf('#'), dx.n, Character.valueOf('X'), dx.aA);
        this.a(new Item(dx.aO, 1), " # ", "#X#", " # ", Character.valueOf('#'), dx.m, Character.valueOf('X'), dx.aA);
        this.a(new Item(HeadBanger1337.aR, 1), "#", "#", Character.valueOf('#'), HeadBanger1337.t);
        this.a(new Item(HeadBanger1337.aK, 1), "###", Character.valueOf('#'), HeadBanger1337.t);
        this.a(new Item(HeadBanger1337.aM, 1), "###", Character.valueOf('#'), HeadBanger1337.x);
        Collections.sort(this.recipes, new gr(this));
        System.out.println(this.recipes.size() + " recipes");
    }

    void a(Item fp2, Object ... objectArray) {
        Object object;
        String string = "";
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (objectArray[n2] instanceof String[]) {
            object = (String[])objectArray[n2++];
            for (int i2 = 0; i2 < ((String[])object).length; ++i2) {
                Object object2 = ((String[])object)[i2];
                ++n4;
                n3 = ((String)object2).length();
                string = string + (String)object2;
            }
        } else {
            while (objectArray[n2] instanceof String) {
                object = (String)objectArray[n2++];
                ++n4;
                n3 = ((String)object).length();
                string = string + (String)object;
            }
        }
        object = new HashMap();
        while (n2 < objectArray.length) {
            Character c2 = (Character)objectArray[n2];
            int n5 = 0;
            if (objectArray[n2 + 1] instanceof dx) {
                n5 = ((dx)objectArray[n2 + 1]).aW;
            } else if (objectArray[n2 + 1] instanceof HeadBanger1337) {
                n5 = ((HeadBanger1337)objectArray[n2 + 1]).bh;
            }
            HashMap _object = (HashMap)object;
            _object.put(c2, n5);
            n2 += 2;
        }
        int[] nArray = new int[n3 * n4];
        for (int i3 = 0; i3 < n3 * n4; ++i3) {
            char c3 = string.charAt(i3);
            HashMap _object = (HashMap)object;
            nArray[i3] = _object.containsKey(Character.valueOf(c3)) ? (Integer)_object.get(Character.valueOf(c3)) : -1;
        }
        this.recipes.add(new cd(n3, n4, nArray, fp2));
    }

    public Item a(int[] nArray) {
        for (int i2 = 0; i2 < this.recipes.size(); ++i2) {
            cd cd2 = (cd)this.recipes.get(i2);
            if (!cd2.a(nArray)) continue;
            return cd2.b(nArray);
        }
        return null;
    }
}

