import java.util.Comparator;

class C_100923_vr implements Comparator {

   // $FF: synthetic field
   final C_100929_vq field_110733_a;


   C_100923_vr(C_100929_vq var1) {
      this.field_110733_a = var1;
   }

   public int func_110732_a(C_100925_vs var1, C_100925_vs var2) {
      return var1 instanceof C_100921_vu && var2 instanceof C_100919_vt?1:(var2 instanceof C_100921_vu && var1 instanceof C_100919_vt?-1:(var2.func_110722_a() < var1.func_110722_a()?-1:(var2.func_110722_a() > var1.func_110722_a()?1:0)));
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.func_110732_a((C_100925_vs)var1, (C_100925_vs)var2);
   }
}
