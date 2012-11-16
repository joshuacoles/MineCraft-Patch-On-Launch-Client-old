import net.minecraft.client.Minecraft;

public class C_100940_awy {

   private final Minecraft field_111089_a;
   private final C_101250_awr field_111087_b;
   private int field_111088_c = -1;
   private int field_111085_d = -1;
   private int field_111086_e = -1;
   private float field_111083_f = 0.0F;
   private float field_111084_g = 0.0F;
   private float field_111093_h = 0.0F;
   private int field_111094_i = 0;
   private boolean field_111091_j = false;
   private C_100836_xn field_111092_k;
   private int field_111090_l;


   public C_100940_awy(Minecraft var1, C_101250_awr var2) {
      this.field_111092_k = C_100836_xn.field_110098_b;
      this.field_111090_l = 0;
      this.field_111089_a = var1;
      this.field_111087_b = var2;
   }

   public static void func_111076_a(Minecraft var0, C_100940_awy var1, int var2, int var3, int var4, int var5) {
      if(!var0.field_105122_e.func_109417_a(var0.field_105120_g, var2, var3, var4, var5)) {
         var1.func_111061_a(var2, var3, var4, var5);
      }

   }

   public void func_111063_a(C_101095_qg var1) {
      this.field_111092_k.func_110092_a(var1.field_103869_cf);
   }

   public boolean func_111057_a() {
      return false;
   }

   public void func_111073_a(C_100836_xn var1) {
      this.field_111092_k = var1;
      this.field_111092_k.func_110092_a(this.field_111089_a.field_105120_g.field_103869_cf);
   }

   public void func_111079_b(C_101095_qg var1) {
      var1.field_103236_z = -180.0F;
   }

   public boolean func_111066_b() {
      return this.field_111092_k.func_110087_e();
   }

   public boolean func_111061_a(int var1, int var2, int var3, int var4) {
      if(this.field_111092_k.func_110093_c() && !this.field_111089_a.field_105120_g.func_103818_f(var1, var2, var3)) {
         return false;
      } else {
         C_100942_awz var5 = this.field_111089_a.field_105122_e;
         C_100451_alf var6 = C_100451_alf.field_106118_p[var5.func_109349_a(var1, var2, var3)];
         if(var6 == null) {
            return false;
         } else {
            var5.func_109448_f(2001, var1, var2, var3, var6.field_106162_cm + (var5.func_109357_g(var1, var2, var3) << 12));
            int var7 = var5.func_109357_g(var1, var2, var3);
            boolean var8 = var5.func_109422_e(var1, var2, var3, 0);
            if(var8) {
               var6.func_106020_c(var5, var1, var2, var3, var7);
            }

            if(!this.field_111092_k.func_110089_d()) {
               C_100994_tv var9 = this.field_111089_a.field_105120_g.func_103780_bP();
               if(var9 != null) {
                  var9.func_111386_a(var5, var6.field_106162_cm, var1, var2, var3, this.field_111089_a.field_105120_g);
                  if(var9.field_111398_a == 0) {
                     this.field_111089_a.field_105120_g.func_103774_bQ();
                  }
               }
            }

            return var8;
         }
      }
   }

   public void func_111056_b(int var1, int var2, int var3, int var4) {
      if(!this.field_111092_k.func_110093_c() || this.field_111089_a.field_105120_g.func_103818_f(var1, var2, var3)) {
         if(this.field_111092_k.func_110089_d()) {
            this.field_111087_b.func_107034_c(new C_100229_ea(0, var1, var2, var3, var4));
            func_111076_a(this.field_111089_a, this, var1, var2, var3, var4);
            this.field_111094_i = 5;
         } else if(!this.field_111091_j || var1 != this.field_111088_c || var2 != this.field_111085_d || var3 != this.field_111086_e) {
            if(this.field_111091_j) {
               this.field_111087_b.func_107034_c(new C_100229_ea(2, var1, var2, var3, var4));
            }

            this.field_111087_b.func_107034_c(new C_100229_ea(0, var1, var2, var3, var4));
            int var5 = this.field_111089_a.field_105122_e.func_109349_a(var1, var2, var3);
            if(var5 > 0 && this.field_111083_f == 0.0F) {
               C_100451_alf.field_106118_p[var5].func_105993_a(this.field_111089_a.field_105122_e, var1, var2, var3, this.field_111089_a.field_105120_g);
            }

            if(var5 > 0 && C_100451_alf.field_106118_p[var5].func_106009_a(this.field_111089_a.field_105120_g, this.field_111089_a.field_105120_g.field_103229_p, var1, var2, var3) >= 1.0F) {
               this.func_111061_a(var1, var2, var3, var4);
            } else {
               this.field_111091_j = true;
               this.field_111088_c = var1;
               this.field_111085_d = var2;
               this.field_111086_e = var3;
               this.field_111083_f = 0.0F;
               this.field_111084_g = 0.0F;
               this.field_111093_h = 0.0F;
               this.field_111089_a.field_105122_e.func_109420_g(this.field_111089_a.field_105120_g.field_103212_k, this.field_111088_c, this.field_111085_d, this.field_111086_e, (int)(this.field_111083_f * 10.0F) - 1);
            }
         }

      }
   }

