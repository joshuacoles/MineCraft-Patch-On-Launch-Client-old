import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class C_100864_xb {

   private TreeMap field_110285_a = new TreeMap();


   public C_100864_xb() {
      this.func_110284_a("doFireTick", "true");
      this.func_110284_a("mobGriefing", "true");
      this.func_110284_a("keepInventory", "false");
      this.func_110284_a("doMobSpawning", "true");
      this.func_110284_a("doMobLoot", "true");
      this.func_110284_a("doTileDrops", "true");
      this.func_110284_a("commandBlockOutput", "true");
   }

   public void func_110284_a(String var1, String var2) {
      this.field_110285_a.put(var1, new C_100863_xc(var2));
   }

   public void func_110278_b(String var1, String var2) {
      C_100863_xc var3 = (C_100863_xc)this.field_110285_a.get(var1);
      if(var3 != null) {
         var3.func_110271_a(var2);
      } else {
         this.func_110284_a(var1, var2);
      }

   }

   public String func_110283_a(String var1) {
      C_100863_xc var2 = (C_100863_xc)this.field_110285_a.get(var1);
      return var2 != null?var2.func_110270_a():"";
   }

   public boolean func_110281_b(String var1) {
      C_100863_xc var2 = (C_100863_xc)this.field_110285_a.get(var1);
      return var2 != null?var2.func_110272_b():false;
   }

   public C_100353_bh func_110282_a() {
      C_100353_bh var1 = new C_100353_bh("GameRules");
      Iterator var2 = this.field_110285_a.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         C_100863_xc var4 = (C_100863_xc)this.field_110285_a.get(var3);
         var1.func_107533_a(var3, var4.func_110270_a());
      }

      return var1;
   }

   public void func_110280_a(C_100353_bh var1) {
      Collection var2 = var1.func_107510_c();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         C_100331_bu var4 = (C_100331_bu)var3.next();
         String var5 = var4.func_107492_e();
         String var6 = var1.func_107534_i(var4.func_107492_e());
         this.func_110278_b(var5, var6);
      }

   }

   public String[] func_110277_b() {
      return (String[])this.field_110285_a.keySet().toArray(new String[0]);
   }

   public boolean func_110279_e(String var1) {
      return this.field_110285_a.containsKey(var1);
   }
}
