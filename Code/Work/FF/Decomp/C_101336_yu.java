
public class C_101336_yu extends C_101315_yd {

   protected C_100562_aan field_112584_L;


   public C_101336_yu(C_101324_xz var1) {
      super(var1);
      this.field_112584_L = new C_100500_abe(C_100451_alf.field_106225_bM.field_106162_cm);
   }

   protected void func_112544_a() {
      this.func_112546_b();
      if(this.field_112562_b.nextInt(5) == 0) {
         int var1 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         int var2 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         int var3 = this.field_112564_a.func_109459_i(var1, var2);
         if(var3 > 0) {
            ;
         }

         this.field_112584_L.func_107965_a(this.field_112564_a, this.field_112562_b, var1, var3, var2);
      }

      if(this.field_112563_c == 0 && this.field_112560_d == 0) {
         C_100568_oy var4 = new C_100568_oy(this.field_112564_a);
         var4.func_103055_b(0.0D, 128.0D, 0.0D, this.field_112562_b.nextFloat() * 360.0F, 0.0F);
         this.field_112564_a.func_109513_d(var4);
      }

   }
}
