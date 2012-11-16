import java.util.concurrent.Callable;
import net.minecraft.client.C_101444_ClientBrandRetriever;
import net.minecraft.client.Minecraft;

class C_100092_bcd implements Callable {

   // $FF: synthetic field
   final C_100094_bcb field_105688_a;


   C_100092_bcd(C_100094_bcb var1) {
      this.field_105688_a = var1;
   }

   public String func_105687_a() {
      String var1 = C_101444_ClientBrandRetriever.func_105166_getClientModName();
      if(!var1.equals("vanilla")) {
         return "Definitely; \'" + var1 + "\'";
      } else {
         var1 = this.field_105688_a.func_104954_getServerModName();
         return !var1.equals("vanilla")?"Definitely; \'" + var1 + "\'":(Minecraft.class.getSigners() == null?"Very likely":"Probably not");
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_105687_a();
   }
}
