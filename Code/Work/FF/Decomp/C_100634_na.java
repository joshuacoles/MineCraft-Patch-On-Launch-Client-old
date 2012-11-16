
public class C_100634_na extends C_100621_mm {

   private final C_100535_om field_108184_a;
   private final float field_108182_b;
   private int field_108183_c = 0;
   private int field_108180_d = 0;
   private int field_108181_e = 0;
   private int field_108178_f = 0;
   private int field_108179_g = 0;
   private int field_108185_h = 0;


   public C_100634_na(C_100535_om var1, float var2) {
      this.field_108184_a = var1;
      this.field_108182_b = var2;
      this.func_108030_a(5);
   }

   public boolean func_108033_a() {
      return this.field_108184_a.func_103552_m() && !this.field_108184_a.func_103553_n() && this.field_108184_a.func_103312_aA().nextDouble() <= 0.006500000134110451D && this.func_108177_f();
   }

   public boolean func_108036_b() {
      return this.field_108183_c <= this.field_108181_e && this.field_108180_d <= 60 && this.func_108176_a(this.field_108184_a.field_103229_p, this.field_108178_f, this.field_108179_g, this.field_108185_h);
   }

   public void func_108034_c() {
      this.field_108184_a.func_103383_ay().func_108292_a((double)((float)this.field_108178_f) + 0.5D, (double)(this.field_108179_g + 1), (double)((float)this.field_108185_h) + 0.5D, this.field_108182_b);
      this.field_108183_c = 0;
      this.field_108180_d = 0;
      this.field_108181_e = this.field_108184_a.func_103312_aA().nextInt(this.field_108184_a.func_103312_aA().nextInt(1200) + 1200) + 1200;
      this.field_108184_a.func_103558_q().func_108218_a(false);
   }

   public void func_108029_d() {
      this.field_108184_a.func_103557_h(false);
   }

   public void func_108031_e() {
      ++this.field_108183_c;
      this.field_108184_a.func_103558_q().func_108218_a(false);
      if(this.field_108184_a.func_103146_e((double)this.field_108178_f, (double)(this.field_108179_g + 1), (double)this.field_108185_h) > 1.0D) {
         this.field_108184_a.func_103557_h(false);
         this.field_108184_a.func_103383_ay().func_108292_a((double)((float)this.field_108178_f) + 0.5D, (double)(this.field_108179_g + 1), (double)((float)this.field_108185_h) + 0.5D, this.field_108182_b);
         ++this.field_108180_d;
      } else if(!this.field_108184_a.func_103553_n()) {
         this.field_108184_a.func_103557_h(true);
      } else {
         --this.field_108180_d;
      }

   }

   private boolean func_108177_f() {
      int var1 = (int)this.field_108184_a.field_103219_u;
      double var2 = 2.147483647E9D;

      for(int var4 = (int)this.field_108184_a.field_103221_t - 8; (double)var4 < this.field_108184_a.field_103221_t + 8.0D; ++var4) {
         for(int var5 = (int)this.field_108184_a.field_103217_v - 8; (double)var5 < this.field_108184_a.field_103217_v + 8.0D; ++var5) {
            if(this.func_108176_a(this.field_108184_a.field_103229_p, var4, var1, var5) && this.field_108184_a.field_103229_p.func_109352_c(var4, var1 + 1, var5)) {
               double var6 = this.field_108184_a.func_103146_e((double)var4, (double)var1, (double)var5);
               if(var6 < var2) {
                  this.field_108178_f = var4;
                  this.field_108179_g = var1;
                  this.field_108185_h = var5;
                  var2 = var6;
               }
            }
         }
      }

      return var2 < 2.147483647E9D;
   }

   private boolean func_108176_a(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3, var4);
      int var6 = var1.func_109357_g(var2, var3, var4);
      if(var5 == C_100451_alf.field_106216_ax.field_106162_cm) {
         C_100422_amb var7 = (C_100422_amb)var1.func_109353_p(var2, var3, var4);
         if(var7.field_103024_h < 1) {
            return true;
         }
      } else {
         if(var5 == C_100451_alf.field_106198_aF.field_106162_cm) {
            return true;
         }

         if(var5 == C_100451_alf.field_106089_V.field_106162_cm && !C_100255_ahq.func_106313_b_(var6)) {
            return true;
         }
      }

      return false;
   }
}
