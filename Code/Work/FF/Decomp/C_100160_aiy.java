import java.util.Random;

public class C_100160_aiy extends C_100451_alf {

   protected C_100160_aiy(int var1) {
      super(var1, C_100664_afg.field_109010_b);
      this.field_106165_cl = 3;
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 1?0:(var1 == 0?2:3);
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return 0;
      } else if(var5 == 0) {
         return 2;
      } else {
         C_100664_afg var6 = var1.func_109350_f(var2, var3 + 1, var4);
         return var6 != C_100664_afg.field_109021_w && var6 != C_100664_afg.field_109031_x?3:68;
      }
   }

   public int func_106039_o() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return C_100875_xd.func_110398_a(var1, var3);
   }

   public int func_106025_g_(int var1) {
      return this.func_106039_o();
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = -1; var8 <= 1; ++var8) {
         for(int var9 = -1; var9 <= 1; ++var9) {
            int var10 = var1.func_109362_a(var2 + var9, var4 + var8).func_112461_k();
            var5 += (var10 & 16711680) >> 16;
            var6 += (var10 & '\uff00') >> 8;
            var7 += var10 & 255;
         }
      }

      return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         if(var1.func_109523_l(var2, var3 + 1, var4) < 4 && C_100451_alf.field_106116_r[var1.func_109349_a(var2, var3 + 1, var4)] > 2) {
            var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106120_y.field_106162_cm);
         } else if(var1.func_109523_l(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               int var10 = var1.func_109349_a(var7, var8 + 1, var9);
               if(var1.func_109349_a(var7, var8, var9) == C_100451_alf.field_106120_y.field_106162_cm && var1.func_109523_l(var7, var8 + 1, var9) >= 4 && C_100451_alf.field_106116_r[var10] <= 2) {
                  var1.func_109422_e(var7, var8, var9, C_100451_alf.field_106121_x.field_106162_cm);
               }
            }
         }

      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106120_y.func_106043_a(0, var2, var3);
   }
}
