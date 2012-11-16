import java.util.Iterator;
import java.util.List;

public class C_100617_ml extends C_100621_mm {

   C_100544_oh field_108112_a;
   C_100544_oh field_108110_b;
   float field_108111_c;
   private int field_108109_d;


   public C_100617_ml(C_100544_oh var1, float var2) {
      this.field_108112_a = var1;
      this.field_108111_c = var2;
   }

   public boolean func_108033_a() {
      if(this.field_108112_a.func_103520_b() >= 0) {
         return false;
      } else {
         List var1 = this.field_108112_a.field_103229_p.func_109518_a(this.field_108112_a.getClass(), this.field_108112_a.field_103173_D.func_107895_b(8.0D, 4.0D, 8.0D));
         C_100544_oh var2 = null;
         double var3 = Double.MAX_VALUE;
         Iterator var5 = var1.iterator();

         while(var5.hasNext()) {
            C_100544_oh var6 = (C_100544_oh)var5.next();
            if(var6.func_103520_b() >= 0) {
               double var7 = this.field_108112_a.func_103082_e(var6);
               if(var7 <= var3) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         if(var2 == null) {
            return false;
         } else if(var3 < 9.0D) {
            return false;
         } else {
            this.field_108110_b = var2;
            return true;
         }
      }
   }

   public boolean func_108036_b() {
      if(!this.field_108110_b.func_103143_S()) {
         return false;
      } else {
         double var1 = this.field_108112_a.func_103082_e(this.field_108110_b);
         return var1 >= 9.0D && var1 <= 256.0D;
      }
   }

   public void func_108034_c() {
      this.field_108109_d = 0;
   }

   public void func_108029_d() {
      this.field_108110_b = null;
   }

   public void func_108031_e() {
      if(--this.field_108109_d <= 0) {
         this.field_108109_d = 10;
         this.field_108112_a.func_103383_ay().func_108295_a(this.field_108110_b, this.field_108111_c);
      }
   }
}
