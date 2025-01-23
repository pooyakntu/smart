package b0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.e1;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements a.b {
  public static final r m = new f("translationX");
  
  public static final r n = new g("translationY");
  
  public static final r o = new h("translationZ");
  
  public static final r p = new i("scaleX");
  
  public static final r q = new j("scaleY");
  
  public static final r r = new k("rotation");
  
  public static final r s = new l("rotationX");
  
  public static final r t = new m("rotationY");
  
  public static final r u = new n("x");
  
  public static final r v = new a("y");
  
  public static final r w = new b("z");
  
  public static final r x = new c("alpha");
  
  public static final r y = new d("scrollX");
  
  public static final r z = new e("scrollY");
  
  float a = 0.0F;
  
  float b = Float.MAX_VALUE;
  
  boolean c = false;
  
  final Object d;
  
  final c e;
  
  boolean f = false;
  
  float g = Float.MAX_VALUE;
  
  float h = -Float.MAX_VALUE;
  
  private long i = 0L;
  
  private float j;
  
  private final ArrayList<p> k = new ArrayList<p>();
  
  private final ArrayList<q> l = new ArrayList<q>();
  
  <K> b(K paramK, c<K> paramc) {
    this.d = paramK;
    this.e = paramc;
    if (paramc == r || paramc == s || paramc == t) {
      this.j = 0.1F;
      return;
    } 
    if (paramc == x) {
      this.j = 0.00390625F;
      return;
    } 
    if (paramc == p || paramc == q) {
      this.j = 0.00390625F;
      return;
    } 
    this.j = 1.0F;
  }
  
  private void b(boolean paramBoolean) {
    int i = 0;
    this.f = false;
    a.d().g(this);
    this.i = 0L;
    this.c = false;
    while (i < this.k.size()) {
      if (this.k.get(i) != null)
        ((p)this.k.get(i)).a(this, paramBoolean, this.b, this.a); 
      i++;
    } 
    f(this.k);
  }
  
  private float c() {
    return this.e.a(this.d);
  }
  
  private static <T> void f(ArrayList<T> paramArrayList) {
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      if (paramArrayList.get(i) == null)
        paramArrayList.remove(i); 
    } 
  }
  
  private void j() {
    if (!this.f) {
      this.f = true;
      if (!this.c)
        this.b = c(); 
      float f = this.b;
      if (f <= this.g && f >= this.h) {
        a.d().a(this, 0L);
        return;
      } 
      throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    } 
  }
  
  public boolean a(long paramLong) {
    long l = this.i;
    if (l == 0L) {
      this.i = paramLong;
      g(this.b);
      return false;
    } 
    this.i = paramLong;
    boolean bool = k(paramLong - l);
    float f = Math.min(this.b, this.g);
    this.b = f;
    f = Math.max(f, this.h);
    this.b = f;
    g(f);
    if (bool)
      b(false); 
    return bool;
  }
  
  float d() {
    return this.j * 0.75F;
  }
  
  public boolean e() {
    return this.f;
  }
  
  void g(float paramFloat) {
    this.e.b(this.d, paramFloat);
    for (int i = 0; i < this.l.size(); i++) {
      if (this.l.get(i) != null)
        ((q)this.l.get(i)).a(this, this.b, this.a); 
    } 
    f(this.l);
  }
  
  public T h(float paramFloat) {
    this.b = paramFloat;
    this.c = true;
    return (T)this;
  }
  
  public void i() {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      if (!this.f)
        j(); 
      return;
    } 
    throw new AndroidRuntimeException("Animations may only be started on the main thread");
  }
  
  abstract boolean k(long paramLong);
  
  static final class a extends r {
    a(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setY(param1Float);
    }
  }
  
  static final class b extends r {
    b(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return e1.T(param1View);
    }
    
    public void d(View param1View, float param1Float) {
      e1.h1(param1View, param1Float);
    }
  }
  
  static final class c extends r {
    c(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getAlpha();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setAlpha(param1Float);
    }
  }
  
  static final class d extends r {
    d(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScrollX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScrollX((int)param1Float);
    }
  }
  
  static final class e extends r {
    e(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScrollY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScrollY((int)param1Float);
    }
  }
  
  static final class f extends r {
    f(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getTranslationX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setTranslationX(param1Float);
    }
  }
  
  static final class g extends r {
    g(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getTranslationY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setTranslationY(param1Float);
    }
  }
  
  static final class h extends r {
    h(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return e1.R(param1View);
    }
    
    public void d(View param1View, float param1Float) {
      e1.e1(param1View, param1Float);
    }
  }
  
  static final class i extends r {
    i(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScaleX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScaleX(param1Float);
    }
  }
  
  static final class j extends r {
    j(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScaleY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScaleY(param1Float);
    }
  }
  
  static final class k extends r {
    k(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getRotation();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setRotation(param1Float);
    }
  }
  
  static final class l extends r {
    l(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getRotationX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setRotationX(param1Float);
    }
  }
  
  static final class m extends r {
    m(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getRotationY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setRotationY(param1Float);
    }
  }
  
  static final class n extends r {
    n(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setX(param1Float);
    }
  }
  
  static class o {
    float a;
    
    float b;
  }
  
  public static interface p {
    void a(b param1b, boolean param1Boolean, float param1Float1, float param1Float2);
  }
  
  public static interface q {
    void a(b param1b, float param1Float1, float param1Float2);
  }
  
  public static abstract class r extends c<View> {
    private r(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b0\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */