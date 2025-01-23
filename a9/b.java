package a9;

import java.text.DecimalFormat;

public final class b {
  private static final boolean a = false;
  
  private static final ThreadLocal<DecimalFormat>[] b;
  
  static {
    ThreadLocal[] arrayOfThreadLocal = new ThreadLocal[4];
    for (int i = 0; i < 4; i++)
      arrayOfThreadLocal[i] = new ThreadLocal(); 
    b = (ThreadLocal<DecimalFormat>[])arrayOfThreadLocal;
  }
  
  public static final boolean a() {
    return a;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a9\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */