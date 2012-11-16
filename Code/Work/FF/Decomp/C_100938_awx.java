import java.util.ArrayList;
import java.util.List;

public class C_100938_awx implements C_101331_yx {

   private C_101272_za field_108702_a;
   private C_100653_jt field_108700_b = new C_100653_jt();
   private List field_108701_c = new ArrayList();
   private C_100873_xe field_108699_d;


   public C_100938_awx(C_100873_xe var1) {
      this.field_108702_a = new C_101276_yz(var1, 0, 0);
      this.field_108699_d = var1;
   }

   public boolean func_108656_a(int var1, int var2) {
      return true;
   }

   public void func_108698_b(int var1, int var2) {
      C_101272_za var3 = this.func_108657_d(var1, var2);
      if(!var3.func_112320_g()) {
         var3.func_112323_d();
      }

      this.field_108700_b.func_108950_d(C_100858_wx.func_110234_a(var1, var2));
      this.field_108701_c.remove(var3);
   }

   public C_101272_za func_108660_c(int var1, int var2) {
      C_101272_za var3 = new C_101272_za(this.field_108699_d, var1, var2);
      this.field_108700_b.func_108953_a(C_100858_wx.func_110234_a(var1, var2), var3);
      var3.field_112337_d = true;
      return var3;
   }

   public C_101272_za func_108657_d(int var1, int var2) {
      C_101272_za var3 = (C_101272_za)this.field_108700_b.func_108954_a(C_100858_wx.func_110234_a(var1, var2));
      return var3 == null?this.field_108702_a:var3;
   }

   public boolean func_108661_a(boolean var1, C_100683_ka var2) {
      return true;
   }

   public boolean func_108664_b() {
      return false;
   }

   public boolean func_108665_c() {
      return false;
   }

   public void func_108666_a(C_101331_yx var1, int var2, int var3) {}

   public String func_108655_d() {
      return "MultiplayerChunkCache: " + this.field_108700_b.func_108952_a();
   }

   public List func_108659_a(C_100594_lo var1, int var2, int var3, int var4) {
      return null;
   }

   public C_100851_xw func_108663_a(C_100873_xe var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public int func_108658_e() {
      return this.field_108701_c.size();
   }

   public void func_108662_e(int var1, int var2) {}
}
