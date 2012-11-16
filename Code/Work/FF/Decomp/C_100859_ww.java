import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

public class C_100859_ww extends ArrayList {

   public C_100859_ww() {}

   public C_100859_ww(C_100353_bh var1) {
      this.func_110241_a(var1);
   }

   public C_100892_wv func_110245_a(C_100994_tv var1, C_100994_tv var2, int var3) {
      if(var3 > 0 && var3 < this.size()) {
         C_100892_wv var6 = (C_100892_wv)this.get(var3);
         return var1.field_111397_c == var6.func_110665_a().field_111397_c && (var2 == null && !var6.func_110662_c() || var6.func_110662_c() && var2 != null && var6.func_110659_b().field_111397_c == var2.field_111397_c) && var1.field_111398_a >= var6.func_110665_a().field_111398_a && (!var6.func_110662_c() || var2.field_111398_a >= var6.func_110659_b().field_111398_a)?var6:null;
      } else {
         for(int var4 = 0; var4 < this.size(); ++var4) {
            C_100892_wv var5 = (C_100892_wv)this.get(var4);
            if(var1.field_111397_c == var5.func_110665_a().field_111397_c && var1.field_111398_a >= var5.func_110665_a().field_111398_a && (!var5.func_110662_c() && var2 == null || var5.func_110662_c() && var2 != null && var5.func_110659_b().field_111397_c == var2.field_111397_c && var2.field_111398_a >= var5.func_110659_b().field_111398_a)) {
               return var5;
            }
         }

         return null;
      }
   }

   public void func_110244_a(C_100892_wv var1) {
      for(int var2 = 0; var2 < this.size(); ++var2) {
         C_100892_wv var3 = (C_100892_wv)this.get(var2);
         if(var1.func_110658_a(var3)) {
            if(var1.func_110657_b(var3)) {
               this.set(var2, var1);
            }

            return;
         }
      }

      this.add(var1);
   }

   public void func_110240_a(DataOutputStream var1) {
      var1.writeByte((byte)(this.size() & 255));

      for(int var2 = 0; var2 < this.size(); ++var2) {
         C_100892_wv var3 = (C_100892_wv)this.get(var2);
         C_100219_dx.func_106555_a(var3.func_110665_a(), var1);
         C_100219_dx.func_106555_a(var3.func_110654_d(), var1);
         C_100994_tv var4 = var3.func_110659_b();
         var1.writeBoolean(var4 != null);
         if(var4 != null) {
            C_100219_dx.func_106555_a(var4, var1);
         }

         var1.writeBoolean(var3.func_110661_g());
      }

   }

   public static C_100859_ww func_110242_a(DataInputStream var0) {
      C_100859_ww var1 = new C_100859_ww();
      int var2 = var0.readByte() & 255;

      for(int var3 = 0; var3 < var2; ++var3) {
         C_100994_tv var4 = C_100219_dx.func_106540_c(var0);
         C_100994_tv var5 = C_100219_dx.func_106540_c(var0);
         C_100994_tv var6 = null;
         if(var0.readBoolean()) {
            var6 = C_100219_dx.func_106540_c(var0);
         }

         boolean var7 = var0.readBoolean();
         C_100892_wv var8 = new C_100892_wv(var4, var6, var5);
         if(var7) {
            var8.func_110663_h();
         }

         var1.add(var8);
      }

      return var1;
   }

   public void func_110241_a(C_100353_bh var1) {
      C_100339_bp var2 = var1.func_107513_m("Recipes");

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         this.add(new C_100892_wv(var4));
      }

   }

   public C_100353_bh func_110243_a() {
      C_100353_bh var1 = new C_100353_bh();
      C_100339_bp var2 = new C_100339_bp("Recipes");

      for(int var3 = 0; var3 < this.size(); ++var3) {
         C_100892_wv var4 = (C_100892_wv)this.get(var3);
         var2.func_107500_a(var4.func_110660_i());
      }

      var1.func_107530_a("Recipes", var2);
      return var1;
   }
}
