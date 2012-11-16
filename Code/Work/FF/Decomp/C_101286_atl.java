import java.util.Comparator;

class C_101286_atl implements Comparator {

   // $FF: synthetic field
   final C_101304_atj field_112373_a;
   // $FF: synthetic field
   final C_101284_atk field_112372_b;


   C_101286_atl(C_101284_atk var1, C_101304_atj var2) {
      this.field_112372_b = var1;
      this.field_112373_a = var2;
   }

   public int func_112371_a(C_100811_jb var1, C_100811_jb var2) {
      int var3 = var1.func_109925_a();
      int var4 = var2.func_109925_a();
      C_100809_jc var5 = null;
      C_100809_jc var6 = null;
      if(this.field_112372_b.field_105884_j == 2) {
         var5 = C_100818_jh.field_110020_C[var3];
         var6 = C_100818_jh.field_110020_C[var4];
      } else if(this.field_112372_b.field_105884_j == 0) {
         var5 = C_100818_jh.field_110014_D[var3];
         var6 = C_100818_jh.field_110014_D[var4];
      } else if(this.field_112372_b.field_105884_j == 1) {
         var5 = C_100818_jh.field_110015_E[var3];
         var6 = C_100818_jh.field_110015_E[var4];
      }

      if(var5 != null || var6 != null) {
         if(var5 == null) {
            return 1;
         }

         if(var6 == null) {
            return -1;
         }

         int var7 = C_101304_atj.func_104360_c(this.field_112372_b.field_105889_a).func_105810_a(var5);
         int var8 = C_101304_atj.func_104360_c(this.field_112372_b.field_105889_a).func_105810_a(var6);
         if(var7 != var8) {
            return (var7 - var8) * this.field_112372_b.field_105885_k;
         }
      }

      return var3 - var4;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.func_112371_a((C_100811_jb)var1, (C_100811_jb)var2);
   }
}
