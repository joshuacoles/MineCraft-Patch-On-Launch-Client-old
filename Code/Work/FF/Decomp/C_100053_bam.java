import org.lwjgl.opengl.GL11;

public class C_100053_bam extends C_100056_bal {

   public C_100053_bam(C_101231_avl var1, float var2) {
      super(var1, var2);
   }

   public void func_105400_a(C_100539_ol var1, double var2, double var4, double var6, float var8, float var9) {
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105401_a(C_100539_ol var1, float var2) {
      super.func_105372_c(var1, var2);
      if(!var1.func_103357_h_()) {
         this.func_105351_a("/terrain.png");
         GL11.glEnable(2884);
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.2F, 0.4F, 0.5F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.field_105358_c.func_110400_a(C_100451_alf.field_106230_aj, 0, 1.0F);
         GL11.glTranslatef(0.1F, 0.0F, -0.6F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.field_105358_c.func_110400_a(C_100451_alf.field_106230_aj, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         ((C_101227_avp)this.field_105380_i).field_112187_a.func_112210_c(0.0625F);
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.75F, -0.2F);
         GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
         this.field_105358_c.func_110400_a(C_100451_alf.field_106230_aj, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable(2884);
      }
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105401_a((C_100539_ol)var1, var2);
   }
}
