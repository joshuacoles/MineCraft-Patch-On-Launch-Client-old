
public class C_100628_mv extends C_100621_mm {

   private C_100598_ls field_108141_a;
   private C_100529_oa field_108139_b;
   private int field_108140_c = -1;
   private int field_108138_d = -1;


   public C_100628_mv(C_100598_ls var1) {
      this.field_108141_a = var1;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if((!this.field_108141_a.field_103229_p.func_109402_t() || this.field_108141_a.field_103229_p.func_109531_M()) && !this.field_108141_a.field_103229_p.field_109576_v.field_112394_f) {
         if(this.field_108141_a.func_103312_aA().nextInt(50) != 0) {
            return false;
         } else if(this.field_108140_c != -1 && this.field_108141_a.func_103146_e((double)this.field_108140_c, this.field_108141_a.field_103219_u, (double)this.field_108138_d) < 4.0D) {
            return false;
         } else {
            C_100531_ob var1 = this.field_108141_a.field_103229_p.field_109550_C.func_107279_a(C_100650_jv.func_108910_c(this.field_108141_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108141_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108141_a.field_103217_v), 14);
            if(var1 == null) {
               return false;
            } else {
               this.field_108139_b = var1.func_108617_c(C_100650_jv.func_108910_c(this.field_108141_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108141_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108141_a.field_103217_v));
               return this.field_108139_b != null;
            }
         }
      } else {
         return false;
      }
   }

   public boolean func_108036_b() {
      return !this.field_108141_a.func_103383_ay().func_108300_f();
   }

   public void func_108034_c() {
      this.field_108140_c = -1;
      if(this.field_108141_a.func_103146_e((double)this.field_108139_b.func_108592_a(), (double)this.field_108139_b.field_108600_b, (double)this.field_108139_b.func_108593_c()) > 256.0D) {
         C_100387_amw var1 = C_100512_nz.func_108268_a(this.field_108141_a, 14, 3, this.field_108141_a.field_103229_p.func_109363_R().func_107878_a((double)this.field_108139_b.func_108592_a() + 0.5D, (double)this.field_108139_b.func_108594_b(), (double)this.field_108139_b.func_108593_c() + 0.5D));
         if(var1 != null) {
            this.field_108141_a.func_103383_ay().func_108292_a(var1.field_107872_c, var1.field_107869_d, var1.field_107870_e, 0.3F);
         }
      } else {
         this.field_108141_a.func_103383_ay().func_108292_a((double)this.field_108139_b.func_108592_a() + 0.5D, (double)this.field_108139_b.func_108594_b(), (double)this.field_108139_b.func_108593_c() + 0.5D, 0.3F);
      }

   }

   public void func_108029_d() {
      this.field_108140_c = this.field_108139_b.func_108592_a();
      this.field_108138_d = this.field_108139_b.func_108593_c();
      this.field_108139_b = null;
   }
}
