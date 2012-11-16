import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class C_101335_aun extends C_101288_atq implements C_101070_re {

   private C_101054_ru field_104496_o;
   private C_101146_ary field_104495_p;
   private C_101092_qf field_104494_q;


   public C_101335_aun(C_101092_qf var1, C_100873_xe var2, int var3, int var4, int var5) {
      super(new C_101054_ru(var1, var2, var3, var4, var5, Minecraft.func_105091_x().field_105120_g));
      this.field_104494_q = var1;
      this.field_104496_o = (C_101054_ru)this.field_104439_d;
   }

   public void func_104037_A_() {
      super.func_104037_A_();
      Keyboard.enableRepeatEvents(true);
      int var1 = (this.field_104044_f - this.field_104440_b) / 2;
      int var2 = (this.field_104045_g - this.field_104441_c) / 2;
      this.field_104495_p = new C_101146_ary(this.field_104049_k, var1 + 62, var2 + 24, 103, 12);
      this.field_104495_p.func_103953_g(-1);
      this.field_104495_p.func_103964_h(-1);
      this.field_104495_p.func_103945_a(false);
      this.field_104495_p.func_103963_f(30);
      this.field_104439_d.func_111500_b(this);
      this.field_104439_d.func_111507_a(this);
   }

   public void func_104038_b() {
      super.func_104038_b();
      Keyboard.enableRepeatEvents(false);
      this.field_104439_d.func_111500_b(this);
   }

   protected void func_104433_b(int var1, int var2) {
      GL11.glDisable(2896);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.repair"), 60, 6, 4210752);
      if(this.field_104496_o.field_111527_e > 0) {
         int var3 = 8453920;
         boolean var4 = true;
         String var5 = C_100359_bd.func_107637_a("container.repair.cost", new Object[]{Integer.valueOf(this.field_104496_o.field_111527_e)});
         if(this.field_104496_o.field_111527_e >= 40 && !this.field_104046_e.field_105120_g.field_103869_cf.field_111597_d) {
            var5 = C_100359_bd.func_107638_a("container.repair.expensive");
            var3 = 16736352;
         } else if(!this.field_104496_o.func_111503_a(2).func_111453_d()) {
            var4 = false;
         } else if(!this.field_104496_o.func_111503_a(2).func_111451_a(this.field_104494_q.field_104828_d)) {
            var3 = 16736352;
         }

         if(var4) {
            int var6 = -16777216 | (var3 & 16579836) >> 2 | var3 & -16777216;
            int var7 = this.field_104440_b - 8 - this.field_104049_k.func_111778_a(var5);
            byte var8 = 67;
            if(this.field_104049_k.func_111782_a()) {
               func_103882_a(var7 - 3, var8 - 2, this.field_104440_b - 7, var8 + 10, -16777216);
               func_103882_a(var7 - 2, var8 - 1, this.field_104440_b - 8, var8 + 9, -12895429);
            } else {
               this.field_104049_k.func_111798_b(var5, var7, var8 + 1, var6);
               this.field_104049_k.func_111798_b(var5, var7 + 1, var8, var6);
               this.field_104049_k.func_111798_b(var5, var7 + 1, var8 + 1, var6);
            }

            this.field_104049_k.func_111798_b(var5, var7, var8, var3);
         }
      }

      GL11.glEnable(2896);
   }

   protected void func_104032_a(char var1, int var2) {
      if(this.field_104495_p.func_103961_a(var1, var2)) {
         this.field_104496_o.func_111524_a(this.field_104495_p.func_103939_b());
         this.field_104046_e.field_105120_g.field_104564_a.func_107034_c(new C_100367_da("MC|ItemName", this.field_104495_p.func_103939_b().getBytes()));
      } else {
         super.func_104032_a(var1, var2);
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      this.field_104495_p.func_103952_a(var1, var2, var3);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      super.func_104027_a(var1, var2, var3);
      GL11.glDisable(2896);
      this.field_104495_p.func_103954_f();
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/repair.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
      this.func_103877_b(var5 + 59, var6 + 20, 0, this.field_104441_c + (this.field_104496_o.func_111503_a(0).func_111453_d()?0:16), 110, 16);
      if((this.field_104496_o.func_111503_a(0).func_111453_d() || this.field_104496_o.func_111503_a(1).func_111453_d()) && !this.field_104496_o.func_111503_a(2).func_111453_d()) {
         this.func_103877_b(var5 + 99, var6 + 45, this.field_104440_b, 0, 28, 21);
      }

   }

   public void func_103872_a(C_101075_qy var1, List var2) {
      this.func_103873_a(var1, 0, var1.func_111503_a(0).func_111446_c());
   }

   public void func_103873_a(C_101075_qy var1, int var2, C_100994_tv var3) {
      if(var2 == 0) {
         this.field_104495_p.func_103940_a(var3 == null?"":var3.func_111336_r());
         this.field_104495_p.func_103944_c(var3 != null);
         if(var3 != null) {
            this.field_104496_o.func_111524_a(this.field_104495_p.func_103939_b());
            this.field_104046_e.field_105120_g.field_104564_a.func_107034_c(new C_100367_da("MC|ItemName", this.field_104495_p.func_103939_b().getBytes()));
         }
      }

   }

   public void func_103874_a(C_101075_qy var1, int var2, int var3) {}
}
