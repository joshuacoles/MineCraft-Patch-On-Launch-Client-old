
public class C_101263_zi {

   public static C_101303_zj func_112246_a(C_100353_bh var0) {
      int var1 = var0.func_107514_e("xPos");
      int var2 = var0.func_107514_e("zPos");
      C_101303_zj var3 = new C_101303_zj(var1, var2);
      var3.field_112427_g = var0.func_107523_j("Blocks");
      var3.field_112426_f = new C_101267_zc(var0.func_107523_j("Data"), 7);
      var3.field_112429_e = new C_101267_zc(var0.func_107523_j("SkyLight"), 7);
      var3.field_112428_d = new C_101267_zc(var0.func_107523_j("BlockLight"), 7);
      var3.field_112431_c = var0.func_107523_j("HeightMap");
      var3.field_112430_b = var0.func_107519_n("TerrainPopulated");
      var3.field_112436_h = var0.func_107513_m("Entities");
      var3.field_112437_i = var0.func_107513_m("TileEntities");
      var3.field_112434_j = var0.func_107513_m("TileTicks");

      try {
         var3.field_112432_a = var0.func_107515_f("LastUpdate");
      } catch (ClassCastException var5) {
         var3.field_112432_a = (long)var0.func_107514_e("LastUpdate");
      }

      return var3;
   }

   public static void func_112247_a(C_101303_zj var0, C_100353_bh var1, C_101311_ye var2) {
      var1.func_107520_a("xPos", var0.field_112435_k);
      var1.func_107520_a("zPos", var0.field_112433_l);
      var1.func_107525_a("LastUpdate", var0.field_112432_a);
      int[] var3 = new int[var0.field_112431_c.length];

      for(int var4 = 0; var4 < var0.field_112431_c.length; ++var4) {
         var3[var4] = var0.field_112431_c[var4];
      }

      var1.func_107539_a("HeightMap", var3);
      var1.func_107509_a("TerrainPopulated", var0.field_112430_b);
      C_100339_bp var16 = new C_100339_bp("Sections");

      int var7;
      for(int var5 = 0; var5 < 8; ++var5) {
         boolean var6 = true;

         for(var7 = 0; var7 < 16 && var6; ++var7) {
            int var8 = 0;

            while(var8 < 16 && var6) {
               int var9 = 0;

               while(true) {
                  if(var9 < 16) {
                     int var10 = var7 << 11 | var9 << 7 | var8 + (var5 << 4);
                     byte var11 = var0.field_112427_g[var10];
                     if(var11 == 0) {
                        ++var9;
                        continue;
                     }

                     var6 = false;
                  }

                  ++var8;
                  break;
               }
            }
         }

         if(!var6) {
            byte[] var19 = new byte[4096];
            C_101274_yy var20 = new C_101274_yy(var19.length, 4);
            C_101274_yy var21 = new C_101274_yy(var19.length, 4);
            C_101274_yy var23 = new C_101274_yy(var19.length, 4);

            for(int var22 = 0; var22 < 16; ++var22) {
               for(int var12 = 0; var12 < 16; ++var12) {
                  for(int var13 = 0; var13 < 16; ++var13) {
                     int var14 = var22 << 11 | var13 << 7 | var12 + (var5 << 4);
                     byte var15 = var0.field_112427_g[var14];
                     var19[var12 << 8 | var13 << 4 | var22] = (byte)(var15 & 255);
                     var20.func_112356_a(var22, var12, var13, var0.field_112426_f.func_112280_a(var22, var12 + (var5 << 4), var13));
                     var21.func_112356_a(var22, var12, var13, var0.field_112429_e.func_112280_a(var22, var12 + (var5 << 4), var13));
                     var23.func_112356_a(var22, var12, var13, var0.field_112428_d.func_112280_a(var22, var12 + (var5 << 4), var13));
                  }
               }
            }

            C_100353_bh var24 = new C_100353_bh();
            var24.func_107527_a("Y", (byte)(var5 & 255));
            var24.func_107526_a("Blocks", var19);
            var24.func_107526_a("Data", var20.field_112360_a);
            var24.func_107526_a("SkyLight", var21.field_112360_a);
            var24.func_107526_a("BlockLight", var23.field_112360_a);
            var16.func_107500_a(var24);
         }
      }

      var1.func_107530_a("Sections", var16);
      byte[] var17 = new byte[256];

      for(int var18 = 0; var18 < 16; ++var18) {
         for(var7 = 0; var7 < 16; ++var7) {
            var17[var7 << 4 | var18] = (byte)(var2.func_112524_a(var0.field_112435_k << 4 | var18, var0.field_112433_l << 4 | var7).field_112478_N & 255);
         }
      }

      var1.func_107526_a("Biomes", var17);
      var1.func_107530_a("Entities", var0.field_112436_h);
      var1.func_107530_a("TileEntities", var0.field_112437_i);
      if(var0.field_112434_j != null) {
         var1.func_107530_a("TileTicks", var0.field_112434_j);
      }

   }
}
