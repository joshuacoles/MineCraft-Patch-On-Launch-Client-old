import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class C_100042_bby {

   private Map field_105550_m = new HashMap();
   public static C_100042_bby field_105547_a = new C_100042_bby();
   private C_101153_asb field_105548_n;
   public static double field_105545_b;
   public static double field_105546_c;
   public static double field_105543_d;
   public C_100874_azc field_105544_e;
   public C_100873_xe field_105541_f;
   public C_100595_ln field_105542_g;
   public float field_105553_h;
   public float field_105554_i;
   public double field_105551_j;
   public double field_105552_k;
   public double field_105549_l;


   private C_100042_bby() {
      this.field_105550_m.put(C_100414_amj.class, new C_100048_bbv());
      this.field_105550_m.put(C_100416_amh.class, new C_100046_bbt());
      this.field_105550_m.put(C_100406_amq.class, new C_100045_bbu());
      this.field_105550_m.put(C_100422_amb.class, new C_100049_bbq());
      this.field_105550_m.put(C_100418_amf.class, new C_100051_bbs());
      this.field_105550_m.put(C_100421_ame.class, new C_100052_bbr());
      this.field_105550_m.put(C_100400_aml.class, new C_100043_bbx());
      this.field_105550_m.put(C_100425_alz.class, new C_100050_bbp());
      this.field_105550_m.put(C_100415_amk.class, new C_100047_bbw());
      Iterator var1 = this.field_105550_m.values().iterator();

      while(var1.hasNext()) {
         C_100044_bbz var2 = (C_100044_bbz)var1.next();
         var2.func_105556_a(this);
      }

   }

   public C_100044_bbz func_105535_a(Class var1) {
      C_100044_bbz var2 = (C_100044_bbz)this.field_105550_m.get(var1);
      if(var2 == null && var1 != C_100398_amm.class) {
         var2 = this.func_105535_a(var1.getSuperclass());
         this.field_105550_m.put(var1, var2);
      }

      return var2;
   }

   public boolean func_105537_a(C_100398_amm var1) {
      return this.func_105536_b(var1) != null;
   }

   public C_100044_bbz func_105536_b(C_100398_amm var1) {
      return var1 == null?null:this.func_105535_a(var1.getClass());
   }

   public void func_105540_a(C_100873_xe var1, C_100874_azc var2, C_101153_asb var3, C_100595_ln var4, float var5) {
      if(this.field_105541_f != var1) {
         this.func_105533_a(var1);
      }

      this.field_105544_e = var2;
      this.field_105542_g = var4;
      this.field_105548_n = var3;
      this.field_105553_h = var4.field_103178_B + (var4.field_103236_z - var4.field_103178_B) * var5;
      this.field_105554_i = var4.field_103179_C + (var4.field_103177_A - var4.field_103179_C) * var5;
      this.field_105551_j = var4.field_103189_T + (var4.field_103221_t - var4.field_103189_T) * (double)var5;
      this.field_105552_k = var4.field_103188_U + (var4.field_103219_u - var4.field_103188_U) * (double)var5;
      this.field_105549_l = var4.field_103191_V + (var4.field_103217_v - var4.field_103191_V) * (double)var5;
   }

   public void func_105534_a(C_100398_amm var1, float var2) {
      if(var1.func_102926_a(this.field_105551_j, this.field_105552_k, this.field_105549_l) < var1.func_102923_m()) {
         int var3 = this.field_105541_f.func_109355_i(var1.field_102938_l, var1.field_102939_m, var1.field_102936_n, 0);
         int var4 = var3 % 65536;
         int var5 = var3 / 65536;
         C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var4 / 1.0F, (float)var5 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.func_105539_a(var1, (double)var1.field_102938_l - field_105545_b, (double)var1.field_102939_m - field_105546_c, (double)var1.field_102936_n - field_105543_d, var2);
      }

   }

   public void func_105539_a(C_100398_amm var1, double var2, double var4, double var6, float var8) {
      C_100044_bbz var9 = this.func_105536_b(var1);
      if(var9 != null) {
         var9.func_105560_a(var1, var2, var4, var6, var8);
      }

   }

   public void func_105533_a(C_100873_xe var1) {
      this.field_105541_f = var1;
      Iterator var2 = this.field_105550_m.values().iterator();

      while(var2.hasNext()) {
         C_100044_bbz var3 = (C_100044_bbz)var2.next();
         if(var3 != null) {
            var3.func_105555_a(var1);
         }
      }

   }

   public C_101153_asb func_105538_a() {
      return this.field_105548_n;
   }

}
