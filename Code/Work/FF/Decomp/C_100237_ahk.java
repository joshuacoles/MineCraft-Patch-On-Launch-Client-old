import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C_100237_ahk {

   private C_100268_agw field_107078_a;
   private Map field_107076_b = new HashMap();
   private List field_107077_c = new ArrayList();
   private Map field_107075_d = new HashMap();


   public C_100237_ahk(C_100268_agw var1) {
      this.field_107078_a = var1;
      this.func_107072_b();
   }

   public C_100304_ago func_107070_a(Class var1, String var2) {
      C_100304_ago var3 = (C_100304_ago)this.field_107076_b.get(var2);
      if(var3 != null) {
         return var3;
      } else {
         if(this.field_107078_a != null) {
            try {
               File var4 = this.field_107078_a.func_107089_b(var2);
               if(var4 != null && var4.exists()) {
                  try {
                     var3 = (C_100304_ago)var1.getConstructor(new Class[]{String.class}).newInstance(new Object[]{var2});
                  } catch (Exception var7) {
                     throw new RuntimeException("Failed to instantiate " + var1.toString(), var7);
                  }

                  FileInputStream var5 = new FileInputStream(var4);
                  C_100353_bh var6 = C_100329_br.func_107545_a(var5);
                  var5.close();
                  var3.func_107261_a(var6.func_107521_l("data"));
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         if(var3 != null) {
            this.field_107076_b.put(var2, var3);
            this.field_107077_c.add(var3);
         }

         return var3;
      }
   }

   public void func_107073_a(String var1, C_100304_ago var2) {
      if(var2 == null) {
         throw new RuntimeException("Can\'t set null data");
      } else {
         if(this.field_107076_b.containsKey(var1)) {
            this.field_107077_c.remove(this.field_107076_b.remove(var1));
         }

         this.field_107076_b.put(var1, var2);
         this.field_107077_c.add(var2);
      }
   }

   public void func_107071_a() {
      Iterator var1 = this.field_107077_c.iterator();

      while(var1.hasNext()) {
         C_100304_ago var2 = (C_100304_ago)var1.next();
         if(var2.func_107262_d()) {
            this.func_107074_a(var2);
            var2.func_107263_a(false);
         }
      }

   }

   private void func_107074_a(C_100304_ago var1) {
      if(this.field_107078_a != null) {
         try {
            File var2 = this.field_107078_a.func_107089_b(var1.field_107267_h);
            if(var2 != null) {
               C_100353_bh var3 = new C_100353_bh();
               var1.func_107265_b(var3);
               C_100353_bh var4 = new C_100353_bh();
               var4.func_107538_a("data", var3);
               FileOutputStream var5 = new FileOutputStream(var2);
               C_100329_br.func_107551_a(var4, var5);
               var5.close();
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }

      }
   }

   private void func_107072_b() {
      try {
         this.field_107075_d.clear();
         if(this.field_107078_a == null) {
            return;
         }

         File var1 = this.field_107078_a.func_107089_b("idcounts");
         if(var1 != null && var1.exists()) {
            DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
            C_100353_bh var3 = C_100329_br.func_107546_a(var2);
            var2.close();
            Iterator var4 = var3.func_107510_c().iterator();

            while(var4.hasNext()) {
               C_100331_bu var5 = (C_100331_bu)var4.next();
               if(var5 instanceof C_100327_bs) {
                  C_100327_bs var6 = (C_100327_bs)var5;
                  String var7 = var6.func_107492_e();
                  short var8 = var6.field_107541_a;
                  this.field_107075_d.put(var7, Short.valueOf(var8));
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public int func_107069_a(String var1) {
      Short var2 = (Short)this.field_107075_d.get(var1);
      if(var2 == null) {
         var2 = Short.valueOf((short)0);
      } else {
         var2 = Short.valueOf((short)(var2.shortValue() + 1));
      }

      this.field_107075_d.put(var1, var2);
      if(this.field_107078_a == null) {
         return var2.shortValue();
      } else {
         try {
            File var3 = this.field_107078_a.func_107089_b("idcounts");
            if(var3 != null) {
               C_100353_bh var4 = new C_100353_bh();
               Iterator var5 = this.field_107075_d.keySet().iterator();

               while(var5.hasNext()) {
                  String var6 = (String)var5.next();
                  short var7 = ((Short)this.field_107075_d.get(var6)).shortValue();
                  var4.func_107532_a(var6, var7);
               }

               DataOutputStream var9 = new DataOutputStream(new FileOutputStream(var3));
               C_100329_br.func_107543_a(var4, var9);
               var9.close();
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         return var2.shortValue();
      }
   }
}
