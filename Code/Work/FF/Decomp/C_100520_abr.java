import java.util.List;
import java.util.Random;

public class C_100520_abr extends C_100767_adx {

   private final boolean field_108555_a;
   private final boolean field_108553_b;
   private boolean field_108554_c;
   private int field_108552_d;


   public C_100520_abr(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
      this.field_108555_a = var2.nextInt(3) == 0;
      this.field_108553_b = !this.field_108555_a && var2.nextInt(23) == 0;
      if(this.field_108402_f != 2 && this.field_108402_f != 0) {
         this.field_108552_d = var3.func_108329_b() / 5;
      } else {
         this.field_108552_d = var3.func_108325_d() / 5;
      }

   }

   public static C_100516_abo func_108551_a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      C_100516_abo var6 = new C_100516_abo(var2, var3, var4, var2, var3 + 2, var4);

      int var7;
      for(var7 = var1.nextInt(3) + 2; var7 > 0; --var7) {
         int var8 = var7 * 5;
         switch(var5) {
         case 0:
            var6.field_108337_d = var2 + 2;
            var6.field_108336_f = var4 + (var8 - 1);
            break;
         case 1:
            var6.field_108341_a = var2 - (var8 - 1);
            var6.field_108336_f = var4 + 2;
            break;
         case 2:
            var6.field_108337_d = var2 + 2;
            var6.field_108340_c = var4 - (var8 - 1);
            break;
         case 3:
            var6.field_108337_d = var2 + (var8 - 1);
            var6.field_108336_f = var4 + 2;
         }

         if(C_100767_adx.func_108401_a(var0, var6) == null) {
            break;
         }
      }

