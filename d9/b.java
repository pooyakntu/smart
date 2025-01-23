package d9;

import b9.k;
import b9.l;
import b9.n;
import b9.p2;
import e8.k;
import e8.l;
import e8.q;
import f8.o;
import g9.d;
import g9.d0;
import g9.e;
import g9.e0;
import g9.f0;
import g9.g0;
import g9.m;
import g9.y;
import j8.d;
import j9.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import q8.l;
import q8.p;
import q8.q;
import r8.e0;
import r8.m;
import r8.n;
import z8.m;

public class b<E> implements d<E> {
  private static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
  
  private static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
  
  private static final AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
  
  private static final AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
  
  private static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
  
  private static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
  
  private static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
  
  private static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
  
  private static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
  
  private volatile Object _closeCause;
  
  private volatile long bufferEnd;
  
  private volatile Object bufferEndSegment;
  
  private volatile Object closeHandler;
  
  private volatile long completedExpandBuffersAndPauseFlag;
  
  private final int g;
  
  public final l<E, q> h;
  
  private final q<j9.b<?>, Object, Object, l<Throwable, q>> i;
  
  private volatile Object receiveSegment;
  
  private volatile long receivers;
  
  private volatile Object sendSegment;
  
  private volatile long sendersAndCloseStatus;
  
  public b(int paramInt, l<? super E, q> paraml) {
    boolean bool;
    this.g = paramInt;
    this.h = (l)paraml;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.bufferEnd = c.t(paramInt);
      this.completedExpandBuffersAndPauseFlag = G();
      j j = new j(0L, null, this, 3);
      this.sendSegment = j;
      this.receiveSegment = j;
      if (W()) {
        j = c.n();
        m.h(j, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
      } 
      this.bufferEndSegment = j;
      if (paraml != null) {
        c c = new c(this);
      } else {
        paraml = null;
      } 
      this.i = (q)paraml;
      this._closeCause = c.l();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid channel capacity: ");
    stringBuilder.append(paramInt);
    stringBuilder.append(", should be >=0");
    throw new IllegalArgumentException(stringBuilder.toString().toString());
  }
  
  private final void A() {
    i();
  }
  
  private final void C() {
    if (W())
      return; 
    for (j<E> j = p.get(this);; j = j1) {
      long l1 = l.getAndIncrement(this);
      int i = c.b;
      long l2 = l1 / i;
      if (L() <= l1) {
        if (j.i < l2 && j.e() != null)
          b0(l2, j); 
        O(this, 0L, 1, null);
        return;
      } 
      j<E> j1 = j;
      if (j.i != l2) {
        j1 = D(l2, j, l1);
        if (j1 == null)
          continue; 
      } 
      if (s0(j1, (int)(l1 % i), l1)) {
        O(this, 0L, 1, null);
        return;
      } 
      O(this, 0L, 1, null);
    } 
  }
  
  private final j<E> D(long paramLong1, j<E> paramj, long paramLong2) {
    Object object;
    AtomicReferenceFieldUpdater<b, d0> atomicReferenceFieldUpdater = p;
    p p = (p)c.y();
    label32: while (true) {
      object = d.c(paramj, paramLong1, p);
      if (!e0.c(object)) {
        d0 d0 = e0.b(object);
        while (true) {
          d0 d01 = atomicReferenceFieldUpdater.get(this);
          if (d01.i < d0.i) {
            boolean bool1;
            if (!d0.q()) {
              bool1 = false;
            } else {
              if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d01, d0)) {
                if (d01.m())
                  d01.k(); 
              } else {
                if (d0.m())
                  d0.k(); 
                continue;
              } 
              bool1 = true;
            } 
            if (bool1)
              break; 
            continue label32;
          } 
          boolean bool = true;
        } 
      } 
      break;
    } 
    if (e0.c(object)) {
      A();
      b0(paramLong1, paramj);
      O(this, 0L, 1, null);
      return null;
    } 
    paramj = (j<E>)e0.b(object);
    long l1 = paramj.i;
    if (l1 > paramLong1) {
      AtomicLongFieldUpdater<b> atomicLongFieldUpdater = l;
      int i = c.b;
      if (atomicLongFieldUpdater.compareAndSet(this, paramLong2 + 1L, i * l1)) {
        N(paramj.i * i - paramLong2);
        return null;
      } 
      O(this, 0L, 1, null);
      return null;
    } 
    return paramj;
  }
  
  private final j<E> E(long paramLong, j<E> paramj) {
    j<E> j1;
    Object object;
    AtomicReferenceFieldUpdater<b, d0> atomicReferenceFieldUpdater = o;
    p p = (p)c.y();
    label50: while (true) {
      object = d.c(paramj, paramLong, p);
      if (!e0.c(object)) {
        d0 d0 = e0.b(object);
        while (true) {
          boolean bool1;
          d0 d01 = atomicReferenceFieldUpdater.get(this);
          long l1 = d01.i;
          long l2 = d0.i;
          boolean bool2 = true;
          if (l1 >= l2) {
            bool1 = bool2;
          } else if (!d0.q()) {
            bool1 = false;
          } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d01, d0)) {
            bool1 = bool2;
            if (d01.m()) {
              d01.k();
              bool1 = bool2;
            } 
          } else {
            if (d0.m())
              d0.k(); 
            continue;
          } 
          if (bool1)
            break; 
          continue label50;
        } 
      } 
      break;
    } 
    boolean bool = e0.c(object);
    atomicReferenceFieldUpdater = null;
    if (bool) {
      A();
      if (paramj.i * c.b < L()) {
        paramj.b();
        return null;
      } 
    } else {
      paramj = (j<E>)e0.b(object);
      if (!W() && paramLong <= G() / c.b) {
        object = p;
        while (true) {
          d0 d0 = object.get(this);
          if (d0.i < paramj.i && paramj.q()) {
            if (androidx.concurrent.futures.b.a((AtomicReferenceFieldUpdater)object, this, d0, paramj)) {
              if (d0.m())
                d0.k(); 
              break;
            } 
            if (paramj.m())
              paramj.k(); 
            continue;
          } 
          break;
        } 
      } 
      long l1 = paramj.i;
      if (l1 > paramLong) {
        int i = c.b;
        y0(l1 * i);
        if (paramj.i * i < L()) {
          paramj.b();
          return null;
        } 
      } else {
        j1 = paramj;
      } 
    } 
    return j1;
  }
  
  private final j<E> F(long paramLong, j<E> paramj) {
    j<E> j1;
    Object object;
    AtomicReferenceFieldUpdater<b, d0> atomicReferenceFieldUpdater = n;
    p p = (p)c.y();
    label35: while (true) {
      object = d.c(paramj, paramLong, p);
      if (!e0.c(object)) {
        d0 d0 = e0.b(object);
        while (true) {
          boolean bool1;
          d0 d01 = atomicReferenceFieldUpdater.get(this);
          long l1 = d01.i;
          long l2 = d0.i;
          boolean bool2 = true;
          if (l1 >= l2) {
            bool1 = bool2;
          } else if (!d0.q()) {
            bool1 = false;
          } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d01, d0)) {
            bool1 = bool2;
            if (d01.m()) {
              d01.k();
              bool1 = bool2;
            } 
          } else {
            if (d0.m())
              d0.k(); 
            continue;
          } 
          if (bool1)
            break; 
          continue label35;
        } 
      } 
      break;
    } 
    boolean bool = e0.c(object);
    atomicReferenceFieldUpdater = null;
    if (bool) {
      A();
      if (paramj.i * c.b < J()) {
        paramj.b();
        return null;
      } 
    } else {
      paramj = (j<E>)e0.b(object);
      long l1 = paramj.i;
      if (l1 > paramLong) {
        int i = c.b;
        z0(l1 * i);
        if (paramj.i * i < J()) {
          paramj.b();
          return null;
        } 
      } else {
        j1 = paramj;
      } 
    } 
    return j1;
  }
  
  private final long G() {
    return l.get(this);
  }
  
  private final Throwable I() {
    ClosedReceiveChannelException closedReceiveChannelException;
    Throwable throwable2 = H();
    Throwable throwable1 = throwable2;
    if (throwable2 == null)
      closedReceiveChannelException = new ClosedReceiveChannelException("Channel was closed"); 
    return (Throwable)closedReceiveChannelException;
  }
  
  private final void N(long paramLong) {
    boolean bool;
    if ((m.addAndGet(this, paramLong) & 0x4000000000000000L) != 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      do {
        if ((m.get(this) & 0x4000000000000000L) != 0L) {
          bool = true;
        } else {
          bool = false;
        } 
      } while (bool); 
  }
  
  private final void P() {
    AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater = r;
    while (true) {
      g0 g0;
      l l1 = (l)atomicReferenceFieldUpdater.get(this);
      if (l1 == null) {
        g0 = c.d();
      } else {
        g0 = c.e();
      } 
      if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, l1, g0)) {
        if (l1 == null)
          return; 
        l l2 = (l)e0.d(l1, 1);
        ((l)l1).invoke(H());
        return;
      } 
    } 
  }
  
  private final boolean Q(j<E> paramj, int paramInt, long paramLong) {
    while (true) {
      Object object = paramj.w(paramInt);
      boolean bool = false;
      if (object == null || object == c.k()) {
        if (paramj.r(paramInt, object, c.o())) {
          C();
          return false;
        } 
        continue;
      } 
      if (object == c.d)
        return true; 
      if (object == c.j())
        return false; 
      if (object == c.z())
        return false; 
      if (object == c.f())
        return false; 
      if (object == c.o())
        return false; 
      if (object == c.p())
        return true; 
      if (object == c.q())
        return false; 
      if (paramLong == J())
        bool = true; 
      return bool;
    } 
  }
  
  private final boolean R(long paramLong, boolean paramBoolean) {
    int i = (int)(paramLong >> 60L);
    if (i != 0 && i != 1) {
      if (i != 2) {
        if (i == 3) {
          y(paramLong & 0xFFFFFFFFFFFFFFFL);
          return true;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected close status: ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString().toString());
      } 
      z(paramLong & 0xFFFFFFFFFFFFFFFL);
      if (!paramBoolean || !M())
        return true; 
    } 
    return false;
  }
  
  private final boolean T(long paramLong) {
    return R(paramLong, true);
  }
  
  private final boolean U(long paramLong) {
    return R(paramLong, false);
  }
  
  private final boolean W() {
    long l1 = G();
    return (l1 == 0L || l1 == Long.MAX_VALUE);
  }
  
  private final long X(j<E> paramj) {
    while (true) {
      for (int i = c.b - 1; -1 < i; i--) {
        long l1 = paramj.i * c.b + i;
        if (l1 < J())
          return -1L; 
        while (true) {
          Object object = paramj.w(i);
          if (object == null || object == c.k()) {
            if (paramj.r(i, object, c.z())) {
              paramj.p();
              break;
            } 
            continue;
          } 
          if (object == c.d)
            return l1; 
          break;
        } 
      } 
      j<E> j1 = (j)paramj.g();
      paramj = j1;
      if (j1 == null)
        return -1L; 
    } 
  }
  
  private final void Y() {
    long l1;
    AtomicLongFieldUpdater<b> atomicLongFieldUpdater = j;
    do {
      l1 = atomicLongFieldUpdater.get(this);
    } while ((int)(l1 >> 60L) == 0 && !atomicLongFieldUpdater.compareAndSet(this, l1, c.b(0xFFFFFFFFFFFFFFFL & l1, 1)));
  }
  
  private final void Z() {
    long l1;
    AtomicLongFieldUpdater<b> atomicLongFieldUpdater = j;
    do {
      l1 = atomicLongFieldUpdater.get(this);
    } while (!atomicLongFieldUpdater.compareAndSet(this, l1, c.b(0xFFFFFFFFFFFFFFFL & l1, 3)));
  }
  
  private final void a0() {
    long l1;
    long l2;
    AtomicLongFieldUpdater<b> atomicLongFieldUpdater = j;
    do {
      l2 = atomicLongFieldUpdater.get(this);
      int i = (int)(l2 >> 60L);
      if (i != 0) {
        if (i != 1)
          return; 
        l1 = c.b(l2 & 0xFFFFFFFFFFFFFFFL, 3);
      } else {
        l1 = c.b(l2 & 0xFFFFFFFFFFFFFFFL, 2);
      } 
    } while (!atomicLongFieldUpdater.compareAndSet(this, l2, l1));
  }
  
  private final void b0(long paramLong, j<E> paramj) {
    j<E> j1;
    while (true) {
      j1 = paramj;
      if (paramj.i < paramLong) {
        j1 = (j<E>)paramj.e();
        if (j1 == null) {
          j1 = paramj;
          break;
        } 
        paramj = j1;
        continue;
      } 
      break;
    } 
    label35: while (true) {
      if (j1.h()) {
        paramj = (j<E>)j1.e();
        if (paramj != null) {
          j1 = paramj;
          continue;
        } 
      } 
      AtomicReferenceFieldUpdater<b, d0> atomicReferenceFieldUpdater = p;
      while (true) {
        boolean bool1;
        d0 d0 = atomicReferenceFieldUpdater.get(this);
        paramLong = d0.i;
        long l1 = j1.i;
        boolean bool2 = true;
        if (paramLong >= l1) {
          bool1 = bool2;
        } else if (!j1.q()) {
          bool1 = false;
        } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d0, j1)) {
          bool1 = bool2;
          if (d0.m()) {
            d0.k();
            bool1 = bool2;
          } 
        } else {
          if (j1.m())
            j1.k(); 
          continue;
        } 
        if (bool1)
          return; 
        continue label35;
      } 
      break;
    } 
  }
  
  private final Object d0(E paramE, d<? super q> paramd) {
    // Byte code:
    //   0: new b9/l
    //   3: dup
    //   4: aload_2
    //   5: invokestatic c : (Lj8/d;)Lj8/d;
    //   8: iconst_1
    //   9: invokespecial <init> : (Lj8/d;I)V
    //   12: astore_3
    //   13: aload_3
    //   14: invokevirtual A : ()V
    //   17: aload_0
    //   18: getfield h : Lq8/l;
    //   21: astore #4
    //   23: aload #4
    //   25: ifnull -> 71
    //   28: aload #4
    //   30: aload_1
    //   31: aconst_null
    //   32: iconst_2
    //   33: aconst_null
    //   34: invokestatic d : (Lq8/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;ILjava/lang/Object;)Lkotlinx/coroutines/internal/UndeliveredElementException;
    //   37: astore_1
    //   38: aload_1
    //   39: ifnull -> 71
    //   42: aload_1
    //   43: aload_0
    //   44: invokevirtual K : ()Ljava/lang/Throwable;
    //   47: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   50: getstatic e8/k.g : Le8/k$a;
    //   53: astore #4
    //   55: aload_3
    //   56: aload_1
    //   57: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   60: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: invokeinterface resumeWith : (Ljava/lang/Object;)V
    //   68: goto -> 94
    //   71: aload_0
    //   72: invokevirtual K : ()Ljava/lang/Throwable;
    //   75: astore_1
    //   76: getstatic e8/k.g : Le8/k$a;
    //   79: astore #4
    //   81: aload_3
    //   82: aload_1
    //   83: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   86: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: invokeinterface resumeWith : (Ljava/lang/Object;)V
    //   94: aload_3
    //   95: invokevirtual x : ()Ljava/lang/Object;
    //   98: astore_1
    //   99: aload_1
    //   100: invokestatic d : ()Ljava/lang/Object;
    //   103: if_acmpne -> 110
    //   106: aload_2
    //   107: invokestatic c : (Lj8/d;)V
    //   110: aload_1
    //   111: invokestatic d : ()Ljava/lang/Object;
    //   114: if_acmpne -> 119
    //   117: aload_1
    //   118: areturn
    //   119: getstatic e8/q.a : Le8/q;
    //   122: areturn
  }
  
  private final void e0(E paramE, k<? super q> paramk) {
    l<E, q> l1 = this.h;
    if (l1 != null)
      y.b(l1, paramE, paramk.getContext()); 
    Throwable throwable = K();
    k.a a = k.g;
    paramk.resumeWith(k.a(l.a(throwable)));
  }
  
  private final void h0(p2 paramp2, j<E> paramj, int paramInt) {
    g0();
    paramp2.b(paramj, paramInt);
  }
  
  private final void i0(p2 paramp2, j<E> paramj, int paramInt) {
    paramp2.b(paramj, paramInt + c.b);
  }
  
  private final void j0(j<E> paramj) {
    UndeliveredElementException undeliveredElementException;
    Object<E> object2;
    j<E> j3;
    l<E, q> l1 = this.h;
    j j2 = null;
    Object<E> object1 = (Object<E>)m.b(null, 1, null);
    j<E> j1 = paramj;
    do {
      int i = c.b - 1;
      object2 = object1;
      paramj = j2;
      while (-1 < i) {
        long l2 = j1.i * c.b + i;
        label55: while (true) {
          object1 = (Object<E>)j1.w(i);
          if (object1 != c.f()) {
            UndeliveredElementException undeliveredElementException2;
            if (object1 == c.d) {
              if (l2 >= J()) {
                if (j1.r(i, object1, c.z())) {
                  object1 = (Object<E>)paramj;
                  if (l1 != null)
                    undeliveredElementException2 = y.c(l1, j1.v(i), (UndeliveredElementException)paramj); 
                  j1.s(i);
                  j1.p();
                  undeliveredElementException = undeliveredElementException2;
                  break label55;
                } 
                continue;
              } 
              break;
            } 
            if (undeliveredElementException2 == c.k() || undeliveredElementException2 == null) {
              if (j1.r(i, undeliveredElementException2, c.z())) {
                j1.p();
                break label55;
              } 
              continue;
            } 
            if (undeliveredElementException2 instanceof p2 || undeliveredElementException2 instanceof t) {
              if (l2 >= J()) {
                p2 p2;
                if (undeliveredElementException2 instanceof t) {
                  p2 = ((t)undeliveredElementException2).a;
                } else {
                  p2 = (p2)undeliveredElementException2;
                } 
                if (j1.r(i, undeliveredElementException2, c.z())) {
                  undeliveredElementException2 = undeliveredElementException;
                  if (l1 != null)
                    undeliveredElementException2 = y.c(l1, j1.v(i), undeliveredElementException); 
                  object2 = (Object<E>)m.c(object2, p2);
                  j1.s(i);
                  j1.p();
                  undeliveredElementException = undeliveredElementException2;
                  break label55;
                } 
                continue;
              } 
              break;
            } 
            if (undeliveredElementException2 == c.p() || undeliveredElementException2 == c.q())
              break; 
            if (undeliveredElementException2 != c.p())
              i--; 
            continue;
          } 
          break;
        } 
      } 
      j3 = (j)j1.g();
      UndeliveredElementException undeliveredElementException1 = undeliveredElementException;
      object1 = object2;
      j1 = j3;
    } while (j3 != null);
    if (object2 != null)
      if (!(object2 instanceof ArrayList)) {
        l0((p2)object2);
      } else {
        m.h(object2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        object1 = object2;
        for (int i = object1.size() - 1; -1 < i; i--)
          l0((p2)object1.get(i)); 
      }  
    if (undeliveredElementException == null)
      return; 
    throw undeliveredElementException;
  }
  
  private final void k0(p2 paramp2) {
    m0(paramp2, true);
  }
  
  private final void l0(p2 paramp2) {
    m0(paramp2, false);
  }
  
  private final void m0(p2 paramp2, boolean paramBoolean) {
    k<Boolean> k;
    Throwable throwable;
    l l1;
    if (paramp2 instanceof b) {
      k = ((b)paramp2).a();
      k.a a = k.g;
      k.resumeWith(k.a(Boolean.FALSE));
      return;
    } 
    if (k instanceof k) {
      d d1 = (d)k;
      k.a a = k.g;
      if (paramBoolean) {
        throwable = I();
      } else {
        throwable = K();
      } 
      d1.resumeWith(k.a(l.a(throwable)));
      return;
    } 
    if (throwable instanceof q) {
      l1 = ((q)throwable).g;
      k.a a = k.g;
      l1.resumeWith(k.a(h.b(h.b.a(H()))));
      return;
    } 
    if (l1 instanceof a) {
      ((a)l1).j();
      return;
    } 
    if (l1 instanceof j9.b) {
      ((j9.b)l1).a(this, c.z());
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected waiter: ");
    stringBuilder.append(l1);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  private final Object o0(j<E> paramj, int paramInt, E paramE, long paramLong, d<? super q> paramd) {
    // Byte code:
    //   0: aload #6
    //   2: invokestatic c : (Lj8/d;)Lj8/d;
    //   5: invokestatic b : (Lj8/d;)Lb9/l;
    //   8: astore #11
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: aload_3
    //   14: lload #4
    //   16: aload #11
    //   18: iconst_0
    //   19: invokestatic s : (Ld9/b;Ld9/j;ILjava/lang/Object;JLjava/lang/Object;Z)I
    //   22: istore #7
    //   24: iload #7
    //   26: ifeq -> 377
    //   29: iload #7
    //   31: iconst_1
    //   32: if_icmpeq -> 363
    //   35: iload #7
    //   37: iconst_2
    //   38: if_icmpeq -> 352
    //   41: iload #7
    //   43: iconst_4
    //   44: if_icmpeq -> 335
    //   47: iload #7
    //   49: iconst_5
    //   50: if_icmpne -> 321
    //   53: aload_1
    //   54: invokevirtual b : ()V
    //   57: invokestatic l : ()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   60: aload_0
    //   61: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: checkcast d9/j
    //   67: astore_1
    //   68: invokestatic m : ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   71: aload_0
    //   72: invokevirtual getAndIncrement : (Ljava/lang/Object;)J
    //   75: lstore #8
    //   77: lload #8
    //   79: ldc2_w 1152921504606846975
    //   82: land
    //   83: lstore #4
    //   85: aload_0
    //   86: lload #8
    //   88: invokestatic n : (Ld9/b;J)Z
    //   91: istore #10
    //   93: getstatic d9/c.b : I
    //   96: istore_2
    //   97: lload #4
    //   99: iload_2
    //   100: i2l
    //   101: ldiv
    //   102: lstore #8
    //   104: lload #4
    //   106: iload_2
    //   107: i2l
    //   108: lrem
    //   109: l2i
    //   110: istore_2
    //   111: aload_1
    //   112: getfield i : J
    //   115: lload #8
    //   117: lcmp
    //   118: ifeq -> 440
    //   121: aload_0
    //   122: lload #8
    //   124: aload_1
    //   125: invokestatic c : (Ld9/b;JLd9/j;)Ld9/j;
    //   128: astore #12
    //   130: aload #12
    //   132: ifnonnull -> 434
    //   135: iload #10
    //   137: ifeq -> 68
    //   140: aload_0
    //   141: aload_3
    //   142: aload #11
    //   144: invokestatic o : (Ld9/b;Ljava/lang/Object;Lb9/k;)V
    //   147: goto -> 395
    //   150: aload_0
    //   151: aload_1
    //   152: iload_2
    //   153: aload_3
    //   154: lload #4
    //   156: aload #11
    //   158: iload #10
    //   160: invokestatic s : (Ld9/b;Ld9/j;ILjava/lang/Object;JLjava/lang/Object;Z)I
    //   163: istore #7
    //   165: iload #7
    //   167: ifeq -> 303
    //   170: iload #7
    //   172: iconst_1
    //   173: if_icmpeq -> 281
    //   176: iload #7
    //   178: iconst_2
    //   179: if_icmpeq -> 241
    //   182: iload #7
    //   184: iconst_3
    //   185: if_icmpeq -> 227
    //   188: iload #7
    //   190: iconst_4
    //   191: if_icmpeq -> 210
    //   194: iload #7
    //   196: iconst_5
    //   197: if_icmpeq -> 203
    //   200: goto -> 443
    //   203: aload_1
    //   204: invokevirtual b : ()V
    //   207: goto -> 443
    //   210: lload #4
    //   212: aload_0
    //   213: invokevirtual J : ()J
    //   216: lcmp
    //   217: ifge -> 140
    //   220: aload_1
    //   221: invokevirtual b : ()V
    //   224: goto -> 140
    //   227: new java/lang/IllegalStateException
    //   230: dup
    //   231: ldc_w 'unexpected'
    //   234: invokevirtual toString : ()Ljava/lang/String;
    //   237: invokespecial <init> : (Ljava/lang/String;)V
    //   240: athrow
    //   241: iload #10
    //   243: ifeq -> 253
    //   246: aload_1
    //   247: invokevirtual p : ()V
    //   250: goto -> 140
    //   253: aload #11
    //   255: instanceof b9/p2
    //   258: ifeq -> 446
    //   261: aload #11
    //   263: astore_3
    //   264: goto -> 267
    //   267: aload_3
    //   268: ifnull -> 395
    //   271: aload_0
    //   272: aload_3
    //   273: aload_1
    //   274: iload_2
    //   275: invokestatic q : (Ld9/b;Lb9/p2;Ld9/j;I)V
    //   278: goto -> 395
    //   281: getstatic e8/k.g : Le8/k$a;
    //   284: astore_1
    //   285: getstatic e8/q.a : Le8/q;
    //   288: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   291: astore_1
    //   292: aload #11
    //   294: aload_1
    //   295: invokeinterface resumeWith : (Ljava/lang/Object;)V
    //   300: goto -> 395
    //   303: aload_1
    //   304: invokevirtual b : ()V
    //   307: getstatic e8/k.g : Le8/k$a;
    //   310: astore_1
    //   311: getstatic e8/q.a : Le8/q;
    //   314: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   317: astore_1
    //   318: goto -> 292
    //   321: new java/lang/IllegalStateException
    //   324: dup
    //   325: ldc_w 'unexpected'
    //   328: invokevirtual toString : ()Ljava/lang/String;
    //   331: invokespecial <init> : (Ljava/lang/String;)V
    //   334: athrow
    //   335: lload #4
    //   337: aload_0
    //   338: invokevirtual J : ()J
    //   341: lcmp
    //   342: ifge -> 140
    //   345: aload_1
    //   346: invokevirtual b : ()V
    //   349: goto -> 140
    //   352: aload_0
    //   353: aload #11
    //   355: aload_1
    //   356: iload_2
    //   357: invokestatic q : (Ld9/b;Lb9/p2;Ld9/j;I)V
    //   360: goto -> 395
    //   363: getstatic e8/k.g : Le8/k$a;
    //   366: astore_1
    //   367: getstatic e8/q.a : Le8/q;
    //   370: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   373: astore_1
    //   374: goto -> 292
    //   377: aload_1
    //   378: invokevirtual b : ()V
    //   381: getstatic e8/k.g : Le8/k$a;
    //   384: astore_1
    //   385: getstatic e8/q.a : Le8/q;
    //   388: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   391: astore_1
    //   392: goto -> 292
    //   395: aload #11
    //   397: invokevirtual x : ()Ljava/lang/Object;
    //   400: astore_1
    //   401: aload_1
    //   402: invokestatic d : ()Ljava/lang/Object;
    //   405: if_acmpne -> 413
    //   408: aload #6
    //   410: invokestatic c : (Lj8/d;)V
    //   413: aload_1
    //   414: invokestatic d : ()Ljava/lang/Object;
    //   417: if_acmpne -> 422
    //   420: aload_1
    //   421: areturn
    //   422: getstatic e8/q.a : Le8/q;
    //   425: areturn
    //   426: astore_1
    //   427: aload #11
    //   429: invokevirtual J : ()V
    //   432: aload_1
    //   433: athrow
    //   434: aload #12
    //   436: astore_1
    //   437: goto -> 150
    //   440: goto -> 150
    //   443: goto -> 68
    //   446: aconst_null
    //   447: astore_3
    //   448: goto -> 267
    // Exception table:
    //   from	to	target	type
    //   10	24	426	finally
    //   53	68	426	finally
    //   68	77	426	finally
    //   85	104	426	finally
    //   111	130	426	finally
    //   140	147	426	finally
    //   150	165	426	finally
    //   203	207	426	finally
    //   210	224	426	finally
    //   227	241	426	finally
    //   246	250	426	finally
    //   253	261	426	finally
    //   271	278	426	finally
    //   281	292	426	finally
    //   292	300	426	finally
    //   303	318	426	finally
    //   321	335	426	finally
    //   335	349	426	finally
    //   352	360	426	finally
    //   363	374	426	finally
    //   377	392	426	finally
  }
  
  private final boolean p0(long paramLong) {
    return U(paramLong) ? false : (t(paramLong & 0xFFFFFFFFFFFFFFFL) ^ true);
  }
  
  private final boolean q0(Object paramObject, E paramE) {
    if (paramObject instanceof j9.b)
      return ((j9.b)paramObject).a(this, paramE); 
    boolean bool = paramObject instanceof q;
    l l1 = null;
    k k = null;
    if (bool) {
      m.h(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
      q q1 = (q)paramObject;
      l1 = q1.g;
      h h = h.b(h.b.c(paramE));
      l<E, q> l2 = this.h;
      paramObject = k;
      if (l2 != null)
        paramObject = y.a(l2, paramE, q1.g.getContext()); 
      return c.u((k)l1, h, (l)paramObject);
    } 
    if (paramObject instanceof a) {
      m.h(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
      return ((a)paramObject).i(paramE);
    } 
    if (paramObject instanceof k) {
      m.h(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
      k = (k)paramObject;
      l<E, q> l2 = this.h;
      paramObject = l1;
      if (l2 != null)
        paramObject = y.a(l2, paramE, k.getContext()); 
      return c.u(k, paramE, (l)paramObject);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected receiver type: ");
    stringBuilder.append(paramObject);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  private final boolean r0(Object paramObject, j<E> paramj, int paramInt) {
    if (paramObject instanceof k) {
      m.h(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
      return c.C((k)paramObject, q.a, null, 2, null);
    } 
    if (paramObject instanceof j9.b) {
      m.h(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
      paramObject = ((j9.a)paramObject).f(this, q.a);
      if (paramObject == d.REREGISTER)
        paramj.s(paramInt); 
      return (paramObject == d.SUCCESSFUL);
    } 
    if (paramObject instanceof b)
      return c.C(((b)paramObject).a(), Boolean.TRUE, null, 2, null); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected waiter: ");
    stringBuilder.append(paramObject);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  private final boolean s0(j<E> paramj, int paramInt, long paramLong) {
    Object object = paramj.w(paramInt);
    if (object instanceof p2 && paramLong >= k.get(this) && paramj.r(paramInt, object, c.p())) {
      if (r0(object, paramj, paramInt)) {
        paramj.A(paramInt, c.d);
        return true;
      } 
      paramj.A(paramInt, c.j());
      paramj.x(paramInt, false);
      return false;
    } 
    return t0(paramj, paramInt, paramLong);
  }
  
  private final boolean t(long paramLong) {
    return (paramLong < G() || paramLong < J() + this.g);
  }
  
  private final boolean t0(j<E> paramj, int paramInt, long paramLong) {
    while (true) {
      Object object = paramj.w(paramInt);
      if (object instanceof p2) {
        if (paramLong < k.get(this)) {
          if (paramj.r(paramInt, object, new t((p2)object)))
            return true; 
          continue;
        } 
        if (paramj.r(paramInt, object, c.p())) {
          if (r0(object, paramj, paramInt)) {
            paramj.A(paramInt, c.d);
            return true;
          } 
          paramj.A(paramInt, c.j());
          paramj.x(paramInt, false);
          return false;
        } 
        continue;
      } 
      if (object == c.j())
        return false; 
      if (object == null) {
        if (paramj.r(paramInt, object, c.k()))
          return true; 
        continue;
      } 
      if (object == c.d)
        return true; 
      if (object != c.o() && object != c.f()) {
        if (object == c.i())
          return true; 
        if (object == c.z())
          return true; 
        if (object == c.q())
          continue; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected cell state: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
      } 
      break;
    } 
    return true;
  }
  
  private final Object u0(j<E> paramj, int paramInt, long paramLong, Object paramObject) {
    Object object = paramj.w(paramInt);
    if (object == null) {
      if (paramLong >= (j.get(this) & 0xFFFFFFFFFFFFFFFL)) {
        if (paramObject == null)
          return c.s(); 
        if (paramj.r(paramInt, object, paramObject)) {
          C();
          return c.r();
        } 
      } 
    } else if (object == c.d && paramj.r(paramInt, object, c.f())) {
      C();
      return paramj.y(paramInt);
    } 
    return v0(paramj, paramInt, paramLong, paramObject);
  }
  
  private final void v(j<E> paramj, long paramLong) {
    Object object2 = m.b(null, 1, null);
    j<E> j1 = paramj;
    Object object1 = object2;
    label40: while (true) {
      object2 = object1;
      if (j1 != null) {
        int i = c.b - 1;
        while (-1 < i) {
          object2 = object1;
          if (j1.i * c.b + i >= paramLong) {
            while (true) {
              Object object = j1.w(i);
              if (object == null || object == c.k()) {
                if (j1.r(i, object, c.z())) {
                  j1.p();
                  object2 = object1;
                  break;
                } 
                continue;
              } 
              if (object instanceof t) {
                if (j1.r(i, object, c.z())) {
                  object2 = m.c(object1, ((t)object).a);
                  j1.x(i, true);
                  break;
                } 
                continue;
              } 
              object2 = object1;
              if (object instanceof p2) {
                if (j1.r(i, object, c.z())) {
                  object2 = m.c(object1, object);
                  j1.x(i, true);
                  break;
                } 
                continue;
              } 
              break;
            } 
            i--;
            object1 = object2;
            continue;
          } 
          break label40;
        } 
        j1 = (j<E>)j1.g();
        continue;
      } 
      break;
    } 
    if (object2 != null) {
      if (!(object2 instanceof ArrayList)) {
        k0((p2)object2);
        return;
      } 
      m.h(object2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
      object1 = object2;
      int i;
      for (i = object1.size() - 1; -1 < i; i--)
        k0(object1.get(i)); 
    } 
  }
  
  private final Object v0(j<E> paramj, int paramInt, long paramLong, Object paramObject) {
    while (true) {
      Object object = paramj.w(paramInt);
      if (object == null || object == c.k()) {
        if (paramLong < (j.get(this) & 0xFFFFFFFFFFFFFFFL)) {
          if (paramj.r(paramInt, object, c.o())) {
            C();
            return c.h();
          } 
          continue;
        } 
        if (paramObject == null)
          return c.s(); 
        if (paramj.r(paramInt, object, paramObject)) {
          C();
          return c.r();
        } 
        continue;
      } 
      if (object == c.d) {
        if (paramj.r(paramInt, object, c.f())) {
          C();
          return paramj.y(paramInt);
        } 
        continue;
      } 
      if (object == c.j())
        return c.h(); 
      if (object == c.o())
        return c.h(); 
      if (object == c.z()) {
        C();
        return c.h();
      } 
      if (object != c.p() && paramj.r(paramInt, object, c.q())) {
        boolean bool = object instanceof t;
        paramObject = object;
        if (bool)
          paramObject = ((t)object).a; 
        if (r0(paramObject, paramj, paramInt)) {
          paramj.A(paramInt, c.f());
          C();
          return paramj.y(paramInt);
        } 
        paramj.A(paramInt, c.j());
        paramj.x(paramInt, false);
        if (bool)
          C(); 
        return c.h();
      } 
    } 
  }
  
  private final j<E> w() {
    j j2 = (j)p.get(this);
    j j3 = n.get(this);
    j j1 = j2;
    if (j3.i > j2.i)
      j1 = j3; 
    j3 = o.get(this);
    j2 = j1;
    if (j3.i > j1.i)
      j2 = j3; 
    return (j<E>)d.b((e)j2);
  }
  
  private final int w0(j<E> paramj, int paramInt, E paramE, long paramLong, Object paramObject, boolean paramBoolean) {
    paramj.B(paramInt, paramE);
    if (paramBoolean)
      return x0(paramj, paramInt, paramE, paramLong, paramObject, paramBoolean); 
    Object object = paramj.w(paramInt);
    if (object == null) {
      if (t(paramLong)) {
        if (paramj.r(paramInt, null, c.d))
          return 1; 
      } else {
        if (paramObject == null)
          return 3; 
        if (paramj.r(paramInt, null, paramObject))
          return 2; 
      } 
    } else if (object instanceof p2) {
      paramj.s(paramInt);
      if (q0(object, paramE)) {
        paramj.A(paramInt, c.f());
        f0();
        return 0;
      } 
      if (paramj.t(paramInt, c.i()) != c.i())
        paramj.x(paramInt, true); 
      return 5;
    } 
    return x0(paramj, paramInt, paramE, paramLong, paramObject, paramBoolean);
  }
  
  private final int x0(j<E> paramj, int paramInt, E paramE, long paramLong, Object paramObject, boolean paramBoolean) {
    while (true) {
      Object object = paramj.w(paramInt);
      if (object == null) {
        if (t(paramLong) && !paramBoolean) {
          if (paramj.r(paramInt, null, c.d))
            return 1; 
          continue;
        } 
        if (paramBoolean) {
          if (paramj.r(paramInt, null, c.j())) {
            paramj.x(paramInt, false);
            return 4;
          } 
          continue;
        } 
        if (paramObject == null)
          return 3; 
        if (paramj.r(paramInt, null, paramObject))
          return 2; 
        continue;
      } 
      if (object == c.k()) {
        if (paramj.r(paramInt, object, c.d))
          return 1; 
        continue;
      } 
      if (object == c.i()) {
        paramj.s(paramInt);
        return 5;
      } 
      if (object == c.o()) {
        paramj.s(paramInt);
        return 5;
      } 
      if (object == c.z()) {
        paramj.s(paramInt);
        A();
        return 4;
      } 
      paramj.s(paramInt);
      paramObject = object;
      if (object instanceof t)
        paramObject = ((t)object).a; 
      if (q0(paramObject, paramE)) {
        paramj.A(paramInt, c.f());
        f0();
        return 0;
      } 
      if (paramj.t(paramInt, c.i()) != c.i())
        paramj.x(paramInt, true); 
      return 5;
    } 
  }
  
  private final void y(long paramLong) {
    j0(z(paramLong));
  }
  
  private final void y0(long paramLong) {
    long l1;
    AtomicLongFieldUpdater<b> atomicLongFieldUpdater = k;
    do {
      l1 = atomicLongFieldUpdater.get(this);
      if (l1 >= paramLong)
        return; 
    } while (!k.compareAndSet(this, l1, paramLong));
  }
  
  private final j<E> z(long paramLong) {
    j<E> j = w();
    if (V()) {
      long l1 = X(j);
      if (l1 != -1L)
        B(l1); 
    } 
    v(j, paramLong);
    return j;
  }
  
  private final void z0(long paramLong) {
    long l1;
    long l2;
    AtomicLongFieldUpdater<b> atomicLongFieldUpdater = j;
    do {
      l1 = atomicLongFieldUpdater.get(this);
      l2 = 0xFFFFFFFFFFFFFFFL & l1;
      if (l2 >= paramLong)
        return; 
      l2 = c.b(l2, (int)(l1 >> 60L));
    } while (!j.compareAndSet(this, l1, l2));
  }
  
  public final void A0(long paramLong) {
    if (W())
      return; 
    do {
    
    } while (G() <= paramLong);
    int j = c.g();
    int i;
    for (i = 0; i < j; i++) {
      paramLong = G();
      if (paramLong == (m.get(this) & 0x3FFFFFFFFFFFFFFFL) && paramLong == G())
        return; 
    } 
    AtomicLongFieldUpdater<b> atomicLongFieldUpdater = m;
    do {
      paramLong = atomicLongFieldUpdater.get(this);
    } while (!atomicLongFieldUpdater.compareAndSet(this, paramLong, c.a(paramLong & 0x3FFFFFFFFFFFFFFFL, true)));
    while (true) {
      paramLong = G();
      atomicLongFieldUpdater = m;
      long l1 = atomicLongFieldUpdater.get(this);
      long l2 = l1 & 0x3FFFFFFFFFFFFFFFL;
      if ((0x4000000000000000L & l1) != 0L) {
        i = 1;
      } else {
        i = 0;
      } 
      if (paramLong == l2 && paramLong == G()) {
        do {
          paramLong = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, paramLong, c.a(paramLong & 0x3FFFFFFFFFFFFFFFL, false)));
        return;
      } 
      if (i == 0)
        atomicLongFieldUpdater.compareAndSet(this, l1, c.a(l2, true)); 
    } 
  }
  
  protected final void B(long paramLong) {
    j<E> j = o.get(this);
    while (true) {
      AtomicLongFieldUpdater<b> atomicLongFieldUpdater = k;
      long l1 = atomicLongFieldUpdater.get(this);
      if (paramLong < Math.max(this.g + l1, G()))
        return; 
      if (atomicLongFieldUpdater.compareAndSet(this, l1, l1 + 1L)) {
        int i = c.b;
        long l2 = l1 / i;
        i = (int)(l1 % i);
        j<E> j1 = j;
        if (j.i != l2) {
          j1 = E(l2, j);
          if (j1 == null)
            continue; 
        } 
        Object object = u0(j1, i, l1, null);
        if (object == c.h()) {
          j = j1;
          if (l1 < L()) {
            j1.b();
            j = j1;
          } 
          continue;
        } 
        j1.b();
        l<E, q> l3 = this.h;
        j = j1;
        if (l3 != null) {
          j<E> j2;
          UndeliveredElementException undeliveredElementException = y.d(l3, object, null, 2, null);
          if (undeliveredElementException == null) {
            j2 = j1;
            continue;
          } 
          throw j2;
        } 
      } 
    } 
  }
  
  protected final Throwable H() {
    return q.get(this);
  }
  
  public final long J() {
    return k.get(this);
  }
  
  protected final Throwable K() {
    ClosedSendChannelException closedSendChannelException;
    Throwable throwable2 = H();
    Throwable throwable1 = throwable2;
    if (throwable2 == null)
      closedSendChannelException = new ClosedSendChannelException("Channel was closed"); 
    return (Throwable)closedSendChannelException;
  }
  
  public final long L() {
    return j.get(this) & 0xFFFFFFFFFFFFFFFL;
  }
  
  public final boolean M() {
    while (true) {
      AtomicReferenceFieldUpdater<b, j> atomicReferenceFieldUpdater = o;
      j<E> j2 = atomicReferenceFieldUpdater.get(this);
      long l1 = J();
      if (L() <= l1)
        return false; 
      int i = c.b;
      long l2 = l1 / i;
      j<E> j1 = j2;
      if (j2.i != l2) {
        j2 = E(l2, j2);
        j1 = j2;
        if (j2 == null) {
          if (((j)atomicReferenceFieldUpdater.get((T)this)).i < l2)
            return false; 
          continue;
        } 
      } 
      j1.b();
      if (Q(j1, (int)(l1 % i), l1))
        return true; 
      k.compareAndSet(this, l1, l1 + 1L);
    } 
  }
  
  public boolean S() {
    return T(j.get(this));
  }
  
  protected boolean V() {
    return false;
  }
  
  public Object b(E paramE, d<? super q> paramd) {
    return n0(this, paramE, paramd);
  }
  
  protected void c0() {}
  
  public final void d(CancellationException paramCancellationException) {
    u(paramCancellationException);
  }
  
  public void f(l<? super Throwable, q> paraml) {
    AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater = r;
    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, paraml))
      return; 
    while (true) {
      g0 g0 = (g0)atomicReferenceFieldUpdater.get(this);
      if (g0 == c.d()) {
        if (androidx.concurrent.futures.b.a(r, this, c.d(), c.e())) {
          paraml.invoke(H());
          return;
        } 
        continue;
      } 
      if (g0 == c.e())
        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString()); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Another handler is already registered: ");
      stringBuilder.append(g0);
      throw new IllegalStateException(stringBuilder.toString().toString());
    } 
  }
  
  protected void f0() {}
  
  public boolean g(Throwable paramThrowable) {
    return x(paramThrowable, false);
  }
  
  protected void g0() {}
  
  public Object h(E paramE) {
    if (p0(j.get(this)))
      return h.b.b(); 
    g0 g0 = c.j();
    j j = l().get(this);
    while (true) {
      long l2 = m().getAndIncrement(this);
      long l1 = l2 & 0xFFFFFFFFFFFFFFFL;
      boolean bool = n(this, l2);
      int i = c.b;
      l2 = l1 / i;
      i = (int)(l1 % i);
      if (j.i != l2) {
        j j1 = c(this, l2, j);
        if (j1 == null) {
          if (bool)
            return h.b.a(K()); 
          continue;
        } 
        j = j1;
      } 
      int k = s(this, j, i, paramE, l1, g0, bool);
      if (k != 0) {
        if (k != 1) {
          if (k != 2) {
            if (k != 3) {
              if (k != 4) {
                if (k != 5)
                  continue; 
                j.b();
                continue;
              } 
              if (l1 < J())
                j.b(); 
            } else {
              throw new IllegalStateException("unexpected".toString());
            } 
          } else {
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
              q(this, (p2)paramE, j, i); 
            j.p();
            return h.b.b();
          } 
          return h.b.a(K());
        } 
        break;
      } 
      j.b();
      break;
    } 
    return h.b.c(q.a);
  }
  
  public boolean i() {
    return U(j.get(this));
  }
  
  public f<E> iterator() {
    return new a(this);
  }
  
  public String toString() {
    StringBuilder stringBuilder2 = new StringBuilder();
    int i = (int)(j.get(this) >> 60L);
    if (i != 2) {
      if (i == 3)
        stringBuilder2.append("cancelled,"); 
    } else {
      stringBuilder2.append("closed,");
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("capacity=");
    stringBuilder1.append(this.g);
    stringBuilder1.append(',');
    stringBuilder2.append(stringBuilder1.toString());
    stringBuilder2.append("data=[");
    List list = o.l((Object[])new j[] { o.get(this), n.get(this), p.get(this) });
    ArrayList<j> arrayList = new ArrayList();
    for (j j : list) {
      if ((j)j != c.n()) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0)
        arrayList.add(j); 
    } 
    Iterator<j> iterator = arrayList.iterator();
    if (iterator.hasNext()) {
      List list1;
      list = (List)iterator.next();
      if (!iterator.hasNext()) {
        list1 = list;
      } else {
        long l3 = ((j)list).i;
        do {
          List list2 = (List)iterator.next();
          long l5 = ((j)list2).i;
          list1 = list;
          long l4 = l3;
          if (l3 > l5) {
            list1 = list2;
            l4 = l5;
          } 
          list = list1;
          l3 = l4;
        } while (iterator.hasNext());
      } 
      j<Object> j = (j)list1;
      long l1 = J();
      long l2 = L();
      do {
        int k = c.b;
        for (i = 0; i < k; i++) {
          long l3 = j.i * c.b + i;
          int m = l3 cmp l2;
          if (m < 0 || l3 < l1) {
            Object object = j.w(i);
            StringBuilder stringBuilder = (StringBuilder)j.v(i);
            if (object instanceof k) {
              int n = l3 cmp l1;
              if (n < 0 && m >= 0) {
                object = "receive";
              } else if (m < 0 && n >= 0) {
                object = "send";
              } else {
                object = "cont";
              } 
            } else if (object instanceof j9.b) {
              int n = l3 cmp l1;
              if (n < 0 && m >= 0) {
                object = "onReceive";
              } else if (m < 0 && n >= 0) {
                object = "onSend";
              } else {
                object = "select";
              } 
            } else if (object instanceof q) {
              object = "receiveCatching";
            } else if (object instanceof b) {
              object = "sendBroadcast";
            } else if (object instanceof t) {
              StringBuilder stringBuilder3 = new StringBuilder();
              stringBuilder3.append("EB(");
              stringBuilder3.append(object);
              stringBuilder3.append(')');
              object = stringBuilder3.toString();
            } else {
              boolean bool;
              if (m.e(object, c.q())) {
                bool = true;
              } else {
                bool = m.e(object, c.p());
              } 
              if (bool) {
                object = "resuming_sender";
              } else {
                if (object == null) {
                  bool = true;
                } else {
                  bool = m.e(object, c.k());
                } 
                if (bool) {
                  bool = true;
                } else {
                  bool = m.e(object, c.f());
                } 
                if (bool) {
                  bool = true;
                } else {
                  bool = m.e(object, c.o());
                } 
                if (bool) {
                  bool = true;
                } else {
                  bool = m.e(object, c.i());
                } 
                if (bool) {
                  bool = true;
                } else {
                  bool = m.e(object, c.j());
                } 
                if (bool) {
                  bool = true;
                } else {
                  bool = m.e(object, c.z());
                } 
                if (!bool) {
                  object = object.toString();
                } else {
                  continue;
                } 
              } 
            } 
            if (stringBuilder != null) {
              StringBuilder stringBuilder3 = new StringBuilder();
              stringBuilder3.append('(');
              stringBuilder3.append((String)object);
              stringBuilder3.append(',');
              stringBuilder3.append(stringBuilder);
              stringBuilder3.append("),");
              stringBuilder2.append(stringBuilder3.toString());
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append((String)object);
              stringBuilder.append(',');
              stringBuilder2.append(stringBuilder.toString());
            } 
            continue;
          } 
        } 
        j = (j<Object>)j.e();
      } while (j != null);
      if (m.U0(stringBuilder2) == ',')
        m.i(stringBuilder2.deleteCharAt(stringBuilder2.length() - 1), "this.deleteCharAt(index)"); 
      stringBuilder2.append("]");
      return stringBuilder2.toString();
    } 
    throw new NoSuchElementException();
  }
  
  public boolean u(Throwable paramThrowable) {
    Throwable throwable = paramThrowable;
    if (paramThrowable == null)
      throwable = new CancellationException("Channel was cancelled"); 
    return x(throwable, true);
  }
  
  protected boolean x(Throwable paramThrowable, boolean paramBoolean) {
    if (paramBoolean)
      Y(); 
    boolean bool = androidx.concurrent.futures.b.a(q, this, c.l(), paramThrowable);
    if (paramBoolean) {
      Z();
    } else {
      a0();
    } 
    A();
    c0();
    if (bool)
      P(); 
    return bool;
  }
  
  private final class a implements f<E>, p2 {
    private Object g = c.m();
    
    private l<? super Boolean> h;
    
    public a(b<E> this$0) {}
    
    private final Object f(j<E> param1j, int param1Int, long param1Long, d<? super Boolean> param1d) {
      b<E> b1 = this.i;
      l l1 = n.b(k8.b.c(param1d));
      try {
        d(this, l1);
        Object object2 = b.r(b1, param1j, param1Int, param1Long, this);
        if (object2 == c.r()) {
          b.p(b1, this, param1j, param1Int);
        } else {
          l l2;
          l<E, q> l3;
          g0 g0 = c.h();
          j j1 = null;
          if (object2 == g0) {
            if (param1Long < b1.L())
              param1j.b(); 
            param1j = b.j().get(b1);
            while (true) {
              Boolean bool;
              if (b1.S()) {
                c(this);
                break;
              } 
              param1Long = b.k().getAndIncrement(b1);
              param1Int = c.b;
              long l4 = param1Long / param1Int;
              param1Int = (int)(param1Long % param1Int);
              j<E> j2 = param1j;
              if (param1j.i != l4) {
                j2 = b.a(b1, l4, param1j);
                if (j2 == null)
                  continue; 
              } 
              object2 = b.r(b1, j2, param1Int, param1Long, this);
              if (object2 == c.r()) {
                b.p(b1, this, j2, param1Int);
                break;
              } 
              if (object2 == c.h()) {
                param1j = j2;
                if (param1Long < b1.L()) {
                  j2.b();
                  param1j = j2;
                } 
                continue;
              } 
              if (object2 != c.s()) {
                j2.b();
                e(this, object2);
                d(this, null);
                Boolean bool1 = kotlin.coroutines.jvm.internal.b.a(true);
                l3 = b1.h;
                param1j = j1;
                bool = bool1;
                if (l3 != null) {
                  l2 = y.a(l3, object2, l1.getContext());
                  bool = bool1;
                } 
              } else {
                throw new IllegalStateException("unexpected".toString());
              } 
              l1.a(bool, l2);
            } 
          } else {
            l l4;
            l2.b();
            e(this, object2);
            d(this, null);
            Boolean bool2 = kotlin.coroutines.jvm.internal.b.a(true);
            l3 = ((b)l3).h;
            j j2 = j1;
            Boolean bool1 = bool2;
            if (l3 != null) {
              l4 = y.a(l3, object2, l1.getContext());
              bool1 = bool2;
            } 
            l1.a(bool1, l4);
          } 
        } 
        Object object1 = l1.x();
        return object1;
      } finally {
        l1.J();
      } 
    }
    
    private final boolean g() {
      this.g = c.z();
      Throwable throwable = this.i.H();
      if (throwable == null)
        return false; 
      throw f0.a(throwable);
    }
    
    private final void h() {
      k.a a1;
      l<? super Boolean> l1 = this.h;
      m.g(l1);
      this.h = null;
      this.g = c.z();
      Throwable throwable = this.i.H();
      if (throwable == null) {
        a1 = k.g;
        l1.resumeWith(k.a(Boolean.FALSE));
        return;
      } 
      k.a a2 = k.g;
      l1.resumeWith(k.a(l.a((Throwable)a1)));
    }
    
    public Object a(d<? super Boolean> param1d) {
      b<E> b1 = this.i;
      j<E> j = b.j().get(b1);
      while (true) {
        if (b1.S())
          return kotlin.coroutines.jvm.internal.b.a(g()); 
        long l1 = b.k().getAndIncrement(b1);
        int i = c.b;
        long l2 = l1 / i;
        i = (int)(l1 % i);
        if (j.i != l2) {
          j<E> j1 = b.a(b1, l2, j);
          if (j1 == null)
            continue; 
          j = j1;
        } 
        Object object = b.r(b1, j, i, l1, null);
        if (object != c.r()) {
          if (object == c.h()) {
            if (l1 < b1.L())
              j.b(); 
            continue;
          } 
          if (object == c.s())
            return f(j, i, l1, param1d); 
          j.b();
          this.g = object;
          return kotlin.coroutines.jvm.internal.b.a(true);
        } 
        throw new IllegalStateException("unreachable".toString());
      } 
    }
    
    public void b(d0<?> param1d0, int param1Int) {
      l<? super Boolean> l1 = this.h;
      if (l1 != null)
        l1.b(param1d0, param1Int); 
    }
    
    public final boolean i(E param1E) {
      l<? super Boolean> l2 = this.h;
      m.g(l2);
      l l1 = null;
      this.h = null;
      this.g = param1E;
      Boolean bool = Boolean.TRUE;
      l<E, q> l3 = this.i.h;
      if (l3 != null)
        l1 = y.a(l3, param1E, l2.getContext()); 
      return c.u((k)l2, bool, l1);
    }
    
    public final void j() {
      k.a a1;
      l<? super Boolean> l1 = this.h;
      m.g(l1);
      this.h = null;
      this.g = c.z();
      Throwable throwable = this.i.H();
      if (throwable == null) {
        a1 = k.g;
        l1.resumeWith(k.a(Boolean.FALSE));
        return;
      } 
      k.a a2 = k.g;
      l1.resumeWith(k.a(l.a((Throwable)a1)));
    }
    
    public E next() {
      boolean bool;
      Object object = this.g;
      if (object != c.m()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        this.g = c.m();
        if (object != c.z())
          return (E)object; 
        throw f0.a(b.e(this.i));
      } 
      throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
  }
  
  private static final class b implements p2 {
    private final k<Boolean> g;
    
    public final k<Boolean> a() {
      return this.g;
    }
    
    public void b(d0<?> param1d0, int param1Int) {
      this.h.b(param1d0, param1Int);
    }
  }
  
  static final class c extends n implements q<j9.b<?>, Object, Object, l<? super Throwable, ? extends q>> {
    c(b<E> param1b) {
      super(3);
    }
    
    public final l<Throwable, q> a(j9.b<?> param1b, Object param1Object1, Object param1Object2) {
      return new a(param1Object2, this.g, param1b);
    }
    
    static final class a extends n implements l<Throwable, q> {
      a(Object param2Object, b<E> param2b, j9.b<?> param2b1) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        if (this.g != c.z())
          y.b(this.h.h, this.g, this.i.getContext()); 
      }
    }
  }
  
  static final class a extends n implements l<Throwable, q> {
    a(Object param1Object, b<E> param1b, j9.b<?> param1b1) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      if (this.g != c.z())
        y.b(this.h.h, this.g, this.i.getContext()); 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */