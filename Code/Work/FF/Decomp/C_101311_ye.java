import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C_101311_ye {

   private C_100681_afu field_112529_d;
   private C_100681_afu field_112530_e;
   private C_101318_yb field_112527_f;
   private List field_112528_g;


   protected C_101311_ye() {
      this.field_112527_f = new C_101318_yb(this);
      this.field_112528_g = new ArrayList();
      this.field_112528_g.add(C_101324_xz.field_112489_f);
      this.field_112528_g.add(C_101324_xz.field_112494_c);
      this.field_112528_g.add(C_101324_xz.field_112490_g);
      this.field_112528_g.add(C_101324_xz.field_112506_u);
      this.field_112528_g.add(C_101324_xz.field_112507_t);
      this.field_112528_g.add(C_101324_xz.field_112504_w);
      this.field_112528_g.add(C_101324_xz.field_112514_x);
   }

   public C_101311_ye(long var1, C_100845_xp var3) {
      this();
      C_100681_afu[] var4 = C_100681_afu.func_107310_a(var1, var3);
      this.field_112529_d = var4[0];
      this.field_112530_e = var4[1];
   }

   public C_101311_ye(C_100873_xe var1) {
      this(var1.func_109374_D(), var1.func_109429_J().func_107143_u());
   }

   public List func_112516_a() {
      return this.field_112528_g;
   }

   public C_101324_xz func_112524_a(int var1, int var2) {
      return this.field_112527_f.func_112588_b(var1, var2);
   }

   public float[] func_112520_a(float[] var1, int var2, int var3, int var4, int var5) {
      C_100657_afs.func_108973_a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.field_112530_e.func_107313_a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)C_101324_xz.field_112495_a[var6[var7]].func_112467_g() / 65536.0F;
         if(var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public float func_112523_a(float var1, int var2) {
      return var1;
   }

   public float[] func_112519_b(float[] var1, int var2, int var3, int var4, int var5) {
      C_100657_afs.func_108973_a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.field_112530_e.func_107313_a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)C_101324_xz.field_112495_a[var6[var7]].func_112457_h() / 65536.0F;
         if(var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public C_101324_xz[] func_112522_a(C_101324_xz[] var1, int var2, int var3, int var4, int var5) {
      C_100657_afs.func_108973_a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new C_101324_xz[var4 * var5];
      }

      int[] var6 = this.field_112529_d.func_107313_a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         var1[var7] = C_101324_xz.field_112495_a[var6[var7]];
      }

      return var1;
   }

   public C_101324_xz[] func_112526_b(C_101324_xz[] var1, int var2, int var3, int var4, int var5) {
      return this.func_112518_a(var1, var2, var3, var4, var5, true);
   }

   public C_101324_xz[] func_112518_a(C_101324_xz[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      C_100657_afs.func_108973_a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new C_101324_xz[var4 * var5];
      }

      if(var6 && var4 == 16 && var5 == 16 && (var2 & 15) == 0 && (var3 & 15) == 0) {
         C_101324_xz[] var9 = this.field_112527_f.func_112585_e(var2, var3);
         System.arraycopy(var9, 0, var1, 0, var4 * var5);
         return var1;
      } else {
         int[] var7 = this.field_112530_e.func_107313_a(var2, var3, var4, var5);

         for(int var8 = 0; var8 < var4 * var5; ++var8) {
            var1[var8] = C_101324_xz.field_112495_a[var7[var8]];
         }

         return var1;
      }
   }

   public boolean func_112525_a(int var1, int var2, int var3, List var4) {
      C_100657_afs.func_108973_a();
      int var5 = var1 - var3 >> 2;
      int var6 = var2 - var3 >> 2;
      int var7 = var1 + var3 >> 2;
      int var8 = var2 + var3 >> 2;
      int var9 = var7 - var5 + 1;
      int var10 = var8 - var6 + 1;
      int[] var11 = this.field_112529_d.func_107313_a(var5, var6, var9, var10);

      for(int var12 = 0; var12 < var9 * var10; ++var12) {
         C_101324_xz var13 = C_101324_xz.field_112495_a[var11[var12]];
         if(!var4.contains(var13)) {
            return false;
         }
      }

      return true;
   }

   public C_100851_xw func_112517_a(int var1, int var2, int var3, List var4, Random var5) {
      C_100657_afs.func_108973_a();
      int var6 = var1 - var3 >> 2;
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.field_112529_d.func_107313_a(var6, var7, var10, var11);
      C_100851_xw var13 = null;
      int var14 = 0;

      for(int var15 = 0; var15 < var12.length; ++var15) {
         int var16 = var6 + var15 % var10 << 2;
         int var17 = var7 + var15 / var10 << 2;
         C_101324_xz var18 = C_101324_xz.field_112495_a[var12[var15]];
         if(var4.contains(var18) && (var13 == null || var5.nextInt(var14 + 1) == 0)) {
            var13 = new C_100851_xw(var16, 0, var17);
            ++var14;
         }
      }

      return var13;
   }

   public void func_112521_b() {
      this.field_112527_f.func_112586_a();
   }
}
