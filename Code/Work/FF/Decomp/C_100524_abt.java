import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class C_100524_abt extends C_100767_adx {

   private List field_108405_a = new LinkedList();


   public C_100524_abt(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.field_108404_e = new C_100516_abo(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      int var4 = this.func_108394_c();
      int var6 = this.field_108404_e.func_108328_c() - 3 - 1;
      if(var6 <= 0) {
         var6 = 1;
      }

      int var5;
      C_100767_adx var7;
      C_100516_abo var8;
      for(var5 = 0; var5 < this.field_108404_e.func_108329_b(); var5 += 4) {
         var5 += var3.nextInt(this.field_108404_e.func_108329_b());
         if(var5 + 3 > this.field_108404_e.func_108329_b()) {
            break;
         }

         var7 = C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var3.nextInt(var6) + 1, this.field_108404_e.field_108340_c - 1, 2, var4);
         if(var7 != null) {
            var8 = var7.func_108381_b();
            this.field_108405_a.add(new C_100516_abo(var8.field_108341_a, var8.field_108339_b, this.field_108404_e.field_108340_c, var8.field_108337_d, var8.field_108338_e, this.field_108404_e.field_108340_c + 1));
         }
      }

      for(var5 = 0; var5 < this.field_108404_e.func_108329_b(); var5 += 4) {
         var5 += var3.nextInt(this.field_108404_e.func_108329_b());
         if(var5 + 3 > this.field_108404_e.func_108329_b()) {
            break;
         }

         var7 = C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var3.nextInt(var6) + 1, this.field_108404_e.field_108336_f + 1, 0, var4);
         if(var7 != null) {
            var8 = var7.func_108381_b();
            this.field_108405_a.add(new C_100516_abo(var8.field_108341_a, var8.field_108339_b, this.field_108404_e.field_108336_f - 1, var8.field_108337_d, var8.field_108338_e, this.field_108404_e.field_108336_f));
         }
      }

      for(var5 = 0; var5 < this.field_108404_e.func_108325_d(); var5 += 4) {
         var5 += var3.nextInt(this.field_108404_e.func_108325_d());
         if(var5 + 3 > this.field_108404_e.func_108325_d()) {
            break;
         }

         var7 = C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var3.nextInt(var6) + 1, this.field_108404_e.field_108340_c + var5, 1, var4);
         if(var7 != null) {
            var8 = var7.func_108381_b();
            this.field_108405_a.add(new C_100516_abo(this.field_108404_e.field_108341_a, var8.field_108339_b, var8.field_108340_c, this.field_108404_e.field_108341_a + 1, var8.field_108338_e, var8.field_108336_f));
         }
      }

      for(var5 = 0; var5 < this.field_108404_e.func_108325_d(); var5 += 4) {
         var5 += var3.nextInt(this.field_108404_e.func_108325_d());
         if(var5 + 3 > this.field_108404_e.func_108325_d()) {
            break;
         }

         var7 = C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var3.nextInt(var6) + 1, this.field_108404_e.field_108340_c + var5, 3, var4);
         if(var7 != null) {
            var8 = var7.func_108381_b();
            this.field_108405_a.add(new C_100516_abo(this.field_108404_e.field_108337_d - 1, var8.field_108339_b, var8.field_108340_c, this.field_108404_e.field_108337_d, var8.field_108338_e, var8.field_108336_f));
         }
      }

   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, this.field_108404_e.field_108337_d, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f, C_100451_alf.field_106120_y.field_106162_cm, 0, true);
         this.func_108384_a(var1, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b + 1, this.field_108404_e.field_108340_c, this.field_108404_e.field_108337_d, Math.min(this.field_108404_e.field_108339_b + 3, this.field_108404_e.field_108338_e), this.field_108404_e.field_108336_f, 0, 0, false);
         Iterator var4 = this.field_108405_a.iterator();

         while(var4.hasNext()) {
            C_100516_abo var5 = (C_100516_abo)var4.next();
            this.func_108384_a(var1, var3, var5.field_108341_a, var5.field_108338_e - 2, var5.field_108340_c, var5.field_108337_d, var5.field_108338_e, var5.field_108336_f, 0, 0, false);
         }

         this.func_108398_a(var1, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b + 4, this.field_108404_e.field_108340_c, this.field_108404_e.field_108337_d, this.field_108404_e.field_108338_e, this.field_108404_e.field_108336_f, 0, false);
         return true;
      }
   }
}
