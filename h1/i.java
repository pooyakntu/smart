package h1;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {
  private final int a;
  
  private final int b;
  
  private final Context c;
  
  private final int d;
  
  i(a parama) {
    int j;
    this.c = parama.a;
    if (e(parama.b)) {
      j = parama.h / 2;
    } else {
      j = parama.h;
    } 
    this.d = j;
    int k = c(parama.b, parama.f, parama.g);
    float f = (parama.c.b() * parama.c.a() * 4);
    int m = Math.round(parama.e * f);
    int n = Math.round(f * parama.d);
    int i1 = k - j;
    int i2 = n + m;
    if (i2 <= i1) {
      this.b = n;
      this.a = m;
    } else {
      float f1 = i1;
      float f2 = parama.e;
      f = parama.d;
      f1 /= f2 + f;
      this.b = Math.round(f * f1);
      this.a = Math.round(f1 * parama.e);
    } 
    if (Log.isLoggable("MemorySizeCalculator", 3)) {
      boolean bool;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Calculation complete, Calculated memory cache size: ");
      stringBuilder.append(f(this.b));
      stringBuilder.append(", pool size: ");
      stringBuilder.append(f(this.a));
      stringBuilder.append(", byte array size: ");
      stringBuilder.append(f(j));
      stringBuilder.append(", memory class limited? ");
      if (i2 > k) {
        bool = true;
      } else {
        bool = false;
      } 
      stringBuilder.append(bool);
      stringBuilder.append(", max size: ");
      stringBuilder.append(f(k));
      stringBuilder.append(", memoryClass: ");
      stringBuilder.append(parama.b.getMemoryClass());
      stringBuilder.append(", isLowMemoryDevice: ");
      stringBuilder.append(e(parama.b));
    } 
  }
  
  private static int c(ActivityManager paramActivityManager, float paramFloat1, float paramFloat2) {
    int j = paramActivityManager.getMemoryClass();
    boolean bool = e(paramActivityManager);
    float f = (j * 1024 * 1024);
    if (bool)
      paramFloat1 = paramFloat2; 
    return Math.round(f * paramFloat1);
  }
  
  @TargetApi(19)
  static boolean e(ActivityManager paramActivityManager) {
    return paramActivityManager.isLowRamDevice();
  }
  
  private String f(int paramInt) {
    return Formatter.formatFileSize(this.c, paramInt);
  }
  
  public int a() {
    return this.d;
  }
  
  public int b() {
    return this.a;
  }
  
  public int d() {
    return this.b;
  }
  
  public static final class a {
    static final int i;
    
    final Context a;
    
    ActivityManager b;
    
    i.c c;
    
    float d = 2.0F;
    
    float e = i;
    
    float f = 0.4F;
    
    float g = 0.33F;
    
    int h = 4194304;
    
    static {
      boolean bool;
      if (Build.VERSION.SDK_INT < 26) {
        bool = true;
      } else {
        bool = true;
      } 
      i = bool;
    }
    
    public a(Context param1Context) {
      this.a = param1Context;
      this.b = (ActivityManager)param1Context.getSystemService("activity");
      this.c = new i.b(param1Context.getResources().getDisplayMetrics());
      if (Build.VERSION.SDK_INT >= 26 && i.e(this.b))
        this.e = 0.0F; 
    }
    
    public i a() {
      return new i(this);
    }
  }
  
  private static final class b implements c {
    private final DisplayMetrics a;
    
    b(DisplayMetrics param1DisplayMetrics) {
      this.a = param1DisplayMetrics;
    }
    
    public int a() {
      return this.a.heightPixels;
    }
    
    public int b() {
      return this.a.widthPixels;
    }
  }
  
  static interface c {
    int a();
    
    int b();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h1\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */