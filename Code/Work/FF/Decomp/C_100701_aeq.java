import java.util.List;
import java.util.Random;

abstract class C_100701_aeq extends C_100767_adx {

   private int field_108418_a;
   protected C_100691_aen field_108419_k;


   protected C_100701_aeq(C_100691_aen var1, int var2) {
      super(var2);
      this.field_108419_k = var1;
   }

   protected C_100767_adx func_108415_a(C_100691_aen var1, List var2, Random var3, int var4, int var5) {
      switch(this.field_108402_f) {
      case 0:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 1, this.func_108394_c());
      case 1:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
      case 2:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 1, this.func_108394_c());
      case 3:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
      default:
         return null;
      }
   }

   protected C_100767_adx func_108417_b(C_100691_aen var1, List var2, Random var3, int var4, int var5) {
      switch(this.field_108402_f) {
      case 0:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 3, this.func_108394_c());
      case 1:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
      case 2:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 3, this.func_108394_c());
      case 3:
         return C_100760_aec.func_109691_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
      default:
         return null;
      }
   }

   protected int func_108412_b(C_100873_xe var1, C_100516_abo var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = this.field_108404_e.field_108340_c; var5 <= this.field_108404_e.field_108336_f; ++var5) {
         for(int var6 = this.field_108404_e.field_108341_a; var6 <= this.field_108404_e.field_108337_d; ++var6) {
            if(var2.func_108334_b(var6, 64, var5)) {
               var3 += Math.max(var1.func_109459_i(var6, var5), var1.field_109576_v.func_112376_i());
               ++var4;
            }
         }
      }

      if(var4 == 0) {
         return -1;
      } else {
         return var3 / var4;
      }
   }

   protected static boolean func_108414_a(C_100516_abo var0) {
      return var0 != null && var0.field_108339_b > 10;
   }

   protected void func_108411_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6) {
      if(this.field_108418_a < var6) {
         for(int var7 = this.field_108418_a; var7 < var6; ++var7) {
            int var8 = this.func_108382_a(var3 + var7, var5);
            int var9 = this.func_108379_a(var4);
            int var10 = this.func_108389_b(var3 + var7, var5);
            if(!var2.func_108334_b(var8, var9, var10)) {
               break;
            }

            ++this.field_108418_a;
            C_101098_qd var11 = new C_101098_qd(var1, this.func_108410_b(var7));
            var11.func_103055_b((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
            var1.func_109513_d(var11);
         }

      }
   }

   protected int func_108410_b(int var1) {
      return 0;
   }

   protected int func_108413_d(int var1, int var2) {
      if(this.field_108419_k.field_108430_b) {
         if(var1 == C_100451_alf.field_106079_M.field_106162_cm) {
            return C_100451_alf.field_106087_T.field_106162_cm;
         }

         if(var1 == C_100451_alf.field_106119_z.field_106162_cm) {
            return C_100451_alf.field_106087_T.field_106162_cm;
         }

         if(var1 == C_100451_alf.field_106075_A.field_106162_cm) {
            return C_100451_alf.field_106087_T.field_106162_cm;
         }

         if(var1 == C_100451_alf.field_106218_aw.field_106162_cm) {
            return C_100451_alf.field_106209_bT.field_106162_cm;
         }

         if(var1 == C_100451_alf.field_106187_aK.field_106162_cm) {
            return C_100451_alf.field_106209_bT.field_106162_cm;
         }

         if(var1 == C_100451_alf.field_106083_I.field_106162_cm) {
            return C_100451_alf.field_106087_T.field_106162_cm;
         }
      }

      return var1;
   }

   protected int func_108416_e(int var1, int var2) {
      if(this.field_108419_k.field_108430_b) {
         if(var1 == C_100451_alf.field_106079_M.field_106162_cm) {
            return 0;
         }

         if(var1 == C_100451_alf.field_106119_z.field_106162_cm) {
            return 0;
         }

         if(var1 == C_100451_alf.field_106075_A.field_106162_cm) {
            return 2;
         }
      }

      return var2;
   }

   protected void func_108400_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, C_100516_abo var7) {
      int var8 = this.func_108413_d(var2, var3);
      int var9 = this.func_108416_e(var2, var3);
      super.func_108400_a(var1, var8, var9, var4, var5, var6, var7);
   }

   protected void func_108384_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      int var12 = this.func_108413_d(var9, 0);
      int var13 = this.func_108416_e(var9, 0);
      int var14 = this.func_108413_d(var10, 0);
      int var15 = this.func_108416_e(var10, 0);
      super.func_108388_a(var1, var2, var3, var4, var5, var6, var7, var8, var12, var13, var14, var15, var11);
   }

   protected void func_108383_b(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, C_100516_abo var7) {
      int var8 = this.func_108413_d(var2, var3);
      int var9 = this.func_108416_e(var2, var3);
      super.func_108383_b(var1, var8, var9, var4, var5, var6, var7);
   }
}
