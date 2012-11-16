import java.util.Iterator;
import java.util.List;

public class C_100638_ne extends C_100621_mm {

   private C_101098_qd field_108197_a;
   private C_100595_ln field_108195_b;
   private float field_108196_c;
   private int field_108194_d;


   public C_100638_ne(C_101098_qd var1, float var2) {
      this.field_108197_a = var1;
      this.field_108196_c = var2;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(this.field_108197_a.func_103520_b() >= 0) {
         return false;
      } else if(this.field_108197_a.func_103312_aA().nextInt(400) != 0) {
         return false;
      } else {
         List var1 = this.field_108197_a.field_103229_p.func_109518_a(C_101098_qd.class, this.field_108197_a.field_103173_D.func_107895_b(6.0D, 3.0D, 6.0D));
         double var2 = Double.MAX_VALUE;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            C_101098_qd var5 = (C_101098_qd)var4.next();
            if(var5 != this.field_108197_a && !var5.func_103592_o() && var5.func_103520_b() < 0) {
               double var6 = var5.func_103082_e(this.field_108197_a);
               if(var6 <= var2) {
                  var2 = var6;
                  this.field_108195_b = var5;
               }
            }
         }

         if(this.field_108195_b == null) {
            C_100387_amw var8 = C_100512_nz.func_108266_a(this.field_108197_a, 16, 3);
            if(var8 == null) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean func_108036_b() {
      return this.field_108194_d > 0;
   }

   public void func_108034_c() {
      if(this.field_108195_b != null) {
         this.field_108197_a.func_103591_g(true);
      }

      this.field_108194_d = 1000;
   }

   public void func_108029_d() {
      this.field_108197_a.func_103591_g(false);
      this.field_108195_b = null;
   }

   public void func_108031_e() {
      --this.field_108194_d;
      if(this.field_108195_b != null) {
         if(this.field_108197_a.func_103082_e(this.field_108195_b) > 4.0D) {
            this.field_108197_a.func_103383_ay().func_108295_a(this.field_108195_b, this.field_108196_c);
         }
      } else if(this.field_108197_a.func_103383_ay().func_108300_f()) {
         C_100387_amw var1 = C_100512_nz.func_108266_a(this.field_108197_a, 16, 3);
         if(var1 == null) {
            return;
         }

         this.field_108197_a.func_103383_ay().func_108292_a(var1.field_107872_c, var1.field_107869_d, var1.field_107870_e, this.field_108196_c);
      }

   }
}
