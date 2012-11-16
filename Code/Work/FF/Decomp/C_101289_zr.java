
public abstract class C_101289_zr {

   public C_100873_xe field_112400_a;
   public C_100845_xp field_112398_b;
   public String field_112399_c;
   public C_101311_ye field_112396_d;
   public boolean field_112397_e = false;
   public boolean field_112394_f = false;
   public float[] field_112395_g = new float[16];
   public int field_112401_h = 0;
   private float[] field_112402_i = new float[4];


   public final void func_112385_a(C_100873_xe var1) {
      this.field_112400_a = var1;
      this.field_112398_b = var1.func_109429_J().func_107143_u();
      this.field_112399_c = var1.func_109429_J().func_107127_y();
      this.func_112392_b();
      this.func_112375_a();
   }

   protected void func_112375_a() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.field_112395_g[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   protected void func_112392_b() {
      if(this.field_112400_a.func_109429_J().func_107143_u() == C_100845_xp.field_110159_c) {
         C_100511_abl var1 = C_100511_abl.func_108261_a(this.field_112400_a.func_109429_J().func_107127_y());
         this.field_112396_d = new C_101310_yh(C_101324_xz.field_112495_a[var1.func_108258_a()], 0.5F, 0.5F);
      } else {
         this.field_112396_d = new C_101311_ye(this.field_112400_a);
      }

   }

   public C_101331_yx func_112393_c() {
      return (C_101331_yx)(this.field_112398_b == C_100845_xp.field_110159_c?new C_101285_zx(this.field_112400_a, this.field_112400_a.func_109374_D(), this.field_112400_a.func_109429_J().func_107167_s(), this.field_112399_c):new C_100547_aac(this.field_112400_a, this.field_112400_a.func_109374_D(), this.field_112400_a.func_109429_J().func_107167_s()));
   }

   public boolean func_112386_a(int var1, int var2) {
      int var3 = this.field_112400_a.func_109489_b(var1, var2);
      return var3 == C_100451_alf.field_106121_x.field_106162_cm;
   }

   public float func_112382_a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if(var5 < 0.0F) {
         ++var5;
      }

      if(var5 > 1.0F) {
         --var5;
      }

      float var6 = var5;
      var5 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var6 + (var5 - var6) / 3.0F;
      return var5;
   }

   public int func_112377_b(long var1, float var3) {
      return (int)(var1 / 24000L) % 8;
   }

   public boolean func_112390_d() {
      return true;
   }

   public float[] func_112378_a(float var1, float var2) {
      float var3 = 0.4F;
      float var4 = C_100650_jv.func_108928_b(var1 * 3.1415927F * 2.0F) - 0.0F;
      float var5 = -0.0F;
      if(var4 >= var5 - var3 && var4 <= var5 + var3) {
         float var6 = (var4 - var5) / var3 * 0.5F + 0.5F;
         float var7 = 1.0F - (1.0F - C_100650_jv.func_108924_a(var6 * 3.1415927F)) * 0.99F;
         var7 *= var7;
         this.field_112402_i[0] = var6 * 0.3F + 0.7F;
         this.field_112402_i[1] = var6 * var6 * 0.7F + 0.2F;
         this.field_112402_i[2] = var6 * var6 * 0.0F + 0.2F;
         this.field_112402_i[3] = var7;
         return this.field_112402_i;
      } else {
         return null;
      }
   }

   public C_100387_amw func_112379_b(float var1, float var2) {
      float var3 = C_100650_jv.func_108928_b(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return this.field_112400_a.func_109363_R().func_107878_a((double)var4, (double)var5, (double)var6);
   }

   public boolean func_112388_e() {
      return true;
   }

   public static C_101289_zr func_112381_a(int var0) {
      return (C_101289_zr)(var0 == -1?new C_101287_zs():(var0 == 0?new C_101293_zt():(var0 == 1?new C_101291_zu():null)));
   }

   public float func_112391_f() {
      return 128.0F;
   }

   public boolean func_112380_g() {
      return true;
   }

   public C_100013_k func_112374_h() {
      return null;
   }

   public int func_112376_i() {
      return this.field_112398_b == C_100845_xp.field_110159_c?4:64;
   }

   public boolean func_112383_j() {
      return this.field_112398_b != C_100845_xp.field_110159_c && !this.field_112394_f;
   }

   public double func_112384_k() {
      return this.field_112398_b == C_100845_xp.field_110159_c?1.0D:0.03125D;
   }

   public boolean func_112389_b(int var1, int var2) {
      return false;
   }

   public abstract String func_112387_l();
}
