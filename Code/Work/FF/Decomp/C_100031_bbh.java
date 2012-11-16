import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class C_100031_bbh extends C_100032_bbi {

   private Minecraft field_105325_j;
   private int[] field_105326_k = new int[256];
   public double field_105324_a;
   public double field_105322_b;
   public static C_100031_bbh field_105323_c;


   public C_100031_bbh(Minecraft var1) {
      super(C_100992_tt.field_110898_aQ.func_110787_b(0));
      this.field_105325_j = var1;
      this.field_105308_i = 1;

      try {
         BufferedImage var2 = ImageIO.read(Minecraft.class.getResource("/gui/items.png"));
         int var3 = this.field_105306_e % 16 * 16;
         int var4 = this.field_105306_e / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.field_105326_k, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      field_105323_c = this;
   }

   public void func_105301_a() {
      if(this.field_105325_j.field_105122_e != null && this.field_105325_j.field_105120_g != null) {
         func_105321_a(this.field_105325_j.field_105120_g.field_103221_t, this.field_105325_j.field_105120_g.field_103217_v, (double)this.field_105325_j.field_105120_g.field_103236_z, false, false);
      } else {
         func_105321_a(0.0D, 0.0D, 0.0D, true, false);
      }

   }

   public static void func_105321_a(double var0, double var2, double var4, boolean var6, boolean var7) {
      int[] var8 = field_105323_c.field_105326_k;
      byte[] var9 = field_105323_c.field_105305_d;

      int var17;
      int var16;
      for(int var10 = 0; var10 < 256; ++var10) {
         int var11 = var8[var10] >> 24 & 255;
         int var12 = var8[var10] >> 16 & 255;
         int var13 = var8[var10] >> 8 & 255;
         int var14 = var8[var10] >> 0 & 255;
         if(field_105323_c.field_105303_f) {
            int var15 = (var12 * 30 + var13 * 59 + var14 * 11) / 100;
            var16 = (var12 * 30 + var13 * 70) / 100;
            var17 = (var12 * 30 + var14 * 70) / 100;
            var12 = var15;
            var13 = var16;
            var14 = var17;
         }

         var9[var10 * 4 + 0] = (byte)var12;
         var9[var10 * 4 + 1] = (byte)var13;
         var9[var10 * 4 + 2] = (byte)var14;
         var9[var10 * 4 + 3] = (byte)var11;
      }

      double var27 = 0.0D;
      if(field_105323_c.field_105325_j.field_105122_e != null && !var6) {
         C_100013_k var29 = field_105323_c.field_105325_j.field_105122_e.func_109381_G();
         double var28 = (double)var29.field_105273_a - var0;
         double var32 = (double)var29.field_105272_c - var2;
         var27 = (var4 - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(var32, var28);
         if(!field_105323_c.field_105325_j.field_105122_e.field_109576_v.func_112390_d()) {
            var27 = Math.random() * 3.1415927410125732D * 2.0D;
         }
      }

      double var30;
      if(var7) {
         field_105323_c.field_105324_a = var27;
      } else {
         for(var30 = var27 - field_105323_c.field_105324_a; var30 < -3.141592653589793D; var30 += 6.283185307179586D) {
            ;
         }

         while(var30 >= 3.141592653589793D) {
            var30 -= 6.283185307179586D;
         }

         if(var30 < -1.0D) {
            var30 = -1.0D;
         }

         if(var30 > 1.0D) {
            var30 = 1.0D;
         }

         field_105323_c.field_105322_b += var30 * 0.1D;
         field_105323_c.field_105322_b *= 0.8D;
         field_105323_c.field_105324_a += field_105323_c.field_105322_b;
      }

      var30 = Math.sin(field_105323_c.field_105324_a);
      double var31 = Math.cos(field_105323_c.field_105324_a);

      int var19;
      int var18;
      int var21;
      int var20;
      short var23;
      int var22;
      int var25;
      int var24;
      int var26;
      for(var16 = -4; var16 <= 4; ++var16) {
         var17 = (int)(8.5D + var31 * (double)var16 * 0.3D);
         var18 = (int)(7.5D - var30 * (double)var16 * 0.3D * 0.5D);
         var19 = var18 * 16 + var17;
         var20 = 100;
         var21 = 100;
         var22 = 100;
         var23 = 255;
         if(field_105323_c.field_105303_f) {
            var24 = (var20 * 30 + var21 * 59 + var22 * 11) / 100;
            var25 = (var20 * 30 + var21 * 70) / 100;
            var26 = (var20 * 30 + var22 * 70) / 100;
            var20 = var24;
            var21 = var25;
            var22 = var26;
         }

         var9[var19 * 4 + 0] = (byte)var20;
         var9[var19 * 4 + 1] = (byte)var21;
         var9[var19 * 4 + 2] = (byte)var22;
         var9[var19 * 4 + 3] = (byte)var23;
      }

      for(var16 = -8; var16 <= 16; ++var16) {
         var17 = (int)(8.5D + var30 * (double)var16 * 0.3D);
         var18 = (int)(7.5D + var31 * (double)var16 * 0.3D * 0.5D);
         var19 = var18 * 16 + var17;
         var20 = var16 >= 0?255:100;
         var21 = var16 >= 0?20:100;
         var22 = var16 >= 0?20:100;
         var23 = 255;
         if(field_105323_c.field_105303_f) {
            var24 = (var20 * 30 + var21 * 59 + var22 * 11) / 100;
            var25 = (var20 * 30 + var21 * 70) / 100;
            var26 = (var20 * 30 + var22 * 70) / 100;
            var20 = var24;
            var21 = var25;
            var22 = var26;
         }

         var9[var19 * 4 + 0] = (byte)var20;
         var9[var19 * 4 + 1] = (byte)var21;
         var9[var19 * 4 + 2] = (byte)var22;
         var9[var19 * 4 + 3] = (byte)var23;
      }

   }
}
