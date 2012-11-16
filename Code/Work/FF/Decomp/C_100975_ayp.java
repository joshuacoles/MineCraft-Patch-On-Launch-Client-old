import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class C_100975_ayp {

   public C_100873_xe field_111196_a;
   private int field_111214_y = -1;
   private static C_100872_azb field_111213_z = C_100872_azb.field_110346_a;
   public static int field_111194_b = 0;
   public int field_111195_c;
   public int field_111192_d;
   public int field_111193_e;
   public int field_111190_f;
   public int field_111191_g;
   public int field_111203_h;
   public int field_111204_i;
   public int field_111201_j;
   public int field_111202_k;
   public boolean field_111199_l = false;
   public boolean[] field_111200_m = new boolean[2];
   public int field_111197_n;
   public int field_111198_o;
   public int field_111212_p;
   public boolean field_111211_q;
   public C_100412_amr field_111210_r;
   public int field_111209_s;
   public boolean field_111208_t = true;
   public boolean field_111207_u;
   public int field_111206_v;
   public boolean field_111205_w;
   private boolean field_111187_A = false;
   public List field_111215_x = new ArrayList();
   private List field_111188_B;
   private int field_111189_C;


   public C_100975_ayp(C_100873_xe var1, List var2, int var3, int var4, int var5, int var6) {
      this.field_111196_a = var1;
      this.field_111188_B = var2;
      this.field_111214_y = var6;
      this.field_111195_c = -999;
      this.func_111184_a(var3, var4, var5);
      this.field_111211_q = false;
   }

   public void func_111184_a(int var1, int var2, int var3) {
      if(var1 != this.field_111195_c || var2 != this.field_111192_d || var3 != this.field_111193_e) {
         this.func_111182_b();
         this.field_111195_c = var1;
         this.field_111192_d = var2;
         this.field_111193_e = var3;
         this.field_111197_n = var1 + 8;
         this.field_111198_o = var2 + 8;
         this.field_111212_p = var3 + 8;
         this.field_111204_i = var1 & 1023;
         this.field_111201_j = var2;
         this.field_111202_k = var3 & 1023;
         this.field_111190_f = var1 - this.field_111204_i;
         this.field_111191_g = var2 - this.field_111201_j;
         this.field_111203_h = var3 - this.field_111202_k;
         float var4 = 6.0F;
         this.field_111210_r = C_100412_amr.func_107894_a((double)((float)var1 - var4), (double)((float)var2 - var4), (double)((float)var3 - var4), (double)((float)(var1 + 16) + var4), (double)((float)(var2 + 16) + var4), (double)((float)(var3 + 16) + var4));
         GL11.glNewList(this.field_111214_y + 2, 4864);
         C_100059_bag.func_105343_a(C_100412_amr.func_107892_a().func_107844_a((double)((float)this.field_111204_i - var4), (double)((float)this.field_111201_j - var4), (double)((float)this.field_111202_k - var4), (double)((float)(this.field_111204_i + 16) + var4), (double)((float)(this.field_111201_j + 16) + var4), (double)((float)(this.field_111202_k + 16) + var4)));
         GL11.glEndList();
         this.func_111185_f();
      }
   }

   private void func_111177_g() {
      GL11.glTranslatef((float)this.field_111204_i, (float)this.field_111201_j, (float)this.field_111202_k);
   }

   public void func_111180_a() {
      if(this.field_111211_q) {
         this.field_111211_q = false;
         int var1 = this.field_111195_c;
         int var2 = this.field_111192_d;
         int var3 = this.field_111193_e;
         int var4 = this.field_111195_c + 16;
         int var5 = this.field_111192_d + 16;
         int var6 = this.field_111193_e + 16;

         for(int var7 = 0; var7 < 2; ++var7) {
            this.field_111200_m[var7] = true;
         }

         C_101272_za.field_112341_a = false;
         HashSet var21 = new HashSet();
         var21.addAll(this.field_111215_x);
         this.field_111215_x.clear();
         byte var8 = 1;
         C_100853_xt var9 = new C_100853_xt(this.field_111196_a, var1 - var8, var2 - var8, var3 - var8, var4 + var8, var5 + var8, var6 + var8);
         if(!var9.func_109351_P()) {
            ++field_111194_b;
            C_100876_azd var10 = new C_100876_azd(var9);
            this.field_111189_C = 0;

            for(int var11 = 0; var11 < 2; ++var11) {
               boolean var12 = false;
               boolean var13 = false;
               boolean var14 = false;

               for(int var15 = var2; var15 < var5; ++var15) {
                  for(int var16 = var3; var16 < var6; ++var16) {
                     for(int var17 = var1; var17 < var4; ++var17) {
                        int var18 = var9.func_109349_a(var17, var15, var16);
                        if(var18 > 0) {
                           if(!var14) {
                              var14 = true;
                              GL11.glNewList(this.field_111214_y + var11, 4864);
                              GL11.glPushMatrix();
                              this.func_111177_g();
                              float var19 = 1.000001F;
                              GL11.glTranslatef(-8.0F, -8.0F, -8.0F);
                              GL11.glScalef(var19, var19, var19);
                              GL11.glTranslatef(8.0F, 8.0F, 8.0F);
                              field_111213_z.func_110330_b();
                              field_111213_z.func_110321_b((double)(-this.field_111195_c), (double)(-this.field_111192_d), (double)(-this.field_111193_e));
                           }

                           C_100451_alf var23 = C_100451_alf.field_106118_p[var18];
                           if(var23 != null) {
                              if(var11 == 0 && var23.func_106037_u()) {
                                 C_100398_amm var20 = var9.func_109353_p(var17, var15, var16);
                                 if(C_100042_bby.field_105547_a.func_105537_a(var20)) {
                                    this.field_111215_x.add(var20);
                                 }
                              }

                              int var24 = var23.func_106055_n();
                              if(var24 != var11) {
                                 var12 = true;
                              } else if(var24 == var11) {
                                 var13 |= var10.func_110436_b(var23, var17, var15, var16);
                              }
                           }
                        }
                     }
                  }
               }

               if(var14) {
                  this.field_111189_C += field_111213_z.func_110329_a();
                  GL11.glPopMatrix();
                  GL11.glEndList();
                  field_111213_z.func_110321_b(0.0D, 0.0D, 0.0D);
               } else {
                  var13 = false;
               }

               if(var13) {
                  this.field_111200_m[var11] = false;
               }

               if(!var12) {
                  break;
               }
            }
         }

         HashSet var22 = new HashSet();
         var22.addAll(this.field_111215_x);
         var22.removeAll(var21);
         this.field_111188_B.addAll(var22);
         var21.removeAll(this.field_111215_x);
         this.field_111188_B.removeAll(var21);
         this.field_111205_w = C_101272_za.field_112341_a;
         this.field_111187_A = true;
      }
   }

   public float func_111179_a(C_100730_lb var1) {
      float var2 = (float)(var1.field_103221_t - (double)this.field_111197_n);
      float var3 = (float)(var1.field_103219_u - (double)this.field_111198_o);
      float var4 = (float)(var1.field_103217_v - (double)this.field_111212_p);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public void func_111182_b() {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.field_111200_m[var1] = true;
      }

      this.field_111199_l = false;
      this.field_111187_A = false;
   }

   public void func_111183_c() {
      this.func_111182_b();
      this.field_111196_a = null;
   }

   public int func_111181_a(int var1) {
      return !this.field_111199_l?-1:(!this.field_111200_m[var1]?this.field_111214_y + var1:-1);
   }

   public void func_111186_a(C_100865_azf var1) {
      this.field_111199_l = var1.func_110286_a(this.field_111210_r);
   }

   public void func_111176_d() {
      GL11.glCallList(this.field_111214_y + 2);
   }

   public boolean func_111178_e() {
      return !this.field_111187_A?false:this.field_111200_m[0] && this.field_111200_m[1];
   }

   public void func_111185_f() {
      this.field_111211_q = true;
   }

}
