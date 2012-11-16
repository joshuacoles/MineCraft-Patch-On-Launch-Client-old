import java.util.Iterator;

public class C_100416_amh extends C_100398_amm {

   public int field_102986_a = -1;
   private String field_102980_d = "Pig";
   private C_100353_bh field_102981_e = null;
   public double field_102983_b;
   public double field_102985_c = 0.0D;
   private int field_102978_f = 200;
   private int field_102979_g = 800;
   private int field_102988_h = 4;
   private C_100730_lb field_102989_i;
   private int field_102987_j = 6;
   private int field_102984_r = 16;
   private int field_102982_s = 4;


   public C_100416_amh() {
      this.field_102986_a = 20;
   }

   public String func_102973_a() {
      return this.field_102980_d;
   }

   public void func_102976_a(String var1) {
      this.field_102980_d = var1;
   }

   public boolean func_102977_b() {
      return this.field_102940_k.func_109504_a((double)this.field_102938_l + 0.5D, (double)this.field_102939_m + 0.5D, (double)this.field_102936_n + 0.5D, (double)this.field_102984_r) != null;
   }

   public void func_102921_g() {
      if(this.func_102977_b()) {
         if(this.field_102940_k.field_109557_J) {
            double var1 = (double)((float)this.field_102938_l + this.field_102940_k.field_109577_u.nextFloat());
            double var3 = (double)((float)this.field_102939_m + this.field_102940_k.field_109577_u.nextFloat());
            double var5 = (double)((float)this.field_102936_n + this.field_102940_k.field_109577_u.nextFloat());
            this.field_102940_k.func_109428_a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
            this.field_102940_k.func_109428_a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);
            if(this.field_102986_a > 0) {
               --this.field_102986_a;
            }

            this.field_102985_c = this.field_102983_b;
            this.field_102983_b = (this.field_102983_b + (double)(1000.0F / ((float)this.field_102986_a + 200.0F))) % 360.0D;
         } else {
            if(this.field_102986_a == -1) {
               this.func_102974_e();
            }

            if(this.field_102986_a > 0) {
               --this.field_102986_a;
               return;
            }

            for(int var11 = 0; var11 < this.field_102988_h; ++var11) {
               C_100730_lb var2 = C_100727_lf.func_109316_a(this.field_102980_d, this.field_102940_k);
               if(var2 == null) {
                  return;
               }

               int var12 = this.field_102940_k.func_109518_a(var2.getClass(), C_100412_amr.func_107892_a().func_107844_a((double)this.field_102938_l, (double)this.field_102939_m, (double)this.field_102936_n, (double)(this.field_102938_l + 1), (double)(this.field_102939_m + 1), (double)(this.field_102936_n + 1)).func_107895_b((double)(this.field_102982_s * 2), 4.0D, (double)(this.field_102982_s * 2))).size();
               if(var12 >= this.field_102987_j) {
                  this.func_102974_e();
                  return;
               }

               if(var2 != null) {
                  double var4 = (double)this.field_102938_l + (this.field_102940_k.field_109577_u.nextDouble() - this.field_102940_k.field_109577_u.nextDouble()) * (double)this.field_102982_s;
                  double var6 = (double)(this.field_102939_m + this.field_102940_k.field_109577_u.nextInt(3) - 1);
                  double var8 = (double)this.field_102936_n + (this.field_102940_k.field_109577_u.nextDouble() - this.field_102940_k.field_109577_u.nextDouble()) * (double)this.field_102982_s;
                  C_100595_ln var10 = var2 instanceof C_100595_ln?(C_100595_ln)var2:null;
                  var2.func_103055_b(var4, var6, var8, this.field_102940_k.field_109577_u.nextFloat() * 360.0F, 0.0F);
                  if(var10 == null || var10.func_103380_bp()) {
                     this.func_102972_a(var2);
                     this.field_102940_k.func_109513_d(var2);
                     this.field_102940_k.func_109448_f(2004, this.field_102938_l, this.field_102939_m, this.field_102936_n, 0);
                     if(var10 != null) {
                        var10.func_103382_aQ();
                     }

                     this.func_102974_e();
                  }
               }
            }
         }

         super.func_102921_g();
      }
   }

   public void func_102972_a(C_100730_lb var1) {
      if(this.field_102981_e != null) {
         C_100353_bh var2 = new C_100353_bh();
         var1.func_103074_c(var2);
         Iterator var3 = this.field_102981_e.func_107510_c().iterator();

         while(var3.hasNext()) {
            C_100331_bu var4 = (C_100331_bu)var3.next();
            var2.func_107530_a(var4.func_107492_e(), var4.func_107485_b());
         }

         var1.func_103077_e(var2);
      } else if(var1 instanceof C_100595_ln && var1.field_103229_p != null) {
         ((C_100595_ln)var1).func_103337_bD();
      }

   }

   private void func_102974_e() {
      this.field_102986_a = this.field_102978_f + this.field_102940_k.field_109577_u.nextInt(this.field_102979_g - this.field_102978_f);
      this.field_102940_k.func_109467_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, this.func_102916_q().field_106162_cm, 1, 0);
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      this.field_102980_d = var1.func_107534_i("EntityId");
      this.field_102986_a = var1.func_107517_d("Delay");
      if(var1.func_107516_b("SpawnData")) {
         this.field_102981_e = var1.func_107521_l("SpawnData");
      } else {
         this.field_102981_e = null;
      }

      if(var1.func_107516_b("MinSpawnDelay")) {
         this.field_102978_f = var1.func_107517_d("MinSpawnDelay");
         this.field_102979_g = var1.func_107517_d("MaxSpawnDelay");
         this.field_102988_h = var1.func_107517_d("SpawnCount");
      }

      if(var1.func_107516_b("MaxNearbyEntities")) {
         this.field_102987_j = var1.func_107517_d("MaxNearbyEntities");
         this.field_102984_r = var1.func_107517_d("RequiredPlayerRange");
      }

      if(var1.func_107516_b("SpawnRange")) {
         this.field_102982_s = var1.func_107517_d("SpawnRange");
      }

   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107533_a("EntityId", this.field_102980_d);
      var1.func_107532_a("Delay", (short)this.field_102986_a);
      var1.func_107532_a("MinSpawnDelay", (short)this.field_102978_f);
      var1.func_107532_a("MaxSpawnDelay", (short)this.field_102979_g);
      var1.func_107532_a("SpawnCount", (short)this.field_102988_h);
      var1.func_107532_a("MaxNearbyEntities", (short)this.field_102987_j);
      var1.func_107532_a("RequiredPlayerRange", (short)this.field_102984_r);
      var1.func_107532_a("SpawnRange", (short)this.field_102982_s);
      if(this.field_102981_e != null) {
         var1.func_107538_a("SpawnData", this.field_102981_e);
      }

   }

   public C_100730_lb func_102975_c() {
      if(this.field_102989_i == null) {
         C_100730_lb var1 = C_100727_lf.func_109316_a(this.func_102973_a(), (C_100873_xe)null);
         this.func_102972_a(var1);
         this.field_102989_i = var1;
      }

      return this.field_102989_i;
   }

   public C_100219_dx func_102924_l() {
      C_100353_bh var1 = new C_100353_bh();
      this.func_102915_b(var1);
      return new C_100271_ey(this.field_102938_l, this.field_102939_m, this.field_102936_n, 1, var1);
   }

   public void func_102918_b(int var1, int var2) {
      if(var1 == 1 && this.field_102940_k.field_109557_J) {
         this.field_102986_a = this.field_102978_f;
      }

   }
}
