import org.lwjgl.opengl.GL11;

public class C_100039_bba extends C_100056_bal {

   protected C_101238_awc field_105388_a;


   public C_100039_bba() {
      super(new C_101238_awc(0.0F), 0.5F);
      this.field_105388_a = (C_101238_awc)this.field_105380_i;
   }

   protected int func_105386_a(C_101098_qd var1, int var2, float var3) {
      return -1;
   }

   public void func_105385_a(C_101098_qd var1, double var2, double var4, double var6, float var8, float var9) {
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105387_a(C_101098_qd var1, double var2, double var4, double var6) {}

   protected void func_105384_a(C_101098_qd var1, float var2) {
      super.func_105372_c(var1, var2);
   }

   protected void func_105383_b(C_101098_qd var1, float var2) {
      float var3 = 0.9375F;
      if(var1.func_103520_b() < 0) {
         var3 = (float)((double)var3 * 0.5D);
         this.field_105355_d = 0.25F;
      } else {
         this.field_105355_d = 0.5F;
      }

      GL11.glScalef(var3, var3, var3);
   }

   // $FF: synthetic method
   protected void func_105362_b(C_100595_ln var1, double var2, double var4, double var6) {
      this.func_105387_a((C_101098_qd)var1, var2, var4, var6);
   }

   // $FF: synthetic method
   protected void func_105367_a(C_100595_ln var1, float var2) {
      this.func_105383_b((C_101098_qd)var1, var2);
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105384_a((C_101098_qd)var1, var2);
   }
}
