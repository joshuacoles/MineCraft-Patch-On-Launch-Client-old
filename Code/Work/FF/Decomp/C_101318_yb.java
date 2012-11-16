import java.util.ArrayList;
import java.util.List;

public class C_101318_yb {

   private final C_101311_ye field_112593_a;
   private long field_112591_b = 0L;
   private C_100653_jt field_112592_c = new C_100653_jt();
   private List field_112590_d = new ArrayList();


   public C_101318_yb(C_101311_ye var1) {
      this.field_112593_a = var1;
   }

   public C_101313_yc func_112587_a(int var1, int var2) {
      var1 >>= 4;
      var2 >>= 4;
      long var3 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      C_101313_yc var5 = (C_101313_yc)this.field_112592_c.func_108954_a(var3);
      if(var5 == null) {
         var5 = new C_101313_yc(this, var1, var2);
         this.field_112592_c.func_108953_a(var3, var5);
         this.field_112590_d.add(var5);
      }

      var5.field_112535_f = System.currentTimeMillis();
      return var5;
   }

   public C_101324_xz func_112588_b(int var1, int var2) {
      return this.func_112587_a(var1, var2).func_112534_a(var1, var2);
   }

   public void func_112586_a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.field_112591_b;
      if(var3 > 7500L || var3 < 0L) {
         this.field_112591_b = var1;

         for(int var5 = 0; var5 < this.field_112590_d.size(); ++var5) {
            C_101313_yc var6 = (C_101313_yc)this.field_112590_d.get(var5);
            long var7 = var1 - var6.field_112535_f;
            if(var7 > 30000L || var7 < 0L) {
               this.field_112590_d.remove(var5--);
               long var9 = (long)var6.field_112537_d & 4294967295L | ((long)var6.field_112538_e & 4294967295L) << 32;
               this.field_112592_c.func_108950_d(var9);
            }
         }
      }

   }

   public C_101324_xz[] func_112585_e(int var1, int var2) {
      return this.func_112587_a(var1, var2).field_112540_c;
   }

   // $FF: synthetic method
   static C_101311_ye func_112589_a(C_101318_yb var0) {
      return var0.field_112593_a;
   }
}
