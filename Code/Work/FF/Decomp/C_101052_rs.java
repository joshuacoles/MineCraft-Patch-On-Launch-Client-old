
public class C_101052_rs extends C_101048_rz {

   private final C_101059_rq field_111468_a;
   private C_101095_qg field_111466_b;
   private int field_111467_c;
   private final C_100891_wu field_111465_d;


   public C_101052_rs(C_101095_qg var1, C_100891_wu var2, C_101059_rq var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field_111466_b = var1;
      this.field_111465_d = var2;
      this.field_111468_a = var3;
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return false;
   }

   public C_100994_tv func_111445_a(int var1) {
      if(this.func_111453_d()) {
         this.field_111467_c += Math.min(var1, this.func_111446_c().field_111398_a);
      }

      return super.func_111445_a(var1);
   }

   protected void func_111448_a(C_100994_tv var1, int var2) {
      this.field_111467_c += var2;
      this.func_111449_b(var1);
   }

   protected void func_111449_b(C_100994_tv var1) {
      var1.func_111366_a(this.field_111466_b.field_103229_p, this.field_111466_b, this.field_111467_c);
      this.field_111467_c = 0;
   }

   public void func_111452_a(C_101095_qg var1, C_100994_tv var2) {
      this.func_111449_b(var2);
      C_100892_wv var3 = this.field_111468_a.func_104785_h();
      if(var3 != null) {
         C_100994_tv var4 = this.field_111468_a.func_103007_a(0);
         C_100994_tv var5 = this.field_111468_a.func_103007_a(1);
         if(this.func_111464_a(var3, var4, var5) || this.func_111464_a(var3, var5, var4)) {
            if(var4 != null && var4.field_111398_a <= 0) {
               var4 = null;
            }

            if(var5 != null && var5.field_111398_a <= 0) {
               var5 = null;
            }

            this.field_111468_a.func_103006_a(0, var4);
            this.field_111468_a.func_103006_a(1, var5);
            this.field_111465_d.func_103582_a(var3);
         }
      }

   }

   private boolean func_111464_a(C_100892_wv var1, C_100994_tv var2, C_100994_tv var3) {
      C_100994_tv var4 = var1.func_110665_a();
      C_100994_tv var5 = var1.func_110659_b();
      if(var2 != null && var2.field_111397_c == var4.field_111397_c) {
         if(var5 != null && var3 != null && var5.field_111397_c == var3.field_111397_c) {
            var2.field_111398_a -= var4.field_111398_a;
            var3.field_111398_a -= var5.field_111398_a;
            return true;
         }

         if(var5 == null && var3 == null) {
            var2.field_111398_a -= var4.field_111398_a;
            return true;
         }
      }

      return false;
   }
}
