import org.lwjgl.opengl.GL11;

public class C_100073_bat extends C_100061_bae {

   public C_100073_bat() {
      super(new C_101246_avv(), 0.5F);
   }

   protected void func_105427_a(C_101106_pw var1, float var2) {
      if(var1.func_103693_m() == 1) {
         GL11.glScalef(1.2F, 1.2F, 1.2F);
      }

   }

   protected void func_105409_c() {
      GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
   }
}
