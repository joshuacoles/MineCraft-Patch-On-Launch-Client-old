import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class C_100990_axx {

   protected C_100873_xe field_111317_a;
   private List[] field_111315_b = new List[4];
   private C_100874_azc field_111316_c;
   private Random field_111314_d = new Random();


   public C_100990_axx(C_100873_xe var1, C_100874_azc var2) {
      if(var1 != null) {
         this.field_111317_a = var1;
      }

      this.field_111316_c = var2;

      for(int var3 = 0; var3 < 4; ++var3) {
         this.field_111315_b[var3] = new ArrayList();
      }

   }

   public void func_111310_a(C_100988_axw var1) {
      int var2 = var1.func_104602_b();
      if(this.field_111315_b[var2].size() >= 4000) {
         this.field_111315_b[var2].remove(0);
      }

      this.field_111315_b[var2].add(var1);
   }

   public void func_111309_a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.field_111315_b[var1].size(); ++var2) {
            C_100988_axw var3 = (C_100988_axw)this.field_111315_b[var1].get(var2);
            var3.func_103165_j_();
            if(var3.field_103180_L) {
               this.field_111315_b[var1].remove(var2--);
            }
         }
      }

   }

   public void func_111313_a(C_100730_lb var1, float var2) {
      float var3 = C_101203_aqb.field_111971_d;
      float var4 = C_101203_aqb.field_111969_f;
      float var5 = C_101203_aqb.field_111970_g;
      float var6 = C_101203_aqb.field_111979_h;
      float var7 = C_101203_aqb.field_111972_e;
      C_100988_axw.field_104616_at = var1.field_103189_T + (var1.field_103221_t - var1.field_103189_T) * (double)var2;
      C_100988_axw.field_104622_au = var1.field_103188_U + (var1.field_103219_u - var1.field_103188_U) * (double)var2;
      C_100988_axw.field_104619_av = var1.field_103191_V + (var1.field_103217_v - var1.field_103191_V) * (double)var2;

      for(int var8 = 0; var8 < 3; ++var8) {
         if(!this.field_111315_b[var8].isEmpty()) {
            int var9 = 0;
            if(var8 == 0) {
               var9 = this.field_111316_c.func_110367_b("/particles.png");
            }

            if(var8 == 1) {
               var9 = this.field_111316_c.func_110367_b("/terrain.png");
            }

            if(var8 == 2) {
               var9 = this.field_111316_c.func_110367_b("/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            C_100872_azb var10 = C_100872_azb.field_110346_a;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var10.func_110330_b();

            for(int var11 = 0; var11 < this.field_111315_b[var8].size(); ++var11) {
               C_100988_axw var12 = (C_100988_axw)this.field_111315_b[var8].get(var11);
               var10.func_110328_c(var12.func_103125_b(var2));
               var12.func_104606_a(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.func_110329_a();
         }
      }

   }

   public void func_111308_b(C_100730_lb var1, float var2) {
      float var4 = C_100650_jv.func_108928_b(var1.field_103236_z * 0.017453292F);
      float var5 = C_100650_jv.func_108924_a(var1.field_103236_z * 0.017453292F);
      float var6 = -var5 * C_100650_jv.func_108924_a(var1.field_103177_A * 0.017453292F);
      float var7 = var4 * C_100650_jv.func_108924_a(var1.field_103177_A * 0.017453292F);
      float var8 = C_100650_jv.func_108928_b(var1.field_103177_A * 0.017453292F);
      byte var9 = 3;
      if(!this.field_111315_b[var9].isEmpty()) {
         C_100872_azb var10 = C_100872_azb.field_110346_a;

         for(int var11 = 0; var11 < this.field_111315_b[var9].size(); ++var11) {
            C_100988_axw var12 = (C_100988_axw)this.field_111315_b[var9].get(var11);
            var10.func_110328_c(var12.func_103125_b(var2));
            var12.func_104606_a(var10, var2, var4, var8, var5, var6, var7);
         }

      }
   }

   public void func_111306_a(C_100873_xe var1) {
      this.field_111317_a = var1;

      for(int var2 = 0; var2 < 4; ++var2) {
         this.field_111315_b[var2].clear();
      }

   }

   public void func_111312_a(int var1, int var2, int var3, int var4, int var5) {
      if(var4 != 0) {
         C_100451_alf var6 = C_100451_alf.field_106118_p[var4];
         byte var7 = 4;

         for(int var8 = 0; var8 < var7; ++var8) {
            for(int var9 = 0; var9 < var7; ++var9) {
               for(int var10 = 0; var10 < var7; ++var10) {
                  double var11 = (double)var1 + ((double)var8 + 0.5D) / (double)var7;
                  double var13 = (double)var2 + ((double)var9 + 0.5D) / (double)var7;
                  double var15 = (double)var3 + ((double)var10 + 0.5D) / (double)var7;
                  int var17 = this.field_111314_d.nextInt(6);
                  this.func_111310_a((new C_100958_ayi(this.field_111317_a, var11, var13, var15, var11 - (double)var1 - 0.5D, var13 - (double)var2 - 0.5D, var15 - (double)var3 - 0.5D, var6, var17, var5)).func_104647_a(var1, var2, var3));
               }
            }
         }

      }
   }

   public void func_111307_a(int var1, int var2, int var3, int var4) {
      int var5 = this.field_111317_a.func_109349_a(var1, var2, var3);
      if(var5 != 0) {
         C_100451_alf var6 = C_100451_alf.field_106118_p[var5];
         float var7 = 0.1F;
         double var8 = (double)var1 + this.field_111314_d.nextDouble() * (var6.func_106027_w() - var6.func_106062_v() - (double)(var7 * 2.0F)) + (double)var7 + var6.func_106062_v();
         double var10 = (double)var2 + this.field_111314_d.nextDouble() * (var6.func_106068_y() - var6.func_106032_x() - (double)(var7 * 2.0F)) + (double)var7 + var6.func_106032_x();
         double var12 = (double)var3 + this.field_111314_d.nextDouble() * (var6.func_106002_A() - var6.func_105995_z() - (double)(var7 * 2.0F)) + (double)var7 + var6.func_105995_z();
         if(var4 == 0) {
            var10 = (double)var2 + var6.func_106032_x() - (double)var7;
         }

         if(var4 == 1) {
            var10 = (double)var2 + var6.func_106068_y() + (double)var7;
         }

         if(var4 == 2) {
            var12 = (double)var3 + var6.func_105995_z() - (double)var7;
         }

         if(var4 == 3) {
            var12 = (double)var3 + var6.func_106002_A() + (double)var7;
         }

         if(var4 == 4) {
            var8 = (double)var1 + var6.func_106062_v() - (double)var7;
         }

         if(var4 == 5) {
            var8 = (double)var1 + var6.func_106027_w() + (double)var7;
         }

         this.func_111310_a((new C_100958_ayi(this.field_111317_a, var8, var10, var12, 0.0D, 0.0D, 0.0D, var6, var4, this.field_111317_a.func_109357_g(var1, var2, var3))).func_104647_a(var1, var2, var3).func_104604_e(0.2F).func_104608_f(0.6F));
      }
   }

   public String func_111311_b() {
      return "" + (this.field_111315_b[0].size() + this.field_111315_b[1].size() + this.field_111315_b[2].size());
   }
}
