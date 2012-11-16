import org.lwjgl.opengl.GL11;

public class C_100072_bau extends C_100056_bal {

   private C_101231_avl field_105445_a;


   public C_100072_bau(C_101231_avl var1, C_101231_avl var2, float var3) {
      super(var1, var3);
      this.field_105445_a = var2;
   }

   protected int func_105444_a(C_101100_px var1, int var2, float var3) {
      if(var1.func_103164_aj()) {
         return 0;
      } else if(var2 == 0) {
         this.func_105363_a(this.field_105445_a);
         GL11.glEnable(2977);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         return 1;
      } else {
         if(var2 == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         return -1;
      }
   }

   protected void func_105443_a(C_101100_px var1, float var2) {
      float var3 = (float)var1.func_103624_p();
      float var4 = (var1.field_103630_d + (var1.field_103633_c - var1.field_103630_d) * var2) / (var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      GL11.glScalef(var5 * var3, 1.0F / var5 * var3, var5 * var3);
   }
}
