
public class C_100418_amf extends C_100398_amm {

   public float field_103000_a;
   public float field_102998_b;
   public int field_102999_c;
   private int field_102997_d;


   public void func_102921_g() {
      super.func_102921_g();
      if(++this.field_102997_d % 20 * 4 == 0) {
         this.field_102940_k.func_109467_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, C_100451_alf.field_106221_bV.field_106162_cm, 1, this.field_102999_c);
      }

      this.field_102998_b = this.field_103000_a;
      float var1 = 0.1F;
      double var4;
      if(this.field_102999_c > 0 && this.field_103000_a == 0.0F) {
         double var2 = (double)this.field_102938_l + 0.5D;
         var4 = (double)this.field_102936_n + 0.5D;
         this.field_102940_k.func_109476_a(var2, (double)this.field_102939_m + 0.5D, var4, "random.chestopen", 0.5F, this.field_102940_k.field_109577_u.nextFloat() * 0.1F + 0.9F);
      }

      if(this.field_102999_c == 0 && this.field_103000_a > 0.0F || this.field_102999_c > 0 && this.field_103000_a < 1.0F) {
         float var8 = this.field_103000_a;
         if(this.field_102999_c > 0) {
            this.field_103000_a += var1;
         } else {
            this.field_103000_a -= var1;
         }

         if(this.field_103000_a > 1.0F) {
            this.field_103000_a = 1.0F;
         }

         float var3 = 0.5F;
         if(this.field_103000_a < var3 && var8 >= var3) {
            var4 = (double)this.field_102938_l + 0.5D;
            double var6 = (double)this.field_102936_n + 0.5D;
            this.field_102940_k.func_109476_a(var4, (double)this.field_102939_m + 0.5D, var6, "random.chestclosed", 0.5F, this.field_102940_k.field_109577_u.nextFloat() * 0.1F + 0.9F);
         }

         if(this.field_103000_a < 0.0F) {
            this.field_103000_a = 0.0F;
         }
      }

   }

   public void func_102918_b(int var1, int var2) {
      if(var1 == 1) {
         this.field_102999_c = var2;
      }

   }

   public void func_102920_w_() {
      this.func_102931_h();
      super.func_102920_w_();
   }

   public void func_102994_a() {
      ++this.field_102999_c;
      this.field_102940_k.func_109467_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, C_100451_alf.field_106221_bV.field_106162_cm, 1, this.field_102999_c);
   }

   public void func_102995_b() {
      --this.field_102999_c;
      this.field_102940_k.func_109467_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, C_100451_alf.field_106221_bV.field_106162_cm, 1, this.field_102999_c);
   }

   public boolean func_102996_a(C_101095_qg var1) {
      return this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n) != this?false:var1.func_103146_e((double)this.field_102938_l + 0.5D, (double)this.field_102939_m + 0.5D, (double)this.field_102936_n + 0.5D) <= 64.0D;
   }
}
