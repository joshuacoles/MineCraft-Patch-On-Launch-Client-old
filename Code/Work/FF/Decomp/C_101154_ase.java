import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C_101154_ase {

   public static final Pattern field_111839_a = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,3})(/\\S*)?$");
   private final C_101153_asb field_111837_b;
   private final C_101208_aqh field_111838_c;
   private final int field_111835_d;
   private final int field_111836_e;
   private final String field_111833_f;
   private final String field_111834_g;


   public C_101154_ase(C_101153_asb var1, C_101208_aqh var2, int var3, int var4) {
      this.field_111837_b = var1;
      this.field_111838_c = var2;
      this.field_111835_d = var3;
      this.field_111836_e = var4;
      this.field_111833_f = var1.func_111791_a(var2.func_111994_a(), var3);
      this.field_111834_g = this.func_111830_h();
   }

   public String func_111832_f() {
      return this.field_111834_g;
   }

   public URI func_111831_g() {
      String var1 = this.func_111832_f();
      if(var1 == null) {
         return null;
      } else {
         Matcher var2 = field_111839_a.matcher(var1);
         if(var2.matches()) {
            try {
               String var3 = var2.group(0);
               if(var2.group(1) == null) {
                  var3 = "http://" + var3;
               }

               return new URI(var3);
            } catch (URISyntaxException var4) {
               Logger.getLogger("Minecraft").log(Level.SEVERE, "Couldn\'t create URI from chat", var4);
            }
         }

         return null;
      }
   }

   private String func_111830_h() {
      int var1 = this.field_111833_f.lastIndexOf(" ", this.field_111833_f.length()) + 1;
      if(var1 < 0) {
         var1 = 0;
      }

      int var2 = this.field_111838_c.func_111994_a().indexOf(" ", var1);
      if(var2 < 0) {
         var2 = this.field_111838_c.func_111994_a().length();
      }

      return C_100679_kd.func_109122_a(this.field_111838_c.func_111994_a().substring(var1, var2));
   }

}
