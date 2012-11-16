package p_101361_paulscode.p_101409_sound;

import p_101361_paulscode.p_101409_sound.C_101410_Vector3D;

public class C_101419_ListenerData {

   public C_101410_Vector3D field_102643_position;
   public C_101410_Vector3D field_102644_lookAt;
   public C_101410_Vector3D field_102647_up;
   public C_101410_Vector3D field_102645_velocity;
   public float field_102646_angle = 0.0F;


   public C_101419_ListenerData() {
      this.field_102643_position = new C_101410_Vector3D(0.0F, 0.0F, 0.0F);
      this.field_102644_lookAt = new C_101410_Vector3D(0.0F, 0.0F, -1.0F);
      this.field_102647_up = new C_101410_Vector3D(0.0F, 1.0F, 0.0F);
      this.field_102645_velocity = new C_101410_Vector3D(0.0F, 0.0F, 0.0F);
      this.field_102646_angle = 0.0F;
   }

   public C_101419_ListenerData(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.field_102643_position = new C_101410_Vector3D(var1, var2, var3);
      this.field_102644_lookAt = new C_101410_Vector3D(var4, var5, var6);
      this.field_102647_up = new C_101410_Vector3D(var7, var8, var9);
      this.field_102645_velocity = new C_101410_Vector3D(0.0F, 0.0F, 0.0F);
      this.field_102646_angle = var10;
   }

   public C_101419_ListenerData(C_101410_Vector3D var1, C_101410_Vector3D var2, C_101410_Vector3D var3, float var4) {
      this.field_102643_position = var1.func_102499_clone();
      this.field_102644_lookAt = var2.func_102499_clone();
      this.field_102647_up = var3.func_102499_clone();
      this.field_102645_velocity = new C_101410_Vector3D(0.0F, 0.0F, 0.0F);
      this.field_102646_angle = var4;
   }

   public void func_102635_setData(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.field_102643_position.field_102507_x = var1;
      this.field_102643_position.field_102506_y = var2;
      this.field_102643_position.field_102505_z = var3;
      this.field_102644_lookAt.field_102507_x = var4;
      this.field_102644_lookAt.field_102506_y = var5;
      this.field_102644_lookAt.field_102505_z = var6;
      this.field_102647_up.field_102507_x = var7;
      this.field_102647_up.field_102506_y = var8;
      this.field_102647_up.field_102505_z = var9;
      this.field_102646_angle = var10;
   }

   public void func_102642_setData(C_101410_Vector3D var1, C_101410_Vector3D var2, C_101410_Vector3D var3, float var4) {
      this.field_102643_position.field_102507_x = var1.field_102507_x;
      this.field_102643_position.field_102506_y = var1.field_102506_y;
      this.field_102643_position.field_102505_z = var1.field_102505_z;
      this.field_102644_lookAt.field_102507_x = var2.field_102507_x;
      this.field_102644_lookAt.field_102506_y = var2.field_102506_y;
      this.field_102644_lookAt.field_102505_z = var2.field_102505_z;
      this.field_102647_up.field_102507_x = var3.field_102507_x;
      this.field_102647_up.field_102506_y = var3.field_102506_y;
      this.field_102647_up.field_102505_z = var3.field_102505_z;
      this.field_102646_angle = var4;
   }

   public void func_102638_setData(C_101419_ListenerData var1) {
      this.field_102643_position.field_102507_x = var1.field_102643_position.field_102507_x;
      this.field_102643_position.field_102506_y = var1.field_102643_position.field_102506_y;
      this.field_102643_position.field_102505_z = var1.field_102643_position.field_102505_z;
      this.field_102644_lookAt.field_102507_x = var1.field_102644_lookAt.field_102507_x;
      this.field_102644_lookAt.field_102506_y = var1.field_102644_lookAt.field_102506_y;
      this.field_102644_lookAt.field_102505_z = var1.field_102644_lookAt.field_102505_z;
      this.field_102647_up.field_102507_x = var1.field_102647_up.field_102507_x;
      this.field_102647_up.field_102506_y = var1.field_102647_up.field_102506_y;
      this.field_102647_up.field_102505_z = var1.field_102647_up.field_102505_z;
      this.field_102646_angle = var1.field_102646_angle;
   }

   public void func_102633_setPosition(float var1, float var2, float var3) {
      this.field_102643_position.field_102507_x = var1;
      this.field_102643_position.field_102506_y = var2;
      this.field_102643_position.field_102505_z = var3;
   }

   public void func_102641_setPosition(C_101410_Vector3D var1) {
      this.field_102643_position.field_102507_x = var1.field_102507_x;
      this.field_102643_position.field_102506_y = var1.field_102506_y;
      this.field_102643_position.field_102505_z = var1.field_102505_z;
   }

   public void func_102640_setOrientation(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_102644_lookAt.field_102507_x = var1;
      this.field_102644_lookAt.field_102506_y = var2;
      this.field_102644_lookAt.field_102505_z = var3;
      this.field_102647_up.field_102507_x = var4;
      this.field_102647_up.field_102506_y = var5;
      this.field_102647_up.field_102505_z = var6;
   }

   public void func_102637_setOrientation(C_101410_Vector3D var1, C_101410_Vector3D var2) {
      this.field_102644_lookAt.field_102507_x = var1.field_102507_x;
      this.field_102644_lookAt.field_102506_y = var1.field_102506_y;
      this.field_102644_lookAt.field_102505_z = var1.field_102505_z;
      this.field_102647_up.field_102507_x = var2.field_102507_x;
      this.field_102647_up.field_102506_y = var2.field_102506_y;
      this.field_102647_up.field_102505_z = var2.field_102505_z;
   }

   public void func_102636_setVelocity(C_101410_Vector3D var1) {
      this.field_102645_velocity.field_102507_x = var1.field_102507_x;
      this.field_102645_velocity.field_102506_y = var1.field_102506_y;
      this.field_102645_velocity.field_102505_z = var1.field_102505_z;
   }

   public void func_102639_setVelocity(float var1, float var2, float var3) {
      this.field_102645_velocity.field_102507_x = var1;
      this.field_102645_velocity.field_102506_y = var2;
      this.field_102645_velocity.field_102505_z = var3;
   }

   public void func_102634_setAngle(float var1) {
      this.field_102646_angle = var1;
      this.field_102644_lookAt.field_102507_x = -1.0F * (float)Math.sin((double)this.field_102646_angle);
      this.field_102644_lookAt.field_102505_z = -1.0F * (float)Math.cos((double)this.field_102646_angle);
   }
}
