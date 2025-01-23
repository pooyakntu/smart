package d3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.f;
import g3.b;

public class a {
  private static float a(String[] paramArrayOfString, int paramInt) {
    float f = Float.parseFloat(paramArrayOfString[paramInt]);
    if (f >= 0.0F && f <= 1.0F)
      return f; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Motion easing control point value must be between 0 and 1; instead got: ");
    stringBuilder.append(f);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static String b(String paramString1, String paramString2) {
    return paramString1.substring(paramString2.length() + 1, paramString1.length() - 1);
  }
  
  private static TimeInterpolator c(String paramString) {
    String[] arrayOfString;
    if (e(paramString, "cubic-bezier")) {
      arrayOfString = b(paramString, "cubic-bezier").split(",");
      if (arrayOfString.length == 4)
        return (TimeInterpolator)androidx.core.view.animation.a.a(a(arrayOfString, 0), a(arrayOfString, 1), a(arrayOfString, 2), a(arrayOfString, 3)); 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
      stringBuilder1.append(arrayOfString.length);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    if (e((String)arrayOfString, "path"))
      return (TimeInterpolator)androidx.core.view.animation.a.b(f.e(b((String)arrayOfString, "path"))); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid motion easing type: ");
    stringBuilder.append((String)arrayOfString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static boolean d(String paramString) {
    return (e(paramString, "cubic-bezier") || e(paramString, "path"));
  }
  
  private static boolean e(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString2);
    stringBuilder.append("(");
    return (paramString1.startsWith(stringBuilder.toString()) && paramString1.endsWith(")"));
  }
  
  public static int f(Context paramContext, int paramInt1, int paramInt2) {
    return b.c(paramContext, paramInt1, paramInt2);
  }
  
  public static TimeInterpolator g(Context paramContext, int paramInt, TimeInterpolator paramTimeInterpolator) {
    TypedValue typedValue = new TypedValue();
    if (!paramContext.getTheme().resolveAttribute(paramInt, typedValue, true))
      return paramTimeInterpolator; 
    if (typedValue.type == 3) {
      String str = String.valueOf(typedValue.string);
      return (TimeInterpolator)(d(str) ? c(str) : AnimationUtils.loadInterpolator(paramContext, typedValue.resourceId));
    } 
    throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d3\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */