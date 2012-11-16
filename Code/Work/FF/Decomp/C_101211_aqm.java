import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class C_101211_aqm implements Callable {

   // $FF: synthetic field
   final Minecraft field_112018_a;


   public C_101211_aqm(Minecraft var1) {
      this.field_112018_a = var1;
   }

   public String func_112017_a() {
      return this.field_112018_a.field_105105_I.field_108908_a?this.field_112018_a.field_105105_I.func_108903_c():"N/A (disabled)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_112017_a();
   }
}
