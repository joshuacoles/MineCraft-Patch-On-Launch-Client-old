import org.lwjgl.opengl.GL11;

public class C_100069_bax extends C_100056_bal {

   public C_100069_bax(C_101231_avl var1, float var2) {
      super(var1, var2);
   }

   public void func_105436_a(C_100558_oq var1, double var2, double var4, double var6, float var8, float var9) {
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105437_a(C_100558_oq var1, float var2, float var3, float var4) {
      float var5 = var1.field_103508_e + (var1.field_103507_d - var1.field_103508_e) * var4;
      float var6 = var1.field_103506_g + (var1.field_103505_f - var1.field_103506_g) * var4;
      GL11.glTranslatef(0.0F, 0.5F, 0.0F);
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, -1.2F, 0.0F);
   }

   protected float func_105435_a(C_100558_oq var1, float var2) {
      return var1.field_103514_bK + (var1.field_103509_j - var1.field_103514_bK) * var2;
   }

   // $FF: synthetic method
   protected float func_105374_b(C_100595_ln var1, float var2) {
      return this.func_105435_a((C_100558_oq)var1, var2);
   }
}
