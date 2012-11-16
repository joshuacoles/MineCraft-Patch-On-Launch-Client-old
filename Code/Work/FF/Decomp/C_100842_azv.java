import java.util.Random;
import org.lwjgl.opengl.GL11;

public class C_100842_azv extends C_100056_bal {

   private C_101237_avf field_105479_a;
   private Random field_105478_f = new Random();


   public C_100842_azv() {
      super(new C_101237_avf(), 0.5F);
      this.field_105479_a = (C_101237_avf)super.field_105380_i;
      this.func_105363_a(this.field_105479_a);
   }

   public void func_105476_a(C_100585_pm var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_105479_a.field_112104_a = var1.func_103730_o() > 0;
      this.field_105479_a.field_112103_b = var1.func_103725_q();
      if(var1.func_103725_q()) {
         double var10 = 0.02D;
         var2 += this.field_105478_f.nextGaussian() * var10;
         var6 += this.field_105478_f.nextGaussian() * var10;
      }

      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105477_a(C_100585_pm var1, float var2) {
      super.func_105372_c(var1, var2);
      if(var1.func_103730_o() > 0) {
         GL11.glEnable('\u803a');
         GL11.glPushMatrix();
         float var3 = 0.5F;
         GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
         var3 *= 1.0F;
         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(var3, -var3, var3);
         int var4 = var1.func_103125_b(var2);
         int var5 = var4 % 65536;
         int var6 = var4 / 65536;
         C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var5 / 1.0F, (float)var6 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.func_105351_a("/terrain.png");
         this.field_105358_c.func_110400_a(C_100451_alf.field_106118_p[var1.func_103730_o()], var1.func_103729_p(), 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable('\u803a');
      }

   }

   protected int func_105475_a(C_100585_pm var1, int var2, float var3) {
      if(var2 != 0) {
         return -1;
      } else {
         this.func_105351_a("/mob/enderman_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
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
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105477_a((C_100585_pm)var1, var2);
   }
}
