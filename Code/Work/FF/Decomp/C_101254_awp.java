import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class C_101254_awp {

   public float field_112217_a;
   public float field_112215_b;
   private int field_112230_r;
   private int field_112229_s;
   public float field_112216_c;
   public float field_112213_d;
   public float field_112214_e;
   public float field_112211_f;
   public float field_112212_g;
   public float field_112224_h;
   private boolean field_112228_t;
   private int field_112227_u;
   public boolean field_112225_i;
   public boolean field_112222_j;
   public boolean field_112223_k;
   public List field_112220_l;
   public List field_112221_m;
   public final String field_112218_n;
   private C_101231_avl field_112226_v;
   public float field_112219_o;
   public float field_112232_p;
   public float field_112231_q;


   public C_101254_awp(C_101231_avl var1, String var2) {
      this.field_112217_a = 64.0F;
      this.field_112215_b = 32.0F;
      this.field_112228_t = false;
      this.field_112227_u = 0;
      this.field_112225_i = false;
      this.field_112222_j = true;
      this.field_112223_k = false;
      this.field_112220_l = new ArrayList();
      this.field_112226_v = var1;
      var1.field_112031_r.add(this);
      this.field_112218_n = var2;
      this.func_112204_b(var1.field_112029_t, var1.field_112028_u);
   }

   public C_101254_awp(C_101231_avl var1) {
      this(var1, (String)null);
   }

   public C_101254_awp(C_101231_avl var1, int var2, int var3) {
      this(var1);
      this.func_112200_a(var2, var3);
   }

   public void func_112207_a(C_101254_awp var1) {
      if(this.field_112221_m == null) {
         this.field_112221_m = new ArrayList();
      }

      this.field_112221_m.add(var1);
   }

   public C_101254_awp func_112200_a(int var1, int var2) {
      this.field_112230_r = var1;
      this.field_112229_s = var2;
      return this;
   }

   public C_101254_awp func_112206_a(String var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      var1 = this.field_112218_n + "." + var1;
      C_101255_awq var8 = this.field_112226_v.func_112026_a(var1);
      this.func_112200_a(var8.field_112234_a, var8.field_112233_b);
      this.field_112220_l.add((new C_101257_awk(this, this.field_112230_r, this.field_112229_s, var2, var3, var4, var5, var6, var7, 0.0F)).func_112235_a(var1));
      return this;
   }

   public C_101254_awp func_112205_a(float var1, float var2, float var3, int var4, int var5, int var6) {
      this.field_112220_l.add(new C_101257_awk(this, this.field_112230_r, this.field_112229_s, var1, var2, var3, var4, var5, var6, 0.0F));
      return this;
   }

   public void func_112203_a(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.field_112220_l.add(new C_101257_awk(this, this.field_112230_r, this.field_112229_s, var1, var2, var3, var4, var5, var6, var7));
   }

   public void func_112209_a(float var1, float var2, float var3) {
      this.field_112216_c = var1;
      this.field_112213_d = var2;
      this.field_112214_e = var3;
   }

   public void func_112201_a(float var1) {
      if(!this.field_112223_k) {
         if(this.field_112222_j) {
            if(!this.field_112228_t) {
               this.func_112202_d(var1);
            }

            GL11.glTranslatef(this.field_112219_o, this.field_112232_p, this.field_112231_q);
            Iterator var2;
            C_101254_awp var3;
            if(this.field_112211_f == 0.0F && this.field_112212_g == 0.0F && this.field_112224_h == 0.0F) {
               if(this.field_112216_c == 0.0F && this.field_112213_d == 0.0F && this.field_112214_e == 0.0F) {
                  GL11.glCallList(this.field_112227_u);
                  if(this.field_112221_m != null) {
                     var2 = this.field_112221_m.iterator();

                     while(var2.hasNext()) {
                        var3 = (C_101254_awp)var2.next();
                        var3.func_112201_a(var1);
                     }
                  }
               } else {
                  GL11.glTranslatef(this.field_112216_c * var1, this.field_112213_d * var1, this.field_112214_e * var1);
                  GL11.glCallList(this.field_112227_u);
                  if(this.field_112221_m != null) {
                     var2 = this.field_112221_m.iterator();

                     while(var2.hasNext()) {
                        var3 = (C_101254_awp)var2.next();
                        var3.func_112201_a(var1);
                     }
                  }

                  GL11.glTranslatef(-this.field_112216_c * var1, -this.field_112213_d * var1, -this.field_112214_e * var1);
               }
            } else {
               GL11.glPushMatrix();
               GL11.glTranslatef(this.field_112216_c * var1, this.field_112213_d * var1, this.field_112214_e * var1);
               if(this.field_112224_h != 0.0F) {
                  GL11.glRotatef(this.field_112224_h * 57.295776F, 0.0F, 0.0F, 1.0F);
               }

               if(this.field_112212_g != 0.0F) {
                  GL11.glRotatef(this.field_112212_g * 57.295776F, 0.0F, 1.0F, 0.0F);
               }

               if(this.field_112211_f != 0.0F) {
                  GL11.glRotatef(this.field_112211_f * 57.295776F, 1.0F, 0.0F, 0.0F);
               }

               GL11.glCallList(this.field_112227_u);
               if(this.field_112221_m != null) {
                  var2 = this.field_112221_m.iterator();

                  while(var2.hasNext()) {
                     var3 = (C_101254_awp)var2.next();
                     var3.func_112201_a(var1);
                  }
               }

               GL11.glPopMatrix();
            }

            GL11.glTranslatef(-this.field_112219_o, -this.field_112232_p, -this.field_112231_q);
         }
      }
   }

   public void func_112208_b(float var1) {
      if(!this.field_112223_k) {
         if(this.field_112222_j) {
            if(!this.field_112228_t) {
               this.func_112202_d(var1);
            }

            GL11.glPushMatrix();
            GL11.glTranslatef(this.field_112216_c * var1, this.field_112213_d * var1, this.field_112214_e * var1);
            if(this.field_112212_g != 0.0F) {
               GL11.glRotatef(this.field_112212_g * 57.295776F, 0.0F, 1.0F, 0.0F);
            }

            if(this.field_112211_f != 0.0F) {
               GL11.glRotatef(this.field_112211_f * 57.295776F, 1.0F, 0.0F, 0.0F);
            }

            if(this.field_112224_h != 0.0F) {
               GL11.glRotatef(this.field_112224_h * 57.295776F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glCallList(this.field_112227_u);
            GL11.glPopMatrix();
         }
      }
   }

   public void func_112210_c(float var1) {
      if(!this.field_112223_k) {
         if(this.field_112222_j) {
            if(!this.field_112228_t) {
               this.func_112202_d(var1);
            }

            if(this.field_112211_f == 0.0F && this.field_112212_g == 0.0F && this.field_112224_h == 0.0F) {
               if(this.field_112216_c != 0.0F || this.field_112213_d != 0.0F || this.field_112214_e != 0.0F) {
                  GL11.glTranslatef(this.field_112216_c * var1, this.field_112213_d * var1, this.field_112214_e * var1);
               }
            } else {
               GL11.glTranslatef(this.field_112216_c * var1, this.field_112213_d * var1, this.field_112214_e * var1);
               if(this.field_112224_h != 0.0F) {
                  GL11.glRotatef(this.field_112224_h * 57.295776F, 0.0F, 0.0F, 1.0F);
               }

               if(this.field_112212_g != 0.0F) {
                  GL11.glRotatef(this.field_112212_g * 57.295776F, 0.0F, 1.0F, 0.0F);
               }

               if(this.field_112211_f != 0.0F) {
                  GL11.glRotatef(this.field_112211_f * 57.295776F, 1.0F, 0.0F, 0.0F);
               }
            }

         }
      }
   }

   private void func_112202_d(float var1) {
      this.field_112227_u = C_101209_aqk.func_112003_a(1);
      GL11.glNewList(this.field_112227_u, 4864);
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      Iterator var3 = this.field_112220_l.iterator();

      while(var3.hasNext()) {
         C_101257_awk var4 = (C_101257_awk)var3.next();
         var4.func_112236_a(var2, var1);
      }

      GL11.glEndList();
      this.field_112228_t = true;
   }

   public C_101254_awp func_112204_b(int var1, int var2) {
      this.field_112217_a = (float)var1;
      this.field_112215_b = (float)var2;
      return this;
   }
}
