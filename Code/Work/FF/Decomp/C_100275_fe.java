import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class C_100275_fe {

   public static final SimpleDateFormat field_107227_a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   public static Logger field_107225_b = Logger.getLogger("Minecraft");
   private final String field_107226_c;
   private Date field_107223_d = new Date();
   private String field_107224_e = "(Unknown)";
   private Date field_107221_f = null;
   private String field_107222_g = "Banned by an operator.";


   public C_100275_fe(String var1) {
      this.field_107226_c = var1;
   }

   public String func_107214_a() {
      return this.field_107226_c;
   }

   public Date func_107212_b() {
      return this.field_107223_d;
   }

   public void func_107210_a(Date var1) {
      this.field_107223_d = var1 != null?var1:new Date();
   }

   public String func_107219_c() {
      return this.field_107224_e;
   }

   public void func_107217_a(String var1) {
      this.field_107224_e = var1;
   }

   public Date func_107209_d() {
      return this.field_107221_f;
   }

   public void func_107220_b(Date var1) {
      this.field_107221_f = var1;
   }

   public boolean func_107211_e() {
      return this.field_107221_f == null?false:this.field_107221_f.before(new Date());
   }

   public String func_107216_f() {
      return this.field_107222_g;
   }

   public void func_107218_b(String var1) {
      this.field_107222_g = var1;
   }

   public String func_107215_g() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.func_107214_a());
      var1.append("|");
      var1.append(field_107227_a.format(this.func_107212_b()));
      var1.append("|");
      var1.append(this.func_107219_c());
      var1.append("|");
      var1.append(this.func_107209_d() == null?"Forever":field_107227_a.format(this.func_107209_d()));
      var1.append("|");
      var1.append(this.func_107216_f());
      return var1.toString();
   }

   public static C_100275_fe func_107213_c(String var0) {
      if(var0.trim().length() < 2) {
         return null;
      } else {
         String[] var1 = var0.trim().split(Pattern.quote("|"), 5);
         C_100275_fe var2 = new C_100275_fe(var1[0].trim());
         byte var3 = 0;
         int var10000 = var1.length;
         int var7 = var3 + 1;
         if(var10000 <= var7) {
            return var2;
         } else {
            try {
               var2.func_107210_a(field_107227_a.parse(var1[var7].trim()));
            } catch (ParseException var6) {
               field_107225_b.log(Level.WARNING, "Could not read creation date format for ban entry \'" + var2.func_107214_a() + "\' (was: \'" + var1[var7] + "\')", var6);
            }

            var10000 = var1.length;
            ++var7;
            if(var10000 <= var7) {
               return var2;
            } else {
               var2.func_107217_a(var1[var7].trim());
               var10000 = var1.length;
               ++var7;
               if(var10000 <= var7) {
                  return var2;
               } else {
                  try {
                     String var4 = var1[var7].trim();
                     if(!var4.equalsIgnoreCase("Forever") && var4.length() > 0) {
                        var2.func_107220_b(field_107227_a.parse(var4));
                     }
                  } catch (ParseException var5) {
                     field_107225_b.log(Level.WARNING, "Could not read expiry date format for ban entry \'" + var2.func_107214_a() + "\' (was: \'" + var1[var7] + "\')", var5);
                  }

                  var10000 = var1.length;
                  ++var7;
                  if(var10000 <= var7) {
                     return var2;
                  } else {
                     var2.func_107218_b(var1[var7].trim());
                     return var2;
                  }
               }
            }
         }
      }
   }

}
