import java.util.Random;

public abstract class C_100562_aan {

   private final boolean field_107970_a;
   private int field_107969_b = 1;


   public C_100562_aan() {
      this.field_107970_a = false;
   }

   public C_100562_aan(boolean var1) {
      this.field_107970_a = var1;
   }

   public abstract boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5);

   public void func_107968_a(double var1, double var3, double var5) {}

   protected void func_107967_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this.func_107966_a(var1, var2, var3, var4, var5, 0);
   }

   protected void func_107966_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field_107970_a) {
         var1.func_109394_d(var2, var3, var4, var5, var6);
      } else {
         var1.func_109526_c(var2, var3, var4, var5, var6);
      }

   }
}
