import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

class C_101162_asl extends C_101275_asy {

   private ArrayList field_105867_b;
   private TreeMap field_105869_h;
   // $FF: synthetic field
   final C_101160_ask field_105868_a;


   public C_101162_asl(C_101160_ask var1) {
      super(var1.field_104046_e, var1.field_104044_f, var1.field_104045_g, 32, var1.field_104045_g - 65 + 4, 18);
      this.field_105868_a = var1;
      this.field_105869_h = C_100361_be.func_107654_a().func_107652_b();
      this.field_105867_b = new ArrayList();
      Iterator var2 = this.field_105869_h.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.field_105867_b.add(var3);
      }

   }

   protected int func_105830_a() {
      return this.field_105867_b.size();
   }

   protected void func_105827_a(int var1, boolean var2) {
      C_100361_be.func_107654_a().func_107656_a((String)this.field_105867_b.get(var1));
      this.field_105868_a.field_104046_e.field_105148_p.func_111786_a(C_100361_be.func_107654_a().func_107650_d());
      C_101160_ask.func_104232_a(this.field_105868_a).field_111752_af = (String)this.field_105867_b.get(var1);
      this.field_105868_a.field_104049_k.func_111797_b(C_100361_be.func_107648_e(C_101160_ask.func_104232_a(this.field_105868_a).field_111752_af));
      C_101160_ask.func_104231_b(this.field_105868_a).field_103911_e = C_100361_be.func_107654_a().func_107651_b("gui.done");
      C_101160_ask.func_104232_a(this.field_105868_a).func_111684_b();
   }

   protected boolean func_105831_a(int var1) {
      return ((String)this.field_105867_b.get(var1)).equals(C_100361_be.func_107654_a().func_107657_c());
   }

   protected int func_105822_d() {
      return this.func_105830_a() * 18;
   }

   protected void func_105833_b() {
      this.field_105868_a.func_104035_z_();
   }

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      this.field_105868_a.field_104049_k.func_111797_b(true);
      this.field_105868_a.func_103879_a(this.field_105868_a.field_104049_k, (String)this.field_105869_h.get(this.field_105867_b.get(var1)), this.field_105868_a.field_104044_f / 2, var3 + 1, 16777215);
      this.field_105868_a.field_104049_k.func_111797_b(C_100361_be.func_107648_e(C_101160_ask.func_104232_a(this.field_105868_a).field_111752_af));
   }
}
