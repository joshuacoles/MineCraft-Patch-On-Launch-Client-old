import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class C_100329_br {

   public static C_100353_bh func_107545_a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      C_100353_bh var2;
      try {
         var2 = func_107546_a(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void func_107551_a(C_100353_bh var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         func_107543_a(var0, var2);
      } finally {
         var2.close();
      }

   }

   public static C_100353_bh func_107550_a(byte[] var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var0))));

      C_100353_bh var2;
      try {
         var2 = func_107546_a(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] func_107548_a(C_100353_bh var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         func_107543_a(var0, var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static void func_107549_a(C_100353_bh var0, File var1) {
      File var2 = new File(var1.getAbsolutePath() + "_tmp");
      if(var2.exists()) {
         var2.delete();
      }

      func_107544_b(var0, var2);
      if(var1.exists()) {
         var1.delete();
      }

      if(var1.exists()) {
         throw new IOException("Failed to delete " + var1);
      } else {
         var2.renameTo(var1);
      }
   }

   public static void func_107544_b(C_100353_bh var0, File var1) {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         func_107543_a(var0, var2);
      } finally {
         var2.close();
      }

   }

   public static C_100353_bh func_107547_a(File var0) {
      if(!var0.exists()) {
         return null;
      } else {
         DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

         C_100353_bh var2;
         try {
            var2 = func_107546_a(var1);
         } finally {
            var1.close();
         }

         return var2;
      }
   }

   public static C_100353_bh func_107546_a(DataInput var0) {
      C_100331_bu var1 = C_100331_bu.func_107486_b(var0);
      if(var1 instanceof C_100353_bh) {
         return (C_100353_bh)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void func_107543_a(C_100353_bh var0, DataOutput var1) {
      C_100331_bu.func_107491_a(var0, var1);
   }
}
