import org.lwjgl.opengl.GL11;

public class C_100063_bac extends C_100056_bal {

   public C_100063_bac() {
      super(new C_101234_avg(), 0.5F);
   }

   protected void func_105428_a(C_101107_pp var1, float var2) {
      float var4 = ((float)var1.field_103635_f + (float)(var1.field_103636_g - var1.field_103635_f) * var2) / 20.0F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      var4 = 1.0F / (var4 * var4 * var4 * var4 * var4 * 2.0F + 1.0F);
      float var5 = (8.0F + var4) / 2.0F;
      float var6 = (8.0F + 1.0F / var4) / 2.0F;
      GL11.glScalef(var6, var5, var6);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
