import java.util.Iterator;
import java.util.List;

public abstract class C_100597_ll extends C_100730_lb {

   private int field_104578_e;
   public int field_104581_a;
   public int field_104579_b;
   public int field_104580_c;
   public int field_104577_d;


   public C_100597_ll(C_100873_xe var1) {
      super(var1);
      this.field_104578_e = 0;
      this.field_104581_a = 0;
      this.field_103181_M = 0.0F;
      this.func_103161_a(0.5F, 0.5F);
   }

   public C_100597_ll(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.field_104579_b = var2;
      this.field_104580_c = var3;
      this.field_104577_d = var4;
   }

   protected void func_103141_a() {}

   public void func_104571_a(int var1) {
      this.field_104581_a = var1;
      this.field_103178_B = this.field_103236_z = (float)(var1 * 90);
      float var2 = (float)this.func_104572_d();
      float var3 = (float)this.func_104574_g();
      float var4 = (float)this.func_104572_d();
      if(var1 != 2 && var1 != 0) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
         this.field_103236_z = this.field_103178_B = (float)(C_100015_i.field_105277_f[var1] * 90);
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.field_104579_b + 0.5F;
      float var6 = (float)this.field_104580_c + 0.5F;
      float var7 = (float)this.field_104577_d + 0.5F;
      float var8 = 0.5625F;
      if(var1 == 2) {
         var7 -= var8;
      }

      if(var1 == 1) {
         var5 -= var8;
      }

      if(var1 == 0) {
         var7 += var8;
      }

      if(var1 == 3) {
         var5 += var8;
      }

      if(var1 == 2) {
         var5 -= this.func_104576_g(this.func_104572_d());
      }

      if(var1 == 1) {
         var7 += this.func_104576_g(this.func_104572_d());
      }

      if(var1 == 0) {
         var5 += this.func_104576_g(this.func_104572_d());
      }

      if(var1 == 3) {
         var7 -= this.func_104576_g(this.func_104572_d());
      }

      var6 += this.func_104576_g(this.func_104574_g());
      this.func_103163_b((double)var5, (double)var6, (double)var7);
      float var9 = -0.03125F;
      this.field_103173_D.func_107907_b((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float func_104576_g(int var1) {
      return var1 == 32?0.5F:(var1 == 64?0.5F:0.0F);
   }

   public void func_103165_j_() {
      if(this.field_104578_e++ == 100 && !this.field_103229_p.field_109557_J) {
         this.field_104578_e = 0;
         if(!this.field_103180_L && !this.func_104573_c()) {
            this.func_103121_x();
            this.func_104575_h();
         }
      }

   }

   public boolean func_104573_c() {
      if(!this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty()) {
         return false;
      } else {
         int var1 = Math.max(1, this.func_104572_d() / 16);
         int var2 = Math.max(1, this.func_104574_g() / 16);
         int var3 = this.field_104579_b;
         int var4 = this.field_104580_c;
         int var5 = this.field_104577_d;
         if(this.field_104581_a == 2) {
            var3 = C_100650_jv.func_108910_c(this.field_103221_t - (double)((float)this.func_104572_d() / 32.0F));
         }

         if(this.field_104581_a == 1) {
            var5 = C_100650_jv.func_108910_c(this.field_103217_v - (double)((float)this.func_104572_d() / 32.0F));
         }

         if(this.field_104581_a == 0) {
            var3 = C_100650_jv.func_108910_c(this.field_103221_t - (double)((float)this.func_104572_d() / 32.0F));
         }

         if(this.field_104581_a == 3) {
            var5 = C_100650_jv.func_108910_c(this.field_103217_v - (double)((float)this.func_104572_d() / 32.0F));
         }

         var4 = C_100650_jv.func_108910_c(this.field_103219_u - (double)((float)this.func_104574_g() / 32.0F));

         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 0; var7 < var2; ++var7) {
               C_100664_afg var8;
               if(this.field_104581_a != 2 && this.field_104581_a != 0) {
                  var8 = this.field_103229_p.func_109350_f(this.field_104579_b, var4 + var7, var5 + var6);
               } else {
                  var8 = this.field_103229_p.func_109350_f(var3 + var6, var4 + var7, this.field_104577_d);
               }

               if(!var8.func_108983_a()) {
                  return false;
               }
            }
         }

         List var9 = this.field_103229_p.func_109449_b(this, this.field_103173_D);
         Iterator var10 = var9.iterator();

         C_100730_lb var11;
         do {
            if(!var10.hasNext()) {
               return true;
            }

            var11 = (C_100730_lb)var10.next();
         } while(!(var11 instanceof C_100597_ll));

         return false;
      }
   }

   public boolean func_103123_L() {
      return true;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(!this.field_103180_L && !this.field_103229_p.field_109557_J) {
         this.func_103121_x();
         this.func_103065_K();
         C_101095_qg var3 = null;
         if(var1.func_109210_g() instanceof C_101095_qg) {
            var3 = (C_101095_qg)var1.func_109210_g();
         }

         if(var3 != null && var3.field_103869_cf.field_111597_d) {
            return true;
         }

         this.func_104575_h();
      }

      return true;
   }

   public void func_103145_d(double var1, double var3, double var5) {
      if(!this.field_103229_p.field_109557_J && !this.field_103180_L && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.func_103121_x();
         this.func_104575_h();
      }

   }

   public void func_103071_g(double var1, double var3, double var5) {
      if(!this.field_103229_p.field_109557_J && !this.field_103180_L && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.func_103121_x();
         this.func_104575_h();
      }

   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107527_a("Direction", (byte)this.field_104581_a);
      var1.func_107520_a("TileX", this.field_104579_b);
      var1.func_107520_a("TileY", this.field_104580_c);
      var1.func_107520_a("TileZ", this.field_104577_d);
      switch(this.field_104581_a) {
      case 0:
         var1.func_107527_a("Dir", (byte)2);
         break;
      case 1:
         var1.func_107527_a("Dir", (byte)1);
         break;
      case 2:
         var1.func_107527_a("Dir", (byte)0);
         break;
      case 3:
         var1.func_107527_a("Dir", (byte)3);
      }

   }

   public void func_103110_a(C_100353_bh var1) {
      if(var1.func_107516_b("Direction")) {
         this.field_104581_a = var1.func_107524_c("Direction");
      } else {
         switch(var1.func_107524_c("Dir")) {
         case 0:
            this.field_104581_a = 2;
            break;
         case 1:
            this.field_104581_a = 1;
            break;
         case 2:
            this.field_104581_a = 0;
            break;
         case 3:
            this.field_104581_a = 3;
         }
      }

      this.field_104579_b = var1.func_107514_e("TileX");
      this.field_104580_c = var1.func_107514_e("TileY");
      this.field_104577_d = var1.func_107514_e("TileZ");
      this.func_104571_a(this.field_104581_a);
   }

   public abstract int func_104572_d();

   public abstract int func_104574_g();

   public abstract void func_104575_h();
}
