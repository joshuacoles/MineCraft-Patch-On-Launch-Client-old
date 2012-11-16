import java.util.List;
import java.util.Random;

public class C_100435_alp extends C_100451_alf {

   public static final String[] field_106416_a = new String[]{"oak", "spruce", "birch", "jungle"};


   protected C_100435_alp(int var1) {
      super(var1, C_100664_afg.field_109008_d);
      this.field_106165_cl = 20;
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106013_d() {
      return 31;
   }

   public int func_106063_a(Random var1) {
      return 1;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106079_M.field_106162_cm;
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 4;
      int var8 = var7 + 1;
      if(var1.func_109480_d(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  int var12 = var1.func_109349_a(var2 + var9, var3 + var10, var4 + var11);
                  if(var12 == C_100451_alf.field_106080_N.field_106162_cm) {
                     int var13 = var1.func_109357_g(var2 + var9, var3 + var10, var4 + var11);
                     if((var13 & 8) == 0) {
                        var1.func_109441_d(var2 + var9, var3 + var10, var4 + var11, var13 | 8);
                     }
                  }
               }
            }
         }
      }

   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      int var9 = var1.func_109357_g(var2, var3, var4) & 3;
      byte var10 = 0;
      switch(var5) {
      case 0:
      case 1:
         var10 = 0;
         break;
      case 2:
      case 3:
         var10 = 8;
         break;
      case 4:
      case 5:
         var10 = 4;
      }

      var1.func_109488_c(var2, var3, var4, var9 | var10);
   }

   public int func_106029_a(int var1, int var2) {
      int var3 = var2 & 12;
      int var4 = var2 & 3;
      return var3 == 0 && (var1 == 1 || var1 == 0)?21:(var3 == 4 && (var1 == 5 || var1 == 4)?21:(var3 == 8 && (var1 == 2 || var1 == 3)?21:(var4 == 1?116:(var4 == 2?117:(var4 == 3?153:20)))));
   }

   public int func_106004_b(int var1) {
      return var1 & 3;
   }

   public static int func_106415_e(int var0) {
      return var0 & 3;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
      var3.add(new C_100994_tv(var1, 1, 2));
      var3.add(new C_100994_tv(var1, 1, 3));
   }

   protected C_100994_tv func_106044_f_(int var1) {
      return new C_100994_tv(this.field_106162_cm, 1, func_106415_e(var1));
   }

}
