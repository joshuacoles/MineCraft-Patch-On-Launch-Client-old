import java.util.Iterator;
import java.util.List;

public class C_100501_nq extends C_100517_nw {

   boolean field_108243_a;
   C_100595_ln field_108242_b;


   public C_100501_nq(C_100595_ln var1, boolean var2) {
      super(var1, 16.0F, false);
      this.field_108243_a = var2;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      return this.func_108227_a(this.field_108231_d.func_103286_aB(), true);
   }

   public boolean func_108036_b() {
      return this.field_108231_d.func_103286_aB() != null && this.field_108231_d.func_103286_aB() != this.field_108242_b;
   }

   public void func_108034_c() {
      this.field_108231_d.func_103347_b(this.field_108231_d.func_103286_aB());
      this.field_108242_b = this.field_108231_d.func_103286_aB();
      if(this.field_108243_a) {
         List var1 = this.field_108231_d.field_103229_p.func_109518_a(this.field_108231_d.getClass(), C_100412_amr.func_107892_a().func_107844_a(this.field_108231_d.field_103221_t, this.field_108231_d.field_103219_u, this.field_108231_d.field_103217_v, this.field_108231_d.field_103221_t + 1.0D, this.field_108231_d.field_103219_u + 1.0D, this.field_108231_d.field_103217_v + 1.0D).func_107895_b((double)this.field_108232_e, 4.0D, (double)this.field_108232_e));
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            C_100595_ln var3 = (C_100595_ln)var2.next();
            if(this.field_108231_d != var3 && var3.func_103335_aF() == null) {
               var3.func_103347_b(this.field_108231_d.func_103286_aB());
            }
         }
      }

      super.func_108034_c();
   }
}
