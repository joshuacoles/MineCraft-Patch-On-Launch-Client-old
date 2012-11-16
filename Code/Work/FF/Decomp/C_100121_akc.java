
public class C_100121_akc extends C_100226_aif {

   public C_100121_akc(int var1) {
      super(var1, 200);
   }

   public int func_106029_a(int var1, int var2) {
      if(var2 < 7) {
         if(var2 == 6) {
            var2 = 5;
         }

         return this.field_106165_cl + (var2 >> 1);
      } else {
         return this.field_106165_cl + 4;
      }
   }

   protected int func_106379_h() {
      return C_100992_tt.field_110941_bL.field_110891_cf;
   }

   protected int func_106381_j() {
      return C_100992_tt.field_110941_bL.field_110891_cf;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.func_105998_a(var1, var2, var3, var4, var5, var6, 0);
      if(!var1.field_109557_J) {
         if(var5 >= 7 && var1.field_109577_u.nextInt(50) == 0) {
            this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(C_100992_tt.field_110953_bN));
         }

      }
   }
}
