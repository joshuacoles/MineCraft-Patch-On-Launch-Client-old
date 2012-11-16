import java.util.Random;

public class C_101341_auq {

   private static Random field_112614_s = new Random();
   public double field_112605_a;
   public double field_112603_b;
   public double field_112604_c;
   public double field_112601_d;
   public double field_112602_e;
   public double field_112599_f;
   public double field_112600_g;
   public boolean field_112612_h;
   public int field_112613_i;
   public int field_112610_j;
   public double field_112611_k;
   public double field_112608_l;
   public double field_112609_m;
   public double field_112606_n;
   public double field_112607_o;
   public double field_112617_p;
   public double field_112616_q;
   public double field_112615_r;


   public void func_112598_a(C_101343_aur var1) {
      this.field_112605_a += this.field_112602_e;
      this.field_112603_b += this.field_112599_f;
      this.field_112602_e *= this.field_112600_g;
      this.field_112599_f *= this.field_112600_g;
      this.field_112599_f += 0.1D;
      if(++this.field_112613_i > this.field_112610_j) {
         this.func_112597_b();
      }

      this.field_112606_n = 2.0D - (double)this.field_112613_i / (double)this.field_112610_j * 2.0D;
      if(this.field_112606_n > 1.0D) {
         this.field_112606_n = 1.0D;
      }

      this.field_112606_n *= this.field_112606_n;
      this.field_112606_n *= 0.5D;
   }

   public void func_112596_a() {
      this.field_112607_o = this.field_112611_k;
      this.field_112617_p = this.field_112608_l;
      this.field_112616_q = this.field_112609_m;
      this.field_112615_r = this.field_112606_n;
      this.field_112604_c = this.field_112605_a;
      this.field_112601_d = this.field_112603_b;
   }

   public void func_112597_b() {
      this.field_112612_h = true;
   }

}
