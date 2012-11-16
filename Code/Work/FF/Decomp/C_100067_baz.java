import org.lwjgl.opengl.GL11;

public class C_100067_baz extends C_100056_bal {

   private C_101239_awb field_105434_a;


   public C_100067_baz() {
      super(new C_101239_awb(), 0.5F);
      this.field_105434_a = (C_101239_awb)this.field_105380_i;
   }

   public void func_105433_a(C_100557_or var1, double var2, double var4, double var6, float var8, float var9) {
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105432_a(C_100557_or var1, float var2, float var3, float var4) {
      super.func_105365_a(var1, var2, var3, var4);
      if((double)var1.field_103417_bg >= 0.01D) {
         float var5 = 13.0F;
         float var6 = var1.field_103418_bh - var1.field_103417_bg * (1.0F - var4) + 6.0F;
         float var7 = (Math.abs(var6 % var5 - var5 * 0.5F) - var5 * 0.25F) / (var5 * 0.25F);
         GL11.glRotatef(6.5F * var7, 0.0F, 0.0F, 1.0F);
      }
   }

   protected void func_105431_a(C_100557_or var1, float var2) {
      super.func_105372_c(var1, var2);
      if(var1.func_103680_o() != 0) {
         GL11.glEnable('\u803a');
         GL11.glPushMatrix();
         GL11.glRotatef(5.0F + 180.0F * this.field_105434_a.field_112128_c.field_112211_f / 3.1415927F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         float var3 = 0.8F;
         GL11.glScalef(var3, -var3, var3);
         int var4 = var1.func_103125_b(var2);
         int var5 = var4 % 65536;
         int var6 = var4 / 65536;
         C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var5 / 1.0F, (float)var6 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.func_105351_a("/terrain.png");
         this.field_105358_c.func_110400_a(C_100451_alf.field_106250_ah, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable('\u803a');
      }
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105431_a((C_100557_or)var1, var2);
   }
}
