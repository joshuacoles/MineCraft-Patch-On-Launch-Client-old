
public class C_100916_axk extends C_100988_axw {

   private C_100730_lb field_104625_a;
   private int field_104627_aw;
   private int field_104626_ax;
   private String field_104624_ay;


   public C_100916_axk(C_100873_xe var1, C_100730_lb var2) {
      this(var1, var2, "crit");
   }

   public C_100916_axk(C_100873_xe var1, C_100730_lb var2, String var3) {
      super(var1, var2.field_103221_t, var2.field_103173_D.field_107915_b + (double)(var2.field_103183_O / 2.0F), var2.field_103217_v, var2.field_103215_w, var2.field_103240_x, var2.field_103238_y);
      this.field_104627_aw = 0;
      this.field_104626_ax = 0;
      this.field_104625_a = var2;
      this.field_104626_ax = 3;
      this.field_104624_ay = var3;
      this.func_103165_j_();
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   public void func_103165_j_() {
      for(int var1 = 0; var1 < 16; ++var1) {
         double var2 = (double)(this.field_103232_aa.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.field_103232_aa.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.field_103232_aa.nextFloat() * 2.0F - 1.0F);
         if(var2 * var2 + var4 * var4 + var6 * var6 <= 1.0D) {
            double var8 = this.field_104625_a.field_103221_t + var2 * (double)this.field_104625_a.field_103182_N / 4.0D;
            double var10 = this.field_104625_a.field_103173_D.field_107915_b + (double)(this.field_104625_a.field_103183_O / 2.0F) + var4 * (double)this.field_104625_a.field_103183_O / 4.0D;
            double var12 = this.field_104625_a.field_103217_v + var6 * (double)this.field_104625_a.field_103182_N / 4.0D;
            this.field_103229_p.func_109428_a(this.field_104624_ay, var8, var10, var12, var2, var4 + 0.2D, var6);
         }
      }

      ++this.field_104627_aw;
      if(this.field_104627_aw >= this.field_104626_ax) {
         this.func_103121_x();
      }

   }

   public int func_104602_b() {
      return 3;
   }
}
