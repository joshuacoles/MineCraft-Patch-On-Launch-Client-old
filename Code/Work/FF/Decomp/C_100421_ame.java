import java.util.Random;

public class C_100421_ame extends C_100398_amm {

   public int field_104851_a;
   public float field_104848_b;
   public float field_104850_c;
   public float field_104846_d;
   public float field_104847_e;
   public float field_104844_f;
   public float field_104845_g;
   public float field_104853_h;
   public float field_104854_i;
   public float field_104852_j;
   private static Random field_104849_r = new Random();


   public void func_102921_g() {
      super.func_102921_g();
      this.field_104845_g = this.field_104844_f;
      this.field_104854_i = this.field_104853_h;
      C_101095_qg var1 = this.field_102940_k.func_109504_a((double)((float)this.field_102938_l + 0.5F), (double)((float)this.field_102939_m + 0.5F), (double)((float)this.field_102936_n + 0.5F), 3.0D);
      if(var1 != null) {
         double var2 = var1.field_103221_t - (double)((float)this.field_102938_l + 0.5F);
         double var4 = var1.field_103217_v - (double)((float)this.field_102936_n + 0.5F);
         this.field_104852_j = (float)Math.atan2(var4, var2);
         this.field_104844_f += 0.1F;
         if(this.field_104844_f < 0.5F || field_104849_r.nextInt(40) == 0) {
            float var6 = this.field_104846_d;

            do {
               this.field_104846_d += (float)(field_104849_r.nextInt(4) - field_104849_r.nextInt(4));
            } while(var6 == this.field_104846_d);
         }
      } else {
         this.field_104852_j += 0.02F;
         this.field_104844_f -= 0.1F;
      }

      while(this.field_104853_h >= 3.1415927F) {
         this.field_104853_h -= 6.2831855F;
      }

      while(this.field_104853_h < -3.1415927F) {
         this.field_104853_h += 6.2831855F;
      }

      while(this.field_104852_j >= 3.1415927F) {
         this.field_104852_j -= 6.2831855F;
      }

      while(this.field_104852_j < -3.1415927F) {
         this.field_104852_j += 6.2831855F;
      }

      float var7;
      for(var7 = this.field_104852_j - this.field_104853_h; var7 >= 3.1415927F; var7 -= 6.2831855F) {
         ;
      }

      while(var7 < -3.1415927F) {
         var7 += 6.2831855F;
      }

      this.field_104853_h += var7 * 0.4F;
      if(this.field_104844_f < 0.0F) {
         this.field_104844_f = 0.0F;
      }

      if(this.field_104844_f > 1.0F) {
         this.field_104844_f = 1.0F;
      }

      ++this.field_104851_a;
      this.field_104850_c = this.field_104848_b;
      float var3 = (this.field_104846_d - this.field_104848_b) * 0.4F;
      float var8 = 0.2F;
      if(var3 < -var8) {
         var3 = -var8;
      }

      if(var3 > var8) {
         var3 = var8;
      }

      this.field_104847_e += (var3 - this.field_104847_e) * 0.9F;
      this.field_104848_b += this.field_104847_e;
   }

}
