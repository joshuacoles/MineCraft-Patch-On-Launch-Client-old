import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class C_101301_zk {

   private static final byte[] field_112424_a = new byte[4096];
   private final File field_112422_b;
   private RandomAccessFile field_112423_c;
   private final int[] field_112420_d = new int[1024];
   private final int[] field_112421_e = new int[1024];
   private ArrayList field_112418_f;
   private int field_112419_g;
   private long field_112425_h = 0L;


   public C_101301_zk(File var1) {
      this.field_112422_b = var1;
      this.field_112419_g = 0;

      try {
         if(var1.exists()) {
            this.field_112425_h = var1.lastModified();
         }

         this.field_112423_c = new RandomAccessFile(var1, "rw");
         int var2;
         if(this.field_112423_c.length() < 4096L) {
            for(var2 = 0; var2 < 1024; ++var2) {
               this.field_112423_c.writeInt(0);
            }

            for(var2 = 0; var2 < 1024; ++var2) {
               this.field_112423_c.writeInt(0);
            }

            this.field_112419_g += 8192;
         }

         if((this.field_112423_c.length() & 4095L) != 0L) {
            for(var2 = 0; (long)var2 < (this.field_112423_c.length() & 4095L); ++var2) {
               this.field_112423_c.write(0);
            }
         }

         var2 = (int)this.field_112423_c.length() / 4096;
         this.field_112418_f = new ArrayList(var2);

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field_112418_f.add(Boolean.valueOf(true));
         }

         this.field_112418_f.set(0, Boolean.valueOf(false));
         this.field_112418_f.set(1, Boolean.valueOf(false));
         this.field_112423_c.seek(0L);

         int var4;
         for(var3 = 0; var3 < 1024; ++var3) {
            var4 = this.field_112423_c.readInt();
            this.field_112420_d[var3] = var4;
            if(var4 != 0 && (var4 >> 8) + (var4 & 255) <= this.field_112418_f.size()) {
               for(int var5 = 0; var5 < (var4 & 255); ++var5) {
                  this.field_112418_f.set((var4 >> 8) + var5, Boolean.valueOf(false));
               }
            }
         }

         for(var3 = 0; var3 < 1024; ++var3) {
            var4 = this.field_112423_c.readInt();
            this.field_112421_e[var3] = var4;
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public synchronized DataInputStream func_112408_a(int var1, int var2) {
      if(this.func_112409_d(var1, var2)) {
         return null;
      } else {
         try {
            int var3 = this.func_112411_e(var1, var2);
            if(var3 == 0) {
               return null;
            } else {
               int var4 = var3 >> 8;
               int var5 = var3 & 255;
               if(var4 + var5 > this.field_112418_f.size()) {
                  return null;
               } else {
                  this.field_112423_c.seek((long)(var4 * 4096));
                  int var6 = this.field_112423_c.readInt();
                  if(var6 > 4096 * var5) {
                     return null;
                  } else if(var6 <= 0) {
                     return null;
                  } else {
                     byte var7 = this.field_112423_c.readByte();
                     byte[] var8;
                     if(var7 == 1) {
                        var8 = new byte[var6 - 1];
                        this.field_112423_c.read(var8);
                        return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var8))));
                     } else if(var7 == 2) {
                        var8 = new byte[var6 - 1];
                        this.field_112423_c.read(var8);
                        return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(var8))));
                     } else {
                        return null;
                     }
                  }
               }
            }
         } catch (IOException var9) {
            return null;
         }
      }
   }

   public DataOutputStream func_112414_b(int var1, int var2) {
      return this.func_112409_d(var1, var2)?null:new DataOutputStream(new DeflaterOutputStream(new C_101307_zl(this, var1, var2)));
   }

   protected synchronized void func_112410_a(int var1, int var2, byte[] var3, int var4) {
      try {
         int var5 = this.func_112411_e(var1, var2);
         int var6 = var5 >> 8;
         int var7 = var5 & 255;
         int var8 = (var4 + 5) / 4096 + 1;
         if(var8 >= 256) {
            return;
         }

         if(var6 != 0 && var7 == var8) {
            this.func_112416_a(var6, var3, var4);
         } else {
            int var9;
            for(var9 = 0; var9 < var7; ++var9) {
               this.field_112418_f.set(var6 + var9, Boolean.valueOf(true));
            }

            var9 = this.field_112418_f.indexOf(Boolean.valueOf(true));
            int var10 = 0;
            int var11;
            if(var9 != -1) {
               for(var11 = var9; var11 < this.field_112418_f.size(); ++var11) {
                  if(var10 != 0) {
                     if(((Boolean)this.field_112418_f.get(var11)).booleanValue()) {
                        ++var10;
                     } else {
                        var10 = 0;
                     }
                  } else if(((Boolean)this.field_112418_f.get(var11)).booleanValue()) {
                     var9 = var11;
                     var10 = 1;
                  }

                  if(var10 >= var8) {
                     break;
                  }
               }
            }

            if(var10 >= var8) {
               var6 = var9;
               this.func_112415_a(var1, var2, var9 << 8 | var8);

               for(var11 = 0; var11 < var8; ++var11) {
                  this.field_112418_f.set(var6 + var11, Boolean.valueOf(false));
               }

               this.func_112416_a(var6, var3, var4);
            } else {
               this.field_112423_c.seek(this.field_112423_c.length());
               var6 = this.field_112418_f.size();

               for(var11 = 0; var11 < var8; ++var11) {
                  this.field_112423_c.write(field_112424_a);
                  this.field_112418_f.add(Boolean.valueOf(false));
               }

               this.field_112419_g += 4096 * var8;
               this.func_112416_a(var6, var3, var4);
               this.func_112415_a(var1, var2, var6 << 8 | var8);
            }
         }

         this.func_112417_b(var1, var2, (int)(System.currentTimeMillis() / 1000L));
      } catch (IOException var12) {
         var12.printStackTrace();
      }

   }

   private void func_112416_a(int var1, byte[] var2, int var3) {
      this.field_112423_c.seek((long)(var1 * 4096));
      this.field_112423_c.writeInt(var3 + 1);
      this.field_112423_c.writeByte(2);
      this.field_112423_c.write(var2, 0, var3);
   }

   private boolean func_112409_d(int var1, int var2) {
      return var1 < 0 || var1 >= 32 || var2 < 0 || var2 >= 32;
   }

   private int func_112411_e(int var1, int var2) {
      return this.field_112420_d[var1 + var2 * 32];
   }

   public boolean func_112413_c(int var1, int var2) {
      return this.func_112411_e(var1, var2) != 0;
   }

   private void func_112415_a(int var1, int var2, int var3) {
      this.field_112420_d[var1 + var2 * 32] = var3;
      this.field_112423_c.seek((long)((var1 + var2 * 32) * 4));
      this.field_112423_c.writeInt(var3);
   }

   private void func_112417_b(int var1, int var2, int var3) {
      this.field_112421_e[var1 + var2 * 32] = var3;
      this.field_112423_c.seek((long)(4096 + (var1 + var2 * 32) * 4));
      this.field_112423_c.writeInt(var3);
   }

   public void func_112412_c() {
      if(this.field_112423_c != null) {
         this.field_112423_c.close();
      }

   }

}
