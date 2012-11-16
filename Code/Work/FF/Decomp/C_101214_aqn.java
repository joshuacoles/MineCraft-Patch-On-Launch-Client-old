import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class C_101214_aqn implements Callable {

   // $FF: synthetic field
   final Minecraft field_112022_a;


   public C_101214_aqn(Minecraft var1) {
      this.field_112022_a = var1;
   }

   public String func_112021_a() {
      int var1 = this.field_112022_a.field_105122_e.func_109363_R().func_107883_c();
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      int var4 = this.field_112022_a.field_105122_e.func_109363_R().func_107880_d();
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      return var1 + " (" + var2 + " bytes; " + var3 + " MB) allocated, " + var4 + " (" + var5 + " bytes; " + var6 + " MB) used";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_112021_a();
   }
}
