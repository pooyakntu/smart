package h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

public class d extends Drawable {
  private static final float m = (float)Math.toRadians(45.0D);
  
  private final Paint a;
  
  private float b;
  
  private float c;
  
  private float d;
  
  private float e;
  
  private boolean f;
  
  private final Path g;
  
  private final int h;
  
  private boolean i;
  
  private float j;
  
  private float k;
  
  private int l;
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return paramFloat1 + (paramFloat2 - paramFloat1) * paramFloat3;
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getBounds : ()Landroid/graphics/Rect;
    //   4: astore #16
    //   6: aload_0
    //   7: getfield l : I
    //   10: istore #15
    //   12: iconst_0
    //   13: istore #14
    //   15: iload #14
    //   17: istore #13
    //   19: iload #15
    //   21: ifeq -> 65
    //   24: iload #15
    //   26: iconst_1
    //   27: if_icmpeq -> 62
    //   30: iload #15
    //   32: iconst_3
    //   33: if_icmpeq -> 51
    //   36: iload #14
    //   38: istore #13
    //   40: aload_0
    //   41: invokestatic f : (Landroid/graphics/drawable/Drawable;)I
    //   44: iconst_1
    //   45: if_icmpne -> 65
    //   48: goto -> 62
    //   51: iload #14
    //   53: istore #13
    //   55: aload_0
    //   56: invokestatic f : (Landroid/graphics/drawable/Drawable;)I
    //   59: ifne -> 65
    //   62: iconst_1
    //   63: istore #13
    //   65: aload_0
    //   66: getfield b : F
    //   69: fstore #6
    //   71: fload #6
    //   73: fload #6
    //   75: fmul
    //   76: fconst_2
    //   77: fmul
    //   78: f2d
    //   79: invokestatic sqrt : (D)D
    //   82: d2f
    //   83: fstore #6
    //   85: aload_0
    //   86: getfield c : F
    //   89: fload #6
    //   91: aload_0
    //   92: getfield j : F
    //   95: invokestatic a : (FFF)F
    //   98: fstore #10
    //   100: aload_0
    //   101: getfield c : F
    //   104: aload_0
    //   105: getfield d : F
    //   108: aload_0
    //   109: getfield j : F
    //   112: invokestatic a : (FFF)F
    //   115: fstore #8
    //   117: fconst_0
    //   118: aload_0
    //   119: getfield k : F
    //   122: aload_0
    //   123: getfield j : F
    //   126: invokestatic a : (FFF)F
    //   129: invokestatic round : (F)I
    //   132: i2f
    //   133: fstore #9
    //   135: fconst_0
    //   136: getstatic h/d.m : F
    //   139: aload_0
    //   140: getfield j : F
    //   143: invokestatic a : (FFF)F
    //   146: fstore #11
    //   148: iload #13
    //   150: ifeq -> 159
    //   153: fconst_0
    //   154: fstore #6
    //   156: goto -> 163
    //   159: ldc -180.0
    //   161: fstore #6
    //   163: iload #13
    //   165: ifeq -> 175
    //   168: ldc 180.0
    //   170: fstore #7
    //   172: goto -> 178
    //   175: fconst_0
    //   176: fstore #7
    //   178: fload #6
    //   180: fload #7
    //   182: aload_0
    //   183: getfield j : F
    //   186: invokestatic a : (FFF)F
    //   189: fstore #6
    //   191: fload #10
    //   193: f2d
    //   194: dstore_2
    //   195: fload #11
    //   197: f2d
    //   198: dstore #4
    //   200: dload #4
    //   202: invokestatic cos : (D)D
    //   205: dload_2
    //   206: dmul
    //   207: invokestatic round : (D)J
    //   210: l2f
    //   211: fstore #7
    //   213: dload_2
    //   214: dload #4
    //   216: invokestatic sin : (D)D
    //   219: dmul
    //   220: invokestatic round : (D)J
    //   223: l2f
    //   224: fstore #10
    //   226: aload_0
    //   227: getfield g : Landroid/graphics/Path;
    //   230: invokevirtual rewind : ()V
    //   233: aload_0
    //   234: getfield e : F
    //   237: aload_0
    //   238: getfield a : Landroid/graphics/Paint;
    //   241: invokevirtual getStrokeWidth : ()F
    //   244: fadd
    //   245: aload_0
    //   246: getfield k : F
    //   249: fneg
    //   250: aload_0
    //   251: getfield j : F
    //   254: invokestatic a : (FFF)F
    //   257: fstore #11
    //   259: fload #8
    //   261: fneg
    //   262: fconst_2
    //   263: fdiv
    //   264: fstore #12
    //   266: aload_0
    //   267: getfield g : Landroid/graphics/Path;
    //   270: fload #12
    //   272: fload #9
    //   274: fadd
    //   275: fconst_0
    //   276: invokevirtual moveTo : (FF)V
    //   279: aload_0
    //   280: getfield g : Landroid/graphics/Path;
    //   283: fload #8
    //   285: fload #9
    //   287: fconst_2
    //   288: fmul
    //   289: fsub
    //   290: fconst_0
    //   291: invokevirtual rLineTo : (FF)V
    //   294: aload_0
    //   295: getfield g : Landroid/graphics/Path;
    //   298: fload #12
    //   300: fload #11
    //   302: invokevirtual moveTo : (FF)V
    //   305: aload_0
    //   306: getfield g : Landroid/graphics/Path;
    //   309: fload #7
    //   311: fload #10
    //   313: invokevirtual rLineTo : (FF)V
    //   316: aload_0
    //   317: getfield g : Landroid/graphics/Path;
    //   320: fload #12
    //   322: fload #11
    //   324: fneg
    //   325: invokevirtual moveTo : (FF)V
    //   328: aload_0
    //   329: getfield g : Landroid/graphics/Path;
    //   332: fload #7
    //   334: fload #10
    //   336: fneg
    //   337: invokevirtual rLineTo : (FF)V
    //   340: aload_0
    //   341: getfield g : Landroid/graphics/Path;
    //   344: invokevirtual close : ()V
    //   347: aload_1
    //   348: invokevirtual save : ()I
    //   351: pop
    //   352: aload_0
    //   353: getfield a : Landroid/graphics/Paint;
    //   356: invokevirtual getStrokeWidth : ()F
    //   359: fstore #7
    //   361: aload #16
    //   363: invokevirtual height : ()I
    //   366: i2f
    //   367: fstore #9
    //   369: aload_0
    //   370: getfield e : F
    //   373: fstore #8
    //   375: fload #9
    //   377: ldc 3.0
    //   379: fload #7
    //   381: fmul
    //   382: fsub
    //   383: fconst_2
    //   384: fload #8
    //   386: fmul
    //   387: fsub
    //   388: f2i
    //   389: iconst_4
    //   390: idiv
    //   391: iconst_2
    //   392: imul
    //   393: i2f
    //   394: fstore #9
    //   396: aload_1
    //   397: aload #16
    //   399: invokevirtual centerX : ()I
    //   402: i2f
    //   403: fload #9
    //   405: fload #7
    //   407: ldc 1.5
    //   409: fmul
    //   410: fload #8
    //   412: fadd
    //   413: fadd
    //   414: invokevirtual translate : (FF)V
    //   417: aload_0
    //   418: getfield f : Z
    //   421: ifeq -> 456
    //   424: aload_0
    //   425: getfield i : Z
    //   428: iload #13
    //   430: ixor
    //   431: ifeq -> 440
    //   434: iconst_m1
    //   435: istore #13
    //   437: goto -> 443
    //   440: iconst_1
    //   441: istore #13
    //   443: aload_1
    //   444: fload #6
    //   446: iload #13
    //   448: i2f
    //   449: fmul
    //   450: invokevirtual rotate : (F)V
    //   453: goto -> 467
    //   456: iload #13
    //   458: ifeq -> 467
    //   461: aload_1
    //   462: ldc 180.0
    //   464: invokevirtual rotate : (F)V
    //   467: aload_1
    //   468: aload_0
    //   469: getfield g : Landroid/graphics/Path;
    //   472: aload_0
    //   473: getfield a : Landroid/graphics/Paint;
    //   476: invokevirtual drawPath : (Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   479: aload_1
    //   480: invokevirtual restore : ()V
    //   483: return
  }
  
  public int getIntrinsicHeight() {
    return this.h;
  }
  
  public int getIntrinsicWidth() {
    return this.h;
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public void setAlpha(int paramInt) {
    if (paramInt != this.a.getAlpha()) {
      this.a.setAlpha(paramInt);
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setProgress(float paramFloat) {
    if (this.j != paramFloat) {
      this.j = paramFloat;
      invalidateSelf();
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */