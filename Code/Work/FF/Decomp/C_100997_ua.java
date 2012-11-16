import java.util.Iterator;
import java.util.List;

public class C_100997_ua extends C_100992_tt {

   public C_100997_ua(int var1) {
      super(var1);
      this.func_110800_a(true);
      this.func_110802_a(C_101040_sq.field_111413_f);
   }

   public String func_110750_j(C_100994_tv var1) {
      String var2 = ("" + C_100359_bd.func_107638_a(this.func_110793_a() + ".name")).trim();
      String var3 = C_100727_lf.func_109311_a(var1.func_111367_j());
      if(var3 != null) {
         var2 = var2 + " " + C_100359_bd.func_107638_a("entity." + var3 + ".name");
      }

      return var2;
   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      C_100726_lg var3 = (C_100726_lg)C_100727_lf.field_109322_a.get(Integer.valueOf(var1.func_111367_j()));
      return var3 != null?(var2 == 0?var3.field_109306_b:var3.field_109307_c):16777215;
   }

   public boolean func_110758_b() {
      return true;
   }

   public int func_110751_a(int var1, int var2) {
      return var2 > 0?super.func_110751_a(var1, var2) + 16:super.func_110751_a(var1, var2);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.field_109557_J) {
         return true;
      } else {
         int var11 = var3.func_109349_a(var4, var5, var6);
         var4 += C_100012_j.field_105264_b[var7];
         var5 += C_100012_j.field_105265_c[var7];
         var6 += C_100012_j.field_105262_d[var7];
         double var12 = 0.0D;
         if(var7 == 1 && var11 == C_100451_alf.field_106147_bc.field_106162_cm || var11 == C_100451_alf.field_106241_bE.field_106162_cm) {
            var12 = 0.5D;
         }

         if(func_111004_a(var3, var1.func_111367_j(), (double)var4 + 0.5D, (double)var5 + var12, (double)var6 + 0.5D) != null && !var2.field_103869_cf.field_111597_d) {
            --var1.field_111398_a;
         }

         return true;
      }
   }

   public static C_100730_lb func_111004_a(C_100873_xe var0, int var1, double var2, double var4, double var6) {
      if(!C_100727_lf.field_109322_a.containsKey(Integer.valueOf(var1))) {
         return null;
      } else {
         C_100730_lb var8 = null;

         for(int var9 = 0; var9 < 1; ++var9) {
            var8 = C_100727_lf.func_109314_a(var1, var0);
            if(var8 != null) {
               var8.func_103055_b(var2, var4, var6, var0.field_109577_u.nextFloat() * 360.0F, 0.0F);
               ((C_100595_ln)var8).func_103337_bD();
               var0.func_109513_d(var8);
               ((C_100595_ln)var8).func_103294_aN();
            }
         }

         return var8;
      }
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      Iterator var4 = C_100727_lf.field_109322_a.values().iterator();

      while(var4.hasNext()) {
         C_100726_lg var5 = (C_100726_lg)var4.next();
         var3.add(new C_100994_tv(var1, 1, var5.field_109308_a));
      }

   }
}
