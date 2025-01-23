package d9;

import e8.q;
import g9.d0;
import g9.g0;
import g9.y;
import j8.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q8.l;
import r8.m;

public final class j<E> extends d0<j<E>> {
  private final b<E> k;
  
  private final AtomicReferenceArray l;
  
  public j(long paramLong, j<E> paramj, b<E> paramb, int paramInt) {
    super(paramLong, paramj, paramInt);
    this.k = paramb;
    this.l = new AtomicReferenceArray(c.b * 2);
  }
  
  private final void z(int paramInt, Object paramObject) {
    this.l.lazySet(paramInt * 2, paramObject);
  }
  
  public final void A(int paramInt, Object paramObject) {
    this.l.set(paramInt * 2 + 1, paramObject);
  }
  
  public final void B(int paramInt, E paramE) {
    z(paramInt, paramE);
  }
  
  public int n() {
    return c.b;
  }
  
  public void o(int paramInt, Throwable paramThrowable, g paramg) {
    boolean bool;
    int k = c.b;
    if (paramInt >= k) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = paramInt;
    if (bool)
      i = paramInt - k; 
    E e = v(i);
    while (true) {
      Object object = w(i);
      if (object instanceof b9.p2 || object instanceof t) {
        g0 g0;
        if (bool) {
          g0 = c.j();
        } else {
          g0 = c.i();
        } 
        if (r(i, object, g0)) {
          s(i);
          x(i, bool ^ true);
          if (bool) {
            l<E, q> l = (u()).h;
            if (l != null)
              y.b(l, e, paramg); 
          } 
          return;
        } 
        continue;
      } 
      if (object == c.j() || object == c.i()) {
        s(i);
        if (bool) {
          l<E, q> l = (u()).h;
          if (l != null)
            y.b(l, e, paramg); 
        } 
        return;
      } 
      if (object == c.p() || object == c.q())
        continue; 
      if (object != c.f()) {
        if (object == c.d)
          return; 
        if (object == c.z())
          return; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected state: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
      } 
      return;
    } 
  }
  
  public final boolean r(int paramInt, Object paramObject1, Object paramObject2) {
    return i.a(this.l, paramInt * 2 + 1, paramObject1, paramObject2);
  }
  
  public final void s(int paramInt) {
    z(paramInt, null);
  }
  
  public final Object t(int paramInt, Object paramObject) {
    return this.l.getAndSet(paramInt * 2 + 1, paramObject);
  }
  
  public final b<E> u() {
    b<E> b1 = this.k;
    m.g(b1);
    return b1;
  }
  
  public final E v(int paramInt) {
    return this.l.get(paramInt * 2);
  }
  
  public final Object w(int paramInt) {
    return this.l.get(paramInt * 2 + 1);
  }
  
  public final void x(int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      u().A0(this.i * c.b + paramInt); 
    p();
  }
  
  public final E y(int paramInt) {
    E e = v(paramInt);
    s(paramInt);
    return e;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */