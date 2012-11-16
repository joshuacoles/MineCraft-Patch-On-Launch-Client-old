
public class C_101306_atg extends C_101278_asw {

   private C_101278_asw field_104386_b;
   protected String field_104388_a = "Video Settings";
   private C_101125_ard field_104387_c;
   private boolean field_104385_d = false;
   private static C_101123_arf[] field_104389_m = new C_101123_arf[]{C_101123_arf.field_111657_m, C_101123_arf.field_111648_g, C_101123_arf.field_111654_n, C_101123_arf.field_111659_k, C_101123_arf.field_111661_i, C_101123_arf.field_111660_h, C_101123_arf.field_111655_o, C_101123_arf.field_111658_j, C_101123_arf.field_111647_f, C_101123_arf.field_111669_p, C_101123_arf.field_111668_q, C_101123_arf.field_111662_w, C_101123_arf.field_111671_y, C_101123_arf.field_111670_z};


   public C_101306_atg(C_101278_asw var1, C_101125_ard var2) {
      this.field_104386_b = var1;
      this.field_104387_c = var2;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104388_a = var1.func_107651_b("options.videoTitle");
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(200, this.field_104044_f / 2 - 100, this.field_104045_g / 6 + 168, var1.func_107651_b("gui.done")));
      this.field_104385_d = false;
      String[] var2 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         String var7 = System.getProperty(var6);
         if(var7 != null && var7.contains("64")) {
            this.field_104385_d = true;
            break;
         }
      }

      int var9 = 0;
      var4 = this.field_104385_d?0:-15;
      C_101123_arf[] var10 = field_104389_m;
      int var11 = var10.length;

      for(int var12 = 0; var12 < var11; ++var12) {
         C_101123_arf var8 = var10[var12];
         if(var8.func_111639_a()) {
            this.field_104050_h.add(new C_101299_atc(var8.func_111640_c(), this.field_104044_f / 2 - 155 + var9 % 2 * 160, this.field_104045_g / 7 + var4 + 24 * (var9 >> 1), var8, this.field_104387_c.func_111678_c(var8), this.field_104387_c.func_111675_a(var8)));
         } else {
            this.field_104050_h.add(new C_101300_atd(var8.func_111640_c(), this.field_104044_f / 2 - 155 + var9 % 2 * 160, this.field_104045_g / 7 + var4 + 24 * (var9 >> 1), var8, this.field_104387_c.func_111678_c(var8)));
         }

         ++var9;
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         int var2 = this.field_104387_c.field_111744_ad;
         if(var1.field_103908_f < 100 && var1 instanceof C_101300_atd) {
            this.field_104387_c.func_111679_a(((C_101300_atd)var1).func_103920_b(), 1);
            var1.field_103911_e = this.field_104387_c.func_111678_c(C_101123_arf.func_111636_a(var1.field_103908_f));
         }

         if(var1.field_103908_f == 200) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(this.field_104386_b);
         }

         if(this.field_104387_c.field_111744_ad != var2) {
            C_101277_asx var3 = new C_101277_asx(this.field_104046_e.field_105156_y, this.field_104046_e.field_105124_c, this.field_104046_e.field_105121_d);
            int var4 = var3.func_112363_a();
            int var5 = var3.func_112365_b();
            this.func_104036_a(this.field_104046_e, var4, var5);
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104388_a, this.field_104044_f / 2, this.field_104385_d?20:5, 16777215);
      if(!this.field_104385_d && this.field_104387_c.field_111718_e == 0) {
         this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("options.farWarning1"), this.field_104044_f / 2, this.field_104045_g / 6 + 144 + 1, 11468800);
         this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("options.farWarning2"), this.field_104044_f / 2, this.field_104045_g / 6 + 144 + 13, 11468800);
      }

      super.func_104027_a(var1, var2, var3);
   }

}
