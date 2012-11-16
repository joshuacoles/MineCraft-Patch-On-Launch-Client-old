import net.minecraft.client.Minecraft;

public class C_100095_bcg {

   private String field_105768_a;
   private String field_105766_b;
   private long field_105767_c;


   public C_100095_bcg(String var1, String var2) {
      this.field_105768_a = var1;
      this.field_105766_b = var2;
      this.field_105767_c = Minecraft.func_105063_F();
   }

   public String func_105763_a() {
      return this.field_105768_a;
   }

   public String func_105764_b() {
      return this.field_105766_b;
   }

   public void func_105765_c() {
      this.field_105767_c = Minecraft.func_105063_F();
   }
}
