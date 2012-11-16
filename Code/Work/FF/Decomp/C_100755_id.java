import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C_100755_id implements C_101331_yx {

   private Set field_108694_b = new HashSet();
   private C_101272_za field_108695_c;
   private C_101331_yx field_108692_d;
   private C_101262_zf field_108693_e;
   public boolean field_108696_a = true;
   private C_100653_jt field_108690_f = new C_100653_jt();
   private List field_108691_g = new ArrayList();
   private C_100765_ie field_108697_h;


   public C_100755_id(C_100765_ie var1, C_101262_zf var2, C_101331_yx var3) {
      this.field_108695_c = new C_101276_yz(var1, 0, 0);
      this.field_108697_h = var1;
      this.field_108693_e = var2;
      this.field_108692_d = var3;
   }

   public boolean func_108656_a(int var1, int var2) {
      return this.field_108690_f.func_108951_b(C_100858_wx.func_110234_a(var1, var2));
   }

   public void func_108687_b(int var1, int var2) {
      if(this.field_108697_h.field_109576_v.func_112388_e()) {
         C_100013_k var3 = this.field_108697_h.func_109381_G();
         int var4 = var1 * 16 + 8 - var3.field_105273_a;
         int var5 = var2 * 16 + 8 - var3.field_105272_c;
         short var6 = 128;
         if(var4 < -var6 || var4 > var6 || var5 < -var6 || var5 > var6) {
            this.field_108694_b.add(Long.valueOf(C_100858_wx.func_110234_a(var1, var2)));
         }
      } else {
         this.field_108694_b.add(Long.valueOf(C_100858_wx.func_110234_a(var1, var2)));
      }

   }

   public void func_108685_a() {
      Iterator var1 = this.field_108691_g.iterator();

      while(var1.hasNext()) {
         C_101272_za var2 = (C_101272_za)var1.next();
         this.func_108687_b(var2.field_112336_g, var2.field_112348_h);
      }

   }

   public C_101272_za func_108660_c(int var1, int var2) {
      long var3 = C_100858_wx.func_110234_a(var1, var2);
      this.field_108694_b.remove(Long.valueOf(var3));
      C_101272_za var5 = (C_101272_za)this.field_108690_f.func_108954_a(var3);
      if(var5 == null) {
         var5 = this.func_108688_f(var1, var2);
         if(var5 == null) {
            if(this.field_108692_d == null) {
               var5 = this.field_108695_c;
            } else {
               var5 = this.field_108692_d.func_108657_d(var1, var2);
            }
         }

         this.field_108690_f.func_108953_a(var3, var5);
         this.field_108691_g.add(var5);
         if(var5 != null) {
            var5.func_112331_c();
         }

         var5.func_112288_a(this, this, var1, var2);
      }

      return var5;
   }

   public C_101272_za func_108657_d(int var1, int var2) {
      C_101272_za var3 = (C_101272_za)this.field_108690_f.func_108954_a(C_100858_wx.func_110234_a(var1, var2));
      return var3 == null?(!this.field_108697_h.field_109548_A && !this.field_108696_a?this.field_108695_c:this.func_108660_c(var1, var2)):var3;
   }

   private C_101272_za func_108688_f(int var1, int var2) {
      if(this.field_108693_e == null) {
         return null;
      } else {
         try {
            C_101272_za var3 = this.field_108693_e.func_107055_a(this.field_108697_h, var1, var2);
            if(var3 != null) {
               var3.field_112342_n = this.field_108697_h.func_109463_E();
               if(this.field_108692_d != null) {
                  this.field_108692_d.func_108662_e(var1, var2);
               }
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   private void func_108686_a(C_101272_za var1) {
      if(this.field_108693_e != null) {
         try {
            this.field_108693_e.func_107059_b(this.field_108697_h, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   private void func_108689_b(C_101272_za var1) {
      if(this.field_108693_e != null) {
         try {
            var1.field_112342_n = this.field_108697_h.func_109463_E();
            this.field_108693_e.func_107057_a(this.field_108697_h, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         } catch (C_100829_xj var4) {
            var4.printStackTrace();
         }

      }
   }

   public void func_108666_a(C_101331_yx var1, int var2, int var3) {
      C_101272_za var4 = this.func_108657_d(var2, var3);
      if(!var4.field_112347_k) {
         var4.field_112347_k = true;
         if(this.field_108692_d != null) {
            this.field_108692_d.func_108666_a(var1, var2, var3);
            var4.func_112329_e();
         }
      }

   }

   public boolean func_108661_a(boolean var1, C_100683_ka var2) {
      int var3 = 0;
      Iterator var4 = this.field_108691_g.iterator();

      while(var4.hasNext()) {
         C_101272_za var5 = (C_101272_za)var4.next();
         if(var1) {
            this.func_108686_a(var5);
         }

         if(var5.func_112302_a(var1)) {
            this.func_108689_b(var5);
            var5.field_112344_l = false;
            ++var3;
            if(var3 == 24 && !var1) {
               return false;
            }
         }
      }

      if(var1) {
         if(this.field_108693_e == null) {
            return true;
         }

         this.field_108693_e.func_107058_b();
      }

      return true;
   }

   public boolean func_108664_b() {
      if(!this.field_108697_h.field_109621_c) {
         for(int var1 = 0; var1 < 100; ++var1) {
            if(!this.field_108694_b.isEmpty()) {
               Long var2 = (Long)this.field_108694_b.iterator().next();
               C_101272_za var3 = (C_101272_za)this.field_108690_f.func_108954_a(var2.longValue());
               var3.func_112323_d();
               this.func_108689_b(var3);
               this.func_108686_a(var3);
               this.field_108694_b.remove(var2);
               this.field_108690_f.func_108950_d(var2.longValue());
               this.field_108691_g.remove(var3);
            }
         }

         if(this.field_108693_e != null) {
            this.field_108693_e.func_107056_a();
         }
      }

      return this.field_108692_d.func_108664_b();
   }

   public boolean func_108665_c() {
      return !this.field_108697_h.field_109621_c;
   }

   public String func_108655_d() {
      return "ServerChunkCache: " + this.field_108690_f.func_108952_a() + " Drop: " + this.field_108694_b.size();
   }

   public List func_108659_a(C_100594_lo var1, int var2, int var3, int var4) {
      return this.field_108692_d.func_108659_a(var1, var2, var3, var4);
   }

   public C_100851_xw func_108663_a(C_100873_xe var1, String var2, int var3, int var4, int var5) {
      return this.field_108692_d.func_108663_a(var1, var2, var3, var4, var5);
   }

   public int func_108658_e() {
      return this.field_108690_f.func_108952_a();
   }

   public void func_108662_e(int var1, int var2) {}
}
