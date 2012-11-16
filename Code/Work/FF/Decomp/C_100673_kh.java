import java.util.Random;

public class C_100673_kh extends C_100675_kg {

   private int field_109109_b;
   private int field_109110_c;
   private int field_109107_d;
   private int field_109108_e;


   public C_100673_kh(int var1, int var2, int var3, int var4, int var5) {
      super(var5);
      this.field_109109_b = var1;
      this.field_109110_c = var2;
      this.field_109107_d = var3;
      this.field_109108_e = var4;
   }

   public static void func_109105_a(Random var0, C_100673_kh[] var1, C_100422_amb var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         C_100673_kh var5 = (C_100673_kh)C_100676_kf.func_109114_a(var0, var1);
         int var6 = var5.field_109107_d + var0.nextInt(var5.field_109108_e - var5.field_109107_d + 1);
         if(C_100992_tt.field_110834_e[var5.field_109109_b].func_110771_k() >= var6) {
            var2.func_103006_a(var0.nextInt(var2.func_103003_k_()), new C_100994_tv(var5.field_109109_b, var6, var5.field_109110_c));
         } else {
            for(int var7 = 0; var7 < var6; ++var7) {
               var2.func_103006_a(var0.nextInt(var2.func_103003_k_()), new C_100994_tv(var5.field_109109_b, 1, var5.field_109110_c));
            }
         }
      }

   }

   public static void func_109106_a(Random var0, C_100673_kh[] var1, C_100420_amd var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         C_100673_kh var5 = (C_100673_kh)C_100676_kf.func_109114_a(var0, var1);
         int var6 = var5.field_109107_d + var0.nextInt(var5.field_109108_e - var5.field_109107_d + 1);
         if(C_100992_tt.field_110834_e[var5.field_109109_b].func_110771_k() >= var6) {
            var2.func_103006_a(var0.nextInt(var2.func_103003_k_()), new C_100994_tv(var5.field_109109_b, var6, var5.field_109110_c));
         } else {
            for(int var7 = 0; var7 < var6; ++var7) {
               var2.func_103006_a(var0.nextInt(var2.func_103003_k_()), new C_100994_tv(var5.field_109109_b, 1, var5.field_109110_c));
            }
         }
      }

   }
}
