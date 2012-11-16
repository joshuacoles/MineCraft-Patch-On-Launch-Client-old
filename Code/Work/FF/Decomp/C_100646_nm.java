import java.util.Iterator;
import java.util.List;

public class C_100646_nm extends C_100621_mm {

   private C_101098_qd field_108226_a;
   private C_100557_or field_108224_b;
   private int field_108225_c;
   private boolean field_108223_d = false;


   public C_100646_nm(C_101098_qd var1) {
      this.field_108226_a = var1;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      if(this.field_108226_a.func_103520_b() >= 0) {
         return false;
      } else if(!this.field_108226_a.field_103229_p.func_109402_t()) {
         return false;
      } else {
         List var1 = this.field_108226_a.field_103229_p.func_109518_a(C_100557_or.class, this.field_108226_a.field_103173_D.func_107895_b(6.0D, 2.0D, 6.0D));
         if(var1.isEmpty()) {
            return false;
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               C_100557_or var3 = (C_100557_or)var2.next();
               if(var3.func_103680_o() > 0) {
                  this.field_108224_b = var3;
                  break;
               }
            }

            return this.field_108224_b != null;
         }
      }
   }

   public boolean func_108036_b() {
      return this.field_108224_b.func_103680_o() > 0;
   }

   public void func_108034_c() {
      this.field_108225_c = this.field_108226_a.func_103312_aA().nextInt(320);
      this.field_108223_d = false;
      this.field_108224_b.func_103383_ay().func_108299_g();
   }

   public void func_108029_d() {
      this.field_108224_b = null;
      this.field_108226_a.func_103383_ay().func_108299_g();
   }

   public void func_108031_e() {
      this.field_108226_a.func_103289_av().func_108861_a(this.field_108224_b, 30.0F, 30.0F);
      if(this.field_108224_b.func_103680_o() == this.field_108225_c) {
         this.field_108226_a.func_103383_ay().func_108295_a(this.field_108224_b, 0.15F);
         this.field_108223_d = true;
      }

      if(this.field_108223_d && this.field_108226_a.func_103082_e(this.field_108224_b) < 4.0D) {
         this.field_108224_b.func_103678_f(false);
         this.field_108226_a.func_103383_ay().func_108299_g();
      }

   }
}
