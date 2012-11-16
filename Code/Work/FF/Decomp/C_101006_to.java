
public class C_101006_to extends C_100992_tt {

   public final int field_111019_a;
   private final int field_111014_b;
   private final float field_111016_c;
   private final boolean field_111017_ck;
   private boolean field_111018_cl;
   private int field_111013_cm;
   private int field_111015_cn;
   private int field_111011_co;
   private float field_111012_cp;


   public C_101006_to(int var1, int var2, float var3, boolean var4) {
      super(var1);
      this.field_111019_a = 32;
      this.field_111014_b = var2;
      this.field_111017_ck = var4;
      this.field_111016_c = var3;
      this.func_110802_a(C_101040_sq.field_111426_h);
   }

   public C_101006_to(int var1, int var2, boolean var3) {
      this(var1, var2, 0.6F, var3);
   }

   public C_100994_tv func_110792_b(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      --var1.field_111398_a;
      var3.func_103819_bZ().func_111574_a(this);
      var2.func_109412_a(var3, "random.burp", 0.5F, var2.field_109577_u.nextFloat() * 0.1F + 0.9F);
      this.func_111008_c(var1, var2, var3);
      return var1;
   }

   protected void func_111008_c(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(!var2.field_109557_J && this.field_111013_cm > 0 && var2.field_109577_u.nextFloat() < this.field_111012_cp) {
         var3.func_103389_d(new C_100692_kx(this.field_111013_cm, this.field_111015_cn * 20, this.field_111011_co));
      }

   }

   public int func_110769_a(C_100994_tv var1) {
      return 32;
   }

   public C_100943_uw func_110777_d_(C_100994_tv var1) {
      return C_100943_uw.field_111099_b;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(var3.func_103821_f(this.field_111018_cl)) {
         var3.func_103784_a(var1, this.func_110769_a(var1));
      }

      return var1;
   }

   public int func_111010_g() {
      return this.field_111014_b;
   }

   public float func_111007_h() {
      return this.field_111016_c;
   }

   public boolean func_111009_i() {
      return this.field_111017_ck;
   }

   public C_101006_to func_111006_a(int var1, int var2, int var3, float var4) {
      this.field_111013_cm = var1;
      this.field_111015_cn = var2;
      this.field_111011_co = var3;
      this.field_111012_cp = var4;
      return this;
   }

   public C_101006_to func_111005_j() {
      this.field_111018_cl = true;
      return this;
   }
}
