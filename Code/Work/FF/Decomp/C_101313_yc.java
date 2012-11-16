
public class C_101313_yc {

   public float[] field_112541_a;
   public float[] field_112539_b;
   public C_101324_xz[] field_112540_c;
   public int field_112537_d;
   public int field_112538_e;
   public long field_112535_f;
   // $FF: synthetic field
   final C_101318_yb field_112536_g;


   public C_101313_yc(C_101318_yb var1, int var2, int var3) {
      this.field_112536_g = var1;
      this.field_112541_a = new float[256];
      this.field_112539_b = new float[256];
      this.field_112540_c = new C_101324_xz[256];
      this.field_112537_d = var2;
      this.field_112538_e = var3;
      C_101318_yb.func_112589_a(var1).func_112519_b(this.field_112541_a, var2 << 4, var3 << 4, 16, 16);
      C_101318_yb.func_112589_a(var1).func_112520_a(this.field_112539_b, var2 << 4, var3 << 4, 16, 16);
      C_101318_yb.func_112589_a(var1).func_112518_a(this.field_112540_c, var2 << 4, var3 << 4, 16, 16, false);
   }

   public C_101324_xz func_112534_a(int var1, int var2) {
      return this.field_112540_c[var1 & 15 | (var2 & 15) << 4];
   }
}
