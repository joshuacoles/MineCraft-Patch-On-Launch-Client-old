import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class C_101296_ate extends C_101278_asw {

   private final C_101278_asw field_104332_a;
   private final C_101125_ard field_104329_b;
   private final List field_104330_c = new ArrayList();
   private final List field_104328_d = new ArrayList();
   private String field_104335_m;
   private String[] field_104333_n;
   private C_101298_atf field_104334_o;
   private C_101133_arl field_104331_p;


   public C_101296_ate(C_101278_asw var1, C_101125_ard var2) {
      this.field_104332_a = var1;
      this.field_104329_b = var2;
   }

   public void func_104037_A_() {
      this.field_104335_m = C_100359_bd.func_107638_a("options.snooper.title");
      String var1 = C_100359_bd.func_107638_a("options.snooper.desc");
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.field_104049_k.func_111793_c(var1, this.field_104044_f - 30).iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         var2.add(var4);
      }

      this.field_104333_n = (String[])var2.toArray(new String[0]);
      this.field_104330_c.clear();
      this.field_104328_d.clear();
      this.field_104050_h.add(this.field_104331_p = new C_101133_arl(1, this.field_104044_f / 2 - 152, this.field_104045_g - 30, 150, 20, this.field_104329_b.func_111678_c(C_101123_arf.field_111672_x)));
      this.field_104050_h.add(new C_101133_arl(2, this.field_104044_f / 2 + 2, this.field_104045_g - 30, 150, 20, C_100359_bd.func_107638_a("gui.done")));
      boolean var6 = this.field_104046_e.func_105043_C() != null && this.field_104046_e.func_105043_C().func_104959_aj() != null;
      Iterator var7 = (new TreeMap(this.field_104046_e.func_105069_E().func_109257_c())).entrySet().iterator();

      Entry var5;
      while(var7.hasNext()) {
         var5 = (Entry)var7.next();
         this.field_104330_c.add((var6?"C ":"") + (String)var5.getKey());
         this.field_104328_d.add(this.field_104049_k.func_111791_a((String)var5.getValue(), this.field_104044_f - 220));
      }

      if(var6) {
         var7 = (new TreeMap(this.field_104046_e.func_105043_C().func_104959_aj().func_109257_c())).entrySet().iterator();

         while(var7.hasNext()) {
            var5 = (Entry)var7.next();
            this.field_104330_c.add("S " + (String)var5.getKey());
            this.field_104328_d.add(this.field_104049_k.func_111791_a((String)var5.getValue(), this.field_104044_f - 220));
         }
      }

      this.field_104334_o = new C_101298_atf(this);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 2) {
            this.field_104329_b.func_111684_b();
            this.field_104329_b.func_111684_b();
            this.field_104046_e.func_105053_a(this.field_104332_a);
         }

         if(var1.field_103908_f == 1) {
            this.field_104329_b.func_111679_a(C_101123_arf.field_111672_x, 1);
            this.field_104331_p.field_103911_e = this.field_104329_b.func_111678_c(C_101123_arf.field_111672_x);
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.field_104334_o.func_105826_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, this.field_104335_m, this.field_104044_f / 2, 8, 16777215);
      int var4 = 22;
      String[] var5 = this.field_104333_n;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String var8 = var5[var7];
         this.func_103879_a(this.field_104049_k, var8, this.field_104044_f / 2, var4, 8421504);
         var4 += this.field_104049_k.field_111811_b;
      }

      super.func_104027_a(var1, var2, var3);
   }

   // $FF: synthetic method
   static List func_104327_a(C_101296_ate var0) {
      return var0.field_104330_c;
   }

   // $FF: synthetic method
   static List func_104326_b(C_101296_ate var0) {
      return var0.field_104328_d;
   }
}
