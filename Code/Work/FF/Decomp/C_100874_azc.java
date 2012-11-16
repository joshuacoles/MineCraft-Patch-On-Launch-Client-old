import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class C_100874_azc {

   private HashMap field_110390_c = new HashMap();
   private HashMap field_110387_d = new HashMap();
   private C_100661_jq field_110388_e = new C_100661_jq();
   private IntBuffer field_110385_f = C_101209_aqk.func_112004_f(1);
   private ByteBuffer field_110386_g = C_101209_aqk.func_112001_c(16777216);
   private List field_110395_h = new ArrayList();
   private Map field_110396_i = new HashMap();
   private C_101125_ard field_110393_j;
   public boolean field_110391_a = false;
   public boolean field_110389_b = false;
   private C_100088_bcp field_110394_k;
   private BufferedImage field_110392_l = new BufferedImage(64, 64, 2);


   public C_100874_azc(C_100088_bcp var1, C_101125_ard var2) {
      this.field_110394_k = var1;
      this.field_110393_j = var2;
      Graphics var3 = this.field_110392_l.getGraphics();
      var3.setColor(Color.WHITE);
      var3.fillRect(0, 0, 64, 64);
      var3.setColor(Color.BLACK);
      var3.drawString("missingtex", 1, 10);
      var3.dispose();
   }

   public int[] func_110372_a(String var1) {
      C_100087_bco var2 = this.field_110394_k.func_105667_e();
      int[] var3 = (int[])this.field_110387_d.get(var1);
      if(var3 != null) {
         return var3;
      } else {
         try {
            Object var4 = null;
            int[] var7;
            if(var1.startsWith("##")) {
               var7 = this.func_110374_b(this.func_110384_c(this.func_110371_a(var2.func_105627_a(var1.substring(2)))));
            } else if(var1.startsWith("%clamp%")) {
               this.field_110391_a = true;
               var7 = this.func_110374_b(this.func_110371_a(var2.func_105627_a(var1.substring(7))));
               this.field_110391_a = false;
            } else if(var1.startsWith("%blur%")) {
               this.field_110389_b = true;
               this.field_110391_a = true;
               var7 = this.func_110374_b(this.func_110371_a(var2.func_105627_a(var1.substring(6))));
               this.field_110391_a = false;
               this.field_110389_b = false;
            } else {
               InputStream var8 = var2.func_105627_a(var1);
               if(var8 == null) {
                  var7 = this.func_110374_b(this.field_110392_l);
               } else {
                  var7 = this.func_110374_b(this.func_110371_a(var8));
               }
            }

            this.field_110387_d.put(var1, var7);
            return var7;
         } catch (IOException var6) {
            var6.printStackTrace();
            int[] var5 = this.func_110374_b(this.field_110392_l);
            this.field_110387_d.put(var1, var5);
            return var5;
         }
      }
   }

   private int[] func_110374_b(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int[] var4 = new int[var2 * var3];
      var1.getRGB(0, 0, var2, var3, var4, 0, var2);
      return var4;
   }

   private int[] func_110366_a(BufferedImage var1, int[] var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      var1.getRGB(0, 0, var3, var4, var2, 0, var3);
      return var2;
   }

   public int func_110367_b(String var1) {
      Integer var2 = (Integer)this.field_110390_c.get(var1);
      if(var2 != null) {
         return var2.intValue();
      } else {
         C_100087_bco var6 = this.field_110394_k.func_105667_e();

         try {
            this.field_110385_f.clear();
            C_101209_aqk.func_112005_a(this.field_110385_f);
            int var3 = this.field_110385_f.get(0);
            if(var1.startsWith("##")) {
               this.func_110379_a(this.func_110384_c(this.func_110371_a(var6.func_105627_a(var1.substring(2)))), var3);
            } else if(var1.startsWith("%clamp%")) {
               this.field_110391_a = true;
               this.func_110379_a(this.func_110371_a(var6.func_105627_a(var1.substring(7))), var3);
               this.field_110391_a = false;
            } else if(var1.startsWith("%blur%")) {
               this.field_110389_b = true;
               this.func_110379_a(this.func_110371_a(var6.func_105627_a(var1.substring(6))), var3);
               this.field_110389_b = false;
            } else if(var1.startsWith("%blurclamp%")) {
               this.field_110389_b = true;
               this.field_110391_a = true;
               this.func_110379_a(this.func_110371_a(var6.func_105627_a(var1.substring(11))), var3);
               this.field_110389_b = false;
               this.field_110391_a = false;
            } else {
               InputStream var7 = var6.func_105627_a(var1);
               if(var7 == null) {
                  this.func_110379_a(this.field_110392_l, var3);
               } else {
                  this.func_110379_a(this.func_110371_a(var7), var3);
               }
            }

            this.field_110390_c.put(var1, Integer.valueOf(var3));
            return var3;
         } catch (Exception var5) {
            var5.printStackTrace();
            C_101209_aqk.func_112005_a(this.field_110385_f);
            int var4 = this.field_110385_f.get(0);
            this.func_110379_a(this.field_110392_l, var4);
            this.field_110390_c.put(var1, Integer.valueOf(var4));
            return var4;
         }
      }
   }

   private BufferedImage func_110384_c(BufferedImage var1) {
      int var2 = var1.getWidth() / 16;
      BufferedImage var3 = new BufferedImage(16, var1.getHeight() * var2, 2);
      Graphics var4 = var3.getGraphics();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.drawImage(var1, -var5 * 16, var5 * var1.getHeight(), (ImageObserver)null);
      }

      var4.dispose();
      return var3;
   }

   public int func_110383_a(BufferedImage var1) {
      this.field_110385_f.clear();
      C_101209_aqk.func_112005_a(this.field_110385_f);
      int var2 = this.field_110385_f.get(0);
      this.func_110379_a(var1, var2);
      this.field_110388_e.func_109035_a(var2, var1);
      return var2;
   }

   public void func_110379_a(BufferedImage var1, int var2) {
      GL11.glBindTexture(3553, var2);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      if(this.field_110389_b) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if(this.field_110391_a) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      int[] var5 = new int[var3 * var4];
      byte[] var6 = new byte[var3 * var4 * 4];
      var1.getRGB(0, 0, var3, var4, var5, 0, var3);

      for(int var7 = 0; var7 < var5.length; ++var7) {
         int var8 = var5[var7] >> 24 & 255;
         int var9 = var5[var7] >> 16 & 255;
         int var10 = var5[var7] >> 8 & 255;
         int var11 = var5[var7] & 255;
         if(this.field_110393_j != null && this.field_110393_j.field_111716_g) {
            int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
            int var13 = (var9 * 30 + var10 * 70) / 100;
            int var14 = (var9 * 30 + var11 * 70) / 100;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var6[var7 * 4 + 0] = (byte)var9;
         var6[var7 * 4 + 1] = (byte)var10;
         var6[var7 * 4 + 2] = (byte)var11;
         var6[var7 * 4 + 3] = (byte)var8;
      }

      this.field_110386_g.clear();
      this.field_110386_g.put(var6);
      this.field_110386_g.position(0).limit(var6.length);
      GL11.glTexImage2D(3553, 0, 6408, var3, var4, 0, 6408, 5121, this.field_110386_g);
   }

   public void func_110376_a(int[] var1, int var2, int var3, int var4) {
      GL11.glBindTexture(3553, var4);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      if(this.field_110389_b) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if(this.field_110391_a) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      byte[] var5 = new byte[var2 * var3 * 4];

      for(int var6 = 0; var6 < var1.length; ++var6) {
         int var7 = var1[var6] >> 24 & 255;
         int var8 = var1[var6] >> 16 & 255;
         int var9 = var1[var6] >> 8 & 255;
         int var10 = var1[var6] & 255;
         if(this.field_110393_j != null && this.field_110393_j.field_111716_g) {
            int var11 = (var8 * 30 + var9 * 59 + var10 * 11) / 100;
            int var12 = (var8 * 30 + var9 * 70) / 100;
            int var13 = (var8 * 30 + var10 * 70) / 100;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var5[var6 * 4 + 0] = (byte)var8;
         var5[var6 * 4 + 1] = (byte)var9;
         var5[var6 * 4 + 2] = (byte)var10;
         var5[var6 * 4 + 3] = (byte)var7;
      }

      this.field_110386_g.clear();
      this.field_110386_g.put(var5);
      this.field_110386_g.position(0).limit(var5.length);
      GL11.glTexSubImage2D(3553, 0, 0, 0, var2, var3, 6408, 5121, this.field_110386_g);
   }

   public void func_110370_a(int var1) {
      this.field_110388_e.func_109047_d(var1);
      this.field_110385_f.clear();
      this.field_110385_f.put(var1);
      this.field_110385_f.flip();
      GL11.glDeleteTextures(this.field_110385_f);
   }

   public int func_110378_a(String var1, String var2) {
      C_100981_ayu var3 = (C_100981_ayu)this.field_110396_i.get(var1);
      if(var3 != null && var3.field_111222_a != null && !var3.field_111219_d) {
         if(var3.field_111221_c < 0) {
            var3.field_111221_c = this.func_110383_a(var3.field_111222_a);
         } else {
            this.func_110379_a(var3.field_111222_a, var3.field_111221_c);
         }

         var3.field_111219_d = true;
      }

      return var3 != null && var3.field_111221_c >= 0?var3.field_111221_c:(var2 == null?-1:this.func_110367_b(var2));
   }

   public boolean func_110381_c(String var1) {
      return this.field_110396_i.containsKey(var1);
   }

   public C_100981_ayu func_110373_a(String var1, C_100977_ayw var2) {
      C_100981_ayu var3 = (C_100981_ayu)this.field_110396_i.get(var1);
      if(var3 == null) {
         this.field_110396_i.put(var1, new C_100981_ayu(var1, var2));
      } else {
         ++var3.field_111220_b;
      }

      return var3;
   }

   public void func_110377_d(String var1) {
      C_100981_ayu var2 = (C_100981_ayu)this.field_110396_i.get(var1);
      if(var2 != null) {
         --var2.field_111220_b;
         if(var2.field_111220_b == 0) {
            if(var2.field_111221_c >= 0) {
               this.func_110370_a(var2.field_111221_c);
            }

            this.field_110396_i.remove(var1);
         }
      }

   }

   public void func_110375_a(C_100032_bbi var1) {
      this.field_110395_h.add(var1);
      var1.func_105301_a();
   }

   public void func_110369_a() {
      int var1 = -1;

      C_100032_bbi var3;
      for(Iterator var2 = this.field_110395_h.iterator(); var2.hasNext(); var1 = this.func_110382_a(var3, var1)) {
         var3 = (C_100032_bbi)var2.next();
         var3.field_105303_f = this.field_110393_j.field_111716_g;
         var3.func_105301_a();
      }

   }

   public int func_110382_a(C_100032_bbi var1, int var2) {
      this.field_110386_g.clear();
      this.field_110386_g.put(var1.field_105305_d);
      this.field_110386_g.position(0).limit(var1.field_105305_d.length);
      if(var1.field_105306_e != var2) {
         var1.func_105302_a(this);
         var2 = var1.field_105306_e;
      }

      for(int var3 = 0; var3 < var1.field_105307_h; ++var3) {
         for(int var4 = 0; var4 < var1.field_105307_h; ++var4) {
            GL11.glTexSubImage2D(3553, 0, var1.field_105306_e % 16 * 16 + var3 * 16, var1.field_105306_e / 16 * 16 + var4 * 16, 16, 16, 6408, 5121, this.field_110386_g);
         }
      }

      return var2;
   }

   public void func_110380_b() {
      C_100087_bco var1 = this.field_110394_k.func_105667_e();
      Iterator var2 = this.field_110388_e.func_109036_d().iterator();

      BufferedImage var4;
      while(var2.hasNext()) {
         int var3 = ((Integer)var2.next()).intValue();
         var4 = (BufferedImage)this.field_110388_e.func_109038_a(var3);
         this.func_110379_a(var4, var3);
      }

      C_100981_ayu var8;
      for(var2 = this.field_110396_i.values().iterator(); var2.hasNext(); var8.field_111219_d = false) {
         var8 = (C_100981_ayu)var2.next();
      }

      var2 = this.field_110390_c.keySet().iterator();

      String var9;
      while(var2.hasNext()) {
         var9 = (String)var2.next();

         try {
            if(var9.startsWith("##")) {
               var4 = this.func_110384_c(this.func_110371_a(var1.func_105627_a(var9.substring(2))));
            } else if(var9.startsWith("%clamp%")) {
               this.field_110391_a = true;
               var4 = this.func_110371_a(var1.func_105627_a(var9.substring(7)));
            } else if(var9.startsWith("%blur%")) {
               this.field_110389_b = true;
               var4 = this.func_110371_a(var1.func_105627_a(var9.substring(6)));
            } else if(var9.startsWith("%blurclamp%")) {
               this.field_110389_b = true;
               this.field_110391_a = true;
               var4 = this.func_110371_a(var1.func_105627_a(var9.substring(11)));
            } else {
               var4 = this.func_110371_a(var1.func_105627_a(var9));
            }

            int var5 = ((Integer)this.field_110390_c.get(var9)).intValue();
            this.func_110379_a(var4, var5);
            this.field_110389_b = false;
            this.field_110391_a = false;
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

      var2 = this.field_110387_d.keySet().iterator();

      while(var2.hasNext()) {
         var9 = (String)var2.next();

         try {
            if(var9.startsWith("##")) {
               var4 = this.func_110384_c(this.func_110371_a(var1.func_105627_a(var9.substring(2))));
            } else if(var9.startsWith("%clamp%")) {
               this.field_110391_a = true;
               var4 = this.func_110371_a(var1.func_105627_a(var9.substring(7)));
            } else if(var9.startsWith("%blur%")) {
               this.field_110389_b = true;
               var4 = this.func_110371_a(var1.func_105627_a(var9.substring(6)));
            } else {
               var4 = this.func_110371_a(var1.func_105627_a(var9));
            }

            this.func_110366_a(var4, (int[])this.field_110387_d.get(var9));
            this.field_110389_b = false;
            this.field_110391_a = false;
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

   }

   private BufferedImage func_110371_a(InputStream var1) {
      BufferedImage var2 = ImageIO.read(var1);
      var1.close();
      return var2;
   }

   public void func_110368_b(int var1) {
      if(var1 >= 0) {
         GL11.glBindTexture(3553, var1);
      }
   }
}
