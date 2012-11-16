import org.lwjgl.opengl.GL11;

public class C_100041_bbc extends C_100056_bal {

   private int field_105399_a;


   public C_100041_bbc() {
      super(new C_101258_awf(), 1.0F);
      this.field_105399_a = ((C_101258_awf)this.field_105380_i).func_112156_a();
   }

   public void func_105397_a(C_100579_pa var1, double var2, double var4, double var6, float var8, float var9) {
      C_100962_ayo.func_111153_a(var1, true);
      int var10 = ((C_101258_awf)this.field_105380_i).func_112156_a();
      if(var10 != this.field_105399_a) {
         this.field_105399_a = var10;
         this.field_105380_i = new C_101258_awf();
      }

      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105398_a(C_100579_pa var1, float var2) {
      int var3 = var1.func_103703_n();
      if(var3 > 0) {
         float var4 = 2.0F - ((float)var3 - var2) / 220.0F * 0.5F;
         GL11.glScalef(var4, var4, var4);
      } else {
         GL11.glScalef(2.0F, 2.0F, 2.0F);
      }

   }

   protected int func_105396_a(C_100579_pa var1, int var2, float var3) {
      if(var1.func_103696_o()) {
         if(var1.func_103164_aj()) {
            GL11.glDepthMask(false);
         } else {
            GL11.glDepthMask(true);
         }

         if(var2 == 1) {
            float var4 = (float)var1.field_103233_ab + var3;
            this.func_105351_a("/armor/witherarmor.png");
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            float var5 = C_100650_jv.func_108928_b(var4 * 0.02F) * 3.0F;
            float var6 = var4 * 0.01F;
            GL11.glTranslatef(var5, var6, 0.0F);
            this.func_105363_a(this.field_105380_i);
            GL11.glMatrixMode(5888);
            GL11.glEnable(3042);
            float var7 = 0.5F;
            GL11.glColor4f(var7, var7, var7, 1.0F);
            GL11.glDisable(2896);
            GL11.glBlendFunc(1, 1);
            GL11.glTranslatef(0.0F, -0.01F, 0.0F);
            GL11.glScalef(1.1F, 1.1F, 1.1F);
            return 1;
         }

         if(var2 == 2) {
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
         }
      }

      return -1;
   }

   protected int func_105395_b(C_100579_pa var1, int var2, float var3) {
      return -1;
   }
}
