package d9;

import b9.k;
import e8.q;
import g9.g0;
import g9.h0;
import q8.l;
import q8.p;
import r8.k;
import x8.d;

public final class c {
  private static final j<Object> a = new j(-1L, null, null, 0);
  
  public static final int b = h0.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
  
  private static final int c = h0.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
  
  public static final g0 d = new g0("BUFFERED");
  
  private static final g0 e = new g0("SHOULD_BUFFER");
  
  private static final g0 f = new g0("S_RESUMING_BY_RCV");
  
  private static final g0 g = new g0("RESUMING_BY_EB");
  
  private static final g0 h = new g0("POISONED");
  
  private static final g0 i = new g0("DONE_RCV");
  
  private static final g0 j = new g0("INTERRUPTED_SEND");
  
  private static final g0 k = new g0("INTERRUPTED_RCV");
  
  private static final g0 l = new g0("CHANNEL_CLOSED");
  
  private static final g0 m = new g0("SUSPEND");
  
  private static final g0 n = new g0("SUSPEND_NO_WAITER");
  
  private static final g0 o = new g0("FAILED");
  
  private static final g0 p = new g0("NO_RECEIVE_RESULT");
  
  private static final g0 q = new g0("CLOSE_HANDLER_CLOSED");
  
  private static final g0 r = new g0("CLOSE_HANDLER_INVOKED");
  
  private static final g0 s = new g0("NO_CLOSE_CAUSE");
  
  private static final long A(int paramInt) {
    return (paramInt != 0) ? ((paramInt != Integer.MAX_VALUE) ? paramInt : Long.MAX_VALUE) : 0L;
  }
  
  private static final <T> boolean B(k<? super T> paramk, T paramT, l<? super Throwable, q> paraml) {
    paramT = (T)paramk.l(paramT, null, paraml);
    if (paramT != null) {
      paramk.m(paramT);
      return true;
    } 
    return false;
  }
  
  private static final long v(long paramLong, boolean paramBoolean) {
    long l;
    if (paramBoolean) {
      l = 4611686018427387904L;
    } else {
      l = 0L;
    } 
    return l + paramLong;
  }
  
  private static final long w(long paramLong, int paramInt) {
    return (paramInt << 60L) + paramLong;
  }
  
  private static final <E> j<E> x(long paramLong, j<E> paramj) {
    return new j<E>(paramLong, paramj, paramj.u(), 0);
  }
  
  public static final <E> d<j<E>> y() {
    return (d<j<E>>)a.p;
  }
  
  public static final g0 z() {
    return l;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */