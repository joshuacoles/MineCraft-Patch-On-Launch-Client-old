import java.util.HashMap;
import java.util.Map;

public class C_100398_amm {

   private static Map field_102935_a = new HashMap();
   private static Map field_102932_b = new HashMap();
   protected C_100873_xe field_102940_k;
   public int field_102938_l;
   public int field_102939_m;
   public int field_102936_n;
   protected boolean field_102937_o;
   public int field_102934_p = -1;
   public C_100451_alf field_102933_q;


   private static void func_102913_a(Class var0, String var1) {
      if(field_102935_a.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         field_102935_a.put(var1, var0);
         field_102932_b.put(var0, var1);
      }
   }

   public C_100873_xe func_102928_n() {
      return this.field_102940_k;
   }

   public void func_102917_b(C_100873_xe var1) {
      this.field_102940_k = var1;
   }

   public boolean func_102914_o() {
      return this.field_102940_k != null;
   }

   public void func_102925_a(C_100353_bh var1) {
      this.field_102938_l = var1.func_107514_e("x");
      this.field_102939_m = var1.func_107514_e("y");
      this.field_102936_n = var1.func_107514_e("z");
   }

   public void func_102915_b(C_100353_bh var1) {
      String var2 = (String)field_102932_b.get(this.getClass());
      if(var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.func_107533_a("id", var2);
         var1.func_107520_a("x", this.field_102938_l);
         var1.func_107520_a("y", this.field_102939_m);
         var1.func_107520_a("z", this.field_102936_n);
      }
   }

   public void func_102921_g() {}

   public static C_100398_amm func_102930_c(C_100353_bh var0) {
      C_100398_amm var1 = null;

      try {
         Class var2 = (Class)field_102935_a.get(var0.func_107534_i("id"));
         if(var2 != null) {
            var1 = (C_100398_amm)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if(var1 != null) {
         var1.func_102925_a(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.func_107534_i("id"));
      }

      return var1;
   }

   public int func_102919_p() {
      if(this.field_102934_p == -1) {
         this.field_102934_p = this.field_102940_k.func_109357_g(this.field_102938_l, this.field_102939_m, this.field_102936_n);
      }

      return this.field_102934_p;
   }

   public void func_102922_d() {
      if(this.field_102940_k != null) {
         this.field_102934_p = this.field_102940_k.func_109357_g(this.field_102938_l, this.field_102939_m, this.field_102936_n);
         this.field_102940_k.func_109414_b(this.field_102938_l, this.field_102939_m, this.field_102936_n, this);
      }

   }

   public double func_102926_a(double var1, double var3, double var5) {
      double var7 = (double)this.field_102938_l + 0.5D - var1;
      double var9 = (double)this.field_102939_m + 0.5D - var3;
      double var11 = (double)this.field_102936_n + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double func_102923_m() {
      return 4096.0D;
   }

   public C_100451_alf func_102916_q() {
      if(this.field_102933_q == null) {
         this.field_102933_q = C_100451_alf.field_106118_p[this.field_102940_k.func_109349_a(this.field_102938_l, this.field_102939_m, this.field_102936_n)];
      }

      return this.field_102933_q;
   }

   public C_100219_dx func_102924_l() {
      return null;
   }

   public boolean func_102927_r() {
      return this.field_102937_o;
   }

   public void func_102920_w_() {
      this.field_102937_o = true;
   }

   public void func_102929_s() {
      this.field_102937_o = false;
   }

   public void func_102918_b(int var1, int var2) {}

   public void func_102931_h() {
      this.field_102933_q = null;
      this.field_102934_p = -1;
   }

   static {
      func_102913_a(C_100419_amg.class, "Furnace");
      func_102913_a(C_100422_amb.class, "Chest");
      func_102913_a(C_100418_amf.class, "EnderChest");
      func_102913_a(C_100486_akj.class, "RecordPlayer");
      func_102913_a(C_100420_amd.class, "Trap");
      func_102913_a(C_100414_amj.class, "Sign");
      func_102913_a(C_100416_amh.class, "MobSpawner");
      func_102913_a(C_100417_ami.class, "Music");
      func_102913_a(C_100406_amq.class, "Piston");
      func_102913_a(C_100424_ama.class, "Cauldron");
      func_102913_a(C_100421_ame.class, "EnchantTable");
      func_102913_a(C_100400_aml.class, "Airportal");
      func_102913_a(C_100423_amc.class, "Control");
      func_102913_a(C_100425_alz.class, "Beacon");
      func_102913_a(C_100415_amk.class, "Skull");
   }
}
