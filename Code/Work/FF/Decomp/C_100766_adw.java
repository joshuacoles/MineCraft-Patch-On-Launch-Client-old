import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class C_100766_adw extends C_100550_aaa {

   protected Map field_108359_d = new HashMap();


   protected void func_108343_a(C_100873_xe var1, int var2, int var3, int var4, int var5, byte[] var6) {
      if(!this.field_108359_d.containsKey(Long.valueOf(C_100858_wx.func_110234_a(var2, var3)))) {
         this.field_108344_b.nextInt();
         if(this.func_108354_a(var2, var3)) {
            C_100771_adz var7 = this.func_108357_b(var2, var3);
            this.field_108359_d.put(Long.valueOf(C_100858_wx.func_110234_a(var2, var3)), var7);
         }

      }
   }

   public boolean func_108356_a(C_100873_xe var1, Random var2, int var3, int var4) {
      int var5 = (var3 << 4) + 8;
      int var6 = (var4 << 4) + 8;
      boolean var7 = false;
      Iterator var8 = this.field_108359_d.values().iterator();

      while(var8.hasNext()) {
         C_100771_adz var9 = (C_100771_adz)var8.next();
         if(var9.func_108580_d() && var9.func_108579_a().func_108330_a(var5, var6, var5 + 15, var6 + 15)) {
            var9.func_108578_a(var1, var2, new C_100516_abo(var5, var6, var5 + 15, var6 + 15));
            var7 = true;
         }
      }

      return var7;
   }

   public boolean func_108355_a(int var1, int var2, int var3) {
      Iterator var4 = this.field_108359_d.values().iterator();

      while(var4.hasNext()) {
         C_100771_adz var5 = (C_100771_adz)var4.next();
         if(var5.func_108580_d() && var5.func_108579_a().func_108330_a(var1, var3, var1, var3)) {
            Iterator var6 = var5.func_108582_b().iterator();

            while(var6.hasNext()) {
               C_100767_adx var7 = (C_100767_adx)var6.next();
               if(var7.func_108381_b().func_108334_b(var1, var2, var3)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public C_100851_xw func_108358_a(C_100873_xe var1, int var2, int var3, int var4) {
      this.field_108345_c = var1;
      this.field_108344_b.setSeed(var1.func_109374_D());
      long var5 = this.field_108344_b.nextLong();
      long var7 = this.field_108344_b.nextLong();
      long var9 = (long)(var2 >> 4) * var5;
      long var11 = (long)(var4 >> 4) * var7;
      this.field_108344_b.setSeed(var9 ^ var11 ^ var1.func_109374_D());
      this.func_108343_a(var1, var2 >> 4, var4 >> 4, 0, 0, (byte[])null);
      double var13 = Double.MAX_VALUE;
      C_100851_xw var15 = null;
      Iterator var16 = this.field_108359_d.values().iterator();

      C_100851_xw var19;
      int var21;
      int var20;
      double var23;
      int var22;
      while(var16.hasNext()) {
         C_100771_adz var17 = (C_100771_adz)var16.next();
         if(var17.func_108580_d()) {
            C_100767_adx var18 = (C_100767_adx)var17.func_108582_b().get(0);
            var19 = var18.func_108390_a();
            var20 = var19.field_110207_a - var2;
            var21 = var19.field_110205_b - var3;
            var22 = var19.field_110206_c - var4;
            var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
            if(var23 < var13) {
               var13 = var23;
               var15 = var19;
            }
         }
      }

      if(var15 != null) {
         return var15;
      } else {
         List var25 = this.func_108353_p_();
         if(var25 != null) {
            C_100851_xw var26 = null;
            Iterator var27 = var25.iterator();

            while(var27.hasNext()) {
               var19 = (C_100851_xw)var27.next();
               var20 = var19.field_110207_a - var2;
               var21 = var19.field_110205_b - var3;
               var22 = var19.field_110206_c - var4;
               var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
               if(var23 < var13) {
                  var13 = var23;
                  var26 = var19;
               }
            }

            return var26;
         } else {
            return null;
         }
      }
   }

   protected List func_108353_p_() {
      return null;
   }

   protected abstract boolean func_108354_a(int var1, int var2);

   protected abstract C_100771_adz func_108357_b(int var1, int var2);
}
