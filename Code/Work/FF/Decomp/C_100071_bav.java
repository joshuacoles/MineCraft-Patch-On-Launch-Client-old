import org.lwjgl.opengl.GL11;

public class C_100071_bav extends C_100056_bal {

   private C_101248_avx field_105442_a;


   public C_100071_bav() {
      super(new C_101248_avx(), 0.5F);
      this.field_105442_a = (C_101248_avx)super.field_105380_i;
      this.func_105363_a(this.field_105442_a);
   }

   protected void func_105441_a(C_100553_op var1, float var2) {
      super.func_105372_c(var1, var2);
      C_100994_tv var3 = new C_100994_tv(C_100451_alf.field_106148_bd, 1);
      if(var3 != null && var3.func_111365_b().field_110891_cf < 256) {
         GL11.glPushMatrix();
         this.field_105442_a.field_112147_c.func_112210_c(0.0625F);
         if(C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var3.field_111397_c].func_106013_d())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.field_105357_b.field_110177_f.func_110254_a(var1, var3, 0);
         GL11.glPopMatrix();
      }

   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105441_a((C_100553_op)var1, var2);
   }
}
