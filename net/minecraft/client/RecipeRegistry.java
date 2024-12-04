/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RecipeRegistry {
    static private final RecipeRegistry a = new RecipeRegistry();
    private List recipes = new ArrayList();

    public static final RecipeRegistry a() {
        return a;
    }

    private RecipeRegistry() {
        new eg().a(this);
        new pa().a(this);
        new mv().a(this);
        new iw().a(this);
        new gf().a(this);
        new o().a(this);
        this.a(new Item(ItemRegistry.aI, 3), "###", Character.valueOf('#'), ItemRegistry.aH);
        this.a(new Item(ItemRegistry.aJ, 1), "#", "#", "#", Character.valueOf('#'), ItemRegistry.aI);
        this.a(new Item(HeadBanger1337.aZ, 2), "###", "###", Character.valueOf('#'), ItemRegistry.B);
        this.a(new Item(HeadBanger1337.aY, 1), "###", "#X#", "###", Character.valueOf('#'), HeadBanger1337.x, Character.valueOf('X'), ItemRegistry.l);
        this.a(new Item(HeadBanger1337.an, 1), "###", "XXX", "###", Character.valueOf('#'), HeadBanger1337.x, Character.valueOf('X'), ItemRegistry.aJ);
        this.a(new Item(HeadBanger1337.aU, 1), "##", "##", Character.valueOf('#'), ItemRegistry.aB);
        this.a(new Item(HeadBanger1337.aW, 1), "##", "##", Character.valueOf('#'), ItemRegistry.aG);
        this.a(new Item(HeadBanger1337.al, 1), "##", "##", Character.valueOf('#'), ItemRegistry.aF);
        this.a(new Item(HeadBanger1337.bd, 1), "###", "###", "###", Character.valueOf('#'), ItemRegistry.aR);
        this.a(new Item(HeadBanger1337.ab, 1), "###", "###", "###", Character.valueOf('#'), ItemRegistry.I);
        this.a(new Item(HeadBanger1337.am, 1), "X#X", "#X#", "X#X", Character.valueOf('X'), ItemRegistry.K, Character.valueOf('#'), HeadBanger1337.E);
        this.a(new Item(HeadBanger1337.ak, 3), "###", Character.valueOf('#'), HeadBanger1337.w);
        this.a(new Item(HeadBanger1337.aF, 1), "# #", "###", "# #", Character.valueOf('#'), ItemRegistry.B);
        this.a(new Item(ItemRegistry.at, 1), "##", "##", "##", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(ItemRegistry.az, 1), "##", "##", "##", Character.valueOf('#'), ItemRegistry.m);
        this.a(new Item(ItemRegistry.as, 1), "###", "###", " X ", Character.valueOf('#'), HeadBanger1337.x, Character.valueOf('X'), ItemRegistry.B);
        this.a(new Item(HeadBanger1337.x, 4), "#", Character.valueOf('#'), HeadBanger1337.J);
        this.a(new Item(ItemRegistry.B, 4), "#", "#", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(HeadBanger1337.aq, 4), "X", "#", Character.valueOf('X'), ItemRegistry.k, Character.valueOf('#'), ItemRegistry.B);
        this.a(new Item(ItemRegistry.C, 4), "# #", " # ", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(HeadBanger1337.aG, 16), "X X", "X#X", "X X", Character.valueOf('X'), ItemRegistry.m, Character.valueOf('#'), ItemRegistry.B);
        this.a(new Item(ItemRegistry.ax, 1), "# #", "###", Character.valueOf('#'), ItemRegistry.m);
        this.a(new Item(HeadBanger1337.bf, 1), "A", "B", Character.valueOf('A'), HeadBanger1337.ba, Character.valueOf('B'), HeadBanger1337.aq);
        this.a(new Item(ItemRegistry.aL, 1), "A", "B", Character.valueOf('A'), HeadBanger1337.au, Character.valueOf('B'), ItemRegistry.ax);
        this.a(new Item(ItemRegistry.aM, 1), "A", "B", Character.valueOf('A'), HeadBanger1337.aB, Character.valueOf('B'), ItemRegistry.ax);
        this.a(new Item(ItemRegistry.aC, 1), "# #", "###", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(ItemRegistry.au, 1), "# #", " # ", Character.valueOf('#'), ItemRegistry.m);
        this.a(new Item(ItemRegistry.g, 1), "A ", " B", Character.valueOf('A'), ItemRegistry.m, Character.valueOf('B'), ItemRegistry.an);
        this.a(new Item(ItemRegistry.S, 1), "###", Character.valueOf('#'), ItemRegistry.R);
        this.a(new Item(HeadBanger1337.at, 4), "#  ", "## ", "###", Character.valueOf('#'), HeadBanger1337.x);
        this.a(new Item(ItemRegistry.aP, 1), "  #", " #X", "# X", Character.valueOf('#'), ItemRegistry.B, Character.valueOf('X'), ItemRegistry.I);
        this.a(new Item(HeadBanger1337.aH, 4), "#  ", "## ", "###", Character.valueOf('#'), HeadBanger1337.w);
        this.a(new Item(ItemRegistry.aq, 1), "###", "#X#", "###", Character.valueOf('#'), ItemRegistry.B, Character.valueOf('X'), HeadBanger1337.ab);
        this.a(new Item(ItemRegistry.ar, 1), "###", "#X#", "###", Character.valueOf('#'), HeadBanger1337.ah, Character.valueOf('X'), ItemRegistry.h);
        this.a(new Item(HeadBanger1337.aJ, 1), "X", "#", Character.valueOf('#'), HeadBanger1337.w, Character.valueOf('X'), ItemRegistry.B);
        this.a(new Item(HeadBanger1337.aQ, 1), "X", "#", Character.valueOf('#'), ItemRegistry.B, Character.valueOf('X'), ItemRegistry.aA);
        this.a(new Item(ItemRegistry.aQ, 1), " # ", "#X#", " # ", Character.valueOf('#'), ItemRegistry.n, Character.valueOf('X'), ItemRegistry.aA);
        this.a(new Item(ItemRegistry.aO, 1), " # ", "#X#", " # ", Character.valueOf('#'), ItemRegistry.m, Character.valueOf('X'), ItemRegistry.aA);
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
            if (objectArray[n2 + 1] instanceof ItemRegistry) {
                n5 = ((ItemRegistry)objectArray[n2 + 1]).id;
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
        this.recipes.add(new Recipe(n3, n4, nArray, fp2));
    }

    public Item a(int[] nArray) {
        for (int i2 = 0; i2 < this.recipes.size(); ++i2) {
            Recipe cd2 = (Recipe)this.recipes.get(i2);
            if (!cd2.a(nArray)) continue;
            return cd2.b(nArray);
        }
        return null;
    }
}

