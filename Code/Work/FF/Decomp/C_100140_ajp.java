import java.util.Random;

public class C_100140_ajp extends C_100451_alf {

   protected C_100140_ajp(int var1) {
      super(var1, C_100664_afg.field_109008_d);
      this.field_106165_cl = 26;
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.field_106165_cl - 1;
      } else if(var5 == 0) {
         return this.field_106165_cl - 1;
      } else {
         int var6 = var1.func_109349_a(var2, var3, var4 - 1);
         int var7 = var1.func_109349_a(var2, var3, var4 + 1);
         int var8 = var1.func_109349_a(var2 - 1, var3, var4);
         int var9 = var1.func_109349_a(var2 + 1, var3, var4);
         byte var10 = 3;
         if(C_100451_alf.field_106117_q[var6] && !C_100451_alf.field_106117_q[var7]) {
            var10 = 3;
         }

         if(C_100451_alf.field_106117_q[var7] && !C_100451_alf.field_106117_q[var6]) {
            var10 = 2;
         }

         if(C_100451_alf.field_106117_q[var8] && !C_100451_alf.field_106117_q[var9]) {
            var10 = 5;
         }

         if(C_100451_alf.field_106117_q[var9] && !C_100451_alf.field_106117_q[var8]) {
            var10 = 4;
         }

         return var5 == var10?this.field_106165_cl + 1:this.field_106165_cl;
      }
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl - 1:(var1 == 0?this.field_106165_cl - 1:(var1 == 3?this.field_106165_cl + 1:this.field_106165_cl));
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return true;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      var1.func_109422_e(var2, var3, var4, 0);
   }
}
