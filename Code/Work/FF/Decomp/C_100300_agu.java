import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class C_100300_agu implements C_100270_agy {

   protected final File field_107203_a;


   public C_100300_agu(File var1) {
      if(!var1.exists()) {
         var1.mkdirs();
      }

      this.field_107203_a = var1;
   }

   public List func_107195_b() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < 5; ++var2) {
         String var3 = "World" + (var2 + 1);
         C_100269_agv var4 = this.func_107194_c(var3);
         if(var4 != null) {
            var1.add(new C_100264_agz(var3, "", var4.func_107164_m(), var4.func_107156_h(), var4.func_107135_r(), false, var4.func_107145_t(), var4.func_107139_v()));
         }
      }

      return var1;
   }

   public void func_107196_d() {}

   public C_100269_agv func_107194_c(String var1) {
      File var2 = new File(this.field_107203_a, var1);
      if(!var2.exists()) {
         return null;
      } else {
         File var3 = new File(var2, "level.dat");
         C_100353_bh var4;
         C_100353_bh var5;
         if(var3.exists()) {
            try {
               var4 = C_100329_br.func_107545_a(new FileInputStream(var3));
               var5 = var4.func_107521_l("Data");
               return new C_100269_agv(var5);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         var3 = new File(var2, "level.dat_old");
         if(var3.exists()) {
            try {
               var4 = C_100329_br.func_107545_a(new FileInputStream(var3));
               var5 = var4.func_107521_l("Data");
               return new C_100269_agv(var5);
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         return null;
      }
   }

   public void func_107201_a(String var1, String var2) {
      File var3 = new File(this.field_107203_a, var1);
      if(var3.exists()) {
         File var4 = new File(var3, "level.dat");
         if(var4.exists()) {
            try {
               C_100353_bh var5 = C_100329_br.func_107545_a(new FileInputStream(var4));
               C_100353_bh var6 = var5.func_107521_l("Data");
               var6.func_107533_a("LevelName", var2);
               C_100329_br.func_107551_a(var5, new FileOutputStream(var4));
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

      }
   }

   public boolean func_107198_e(String var1) {
      File var2 = new File(this.field_107203_a, var1);
      if(!var2.exists()) {
         return true;
      } else {
         System.out.println("Deleting level " + var1);

         for(int var3 = 1; var3 <= 5; ++var3) {
            System.out.println("Attempt " + var3 + "...");
            if(func_107202_a(var2.listFiles())) {
               break;
            }

            System.out.println("Unsuccessful in deleting contents.");
            if(var3 < 5) {
               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
                  ;
               }
            }
         }

         return var2.delete();
      }
   }

   protected static boolean func_107202_a(File[] var0) {
      File[] var1 = var0;
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         File var4 = var1[var3];
         System.out.println("Deleting " + var4);
         if(var4.isDirectory() && !func_107202_a(var4.listFiles())) {
            System.out.println("Couldn\'t delete directory " + var4);
            return false;
         }

         if(!var4.delete()) {
            System.out.println("Couldn\'t delete file " + var4);
            return false;
         }
      }

      return true;
   }

   public C_100268_agw func_107200_a(String var1, boolean var2) {
      return new C_100298_agt(this.field_107203_a, var1, var2);
   }

   public boolean func_107197_b(String var1) {
      return false;
   }

   public boolean func_107199_a(String var1, C_100683_ka var2) {
      return false;
   }
}
