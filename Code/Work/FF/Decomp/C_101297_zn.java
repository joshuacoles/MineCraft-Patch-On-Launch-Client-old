import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C_101297_zn implements C_100234_ahm, C_101262_zf {

   private List field_107068_a = new ArrayList();
   private Set field_107066_b = new HashSet();
   private Object field_107067_c = new Object();
   private final File field_107065_d;


   public C_101297_zn(File var1) {
      this.field_107065_d = var1;
   }

   public C_101272_za func_107055_a(C_100873_xe var1, int var2, int var3) {
      C_100353_bh var4 = null;
      C_100858_wx var5 = new C_100858_wx(var2, var3);
      Object var6 = this.field_107067_c;
      synchronized(this.field_107067_c) {
         if(this.field_107066_b.contains(var5)) {
            Iterator var7 = this.field_107068_a.iterator();

            while(var7.hasNext()) {
               C_101295_zo var8 = (C_101295_zo)var7.next();
               if(var8.field_112407_a.equals(var5)) {
                  var4 = var8.field_112406_b;
                  break;
               }
            }
         }
      }

      if(var4 == null) {
         DataInputStream var11 = C_101305_zm.func_112439_c(this.field_107065_d, var2, var3);
         if(var11 == null) {
            return null;
         }

         var4 = C_100329_br.func_107546_a(var11);
      }

      return this.func_107064_a(var1, var2, var3, var4);
   }

   protected C_101272_za func_107064_a(C_100873_xe var1, int var2, int var3, C_100353_bh var4) {
      if(!var4.func_107516_b("Level")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
         return null;
      } else if(!var4.func_107521_l("Level").func_107516_b("Sections")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
         return null;
      } else {
         C_101272_za var5 = this.func_107063_a(var1, var4.func_107521_l("Level"));
         if(!var5.func_112301_a(var2, var3)) {
            System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var5.field_112336_g + ", " + var5.field_112348_h + ")");
            var4.func_107520_a("xPos", var2);
            var4.func_107520_a("zPos", var3);
            var5 = this.func_107063_a(var1, var4.func_107521_l("Level"));
         }

         return var5;
      }
   }

   public void func_107057_a(C_100873_xe var1, C_101272_za var2) {
      var1.func_109485_C();

      try {
         C_100353_bh var3 = new C_100353_bh();
         C_100353_bh var4 = new C_100353_bh();
         var3.func_107530_a("Level", var4);
         this.func_107060_a(var2, var1, var4);
         this.func_107061_a(var2.func_112321_l(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   protected void func_107061_a(C_100858_wx var1, C_100353_bh var2) {
      Object var3 = this.field_107067_c;
      synchronized(this.field_107067_c) {
         if(this.field_107066_b.contains(var1)) {
            for(int var4 = 0; var4 < this.field_107068_a.size(); ++var4) {
               if(((C_101295_zo)this.field_107068_a.get(var4)).field_112407_a.equals(var1)) {
                  this.field_107068_a.set(var4, new C_101295_zo(var1, var2));
                  return;
               }
            }
         }

         this.field_107068_a.add(new C_101295_zo(var1, var2));
         this.field_107066_b.add(var1);
         C_100239_ahl.field_107086_a.func_107079_a(this);
      }
   }

   public boolean func_107054_c() {
      C_101295_zo var1 = null;
      Object var2 = this.field_107067_c;
      synchronized(this.field_107067_c) {
         if(this.field_107068_a.isEmpty()) {
            return false;
         }

         var1 = (C_101295_zo)this.field_107068_a.remove(0);
         this.field_107066_b.remove(var1.field_112407_a);
      }

      if(var1 != null) {
         try {
            this.func_107062_a(var1);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return true;
   }

   private void func_107062_a(C_101295_zo var1) {
      DataOutputStream var2 = C_101305_zm.func_112441_d(this.field_107065_d, var1.field_112407_a.field_110239_a, var1.field_112407_a.field_110238_b);
      C_100329_br.func_107543_a(var1.field_112406_b, var2);
      var2.close();
   }

   public void func_107059_b(C_100873_xe var1, C_101272_za var2) {}

   public void func_107056_a() {}

   public void func_107058_b() {}

   private void func_107060_a(C_101272_za var1, C_100873_xe var2, C_100353_bh var3) {
      var3.func_107520_a("xPos", var1.field_112336_g);
      var3.func_107520_a("zPos", var1.field_112348_h);
      var3.func_107525_a("LastUpdate", var2.func_109463_E());
      var3.func_107539_a("HeightMap", var1.field_112335_f);
      var3.func_107509_a("TerrainPopulated", var1.field_112347_k);
      C_101265_zb[] var4 = var1.func_112310_i();
      C_100339_bp var5 = new C_100339_bp("Sections");
      C_101265_zb[] var6 = var4;
      int var7 = var4.length;

      C_100353_bh var10;
      for(int var8 = 0; var8 < var7; ++var8) {
         C_101265_zb var9 = var6[var8];
         if(var9 != null) {
            var10 = new C_100353_bh();
            var10.func_107527_a("Y", (byte)(var9.func_112255_d() >> 4 & 255));
            var10.func_107526_a("Blocks", var9.func_112254_g());
            if(var9.func_112269_i() != null) {
               var10.func_107526_a("Add", var9.func_112269_i().field_112360_a);
            }

            var10.func_107526_a("Data", var9.func_112249_j().field_112360_a);
            var10.func_107526_a("SkyLight", var9.func_112261_l().field_112360_a);
            var10.func_107526_a("BlockLight", var9.func_112262_k().field_112360_a);
            var5.func_107500_a(var10);
         }
      }

      var3.func_107530_a("Sections", var5);
      var3.func_107526_a("Biomes", var1.func_112306_m());
      var1.field_112345_m = false;
      C_100339_bp var15 = new C_100339_bp();

      Iterator var17;
      for(var7 = 0; var7 < var1.field_112346_j.length; ++var7) {
         var17 = var1.field_112346_j[var7].iterator();

         while(var17.hasNext()) {
            C_100730_lb var19 = (C_100730_lb)var17.next();
            var1.field_112345_m = true;
            var10 = new C_100353_bh();
            if(var19.func_103074_c(var10)) {
               var15.func_107500_a(var10);
            }
         }
      }

      var3.func_107530_a("Entities", var15);
      C_100339_bp var16 = new C_100339_bp();
      var17 = var1.field_112349_i.values().iterator();

      while(var17.hasNext()) {
         C_100398_amm var21 = (C_100398_amm)var17.next();
         var10 = new C_100353_bh();
         var21.func_102915_b(var10);
         var16.func_107500_a(var10);
      }

      var3.func_107530_a("TileEntities", var16);
      List var18 = var2.func_109450_a(var1, false);
      if(var18 != null) {
         long var20 = var2.func_109463_E();
         C_100339_bp var11 = new C_100339_bp();
         Iterator var12 = var18.iterator();

         while(var12.hasNext()) {
            C_100855_xu var13 = (C_100855_xu)var12.next();
            C_100353_bh var14 = new C_100353_bh();
            var14.func_107520_a("i", var13.field_110213_d);
            var14.func_107520_a("x", var13.field_110217_a);
            var14.func_107520_a("y", var13.field_110215_b);
            var14.func_107520_a("z", var13.field_110216_c);
            var14.func_107520_a("t", (int)(var13.field_110214_e - var20));
            var11.func_107500_a(var14);
         }

         var3.func_107530_a("TileTicks", var11);
      }

   }

   private C_101272_za func_107063_a(C_100873_xe var1, C_100353_bh var2) {
      int var3 = var2.func_107514_e("xPos");
      int var4 = var2.func_107514_e("zPos");
      C_101272_za var5 = new C_101272_za(var1, var3, var4);
      var5.field_112335_f = var2.func_107511_k("HeightMap");
      var5.field_112347_k = var2.func_107519_n("TerrainPopulated");
      C_100339_bp var6 = var2.func_107513_m("Sections");
      byte var7 = 16;
      C_101265_zb[] var8 = new C_101265_zb[var7];

      for(int var9 = 0; var9 < var6.func_107501_c(); ++var9) {
         C_100353_bh var10 = (C_100353_bh)var6.func_107498_b(var9);
         byte var11 = var10.func_107524_c("Y");
         C_101265_zb var12 = new C_101265_zb(var11 << 4);
         var12.func_112258_a(var10.func_107523_j("Blocks"));
         if(var10.func_107516_b("Add")) {
            var12.func_112264_a(new C_101274_yy(var10.func_107523_j("Add"), 4));
         }

         var12.func_112248_b(new C_101274_yy(var10.func_107523_j("Data"), 4));
         var12.func_112256_d(new C_101274_yy(var10.func_107523_j("SkyLight"), 4));
         var12.func_112260_c(new C_101274_yy(var10.func_107523_j("BlockLight"), 4));
         var12.func_112265_e();
         var8[var11] = var12;
      }

      var5.func_112332_a(var8);
      if(var2.func_107516_b("Biomes")) {
         var5.func_112317_a(var2.func_107523_j("Biomes"));
      }

      C_100339_bp var14 = var2.func_107513_m("Entities");
      if(var14 != null) {
         for(int var17 = 0; var17 < var14.func_107501_c(); ++var17) {
            C_100353_bh var16 = (C_100353_bh)var14.func_107498_b(var17);
            C_100730_lb var18 = C_100727_lf.func_109309_a(var16, var1);
            var5.field_112345_m = true;
            if(var18 != null) {
               var5.func_112304_a(var18);
            }
         }
      }

      C_100339_bp var15 = var2.func_107513_m("TileEntities");
      if(var15 != null) {
         for(int var21 = 0; var21 < var15.func_107501_c(); ++var21) {
            C_100353_bh var20 = (C_100353_bh)var15.func_107498_b(var21);
            C_100398_amm var13 = C_100398_amm.func_102930_c(var20);
            if(var13 != null) {
               var5.func_112315_a(var13);
            }
         }
      }

      if(var2.func_107516_b("TileTicks")) {
         C_100339_bp var19 = var2.func_107513_m("TileTicks");
         if(var19 != null) {
            for(int var22 = 0; var22 < var19.func_107501_c(); ++var22) {
               C_100353_bh var23 = (C_100353_bh)var19.func_107498_b(var22);
               var1.func_109453_b(var23.func_107514_e("x"), var23.func_107514_e("y"), var23.func_107514_e("z"), var23.func_107514_e("i"), var23.func_107514_e("t"));
            }
         }
      }

      return var5;
   }
}
