import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C_100308_agq extends C_100300_agu {

   public C_100308_agq(File var1) {
      super(var1);
   }

   public List func_107195_b() {
      ArrayList var1 = new ArrayList();
      File[] var2 = this.field_107203_a.listFiles();
      File[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         File var6 = var3[var5];
         if(var6.isDirectory()) {
            String var7 = var6.getName();
            C_100269_agv var8 = this.func_107194_c(var7);
            if(var8 != null && (var8.func_107128_l() == 19132 || var8.func_107128_l() == 19133)) {
               boolean var9 = var8.func_107128_l() != this.func_107208_c();
               String var10 = var8.func_107131_k();
               if(var10 == null || C_100650_jv.func_108930_a(var10)) {
                  var10 = var7;
               }

               long var11 = 0L;
               var1.add(new C_100264_agz(var7, var10, var8.func_107164_m(), var11, var8.func_107135_r(), var9, var8.func_107145_t(), var8.func_107139_v()));
            }
         }
      }

      return var1;
   }

   protected int func_107208_c() {
      return 19133;
   }

   public void func_107196_d() {
      C_101305_zm.func_112440_a();
   }

   public C_100268_agw func_107200_a(String var1, boolean var2) {
      return new C_100306_agp(this.field_107203_a, var1, var2);
   }

   public boolean func_107197_b(String var1) {
      C_100269_agv var2 = this.func_107194_c(var1);
      return var2 != null && var2.func_107128_l() != this.func_107208_c();
   }

   public boolean func_107199_a(String var1, C_100683_ka var2) {
      var2.func_104290_a(0);
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      File var6 = new File(this.field_107203_a, var1);
      File var7 = new File(var6, "DIM-1");
      File var8 = new File(var6, "DIM1");
      System.out.println("Scanning folders...");
      this.func_107206_a(var6, var3);
      if(var7.exists()) {
         this.func_107206_a(var7, var4);
      }

      if(var8.exists()) {
         this.func_107206_a(var8, var5);
      }

      int var9 = var3.size() + var4.size() + var5.size();
      System.out.println("Total conversion count is " + var9);
      C_100269_agv var10 = this.func_107194_c(var1);
      Object var11 = null;
      if(var10.func_107143_u() == C_100845_xp.field_110159_c) {
         var11 = new C_101310_yh(C_101324_xz.field_112494_c, 0.5F, 0.5F);
      } else {
         var11 = new C_101311_ye(var10.func_107133_b(), var10.func_107143_u());
      }

      this.func_107207_a(new File(var6, "region"), var3, (C_101311_ye)var11, 0, var9, var2);
      this.func_107207_a(new File(var7, "region"), var4, new C_101310_yh(C_101324_xz.field_112500_j, 1.0F, 0.0F), var3.size(), var9, var2);
      this.func_107207_a(new File(var8, "region"), var5, new C_101310_yh(C_101324_xz.field_112501_k, 0.5F, 0.0F), var3.size() + var4.size(), var9, var2);
      var10.func_107151_e(19133);
      if(var10.func_107143_u() == C_100845_xp.field_110157_e) {
         var10.func_107134_a(C_100845_xp.field_110158_b);
      }

      this.func_107204_f(var1);
      C_100268_agw var12 = this.func_107200_a(var1, false);
      var12.func_107095_a(var10);
      return true;
   }

   private void func_107204_f(String var1) {
      File var2 = new File(this.field_107203_a, var1);
      if(!var2.exists()) {
         System.out.println("Warning: Unable to create level.dat_mcr backup");
      } else {
         File var3 = new File(var2, "level.dat");
         if(!var3.exists()) {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
         } else {
            File var4 = new File(var2, "level.dat_mcr");
            if(!var3.renameTo(var4)) {
               System.out.println("Warning: Unable to create level.dat_mcr backup");
            }

         }
      }
   }

   private void func_107207_a(File var1, Iterable var2, C_101311_ye var3, int var4, int var5, C_100683_ka var6) {
      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         File var8 = (File)var7.next();
         this.func_107205_a(var1, var8, var3, var4, var5, var6);
         ++var4;
         int var9 = (int)Math.round(100.0D * (double)var4 / (double)var5);
         var6.func_104290_a(var9);
      }

   }

   private void func_107205_a(File var1, File var2, C_101311_ye var3, int var4, int var5, C_100683_ka var6) {
      try {
         String var7 = var2.getName();
         C_101301_zk var8 = new C_101301_zk(var2);
         C_101301_zk var9 = new C_101301_zk(new File(var1, var7.substring(0, var7.length() - ".mcr".length()) + ".mca"));

         for(int var10 = 0; var10 < 32; ++var10) {
            int var11;
            for(var11 = 0; var11 < 32; ++var11) {
               if(var8.func_112413_c(var10, var11) && !var9.func_112413_c(var10, var11)) {
                  DataInputStream var12 = var8.func_112408_a(var10, var11);
                  if(var12 == null) {
                     System.out.println("Failed to fetch input stream");
                  } else {
                     C_100353_bh var13 = C_100329_br.func_107546_a(var12);
                     var12.close();
                     C_100353_bh var14 = var13.func_107521_l("Level");
                     C_101303_zj var15 = C_101263_zi.func_112246_a(var14);
                     C_100353_bh var16 = new C_100353_bh();
                     C_100353_bh var17 = new C_100353_bh();
                     var16.func_107530_a("Level", var17);
                     C_101263_zi.func_112247_a(var15, var17, var3);
                     DataOutputStream var18 = var9.func_112414_b(var10, var11);
                     C_100329_br.func_107543_a(var16, var18);
                     var18.close();
                  }
               }
            }

            var11 = (int)Math.round(100.0D * (double)(var4 * 1024) / (double)(var5 * 1024));
            int var20 = (int)Math.round(100.0D * (double)((var10 + 1) * 32 + var4 * 1024) / (double)(var5 * 1024));
            if(var20 > var11) {
               var6.func_104290_a(var20);
            }
         }

         var8.func_112412_c();
         var9.func_112412_c();
      } catch (IOException var19) {
         var19.printStackTrace();
      }

   }

   private void func_107206_a(File var1, Collection var2) {
      File var3 = new File(var1, "region");
      File[] var4 = var3.listFiles(new C_100294_agr(this));
      if(var4 != null) {
         Collections.addAll(var2, var4);
      }

   }
}
