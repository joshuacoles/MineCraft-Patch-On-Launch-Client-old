import org.lwjgl.opengl.GL11;

public class C_100040_bbb extends C_100056_bal {

   private C_101240_awe field_105394_a;
   private int field_105393_f;


   public C_100040_bbb() {
      super(new C_101240_awe(0.0F), 0.5F);
      this.field_105394_a = (C_101240_awe)this.field_105380_i;
      this.field_105393_f = this.field_105394_a.func_112119_a();
   }

   public void func_105389_a(C_101102_pz var1, double var2, double var4, double var6, float var8, float var9) {
      C_100994_tv var10 = var1.func_103328_bA();
      if(this.field_105394_a.func_112119_a() != this.field_105393_f) {
         System.out.println("Updating witch model");
         this.field_105380_i = this.field_105394_a = new C_101240_awe(0.0F);
         this.field_105393_f = this.field_105394_a.func_112119_a();
      }

      this.field_105394_a.field_112120_g = var10 != null;
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105391_a(C_101102_pz var1, float var2) {
      float var3 = 1.0F;
      GL11.glColor3f(var3, var3, var3);
      super.func_105372_c(var1, var2);
      C_100994_tv var4 = var1.func_103328_bA();
      if(var4 != null) {
         GL11.glPushMatrix();
         float var5;
         if(this.field_105380_i.field_112030_s) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.625F, 0.0F);
            GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
            GL11.glScalef(var5, var5, var5);
         }

         this.field_105394_a.field_112113_f.func_112210_c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.53125F, 0.21875F);
         if(var4.field_111397_c < 256 && C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var4.field_111397_c].func_106013_d())) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var5 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
         } else if(var4.field_111397_c == C_100992_tt.field_110843_k.field_110891_cf) {
            var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if(C_100992_tt.field_110834_e[var4.field_111397_c].func_110763_n_()) {
            var5 = 0.625F;
            if(C_100992_tt.field_110834_e[var4.field_111397_c].func_110797_o_()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            this.func_105390_b();
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var5 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var5, var5, var5);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         GL11.glRotatef(-15.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
         this.field_105357_b.field_110177_f.func_110254_a(var1, var4, 0);
         if(var4.func_111365_b().func_110758_b()) {
            this.field_105357_b.field_110177_f.func_110254_a(var1, var4, 1);
         }

         GL11.glPopMatrix();
      }

   }

   protected void func_105390_b() {
      GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
   }

   protected void func_105392_b(C_101102_pz var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   // $FF: synthetic method
   protected void func_105367_a(C_100595_ln var1, float var2) {
      this.func_105392_b((C_101102_pz)var1, var2);
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105391_a((C_101102_pz)var1, var2);
   }
}
