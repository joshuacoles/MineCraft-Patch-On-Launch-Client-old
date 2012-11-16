import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class C_101294_atp extends C_101275_asy {

   protected int field_105882_b;
   protected List field_105886_h;
   protected Comparator field_105887_i;
   protected int field_105884_j;
   protected int field_105885_k;
   // $FF: synthetic field
   final C_101304_atj field_105883_l;


   protected C_101294_atp(C_101304_atj var1) {
      super(C_101304_atj.func_104365_f(var1), var1.field_104044_f, var1.field_104045_g, 32, var1.field_104045_g - 64, 20);
      this.field_105883_l = var1;
      this.field_105882_b = -1;
      this.field_105884_j = -1;
      this.field_105885_k = 0;
      this.func_105829_a(false);
      this.func_105835_a(true, 20);
   }

   protected void func_105827_a(int var1, boolean var2) {}

   protected boolean func_105831_a(int var1) {
      return false;
   }

   protected void func_105833_b() {
      this.field_105883_l.func_104035_z_();
   }

   protected void func_105823_a(int var1, int var2, C_100872_azb var3) {
      if(!Mouse.isButtonDown(0)) {
         this.field_105882_b = -1;
      }

      if(this.field_105882_b == 0) {
         C_101304_atj.func_104366_a(this.field_105883_l, var1 + 115 - 18, var2 + 1, 0, 0);
      } else {
         C_101304_atj.func_104366_a(this.field_105883_l, var1 + 115 - 18, var2 + 1, 0, 18);
      }

      if(this.field_105882_b == 1) {
         C_101304_atj.func_104366_a(this.field_105883_l, var1 + 165 - 18, var2 + 1, 0, 0);
      } else {
         C_101304_atj.func_104366_a(this.field_105883_l, var1 + 165 - 18, var2 + 1, 0, 18);
      }

      if(this.field_105882_b == 2) {
         C_101304_atj.func_104366_a(this.field_105883_l, var1 + 215 - 18, var2 + 1, 0, 0);
      } else {
         C_101304_atj.func_104366_a(this.field_105883_l, var1 + 215 - 18, var2 + 1, 0, 18);
      }

      if(this.field_105884_j != -1) {
         short var4 = 79;
         byte var5 = 18;
         if(this.field_105884_j == 1) {
            var4 = 129;
         } else if(this.field_105884_j == 2) {
            var4 = 179;
         }

         if(this.field_105885_k == 1) {
            var5 = 36;
         }

         C_101304_atj.func_104366_a(this.field_105883_l, var1 + var4, var2 + 1, var5, 0);
      }

   }

   protected void func_105836_a(int var1, int var2) {
      this.field_105882_b = -1;
      if(var1 >= 79 && var1 < 115) {
         this.field_105882_b = 0;
      } else if(var1 >= 129 && var1 < 165) {
         this.field_105882_b = 1;
      } else if(var1 >= 179 && var1 < 215) {
         this.field_105882_b = 2;
      }

      if(this.field_105882_b >= 0) {
         this.func_105880_e(this.field_105882_b);
         C_101304_atj.func_104361_g(this.field_105883_l).field_105097_A.func_105895_a("random.click", 1.0F, 1.0F);
      }

   }

   protected final int func_105830_a() {
      return this.field_105886_h.size();
   }

   protected final C_100811_jb func_105878_d(int var1) {
      return (C_100811_jb)this.field_105886_h.get(var1);
   }

   protected abstract String func_105877_c(int var1);

   protected void func_105881_a(C_100811_jb var1, int var2, int var3, boolean var4) {
      String var5;
      if(var1 != null) {
         var5 = var1.func_109911_a(C_101304_atj.func_104360_c(this.field_105883_l).func_105810_a(var1));
         this.field_105883_l.func_103880_b(C_101304_atj.func_104370_h(this.field_105883_l), var5, var2 - C_101304_atj.func_104374_i(this.field_105883_l).func_111778_a(var5), var3 + 5, var4?16777215:9474192);
      } else {
         var5 = "-";
         this.field_105883_l.func_103880_b(C_101304_atj.func_104356_j(this.field_105883_l), var5, var2 - C_101304_atj.func_104367_k(this.field_105883_l).func_111778_a(var5), var3 + 5, var4?16777215:9474192);
      }

   }

   protected void func_105828_b(int var1, int var2) {
      if(var2 >= this.field_105843_c && var2 <= this.field_105840_d) {
         int var3 = this.func_105824_c(var1, var2);
         int var4 = this.field_105883_l.field_104044_f / 2 - 92 - 16;
         if(var3 >= 0) {
            if(var1 < var4 + 40 || var1 > var4 + 40 + 20) {
               return;
            }

            C_100811_jb var5 = this.func_105878_d(var3);
            this.func_105879_a(var5, var1, var2);
         } else {
            String var9 = "";
            if(var1 >= var4 + 115 - 18 && var1 <= var4 + 115) {
               var9 = this.func_105877_c(0);
            } else if(var1 >= var4 + 165 - 18 && var1 <= var4 + 165) {
               var9 = this.func_105877_c(1);
            } else {
               if(var1 < var4 + 215 - 18 || var1 > var4 + 215) {
                  return;
               }

               var9 = this.func_105877_c(2);
            }

            var9 = ("" + C_100361_be.func_107654_a().func_107651_b(var9)).trim();
            if(var9.length() > 0) {
               int var6 = var1 + 12;
               int var7 = var2 - 12;
               int var8 = C_101304_atj.func_104357_l(this.field_105883_l).func_111778_a(var9);
               C_101304_atj.func_104359_a(this.field_105883_l, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
               C_101304_atj.func_104368_m(this.field_105883_l).func_111783_a(var9, var6, var7, -1);
            }
         }

      }
   }

   protected void func_105879_a(C_100811_jb var1, int var2, int var3) {
      if(var1 != null) {
         C_100992_tt var4 = C_100992_tt.field_110834_e[var1.func_109925_a()];
         String var5 = ("" + C_100361_be.func_107654_a().func_107655_c(var4.func_110793_a())).trim();
         if(var5.length() > 0) {
            int var6 = var2 + 12;
            int var7 = var3 - 12;
            int var8 = C_101304_atj.func_104373_n(this.field_105883_l).func_111778_a(var5);
            C_101304_atj.func_104375_b(this.field_105883_l, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
            C_101304_atj.func_104354_o(this.field_105883_l).func_111783_a(var5, var6, var7, -1);
         }

      }
   }

   protected void func_105880_e(int var1) {
      if(var1 != this.field_105884_j) {
         this.field_105884_j = var1;
         this.field_105885_k = -1;
      } else if(this.field_105885_k == -1) {
         this.field_105885_k = 1;
      } else {
         this.field_105884_j = -1;
         this.field_105885_k = 0;
      }

      Collections.sort(this.field_105886_h, this.field_105887_i);
   }
}
