import java.util.Random;

public class C_100112_aka extends C_100451_alf {

   public C_100112_aka(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109009_e);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return this.field_106162_cm == C_100451_alf.field_106078_L.field_106162_cm?C_100992_tt.field_110841_m.field_110891_cf:(this.field_106162_cm == C_100451_alf.field_106201_az.field_106162_cm?C_100992_tt.field_110838_n.field_110891_cf:(this.field_106162_cm == C_100451_alf.field_106090_Q.field_106162_cm?C_100992_tt.field_110904_aW.field_110891_cf:(this.field_106162_cm == C_100451_alf.field_106207_bU.field_106162_cm?C_100992_tt.field_110965_bH.field_110891_cf:this.field_106162_cm)));
   }

   public int func_106063_a(Random var1) {
      return this.field_106162_cm == C_100451_alf.field_106090_Q.field_106162_cm?4 + var1.nextInt(5):1;
   }

   public int func_106012_a(int var1, Random var2) {
      if(var1 > 0 && this.field_106162_cm != this.func_106043_a(0, var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         if(var3 < 0) {
            var3 = 0;
         }

         return this.func_106063_a(var2) * (var3 + 1);
      } else {
         return this.func_106063_a(var2);
      }
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.func_105998_a(var1, var2, var3, var4, var5, var6, var7);
      if(this.func_106043_a(var5, var1.field_109577_u, var7) != this.field_106162_cm) {
         int var8 = 0;
         if(this.field_106162_cm == C_100451_alf.field_106078_L.field_106162_cm) {
            var8 = C_100650_jv.func_108929_a(var1.field_109577_u, 0, 2);
         } else if(this.field_106162_cm == C_100451_alf.field_106201_az.field_106162_cm) {
            var8 = C_100650_jv.func_108929_a(var1.field_109577_u, 3, 7);
         } else if(this.field_106162_cm == C_100451_alf.field_106207_bU.field_106162_cm) {
            var8 = C_100650_jv.func_108929_a(var1.field_109577_u, 3, 7);
         } else if(this.field_106162_cm == C_100451_alf.field_106090_Q.field_106162_cm) {
            var8 = C_100650_jv.func_108929_a(var1.field_109577_u, 2, 5);
         }

         this.func_106005_f(var1, var2, var3, var4, var8);
      }

   }

   public int func_106004_b(int var1) {
      return this.field_106162_cm == C_100451_alf.field_106090_Q.field_106162_cm?4:0;
   }
}
