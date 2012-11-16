import net.minecraft.client.Minecraft;

public class C_101117_aqq implements C_100820_iz {

   // $FF: synthetic field
   final Minecraft field_110049_a;


   public C_101117_aqq(Minecraft var1) {
      this.field_110049_a = var1;
   }

   public String func_110048_a(String var1) {
      try {
         return String.format(var1, new Object[]{C_101125_ard.func_111674_c(this.field_110049_a.field_105156_y.field_111691_F.field_111989_d)});
      } catch (Exception var3) {
         return "Error: " + var3.getLocalizedMessage();
      }
   }
}