   public void func_111082_c() {
      if(this.field_111091_j) {
         this.field_111087_b.func_107034_c(new C_100229_ea(1, this.field_111088_c, this.field_111085_d, this.field_111086_e, -1));
      }

      this.field_111091_j = false;
      this.field_111083_f = 0.0F;
      this.field_111089_a.field_105122_e.func_109420_g(this.field_111089_a.field_105120_g.field_103212_k, this.field_111088_c, this.field_111085_d, this.field_111086_e, -1);
   }

   public void func_111071_c(int var1, int var2, int var3, int var4) {
      this.func_111059_j();
      if(this.field_111094_i > 0) {
         --this.field_111094_i;
      } else if(this.field_111092_k.func_110089_d()) {
         this.field_111094_i = 5;
         this.field_111087_b.func_107034_c(new C_100229_ea(0, var1, var2, var3, var4));
         func_111076_a(this.field_111089_a, this, var1, var2, var3, var4);
      } else {
         if(var1 == this.field_111088_c && var2 == this.field_111085_d && var3 == this.field_111086_e) {
            int var5 = this.field_111089_a.field_105122_e.func_109349_a(var1, var2, var3);
            if(var5 == 0) {
               this.field_111091_j = false;
               return;
            }

            C_100451_alf var6 = C_100451_alf.field_106118_p[var5];
            this.field_111083_f += var6.func_106009_a(this.field_111089_a.field_105120_g, this.field_111089_a.field_105120_g.field_103229_p, var1, var2, var3);
            if(this.field_111093_h % 4.0F == 0.0F && var6 != null) {
               this.field_111089_a.field_105097_A.func_105898_a(var6.field_106150_cz.func_107922_e(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.field_106150_cz.func_107921_c() + 1.0F) / 8.0F, var6.field_106150_cz.func_107918_d() * 0.5F);
            }

            ++this.field_111093_h;
            if(this.field_111083_f >= 1.0F) {
               this.field_111091_j = false;
               this.field_111087_b.func_107034_c(new C_100229_ea(2, var1, var2, var3, var4));
               this.func_111061_a(var1, var2, var3, var4);
               this.field_111083_f = 0.0F;
               this.field_111084_g = 0.0F;
               this.field_111093_h = 0.0F;
               this.field_111094_i = 5;
            }

            this.field_111089_a.field_105122_e.func_109420_g(this.field_111089_a.field_105120_g.field_103212_k, this.field_111088_c, this.field_111085_d, this.field_111086_e, (int)(this.field_111083_f * 10.0F) - 1);
         } else {
            this.func_111056_b(var1, var2, var3, var4);
         }

      }
   }

   public float func_111069_d() {
      return this.field_111092_k.func_110089_d()?5.0F:4.5F;
   }

   public void func_111081_e() {
      this.func_111059_j();
      this.field_111084_g = this.field_111083_f;
      this.field_111089_a.field_105097_A.func_105914_c();
   }

   private void func_111059_j() {
      int var1 = this.field_111089_a.field_105120_g.field_103857_bK.field_104831_c;
      if(var1 != this.field_111090_l) {
         this.field_111090_l = var1;
         this.field_111087_b.func_107034_c(new C_100291_ej(this.field_111090_l));
      }

   }

