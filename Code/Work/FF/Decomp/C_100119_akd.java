import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class C_100119_akd extends C_100451_alf {

   private C_100117_ake field_106256_a;


   protected C_100119_akd(int var1, int var2, C_100117_ake var3, C_100664_afg var4) {
      super(var1, var2, var4);
      this.field_106256_a = var3;
      this.func_106034_a(C_101040_sq.field_111415_d);
      this.func_105972_b(true);
      float var5 = 0.0625F;
      this.func_106008_a(var5, 0.0F, var5, 1.0F - var5, 0.03125F, 1.0F - var5);
   }

   public int func_106000_r_() {
      return 20;
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109348_t(var2, var3 - 1, var4) || C_100206_ait.func_106354_c(var1.func_109349_a(var2, var3 - 1, var4));
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if(!var1.func_109348_t(var2, var3 - 1, var4) && !C_100206_ait.func_106354_c(var1.func_109349_a(var2, var3 - 1, var4))) {
         var6 = true;
      }

      if(var6) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         if(var1.func_109357_g(var2, var3, var4) != 0) {
            this.func_106255_l(var1, var2, var3, var4);
         }
      }
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(!var1.field_109557_J) {
         if(var1.func_109357_g(var2, var3, var4) != 1) {
            this.func_106255_l(var1, var2, var3, var4);
         }
      }
   }

   private void func_106255_l(C_100873_xe var1, int var2, int var3, int var4) {
      boolean var5 = var1.func_109357_g(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if(this.field_106256_a == C_100117_ake.field_106477_a) {
         var8 = var1.func_109449_b((C_100730_lb)null, C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(this.field_106256_a == C_100117_ake.field_106475_b) {
         var8 = var1.func_109518_a(C_100595_ln.class, C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(this.field_106256_a == C_100117_ake.field_106476_c) {
         var8 = var1.func_109518_a(C_101095_qg.class, C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(!var8.isEmpty()) {
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            C_100730_lb var10 = (C_100730_lb)var9.next();
            if(!var10.func_103076_au()) {
               var6 = true;
               break;
            }
         }
      }

      if(var6 && !var5) {
         var1.func_109488_c(var2, var3, var4, 1);
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if(!var6 && var5) {
         var1.func_109488_c(var2, var3, var4, 0);
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      }

      if(var6) {
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
      }

   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if(var6 > 0) {
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      boolean var5 = var1.func_109357_g(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if(var5) {
         this.func_106008_a(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.func_106008_a(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }

   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var1.func_109357_g(var2, var3, var4) > 0;
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var1.func_109357_g(var2, var3, var4) == 0?false:var5 == 1;
   }

   public boolean func_106028_i() {
      return true;
   }

   public void func_106059_f() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.func_106008_a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public int func_106058_q_() {
      return 1;
   }
}
