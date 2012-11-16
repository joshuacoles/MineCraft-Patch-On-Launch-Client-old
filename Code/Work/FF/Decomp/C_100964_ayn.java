import net.minecraft.client.Minecraft;

public class C_100964_ayn extends C_101095_qg {

   private boolean field_104538_a = false;
   private int field_104536_b;
   private double field_104537_c;
   private double field_104534_d;
   private double field_104535_e;
   private double field_104532_f;
   private double field_104533_g;


   public C_100964_ayn(C_100873_xe var1, String var2) {
      super(var1);
      this.field_103847_bT = var2;
      this.field_103181_M = 0.0F;
      this.field_103197_X = 0.0F;
      if(var2 != null && var2.length() > 0) {
         this.field_103172_cw = "http://skins.minecraft.net/MinecraftSkins/" + C_100679_kd.func_109122_a(var2) + ".png";
      }

      this.field_103196_Y = true;
      this.field_103836_cC = 0.25F;
      this.field_103209_l = 10.0D;
   }

   protected void func_103786_e_() {
      this.field_103181_M = 0.0F;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      return true;
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_104537_c = var1;
      this.field_104534_d = var3;
      this.field_104535_e = var5;
      this.field_104532_f = (double)var7;
      this.field_104533_g = (double)var8;
      this.field_104536_b = var9;
   }

   public void func_103072_ad() {
      this.field_103842_cB = "http://skins.minecraft.net/MinecraftCloaks/" + C_100679_kd.func_109122_a(this.field_103847_bT) + ".png";
      this.field_103171_cx = this.field_103842_cB;
   }

   public void func_103165_j_() {
      this.field_103836_cC = 0.0F;
      super.func_103165_j_();
      this.field_103416_bf = this.field_103417_bg;
      double var1 = this.field_103221_t - this.field_103227_q;
      double var3 = this.field_103217_v - this.field_103223_s;
      float var5 = C_100650_jv.func_108915_a(var1 * var1 + var3 * var3) * 4.0F;
      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.field_103417_bg += (var5 - this.field_103417_bg) * 0.4F;
      this.field_103418_bh += this.field_103417_bg;
      if(!this.field_104538_a && this.func_103152_ak() && this.field_103857_bK.field_104832_a[this.field_103857_bK.field_104831_c] != null) {
         C_100994_tv var6 = this.field_103857_bK.field_104832_a[this.field_103857_bK.field_104831_c];
         this.func_103784_a(this.field_103857_bK.field_104832_a[this.field_103857_bK.field_104831_c], C_100992_tt.field_110834_e[var6.field_111397_c].func_110769_a(var6));
         this.field_104538_a = true;
      } else if(this.field_104538_a && !this.func_103152_ak()) {
         this.func_103824_bL();
         this.field_104538_a = false;
      }

   }

   public float func_103109_R() {
      return 0.0F;
   }

   public void func_103313_c() {
      super.func_103288_bk();
      if(this.field_104536_b > 0) {
         double var1 = this.field_103221_t + (this.field_104537_c - this.field_103221_t) / (double)this.field_104536_b;
         double var3 = this.field_103219_u + (this.field_104534_d - this.field_103219_u) / (double)this.field_104536_b;
         double var5 = this.field_103217_v + (this.field_104535_e - this.field_103217_v) / (double)this.field_104536_b;

         double var7;
         for(var7 = this.field_104532_f - (double)this.field_103236_z; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.field_103236_z = (float)((double)this.field_103236_z + var7 / (double)this.field_104536_b);
         this.field_103177_A = (float)((double)this.field_103177_A + (this.field_104533_g - (double)this.field_103177_A) / (double)this.field_104536_b);
         --this.field_104536_b;
         this.func_103163_b(var1, var3, var5);
         this.func_103158_b(this.field_103236_z, this.field_103177_A);
      }

      this.field_103849_bR = this.field_103848_bS;
      float var9 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
      float var2 = (float)Math.atan(-this.field_103240_x * 0.20000000298023224D) * 15.0F;
      if(var9 > 0.1F) {
         var9 = 0.1F;
      }

      if(!this.field_103174_E || this.func_103330_aT() <= 0) {
         var9 = 0.0F;
      }

      if(this.field_103174_E || this.func_103330_aT() <= 0) {
         var2 = 0.0F;
      }

      this.field_103848_bS += (var9 - this.field_103848_bS) * 0.4F;
      this.field_103458_ba += (var2 - this.field_103458_ba) * 0.8F;
   }

   public void func_103060_b(int var1, C_100994_tv var2) {
      if(var1 == 0) {
         this.field_103857_bK.field_104832_a[this.field_103857_bK.field_104831_c] = var2;
      } else {
         this.field_103857_bK.field_104830_b[var1 - 1] = var2;
      }

   }

   public float func_103102_e() {
      return 1.82F;
   }

   public void func_102910_a(String var1) {
      Minecraft.func_105091_x().field_105137_v.func_103991_b().func_103894_a(var1);
   }

   public boolean func_102912_a(int var1, String var2) {
      return false;
   }

   public C_100013_k func_102911_b() {
      return new C_100013_k(C_100650_jv.func_108910_c(this.field_103221_t + 0.5D), C_100650_jv.func_108910_c(this.field_103219_u + 0.5D), C_100650_jv.func_108910_c(this.field_103217_v + 0.5D));
   }
}
