import java.util.HashMap;
import java.util.Map;

public class C_100908_vm {

   private static final C_100908_vm field_110697_a = new C_100908_vm();
   private Map field_110695_b = new HashMap();
   private Map field_110696_c = new HashMap();


   public static final C_100908_vm func_110691_a() {
      return field_110697_a;
   }

   private C_100908_vm() {
      this.func_110694_a(C_100451_alf.field_106085_K.field_106162_cm, new C_100994_tv(C_100992_tt.field_110839_o), 0.7F);
      this.func_110694_a(C_100451_alf.field_106084_J.field_106162_cm, new C_100994_tv(C_100992_tt.field_110853_p), 1.0F);
      this.func_110694_a(C_100451_alf.field_106201_az.field_106162_cm, new C_100994_tv(C_100992_tt.field_110838_n), 1.0F);
      this.func_110694_a(C_100451_alf.field_106082_H.field_106162_cm, new C_100994_tv(C_100451_alf.field_106091_P), 0.1F);
      this.func_110694_a(C_100992_tt.field_110932_aq.field_110891_cf, new C_100994_tv(C_100992_tt.field_110930_ar), 0.35F);
      this.func_110694_a(C_100992_tt.field_110879_bi.field_110891_cf, new C_100994_tv(C_100992_tt.field_110872_bj), 0.35F);
      this.func_110694_a(C_100992_tt.field_110873_bk.field_110891_cf, new C_100994_tv(C_100992_tt.field_110874_bl), 0.35F);
      this.func_110694_a(C_100992_tt.field_110902_aU.field_110891_cf, new C_100994_tv(C_100992_tt.field_110901_aV), 0.35F);
      this.func_110694_a(C_100451_alf.field_106119_z.field_106162_cm, new C_100994_tv(C_100451_alf.field_106111_w), 0.1F);
      this.func_110694_a(C_100992_tt.field_110905_aI.field_110891_cf, new C_100994_tv(C_100992_tt.field_110920_aH), 0.3F);
      this.func_110694_a(C_100451_alf.field_106175_aY.field_106162_cm, new C_100994_tv(C_100992_tt.field_110904_aW, 1, 2), 0.2F);
      this.func_110694_a(C_100451_alf.field_106079_M.field_106162_cm, new C_100994_tv(C_100992_tt.field_110841_m, 1, 1), 0.15F);
      this.func_110694_a(C_100451_alf.field_106207_bU.field_106162_cm, new C_100994_tv(C_100992_tt.field_110965_bH), 1.0F);
      this.func_110694_a(C_100992_tt.field_110941_bL.field_110891_cf, new C_100994_tv(C_100992_tt.field_110943_bM), 0.35F);
      this.func_110694_a(C_100451_alf.field_106078_L.field_106162_cm, new C_100994_tv(C_100992_tt.field_110841_m), 0.1F);
      this.func_110694_a(C_100451_alf.field_106178_aQ.field_106162_cm, new C_100994_tv(C_100992_tt.field_110915_aC), 0.7F);
      this.func_110694_a(C_100451_alf.field_106090_Q.field_106162_cm, new C_100994_tv(C_100992_tt.field_110904_aW, 1, 4), 0.2F);
   }

   public void func_110694_a(int var1, C_100994_tv var2, float var3) {
      this.field_110695_b.put(Integer.valueOf(var1), var2);
      this.field_110696_c.put(Integer.valueOf(var2.field_111397_c), Float.valueOf(var3));
   }

   public C_100994_tv func_110692_b(int var1) {
      return (C_100994_tv)this.field_110695_b.get(Integer.valueOf(var1));
   }

   public Map func_110690_b() {
      return this.field_110695_b;
   }

   public float func_110693_c(int var1) {
      return this.field_110696_c.containsKey(Integer.valueOf(var1))?((Float)this.field_110696_c.get(Integer.valueOf(var1))).floatValue():0.0F;
   }

}
