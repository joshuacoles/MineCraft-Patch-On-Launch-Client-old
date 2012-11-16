import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100045_bbu extends C_100044_bbz {

   private C_100876_azd field_105563_a;


   public void func_105562_a(C_100406_amq var1, double var2, double var4, double var6, float var8) {
      C_100451_alf var9 = C_100451_alf.field_106118_p[var1.func_102949_a()];
      if(var9 != null && var1.func_102942_a(var8) < 1.0F) {
         C_100872_azb var10 = C_100872_azb.field_110346_a;
         this.func_105558_a("/terrain.png");
         C_101210_aqj.func_112010_a();
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         if(Minecraft.func_105055_u()) {
            GL11.glShadeModel(7425);
         } else {
            GL11.glShadeModel(7424);
         }

         var10.func_110330_b();
         var10.func_110321_b((double)((float)var2 - (float)var1.field_102938_l + var1.func_102946_b(var8)), (double)((float)var4 - (float)var1.field_102939_m + var1.func_102943_c(var8)), (double)((float)var6 - (float)var1.field_102936_n + var1.func_102941_d(var8)));
         var10.func_110324_a(1, 1, 1);
         if(var9 == C_100451_alf.field_106242_ad && var1.func_102942_a(var8) < 0.5F) {
            this.field_105563_a.func_110406_a(var9, var1.field_102938_l, var1.field_102939_m, var1.field_102936_n, false);
         } else if(var1.func_102948_e() && !var1.func_102950_b()) {
            C_100451_alf.field_106242_ad.func_106390_e(((C_100404_amn)var9).func_106394_p());
            this.field_105563_a.func_110406_a(C_100451_alf.field_106242_ad, var1.field_102938_l, var1.field_102939_m, var1.field_102936_n, var1.func_102942_a(var8) < 0.5F);
            C_100451_alf.field_106242_ad.func_106391_p();
            var10.func_110321_b((double)((float)var2 - (float)var1.field_102938_l), (double)((float)var4 - (float)var1.field_102939_m), (double)((float)var6 - (float)var1.field_102936_n));
            this.field_105563_a.func_110433_d(var9, var1.field_102938_l, var1.field_102939_m, var1.field_102936_n);
         } else {
            this.field_105563_a.func_110424_a(var9, var1.field_102938_l, var1.field_102939_m, var1.field_102936_n);
         }

         var10.func_110321_b(0.0D, 0.0D, 0.0D);
         var10.func_110329_a();
         C_101210_aqj.func_112011_b();
      }

   }

   public void func_105555_a(C_100873_xe var1) {
      this.field_105563_a = new C_100876_azd(var1);
   }
}
