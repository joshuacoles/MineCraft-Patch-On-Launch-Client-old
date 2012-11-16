import java.util.HashMap;
import java.util.Iterator;

class C_101192_apq extends HashMap {

   // $FF: synthetic field
   final C_101191_app field_111927_a;


   C_101192_apq(C_101191_app var1) {
      this.field_111927_a = var1;
      Iterator var2 = C_101191_app.func_107385_a(this.field_111927_a).iterator();

      while(var2.hasNext()) {
         C_101166_aoo var3 = (C_101166_aoo)var2.next();
         this.put(var3.func_111873_b(), var3.func_111874_c());
      }

   }
}
