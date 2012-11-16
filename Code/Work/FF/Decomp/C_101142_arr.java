
public class C_101142_arr extends C_101278_asw {

   private C_101278_asw field_104160_b;
   protected String field_104162_a = "Controls";
   private C_101125_ard field_104161_c;
   private int field_104159_d = -1;


   public C_101142_arr(C_101278_asw var1, C_101125_ard var2) {
      this.field_104160_b = var1;
      this.field_104161_c = var2;
   }

   private int func_104158_g() {
      return this.field_104044_f / 2 - 155;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      int var2 = this.func_104158_g();

      for(int var3 = 0; var3 < this.field_104161_c.field_111699_O.length; ++var3) {
         this.field_104050_h.add(new C_101300_atd(var3, var2 + var3 % 2 * 160, this.field_104045_g / 6 + 24 * (var3 >> 1), 70, 20, this.field_104161_c.func_111680_b(var3)));
      }

      this.field_104050_h.add(new C_101133_arl(200, this.field_104044_f / 2 - 100, this.field_104045_g / 6 + 168, var1.func_107651_b("gui.done")));
      this.field_104162_a = var1.func_107651_b("controls.title");
   }

   protected void func_104040_a(C_101133_arl var1) {
      for(int var2 = 0; var2 < this.field_104161_c.field_111699_O.length; ++var2) {
         ((C_101133_arl)this.field_104050_h.get(var2)).field_103911_e = this.field_104161_c.func_111680_b(var2);
      }

      if(var1.field_103908_f == 200) {
         this.field_104046_e.func_105053_a(this.field_104160_b);
      } else {
         this.field_104159_d = var1.field_103908_f;
         var1.field_103911_e = "> " + this.field_104161_c.func_111680_b(var1.field_103908_f) + " <";
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      if(this.field_104159_d >= 0) {
         this.field_104161_c.func_111688_a(this.field_104159_d, -100 + var3);
         ((C_101133_arl)this.field_104050_h.get(this.field_104159_d)).field_103911_e = this.field_104161_c.func_111680_b(this.field_104159_d);
         this.field_104159_d = -1;
         C_101207_aqi.func_111985_b();
      } else {
         super.func_104028_a(var1, var2, var3);
      }

   }

   protected void func_104032_a(char var1, int var2) {
      if(this.field_104159_d >= 0) {
         this.field_104161_c.func_111688_a(this.field_104159_d, var2);
         ((C_101133_arl)this.field_104050_h.get(this.field_104159_d)).field_103911_e = this.field_104161_c.func_111680_b(this.field_104159_d);
         this.field_104159_d = -1;
         C_101207_aqi.func_111985_b();
      } else {
         super.func_104032_a(var1, var2);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104162_a, this.field_104044_f / 2, 20, 16777215);
      int var4 = this.func_104158_g();
      int var5 = 0;

      while(var5 < this.field_104161_c.field_111699_O.length) {
         boolean var6 = false;
         int var7 = 0;

         while(true) {
            if(var7 < this.field_104161_c.field_111699_O.length) {
               if(var7 == var5 || this.field_104161_c.field_111699_O[var5].field_111989_d != this.field_104161_c.field_111699_O[var7].field_111989_d) {
                  ++var7;
                  continue;
               }

               var6 = true;
            }

            if(this.field_104159_d == var5) {
               ((C_101133_arl)this.field_104050_h.get(var5)).field_103911_e = "§f> §e??? §f<";
            } else if(var6) {
               ((C_101133_arl)this.field_104050_h.get(var5)).field_103911_e = "§c" + this.field_104161_c.func_111680_b(var5);
            } else {
               ((C_101133_arl)this.field_104050_h.get(var5)).field_103911_e = this.field_104161_c.func_111680_b(var5);
            }

            this.func_103880_b(this.field_104049_k, this.field_104161_c.func_111682_a(var5), var4 + var5 % 2 * 160 + 70 + 6, this.field_104045_g / 6 + 24 * (var5 >> 1) + 7, -1);
            ++var5;
            break;
         }
      }

      super.func_104027_a(var1, var2, var3);
   }
}
