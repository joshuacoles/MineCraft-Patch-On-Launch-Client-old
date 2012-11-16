import java.util.List;
import java.util.Random;

abstract class C_100775_adu extends C_100767_adx {

   protected C_100775_adu(int var1) {
      super(var1);
   }

   protected void func_108470_a(C_100873_xe var1, Random var2, C_100516_abo var3, C_100776_adv var4, int var5, int var6, int var7) {
      switch(C_100754_ade.field_109654_a[var4.ordinal()]) {
      case 1:
      default:
         this.func_108384_a(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, 0, 0, false);
         break;
      case 2:
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 1, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 2, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 2, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 2, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106200_aH.field_106162_cm, 0, var5 + 1, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106200_aH.field_106162_cm, 8, var5 + 1, var6 + 1, var7, var3);
         break;
      case 3:
         this.func_108400_a(var1, 0, 0, var5 + 1, var6, var7, var3);
         this.func_108400_a(var1, 0, 0, var5 + 1, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5 + 1, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5 + 2, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5 + 2, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, var5 + 2, var6, var7, var3);
         break;
      case 4:
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 1, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 2, var6 + 2, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 2, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, var5 + 2, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106191_aO.field_106162_cm, 0, var5 + 1, var6, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106191_aO.field_106162_cm, 8, var5 + 1, var6 + 1, var7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106182_aU.field_106162_cm, this.func_108380_c(C_100451_alf.field_106182_aU.field_106162_cm, 4), var5 + 2, var6 + 1, var7 + 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106182_aU.field_106162_cm, this.func_108380_c(C_100451_alf.field_106182_aU.field_106162_cm, 3), var5 + 2, var6 + 1, var7 - 1, var3);
      }

   }

   protected C_100776_adv func_108467_a(Random var1) {
      int var2 = var1.nextInt(5);
      switch(var2) {
      case 0:
      case 1:
      default:
         return C_100776_adv.field_109830_a;
      case 2:
         return C_100776_adv.field_109828_b;
      case 3:
         return C_100776_adv.field_109829_c;
      case 4:
         return C_100776_adv.field_109826_d;
      }
   }

   protected C_100767_adx func_108468_a(C_100734_adr var1, List var2, Random var3, int var4, int var5) {
      switch(this.field_108402_f) {
      case 0:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a + var4, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108336_f + 1, this.field_108402_f, this.func_108394_c());
      case 1:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108340_c + var4, this.field_108402_f, this.func_108394_c());
      case 2:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a + var4, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108340_c - 1, this.field_108402_f, this.func_108394_c());
      case 3:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108340_c + var4, this.field_108402_f, this.func_108394_c());
      default:
         return null;
      }
   }

   protected C_100767_adx func_108465_b(C_100734_adr var1, List var2, Random var3, int var4, int var5) {
      switch(this.field_108402_f) {
      case 0:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 1, this.func_108394_c());
      case 1:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
      case 2:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 1, this.func_108394_c());
      case 3:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
      default:
         return null;
      }
   }

   protected C_100767_adx func_108469_c(C_100734_adr var1, List var2, Random var3, int var4, int var5) {
      switch(this.field_108402_f) {
      case 0:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 3, this.func_108394_c());
      case 1:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
      case 2:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 3, this.func_108394_c());
      case 3:
         return C_100810_adb.func_109987_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
      default:
         return null;
      }
   }

   protected static boolean func_108466_a(C_100516_abo var0) {
      return var0 != null && var0.field_108339_b > 10;
   }
}
