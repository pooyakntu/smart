package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m2;
import androidx.collection.h;
import androidx.core.content.res.o;
import androidx.core.graphics.drawable.r;
import androidx.vectordrawable.graphics.drawable.j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a extends e implements r {
  private c u;
  
  private g v;
  
  private int w = -1;
  
  private int x = -1;
  
  private boolean y;
  
  public a() {
    this(null, null);
  }
  
  a(c paramc, Resources paramResources) {
    super(null);
    h(new c(paramc, this, paramResources));
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  public static a m(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) throws IOException, XmlPullParserException {
    a a1;
    String str = paramXmlPullParser.getName();
    if (str.equals("animated-selector")) {
      a1 = new a();
      a1.n(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return a1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": invalid animated-selector tag ");
    stringBuilder.append((String)a1);
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private void o(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) throws XmlPullParserException, IOException {
    int i = paramXmlPullParser.getDepth() + 1;
    while (true) {
      int j = paramXmlPullParser.next();
      if (j != 1) {
        int k = paramXmlPullParser.getDepth();
        if (k >= i || j != 3) {
          if (j != 2 || k > i)
            continue; 
          if (paramXmlPullParser.getName().equals("item")) {
            q(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
            continue;
          } 
          if (paramXmlPullParser.getName().equals("transition"))
            r(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); 
          continue;
        } 
      } 
      break;
    } 
  }
  
  private void p() {
    onStateChange(getState());
  }
  
  private int q(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) throws XmlPullParserException, IOException {
    Drawable drawable;
    TypedArray typedArray = o.s(paramResources, paramTheme, paramAttributeSet, i.e.h);
    int i = typedArray.getResourceId(i.e.i, 0);
    int j = typedArray.getResourceId(i.e.j, -1);
    if (j > 0) {
      Drawable drawable1 = m2.h().j(paramContext, j);
    } else {
      paramContext = null;
    } 
    typedArray.recycle();
    int[] arrayOfInt = k(paramAttributeSet);
    Context context = paramContext;
    if (paramContext == null)
      while (true) {
        j = paramXmlPullParser.next();
        if (j == 4)
          continue; 
        if (j == 2) {
          if (paramXmlPullParser.getName().equals("vector")) {
            j j1 = j.c(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
            break;
          } 
          drawable = i.c.a(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else {
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append(paramXmlPullParser.getPositionDescription());
          stringBuilder2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
          throw new XmlPullParserException(stringBuilder2.toString());
        } 
        if (drawable != null)
          return this.u.B(arrayOfInt, drawable, i); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramXmlPullParser.getPositionDescription());
        stringBuilder1.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(stringBuilder1.toString());
      }  
    if (drawable != null)
      return this.u.B(arrayOfInt, drawable, i); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private int r(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) throws XmlPullParserException, IOException {
    // Byte code:
    //   0: aload_2
    //   1: aload #5
    //   3: aload #4
    //   5: getstatic i/e.k : [I
    //   8: invokestatic s : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   11: astore #11
    //   13: aload #11
    //   15: getstatic i/e.n : I
    //   18: iconst_m1
    //   19: invokevirtual getResourceId : (II)I
    //   22: istore #6
    //   24: aload #11
    //   26: getstatic i/e.m : I
    //   29: iconst_m1
    //   30: invokevirtual getResourceId : (II)I
    //   33: istore #7
    //   35: aload #11
    //   37: getstatic i/e.l : I
    //   40: iconst_m1
    //   41: invokevirtual getResourceId : (II)I
    //   44: istore #8
    //   46: iload #8
    //   48: ifle -> 65
    //   51: invokestatic h : ()Landroidx/appcompat/widget/m2;
    //   54: aload_1
    //   55: iload #8
    //   57: invokevirtual j : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   60: astore #10
    //   62: goto -> 68
    //   65: aconst_null
    //   66: astore #10
    //   68: aload #11
    //   70: getstatic i/e.o : I
    //   73: iconst_0
    //   74: invokevirtual getBoolean : (IZ)Z
    //   77: istore #9
    //   79: aload #11
    //   81: invokevirtual recycle : ()V
    //   84: aload #10
    //   86: astore #11
    //   88: aload #10
    //   90: ifnonnull -> 197
    //   93: aload_3
    //   94: invokeinterface next : ()I
    //   99: istore #8
    //   101: iload #8
    //   103: iconst_4
    //   104: if_icmpne -> 110
    //   107: goto -> 93
    //   110: iload #8
    //   112: iconst_2
    //   113: if_icmpne -> 159
    //   116: aload_3
    //   117: invokeinterface getName : ()Ljava/lang/String;
    //   122: ldc 'animated-vector'
    //   124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   127: ifeq -> 145
    //   130: aload_1
    //   131: aload_2
    //   132: aload_3
    //   133: aload #4
    //   135: aload #5
    //   137: invokestatic b : (Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroidx/vectordrawable/graphics/drawable/e;
    //   140: astore #11
    //   142: goto -> 197
    //   145: aload_2
    //   146: aload_3
    //   147: aload #4
    //   149: aload #5
    //   151: invokestatic a : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    //   154: astore #11
    //   156: goto -> 197
    //   159: new java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: astore_1
    //   167: aload_1
    //   168: aload_3
    //   169: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload_1
    //   179: ldc ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: new org/xmlpull/v1/XmlPullParserException
    //   188: dup
    //   189: aload_1
    //   190: invokevirtual toString : ()Ljava/lang/String;
    //   193: invokespecial <init> : (Ljava/lang/String;)V
    //   196: athrow
    //   197: aload #11
    //   199: ifnull -> 268
    //   202: iload #6
    //   204: iconst_m1
    //   205: if_icmpeq -> 230
    //   208: iload #7
    //   210: iconst_m1
    //   211: if_icmpeq -> 230
    //   214: aload_0
    //   215: getfield u : Lh/a$c;
    //   218: iload #6
    //   220: iload #7
    //   222: aload #11
    //   224: iload #9
    //   226: invokevirtual C : (IILandroid/graphics/drawable/Drawable;Z)I
    //   229: ireturn
    //   230: new java/lang/StringBuilder
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: astore_1
    //   238: aload_1
    //   239: aload_3
    //   240: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload_1
    //   250: ldc ': <transition> tag requires 'fromId' & 'toId' attributes'
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: new org/xmlpull/v1/XmlPullParserException
    //   259: dup
    //   260: aload_1
    //   261: invokevirtual toString : ()Ljava/lang/String;
    //   264: invokespecial <init> : (Ljava/lang/String;)V
    //   267: athrow
    //   268: new java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial <init> : ()V
    //   275: astore_1
    //   276: aload_1
    //   277: aload_3
    //   278: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aload_1
    //   288: ldc ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: new org/xmlpull/v1/XmlPullParserException
    //   297: dup
    //   298: aload_1
    //   299: invokevirtual toString : ()Ljava/lang/String;
    //   302: invokespecial <init> : (Ljava/lang/String;)V
    //   305: athrow
  }
  
  private boolean s(int paramInt) {
    int i;
    g g1 = this.v;
    if (g1 != null) {
      if (paramInt == this.w)
        return true; 
      if (paramInt == this.x && g1.a()) {
        g1.b();
        this.w = this.x;
        this.x = paramInt;
        return true;
      } 
      i = this.w;
      g1.d();
    } else {
      i = c();
    } 
    this.v = null;
    this.x = -1;
    this.w = -1;
    c c1 = this.u;
    int j = c1.E(i);
    int k = c1.E(paramInt);
    if (k != 0) {
      b b;
      if (j == 0)
        return false; 
      int m = c1.G(j, k);
      if (m < 0)
        return false; 
      boolean bool = c1.I(j, k);
      g(m);
      Drawable drawable = getCurrent();
      if (drawable instanceof AnimationDrawable) {
        boolean bool1 = c1.H(j, k);
        e e1 = new e((AnimationDrawable)drawable, bool1, bool);
      } else if (drawable instanceof androidx.vectordrawable.graphics.drawable.e) {
        d d = new d((androidx.vectordrawable.graphics.drawable.e)drawable);
      } else {
        if (drawable instanceof Animatable) {
          b = new b((Animatable)drawable);
          b.c();
          this.v = b;
          this.x = i;
          this.w = paramInt;
          return true;
        } 
        return false;
      } 
      b.c();
      this.v = b;
      this.x = i;
      this.w = paramInt;
      return true;
    } 
    return false;
  }
  
  private void t(TypedArray paramTypedArray) {
    c c1 = this.u;
    c1.d |= i.c.b(paramTypedArray);
    c1.x(paramTypedArray.getBoolean(i.e.d, c1.i));
    c1.t(paramTypedArray.getBoolean(i.e.e, c1.l));
    c1.u(paramTypedArray.getInt(i.e.f, c1.A));
    c1.v(paramTypedArray.getInt(i.e.g, c1.B));
    setDither(paramTypedArray.getBoolean(i.e.b, c1.x));
  }
  
  void h(b.d paramd) {
    super.h(paramd);
    if (paramd instanceof c)
      this.u = (c)paramd; 
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public void jumpToCurrentState() {
    super.jumpToCurrentState();
    g g1 = this.v;
    if (g1 != null) {
      g1.d();
      this.v = null;
      g(this.w);
      this.w = -1;
      this.x = -1;
    } 
  }
  
  c l() {
    return new c(this.u, this, null);
  }
  
  public Drawable mutate() {
    if (!this.y && super.mutate() == this) {
      this.u.r();
      this.y = true;
    } 
    return this;
  }
  
  public void n(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) throws XmlPullParserException, IOException {
    TypedArray typedArray = o.s(paramResources, paramTheme, paramAttributeSet, i.e.a);
    setVisible(typedArray.getBoolean(i.e.c, true), true);
    t(typedArray);
    i(paramResources);
    typedArray.recycle();
    o(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    p();
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool1;
    int i = this.u.F(paramArrayOfint);
    if (i != c() && (s(i) || g(i))) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    Drawable drawable = getCurrent();
    boolean bool2 = bool1;
    if (drawable != null)
      bool2 = bool1 | drawable.setState(paramArrayOfint); 
    return bool2;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    g g1 = this.v;
    if (g1 != null && (bool || paramBoolean2)) {
      if (paramBoolean1) {
        g1.c();
        return bool;
      } 
      jumpToCurrentState();
    } 
    return bool;
  }
  
  private static class b extends g {
    private final Animatable a;
    
    b(Animatable param1Animatable) {
      super(null);
      this.a = param1Animatable;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  static class c extends e.a {
    androidx.collection.d<Long> K;
    
    h<Integer> L;
    
    c(c param1c, a param1a, Resources param1Resources) {
      super(param1c, param1a, param1Resources);
      if (param1c != null) {
        this.K = param1c.K;
        this.L = param1c.L;
        return;
      } 
      this.K = new androidx.collection.d();
      this.L = new h();
    }
    
    private static long D(int param1Int1, int param1Int2) {
      long l = param1Int1;
      return param1Int2 | l << 32L;
    }
    
    int B(int[] param1ArrayOfint, Drawable param1Drawable, int param1Int) {
      int i = z(param1ArrayOfint, param1Drawable);
      this.L.i(i, Integer.valueOf(param1Int));
      return i;
    }
    
    int C(int param1Int1, int param1Int2, Drawable param1Drawable, boolean param1Boolean) {
      long l1;
      int i = a(param1Drawable);
      long l2 = D(param1Int1, param1Int2);
      if (param1Boolean) {
        l1 = 8589934592L;
      } else {
        l1 = 0L;
      } 
      androidx.collection.d<Long> d1 = this.K;
      long l3 = i;
      d1.a(l2, Long.valueOf(l3 | l1));
      if (param1Boolean) {
        l2 = D(param1Int2, param1Int1);
        this.K.a(l2, Long.valueOf(0x100000000L | l3 | l1));
      } 
      return i;
    }
    
    int E(int param1Int) {
      return (param1Int < 0) ? 0 : ((Integer)this.L.f(param1Int, Integer.valueOf(0))).intValue();
    }
    
    int F(int[] param1ArrayOfint) {
      int i = A(param1ArrayOfint);
      return (i >= 0) ? i : A(StateSet.WILD_CARD);
    }
    
    int G(int param1Int1, int param1Int2) {
      long l = D(param1Int1, param1Int2);
      return (int)((Long)this.K.g(l, Long.valueOf(-1L))).longValue();
    }
    
    boolean H(int param1Int1, int param1Int2) {
      long l = D(param1Int1, param1Int2);
      return ((((Long)this.K.g(l, Long.valueOf(-1L))).longValue() & 0x100000000L) != 0L);
    }
    
    boolean I(int param1Int1, int param1Int2) {
      long l = D(param1Int1, param1Int2);
      return ((((Long)this.K.g(l, Long.valueOf(-1L))).longValue() & 0x200000000L) != 0L);
    }
    
    public Drawable newDrawable() {
      return new a(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new a(this, param1Resources);
    }
    
    void r() {
      this.K = this.K.c();
      this.L = this.L.c();
    }
  }
  
  private static class d extends g {
    private final androidx.vectordrawable.graphics.drawable.e a;
    
    d(androidx.vectordrawable.graphics.drawable.e param1e) {
      super(null);
      this.a = param1e;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  private static class e extends g {
    private final ObjectAnimator a;
    
    private final boolean b;
    
    e(AnimationDrawable param1AnimationDrawable, boolean param1Boolean1, boolean param1Boolean2) {
      super(null);
      boolean bool;
      int i = param1AnimationDrawable.getNumberOfFrames();
      if (param1Boolean1) {
        bool = i - 1;
      } else {
        bool = false;
      } 
      if (param1Boolean1) {
        i = 0;
      } else {
        i--;
      } 
      a.f f = new a.f(param1AnimationDrawable, param1Boolean1);
      ObjectAnimator objectAnimator = ObjectAnimator.ofInt(param1AnimationDrawable, "currentIndex", new int[] { bool, i });
      i.b.a(objectAnimator, true);
      objectAnimator.setDuration(f.a());
      objectAnimator.setInterpolator(f);
      this.b = param1Boolean2;
      this.a = objectAnimator;
    }
    
    public boolean a() {
      return this.b;
    }
    
    public void b() {
      this.a.reverse();
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.cancel();
    }
  }
  
  private static class f implements TimeInterpolator {
    private int[] a;
    
    private int b;
    
    private int c;
    
    f(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      b(param1AnimationDrawable, param1Boolean);
    }
    
    int a() {
      return this.c;
    }
    
    int b(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      int k = param1AnimationDrawable.getNumberOfFrames();
      this.b = k;
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null || arrayOfInt.length < k)
        this.a = new int[k]; 
      arrayOfInt = this.a;
      int i = 0;
      int j = 0;
      while (i < k) {
        if (param1Boolean) {
          m = k - i - 1;
        } else {
          m = i;
        } 
        int m = param1AnimationDrawable.getDuration(m);
        arrayOfInt[i] = m;
        j += m;
        i++;
      } 
      this.c = j;
      return j;
    }
    
    public float getInterpolation(float param1Float) {
      int j = (int)(param1Float * this.c + 0.5F);
      int k = this.b;
      int[] arrayOfInt = this.a;
      int i = 0;
      while (i < k) {
        int m = arrayOfInt[i];
        if (j >= m) {
          j -= m;
          i++;
        } 
      } 
      if (i < k) {
        param1Float = j / this.c;
      } else {
        param1Float = 0.0F;
      } 
      return i / k + param1Float;
    }
  }
  
  private static abstract class g {
    private g() {}
    
    public boolean a() {
      return false;
    }
    
    public void b() {}
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */