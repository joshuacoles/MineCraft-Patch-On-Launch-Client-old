
public class C_101269_asu extends C_101278_asw implements C_100683_ka {

   private String field_104305_a = "";
   private String field_104303_b = "";
   private int field_104304_c = 0;
   private boolean field_104302_d;


   public void func_104292_a(String var1) {
      this.func_104293_b(var1);
   }

   public void func_104293_b(String var1) {
      this.field_104305_a = var1;
      this.func_104291_c("Working...");
   }

   public void func_104291_c(String var1) {
      this.field_104303_b = var1;
      this.func_104290_a(0);
   }

   public void func_104290_a(int var1) {
      this.field_104304_c = var1;
   }

   public void func_104289_a() {
      this.field_104302_d = true;
   }

   public void func_104027_a(int var1, int var2, float var3) {
      if(this.field_104302_d) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
      } else {
         this.func_104035_z_();
         this.func_103879_a(this.field_104049_k, this.field_104305_a, this.field_104044_f / 2, 70, 16777215);
         this.func_103879_a(this.field_104049_k, this.field_104303_b + " " + this.field_104304_c + "%", this.field_104044_f / 2, 90, 16777215);
         super.func_104027_a(var1, var2, var3);
      }
   }
}