      return var7 > 0?var6:null;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      int var4 = this.func_108394_c();
      int var5 = var3.nextInt(4);
      switch(this.field_108402_f) {
      case 0:
         if(var5 <= 1) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108336_f + 1, this.field_108402_f, var4);
         } else if(var5 == 2) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108336_f - 3, 1, var4);
         } else {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108336_f - 3, 3, var4);
         }
         break;
      case 1:
         if(var5 <= 1) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c, this.field_108402_f, var4);
         } else if(var5 == 2) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c - 1, 2, var4);
         } else {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108336_f + 1, 0, var4);
         }
         break;
      case 2:
         if(var5 <= 1) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c - 1, this.field_108402_f, var4);
         } else if(var5 == 2) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c, 1, var4);
         } else {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c, 3, var4);
         }
         break;
      case 3:
         if(var5 <= 1) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c, this.field_108402_f, var4);
         } else if(var5 == 2) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d - 3, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108340_c - 1, 2, var4);
         } else {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d - 3, this.field_108404_e.field_108339_b - 1 + var3.nextInt(3), this.field_108404_e.field_108336_f + 1, 0, var4);
         }
      }

      if(var4 < 8) {
         int var6;
         int var7;
         if(this.field_108402_f != 2 && this.field_108402_f != 0) {
            for(var6 = this.field_108404_e.field_108341_a + 3; var6 + 3 <= this.field_108404_e.field_108337_d; var6 += 5) {
               var7 = var3.nextInt(5);
               if(var7 == 0) {
                  C_100522_abq.func_108558_a(var1, var2, var3, var6, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, var4 + 1);
               } else if(var7 == 1) {
                  C_100522_abq.func_108558_a(var1, var2, var3, var6, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, var4 + 1);
               }
            }
         } else {
            for(var6 = this.field_108404_e.field_108340_c + 3; var6 + 3 <= this.field_108404_e.field_108336_f; var6 += 5) {
               var7 = var3.nextInt(5);
               if(var7 == 0) {
                  C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, var6, 1, var4 + 1);
               } else if(var7 == 1) {
                  C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, var6, 3, var4 + 1);
               }
            }
         }
      }

   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         int var8 = this.field_108552_d * 5 - 1;
         this.func_108384_a(var1, var3, 0, 0, 0, 2, 1, var8, 0, 0, false);
         this.func_108396_a(var1, var3, var2, 0.8F, 0, 2, 0, 2, 2, var8, 0, 0, false);
         if(this.field_108553_b) {
            this.func_108396_a(var1, var3, var2, 0.6F, 0, 0, 0, 2, 1, var8, C_100451_alf.field_106096_Z.field_106162_cm, 0, false);
         }

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < this.field_108552_d; ++var9) {
            var10 = 2 + var9 * 5;
            this.func_108384_a(var1, var3, 0, 0, var10, 0, 1, var10, C_100451_alf.field_106147_bc.field_106162_cm, 0, false);
            this.func_108384_a(var1, var3, 2, 0, var10, 2, 1, var10, C_100451_alf.field_106147_bc.field_106162_cm, 0, false);
            if(var2.nextInt(4) == 0) {
               this.func_108384_a(var1, var3, 0, 2, var10, 0, 2, var10, C_100451_alf.field_106075_A.field_106162_cm, 0, false);
               this.func_108384_a(var1, var3, 2, 2, var10, 2, 2, var10, C_100451_alf.field_106075_A.field_106162_cm, 0, false);
            } else {
               this.func_108384_a(var1, var3, 0, 2, var10, 2, 2, var10, C_100451_alf.field_106075_A.field_106162_cm, 0, false);
            }

            this.func_108395_a(var1, var3, var2, 0.1F, 0, 2, var10 - 1, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.1F, 2, 2, var10 - 1, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.1F, 0, 2, var10 + 1, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.1F, 2, 2, var10 + 1, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.05F, 0, 2, var10 - 2, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.05F, 2, 2, var10 - 2, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.05F, 0, 2, var10 + 2, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.05F, 2, 2, var10 + 2, C_100451_alf.field_106096_Z.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.05F, 1, 2, var10 - 1, C_100451_alf.field_106208_at.field_106162_cm, 0);
            this.func_108395_a(var1, var3, var2, 0.05F, 1, 2, var10 + 1, C_100451_alf.field_106208_at.field_106162_cm, 0);
            if(var2.nextInt(100) == 0) {
               this.func_108393_a(var1, var3, var2, 2, 0, var10 - 1, C_100522_abq.func_108556_a(), 3 + var2.nextInt(4));
            }

            if(var2.nextInt(100) == 0) {
               this.func_108393_a(var1, var3, var2, 0, 0, var10 + 1, C_100522_abq.func_108556_a(), 3 + var2.nextInt(4));
            }

            if(this.field_108553_b && !this.field_108554_c) {
               var11 = this.func_108379_a(0);
               int var12 = var10 - 1 + var2.nextInt(3);
               int var13 = this.func_108382_a(1, var12);
               var12 = this.func_108389_b(1, var12);
               if(var3.func_108334_b(var13, var11, var12)) {
                  this.field_108554_c = true;
                  var1.func_109422_e(var13, var11, var12, C_100451_alf.field_106220_av.field_106162_cm);
                  C_100416_amh var14 = (C_100416_amh)var1.func_109353_p(var13, var11, var12);
                  if(var14 != null) {
                     var14.func_102976_a("CaveSpider");
                  }
               }
            }
         }

         for(var9 = 0; var9 <= 2; ++var9) {
            for(var10 = 0; var10 <= var8; ++var10) {
               var11 = this.func_108378_a(var1, var9, -1, var10, var3);
               if(var11 == 0) {
                  this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, var9, -1, var10, var3);
               }
            }
         }

         if(this.field_108555_a) {
            for(var9 = 0; var9 <= var8; ++var9) {
               var10 = this.func_108378_a(var1, 1, -1, var9, var3);
               if(var10 > 0 && C_100451_alf.field_106117_q[var10]) {
                  this.func_108395_a(var1, var3, var2, 0.7F, 1, 0, var9, C_100451_alf.field_106186_aJ.field_106162_cm, this.func_108380_c(C_100451_alf.field_106186_aJ.field_106162_cm, 0));
               }
            }
         }

         return true;
      }
   }
}
