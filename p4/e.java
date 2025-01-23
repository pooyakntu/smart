package p4;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import n4.m;

class e extends b {
  private final q4.a b;
  
  private final WeakReference<View> c;
  
  private long d;
  
  private boolean e = false;
  
  private long f = 0L;
  
  private boolean g = false;
  
  private Interpolator h;
  
  private boolean i = false;
  
  private n4.a.a j = null;
  
  private b k = new b(null);
  
  ArrayList<c> l = new ArrayList<c>();
  
  private Runnable m = new a(this);
  
  private HashMap<n4.a, d> n = new HashMap<n4.a, d>();
  
  e(View paramView) {
    this.c = new WeakReference<View>(paramView);
    this.b = q4.a.F(paramView);
  }
  
  private void m(int paramInt, float paramFloat) {
    float f = o(paramInt);
    n(paramInt, f, paramFloat - f);
  }
  
  private void n(int paramInt, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Ljava/util/HashMap;
    //   4: invokevirtual size : ()I
    //   7: ifle -> 93
    //   10: aload_0
    //   11: getfield n : Ljava/util/HashMap;
    //   14: invokevirtual keySet : ()Ljava/util/Set;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore #5
    //   24: aload #5
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 80
    //   34: aload #5
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast n4/a
    //   44: astore #4
    //   46: aload_0
    //   47: getfield n : Ljava/util/HashMap;
    //   50: aload #4
    //   52: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   55: checkcast p4/e$d
    //   58: astore #6
    //   60: aload #6
    //   62: iload_1
    //   63: invokevirtual a : (I)Z
    //   66: ifeq -> 24
    //   69: aload #6
    //   71: getfield a : I
    //   74: ifne -> 24
    //   77: goto -> 83
    //   80: aconst_null
    //   81: astore #4
    //   83: aload #4
    //   85: ifnull -> 93
    //   88: aload #4
    //   90: invokevirtual cancel : ()V
    //   93: new p4/e$c
    //   96: dup
    //   97: iload_1
    //   98: fload_2
    //   99: fload_3
    //   100: invokespecial <init> : (IFF)V
    //   103: astore #4
    //   105: aload_0
    //   106: getfield l : Ljava/util/ArrayList;
    //   109: aload #4
    //   111: invokevirtual add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: aload_0
    //   116: getfield c : Ljava/lang/ref/WeakReference;
    //   119: invokevirtual get : ()Ljava/lang/Object;
    //   122: checkcast android/view/View
    //   125: astore #4
    //   127: aload #4
    //   129: ifnull -> 152
    //   132: aload #4
    //   134: aload_0
    //   135: getfield m : Ljava/lang/Runnable;
    //   138: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   141: pop
    //   142: aload #4
    //   144: aload_0
    //   145: getfield m : Ljava/lang/Runnable;
    //   148: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   151: pop
    //   152: return
  }
  
