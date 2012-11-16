import java.util.Random;

public class C_100127_akg extends C_100451_alf {

   private final boolean field_106264_a;


   public static final boolean func_106258_e_(C_100873_xe var0, int var1, int var2, int var3) {
      int var4 = var0.func_109349_a(var1, var2, var3);
      return var4 == C_100451_alf.field_106186_aJ.field_106162_cm || var4 == C_100451_alf.field_106088_W.field_106162_cm || var4 == C_100451_alf.field_106095_X.field_106162_cm;
   }

   public static final boolean func_106259_d(int var0) {
      return var0 == C_100451_alf.field_106186_aJ.field_106162_cm || var0 == C_100451_alf.field_106088_W.field_106162_cm || var0 == C_100451_alf.field_106095_X.field_106162_cm;
   }

   protected C_100127_akg(int var1, int var2, boolean var3) {
      super(var1, var2, C_100664_afg.field_109027_q);
      this.field_106264_a = var3;
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.func_106034_a(C_101040_sq.field_111416_e);
   }

   public boolean func_106263_p() {
      return this.field_106264_a;
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public C_100383_amu func_105992_a(C_100873_xe var1, int var2, int var3, int var4, C_100387_amw var5, C_100387_amw var6) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_105992_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      if(var5 >= 2 && var5 <= 5) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public int func_106029_a(int var1, int var2) {
      if(this.field_106264_a) {
         if(this.field_106162_cm == C_100451_alf.field_106088_W.field_106162_cm && (var2 & 8) == 0) {
            return this.field_106165_cl - 16;
         }
      } else if(var2 >= 6) {
         return this.field_106165_cl - 16;
      }

      return this.field_106165_cl;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 9;
   }

   public int func_106063_a(Random var1) {
      return 1;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109348_t(var2, var3 - 1, var4);
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J) {
         this.func_106261_a(var1, var2, var3, var4, true);
         if(this.field_106162_cm == C_100451_alf.field_106088_W.field_106162_cm) {
            this.func_106017_a(var1, var2, var3, var4, this.field_106162_cm);
         }
      }

   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         int var7 = var6;
         if(this.field_106264_a) {
            var7 = var6 & 7;
         }

         boolean var8 = false;
         if(!var1.func_109348_t(var2, var3 - 1, var4)) {
            var8 = true;
         }

         if(var7 == 2 && !var1.func_109348_t(var2 + 1, var3, var4)) {
            var8 = true;
         }

         if(var7 == 3 && !var1.func_109348_t(var2 - 1, var3, var4)) {
            var8 = true;
         }

         if(var7 == 4 && !var1.func_109348_t(var2, var3, var4 - 1)) {
            var8 = true;
         }

         if(var7 == 5 && !var1.func_109348_t(var2, var3, var4 + 1)) {
            var8 = true;
         }

         if(var8) {
            this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
            var1.func_109422_e(var2, var3, var4, 0);
         } else if(this.field_106162_cm == C_100451_alf.field_106088_W.field_106162_cm) {
            boolean var9 = var1.func_109425_z(var2, var3, var4);
            var9 = var9 || this.func_106257_a(var1, var2, var3, var4, var6, true, 0) || this.func_106257_a(var1, var2, var3, var4, var6, false, 0);
            boolean var10 = false;
            if(var9 && (var6 & 8) == 0) {
               var1.func_109488_c(var2, var3, var4, var7 | 8);
               var10 = true;
            } else if(!var9 && (var6 & 8) != 0) {
               var1.func_109488_c(var2, var3, var4, var7);
               var10 = true;
            }

            if(var10) {
               var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
               if(var7 == 2 || var7 == 3 || var7 == 4 || var7 == 5) {
                  var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
               }
            }
         } else if(var5 > 0 && C_100451_alf.field_106118_p[var5].func_106028_i() && !this.field_106264_a && C_100126_akh.func_106490_a(new C_100126_akh(this, var1, var2, var3, var4)) == 3) {
            this.func_106261_a(var1, var2, var3, var4, false);
         }

      }
   }

   private void func_106261_a(C_100873_xe var1, int var2, int var3, int var4, boolean var5) {
      if(!var1.field_109557_J) {
         (new C_100126_akh(this, var1, var2, var3, var4)).func_106491_a(var1.func_109425_z(var2, var3, var4), var5);
      }
   }

   private boolean func_106257_a(C_100873_xe var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var7 >= 8) {
         return false;
      } else {
         int var8 = var5 & 7;
         boolean var9 = true;
         switch(var8) {
         case 0:
            if(var6) {
               ++var4;
            } else {
               --var4;
            }
            break;
         case 1:
            if(var6) {
               --var2;
            } else {
               ++var2;
            }
            break;
         case 2:
            if(var6) {
               --var2;
            } else {
               ++var2;
               ++var3;
               var9 = false;
            }

            var8 = 1;
            break;
         case 3:
            if(var6) {
               --var2;
               ++var3;
               var9 = false;
            } else {
               ++var2;
            }

            var8 = 1;
            break;
         case 4:
            if(var6) {
               ++var4;
            } else {
               --var4;
               ++var3;
               var9 = false;
            }

            var8 = 0;
            break;
         case 5:
            if(var6) {
               ++var4;
               ++var3;
               var9 = false;
            } else {
               --var4;
            }

            var8 = 0;
         }

         return this.func_106262_a(var1, var2, var3, var4, var6, var7, var8)?true:var9 && this.func_106262_a(var1, var2, var3 - 1, var4, var6, var7, var8);
      }
   }

   private boolean func_106262_a(C_100873_xe var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      int var8 = var1.func_109349_a(var2, var3, var4);
      if(var8 == C_100451_alf.field_106088_W.field_106162_cm) {
         int var9 = var1.func_109357_g(var2, var3, var4);
         int var10 = var9 & 7;
         if(var7 == 1 && (var10 == 0 || var10 == 4 || var10 == 5)) {
            return false;
         }

         if(var7 == 0 && (var10 == 1 || var10 == 2 || var10 == 3)) {
            return false;
         }

         if((var9 & 8) != 0) {
            if(var1.func_109425_z(var2, var3, var4)) {
               return true;
            }

            return this.func_106257_a(var1, var2, var3, var4, var9, var5, var6 + 1);
         }
      }

      return false;
   }

   public int func_106058_q_() {
      return 0;
   }

   // $FF: synthetic method
   static boolean func_106260_a(C_100127_akg var0) {
      return var0.field_106264_a;
   }
}
