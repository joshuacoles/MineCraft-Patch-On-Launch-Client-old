import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class C_100961_ue extends C_100992_tt {

   private HashMap field_110999_a = new HashMap();
   private static final Map field_110998_b = new LinkedHashMap();


   public C_100961_ue(int var1) {
      super(var1);
      this.func_110753_d(1);
      this.func_110800_a(true);
      this.func_110804_e(0);
      this.func_110802_a(C_101040_sq.field_111425_k);
   }

   public List func_110993_l(C_100994_tv var1) {
      if(var1.func_111339_o() && var1.func_111352_p().func_107516_b("CustomPotionEffects")) {
         ArrayList var6 = new ArrayList();
         C_100339_bp var3 = var1.func_111352_p().func_107513_m("CustomPotionEffects");

         for(int var4 = 0; var4 < var3.func_107501_c(); ++var4) {
            C_100353_bh var5 = (C_100353_bh)var3.func_107498_b(var4);
            var6.add(C_100692_kx.func_109195_b(var5));
         }

         return var6;
      } else {
         List var2 = (List)this.field_110999_a.get(Integer.valueOf(var1.func_111367_j()));
         if(var2 == null) {
            var2 = C_100947_vb.func_111118_b(var1.func_111367_j(), false);
            this.field_110999_a.put(Integer.valueOf(var1.func_111367_j()), var2);
         }

         return var2;
      }
   }

   public List func_110997_f(int var1) {
      List var2 = (List)this.field_110999_a.get(Integer.valueOf(var1));
      if(var2 == null) {
         var2 = C_100947_vb.func_111118_b(var1, false);
         this.field_110999_a.put(Integer.valueOf(var1), var2);
      }

      return var2;
   }

   public C_100994_tv func_110792_b(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(!var3.field_103869_cf.field_111597_d) {
         --var1.field_111398_a;
      }

      if(!var2.field_109557_J) {
         List var4 = this.func_110993_l(var1);
         if(var4 != null) {
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               C_100692_kx var6 = (C_100692_kx)var5.next();
               var3.func_103389_d(new C_100692_kx(var6));
            }
         }
      }

      if(!var3.field_103869_cf.field_111597_d) {
         if(var1.field_111398_a <= 0) {
            return new C_100994_tv(C_100992_tt.field_110867_bt);
         }

         var3.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110867_bt));
      }

      return var1;
   }

   public int func_110769_a(C_100994_tv var1) {
      return 32;
   }

   public C_100943_uw func_110777_d_(C_100994_tv var1) {
      return C_100943_uw.field_111100_c;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(func_110994_g(var1.func_111367_j())) {
         if(!var3.field_103869_cf.field_111597_d) {
            --var1.field_111398_a;
         }

         var2.func_109412_a(var3, "random.bow", 0.5F, 0.4F / (field_110833_d.nextFloat() * 0.4F + 0.8F));
         if(!var2.field_109557_J) {
            var2.func_109513_d(new C_101078_qu(var2, var3, var1));
         }

         return var1;
      } else {
         var3.func_103784_a(var1, this.func_110769_a(var1));
         return var1;
      }
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   public int func_110787_b(int var1) {
      return func_110994_g(var1)?154:140;
   }

   public int func_110751_a(int var1, int var2) {
      return var2 == 0?141:super.func_110751_a(var1, var2);
   }

   public static boolean func_110994_g(int var0) {
      return (var0 & 16384) != 0;
   }

   public int func_110995_h(int var1) {
      return C_100947_vb.func_111116_a(var1, false);
   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      return var2 > 0?16777215:this.func_110995_h(var1.func_111367_j());
   }

   public boolean func_110758_b() {
      return true;
   }

   public boolean func_110996_i(int var1) {
      List var2 = this.func_110997_f(var1);
      if(var2 != null && !var2.isEmpty()) {
         Iterator var3 = var2.iterator();

         C_100692_kx var4;
         do {
            if(!var3.hasNext()) {
               return false;
            }

            var4 = (C_100692_kx)var3.next();
         } while(!C_100690_kw.field_109169_a[var4.func_109197_a()].func_109148_b());

         return true;
      } else {
         return false;
      }
   }

   public String func_110750_j(C_100994_tv var1) {
      if(var1.func_111367_j() == 0) {
         return C_100359_bd.func_107638_a("item.emptyPotion.name").trim();
      } else {
         String var2 = "";
         if(func_110994_g(var1.func_111367_j())) {
            var2 = C_100359_bd.func_107638_a("potion.prefix.grenade").trim() + " ";
         }

         List var3 = C_100992_tt.field_110864_bs.func_110993_l(var1);
         String var4;
         if(var3 != null && !var3.isEmpty()) {
            var4 = ((C_100692_kx)var3.get(0)).func_109189_f();
            var4 = var4 + ".postfix";
            return var2 + C_100359_bd.func_107638_a(var4).trim();
         } else {
            var4 = C_100947_vb.func_111106_c(var1.func_111367_j());
            return C_100359_bd.func_107638_a(var4).trim() + " " + super.func_110750_j(var1);
         }
      }
   }

   public void func_110784_a(C_100994_tv var1, C_101095_qg var2, List var3, boolean var4) {
      if(var1.func_111367_j() != 0) {
         List var5 = C_100992_tt.field_110864_bs.func_110993_l(var1);
         if(var5 != null && !var5.isEmpty()) {
            Iterator var9 = var5.iterator();

            while(var9.hasNext()) {
               C_100692_kx var7 = (C_100692_kx)var9.next();
               String var8 = C_100359_bd.func_107638_a(var7.func_109189_f()).trim();
               if(var7.func_109192_c() > 0) {
                  var8 = var8 + " " + C_100359_bd.func_107638_a("potion.potency." + var7.func_109192_c()).trim();
               }

               if(var7.func_109193_b() > 20) {
                  var8 = var8 + " (" + C_100690_kw.func_109144_a(var7) + ")";
               }

               if(C_100690_kw.field_109169_a[var7.func_109197_a()].func_109140_f()) {
                  var3.add("§c" + var8);
               } else {
                  var3.add("§7" + var8);
               }
            }
         } else {
            String var6 = C_100359_bd.func_107638_a("potion.empty").trim();
            var3.add("§7" + var6);
         }

      }
   }

   public boolean func_110747_d(C_100994_tv var1) {
      List var2 = this.func_110993_l(var1);
      return var2 != null && !var2.isEmpty();
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      super.func_110767_a(var1, var2, var3);
      if(field_110998_b.isEmpty()) {
         for(int var4 = 0; var4 <= 32767; ++var4) {
            List var5 = C_100947_vb.func_111118_b(var4, false);
            if(var5 != null && !var5.isEmpty()) {
               field_110998_b.put(var5, Integer.valueOf(var4));
            }
         }
      }

      Iterator var6 = field_110998_b.values().iterator();

      while(var6.hasNext()) {
         int var7 = ((Integer)var6.next()).intValue();
         var3.add(new C_100994_tv(var1, 1, var7));
      }

   }

}
