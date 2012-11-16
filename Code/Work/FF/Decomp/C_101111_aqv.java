import java.util.concurrent.Callable;
import net.minecraft.client.C_101444_ClientBrandRetriever;
import net.minecraft.client.Minecraft;

public class C_101111_aqv implements Callable {

   // $FF: synthetic field
   final Minecraft field_111611_a;


   public C_101111_aqv(Minecraft var1) {
      this.field_111611_a = var1;
   }

   public String func_111610_a() {
      String var1 = C_101444_ClientBrandRetriever.func_105166_getClientModName();
      return !var1.equals("vanilla")?"Definitely; \'" + var1 + "\'":(Minecraft.class.getSigners() == null?"Very likely":"Probably not");
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_111610_a();
   }
}
