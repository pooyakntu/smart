package p4;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;
import n4.a;

public abstract class b {
  private static final WeakHashMap<View, b> a = new WeakHashMap<View, b>(0);
  
  public static b a(View paramView) {
    WeakHashMap<View, b> weakHashMap = a;
    b b2 = weakHashMap.get(paramView);
    b b1 = b2;
    if (b2 == null) {
      int i = Integer.valueOf(Build.VERSION.SDK).intValue();
      if (i >= 14) {
        b1 = new d(paramView);
      } else if (i >= 11) {
        b1 = new c(paramView);
      } else {
        b1 = new e(paramView);
      } 
      weakHashMap.put(paramView, b1);
    } 
    return b1;
  }
  
  public abstract b b(float paramFloat);
  
  public abstract b c(float paramFloat);
  
  public abstract b d(long paramLong);
  
  public abstract b e(Interpolator paramInterpolator);
  
  public abstract b f(a.a parama);
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p4\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */