
public class C_100437_aln extends C_100451_alf {

   protected boolean field_106421_c;


   protected C_100437_aln(int var1, int var2, C_100664_afg var3, boolean var4) {
      super(var1, var2, var3);
      this.field_106421_c = var4;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109349_a(var2, var3, var4);
      return !this.field_106421_c && var6 == this.field_106162_cm?false:super.func_105976_a(var1, var2, var3, var4, var5);
   }
}
