import java.util.List;
import java.util.Random;

public abstract class C_100169_aja extends C_100451_alf {

   private final boolean field_106291_a;


   public C_100169_aja(int var1, boolean var2, C_100664_afg var3) {
      super(var1, 6, var3);
      this.field_106291_a = var2;
      if(var2) {
         field_106117_q[var1] = true;
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.func_106048_h(255);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      if(this.field_106291_a) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         boolean var5 = (var1.func_109357_g(var2, var3, var4) & 8) != 0;
         if(var5) {
            this.func_106008_a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else {
            this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         }
      }

   }

   public void func_106059_f() {
      if(this.field_106291_a) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      this.func_106007_a(var1, var2, var3, var4);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int func_106024_a(int var1) {
      return this.func_106029_a(var1, 0);
   }

   public boolean func_105994_c() {
      return this.field_106291_a;
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      if(!this.field_106291_a) {
         if(var5 == 0 || var5 != 1 && (double)var7 > 0.5D) {
            int var9 = var1.func_109357_g(var2, var3, var4) & 7;
            var1.func_109488_c(var2, var3, var4, var9 | 8);
         }

      }
   }

   public int func_106063_a(Random var1) {
      return this.field_106291_a?2:1;
   }

   public int func_106004_b(int var1) {
      return var1 & 7;
   }

   public boolean func_105977_b() {
      return this.field_106291_a;
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(this.field_106291_a) {
         return super.func_105976_a(var1, var2, var3, var4, var5);
      } else if(var5 != 1 && var5 != 0 && !super.func_105976_a(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         int var6 = var2 + C_100012_j.field_105264_b[C_100012_j.field_105266_a[var5]];
         int var7 = var3 + C_100012_j.field_105265_c[C_100012_j.field_105266_a[var5]];
         int var8 = var4 + C_100012_j.field_105262_d[C_100012_j.field_105266_a[var5]];
         boolean var9 = (var1.func_109357_g(var6, var7, var8) & 8) != 0;
         return var9?(var5 == 0?true:(var5 == 1 && super.func_105976_a(var1, var2, var3, var4, var5)?true:!func_106290_e(var1.func_109349_a(var2, var3, var4)) || (var1.func_109357_g(var2, var3, var4) & 8) == 0)):(var5 == 1?true:(var5 == 0 && super.func_105976_a(var1, var2, var3, var4, var5)?true:!func_106290_e(var1.func_109349_a(var2, var3, var4)) || (var1.func_109357_g(var2, var3, var4) & 8) != 0));
      }
   }

   private static boolean func_106290_e(int var0) {
      return var0 == C_100451_alf.field_106238_an.field_106162_cm || var0 == C_100451_alf.field_106213_bR.field_106162_cm;
   }

   public abstract String func_106289_d(int var1);
}
