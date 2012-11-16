import org.lwjgl.opengl.GL11;

public class C_101146_ary extends C_101155_asd {

   private final C_101153_asb field_103975_a;
   private final int field_103973_b;
   private final int field_103974_c;
   private final int field_103971_d;
   private final int field_103972_e;
   private String field_103969_f = "";
   private int field_103970_g = 32;
   private int field_103981_h;
   private boolean field_103982_i = true;
   private boolean field_103980_k = true;
   private boolean field_103978_l = false;
   private boolean field_103979_m = true;
   private int field_103976_n = 0;
   private int field_103977_o = 0;
   private int field_103986_p = 0;
   private int field_103985_q = 14737632;
   private int field_103984_r = 7368816;
   private boolean field_103983_s = true;


   public C_101146_ary(C_101153_asb var1, int var2, int var3, int var4, int var5) {
      this.field_103975_a = var1;
      this.field_103973_b = var2;
      this.field_103974_c = var3;
      this.field_103971_d = var4;
      this.field_103972_e = var5;
   }

   public void func_103938_a() {
      ++this.field_103981_h;
   }

   public void func_103940_a(String var1) {
      if(var1.length() > this.field_103970_g) {
         this.field_103969_f = var1.substring(0, this.field_103970_g);
      } else {
         this.field_103969_f = var1;
      }

      this.func_103962_e();
   }

   public String func_103939_b() {
      return this.field_103969_f;
   }

   public String func_103967_c() {
      int var1 = this.field_103977_o < this.field_103986_p?this.field_103977_o:this.field_103986_p;
      int var2 = this.field_103977_o < this.field_103986_p?this.field_103986_p:this.field_103977_o;
      return this.field_103969_f.substring(var1, var2);
   }

   public void func_103951_b(String var1) {
      String var2 = "";
      String var3 = C_100011_m.func_105258_a(var1);
      int var4 = this.field_103977_o < this.field_103986_p?this.field_103977_o:this.field_103986_p;
      int var5 = this.field_103977_o < this.field_103986_p?this.field_103986_p:this.field_103977_o;
      int var6 = this.field_103970_g - this.field_103969_f.length() - (var4 - this.field_103986_p);
      boolean var7 = false;
      if(this.field_103969_f.length() > 0) {
         var2 = var2 + this.field_103969_f.substring(0, var4);
      }

      int var8;
      if(var6 < var3.length()) {
         var2 = var2 + var3.substring(0, var6);
         var8 = var6;
      } else {
         var2 = var2 + var3;
         var8 = var3.length();
      }

      if(this.field_103969_f.length() > 0 && var5 < this.field_103969_f.length()) {
         var2 = var2 + this.field_103969_f.substring(var5);
      }

      this.field_103969_f = var2;
      this.func_103942_d(var4 - this.field_103986_p + var8);
   }

   public void func_103937_a(int var1) {
      if(this.field_103969_f.length() != 0) {
         if(this.field_103986_p != this.field_103977_o) {
            this.func_103951_b("");
         } else {
            this.func_103935_b(this.func_103947_c(var1) - this.field_103977_o);
         }
      }
   }

   public void func_103935_b(int var1) {
      if(this.field_103969_f.length() != 0) {
         if(this.field_103986_p != this.field_103977_o) {
            this.func_103951_b("");
         } else {
            boolean var2 = var1 < 0;
            int var3 = var2?this.field_103977_o + var1:this.field_103977_o;
            int var4 = var2?this.field_103977_o:this.field_103977_o + var1;
            String var5 = "";
            if(var3 >= 0) {
               var5 = this.field_103969_f.substring(0, var3);
            }

            if(var4 < this.field_103969_f.length()) {
               var5 = var5 + this.field_103969_f.substring(var4);
            }

            this.field_103969_f = var5;
            if(var2) {
               this.func_103942_d(var1);
            }

         }
      }
   }

   public int func_103947_c(int var1) {
      return this.func_103943_a(var1, this.func_103958_h());
   }

   public int func_103943_a(int var1, int var2) {
      return this.func_103957_a(var1, this.func_103958_h(), true);
   }

   public int func_103957_a(int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = var1 < 0;
      int var6 = Math.abs(var1);

      for(int var7 = 0; var7 < var6; ++var7) {
         if(var5) {
            while(var3 && var4 > 0 && this.field_103969_f.charAt(var4 - 1) == 32) {
               --var4;
            }

            while(var4 > 0 && this.field_103969_f.charAt(var4 - 1) != 32) {
               --var4;
            }
         } else {
            int var8 = this.field_103969_f.length();
            var4 = this.field_103969_f.indexOf(32, var4);
            if(var4 == -1) {
               var4 = var8;
            } else {
               while(var3 && var4 < var8 && this.field_103969_f.charAt(var4) == 32) {
                  ++var4;
               }
            }
         }
      }

      return var4;
   }

