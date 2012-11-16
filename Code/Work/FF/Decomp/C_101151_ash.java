import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class C_101151_ash extends C_101275_asy {

   // $FF: synthetic field
   final C_101148_asg field_105866_a;


   public C_101151_ash(C_101148_asg var1) {
      super(var1.field_104046_e, var1.field_104044_f, var1.field_104045_g, 32, var1.field_104045_g - 64, 36);
      this.field_105866_a = var1;
   }

   protected int func_105830_a() {
      return C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c() + C_101148_asg.func_104204_b(this.field_105866_a).size() + 1;
   }

   protected void func_105827_a(int var1, boolean var2) {
      if(var1 < C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c() + C_101148_asg.func_104204_b(this.field_105866_a).size()) {
         int var3 = C_101148_asg.func_104199_c(this.field_105866_a);
         C_101148_asg.func_104192_a(this.field_105866_a, var1);
         C_100909_axg var4 = C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c() > var1?C_101148_asg.func_104197_a(this.field_105866_a).func_110680_a(var1):null;
         boolean var5 = C_101148_asg.func_104199_c(this.field_105866_a) >= 0 && C_101148_asg.func_104199_c(this.field_105866_a) < this.func_105830_a() && (var4 == null || var4.field_110705_f == 47);
         boolean var6 = C_101148_asg.func_104199_c(this.field_105866_a) < C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c();
         C_101148_asg.func_104193_d(this.field_105866_a).field_103909_g = var5;
         C_101148_asg.func_104201_e(this.field_105866_a).field_103909_g = var6;
         C_101148_asg.func_104191_f(this.field_105866_a).field_103909_g = var6;
         if(var2 && var5) {
            C_101148_asg.func_104190_b(this.field_105866_a, var1);
         } else if(var6 && C_101278_asw.func_104041_p() && var3 >= 0 && var3 < C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c()) {
            C_101148_asg.func_104197_a(this.field_105866_a).func_110687_a(var3, C_101148_asg.func_104199_c(this.field_105866_a));
         }

      }
   }

   protected boolean func_105831_a(int var1) {
      return var1 == C_101148_asg.func_104199_c(this.field_105866_a);
   }

   protected int func_105822_d() {
      return this.func_105830_a() * 36;
   }

   protected void func_105833_b() {
      this.field_105866_a.func_104035_z_();
   }

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      if(var1 < C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c()) {
         this.func_105865_d(var1, var2, var3, var4, var5);
      } else if(var1 < C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c() + C_101148_asg.func_104204_b(this.field_105866_a).size()) {
         this.func_105863_b(var1, var2, var3, var4, var5);
      } else {
         this.func_105864_c(var1, var2, var3, var4, var5);
      }

   }

   private void func_105863_b(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100095_bcg var6 = (C_100095_bcg)C_101148_asg.func_104204_b(this.field_105866_a).get(var1 - C_101148_asg.func_104197_a(this.field_105866_a).func_110686_c());
      this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, C_100359_bd.func_107638_a("lanServer.title"), var2 + 2, var3 + 1, 16777215);
      this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var6.func_105763_a(), var2 + 2, var3 + 12, 8421504);
      if(this.field_105866_a.field_104046_e.field_105156_y.field_111731_w) {
         this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, C_100359_bd.func_107638_a("selectServer.hiddenAddress"), var2 + 2, var3 + 12 + 11, 3158064);
      } else {
         this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var6.func_105764_b(), var2 + 2, var3 + 12 + 11, 3158064);
      }

   }

   private void func_105864_c(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      this.field_105866_a.func_103879_a(this.field_105866_a.field_104049_k, C_100359_bd.func_107638_a("lanServer.scanning"), this.field_105866_a.field_104044_f / 2, var3 + 1, 16777215);
      String var6;
      switch(C_101148_asg.func_104186_g(this.field_105866_a) / 3 % 4) {
      case 0:
      default:
         var6 = "O o o";
         break;
      case 1:
      case 3:
         var6 = "o O o";
         break;
      case 2:
         var6 = "o o O";
      }

      this.field_105866_a.func_103879_a(this.field_105866_a.field_104049_k, var6, this.field_105866_a.field_104044_f / 2, var3 + 12, 8421504);
   }

   private void func_105865_d(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100909_axg var6 = C_101148_asg.func_104197_a(this.field_105866_a).func_110680_a(var1);
      synchronized(C_101148_asg.func_104194_h()) {
         if(C_101148_asg.func_104196_i() < 5 && !var6.field_110714_h) {
            var6.field_110714_h = true;
            var6.field_110708_e = -2L;
            var6.field_110707_d = "";
            var6.field_110710_c = "";
            C_101148_asg.func_104202_j();
            (new C_101150_asi(this, var6)).start();
         }
      }

      boolean var7 = var6.field_110705_f > 47;
      boolean var8 = var6.field_110705_f < 47;
      boolean var9 = var7 || var8;
      this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var6.field_110711_a, var2 + 2, var3 + 1, 16777215);
      this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var6.field_110707_d, var2 + 2, var3 + 12, 8421504);
      this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var6.field_110710_c, var2 + 215 - this.field_105866_a.field_104049_k.func_111778_a(var6.field_110710_c), var3 + 12, 8421504);
      if(var9) {
         String var10 = "§4" + var6.field_110706_g;
         this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var10, var2 + 200 - this.field_105866_a.field_104049_k.func_111778_a(var10), var3 + 1, 8421504);
      }

      if(!this.field_105866_a.field_104046_e.field_105156_y.field_111731_w && !var6.func_110700_d()) {
         this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, var6.field_110709_b, var2 + 2, var3 + 12 + 11, 3158064);
      } else {
         this.field_105866_a.func_103880_b(this.field_105866_a.field_104049_k, C_100359_bd.func_107638_a("selectServer.hiddenAddress"), var2 + 2, var3 + 12 + 11, 3158064);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_105866_a.field_104046_e.field_105127_o.func_110368_b(this.field_105866_a.field_104046_e.field_105127_o.func_110367_b("/gui/icons.png"));
      byte var16 = 0;
      boolean var11 = false;
      String var12 = "";
      int var15;
      if(var9) {
         var12 = var7?"Client out of date!":"Server out of date!";
         var15 = 5;
      } else if(var6.field_110714_h && var6.field_110708_e != -2L) {
         if(var6.field_110708_e < 0L) {
            var15 = 5;
         } else if(var6.field_110708_e < 150L) {
            var15 = 0;
         } else if(var6.field_110708_e < 300L) {
            var15 = 1;
         } else if(var6.field_110708_e < 600L) {
            var15 = 2;
         } else if(var6.field_110708_e < 1000L) {
            var15 = 3;
         } else {
            var15 = 4;
         }

         if(var6.field_110708_e < 0L) {
            var12 = "(no connection)";
         } else {
            var12 = var6.field_110708_e + "ms";
         }
      } else {
         var16 = 1;
         var15 = (int)(Minecraft.func_105063_F() / 100L + (long)(var1 * 2) & 7L);
         if(var15 > 4) {
            var15 = 8 - var15;
         }

         var12 = "Polling..";
      }

      this.field_105866_a.func_103877_b(var2 + 205, var3, 0 + var16 * 10, 176 + var15 * 8, 10, 8);
      byte var13 = 4;
      if(this.field_105838_f >= var2 + 205 - var13 && this.field_105839_g >= var3 - var13 && this.field_105838_f <= var2 + 205 + 10 + var13 && this.field_105839_g <= var3 + 8 + var13) {
         C_101148_asg.func_104203_a(this.field_105866_a, var12);
      }

   }
}
