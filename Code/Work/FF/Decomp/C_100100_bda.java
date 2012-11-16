import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class C_100100_bda {

   private Map field_105816_a = new HashMap();
   private Map field_105814_b = new HashMap();
   private boolean field_105815_c = false;
   private C_100079_bdb field_105813_d;


   public C_100100_bda(C_101134_ark var1, File var2) {
      File var3 = new File(var2, "stats");
      if(!var3.exists()) {
         var3.mkdir();
      }

      File[] var4 = var2.listFiles();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         File var7 = var4[var6];
         if(var7.getName().startsWith("stats_") && var7.getName().endsWith(".dat")) {
            File var8 = new File(var3, var7.getName());
            if(!var8.exists()) {
               System.out.println("Relocating " + var7.getName());
               var7.renameTo(var8);
            }
         }
      }

      this.field_105813_d = new C_100079_bdb(var1, this, var3);
   }

   public void func_105801_a(C_100809_jc var1, int var2) {
      this.func_105809_a(this.field_105814_b, var1, var2);
      this.func_105809_a(this.field_105816_a, var1, var2);
      this.field_105815_c = true;
   }

   private void func_105809_a(Map var1, C_100809_jc var2, int var3) {
      Integer var4 = (Integer)var1.get(var2);
      int var5 = var4 == null?0:var4.intValue();
      var1.put(var2, Integer.valueOf(var5 + var3));
   }

   public Map func_105802_b() {
      return new HashMap(this.field_105814_b);
   }

   public void func_105805_a(Map var1) {
      if(var1 != null) {
         this.field_105815_c = true;
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            C_100809_jc var3 = (C_100809_jc)var2.next();
            this.func_105809_a(this.field_105814_b, var3, ((Integer)var1.get(var3)).intValue());
            this.func_105809_a(this.field_105816_a, var3, ((Integer)var1.get(var3)).intValue());
         }

      }
   }

   public void func_105811_b(Map var1) {
      if(var1 != null) {
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            C_100809_jc var3 = (C_100809_jc)var2.next();
            Integer var4 = (Integer)this.field_105814_b.get(var3);
            int var5 = var4 == null?0:var4.intValue();
            this.field_105816_a.put(var3, Integer.valueOf(((Integer)var1.get(var3)).intValue() + var5));
         }

      }
   }

   public void func_105806_c(Map var1) {
      if(var1 != null) {
         this.field_105815_c = true;
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            C_100809_jc var3 = (C_100809_jc)var2.next();
            this.func_105809_a(this.field_105814_b, var3, ((Integer)var1.get(var3)).intValue());
         }

      }
   }

   public static Map func_105812_b(String var0) {
      HashMap var1 = new HashMap();

      try {
         String var2 = "local";
         StringBuilder var3 = new StringBuilder();
         C_101193_apr var4 = (new C_100319_aoj()).func_107394_a(var0);
         List var5 = var4.func_107398_b(new Object[]{"stats-change"});
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            C_101168_aou var7 = (C_101168_aou)var6.next();
            Map var8 = var7.func_107399_d();
            Entry var9 = (Entry)var8.entrySet().iterator().next();
            int var10 = Integer.parseInt(((C_101194_aps)var9.getKey()).func_107400_c());
            int var11 = Integer.parseInt(((C_101168_aou)var9.getValue()).func_107400_c());
            C_100809_jc var12 = C_100818_jh.func_110011_a(var10);
            if(var12 == null) {
               System.out.println(var10 + " is not a valid stat");
            } else {
               var3.append(C_100818_jh.func_110011_a(var10).field_109916_g).append(",");
               var3.append(var11).append(",");
               var1.put(var12, Integer.valueOf(var11));
            }
         }

         C_100667_jl var14 = new C_100667_jl(var2);
         String var15 = var14.func_109060_a(var3.toString());
         if(!var15.equals(var4.func_107396_a(new Object[]{"checksum"}))) {
            System.out.println("CHECKSUM MISMATCH");
            return null;
         }
      } catch (C_101197_apv var13) {
         var13.printStackTrace();
      }

      return var1;
   }

   public static String func_105800_a(String var0, String var1, Map var2) {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      boolean var5 = true;
      var3.append("{\r\n");
      if(var0 != null && var1 != null) {
         var3.append("  \"user\":{\r\n");
         var3.append("    \"name\":\"").append(var0).append("\",\r\n");
         var3.append("    \"sessionid\":\"").append(var1).append("\"\r\n");
         var3.append("  },\r\n");
      }

      var3.append("  \"stats-change\":[");
      Iterator var6 = var2.keySet().iterator();

      while(var6.hasNext()) {
         C_100809_jc var7 = (C_100809_jc)var6.next();
         if(var5) {
            var5 = false;
         } else {
            var3.append("},");
         }

         var3.append("\r\n    {\"").append(var7.field_109918_e).append("\":").append(var2.get(var7));
         var4.append(var7.field_109916_g).append(",");
         var4.append(var2.get(var7)).append(",");
      }

      if(!var5) {
         var3.append("}");
      }

      C_100667_jl var8 = new C_100667_jl(var1);
      var3.append("\r\n  ],\r\n");
      var3.append("  \"checksum\":\"").append(var8.func_109060_a(var4.toString())).append("\"\r\n");
      var3.append("}");
      return var3.toString();
   }

   public boolean func_105803_a(C_100791_ix var1) {
      return this.field_105816_a.containsKey(var1);
   }

   public boolean func_105807_b(C_100791_ix var1) {
      return var1.field_109935_c == null || this.func_105803_a(var1.field_109935_c);
   }

   public int func_105810_a(C_100809_jc var1) {
      Integer var2 = (Integer)this.field_105816_a.get(var1);
      return var2 == null?0:var2.intValue();
   }

   public void func_105804_d() {
      this.field_105813_d.func_105594_c(this.func_105802_b());
   }

   public void func_105808_e() {
      if(this.field_105815_c && this.field_105813_d.func_105602_c()) {
         this.field_105813_d.func_105593_a(this.func_105802_b());
      }

      this.field_105813_d.func_105597_e();
   }
}
