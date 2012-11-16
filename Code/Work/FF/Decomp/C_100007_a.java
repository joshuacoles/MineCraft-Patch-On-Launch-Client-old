import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100007_a {

   private final String field_105195_a;
   private final Throwable field_105193_b;
   private final Map field_105194_c = new LinkedHashMap();
   private File field_105192_d = null;


   public C_100007_a(String var1, Throwable var2) {
      this.field_105195_a = var1;
      this.field_105193_b = var2;
      this.func_105186_g();
   }

   private void func_105186_g() {
      this.func_105182_a("Minecraft Version", new C_100005_b(this));
      this.func_105182_a("Operating System", new C_100006_c(this));
      this.func_105182_a("Java Version", new C_100003_d(this));
      this.func_105182_a("Java VM Version", new C_100004_e(this));
      this.func_105182_a("Memory", new C_100001_f(this));
      this.func_105182_a("JVM Flags", new C_100002_g(this));
      this.func_105182_a("AABB Pool Size", new C_100014_h(this));
   }

   public void func_105182_a(String var1, Callable var2) {
      try {
         this.func_105189_a(var1, var2.call());
      } catch (Throwable var4) {
         this.func_105181_a(var1, var4);
      }

   }

   public void func_105189_a(String var1, Object var2) {
      this.field_105194_c.put(var1, var2 == null?"null":var2.toString());
   }

   public void func_105181_a(String var1, Throwable var2) {
      this.func_105189_a(var1, "~ERROR~ " + var2.getClass().getSimpleName() + ": " + var2.getMessage());
   }

   public String func_105183_a() {
      return this.field_105195_a;
   }

   public Throwable func_105187_b() {
      return this.field_105193_b;
   }

   public String func_105191_c() {
      StringBuilder var1 = new StringBuilder();
      this.func_105188_a(var1);
      return var1.toString();
   }

   public void func_105188_a(StringBuilder var1) {
      boolean var2 = true;

      for(Iterator var3 = this.field_105194_c.entrySet().iterator(); var3.hasNext(); var2 = false) {
         Entry var4 = (Entry)var3.next();
         if(!var2) {
            var1.append("\n");
         }

         var1.append("- ");
         var1.append((String)var4.getKey());
         var1.append(": ");
         var1.append((String)var4.getValue());
      }

   }

   public String func_105180_d() {
      StringWriter var1 = null;
      PrintWriter var2 = null;
      String var3 = this.field_105193_b.toString();

      try {
         var1 = new StringWriter();
         var2 = new PrintWriter(var1);
         this.field_105193_b.printStackTrace(var2);
         var3 = var1.toString();
      } finally {
         try {
            if(var1 != null) {
               var1.close();
            }

            if(var2 != null) {
               var2.close();
            }
         } catch (IOException var10) {
            ;
         }

      }

      return var3;
   }

   public String func_105184_e() {
      StringBuilder var1 = new StringBuilder();
      var1.append("---- Minecraft Crash Report ----\n");
      var1.append("// ");
      var1.append(func_105185_h());
      var1.append("\n\n");
      var1.append("Time: ");
      var1.append((new SimpleDateFormat()).format(new Date()));
      var1.append("\n");
      var1.append("Description: ");
      var1.append(this.field_105195_a);
      var1.append("\n\n");
      var1.append(this.func_105180_d());
      var1.append("\n");
      var1.append("Relevant Details:");
      var1.append("\n");
      this.func_105188_a(var1);
      return var1.toString();
   }

   public File func_105179_f() {
      return this.field_105192_d;
   }

   public boolean func_105190_a(File var1) {
      if(this.field_105192_d != null) {
         return false;
      } else {
         if(var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         try {
            FileWriter var2 = new FileWriter(var1);
            var2.write(this.func_105184_e());
            var2.close();
            this.field_105192_d = var1;
            return true;
         } catch (Throwable var3) {
            Logger.getLogger("Minecraft").log(Level.SEVERE, "Could not save crash report to " + var1, var3);
            return false;
         }
      }
   }

   private static String func_105185_h() {
      String[] var0 = new String[]{"Who set us up the TNT?", "Everything\'s going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I\'m sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don\'t be sad. I\'ll do better next time, I promise!", "Don\'t be sad, have a hug! <3", "I just don\'t know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn\'t worry myself about that.", "I bet Cylons wouldn\'t have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I\'m Minecraft, and I\'m a crashaholic.", "Ooh. Shiny.", "This doesn\'t make any sense!", "Why is it breaking :("};

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }
}
