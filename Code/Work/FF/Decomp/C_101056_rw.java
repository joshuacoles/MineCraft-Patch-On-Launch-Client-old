
class C_101056_rw extends C_101048_rz {

   // $FF: synthetic field
   final C_100873_xe field_111473_a;
   // $FF: synthetic field
   final int field_111471_b;
   // $FF: synthetic field
   final int field_111472_c;
   // $FF: synthetic field
   final int field_111469_d;
   // $FF: synthetic field
   final C_101054_ru field_111470_e;


   C_101056_rw(C_101054_ru var1, C_100716_kl var2, int var3, int var4, int var5, C_100873_xe var6, int var7, int var8, int var9) {
      super(var2, var3, var4, var5);
      this.field_111470_e = var1;
      this.field_111473_a = var6;
      this.field_111471_b = var7;
      this.field_111472_c = var8;
      this.field_111469_d = var9;
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return false;
   }

   public boolean func_111451_a(C_101095_qg var1) {
      return (var1.field_103869_cf.field_111597_d || var1.field_103866_cg >= this.field_111470_e.field_111527_e) && this.field_111470_e.field_111527_e > 0 && this.func_111453_d();
   }

   public void func_111452_a(C_101095_qg var1, C_100994_tv var2) {
      if(!var1.field_103869_cf.field_111597_d) {
         var1.func_103804_a(-this.field_111470_e.field_111527_e);
      }

      C_101054_ru.func_111523_a(this.field_111470_e).func_103006_a(0, (C_100994_tv)null);
      if(C_101054_ru.func_111522_b(this.field_111470_e) > 0) {
         C_100994_tv var3 = C_101054_ru.func_111523_a(this.field_111470_e).func_103007_a(1);
         if(var3 != null && var3.field_111398_a > C_101054_ru.func_111522_b(this.field_111470_e)) {
            var3.field_111398_a -= C_101054_ru.func_111522_b(this.field_111470_e);
            C_101054_ru.func_111523_a(this.field_111470_e).func_103006_a(1, var3);
         } else {
            C_101054_ru.func_111523_a(this.field_111470_e).func_103006_a(1, (C_100994_tv)null);
         }
      } else {
         C_101054_ru.func_111523_a(this.field_111470_e).func_103006_a(1, (C_100994_tv)null);
      }

      this.field_111470_e.field_111527_e = 0;
      if(!var1.field_103869_cf.field_111597_d && !this.field_111473_a.field_109557_J && this.field_111473_a.func_109349_a(this.field_111471_b, this.field_111472_c, this.field_111469_d) == C_100451_alf.field_106164_ck.field_106162_cm && var1.func_103312_aA().nextFloat() < 0.12F) {
         int var6 = this.field_111473_a.func_109357_g(this.field_111471_b, this.field_111472_c, this.field_111469_d);
         int var4 = var6 & 3;
         int var5 = var6 >> 2;
         ++var5;
         if(var5 > 2) {
            this.field_111473_a.func_109422_e(this.field_111471_b, this.field_111472_c, this.field_111469_d, 0);
            this.field_111473_a.func_109448_f(1020, this.field_111471_b, this.field_111472_c, this.field_111469_d, 0);
         } else {
            this.field_111473_a.func_109488_c(this.field_111471_b, this.field_111472_c, this.field_111469_d, var4 | var5 << 2);
            this.field_111473_a.func_109448_f(1021, this.field_111471_b, this.field_111472_c, this.field_111469_d, 0);
         }
      } else if(!this.field_111473_a.field_109557_J) {
         this.field_111473_a.func_109448_f(1021, this.field_111471_b, this.field_111472_c, this.field_111469_d, 0);
      }

   }
}
