
public class C_100968_ayl extends C_100955_ayk {

   private C_101125_ard field_111152_e;


   public C_100968_ayl(C_101125_ard var1) {
      this.field_111152_e = var1;
   }

   public void func_111147_a() {
      this.field_111151_a = 0.0F;
      this.field_111149_b = 0.0F;
      if(this.field_111152_e.field_111693_A.field_111990_e) {
         ++this.field_111149_b;
      }

      if(this.field_111152_e.field_111695_C.field_111990_e) {
         --this.field_111149_b;
      }

      if(this.field_111152_e.field_111694_B.field_111990_e) {
         ++this.field_111151_a;
      }

      if(this.field_111152_e.field_111689_D.field_111990_e) {
         --this.field_111151_a;
      }

      this.field_111150_c = this.field_111152_e.field_111690_E.field_111990_e;
      this.field_111148_d = this.field_111152_e.field_111701_I.field_111990_e;
      if(this.field_111148_d) {
         this.field_111151_a = (float)((double)this.field_111151_a * 0.3D);
         this.field_111149_b = (float)((double)this.field_111149_b * 0.3D);
      }

   }
}
