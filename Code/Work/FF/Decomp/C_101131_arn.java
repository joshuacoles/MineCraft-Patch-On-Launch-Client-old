
public class C_101131_arn extends C_101278_asw {

   private static final C_101123_arf[] field_104106_a = new C_101123_arf[]{C_101123_arf.field_111667_r, C_101123_arf.field_111666_s, C_101123_arf.field_111665_t, C_101123_arf.field_111664_u, C_101123_arf.field_111663_v};
   private static final C_101123_arf[] field_104104_b = new C_101123_arf[]{C_101123_arf.field_111644_A};
   private final C_101278_asw field_104105_c;
   private final C_101125_ard field_104103_d;
   private String field_104109_m;
   private String field_104107_n;
   private int field_104108_o = 0;


   public C_101131_arn(C_101278_asw var1, C_101125_ard var2) {
      this.field_104105_c = var1;
      this.field_104103_d = var2;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      int var2 = 0;
      this.field_104109_m = var1.func_107651_b("options.chat.title");
      this.field_104107_n = var1.func_107651_b("options.multiplayer.title");
      C_101123_arf[] var3 = field_104106_a;
      int var4 = var3.length;

      int var5;
      C_101123_arf var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var3[var5];
         if(var6.func_111639_a()) {
            this.field_104050_h.add(new C_101299_atc(var6.func_111640_c(), this.field_104044_f / 2 - 155 + var2 % 2 * 160, this.field_104045_g / 6 + 24 * (var2 >> 1), var6, this.field_104103_d.func_111678_c(var6), this.field_104103_d.func_111675_a(var6)));
         } else {
            this.field_104050_h.add(new C_101300_atd(var6.func_111640_c(), this.field_104044_f / 2 - 155 + var2 % 2 * 160, this.field_104045_g / 6 + 24 * (var2 >> 1), var6, this.field_104103_d.func_111678_c(var6)));
         }

         ++var2;
      }

      if(var2 % 2 == 1) {
         ++var2;
      }

      this.field_104108_o = this.field_104045_g / 6 + 24 * (var2 >> 1);
      var2 += 2;
      var3 = field_104104_b;
      var4 = var3.length;

      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var3[var5];
         if(var6.func_111639_a()) {
            this.field_104050_h.add(new C_101299_atc(var6.func_111640_c(), this.field_104044_f / 2 - 155 + var2 % 2 * 160, this.field_104045_g / 6 + 24 * (var2 >> 1), var6, this.field_104103_d.func_111678_c(var6), this.field_104103_d.func_111675_a(var6)));
         } else {
            this.field_104050_h.add(new C_101300_atd(var6.func_111640_c(), this.field_104044_f / 2 - 155 + var2 % 2 * 160, this.field_104045_g / 6 + 24 * (var2 >> 1), var6, this.field_104103_d.func_111678_c(var6)));
         }

         ++var2;
      }

      this.field_104050_h.add(new C_101133_arl(200, this.field_104044_f / 2 - 100, this.field_104045_g / 6 + 168, var1.func_107651_b("gui.done")));
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f < 100 && var1 instanceof C_101300_atd) {
            this.field_104103_d.func_111679_a(((C_101300_atd)var1).func_103920_b(), 1);
            var1.field_103911_e = this.field_104103_d.func_111678_c(C_101123_arf.func_111636_a(var1.field_103908_f));
         }

         if(var1.field_103908_f == 200) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(this.field_104105_c);
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104109_m, this.field_104044_f / 2, 20, 16777215);
      this.func_103879_a(this.field_104049_k, this.field_104107_n, this.field_104044_f / 2, this.field_104108_o + 7, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

}
