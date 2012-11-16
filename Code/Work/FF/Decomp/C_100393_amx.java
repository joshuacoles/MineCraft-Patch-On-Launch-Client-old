import java.util.ArrayList;
import java.util.List;

public class C_100393_amx {

   private final int field_107889_a;
   private final int field_107887_b;
   private final List field_107888_c = new ArrayList();
   private int field_107885_d = 0;
   private int field_107886_e = 0;
   private int field_107884_f = 0;


   public C_100393_amx(int var1, int var2) {
      this.field_107889_a = var1;
      this.field_107887_b = var2;
   }

   public C_100387_amw func_107878_a(double var1, double var3, double var5) {
      if(this.func_107879_e()) {
         return new C_100387_amw(this, var1, var3, var5);
      } else {
         C_100387_amw var7;
         if(this.field_107885_d >= this.field_107888_c.size()) {
            var7 = new C_100387_amw(this, var1, var3, var5);
            this.field_107888_c.add(var7);
         } else {
            var7 = (C_100387_amw)this.field_107888_c.get(this.field_107885_d);
            var7.func_107861_b(var1, var3, var5);
         }

         ++this.field_107885_d;
         return var7;
      }
   }

   public void func_107881_a() {
      if(!this.func_107879_e()) {
         if(this.field_107885_d > this.field_107886_e) {
            this.field_107886_e = this.field_107885_d;
         }

         if(this.field_107884_f++ == this.field_107889_a) {
            int var1 = Math.max(this.field_107886_e, this.field_107888_c.size() - this.field_107887_b);

            while(this.field_107888_c.size() > var1) {
               this.field_107888_c.remove(var1);
            }

            this.field_107886_e = 0;
            this.field_107884_f = 0;
         }

         this.field_107885_d = 0;
      }
   }

   public void func_107882_b() {
      if(!this.func_107879_e()) {
         this.field_107885_d = 0;
         this.field_107888_c.clear();
      }
   }

   public int func_107883_c() {
      return this.field_107888_c.size();
   }

   public int func_107880_d() {
      return this.field_107885_d;
   }

   private boolean func_107879_e() {
      return this.field_107887_b < 0 || this.field_107889_a < 0;
   }
}
