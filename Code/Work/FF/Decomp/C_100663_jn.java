import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class C_100663_jn implements Runnable {

   // $FF: synthetic field
   final C_100683_ka field_109059_a;
   // $FF: synthetic field
   final String field_109057_b;
   // $FF: synthetic field
   final Map field_109058_c;
   // $FF: synthetic field
   final File field_109055_d;
   // $FF: synthetic field
   final C_100665_jo field_109056_e;
   // $FF: synthetic field
   final int field_109054_f;


   C_100663_jn(C_100683_ka var1, String var2, Map var3, File var4, C_100665_jo var5, int var6) {
      this.field_109059_a = var1;
      this.field_109057_b = var2;
      this.field_109058_c = var3;
      this.field_109055_d = var4;
      this.field_109056_e = var5;
      this.field_109054_f = var6;
   }

   public void run() {
      URLConnection var1 = null;
      InputStream var2 = null;
      DataOutputStream var3 = null;
      if(this.field_109059_a != null) {
         this.field_109059_a.func_104293_b("Downloading Texture Pack");
         this.field_109059_a.func_104291_c("Making Request...");
      }

      try {
         try {
            byte[] var4 = new byte[4096];
            URL var5 = new URL(this.field_109057_b);
            var1 = var5.openConnection();
            float var6 = 0.0F;
            float var7 = (float)this.field_109058_c.entrySet().size();
            Iterator var8 = this.field_109058_c.entrySet().iterator();

            while(var8.hasNext()) {
               Entry var9 = (Entry)var8.next();
               var1.setRequestProperty((String)var9.getKey(), (String)var9.getValue());
               if(this.field_109059_a != null) {
                  this.field_109059_a.func_104290_a((int)(++var6 / var7 * 100.0F));
               }
            }

            var2 = var1.getInputStream();
            var7 = (float)var1.getContentLength();
            int var28 = var1.getContentLength();
            if(this.field_109059_a != null) {
               this.field_109059_a.func_104291_c(String.format("Downloading file (%.2f MB)...", new Object[]{Float.valueOf(var7 / 1000.0F / 1000.0F)}));
            }

            if(this.field_109055_d.exists()) {
               long var29 = this.field_109055_d.length();
               if(var29 == (long)var28) {
                  this.field_109056_e.func_105892_a(this.field_109055_d);
                  if(this.field_109059_a != null) {
                     this.field_109059_a.func_104289_a();
                  }

                  return;
               }

               System.out.println("Deleting " + this.field_109055_d + " as it does not match what we currently have (" + var28 + " vs our " + var29 + ").");
               this.field_109055_d.delete();
            }

            var3 = new DataOutputStream(new FileOutputStream(this.field_109055_d));
            if(this.field_109054_f > 0 && var7 > (float)this.field_109054_f) {
               if(this.field_109059_a != null) {
                  this.field_109059_a.func_104289_a();
               }

               throw new IOException("Filesize is bigger than maximum allowed (file is " + var6 + ", limit is " + this.field_109054_f + ")");
            }

            boolean var31 = false;

            int var30;
            while((var30 = var2.read(var4)) >= 0) {
               var6 += (float)var30;
               if(this.field_109059_a != null) {
                  this.field_109059_a.func_104290_a((int)(var6 / var7 * 100.0F));
               }

               if(this.field_109054_f > 0 && var6 > (float)this.field_109054_f) {
                  if(this.field_109059_a != null) {
                     this.field_109059_a.func_104289_a();
                  }

                  throw new IOException("Filesize was bigger than maximum allowed (got >= " + var6 + ", limit was " + this.field_109054_f + ")");
               }

               var3.write(var4, 0, var30);
            }

            this.field_109056_e.func_105892_a(this.field_109055_d);
            if(this.field_109059_a != null) {
               this.field_109059_a.func_104289_a();
               return;
            }
         } catch (Throwable var26) {
            var26.printStackTrace();
         }

      } finally {
         try {
            if(var2 != null) {
               var2.close();
            }
         } catch (IOException var25) {
            ;
         }

         try {
            if(var3 != null) {
               var3.close();
            }
         } catch (IOException var24) {
            ;
         }

      }
   }
}
