import java.io.Reader;
import java.util.Arrays;

public final class C_101200_apy {

   public void func_111949_a(Reader var1, C_101198_apw var2) {
      C_101199_apx var3 = new C_101199_apx(var1);
      char var4 = (char)var3.func_111933_a();
      switch(var4) {
      case 91:
         var3.func_111936_a(var4);
         var2.func_111855_b();
         this.func_111947_a(var3, var2);
         break;
      case 123:
         var3.func_111936_a(var4);
         var2.func_111855_b();
         this.func_111954_b(var3, var2);
         break;
      default:
         throw new C_101197_apv("Expected either [ or { but got [" + var4 + "].", var3);
      }

      int var5 = this.func_111943_l(var3);
      if(var5 != -1) {
         throw new C_101197_apv("Got unexpected trailing character [" + (char)var5 + "].", var3);
      } else {
         var2.func_111856_c();
      }
   }

   private void func_111947_a(C_101199_apx var1, C_101198_apw var2) {
      char var3 = (char)this.func_111943_l(var1);
      if(var3 != 91) {
         throw new C_101197_apv("Expected object to start with [ but got [" + var3 + "].", var1);
      } else {
         var2.func_111851_d();
         char var4 = (char)this.func_111943_l(var1);
         var1.func_111936_a(var4);
         if(var4 != 93) {
            this.func_111944_d(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.func_111943_l(var1);
            switch(var6) {
            case 44:
               this.func_111944_d(var1, var2);
               break;
            case 93:
               var5 = true;
               break;
            default:
               throw new C_101197_apv("Expected either , or ] but got [" + var6 + "].", var1);
            }
         }

         var2.func_111854_e();
      }
   }

   private void func_111954_b(C_101199_apx var1, C_101198_apw var2) {
      char var3 = (char)this.func_111943_l(var1);
      if(var3 != 123) {
         throw new C_101197_apv("Expected object to start with { but got [" + var3 + "].", var1);
      } else {
         var2.func_111850_f();
         char var4 = (char)this.func_111943_l(var1);
         var1.func_111936_a(var4);
         if(var4 != 125) {
            this.func_111955_c(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.func_111943_l(var1);
            switch(var6) {
            case 44:
               this.func_111955_c(var1, var2);
               break;
            case 125:
               var5 = true;
               break;
            default:
               throw new C_101197_apv("Expected either , or } but got [" + var6 + "].", var1);
            }
         }

         var2.func_111852_g();
      }
   }

   private void func_111955_c(C_101199_apx var1, C_101198_apw var2) {
      char var3 = (char)this.func_111943_l(var1);
      if(34 != var3) {
         throw new C_101197_apv("Expected object identifier to begin with [\"] but got [" + var3 + "].", var1);
      } else {
         var1.func_111936_a(var3);
         var2.func_111847_a(this.func_111953_i(var1));
         char var4 = (char)this.func_111943_l(var1);
         if(var4 != 58) {
            throw new C_101197_apv("Expected object identifier to be followed by : but got [" + var4 + "].", var1);
         } else {
            this.func_111944_d(var1, var2);
            var2.func_111857_h();
         }
      }
   }

   private void func_111944_d(C_101199_apx var1, C_101198_apw var2) {
      char var3 = (char)this.func_111943_l(var1);
      switch(var3) {
      case 34:
         var1.func_111936_a(var3);
         var2.func_111846_c(this.func_111953_i(var1));
         break;
      case 45:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         var1.func_111936_a(var3);
         var2.func_111849_b(this.func_111941_a(var1));
         break;
      case 91:
         var1.func_111936_a(var3);
         this.func_111947_a(var1, var2);
         break;
      case 102:
         char[] var6 = new char[4];
         int var7 = var1.func_111934_b(var6);
         if(var7 != 4 || var6[0] != 97 || var6[1] != 108 || var6[2] != 115 || var6[3] != 101) {
            var1.func_111935_a(var6);
            throw new C_101197_apv("Expected \'f\' to be followed by [[a, l, s, e]], but got [" + Arrays.toString(var6) + "].", var1);
         }

         var2.func_111848_j();
         break;
      case 110:
         char[] var8 = new char[3];
         int var9 = var1.func_111934_b(var8);
         if(var9 != 3 || var8[0] != 117 || var8[1] != 108 || var8[2] != 108) {
            var1.func_111935_a(var8);
            throw new C_101197_apv("Expected \'n\' to be followed by [[u, l, l]], but got [" + Arrays.toString(var8) + "].", var1);
         }

         var2.func_111845_k();
         break;
      case 116:
         char[] var4 = new char[3];
         int var5 = var1.func_111934_b(var4);
         if(var5 != 3 || var4[0] != 114 || var4[1] != 117 || var4[2] != 101) {
            var1.func_111935_a(var4);
            throw new C_101197_apv("Expected \'t\' to be followed by [[r, u, e]], but got [" + Arrays.toString(var4) + "].", var1);
         }

         var2.func_111853_i();
         break;
      case 123:
         var1.func_111936_a(var3);
         this.func_111954_b(var1, var2);
         break;
      default:
         throw new C_101197_apv("Invalid character at start of value [" + var3 + "].", var1);
      }

   }

   private String func_111941_a(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.func_111933_a();
      if(45 == var3) {
         var2.append('-');
      } else {
         var1.func_111936_a(var3);
      }

      var2.append(this.func_111952_b(var1));
      return var2.toString();
   }

   private String func_111952_b(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.func_111933_a();
      if(48 == var3) {
         var2.append('0');
         var2.append(this.func_111948_f(var1));
         var2.append(this.func_111945_g(var1));
      } else {
         var1.func_111936_a(var3);
         var2.append(this.func_111957_c(var1));
         var2.append(this.func_111956_e(var1));
         var2.append(this.func_111948_f(var1));
         var2.append(this.func_111945_g(var1));
      }

      return var2.toString();
   }

   private char func_111957_c(C_101199_apx var1) {
      char var3 = (char)var1.func_111933_a();
      switch(var3) {
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         return var3;
      default:
         throw new C_101197_apv("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private char func_111950_d(C_101199_apx var1) {
      char var3 = (char)var1.func_111933_a();
      switch(var3) {
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         return var3;
      default:
         throw new C_101197_apv("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private String func_111956_e(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      boolean var3 = false;

      while(!var3) {
         char var4 = (char)var1.func_111933_a();
         switch(var4) {
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            var2.append(var4);
            break;
         default:
            var3 = true;
            var1.func_111936_a(var4);
         }
      }

      return var2.toString();
   }

   private String func_111948_f(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.func_111933_a();
      if(var3 == 46) {
         var2.append('.');
         var2.append(this.func_111950_d(var1));
         var2.append(this.func_111956_e(var1));
      } else {
         var1.func_111936_a(var3);
      }

      return var2.toString();
   }

   private String func_111945_g(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.func_111933_a();
      if(var3 != 46 && var3 != 69) {
         var1.func_111936_a(var3);
      } else {
         var2.append('E');
         var2.append(this.func_111951_h(var1));
         var2.append(this.func_111950_d(var1));
         var2.append(this.func_111956_e(var1));
      }

      return var2.toString();
   }

   private String func_111951_h(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.func_111933_a();
      if(var3 != 43 && var3 != 45) {
         var1.func_111936_a(var3);
      } else {
         var2.append(var3);
      }

      return var2.toString();
   }

   private String func_111953_i(C_101199_apx var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.func_111933_a();
      if(34 != var3) {
         throw new C_101197_apv("Expected [\"] but got [" + var3 + "].", var1);
      } else {
         boolean var4 = false;

         while(!var4) {
            char var5 = (char)var1.func_111933_a();
            switch(var5) {
            case 34:
               var4 = true;
               break;
            case 92:
               char var6 = this.func_111942_j(var1);
               var2.append(var6);
               break;
            default:
               var2.append(var5);
            }
         }

         return var2.toString();
      }
   }

   private char func_111942_j(C_101199_apx var1) {
      char var3 = (char)var1.func_111933_a();
      char var2;
      switch(var3) {
      case 34:
         var2 = 34;
         break;
      case 47:
         var2 = 47;
         break;
      case 92:
         var2 = 92;
         break;
      case 98:
         var2 = 8;
         break;
      case 102:
         var2 = 12;
         break;
      case 110:
         var2 = 10;
         break;
      case 114:
         var2 = 13;
         break;
      case 116:
         var2 = 9;
         break;
      case 117:
         var2 = (char)this.func_111946_k(var1);
         break;
      default:
         throw new C_101197_apv("Unrecognised escape character [" + var3 + "].", var1);
      }

      return var2;
   }

   private int func_111946_k(C_101199_apx var1) {
      char[] var2 = new char[4];
      int var3 = var1.func_111934_b(var2);
      if(var3 != 4) {
         throw new C_101197_apv("Expected a 4 digit hexidecimal number but got only [" + var3 + "], namely [" + String.valueOf(var2, 0, var3) + "].", var1);
      } else {
         try {
            int var4 = Integer.parseInt(String.valueOf(var2), 16);
            return var4;
         } catch (NumberFormatException var6) {
            var1.func_111935_a(var2);
            throw new C_101197_apv("Unable to parse [" + String.valueOf(var2) + "] as a hexidecimal number.", var6, var1);
         }
      }
   }

   private int func_111943_l(C_101199_apx var1) {
      boolean var3 = false;

      int var2;
      do {
         var2 = var1.func_111933_a();
         switch(var2) {
         case 9:
         case 10:
         case 13:
         case 32:
            break;
         default:
            var3 = true;
         }
      } while(!var3);

      return var2;
   }
}