   public void func_103942_d(int var1) {
      this.func_103950_e(this.field_103986_p + var1);
   }

   public void func_103950_e(int var1) {
      this.field_103977_o = var1;
      int var2 = this.field_103969_f.length();
      if(this.field_103977_o < 0) {
         this.field_103977_o = 0;
      }

      if(this.field_103977_o > var2) {
         this.field_103977_o = var2;
      }

      this.func_103959_i(this.field_103977_o);
   }

   public void func_103956_d() {
      this.func_103950_e(0);
   }

   public void func_103962_e() {
      this.func_103950_e(this.field_103969_f.length());
   }

   public boolean func_103961_a(char var1, int var2) {
      if(this.field_103979_m && this.field_103978_l) {
         switch(var1) {
         case 1:
            this.func_103962_e();
            this.func_103959_i(0);
            return true;
         case 3:
            C_101278_asw.func_104029_d(this.func_103967_c());
            return true;
         case 22:
            this.func_103951_b(C_101278_asw.func_104033_l());
            return true;
         case 24:
            C_101278_asw.func_104029_d(this.func_103967_c());
            this.func_103951_b("");
            return true;
         default:
            switch(var2) {
            case 14:
               if(C_101278_asw.func_104025_o()) {
                  this.func_103937_a(-1);
               } else {
                  this.func_103935_b(-1);
               }

               return true;
            case 199:
               if(C_101278_asw.func_104041_p()) {
                  this.func_103959_i(0);
               } else {
                  this.func_103956_d();
               }

               return true;
            case 203:
               if(C_101278_asw.func_104041_p()) {
                  if(C_101278_asw.func_104025_o()) {
                     this.func_103959_i(this.func_103943_a(-1, this.func_103946_n()));
                  } else {
                     this.func_103959_i(this.func_103946_n() - 1);
                  }
               } else if(C_101278_asw.func_104025_o()) {
                  this.func_103950_e(this.func_103947_c(-1));
               } else {
                  this.func_103942_d(-1);
               }

               return true;
            case 205:
               if(C_101278_asw.func_104041_p()) {
                  if(C_101278_asw.func_104025_o()) {
                     this.func_103959_i(this.func_103943_a(1, this.func_103946_n()));
                  } else {
                     this.func_103959_i(this.func_103946_n() + 1);
                  }
               } else if(C_101278_asw.func_104025_o()) {
                  this.func_103950_e(this.func_103947_c(1));
               } else {
                  this.func_103942_d(1);
               }

               return true;
            case 207:
               if(C_101278_asw.func_104041_p()) {
                  this.func_103959_i(this.field_103969_f.length());
               } else {
                  this.func_103962_e();
               }

               return true;
            case 211:
               if(C_101278_asw.func_104025_o()) {
                  this.func_103937_a(1);
               } else {
                  this.func_103935_b(1);
               }

               return true;
            default:
               if(C_100011_m.func_105259_a(var1)) {
                  this.func_103951_b(Character.toString(var1));
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   public void func_103952_a(int var1, int var2, int var3) {
      boolean var4 = var1 >= this.field_103973_b && var1 < this.field_103973_b + this.field_103971_d && var2 >= this.field_103974_c && var2 < this.field_103974_c + this.field_103972_e;
      if(this.field_103980_k) {
         this.func_103955_b(this.field_103979_m && var4);
      }

      if(this.field_103978_l && var3 == 0) {
         int var5 = var1 - this.field_103973_b;
         if(this.field_103982_i) {
            var5 -= 4;
         }

         String var6 = this.field_103975_a.func_111791_a(this.field_103969_f.substring(this.field_103976_n), this.func_103960_o());
         this.func_103950_e(this.field_103975_a.func_111791_a(var6, var5).length() + this.field_103976_n);
      }

   }

   public void func_103954_f() {
      if(this.func_103936_q()) {
         if(this.func_103941_i()) {
            func_103882_a(this.field_103973_b - 1, this.field_103974_c - 1, this.field_103973_b + this.field_103971_d + 1, this.field_103974_c + this.field_103972_e + 1, -6250336);
            func_103882_a(this.field_103973_b, this.field_103974_c, this.field_103973_b + this.field_103971_d, this.field_103974_c + this.field_103972_e, -16777216);
         }

         int var1 = this.field_103979_m?this.field_103985_q:this.field_103984_r;
         int var2 = this.field_103977_o - this.field_103976_n;
         int var3 = this.field_103986_p - this.field_103976_n;
         String var4 = this.field_103975_a.func_111791_a(this.field_103969_f.substring(this.field_103976_n), this.func_103960_o());
         boolean var5 = var2 >= 0 && var2 <= var4.length();
         boolean var6 = this.field_103978_l && this.field_103981_h / 6 % 2 == 0 && var5;
         int var7 = this.field_103982_i?this.field_103973_b + 4:this.field_103973_b;
         int var8 = this.field_103982_i?this.field_103974_c + (this.field_103972_e - 8) / 2:this.field_103974_c;
         int var9 = var7;
         if(var3 > var4.length()) {
            var3 = var4.length();
         }

         if(var4.length() > 0) {
            String var10 = var5?var4.substring(0, var2):var4;
            var9 = this.field_103975_a.func_111783_a(var10, var7, var8, var1);
         }

         boolean var13 = this.field_103977_o < this.field_103969_f.length() || this.field_103969_f.length() >= this.func_103968_g();
         int var11 = var9;
         if(!var5) {
            var11 = var2 > 0?var7 + this.field_103971_d:var7;
         } else if(var13) {
            var11 = var9 - 1;
            --var9;
         }

         if(var4.length() > 0 && var5 && var2 < var4.length()) {
            this.field_103975_a.func_111783_a(var4.substring(var2), var9, var8, var1);
         }

         if(var6) {
            if(var13) {
               C_101155_asd.func_103882_a(var11, var8 - 1, var11 + 1, var8 + 1 + this.field_103975_a.field_111811_b, -3092272);
            } else {
               this.field_103975_a.func_111783_a("_", var11, var8, var1);
            }
         }

         if(var3 != var2) {
            int var12 = var7 + this.field_103975_a.func_111778_a(var4.substring(0, var3));
            this.func_103948_c(var11, var8 - 1, var12 - 1, var8 + 1 + this.field_103975_a.field_111811_b);
         }

      }
   }

   private void func_103948_c(int var1, int var2, int var3, int var4) {
      int var5;
      if(var1 < var3) {
         var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      if(var2 < var4) {
         var5 = var2;
         var2 = var4;
         var4 = var5;
      }

      C_100872_azb var6 = C_100872_azb.field_110346_a;
      GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
      GL11.glDisable(3553);
      GL11.glEnable(3058);
      GL11.glLogicOp(5387);
      var6.func_110330_b();
      var6.func_110325_a((double)var1, (double)var4, 0.0D);
      var6.func_110325_a((double)var3, (double)var4, 0.0D);
      var6.func_110325_a((double)var3, (double)var2, 0.0D);
      var6.func_110325_a((double)var1, (double)var2, 0.0D);
      var6.func_110329_a();
      GL11.glDisable(3058);
      GL11.glEnable(3553);
   }

   public void func_103963_f(int var1) {
      this.field_103970_g = var1;
      if(this.field_103969_f.length() > var1) {
         this.field_103969_f = this.field_103969_f.substring(0, var1);
      }

   }

   public int func_103968_g() {
      return this.field_103970_g;
   }

   public int func_103958_h() {
      return this.field_103977_o;
   }

   public boolean func_103941_i() {
      return this.field_103982_i;
   }

   public void func_103945_a(boolean var1) {
      this.field_103982_i = var1;
   }

   public void func_103953_g(int var1) {
      this.field_103985_q = var1;
   }

   public void func_103964_h(int var1) {
      this.field_103984_r = var1;
   }

   public void func_103955_b(boolean var1) {
      if(var1 && !this.field_103978_l) {
         this.field_103981_h = 0;
      }

      this.field_103978_l = var1;
   }

   public boolean func_103966_l() {
      return this.field_103978_l;
   }

   public void func_103944_c(boolean var1) {
      this.field_103979_m = var1;
   }

   public int func_103946_n() {
      return this.field_103986_p;
   }

   public int func_103960_o() {
      return this.func_103941_i()?this.field_103971_d - 8:this.field_103971_d;
   }

   public void func_103959_i(int var1) {
      int var2 = this.field_103969_f.length();
      if(var1 > var2) {
         var1 = var2;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      this.field_103986_p = var1;
      if(this.field_103975_a != null) {
         if(this.field_103976_n > var2) {
            this.field_103976_n = var2;
         }

         int var3 = this.func_103960_o();
         String var4 = this.field_103975_a.func_111791_a(this.field_103969_f.substring(this.field_103976_n), var3);
         int var5 = var4.length() + this.field_103976_n;
         if(var1 == this.field_103976_n) {
            this.field_103976_n -= this.field_103975_a.func_111784_a(this.field_103969_f, var3, true).length();
         }

         if(var1 > var5) {
            this.field_103976_n += var1 - var5;
         } else if(var1 <= this.field_103976_n) {
            this.field_103976_n -= this.field_103976_n - var1;
         }

         if(this.field_103976_n < 0) {
            this.field_103976_n = 0;
         }

         if(this.field_103976_n > var2) {
            this.field_103976_n = var2;
         }
      }

   }

   public void func_103965_d(boolean var1) {
      this.field_103980_k = var1;
   }

   public boolean func_103936_q() {
      return this.field_103983_s;
   }

   public void func_103949_e(boolean var1) {
      this.field_103983_s = var1;
   }
}
