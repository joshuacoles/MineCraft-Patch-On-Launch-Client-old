
public class C_100436_alo extends C_100451_alf {

   protected C_100436_alo(int var1, C_100664_afg var2) {
      super(var1, var2);
      this.field_106165_cl = 84;
      if(var2 == C_100664_afg.field_109006_f) {
         ++this.field_106165_cl;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
      this.func_106034_a(C_101040_sq.field_111415_d);
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return !func_106417_g(var1.func_109357_g(var2, var3, var4));
   }

   public int func_106013_d() {
      return 0;
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106031_b_(var1, var2, var3, var4);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106021_e(var1, var2, var3, var4);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      this.func_106418_e(var1.func_109357_g(var2, var3, var4));
   }

   public void func_106059_f() {
      float var1 = 0.1875F;
      this.func_106008_a(0.0F, 0.5F - var1 / 2.0F, 0.0F, 1.0F, 0.5F + var1 / 2.0F, 1.0F);
   }

   public void func_106418_e(int var1) {
      float var2 = 0.1875F;
      if((var1 & 8) != 0) {
         this.func_106008_a(0.0F, 1.0F - var2, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, var2, 1.0F);
      }

      if(func_106417_g(var1)) {
         if((var1 & 3) == 0) {
            this.func_106008_a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }

         if((var1 & 3) == 1) {
            this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }

         if((var1 & 3) == 2) {
            this.func_106008_a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if((var1 & 3) == 3) {
            this.func_106008_a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      }

   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {}

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(this.field_106204_cB == C_100664_afg.field_109006_f) {
         return true;
      } else {
         int var10 = var1.func_109357_g(var2, var3, var4);
         var1.func_109488_c(var2, var3, var4, var10 ^ 4);
         var1.func_109492_a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void func_106419_a(C_100873_xe var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      boolean var7 = (var6 & 4) > 0;
      if(var7 != var5) {
         var1.func_109488_c(var2, var3, var4, var6 ^ 4);
         var1.func_109492_a((C_101095_qg)null, 1003, var2, var3, var4, 0);
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         int var7 = var2;
         int var8 = var4;
         if((var6 & 3) == 0) {
            var8 = var4 + 1;
         }

         if((var6 & 3) == 1) {
            --var8;
         }

         if((var6 & 3) == 2) {
            var7 = var2 + 1;
         }

         if((var6 & 3) == 3) {
            --var7;
         }

         if(!func_106420_j(var1.func_109349_a(var7, var3, var8))) {
            var1.func_109422_e(var2, var3, var4, 0);
            this.func_106035_c(var1, var2, var3, var4, var6, 0);
         }

         boolean var9 = var1.func_109425_z(var2, var3, var4);
         if(var9 || var5 > 0 && C_100451_alf.field_106118_p[var5].func_106028_i() || var5 == 0) {
            this.func_106419_a(var1, var2, var3, var4, var9);
         }

      }
   }

   public C_100383_amu func_105992_a(C_100873_xe var1, int var2, int var3, int var4, C_100387_amw var5, C_100387_amw var6) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_105992_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      int var9 = 0;
      if(var5 == 2) {
         var9 = 0;
      }

      if(var5 == 3) {
         var9 = 1;
      }

      if(var5 == 4) {
         var9 = 2;
      }

      if(var5 == 5) {
         var9 = 3;
      }

      int var10 = C_100451_alf.field_106133_bn.field_106162_cm;
      if(var5 != 1 && var5 != 0 && var7 > 0.5F) {
         var9 |= 8;
      }

      var1.func_109394_d(var2, var3, var4, var10, var9);
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         return false;
      } else if(var5 == 1) {
         return false;
      } else {
         if(var5 == 2) {
            ++var4;
         }

         if(var5 == 3) {
            --var4;
         }

         if(var5 == 4) {
            ++var2;
         }

         if(var5 == 5) {
            --var2;
         }

         return func_106420_j(var1.func_109349_a(var2, var3, var4));
      }
   }

   public static boolean func_106417_g(int var0) {
      return (var0 & 4) != 0;
   }

   private static boolean func_106420_j(int var0) {
      if(var0 <= 0) {
         return false;
      } else {
         C_100451_alf var1 = C_100451_alf.field_106118_p[var0];
         return var1 != null && var1.field_106204_cB.func_108980_k() && var1.func_105977_b() || var1 == C_100451_alf.field_106142_bg;
      }
   }
}
