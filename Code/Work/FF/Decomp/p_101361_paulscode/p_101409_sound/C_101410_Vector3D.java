package p_101361_paulscode.p_101409_sound;


public class C_101410_Vector3D {

   public float field_102507_x;
   public float field_102506_y;
   public float field_102505_z;


   public C_101410_Vector3D() {
      this.field_102507_x = 0.0F;
      this.field_102506_y = 0.0F;
      this.field_102505_z = 0.0F;
   }

   public C_101410_Vector3D(float var1, float var2, float var3) {
      this.field_102507_x = var1;
      this.field_102506_y = var2;
      this.field_102505_z = var3;
   }

   public C_101410_Vector3D func_102499_clone() {
      return new C_101410_Vector3D(this.field_102507_x, this.field_102506_y, this.field_102505_z);
   }

   public C_101410_Vector3D func_102501_cross(C_101410_Vector3D var1, C_101410_Vector3D var2) {
      return new C_101410_Vector3D(var1.field_102506_y * var2.field_102505_z - var2.field_102506_y * var1.field_102505_z, var1.field_102505_z * var2.field_102507_x - var2.field_102505_z * var1.field_102507_x, var1.field_102507_x * var2.field_102506_y - var2.field_102507_x * var1.field_102506_y);
   }

   public C_101410_Vector3D func_102494_cross(C_101410_Vector3D var1) {
      return new C_101410_Vector3D(this.field_102506_y * var1.field_102505_z - var1.field_102506_y * this.field_102505_z, this.field_102505_z * var1.field_102507_x - var1.field_102505_z * this.field_102507_x, this.field_102507_x * var1.field_102506_y - var1.field_102507_x * this.field_102506_y);
   }

   public float func_102495_dot(C_101410_Vector3D var1, C_101410_Vector3D var2) {
      return var1.field_102507_x * var2.field_102507_x + var1.field_102506_y * var2.field_102506_y + var1.field_102505_z * var2.field_102505_z;
   }

   public float func_102502_dot(C_101410_Vector3D var1) {
      return this.field_102507_x * var1.field_102507_x + this.field_102506_y * var1.field_102506_y + this.field_102505_z * var1.field_102505_z;
   }

   public C_101410_Vector3D func_102496_add(C_101410_Vector3D var1, C_101410_Vector3D var2) {
      return new C_101410_Vector3D(var1.field_102507_x + var2.field_102507_x, var1.field_102506_y + var2.field_102506_y, var1.field_102505_z + var2.field_102505_z);
   }

   public C_101410_Vector3D func_102498_add(C_101410_Vector3D var1) {
      return new C_101410_Vector3D(this.field_102507_x + var1.field_102507_x, this.field_102506_y + var1.field_102506_y, this.field_102505_z + var1.field_102505_z);
   }

   public C_101410_Vector3D func_102500_subtract(C_101410_Vector3D var1, C_101410_Vector3D var2) {
      return new C_101410_Vector3D(var1.field_102507_x - var2.field_102507_x, var1.field_102506_y - var2.field_102506_y, var1.field_102505_z - var2.field_102505_z);
   }

   public C_101410_Vector3D func_102503_subtract(C_101410_Vector3D var1) {
      return new C_101410_Vector3D(this.field_102507_x - var1.field_102507_x, this.field_102506_y - var1.field_102506_y, this.field_102505_z - var1.field_102505_z);
   }

   public float func_102504_length() {
      return (float)Math.sqrt((double)(this.field_102507_x * this.field_102507_x + this.field_102506_y * this.field_102506_y + this.field_102505_z * this.field_102505_z));
   }

   public void func_102497_normalize() {
      double var1 = Math.sqrt((double)(this.field_102507_x * this.field_102507_x + this.field_102506_y * this.field_102506_y + this.field_102505_z * this.field_102505_z));
      this.field_102507_x = (float)((double)this.field_102507_x / var1);
      this.field_102506_y = (float)((double)this.field_102506_y / var1);
      this.field_102505_z = (float)((double)this.field_102505_z / var1);
   }

   public String toString() {
      return "Vector3D (" + this.field_102507_x + ", " + this.field_102506_y + ", " + this.field_102505_z + ")";
   }
}
