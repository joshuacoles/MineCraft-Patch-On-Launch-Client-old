import org.lwjgl.opengl.GL11;

public class C_101256_awj extends C_101231_avl {

   private C_101254_awp field_112155_a;
   private C_101254_awp field_112153_b = new C_101254_awp(this, "glass");
   private C_101254_awp field_112154_c;


   public C_101256_awj(float var1, boolean var2) {
      this.field_112153_b.func_112200_a(0, 0).func_112205_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.field_112155_a = new C_101254_awp(this, "cube");
      this.field_112155_a.func_112200_a(32, 0).func_112205_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      if(var2) {
         this.field_112154_c = new C_101254_awp(this, "base");
         this.field_112154_c.func_112200_a(0, 16).func_112205_a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
      }

   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glTranslatef(0.0F, -0.5F, 0.0F);
      if(this.field_112154_c != null) {
         this.field_112154_c.func_112201_a(var7);
      }

      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.8F + var4, 0.0F);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      this.field_112153_b.func_112201_a(var7);
      float var8 = 0.875F;
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.field_112153_b.func_112201_a(var7);
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.field_112155_a.func_112201_a(var7);
      GL11.glPopMatrix();
   }
}
