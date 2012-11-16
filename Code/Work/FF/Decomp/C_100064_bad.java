import org.lwjgl.opengl.GL11;

public class C_100064_bad extends C_100056_bal {

   private float field_105430_a;


   public C_100064_bad(C_101231_avl var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.field_105430_a = var3;
   }

   protected void func_105429_a(C_101108_pq var1, float var2) {
      GL11.glScalef(this.field_105430_a, this.field_105430_a, this.field_105430_a);
   }
}
