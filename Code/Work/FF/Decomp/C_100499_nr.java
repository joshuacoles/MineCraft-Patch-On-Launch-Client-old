import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C_100499_nr extends C_100517_nw {

   C_100595_ln field_108239_a;
   Class field_108237_b;
   int field_108238_c;
   private final C_100720_li field_108236_g;
   private C_100497_ns field_108240_h;


   public C_100499_nr(C_100595_ln var1, Class var2, float var3, int var4, boolean var5) {
      this(var1, var2, var3, var4, var5, false);
   }

   public C_100499_nr(C_100595_ln var1, Class var2, float var3, int var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, (C_100720_li)null);
   }

   public C_100499_nr(C_100595_ln var1, Class var2, float var3, int var4, boolean var5, boolean var6, C_100720_li var7) {
      super(var1, var3, var5, var6);
      this.field_108237_b = var2;
      this.field_108232_e = var3;
      this.field_108238_c = var4;
      this.field_108240_h = new C_100497_ns(this, var1);
      this.field_108236_g = var7;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(this.field_108238_c > 0 && this.field_108231_d.func_103312_aA().nextInt(this.field_108238_c) != 0) {
         return false;
      } else {
         if(this.field_108237_b == C_101095_qg.class) {
            C_101095_qg var1 = this.field_108231_d.field_103229_p.func_109455_b(this.field_108231_d, (double)this.field_108232_e);
            if(this.func_108227_a(var1, false)) {
               this.field_108239_a = var1;
               return true;
            }
         } else {
            List var5 = this.field_108231_d.field_103229_p.func_109456_a(this.field_108237_b, this.field_108231_d.field_103173_D.func_107895_b((double)this.field_108232_e, 4.0D, (double)this.field_108232_e), this.field_108236_g);
            Collections.sort(var5, this.field_108240_h);
            Iterator var2 = var5.iterator();

            while(var2.hasNext()) {
               C_100730_lb var3 = (C_100730_lb)var2.next();
               C_100595_ln var4 = (C_100595_ln)var3;
               if(this.func_108227_a(var4, false)) {
                  this.field_108239_a = var4;
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void func_108034_c() {
      this.field_108231_d.func_103347_b(this.field_108239_a);
      super.func_108034_c();
   }
}
