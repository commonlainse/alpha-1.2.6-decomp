/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;
import java.util.Random;

public class ItemRegistry {
    static protected Random b = new Random();
    public static ItemRegistry[] c = new ItemRegistry[32000];
    public static ItemRegistry d = new ol(0, 2).a(82);
    public static ItemRegistry e = new ac(1, 2).a(98);
    public static ItemRegistry f = new mg(2, 2).a(114);
    public static ItemRegistry g = new pw(3).a(5);
    public static ItemRegistry h = new qk(4, 4).a(10);
    public static ItemRegistry i = new kt(5).a(21);
    public static ItemRegistry j = new ItemRegistry(6).a(37);
    public static ItemRegistry k = new ItemRegistry(7).a(7);
    public static ItemRegistry l = new ItemRegistry(8).a(55);
    public static ItemRegistry m = new ItemRegistry(9).a(23);
    public static ItemRegistry n = new ItemRegistry(10).a(39);
    public static ItemRegistry o = new kg(11, 2).a(66);
    public static ItemRegistry p = new kg(12, 0).a(64);
    public static ItemRegistry q = new ol(13, 0).a(80);
    public static ItemRegistry r = new ac(14, 0).a(96);
    public static ItemRegistry s = new mg(15, 0).a(112);
    public static ItemRegistry t = new kg(16, 1).a(65);
    public static ItemRegistry u = new ol(17, 1).a(81);
    public static ItemRegistry v = new ac(18, 1).a(97);
    public static ItemRegistry w = new mg(19, 1).a(113);
    public static ItemRegistry x = new kg(20, 3).a(67);
    public static ItemRegistry y = new ol(21, 3).a(83);
    public static ItemRegistry z = new ac(22, 3).a(99);
    public static ItemRegistry A = new mg(23, 3).a(115);
    public static ItemRegistry B = new ItemRegistry(24).a(53).e();
    public static ItemRegistry C = new ItemRegistry(25).a(71);
    public static ItemRegistry D = new au(26, 10).a(72);
    public static ItemRegistry E = new kg(27, 0).a(68);
    public static ItemRegistry F = new ol(28, 0).a(84);
    public static ItemRegistry G = new ac(29, 0).a(100);
    public static ItemRegistry H = new mg(30, 0).a(116);
    public static ItemRegistry I = new ItemRegistry(31).a(8);
    public static ItemRegistry J = new ItemRegistry(32).a(24);
    public static ItemRegistry K = new ItemRegistry(33).a(40);
    public static ItemRegistry L = new gt(34, 0).a(128);
    public static ItemRegistry M = new gt(35, 1).a(129);
    public static ItemRegistry N = new gt(36, 2).a(130);
    public static ItemRegistry O = new gt(37, 3).a(131);
    public static ItemRegistry P = new gt(38, 1).a(132);
    public static ItemRegistry Q = new la(39, Block.az.bh).a(9);
    public static ItemRegistry R = new ItemRegistry(40).a(25);
    public static ItemRegistry S = new qk(41, 5).a(41);
    public static ItemRegistry T = new oj(42, 0, 0, 0).a(0);
    public static ItemRegistry U = new oj(43, 0, 0, 1).a(16);
    public static ItemRegistry V = new oj(44, 0, 0, 2).a(32);
    public static ItemRegistry W = new oj(45, 0, 0, 3).a(48);
    public static ItemRegistry X = new oj(46, 1, 1, 0).a(1);
    public static ItemRegistry Y = new oj(47, 1, 1, 1).a(17);
    public static ItemRegistry Z = new oj(48, 1, 1, 2).a(33);
    public static ItemRegistry aa = new oj(49, 1, 1, 3).a(49);
    public static ItemRegistry ab = new oj(50, 2, 2, 0).a(2);
    public static ItemRegistry ac = new oj(51, 2, 2, 1).a(18);
    public static ItemRegistry ad = new oj(52, 2, 2, 2).a(34);
    public static ItemRegistry ae = new oj(53, 2, 2, 3).a(50);
    public static ItemRegistry af = new oj(54, 3, 3, 0).a(3);
    public static ItemRegistry ag = new oj(55, 3, 3, 1).a(19);
    public static ItemRegistry ah = new oj(56, 3, 3, 2).a(35);
    public static ItemRegistry ai = new oj(57, 3, 3, 3).a(51);
    public static ItemRegistry aj = new oj(58, 1, 4, 0).a(4);
    public static ItemRegistry ak = new oj(59, 1, 4, 1).a(20);
    public static ItemRegistry al = new oj(60, 1, 4, 2).a(36);
    public static ItemRegistry am = new oj(61, 1, 4, 3).a(52);
    public static ItemRegistry an = new ItemRegistry(62).a(6);
    public static ItemRegistry ao = new qk(63, 3).a(87);
    public static ItemRegistry ap = new qk(64, 8).a(88);
    public static ItemRegistry aq = new qe(65).a(26);
    public static ItemRegistry ar = new qk(66, 42).a(11);
    public static ItemRegistry as = new nv(67).a(42);
    public static ItemRegistry at = new eu(68, hb.c).a(43);
    public static ItemRegistry au = new ag(69, 0).a(74);
    public static ItemRegistry av = new ag(70, Block.A.bh).a(75);
    public static ItemRegistry aw = new ag(71, Block.C.bh).a(76);
    public static ItemRegistry ax = new lb(72, 0).a(135);
    public static ItemRegistry ay = new lk(73).a(104);
    public static ItemRegistry az = new eu(74, hb.e).a(44);
    public static ItemRegistry aA = new ey(75).a(56);
    public static ItemRegistry aB = new by(76).a(14);
    public static ItemRegistry aC = new nw(77).a(136);
    public static ItemRegistry aD = new ItemRegistry(78).a(103);
    public static ItemRegistry aE = new ag(79, -1).a(77);
    public static ItemRegistry aF = new ItemRegistry(80).a(22);
    public static ItemRegistry aG = new ItemRegistry(81).a(57);
    public static ItemRegistry aH = new hh(82, Block.aX).a(27);
    public static ItemRegistry aI = new ItemRegistry(83).a(58);
    public static ItemRegistry aJ = new ItemRegistry(84).a(59);
    public static ItemRegistry aK = new ItemRegistry(85).a(30);
    public static ItemRegistry aL = new lb(86, 1).a(151);
    public static ItemRegistry aM = new lb(87, 2).a(167);
    public static ItemRegistry aN = new ItemRegistry(88).a(12);
    public static ItemRegistry aO = new ItemRegistry(89).a(54);
    public static ItemRegistry aP = new bj(90).a(69);
    public static ItemRegistry aQ = new ItemRegistry(91).a(70);
    public static ItemRegistry aR = new ItemRegistry(92).a(73);
    public static ItemRegistry aS = new qk(93, 2).a(89);
    public static ItemRegistry aT = new qk(94, 5).a(90);
    public static ItemRegistry aU = new mw(2000, "13").a(240);
    public static ItemRegistry aV = new mw(2001, "cat").a(241);
    public final int id;
    protected int aX = 64;
    protected int aY = 32;
    protected int aZ;
    protected boolean ba = false;

    protected ItemRegistry(int n2) {
        this.id = 256 + n2;
        if (c[256 + n2] != null) {
            System.out.println("CONFLICT @ " + n2);
        }
        ItemRegistry.c[256 + n2] = this;
    }

    public ItemRegistry a(int n2) {
        this.aZ = n2;
        return this;
    }

    public int a(Item fp2) {
        return this.aZ;
    }

    public boolean a(Item fp2, Player eb2, Session cy2, int n2, int n3, int n4, int n5) {
        return false;
    }

    public float a(Item fp2, Block nq2) {
        return 1.0f;
    }

    public Item a(Item fp2, Session cy2, Player eb2) {
        return fp2;
    }

    public int c() {
        return this.aX;
    }

    public int d() {
        return this.aY;
    }

    public void a(Item fp2, Mob hf2) {
    }

    public void a(Item fp2, int n2, int n3, int n4, int n5) {
    }

    public int a(lw lw2) {
        return 1;
    }

    public boolean a(Block nq2) {
        return false;
    }

    public void b(Item fp2, Mob hf2) {
    }

    public ItemRegistry e() {
        this.ba = true;
        return this;
    }

    public boolean a() {
        return this.ba;
    }

    public boolean b() {
        return false;
    }
}

