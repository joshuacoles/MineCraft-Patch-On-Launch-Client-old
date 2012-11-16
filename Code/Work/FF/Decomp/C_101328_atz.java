import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;

public class C_101328_atz extends C_101278_asw {

   private C_101146_ary field_104417_a;
   private final C_100423_amc field_104416_b;


   public C_101328_atz(C_100423_amc var1) {
      this.field_104416_b = var1;
   }

   public void func_104039_c() {
      this.field_104417_a.func_103938_a();
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96 + 12, var1.func_107651_b("gui.done")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.cancel")));
      this.field_104417_a = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 150, 60, 300, 20);
      this.field_104417_a.func_103963_f(32767);
      this.field_104417_a.func_103955_b(true);
      this.field_104417_a.func_103940_a(this.field_104416_b.func_104858_c());
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 1) {
            this.field_104046_e.func_105053_a((C_101278_asw)null);
         } else if(var1.field_103908_f == 0) {
            String var2 = "MC|AdvCdm";
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4 = new DataOutputStream(var3);

            try {
               var4.writeInt(this.field_104416_b.field_102938_l);
               var4.writeInt(this.field_104416_b.field_102939_m);
               var4.writeInt(this.field_104416_b.field_102936_n);
               C_100219_dx.func_106543_a(this.field_104417_a.func_103939_b(), var4);
               this.field_104046_e.func_105068_r().func_107034_c(new C_100367_da(var2, var3.toByteArray()));
            } catch (Exception var6) {
               var6.printStackTrace();
            }

            this.field_104046_e.func_105053_a((C_101278_asw)null);
         }

      }
   }

   protected void func_104032_a(char var1, int var2) {
      this.field_104417_a.func_103961_a(var1, var2);
      ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104417_a.func_103939_b().trim().length() > 0;
      if(var1 == 13) {
         this.func_104040_a((C_101133_arl)this.field_104050_h.get(0));
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      this.field_104417_a.func_103952_a(var1, var2, var3);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("advMode.setCommand"), this.field_104044_f / 2, this.field_104045_g / 4 - 60 + 20, 16777215);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("advMode.command"), this.field_104044_f / 2 - 150, 47, 10526880);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("advMode.nearestPlayer"), this.field_104044_f / 2 - 150, 97, 10526880);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("advMode.randomPlayer"), this.field_104044_f / 2 - 150, 108, 10526880);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("advMode.allPlayers"), this.field_104044_f / 2 - 150, 119, 10526880);
      this.field_104417_a.func_103954_f();
      super.func_104027_a(var1, var2, var3);
   }
}
