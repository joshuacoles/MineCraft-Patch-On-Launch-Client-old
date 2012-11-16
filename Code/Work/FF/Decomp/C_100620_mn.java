import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100620_mn {

   private List field_108894_a = new ArrayList();
   private List field_108892_b = new ArrayList();
   private final C_100649_jy field_108893_c;
   private int field_108890_d = 0;
   private int field_108891_e = 3;


   public C_100620_mn(C_100649_jy var1) {
      this.field_108893_c = var1;
   }

   public void func_108888_a(int var1, C_100621_mm var2) {
      this.field_108894_a.add(new C_100623_mo(this, var1, var2));
   }

   public void func_108887_a() {
      ArrayList var1 = new ArrayList();
      Iterator var2;
      C_100623_mo var3;
      if(this.field_108890_d++ % this.field_108891_e == 0) {
         var2 = this.field_108894_a.iterator();

         while(var2.hasNext()) {
            var3 = (C_100623_mo)var2.next();
            boolean var4 = this.field_108892_b.contains(var3);
            if(var4) {
               if(this.func_108889_b(var3) && this.func_108886_a(var3)) {
                  continue;
               }

               var3.field_108897_a.func_108029_d();
               this.field_108892_b.remove(var3);
            }

            if(this.func_108889_b(var3) && var3.field_108897_a.func_108033_a()) {
               var1.add(var3);
               this.field_108892_b.add(var3);
            }
         }
      } else {
         var2 = this.field_108892_b.iterator();

         while(var2.hasNext()) {
            var3 = (C_100623_mo)var2.next();
            if(!var3.field_108897_a.func_108036_b()) {
               var3.field_108897_a.func_108029_d();
               var2.remove();
            }
         }
      }

      this.field_108893_c.func_108901_a("goalStart");
      var2 = var1.iterator();

      while(var2.hasNext()) {
         var3 = (C_100623_mo)var2.next();
         this.field_108893_c.func_108901_a(var3.field_108897_a.getClass().getSimpleName());
         var3.field_108897_a.func_108034_c();
         this.field_108893_c.func_108900_b();
      }

      this.field_108893_c.func_108900_b();
      this.field_108893_c.func_108901_a("goalTick");
      var2 = this.field_108892_b.iterator();

      while(var2.hasNext()) {
         var3 = (C_100623_mo)var2.next();
         var3.field_108897_a.func_108031_e();
      }

      this.field_108893_c.func_108900_b();
   }

   private boolean func_108886_a(C_100623_mo var1) {
      this.field_108893_c.func_108901_a("canContinue");
      boolean var2 = var1.field_108897_a.func_108036_b();
      this.field_108893_c.func_108900_b();
      return var2;
   }

   private boolean func_108889_b(C_100623_mo var1) {
      this.field_108893_c.func_108901_a("canUse");
      Iterator var2 = this.field_108894_a.iterator();

      while(var2.hasNext()) {
         C_100623_mo var3 = (C_100623_mo)var2.next();
         if(var3 != var1) {
            if(var1.field_108895_b >= var3.field_108895_b) {
               if(this.field_108892_b.contains(var3) && !this.func_108885_a(var1, var3)) {
                  this.field_108893_c.func_108900_b();
                  return false;
               }
            } else if(this.field_108892_b.contains(var3) && !var3.field_108897_a.func_108035_i()) {
               this.field_108893_c.func_108900_b();
               return false;
            }
         }
      }

      this.field_108893_c.func_108900_b();
      return true;
   }

   private boolean func_108885_a(C_100623_mo var1, C_100623_mo var2) {
      return (var1.field_108897_a.func_108032_j() & var2.field_108897_a.func_108032_j()) == 0;
   }
}
