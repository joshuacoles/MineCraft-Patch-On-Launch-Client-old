
public class C_100264_agz implements Comparable {

   private final String field_107125_a;
   private final String field_107123_b;
   private final long field_107124_c;
   private final long field_107121_d;
   private final boolean field_107122_e;
   private final C_100836_xn field_107119_f;
   private final boolean field_107120_g;
   private final boolean field_107126_h;


   public C_100264_agz(String var1, String var2, long var3, long var5, C_100836_xn var7, boolean var8, boolean var9, boolean var10) {
      this.field_107125_a = var1;
      this.field_107123_b = var2;
      this.field_107124_c = var3;
      this.field_107121_d = var5;
      this.field_107119_f = var7;
      this.field_107122_e = var8;
      this.field_107120_g = var9;
      this.field_107126_h = var10;
   }

   public String func_107115_a() {
      return this.field_107125_a;
   }

   public String func_107117_b() {
      return this.field_107123_b;
   }

   public boolean func_107114_d() {
      return this.field_107122_e;
   }

   public long func_107113_e() {
      return this.field_107124_c;
   }

   public int func_107116_a(C_100264_agz var1) {
      return this.field_107124_c < var1.field_107124_c?1:(this.field_107124_c > var1.field_107124_c?-1:this.field_107125_a.compareTo(var1.field_107125_a));
   }

   public C_100836_xn func_107112_f() {
      return this.field_107119_f;
   }

   public boolean func_107118_g() {
      return this.field_107120_g;
   }

   public boolean func_107111_h() {
      return this.field_107126_h;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.func_107116_a((C_100264_agz)var1);
   }
}
