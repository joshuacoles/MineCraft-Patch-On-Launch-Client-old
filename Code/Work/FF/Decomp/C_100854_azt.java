import org.lwjgl.opengl.GL11;

public class C_100854_azt extends C_100846_azx {

   private int field_105526_a = -1;
   private C_101231_avl field_105525_f;


   public C_100854_azt() {
      this.field_105355_d = 0.5F;
   }

   public void func_105524_a(C_100563_ox var1, double var2, double var4, double var6, float var8, float var9) {
      if(this.field_105526_a != 1) {
         this.field_105525_f = new C_101256_awj(0.0F, true);
         this.field_105526_a = 1;
      }

      float var10 = (float)var1.field_103242_a + var9;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.func_105351_a("/mob/enderdragon/crystal.png");
      float var11 = C_100650_jv.func_108924_a(var10 * 0.2F) / 2.0F + 0.5F;
      var11 += var11 * var11;
      this.field_105525_f.func_112027_a(var1, 0.0F, var10 * 3.0F, var11 * 0.2F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