   public boolean func_111074_a(C_101095_qg var1, C_100873_xe var2, C_100994_tv var3, int var4, int var5, int var6, int var7, C_100387_amw var8) {
      this.func_111059_j();
      float var9 = (float)var8.field_107872_c - (float)var4;
      float var10 = (float)var8.field_107869_d - (float)var5;
      float var11 = (float)var8.field_107870_e - (float)var6;
      boolean var12 = false;
      int var13 = var2.func_109349_a(var4, var5, var6);
      if(var13 > 0 && C_100451_alf.field_106118_p[var13].func_106070_a(var2, var4, var5, var6, var1, var7, var9, var10, var11)) {
         var12 = true;
      }

      if(!var12 && var3 != null && var3.func_111365_b() instanceof C_100945_uu) {
         C_100945_uu var14 = (C_100945_uu)var3.func_111365_b();
         if(!var14.func_110978_a(var2, var4, var5, var6, var7, var1, var3)) {
            return false;
         }
      }

      this.field_111087_b.func_107034_c(new C_100277_fc(var4, var5, var6, var7, var1.field_103857_bK.func_104808_g(), var9, var10, var11));
      if(var12) {
         return true;
      } else if(var3 == null) {
         return false;
      } else if(this.field_111092_k.func_110089_d()) {
         int var17 = var3.func_111367_j();
         int var15 = var3.field_111398_a;
         boolean var16 = var3.func_111372_a(var1, var2, var4, var5, var6, var7, var9, var10, var11);
         var3.func_111371_b(var17);
         var3.field_111398_a = var15;
         return var16;
      } else {
         return var3.func_111372_a(var1, var2, var4, var5, var6, var7, var9, var10, var11);
      }
   }

   public boolean func_111062_a(C_101095_qg var1, C_100873_xe var2, C_100994_tv var3) {
      this.func_111059_j();
      this.field_111087_b.func_107034_c(new C_100277_fc(-1, -1, -1, 255, var1.field_103857_bK.func_104808_g(), 0.0F, 0.0F, 0.0F));
      int var4 = var3.field_111398_a;
      C_100994_tv var5 = var3.func_111378_a(var2, var1);
      if(var5 == var3 && (var5 == null || var5.field_111398_a == var4)) {
         return false;
      } else {
         var1.field_103857_bK.field_104832_a[var1.field_103857_bK.field_104831_c] = var5;
         if(var5.field_111398_a == 0) {
            var1.field_103857_bK.field_104832_a[var1.field_103857_bK.field_104831_c] = null;
         }

         return true;
      }
   }

   public C_100950_axc func_111078_a(C_100873_xe var1) {
      return new C_100950_axc(this.field_111089_a, var1, this.field_111089_a.field_105130_j, this.field_111087_b);
   }

   public void func_111068_a(C_101095_qg var1, C_100730_lb var2) {
      this.func_111059_j();
      this.field_111087_b.func_107034_c(new C_100244_dh(var1.field_103212_k, var2.field_103212_k, 1));
      var1.func_103775_p(var2);
   }

   public boolean func_111080_b(C_101095_qg var1, C_100730_lb var2) {
      this.func_111059_j();
      this.field_111087_b.func_107034_c(new C_100244_dh(var1.field_103212_k, var2.field_103212_k, 0));
      return var1.func_103794_o(var2);
   }

   public C_100994_tv func_111064_a(int var1, int var2, int var3, int var4, C_101095_qg var5) {
      short var6 = var5.field_103856_bM.func_111509_a(var5.field_103857_bK);
      C_100994_tv var7 = var5.field_103856_bM.func_111496_a(var2, var3, var4, var5);
      this.field_111087_b.func_107034_c(new C_100378_cu(var1, var2, var3, var4, var7, var6));
      return var7;
   }

   public void func_111067_a(int var1, int var2) {
      this.field_111087_b.func_107034_c(new C_100380_ct(var1, var2));
   }

   public void func_111060_a(C_100994_tv var1, int var2) {
      if(this.field_111092_k.func_110089_d()) {
         this.field_111087_b.func_107034_c(new C_100289_ek(var2, var1));
      }

   }

   public void func_111065_a(C_100994_tv var1) {
      if(this.field_111092_k.func_110089_d() && var1 != null) {
         this.field_111087_b.func_107034_c(new C_100289_ek(-1, var1));
      }

   }

   public void func_111072_c(C_101095_qg var1) {
      this.func_111059_j();
      this.field_111087_b.func_107034_c(new C_100229_ea(5, 0, 0, 0, 255));
      var1.func_103829_bK();
   }

   public boolean func_111077_f() {
      return true;
   }

   public boolean func_111075_g() {
      return !this.field_111092_k.func_110089_d();
   }

   public boolean func_111070_h() {
      return this.field_111092_k.func_110089_d();
   }

   public boolean func_111058_i() {
      return this.field_111092_k.func_110089_d();
   }
}
