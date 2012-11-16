import org.lwjgl.opengl.GL11;

public class C_100960_ayh extends C_100988_axw {

   private C_100730_lb field_104651_a;
   private C_100730_lb field_104653_aw;
   private int field_104652_ax = 0;
   private int field_104650_ay = 0;
   private float field_104649_az;


   public C_100960_ayh(C_100873_xe var1, C_100730_lb var2, C_100730_lb var3, float var4) {
      super(var1, var2.field_103221_t, var2.field_103219_u, var2.field_103217_v, var2.field_103215_w, var2.field_103240_x, var2.field_103238_y);
      this.field_104651_a = var2;
      this.field_104653_aw = var3;
      this.field_104650_ay = 3;
      this.field_104649_az = var4;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_104652_ax + var2) / (float)this.field_104650_ay;
      var8 *= var8;
      double var9 = this.field_104651_a.field_103221_t;
      double var11 = this.field_104651_a.field_103219_u;
      double var13 = this.field_104651_a.field_103217_v;
      double var15 = this.field_104653_aw.field_103189_T + (this.field_104653_aw.field_103221_t - this.field_104653_aw.field_103189_T) * (double)var2;
      double var17 = this.field_104653_aw.field_103188_U + (this.field_104653_aw.field_103219_u - this.field_104653_aw.field_103188_U) * (double)var2 + (double)this.field_104649_az;
      double var19 = this.field_104653_aw.field_103191_V + (this.field_104653_aw.field_103217_v - this.field_104653_aw.field_103191_V) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = C_100650_jv.func_108910_c(var21);
      int var28 = C_100650_jv.func_108910_c(var23 + (double)(this.field_103181_M / 2.0F));
      int var29 = C_100650_jv.func_108910_c(var25);
      int var30 = this.func_103125_b(var2);
      int var31 = var30 % 65536;
      int var32 = var30 / 65536;
      C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var31 / 1.0F, (float)var32 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var21 -= field_104616_at;
      var23 -= field_104622_au;
      var25 -= field_104619_av;
      C_100848_azw.field_110183_a.func_110173_a(this.field_104651_a, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.field_104651_a.field_103236_z, var2);
   }

   public void func_103165_j_() {
      ++this.field_104652_ax;
      if(this.field_104652_ax == this.field_104650_ay) {
         this.func_103121_x();
      }

   }

   public int func_104602_b() {
      return 3;
   }
}
