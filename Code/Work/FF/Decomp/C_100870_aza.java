import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class C_100870_aza {

   private int field_110312_a;
   private int field_110310_b;
   private int field_110311_c;
   private double field_110308_d;
   private double field_110309_e;
   private double field_110306_f;
   private IntBuffer field_110307_g = C_101209_aqk.func_112004_f(65536);
   private boolean field_110313_h = false;
   private boolean field_110314_i = false;


   public void func_110305_a(int var1, int var2, int var3, double var4, double var6, double var8) {
      this.field_110313_h = true;
      this.field_110307_g.clear();
      this.field_110312_a = var1;
      this.field_110310_b = var2;
      this.field_110311_c = var3;
      this.field_110308_d = var4;
      this.field_110309_e = var6;
      this.field_110306_f = var8;
   }

   public boolean func_110301_a(int var1, int var2, int var3) {
      return !this.field_110313_h?false:var1 == this.field_110312_a && var2 == this.field_110310_b && var3 == this.field_110311_c;
   }

   public void func_110303_a(int var1) {
      this.field_110307_g.put(var1);
      if(this.field_110307_g.remaining() == 0) {
         this.func_110302_a();
      }

   }

   public void func_110302_a() {
      if(this.field_110313_h) {
         if(!this.field_110314_i) {
            this.field_110307_g.flip();
            this.field_110314_i = true;
         }

         if(this.field_110307_g.remaining() > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((double)this.field_110312_a - this.field_110308_d), (float)((double)this.field_110310_b - this.field_110309_e), (float)((double)this.field_110311_c - this.field_110306_f));
            GL11.glCallLists(this.field_110307_g);
            GL11.glPopMatrix();
         }

      }
   }

   public void func_110304_b() {
      this.field_110313_h = false;
      this.field_110314_i = false;
   }
}
