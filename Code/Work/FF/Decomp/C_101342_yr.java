import java.util.Random;

public class C_101342_yr extends C_101324_xz {

   protected C_101342_yr(int var1) {
      super(var1);
      this.field_112481_I.field_112581_z = 2;
      this.field_112481_I.field_112551_A = -999;
      this.field_112481_I.field_112553_C = 1;
      this.field_112481_I.field_112547_D = 8;
      this.field_112481_I.field_112548_E = 10;
      this.field_112481_I.field_112555_I = 1;
      this.field_112481_I.field_112582_y = 4;
      this.field_112480_H = 14745518;
      this.field_112482_J.add(new C_101316_ya(C_101100_px.class, 1, 1, 1));
   }

   public C_100562_aan func_112447_a(Random var1) {
      return this.field_112488_R;
   }

   public int func_112461_k() {
      double var1 = (double)this.func_112465_j();
      double var3 = (double)this.func_112451_i();
      return ((C_100875_xd.func_110398_a(var1, var3) & 16711422) + 5115470) / 2;
   }

   public int func_112446_l() {
      double var1 = (double)this.func_112465_j();
      double var3 = (double)this.func_112451_i();
      return ((C_100866_xa.func_110297_a(var1, var3) & 16711422) + 5115470) / 2;
   }
}
