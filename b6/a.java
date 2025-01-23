package b6;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.smartpek.App;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import e8.q;
import ir.am3n.needtool.views.A3Toolbar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p7.c0;
import p7.c1;
import p7.e1;
import p7.f0;
import p7.v1;
import q8.p;
import r8.m;
import r8.n;
import v0.l0;

public final class a extends Fragment {
  public static final a o = new a(null);
  
  private static String p = "";
  
  private static String q = "";
  
  private static String r = "";
  
  private p<? super Locale, ? super Boolean, q> g = e.g;
  
  private Locale h;
  
  private b i;
  
  private a5.c j;
  
  private List<Fragment> k = new ArrayList<Fragment>();
  
  private int l;
  
  private boolean m = true;
  
  public Map<Integer, View> n;
  
  private final boolean W() {
    String str;
    Locale locale1 = this.h;
    Locale locale2 = null;
    if (locale1 != null) {
      str = locale1.getLanguage();
    } else {
      locale1 = null;
    } 
    if (m.e(locale1, "fa") && Y() > 0)
      return true; 
    Locale locale3 = this.h;
    locale1 = locale2;
    if (locale3 != null)
      str = locale3.getLanguage(); 
    return (!m.e(str, "fa") && Y() < this.k.size() - 1);
  }
  
  private final boolean X() {
    String str;
    Locale locale1 = this.h;
    Locale locale2 = null;
    if (locale1 != null) {
      str = locale1.getLanguage();
    } else {
      locale1 = null;
    } 
    if (m.e(locale1, "fa") && Y() < this.k.size() - 1)
      return true; 
    Locale locale3 = this.h;
    locale1 = locale2;
    if (locale3 != null)
      str = locale3.getLanguage(); 
    return (!m.e(str, "fa") && Y() > 0);
  }
  
  private final int Y() {
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "index()", false, 4, null);
    return ((ViewPager2)I(r4.h.k7)).getCurrentItem();
  }
  
  private final void Z() {
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "init()", false, 4, null);
    a0();
    int i = r4.h.k7;
    ((ViewPager2)I(i)).g(new b(this));
    DotsIndicator dotsIndicator = (DotsIndicator)I(r4.h.q2);
    if (dotsIndicator != null) {
      ViewPager2 viewPager2 = (ViewPager2)I(i);
      m.i(viewPager2, "vp");
      dotsIndicator.setViewPager2(viewPager2);
    } 
    g0();
  }
  
  private final void a0() {
    boolean bool;
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "initViewPager()", false, 4, null);
    this.k.clear();
    Locale locale = this.h;
    if (locale != null) {
      String str = locale.getLanguage();
    } else {
      locale = null;
    } 
    if (m.e(locale, "fa")) {
      List<Fragment> list = this.k;
      b b1 = this.i;
      m.g(b1);
      list.add(b1);
      bool = this.k.size() - 1;
    } else {
      List<Fragment> list = this.k;
      b b1 = this.i;
      m.g(b1);
      list.add(b1);
      bool = false;
    } 
    androidx.fragment.app.e e = requireActivity();
    m.i(e, "requireActivity()");
    this.j = new a5.c(e, this.k);
    int i = r4.h.k7;
    ViewPager2 viewPager2 = (ViewPager2)I(i);
    if (viewPager2 != null)
      viewPager2.setAdapter((RecyclerView.h)this.j); 
    viewPager2 = (ViewPager2)I(i);
    if (viewPager2 != null)
      viewPager2.j(bool, false); 
  }
  
  private final boolean b0() {
    String str;
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "isEnded()", false, 4, null);
    Locale locale1 = this.h;
    Locale locale2 = null;
    if (locale1 != null) {
      str = locale1.getLanguage();
    } else {
      locale1 = null;
    } 
    if (m.e(locale1, "fa") && Y() <= 0)
      return true; 
    Locale locale3 = this.h;
    locale1 = locale2;
    if (locale3 != null)
      str = locale3.getLanguage(); 
    return (!m.e(str, "fa") && Y() >= this.k.size() - 1);
  }
  
  private final void c0() {
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "next()", false, 4, null);
    App.g.a("IntroFrg > next()");
    if (W()) {
      ((ViewPager2)I(r4.h.k7)).setCurrentItem(d0());
      if (b0()) {
        c0.l(200, new c(this));
        return;
      } 
    } else {
      ((y4.k)y4.k.k.a(getContext())).z(true);
      c0.l(500, new d(this));
    } 
  }
  
  private final int d0() {
    Locale locale = this.h;
    if (locale != null) {
      String str = locale.getLanguage();
    } else {
      locale = null;
    } 
    return m.e(locale, "fa") ? (Y() - 1) : (Y() + 1);
  }
  
  private final void e0() {
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "previous()", false, 4, null);
    App.g.a("IntroFrg > previous()");
    if (X()) {
      ((ViewPager2)I(r4.h.k7)).setCurrentItem(f0());
      c0.l(500, new k(this));
      return;
    } 
    int i = this.l;
    if (i == 0) {
      this.l = i - 1;
      Context context = getContext();
      if (context != null)
        v1.l(context, r, 0, null, 6, null); 
      c0.l(700, new l(this));
      return;
    } 
    androidx.fragment.app.e e = getActivity();
    if (e != null)
      p7.b.a((Activity)e); 
  }
  
  private final int f0() {
    Locale locale = this.h;
    if (locale != null) {
      String str = locale.getLanguage();
    } else {
      locale = null;
    } 
    return m.e(locale, "fa") ? (Y() + 1) : (Y() - 1);
  }
  
  private final void g0() {
    // Byte code:
    //   0: getstatic x7/c.a : Lx7/c$a;
    //   3: ldc 'Me-IntroFrg'
    //   5: ldc_w 'setLocale()'
    //   8: iconst_0
    //   9: iconst_4
    //   10: aconst_null
    //   11: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    //   14: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   17: ldc_w 'IntroFrg > setLocale()'
    //   20: invokevirtual a : (Ljava/lang/String;)V
    //   23: aload_0
    //   24: invokevirtual getContext : ()Landroid/content/Context;
    //   27: astore_3
    //   28: ldc ''
    //   30: astore #4
    //   32: aload_3
    //   33: ifnull -> 53
    //   36: aload_3
    //   37: ldc_w 2131952101
    //   40: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   43: astore #5
    //   45: aload #5
    //   47: astore_3
    //   48: aload #5
    //   50: ifnonnull -> 56
    //   53: ldc ''
    //   55: astore_3
    //   56: aload_3
    //   57: putstatic b6/a.p : Ljava/lang/String;
    //   60: aload_0
    //   61: invokevirtual getContext : ()Landroid/content/Context;
    //   64: astore_3
    //   65: aload_3
    //   66: ifnull -> 86
    //   69: aload_3
    //   70: ldc_w 2131951852
    //   73: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   76: astore #5
    //   78: aload #5
    //   80: astore_3
    //   81: aload #5
    //   83: ifnonnull -> 89
    //   86: ldc ''
    //   88: astore_3
    //   89: aload_3
    //   90: putstatic b6/a.q : Ljava/lang/String;
    //   93: aload_0
    //   94: invokevirtual getContext : ()Landroid/content/Context;
    //   97: astore #5
    //   99: aload #4
    //   101: astore_3
    //   102: aload #5
    //   104: ifnull -> 126
    //   107: aload #5
    //   109: ldc_w 2131951749
    //   112: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   115: astore_3
    //   116: aload_3
    //   117: ifnonnull -> 126
    //   120: aload #4
    //   122: astore_3
    //   123: goto -> 126
    //   126: aload_3
    //   127: putstatic b6/a.r : Ljava/lang/String;
    //   130: aload_0
    //   131: getstatic r4/h.Z5 : I
    //   134: invokevirtual I : (I)Landroid/view/View;
    //   137: checkcast ir/am3n/needtool/views/A3Toolbar
    //   140: astore_3
    //   141: aload_3
    //   142: ifnull -> 149
    //   145: aload_3
    //   146: invokevirtual i : ()V
    //   149: getstatic r4/h.g2 : I
    //   152: istore_2
    //   153: aload_0
    //   154: iload_2
    //   155: invokevirtual I : (I)Landroid/view/View;
    //   158: checkcast androidx/appcompat/widget/AppCompatTextView
    //   161: astore_3
    //   162: aload_3
    //   163: ifnull -> 170
    //   166: aload_3
    //   167: invokevirtual requestLayout : ()V
    //   170: aload_0
    //   171: iload_2
    //   172: invokevirtual I : (I)Landroid/view/View;
    //   175: checkcast androidx/appcompat/widget/AppCompatTextView
    //   178: astore_3
    //   179: aload_3
    //   180: ifnull -> 281
    //   183: aload_3
    //   184: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   187: astore #4
    //   189: aload #4
    //   191: ifnull -> 270
    //   194: aload #4
    //   196: checkcast android/widget/RelativeLayout$LayoutParams
    //   199: astore #4
    //   201: bipush #9
    //   203: istore_1
    //   204: aload #4
    //   206: bipush #9
    //   208: invokevirtual removeRule : (I)V
    //   211: aload #4
    //   213: bipush #11
    //   215: invokevirtual removeRule : (I)V
    //   218: aload_0
    //   219: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   222: astore #5
    //   224: aload #5
    //   226: ldc_w 'resources'
    //   229: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   232: aload #5
    //   234: invokestatic c : (Landroid/content/res/Resources;)Ljava/util/Locale;
    //   237: invokevirtual getLanguage : ()Ljava/lang/String;
    //   240: ldc 'fa'
    //   242: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   245: ifeq -> 251
    //   248: goto -> 254
    //   251: bipush #11
    //   253: istore_1
    //   254: aload #4
    //   256: iload_1
    //   257: iconst_1
    //   258: invokevirtual addRule : (II)V
    //   261: aload_3
    //   262: aload #4
    //   264: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   267: goto -> 281
    //   270: new java/lang/NullPointerException
    //   273: dup
    //   274: ldc_w 'null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams'
    //   277: invokespecial <init> : (Ljava/lang/String;)V
    //   280: athrow
    //   281: aload_0
    //   282: iload_2
    //   283: invokevirtual I : (I)Landroid/view/View;
    //   286: checkcast androidx/appcompat/widget/AppCompatTextView
    //   289: astore_3
    //   290: aload_3
    //   291: ifnonnull -> 295
    //   294: return
    //   295: aload_3
    //   296: getstatic b6/a.p : Ljava/lang/String;
    //   299: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   302: return
  }
  
  public void H() {
    this.n.clear();
  }
  
  public View I(int paramInt) {
    Map<Integer, View> map = this.n;
    View view2 = map.get(Integer.valueOf(paramInt));
    View view1 = view2;
    if (view2 == null) {
      view1 = getView();
      if (view1 != null) {
        view1 = view1.findViewById(paramInt);
        if (view1 != null) {
          map.put(Integer.valueOf(paramInt), view1);
          return view1;
        } 
      } 
      view1 = null;
    } 
    return view1;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    App.g.a("IntroFrg > onCreateView()");
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "onCreateView()", false, 4, null);
    return paramLayoutInflater.inflate(2131558523, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    App.g.a("IntroFrg > onViewCreated()");
    x7.c.a.b(x7.c.a, "Me-IntroFrg", "onViewCreated()", false, 4, null);
    super.onViewCreated(paramView, paramBundle);
    Resources resources = getResources();
    m.i(resources, "resources");
    this.h = c1.c(resources);
    this.i = b.j.a(new f(this), new g(this));
    Z();
    f0.m(paramView, new h(this));
    A3Toolbar a3Toolbar = (A3Toolbar)I(r4.h.Z5);
    if (a3Toolbar != null)
      a3Toolbar.f(new i(this)); 
    AppCompatTextView appCompatTextView = (AppCompatTextView)I(r4.h.g2);
    if (appCompatTextView != null)
      e1.b((View)appCompatTextView, new j(this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final a a(p<? super Locale, ? super Boolean, q> param1p) {
      m.j(param1p, "onClosed");
      a a1 = new a();
      a.U(a1, param1p);
      return a1;
    }
    
    public final String b() {
      return a.K();
    }
    
    public final String c() {
      return a.M();
    }
  }
  
  public static final class b extends ViewPager2.i {
    b(a param1a) {}
    
    public void c(int param1Int) {
      super.c(param1Int);
      c0.l(200, new a(this.a));
    }
    
    static final class a extends n implements q8.a<q> {
      a(a param2a) {
        super(0);
      }
      
      public final void invoke() {
        if (a.P(this.g)) {
          AppCompatTextView appCompatTextView1 = (AppCompatTextView)this.g.I(r4.h.g2);
          if (appCompatTextView1 == null)
            return; 
          appCompatTextView1.setText(a.o.b());
          return;
        } 
        AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.I(r4.h.g2);
        if (appCompatTextView == null)
          return; 
        appCompatTextView.setText(a.o.c());
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      if (a.P(this.g)) {
        AppCompatTextView appCompatTextView1 = (AppCompatTextView)this.g.I(r4.h.g2);
        if (appCompatTextView1 == null)
          return; 
        appCompatTextView1.setText(a.o.b());
        return;
      } 
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.I(r4.h.g2);
      if (appCompatTextView == null)
        return; 
      appCompatTextView.setText(a.o.c());
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.I(r4.h.g2);
      if (appCompatTextView == null)
        return; 
      appCompatTextView.setText(a.o.b());
    }
  }
  
  static final class d extends n implements q8.a<q> {
    d(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      p p = a.N(this.g);
      Locale locale = a.L(this.g);
      m.g(locale);
      p.invoke(locale, Boolean.valueOf(a.J(this.g)));
    }
  }
  
  static final class e extends n implements p<Locale, Boolean, q> {
    public static final e g = new e();
    
    e() {
      super(2);
    }
    
    public final void a(Locale param1Locale, boolean param1Boolean) {
      m.j(param1Locale, "<anonymous parameter 0>");
    }
  }
  
  static final class f extends n implements q8.a<q> {
    f(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      x7.c.a.b(x7.c.a, "Me-IntroFrg", "onCreateView() > frgLang > onLocaleChanged()", false, 4, null);
      l0.a((ViewGroup)this.g.I(r4.h.Z4));
      a.T(this.g);
      Locale locale = a.L(this.g);
      Resources resources = this.g.getResources();
      m.i(resources, "resources");
      if (!m.e(locale, c1.c(resources))) {
        a a1 = this.g;
        resources = a1.getResources();
        m.i(resources, "resources");
        a.S(a1, c1.c(resources));
        a.O(this.g);
      } 
    }
  }
  
  static final class g extends n implements q8.a<q> {
    g(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      x7.c.a.b(x7.c.a, "Me-IntroFrg", "onCreateView() > frgLang > next()", false, 4, null);
      a.Q(this.g);
    }
  }
  
  static final class h extends n implements q8.a<q> {
    h(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      a.R(this.g);
    }
  }
  
  static final class i extends n implements q8.a<q> {
    i(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      a.R(this.g);
    }
  }
  
  static final class j extends n implements q8.l<View, q> {
    j(a param1a) {
      super(1);
    }
    
    public final void a(View param1View) {
      m.j(param1View, "it");
      a.Q(this.g);
    }
  }
  
  static final class k extends n implements q8.a<q> {
    k(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.I(r4.h.g2);
      if (appCompatTextView == null)
        return; 
      appCompatTextView.setText(a.o.c());
    }
  }
  
  static final class l extends n implements q8.a<q> {
    l(a param1a) {
      super(0);
    }
    
    public final void invoke() {
      a.V(this.g, 0);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b6\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */