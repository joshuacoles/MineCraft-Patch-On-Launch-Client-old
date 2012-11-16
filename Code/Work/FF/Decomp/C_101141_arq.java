
public class C_101141_arq extends C_101278_asw {

   private C_101278_asw field_104150_a;
   private String field_104148_b;
   private String field_104152_m;
   protected String field_104149_c;
   protected String field_104147_d;
   private int field_104151_n;


   public C_101141_arq(C_101278_asw var1, String var2, String var3, int var4) {
      this.field_104150_a = var1;
      this.field_104148_b = var2;
      this.field_104152_m = var3;
      this.field_104151_n = var4;
      C_100361_be var5 = C_100361_be.func_107654_a();
      this.field_104149_c = var5.func_107651_b("gui.yes");
      this.field_104147_d = var5.func_107651_b("gui.no");
   }

   public C_101141_arq(C_101278_asw var1, String var2, String var3, String var4, String var5, int var6) {
      this.field_104150_a = var1;
      this.field_104148_b = var2;
      this.field_104152_m = var3;
      this.field_104149_c = var4;
      this.field_104147_d = var5;
      this.field_104151_n = var6;
   }

   public void func_104037_A_() {
      this.field_104050_h.add(new C_101300_atd(0, this.field_104044_f / 2 - 155, this.field_104045_g / 6 + 96, this.field_104149_c));
      this.field_104050_h.add(new C_101300_atd(1, this.field_104044_f / 2 - 155 + 160, this.field_104045_g / 6 + 96, this.field_104147_d));
   }

   protected void func_104040_a(C_101133_arl var1) {
      this.field_104150_a.func_104042_a(var1.field_103908_f == 0, this.field_104151_n);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104148_b, this.field_104044_f / 2, 70, 16777215);
      this.func_103879_a(this.field_104049_k, this.field_104152_m, this.field_104044_f / 2, 90, 16777215);
      super.func_104027_a(var1, var2, var3);
   }
}
