import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C_100857_wz {

   public boolean field_110228_a = false;
   public boolean field_110226_b = true;
   private int field_110233_i = 16;
   private Random field_110230_j = new Random();
   private C_100873_xe field_110231_k;
   public double field_110227_c;
   public double field_110224_d;
   public double field_110225_e;
   public C_100730_lb field_110222_f;
   public float field_110223_g;
   public List field_110232_h = new ArrayList();
   private Map field_110229_l = new HashMap();


   public C_100857_wz(C_100873_xe var1, C_100730_lb var2, double var3, double var5, double var7, float var9) {
      this.field_110231_k = var1;
      this.field_110222_f = var2;
      this.field_110223_g = var9;
      this.field_110227_c = var3;
      this.field_110224_d = var5;
      this.field_110225_e = var7;
   }

   public void func_110220_a() {
      float var1 = this.field_110223_g;
      HashSet var2 = new HashSet();

      int var3;
      int var4;
      int var5;
      double var15;
      double var17;
      double var19;
      for(var3 = 0; var3 < this.field_110233_i; ++var3) {
         for(var4 = 0; var4 < this.field_110233_i; ++var4) {
            for(var5 = 0; var5 < this.field_110233_i; ++var5) {
               if(var3 == 0 || var3 == this.field_110233_i - 1 || var4 == 0 || var4 == this.field_110233_i - 1 || var5 == 0 || var5 == this.field_110233_i - 1) {
                  double var6 = (double)((float)var3 / ((float)this.field_110233_i - 1.0F) * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / ((float)this.field_110233_i - 1.0F) * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / ((float)this.field_110233_i - 1.0F) * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.field_110223_g * (0.7F + this.field_110231_k.field_109577_u.nextFloat() * 0.6F);
                  var15 = this.field_110227_c;
                  var17 = this.field_110224_d;
                  var19 = this.field_110225_e;

                  for(float var21 = 0.3F; var14 > 0.0F; var14 -= var21 * 0.75F) {
                     int var22 = C_100650_jv.func_108910_c(var15);
                     int var23 = C_100650_jv.func_108910_c(var17);
                     int var24 = C_100650_jv.func_108910_c(var19);
                     int var25 = this.field_110231_k.func_109349_a(var22, var23, var24);
                     if(var25 > 0) {
                        C_100451_alf var26 = C_100451_alf.field_106118_p[var25];
                        float var27 = this.field_110222_f != null?this.field_110222_f.func_103058_a(this, var26, var22, var23, var24):var26.func_105981_a(this.field_110222_f);
                        var14 -= (var27 + 0.3F) * var21;
                     }

                     if(var14 > 0.0F) {
                        var2.add(new C_100851_xw(var22, var23, var24));
                     }

                     var15 += var6 * (double)var21;
                     var17 += var8 * (double)var21;
                     var19 += var10 * (double)var21;
                  }
               }
            }
         }
      }

      this.field_110232_h.addAll(var2);
      this.field_110223_g *= 2.0F;
      var3 = C_100650_jv.func_108910_c(this.field_110227_c - (double)this.field_110223_g - 1.0D);
      var4 = C_100650_jv.func_108910_c(this.field_110227_c + (double)this.field_110223_g + 1.0D);
      var5 = C_100650_jv.func_108910_c(this.field_110224_d - (double)this.field_110223_g - 1.0D);
      int var28 = C_100650_jv.func_108910_c(this.field_110224_d + (double)this.field_110223_g + 1.0D);
      int var7 = C_100650_jv.func_108910_c(this.field_110225_e - (double)this.field_110223_g - 1.0D);
      int var29 = C_100650_jv.func_108910_c(this.field_110225_e + (double)this.field_110223_g + 1.0D);
      List var9 = this.field_110231_k.func_109449_b(this.field_110222_f, C_100412_amr.func_107892_a().func_107844_a((double)var3, (double)var5, (double)var7, (double)var4, (double)var28, (double)var29));
      C_100387_amw var30 = this.field_110231_k.func_109363_R().func_107878_a(this.field_110227_c, this.field_110224_d, this.field_110225_e);

      for(int var11 = 0; var11 < var9.size(); ++var11) {
         C_100730_lb var31 = (C_100730_lb)var9.get(var11);
         double var13 = var31.func_103053_f(this.field_110227_c, this.field_110224_d, this.field_110225_e) / (double)this.field_110223_g;
         if(var13 <= 1.0D) {
            var15 = var31.field_103221_t - this.field_110227_c;
            var17 = var31.field_103219_u + (double)var31.func_103102_e() - this.field_110224_d;
            var19 = var31.field_103217_v - this.field_110225_e;
            double var33 = (double)C_100650_jv.func_108915_a(var15 * var15 + var17 * var17 + var19 * var19);
            if(var33 != 0.0D) {
               var15 /= var33;
               var17 /= var33;
               var19 /= var33;
               double var32 = (double)this.field_110231_k.func_109500_a(var30, var31.field_103173_D);
               double var34 = (1.0D - var13) * var32;
               var31.func_103085_a(C_100698_ks.field_109241_k, (int)((var34 * var34 + var34) / 2.0D * 8.0D * (double)this.field_110223_g + 1.0D));
               var31.field_103215_w += var15 * var34;
               var31.field_103240_x += var17 * var34;
               var31.field_103238_y += var19 * var34;
               if(var31 instanceof C_101095_qg) {
                  this.field_110229_l.put((C_101095_qg)var31, this.field_110231_k.func_109363_R().func_107878_a(var15 * var34, var17 * var34, var19 * var34));
               }
            }
         }
      }

      this.field_110223_g = var1;
   }

   public void func_110221_a(boolean var1) {
      this.field_110231_k.func_109476_a(this.field_110227_c, this.field_110224_d, this.field_110225_e, "random.explode", 4.0F, (1.0F + (this.field_110231_k.field_109577_u.nextFloat() - this.field_110231_k.field_109577_u.nextFloat()) * 0.2F) * 0.7F);
      if(this.field_110223_g >= 2.0F && this.field_110226_b) {
         this.field_110231_k.func_109428_a("hugeexplosion", this.field_110227_c, this.field_110224_d, this.field_110225_e, 1.0D, 0.0D, 0.0D);
      } else {
         this.field_110231_k.func_109428_a("largeexplode", this.field_110227_c, this.field_110224_d, this.field_110225_e, 1.0D, 0.0D, 0.0D);
      }

      Iterator var2;
      C_100851_xw var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if(this.field_110226_b) {
         var2 = this.field_110232_h.iterator();

         while(var2.hasNext()) {
            var3 = (C_100851_xw)var2.next();
            var4 = var3.field_110207_a;
            var5 = var3.field_110205_b;
            var6 = var3.field_110206_c;
            var7 = this.field_110231_k.func_109349_a(var4, var5, var6);
            if(var1) {
               double var8 = (double)((float)var4 + this.field_110231_k.field_109577_u.nextFloat());
               double var10 = (double)((float)var5 + this.field_110231_k.field_109577_u.nextFloat());
               double var12 = (double)((float)var6 + this.field_110231_k.field_109577_u.nextFloat());
               double var14 = var8 - this.field_110227_c;
               double var16 = var10 - this.field_110224_d;
               double var18 = var12 - this.field_110225_e;
               double var20 = (double)C_100650_jv.func_108915_a(var14 * var14 + var16 * var16 + var18 * var18);
               var14 /= var20;
               var16 /= var20;
               var18 /= var20;
               double var22 = 0.5D / (var20 / (double)this.field_110223_g + 0.1D);
               var22 *= (double)(this.field_110231_k.field_109577_u.nextFloat() * this.field_110231_k.field_109577_u.nextFloat() + 0.3F);
               var14 *= var22;
               var16 *= var22;
               var18 *= var22;
               this.field_110231_k.func_109428_a("explode", (var8 + this.field_110227_c * 1.0D) / 2.0D, (var10 + this.field_110224_d * 1.0D) / 2.0D, (var12 + this.field_110225_e * 1.0D) / 2.0D, var14, var16, var18);
               this.field_110231_k.func_109428_a("smoke", var8, var10, var12, var14, var16, var18);
            }

            if(var7 > 0) {
               C_100451_alf.field_106118_p[var7].func_105998_a(this.field_110231_k, var4, var5, var6, this.field_110231_k.func_109357_g(var4, var5, var6), 0.3F, 0);
               if(this.field_110231_k.func_109497_a(var4, var5, var6, 0, 0, this.field_110231_k.field_109557_J)) {
                  this.field_110231_k.func_109460_h(var4, var5, var6, 0);
               }

               C_100451_alf.field_106118_p[var7].func_105999_k(this.field_110231_k, var4, var5, var6);
            }
         }
      }

      if(this.field_110228_a) {
         var2 = this.field_110232_h.iterator();

         while(var2.hasNext()) {
            var3 = (C_100851_xw)var2.next();
            var4 = var3.field_110207_a;
            var5 = var3.field_110205_b;
            var6 = var3.field_110206_c;
            var7 = this.field_110231_k.func_109349_a(var4, var5, var6);
            int var24 = this.field_110231_k.func_109349_a(var4, var5 - 1, var6);
            if(var7 == 0 && C_100451_alf.field_106117_q[var24] && this.field_110230_j.nextInt(3) == 0) {
               this.field_110231_k.func_109422_e(var4, var5, var6, C_100451_alf.field_106222_au.field_106162_cm);
            }
         }
      }

   }

   public Map func_110219_b() {
      return this.field_110229_l;
   }
}
