import java.util.Random;

public class C_100180_ajg extends C_100167_ajb {

   public C_100180_ajg(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109022_v, false);
      this.field_106145_cC = 0.98F;
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106055_n() {
      return 1;
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return super.func_105976_a(var1, var2, var3, var4, 1 - var5);
   }

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
      var2.func_103792_j(0.025F);
      if(this.func_106045_s_() && C_100878_wh.func_110583_d(var2)) {
         C_100994_tv var9 = this.func_106044_f_(var6);
         if(var9 != null) {
            this.func_106042_a(var1, var3, var4, var5, var9);
         }
      } else {
         if(var1.field_109576_v.field_112397_e) {
            var1.func_109422_e(var3, var4, var5, 0);
            return;
         }

         int var7 = C_100878_wh.func_110580_e(var2);
         this.func_106035_c(var1, var3, var4, var5, var6, var7);
         C_100664_afg var8 = var1.func_109350_f(var3, var4 - 1, var5);
         if(var8.func_108992_c() || var8.func_108986_d()) {
            var1.func_109422_e(var3, var4, var5, C_100451_alf.field_106071_D.field_106162_cm);
         }
      }

   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var1.func_109375_b(C_100847_xq.field_110166_b, var2, var3, var4) > 11 - C_100451_alf.field_106116_r[this.field_106162_cm]) {
         if(var1.field_109576_v.field_112397_e) {
            var1.func_109422_e(var2, var3, var4, 0);
            return;
         }

         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106072_E.field_106162_cm);
      }

   }

   public int func_106058_q_() {
      return 0;
   }
}
