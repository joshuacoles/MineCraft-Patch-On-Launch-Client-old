import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C_101285_zx implements C_101331_yx {

   private C_100873_xe field_108732_a;
   private Random field_108730_b;
   private final byte[] field_108731_c = new byte[256];
   private final byte[] field_108728_d = new byte[256];
   private final C_100511_abl field_108729_e;
   private final List field_108726_f = new ArrayList();
   private final boolean field_108727_g;
   private final boolean field_108734_h;
   private C_100578_aav field_108735_i;
   private C_100578_aav field_108733_j;


   public C_101285_zx(C_100873_xe var1, long var2, boolean var4, String var5) {
      this.field_108732_a = var1;
      this.field_108730_b = new Random(var2);
      this.field_108729_e = C_100511_abl.func_108261_a(var5);
      if(var4) {
         Map var6 = this.field_108729_e.func_108253_b();
         if(var6.containsKey("village")) {
            Map var7 = (Map)var6.get("village");
            if(!var7.containsKey("size")) {
               var7.put("size", "1");
            }

            this.field_108726_f.add(new C_100756_aea(var7));
         }

         if(var6.containsKey("biome_1")) {
            this.field_108726_f.add(new C_100777_acq((Map)var6.get("biome_1")));
         }

         if(var6.containsKey("mineshaft")) {
            this.field_108726_f.add(new C_100518_abp((Map)var6.get("mineshaft")));
         }

         if(var6.containsKey("stronghold")) {
            this.field_108726_f.add(new C_100816_acz((Map)var6.get("stronghold")));
         }
      }

      this.field_108727_g = this.field_108729_e.func_108253_b().containsKey("decoration");
      if(this.field_108729_e.func_108253_b().containsKey("lake")) {
         this.field_108735_i = new C_100578_aav(C_100451_alf.field_106072_E.field_106162_cm);
      }

      if(this.field_108729_e.func_108253_b().containsKey("lava_lake")) {
         this.field_108733_j = new C_100578_aav(C_100451_alf.field_106074_G.field_106162_cm);
      }

      this.field_108734_h = this.field_108729_e.func_108253_b().containsKey("dungeon");
      Iterator var9 = this.field_108729_e.func_108259_c().iterator();

      while(var9.hasNext()) {
         C_100513_abm var10 = (C_100513_abm)var9.next();

         for(int var8 = var10.func_108270_d(); var8 < var10.func_108270_d() + var10.func_108271_a(); ++var8) {
            this.field_108731_c[var8] = (byte)(var10.func_108273_b() & 255);
            this.field_108728_d[var8] = (byte)var10.func_108272_c();
         }
      }

   }

   public C_101272_za func_108660_c(int var1, int var2) {
      return this.func_108657_d(var1, var2);
   }

   public C_101272_za func_108657_d(int var1, int var2) {
      C_101272_za var3 = new C_101272_za(this.field_108732_a, var1, var2);

      for(int var4 = 0; var4 < this.field_108731_c.length; ++var4) {
         int var5 = var4 >> 4;
         C_101265_zb var6 = var3.func_112310_i()[var5];
         if(var6 == null) {
            var6 = new C_101265_zb(var4);
            var3.func_112310_i()[var5] = var6;
         }

         for(int var7 = 0; var7 < 16; ++var7) {
            for(int var8 = 0; var8 < 16; ++var8) {
               var6.func_112251_a(var7, var4 & 15, var8, this.field_108731_c[var4] & 255);
               var6.func_112250_b(var7, var4 & 15, var8, this.field_108728_d[var4]);
            }
         }
      }

      var3.func_112305_b();
      C_101324_xz[] var9 = this.field_108732_a.func_109465_s().func_112526_b((C_101324_xz[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var10 = var3.func_112306_m();

      for(int var11 = 0; var11 < var10.length; ++var11) {
         var10[var11] = (byte)var9[var11].field_112478_N;
      }

      Iterator var12 = this.field_108726_f.iterator();

      while(var12.hasNext()) {
         C_100766_adw var13 = (C_100766_adw)var12.next();
         var13.func_108342_a(this, this.field_108732_a, var1, var2, (byte[])null);
      }

      var3.func_112305_b();
      return var3;
   }

   public boolean func_108656_a(int var1, int var2) {
      return true;
   }

   public void func_108666_a(C_101331_yx var1, int var2, int var3) {
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      C_101324_xz var6 = this.field_108732_a.func_109362_a(var4 + 16, var5 + 16);
      boolean var7 = false;
      this.field_108730_b.setSeed(this.field_108732_a.func_109374_D());
      long var8 = this.field_108730_b.nextLong() / 2L * 2L + 1L;
      long var10 = this.field_108730_b.nextLong() / 2L * 2L + 1L;
      this.field_108730_b.setSeed((long)var2 * var8 + (long)var3 * var10 ^ this.field_108732_a.func_109374_D());
      Iterator var12 = this.field_108726_f.iterator();

      while(var12.hasNext()) {
         C_100766_adw var13 = (C_100766_adw)var12.next();
         boolean var14 = var13.func_108356_a(this.field_108732_a, this.field_108730_b, var2, var3);
         if(var13 instanceof C_100756_aea) {
            var7 |= var14;
         }
      }

      int var17;
      int var16;
      int var18;
      if(this.field_108735_i != null && !var7 && this.field_108730_b.nextInt(4) == 0) {
         var16 = var4 + this.field_108730_b.nextInt(16) + 8;
         var17 = this.field_108730_b.nextInt(128);
         var18 = var5 + this.field_108730_b.nextInt(16) + 8;
         this.field_108735_i.func_107965_a(this.field_108732_a, this.field_108730_b, var16, var17, var18);
      }

      if(this.field_108733_j != null && !var7 && this.field_108730_b.nextInt(8) == 0) {
         var16 = var4 + this.field_108730_b.nextInt(16) + 8;
         var17 = this.field_108730_b.nextInt(this.field_108730_b.nextInt(120) + 8);
         var18 = var5 + this.field_108730_b.nextInt(16) + 8;
         if(var17 < 63 || this.field_108730_b.nextInt(10) == 0) {
            this.field_108733_j.func_107965_a(this.field_108732_a, this.field_108730_b, var16, var17, var18);
         }
      }

      if(this.field_108734_h) {
         for(var16 = 0; var16 < 8; ++var16) {
            var17 = var4 + this.field_108730_b.nextInt(16) + 8;
            var18 = this.field_108730_b.nextInt(128);
            int var15 = var5 + this.field_108730_b.nextInt(16) + 8;
            (new C_100586_aay()).func_107965_a(this.field_108732_a, this.field_108730_b, var17, var18, var15);
         }
      }

      if(this.field_108727_g) {
         var6.func_112456_a(this.field_108732_a, this.field_108730_b, var4, var5);
      }

   }

   public boolean func_108661_a(boolean var1, C_100683_ka var2) {
      return true;
   }

   public boolean func_108664_b() {
      return false;
   }

   public boolean func_108665_c() {
      return true;
   }

   public String func_108655_d() {
      return "FlatLevelSource";
   }

   public List func_108659_a(C_100594_lo var1, int var2, int var3, int var4) {
      C_101324_xz var5 = this.field_108732_a.func_109362_a(var2, var4);
      return var5 == null?null:var5.func_112460_a(var1);
   }

   public C_100851_xw func_108663_a(C_100873_xe var1, String var2, int var3, int var4, int var5) {
      if("Stronghold".equals(var2)) {
         Iterator var6 = this.field_108726_f.iterator();

         while(var6.hasNext()) {
            C_100766_adw var7 = (C_100766_adw)var6.next();
            if(var7 instanceof C_100816_acz) {
               return var7.func_108358_a(var1, var3, var4, var5);
            }
         }
      }

      return null;
   }

   public int func_108658_e() {
      return 0;
   }

   public void func_108662_e(int var1, int var2) {
      Iterator var3 = this.field_108726_f.iterator();

      while(var3.hasNext()) {
         C_100766_adw var4 = (C_100766_adw)var3.next();
         var4.func_108342_a(this, this.field_108732_a, var1, var2, (byte[])null);
      }

   }
}
