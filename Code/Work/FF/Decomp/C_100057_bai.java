import org.lwjgl.opengl.GL11;

public class C_100057_bai extends C_100056_bal {

   private int field_105406_a;


   public C_100057_bai() {
      super(new C_101233_avj(), 0.25F);
      this.field_105406_a = ((C_101233_avj)this.field_105380_i).func_112083_a();
   }

   public void func_105405_a(C_101109_pr var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((C_101233_avj)this.field_105380_i).func_112083_a();
      if(var10 != this.field_105406_a) {
         this.field_105406_a = var10;
         this.field_105380_i = new C_101233_avj();
         System.out.println("new lava slime model");
      }

      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105404_a(C_101109_pr var1, float var2) {
      int var3 = var1.func_103624_p();
      float var4 = (var1.field_103630_d + (var1.field_103633_c - var1.field_103630_d) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      float var6 = (float)var3;
      GL11.glScalef(var5 * var6, 1.0F / var5 * var6, var5 * var6);
   }
}
