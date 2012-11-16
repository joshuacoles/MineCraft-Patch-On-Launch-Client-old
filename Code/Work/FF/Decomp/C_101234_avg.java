import java.util.Random;
import org.lwjgl.opengl.GL11;

public class C_101234_avg extends C_101231_avl {

   C_101254_awp field_112087_a;
   C_101254_awp[] field_112086_b = new C_101254_awp[9];


   public C_101234_avg() {
      byte var1 = -16;
      this.field_112087_a = new C_101254_awp(this, 0, 0);
      this.field_112087_a.func_112205_a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      this.field_112087_a.field_112213_d += (float)(24 + var1);
      Random var2 = new Random(1660L);

      for(int var3 = 0; var3 < this.field_112086_b.length; ++var3) {
         this.field_112086_b[var3] = new C_101254_awp(this, 0, 0);
         float var4 = (((float)(var3 % 3) - (float)(var3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var5 = ((float)(var3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var6 = var2.nextInt(7) + 8;
         this.field_112086_b[var3].func_112205_a(-1.0F, 0.0F, -1.0F, 2, var6, 2);
         this.field_112086_b[var3].field_112216_c = var4;
         this.field_112086_b[var3].field_112214_e = var5;
         this.field_112086_b[var3].field_112213_d = (float)(31 + var1);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      for(int var8 = 0; var8 < this.field_112086_b.length; ++var8) {
         this.field_112086_b[var8].field_112211_f = 0.2F * C_100650_jv.func_108924_a(var3 * 0.3F + (float)var8) + 0.4F;
      }

   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.6F, 0.0F);
      this.field_112087_a.func_112201_a(var7);
      C_101254_awp[] var8 = this.field_112086_b;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         C_101254_awp var11 = var8[var10];
         var11.func_112201_a(var7);
      }

      GL11.glPopMatrix();
   }
}
