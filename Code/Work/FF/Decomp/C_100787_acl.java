import java.util.Iterator;
import java.util.List;
import java.util.Random;

abstract class C_100787_acl extends C_100767_adx {

   protected C_100787_acl(int var1) {
      super(var1);
   }

   private int func_108511_a(List var1) {
      boolean var2 = false;
      int var3 = 0;

      C_100785_acm var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 += var5.field_109905_b) {
         var5 = (C_100785_acm)var4.next();
         if(var5.field_109903_d > 0 && var5.field_109906_c < var5.field_109903_d) {
            var2 = true;
         }
      }

      return var2?var3:-1;
   }

   private C_100787_acl func_108510_a(C_100779_acp var1, List var2, List var3, Random var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = this.func_108511_a(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while(var12 < 5 && var11) {
         ++var12;
         int var13 = var4.nextInt(var10);
         Iterator var14 = var2.iterator();

         while(var14.hasNext()) {
            C_100785_acm var15 = (C_100785_acm)var14.next();
            var13 -= var15.field_109905_b;
            if(var13 < 0) {
               if(!var15.func_109901_a(var9) || var15 == var1.field_108520_a && !var15.field_109904_e) {
                  break;
               }

               C_100787_acl var16 = C_100536_aby.func_108651_a(var15, var3, var4, var5, var6, var7, var8, var9);
               if(var16 != null) {
                  ++var15.field_109906_c;
                  var1.field_108520_a = var15;
                  if(!var15.func_109902_a()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      return C_100542_aca.func_108521_a(var3, var4, var5, var6, var7, var8, var9);
   }

   private C_100767_adx func_108512_a(C_100779_acp var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if(Math.abs(var4 - var1.func_108381_b().field_108341_a) <= 112 && Math.abs(var6 - var1.func_108381_b().field_108340_c) <= 112) {
         List var10 = var1.field_108518_b;
         if(var9) {
            var10 = var1.field_108519_c;
         }

         C_100787_acl var11 = this.func_108510_a(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
         if(var11 != null) {
            var2.add(var11);
            var1.field_108517_d.add(var11);
         }

         return var11;
      } else {
         return C_100542_aca.func_108521_a(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   protected C_100767_adx func_108515_a(C_100779_acp var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.field_108402_f) {
      case 0:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a + var4, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108336_f + 1, this.field_108402_f, this.func_108394_c(), var6);
      case 1:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108340_c + var4, this.field_108402_f, this.func_108394_c(), var6);
      case 2:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a + var4, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108340_c - 1, this.field_108402_f, this.func_108394_c(), var6);
      case 3:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var5, this.field_108404_e.field_108340_c + var4, this.field_108402_f, this.func_108394_c(), var6);
      default:
         return null;
      }
   }

   protected C_100767_adx func_108514_b(C_100779_acp var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.field_108402_f) {
      case 0:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 1, this.func_108394_c(), var6);
      case 1:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c(), var6);
      case 2:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 1, this.func_108394_c(), var6);
      case 3:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c(), var6);
      default:
         return null;
      }
   }

   protected C_100767_adx func_108509_c(C_100779_acp var1, List var2, Random var3, int var4, int var5, boolean var6) {
      switch(this.field_108402_f) {
      case 0:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 3, this.func_108394_c(), var6);
      case 1:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c(), var6);
      case 2:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108340_c + var5, 3, this.func_108394_c(), var6);
      case 3:
         return this.func_108512_a(var1, var2, var3, this.field_108404_e.field_108341_a + var5, this.field_108404_e.field_108339_b + var4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c(), var6);
      default:
         return null;
      }
   }

   protected static boolean func_108513_a(C_100516_abo var0) {
      return var0 != null && var0.field_108339_b > 10;
   }
}
