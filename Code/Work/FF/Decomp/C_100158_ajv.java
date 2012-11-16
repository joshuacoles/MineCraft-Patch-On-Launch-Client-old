import java.util.Random;

public class C_100158_ajv extends C_100451_alf {

   protected C_100158_ajv(int var1) {
      super(var1, C_100664_afg.field_109010_b);
      this.field_106165_cl = 77;
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 1?78:(var1 == 0?2:77);
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return 78;
      } else if(var5 == 0) {
         return 2;
      } else {
         C_100664_afg var6 = var1.func_109350_f(var2, var3 + 1, var4);
         return var6 != C_100664_afg.field_109021_w && var6 != C_100664_afg.field_109031_x?77:68;
      }
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
                  var1.func_109422_e(var7, var8, var9, this.field_106162_cm);
               }
            }
         }

      }
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      super.func_105974_a(var1, var2, var3, var4, var5);
      if(var5.nextInt(10) == 0) {
         var1.func_109428_a("townaura", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + 1.1F), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106120_y.func_106043_a(0, var2, var3);
   }
}
