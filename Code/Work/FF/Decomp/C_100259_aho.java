import java.util.List;

public class C_100259_aho extends C_100173_ajc {

   public static final String[] field_106300_a = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
   public int field_106299_b = 0;


   protected C_100259_aho(int var1) {
      super(var1, 215, C_100664_afg.field_109007_g);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.func_106048_h(0);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106029_a(int var1, int var2) {
      if(this.field_106299_b == 3 && var1 == 1) {
         int var3 = var2 >> 2;
         switch(var3) {
         case 1:
            return this.field_106165_cl + 1;
         case 2:
            return this.field_106165_cl + 16 + 1;
         default:
            return this.field_106165_cl + 16;
         }
      } else {
         return this.field_106165_cl;
      }
   }

   public int func_106024_a(int var1) {
      return super.func_106024_a(var1);
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
      int var7 = var1.func_109357_g(var2, var3, var4) >> 2;
      ++var6;
      var6 %= 4;
      if(var6 == 0) {
         var1.func_109488_c(var2, var3, var4, 2 | var7 << 2);
      }

      if(var6 == 1) {
         var1.func_109488_c(var2, var3, var4, 3 | var7 << 2);
      }

      if(var6 == 2) {
         var1.func_109488_c(var2, var3, var4, 0 | var7 << 2);
      }

      if(var6 == 3) {
         var1.func_109488_c(var2, var3, var4, 1 | var7 << 2);
      }

   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         var5.func_103815_d(var2, var3, var4);
         return true;
      }
   }

   public int func_106013_d() {
      return 35;
   }

   public int func_106004_b(int var1) {
      return var1 >> 2;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
      var3.add(new C_100994_tv(var1, 1, 2));
   }

   protected void func_106294_a(C_100574_pf var1) {
      var1.func_103264_e(true);
   }

   public void func_106297_a_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      var1.func_109448_f(1022, var2, var3, var4, 0);
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return true;
   }

}
