
public abstract class C_100396_amz implements C_100391_amy {

   public int hashCode() {
      return this.func_107810_a().hashCode();
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof C_100391_amy)) {
         return false;
      } else {
         C_100391_amy var2 = (C_100391_amy)var1;
         return this.func_107810_a().equals(var2.func_107810_a());
      }
   }

   public abstract C_100377_anb func_107810_a();
}
