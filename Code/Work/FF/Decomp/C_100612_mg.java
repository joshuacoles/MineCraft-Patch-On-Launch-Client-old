
public abstract class C_100612_mg extends C_100621_mm {

   protected C_100595_ln field_108074_a;
   protected int field_108072_b;
   protected int field_108073_c;
   protected int field_108070_d;
   protected C_100192_aim field_108071_e;
   boolean field_108068_f;
   float field_108069_g;
   float field_108075_h;


   public C_100612_mg(C_100595_ln var1) {
      this.field_108074_a = var1;
   }

   public boolean func_108033_a() {
      if(!this.field_108074_a.field_103175_F) {
         return false;
      } else {
         C_100515_nx var1 = this.field_108074_a.func_103383_ay();
         C_100278_agj var2 = var1.func_108296_d();
         if(var2 != null && !var2.func_107239_b() && var1.func_108308_c()) {
            for(int var3 = 0; var3 < Math.min(var2.func_107231_e() + 2, var2.func_107232_d()); ++var3) {
               C_100292_agi var4 = var2.func_107235_a(var3);
               this.field_108072_b = var4.field_107346_a;
               this.field_108073_c = var4.field_107344_b + 1;
               this.field_108070_d = var4.field_107345_c;
               if(this.field_108074_a.func_103146_e((double)this.field_108072_b, this.field_108074_a.field_103219_u, (double)this.field_108070_d) <= 2.25D) {
                  this.field_108071_e = this.func_108067_a(this.field_108072_b, this.field_108073_c, this.field_108070_d);
                  if(this.field_108071_e != null) {
                     return true;
                  }
               }
            }

            this.field_108072_b = C_100650_jv.func_108910_c(this.field_108074_a.field_103221_t);
            this.field_108073_c = C_100650_jv.func_108910_c(this.field_108074_a.field_103219_u + 1.0D);
            this.field_108070_d = C_100650_jv.func_108910_c(this.field_108074_a.field_103217_v);
            this.field_108071_e = this.func_108067_a(this.field_108072_b, this.field_108073_c, this.field_108070_d);
            return this.field_108071_e != null;
         } else {
            return false;
         }
      }
   }

   public boolean func_108036_b() {
      return !this.field_108068_f;
   }

   public void func_108034_c() {
      this.field_108068_f = false;
      this.field_108069_g = (float)((double)((float)this.field_108072_b + 0.5F) - this.field_108074_a.field_103221_t);
      this.field_108075_h = (float)((double)((float)this.field_108070_d + 0.5F) - this.field_108074_a.field_103217_v);
   }

   public void func_108031_e() {
      float var1 = (float)((double)((float)this.field_108072_b + 0.5F) - this.field_108074_a.field_103221_t);
      float var2 = (float)((double)((float)this.field_108070_d + 0.5F) - this.field_108074_a.field_103217_v);
      float var3 = this.field_108069_g * var1 + this.field_108075_h * var2;
      if(var3 < 0.0F) {
         this.field_108068_f = true;
      }

   }

   private C_100192_aim func_108067_a(int var1, int var2, int var3) {
      int var4 = this.field_108074_a.field_103229_p.func_109349_a(var1, var2, var3);
      return var4 != C_100451_alf.field_106200_aH.field_106162_cm?null:(C_100192_aim)C_100451_alf.field_106118_p[var4];
   }
}
