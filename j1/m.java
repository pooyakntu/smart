package j1;

import java.util.Queue;
import x1.h;
import x1.l;

public class m<A, B> {
  private final h<b<A>, B> a;
  
  public m(long paramLong) {
    this.a = new a(this, paramLong);
  }
  
  public B a(A paramA, int paramInt1, int paramInt2) {
    b<A> b = b.a(paramA, paramInt1, paramInt2);
    Object object = this.a.g(b);
    b.c();
    return (B)object;
  }
  
  public void b(A paramA, int paramInt1, int paramInt2, B paramB) {
    b<A> b = b.a(paramA, paramInt1, paramInt2);
    this.a.k(b, paramB);
  }
  
  class a extends h<b<A>, B> {
    a(m this$0, long param1Long) {
      super(param1Long);
    }
    
    protected void n(m.b<A> param1b, B param1B) {
      param1b.c();
    }
  }
  
  static final class b<A> {
    private static final Queue<b<?>> d = l.e(0);
    
    private int a;
    
    private int b;
    
    private A c;
    
    static <A> b<A> a(A param1A, int param1Int1, int param1Int2) {
      Queue<b<?>> queue;
      b<A> b1;
      synchronized (d) {
        b<A> b2 = (b)queue.poll();
        b1 = b2;
        if (b2 == null)
          b1 = new b(); 
        b1.b(param1A, param1Int1, param1Int2);
        return b1;
      } 
    }
    
    private void b(A param1A, int param1Int1, int param1Int2) {
      this.c = param1A;
      this.b = param1Int1;
      this.a = param1Int2;
    }
    
    public void c() {
      synchronized (d) {
        null.offer(this);
        return;
      } 
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof b;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool) {
        param1Object = param1Object;
        bool1 = bool2;
        if (this.b == ((b)param1Object).b) {
          bool1 = bool2;
          if (this.a == ((b)param1Object).a) {
            bool1 = bool2;
            if (this.c.equals(((b)param1Object).c))
              bool1 = true; 
          } 
        } 
      } 
      return bool1;
    }
    
    public int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.c.hashCode();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */