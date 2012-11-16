import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class C_100872_azb {

   private static boolean field_110344_b = false;
   private static boolean field_110345_c = false;
   private ByteBuffer field_110342_d;
   private IntBuffer field_110343_e;
   private FloatBuffer field_110340_f;
   private ShortBuffer field_110341_g;
   private int[] field_110353_h;
   private int field_110354_i = 0;
   private double field_110351_j;
   private double field_110352_k;
   private int field_110349_l;
   private int field_110350_m;
   private boolean field_110347_n = false;
   private boolean field_110348_o = false;
   private boolean field_110362_p = false;
   private boolean field_110361_q = false;
   private int field_110360_r = 0;
   private int field_110359_s = 0;
   private boolean field_110358_t = false;
   private int field_110357_u;
   private double field_110356_v;
   private double field_110355_w;
   private double field_110365_x;
   private int field_110364_y;
   public static final C_100872_azb field_110346_a = new C_100872_azb(2097152);
   private boolean field_110363_z = false;
   private boolean field_110337_A = false;
   private IntBuffer field_110338_B;
   private int field_110339_C = 0;
   private int field_110335_D = 10;
   private int field_110336_E;


   private C_100872_azb(int var1) {
      this.field_110336_E = var1;
      this.field_110342_d = C_101209_aqk.func_112001_c(var1 * 4);
      this.field_110343_e = this.field_110342_d.asIntBuffer();
      this.field_110340_f = this.field_110342_d.asFloatBuffer();
      this.field_110341_g = this.field_110342_d.asShortBuffer();
      this.field_110353_h = new int[var1];
      this.field_110337_A = field_110345_c && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
      if(this.field_110337_A) {
         this.field_110338_B = C_101209_aqk.func_112004_f(this.field_110335_D);
         ARBVertexBufferObject.glGenBuffersARB(this.field_110338_B);
      }

   }

   public int func_110329_a() {
      if(!this.field_110363_z) {
         throw new IllegalStateException("Not tesselating!");
      } else {
         this.field_110363_z = false;
         if(this.field_110354_i > 0) {
            this.field_110343_e.clear();
            this.field_110343_e.put(this.field_110353_h, 0, this.field_110360_r);
            this.field_110342_d.position(0);
            this.field_110342_d.limit(this.field_110360_r * 4);
            if(this.field_110337_A) {
               this.field_110339_C = (this.field_110339_C + 1) % this.field_110335_D;
               ARBVertexBufferObject.glBindBufferARB('\u8892', this.field_110338_B.get(this.field_110339_C));
               ARBVertexBufferObject.glBufferDataARB('\u8892', this.field_110342_d, '\u88e0');
            }

            if(this.field_110348_o) {
               if(this.field_110337_A) {
                  GL11.glTexCoordPointer(2, 5126, 32, 12L);
               } else {
                  this.field_110340_f.position(3);
                  GL11.glTexCoordPointer(2, 32, this.field_110340_f);
               }

               GL11.glEnableClientState('\u8078');
            }

            if(this.field_110362_p) {
               C_100082_bdf.func_105619_b(C_100082_bdf.field_105623_b);
               if(this.field_110337_A) {
                  GL11.glTexCoordPointer(2, 5122, 32, 28L);
               } else {
                  this.field_110341_g.position(14);
                  GL11.glTexCoordPointer(2, 32, this.field_110341_g);
               }

               GL11.glEnableClientState('\u8078');
               C_100082_bdf.func_105619_b(C_100082_bdf.field_105625_a);
            }

            if(this.field_110347_n) {
               if(this.field_110337_A) {
                  GL11.glColorPointer(4, 5121, 32, 20L);
               } else {
                  this.field_110342_d.position(20);
                  GL11.glColorPointer(4, true, 32, this.field_110342_d);
               }

               GL11.glEnableClientState('\u8076');
            }

            if(this.field_110361_q) {
               if(this.field_110337_A) {
                  GL11.glNormalPointer(5121, 32, 24L);
               } else {
                  this.field_110342_d.position(24);
                  GL11.glNormalPointer(32, this.field_110342_d);
               }

               GL11.glEnableClientState('\u8075');
            }

            if(this.field_110337_A) {
               GL11.glVertexPointer(3, 5126, 32, 0L);
            } else {
               this.field_110340_f.position(0);
               GL11.glVertexPointer(3, 32, this.field_110340_f);
            }

            GL11.glEnableClientState('\u8074');
            if(this.field_110357_u == 7 && field_110344_b) {
               GL11.glDrawArrays(4, 0, this.field_110354_i);
            } else {
               GL11.glDrawArrays(this.field_110357_u, 0, this.field_110354_i);
            }

            GL11.glDisableClientState('\u8074');
            if(this.field_110348_o) {
               GL11.glDisableClientState('\u8078');
            }

            if(this.field_110362_p) {
               C_100082_bdf.func_105619_b(C_100082_bdf.field_105623_b);
               GL11.glDisableClientState('\u8078');
               C_100082_bdf.func_105619_b(C_100082_bdf.field_105625_a);
            }

            if(this.field_110347_n) {
               GL11.glDisableClientState('\u8076');
            }

            if(this.field_110361_q) {
               GL11.glDisableClientState('\u8075');
            }
         }

         int var1 = this.field_110360_r * 4;
         this.func_110327_d();
         return var1;
      }
   }

   private void func_110327_d() {
      this.field_110354_i = 0;
      this.field_110342_d.clear();
      this.field_110360_r = 0;
      this.field_110359_s = 0;
   }

   public void func_110330_b() {
      this.func_110319_b(7);
   }

   public void func_110319_b(int var1) {
      if(this.field_110363_z) {
         throw new IllegalStateException("Already tesselating!");
      } else {
         this.field_110363_z = true;
         this.func_110327_d();
         this.field_110357_u = var1;
         this.field_110361_q = false;
         this.field_110347_n = false;
         this.field_110348_o = false;
         this.field_110362_p = false;
         this.field_110358_t = false;
      }
   }

   public void func_110333_a(double var1, double var3) {
      this.field_110348_o = true;
      this.field_110351_j = var1;
      this.field_110352_k = var3;
   }

   public void func_110328_c(int var1) {
      this.field_110362_p = true;
      this.field_110349_l = var1;
   }

   public void func_110334_a(float var1, float var2, float var3) {
      this.func_110324_a((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F));
   }

   public void func_110317_a(float var1, float var2, float var3, float var4) {
      this.func_110318_a((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public void func_110324_a(int var1, int var2, int var3) {
      this.func_110318_a(var1, var2, var3, 255);
   }

   public void func_110318_a(int var1, int var2, int var3, int var4) {
      if(!this.field_110358_t) {
         if(var1 > 255) {
            var1 = 255;
         }

         if(var2 > 255) {
            var2 = 255;
         }

         if(var3 > 255) {
            var3 = 255;
         }

         if(var4 > 255) {
            var4 = 255;
         }

         if(var1 < 0) {
            var1 = 0;
         }

         if(var2 < 0) {
            var2 = 0;
         }

         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         this.field_110347_n = true;
         if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.field_110350_m = var4 << 24 | var3 << 16 | var2 << 8 | var1;
         } else {
            this.field_110350_m = var1 << 24 | var2 << 16 | var3 << 8 | var4;
         }

      }
   }

   public void func_110322_a(double var1, double var3, double var5, double var7, double var9) {
      this.func_110333_a(var7, var9);
      this.func_110325_a(var1, var3, var5);
   }

   public void func_110325_a(double var1, double var3, double var5) {
      ++this.field_110359_s;
      if(this.field_110357_u == 7 && field_110344_b && this.field_110359_s % 4 == 0) {
         for(int var7 = 0; var7 < 2; ++var7) {
            int var8 = 8 * (3 - var7);
            if(this.field_110348_o) {
               this.field_110353_h[this.field_110360_r + 3] = this.field_110353_h[this.field_110360_r - var8 + 3];
               this.field_110353_h[this.field_110360_r + 4] = this.field_110353_h[this.field_110360_r - var8 + 4];
            }

            if(this.field_110362_p) {
               this.field_110353_h[this.field_110360_r + 7] = this.field_110353_h[this.field_110360_r - var8 + 7];
            }

            if(this.field_110347_n) {
               this.field_110353_h[this.field_110360_r + 5] = this.field_110353_h[this.field_110360_r - var8 + 5];
            }

            this.field_110353_h[this.field_110360_r + 0] = this.field_110353_h[this.field_110360_r - var8 + 0];
            this.field_110353_h[this.field_110360_r + 1] = this.field_110353_h[this.field_110360_r - var8 + 1];
            this.field_110353_h[this.field_110360_r + 2] = this.field_110353_h[this.field_110360_r - var8 + 2];
            ++this.field_110354_i;
            this.field_110360_r += 8;
         }
      }

      if(this.field_110348_o) {
         this.field_110353_h[this.field_110360_r + 3] = Float.floatToRawIntBits((float)this.field_110351_j);
         this.field_110353_h[this.field_110360_r + 4] = Float.floatToRawIntBits((float)this.field_110352_k);
      }

      if(this.field_110362_p) {
         this.field_110353_h[this.field_110360_r + 7] = this.field_110349_l;
      }

      if(this.field_110347_n) {
         this.field_110353_h[this.field_110360_r + 5] = this.field_110350_m;
      }

      if(this.field_110361_q) {
         this.field_110353_h[this.field_110360_r + 6] = this.field_110364_y;
      }

      this.field_110353_h[this.field_110360_r + 0] = Float.floatToRawIntBits((float)(var1 + this.field_110356_v));
      this.field_110353_h[this.field_110360_r + 1] = Float.floatToRawIntBits((float)(var3 + this.field_110355_w));
      this.field_110353_h[this.field_110360_r + 2] = Float.floatToRawIntBits((float)(var5 + this.field_110365_x));
      this.field_110360_r += 8;
      ++this.field_110354_i;
      if(this.field_110354_i % 4 == 0 && this.field_110360_r >= this.field_110336_E - 32) {
         this.func_110329_a();
         this.field_110363_z = true;
      }

   }

   public void func_110326_d(int var1) {
      int var2 = var1 >> 16 & 255;
      int var3 = var1 >> 8 & 255;
      int var4 = var1 & 255;
      this.func_110324_a(var2, var3, var4);
   }

   public void func_110332_a(int var1, int var2) {
      int var3 = var1 >> 16 & 255;
      int var4 = var1 >> 8 & 255;
      int var5 = var1 & 255;
      this.func_110318_a(var3, var4, var5, var2);
   }

   public void func_110331_c() {
      this.field_110358_t = true;
   }

   public void func_110323_b(float var1, float var2, float var3) {
      this.field_110361_q = true;
      byte var4 = (byte)((int)(var1 * 127.0F));
      byte var5 = (byte)((int)(var2 * 127.0F));
      byte var6 = (byte)((int)(var3 * 127.0F));
      this.field_110364_y = var4 & 255 | (var5 & 255) << 8 | (var6 & 255) << 16;
   }

   public void func_110321_b(double var1, double var3, double var5) {
      this.field_110356_v = var1;
      this.field_110355_w = var3;
      this.field_110365_x = var5;
   }

   public void func_110320_c(float var1, float var2, float var3) {
      this.field_110356_v += (double)var1;
      this.field_110355_w += (double)var2;
      this.field_110365_x += (double)var3;
   }

}
