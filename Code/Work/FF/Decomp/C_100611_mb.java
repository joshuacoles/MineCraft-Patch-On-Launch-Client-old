import java.util.List;

public class C_100611_mb extends C_100621_mm {

   private C_100598_ls field_108065_a;
   private float field_108063_b;
   private float field_108064_c;
   private C_100730_lb field_108061_d;
   private float field_108062_e;
   private C_100278_agj field_108059_f;
   private C_100515_nx field_108060_g;
   private Class field_108066_h;


   public C_100611_mb(C_100598_ls var1, Class var2, float var3, float var4, float var5) {
      this.field_108065_a = var1;
      this.field_108066_h = var2;
      this.field_108062_e = var3;
      this.field_108063_b = var4;
      this.field_108064_c = var5;
      this.field_108060_g = var1.func_103383_ay();
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(this.field_108066_h == C_101095_qg.class) {
         if(this.field_108065_a instanceof C_100603_lv && ((C_100603_lv)this.field_108065_a).func_103552_m()) {
            return false;
         }

         this.field_108061_d = this.field_108065_a.field_103229_p.func_109503_a(this.field_108065_a, (double)this.field_108062_e);
         if(this.field_108061_d == null) {
            return false;
         }
      } else {
         List var1 = this.field_108065_a.field_103229_p.func_109518_a(this.field_108066_h, this.field_108065_a.field_103173_D.func_107895_b((double)this.field_108062_e, 3.0D, (double)this.field_108062_e));
         if(var1.isEmpty()) {
            return false;
         }

         this.field_108061_d = (C_100730_lb)var1.get(0);
      }

      if(!this.field_108065_a.func_103292_az().func_108280_a(this.field_108061_d)) {
         return false;
      } else {
         C_100387_amw var2 = C_100512_nz.func_108265_b(this.field_108065_a, 16, 7, this.field_108065_a.field_103229_p.func_109363_R().func_107878_a(this.field_108061_d.field_103221_t, this.field_108061_d.field_103219_u, this.field_108061_d.field_103217_v));
         if(var2 == null) {
            return false;
         } else if(this.field_108061_d.func_103146_e(var2.field_107872_c, var2.field_107869_d, var2.field_107870_e) < this.field_108061_d.func_103082_e(this.field_108065_a)) {
            return false;
         } else {
            this.field_108059_f = this.field_108060_g.func_108284_a(var2.field_107872_c, var2.field_107869_d, var2.field_107870_e);
            return this.field_108059_f == null?false:this.field_108059_f.func_107234_b(var2);
         }
      }
   }

   public boolean func_108036_b() {
      return !this.field_108060_g.func_108300_f();
   }

   public void func_108034_c() {
      this.field_108060_g.func_108294_a(this.field_108059_f, this.field_108063_b);
   }

   public void func_108029_d() {
      this.field_108061_d = null;
   }

   public void func_108031_e() {
      if(this.field_108065_a.func_103082_e(this.field_108061_d) < 49.0D) {
         this.field_108065_a.func_103383_ay().func_108289_a(this.field_108064_c);
      } else {
         this.field_108065_a.func_103383_ay().func_108289_a(this.field_108063_b);
      }

   }
}
