package p1;

import android.graphics.Bitmap;
import c1.a;
import g1.d;

public final class b implements a.a {
  private final d a;
  
  private final g1.b b;
  
  public b(d paramd, g1.b paramb) {
    this.a = paramd;
    this.b = paramb;
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return this.a.e(paramInt1, paramInt2, paramConfig);
  }
  
  public int[] b(int paramInt) {
    g1.b b1 = this.b;
    return (b1 == null) ? new int[paramInt] : (int[])b1.d(paramInt, int[].class);
  }
  
  public void c(Bitmap paramBitmap) {
    this.a.c(paramBitmap);
  }
  
  public void d(byte[] paramArrayOfbyte) {
    g1.b b1 = this.b;
    if (b1 == null)
      return; 
    b1.put(paramArrayOfbyte);
  }
  
  public byte[] e(int paramInt) {
    g1.b b1 = this.b;
    return (b1 == null) ? new byte[paramInt] : (byte[])b1.d(paramInt, byte[].class);
  }
  
  public void f(int[] paramArrayOfint) {
    g1.b b1 = this.b;
    if (b1 == null)
      return; 
    b1.put(paramArrayOfint);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */