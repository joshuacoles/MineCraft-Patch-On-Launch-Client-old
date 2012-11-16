
public abstract class C_100904_wf {

   public static final C_100904_wf[] field_110622_b = new C_100904_wf[256];
   public static final C_100904_wf field_110623_c = new C_100888_wr(0, 10, 0);
   public static final C_100904_wf field_110620_d = new C_100888_wr(1, 5, 1);
   public static final C_100904_wf field_110621_e = new C_100888_wr(2, 5, 2);
   public static final C_100904_wf field_110618_f = new C_100888_wr(3, 2, 3);
   public static final C_100904_wf field_110619_g = new C_100888_wr(4, 5, 4);
   public static final C_100904_wf field_110631_h = new C_100887_wq(5, 2);
   public static final C_100904_wf field_110632_i = new C_100890_wt(6, 2);
   public static final C_100904_wf field_110629_j = new C_100903_wc(16, 10, 0);
   public static final C_100904_wf field_110630_k = new C_100903_wc(17, 5, 1);
   public static final C_100904_wf field_110627_l = new C_100903_wc(18, 5, 2);
   public static final C_100904_wf field_110628_m = new C_100885_wo(19, 5);
   public static final C_100904_wf field_110625_n = new C_100884_wn(20, 2);
   public static final C_100904_wf field_110626_o = new C_100886_wp(21, 2, C_100877_wg.field_110569_g);
   public static final C_100904_wf field_110640_p = new C_100905_we(32, 10);
   public static final C_100904_wf field_110639_q = new C_100889_ws(33, 1);
   public static final C_100904_wf field_110638_r = new C_100902_wd(34, 5);
   public static final C_100904_wf field_110637_s = new C_100886_wp(35, 2, C_100877_wg.field_110576_h);
   public static final C_100904_wf field_110636_t = new C_100895_vy(48, 10);
   public static final C_100904_wf field_110635_u = new C_100900_wb(49, 2);
   public static final C_100904_wf field_110634_v = new C_100897_vz(50, 2);
   public static final C_100904_wf field_110633_w = new C_100901_wa(51, 1);
   public final int field_110643_x;
   private final int field_110624_a;
   public C_100877_wg field_110642_y;
   protected String field_110641_z;


   protected C_100904_wf(int var1, int var2, C_100877_wg var3) {
      this.field_110643_x = var1;
      this.field_110624_a = var2;
      this.field_110642_y = var3;
      if(field_110622_b[var1] != null) {
         throw new IllegalArgumentException("Duplicate enchantment id!");
      } else {
         field_110622_b[var1] = this;
      }
   }

   public int func_110614_c() {
      return this.field_110624_a;
   }

   public int func_110609_d() {
      return 1;
   }

   public int func_110617_b() {
      return 1;
   }

   public int func_110612_a(int var1) {
      return 1 + var1 * 10;
   }

   public int func_110608_b(int var1) {
      return this.func_110612_a(var1) + 5;
   }

   public int func_110616_a(int var1, C_100698_ks var2) {
      return 0;
   }

   public int func_110613_a(int var1, C_100595_ln var2) {
      return 0;
   }

   public boolean func_110615_a(C_100904_wf var1) {
      return this != var1;
   }

   public C_100904_wf func_110611_b(String var1) {
      this.field_110641_z = var1;
      return this;
   }

   public String func_110610_a() {
      return "enchantment." + this.field_110641_z;
   }

   public String func_110607_c(int var1) {
      String var2 = C_100359_bd.func_107638_a(this.func_110610_a());
      return var2 + " " + C_100359_bd.func_107638_a("enchantment.level." + var1);
   }

}