  private float o(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 4) ? ((paramInt != 8) ? ((paramInt != 16) ? ((paramInt != 32) ? ((paramInt != 64) ? ((paramInt != 128) ? ((paramInt != 256) ? ((paramInt != 512) ? 0.0F : this.b.b()) : this.b.o()) : this.b.n()) : this.b.g()) : this.b.f()) : this.b.e()) : this.b.i()) : this.b.h()) : this.b.m()) : this.b.l();
  }
  
  private void p(int paramInt, float paramFloat) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 4) {
          if (paramInt != 8) {
            if (paramInt != 16) {
              if (paramInt != 32) {
                if (paramInt != 64) {
                  if (paramInt != 128) {
                    if (paramInt != 256) {
                      if (paramInt != 512)
                        return; 
                      this.b.r(paramFloat);
                      return;
                    } 
                    this.b.D(paramFloat);
                    return;
                  } 
                  this.b.C(paramFloat);
                  return;
                } 
                this.b.w(paramFloat);
                return;
              } 
              this.b.v(paramFloat);
              return;
            } 
            this.b.u(paramFloat);
            return;
          } 
          this.b.y(paramFloat);
          return;
        } 
        this.b.x(paramFloat);
        return;
      } 
      this.b.A(paramFloat);
      return;
    } 
    this.b.z(paramFloat);
  }
  
  private void q() {
    int i = 0;
    m m = m.C(new float[] { 1.0F });
    ArrayList<c> arrayList = (ArrayList)this.l.clone();
    this.l.clear();
    int k = arrayList.size();
    int j = 0;
    while (i < k) {
      j |= ((c)arrayList.get(i)).a;
      i++;
    } 
    this.n.put(m, new d(j, arrayList));
    m.r(this.k);
    m.a(this.k);
    if (this.g)
      m.H(this.f); 
    if (this.e)
      m.E(this.d); 
    if (this.i)
      m.G(this.h); 
    m.f();
  }
  
  public b b(float paramFloat) {
    m(4, paramFloat);
    return this;
  }
  
  public b c(float paramFloat) {
    m(8, paramFloat);
    return this;
  }
  
  public b d(long paramLong) {
    if (paramLong >= 0L) {
      this.e = true;
      this.d = paramLong;
      return this;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animators cannot have negative duration: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public b e(Interpolator paramInterpolator) {
    this.i = true;
    this.h = paramInterpolator;
    return this;
  }
  
  public b f(n4.a.a parama) {
    this.j = parama;
    return this;
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      e.g(this.g);
    }
  }
  
  private class b implements n4.a.a, m.g {
    private b(e this$0) {}
    
    public void a(n4.a param1a) {
      if (e.h(this.a) != null)
        e.h(this.a).a(param1a); 
    }
    
    public void b(n4.a param1a) {
      if (e.h(this.a) != null)
        e.h(this.a).b(param1a); 
    }
    
    public void c(m param1m) {
      float f = param1m.x();
      e.d d = (e.d)e.j(this.a).get(param1m);
      if ((d.a & 0x1FF) != 0) {
        View view1 = e.k(this.a).get();
        if (view1 != null)
          view1.invalidate(); 
      } 
      ArrayList<e.c> arrayList = d.b;
      if (arrayList != null) {
        int j = arrayList.size();
        int i;
        for (i = 0; i < j; i++) {
          e.c c = arrayList.get(i);
          float f1 = c.b;
          float f2 = c.c;
          e.l(this.a, c.a, f1 + f2 * f);
        } 
      } 
      View view = e.k(this.a).get();
      if (view != null)
        view.invalidate(); 
    }
    
    public void d(n4.a param1a) {
      if (e.h(this.a) != null)
        e.h(this.a).d(param1a); 
    }
    
    public void e(n4.a param1a) {
      if (e.h(this.a) != null)
        e.h(this.a).e(param1a); 
      e.j(this.a).remove(param1a);
      if (e.j(this.a).isEmpty())
        e.i(this.a, null); 
    }
  }
  
  private static class c {
    int a;
    
    float b;
    
    float c;
    
    c(int param1Int, float param1Float1, float param1Float2) {
      this.a = param1Int;
      this.b = param1Float1;
      this.c = param1Float2;
    }
  }
  
  private static class d {
    int a;
    
    ArrayList<e.c> b;
    
    d(int param1Int, ArrayList<e.c> param1ArrayList) {
      this.a = param1Int;
      this.b = param1ArrayList;
    }
    
    boolean a(int param1Int) {
      if ((this.a & param1Int) != 0) {
        ArrayList<e.c> arrayList = this.b;
        if (arrayList != null) {
          int j = arrayList.size();
          for (int i = 0; i < j; i++) {
            if (((e.c)this.b.get(i)).a == param1Int) {
              this.b.remove(i);
              this.a = param1Int & this.a;
              return true;
            } 
          } 
        } 
      } 
      return false;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p4\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */