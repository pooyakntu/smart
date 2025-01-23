package b0;

import android.os.Looper;
import android.util.AndroidRuntimeException;

public final class d extends b<d> {
  private e A = null;
  
  private float B = Float.MAX_VALUE;
  
  private boolean C = false;
  
  public <K> d(K paramK, c<K> paramc) {
    super(paramK, paramc);
  }
  
  private void o() {
    e e1 = this.A;
    if (e1 != null) {
      double d1 = e1.a();
      if (d1 <= this.g) {
        if (d1 >= this.h)
          return; 
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
      } 
      throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    } 
    throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
  }
  
  public void i() {
    o();
    this.A.g(d());
    super.i();
  }
  
  boolean k(long paramLong) {
    if (this.C) {
      float f1 = this.B;
      if (f1 != Float.MAX_VALUE) {
        this.A.e(f1);
        this.B = Float.MAX_VALUE;
      } 
      this.b = this.A.a();
      this.a = 0.0F;
      this.C = false;
      return true;
    } 
    if (this.B != Float.MAX_VALUE) {
      this.A.a();
      e e1 = this.A;
      double d1 = this.b;
      double d2 = this.a;
      paramLong /= 2L;
      b.o o = e1.h(d1, d2, paramLong);
      this.A.e(this.B);
      this.B = Float.MAX_VALUE;
      o = this.A.h(o.a, o.b, paramLong);
      this.b = o.a;
      this.a = o.b;
    } else {
      b.o o = this.A.h(this.b, this.a, paramLong);
      this.b = o.a;
      this.a = o.b;
    } 
    float f = Math.max(this.b, this.h);
    this.b = f;
    f = Math.min(f, this.g);
    this.b = f;
    if (n(f, this.a)) {
      this.b = this.A.a();
      this.a = 0.0F;
      return true;
    } 
    return false;
  }
  
  public void l(float paramFloat) {
    if (e()) {
      this.B = paramFloat;
      return;
    } 
    if (this.A == null)
      this.A = new e(paramFloat); 
    this.A.e(paramFloat);
    i();
  }
  
  public boolean m() {
    return (this.A.b > 0.0D);
  }
  
  boolean n(float paramFloat1, float paramFloat2) {
    return this.A.c(paramFloat1, paramFloat2);
  }
  
  public d p(e parame) {
    this.A = parame;
    return this;
  }
  
  public void q() {
    if (m()) {
      if (Looper.myLooper() == Looper.getMainLooper()) {
        if (this.f)
          this.C = true; 
        return;
      } 
      throw new AndroidRuntimeException("Animations may only be started on the main thread");
    } 
    throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b0\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */