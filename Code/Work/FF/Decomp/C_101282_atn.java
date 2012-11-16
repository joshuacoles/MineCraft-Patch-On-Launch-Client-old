import java.util.ArrayList;
import java.util.Iterator;

class C_101282_atn extends C_101294_atp {

   // $FF: synthetic field
   final C_101304_atj field_105888_a;


   public C_101282_atn(C_101304_atj var1) {
      super(var1);
      this.field_105888_a = var1;
      this.field_105886_h = new ArrayList();
      Iterator var2 = C_100818_jh.field_110024_d.iterator();

      while(var2.hasNext()) {
         C_100811_jb var3 = (C_100811_jb)var2.next();
         boolean var4 = false;
         int var5 = var3.func_109925_a();
         if(C_101304_atj.func_104360_c(var1).func_105810_a(var3) > 0) {
            var4 = true;
         } else if(C_100818_jh.field_110016_F[var5] != null && C_101304_atj.func_104360_c(var1).func_105810_a(C_100818_jh.field_110016_F[var5]) > 0) {
            var4 = true;
         } else if(C_100818_jh.field_110014_D[var5] != null && C_101304_atj.func_104360_c(var1).func_105810_a(C_100818_jh.field_110014_D[var5]) > 0) {
            var4 = true;
         }

         if(var4) {
            this.field_105886_h.add(var3);
         }
      }

      this.field_105887_i = new C_101292_ato(this, var1);
   }

   protected void func_105823_a(int var1, int var2, C_100872_azb var3) {
      super.func_105823_a(var1, var2, var3);
      if(this.field_105882_b == 0) {
         C_101304_atj.func_104366_a(this.field_105888_a, var1 + 115 - 18 + 1, var2 + 1 + 1, 72, 18);
      } else {
         C_101304_atj.func_104366_a(this.field_105888_a, var1 + 115 - 18, var2 + 1, 72, 18);
      }

      if(this.field_105882_b == 1) {
         C_101304_atj.func_104366_a(this.field_105888_a, var1 + 165 - 18 + 1, var2 + 1 + 1, 18, 18);
      } else {
         C_101304_atj.func_104366_a(this.field_105888_a, var1 + 165 - 18, var2 + 1, 18, 18);
      }

      if(this.field_105882_b == 2) {
         C_101304_atj.func_104366_a(this.field_105888_a, var1 + 215 - 18 + 1, var2 + 1 + 1, 36, 18);
      } else {
         C_101304_atj.func_104366_a(this.field_105888_a, var1 + 215 - 18, var2 + 1, 36, 18);
      }

   }

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100811_jb var6 = this.func_105878_d(var1);
      int var7 = var6.func_109925_a();
      C_101304_atj.func_104364_a(this.field_105888_a, var2 + 40, var3, var7);
      this.func_105881_a((C_100811_jb)C_100818_jh.field_110016_F[var7], var2 + 115, var3, var1 % 2 == 0);
      this.func_105881_a((C_100811_jb)C_100818_jh.field_110014_D[var7], var2 + 165, var3, var1 % 2 == 0);
      this.func_105881_a(var6, var2 + 215, var3, var1 % 2 == 0);
   }

   protected String func_105877_c(int var1) {
      return var1 == 1?"stat.crafted":(var1 == 2?"stat.used":"stat.depleted");
   }
}
