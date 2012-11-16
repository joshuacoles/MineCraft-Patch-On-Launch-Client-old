import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class C_100614_me extends C_100621_mm {

   private C_100544_oh field_108086_d;
   C_100873_xe field_108090_a;
   private C_100544_oh field_108087_e;
   int field_108088_b = 0;
   float field_108089_c;


   public C_100614_me(C_100544_oh var1, float var2) {
      this.field_108086_d = var1;
      this.field_108090_a = var1.field_103229_p;
      this.field_108089_c = var2;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      if(!this.field_108086_d.func_103525_r()) {
         return false;
      } else {
         this.field_108087_e = this.func_108085_f();
         return this.field_108087_e != null;
      }
   }

   public boolean func_108036_b() {
      return this.field_108087_e.func_103143_S() && this.field_108087_e.func_103525_r() && this.field_108088_b < 60;
   }

   public void func_108029_d() {
      this.field_108087_e = null;
      this.field_108088_b = 0;
   }

   public void func_108031_e() {
      this.field_108086_d.func_103289_av().func_108861_a(this.field_108087_e, 10.0F, (float)this.field_108086_d.func_103290_bm());
      this.field_108086_d.func_103383_ay().func_108295_a(this.field_108087_e, this.field_108089_c);
      ++this.field_108088_b;
      if(this.field_108088_b == 60) {
         this.func_108084_g();
      }

   }

   private C_100544_oh func_108085_f() {
      float var1 = 8.0F;
      List var2 = this.field_108090_a.func_109518_a(this.field_108086_d.getClass(), this.field_108086_d.field_103173_D.func_107895_b((double)var1, (double)var1, (double)var1));
      Iterator var3 = var2.iterator();

      C_100544_oh var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (C_100544_oh)var3.next();
      } while(!this.field_108086_d.func_103522_b(var4));

      return var4;
   }

   private void func_108084_g() {
      C_100544_oh var1 = this.field_108086_d.func_103521_a(this.field_108087_e);
      if(var1 != null) {
         this.field_108086_d.func_103519_a(6000);
         this.field_108087_e.func_103519_a(6000);
         this.field_108086_d.func_103526_s();
         this.field_108087_e.func_103526_s();
         var1.func_103519_a(-24000);
         var1.func_103055_b(this.field_108086_d.field_103221_t, this.field_108086_d.field_103219_u, this.field_108086_d.field_103217_v, 0.0F, 0.0F);
         this.field_108090_a.func_109513_d(var1);
         Random var2 = this.field_108086_d.func_103312_aA();

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = var2.nextGaussian() * 0.02D;
            double var6 = var2.nextGaussian() * 0.02D;
            double var8 = var2.nextGaussian() * 0.02D;
            this.field_108090_a.func_109428_a("heart", this.field_108086_d.field_103221_t + (double)(var2.nextFloat() * this.field_108086_d.field_103182_N * 2.0F) - (double)this.field_108086_d.field_103182_N, this.field_108086_d.field_103219_u + 0.5D + (double)(var2.nextFloat() * this.field_108086_d.field_103183_O), this.field_108086_d.field_103217_v + (double)(var2.nextFloat() * this.field_108086_d.field_103182_N * 2.0F) - (double)this.field_108086_d.field_103182_N, var4, var6, var8);
         }

         this.field_108090_a.func_109513_d(new C_100722_lj(this.field_108090_a, this.field_108086_d.field_103221_t, this.field_108086_d.field_103219_u, this.field_108086_d.field_103217_v, var2.nextInt(4) + 1));
      }
   }
}
