import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class C_100298_agt implements C_100268_agw, C_100243_ahj {

   private static final Logger field_107107_a = Logger.getLogger("Minecraft");
   private final File field_107105_b;
   private final File field_107106_c;
   private final File field_107103_d;
   private final long field_107104_e = System.currentTimeMillis();
   private final String field_107102_f;


   public C_100298_agt(File var1, String var2, boolean var3) {
      this.field_107105_b = new File(var1, var2);
      this.field_107105_b.mkdirs();
      this.field_107106_c = new File(this.field_107105_b, "players");
      this.field_107103_d = new File(this.field_107105_b, "data");
      this.field_107103_d.mkdirs();
      this.field_107102_f = var2;
      if(var3) {
         this.field_107106_c.mkdirs();
      }

      this.func_107101_h();
   }

   private void func_107101_h() {
      try {
         File var1 = new File(this.field_107105_b, "session.lock");
         DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

         try {
            var2.writeLong(this.field_107104_e);
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         var7.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }
   }

   protected File func_107099_b() {
      return this.field_107105_b;
   }

   public void func_107092_c() {
      try {
         File var1 = new File(this.field_107105_b, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if(var2.readLong() != this.field_107104_e) {
               throw new C_100829_xj("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         throw new C_100829_xj("Failed to check session lock, aborting");
      }
   }

   public C_101262_zf func_107094_a(C_101289_zr var1) {
      throw new RuntimeException("Old Chunk Storage is no longer supported.");
   }

   public C_100269_agv func_107088_d() {
      File var1 = new File(this.field_107105_b, "level.dat");
      C_100353_bh var2;
      C_100353_bh var3;
      if(var1.exists()) {
         try {
            var2 = C_100329_br.func_107545_a(new FileInputStream(var1));
            var3 = var2.func_107521_l("Data");
            return new C_100269_agv(var3);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      var1 = new File(this.field_107105_b, "level.dat_old");
      if(var1.exists()) {
         try {
            var2 = C_100329_br.func_107545_a(new FileInputStream(var1));
            var3 = var2.func_107521_l("Data");
            return new C_100269_agv(var3);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return null;
   }

   public void func_107087_a(C_100269_agv var1, C_100353_bh var2) {
      C_100353_bh var3 = var1.func_107168_a(var2);
      C_100353_bh var4 = new C_100353_bh();
      var4.func_107530_a("Data", var3);

      try {
         File var5 = new File(this.field_107105_b, "level.dat_new");
         File var6 = new File(this.field_107105_b, "level.dat_old");
         File var7 = new File(this.field_107105_b, "level.dat");
         C_100329_br.func_107551_a(var4, new FileOutputStream(var5));
         if(var6.exists()) {
            var6.delete();
         }

         var7.renameTo(var6);
         if(var7.exists()) {
            var7.delete();
         }

         var5.renameTo(var7);
         if(var5.exists()) {
            var5.delete();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void func_107095_a(C_100269_agv var1) {
      C_100353_bh var2 = var1.func_107158_a();
      C_100353_bh var3 = new C_100353_bh();
      var3.func_107530_a("Data", var2);

      try {
         File var4 = new File(this.field_107105_b, "level.dat_new");
         File var5 = new File(this.field_107105_b, "level.dat_old");
         File var6 = new File(this.field_107105_b, "level.dat");
         C_100329_br.func_107551_a(var3, new FileOutputStream(var4));
         if(var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if(var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if(var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public void func_107096_a(C_101095_qg var1) {
      try {
         C_100353_bh var2 = new C_100353_bh();
         var1.func_103130_d(var2);
         File var3 = new File(this.field_107106_c, var1.field_103847_bT + ".dat.tmp");
         File var4 = new File(this.field_107106_c, var1.field_103847_bT + ".dat");
         C_100329_br.func_107551_a(var2, new FileOutputStream(var3));
         if(var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         field_107107_a.warning("Failed to save player data for " + var1.field_103847_bT);
      }

   }

   public void func_107097_b(C_101095_qg var1) {
      C_100353_bh var2 = this.func_107100_a(var1.field_103847_bT);
      if(var2 != null) {
         var1.func_103077_e(var2);
      }

   }

   public C_100353_bh func_107100_a(String var1) {
      try {
         File var2 = new File(this.field_107106_c, var1 + ".dat");
         if(var2.exists()) {
            return C_100329_br.func_107545_a(new FileInputStream(var2));
         }
      } catch (Exception var3) {
         field_107107_a.warning("Failed to load player data for " + var1);
      }

      return null;
   }

   public C_100243_ahj func_107093_e() {
      return this;
   }

   public String[] func_107098_f() {
      String[] var1 = this.field_107106_c.list();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2].endsWith(".dat")) {
            var1[var2] = var1[var2].substring(0, var1[var2].length() - 4);
         }
      }

      return var1;
   }

   public void func_107090_a() {}

   public File func_107089_b(String var1) {
      return new File(this.field_107103_d, var1 + ".dat");
   }

   public String func_107091_g() {
      return this.field_107102_f;
   }

}
