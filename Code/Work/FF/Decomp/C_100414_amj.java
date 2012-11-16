
public class C_100414_amj extends C_100398_amm {

   public String[] field_102963_a = new String[]{"", "", "", ""};
   public int field_102961_b = -1;
   private boolean field_102962_c = true;


   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107533_a("Text1", this.field_102963_a[0]);
      var1.func_107533_a("Text2", this.field_102963_a[1]);
      var1.func_107533_a("Text3", this.field_102963_a[2]);
      var1.func_107533_a("Text4", this.field_102963_a[3]);
   }

   public void func_102925_a(C_100353_bh var1) {
      this.field_102962_c = false;
      super.func_102925_a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.field_102963_a[var2] = var1.func_107534_i("Text" + (var2 + 1));
         if(this.field_102963_a[var2].length() > 15) {
            this.field_102963_a[var2] = this.field_102963_a[var2].substring(0, 15);
         }
      }

   }

   public C_100219_dx func_102924_l() {
      String[] var1 = new String[4];
      System.arraycopy(this.field_102963_a, 0, var1, 0, 4);
      return new C_100266_eu(this.field_102938_l, this.field_102939_m, this.field_102936_n, var1);
   }

   public boolean func_102960_a() {
      return this.field_102962_c;
   }

   public void func_102959_a(boolean var1) {
      this.field_102962_c = var1;
   }
}
