
public abstract class C_101252_awt extends C_101141_arq {

   private String field_104155_a;
   private String field_104154_b;


   public C_101252_awt(C_101278_asw var1, String var2, int var3) {
      super(var1, C_100361_be.func_107654_a().func_107651_b("chat.link.confirm"), var2, var3);
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.field_104149_c = var4.func_107651_b("gui.yes");
      this.field_104147_d = var4.func_107651_b("gui.no");
      this.field_104154_b = var4.func_107651_b("chat.copy");
      this.field_104155_a = var4.func_107651_b("chat.link.warning");
   }

   public void func_104037_A_() {
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 3 - 83 + 0, this.field_104045_g / 6 + 96, 100, 20, this.field_104149_c));
      this.field_104050_h.add(new C_101133_arl(2, this.field_104044_f / 3 - 83 + 105, this.field_104045_g / 6 + 96, 100, 20, this.field_104154_b));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 3 - 83 + 210, this.field_104045_g / 6 + 96, 100, 20, this.field_104147_d));
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 2) {
         this.func_104153_e();
         super.func_104040_a((C_101133_arl)this.field_104050_h.get(1));
      } else {
         super.func_104040_a(var1);
      }

   }

   public abstract void func_104153_e();

   public void func_104027_a(int var1, int var2, float var3) {
      super.func_104027_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, this.field_104155_a, this.field_104044_f / 2, 110, 16764108);
   }
}
