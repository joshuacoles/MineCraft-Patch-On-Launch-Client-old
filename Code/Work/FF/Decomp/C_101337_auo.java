import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class C_101337_auo extends C_101278_asw {

   private static final String field_104419_b = C_100011_m.field_105261_a;
   protected String field_104421_a = "Edit sign message:";
   private C_100414_amj field_104420_c;
   private int field_104418_d;
   private int field_104422_m = 0;


   public C_101337_auo(C_100414_amj var1) {
      this.field_104420_c = var1;
   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120, "Done"));
      this.field_104420_c.func_102959_a(false);
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
      this.field_104046_e.func_105068_r().func_107034_c(new C_100266_eu(this.field_104420_c.field_102938_l, this.field_104420_c.field_102939_m, this.field_104420_c.field_102936_n, this.field_104420_c.field_102963_a));
      this.field_104420_c.func_102959_a(true);
   }

   public void func_104039_c() {
      ++this.field_104418_d;
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 0) {
            this.field_104420_c.func_102922_d();
            this.field_104046_e.func_105053_a((C_101278_asw)null);
         }

      }
   }

   protected void func_104032_a(char var1, int var2) {
      if(var2 == 200) {
         this.field_104422_m = this.field_104422_m - 1 & 3;
      }

      if(var2 == 208 || var2 == 28) {
         this.field_104422_m = this.field_104422_m + 1 & 3;
      }

      if(var2 == 14 && this.field_104420_c.field_102963_a[this.field_104422_m].length() > 0) {
         this.field_104420_c.field_102963_a[this.field_104422_m] = this.field_104420_c.field_102963_a[this.field_104422_m].substring(0, this.field_104420_c.field_102963_a[this.field_104422_m].length() - 1);
      }

      if(field_104419_b.indexOf(var1) >= 0 && this.field_104420_c.field_102963_a[this.field_104422_m].length() < 15) {
         this.field_104420_c.field_102963_a[this.field_104422_m] = this.field_104420_c.field_102963_a[this.field_104422_m] + var1;
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104421_a, this.field_104044_f / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.field_104044_f / 2), 0.0F, 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      C_100451_alf var5 = this.field_104420_c.func_102916_q();
      if(var5 == C_100451_alf.field_106199_aG) {
         float var6 = (float)(this.field_104420_c.func_102919_p() * 360) / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      } else {
         int var8 = this.field_104420_c.func_102919_p();
         float var7 = 0.0F;
         if(var8 == 2) {
            var7 = 180.0F;
         }

         if(var8 == 4) {
            var7 = 90.0F;
         }

         if(var8 == 5) {
            var7 = -90.0F;
         }

         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      }

      if(this.field_104418_d / 6 % 2 == 0) {
         this.field_104420_c.field_102961_b = this.field_104422_m;
      }

      C_100042_bby.field_105547_a.func_105539_a(this.field_104420_c, -0.5D, -0.75D, -0.5D, 0.0F);
      this.field_104420_c.field_102961_b = -1;
      GL11.glPopMatrix();
      super.func_104027_a(var1, var2, var3);
   }

}
