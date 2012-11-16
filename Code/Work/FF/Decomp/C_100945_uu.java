import java.util.List;

public class C_100945_uu extends C_100992_tt {

   private int field_110980_a;


   public C_100945_uu(int var1) {
      super(var1);
      this.field_110980_a = var1 + 256;
      this.func_110772_c(C_100451_alf.field_106118_p[var1 + 256].func_106024_a(2));
   }

   public int func_110979_g() {
      return this.field_110980_a;
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.func_109349_a(var4, var5, var6);
      if(var11 == C_100451_alf.field_106181_aV.field_106162_cm) {
         var7 = 1;
      } else if(var11 != C_100451_alf.field_106128_bx.field_106162_cm && var11 != C_100451_alf.field_106244_aa.field_106162_cm && var11 != C_100451_alf.field_106246_ab.field_106162_cm) {
         if(var7 == 0) {
            --var5;
         }

         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }
      }

      if(var1.field_111398_a == 0) {
         return false;
      } else if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else if(var5 == 255 && C_100451_alf.field_106118_p[this.field_110980_a].field_106204_cB.func_108983_a()) {
         return false;
      } else if(var3.func_109501_a(this.field_110980_a, var4, var5, var6, false, var7, var2)) {
         C_100451_alf var12 = C_100451_alf.field_106118_p[this.field_110980_a];
         if(var3.func_109394_d(var4, var5, var6, this.field_110980_a, this.func_110748_a(var1.func_111367_j()))) {
            if(var3.func_109349_a(var4, var5, var6) == this.field_110980_a) {
               C_100451_alf.field_106118_p[this.field_110980_a].func_106065_a(var3, var4, var5, var6, var7, var8, var9, var10);
               C_100451_alf.field_106118_p[this.field_110980_a].func_106047_a(var3, var4, var5, var6, var2);
            }

            var3.func_109476_a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var12.field_106150_cz.func_107920_b(), (var12.field_106150_cz.func_107921_c() + 1.0F) / 2.0F, var12.field_106150_cz.func_107918_d() * 0.8F);
            --var1.field_111398_a;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean func_110978_a(C_100873_xe var1, int var2, int var3, int var4, int var5, C_101095_qg var6, C_100994_tv var7) {
      int var8 = var1.func_109349_a(var2, var3, var4);
      if(var8 == C_100451_alf.field_106181_aV.field_106162_cm) {
         var5 = 1;
      } else if(var8 != C_100451_alf.field_106128_bx.field_106162_cm && var8 != C_100451_alf.field_106244_aa.field_106162_cm && var8 != C_100451_alf.field_106246_ab.field_106162_cm) {
         if(var5 == 0) {
            --var3;
         }

         if(var5 == 1) {
            ++var3;
         }

         if(var5 == 2) {
            --var4;
         }

         if(var5 == 3) {
            ++var4;
         }

         if(var5 == 4) {
            --var2;
         }

         if(var5 == 5) {
            ++var2;
         }
      }

      return var1.func_109501_a(this.func_110979_g(), var2, var3, var4, false, var5, (C_100730_lb)null);
   }

   public String func_110791_c_(C_100994_tv var1) {
      return C_100451_alf.field_106118_p[this.field_110980_a].func_106057_a();
   }

   public String func_110793_a() {
      return C_100451_alf.field_106118_p[this.field_110980_a].func_106057_a();
   }

   public C_101040_sq func_110760_w() {
      return C_100451_alf.field_106118_p[this.field_110980_a].func_106016_E();
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      C_100451_alf.field_106118_p[this.field_110980_a].func_105987_a(var1, var2, var3);
   }
}
