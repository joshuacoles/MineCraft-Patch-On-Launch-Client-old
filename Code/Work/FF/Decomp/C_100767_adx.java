import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class C_100767_adx {

   protected C_100516_abo field_108404_e;
   protected int field_108402_f;
   protected int field_108403_g;


   protected C_100767_adx(int var1) {
      this.field_108403_g = var1;
      this.field_108402_f = -1;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {}

   public abstract boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3);

   public C_100516_abo func_108381_b() {
      return this.field_108404_e;
   }

   public int func_108394_c() {
      return this.field_108403_g;
   }

   public static C_100767_adx func_108401_a(List var0, C_100516_abo var1) {
      Iterator var2 = var0.iterator();

      C_100767_adx var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (C_100767_adx)var2.next();
      } while(var3.func_108381_b() == null || !var3.func_108381_b().func_108333_a(var1));

      return var3;
   }

   public C_100851_xw func_108390_a() {
      return new C_100851_xw(this.field_108404_e.func_108326_e(), this.field_108404_e.func_108323_f(), this.field_108404_e.func_108335_g());
   }

   protected boolean func_108399_a(C_100873_xe var1, C_100516_abo var2) {
      int var3 = Math.max(this.field_108404_e.field_108341_a - 1, var2.field_108341_a);
      int var4 = Math.max(this.field_108404_e.field_108339_b - 1, var2.field_108339_b);
      int var5 = Math.max(this.field_108404_e.field_108340_c - 1, var2.field_108340_c);
      int var6 = Math.min(this.field_108404_e.field_108337_d + 1, var2.field_108337_d);
      int var7 = Math.min(this.field_108404_e.field_108338_e + 1, var2.field_108338_e);
      int var8 = Math.min(this.field_108404_e.field_108336_f + 1, var2.field_108336_f);

      int var9;
      int var10;
      int var11;
      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var5; var10 <= var8; ++var10) {
            var11 = var1.func_109349_a(var9, var4, var10);
            if(var11 > 0 && C_100451_alf.field_106118_p[var11].field_106204_cB.func_108986_d()) {
               return true;
            }

            var11 = var1.func_109349_a(var9, var7, var10);
            if(var11 > 0 && C_100451_alf.field_106118_p[var11].field_106204_cB.func_108986_d()) {
               return true;
            }
         }
      }

      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            var11 = var1.func_109349_a(var9, var10, var5);
            if(var11 > 0 && C_100451_alf.field_106118_p[var11].field_106204_cB.func_108986_d()) {
               return true;
            }

            var11 = var1.func_109349_a(var9, var10, var8);
            if(var11 > 0 && C_100451_alf.field_106118_p[var11].field_106204_cB.func_108986_d()) {
               return true;
            }
         }
      }

      for(var9 = var5; var9 <= var8; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            var11 = var1.func_109349_a(var3, var10, var9);
            if(var11 > 0 && C_100451_alf.field_106118_p[var11].field_106204_cB.func_108986_d()) {
               return true;
            }

            var11 = var1.func_109349_a(var6, var10, var9);
            if(var11 > 0 && C_100451_alf.field_106118_p[var11].field_106204_cB.func_108986_d()) {
               return true;
            }
         }
      }

      return false;
   }

   protected int func_108382_a(int var1, int var2) {
      switch(this.field_108402_f) {
      case 0:
      case 2:
         return this.field_108404_e.field_108341_a + var1;
      case 1:
         return this.field_108404_e.field_108337_d - var2;
      case 3:
         return this.field_108404_e.field_108341_a + var2;
      default:
         return var1;
      }
   }

   protected int func_108379_a(int var1) {
      return this.field_108402_f == -1?var1:var1 + this.field_108404_e.field_108339_b;
   }

   protected int func_108389_b(int var1, int var2) {
      switch(this.field_108402_f) {
      case 0:
         return this.field_108404_e.field_108340_c + var2;
      case 1:
      case 3:
         return this.field_108404_e.field_108340_c + var1;
      case 2:
         return this.field_108404_e.field_108336_f - var2;
      default:
         return var2;
      }
   }

   protected int func_108380_c(int var1, int var2) {
      if(var1 == C_100451_alf.field_106186_aJ.field_106162_cm) {
         if(this.field_108402_f == 1 || this.field_108402_f == 3) {
            if(var2 == 1) {
               return 0;
            }

            return 1;
         }
      } else if(var1 != C_100451_alf.field_106200_aH.field_106162_cm && var1 != C_100451_alf.field_106191_aO.field_106162_cm) {
         if(var1 != C_100451_alf.field_106187_aK.field_106162_cm && var1 != C_100451_alf.field_106218_aw.field_106162_cm && var1 != C_100451_alf.field_106251_bF.field_106162_cm && var1 != C_100451_alf.field_106176_bA.field_106162_cm && var1 != C_100451_alf.field_106209_bT.field_106162_cm) {
            if(var1 == C_100451_alf.field_106185_aI.field_106162_cm) {
               if(this.field_108402_f == 0) {
                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 3) {
                     return 2;
                  }
               } else if(this.field_108402_f == 1) {
                  if(var2 == 2) {
                     return 4;
                  }

                  if(var2 == 3) {
                     return 5;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 5) {
                     return 3;
                  }
               } else if(this.field_108402_f == 3) {
                  if(var2 == 2) {
                     return 5;
                  }

                  if(var2 == 3) {
                     return 4;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 5) {
                     return 3;
                  }
               }
            } else if(var1 == C_100451_alf.field_106182_aU.field_106162_cm) {
               if(this.field_108402_f == 0) {
                  if(var2 == 3) {
                     return 4;
                  }

                  if(var2 == 4) {
                     return 3;
                  }
               } else if(this.field_108402_f == 1) {
                  if(var2 == 3) {
                     return 1;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 1) {
                     return 4;
                  }
               } else if(this.field_108402_f == 3) {
                  if(var2 == 3) {
                     return 2;
                  }

                  if(var2 == 4) {
                     return 1;
                  }

                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 1) {
                     return 4;
                  }
               }
            } else if(var1 != C_100451_alf.field_106219_bW.field_106162_cm && (C_100451_alf.field_106118_p[var1] == null || !(C_100451_alf.field_106118_p[var1] instanceof C_100186_aij))) {
               if(var1 == C_100451_alf.field_106240_ac.field_106162_cm || var1 == C_100451_alf.field_106094_Y.field_106162_cm || var1 == C_100451_alf.field_106189_aM.field_106162_cm || var1 == C_100451_alf.field_106092_S.field_106162_cm) {
                  if(this.field_108402_f == 0) {
                     if(var2 == 2 || var2 == 3) {
                        return C_100012_j.field_105266_a[var2];
                     }
                  } else if(this.field_108402_f == 1) {
                     if(var2 == 2) {
                        return 4;
                     }

                     if(var2 == 3) {
                        return 5;
                     }

                     if(var2 == 4) {
                        return 2;
                     }

                     if(var2 == 5) {
                        return 3;
                     }
                  } else if(this.field_108402_f == 3) {
                     if(var2 == 2) {
                        return 5;
                     }

                     if(var2 == 3) {
                        return 4;
                     }

                     if(var2 == 4) {
                        return 2;
                     }

                     if(var2 == 5) {
                        return 3;
                     }
                  }
               }
            } else if(this.field_108402_f == 0) {
               if(var2 == 0 || var2 == 2) {
                  return C_100015_i.field_105277_f[var2];
               }
            } else if(this.field_108402_f == 1) {
               if(var2 == 2) {
                  return 1;
               }

               if(var2 == 0) {
                  return 3;
               }

               if(var2 == 1) {
                  return 2;
               }

               if(var2 == 3) {
                  return 0;
               }
            } else if(this.field_108402_f == 3) {
               if(var2 == 2) {
                  return 3;
               }

               if(var2 == 0) {
                  return 1;
               }

               if(var2 == 1) {
                  return 2;
               }

               if(var2 == 3) {
                  return 0;
               }
            }
         } else if(this.field_108402_f == 0) {
            if(var2 == 2) {
               return 3;
            }

            if(var2 == 3) {
               return 2;
            }
         } else if(this.field_108402_f == 1) {
            if(var2 == 0) {
               return 2;
            }

            if(var2 == 1) {
               return 3;
            }

            if(var2 == 2) {
               return 0;
            }

            if(var2 == 3) {
               return 1;
            }
         } else if(this.field_108402_f == 3) {
            if(var2 == 0) {
               return 2;
            }

            if(var2 == 1) {
               return 3;
            }

            if(var2 == 2) {
               return 1;
            }

            if(var2 == 3) {
               return 0;
            }
         }
      } else if(this.field_108402_f == 0) {
         if(var2 == 0) {
            return 2;
         }

         if(var2 == 2) {
            return 0;
         }
      } else {
         if(this.field_108402_f == 1) {
            return var2 + 1 & 3;
         }

         if(this.field_108402_f == 3) {
            return var2 + 3 & 3;
         }
      }

      return var2;
   }

   protected void func_108400_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, C_100516_abo var7) {
      int var8 = this.func_108382_a(var4, var6);
      int var9 = this.func_108379_a(var5);
      int var10 = this.func_108389_b(var4, var6);
      if(var7.func_108334_b(var8, var9, var10)) {
         var1.func_109526_c(var8, var9, var10, var2, var3);
      }
   }

   protected int func_108378_a(C_100873_xe var1, int var2, int var3, int var4, C_100516_abo var5) {
      int var6 = this.func_108382_a(var2, var4);
      int var7 = this.func_108379_a(var3);
      int var8 = this.func_108389_b(var2, var4);
      return !var5.func_108334_b(var6, var7, var8)?0:var1.func_109349_a(var6, var7, var8);
   }

   protected void func_108397_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = var4; var9 <= var7; ++var9) {
         for(int var10 = var3; var10 <= var6; ++var10) {
            for(int var11 = var5; var11 <= var8; ++var11) {
               this.func_108400_a(var1, 0, 0, var10, var9, var11, var2);
            }
         }
      }

   }

   protected void func_108384_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var11 || this.func_108378_a(var1, var13, var12, var14, var2) != 0) {
                  if(var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.func_108400_a(var1, var10, 0, var13, var12, var14, var2);
                  } else {
                     this.func_108400_a(var1, var9, 0, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void func_108388_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      for(int var14 = var4; var14 <= var7; ++var14) {
         for(int var15 = var3; var15 <= var6; ++var15) {
            for(int var16 = var5; var16 <= var8; ++var16) {
               if(!var13 || this.func_108378_a(var1, var15, var14, var16, var2) != 0) {
                  if(var14 != var4 && var14 != var7 && var15 != var3 && var15 != var6 && var16 != var5 && var16 != var8) {
                     this.func_108400_a(var1, var11, var12, var15, var14, var16, var2);
                  } else {
                     this.func_108400_a(var1, var9, var10, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void func_108377_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, C_100769_ady var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var9 || this.func_108378_a(var1, var13, var12, var14, var2) != 0) {
                  var11.func_109324_a(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.func_108400_a(var1, var11.func_109325_a(), var11.func_109326_b(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void func_108396_a(C_100873_xe var1, C_100516_abo var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      for(int var14 = var6; var14 <= var9; ++var14) {
         for(int var15 = var5; var15 <= var8; ++var15) {
            for(int var16 = var7; var16 <= var10; ++var16) {
               if(var3.nextFloat() <= var4 && (!var13 || this.func_108378_a(var1, var15, var14, var16, var2) != 0)) {
                  if(var14 != var6 && var14 != var9 && var15 != var5 && var15 != var8 && var16 != var7 && var16 != var10) {
                     this.func_108400_a(var1, var12, 0, var15, var14, var16, var2);
                  } else {
                     this.func_108400_a(var1, var11, 0, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void func_108395_a(C_100873_xe var1, C_100516_abo var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if(var3.nextFloat() < var4) {
         this.func_108400_a(var1, var8, var9, var5, var6, var7, var2);
      }

   }

   protected void func_108398_a(C_100873_xe var1, C_100516_abo var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if(!var10 || this.func_108378_a(var1, var18, var16, var20, var2) != 0) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if(var22 <= 1.05F) {
                     this.func_108400_a(var1, var9, 0, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void func_108392_b(C_100873_xe var1, int var2, int var3, int var4, C_100516_abo var5) {
      int var6 = this.func_108382_a(var2, var4);
      int var7 = this.func_108379_a(var3);
      int var8 = this.func_108389_b(var2, var4);
      if(var5.func_108334_b(var6, var7, var8)) {
         while(!var1.func_109352_c(var6, var7, var8) && var7 < 255) {
            var1.func_109526_c(var6, var7, var8, 0, 0);
            ++var7;
         }

      }
   }

   protected void func_108383_b(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, C_100516_abo var7) {
      int var8 = this.func_108382_a(var4, var6);
      int var9 = this.func_108379_a(var5);
      int var10 = this.func_108389_b(var4, var6);
      if(var7.func_108334_b(var8, var9, var10)) {
         while((var1.func_109352_c(var8, var9, var10) || var1.func_109350_f(var8, var9, var10).func_108986_d()) && var9 > 1) {
            var1.func_109526_c(var8, var9, var10, var2, var3);
            --var9;
         }

      }
   }

   protected boolean func_108393_a(C_100873_xe var1, C_100516_abo var2, Random var3, int var4, int var5, int var6, C_100673_kh[] var7, int var8) {
      int var9 = this.func_108382_a(var4, var6);
      int var10 = this.func_108379_a(var5);
      int var11 = this.func_108389_b(var4, var6);
      if(var2.func_108334_b(var9, var10, var11) && var1.func_109349_a(var9, var10, var11) != C_100451_alf.field_106216_ax.field_106162_cm) {
         var1.func_109422_e(var9, var10, var11, C_100451_alf.field_106216_ax.field_106162_cm);
         C_100422_amb var12 = (C_100422_amb)var1.func_109353_p(var9, var10, var11);
         if(var12 != null) {
            C_100673_kh.func_109105_a(var3, var7, var12, var8);
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean func_108385_a(C_100873_xe var1, C_100516_abo var2, Random var3, int var4, int var5, int var6, int var7, C_100673_kh[] var8, int var9) {
      int var10 = this.func_108382_a(var4, var6);
      int var11 = this.func_108379_a(var5);
      int var12 = this.func_108389_b(var4, var6);
      if(var2.func_108334_b(var10, var11, var12) && var1.func_109349_a(var10, var11, var12) != C_100451_alf.field_106092_S.field_106162_cm) {
         var1.func_109394_d(var10, var11, var12, C_100451_alf.field_106092_S.field_106162_cm, this.func_108380_c(C_100451_alf.field_106092_S.field_106162_cm, var7));
         C_100420_amd var13 = (C_100420_amd)var1.func_109353_p(var10, var11, var12);
         if(var13 != null) {
            C_100673_kh.func_109106_a(var3, var8, var13, var9);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void func_108386_a(C_100873_xe var1, C_100516_abo var2, Random var3, int var4, int var5, int var6, int var7) {
      int var8 = this.func_108382_a(var4, var6);
      int var9 = this.func_108379_a(var5);
      int var10 = this.func_108389_b(var4, var6);
      if(var2.func_108334_b(var8, var9, var10)) {
         C_101016_te.func_111028_a(var1, var8, var9, var10, var7, C_100451_alf.field_106200_aH);
      }

   }
}
