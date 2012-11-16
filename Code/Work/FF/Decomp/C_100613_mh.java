
public class C_100613_mh extends C_100621_mm {

   private C_100595_ln field_108081_b;
   private C_100873_xe field_108082_c;
   int field_108083_a = 0;


   public C_100613_mh(C_100595_ln var1) {
      this.field_108081_b = var1;
      this.field_108082_c = var1.field_103229_p;
      this.func_108030_a(7);
   }

   public boolean func_108033_a() {
      if(this.field_108081_b.func_103312_aA().nextInt(this.field_108081_b.func_103357_h_()?50:1000) != 0) {
         return false;
      } else {
         int var1 = C_100650_jv.func_108910_c(this.field_108081_b.field_103221_t);
         int var2 = C_100650_jv.func_108910_c(this.field_108081_b.field_103219_u);
         int var3 = C_100650_jv.func_108910_c(this.field_108081_b.field_103217_v);
         return this.field_108082_c.func_109349_a(var1, var2, var3) == C_100451_alf.field_106244_aa.field_106162_cm && this.field_108082_c.func_109357_g(var1, var2, var3) == 1?true:this.field_108082_c.func_109349_a(var1, var2 - 1, var3) == C_100451_alf.field_106121_x.field_106162_cm;
      }
   }

   public void func_108034_c() {
      this.field_108083_a = 40;
      this.field_108082_c.func_109464_a(this.field_108081_b, (byte)10);
      this.field_108081_b.func_103383_ay().func_108299_g();
   }

   public void func_108029_d() {
      this.field_108083_a = 0;
   }

   public boolean func_108036_b() {
      return this.field_108083_a > 0;
   }

   public int func_108080_f() {
      return this.field_108083_a;
   }

   public void func_108031_e() {
      this.field_108083_a = Math.max(0, this.field_108083_a - 1);
      if(this.field_108083_a == 4) {
         int var1 = C_100650_jv.func_108910_c(this.field_108081_b.field_103221_t);
         int var2 = C_100650_jv.func_108910_c(this.field_108081_b.field_103219_u);
         int var3 = C_100650_jv.func_108910_c(this.field_108081_b.field_103217_v);
         if(this.field_108082_c.func_109349_a(var1, var2, var3) == C_100451_alf.field_106244_aa.field_106162_cm) {
            this.field_108082_c.func_109448_f(2001, var1, var2, var3, C_100451_alf.field_106244_aa.field_106162_cm + 4096);
            this.field_108082_c.func_109422_e(var1, var2, var3, 0);
            this.field_108081_b.func_103320_aG();
         } else if(this.field_108082_c.func_109349_a(var1, var2 - 1, var3) == C_100451_alf.field_106121_x.field_106162_cm) {
            this.field_108082_c.func_109448_f(2001, var1, var2 - 1, var3, C_100451_alf.field_106121_x.field_106162_cm);
            this.field_108082_c.func_109422_e(var1, var2 - 1, var3, C_100451_alf.field_106120_y.field_106162_cm);
            this.field_108081_b.func_103320_aG();
         }

      }
   }
}
