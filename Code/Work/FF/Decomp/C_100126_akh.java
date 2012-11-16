import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class C_100126_akh {

   private C_100873_xe field_106496_b;
   private int field_106497_c;
   private int field_106494_d;
   private int field_106495_e;
   private final boolean field_106492_f;
   private List field_106493_g;
   // $FF: synthetic field
   final C_100127_akg field_106498_a;


   public C_100126_akh(C_100127_akg var1, C_100873_xe var2, int var3, int var4, int var5) {
      this.field_106498_a = var1;
      this.field_106493_g = new ArrayList();
      this.field_106496_b = var2;
      this.field_106497_c = var3;
      this.field_106494_d = var4;
      this.field_106495_e = var5;
      int var6 = var2.func_109349_a(var3, var4, var5);
      int var7 = var2.func_109357_g(var3, var4, var5);
      if(C_100127_akg.func_106260_a((C_100127_akg)C_100451_alf.field_106118_p[var6])) {
         this.field_106492_f = true;
         var7 &= -9;
      } else {
         this.field_106492_f = false;
      }

      this.func_106486_a(var7);
   }

   private void func_106486_a(int var1) {
      this.field_106493_g.clear();
      if(var1 == 0) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1));
      } else if(var1 == 1) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e));
      } else if(var1 == 2) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c + 1, this.field_106494_d + 1, this.field_106495_e));
      } else if(var1 == 3) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c - 1, this.field_106494_d + 1, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e));
      } else if(var1 == 4) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d + 1, this.field_106495_e - 1));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1));
      } else if(var1 == 5) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d + 1, this.field_106495_e + 1));
      } else if(var1 == 6) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1));
      } else if(var1 == 7) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1));
      } else if(var1 == 8) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1));
      } else if(var1 == 9) {
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e));
         this.field_106493_g.add(new C_100851_xw(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1));
      }

   }

   private void func_106485_a() {
      for(int var1 = 0; var1 < this.field_106493_g.size(); ++var1) {
         C_100126_akh var2 = this.func_106482_a((C_100851_xw)this.field_106493_g.get(var1));
         if(var2 != null && var2.func_106487_b(this)) {
            this.field_106493_g.set(var1, new C_100851_xw(var2.field_106497_c, var2.field_106494_d, var2.field_106495_e));
         } else {
            this.field_106493_g.remove(var1--);
         }
      }

   }

   private boolean func_106483_a(int var1, int var2, int var3) {
      return C_100127_akg.func_106258_e_(this.field_106496_b, var1, var2, var3)?true:(C_100127_akg.func_106258_e_(this.field_106496_b, var1, var2 + 1, var3)?true:C_100127_akg.func_106258_e_(this.field_106496_b, var1, var2 - 1, var3));
   }

   private C_100126_akh func_106482_a(C_100851_xw var1) {
      return C_100127_akg.func_106258_e_(this.field_106496_b, var1.field_110207_a, var1.field_110205_b, var1.field_110206_c)?new C_100126_akh(this.field_106498_a, this.field_106496_b, var1.field_110207_a, var1.field_110205_b, var1.field_110206_c):(C_100127_akg.func_106258_e_(this.field_106496_b, var1.field_110207_a, var1.field_110205_b + 1, var1.field_110206_c)?new C_100126_akh(this.field_106498_a, this.field_106496_b, var1.field_110207_a, var1.field_110205_b + 1, var1.field_110206_c):(C_100127_akg.func_106258_e_(this.field_106496_b, var1.field_110207_a, var1.field_110205_b - 1, var1.field_110206_c)?new C_100126_akh(this.field_106498_a, this.field_106496_b, var1.field_110207_a, var1.field_110205_b - 1, var1.field_110206_c):null));
   }

   private boolean func_106487_b(C_100126_akh var1) {
      Iterator var2 = this.field_106493_g.iterator();

      C_100851_xw var3;
      do {
         if(!var2.hasNext()) {
            return false;
         }

         var3 = (C_100851_xw)var2.next();
      } while(var3.field_110207_a != var1.field_106497_c || var3.field_110206_c != var1.field_106495_e);

      return true;
   }

   private boolean func_106488_b(int var1, int var2, int var3) {
      Iterator var4 = this.field_106493_g.iterator();

      C_100851_xw var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (C_100851_xw)var4.next();
      } while(var5.field_110207_a != var1 || var5.field_110206_c != var3);

      return true;
   }

   private int func_106489_b() {
      int var1 = 0;
      if(this.func_106483_a(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1)) {
         ++var1;
      }

      if(this.func_106483_a(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1)) {
         ++var1;
      }

      if(this.func_106483_a(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e)) {
         ++var1;
      }

      if(this.func_106483_a(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e)) {
         ++var1;
      }

      return var1;
   }

   private boolean func_106481_c(C_100126_akh var1) {
      if(this.func_106487_b(var1)) {
         return true;
      } else if(this.field_106493_g.size() == 2) {
         return false;
      } else if(this.field_106493_g.isEmpty()) {
         return true;
      } else {
         C_100851_xw var2 = (C_100851_xw)this.field_106493_g.get(0);
         return true;
      }
   }

   private void func_106480_d(C_100126_akh var1) {
      this.field_106493_g.add(new C_100851_xw(var1.field_106497_c, var1.field_106494_d, var1.field_106495_e));
      boolean var2 = this.func_106488_b(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1);
      boolean var3 = this.func_106488_b(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1);
      boolean var4 = this.func_106488_b(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e);
      boolean var5 = this.func_106488_b(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e);
      byte var6 = -1;
      if(var2 || var3) {
         var6 = 0;
      }

      if(var4 || var5) {
         var6 = 1;
      }

      if(!this.field_106492_f) {
         if(var3 && var5 && !var2 && !var4) {
            var6 = 6;
         }

         if(var3 && var4 && !var2 && !var5) {
            var6 = 7;
         }

         if(var2 && var4 && !var3 && !var5) {
            var6 = 8;
         }

         if(var2 && var5 && !var3 && !var4) {
            var6 = 9;
         }
      }

      if(var6 == 0) {
         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c, this.field_106494_d + 1, this.field_106495_e - 1)) {
            var6 = 4;
         }

         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c, this.field_106494_d + 1, this.field_106495_e + 1)) {
            var6 = 5;
         }
      }

      if(var6 == 1) {
         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c + 1, this.field_106494_d + 1, this.field_106495_e)) {
            var6 = 2;
         }

         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c - 1, this.field_106494_d + 1, this.field_106495_e)) {
            var6 = 3;
         }
      }

      if(var6 < 0) {
         var6 = 0;
      }

      int var7 = var6;
      if(this.field_106492_f) {
         var7 = this.field_106496_b.func_109357_g(this.field_106497_c, this.field_106494_d, this.field_106495_e) & 8 | var6;
      }

      this.field_106496_b.func_109488_c(this.field_106497_c, this.field_106494_d, this.field_106495_e, var7);
   }

   private boolean func_106484_c(int var1, int var2, int var3) {
      C_100126_akh var4 = this.func_106482_a(new C_100851_xw(var1, var2, var3));
      if(var4 == null) {
         return false;
      } else {
         var4.func_106485_a();
         return var4.func_106481_c(this);
      }
   }

   public void func_106491_a(boolean var1, boolean var2) {
      boolean var3 = this.func_106484_c(this.field_106497_c, this.field_106494_d, this.field_106495_e - 1);
      boolean var4 = this.func_106484_c(this.field_106497_c, this.field_106494_d, this.field_106495_e + 1);
      boolean var5 = this.func_106484_c(this.field_106497_c - 1, this.field_106494_d, this.field_106495_e);
      boolean var6 = this.func_106484_c(this.field_106497_c + 1, this.field_106494_d, this.field_106495_e);
      byte var7 = -1;
      if((var3 || var4) && !var5 && !var6) {
         var7 = 0;
      }

      if((var5 || var6) && !var3 && !var4) {
         var7 = 1;
      }

      if(!this.field_106492_f) {
         if(var4 && var6 && !var3 && !var5) {
            var7 = 6;
         }

         if(var4 && var5 && !var3 && !var6) {
            var7 = 7;
         }

         if(var3 && var5 && !var4 && !var6) {
            var7 = 8;
         }

         if(var3 && var6 && !var4 && !var5) {
            var7 = 9;
         }
      }

      if(var7 == -1) {
         if(var3 || var4) {
            var7 = 0;
         }

         if(var5 || var6) {
            var7 = 1;
         }

         if(!this.field_106492_f) {
            if(var1) {
               if(var4 && var6) {
                  var7 = 6;
               }

               if(var5 && var4) {
                  var7 = 7;
               }

               if(var6 && var3) {
                  var7 = 9;
               }

               if(var3 && var5) {
                  var7 = 8;
               }
            } else {
               if(var3 && var5) {
                  var7 = 8;
               }

               if(var6 && var3) {
                  var7 = 9;
               }

               if(var5 && var4) {
                  var7 = 7;
               }

               if(var4 && var6) {
                  var7 = 6;
               }
            }
         }
      }

      if(var7 == 0) {
         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c, this.field_106494_d + 1, this.field_106495_e - 1)) {
            var7 = 4;
         }

         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c, this.field_106494_d + 1, this.field_106495_e + 1)) {
            var7 = 5;
         }
      }

      if(var7 == 1) {
         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c + 1, this.field_106494_d + 1, this.field_106495_e)) {
            var7 = 2;
         }

         if(C_100127_akg.func_106258_e_(this.field_106496_b, this.field_106497_c - 1, this.field_106494_d + 1, this.field_106495_e)) {
            var7 = 3;
         }
      }

      if(var7 < 0) {
         var7 = 0;
      }

      this.func_106486_a(var7);
      int var8 = var7;
      if(this.field_106492_f) {
         var8 = this.field_106496_b.func_109357_g(this.field_106497_c, this.field_106494_d, this.field_106495_e) & 8 | var7;
      }

      if(var2 || this.field_106496_b.func_109357_g(this.field_106497_c, this.field_106494_d, this.field_106495_e) != var8) {
         this.field_106496_b.func_109488_c(this.field_106497_c, this.field_106494_d, this.field_106495_e, var8);
         Iterator var9 = this.field_106493_g.iterator();

         while(var9.hasNext()) {
            C_100851_xw var10 = (C_100851_xw)var9.next();
            C_100126_akh var11 = this.func_106482_a(var10);
            if(var11 != null) {
               var11.func_106485_a();
               if(var11.func_106481_c(this)) {
                  var11.func_106480_d(this);
               }
            }
         }
      }

   }

   // $FF: synthetic method
   static int func_106490_a(C_100126_akh var0) {
      return var0.func_106489_b();
   }
}
