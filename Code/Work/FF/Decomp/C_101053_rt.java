
public class C_101053_rt extends C_100706_ko {

   private C_100418_amf field_104778_a;


   public C_101053_rt() {
      super("container.enderchest", 27);
   }

   public void func_104776_a(C_100418_amf var1) {
      this.field_104778_a = var1;
   }

   public void func_104777_a(C_100339_bp var1) {
      int var2;
      for(var2 = 0; var2 < this.func_103003_k_(); ++var2) {
         this.func_103006_a(var2, (C_100994_tv)null);
      }

      for(var2 = 0; var2 < var1.func_107501_c(); ++var2) {
         C_100353_bh var3 = (C_100353_bh)var1.func_107498_b(var2);
         int var4 = var3.func_107524_c("Slot") & 255;
         if(var4 >= 0 && var4 < this.func_103003_k_()) {
            this.func_103006_a(var4, C_100994_tv.func_111376_a(var3));
         }
      }

   }

   public C_100339_bp func_104775_g() {
      C_100339_bp var1 = new C_100339_bp("EnderItems");

      for(int var2 = 0; var2 < this.func_103003_k_(); ++var2) {
         C_100994_tv var3 = this.func_103007_a(var2);
         if(var3 != null) {
            C_100353_bh var4 = new C_100353_bh();
            var4.func_107527_a("Slot", (byte)var2);
            var3.func_111344_b(var4);
            var1.func_107500_a(var4);
         }
      }

      return var1;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_104778_a != null && !this.field_104778_a.func_102996_a(var1)?false:super.func_103010_a(var1);
   }

   public void func_103004_l_() {
      if(this.field_104778_a != null) {
         this.field_104778_a.func_102994_a();
      }

      super.func_103004_l_();
   }

   public void func_103009_f() {
      if(this.field_104778_a != null) {
         this.field_104778_a.func_102995_b();
      }

      super.func_103009_f();
      this.field_104778_a = null;
   }
}
