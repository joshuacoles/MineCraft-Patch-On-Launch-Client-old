import org.lwjgl.opengl.GL11;

public class C_100899_azz extends C_100846_azx {

   private C_100876_azd field_105529_a = new C_100876_azd();


   public C_100899_azz() {
      this.field_105355_d = 0.5F;
   }

   public void func_105528_a(C_100574_pf var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.func_105351_a("/terrain.png");
      C_100451_alf var10 = C_100451_alf.field_106118_p[var1.field_103271_a];
      C_100873_xe var11 = var1.func_103263_c();
      GL11.glDisable(2896);
      if(var10.func_106013_d() != 0) {
         this.field_105529_a.field_110522_a = var11;
         C_100872_azb var12 = C_100872_azb.field_110346_a;
         var12.func_110330_b();
         var12.func_110321_b((double)((float)(-C_100650_jv.func_108910_c(var1.field_103221_t)) - 0.5F), (double)((float)(-C_100650_jv.func_108910_c(var1.field_103219_u)) - 0.5F), (double)((float)(-C_100650_jv.func_108910_c(var1.field_103217_v)) - 0.5F));
         this.field_105529_a.func_110436_b(var10, C_100650_jv.func_108910_c(var1.field_103221_t), C_100650_jv.func_108910_c(var1.field_103219_u), C_100650_jv.func_108910_c(var1.field_103217_v));
         var12.func_110321_b(0.0D, 0.0D, 0.0D);
         var12.func_110329_a();
      } else if(var10 != null) {
         this.field_105529_a.func_110421_a(var10);
         this.field_105529_a.func_110461_a(var10, var11, C_100650_jv.func_108910_c(var1.field_103221_t), C_100650_jv.func_108910_c(var1.field_103219_u), C_100650_jv.func_108910_c(var1.field_103217_v), var1.field_103269_b);
      }

      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }
}
