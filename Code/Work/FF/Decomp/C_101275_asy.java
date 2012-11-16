import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class C_101275_asy {

   private final Minecraft field_105844_a;
   private int field_105842_b;
   private int field_105851_h;
   protected int field_105843_c;
   protected int field_105840_d;
   private int field_105852_i;
   private int field_105849_j;
   protected final int field_105841_e;
   private int field_105850_k;
   private int field_105847_l;
   protected int field_105838_f;
   protected int field_105839_g;
   private float field_105848_m = -2.0F;
   private float field_105845_n;
   private float field_105846_o;
   private int field_105857_p = -1;
   private long field_105856_q = 0L;
   private boolean field_105855_r = true;
   private boolean field_105854_s;
   private int field_105853_t;


   public C_101275_asy(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_105844_a = var1;
      this.field_105842_b = var2;
      this.field_105851_h = var3;
      this.field_105843_c = var4;
      this.field_105840_d = var5;
      this.field_105841_e = var6;
      this.field_105849_j = 0;
      this.field_105852_i = var2;
   }

   public void func_105818_a(int var1, int var2, int var3, int var4) {
      this.field_105842_b = var1;
      this.field_105851_h = var2;
      this.field_105843_c = var3;
      this.field_105840_d = var4;
      this.field_105849_j = 0;
      this.field_105852_i = var1;
   }

   public void func_105829_a(boolean var1) {
      this.field_105855_r = var1;
   }

   protected void func_105835_a(boolean var1, int var2) {
      this.field_105854_s = var1;
      this.field_105853_t = var2;
      if(!var1) {
         this.field_105853_t = 0;
      }

   }

   protected abstract int func_105830_a();

   protected abstract void func_105827_a(int var1, boolean var2);

   protected abstract boolean func_105831_a(int var1);

   protected int func_105822_d() {
      return this.func_105830_a() * this.field_105841_e + this.field_105853_t;
   }

   protected abstract void func_105833_b();

   protected abstract void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5);

   protected void func_105823_a(int var1, int var2, C_100872_azb var3) {}

   protected void func_105836_a(int var1, int var2) {}

   protected void func_105828_b(int var1, int var2) {}

   public int func_105824_c(int var1, int var2) {
      int var3 = this.field_105842_b / 2 - 110;
      int var4 = this.field_105842_b / 2 + 110;
      int var5 = var2 - this.field_105843_c - this.field_105853_t + (int)this.field_105846_o - 4;
      int var6 = var5 / this.field_105841_e;
      return var1 >= var3 && var1 <= var4 && var6 >= 0 && var5 >= 0 && var6 < this.func_105830_a()?var6:-1;
   }

   public void func_105832_a(List var1, int var2, int var3) {
      this.field_105850_k = var2;
      this.field_105847_l = var3;
   }

   private void func_105837_h() {
      int var1 = this.func_105821_e();
      if(var1 < 0) {
         var1 /= 2;
      }

      if(this.field_105846_o < 0.0F) {
         this.field_105846_o = 0.0F;
      }

      if(this.field_105846_o > (float)var1) {
         this.field_105846_o = (float)var1;
      }

   }

   public int func_105821_e() {
      return this.func_105822_d() - (this.field_105840_d - this.field_105843_c - 4);
   }

   public void func_105819_b(int var1) {
      this.field_105846_o += (float)var1;
      this.func_105837_h();
      this.field_105848_m = -2.0F;
   }

   public void func_105834_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == this.field_105850_k) {
            this.field_105846_o -= (float)(this.field_105841_e * 2 / 3);
            this.field_105848_m = -2.0F;
            this.func_105837_h();
         } else if(var1.field_103908_f == this.field_105847_l) {
            this.field_105846_o += (float)(this.field_105841_e * 2 / 3);
            this.field_105848_m = -2.0F;
            this.func_105837_h();
         }

      }
   }

   public void func_105826_a(int var1, int var2, float var3) {
      this.field_105838_f = var1;
      this.field_105839_g = var2;
      this.func_105833_b();
      int var4 = this.func_105830_a();
      int var5 = this.func_105825_c();
      int var6 = var5 + 6;
      int var9;
      int var10;
      int var11;
      int var13;
      int var19;
      if(Mouse.isButtonDown(0)) {
         if(this.field_105848_m == -1.0F) {
            boolean var7 = true;
            if(var2 >= this.field_105843_c && var2 <= this.field_105840_d) {
               int var8 = this.field_105842_b / 2 - 110;
               var9 = this.field_105842_b / 2 + 110;
               var10 = var2 - this.field_105843_c - this.field_105853_t + (int)this.field_105846_o - 4;
               var11 = var10 / this.field_105841_e;
               if(var1 >= var8 && var1 <= var9 && var11 >= 0 && var10 >= 0 && var11 < var4) {
                  boolean var12 = var11 == this.field_105857_p && Minecraft.func_105063_F() - this.field_105856_q < 250L;
                  this.func_105827_a(var11, var12);
                  this.field_105857_p = var11;
                  this.field_105856_q = Minecraft.func_105063_F();
               } else if(var1 >= var8 && var1 <= var9 && var10 < 0) {
                  this.func_105836_a(var1 - var8, var2 - this.field_105843_c + (int)this.field_105846_o - 4);
                  var7 = false;
               }

               if(var1 >= var5 && var1 <= var6) {
                  this.field_105845_n = -1.0F;
                  var19 = this.func_105821_e();
                  if(var19 < 1) {
                     var19 = 1;
                  }

                  var13 = (int)((float)((this.field_105840_d - this.field_105843_c) * (this.field_105840_d - this.field_105843_c)) / (float)this.func_105822_d());
                  if(var13 < 32) {
                     var13 = 32;
                  }

                  if(var13 > this.field_105840_d - this.field_105843_c - 8) {
                     var13 = this.field_105840_d - this.field_105843_c - 8;
                  }

                  this.field_105845_n /= (float)(this.field_105840_d - this.field_105843_c - var13) / (float)var19;
               } else {
                  this.field_105845_n = 1.0F;
               }

               if(var7) {
                  this.field_105848_m = (float)var2;
               } else {
                  this.field_105848_m = -2.0F;
               }
            } else {
               this.field_105848_m = -2.0F;
            }
         } else if(this.field_105848_m >= 0.0F) {
            this.field_105846_o -= ((float)var2 - this.field_105848_m) * this.field_105845_n;
            this.field_105848_m = (float)var2;
         }
      } else {
         while(Mouse.next()) {
            int var16 = Mouse.getEventDWheel();
            if(var16 != 0) {
               if(var16 > 0) {
                  var16 = -1;
               } else if(var16 < 0) {
                  var16 = 1;
               }

               this.field_105846_o += (float)(var16 * this.field_105841_e / 2);
            }
         }

         this.field_105848_m = -1.0F;
      }

      this.func_105837_h();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      C_100872_azb var18 = C_100872_azb.field_110346_a;
      GL11.glBindTexture(3553, this.field_105844_a.field_105127_o.func_110367_b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 32.0F;
      var18.func_110330_b();
      var18.func_110326_d(2105376);
      var18.func_110322_a((double)this.field_105849_j, (double)this.field_105840_d, 0.0D, (double)((float)this.field_105849_j / var17), (double)((float)(this.field_105840_d + (int)this.field_105846_o) / var17));
      var18.func_110322_a((double)this.field_105852_i, (double)this.field_105840_d, 0.0D, (double)((float)this.field_105852_i / var17), (double)((float)(this.field_105840_d + (int)this.field_105846_o) / var17));
      var18.func_110322_a((double)this.field_105852_i, (double)this.field_105843_c, 0.0D, (double)((float)this.field_105852_i / var17), (double)((float)(this.field_105843_c + (int)this.field_105846_o) / var17));
      var18.func_110322_a((double)this.field_105849_j, (double)this.field_105843_c, 0.0D, (double)((float)this.field_105849_j / var17), (double)((float)(this.field_105843_c + (int)this.field_105846_o) / var17));
      var18.func_110329_a();
      var9 = this.field_105842_b / 2 - 92 - 16;
      var10 = this.field_105843_c + 4 - (int)this.field_105846_o;
      if(this.field_105854_s) {
         this.func_105823_a(var9, var10, var18);
      }

      int var14;
      for(var11 = 0; var11 < var4; ++var11) {
         var19 = var10 + var11 * this.field_105841_e + this.field_105853_t;
         var13 = this.field_105841_e - 4;
         if(var19 <= this.field_105840_d && var19 + var13 >= this.field_105843_c) {
            if(this.field_105855_r && this.func_105831_a(var11)) {
               var14 = this.field_105842_b / 2 - 110;
               int var15 = this.field_105842_b / 2 + 110;
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glDisable(3553);
               var18.func_110330_b();
               var18.func_110326_d(8421504);
               var18.func_110322_a((double)var14, (double)(var19 + var13 + 2), 0.0D, 0.0D, 1.0D);
               var18.func_110322_a((double)var15, (double)(var19 + var13 + 2), 0.0D, 1.0D, 1.0D);
               var18.func_110322_a((double)var15, (double)(var19 - 2), 0.0D, 1.0D, 0.0D);
               var18.func_110322_a((double)var14, (double)(var19 - 2), 0.0D, 0.0D, 0.0D);
               var18.func_110326_d(0);
               var18.func_110322_a((double)(var14 + 1), (double)(var19 + var13 + 1), 0.0D, 0.0D, 1.0D);
               var18.func_110322_a((double)(var15 - 1), (double)(var19 + var13 + 1), 0.0D, 1.0D, 1.0D);
               var18.func_110322_a((double)(var15 - 1), (double)(var19 - 1), 0.0D, 1.0D, 0.0D);
               var18.func_110322_a((double)(var14 + 1), (double)(var19 - 1), 0.0D, 0.0D, 0.0D);
               var18.func_110329_a();
               GL11.glEnable(3553);
            }

            this.func_105820_a(var11, var9, var19, var13, var18);
         }
      }

      GL11.glDisable(2929);
      byte var20 = 4;
      this.func_105817_b(0, this.field_105843_c, 255, 255);
      this.func_105817_b(this.field_105840_d, this.field_105851_h, 255, 255);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var18.func_110330_b();
      var18.func_110332_a(0, 0);
      var18.func_110322_a((double)this.field_105849_j, (double)(this.field_105843_c + var20), 0.0D, 0.0D, 1.0D);
      var18.func_110322_a((double)this.field_105852_i, (double)(this.field_105843_c + var20), 0.0D, 1.0D, 1.0D);
      var18.func_110332_a(0, 255);
      var18.func_110322_a((double)this.field_105852_i, (double)this.field_105843_c, 0.0D, 1.0D, 0.0D);
      var18.func_110322_a((double)this.field_105849_j, (double)this.field_105843_c, 0.0D, 0.0D, 0.0D);
      var18.func_110329_a();
      var18.func_110330_b();
      var18.func_110332_a(0, 255);
      var18.func_110322_a((double)this.field_105849_j, (double)this.field_105840_d, 0.0D, 0.0D, 1.0D);
      var18.func_110322_a((double)this.field_105852_i, (double)this.field_105840_d, 0.0D, 1.0D, 1.0D);
      var18.func_110332_a(0, 0);
      var18.func_110322_a((double)this.field_105852_i, (double)(this.field_105840_d - var20), 0.0D, 1.0D, 0.0D);
      var18.func_110322_a((double)this.field_105849_j, (double)(this.field_105840_d - var20), 0.0D, 0.0D, 0.0D);
      var18.func_110329_a();
      var19 = this.func_105821_e();
      if(var19 > 0) {
         var13 = (this.field_105840_d - this.field_105843_c) * (this.field_105840_d - this.field_105843_c) / this.func_105822_d();
         if(var13 < 32) {
            var13 = 32;
         }

         if(var13 > this.field_105840_d - this.field_105843_c - 8) {
            var13 = this.field_105840_d - this.field_105843_c - 8;
         }

         var14 = (int)this.field_105846_o * (this.field_105840_d - this.field_105843_c - var13) / var19 + this.field_105843_c;
         if(var14 < this.field_105843_c) {
            var14 = this.field_105843_c;
         }

         var18.func_110330_b();
         var18.func_110332_a(0, 255);
         var18.func_110322_a((double)var5, (double)this.field_105840_d, 0.0D, 0.0D, 1.0D);
         var18.func_110322_a((double)var6, (double)this.field_105840_d, 0.0D, 1.0D, 1.0D);
         var18.func_110322_a((double)var6, (double)this.field_105843_c, 0.0D, 1.0D, 0.0D);
         var18.func_110322_a((double)var5, (double)this.field_105843_c, 0.0D, 0.0D, 0.0D);
         var18.func_110329_a();
         var18.func_110330_b();
         var18.func_110332_a(8421504, 255);
         var18.func_110322_a((double)var5, (double)(var14 + var13), 0.0D, 0.0D, 1.0D);
         var18.func_110322_a((double)var6, (double)(var14 + var13), 0.0D, 1.0D, 1.0D);
         var18.func_110322_a((double)var6, (double)var14, 0.0D, 1.0D, 0.0D);
         var18.func_110322_a((double)var5, (double)var14, 0.0D, 0.0D, 0.0D);
         var18.func_110329_a();
         var18.func_110330_b();
         var18.func_110332_a(12632256, 255);
         var18.func_110322_a((double)var5, (double)(var14 + var13 - 1), 0.0D, 0.0D, 1.0D);
         var18.func_110322_a((double)(var6 - 1), (double)(var14 + var13 - 1), 0.0D, 1.0D, 1.0D);
         var18.func_110322_a((double)(var6 - 1), (double)var14, 0.0D, 1.0D, 0.0D);
         var18.func_110322_a((double)var5, (double)var14, 0.0D, 0.0D, 0.0D);
         var18.func_110329_a();
      }

      this.func_105828_b(var1, var2);
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   protected int func_105825_c() {
      return this.field_105842_b / 2 + 124;
   }

   private void func_105817_b(int var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      GL11.glBindTexture(3553, this.field_105844_a.field_105127_o.func_110367_b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.func_110330_b();
      var5.func_110332_a(4210752, var4);
      var5.func_110322_a(0.0D, (double)var2, 0.0D, 0.0D, (double)((float)var2 / var6));
      var5.func_110322_a((double)this.field_105842_b, (double)var2, 0.0D, (double)((float)this.field_105842_b / var6), (double)((float)var2 / var6));
      var5.func_110332_a(4210752, var3);
      var5.func_110322_a((double)this.field_105842_b, (double)var1, 0.0D, (double)((float)this.field_105842_b / var6), (double)((float)var1 / var6));
      var5.func_110322_a(0.0D, (double)var1, 0.0D, 0.0D, (double)((float)var1 / var6));
      var5.func_110329_a();
   }
}
