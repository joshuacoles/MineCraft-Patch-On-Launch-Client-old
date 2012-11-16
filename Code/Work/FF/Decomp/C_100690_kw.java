
public class C_100690_kw {

   public static final C_100690_kw[] field_109169_a = new C_100690_kw[32];
   public static final C_100690_kw field_109167_b = null;
   public static final C_100690_kw field_109168_c = (new C_100690_kw(1, false, 8171462)).func_109145_b("potion.moveSpeed").func_109143_b(0, 0);
   public static final C_100690_kw field_109165_d = (new C_100690_kw(2, true, 5926017)).func_109145_b("potion.moveSlowdown").func_109143_b(1, 0);
   public static final C_100690_kw field_109166_e = (new C_100690_kw(3, false, 14270531)).func_109145_b("potion.digSpeed").func_109143_b(2, 0).func_109146_a(1.5D);
   public static final C_100690_kw field_109163_f = (new C_100690_kw(4, true, 4866583)).func_109145_b("potion.digSlowDown").func_109143_b(3, 0);
   public static final C_100690_kw field_109164_g = (new C_100690_kw(5, false, 9643043)).func_109145_b("potion.damageBoost").func_109143_b(4, 0);
   public static final C_100690_kw field_109176_h = (new C_100704_kv(6, false, 16262179)).func_109145_b("potion.heal");
   public static final C_100690_kw field_109177_i = (new C_100704_kv(7, true, 4393481)).func_109145_b("potion.harm");
   public static final C_100690_kw field_109174_j = (new C_100690_kw(8, false, 7889559)).func_109145_b("potion.jump").func_109143_b(2, 1);
   public static final C_100690_kw field_109175_k = (new C_100690_kw(9, true, 5578058)).func_109145_b("potion.confusion").func_109143_b(3, 1).func_109146_a(0.25D);
   public static final C_100690_kw field_109172_l = (new C_100690_kw(10, false, 13458603)).func_109145_b("potion.regeneration").func_109143_b(7, 0).func_109146_a(0.25D);
   public static final C_100690_kw field_109173_m = (new C_100690_kw(11, false, 10044730)).func_109145_b("potion.resistance").func_109143_b(6, 1);
   public static final C_100690_kw field_109170_n = (new C_100690_kw(12, false, 14981690)).func_109145_b("potion.fireResistance").func_109143_b(7, 1);
   public static final C_100690_kw field_109171_o = (new C_100690_kw(13, false, 3035801)).func_109145_b("potion.waterBreathing").func_109143_b(0, 2);
   public static final C_100690_kw field_109185_p = (new C_100690_kw(14, false, 8356754)).func_109145_b("potion.invisibility").func_109143_b(0, 1);
   public static final C_100690_kw field_109184_q = (new C_100690_kw(15, true, 2039587)).func_109145_b("potion.blindness").func_109143_b(5, 1).func_109146_a(0.25D);
   public static final C_100690_kw field_109183_r = (new C_100690_kw(16, false, 2039713)).func_109145_b("potion.nightVision").func_109143_b(4, 1);
   public static final C_100690_kw field_109182_s = (new C_100690_kw(17, true, 5797459)).func_109145_b("potion.hunger").func_109143_b(1, 1);
   public static final C_100690_kw field_109181_t = (new C_100690_kw(18, true, 4738376)).func_109145_b("potion.weakness").func_109143_b(5, 0);
   public static final C_100690_kw field_109180_u = (new C_100690_kw(19, true, 5149489)).func_109145_b("potion.poison").func_109143_b(6, 0).func_109146_a(0.25D);
   public static final C_100690_kw field_109179_v = (new C_100690_kw(20, true, 3484199)).func_109145_b("potion.wither").func_109143_b(1, 2).func_109146_a(0.25D);
   public static final C_100690_kw field_109178_w = null;
   public static final C_100690_kw field_109188_x = null;
   public static final C_100690_kw field_109187_y = null;
   public static final C_100690_kw field_109186_z = null;
   public static final C_100690_kw field_109153_A = null;
   public static final C_100690_kw field_109154_B = null;
   public static final C_100690_kw field_109155_C = null;
   public static final C_100690_kw field_109149_D = null;
   public static final C_100690_kw field_109150_E = null;
   public static final C_100690_kw field_109151_F = null;
   public static final C_100690_kw field_109152_G = null;
   public final int field_109159_H;
   private String field_109160_I = "";
   private int field_109161_J = -1;
   private final boolean field_109162_K;
   private double field_109156_L;
   private boolean field_109157_M;
   private final int field_109158_N;


