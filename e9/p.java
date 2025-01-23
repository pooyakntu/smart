package e9;

import e8.q;
import f9.a;
import f9.c;
import f9.i;
import f9.k;
import g9.g0;
import j8.d;
import j8.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

final class p<T> extends a<r> implements k<T>, c, i<T> {
  private static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
  
  private volatile Object _state;
  
  private int j;
  
  public p(Object paramObject) {
    this._state = paramObject;
  }
  
  private final boolean j(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic e9/p.k : Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   5: astore #7
    //   7: aload #7
    //   9: aload_0
    //   10: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore #8
    //   15: aload_1
    //   16: ifnull -> 36
    //   19: aload #8
    //   21: aload_1
    //   22: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   25: istore #6
    //   27: iload #6
    //   29: ifne -> 36
    //   32: aload_0
    //   33: monitorexit
    //   34: iconst_0
    //   35: ireturn
    //   36: aload #8
    //   38: aload_2
    //   39: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   42: istore #6
    //   44: iload #6
    //   46: ifeq -> 53
    //   49: aload_0
    //   50: monitorexit
    //   51: iconst_1
    //   52: ireturn
    //   53: aload #7
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   60: aload_0
    //   61: getfield j : I
    //   64: istore_3
    //   65: iload_3
    //   66: iconst_1
    //   67: iand
    //   68: ifne -> 183
    //   71: iload_3
    //   72: iconst_1
    //   73: iadd
    //   74: istore_3
    //   75: aload_0
    //   76: iload_3
    //   77: putfield j : I
    //   80: aload_0
    //   81: invokevirtual g : ()[Lf9/c;
    //   84: astore_1
    //   85: getstatic e8/q.a : Le8/q;
    //   88: astore_2
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: checkcast [Le9/r;
    //   95: astore_1
    //   96: aload_1
    //   97: ifnull -> 136
    //   100: aload_1
    //   101: arraylength
    //   102: istore #5
    //   104: iconst_0
    //   105: istore #4
    //   107: iload #4
    //   109: iload #5
    //   111: if_icmpge -> 136
    //   114: aload_1
    //   115: iload #4
    //   117: aaload
    //   118: astore_2
    //   119: aload_2
    //   120: ifnull -> 127
    //   123: aload_2
    //   124: invokevirtual g : ()V
    //   127: iload #4
    //   129: iconst_1
    //   130: iadd
    //   131: istore #4
    //   133: goto -> 107
    //   136: aload_0
    //   137: monitorenter
    //   138: aload_0
    //   139: getfield j : I
    //   142: istore #4
    //   144: iload #4
    //   146: iload_3
    //   147: if_icmpne -> 161
    //   150: aload_0
    //   151: iload_3
    //   152: iconst_1
    //   153: iadd
    //   154: putfield j : I
    //   157: aload_0
    //   158: monitorexit
    //   159: iconst_1
    //   160: ireturn
    //   161: aload_0
    //   162: invokevirtual g : ()[Lf9/c;
    //   165: astore_1
    //   166: getstatic e8/q.a : Le8/q;
    //   169: astore_2
    //   170: aload_0
    //   171: monitorexit
    //   172: iload #4
    //   174: istore_3
    //   175: goto -> 91
    //   178: astore_1
    //   179: aload_0
    //   180: monitorexit
    //   181: aload_1
    //   182: athrow
    //   183: aload_0
    //   184: iload_3
    //   185: iconst_2
    //   186: iadd
    //   187: putfield j : I
    //   190: aload_0
    //   191: monitorexit
    //   192: iconst_1
    //   193: ireturn
    //   194: astore_1
    //   195: aload_0
    //   196: monitorexit
    //   197: aload_1
    //   198: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	194	finally
    //   19	27	194	finally
    //   36	44	194	finally
    //   53	65	194	finally
    //   75	89	194	finally
    //   138	144	178	finally
    //   150	157	178	finally
    //   161	170	178	finally
    //   183	190	194	finally
  }
  
  public Object a(d<? super T> paramd, d<?> paramd1) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof e9/p$a
    //   4: ifeq -> 38
    //   7: aload_2
    //   8: checkcast e9/p$a
    //   11: astore #4
    //   13: aload #4
    //   15: getfield n : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 38
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield n : I
    //   35: goto -> 49
    //   38: new e9/p$a
    //   41: dup
    //   42: aload_0
    //   43: aload_2
    //   44: invokespecial <init> : (Le9/p;Lj8/d;)V
    //   47: astore #4
    //   49: aload #4
    //   51: getfield l : Ljava/lang/Object;
    //   54: astore #12
    //   56: invokestatic d : ()Ljava/lang/Object;
    //   59: astore #17
    //   61: aload #4
    //   63: getfield n : I
    //   66: istore_3
    //   67: iload_3
    //   68: ifeq -> 279
    //   71: iload_3
    //   72: iconst_1
    //   73: if_icmpeq -> 230
    //   76: iload_3
    //   77: iconst_2
    //   78: if_icmpeq -> 161
    //   81: iload_3
    //   82: iconst_3
    //   83: if_icmpne -> 151
    //   86: aload #4
    //   88: getfield k : Ljava/lang/Object;
    //   91: astore #9
    //   93: aload #4
    //   95: getfield j : Ljava/lang/Object;
    //   98: checkcast b9/n1
    //   101: astore #7
    //   103: aload #4
    //   105: getfield i : Ljava/lang/Object;
    //   108: checkcast e9/r
    //   111: astore #5
    //   113: aload #4
    //   115: getfield h : Ljava/lang/Object;
    //   118: checkcast e9/d
    //   121: astore #8
    //   123: aload #4
    //   125: getfield g : Ljava/lang/Object;
    //   128: checkcast e9/p
    //   131: astore #6
    //   133: aload #5
    //   135: astore_2
    //   136: aload #6
    //   138: astore_1
    //   139: aload #12
    //   141: invokestatic b : (Ljava/lang/Object;)V
    //   144: aload #4
    //   146: astore #12
    //   148: goto -> 398
    //   151: new java/lang/IllegalStateException
    //   154: dup
    //   155: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: aload #4
    //   163: getfield k : Ljava/lang/Object;
    //   166: astore #11
    //   168: aload #4
    //   170: getfield j : Ljava/lang/Object;
    //   173: checkcast b9/n1
    //   176: astore #14
    //   178: aload #4
    //   180: getfield i : Ljava/lang/Object;
    //   183: checkcast e9/r
    //   186: astore #5
    //   188: aload #4
    //   190: getfield h : Ljava/lang/Object;
    //   193: checkcast e9/d
    //   196: astore #15
    //   198: aload #4
    //   200: getfield g : Ljava/lang/Object;
    //   203: checkcast e9/p
    //   206: astore #10
    //   208: aload #5
    //   210: astore_2
    //   211: aload #10
    //   213: astore_1
    //   214: aload #12
    //   216: invokestatic b : (Ljava/lang/Object;)V
    //   219: aload #4
    //   221: astore #13
    //   223: aload #5
    //   225: astore #4
    //   227: goto -> 597
    //   230: aload #4
    //   232: getfield i : Ljava/lang/Object;
    //   235: checkcast e9/r
    //   238: astore #5
    //   240: aload #4
    //   242: getfield h : Ljava/lang/Object;
    //   245: checkcast e9/d
    //   248: astore #7
    //   250: aload #4
    //   252: getfield g : Ljava/lang/Object;
    //   255: checkcast e9/p
    //   258: astore #6
    //   260: aload #5
    //   262: astore_2
    //   263: aload #6
    //   265: astore_1
    //   266: aload #12
    //   268: invokestatic b : (Ljava/lang/Object;)V
    //   271: goto -> 357
    //   274: astore #4
    //   276: goto -> 765
    //   279: aload #12
    //   281: invokestatic b : (Ljava/lang/Object;)V
    //   284: aload_0
    //   285: invokevirtual c : ()Lf9/c;
    //   288: checkcast e9/r
    //   291: astore_2
    //   292: aload_1
    //   293: instanceof e9/s
    //   296: ifeq -> 348
    //   299: aload_1
    //   300: checkcast e9/s
    //   303: astore #5
    //   305: aload #4
    //   307: aload_0
    //   308: putfield g : Ljava/lang/Object;
    //   311: aload #4
    //   313: aload_1
    //   314: putfield h : Ljava/lang/Object;
    //   317: aload #4
    //   319: aload_2
    //   320: putfield i : Ljava/lang/Object;
    //   323: aload #4
    //   325: iconst_1
    //   326: putfield n : I
    //   329: aload #5
    //   331: aload #4
    //   333: invokevirtual a : (Lj8/d;)Ljava/lang/Object;
    //   336: astore #5
    //   338: aload #5
    //   340: aload #17
    //   342: if_acmpne -> 348
    //   345: aload #17
    //   347: areturn
    //   348: aload_0
    //   349: astore #6
    //   351: aload_1
    //   352: astore #7
    //   354: aload_2
    //   355: astore #5
    //   357: aload #5
    //   359: astore_2
    //   360: aload #6
    //   362: astore_1
    //   363: aload #4
    //   365: invokeinterface getContext : ()Lj8/g;
    //   370: getstatic b9/n1.b : Lb9/n1$b;
    //   373: invokeinterface get : (Lj8/g$c;)Lj8/g$b;
    //   378: checkcast b9/n1
    //   381: astore #9
    //   383: aload #7
    //   385: astore #8
    //   387: aload #9
    //   389: astore #7
    //   391: aconst_null
    //   392: astore #9
    //   394: aload #4
    //   396: astore #12
    //   398: aload #5
    //   400: astore_2
    //   401: aload #6
    //   403: astore_1
    //   404: getstatic e9/p.k : Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   407: aload #6
    //   409: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   412: astore #16
    //   414: aload #7
    //   416: ifnull -> 430
    //   419: aload #5
    //   421: astore_2
    //   422: aload #6
    //   424: astore_1
    //   425: aload #7
    //   427: invokestatic g : (Lb9/n1;)V
    //   430: aload #9
    //   432: ifnull -> 475
    //   435: aload #5
    //   437: astore_2
    //   438: aload #6
    //   440: astore_1
    //   441: aload #12
    //   443: astore #13
    //   445: aload #7
    //   447: astore #14
    //   449: aload #5
    //   451: astore #4
    //   453: aload #8
    //   455: astore #15
    //   457: aload #6
    //   459: astore #10
    //   461: aload #9
    //   463: astore #11
    //   465: aload #9
    //   467: aload #16
    //   469: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   472: ifne -> 597
    //   475: aload #5
    //   477: astore_2
    //   478: aload #6
    //   480: astore_1
    //   481: aload #16
    //   483: getstatic f9/k.a : Lg9/g0;
    //   486: if_acmpne -> 773
    //   489: aconst_null
    //   490: astore #4
    //   492: goto -> 495
    //   495: aload #5
    //   497: astore_2
    //   498: aload #6
    //   500: astore_1
    //   501: aload #12
    //   503: aload #6
    //   505: putfield g : Ljava/lang/Object;
    //   508: aload #5
    //   510: astore_2
    //   511: aload #6
    //   513: astore_1
    //   514: aload #12
    //   516: aload #8
    //   518: putfield h : Ljava/lang/Object;
    //   521: aload #5
    //   523: astore_2
    //   524: aload #6
    //   526: astore_1
    //   527: aload #12
    //   529: aload #5
    //   531: putfield i : Ljava/lang/Object;
    //   534: aload #5
    //   536: astore_2
    //   537: aload #6
    //   539: astore_1
    //   540: aload #12
    //   542: aload #7
    //   544: putfield j : Ljava/lang/Object;
    //   547: aload #5
    //   549: astore_2
    //   550: aload #6
    //   552: astore_1
    //   553: aload #12
    //   555: aload #16
    //   557: putfield k : Ljava/lang/Object;
    //   560: aload #5
    //   562: astore_2
    //   563: aload #6
    //   565: astore_1
    //   566: aload #12
    //   568: iconst_2
    //   569: putfield n : I
    //   572: aload #5
    //   574: astore_2
    //   575: aload #6
    //   577: astore_1
    //   578: aload #8
    //   580: aload #4
    //   582: aload #12
    //   584: invokeinterface emit : (Ljava/lang/Object;Lj8/d;)Ljava/lang/Object;
    //   589: aload #17
    //   591: if_acmpne -> 780
    //   594: aload #17
    //   596: areturn
    //   597: aload #4
    //   599: astore_2
    //   600: aload #10
    //   602: astore_1
    //   603: aload #13
    //   605: astore #12
    //   607: aload #14
    //   609: astore #7
    //   611: aload #4
    //   613: astore #5
    //   615: aload #15
    //   617: astore #8
    //   619: aload #10
    //   621: astore #6
    //   623: aload #11
    //   625: astore #9
    //   627: aload #4
    //   629: invokevirtual h : ()Z
    //   632: ifne -> 398
    //   635: aload #4
    //   637: astore_2
    //   638: aload #10
    //   640: astore_1
    //   641: aload #13
    //   643: aload #10
    //   645: putfield g : Ljava/lang/Object;
    //   648: aload #4
    //   650: astore_2
    //   651: aload #10
    //   653: astore_1
    //   654: aload #13
    //   656: aload #15
    //   658: putfield h : Ljava/lang/Object;
    //   661: aload #4
    //   663: astore_2
    //   664: aload #10
    //   666: astore_1
    //   667: aload #13
    //   669: aload #4
    //   671: putfield i : Ljava/lang/Object;
    //   674: aload #4
    //   676: astore_2
    //   677: aload #10
    //   679: astore_1
    //   680: aload #13
    //   682: aload #14
    //   684: putfield j : Ljava/lang/Object;
    //   687: aload #4
    //   689: astore_2
    //   690: aload #10
    //   692: astore_1
    //   693: aload #13
    //   695: aload #11
    //   697: putfield k : Ljava/lang/Object;
    //   700: aload #4
    //   702: astore_2
    //   703: aload #10
    //   705: astore_1
    //   706: aload #13
    //   708: iconst_3
    //   709: putfield n : I
    //   712: aload #4
    //   714: astore_2
    //   715: aload #10
    //   717: astore_1
    //   718: aload #4
    //   720: aload #13
    //   722: invokevirtual e : (Lj8/d;)Ljava/lang/Object;
    //   725: astore #16
    //   727: aload #13
    //   729: astore #12
    //   731: aload #14
    //   733: astore #7
    //   735: aload #4
    //   737: astore #5
    //   739: aload #15
    //   741: astore #8
    //   743: aload #10
    //   745: astore #6
    //   747: aload #11
    //   749: astore #9
    //   751: aload #16
    //   753: aload #17
    //   755: if_acmpne -> 398
    //   758: aload #17
    //   760: areturn
    //   761: astore #4
    //   763: aload_0
    //   764: astore_1
    //   765: aload_1
    //   766: aload_2
    //   767: invokevirtual f : (Lf9/c;)V
    //   770: aload #4
    //   772: athrow
    //   773: aload #16
    //   775: astore #4
    //   777: goto -> 495
    //   780: aload #16
    //   782: astore #11
    //   784: aload #12
    //   786: astore #13
    //   788: aload #7
    //   790: astore #14
    //   792: aload #5
    //   794: astore #4
    //   796: aload #8
    //   798: astore #15
    //   800: aload #6
    //   802: astore #10
    //   804: goto -> 597
    // Exception table:
    //   from	to	target	type
    //   139	144	274	finally
    //   214	219	274	finally
    //   266	271	274	finally
    //   292	338	761	finally
    //   363	383	274	finally
    //   404	414	274	finally
    //   425	430	274	finally
    //   465	475	274	finally
    //   481	489	274	finally
    //   501	508	274	finally
    //   514	521	274	finally
    //   527	534	274	finally
    //   540	547	274	finally
    //   553	560	274	finally
    //   566	572	274	finally
    //   578	594	274	finally
    //   627	635	274	finally
    //   641	648	274	finally
    //   654	661	274	finally
    //   667	674	274	finally
    //   680	687	274	finally
    //   693	700	274	finally
    //   706	712	274	finally
    //   718	727	274	finally
  }
  
  public c<T> b(g paramg, int paramInt, d9.a parama) {
    return q.d(this, paramg, paramInt, parama);
  }
  
  public Object emit(T paramT, d<? super q> paramd) {
    setValue(paramT);
    return q.a;
  }
  
  public T getValue() {
    g0 g03 = k.a;
    g0 g02 = (g0)k.get(this);
    g0 g01 = g02;
    if (g02 == g03)
      g01 = null; 
    return (T)g01;
  }
  
  protected r h() {
    return new r();
  }
  
  protected r[] i(int paramInt) {
    return new r[paramInt];
  }
  
  public void setValue(T paramT) {
    g0 g0;
    T t = paramT;
    if (paramT == null)
      g0 = k.a; 
    j(null, g0);
  }
  
  @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
  static final class a extends d {
    Object g;
    
    Object h;
    
    Object i;
    
    Object j;
    
    Object k;
    
    int n;
    
    a(p<T> param1p, d<? super a> param1d) {
      super(param1d);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      this.l = param1Object;
      this.n |= Integer.MIN_VALUE;
      return this.m.a(null, (d<?>)this);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */