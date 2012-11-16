import java.util.List;
import java.util.Map;

public abstract class C_101168_aou {

   public abstract C_101188_apl func_107397_a();

   public abstract String func_107400_c();

   public abstract Map func_107399_d();

   public abstract List func_107395_b();

   public final String func_107396_a(Object ... var1) {
      return (String)this.func_107401_a(C_101178_apf.func_111899_a(var1), this, var1);
   }

   public final List func_107398_b(Object ... var1) {
      return (List)this.func_107401_a(C_101178_apf.func_111900_b(var1), this, var1);
   }

   private Object func_107401_a(C_101179_ape var1, C_101168_aou var2, Object[] var3) {
      try {
         return var1.func_111907_b(var2);
      } catch (C_101177_apa var5) {
         throw C_101181_apc.func_111893_a(var5, var3, C_101180_apd.func_111912_a(new C_101168_aou[]{var2}));
      }
   }
}
