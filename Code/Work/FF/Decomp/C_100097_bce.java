import java.io.IOException;
import java.net.InetAddress;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100097_bce extends C_100803_in {

   private final C_100321_bw field_105791_c = new C_100321_bw((C_100221_dy)null);
   private C_100321_bw field_105789_d;
   private String field_105790_e;
   private boolean field_105787_f = false;
   private C_100753_hl field_105788_g;


   public C_100097_bce(C_100094_bcb var1) {
      super(var1);
   }

   public void func_105784_a(C_100321_bw var1, String var2) {
      this.field_105789_d = var1;
      this.field_105790_e = var2;
   }

   public String func_105786_c() {
      if(this.field_105788_g == null) {
         int var1 = -1;

         try {
            var1 = C_100669_jm.func_109082_a();
         } catch (IOException var4) {
            ;
         }

         if(var1 <= 0) {
            var1 = 25564;
         }

         try {
            this.field_105788_g = new C_100753_hl(this, InetAddress.getLocalHost(), var1);
            this.field_105788_g.start();
         } catch (IOException var3) {
            throw var3;
         }
      }

      return this.field_105788_g.func_109642_c().getHostAddress() + ":" + this.field_105788_g.func_109640_d();
   }

   public void func_105773_a() {
      super.func_105773_a();
      if(this.field_105788_g != null) {
         System.out.println("Stopping server connection");
         this.field_105788_g.func_109643_b();
         this.field_105788_g.interrupt();
         this.field_105788_g = null;
      }

   }

   public void func_105775_b() {
      if(this.field_105789_d != null) {
         C_100762_ih var1 = this.func_105785_e().func_104931_ad().func_105707_a(this.field_105790_e);
         if(var1 != null) {
            this.field_105791_c.func_107470_a(this.field_105789_d);
            this.field_105787_f = true;
            this.func_105785_e().func_104931_ad().func_105738_a(this.field_105791_c, var1);
         }

         this.field_105789_d = null;
         this.field_105790_e = null;
      }

      if(this.field_105788_g != null) {
         this.field_105788_g.func_109641_a();
      }

      super.func_105775_b();
   }

   public C_100094_bcb func_105785_e() {
      return (C_100094_bcb)super.func_105774_d();
   }

   public boolean func_105783_f() {
      return this.field_105787_f && this.field_105791_c.func_107472_i().func_107469_g() && this.field_105791_c.func_107472_i().func_107467_h();
   }

   // $FF: synthetic method
   public C_101445_MinecraftServer func_105774_d() {
      return this.func_105785_e();
   }
}
