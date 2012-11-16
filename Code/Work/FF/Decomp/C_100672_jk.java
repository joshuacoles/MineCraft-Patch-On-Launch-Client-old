import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class C_100672_jk {

   public static final Charset field_109098_a = Charset.forName("ISO_8859_1");


   public static SecretKey func_109090_a() {
      C_100368_anh var0 = new C_100368_anh();
      var0.func_107806_a(new C_100354_anm(new SecureRandom(), 128));
      return new SecretKeySpec(var0.func_107807_a(), "AES");
   }

   public static KeyPair func_109091_b() {
      try {
         KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
         var0.initialize(1024);
         return var0.generateKeyPair();
      } catch (NoSuchAlgorithmException var1) {
         var1.printStackTrace();
         System.err.println("Key pair generation failed!");
         return null;
      }
   }

   public static byte[] func_109095_a(String var0, PublicKey var1, SecretKey var2) {
      try {
         return func_109093_a("SHA-1", new byte[][]{var0.getBytes("ISO_8859_1"), var2.getEncoded(), var1.getEncoded()});
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static byte[] func_109093_a(String var0, byte[] ... var1) {
      try {
         MessageDigest var2 = MessageDigest.getInstance(var0);
         byte[][] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            byte[] var6 = var3[var5];
            var2.update(var6);
         }

         return var2.digest();
      } catch (NoSuchAlgorithmException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static PublicKey func_109096_a(byte[] var0) {
      try {
         X509EncodedKeySpec var1 = new X509EncodedKeySpec(var0);
         KeyFactory var2 = KeyFactory.getInstance("RSA");
         return var2.generatePublic(var1);
      } catch (NoSuchAlgorithmException var3) {
         var3.printStackTrace();
      } catch (InvalidKeySpecException var4) {
         var4.printStackTrace();
      }

      System.err.println("Public key reconstitute failed!");
      return null;
   }

   public static SecretKey func_109087_a(PrivateKey var0, byte[] var1) {
      return new SecretKeySpec(func_109089_b(var0, var1), "AES");
   }

   public static byte[] func_109094_a(Key var0, byte[] var1) {
      return func_109085_a(1, var0, var1);
   }

   public static byte[] func_109089_b(Key var0, byte[] var1) {
      return func_109085_a(2, var0, var1);
   }

   private static byte[] func_109085_a(int var0, Key var1, byte[] var2) {
      try {
         return func_109086_a(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (IllegalBlockSizeException var4) {
         var4.printStackTrace();
      } catch (BadPaddingException var5) {
         var5.printStackTrace();
      }

      System.err.println("Cipher data failed!");
      return null;
   }

   private static Cipher func_109086_a(int var0, String var1, Key var2) {
      try {
         Cipher var3 = Cipher.getInstance(var1);
         var3.init(var0, var2);
         return var3;
      } catch (InvalidKeyException var4) {
         var4.printStackTrace();
      } catch (NoSuchAlgorithmException var5) {
         var5.printStackTrace();
      } catch (NoSuchPaddingException var6) {
         var6.printStackTrace();
      }

      System.err.println("Cipher creation failed!");
      return null;
   }

   private static C_100366_ang func_109092_a(boolean var0, Key var1) {
      C_100366_ang var2 = new C_100366_ang(new C_100357_ans(new C_100348_anp(), 8));
      var2.func_107798_a(var0, new C_100340_anu(new C_100356_ant(var1.getEncoded()), var1.getEncoded(), 0, 16));
      return var2;
   }

   public static OutputStream func_109097_a(SecretKey var0, OutputStream var1) {
      return new C_100358_anr(var1, func_109092_a(true, var0));
   }

   public static InputStream func_109088_a(SecretKey var0, InputStream var1) {
      return new C_100360_anq(var1, func_109092_a(false, var0));
   }

   static {
      Security.addProvider(new C_100344_anz());
   }
}
