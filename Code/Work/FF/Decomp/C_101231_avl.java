import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class C_101231_avl {

   public float field_112034_p;
   public boolean field_112032_q = false;
   public List field_112031_r = new ArrayList();
   public boolean field_112030_s = true;
   private Map field_112033_a = new HashMap();
   public int field_112029_t = 64;
   public int field_112028_u = 32;


   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {}

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {}

   protected void func_112023_a(String var1, int var2, int var3) {
      this.field_112033_a.put(var1, new C_101255_awq(var2, var3));
   }

   public C_101255_awq func_112026_a(String var1) {
      return (C_101255_awq)this.field_112033_a.get(var1);
   }
}
