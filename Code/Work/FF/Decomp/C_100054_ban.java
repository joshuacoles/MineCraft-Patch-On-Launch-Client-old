import org.lwjgl.opengl.GL11;

public class C_100054_ban extends C_100056_bal {

   public C_100054_ban(C_101231_avl var1, float var2) {
      super(var1, var2);
   }

   public void func_105402_a(C_100535_om var1, double var2, double var4, double var6, float var8, float var9) {
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105403_a(C_100535_om var1, float var2) {
      super.func_105367_a(var1, var2);
      if(var1.func_103552_m()) {
         GL11.glScalef(0.8F, 0.8F, 0.8F);
      }

   }
}
