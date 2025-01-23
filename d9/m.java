package d9;

import b9.p2;
import e8.a;
import e8.q;
import g9.g0;
import g9.y;
import j8.d;
import kotlinx.coroutines.internal.UndeliveredElementException;
import q8.l;
import r8.b0;

public class m<E> extends b<E> {
  private final int s;
  
  private final a t;
  
  public m(int paramInt, a parama, l<? super E, q> paraml) {
    super(paramInt, paraml);
    boolean bool1;
    this.s = paramInt;
    this.t = parama;
    a a1 = a.SUSPEND;
    boolean bool2 = false;
    if (parama != a1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      bool1 = bool2;
      if (paramInt >= 1)
        bool1 = true; 
      if (bool1)
        return; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Buffered channel capacity must be at least 1, but ");
      stringBuilder1.append(paramInt);
      stringBuilder1.append(" was specified");
      throw new IllegalArgumentException(stringBuilder1.toString().toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("This implementation does not support suspension for senders, use ");
    stringBuilder.append(b0.b(b.class).a());
    stringBuilder.append(" instead");
    throw new IllegalArgumentException(stringBuilder.toString().toString());
  }
  
  private final Object C0(E paramE, boolean paramBoolean) {
    Object<E, q> object = (Object<E, q>)super.h(paramE);
    if (!h.h(object)) {
      if (h.g(object))
        return object; 
      if (paramBoolean) {
        object = (Object<E, q>)this.h;
        if (object != null) {
          UndeliveredElementException undeliveredElementException = y.d((l)object, paramE, null, 2, null);
          if (undeliveredElementException != null)
            throw undeliveredElementException; 
        } 
      } 
      return h.b.c(q.a);
    } 
    return object;
  }
  
  private final Object D0(E paramE) {
    g0 g0 = c.d;
    j j = b.l().get(this);
    while (true) {
      long l2 = b.m().getAndIncrement(this);
      long l1 = l2 & 0xFFFFFFFFFFFFFFFL;
      boolean bool = b.n(this, l2);
      int i = c.b;
      l2 = l1 / i;
      int k = (int)(l1 % i);
      if (j.i != l2) {
        j j1 = b.c(this, l2, j);
        if (j1 == null) {
          if (bool)
            return h.b.a(K()); 
          continue;
        } 
        j = j1;
      } 
      int n = b.s(this, j, k, paramE, l1, g0, bool);
      if (n != 0) {
        if (n != 1) {
          if (n != 2) {
            if (n != 3) {
              if (n != 4) {
                if (n != 5)
                  continue; 
                j.b();
                continue;
              } 
              if (l1 < J())
                j.b(); 
              return h.b.a(K());
            } 
            throw new IllegalStateException("unexpected".toString());
          } 
          if (bool) {
            j.p();
            return h.b.a(K());
          } 
          if (g0 instanceof p2) {
            p2 p2 = (p2)g0;
          } else {
            paramE = null;
          } 
          if (paramE != null)
            b.q(this, (p2)paramE, j, k); 
          B(j.i * i + k);
          return h.b.c(q.a);
        } 
        return h.b.c(q.a);
      } 
      j.b();
      return h.b.c(q.a);
    } 
  }
  
  private final Object E0(E paramE, boolean paramBoolean) {
    return (this.t == a.DROP_LATEST) ? C0(paramE, paramBoolean) : D0(paramE);
  }
  
  protected boolean V() {
    return (this.t == a.DROP_OLDEST);
  }
  
  public Object b(E paramE, d<? super q> paramd) {
    return B0(this, paramE, paramd);
  }
  
  public Object h(E paramE) {
    return E0(paramE, false);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */