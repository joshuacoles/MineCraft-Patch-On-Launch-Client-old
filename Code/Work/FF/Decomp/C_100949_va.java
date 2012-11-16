import java.util.List;

public class C_100949_va extends C_100992_tt {

   public C_100949_va(int var1) {
      super(var1);
      this.func_110753_d(1);
   }

   public static boolean func_110990_a(C_100353_bh var0) {
      if(!C_100937_uz.func_111055_a(var0)) {
         return false;
      } else if(!var0.func_107516_b("title")) {
         return false;
      } else {
         String var1 = var0.func_107534_i("title");
         return var1 != null && var1.length() <= 16?var0.func_107516_b("author"):false;
      }
   }

   public String func_110750_j(C_100994_tv var1) {
      if(var1.func_111339_o()) {
         C_100353_bh var2 = var1.func_111352_p();
         C_100333_bt var3 = (C_100333_bt)var2.func_107518_a("title");
         if(var3 != null) {
            return var3.toString();
         }
      }

      return super.func_110750_j(var1);
   }

   public void func_110784_a(C_100994_tv var1, C_101095_qg var2, List var3, boolean var4) {
      if(var1.func_111339_o()) {
         C_100353_bh var5 = var1.func_111352_p();
         C_100333_bt var6 = (C_100333_bt)var5.func_107518_a("author");
         if(var6 != null) {
            var3.add("§7" + String.format(C_100359_bd.func_107637_a("book.byAuthor", new Object[]{var6.field_107495_a}), new Object[0]));
         }
      }

   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      var3.func_103800_d(var1);
      return var1;
   }

   public boolean func_110746_q() {
      return true;
   }

   public boolean func_110747_d(C_100994_tv var1) {
      return true;
   }
}
