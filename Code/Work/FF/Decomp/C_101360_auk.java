import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101360_auk extends C_101352_aug {

   private float field_104480_o;
   private float field_104479_p;


   public C_101360_auk(C_101095_qg var1) {
      super(var1.field_103855_bL);
      this.field_104051_i = true;
      var1.func_103813_a(C_100822_iy.field_110057_f, 1);
   }

   public void func_104039_c() {
      if(this.field_104046_e.field_105123_b.func_111070_h()) {
         this.field_104046_e.func_105053_a(new C_101346_aud(this.field_104046_e.field_105120_g));
      }

   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      if(this.field_104046_e.field_105123_b.func_111070_h()) {
         this.field_104046_e.func_105053_a(new C_101346_aud(this.field_104046_e.field_105120_g));
      } else {
         super.func_104037_A_();
      }

   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.crafting"), 86, 16, 4210752);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      super.func_104027_a(var1, var2, var3);
      this.field_104480_o = (float)var1;
      this.field_104479_p = (float)var2;
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/inventory.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = this.field_104445_m;
      int var6 = this.field_104443_n;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
      func_104478_a(this.field_104046_e, var5 + 51, var6 + 75, 30, (float)(var5 + 51) - this.field_104480_o, (float)(var6 + 75 - 50) - this.field_104479_p);
   }

   public static void func_104478_a(Minecraft var0, int var1, int var2, int var3, float var4, float var5) {
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var1, (float)var2, 50.0F);
      GL11.glScalef((float)(-var3), (float)var3, (float)var3);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = var0.field_105120_g.field_103469_aw;
      float var7 = var0.field_105120_g.field_103236_z;
      float var8 = var0.field_105120_g.field_103177_A;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      C_101210_aqj.func_112011_b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var5 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      var0.field_105120_g.field_103469_aw = (float)Math.atan((double)(var4 / 40.0F)) * 20.0F;
      var0.field_105120_g.field_103236_z = (float)Math.atan((double)(var4 / 40.0F)) * 40.0F;
      var0.field_105120_g.field_103177_A = -((float)Math.atan((double)(var5 / 40.0F))) * 20.0F;
      var0.field_105120_g.field_103455_ay = var0.field_105120_g.field_103236_z;
      GL11.glTranslatef(0.0F, var0.field_105120_g.field_103181_M, 0.0F);
      C_100848_azw.field_110183_a.field_110191_i = 180.0F;
      C_100848_azw.field_110183_a.func_110173_a(var0.field_105120_g, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      var0.field_105120_g.field_103469_aw = var6;
      var0.field_105120_g.field_103236_z = var7;
      var0.field_105120_g.field_103177_A = var8;
      GL11.glPopMatrix();
      C_101210_aqj.func_112010_a();
      GL11.glDisable('\u803a');
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105623_b);
      GL11.glDisable(3553);
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105625_a);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0) {
         this.field_104046_e.func_105053_a(new C_101302_ati(this.field_104046_e.field_105094_E));
      }

      if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105053_a(new C_101304_atj(this, this.field_104046_e.field_105094_E));
      }

   }
}
