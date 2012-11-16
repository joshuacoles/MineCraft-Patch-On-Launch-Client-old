
public class C_101300_atd extends C_101133_arl {

   private final C_101123_arf field_103921_k;


   public C_101300_atd(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, (C_101123_arf)null, var4);
   }

   public C_101300_atd(int var1, int var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_103921_k = null;
   }

   public C_101300_atd(int var1, int var2, int var3, C_101123_arf var4, String var5) {
      super(var1, var2, var3, 150, 20, var5);
      this.field_103921_k = var4;
   }

   public C_101123_arf func_103920_b() {
      return this.field_103921_k;
   }
}
