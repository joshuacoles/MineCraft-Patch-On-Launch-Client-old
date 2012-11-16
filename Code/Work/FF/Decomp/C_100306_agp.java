import java.io.File;

public class C_100306_agp extends C_100298_agt {

   public C_100306_agp(File var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public C_101262_zf func_107094_a(C_101289_zr var1) {
      File var2 = this.func_107099_b();
      File var3;
      if(var1 instanceof C_101287_zs) {
         var3 = new File(var2, "DIM-1");
         var3.mkdirs();
         return new C_101297_zn(var3);
      } else if(var1 instanceof C_101291_zu) {
         var3 = new File(var2, "DIM1");
         var3.mkdirs();
         return new C_101297_zn(var3);
      } else {
         return new C_101297_zn(var2);
      }
   }

   public void func_107087_a(C_100269_agv var1, C_100353_bh var2) {
      var1.func_107151_e(19133);
      super.func_107087_a(var1, var2);
   }

   public void func_107090_a() {
      try {
         C_100239_ahl.field_107086_a.func_107080_a();
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      C_101305_zm.func_112440_a();
   }
}
