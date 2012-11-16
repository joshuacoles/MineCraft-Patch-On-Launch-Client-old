import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;

public class C_100079_bdb {

   private volatile boolean field_105609_a = false;
   private volatile Map field_105607_b = null;
   private volatile Map field_105608_c = null;
   private C_100100_bda field_105605_d;
   private File field_105606_e;
   private File field_105603_f;
   private File field_105604_g;
   private File field_105614_h;
   private File field_105615_i;
   private File field_105612_j;
   private C_101134_ark field_105613_k;
   private int field_105610_l = 0;
   private int field_105611_m = 0;


   public C_100079_bdb(C_101134_ark var1, C_100100_bda var2, File var3) {
      this.field_105606_e = new File(var3, "stats_" + var1.field_111761_b.toLowerCase() + "_unsent.dat");
      this.field_105603_f = new File(var3, "stats_" + var1.field_111761_b.toLowerCase() + ".dat");
      this.field_105615_i = new File(var3, "stats_" + var1.field_111761_b.toLowerCase() + "_unsent.old");
      this.field_105612_j = new File(var3, "stats_" + var1.field_111761_b.toLowerCase() + ".old");
      this.field_105604_g = new File(var3, "stats_" + var1.field_111761_b.toLowerCase() + "_unsent.tmp");
      this.field_105614_h = new File(var3, "stats_" + var1.field_111761_b.toLowerCase() + ".tmp");
      if(!var1.field_111761_b.toLowerCase().equals(var1.field_111761_b)) {
         this.func_105586_a(var3, "stats_" + var1.field_111761_b + "_unsent.dat", this.field_105606_e);
         this.func_105586_a(var3, "stats_" + var1.field_111761_b + ".dat", this.field_105603_f);
         this.func_105586_a(var3, "stats_" + var1.field_111761_b + "_unsent.old", this.field_105615_i);
         this.func_105586_a(var3, "stats_" + var1.field_111761_b + ".old", this.field_105612_j);
         this.func_105586_a(var3, "stats_" + var1.field_111761_b + "_unsent.tmp", this.field_105604_g);
         this.func_105586_a(var3, "stats_" + var1.field_111761_b + ".tmp", this.field_105614_h);
      }

      this.field_105605_d = var2;
      this.field_105613_k = var1;
      if(this.field_105606_e.exists()) {
         var2.func_105805_a(this.func_105592_a(this.field_105606_e, this.field_105604_g, this.field_105615_i));
      }

      this.func_105598_b();
   }

   private void func_105586_a(File var1, String var2, File var3) {
      File var4 = new File(var1, var2);
      if(var4.exists() && !var4.isDirectory() && !var3.exists()) {
         var4.renameTo(var3);
      }

   }

   private Map func_105592_a(File var1, File var2, File var3) {
      return var1.exists()?this.func_105589_a(var1):(var3.exists()?this.func_105589_a(var3):(var2.exists()?this.func_105589_a(var2):null));
   }

   private Map func_105589_a(File var1) {
      BufferedReader var2 = null;

      try {
         var2 = new BufferedReader(new FileReader(var1));
         String var3 = "";
         StringBuilder var4 = new StringBuilder();

         while((var3 = var2.readLine()) != null) {
            var4.append(var3);
         }

         Map var5 = C_100100_bda.func_105812_b(var4.toString());
         return var5;
      } catch (Exception var15) {
         var15.printStackTrace();
      } finally {
         if(var2 != null) {
            try {
               var2.close();
            } catch (Exception var14) {
               var14.printStackTrace();
            }
         }

      }

      return null;
   }

   private void func_105596_a(Map var1, File var2, File var3, File var4) {
      PrintWriter var5 = new PrintWriter(new FileWriter(var3, false));

      try {
         var5.print(C_100100_bda.func_105800_a(this.field_105613_k.field_111761_b, "local", var1));
      } finally {
         var5.close();
      }

      if(var4.exists()) {
         var4.delete();
      }

      if(var2.exists()) {
         var2.renameTo(var4);
      }

      var3.renameTo(var2);
   }

   public void func_105598_b() {
      if(this.field_105609_a) {
         throw new IllegalStateException("Can\'t get stats from server while StatsSyncher is busy!");
      } else {
         this.field_105610_l = 100;
         this.field_105609_a = true;
         (new C_100080_bdc(this)).start();
      }
   }

   public void func_105593_a(Map var1) {
      if(this.field_105609_a) {
         throw new IllegalStateException("Can\'t save stats while StatsSyncher is busy!");
      } else {
         this.field_105610_l = 100;
         this.field_105609_a = true;
         (new C_100081_bdd(this, var1)).start();
      }
   }

   public void func_105594_c(Map var1) {
      int var2 = 30;

      while(this.field_105609_a) {
         --var2;
         if(var2 <= 0) {
            break;
         }

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var10) {
            var10.printStackTrace();
         }
      }

      this.field_105609_a = true;

      try {
         this.func_105596_a(var1, this.field_105606_e, this.field_105604_g, this.field_105615_i);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         this.field_105609_a = false;
      }

   }

   public boolean func_105602_c() {
      return this.field_105610_l <= 0 && !this.field_105609_a && this.field_105608_c == null;
   }

   public void func_105597_e() {
      if(this.field_105610_l > 0) {
         --this.field_105610_l;
      }

      if(this.field_105611_m > 0) {
         --this.field_105611_m;
      }

      if(this.field_105608_c != null) {
         this.field_105605_d.func_105806_c(this.field_105608_c);
         this.field_105608_c = null;
      }

      if(this.field_105607_b != null) {
         this.field_105605_d.func_105811_b(this.field_105607_b);
         this.field_105607_b = null;
      }

   }

   // $FF: synthetic method
   static Map func_105595_a(C_100079_bdb var0) {
      return var0.field_105607_b;
   }

   // $FF: synthetic method
   static File func_105590_b(C_100079_bdb var0) {
      return var0.field_105603_f;
   }

   // $FF: synthetic method
   static File func_105584_c(C_100079_bdb var0) {
      return var0.field_105614_h;
   }

   // $FF: synthetic method
   static File func_105600_d(C_100079_bdb var0) {
      return var0.field_105612_j;
   }

   // $FF: synthetic method
   static void func_105588_a(C_100079_bdb var0, Map var1, File var2, File var3, File var4) {
      var0.func_105596_a(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Map func_105599_a(C_100079_bdb var0, Map var1) {
      return var0.field_105607_b = var1;
   }

   // $FF: synthetic method
   static Map func_105583_a(C_100079_bdb var0, File var1, File var2, File var3) {
      return var0.func_105592_a(var1, var2, var3);
   }

   // $FF: synthetic method
   static boolean func_105585_a(C_100079_bdb var0, boolean var1) {
      return var0.field_105609_a = var1;
   }

   // $FF: synthetic method
   static File func_105591_e(C_100079_bdb var0) {
      return var0.field_105606_e;
   }

   // $FF: synthetic method
   static File func_105587_f(C_100079_bdb var0) {
      return var0.field_105604_g;
   }

   // $FF: synthetic method
   static File func_105601_g(C_100079_bdb var0) {
      return var0.field_105615_i;
   }
}
