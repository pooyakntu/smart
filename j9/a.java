package j9;

import androidx.concurrent.futures.b;
import b9.i;
import b9.k;
import b9.p2;
import b9.u0;
import e8.q;
import f8.o;
import g9.d0;
import g9.g0;
import j8.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q8.l;
import q8.q;
import r8.m;

public class a<R> extends i implements b, p2 {
  private static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");
  
  private final g g;
  
  private List<a> h;
  
  private Object i;
  
  private int j;
  
  private Object k;
  
  private volatile Object state;
  
  private final a e(Object paramObject) {
    List<a> list = this.h;
    List list1 = null;
    if (list == null)
      return null; 
    Iterator<a> iterator = list.iterator();
    while (true) {
      list = list1;
      if (iterator.hasNext()) {
        boolean bool;
        list = (List<a>)iterator.next();
        if (((a)list).a == paramObject) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          break; 
        continue;
      } 
      break;
    } 
    a a1 = (a)list;
    if (a1 != null)
      return a1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Clause with object ");
    stringBuilder.append(paramObject);
    stringBuilder.append(" is not found");
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  private final int i(Object paramObject1, Object paramObject2) {
    while (true) {
      boolean bool;
      AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = l;
      k k = (k)atomicReferenceFieldUpdater.get(this);
      if (k instanceof k) {
        a a1 = e(paramObject1);
        if (a1 == null)
          continue; 
        l<Throwable, q> l = a1.a(this, paramObject2);
        if (b.a(atomicReferenceFieldUpdater, this, k, a1)) {
          paramObject1 = k;
          this.k = paramObject2;
          if (c.g((k)paramObject1, l))
            return 0; 
          this.k = null;
          return 2;
        } 
        continue;
      } 
      if (m.e(k, c.e())) {
        bool = true;
      } else {
        bool = k instanceof a;
      } 
      if (bool)
        return 3; 
      if (m.e(k, c.d()))
        return 2; 
      if (m.e(k, c.f())) {
        if (b.a(atomicReferenceFieldUpdater, this, k, o.d(paramObject1)))
          return 1; 
        continue;
      } 
      if (k instanceof List) {
        if (b.a(atomicReferenceFieldUpdater, this, k, o.W((Collection)k, paramObject1)))
          return 1; 
        continue;
      } 
      paramObject1 = new StringBuilder();
      paramObject1.append("Unexpected state: ");
      paramObject1.append(k);
      throw new IllegalStateException(paramObject1.toString().toString());
    } 
  }
  
  public boolean a(Object paramObject1, Object paramObject2) {
    return (i(paramObject1, paramObject2) == 0);
  }
  
  public void b(d0<?> paramd0, int paramInt) {
    this.i = paramd0;
    this.j = paramInt;
  }
  
  public void c(Object paramObject) {
    this.k = paramObject;
  }
  
  public void d(Throwable paramThrowable) {
    AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = l;
    while (true) {
      g0 g0 = (g0)atomicReferenceFieldUpdater.get(this);
      if (g0 == c.e())
        return; 
      if (b.a(atomicReferenceFieldUpdater, this, g0, c.d())) {
        List<a> list = this.h;
        if (list == null)
          return; 
        Iterator<a> iterator = list.iterator();
        while (iterator.hasNext())
          ((a)iterator.next()).b(); 
        this.k = c.c();
        this.h = null;
        return;
      } 
    } 
  }
  
  public final d f(Object paramObject1, Object paramObject2) {
    return c.b(i(paramObject1, paramObject2));
  }
  
  public g getContext() {
    return this.g;
  }
  
  public final class a {
    public final Object a;
    
    private final Object b;
    
    public final q<b<?>, Object, Object, l<Throwable, q>> c;
    
    public Object d;
    
    public int e;
    
    public final l<Throwable, q> a(b<?> param1b, Object param1Object) {
      q<b<?>, Object, Object, l<Throwable, q>> q1 = this.c;
      return (q1 != null) ? (l<Throwable, q>)q1.g(param1b, this.b, param1Object) : null;
    }
    
    public final void b() {
      Object object = this.d;
      a<R> a1 = this.f;
      boolean bool = object instanceof d0;
      u0 u0 = null;
      if (bool) {
        ((d0)object).o(this.e, null, a1.getContext());
        return;
      } 
      if (object instanceof u0)
        u0 = (u0)object; 
      if (u0 != null)
        u0.dispose(); 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j9\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */