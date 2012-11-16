import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C_100360_anq extends FilterInputStream {

   private C_100366_ang field_107647_a;
   private C_100350_ano field_107645_b;
   private byte[] field_107646_c;
   private byte[] field_107643_d;
   private int field_107644_e;
   private int field_107641_f;
   private boolean field_107642_g;


   public C_100360_anq(InputStream var1, C_100366_ang var2) {
      super(var1);
      this.field_107647_a = var2;
      this.field_107646_c = new byte[var2.func_107793_b(2048)];
      this.field_107643_d = new byte[2048];
   }

   private int func_107640_a() {
      int var1 = super.available();
      if(var1 <= 0) {
         var1 = 1;
      }

      if(var1 > this.field_107643_d.length) {
         var1 = super.read(this.field_107643_d, 0, this.field_107643_d.length);
      } else {
         var1 = super.read(this.field_107643_d, 0, var1);
      }

      if(var1 < 0) {
         if(this.field_107642_g) {
            return -1;
         }

         try {
            if(this.field_107647_a != null) {
               this.field_107641_f = this.field_107647_a.func_107794_a(this.field_107646_c, 0);
            } else {
               this.field_107641_f = 0;
            }
         } catch (Exception var4) {
            throw new IOException("error processing stream: " + var4.toString());
         }

         this.field_107644_e = 0;
         this.field_107642_g = true;
         if(this.field_107644_e == this.field_107641_f) {
            return -1;
         }
      } else {
         this.field_107644_e = 0;

         try {
            if(this.field_107647_a != null) {
               this.field_107641_f = this.field_107647_a.func_107795_a(this.field_107643_d, 0, var1, this.field_107646_c, 0);
            } else {
               this.field_107645_b.func_107624_a(this.field_107643_d, 0, var1, this.field_107646_c, 0);
               this.field_107641_f = var1;
            }
         } catch (Exception var3) {
            throw new IOException("error processing stream: " + var3.toString());
         }

         if(this.field_107641_f == 0) {
            return this.func_107640_a();
         }
      }

      return this.field_107641_f;
   }

   public int read() {
      return this.field_107644_e == this.field_107641_f && this.func_107640_a() < 0?-1:this.field_107646_c[this.field_107644_e++] & 255;
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if(this.field_107644_e == this.field_107641_f && this.func_107640_a() < 0) {
         return -1;
      } else {
         int var4 = this.field_107641_f - this.field_107644_e;
         if(var3 > var4) {
            System.arraycopy(this.field_107646_c, this.field_107644_e, var1, var2, var4);
            this.field_107644_e = this.field_107641_f;
            return var4;
         } else {
            System.arraycopy(this.field_107646_c, this.field_107644_e, var1, var2, var3);
            this.field_107644_e += var3;
            return var3;
         }
      }
   }

   public long skip(long var1) {
      if(var1 <= 0L) {
         return 0L;
      } else {
         int var3 = this.field_107641_f - this.field_107644_e;
         if(var1 > (long)var3) {
            this.field_107644_e = this.field_107641_f;
            return (long)var3;
         } else {
            this.field_107644_e += (int)var1;
            return (long)((int)var1);
         }
      }
   }

   public int available() {
      return this.field_107641_f - this.field_107644_e;
   }

   public void close() {
      super.close();
   }

   public boolean markSupported() {
      return false;
   }
}
