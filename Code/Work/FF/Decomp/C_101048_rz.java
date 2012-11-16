
public class C_101048_rz {

   private final int field_111461_a;
   public final C_100716_kl field_111459_f;
   public int field_111460_g;
   public int field_111462_h;
   public int field_111463_i;


   public C_101048_rz(C_100716_kl var1, int var2, int var3, int var4) {
      this.field_111459_f = var1;
      this.field_111461_a = var2;
      this.field_111462_h = var3;
      this.field_111463_i = var4;
   }

   public void func_111457_a(C_100994_tv var1, C_100994_tv var2) {
      if(var1 != null && var2 != null) {
         if(var1.field_111397_c == var2.field_111397_c) {
            int var3 = var2.field_111398_a - var1.field_111398_a;
            if(var3 > 0) {
               this.func_111448_a(var1, var3);
            }

         }
      }
   }

   protected void func_111448_a(C_100994_tv var1, int var2) {}

   protected void func_111449_b(C_100994_tv var1) {}

   public void func_111452_a(C_101095_qg var1, C_100994_tv var2) {
      this.func_111454_e();
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return true;
   }

   public C_100994_tv func_111446_c() {
      return this.field_111459_f.func_103007_a(this.field_111461_a);
   }

   public boolean func_111453_d() {
      return this.func_111446_c() != null;
   }

   public void func_111447_c(C_100994_tv var1) {
      this.field_111459_f.func_103006_a(this.field_111461_a, var1);
      this.func_111454_e();
   }

   public void func_111454_e() {
      this.field_111459_f.func_102922_d();
   }

   public int func_111455_a() {
      return this.field_111459_f.func_103008_c();
   }

   public int func_111450_b() {
      return -1;
   }

   public C_100994_tv func_111445_a(int var1) {
      return this.field_111459_f.func_103002_a(this.field_111461_a, var1);
   }

   public boolean func_111456_a(C_100716_kl var1, int var2) {
      return var1 == this.field_111459_f && var2 == this.field_111461_a;
   }

   public boolean func_111451_a(C_101095_qg var1) {
      return true;
   }
}
