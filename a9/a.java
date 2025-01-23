package a9;

import r8.g;
import r8.m;
import w8.f;

public final class a implements Comparable<a> {
  public static final a g = new a(null);
  
  private static final long h = a(0L);
  
  private static final long i = c.a(4611686018427387903L);
  
  private static final long j = c.a(-4611686018427387903L);
  
  public static long a(long paramLong) {
    if (b.a()) {
      if (e(paramLong)) {
        if ((new f(-4611686018426999999L, 4611686018426999999L)).e(d(paramLong)))
          return paramLong; 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(d(paramLong));
        stringBuilder1.append(" ns is out of nanoseconds range");
        throw new AssertionError(stringBuilder1.toString());
      } 
      if ((new f(-4611686018427387903L, 4611686018427387903L)).e(d(paramLong))) {
        if (!(new f(-4611686018426L, 4611686018426L)).e(d(paramLong)))
          return paramLong; 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(d(paramLong));
        stringBuilder1.append(" ms is denormalized");
        throw new AssertionError(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(d(paramLong));
      stringBuilder.append(" ms is out of milliseconds range");
      throw new AssertionError(stringBuilder.toString());
    } 
    return paramLong;
  }
  
  public static final long b(long paramLong) {
    return f(paramLong, d.SECONDS);
  }
  
  private static final d c(long paramLong) {
    return e(paramLong) ? d.NANOSECONDS : d.MILLISECONDS;
  }
  
  private static final long d(long paramLong) {
    return paramLong >> 1L;
  }
  
  private static final boolean e(long paramLong) {
    return (((int)paramLong & 0x1) == 0);
  }
  
  public static final long f(long paramLong, d paramd) {
    m.j(paramd, "unit");
    return (paramLong == i) ? Long.MAX_VALUE : ((paramLong == j) ? Long.MIN_VALUE : e.a(d(paramLong), c(paramLong), paramd));
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a9\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */