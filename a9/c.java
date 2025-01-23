package a9;

import r8.m;
import w8.f;
import w8.g;

public final class c {
  private static final long b(long paramLong) {
    return a.a((paramLong << 1L) + 1L);
  }
  
  private static final long c(long paramLong) {
    return a.a(paramLong << 1L);
  }
  
  public static final long d(int paramInt, d paramd) {
    m.j(paramd, "unit");
    return (paramd.compareTo(d.SECONDS) <= 0) ? c(e.b(paramInt, paramd, d.NANOSECONDS)) : e(paramInt, paramd);
  }
  
  public static final long e(long paramLong, d paramd) {
    m.j(paramd, "unit");
    d d1 = d.NANOSECONDS;
    long l = e.b(4611686018426999999L, d1, paramd);
    return (new f(-l, l)).e(paramLong) ? c(e.b(paramLong, paramd, d1)) : b(g.g(e.a(paramLong, paramd, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a9\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */