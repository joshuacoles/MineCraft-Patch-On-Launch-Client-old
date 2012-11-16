import java.util.List;
import java.util.Random;

public class C_100526_abs extends C_100767_adx {

   private final int field_108408_a;
   private final boolean field_108407_b;


   public C_100526_abs(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108408_a = var4;
      this.field_108404_e = var3;
      this.field_108407_b = var3.func_108328_c() > 3;
   }

   public static C_100516_abo func_108406_a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      C_100516_abo var6 = new C_100516_abo(var2, var3, var4, var2, var3 + 2, var4);
      if(var1.nextInt(4) == 0) {
         var6.field_108338_e += 4;
      }

      switch(var5) {
      case 0:
         var6.field_108341_a = var2 - 1;
         var6.field_108337_d = var2 + 3;
         var6.field_108336_f = var4 + 4;
         break;
      case 1:
         var6.field_108341_a = var2 - 4;
         var6.field_108340_c = var4 - 1;
         var6.field_108336_f = var4 + 3;
         break;
      case 2:
         var6.field_108341_a = var2 - 1;
         var6.field_108337_d = var2 + 3;
         var6.field_108340_c = var4 - 4;
         break;
      case 3:
         var6.field_108337_d = var2 + 4;
         var6.field_108340_c = var4 - 1;
         var6.field_108336_f = var4 + 3;
      }

      return C_100767_adx.func_108401_a(var0, var6) != null?null:var6;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      int var4 = this.func_108394_c();
      switch(this.field_108408_a) {
      case 0:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, 1, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, 3, var4);
         break;
      case 1:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, 1, var4);
         break;
      case 2:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, 1, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, 3, var4);
         break;
      case 3:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, var4);
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, 3, var4);
      }

      if(this.field_108407_b) {
         if(var3.nextBoolean()) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b + 3 + 1, this.field_108404_e.field_108340_c - 1, 2, var4);
         }

         if(var3.nextBoolean()) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + 3 + 1, this.field_108404_e.field_108340_c + 1, 1, var4);
         }

         if(var3.nextBoolean()) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + 3 + 1, this.field_108404_e.field_108340_c + 1, 3, var4);
         }

         if(var3.nextBoolean()) {
            C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b + 3 + 1, this.field_108404_e.field_108336_f + 1, 0, var4);
         }
      }

   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         if(this.field_108407_b) {
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108339_b + 3 - 1, this.field_108404_e.field_108336_f, 0, 0, false);
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, this.field_108404_e.field_108337_d, this.field_108404_e.field_108339_b + 3 - 1, this.field_108404_e.field_108336_f - 1, 0, 0, false);
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108338_e - 2, this.field_108404_e.field_108340_c, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f, 0, 0, false);
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108338_e - 2, this.field_108404_e.field_108340_c + 1, this.field_108404_e.field_108337_d, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f - 1, 0, 0, false);
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b + 3, this.field_108404_e.field_108340_c + 1, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108339_b + 3, this.field_108404_e.field_108336_f - 1, 0, 0, false);
         } else {
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f, 0, 0, false);
            this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, this.field_108404_e.field_108337_d, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f - 1, 0, 0, false);
         }

         this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108338_e, this.field_108404_e.field_108340_c + 1, C_100451_alf.field_106075_A.field_106162_cm, 0, false);
         this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f - 1, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f - 1, C_100451_alf.field_106075_A.field_106162_cm, 0, false);
         this.func_108384_a(var1, var3, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c + 1, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108338_e, this.field_108404_e.field_108340_c + 1, C_100451_alf.field_106075_A.field_106162_cm, 0, false);
         this.func_108384_a(var1, var3, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f - 1, this.field_108404_e.field_108337_d - 1, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f - 1, C_100451_alf.field_106075_A.field_106162_cm, 0, false);

         for(int var4 = this.field_108404_e.field_108341_a; var4 <= this.field_108404_e.field_108337_d; ++var4) {
            for(int var5 = this.field_108404_e.field_108340_c; var5 <= this.field_108404_e.field_108336_f; ++var5) {
               int var6 = this.func_108378_a(var1, var4, this.field_108404_e.field_108339_b - 1, var5, var3);
               if(var6 == 0) {
                  this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, var4, this.field_108404_e.field_108339_b - 1, var5, var3);
               }
            }
         }

         return true;
      }
   }
}
