import java.util.List;
import java.util.Random;

public class C_100689_aeo extends C_100699_aer {

   private int field_108437_a;


   public C_100689_aeo(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
      this.field_108437_a = Math.max(var4.func_108329_b(), var4.func_108325_d());
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      boolean var4 = false;

      int var5;
      C_100767_adx var6;
      for(var5 = var3.nextInt(5); var5 < this.field_108437_a - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.func_108415_a((C_100691_aen)var1, var2, var3, 0, var5);
         if(var6 != null) {
            var5 += Math.max(var6.field_108404_e.func_108329_b(), var6.field_108404_e.func_108325_d());
            var4 = true;
         }
      }

      for(var5 = var3.nextInt(5); var5 < this.field_108437_a - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.func_108417_b((C_100691_aen)var1, var2, var3, 0, var5);
         if(var6 != null) {
            var5 += Math.max(var6.field_108404_e.func_108329_b(), var6.field_108404_e.func_108325_d());
            var4 = true;
         }
      }

      if(var4 && var3.nextInt(3) > 0) {
         switch(this.field_108402_f) {
         case 0:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f - 2, 1, this.func_108394_c());
            break;
         case 1:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
            break;
         case 2:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, 1, this.func_108394_c());
            break;
         case 3:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108337_d - 2, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
         }
      }

      if(var4 && var3.nextInt(3) > 0) {
         switch(this.field_108402_f) {
         case 0:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f - 2, 3, this.func_108394_c());
            break;
         case 1:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
            break;
         case 2:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, 3, this.func_108394_c());
            break;
         case 3:
            C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108337_d - 2, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
         }
      }

   }

   public static C_100516_abo func_108436_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 7 * C_100650_jv.func_108929_a(var2, 3, 5); var7 >= 7; var7 -= 7) {
         C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 3, 3, var7, var6);
         if(C_100767_adx.func_108401_a(var1, var8) == null) {
            return var8;
         }
      }

      return null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      int var4 = this.func_108413_d(C_100451_alf.field_106083_I.field_106162_cm, 0);

      for(int var5 = this.field_108404_e.field_108341_a; var5 <= this.field_108404_e.field_108337_d; ++var5) {
         for(int var6 = this.field_108404_e.field_108340_c; var6 <= this.field_108404_e.field_108336_f; ++var6) {
            if(var3.func_108334_b(var5, 64, var6)) {
               int var7 = var1.func_109459_i(var5, var6) - 1;
               var1.func_109378_b(var5, var7, var6, var4);
            }
         }
      }

      return true;
   }
}
