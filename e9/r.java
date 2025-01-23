package e9;

import androidx.concurrent.futures.b;
import b9.l;
import e8.k;
import e8.q;
import f9.b;
import f9.c;
import g9.g0;
import j8.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k8.b;
import kotlin.coroutines.jvm.internal.h;
import r8.m;

final class r extends c<p<?>> {
  private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
  
  private volatile Object _state;
  
  public boolean d(p<?> paramp) {
    AtomicReferenceFieldUpdater<r, g0> atomicReferenceFieldUpdater = a;
    if (atomicReferenceFieldUpdater.get(this) != null)
      return false; 
    atomicReferenceFieldUpdater.set(this, q.b());
    return true;
  }
  
  public final Object e(d<? super q> paramd) {
    l l = new l(b.c(paramd), 1);
    l.A();
    if (!b.a(c(), this, q.b(), l)) {
      k.a a = k.g;
      l.resumeWith(k.a(q.a));
    } 
    Object object = l.x();
    if (object == b.d())
      h.c(paramd); 
    return (object == b.d()) ? object : q.a;
  }
  
  public d<q>[] f(p<?> paramp) {
    a.set(this, null);
    return (d<q>[])b.a;
  }
  
  public final void g() {
    AtomicReferenceFieldUpdater<r, Object> atomicReferenceFieldUpdater = a;
    while (true) {
      g0 g0 = (g0)atomicReferenceFieldUpdater.get(this);
      if (g0 == null)
        return; 
      if (g0 == q.c())
        return; 
      if (g0 == q.b()) {
        if (b.a(a, this, g0, q.c()))
          return; 
        continue;
      } 
      if (b.a(a, this, g0, q.b())) {
        l l = (l)g0;
        k.a a = k.g;
        l.resumeWith(k.a(q.a));
        return;
      } 
    } 
  }
  
  public final boolean h() {
    g0 g0 = (g0)a.getAndSet(this, q.b());
    m.g(g0);
    return (g0 == q.c());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */