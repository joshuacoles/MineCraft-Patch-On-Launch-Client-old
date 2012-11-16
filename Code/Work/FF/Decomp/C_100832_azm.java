import org.lwjgl.opengl.GL11;

public class C_100832_azm extends C_100056_bal {

   private int field_105472_a;


   public C_100832_azm() {
      super(new C_101221_aux(), 0.25F);
      this.field_105472_a = ((C_101221_aux)this.field_105380_i).func_112058_a();
   }

   public void func_105471_a(C_100543_og var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((C_101221_aux)this.field_105380_i).func_112058_a();
      if(var10 != this.field_105472_a) {
         this.field_105472_a = var10;
         this.field_105380_i = new C_101221_aux();
      }

      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105470_a(C_100543_og var1, float var2) {
      GL11.glScalef(0.35F, 0.35F, 0.35F);
   }

   protected void func_105468_a(C_100543_og var1, double var2, double var4, double var6) {
      super.func_105373_a(var1, var2, var4, var6);
   }

   protected void func_105469_a(C_100543_og var1, float var2, float var3, float var4) {
      if(!var1.func_103757_h()) {
         GL11.glTranslatef(0.0F, C_100650_jv.func_108928_b(var2 * 0.3F) * 0.1F, 0.0F);
      } else {
         GL11.glTranslatef(0.0F, -0.1F, 0.0F);
      }

      super.func_105365_a(var1, var2, var3, var4);
   }
}
