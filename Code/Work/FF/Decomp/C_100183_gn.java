import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100183_gn extends C_100009_o {

   private long field_105246_a = 0L;
   private int field_105245_b = 0;


   public String func_105212_c() {
      return "debug";
   }

   public int func_105221_a() {
      return 3;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length == 1) {
         if(var2[0].equals("start")) {
            func_105226_a(var1, "commands.debug.start", new Object[0]);
            C_101445_MinecraftServer.func_104953_D().func_104944_ai();
            this.field_105246_a = System.currentTimeMillis();
            this.field_105245_b = C_101445_MinecraftServer.func_104953_D().func_104956_ah();
            return;
         }

         if(var2[0].equals("stop")) {
            if(!C_101445_MinecraftServer.func_104953_D().field_104985_b.field_108908_a) {
               throw new C_100487_ah("commands.debug.notStarted", new Object[0]);
            }

            long var3 = System.currentTimeMillis();
            int var5 = C_101445_MinecraftServer.func_104953_D().func_104956_ah();
            long var6 = var3 - this.field_105246_a;
            int var8 = var5 - this.field_105245_b;
            this.func_105244_a(var6, var8);
            C_101445_MinecraftServer.func_104953_D().field_104985_b.field_108908_a = false;
            func_105226_a(var1, "commands.debug.stop", new Object[]{Float.valueOf((float)var6 / 1000.0F), Integer.valueOf(var8)});
            return;
         }
      }

      throw new C_100475_am("commands.debug.usage", new Object[0]);
   }

   private void func_105244_a(long var1, int var3) {
      File var4 = new File(C_101445_MinecraftServer.func_104953_D().func_104891_e("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
      var4.getParentFile().mkdirs();

      try {
         FileWriter var5 = new FileWriter(var4);
         var5.write(this.func_105243_b(var1, var3));
         var5.close();
      } catch (Throwable var6) {
         Logger.getLogger("Minecraft").log(Level.SEVERE, "Could not save profiler results to " + var4, var6);
      }

   }

   private String func_105243_b(long var1, int var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("---- Minecraft Profiler Results ----\n");
      var4.append("// ");
      var4.append(func_105242_d());
      var4.append("\n\n");
      var4.append("Time span: ").append(var1).append(" ms\n");
      var4.append("Tick span: ").append(var3).append(" ticks\n");
      var4.append("// This is approximately ").append(String.format("%.2f", new Object[]{Float.valueOf((float)var3 / ((float)var1 / 1000.0F))})).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
      var4.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.func_105241_a(0, "root", var4);
      var4.append("--- END PROFILE DUMP ---\n\n");
      return var4.toString();
   }

   private void func_105241_a(int var1, String var2, StringBuilder var3) {
      List var4 = C_101445_MinecraftServer.func_104953_D().field_104985_b.func_108902_b(var2);
      if(var4 != null && var4.size() >= 3) {
         for(int var5 = 1; var5 < var4.size(); ++var5) {
            C_100688_jz var6 = (C_100688_jz)var4.get(var5);
            var3.append(String.format("[%02d] ", new Object[]{Integer.valueOf(var1)}));

            for(int var7 = 0; var7 < var1; ++var7) {
               var3.append(" ");
            }

            var3.append(var6.field_109131_c);
            var3.append(" - ");
            var3.append(String.format("%.2f", new Object[]{Double.valueOf(var6.field_109132_a)}));
            var3.append("%/");
            var3.append(String.format("%.2f", new Object[]{Double.valueOf(var6.field_109130_b)}));
            var3.append("%\n");
            if(!var6.field_109131_c.equals("unspecified")) {
               try {
                  this.func_105241_a(var1 + 1, var2 + "." + var6.field_109131_c, var3);
               } catch (Exception var8) {
                  var3.append("[[ EXCEPTION " + var8 + " ]]");
               }
            }
         }

      }
   }

   private static String func_105242_d() {
      String[] var0 = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I\'m working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it\'ll have more motivation to work faster! Poor server."};

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, new String[]{"start", "stop"}):null;
   }
}
