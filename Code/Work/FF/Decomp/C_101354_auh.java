import java.util.Random;

public class C_101354_auh {

   public static final C_101354_auh field_112622_a = new C_101354_auh();
   private Random field_112620_b = new Random();
   private String[] field_112621_c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");


   public String func_112618_a() {
      int var1 = this.field_112620_b.nextInt(2) + 3;
      String var2 = "";

      for(int var3 = 0; var3 < var1; ++var3) {
         if(var3 > 0) {
            var2 = var2 + " ";
         }

         var2 = var2 + this.field_112621_c[this.field_112620_b.nextInt(this.field_112621_c.length)];
      }

      return var2;
   }

   public void func_112619_a(long var1) {
      this.field_112620_b.setSeed(var1);
   }

}
