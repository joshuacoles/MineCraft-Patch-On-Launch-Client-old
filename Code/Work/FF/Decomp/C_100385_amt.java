import java.util.ArrayList;
import java.util.List;

public class C_100385_amt {

   private final int field_107851_a;
   private final int field_107849_b;
   private final List field_107850_c = new ArrayList();
   private int field_107847_d = 0;
   private int field_107848_e = 0;
   private int field_107846_f = 0;


   public C_100385_amt(int var1, int var2) {
      this.field_107851_a = var1;
      this.field_107849_b = var2;
   }

   public C_100412_amr func_107844_a(double var1, double var3, double var5, double var7, double var9, double var11) {
      C_100412_amr var13;
      if(this.field_107847_d >= this.field_107850_c.size()) {
         var13 = new C_100412_amr(var1, var3, var5, var7, var9, var11);
         this.field_107850_c.add(var13);
      } else {
         var13 = (C_100412_amr)this.field_107850_c.get(this.field_107847_d);
         var13.func_107907_b(var1, var3, var5, var7, var9, var11);
      }

      ++this.field_107847_d;
      return var13;
   }

   public void func_107842_a() {
      if(this.field_107847_d > this.field_107848_e) {
         this.field_107848_e = this.field_107847_d;
      }

      if(this.field_107846_f++ == this.field_107851_a) {
         int var1 = Math.max(this.field_107848_e, this.field_107850_c.size() - this.field_107849_b);

         while(this.field_107850_c.size() > var1) {
            this.field_107850_c.remove(var1);
         }

         this.field_107848_e = 0;
         this.field_107846_f = 0;
      }

      this.field_107847_d = 0;
   }

   public void func_107843_b() {
      this.field_107847_d = 0;
      this.field_107850_c.clear();
   }

   public int func_107845_c() {
      return this.field_107850_c.size();
   }

   public int func_107841_d() {
      return this.field_107847_d;
   }
}
