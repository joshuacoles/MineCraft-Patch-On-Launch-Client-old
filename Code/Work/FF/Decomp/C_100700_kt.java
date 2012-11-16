
public class C_100700_kt extends C_100698_ks {

   protected C_100730_lb field_109253_r;


   public C_100700_kt(String var1, C_100730_lb var2) {
      super(var1);
      this.field_109253_r = var2;
   }

   public C_100730_lb func_109210_g() {
      return this.field_109253_r;
   }

   public String func_109217_b(C_101095_qg var1) {
      return C_100359_bd.func_107637_a("death." + this.field_109250_q, new Object[]{var1.field_103847_bT, this.field_109253_r.func_103139_an()});
   }

   public boolean func_109214_n() {
      return this.field_109253_r != null && this.field_109253_r instanceof C_100595_ln && !(this.field_109253_r instanceof C_101095_qg);
   }
}
