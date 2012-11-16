import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100168_hf extends C_100122_ge {

   private File field_105760_e;
   private File field_105759_f;


   public C_100168_hf(C_100170_hg var1) {
      super(var1);
      this.field_105760_e = var1.func_104891_e("ops.txt");
      this.field_105759_f = var1.func_104891_e("white-list.txt");
      this.field_105741_d = var1.func_105016_a("view-distance", 10);
      this.field_105744_c = var1.func_105016_a("max-players", 20);
      this.func_105725_a(var1.func_105023_a("white-list", false));
      if(!var1.func_104921_I()) {
         this.func_105719_e().func_106507_a(true);
         this.func_105727_f().func_106507_a(true);
      }

      this.func_105719_e().func_106506_e();
      this.func_105719_e().func_106510_f();
      this.func_105727_f().func_106506_e();
      this.func_105727_f().func_106510_f();
      this.func_105754_t();
      this.func_105755_v();
      this.func_105757_u();
      this.func_105758_w();
   }

   public void func_105725_a(boolean var1) {
      super.func_105725_a(var1);
      this.func_105756_s().func_105017_a("white-list", Boolean.valueOf(var1));
      this.func_105756_s().func_105015_a();
   }

   public void func_105710_b(String var1) {
      super.func_105710_b(var1);
      this.func_105757_u();
   }

   public void func_105693_c(String var1) {
      super.func_105693_c(var1);
      this.func_105757_u();
   }

   public void func_105706_i(String var1) {
      super.func_105706_i(var1);
      this.func_105758_w();
   }

   public void func_105694_h(String var1) {
      super.func_105694_h(var1);
      this.func_105758_w();
   }

   public void func_105721_j() {
      this.func_105755_v();
   }

   private void func_105754_t() {
      try {
         this.func_105728_i().clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.field_105760_e));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.func_105728_i().add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         field_105745_a.warning("Failed to load operators list: " + var3);
      }

   }

   private void func_105757_u() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_105760_e, false));
         Iterator var2 = this.func_105728_i().iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         field_105745_a.warning("Failed to save operators list: " + var4);
      }

   }

   private void func_105755_v() {
      try {
         this.func_105736_h().clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.field_105759_f));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            this.func_105736_h().add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         field_105745_a.warning("Failed to load white-list: " + var3);
      }

   }

   private void func_105758_w() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_105759_f, false));
         Iterator var2 = this.func_105736_h().iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         field_105745_a.warning("Failed to save white-list: " + var4);
      }

   }

   public boolean func_105700_d(String var1) {
      var1 = var1.trim().toLowerCase();
      return !this.func_105708_n() || this.func_105690_e(var1) || this.func_105736_h().contains(var1);
   }

   public C_100170_hg func_105756_s() {
      return (C_100170_hg)super.func_105722_p();
   }

   // $FF: synthetic method
   public C_101445_MinecraftServer func_105722_p() {
      return this.func_105756_s();
   }
}
