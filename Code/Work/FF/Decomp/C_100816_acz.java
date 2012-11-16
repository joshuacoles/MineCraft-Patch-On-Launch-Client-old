import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class C_100816_acz extends C_100766_adw {

   private C_101324_xz[] field_108373_e;
   private boolean field_108371_f;
   private C_100858_wx[] field_108372_g;
   private double field_108374_h;
   private int field_108375_i;


   public C_100816_acz() {
      this.field_108373_e = new C_101324_xz[]{C_101324_xz.field_112491_d, C_101324_xz.field_112489_f, C_101324_xz.field_112492_e, C_101324_xz.field_112502_h, C_101324_xz.field_112490_g, C_101324_xz.field_112496_n, C_101324_xz.field_112497_o, C_101324_xz.field_112508_s, C_101324_xz.field_112507_t, C_101324_xz.field_112505_v, C_101324_xz.field_112504_w, C_101324_xz.field_112514_x};
      this.field_108372_g = new C_100858_wx[3];
      this.field_108374_h = 32.0D;
      this.field_108375_i = 3;
   }

   public C_100816_acz(Map var1) {
      this.field_108373_e = new C_101324_xz[]{C_101324_xz.field_112491_d, C_101324_xz.field_112489_f, C_101324_xz.field_112492_e, C_101324_xz.field_112502_h, C_101324_xz.field_112490_g, C_101324_xz.field_112496_n, C_101324_xz.field_112497_o, C_101324_xz.field_112508_s, C_101324_xz.field_112507_t, C_101324_xz.field_112505_v, C_101324_xz.field_112504_w, C_101324_xz.field_112514_x};
      this.field_108372_g = new C_100858_wx[3];
      this.field_108374_h = 32.0D;
      this.field_108375_i = 3;
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("distance")) {
            this.field_108374_h = C_100650_jv.func_108916_a((String)var3.getValue(), this.field_108374_h, 1.0D);
         } else if(((String)var3.getKey()).equals("count")) {
            this.field_108372_g = new C_100858_wx[C_100650_jv.func_108919_a((String)var3.getValue(), this.field_108372_g.length, 1)];
         } else if(((String)var3.getKey()).equals("spread")) {
            this.field_108375_i = C_100650_jv.func_108919_a((String)var3.getValue(), this.field_108375_i, 1);
         }
      }

   }

   protected boolean func_108354_a(int var1, int var2) {
      if(!this.field_108371_f) {
         Random var3 = new Random();
         var3.setSeed(this.field_108345_c.func_109374_D());
         double var4 = var3.nextDouble() * 3.141592653589793D * 2.0D;
         int var6 = 1;

         for(int var7 = 0; var7 < this.field_108372_g.length; ++var7) {
            double var8 = (1.25D * (double)var6 + var3.nextDouble()) * this.field_108374_h * (double)var6;
            int var10 = (int)Math.round(Math.cos(var4) * var8);
            int var11 = (int)Math.round(Math.sin(var4) * var8);
            ArrayList var12 = new ArrayList();
            Collections.addAll(var12, this.field_108373_e);
            C_100851_xw var13 = this.field_108345_c.func_109465_s().func_112517_a((var10 << 4) + 8, (var11 << 4) + 8, 112, var12, var3);
            if(var13 != null) {
               var10 = var13.field_110207_a >> 4;
               var11 = var13.field_110206_c >> 4;
            }

            this.field_108372_g[var7] = new C_100858_wx(var10, var11);
            var4 += 6.283185307179586D * (double)var6 / (double)this.field_108375_i;
            if(var7 == this.field_108375_i) {
               var6 += 2 + var3.nextInt(5);
               this.field_108375_i += 1 + var3.nextInt(2);
            }
         }

         this.field_108371_f = true;
      }

      C_100858_wx[] var14 = this.field_108372_g;
      int var15 = var14.length;

      for(int var5 = 0; var5 < var15; ++var5) {
         C_100858_wx var16 = var14[var5];
         if(var1 == var16.field_110239_a && var2 == var16.field_110238_b) {
            return true;
         }
      }

      return false;
   }

   protected List func_108353_p_() {
      ArrayList var1 = new ArrayList();
      C_100858_wx[] var2 = this.field_108372_g;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100858_wx var5 = var2[var4];
         if(var5 != null) {
            var1.add(var5.func_110236_a(64));
         }
      }

      return var1;
   }

   protected C_100771_adz func_108357_b(int var1, int var2) {
      C_100808_ada var3;
      for(var3 = new C_100808_ada(this.field_108345_c, this.field_108344_b, var1, var2); var3.func_108582_b().isEmpty() || ((C_100734_adr)var3.func_108582_b().get(0)).field_108478_b == null; var3 = new C_100808_ada(this.field_108345_c, this.field_108344_b, var1, var2)) {
         ;
      }

      return var3;
   }
}
