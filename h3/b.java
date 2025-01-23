package h3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import p2.c;

public class b {
  public static final boolean a = true;
  
  private static final int[] b = new int[] { 16842919 };
  
  private static final int[] c = new int[] { 16843623, 16842908 };
  
  private static final int[] d = new int[] { 16842908 };
  
  private static final int[] e = new int[] { 16843623 };
  
  private static final int[] f = new int[] { 16842913, 16842919 };
  
  private static final int[] g = new int[] { 16842913, 16843623, 16842908 };
  
  private static final int[] h = new int[] { 16842913, 16842908 };
  
  private static final int[] i = new int[] { 16842913, 16843623 };
  
  private static final int[] j = new int[] { 16842913 };
  
  private static final int[] k = new int[] { 16842910, 16842919 };
  
  static final String l = b.class.getSimpleName();
  
  public static ColorStateList a(ColorStateList paramColorStateList) {
    if (a) {
      int[] arrayOfInt10 = j;
      int i4 = d(paramColorStateList, f);
      int[] arrayOfInt11 = d;
      int i5 = d(paramColorStateList, arrayOfInt11);
      int[] arrayOfInt12 = StateSet.NOTHING;
      int i6 = d(paramColorStateList, b);
      return new ColorStateList(new int[][] { arrayOfInt10, arrayOfInt11, arrayOfInt12 }, new int[] { i4, i5, i6 });
    } 
    int[] arrayOfInt1 = f;
    int i = d(paramColorStateList, arrayOfInt1);
    int[] arrayOfInt2 = g;
    int j = d(paramColorStateList, arrayOfInt2);
    int[] arrayOfInt3 = h;
    int k = d(paramColorStateList, arrayOfInt3);
    int[] arrayOfInt4 = i;
    int m = d(paramColorStateList, arrayOfInt4);
    int[] arrayOfInt5 = j;
    int[] arrayOfInt6 = b;
    int n = d(paramColorStateList, arrayOfInt6);
    int[] arrayOfInt7 = c;
    int i1 = d(paramColorStateList, arrayOfInt7);
    int[] arrayOfInt8 = d;
    int i2 = d(paramColorStateList, arrayOfInt8);
    int[] arrayOfInt9 = e;
    int i3 = d(paramColorStateList, arrayOfInt9);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8, arrayOfInt9, StateSet.NOTHING }, new int[] { i, j, k, m, 0, n, i1, i2, i3, 0 });
  }
  
  public static Drawable b(Context paramContext, int paramInt) {
    return a.a(paramContext, paramInt);
  }
  
  @TargetApi(21)
  private static int c(int paramInt) {
    return androidx.core.graphics.a.k(paramInt, Math.min(Color.alpha(paramInt) * 2, 255));
  }
  
  private static int d(ColorStateList paramColorStateList, int[] paramArrayOfint) {
    byte b1;
    if (paramColorStateList != null) {
      b1 = paramColorStateList.getColorForState(paramArrayOfint, paramColorStateList.getDefaultColor());
    } else {
      b1 = 0;
    } 
    int i = b1;
    if (a)
      i = c(b1); 
    return i;
  }
  
  public static ColorStateList e(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 22 && i <= 27 && Color.alpha(paramColorStateList.getDefaultColor()) == 0)
        Color.alpha(paramColorStateList.getColorForState(k, 0)); 
      return paramColorStateList;
    } 
    return ColorStateList.valueOf(0);
  }
  
  public static boolean f(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: istore #5
    //   4: iconst_0
    //   5: istore #8
    //   7: iconst_0
    //   8: istore_1
    //   9: iconst_0
    //   10: istore_2
    //   11: iconst_0
    //   12: istore_3
    //   13: iload_1
    //   14: iload #5
    //   16: if_icmpge -> 85
    //   19: aload_0
    //   20: iload_1
    //   21: iaload
    //   22: istore #6
    //   24: iload #6
    //   26: ldc 16842910
    //   28: if_icmpne -> 37
    //   31: iconst_1
    //   32: istore #4
    //   34: goto -> 75
    //   37: iload #6
    //   39: ldc 16842908
    //   41: if_icmpne -> 52
    //   44: iconst_1
    //   45: istore_3
    //   46: iload_2
    //   47: istore #4
    //   49: goto -> 75
    //   52: iload #6
    //   54: ldc 16842919
    //   56: if_icmpne -> 62
    //   59: goto -> 44
    //   62: iload_2
    //   63: istore #4
    //   65: iload #6
    //   67: ldc 16843623
    //   69: if_icmpne -> 75
    //   72: goto -> 44
    //   75: iload_1
    //   76: iconst_1
    //   77: iadd
    //   78: istore_1
    //   79: iload #4
    //   81: istore_2
    //   82: goto -> 13
    //   85: iload #8
    //   87: istore #7
    //   89: iload_2
    //   90: ifeq -> 104
    //   93: iload #8
    //   95: istore #7
    //   97: iload_3
    //   98: ifeq -> 104
    //   101: iconst_1
    //   102: istore #7
    //   104: iload #7
    //   106: ireturn
  }
  
  private static class a {
    private static Drawable b(Context param1Context, int param1Int) {
      GradientDrawable gradientDrawable = new GradientDrawable();
      gradientDrawable.setColor(-1);
      gradientDrawable.setShape(1);
      InsetDrawable insetDrawable = new InsetDrawable((Drawable)gradientDrawable, param1Int, param1Int, param1Int, param1Int);
      return (Drawable)new RippleDrawable(x2.a.f(param1Context, c.i, ColorStateList.valueOf(0)), null, (Drawable)insetDrawable);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h3\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */