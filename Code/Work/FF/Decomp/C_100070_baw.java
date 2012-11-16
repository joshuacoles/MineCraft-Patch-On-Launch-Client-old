import org.lwjgl.opengl.GL11;

public class C_100070_baw extends C_100056_bal {

   public C_100070_baw() {
      super(new C_101244_avy(), 1.0F);
      this.func_105363_a(new C_101244_avy());
   }

   protected float func_105439_a(C_101101_py var1) {
      return 180.0F;
   }

   protected int func_105440_a(C_101101_py var1, int var2, float var3) {
      if(var2 != 0) {
         return -1;
      } else {
         this.func_105351_a("/mob/spider_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         if(var1.func_103164_aj()) {
            GL11.glDepthMask(false);
         } else {
            GL11.glDepthMask(true);
         }

         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   protected void func_105438_a(C_101101_py var1, float var2) {
      float var3 = var1.func_103755_m();
      GL11.glScalef(var3, var3, var3);
   }
}
