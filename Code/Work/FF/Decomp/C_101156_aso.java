
public class C_101156_aso extends C_101278_asw {

   private static final C_101123_arf[] field_104226_b = new C_101123_arf[]{C_101123_arf.field_111653_a, C_101123_arf.field_111651_b, C_101123_arf.field_111652_c, C_101123_arf.field_111649_d, C_101123_arf.field_111650_e, C_101123_arf.field_111656_l};
   private final C_101278_asw field_104227_c;
   private final C_101125_ard field_104225_d;
   protected String field_104228_a = "Options";


   public C_101156_aso(C_101278_asw var1, C_101125_ard var2) {
      this.field_104227_c = var1;
      this.field_104225_d = var2;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      int var2 = 0;
      this.field_104228_a = var1.func_107651_b("options.title");
      C_101123_arf[] var3 = field_104226_b;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         C_101123_arf var6 = var3[var5];
         if(var6.func_111639_a()) {
            this.field_104050_h.add(new C_101299_atc(var6.func_111640_c(), this.field_104044_f / 2 - 155 + var2 % 2 * 160, this.field_104045_g / 6 + 24 * (var2 >> 1), var6, this.field_104225_d.func_111678_c(var6), this.field_104225_d.func_111675_a(var6)));
         } else {
            C_101300_atd var7 = new C_101300_atd(var6.func_111640_c(), this.field_104044_f / 2 - 155 + var2 % 2 * 160, this.field_104045_g / 6 + 24 * (var2 >> 1), var6, this.field_104225_d.func_111678_c(var6));
            if(var6 == C_101123_arf.field_111656_l && this.field_104046_e.field_105122_e != null && this.field_104046_e.field_105122_e.func_109429_J().func_107145_t()) {
               var7.field_103909_g = false;
               var7.field_103911_e = C_100359_bd.func_107638_a("options.difficulty") + ": " + C_100359_bd.func_107638_a("options.difficulty.hardcore");
            }

            this.field_104050_h.add(var7);
         }

         ++var2;
      }

      this.field_104050_h.add(new C_101133_arl(101, this.field_104044_f / 2 - 152, this.field_104045_g / 6 + 96 - 6, 150, 20, var1.func_107651_b("options.video")));
      this.field_104050_h.add(new C_101133_arl(100, this.field_104044_f / 2 + 2, this.field_104045_g / 6 + 96 - 6, 150, 20, var1.func_107651_b("options.controls")));
      this.field_104050_h.add(new C_101133_arl(102, this.field_104044_f / 2 - 152, this.field_104045_g / 6 + 120 - 6, 150, 20, var1.func_107651_b("options.language")));
      this.field_104050_h.add(new C_101133_arl(103, this.field_104044_f / 2 + 2, this.field_104045_g / 6 + 120 - 6, 150, 20, var1.func_107651_b("options.multiplayer.title")));
      this.field_104050_h.add(new C_101133_arl(104, this.field_104044_f / 2 + 2, this.field_104045_g / 6 + 144 - 6, 150, 20, var1.func_107651_b("options.snooper.view")));
      this.field_104050_h.add(new C_101133_arl(200, this.field_104044_f / 2 - 100, this.field_104045_g / 6 + 168, var1.func_107651_b("gui.done")));
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f < 100 && var1 instanceof C_101300_atd) {
            this.field_104225_d.func_111679_a(((C_101300_atd)var1).func_103920_b(), 1);
            var1.field_103911_e = this.field_104225_d.func_111678_c(C_101123_arf.func_111636_a(var1.field_103908_f));
         }

         if(var1.field_103908_f == 101) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(new C_101306_atg(this, this.field_104225_d));
         }

         if(var1.field_103908_f == 100) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(new C_101142_arr(this, this.field_104225_d));
         }

         if(var1.field_103908_f == 102) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(new C_101160_ask(this, this.field_104225_d));
         }

         if(var1.field_103908_f == 103) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(new C_101131_arn(this, this.field_104225_d));
         }

         if(var1.field_103908_f == 104) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(new C_101296_ate(this, this.field_104225_d));
         }

         if(var1.field_103908_f == 200) {
            this.field_104046_e.field_105156_y.func_111684_b();
            this.field_104046_e.func_105053_a(this.field_104227_c);
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104228_a, this.field_104044_f / 2, 20, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

}
