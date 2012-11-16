import java.util.Random;

public class C_100253_aht extends C_100451_alf {

   protected C_100253_aht(int var1, int var2, C_100664_afg var3) {
      super(var1, var3);
      this.field_106165_cl = var2;
      this.func_105972_b(true);
      float var4 = 0.2F;
      this.func_106008_a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   protected C_100253_aht(int var1, int var2) {
      this(var1, var2, C_100664_afg.field_109018_k);
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return super.func_106023_b(var1, var2, var3, var4) && this.func_106376_d_(var1.func_109349_a(var2, var3 - 1, var4));
   }

   protected boolean func_106376_d_(int var1) {
      return var1 == C_100451_alf.field_106121_x.field_106162_cm || var1 == C_100451_alf.field_106120_y.field_106162_cm || var1 == C_100451_alf.field_106196_aD.field_106162_cm;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super.func_106017_a(var1, var2, var3, var4, var5);
      this.func_106375_c(var1, var2, var3, var4);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      this.func_106375_c(var1, var2, var3, var4);
   }

   protected final void func_106375_c(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return (var1.func_109445_k(var2, var3, var4) >= 8 || var1.func_109502_j(var2, var3, var4)) && this.func_106376_d_(var1.func_109349_a(var2, var3 - 1, var4));
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 1;
   }
}
