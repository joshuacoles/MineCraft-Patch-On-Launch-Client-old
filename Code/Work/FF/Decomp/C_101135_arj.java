import net.minecraft.client.Minecraft;

public class C_101135_arj {

   float field_111771_a;
   private double field_111765_f;
   public int field_111769_b;
   public float field_111770_c;
   public float field_111767_d = 1.0F;
   public float field_111768_e = 0.0F;
   private long field_111766_g;
   private long field_111773_h;
   private long field_111774_i;
   private double field_111772_j = 1.0D;


   public C_101135_arj(float var1) {
      this.field_111771_a = var1;
      this.field_111766_g = Minecraft.func_105063_F();
      this.field_111773_h = System.nanoTime() / 1000000L;
   }

   public void func_111764_a() {
      long var1 = Minecraft.func_105063_F();
      long var3 = var1 - this.field_111766_g;
      long var5 = System.nanoTime() / 1000000L;
      double var7 = (double)var5 / 1000.0D;
      if(var3 <= 1000L && var3 >= 0L) {
         this.field_111774_i += var3;
         if(this.field_111774_i > 1000L) {
            long var9 = var5 - this.field_111773_h;
            double var11 = (double)this.field_111774_i / (double)var9;
            this.field_111772_j += (var11 - this.field_111772_j) * 0.20000000298023224D;
            this.field_111773_h = var5;
            this.field_111774_i = 0L;
         }

         if(this.field_111774_i < 0L) {
            this.field_111773_h = var5;
         }
      } else {
         this.field_111765_f = var7;
      }

      this.field_111766_g = var1;
      double var13 = (var7 - this.field_111765_f) * this.field_111772_j;
      this.field_111765_f = var7;
      if(var13 < 0.0D) {
         var13 = 0.0D;
      }

      if(var13 > 1.0D) {
         var13 = 1.0D;
      }

      this.field_111768_e = (float)((double)this.field_111768_e + var13 * (double)this.field_111767_d * (double)this.field_111771_a);
      this.field_111769_b = (int)this.field_111768_e;
      this.field_111768_e -= (float)this.field_111769_b;
      if(this.field_111769_b > 10) {
         this.field_111769_b = 10;
      }

      this.field_111770_c = this.field_111768_e;
   }
}
