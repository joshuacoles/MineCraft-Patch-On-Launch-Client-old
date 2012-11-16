import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C_100795_ij {

   public C_100730_lb field_109956_a;
   public int field_109954_b;
   public int field_109955_c;
   public int field_109952_d;
   public int field_109953_e;
   public int field_109950_f;
   public int field_109951_g;
   public int field_109963_h;
   public int field_109964_i;
   public double field_109961_j;
   public double field_109962_k;
   public double field_109959_l;
   public int field_109960_m = 0;
   private double field_109971_p;
   private double field_109970_q;
   private double field_109969_r;
   private boolean field_109968_s = false;
   private boolean field_109967_t;
   private int field_109966_u = 0;
   private C_100730_lb field_109965_v;
   public boolean field_109957_n = false;
   public Set field_109958_o = new HashSet();


   public C_100795_ij(C_100730_lb var1, int var2, int var3, boolean var4) {
      this.field_109956_a = var1;
      this.field_109954_b = var2;
      this.field_109955_c = var3;
      this.field_109967_t = var4;
      this.field_109952_d = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_109953_e = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_109950_f = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      this.field_109951_g = C_100650_jv.func_108933_d(var1.field_103236_z * 256.0F / 360.0F);
      this.field_109963_h = C_100650_jv.func_108933_d(var1.field_103177_A * 256.0F / 360.0F);
      this.field_109964_i = C_100650_jv.func_108933_d(var1.func_103054_ap() * 256.0F / 360.0F);
   }

   public boolean equals(Object var1) {
      return var1 instanceof C_100795_ij?((C_100795_ij)var1).field_109956_a.field_103212_k == this.field_109956_a.field_103212_k:false;
   }

   public int hashCode() {
      return this.field_109956_a.field_103212_k;
   }

   public void func_109947_a(List var1) {
      this.field_109957_n = false;
      if(!this.field_109968_s || this.field_109956_a.func_103146_e(this.field_109971_p, this.field_109970_q, this.field_109969_r) > 16.0D) {
         this.field_109971_p = this.field_109956_a.field_103221_t;
         this.field_109970_q = this.field_109956_a.field_103219_u;
         this.field_109969_r = this.field_109956_a.field_103217_v;
         this.field_109968_s = true;
         this.field_109957_n = true;
         this.func_109949_b(var1);
      }

      if(this.field_109965_v != this.field_109956_a.field_103207_o) {
         this.field_109965_v = this.field_109956_a.field_103207_o;
         this.func_109940_a(new C_100309_eq(this.field_109956_a, this.field_109956_a.field_103207_o));
      }

      if(this.field_109956_a instanceof C_100596_lm && this.field_109960_m % 10 == 0) {
         C_100596_lm var23 = (C_100596_lm)this.field_109956_a;
         C_100994_tv var24 = var23.func_104582_i();
         if(var24 != null && var24.func_111365_b() instanceof C_100986_tx) {
            C_100282_agl var26 = C_100992_tt.field_110882_bd.func_111042_a(var24, this.field_109956_a.field_103229_p);
            Iterator var27 = var1.iterator();

            while(var27.hasNext()) {
               C_101095_qg var29 = (C_101095_qg)var27.next();
               C_100762_ih var30 = (C_100762_ih)var29;
               var26.func_107288_a(var30, var24);
               if(var30.field_104518_a.func_107012_e() <= 5) {
                  C_100219_dx var31 = C_100992_tt.field_110882_bd.func_111040_c(var24, this.field_109956_a.field_103229_p, var30);
                  if(var31 != null) {
                     var30.field_104518_a.func_107009_b(var31);
                  }
               }
            }
         }

         C_100605_lt var28 = this.field_109956_a.func_103087_v();
         if(var28.func_108843_a()) {
            this.func_109944_b(new C_100287_el(this.field_109956_a.field_103212_k, var28, false));
         }
      } else if(this.field_109960_m++ % this.field_109955_c == 0 || this.field_109956_a.field_103226_am) {
         int var2;
         int var3;
         if(this.field_109956_a.field_103207_o == null) {
            ++this.field_109966_u;
            var2 = this.field_109956_a.field_103208_ar.func_109298_a(this.field_109956_a.field_103221_t);
            var3 = C_100650_jv.func_108910_c(this.field_109956_a.field_103219_u * 32.0D);
            int var4 = this.field_109956_a.field_103208_ar.func_109298_a(this.field_109956_a.field_103217_v);
            int var5 = C_100650_jv.func_108933_d(this.field_109956_a.field_103236_z * 256.0F / 360.0F);
            int var6 = C_100650_jv.func_108933_d(this.field_109956_a.field_103177_A * 256.0F / 360.0F);
            int var7 = var2 - this.field_109952_d;
            int var8 = var3 - this.field_109953_e;
            int var9 = var4 - this.field_109950_f;
            Object var10 = null;
            boolean var11 = Math.abs(var7) >= 4 || Math.abs(var8) >= 4 || Math.abs(var9) >= 4 || this.field_109960_m % 60 == 0;
            boolean var12 = Math.abs(var5 - this.field_109951_g) >= 4 || Math.abs(var6 - this.field_109963_h) >= 4;
            if(var7 >= -128 && var7 < 128 && var8 >= -128 && var8 < 128 && var9 >= -128 && var9 < 128 && this.field_109966_u <= 400) {
               if(var11 && var12) {
                  var10 = new C_100262_dr(this.field_109956_a.field_103212_k, (byte)var7, (byte)var8, (byte)var9, (byte)var5, (byte)var6);
               } else if(var11) {
                  var10 = new C_100256_dq(this.field_109956_a.field_103212_k, (byte)var7, (byte)var8, (byte)var9);
               } else if(var12) {
                  var10 = new C_100260_ds(this.field_109956_a.field_103212_k, (byte)var5, (byte)var6);
               }
            } else {
               this.field_109966_u = 0;
               var10 = new C_100263_ew(this.field_109956_a.field_103212_k, var2, var3, var4, (byte)var5, (byte)var6);
            }

            if(this.field_109967_t) {
               double var13 = this.field_109956_a.field_103215_w - this.field_109961_j;
               double var15 = this.field_109956_a.field_103240_x - this.field_109962_k;
               double var17 = this.field_109956_a.field_103238_y - this.field_109959_l;
               double var19 = 0.02D;
               double var21 = var13 * var13 + var15 * var15 + var17 * var17;
               if(var21 > var19 * var19 || var21 > 0.0D && this.field_109956_a.field_103215_w == 0.0D && this.field_109956_a.field_103240_x == 0.0D && this.field_109956_a.field_103238_y == 0.0D) {
                  this.field_109961_j = this.field_109956_a.field_103215_w;
                  this.field_109962_k = this.field_109956_a.field_103240_x;
                  this.field_109959_l = this.field_109956_a.field_103238_y;
                  this.func_109940_a(new C_100301_em(this.field_109956_a.field_103212_k, this.field_109961_j, this.field_109962_k, this.field_109959_l));
               }
            }

            if(var10 != null) {
               this.func_109940_a((C_100219_dx)var10);
            }

            C_100605_lt var32 = this.field_109956_a.func_103087_v();
            if(var32.func_108843_a()) {
               this.func_109944_b(new C_100287_el(this.field_109956_a.field_103212_k, var32, false));
            }

            if(var11) {
               this.field_109952_d = var2;
               this.field_109953_e = var3;
               this.field_109950_f = var4;
            }

            if(var12) {
               this.field_109951_g = var5;
               this.field_109963_h = var6;
            }
         } else {
            var2 = C_100650_jv.func_108933_d(this.field_109956_a.field_103236_z * 256.0F / 360.0F);
            var3 = C_100650_jv.func_108933_d(this.field_109956_a.field_103177_A * 256.0F / 360.0F);
            boolean var25 = Math.abs(var2 - this.field_109951_g) >= 4 || Math.abs(var3 - this.field_109963_h) >= 4;
            if(var25) {
               this.func_109940_a(new C_100260_ds(this.field_109956_a.field_103212_k, (byte)var2, (byte)var3));
               this.field_109951_g = var2;
               this.field_109963_h = var3;
            }

            this.field_109952_d = this.field_109956_a.field_103208_ar.func_109298_a(this.field_109956_a.field_103221_t);
            this.field_109953_e = C_100650_jv.func_108910_c(this.field_109956_a.field_103219_u * 32.0D);
            this.field_109950_f = this.field_109956_a.field_103208_ar.func_109298_a(this.field_109956_a.field_103217_v);
         }

         var2 = C_100650_jv.func_108933_d(this.field_109956_a.func_103054_ap() * 256.0F / 360.0F);
         if(Math.abs(var2 - this.field_109964_i) >= 4) {
            this.func_109940_a(new C_100279_eh(this.field_109956_a.field_103212_k, (byte)var2));
            this.field_109964_i = var2;
         }

         this.field_109956_a.field_103226_am = false;
      }

      if(this.field_109956_a.field_103185_I) {
         this.func_109944_b(new C_100301_em(this.field_109956_a));
         this.field_109956_a.field_103185_I = false;
      }

   }

   public void func_109940_a(C_100219_dx var1) {
      Iterator var2 = this.field_109958_o.iterator();

      while(var2.hasNext()) {
         C_100762_ih var3 = (C_100762_ih)var2.next();
         var3.field_104518_a.func_107009_b(var1);
      }

   }

   public void func_109944_b(C_100219_dx var1) {
      this.func_109940_a(var1);
      if(this.field_109956_a instanceof C_100762_ih) {
         ((C_100762_ih)this.field_109956_a).field_104518_a.func_107009_b(var1);
      }

   }

   public void func_109943_a() {
      Iterator var1 = this.field_109958_o.iterator();

      while(var1.hasNext()) {
         C_100762_ih var2 = (C_100762_ih)var1.next();
         var2.field_104513_g.add(Integer.valueOf(this.field_109956_a.field_103212_k));
      }

   }

   public void func_109946_a(C_100762_ih var1) {
      if(this.field_109958_o.contains(var1)) {
         var1.field_104513_g.add(Integer.valueOf(this.field_109956_a.field_103212_k));
         this.field_109958_o.remove(var1);
      }

   }

   public void func_109948_b(C_100762_ih var1) {
      if(var1 != this.field_109956_a) {
         double var2 = var1.field_103221_t - (double)(this.field_109952_d / 32);
         double var4 = var1.field_103217_v - (double)(this.field_109950_f / 32);
         if(var2 >= (double)(-this.field_109954_b) && var2 <= (double)this.field_109954_b && var4 >= (double)(-this.field_109954_b) && var4 <= (double)this.field_109954_b) {
            if(!this.field_109958_o.contains(var1) && this.func_109942_d(var1)) {
               this.field_109958_o.add(var1);
               C_100219_dx var6 = this.func_109941_b();
               var1.field_104518_a.func_107009_b(var6);
               if(this.field_109956_a instanceof C_100596_lm) {
                  var1.field_104518_a.func_107009_b(new C_100287_el(this.field_109956_a.field_103212_k, this.field_109956_a.func_103087_v(), true));
               }

               this.field_109961_j = this.field_109956_a.field_103215_w;
               this.field_109962_k = this.field_109956_a.field_103240_x;
               this.field_109959_l = this.field_109956_a.field_103238_y;
               if(this.field_109967_t && !(var6 instanceof C_100403_cg)) {
                  var1.field_104518_a.func_107009_b(new C_100301_em(this.field_109956_a.field_103212_k, this.field_109956_a.field_103215_w, this.field_109956_a.field_103240_x, this.field_109956_a.field_103238_y));
               }

               if(this.field_109956_a.field_103207_o != null) {
                  var1.field_104518_a.func_107009_b(new C_100309_eq(this.field_109956_a, this.field_109956_a.field_103207_o));
               }

               if(this.field_109956_a instanceof C_100595_ln) {
                  for(int var7 = 0; var7 < 5; ++var7) {
                     C_100994_tv var8 = ((C_100595_ln)this.field_109956_a).func_103374_p(var7);
                     if(var8 != null) {
                        var1.field_104518_a.func_107009_b(new C_100299_en(this.field_109956_a.field_103212_k, var7, var8));
                     }
                  }
               }

               if(this.field_109956_a instanceof C_101095_qg) {
                  C_101095_qg var11 = (C_101095_qg)this.field_109956_a;
                  if(var11.func_103369_bt()) {
                     var1.field_104518_a.func_107009_b(new C_100363_dc(this.field_109956_a, 0, C_100650_jv.func_108910_c(this.field_109956_a.field_103221_t), C_100650_jv.func_108910_c(this.field_109956_a.field_103219_u), C_100650_jv.func_108910_c(this.field_109956_a.field_103217_v)));
                  }
               }

               if(this.field_109956_a instanceof C_100595_ln) {
                  C_100595_ln var10 = (C_100595_ln)this.field_109956_a;
                  Iterator var12 = var10.func_103291_bw().iterator();

                  while(var12.hasNext()) {
                     C_100692_kx var9 = (C_100692_kx)var12.next();
                     var1.field_104518_a.func_107009_b(new C_100276_fb(this.field_109956_a.field_103212_k, var9));
                  }
               }
            }
         } else if(this.field_109958_o.contains(var1)) {
            this.field_109958_o.remove(var1);
            var1.field_104513_g.add(Integer.valueOf(this.field_109956_a.field_103212_k));
         }

      }
   }

   private boolean func_109942_d(C_100762_ih var1) {
      return var1.func_104506_p().func_109602_r().func_109681_a(var1, this.field_109956_a.field_103218_ai, this.field_109956_a.field_103214_ak);
   }

   public void func_109949_b(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         C_101095_qg var3 = (C_101095_qg)var2.next();
         this.func_109948_b((C_100762_ih)var3);
      }

   }

   private C_100219_dx func_109941_b() {
      if(this.field_109956_a.field_103180_L) {
         System.out.println("Fetching addPacket for removed entity");
      }

      if(this.field_109956_a instanceof C_100576_pg) {
         C_100576_pg var9 = (C_100576_pg)this.field_109956_a;
         C_100409_cf var10 = new C_100409_cf(var9);
         var9.field_103221_t = (double)var10.field_106889_b / 32.0D;
         var9.field_103219_u = (double)var10.field_106890_c / 32.0D;
         var9.field_103217_v = (double)var10.field_106887_d / 32.0D;
         return var10;
      } else if(this.field_109956_a instanceof C_100762_ih) {
         return new C_100399_ci((C_101095_qg)this.field_109956_a);
      } else {
         if(this.field_109956_a instanceof C_100590_ph) {
            C_100590_ph var1 = (C_100590_ph)this.field_109956_a;
            if(var1.field_104761_a == 0) {
               return new C_100411_cc(this.field_109956_a, 10);
            }

            if(var1.field_104761_a == 1) {
               return new C_100411_cc(this.field_109956_a, 11);
            }

            if(var1.field_104761_a == 2) {
               return new C_100411_cc(this.field_109956_a, 12);
            }
         }

         if(this.field_109956_a instanceof C_100572_pe) {
            return new C_100411_cc(this.field_109956_a, 1);
         } else if(!(this.field_109956_a instanceof C_100696_kz) && !(this.field_109956_a instanceof C_100568_oy)) {
            if(this.field_109956_a instanceof C_101090_ql) {
               C_101095_qg var8 = ((C_101090_ql)this.field_109956_a).field_104714_b;
               return new C_100411_cc(this.field_109956_a, 90, var8 != null?var8.field_103212_k:this.field_109956_a.field_103212_k);
            } else if(this.field_109956_a instanceof C_101089_qi) {
               C_100730_lb var7 = ((C_101089_qi)this.field_109956_a).field_104675_c;
               return new C_100411_cc(this.field_109956_a, 60, var7 != null?var7.field_103212_k:this.field_109956_a.field_103212_k);
            } else if(this.field_109956_a instanceof C_101086_qp) {
               return new C_100411_cc(this.field_109956_a, 61);
            } else if(this.field_109956_a instanceof C_101078_qu) {
               return new C_100411_cc(this.field_109956_a, 73, ((C_101078_qu)this.field_109956_a).func_104696_h());
            } else if(this.field_109956_a instanceof C_101081_qt) {
               return new C_100411_cc(this.field_109956_a, 75);
            } else if(this.field_109956_a instanceof C_101080_qs) {
               return new C_100411_cc(this.field_109956_a, 65);
            } else if(this.field_109956_a instanceof C_101088_qj) {
               return new C_100411_cc(this.field_109956_a, 72);
            } else {
               C_100411_cc var2;
               if(this.field_109956_a instanceof C_101091_qk) {
                  C_101091_qk var6 = (C_101091_qk)this.field_109956_a;
                  var2 = null;
                  byte var3 = 63;
                  if(this.field_109956_a instanceof C_101087_qo) {
                     var3 = 64;
                  } else if(this.field_109956_a instanceof C_101079_qv) {
                     var3 = 66;
                  }

                  if(var6.field_104736_a != null) {
                     var2 = new C_100411_cc(this.field_109956_a, var3, ((C_101091_qk)this.field_109956_a).field_104736_a.field_103212_k);
                  } else {
                     var2 = new C_100411_cc(this.field_109956_a, var3, 0);
                  }

                  var2.field_106896_e = (int)(var6.field_104734_b * 8000.0D);
                  var2.field_106893_f = (int)(var6.field_104735_c * 8000.0D);
                  var2.field_106894_g = (int)(var6.field_104732_d * 8000.0D);
                  return var2;
               } else if(this.field_109956_a instanceof C_101083_qr) {
                  return new C_100411_cc(this.field_109956_a, 62);
               } else if(this.field_109956_a instanceof C_100591_pi) {
                  return new C_100411_cc(this.field_109956_a, 50);
               } else if(this.field_109956_a instanceof C_100563_ox) {
                  return new C_100411_cc(this.field_109956_a, 51);
               } else if(this.field_109956_a instanceof C_100574_pf) {
                  C_100574_pf var5 = (C_100574_pf)this.field_109956_a;
                  return new C_100411_cc(this.field_109956_a, 70, var5.field_103271_a | var5.field_103269_b << 16);
               } else if(this.field_109956_a instanceof C_100600_lq) {
                  return new C_100405_ch((C_100600_lq)this.field_109956_a);
               } else if(this.field_109956_a instanceof C_100596_lm) {
                  C_100596_lm var4 = (C_100596_lm)this.field_109956_a;
                  var2 = new C_100411_cc(this.field_109956_a, 71, var4.field_104581_a);
                  var2.field_106897_b = C_100650_jv.func_108933_d((float)(var4.field_104579_b * 32));
                  var2.field_106898_c = C_100650_jv.func_108933_d((float)(var4.field_104580_c * 32));
                  var2.field_106895_d = C_100650_jv.func_108933_d((float)(var4.field_104577_d * 32));
                  return var2;
               } else if(this.field_109956_a instanceof C_100722_lj) {
                  return new C_100413_cd((C_100722_lj)this.field_109956_a);
               } else {
                  throw new IllegalArgumentException("Don\'t know how to add " + this.field_109956_a.getClass() + "!");
               }
            }
         } else {
            this.field_109964_i = C_100650_jv.func_108933_d(this.field_109956_a.func_103054_ap() * 256.0F / 360.0F);
            return new C_100403_cg((C_100595_ln)this.field_109956_a);
         }
      }
   }

   public void func_109945_c(C_100762_ih var1) {
      if(this.field_109958_o.contains(var1)) {
         this.field_109958_o.remove(var1);
         var1.field_104513_g.add(Integer.valueOf(this.field_109956_a.field_103212_k));
      }

   }
}