   protected C_100690_kw(int var1, boolean var2, int var3) {
      this.field_109159_H = var1;
      field_109169_a[var1] = this;
      this.field_109162_K = var2;
      if(var2) {
         this.field_109156_L = 0.5D;
      } else {
         this.field_109156_L = 1.0D;
      }

      this.field_109158_N = var3;
   }

   protected C_100690_kw func_109143_b(int var1, int var2) {
      this.field_109161_J = var1 + var2 * 8;
      return this;
   }

   public int func_109138_c() {
      return this.field_109159_H;
   }

   public void func_109136_a(C_100595_ln var1, int var2) {
      if(this.field_109159_H == field_109172_l.field_109159_H) {
         if(var1.func_103330_aT() < var1.func_103378_aS()) {
            var1.func_103392_i(1);
         }
      } else if(this.field_109159_H == field_109180_u.field_109159_H) {
         if(var1.func_103330_aT() > 1) {
            var1.func_103085_a(C_100698_ks.field_109239_m, 1);
         }
      } else if(this.field_109159_H == field_109179_v.field_109159_H) {
         var1.func_103085_a(C_100698_ks.field_109236_n, 1);
      } else if(this.field_109159_H == field_109182_s.field_109159_H && var1 instanceof C_101095_qg) {
         ((C_101095_qg)var1).func_103792_j(0.025F * (float)(var2 + 1));
      } else if((this.field_109159_H != field_109176_h.field_109159_H || var1.func_103388_bx()) && (this.field_109159_H != field_109177_i.field_109159_H || !var1.func_103388_bx())) {
         if(this.field_109159_H == field_109177_i.field_109159_H && !var1.func_103388_bx() || this.field_109159_H == field_109176_h.field_109159_H && var1.func_103388_bx()) {
            var1.func_103085_a(C_100698_ks.field_109239_m, 6 << var2);
         }
      } else {
         var1.func_103392_i(6 << var2);
      }

   }

   public void func_109147_a(C_100595_ln var1, C_100595_ln var2, int var3, double var4) {
      int var6;
      if((this.field_109159_H != field_109176_h.field_109159_H || var2.func_103388_bx()) && (this.field_109159_H != field_109177_i.field_109159_H || !var2.func_103388_bx())) {
         if(this.field_109159_H == field_109177_i.field_109159_H && !var2.func_103388_bx() || this.field_109159_H == field_109176_h.field_109159_H && var2.func_103388_bx()) {
            var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
            if(var1 == null) {
               var2.func_103085_a(C_100698_ks.field_109239_m, var6);
            } else {
               var2.func_103085_a(C_100698_ks.func_109225_b(var2, var1), var6);
            }
         }
      } else {
         var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
         var2.func_103392_i(var6);
      }

   }

   public boolean func_109148_b() {
      return false;
   }

   public boolean func_109139_a(int var1, int var2) {
      int var3;
      if(this.field_109159_H != field_109172_l.field_109159_H && this.field_109159_H != field_109180_u.field_109159_H) {
         if(this.field_109159_H == field_109179_v.field_109159_H) {
            var3 = 40 >> var2;
            return var3 > 0?var1 % var3 == 0:true;
         } else {
            return this.field_109159_H == field_109182_s.field_109159_H;
         }
      } else {
         var3 = 25 >> var2;
         return var3 > 0?var1 % var3 == 0:true;
      }
   }

   public C_100690_kw func_109145_b(String var1) {
      this.field_109160_I = var1;
      return this;
   }

   public String func_109135_a() {
      return this.field_109160_I;
   }

   public boolean func_109141_d() {
      return this.field_109161_J >= 0;
   }

   public int func_109134_e() {
      return this.field_109161_J;
   }

   public boolean func_109140_f() {
      return this.field_109162_K;
   }

   public static String func_109144_a(C_100692_kx var0) {
      int var1 = var0.func_109193_b();
      return C_100679_kd.func_109121_a(var1);
   }

   protected C_100690_kw func_109146_a(double var1) {
      this.field_109156_L = var1;
      return this;
   }

   public double func_109133_g() {
      return this.field_109156_L;
   }

   public boolean func_109137_i() {
      return this.field_109157_M;
   }

   public int func_109142_j() {
      return this.field_109158_N;
   }

}
