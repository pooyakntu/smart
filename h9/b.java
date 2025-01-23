package h9;

import b9.v;
import b9.v1;
import e8.k;
import g9.c0;
import j8.d;
import j8.g;
import kotlin.coroutines.jvm.internal.h;
import q8.l;
import q8.p;
import r8.e0;

public final class b {
  public static final <T> void a(l<? super d<? super T>, ? extends Object> paraml, d<? super T> paramd) {
    d d1 = h.a(paramd);
    try {
      g g = paramd.getContext();
    } finally {
      paraml = null;
      k.a a = k.g;
    } 
  }
  
  public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> paramp, R paramR, d<? super T> paramd) {
    d d1 = h.a(paramd);
    try {
      g g = paramd.getContext();
    } finally {
      paramp = null;
      k.a a = k.g;
    } 
  }
  
  public static final <T, R> Object c(c0<? super T> paramc0, R paramR, p<? super R, ? super d<? super T>, ? extends Object> paramp) {
    v v;
    try {
      paramR = (R)((p)e0.d(paramp, 2)).invoke(paramR, paramc0);
    } finally {
      paramR = null;
    } 
    Object object = paramc0.i0(v);
    if (object == v1.b)
      return k8.b.d(); 
    if (!(object instanceof v))
      return v1.h(object); 
    throw ((v)object).a;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h9\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */