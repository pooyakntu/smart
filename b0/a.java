package b0;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g;
import java.util.ArrayList;

class a {
  public static final ThreadLocal<a> g = new ThreadLocal<a>();
  
  private final g<b, Long> a = new g();
  
  final ArrayList<b> b = new ArrayList<b>();
  
  private final a c = new a(this);
  
  private c d;
  
  long e = 0L;
  
  private boolean f = false;
  
  private void b() {
    if (this.f) {
      for (int i = this.b.size() - 1; i >= 0; i--) {
        if (this.b.get(i) == null)
          this.b.remove(i); 
      } 
      this.f = false;
    } 
  }
  
  public static a d() {
    ThreadLocal<a> threadLocal = g;
    if (threadLocal.get() == null)
      threadLocal.set(new a()); 
    return threadLocal.get();
  }
  
  private boolean f(b paramb, long paramLong) {
    Long long_ = (Long)this.a.get(paramb);
    if (long_ == null)
      return true; 
    if (long_.longValue() < paramLong) {
      this.a.remove(paramb);
      return true;
    } 
    return false;
  }
  
  public void a(b paramb, long paramLong) {
    if (this.b.size() == 0)
      e().a(); 
    if (!this.b.contains(paramb))
      this.b.add(paramb); 
    if (paramLong > 0L)
      this.a.put(paramb, Long.valueOf(SystemClock.uptimeMillis() + paramLong)); 
  }
  
  void c(long paramLong) {
    long l = SystemClock.uptimeMillis();
    for (int i = 0; i < this.b.size(); i++) {
      b b = this.b.get(i);
      if (b != null && f(b, l))
        b.a(paramLong); 
    } 
    b();
  }
  
  c e() {
    if (this.d == null)
      this.d = new d(this.c); 
    return this.d;
  }
  
  public void g(b paramb) {
    this.a.remove(paramb);
    int i = this.b.indexOf(paramb);
    if (i >= 0) {
      this.b.set(i, null);
      this.f = true;
    } 
  }
  
  class a {
    a(a this$0) {}
    
    void a() {
      this.a.e = SystemClock.uptimeMillis();
      a a1 = this.a;
      a1.c(a1.e);
      if (this.a.b.size() > 0)
        this.a.e().a(); 
    }
  }
  
  static interface b {
    boolean a(long param1Long);
  }
  
  static abstract class c {
    final a.a a;
    
    c(a.a param1a) {
      this.a = param1a;
    }
    
    abstract void a();
  }
  
  private static class d extends c {
    private final Choreographer b = Choreographer.getInstance();
    
    private final Choreographer.FrameCallback c = new a(this);
    
    d(a.a param1a) {
      super(param1a);
    }
    
    void a() {
      this.b.postFrameCallback(this.c);
    }
    
    class a implements Choreographer.FrameCallback {
      a(a.d this$0) {}
      
      public void doFrame(long param2Long) {
        this.a.a.a();
      }
    }
  }
  
  class a implements Choreographer.FrameCallback {
    a(a this$0) {}
    
    public void doFrame(long param1Long) {
      this.a.a.a();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */