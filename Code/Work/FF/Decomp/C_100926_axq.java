import org.lwjgl.opengl.GL11;

public class C_100926_axq extends C_100988_axw {

   private int field_104636_a = 0;
   private int field_104638_aw = 0;
   private C_100874_azc field_104637_ax;


   public C_100926_axq(C_100874_azc var1, C_100873_xe var2, double var3, double var5, double var7) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.field_104637_ax = var1;
      this.field_103215_w = this.field_103240_x = this.field_103238_y = 0.0D;
      this.field_104638_aw = 200;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_104636_a + var2) / (float)this.field_104638_aw;
      var8 *= var8;
      float var9 = 2.0F - var8 * 2.0F;
      if(var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= 0.2F;
      GL11.glDisable(2896);
      float var10 = 0.125F;
      float var11 = (float)(this.field_103221_t - field_104616_at);
      float var12 = (float)(this.field_103219_u - field_104622_au);
      float var13 = (float)(this.field_103217_v - field_104619_av);
      float var14 = this.field_103229_p.func_109354_o(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
      this.field_104637_ax.func_110368_b(this.field_104637_ax.func_110367_b("/misc/footprint.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      var1.func_110330_b();
      var1.func_110317_a(var14, var14, var14, var9);
      var1.func_110322_a((double)(var11 - var10), (double)var12, (double)(var13 + var10), 0.0D, 1.0D);
      var1.func_110322_a((double)(var11 + var10), (double)var12, (double)(var13 + var10), 1.0D, 1.0D);
      var1.func_110322_a((double)(var11 + var10), (double)var12, (double)(var13 - var10), 1.0D, 0.0D);
      var1.func_110322_a((double)(var11 - var10), (double)var12, (double)(var13 - var10), 0.0D, 0.0D);
      var1.func_110329_a();
      GL11.glDisable(3042);
      GL11.glEnable(2896);
   }

   public void func_103165_j_() {
      ++this.field_104636_a;
      if(this.field_104636_a == this.field_104638_aw) {
         this.func_103121_x();
      }

   }

   public int func_104602_b() {
      return 3;
   }
}
