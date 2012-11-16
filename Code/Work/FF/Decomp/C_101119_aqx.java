import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class C_101119_aqx implements Callable {

   // $FF: synthetic field
   final Minecraft field_111621_a;


   public C_101119_aqx(Minecraft var1) {
      this.field_111621_a = var1;
   }

   public String func_111620_a() {
      return this.field_111621_a.field_105156_y.field_111725_m;
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_111620_a();
   }
}
