import org.lwjgl.opengl.GL11;

public class C_100032_bbi {

   public byte[] field_105305_d = new byte[1024];
   public int field_105306_e;
   public boolean field_105303_f = false;
   public int field_105304_g = 0;
   public int field_105307_h = 1;
   public int field_105308_i = 0;


   public C_100032_bbi(int var1) {
      this.field_105306_e = var1;
   }

   public void func_105301_a() {}

   public void func_105302_a(C_100874_azc var1) {
      if(this.field_105308_i == 0) {
         GL11.glBindTexture(3553, var1.func_110367_b("/terrain.png"));
      } else if(this.field_105308_i == 1) {
         GL11.glBindTexture(3553, var1.func_110367_b("/gui/items.png"));
      }

   }
}
