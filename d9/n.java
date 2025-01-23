package d9;

import b9.a0;
import b9.e0;
import b9.g0;
import b9.k;
import e8.k;
import e8.q;
import j8.d;
import j8.g;
import j8.h;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import q8.l;
import q8.p;

public final class n {
  public static final Object a(p<?> paramp, q8.a<q> parama, d<? super q> paramd) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof d9/n$a
    //   4: ifeq -> 38
    //   7: aload_2
    //   8: checkcast d9/n$a
    //   11: astore #4
    //   13: aload #4
    //   15: getfield j : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 38
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield j : I
    //   35: goto -> 48
    //   38: new d9/n$a
    //   41: dup
    //   42: aload_2
    //   43: invokespecial <init> : (Lj8/d;)V
    //   46: astore #4
    //   48: aload #4
    //   50: getfield i : Ljava/lang/Object;
    //   53: astore #6
    //   55: invokestatic d : ()Ljava/lang/Object;
    //   58: astore #5
    //   60: aload #4
    //   62: getfield j : I
    //   65: istore_3
    //   66: iload_3
    //   67: ifeq -> 117
    //   70: iload_3
    //   71: iconst_1
    //   72: if_icmpne -> 107
    //   75: aload #4
    //   77: getfield h : Ljava/lang/Object;
    //   80: checkcast q8/a
    //   83: astore_0
    //   84: aload #4
    //   86: getfield g : Ljava/lang/Object;
    //   89: checkcast d9/p
    //   92: astore_1
    //   93: aload_0
    //   94: astore_2
    //   95: aload #6
    //   97: invokestatic b : (Ljava/lang/Object;)V
    //   100: goto -> 255
    //   103: astore_0
    //   104: goto -> 266
    //   107: new java/lang/IllegalStateException
    //   110: dup
    //   111: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   113: invokespecial <init> : (Ljava/lang/String;)V
    //   116: athrow
    //   117: aload #6
    //   119: invokestatic b : (Ljava/lang/Object;)V
    //   122: aload #4
    //   124: invokeinterface getContext : ()Lj8/g;
    //   129: getstatic b9/n1.b : Lb9/n1$b;
    //   132: invokeinterface get : (Lj8/g$c;)Lj8/g$b;
    //   137: aload_0
    //   138: if_acmpne -> 146
    //   141: iconst_1
    //   142: istore_3
    //   143: goto -> 148
    //   146: iconst_0
    //   147: istore_3
    //   148: iload_3
    //   149: ifeq -> 275
    //   152: aload_1
    //   153: astore_2
    //   154: aload #4
    //   156: aload_0
    //   157: putfield g : Ljava/lang/Object;
    //   160: aload_1
    //   161: astore_2
    //   162: aload #4
    //   164: aload_1
    //   165: putfield h : Ljava/lang/Object;
    //   168: aload_1
    //   169: astore_2
    //   170: aload #4
    //   172: iconst_1
    //   173: putfield j : I
    //   176: aload_1
    //   177: astore_2
    //   178: new b9/l
    //   181: dup
    //   182: aload #4
    //   184: invokestatic c : (Lj8/d;)Lj8/d;
    //   187: iconst_1
    //   188: invokespecial <init> : (Lj8/d;I)V
    //   191: astore #6
    //   193: aload_1
    //   194: astore_2
    //   195: aload #6
    //   197: invokevirtual A : ()V
    //   200: aload_1
    //   201: astore_2
    //   202: aload_0
    //   203: new d9/n$b
    //   206: dup
    //   207: aload #6
    //   209: invokespecial <init> : (Lb9/k;)V
    //   212: invokeinterface f : (Lq8/l;)V
    //   217: aload_1
    //   218: astore_2
    //   219: aload #6
    //   221: invokevirtual x : ()Ljava/lang/Object;
    //   224: astore #6
    //   226: aload_1
    //   227: astore_2
    //   228: aload #6
    //   230: invokestatic d : ()Ljava/lang/Object;
    //   233: if_acmpne -> 243
    //   236: aload_1
    //   237: astore_2
    //   238: aload #4
    //   240: invokestatic c : (Lj8/d;)V
    //   243: aload_1
    //   244: astore_0
    //   245: aload #6
    //   247: aload #5
    //   249: if_acmpne -> 255
    //   252: aload #5
    //   254: areturn
    //   255: aload_0
    //   256: invokeinterface invoke : ()Ljava/lang/Object;
    //   261: pop
    //   262: getstatic e8/q.a : Le8/q;
    //   265: areturn
    //   266: aload_2
    //   267: invokeinterface invoke : ()Ljava/lang/Object;
    //   272: pop
    //   273: aload_0
    //   274: athrow
    //   275: new java/lang/IllegalStateException
    //   278: dup
    //   279: ldc 'awaitClose() can only be invoked from the producer context'
    //   281: invokevirtual toString : ()Ljava/lang/String;
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    // Exception table:
    //   from	to	target	type
    //   95	100	103	finally
    //   154	160	103	finally
    //   162	168	103	finally
    //   170	176	103	finally
    //   178	193	103	finally
    //   195	200	103	finally
    //   202	217	103	finally
    //   219	226	103	finally
    //   228	236	103	finally
    //   238	243	103	finally
  }
  
  public static final <E> r<E> b(e0 parame0, g paramg, int paramInt, a parama, g0 paramg0, l<? super Throwable, q> paraml, p<? super p<? super E>, ? super d<? super q>, ? extends Object> paramp) {
    d<?> d = g.b(paramInt, parama, null, 4, null);
    parame0 = new o(a0.d(parame0, paramg), d);
    if (paraml != null)
      parame0.r(paraml); 
    parame0.I0(paramg0, parame0, paramp);
    return (r<E>)parame0;
  }
  
  @f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
  static final class a extends d {
    Object g;
    
    Object h;
    
    int j;
    
    a(d<? super a> param1d) {
      super(param1d);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      this.i = param1Object;
      this.j |= Integer.MIN_VALUE;
      return n.a(null, null, (d<? super q>)this);
    }
  }
  
  static final class b extends r8.n implements l<Throwable, q> {
    b(k<? super q> param1k) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      k<q> k1 = this.g;
      k.a a = k.g;
      k1.resumeWith(k.a(q.a));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */