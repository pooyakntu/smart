package e9;

import e8.q;
import j8.d;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import q8.p;

public final class s<T> implements d<T> {
  private final d<T> g;
  
  private final p<d<? super T>, d<? super q>, Object> h;
  
  public final Object a(d<? super q> paramd) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof e9/s$a
    //   4: ifeq -> 37
    //   7: aload_1
    //   8: checkcast e9/s$a
    //   11: astore_3
    //   12: aload_3
    //   13: getfield k : I
    //   16: istore_2
    //   17: iload_2
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 37
    //   24: aload_3
    //   25: iload_2
    //   26: ldc -2147483648
    //   28: iadd
    //   29: putfield k : I
    //   32: aload_3
    //   33: astore_1
    //   34: goto -> 47
    //   37: new e9/s$a
    //   40: dup
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial <init> : (Le9/s;Lj8/d;)V
    //   46: astore_1
    //   47: aload_1
    //   48: getfield i : Ljava/lang/Object;
    //   51: astore #7
    //   53: invokestatic d : ()Ljava/lang/Object;
    //   56: astore #6
    //   58: aload_1
    //   59: getfield k : I
    //   62: istore_2
    //   63: iload_2
    //   64: ifeq -> 127
    //   67: iload_2
    //   68: iconst_1
    //   69: if_icmpeq -> 95
    //   72: iload_2
    //   73: iconst_2
    //   74: if_icmpne -> 85
    //   77: aload #7
    //   79: invokestatic b : (Ljava/lang/Object;)V
    //   82: goto -> 262
    //   85: new java/lang/IllegalStateException
    //   88: dup
    //   89: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: athrow
    //   95: aload_1
    //   96: getfield h : Ljava/lang/Object;
    //   99: checkcast f9/l
    //   102: astore #4
    //   104: aload_1
    //   105: getfield g : Ljava/lang/Object;
    //   108: checkcast e9/s
    //   111: astore #5
    //   113: aload #4
    //   115: astore_3
    //   116: aload #7
    //   118: invokestatic b : (Ljava/lang/Object;)V
    //   121: aload #5
    //   123: astore_3
    //   124: goto -> 212
    //   127: aload #7
    //   129: invokestatic b : (Ljava/lang/Object;)V
    //   132: new f9/l
    //   135: dup
    //   136: aload_0
    //   137: getfield g : Le9/d;
    //   140: aload_1
    //   141: invokeinterface getContext : ()Lj8/g;
    //   146: invokespecial <init> : (Le9/d;Lj8/g;)V
    //   149: astore #4
    //   151: aload #4
    //   153: astore_3
    //   154: aload_0
    //   155: getfield h : Lq8/p;
    //   158: astore #5
    //   160: aload #4
    //   162: astore_3
    //   163: aload_1
    //   164: aload_0
    //   165: putfield g : Ljava/lang/Object;
    //   168: aload #4
    //   170: astore_3
    //   171: aload_1
    //   172: aload #4
    //   174: putfield h : Ljava/lang/Object;
    //   177: aload #4
    //   179: astore_3
    //   180: aload_1
    //   181: iconst_1
    //   182: putfield k : I
    //   185: aload #4
    //   187: astore_3
    //   188: aload #5
    //   190: aload #4
    //   192: aload_1
    //   193: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   198: astore #5
    //   200: aload #5
    //   202: aload #6
    //   204: if_acmpne -> 210
    //   207: aload #6
    //   209: areturn
    //   210: aload_0
    //   211: astore_3
    //   212: aload #4
    //   214: invokevirtual releaseIntercepted : ()V
    //   217: aload_3
    //   218: getfield g : Le9/d;
    //   221: astore_3
    //   222: aload_3
    //   223: instanceof e9/s
    //   226: ifeq -> 266
    //   229: aload_3
    //   230: checkcast e9/s
    //   233: astore_3
    //   234: aload_1
    //   235: aconst_null
    //   236: putfield g : Ljava/lang/Object;
    //   239: aload_1
    //   240: aconst_null
    //   241: putfield h : Ljava/lang/Object;
    //   244: aload_1
    //   245: iconst_2
    //   246: putfield k : I
    //   249: aload_3
    //   250: aload_1
    //   251: invokevirtual a : (Lj8/d;)Ljava/lang/Object;
    //   254: aload #6
    //   256: if_acmpne -> 262
    //   259: aload #6
    //   261: areturn
    //   262: getstatic e8/q.a : Le8/q;
    //   265: areturn
    //   266: getstatic e8/q.a : Le8/q;
    //   269: areturn
    //   270: astore_1
    //   271: aload_3
    //   272: invokevirtual releaseIntercepted : ()V
    //   275: aload_1
    //   276: athrow
    // Exception table:
    //   from	to	target	type
    //   116	121	270	finally
    //   154	160	270	finally
    //   163	168	270	finally
    //   171	177	270	finally
    //   180	185	270	finally
    //   188	200	270	finally
  }
  
  public Object emit(T paramT, d<? super q> paramd) {
    return this.g.emit(paramT, paramd);
  }
  
  @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
  static final class a extends d {
    Object g;
    
    Object h;
    
    int k;
    
    a(s<T> param1s, d<? super a> param1d) {
      super(param1d);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      this.i = param1Object;
      this.k |= Integer.MIN_VALUE;
      return this.j.a((d<? super q>)this);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */