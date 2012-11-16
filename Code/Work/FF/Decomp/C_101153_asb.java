import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.text.Bidi;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class C_101153_asb {

   private int[] field_111809_d = new int[256];
   public int field_111813_a = 0;
   public int field_111811_b = 9;
   public Random field_111812_c = new Random();
   private byte[] field_111810_e = new byte[65536];
   private final int[] field_111807_f = new int[256];
   private int[] field_111808_g = new int[32];
   private int field_111820_h;
   private final C_100874_azc field_111821_i;
   private float field_111818_j;
   private float field_111819_k;
   private boolean field_111816_l;
   private boolean field_111817_m;
   private float field_111814_n;
   private float field_111815_o;
   private float field_111829_p;
   private float field_111828_q;
   private int field_111827_r;
   private boolean field_111826_s = false;
   private boolean field_111825_t = false;
   private boolean field_111824_u = false;
   private boolean field_111823_v = false;
   private boolean field_111822_w = false;


   C_101153_asb() {
      this.field_111821_i = null;
   }

   public C_101153_asb(C_101125_ard var1, String var2, C_100874_azc var3, boolean var4) {
      this.field_111821_i = var3;
      this.field_111816_l = var4;

      BufferedImage var5;
      try {
         var5 = ImageIO.read(C_100874_azc.class.getResourceAsStream(var2));
         InputStream var6 = C_100874_azc.class.getResourceAsStream("/font/glyph_sizes.bin");
         var6.read(this.field_111810_e);
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      int var19 = var5.getWidth();
      int var7 = var5.getHeight();
      int[] var8 = new int[var19 * var7];
      var5.getRGB(0, 0, var19, var7, var8, 0, var19);
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      int var13;
      int var15;
      int var16;
      while(var9 < 256) {
         var10 = var9 % 16;
         var11 = var9 / 16;
         var12 = 7;

         while(true) {
            if(var12 >= 0) {
               var13 = var10 * 8 + var12;
               boolean var14 = true;

               for(var15 = 0; var15 < 8 && var14; ++var15) {
                  var16 = (var11 * 8 + var15) * var19;
                  int var17 = var8[var13 + var16] & 255;
                  if(var17 > 0) {
                     var14 = false;
                  }
               }

               if(var14) {
                  --var12;
                  continue;
               }
            }

            if(var9 == 32) {
               var12 = 2;
            }

            this.field_111809_d[var9] = var12 + 2;
            ++var9;
            break;
         }
      }

      this.field_111813_a = var3.func_110383_a(var5);

      for(var9 = 0; var9 < 32; ++var9) {
         var10 = (var9 >> 3 & 1) * 85;
         var11 = (var9 >> 2 & 1) * 170 + var10;
         var12 = (var9 >> 1 & 1) * 170 + var10;
         var13 = (var9 >> 0 & 1) * 170 + var10;
         if(var9 == 6) {
            var11 += 85;
         }

         if(var1.field_111716_g) {
            int var20 = (var11 * 30 + var12 * 59 + var13 * 11) / 100;
            var15 = (var11 * 30 + var12 * 70) / 100;
            var16 = (var11 * 30 + var13 * 70) / 100;
            var11 = var20;
            var12 = var15;
            var13 = var16;
         }

         if(var9 >= 16) {
            var11 /= 4;
            var12 /= 4;
            var13 /= 4;
         }

         this.field_111808_g[var9] = (var11 & 255) << 16 | (var12 & 255) << 8 | var13 & 255;
      }

   }

   private float func_111800_a(int var1, char var2, boolean var3) {
      return var2 == 32?4.0F:(var1 > 0 && !this.field_111816_l?this.func_111787_a(var1 + 32, var3):this.func_111799_a(var2, var3));
   }

   private float func_111787_a(int var1, boolean var2) {
      float var3 = (float)(var1 % 16 * 8);
      float var4 = (float)(var1 / 16 * 8);
      float var5 = var2?1.0F:0.0F;
      if(this.field_111820_h != this.field_111813_a) {
         GL11.glBindTexture(3553, this.field_111813_a);
         this.field_111820_h = this.field_111813_a;
      }

      float var6 = (float)this.field_111809_d[var1] - 0.01F;
      GL11.glBegin(5);
      GL11.glTexCoord2f(var3 / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.field_111818_j + var5, this.field_111819_k, 0.0F);
      GL11.glTexCoord2f(var3 / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.field_111818_j - var5, this.field_111819_k + 7.99F, 0.0F);
      GL11.glTexCoord2f((var3 + var6) / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.field_111818_j + var6 + var5, this.field_111819_k, 0.0F);
      GL11.glTexCoord2f((var3 + var6) / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.field_111818_j + var6 - var5, this.field_111819_k + 7.99F, 0.0F);
      GL11.glEnd();
      return (float)this.field_111809_d[var1];
   }

   private void func_111779_a(int var1) {
      String var3 = String.format("/font/glyph_%02X.png", new Object[]{Integer.valueOf(var1)});

      BufferedImage var2;
      try {
         var2 = ImageIO.read(C_100874_azc.class.getResourceAsStream(var3));
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.field_111807_f[var1] = this.field_111821_i.func_110383_a(var2);
      this.field_111820_h = this.field_111807_f[var1];
   }

   private float func_111799_a(char var1, boolean var2) {
      if(this.field_111810_e[var1] == 0) {
         return 0.0F;
      } else {
         int var3 = var1 / 256;
         if(this.field_111807_f[var3] == 0) {
            this.func_111779_a(var3);
         }

         if(this.field_111820_h != this.field_111807_f[var3]) {
            GL11.glBindTexture(3553, this.field_111807_f[var3]);
            this.field_111820_h = this.field_111807_f[var3];
         }

         int var4 = this.field_111810_e[var1] >>> 4;
         int var5 = this.field_111810_e[var1] & 15;
         float var6 = (float)var4;
         float var7 = (float)(var5 + 1);
         float var8 = (float)(var1 % 16 * 16) + var6;
         float var9 = (float)((var1 & 255) / 16 * 16);
         float var10 = var7 - var6 - 0.02F;
         float var11 = var2?1.0F:0.0F;
         GL11.glBegin(5);
         GL11.glTexCoord2f(var8 / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.field_111818_j + var11, this.field_111819_k, 0.0F);
         GL11.glTexCoord2f(var8 / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.field_111818_j - var11, this.field_111819_k + 7.99F, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.field_111818_j + var10 / 2.0F + var11, this.field_111819_k, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.field_111818_j + var10 / 2.0F - var11, this.field_111819_k + 7.99F, 0.0F);
         GL11.glEnd();
         return (var7 - var6) / 2.0F + 1.0F;
      }
   }

   public int func_111783_a(String var1, int var2, int var3, int var4) {
      this.func_111804_c();
      if(this.field_111817_m) {
         var1 = this.func_111806_c(var1);
      }

      int var5 = this.func_111780_a(var1, var2 + 1, var3 + 1, var4, true);
      var5 = Math.max(var5, this.func_111780_a(var1, var2, var3, var4, false));
      return var5;
   }

   public void func_111798_b(String var1, int var2, int var3, int var4) {
      this.func_111804_c();
      if(this.field_111817_m) {
         var1 = this.func_111806_c(var1);
      }

      this.func_111780_a(var1, var2, var3, var4, false);
   }

   private String func_111806_c(String var1) {
      if(var1 != null && Bidi.requiresBidi(var1.toCharArray(), 0, var1.length())) {
         Bidi var2 = new Bidi(var1, -2);
         byte[] var3 = new byte[var2.getRunCount()];
         String[] var4 = new String[var3.length];

         int var7;
         for(int var5 = 0; var5 < var3.length; ++var5) {
            int var6 = var2.getRunStart(var5);
            var7 = var2.getRunLimit(var5);
            int var8 = var2.getRunLevel(var5);
            String var9 = var1.substring(var6, var7);
            var3[var5] = (byte)var8;
            var4[var5] = var9;
         }

         String[] var11 = (String[])var4.clone();
         Bidi.reorderVisually(var3, 0, var4, 0, var3.length);
         StringBuilder var12 = new StringBuilder();
         var7 = 0;

         while(var7 < var4.length) {
            byte var13 = var3[var7];
            int var14 = 0;

            while(true) {
               if(var14 < var11.length) {
                  if(!var11[var14].equals(var4[var7])) {
                     ++var14;
                     continue;
                  }

                  var13 = var3[var14];
               }

               if((var13 & 1) == 0) {
                  var12.append(var4[var7]);
               } else {
                  for(var14 = var4[var7].length() - 1; var14 >= 0; --var14) {
                     char var10 = var4[var7].charAt(var14);
                     if(var10 == 40) {
                        var10 = 41;
                     } else if(var10 == 41) {
                        var10 = 40;
                     }

                     var12.append(var10);
                  }
               }

               ++var7;
               break;
            }
         }

         return var12.toString();
      } else {
         return var1;
      }
   }

   private void func_111804_c() {
      this.field_111826_s = false;
      this.field_111825_t = false;
      this.field_111824_u = false;
      this.field_111823_v = false;
      this.field_111822_w = false;
   }

   private void func_111777_a(String var1, boolean var2) {
      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         int var5;
         int var6;
         if(var4 == 167 && var3 + 1 < var1.length()) {
            var5 = "0123456789abcdefklmnor".indexOf(var1.toLowerCase().charAt(var3 + 1));
            if(var5 < 16) {
               this.field_111826_s = false;
               this.field_111825_t = false;
               this.field_111822_w = false;
               this.field_111823_v = false;
               this.field_111824_u = false;
               if(var5 < 0 || var5 > 15) {
                  var5 = 15;
               }

               if(var2) {
                  var5 += 16;
               }

               var6 = this.field_111808_g[var5];
               this.field_111827_r = var6;
               GL11.glColor4f((float)(var6 >> 16) / 255.0F, (float)(var6 >> 8 & 255) / 255.0F, (float)(var6 & 255) / 255.0F, this.field_111828_q);
            } else if(var5 == 16) {
               this.field_111826_s = true;
            } else if(var5 == 17) {
               this.field_111825_t = true;
            } else if(var5 == 18) {
               this.field_111822_w = true;
            } else if(var5 == 19) {
               this.field_111823_v = true;
            } else if(var5 == 20) {
               this.field_111824_u = true;
            } else if(var5 == 21) {
               this.field_111826_s = false;
               this.field_111825_t = false;
               this.field_111822_w = false;
               this.field_111823_v = false;
               this.field_111824_u = false;
               GL11.glColor4f(this.field_111814_n, this.field_111815_o, this.field_111829_p, this.field_111828_q);
            }

            ++var3;
         } else {
            var5 = C_100011_m.field_105261_a.indexOf(var4);
            if(this.field_111826_s && var5 > 0) {
               do {
                  var6 = this.field_111812_c.nextInt(C_100011_m.field_105261_a.length());
               } while(this.field_111809_d[var5 + 32] != this.field_111809_d[var6 + 32]);

               var5 = var6;
            }

            float var9 = this.func_111800_a(var5, var4, this.field_111824_u);
            if(this.field_111825_t) {
               ++this.field_111818_j;
               this.func_111800_a(var5, var4, this.field_111824_u);
               --this.field_111818_j;
               ++var9;
            }

            C_100872_azb var7;
            if(this.field_111822_w) {
               var7 = C_100872_azb.field_110346_a;
               GL11.glDisable(3553);
               var7.func_110330_b();
               var7.func_110325_a((double)this.field_111818_j, (double)(this.field_111819_k + (float)(this.field_111811_b / 2)), 0.0D);
               var7.func_110325_a((double)(this.field_111818_j + var9), (double)(this.field_111819_k + (float)(this.field_111811_b / 2)), 0.0D);
               var7.func_110325_a((double)(this.field_111818_j + var9), (double)(this.field_111819_k + (float)(this.field_111811_b / 2) - 1.0F), 0.0D);
               var7.func_110325_a((double)this.field_111818_j, (double)(this.field_111819_k + (float)(this.field_111811_b / 2) - 1.0F), 0.0D);
               var7.func_110329_a();
               GL11.glEnable(3553);
            }

            if(this.field_111823_v) {
               var7 = C_100872_azb.field_110346_a;
               GL11.glDisable(3553);
               var7.func_110330_b();
               int var8 = this.field_111823_v?-1:0;
               var7.func_110325_a((double)(this.field_111818_j + (float)var8), (double)(this.field_111819_k + (float)this.field_111811_b), 0.0D);
               var7.func_110325_a((double)(this.field_111818_j + var9), (double)(this.field_111819_k + (float)this.field_111811_b), 0.0D);
               var7.func_110325_a((double)(this.field_111818_j + var9), (double)(this.field_111819_k + (float)this.field_111811_b - 1.0F), 0.0D);
               var7.func_110325_a((double)(this.field_111818_j + (float)var8), (double)(this.field_111819_k + (float)this.field_111811_b - 1.0F), 0.0D);
               var7.func_110329_a();
               GL11.glEnable(3553);
            }

            this.field_111818_j += (float)((int)var9);
         }
      }

   }

   private int func_111796_b(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.field_111817_m) {
         var1 = this.func_111806_c(var1);
         int var7 = this.func_111778_a(var1);
         var2 = var2 + var4 - var7;
      }

      return this.func_111780_a(var1, var2, var3, var5, var6);
   }

   private int func_111780_a(String var1, int var2, int var3, int var4, boolean var5) {
      if(var1 != null) {
         this.field_111820_h = 0;
         if((var4 & -67108864) == 0) {
            var4 |= -16777216;
         }

         if(var5) {
            var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
         }

         this.field_111814_n = (float)(var4 >> 16 & 255) / 255.0F;
         this.field_111815_o = (float)(var4 >> 8 & 255) / 255.0F;
         this.field_111829_p = (float)(var4 & 255) / 255.0F;
         this.field_111828_q = (float)(var4 >> 24 & 255) / 255.0F;
         GL11.glColor4f(this.field_111814_n, this.field_111815_o, this.field_111829_p, this.field_111828_q);
         this.field_111818_j = (float)var2;
         this.field_111819_k = (float)var3;
         this.func_111777_a(var1, var5);
         return (int)this.field_111818_j;
      } else {
         return 0;
      }
   }

   public int func_111778_a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         boolean var3 = false;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            int var6 = this.func_111785_a(var5);
            if(var6 < 0 && var4 < var1.length() - 1) {
               ++var4;
               var5 = var1.charAt(var4);
               if(var5 != 108 && var5 != 76) {
                  if(var5 == 114 || var5 == 82) {
                     var3 = false;
                  }
               } else {
                  var3 = true;
               }

               var6 = 0;
            }

            var2 += var6;
            if(var3) {
               ++var2;
            }
         }

         return var2;
      }
   }

   public int func_111785_a(char var1) {
      if(var1 == 167) {
         return -1;
      } else if(var1 == 32) {
         return 4;
      } else {
         int var2 = C_100011_m.field_105261_a.indexOf(var1);
         if(var2 >= 0 && !this.field_111816_l) {
            return this.field_111809_d[var2 + 32];
         } else if(this.field_111810_e[var1] != 0) {
            int var3 = this.field_111810_e[var1] >>> 4;
            int var4 = this.field_111810_e[var1] & 15;
            if(var4 > 7) {
               var4 = 15;
               var3 = 0;
            }

            ++var4;
            return (var4 - var3) / 2 + 1;
         } else {
            return 0;
         }
      }
   }

   public String func_111791_a(String var1, int var2) {
      return this.func_111784_a(var1, var2, false);
   }

   public String func_111784_a(String var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;
      int var6 = var3?var1.length() - 1:0;
      int var7 = var3?-1:1;
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var6; var10 >= 0 && var10 < var1.length() && var5 < var2; var10 += var7) {
         char var11 = var1.charAt(var10);
         int var12 = this.func_111785_a(var11);
         if(var8) {
            var8 = false;
            if(var11 != 108 && var11 != 76) {
               if(var11 == 114 || var11 == 82) {
                  var9 = false;
               }
            } else {
               var9 = true;
            }
         } else if(var12 < 0) {
            var8 = true;
         } else {
            var5 += var12;
            if(var9) {
               ++var5;
            }
         }

         if(var5 > var2) {
            break;
         }

         if(var3) {
            var4.insert(0, var11);
         } else {
            var4.append(var11);
         }
      }

      return var4.toString();
   }

   private String func_111795_d(String var1) {
      while(var1 != null && var1.endsWith("\n")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      return var1;
   }

   public void func_111801_b(String var1, int var2, int var3, int var4, int var5) {
      this.func_111804_c();
      this.field_111827_r = var5;
      var1 = this.func_111795_d(var1);
      this.func_111803_c(var1, var2, var3, var4, var5);
   }

   private void func_111803_c(String var1, int var2, int var3, int var4, int var5) {
      this.field_111827_r = var5;
      this.func_111790_b(var1, var2, var3, var4, false);
   }

   private void func_111790_b(String var1, int var2, int var3, int var4, boolean var5) {
      String[] var6 = var1.split("\n");
      if(var6.length > 1) {
         boolean var12 = false;
         String[] var13 = var6;
         int var14 = var6.length;

         for(int var15 = 0; var15 < var14; ++var15) {
            String var16 = var13[var15];
            if(var12) {
               var16 = "§" + var16;
               var12 = false;
            }

            if(var16.endsWith("§")) {
               var12 = true;
               var16 = var16.substring(0, var16.length() - 1);
            }

            this.func_111790_b(var16, var2, var3, var4, var5);
            var3 += this.func_111789_b(var16, var4);
         }

      } else {
         String[] var7 = var1.split(" ");
         int var8 = 0;

         String var9;
         for(var9 = ""; var8 < var7.length; ++var8) {
            String var10 = var7[var8];
            if(this.func_111778_a(var10) >= var4) {
               if(var9.length() > 0) {
                  this.func_111796_b(var9, var2, var3, var4, this.field_111827_r, var5);
                  var3 += this.field_111811_b;
               }

               do {
                  int var11;
                  for(var11 = 1; this.func_111778_a(var10.substring(0, var11)) < var4; ++var11) {
                     ;
                  }

                  this.func_111796_b(var10.substring(0, var11 - 1), var2, var3, var4, this.field_111827_r, var5);
                  var3 += this.field_111811_b;
                  var10 = var10.substring(var11 - 1);
               } while(this.func_111778_a(var10) >= var4);

               var9 = var10;
            } else if(this.func_111778_a(var9 + " " + var10) >= var4) {
               this.func_111796_b(var9, var2, var3, var4, this.field_111827_r, var5);
               var3 += this.field_111811_b;
               var9 = var10;
            } else {
               if(var9.length() > 0) {
                  var9 = var9 + " ";
               }

               var9 = var9 + var10;
            }
         }

         this.func_111796_b(var9, var2, var3, var4, this.field_111827_r, var5);
      }
   }

   public int func_111789_b(String var1, int var2) {
      String[] var3 = var1.split("\n");
      int var6;
      String var8;
      if(var3.length > 1) {
         int var10 = 0;
         String[] var11 = var3;
         var6 = var3.length;

         for(int var12 = 0; var12 < var6; ++var12) {
            var8 = var11[var12];
            var10 += this.func_111789_b(var8, var2);
         }

         return var10;
      } else {
         String[] var4 = var1.split(" ");
         int var5 = 0;
         var6 = 0;

         String var7;
         for(var7 = ""; var6 < var4.length; ++var6) {
            var8 = var4[var6];
            if(this.func_111778_a(var8) >= var2) {
               if(var7.length() > 0) {
                  var5 += this.field_111811_b;
               }

               do {
                  int var9;
                  for(var9 = 1; this.func_111778_a(var8.substring(0, var9)) < var2; ++var9) {
                     ;
                  }

                  var5 += this.field_111811_b;
                  var8 = var8.substring(var9 - 1);
               } while(this.func_111778_a(var8) >= var2);

               var7 = var8;
            } else if(this.func_111778_a(var7 + " " + var8) >= var2) {
               var5 += this.field_111811_b;
               var7 = var8;
            } else {
               if(var7.length() > 0) {
                  var7 = var7 + " ";
               }

               var7 = var7 + var8;
            }
         }

         if(var7.length() > 0) {
            var5 += this.field_111811_b;
         }

         return var5;
      }
   }

   public void func_111786_a(boolean var1) {
      this.field_111816_l = var1;
   }

   public boolean func_111782_a() {
      return this.field_111816_l;
   }

   public void func_111797_b(boolean var1) {
      this.field_111817_m = var1;
   }

   public List func_111793_c(String var1, int var2) {
      return Arrays.asList(this.func_111802_d(var1, var2).split("\n"));
   }

   String func_111802_d(String var1, int var2) {
      int var3 = this.func_111781_e(var1, var2);
      if(var1.length() <= var3) {
         return var1;
      } else {
         String var4 = var1.substring(0, var3);
         String var5 = func_111805_e(var4) + var1.substring(var3 + (var1.charAt(var3) == 32?1:0));
         return var4 + "\n" + this.func_111802_d(var5, var2);
      }
   }

   private int func_111781_e(String var1, int var2) {
      int var3 = var1.length();
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for(boolean var7 = false; var5 < var3; ++var5) {
         char var8 = var1.charAt(var5);
         switch(var8) {
         case 32:
            var6 = var5;
         case 167:
            if(var5 < var3 - 1) {
               ++var5;
               char var9 = var1.charAt(var5);
               if(var9 != 108 && var9 != 76) {
                  if(var9 == 114 || var9 == 82) {
                     var7 = false;
                  }
               } else {
                  var7 = true;
               }
            }
            break;
         default:
            var4 += this.func_111785_a(var8);
            if(var7) {
               ++var4;
            }
         }

         if(var8 == 10) {
            ++var5;
            var6 = var5;
            break;
         }

         if(var4 > var2) {
            break;
         }
      }

      return var5 != var3 && var6 != -1 && var6 < var5?var6:var5;
   }

   private static boolean func_111794_b(char var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 97 && var0 <= 102 || var0 >= 65 && var0 <= 70;
   }

   private static boolean func_111792_c(char var0) {
      return var0 >= 107 && var0 <= 111 || var0 >= 75 && var0 <= 79 || var0 == 114 || var0 == 82;
   }

   private static String func_111805_e(String var0) {
      String var1 = "";
      int var2 = -1;
      int var3 = var0.length();

      while((var2 = var0.indexOf(167, var2 + 1)) != -1) {
         if(var2 < var3 - 1) {
            char var4 = var0.charAt(var2 + 1);
            if(func_111794_b(var4)) {
               var1 = "§" + var4;
            } else if(func_111792_c(var4)) {
               var1 = var1 + "§" + var4;
            }
         }
      }

      return var1;
   }

   public boolean func_111788_b() {
      return this.field_111817_m;
   }
}
