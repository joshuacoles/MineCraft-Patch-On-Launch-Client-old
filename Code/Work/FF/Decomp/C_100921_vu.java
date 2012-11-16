import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100921_vu implements C_100925_vs {

   private final C_100994_tv field_110731_a;
   private final List field_110730_b;


   public C_100921_vu(C_100994_tv var1, List var2) {
      this.field_110731_a = var1;
      this.field_110730_b = var2;
   }

   public C_100994_tv func_110723_b() {
      return this.field_110731_a;
   }

   public boolean func_110720_a(C_101068_rg var1, C_100873_xe var2) {
      ArrayList var3 = new ArrayList(this.field_110730_b);

      for(int var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 3; ++var5) {
            C_100994_tv var6 = var1.func_104794_b(var5, var4);
            if(var6 != null) {
               boolean var7 = false;
               Iterator var8 = var3.iterator();

               while(var8.hasNext()) {
                  C_100994_tv var9 = (C_100994_tv)var8.next();
                  if(var6.field_111397_c == var9.field_111397_c && (var9.func_111367_j() == -1 || var6.func_111367_j() == var9.func_111367_j())) {
                     var7 = true;
                     var3.remove(var9);
                     break;
                  }
               }

               if(!var7) {
                  return false;
               }
            }
         }
      }

      return var3.isEmpty();
   }

   public C_100994_tv func_110721_a(C_101068_rg var1) {
      return this.field_110731_a.func_111360_l();
   }

   public int func_110722_a() {
      return this.field_110730_b.size();
   }
}
