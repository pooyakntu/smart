package a3;

import android.content.Context;
import android.graphics.Color;
import g3.b;
import p2.c;

public class a {
  private static final int f = (int)Math.round(5.1000000000000005D);
  
  private final boolean a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final float e;
  
  public a(Context paramContext) {
    this(b.b(paramContext, c.s, false), x2.a.b(paramContext, c.r, 0), x2.a.b(paramContext, c.q, 0), x2.a.b(paramContext, c.o, 0), (paramContext.getResources().getDisplayMetrics()).density);
  }
  
  public a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.a = paramBoolean;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramFloat;
  }
  
  private boolean f(int paramInt) {
    return (androidx.core.graphics.a.k(paramInt, 255) == this.d);
  }
  
  public float a(float paramFloat) {
    float f = this.e;
    return (f > 0.0F) ? ((paramFloat <= 0.0F) ? 0.0F : Math.min(((float)Math.log1p((paramFloat / f)) * 4.5F + 2.0F) / 100.0F, 1.0F)) : 0.0F;
  }
  
  public int b(int paramInt, float paramFloat) {
    paramFloat = a(paramFloat);
    int j = Color.alpha(paramInt);
    int i = x2.a.j(androidx.core.graphics.a.k(paramInt, 255), this.b, paramFloat);
    paramInt = i;
    if (paramFloat > 0.0F) {
      int k = this.c;
      paramInt = i;
      if (k != 0)
        paramInt = x2.a.i(i, androidx.core.graphics.a.k(k, f)); 
    } 
    return androidx.core.graphics.a.k(paramInt, j);
  }
  
  public int c(int paramInt, float paramFloat) {
    int i = paramInt;
    if (this.a) {
      i = paramInt;
      if (f(paramInt))
        i = b(paramInt, paramFloat); 
    } 
    return i;
  }
  
  public int d(float paramFloat) {
    return c(this.d, paramFloat);
  }
  
  public boolean e() {
    return this.a;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a3\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */