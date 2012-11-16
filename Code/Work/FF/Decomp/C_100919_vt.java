
public class C_100919_vt implements C_100925_vs {

   private int field_110727_b;
   private int field_110728_c;
   private C_100994_tv[] field_110725_d;
   private C_100994_tv field_110726_e;
   public final int field_110729_a;


   public C_100919_vt(int var1, int var2, C_100994_tv[] var3, C_100994_tv var4) {
      this.field_110729_a = var4.field_111397_c;
      this.field_110727_b = var1;
      this.field_110728_c = var2;
      this.field_110725_d = var3;
      this.field_110726_e = var4;
   }

   public C_100994_tv func_110723_b() {
      return this.field_110726_e;
   }

   public boolean func_110720_a(C_101068_rg var1, C_100873_xe var2) {
      for(int var3 = 0; var3 <= 3 - this.field_110727_b; ++var3) {
         for(int var4 = 0; var4 <= 3 - this.field_110728_c; ++var4) {
            if(this.func_110724_a(var1, var3, var4, true)) {
               return true;
            }

            if(this.func_110724_a(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean func_110724_a(C_101068_rg var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 3; ++var6) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            C_100994_tv var9 = null;
            if(var7 >= 0 && var8 >= 0 && var7 < this.field_110727_b && var8 < this.field_110728_c) {
               if(var4) {
                  var9 = this.field_110725_d[this.field_110727_b - var7 - 1 + var8 * this.field_110727_b];
               } else {
                  var9 = this.field_110725_d[var7 + var8 * this.field_110727_b];
               }
            }

            C_100994_tv var10 = var1.func_104794_b(var5, var6);
            if(var10 != null || var9 != null) {
               if(var10 == null && var9 != null || var10 != null && var9 == null) {
                  return false;
               }

               if(var9.field_111397_c != var10.field_111397_c) {
                  return false;
               }

               if(var9.func_111367_j() != -1 && var9.func_111367_j() != var10.func_111367_j()) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public C_100994_tv func_110721_a(C_101068_rg var1) {
      return this.func_110723_b().func_111360_l();
   }

   public int func_110722_a() {
      return this.field_110727_b * this.field_110728_c;
   }
}
