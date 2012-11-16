import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C_100818_jh {

   protected static Map field_110028_a = new HashMap();
   public static List field_110026_b = new ArrayList();
   public static List field_110027_c = new ArrayList();
   public static List field_110024_d = new ArrayList();
   public static List field_110025_e = new ArrayList();
   public static C_100809_jc field_110022_f = (new C_100828_ja(1000, "stat.startGame")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110023_g = (new C_100828_ja(1001, "stat.createWorld")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110035_h = (new C_100828_ja(1002, "stat.loadWorld")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110036_i = (new C_100828_ja(1003, "stat.joinMultiplayer")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110033_j = (new C_100828_ja(1004, "stat.leaveGame")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110034_k = (new C_100828_ja(1100, "stat.playOneMinute", C_100809_jc.field_109924_i)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110031_l = (new C_100828_ja(2000, "stat.walkOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110032_m = (new C_100828_ja(2001, "stat.swimOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110029_n = (new C_100828_ja(2002, "stat.fallOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110030_o = (new C_100828_ja(2003, "stat.climbOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110044_p = (new C_100828_ja(2004, "stat.flyOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110043_q = (new C_100828_ja(2005, "stat.diveOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110042_r = (new C_100828_ja(2006, "stat.minecartOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110041_s = (new C_100828_ja(2007, "stat.boatOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110040_t = (new C_100828_ja(2008, "stat.pigOneCm", C_100809_jc.field_109922_j)).func_109914_h().func_109909_g();
   public static C_100809_jc field_110039_u = (new C_100828_ja(2010, "stat.jump")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110038_v = (new C_100828_ja(2011, "stat.drop")).func_109914_h().func_109909_g();
   public static C_100809_jc field_110037_w = (new C_100828_ja(2020, "stat.damageDealt")).func_109909_g();
   public static C_100809_jc field_110047_x = (new C_100828_ja(2021, "stat.damageTaken")).func_109909_g();
   public static C_100809_jc field_110046_y = (new C_100828_ja(2022, "stat.deaths")).func_109909_g();
   public static C_100809_jc field_110045_z = (new C_100828_ja(2023, "stat.mobKills")).func_109909_g();
   public static C_100809_jc field_110018_A = (new C_100828_ja(2024, "stat.playerKills")).func_109909_g();
   public static C_100809_jc field_110019_B = (new C_100828_ja(2025, "stat.fishCaught")).func_109909_g();
   public static C_100809_jc[] field_110020_C = func_110008_a("stat.mineBlock", 16777216);
   public static C_100809_jc[] field_110014_D;
   public static C_100809_jc[] field_110015_E;
   public static C_100809_jc[] field_110016_F;
   private static boolean field_110017_G;
   private static boolean field_110021_H;


   public static void func_110007_a() {}

   public static void func_110009_b() {
      field_110015_E = func_110005_a(field_110015_E, "stat.useItem", 16908288, 0, 256);
      field_110016_F = func_110006_b(field_110016_F, "stat.breakItem", 16973824, 0, 256);
      field_110017_G = true;
      func_110004_d();
   }

   public static void func_110010_c() {
      field_110015_E = func_110005_a(field_110015_E, "stat.useItem", 16908288, 256, 32000);
      field_110016_F = func_110006_b(field_110016_F, "stat.breakItem", 16973824, 256, 32000);
      field_110021_H = true;
      func_110004_d();
   }

   public static void func_110004_d() {
      if(field_110017_G && field_110021_H) {
         HashSet var0 = new HashSet();
         Iterator var1 = C_100929_vq.func_110737_a().func_110736_b().iterator();

         while(var1.hasNext()) {
            C_100925_vs var2 = (C_100925_vs)var1.next();
            if(var2.func_110723_b() != null) {
               var0.add(Integer.valueOf(var2.func_110723_b().field_111397_c));
            }
         }

         var1 = C_100908_vm.func_110691_a().func_110690_b().values().iterator();

         while(var1.hasNext()) {
            C_100994_tv var4 = (C_100994_tv)var1.next();
            var0.add(Integer.valueOf(var4.field_111397_c));
         }

         field_110014_D = new C_100809_jc[32000];
         var1 = var0.iterator();

         while(var1.hasNext()) {
            Integer var5 = (Integer)var1.next();
            if(C_100992_tt.field_110834_e[var5.intValue()] != null) {
               String var3 = C_100359_bd.func_107637_a("stat.craftItem", new Object[]{C_100992_tt.field_110834_e[var5.intValue()].func_110799_t()});
               field_110014_D[var5.intValue()] = (new C_100811_jb(16842752 + var5.intValue(), var3, var5.intValue())).func_109909_g();
            }
         }

         func_110013_a(field_110014_D);
      }
   }

   private static C_100809_jc[] func_110008_a(String var0, int var1) {
      C_100809_jc[] var2 = new C_100809_jc[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         if(C_100451_alf.field_106118_p[var3] != null && C_100451_alf.field_106118_p[var3].func_106033_C()) {
            String var4 = C_100359_bd.func_107637_a(var0, new Object[]{C_100451_alf.field_106118_p[var3].func_106003_B()});
            var2[var3] = (new C_100811_jb(var1 + var3, var4, var3)).func_109909_g();
            field_110025_e.add((C_100811_jb)var2[var3]);
         }
      }

      func_110013_a(var2);
      return var2;
   }

   private static C_100809_jc[] func_110005_a(C_100809_jc[] var0, String var1, int var2, int var3, int var4) {
      if(var0 == null) {
         var0 = new C_100809_jc[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if(C_100992_tt.field_110834_e[var5] != null) {
            String var6 = C_100359_bd.func_107637_a(var1, new Object[]{C_100992_tt.field_110834_e[var5].func_110799_t()});
            var0[var5] = (new C_100811_jb(var2 + var5, var6, var5)).func_109909_g();
            if(var5 >= 256) {
               field_110024_d.add((C_100811_jb)var0[var5]);
            }
         }
      }

      func_110013_a(var0);
      return var0;
   }

   private static C_100809_jc[] func_110006_b(C_100809_jc[] var0, String var1, int var2, int var3, int var4) {
      if(var0 == null) {
         var0 = new C_100809_jc[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if(C_100992_tt.field_110834_e[var5] != null && C_100992_tt.field_110834_e[var5].func_110765_n()) {
            String var6 = C_100359_bd.func_107637_a(var1, new Object[]{C_100992_tt.field_110834_e[var5].func_110799_t()});
            var0[var5] = (new C_100811_jb(var2 + var5, var6, var5)).func_109909_g();
         }
      }

      func_110013_a(var0);
      return var0;
   }

   private static void func_110013_a(C_100809_jc[] var0) {
      func_110012_a(var0, C_100451_alf.field_106072_E.field_106162_cm, C_100451_alf.field_106071_D.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106074_G.field_106162_cm, C_100451_alf.field_106074_G.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106144_bi.field_106162_cm, C_100451_alf.field_106148_bd.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106198_aF.field_106162_cm, C_100451_alf.field_106197_aE.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106177_aR.field_106162_cm, C_100451_alf.field_106178_aQ.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106139_bl.field_106162_cm, C_100451_alf.field_106138_bk.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106179_aT.field_106162_cm, C_100451_alf.field_106180_aS.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106230_aj.field_106162_cm, C_100451_alf.field_106228_ai.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106236_am.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106233_bQ.field_106162_cm, C_100451_alf.field_106213_bR.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106121_x.field_106162_cm, C_100451_alf.field_106120_y.field_106162_cm);
      func_110012_a(var0, C_100451_alf.field_106196_aD.field_106162_cm, C_100451_alf.field_106120_y.field_106162_cm);
   }

   private static void func_110012_a(C_100809_jc[] var0, int var1, int var2) {
      if(var0[var1] != null && var0[var2] == null) {
         var0[var2] = var0[var1];
      } else {
         field_110026_b.remove(var0[var1]);
         field_110025_e.remove(var0[var1]);
         field_110027_c.remove(var0[var1]);
         var0[var1] = var0[var2];
      }
   }

   public static C_100809_jc func_110011_a(int var0) {
      return (C_100809_jc)field_110028_a.get(Integer.valueOf(var0));
   }

   static {
      C_100822_iy.func_110050_a();
      field_110017_G = false;
      field_110021_H = false;
   }
}
