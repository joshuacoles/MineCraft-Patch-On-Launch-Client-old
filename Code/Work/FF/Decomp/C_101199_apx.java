import java.io.PushbackReader;
import java.io.Reader;

final class C_101199_apx implements C_101201_apz {

   private final PushbackReader field_111940_a;
   private int field_111938_b = 0;
   private int field_111939_c = 1;
   private boolean field_111937_d = false;


   public C_101199_apx(Reader var1) {
      this.field_111940_a = new PushbackReader(var1);
   }

   public void func_111936_a(char var1) {
      --this.field_111938_b;
      if(this.field_111938_b < 0) {
         this.field_111938_b = 0;
      }

      this.field_111940_a.unread(var1);
   }

   public void func_111935_a(char[] var1) {
      this.field_111938_b -= var1.length;
      if(this.field_111938_b < 0) {
         this.field_111938_b = 0;
      }

   }

   public int func_111933_a() {
      int var1 = this.field_111940_a.read();
      this.func_111932_a(var1);
      return var1;
   }

   public int func_111934_b(char[] var1) {
      int var2 = this.field_111940_a.read(var1);
      char[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         this.func_111932_a(var6);
      }

      return var2;
   }

   private void func_111932_a(int var1) {
      if(13 == var1) {
         this.field_111938_b = 0;
         ++this.field_111939_c;
         this.field_111937_d = true;
      } else {
         if(10 == var1 && !this.field_111937_d) {
            this.field_111938_b = 0;
            ++this.field_111939_c;
         } else {
            ++this.field_111938_b;
         }

         this.field_111937_d = false;
      }

   }

   public int func_111931_b() {
      return this.field_111938_b;
   }

   public int func_111930_c() {
      return this.field_111939_c;
   }
}
