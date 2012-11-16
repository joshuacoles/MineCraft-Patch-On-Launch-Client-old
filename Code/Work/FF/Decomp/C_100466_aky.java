import java.util.List;
import java.util.Random;

public class C_100466_aky extends C_100451_alf {

   public static final String[] field_106453_a = new String[]{"stone", "cobble", "brick"};


   public C_100466_aky(int var1) {
      super(var1, 1, C_100664_afg.field_109029_z);
      this.func_106006_c(0.0F);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public int func_106029_a(int var1, int var2) {
      return var2 == 1?C_100451_alf.field_106119_z.field_106165_cl:(var2 == 2?C_100451_alf.field_106135_bp.field_106165_cl:C_100451_alf.field_106111_w.field_106165_cl);
   }

   public void func_106020_c(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         C_101105_pv var6 = new C_101105_pv(var1);
         var6.func_103055_b((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.func_109513_d(var6);
         var6.func_103382_aQ();
      }

      super.func_106020_c(var1, var2, var3, var4, var5);
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public static boolean func_106452_e(int var0) {
      return var0 == C_100451_alf.field_106111_w.field_106162_cm || var0 == C_100451_alf.field_106119_z.field_106162_cm || var0 == C_100451_alf.field_106135_bp.field_106162_cm;
   }

   public static int func_106451_f(int var0) {
      return var0 == C_100451_alf.field_106119_z.field_106162_cm?1:(var0 == C_100451_alf.field_106135_bp.field_106162_cm?2:0);
   }

   protected C_100994_tv func_106044_f_(int var1) {
      C_100451_alf var2 = C_100451_alf.field_106111_w;
      if(var1 == 1) {
         var2 = C_100451_alf.field_106119_z;
      }

      if(var1 == 2) {
         var2 = C_100451_alf.field_106135_bp;
      }

      return new C_100994_tv(var2);
   }

   public int func_106019_h(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109357_g(var2, var3, var4);
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      for(int var4 = 0; var4 < 3; ++var4) {
         var3.add(new C_100994_tv(var1, 1, var4));
      }

   }

}
