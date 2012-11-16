import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class C_101288_atq extends C_101278_asw {

   protected static C_100059_bag field_104442_a = new C_100059_bag();
   protected int field_104440_b = 176;
   protected int field_104441_c = 166;
   public C_101075_qy field_104439_d;
   protected int field_104445_m;
   protected int field_104443_n;
   private C_101048_rz field_104444_o;


   public C_101288_atq(C_101075_qy var1) {
      this.field_104439_d = var1;
   }

   public void func_104037_A_() {
      super.func_104037_A_();
      this.field_104046_e.field_105120_g.field_103856_bM = this.field_104439_d;
      this.field_104445_m = (this.field_104044_f - this.field_104440_b) / 2;
      this.field_104443_n = (this.field_104045_g - this.field_104441_c) / 2;
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      int var4 = this.field_104445_m;
      int var5 = this.field_104443_n;
      this.func_104430_a(var3, var1, var2);
      GL11.glDisable('\u803a');
      C_101210_aqj.func_112010_a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      super.func_104027_a(var1, var2, var3);
      C_101210_aqj.func_112012_c();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable('\u803a');
      this.field_104444_o = null;
      short var6 = 240;
      short var7 = 240;
      C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var6 / 1.0F, (float)var7 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

      for(int var10 = 0; var10 < this.field_104439_d.field_111513_b.size(); ++var10) {
         C_101048_rz var11 = (C_101048_rz)this.field_104439_d.field_111513_b.get(var10);
         this.func_104436_a(var11);
         if(this.func_104429_a(var11, var1, var2)) {
            this.field_104444_o = var11;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var8 = var11.field_111462_h;
            int var9 = var11.field_111463_i;
            this.func_103881_a(var8, var9, var8 + 16, var9 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      this.func_104433_b(var1, var2);
      C_101092_qf var12 = this.field_104046_e.field_105120_g.field_103857_bK;
      if(var12.func_104824_n() != null) {
         GL11.glTranslatef(0.0F, 0.0F, 32.0F);
         this.field_103883_j = 200.0F;
         field_104442_a.field_105502_f = 200.0F;
         field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, var12.func_104824_n(), var1 - var4 - 8, var2 - var5 - 8);
         field_104442_a.func_105496_c(this.field_104049_k, this.field_104046_e.field_105127_o, var12.func_104824_n(), var1 - var4 - 8, var2 - var5 - 8);
         this.field_103883_j = 0.0F;
         field_104442_a.field_105502_f = 0.0F;
      }

      if(var12.func_104824_n() == null && this.field_104444_o != null && this.field_104444_o.func_111453_d()) {
         C_100994_tv var13 = this.field_104444_o.func_111446_c();
         this.func_104432_a(var13, var1 - var4, var2 - var5);
      }

      GL11.glPopMatrix();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      C_101210_aqj.func_112011_b();
   }

   protected void func_104432_a(C_100994_tv var1, int var2, int var3) {
      GL11.glDisable('\u803a');
      C_101210_aqj.func_112010_a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      List var4 = var1.func_111390_a(this.field_104046_e.field_105120_g, this.field_104046_e.field_105156_y.field_111753_x);
      if(!var4.isEmpty()) {
         int var5 = 0;
         Iterator var6 = var4.iterator();

         while(var6.hasNext()) {
            String var7 = (String)var6.next();
            int var8 = this.field_104049_k.func_111778_a(var7);
            if(var8 > var5) {
               var5 = var8;
            }
         }

         int var15 = var2 + 12;
         int var16 = var3 - 12;
         int var9 = 8;
         if(var4.size() > 1) {
            var9 += 2 + (var4.size() - 1) * 10;
         }

         this.field_103883_j = 300.0F;
         field_104442_a.field_105502_f = 300.0F;
         int var10 = -267386864;
         this.func_103881_a(var15 - 3, var16 - 4, var15 + var5 + 3, var16 - 3, var10, var10);
         this.func_103881_a(var15 - 3, var16 + var9 + 3, var15 + var5 + 3, var16 + var9 + 4, var10, var10);
         this.func_103881_a(var15 - 3, var16 - 3, var15 + var5 + 3, var16 + var9 + 3, var10, var10);
         this.func_103881_a(var15 - 4, var16 - 3, var15 - 3, var16 + var9 + 3, var10, var10);
         this.func_103881_a(var15 + var5 + 3, var16 - 3, var15 + var5 + 4, var16 + var9 + 3, var10, var10);
         int var11 = 1347420415;
         int var12 = (var11 & 16711422) >> 1 | var11 & -16777216;
         this.func_103881_a(var15 - 3, var16 - 3 + 1, var15 - 3 + 1, var16 + var9 + 3 - 1, var11, var12);
         this.func_103881_a(var15 + var5 + 2, var16 - 3 + 1, var15 + var5 + 3, var16 + var9 + 3 - 1, var11, var12);
         this.func_103881_a(var15 - 3, var16 - 3, var15 + var5 + 3, var16 - 3 + 1, var11, var11);
         this.func_103881_a(var15 - 3, var16 + var9 + 2, var15 + var5 + 3, var16 + var9 + 3, var12, var12);

         for(int var13 = 0; var13 < var4.size(); ++var13) {
            String var14 = (String)var4.get(var13);
            if(var13 == 0) {
               var14 = "§" + Integer.toHexString(var1.func_111382_u().field_111162_e) + var14;
            } else {
               var14 = "§7" + var14;
            }

            this.field_104049_k.func_111783_a(var14, var15, var16, -1);
            if(var13 == 0) {
               var16 += 2;
            }

            var16 += 10;
         }

         this.field_103883_j = 0.0F;
         field_104442_a.field_105502_f = 0.0F;
      }

   }

   protected void func_104435_a(String var1, int var2, int var3) {
      GL11.glDisable('\u803a');
      C_101210_aqj.func_112010_a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      int var4 = this.field_104049_k.func_111778_a(var1);
      int var5 = var2 + 12;
      int var6 = var3 - 12;
      byte var8 = 8;
      this.field_103883_j = 300.0F;
      field_104442_a.field_105502_f = 300.0F;
      int var9 = -267386864;
      this.func_103881_a(var5 - 3, var6 - 4, var5 + var4 + 3, var6 - 3, var9, var9);
      this.func_103881_a(var5 - 3, var6 + var8 + 3, var5 + var4 + 3, var6 + var8 + 4, var9, var9);
      this.func_103881_a(var5 - 3, var6 - 3, var5 + var4 + 3, var6 + var8 + 3, var9, var9);
      this.func_103881_a(var5 - 4, var6 - 3, var5 - 3, var6 + var8 + 3, var9, var9);
      this.func_103881_a(var5 + var4 + 3, var6 - 3, var5 + var4 + 4, var6 + var8 + 3, var9, var9);
      int var10 = 1347420415;
      int var11 = (var10 & 16711422) >> 1 | var10 & -16777216;
      this.func_103881_a(var5 - 3, var6 - 3 + 1, var5 - 3 + 1, var6 + var8 + 3 - 1, var10, var11);
      this.func_103881_a(var5 + var4 + 2, var6 - 3 + 1, var5 + var4 + 3, var6 + var8 + 3 - 1, var10, var11);
      this.func_103881_a(var5 - 3, var6 - 3, var5 + var4 + 3, var6 - 3 + 1, var10, var10);
      this.func_103881_a(var5 - 3, var6 + var8 + 2, var5 + var4 + 3, var6 + var8 + 3, var11, var11);
      this.field_104049_k.func_111783_a(var1, var5, var6, -1);
      this.field_103883_j = 0.0F;
      field_104442_a.field_105502_f = 0.0F;
   }

   protected void func_104433_b(int var1, int var2) {}

   protected abstract void func_104430_a(float var1, int var2, int var3);

   private void func_104436_a(C_101048_rz var1) {
      int var2 = var1.field_111462_h;
      int var3 = var1.field_111463_i;
      C_100994_tv var4 = var1.func_111446_c();
      boolean var5 = false;
      this.field_103883_j = 100.0F;
      field_104442_a.field_105502_f = 100.0F;
      if(var4 == null) {
         int var6 = var1.func_111450_b();
         if(var6 >= 0) {
            GL11.glDisable(2896);
            this.field_104046_e.field_105127_o.func_110368_b(this.field_104046_e.field_105127_o.func_110367_b("/gui/items.png"));
            this.func_103877_b(var2, var3, var6 % 16 * 16, var6 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
            var5 = true;
         }
      }

      if(!var5) {
         GL11.glEnable(2929);
         field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, var4, var2, var3);
         field_104442_a.func_105496_c(this.field_104049_k, this.field_104046_e.field_105127_o, var4, var2, var3);
      }

      field_104442_a.field_105502_f = 0.0F;
      this.field_103883_j = 0.0F;
   }

   private C_101048_rz func_104438_c(int var1, int var2) {
      for(int var3 = 0; var3 < this.field_104439_d.field_111513_b.size(); ++var3) {
         C_101048_rz var4 = (C_101048_rz)this.field_104439_d.field_111513_b.get(var3);
         if(this.func_104429_a(var4, var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      boolean var4 = var3 == this.field_104046_e.field_105156_y.field_111697_M.field_111989_d + 100;
      if(var3 == 0 || var3 == 1 || var4) {
         C_101048_rz var5 = this.func_104438_c(var1, var2);
         int var6 = this.field_104445_m;
         int var7 = this.field_104443_n;
         boolean var8 = var1 < var6 || var2 < var7 || var1 >= var6 + this.field_104440_b || var2 >= var7 + this.field_104441_c;
         int var9 = -1;
         if(var5 != null) {
            var9 = var5.field_111460_g;
         }

         if(var8) {
            var9 = -999;
         }

         if(var9 != -1) {
            if(var4) {
               this.func_104434_a(var5, var9, var3, 3);
            } else {
               boolean var10 = var9 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
               this.func_104434_a(var5, var9, var3, var10?1:0);
            }
         }
      }

   }

   private boolean func_104429_a(C_101048_rz var1, int var2, int var3) {
      return this.func_104431_c(var1.field_111462_h, var1.field_111463_i, 16, 16, var2, var3);
   }

   protected boolean func_104431_c(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = this.field_104445_m;
      int var8 = this.field_104443_n;
      var5 -= var7;
      var6 -= var8;
      return var5 >= var1 - 1 && var5 < var1 + var3 + 1 && var6 >= var2 - 1 && var6 < var2 + var4 + 1;
   }

   protected void func_104434_a(C_101048_rz var1, int var2, int var3, int var4) {
      if(var1 != null) {
         var2 = var1.field_111460_g;
      }

      this.field_104046_e.field_105123_b.func_111064_a(this.field_104439_d.field_111514_c, var2, var3, var4, this.field_104046_e.field_105120_g);
   }

   protected void func_104032_a(char var1, int var2) {
      if(var2 == 1 || var2 == this.field_104046_e.field_105156_y.field_111691_F.field_111989_d) {
         this.field_104046_e.field_105120_g.func_103808_i();
      }

      this.func_104437_a(var2);
      if(var2 == this.field_104046_e.field_105156_y.field_111697_M.field_111989_d && this.field_104444_o != null && this.field_104444_o.func_111453_d()) {
         this.func_104434_a(this.field_104444_o, this.field_104444_o.field_111460_g, this.field_104441_c, 3);
      }

   }

   protected boolean func_104437_a(int var1) {
      if(this.field_104046_e.field_105120_g.field_103857_bK.func_104824_n() == null && this.field_104444_o != null) {
         for(int var2 = 0; var2 < 9; ++var2) {
            if(var1 == 2 + var2) {
               this.func_104434_a(this.field_104444_o, this.field_104444_o.field_111460_g, var2, 2);
               return true;
            }
         }
      }

      return false;
   }

   public void func_104038_b() {
      if(this.field_104046_e.field_105120_g != null) {
         this.field_104439_d.func_111501_a(this.field_104046_e.field_105120_g);
      }
   }

   public boolean func_104031_f() {
      return false;
   }

   public void func_104039_c() {
      super.func_104039_c();
      if(!this.field_104046_e.field_105120_g.func_103143_S() || this.field_104046_e.field_105120_g.field_103180_L) {
         this.field_104046_e.field_105120_g.func_103808_i();
      }

   }

}
