import java.util.Iterator;
import java.util.List;

public class C_101078_qu extends C_101082_qq {

   private C_100994_tv field_104698_d;


   public C_101078_qu(C_100873_xe var1) {
      super(var1);
   }

   public C_101078_qu(C_100873_xe var1, C_100595_ln var2, int var3) {
      this(var1, var2, new C_100994_tv(C_100992_tt.field_110864_bs, 1, var3));
   }

   public C_101078_qu(C_100873_xe var1, C_100595_ln var2, C_100994_tv var3) {
      super(var1, var2);
      this.field_104698_d = var3;
   }

   public C_101078_qu(C_100873_xe var1, double var2, double var4, double var6, int var8) {
      this(var1, var2, var4, var6, new C_100994_tv(C_100992_tt.field_110864_bs, 1, var8));
   }

   public C_101078_qu(C_100873_xe var1, double var2, double var4, double var6, C_100994_tv var8) {
      super(var1, var2, var4, var6);
      this.field_104698_d = var8;
   }

   protected float func_104684_g() {
      return 0.05F;
   }

   protected float func_104686_c() {
      return 0.5F;
   }

   protected float func_104683_d() {
      return -20.0F;
   }

   public void func_104697_a(int var1) {
      if(this.field_104698_d == null) {
         this.field_104698_d = new C_100994_tv(C_100992_tt.field_110864_bs, 1, 0);
      }

      this.field_104698_d.func_111371_b(var1);
   }

   public int func_104696_h() {
      if(this.field_104698_d == null) {
         this.field_104698_d = new C_100994_tv(C_100992_tt.field_110864_bs, 1, 0);
      }

      return this.field_104698_d.func_111367_j();
   }

   protected void func_104685_a(C_100383_amu var1) {
      if(!this.field_103229_p.field_109557_J) {
         List var2 = C_100992_tt.field_110864_bs.func_110993_l(this.field_104698_d);
         if(var2 != null && !var2.isEmpty()) {
            C_100412_amr var3 = this.field_103173_D.func_107895_b(4.0D, 2.0D, 4.0D);
            List var4 = this.field_103229_p.func_109518_a(C_100595_ln.class, var3);
            if(var4 != null && !var4.isEmpty()) {
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  C_100595_ln var6 = (C_100595_ln)var5.next();
                  double var7 = this.func_103082_e(var6);
                  if(var7 < 16.0D) {
                     double var9 = 1.0D - Math.sqrt(var7) / 4.0D;
                     if(var6 == var1.field_107835_g) {
                        var9 = 1.0D;
                     }

                     Iterator var11 = var2.iterator();

                     while(var11.hasNext()) {
                        C_100692_kx var12 = (C_100692_kx)var11.next();
                        int var13 = var12.func_109197_a();
                        if(C_100690_kw.field_109169_a[var13].func_109148_b()) {
                           C_100690_kw.field_109169_a[var13].func_109147_a(this.field_104692_c, var6, var12.func_109192_c(), var9);
                        } else {
                           int var14 = (int)(var9 * (double)var12.func_109193_b() + 0.5D);
                           if(var14 > 20) {
                              var6.func_103389_d(new C_100692_kx(var13, var14, var12.func_109192_c()));
                           }
                        }
                     }
                  }
               }
            }
         }

         this.field_103229_p.func_109448_f(2002, (int)Math.round(this.field_103221_t), (int)Math.round(this.field_103219_u), (int)Math.round(this.field_103217_v), this.func_104696_h());
         this.func_103121_x();
      }

   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      if(var1.func_107516_b("Potion")) {
         this.field_104698_d = C_100994_tv.func_111376_a(var1.func_107521_l("Potion"));
      } else {
         this.func_104697_a(var1.func_107514_e("potionValue"));
      }

      if(this.field_104698_d == null) {
         this.func_103121_x();
      }

   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      if(this.field_104698_d != null) {
         var1.func_107538_a("Potion", this.field_104698_d.func_111344_b(new C_100353_bh()));
      }

   }
}
