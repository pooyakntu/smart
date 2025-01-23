package h9;

import e8.k;
import e8.l;
import e8.q;
import j8.d;
import k8.b;
import q8.l;
import q8.p;

public final class a {
  private static final void a(d<?> paramd, Throwable paramThrowable) {
    k.a a1 = k.g;
    paramd.resumeWith(k.a(l.a(paramThrowable)));
    throw paramThrowable;
  }
  
  public static final void b(d<? super q> paramd, d<?> paramd1) {
    try {
      paramd = b.c(paramd);
      return;
    } finally {
      paramd = null;
      a(paramd1, (Throwable)paramd);
    } 
  }
  
  public static final <T> void c(l<? super d<? super T>, ? extends Object> paraml, d<? super T> paramd) {
    try {
      d d1 = b.c(b.a(paraml, paramd));
      return;
    } finally {
      paraml = null;
      a(paramd, (Throwable)paraml);
    } 
  }
  
  public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> paramp, R paramR, d<? super T> paramd, l<? super Throwable, q> paraml) {
    try {
      d d1 = b.c(b.b(paramp, paramR, paramd));
      return;
    } finally {
      paramp = null;
      a(paramd, (Throwable)paramp);
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h9\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */