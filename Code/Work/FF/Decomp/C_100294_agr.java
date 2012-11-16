import java.io.File;
import java.io.FilenameFilter;

class C_100294_agr implements FilenameFilter {

   // $FF: synthetic field
   final C_100308_agq field_107350_a;


   C_100294_agr(C_100308_agq var1) {
      this.field_107350_a = var1;
   }

   public boolean accept(File var1, String var2) {
      return var2.endsWith(".mcr");
   }
}
