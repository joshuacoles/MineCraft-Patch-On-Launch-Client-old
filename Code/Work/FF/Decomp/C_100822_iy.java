import java.util.ArrayList;
import java.util.List;

public class C_100822_iy {

   public static int field_110063_a;
   public static int field_110061_b;
   public static int field_110062_c;
   public static int field_110059_d;
   public static List field_110060_e = new ArrayList();
   public static C_100791_ix field_110057_f = (new C_100791_ix(0, "openInventory", 0, 0, C_100992_tt.field_110908_aL, (C_100791_ix)null)).func_109928_a().func_109929_c();
   public static C_100791_ix field_110058_g = (new C_100791_ix(1, "mineWood", 2, 1, C_100451_alf.field_106079_M, field_110057_f)).func_109929_c();
   public static C_100791_ix field_110070_h = (new C_100791_ix(2, "buildWorkBench", 4, -1, C_100451_alf.field_106194_aB, field_110058_g)).func_109929_c();
   public static C_100791_ix field_110071_i = (new C_100791_ix(3, "buildPickaxe", 4, 2, C_100992_tt.field_110849_t, field_110070_h)).func_109929_c();
   public static C_100791_ix field_110068_j = (new C_100791_ix(4, "buildFurnace", 3, 4, C_100451_alf.field_106198_aF, field_110071_i)).func_109929_c();
   public static C_100791_ix field_110069_k = (new C_100791_ix(5, "acquireIron", 1, 4, C_100992_tt.field_110839_o, field_110068_j)).func_109929_c();
   public static C_100791_ix field_110066_l = (new C_100791_ix(6, "buildHoe", 2, -3, C_100992_tt.field_110814_N, field_110070_h)).func_109929_c();
   public static C_100791_ix field_110067_m = (new C_100791_ix(7, "makeBread", -1, -3, C_100992_tt.field_110820_U, field_110066_l)).func_109929_c();
   public static C_100791_ix field_110064_n = (new C_100791_ix(8, "bakeCake", 0, -5, C_100992_tt.field_110894_aZ, field_110066_l)).func_109929_c();
   public static C_100791_ix field_110065_o = (new C_100791_ix(9, "buildBetterPickaxe", 6, 2, C_100992_tt.field_110856_x, field_110071_i)).func_109929_c();
   public static C_100791_ix field_110079_p = (new C_100791_ix(10, "cookFish", 2, 6, C_100992_tt.field_110901_aV, field_110068_j)).func_109929_c();
   public static C_100791_ix field_110078_q = (new C_100791_ix(11, "onARail", 2, 3, C_100451_alf.field_106186_aJ, field_110069_k)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110077_r = (new C_100791_ix(12, "buildSword", 6, -1, C_100992_tt.field_110851_r, field_110070_h)).func_109929_c();
   public static C_100791_ix field_110076_s = (new C_100791_ix(13, "killEnemy", 8, -1, C_100992_tt.field_110903_aX, field_110077_r)).func_109929_c();
   public static C_100791_ix field_110075_t = (new C_100791_ix(14, "killCow", 7, -3, C_100992_tt.field_110918_aF, field_110077_r)).func_109929_c();
   public static C_100791_ix field_110074_u = (new C_100791_ix(15, "flyPig", 8, -4, C_100992_tt.field_110913_aA, field_110075_t)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110073_v = (new C_100791_ix(16, "snipeSkeleton", 7, 0, C_100992_tt.field_110843_k, field_110076_s)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110072_w = (new C_100791_ix(17, "diamonds", -1, 5, C_100992_tt.field_110838_n, field_110069_k)).func_109929_c();
   public static C_100791_ix field_110082_x = (new C_100791_ix(18, "portal", -1, 7, C_100451_alf.field_106210_as, field_110072_w)).func_109929_c();
   public static C_100791_ix field_110081_y = (new C_100791_ix(19, "ghast", -4, 8, C_100992_tt.field_110870_bp, field_110082_x)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110080_z = (new C_100791_ix(20, "blazeRod", 0, 9, C_100992_tt.field_110869_bo, field_110082_x)).func_109929_c();
   public static C_100791_ix field_110054_A = (new C_100791_ix(21, "potion", 2, 8, C_100992_tt.field_110864_bs, field_110080_z)).func_109929_c();
   public static C_100791_ix field_110055_B = (new C_100791_ix(22, "theEnd", 3, 10, C_100992_tt.field_110896_bA, field_110080_z)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110056_C = (new C_100791_ix(23, "theEnd2", 4, 13, C_100451_alf.field_106235_bN, field_110055_B)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110051_D = (new C_100791_ix(24, "enchantments", -4, 4, C_100451_alf.field_106247_bH, field_110072_w)).func_109929_c();
   public static C_100791_ix field_110052_E = (new C_100791_ix(25, "overkill", -4, 1, C_100992_tt.field_110854_z, field_110051_D)).func_109930_b().func_109929_c();
   public static C_100791_ix field_110053_F = (new C_100791_ix(26, "bookcase", -3, 6, C_100451_alf.field_106214_aq, field_110051_D)).func_109929_c();


   public static void func_110050_a() {}

   static {
      System.out.println(field_110060_e.size() + " achievements");
   }
}
