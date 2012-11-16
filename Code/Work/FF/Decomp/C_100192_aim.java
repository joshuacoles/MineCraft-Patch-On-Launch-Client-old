import java.util.Random;

public class C_100192_aim extends C_100451_alf {

   protected C_100192_aim(int var1, C_100664_afg var2) {
      super(var1, var2);
      this.field_106165_cl = 97;
      if(var2 == C_100664_afg.field_109006_f) {
         ++this.field_106165_cl;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(var5 != 0 && var5 != 1) {
         int var6 = this.func_106319_b_(var1, var2, var3, var4);
         int var7 = this.field_106165_cl;
         if((var6 & 8) != 0) {
            var7 -= 16;
         }

         int var8 = var6 & 3;
         boolean var9 = (var6 & 4) != 0;
         if(var9) {
            if(var8 == 0 && var5 == 2) {
               var7 = -var7;
            } else if(var8 == 1 && var5 == 5) {
               var7 = -var7;
            } else if(var8 == 2 && var5 == 3) {
               var7 = -var7;
            } else if(var8 == 3 && var5 == 4) {
               var7 = -var7;
            }
         } else {
            if(var8 == 0 && var5 == 5) {
               var7 = -var7;
            } else if(var8 == 1 && var5 == 3) {
               var7 = -var7;
            } else if(var8 == 2 && var5 == 4) {
               var7 = -var7;
            } else if(var8 == 3 && var5 == 2) {
               var7 = -var7;
            }

            if((var6 & 16) != 0) {
               var7 = -var7;
            }
         }

         return var7;
      } else {
         return this.field_106165_cl;
      }
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = this.func_106319_b_(var1, var2, var3, var4);
      return (var5 & 4) != 0;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 7;
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
      this.func_106321_e(this.func_106319_b_(var1, var2, var3, var4));
   }

   public int func_106322_d(C_100837_xo var1, int var2, int var3, int var4) {
      return this.func_106319_b_(var1, var2, var3, var4) & 3;
   }

   public boolean func_106320_a_(C_100837_xo var1, int var2, int var3, int var4) {
      return (this.func_106319_b_(var1, var2, var3, var4) & 4) != 0;
   }

   private void func_106321_e(int var1) {
      float var2 = 0.1875F;
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      int var3 = var1 & 3;
      boolean var4 = (var1 & 4) != 0;
      boolean var5 = (var1 & 16) != 0;
      if(var3 == 0) {
         if(var4) {
            if(!var5) {
               this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
            } else {
               this.func_106008_a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
            }
         } else {
            this.func_106008_a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      } else if(var3 == 1) {
         if(var4) {
            if(!var5) {
               this.func_106008_a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else {
               this.func_106008_a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
            }
         } else {
            this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }
      } else if(var3 == 2) {
         if(var4) {
            if(!var5) {
               this.func_106008_a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
            } else {
               this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
            }
         } else {
            this.func_106008_a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }
      } else if(var3 == 3) {
         if(var4) {
            if(!var5) {
               this.func_106008_a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
            } else {
               this.func_106008_a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
         } else {
            this.func_106008_a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }
      }

   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {}

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(this.field_106204_cB == C_100664_afg.field_109006_f) {
         return true;
      } else {
         int var10 = this.func_106319_b_(var1, var2, var3, var4);
         int var11 = var10 & 7;
         var11 ^= 4;
         if((var10 & 8) == 0) {
            var1.func_109488_c(var2, var3, var4, var11);
            var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         } else {
            var1.func_109488_c(var2, var3 - 1, var4, var11);
            var1.func_109511_e(var2, var3 - 1, var4, var2, var3, var4);
         }

         var1.func_109492_a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void func_106323_a(C_100873_xe var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.func_106319_b_(var1, var2, var3, var4);
      boolean var7 = (var6 & 4) != 0;
      if(var7 != var5) {
         int var8 = var6 & 7;
         var8 ^= 4;
         if((var6 & 8) == 0) {
            var1.func_109488_c(var2, var3, var4, var8);
            var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         } else {
            var1.func_109488_c(var2, var3 - 1, var4, var8);
            var1.func_109511_e(var2, var3 - 1, var4, var2, var3, var4);
         }

         var1.func_109492_a((C_101095_qg)null, 1003, var2, var3, var4, 0);
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      if((var6 & 8) == 0) {
         boolean var7 = false;
         if(var1.func_109349_a(var2, var3 + 1, var4) != this.field_106162_cm) {
            var1.func_109422_e(var2, var3, var4, 0);
            var7 = true;
         }

         if(!var1.func_109348_t(var2, var3 - 1, var4)) {
            var1.func_109422_e(var2, var3, var4, 0);
            var7 = true;
            if(var1.func_109349_a(var2, var3 + 1, var4) == this.field_106162_cm) {
               var1.func_109422_e(var2, var3 + 1, var4, 0);
            }
         }

         if(var7) {
            if(!var1.field_109557_J) {
               this.func_106035_c(var1, var2, var3, var4, var6, 0);
            }
         } else {
            boolean var8 = var1.func_109425_z(var2, var3, var4) || var1.func_109425_z(var2, var3 + 1, var4);
            if((var8 || var5 > 0 && C_100451_alf.field_106118_p[var5].func_106028_i() || var5 == 0) && var5 != this.field_106162_cm) {
               this.func_106323_a(var1, var2, var3, var4, var8);
            }
         }
      } else {
         if(var1.func_109349_a(var2, var3 - 1, var4) != this.field_106162_cm) {
            var1.func_109422_e(var2, var3, var4, 0);
         }

         if(var5 > 0 && var5 != this.field_106162_cm) {
            this.func_106017_a(var1, var2, var3 - 1, var4, var5);
         }
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return (var1 & 8) != 0?0:(this.field_106204_cB == C_100664_afg.field_109006_f?C_100992_tt.field_110914_aB.field_110891_cf:C_100992_tt.field_110938_av.field_110891_cf);
   }

   public C_100383_amu func_105992_a(C_100873_xe var1, int var2, int var3, int var4, C_100387_amw var5, C_100387_amw var6) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_105992_a(var1, var2, var3, var4, var5, var6);
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var3 >= 255?false:var1.func_109348_t(var2, var3 - 1, var4) && super.func_106023_b(var1, var2, var3, var4) && super.func_106023_b(var1, var2, var3 + 1, var4);
   }

   public int func_106058_q_() {
      return 1;
   }

   public int func_106319_b_(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      boolean var6 = (var5 & 8) != 0;
      int var7;
      int var8;
      if(var6) {
         var7 = var1.func_109357_g(var2, var3 - 1, var4);
         var8 = var5;
      } else {
         var7 = var5;
         var8 = var1.func_109357_g(var2, var3 + 1, var4);
      }

      boolean var9 = (var8 & 1) != 0;
      return var7 & 7 | (var6?8:0) | (var9?16:0);
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return this.field_106204_cB == C_100664_afg.field_109006_f?C_100992_tt.field_110914_aB.field_110891_cf:C_100992_tt.field_110938_av.field_110891_cf;
   }
}
