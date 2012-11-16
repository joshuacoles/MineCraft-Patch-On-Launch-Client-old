import java.util.List;
import java.util.Random;

public class C_100522_abq {

   private static final C_100673_kh[] field_108560_a = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110839_o.field_110891_cf, 0, 1, 5, 10), new C_100673_kh(C_100992_tt.field_110853_p.field_110891_cf, 0, 1, 3, 5), new C_100673_kh(C_100992_tt.field_110915_aC.field_110891_cf, 0, 4, 9, 5), new C_100673_kh(C_100992_tt.field_110904_aW.field_110891_cf, 4, 4, 9, 5), new C_100673_kh(C_100992_tt.field_110838_n.field_110891_cf, 0, 1, 2, 3), new C_100673_kh(C_100992_tt.field_110841_m.field_110891_cf, 0, 3, 8, 10), new C_100673_kh(C_100992_tt.field_110820_U.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110832_g.field_110891_cf, 0, 1, 1, 1), new C_100673_kh(C_100451_alf.field_106186_aJ.field_106162_cm, 0, 4, 8, 1), new C_100673_kh(C_100992_tt.field_110878_bh.field_110891_cf, 0, 2, 4, 10), new C_100673_kh(C_100992_tt.field_110877_bg.field_110891_cf, 0, 2, 4, 10)};


   private static C_100767_adx func_108557_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1.nextInt(100);
      C_100516_abo var8;
      if(var7 >= 80) {
         var8 = C_100526_abs.func_108406_a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new C_100526_abs(var6, var1, var8, var5);
         }
      } else if(var7 >= 70) {
         var8 = C_100530_abu.func_108409_a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new C_100530_abu(var6, var1, var8, var5);
         }
      } else {
         var8 = C_100520_abr.func_108551_a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new C_100520_abr(var6, var1, var8, var5);
         }
      }

      return null;
   }

   private static C_100767_adx func_108559_b(C_100767_adx var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 8) {
         return null;
      } else if(Math.abs(var3 - var0.func_108381_b().field_108341_a) <= 80 && Math.abs(var5 - var0.func_108381_b().field_108340_c) <= 80) {
         C_100767_adx var8 = func_108557_a(var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            var1.add(var8);
            var8.func_108391_a(var0, var1, var2);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static C_100767_adx func_108558_a(C_100767_adx var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return func_108559_b(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static C_100673_kh[] func_108556_a() {
      return field_108560_a;
   }

}
