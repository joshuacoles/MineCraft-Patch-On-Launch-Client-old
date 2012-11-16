import java.util.Random;

public class C_100512_nz {

   private static C_100387_amw field_108269_a = C_100387_amw.func_107858_a(0.0D, 0.0D, 0.0D);


   public static C_100387_amw func_108266_a(C_100598_ls var0, int var1, int var2) {
      return func_108267_c(var0, var1, var2, (C_100387_amw)null);
   }

   public static C_100387_amw func_108268_a(C_100598_ls var0, int var1, int var2, C_100387_amw var3) {
      field_108269_a.field_107872_c = var3.field_107872_c - var0.field_103221_t;
      field_108269_a.field_107869_d = var3.field_107869_d - var0.field_103219_u;
      field_108269_a.field_107870_e = var3.field_107870_e - var0.field_103217_v;
      return func_108267_c(var0, var1, var2, field_108269_a);
   }

   public static C_100387_amw func_108265_b(C_100598_ls var0, int var1, int var2, C_100387_amw var3) {
      field_108269_a.field_107872_c = var0.field_103221_t - var3.field_107872_c;
      field_108269_a.field_107869_d = var0.field_103219_u - var3.field_107869_d;
      field_108269_a.field_107870_e = var0.field_103217_v - var3.field_107870_e;
      return func_108267_c(var0, var1, var2, field_108269_a);
   }

   private static C_100387_amw func_108267_c(C_100598_ls var0, int var1, int var2, C_100387_amw var3) {
      Random var4 = var0.func_103312_aA();
      boolean var5 = false;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      float var9 = -99999.0F;
      boolean var10;
      if(var0.func_103319_aL()) {
         double var11 = (double)(var0.func_103359_aI().func_105268_e(C_100650_jv.func_108910_c(var0.field_103221_t), C_100650_jv.func_108910_c(var0.field_103219_u), C_100650_jv.func_108910_c(var0.field_103217_v)) + 4.0F);
         double var13 = (double)(var0.func_103345_aJ() + (float)var1);
         var10 = var11 < var13 * var13;
      } else {
         var10 = false;
      }

      for(int var16 = 0; var16 < 10; ++var16) {
         int var12 = var4.nextInt(2 * var1) - var1;
         int var17 = var4.nextInt(2 * var2) - var2;
         int var14 = var4.nextInt(2 * var1) - var1;
         if(var3 == null || (double)var12 * var3.field_107872_c + (double)var14 * var3.field_107870_e >= 0.0D) {
            var12 += C_100650_jv.func_108910_c(var0.field_103221_t);
            var17 += C_100650_jv.func_108910_c(var0.field_103219_u);
            var14 += C_100650_jv.func_108910_c(var0.field_103217_v);
            if(!var10 || var0.func_103340_e(var12, var17, var14)) {
               float var15 = var0.func_103499_a(var12, var17, var14);
               if(var15 > var9) {
                  var9 = var15;
                  var6 = var12;
                  var7 = var17;
                  var8 = var14;
                  var5 = true;
               }
            }
         }
      }

      if(var5) {
         return var0.field_103229_p.func_109363_R().func_107878_a((double)var6, (double)var7, (double)var8);
      } else {
         return null;
      }
   }

}
