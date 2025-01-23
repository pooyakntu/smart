package p;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m.d;
import m.i;
import q.b;
import q.e;

public class f extends m {
  b M0 = new b(this);
  
  public e N0 = new e(this);
  
  private int O0;
  
  protected b.b P0 = null;
  
  private boolean Q0 = false;
  
  protected d R0 = new d();
  
  int S0;
  
  int T0;
  
  int U0;
  
  int V0;
  
  public int W0 = 0;
  
  public int X0 = 0;
  
  c[] Y0 = new c[4];
  
  c[] Z0 = new c[4];
  
  public boolean a1 = false;
  
  public boolean b1 = false;
  
  public boolean c1 = false;
  
  public int d1 = 0;
  
  public int e1 = 0;
  
  private int f1 = 257;
  
  public boolean g1 = false;
  
  private boolean h1 = false;
  
  private boolean i1 = false;
  
  int j1 = 0;
  
  private WeakReference<d> k1 = null;
  
  private WeakReference<d> l1 = null;
  
  private WeakReference<d> m1 = null;
  
  private WeakReference<d> n1 = null;
  
  HashSet<e> o1 = new HashSet<e>();
  
  public b.a p1 = new b.a();
  
  private void A1(d paramd, i parami) {
    i i1 = this.R0.q(paramd);
    this.R0.h(parami, i1, 0, 5);
  }
  
  private void B1(d paramd, i parami) {
    i i1 = this.R0.q(paramd);
    this.R0.h(i1, parami, 0, 5);
  }
  
  private void C1(e parame) {
    int i = this.X0;
    c[] arrayOfC = this.Y0;
    if (i + 1 >= arrayOfC.length)
      this.Y0 = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    this.Y0[this.X0] = new c(parame, 1, P1());
    this.X0++;
  }
  
  public static boolean S1(int paramInt1, e parame, b.b paramb, b.a parama, int paramInt2) {
    boolean bool1;
    boolean bool2;
    if (paramb == null)
      return false; 
    if (parame.V() == 8 || parame instanceof h || parame instanceof a) {
      parama.e = 0;
      parama.f = 0;
      return false;
    } 
    parama.a = parame.A();
    parama.b = parame.T();
    parama.c = parame.W();
    parama.d = parame.x();
    parama.i = false;
    parama.j = paramInt2;
    e.b b1 = parama.a;
    e.b b2 = e.b.MATCH_CONSTRAINT;
    if (b1 == b2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (parama.b == b2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    if (paramInt1 != 0 && parame.d0 > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (paramInt2 != 0 && parame.d0 > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int i = paramInt1;
    if (paramInt1 != 0) {
      i = paramInt1;
      if (parame.a0(0)) {
        i = paramInt1;
        if (parame.w == 0) {
          i = paramInt1;
          if (!bool2) {
            parama.a = e.b.WRAP_CONTENT;
            if (paramInt2 != 0 && parame.x == 0)
              parama.a = e.b.FIXED; 
            i = 0;
          } 
        } 
      } 
    } 
    paramInt1 = paramInt2;
    if (paramInt2 != 0) {
      paramInt1 = paramInt2;
      if (parame.a0(1)) {
        paramInt1 = paramInt2;
        if (parame.x == 0) {
          paramInt1 = paramInt2;
          if (!bool1) {
            parama.b = e.b.WRAP_CONTENT;
            if (i != 0 && parame.w == 0)
              parama.b = e.b.FIXED; 
            paramInt1 = 0;
          } 
        } 
      } 
    } 
    if (parame.n0()) {
      parama.a = e.b.FIXED;
      i = 0;
    } 
    if (parame.o0()) {
      parama.b = e.b.FIXED;
      paramInt1 = 0;
    } 
    if (bool2)
      if (parame.y[0] == 4) {
        parama.a = e.b.FIXED;
      } else if (paramInt1 == 0) {
        b1 = parama.b;
        b2 = e.b.FIXED;
        if (b1 == b2) {
          paramInt1 = parama.d;
        } else {
          parama.a = e.b.WRAP_CONTENT;
          paramb.b(parame, parama);
          paramInt1 = parama.f;
        } 
        parama.a = b2;
        parama.c = (int)(parame.v() * paramInt1);
      }  
    if (bool1)
      if (parame.y[1] == 4) {
        parama.b = e.b.FIXED;
      } else if (i == 0) {
        b1 = parama.a;
        b2 = e.b.FIXED;
        if (b1 == b2) {
          paramInt1 = parama.c;
        } else {
          parama.b = e.b.WRAP_CONTENT;
          paramb.b(parame, parama);
          paramInt1 = parama.e;
        } 
        parama.b = b2;
        if (parame.w() == -1) {
          parama.d = (int)(paramInt1 / parame.v());
        } else {
          parama.d = (int)(parame.v() * paramInt1);
        } 
      }  
    paramb.b(parame, parama);
    parame.k1(parama.e);
    parame.L0(parama.f);
    parame.K0(parama.h);
    parame.A0(parama.g);
    parama.j = b.a.k;
    return parama.i;
  }
  
  private void U1() {
    this.W0 = 0;
    this.X0 = 0;
  }
  
  private void x1(e parame) {
    int i = this.W0;
    c[] arrayOfC = this.Z0;
    if (i + 1 >= arrayOfC.length)
      this.Z0 = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    this.Z0[this.W0] = new c(parame, 0, P1());
    this.W0++;
  }
  
  void D1(d paramd) {
    WeakReference<d> weakReference = this.m1;
    if (weakReference == null || weakReference.get() == null || paramd.e() > ((d)this.m1.get()).e())
      this.m1 = new WeakReference<d>(paramd); 
  }
  
  void E1(d paramd) {
    WeakReference<d> weakReference = this.k1;
    if (weakReference == null || weakReference.get() == null || paramd.e() > ((d)this.k1.get()).e())
      this.k1 = new WeakReference<d>(paramd); 
  }
  
  public boolean F1(boolean paramBoolean) {
    return this.N0.f(paramBoolean);
  }
  
  public boolean G1(boolean paramBoolean) {
    return this.N0.g(paramBoolean);
  }
  
  public boolean H1(boolean paramBoolean, int paramInt) {
    return this.N0.h(paramBoolean, paramInt);
  }
  
  public b.b I1() {
    return this.P0;
  }
  
  public int J1() {
    return this.f1;
  }
  
  public d K1() {
    return this.R0;
  }
  
  public boolean L1() {
    return false;
  }
  
  public void M1() {
    this.N0.j();
  }
  
  public void N1() {
    this.N0.k();
  }
  
  public void O(StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.o);
    stringBuilder.append(":{\n");
    paramStringBuilder.append(stringBuilder.toString());
    stringBuilder = new StringBuilder();
    stringBuilder.append("  actualWidth:");
    stringBuilder.append(this.b0);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder();
    stringBuilder.append("  actualHeight:");
    stringBuilder.append(this.c0);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    Iterator<e> iterator = r1().iterator();
    while (iterator.hasNext()) {
      ((e)iterator.next()).O(paramStringBuilder);
      paramStringBuilder.append(",\n");
    } 
    paramStringBuilder.append("}");
  }
  
  public boolean O1() {
    return this.i1;
  }
  
  public boolean P1() {
    return this.Q0;
  }
  
  public boolean Q1() {
    return this.h1;
  }
  
  public long R1(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    this.S0 = paramInt8;
    this.T0 = paramInt9;
    return this.M0.d(this, paramInt1, paramInt8, paramInt9, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public boolean T1(int paramInt) {
    return ((this.f1 & paramInt) == paramInt);
  }
  
  public void V1(b.b paramb) {
    this.P0 = paramb;
    this.N0.n(paramb);
  }
  
  public void W1(int paramInt) {
    this.f1 = paramInt;
    d.r = T1(512);
  }
  
  public void X1(int paramInt) {
    this.O0 = paramInt;
  }
  
  public void Y1(boolean paramBoolean) {
    this.Q0 = paramBoolean;
  }
  
  public boolean Z1(d paramd, boolean[] paramArrayOfboolean) {
    int i = 0;
    paramArrayOfboolean[2] = false;
    boolean bool1 = T1(64);
    q1(paramd, bool1);
    int j = this.L0.size();
    boolean bool = false;
    while (i < j) {
      e e1 = this.L0.get(i);
      e1.q1(paramd, bool1);
      if (e1.c0())
        bool = true; 
      i++;
    } 
    return bool;
  }
  
  public void a2() {
    this.M0.e(this);
  }
  
  public void p1(boolean paramBoolean1, boolean paramBoolean2) {
    super.p1(paramBoolean1, paramBoolean2);
    int j = this.L0.size();
    for (int i = 0; i < j; i++)
      ((e)this.L0.get(i)).p1(paramBoolean1, paramBoolean2); 
  }
  
  public void s1() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield f0 : I
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield g0 : I
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield h1 : Z
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield i1 : Z
    //   20: aload_0
    //   21: getfield L0 : Ljava/util/ArrayList;
    //   24: invokevirtual size : ()I
    //   27: istore #9
    //   29: iconst_0
    //   30: aload_0
    //   31: invokevirtual W : ()I
    //   34: invokestatic max : (II)I
    //   37: istore_2
    //   38: iconst_0
    //   39: aload_0
    //   40: invokevirtual x : ()I
    //   43: invokestatic max : (II)I
    //   46: istore_3
    //   47: aload_0
    //   48: getfield Z : [Lp/e$b;
    //   51: astore #15
    //   53: aload #15
    //   55: iconst_1
    //   56: aaload
    //   57: astore #14
    //   59: aload #15
    //   61: iconst_0
    //   62: aaload
    //   63: astore #15
    //   65: aload_0
    //   66: getfield O0 : I
    //   69: ifne -> 251
    //   72: aload_0
    //   73: getfield f1 : I
    //   76: iconst_1
    //   77: invokestatic b : (II)Z
    //   80: ifeq -> 251
    //   83: aload_0
    //   84: aload_0
    //   85: invokevirtual I1 : ()Lq/b$b;
    //   88: invokestatic h : (Lp/f;Lq/b$b;)V
    //   91: iconst_0
    //   92: istore_1
    //   93: iload_1
    //   94: iload #9
    //   96: if_icmpge -> 251
    //   99: aload_0
    //   100: getfield L0 : Ljava/util/ArrayList;
    //   103: iload_1
    //   104: invokevirtual get : (I)Ljava/lang/Object;
    //   107: checkcast p/e
    //   110: astore #16
    //   112: aload #16
    //   114: invokevirtual m0 : ()Z
    //   117: ifeq -> 244
    //   120: aload #16
    //   122: instanceof p/h
    //   125: ifne -> 244
    //   128: aload #16
    //   130: instanceof p/a
    //   133: ifne -> 244
    //   136: aload #16
    //   138: instanceof p/l
    //   141: ifne -> 244
    //   144: aload #16
    //   146: invokevirtual l0 : ()Z
    //   149: ifne -> 244
    //   152: aload #16
    //   154: iconst_0
    //   155: invokevirtual u : (I)Lp/e$b;
    //   158: astore #17
    //   160: aload #16
    //   162: iconst_1
    //   163: invokevirtual u : (I)Lp/e$b;
    //   166: astore #18
    //   168: getstatic p/e$b.MATCH_CONSTRAINT : Lp/e$b;
    //   171: astore #19
    //   173: aload #17
    //   175: aload #19
    //   177: if_acmpne -> 211
    //   180: aload #16
    //   182: getfield w : I
    //   185: iconst_1
    //   186: if_icmpeq -> 211
    //   189: aload #18
    //   191: aload #19
    //   193: if_acmpne -> 211
    //   196: aload #16
    //   198: getfield x : I
    //   201: iconst_1
    //   202: if_icmpeq -> 211
    //   205: iconst_1
    //   206: istore #4
    //   208: goto -> 214
    //   211: iconst_0
    //   212: istore #4
    //   214: iload #4
    //   216: ifne -> 244
    //   219: new q/b$a
    //   222: dup
    //   223: invokespecial <init> : ()V
    //   226: astore #17
    //   228: iconst_0
    //   229: aload #16
    //   231: aload_0
    //   232: getfield P0 : Lq/b$b;
    //   235: aload #17
    //   237: getstatic q/b$a.k : I
    //   240: invokestatic S1 : (ILp/e;Lq/b$b;Lq/b$a;I)Z
    //   243: pop
    //   244: iload_1
    //   245: iconst_1
    //   246: iadd
    //   247: istore_1
    //   248: goto -> 93
    //   251: iload #9
    //   253: iconst_2
    //   254: if_icmple -> 393
    //   257: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   260: astore #16
    //   262: aload #15
    //   264: aload #16
    //   266: if_acmpeq -> 276
    //   269: aload #14
    //   271: aload #16
    //   273: if_acmpne -> 393
    //   276: aload_0
    //   277: getfield f1 : I
    //   280: sipush #1024
    //   283: invokestatic b : (II)Z
    //   286: ifeq -> 393
    //   289: aload_0
    //   290: aload_0
    //   291: invokevirtual I1 : ()Lq/b$b;
    //   294: invokestatic c : (Lp/f;Lq/b$b;)Z
    //   297: ifeq -> 393
    //   300: iload_2
    //   301: istore_1
    //   302: aload #15
    //   304: aload #16
    //   306: if_acmpne -> 341
    //   309: iload_2
    //   310: aload_0
    //   311: invokevirtual W : ()I
    //   314: if_icmpge -> 336
    //   317: iload_2
    //   318: ifle -> 336
    //   321: aload_0
    //   322: iload_2
    //   323: invokevirtual k1 : (I)V
    //   326: aload_0
    //   327: iconst_1
    //   328: putfield h1 : Z
    //   331: iload_2
    //   332: istore_1
    //   333: goto -> 341
    //   336: aload_0
    //   337: invokevirtual W : ()I
    //   340: istore_1
    //   341: iload_3
    //   342: istore_2
    //   343: aload #14
    //   345: aload #16
    //   347: if_acmpne -> 382
    //   350: iload_3
    //   351: aload_0
    //   352: invokevirtual x : ()I
    //   355: if_icmpge -> 377
    //   358: iload_3
    //   359: ifle -> 377
    //   362: aload_0
    //   363: iload_3
    //   364: invokevirtual L0 : (I)V
    //   367: aload_0
    //   368: iconst_1
    //   369: putfield i1 : Z
    //   372: iload_3
    //   373: istore_2
    //   374: goto -> 382
    //   377: aload_0
    //   378: invokevirtual x : ()I
    //   381: istore_2
    //   382: iload_1
    //   383: istore #4
    //   385: iconst_1
    //   386: istore_1
    //   387: iload_2
    //   388: istore #5
    //   390: goto -> 401
    //   393: iconst_0
    //   394: istore_1
    //   395: iload_3
    //   396: istore #5
    //   398: iload_2
    //   399: istore #4
    //   401: aload_0
    //   402: bipush #64
    //   404: invokevirtual T1 : (I)Z
    //   407: ifne -> 428
    //   410: aload_0
    //   411: sipush #128
    //   414: invokevirtual T1 : (I)Z
    //   417: ifeq -> 423
    //   420: goto -> 428
    //   423: iconst_0
    //   424: istore_2
    //   425: goto -> 430
    //   428: iconst_1
    //   429: istore_2
    //   430: aload_0
    //   431: getfield R0 : Lm/d;
    //   434: astore #16
    //   436: aload #16
    //   438: iconst_0
    //   439: putfield h : Z
    //   442: aload #16
    //   444: iconst_0
    //   445: putfield i : Z
    //   448: aload_0
    //   449: getfield f1 : I
    //   452: ifeq -> 465
    //   455: iload_2
    //   456: ifeq -> 465
    //   459: aload #16
    //   461: iconst_1
    //   462: putfield i : Z
    //   465: aload_0
    //   466: getfield L0 : Ljava/util/ArrayList;
    //   469: astore #16
    //   471: aload_0
    //   472: invokevirtual A : ()Lp/e$b;
    //   475: astore #17
    //   477: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   480: astore #18
    //   482: aload #17
    //   484: aload #18
    //   486: if_acmpeq -> 507
    //   489: aload_0
    //   490: invokevirtual T : ()Lp/e$b;
    //   493: aload #18
    //   495: if_acmpne -> 501
    //   498: goto -> 507
    //   501: iconst_0
    //   502: istore #6
    //   504: goto -> 510
    //   507: iconst_1
    //   508: istore #6
    //   510: aload_0
    //   511: invokespecial U1 : ()V
    //   514: iconst_0
    //   515: istore_2
    //   516: iload_2
    //   517: iload #9
    //   519: if_icmpge -> 558
    //   522: aload_0
    //   523: getfield L0 : Ljava/util/ArrayList;
    //   526: iload_2
    //   527: invokevirtual get : (I)Ljava/lang/Object;
    //   530: checkcast p/e
    //   533: astore #17
    //   535: aload #17
    //   537: instanceof p/m
    //   540: ifeq -> 551
    //   543: aload #17
    //   545: checkcast p/m
    //   548: invokevirtual s1 : ()V
    //   551: iload_2
    //   552: iconst_1
    //   553: iadd
    //   554: istore_2
    //   555: goto -> 516
    //   558: aload_0
    //   559: bipush #64
    //   561: invokevirtual T1 : (I)Z
    //   564: istore #13
    //   566: iconst_0
    //   567: istore_2
    //   568: iconst_1
    //   569: istore #11
    //   571: iload #11
    //   573: ifeq -> 1542
    //   576: iload_2
    //   577: iconst_1
    //   578: iadd
    //   579: istore #8
    //   581: iload #11
    //   583: istore #10
    //   585: aload_0
    //   586: getfield R0 : Lm/d;
    //   589: invokevirtual D : ()V
    //   592: iload #11
    //   594: istore #10
    //   596: aload_0
    //   597: invokespecial U1 : ()V
    //   600: iload #11
    //   602: istore #10
    //   604: aload_0
    //   605: aload_0
    //   606: getfield R0 : Lm/d;
    //   609: invokevirtual m : (Lm/d;)V
    //   612: iconst_0
    //   613: istore_2
    //   614: iload_2
    //   615: iload #9
    //   617: if_icmpge -> 649
    //   620: iload #11
    //   622: istore #10
    //   624: aload_0
    //   625: getfield L0 : Ljava/util/ArrayList;
    //   628: iload_2
    //   629: invokevirtual get : (I)Ljava/lang/Object;
    //   632: checkcast p/e
    //   635: aload_0
    //   636: getfield R0 : Lm/d;
    //   639: invokevirtual m : (Lm/d;)V
    //   642: iload_2
    //   643: iconst_1
    //   644: iadd
    //   645: istore_2
    //   646: goto -> 614
    //   649: iload #11
    //   651: istore #10
    //   653: aload_0
    //   654: aload_0
    //   655: getfield R0 : Lm/d;
    //   658: invokevirtual w1 : (Lm/d;)Z
    //   661: istore #11
    //   663: iload #11
    //   665: istore #10
    //   667: aload_0
    //   668: getfield k1 : Ljava/lang/ref/WeakReference;
    //   671: astore #17
    //   673: aload #17
    //   675: ifnull -> 728
    //   678: iload #11
    //   680: istore #10
    //   682: aload #17
    //   684: invokevirtual get : ()Ljava/lang/Object;
    //   687: ifnull -> 728
    //   690: iload #11
    //   692: istore #10
    //   694: aload_0
    //   695: aload_0
    //   696: getfield k1 : Ljava/lang/ref/WeakReference;
    //   699: invokevirtual get : ()Ljava/lang/Object;
    //   702: checkcast p/d
    //   705: aload_0
    //   706: getfield R0 : Lm/d;
    //   709: aload_0
    //   710: getfield P : Lp/d;
    //   713: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   716: invokespecial B1 : (Lp/d;Lm/i;)V
    //   719: iload #11
    //   721: istore #10
    //   723: aload_0
    //   724: aconst_null
    //   725: putfield k1 : Ljava/lang/ref/WeakReference;
    //   728: iload #11
    //   730: istore #10
    //   732: aload_0
    //   733: getfield m1 : Ljava/lang/ref/WeakReference;
    //   736: astore #17
    //   738: aload #17
    //   740: ifnull -> 793
    //   743: iload #11
    //   745: istore #10
    //   747: aload #17
    //   749: invokevirtual get : ()Ljava/lang/Object;
    //   752: ifnull -> 793
    //   755: iload #11
    //   757: istore #10
    //   759: aload_0
    //   760: aload_0
    //   761: getfield m1 : Ljava/lang/ref/WeakReference;
    //   764: invokevirtual get : ()Ljava/lang/Object;
    //   767: checkcast p/d
    //   770: aload_0
    //   771: getfield R0 : Lm/d;
    //   774: aload_0
    //   775: getfield R : Lp/d;
    //   778: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   781: invokespecial A1 : (Lp/d;Lm/i;)V
    //   784: iload #11
    //   786: istore #10
    //   788: aload_0
    //   789: aconst_null
    //   790: putfield m1 : Ljava/lang/ref/WeakReference;
    //   793: iload #11
    //   795: istore #10
    //   797: aload_0
    //   798: getfield l1 : Ljava/lang/ref/WeakReference;
    //   801: astore #17
    //   803: aload #17
    //   805: ifnull -> 858
    //   808: iload #11
    //   810: istore #10
    //   812: aload #17
    //   814: invokevirtual get : ()Ljava/lang/Object;
    //   817: ifnull -> 858
    //   820: iload #11
    //   822: istore #10
    //   824: aload_0
    //   825: aload_0
    //   826: getfield l1 : Ljava/lang/ref/WeakReference;
    //   829: invokevirtual get : ()Ljava/lang/Object;
    //   832: checkcast p/d
    //   835: aload_0
    //   836: getfield R0 : Lm/d;
    //   839: aload_0
    //   840: getfield O : Lp/d;
    //   843: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   846: invokespecial B1 : (Lp/d;Lm/i;)V
    //   849: iload #11
    //   851: istore #10
    //   853: aload_0
    //   854: aconst_null
    //   855: putfield l1 : Ljava/lang/ref/WeakReference;
    //   858: iload #11
    //   860: istore #10
    //   862: aload_0
    //   863: getfield n1 : Ljava/lang/ref/WeakReference;
    //   866: astore #17
    //   868: aload #17
    //   870: ifnull -> 923
    //   873: iload #11
    //   875: istore #10
    //   877: aload #17
    //   879: invokevirtual get : ()Ljava/lang/Object;
    //   882: ifnull -> 923
    //   885: iload #11
    //   887: istore #10
    //   889: aload_0
    //   890: aload_0
    //   891: getfield n1 : Ljava/lang/ref/WeakReference;
    //   894: invokevirtual get : ()Ljava/lang/Object;
    //   897: checkcast p/d
    //   900: aload_0
    //   901: getfield R0 : Lm/d;
    //   904: aload_0
    //   905: getfield Q : Lp/d;
    //   908: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   911: invokespecial A1 : (Lp/d;Lm/i;)V
    //   914: iload #11
    //   916: istore #10
    //   918: aload_0
    //   919: aconst_null
    //   920: putfield n1 : Ljava/lang/ref/WeakReference;
    //   923: iload #11
    //   925: istore #10
    //   927: iload #11
    //   929: ifeq -> 998
    //   932: iload #11
    //   934: istore #10
    //   936: aload_0
    //   937: getfield R0 : Lm/d;
    //   940: invokevirtual z : ()V
    //   943: iload #11
    //   945: istore #10
    //   947: goto -> 998
    //   950: astore #17
    //   952: aload #17
    //   954: invokevirtual printStackTrace : ()V
    //   957: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   960: astore #18
    //   962: new java/lang/StringBuilder
    //   965: dup
    //   966: invokespecial <init> : ()V
    //   969: astore #19
    //   971: aload #19
    //   973: ldc_w 'EXCEPTION : '
    //   976: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   979: pop
    //   980: aload #19
    //   982: aload #17
    //   984: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   987: pop
    //   988: aload #18
    //   990: aload #19
    //   992: invokevirtual toString : ()Ljava/lang/String;
    //   995: invokevirtual println : (Ljava/lang/String;)V
    //   998: iload #10
    //   1000: ifeq -> 1019
    //   1003: aload_0
    //   1004: aload_0
    //   1005: getfield R0 : Lm/d;
    //   1008: getstatic p/k.a : [Z
    //   1011: invokevirtual Z1 : (Lm/d;[Z)Z
    //   1014: istore #10
    //   1016: goto -> 1067
    //   1019: aload_0
    //   1020: aload_0
    //   1021: getfield R0 : Lm/d;
    //   1024: iload #13
    //   1026: invokevirtual q1 : (Lm/d;Z)V
    //   1029: iconst_0
    //   1030: istore_2
    //   1031: iload_2
    //   1032: iload #9
    //   1034: if_icmpge -> 1064
    //   1037: aload_0
    //   1038: getfield L0 : Ljava/util/ArrayList;
    //   1041: iload_2
    //   1042: invokevirtual get : (I)Ljava/lang/Object;
    //   1045: checkcast p/e
    //   1048: aload_0
    //   1049: getfield R0 : Lm/d;
    //   1052: iload #13
    //   1054: invokevirtual q1 : (Lm/d;Z)V
    //   1057: iload_2
    //   1058: iconst_1
    //   1059: iadd
    //   1060: istore_2
    //   1061: goto -> 1031
    //   1064: iconst_0
    //   1065: istore #10
    //   1067: iload #6
    //   1069: ifeq -> 1274
    //   1072: iload #8
    //   1074: bipush #8
    //   1076: if_icmpge -> 1274
    //   1079: getstatic p/k.a : [Z
    //   1082: iconst_2
    //   1083: baload
    //   1084: ifeq -> 1274
    //   1087: iconst_0
    //   1088: istore_3
    //   1089: iconst_0
    //   1090: istore_2
    //   1091: iconst_0
    //   1092: istore #7
    //   1094: iload_3
    //   1095: iload #9
    //   1097: if_icmpge -> 1154
    //   1100: aload_0
    //   1101: getfield L0 : Ljava/util/ArrayList;
    //   1104: iload_3
    //   1105: invokevirtual get : (I)Ljava/lang/Object;
    //   1108: checkcast p/e
    //   1111: astore #17
    //   1113: iload #7
    //   1115: aload #17
    //   1117: getfield f0 : I
    //   1120: aload #17
    //   1122: invokevirtual W : ()I
    //   1125: iadd
    //   1126: invokestatic max : (II)I
    //   1129: istore #7
    //   1131: iload_2
    //   1132: aload #17
    //   1134: getfield g0 : I
    //   1137: aload #17
    //   1139: invokevirtual x : ()I
    //   1142: iadd
    //   1143: invokestatic max : (II)I
    //   1146: istore_2
    //   1147: iload_3
    //   1148: iconst_1
    //   1149: iadd
    //   1150: istore_3
    //   1151: goto -> 1094
    //   1154: aload_0
    //   1155: getfield m0 : I
    //   1158: iload #7
    //   1160: invokestatic max : (II)I
    //   1163: istore #7
    //   1165: aload_0
    //   1166: getfield n0 : I
    //   1169: iload_2
    //   1170: invokestatic max : (II)I
    //   1173: istore_3
    //   1174: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   1177: astore #17
    //   1179: iload_1
    //   1180: istore_2
    //   1181: iload #10
    //   1183: istore #11
    //   1185: aload #15
    //   1187: aload #17
    //   1189: if_acmpne -> 1226
    //   1192: iload_1
    //   1193: istore_2
    //   1194: iload #10
    //   1196: istore #11
    //   1198: aload_0
    //   1199: invokevirtual W : ()I
    //   1202: iload #7
    //   1204: if_icmpge -> 1226
    //   1207: aload_0
    //   1208: iload #7
    //   1210: invokevirtual k1 : (I)V
    //   1213: aload_0
    //   1214: getfield Z : [Lp/e$b;
    //   1217: iconst_0
    //   1218: aload #17
    //   1220: aastore
    //   1221: iconst_1
    //   1222: istore_2
    //   1223: iconst_1
    //   1224: istore #11
    //   1226: iload_2
    //   1227: istore_1
    //   1228: iload #11
    //   1230: istore #10
    //   1232: aload #14
    //   1234: aload #17
    //   1236: if_acmpne -> 1274
    //   1239: iload_2
    //   1240: istore_1
    //   1241: iload #11
    //   1243: istore #10
    //   1245: aload_0
    //   1246: invokevirtual x : ()I
    //   1249: iload_3
    //   1250: if_icmpge -> 1274
    //   1253: aload_0
    //   1254: iload_3
    //   1255: invokevirtual L0 : (I)V
    //   1258: aload_0
    //   1259: getfield Z : [Lp/e$b;
    //   1262: iconst_1
    //   1263: aload #17
    //   1265: aastore
    //   1266: iconst_1
    //   1267: istore_1
    //   1268: iconst_1
    //   1269: istore #10
    //   1271: goto -> 1274
    //   1274: aload_0
    //   1275: getfield m0 : I
    //   1278: aload_0
    //   1279: invokevirtual W : ()I
    //   1282: invokestatic max : (II)I
    //   1285: istore_2
    //   1286: iload_2
    //   1287: aload_0
    //   1288: invokevirtual W : ()I
    //   1291: if_icmple -> 1313
    //   1294: aload_0
    //   1295: iload_2
    //   1296: invokevirtual k1 : (I)V
    //   1299: aload_0
    //   1300: getfield Z : [Lp/e$b;
    //   1303: iconst_0
    //   1304: getstatic p/e$b.FIXED : Lp/e$b;
    //   1307: aastore
    //   1308: iconst_1
    //   1309: istore_1
    //   1310: iconst_1
    //   1311: istore #10
    //   1313: aload_0
    //   1314: getfield n0 : I
    //   1317: aload_0
    //   1318: invokevirtual x : ()I
    //   1321: invokestatic max : (II)I
    //   1324: istore_2
    //   1325: iload_2
    //   1326: aload_0
    //   1327: invokevirtual x : ()I
    //   1330: if_icmple -> 1355
    //   1333: aload_0
    //   1334: iload_2
    //   1335: invokevirtual L0 : (I)V
    //   1338: aload_0
    //   1339: getfield Z : [Lp/e$b;
    //   1342: iconst_1
    //   1343: getstatic p/e$b.FIXED : Lp/e$b;
    //   1346: aastore
    //   1347: iconst_1
    //   1348: istore_1
    //   1349: iconst_1
    //   1350: istore #10
    //   1352: goto -> 1355
    //   1355: iload_1
    //   1356: istore_3
    //   1357: iload #10
    //   1359: istore #12
    //   1361: iload_1
    //   1362: ifne -> 1513
    //   1365: aload_0
    //   1366: getfield Z : [Lp/e$b;
    //   1369: iconst_0
    //   1370: aaload
    //   1371: astore #17
    //   1373: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   1376: astore #18
    //   1378: iload_1
    //   1379: istore_2
    //   1380: iload #10
    //   1382: istore #11
    //   1384: aload #17
    //   1386: aload #18
    //   1388: if_acmpne -> 1442
    //   1391: iload_1
    //   1392: istore_2
    //   1393: iload #10
    //   1395: istore #11
    //   1397: iload #4
    //   1399: ifle -> 1442
    //   1402: iload_1
    //   1403: istore_2
    //   1404: iload #10
    //   1406: istore #11
    //   1408: aload_0
    //   1409: invokevirtual W : ()I
    //   1412: iload #4
    //   1414: if_icmple -> 1442
    //   1417: aload_0
    //   1418: iconst_1
    //   1419: putfield h1 : Z
    //   1422: aload_0
    //   1423: getfield Z : [Lp/e$b;
    //   1426: iconst_0
    //   1427: getstatic p/e$b.FIXED : Lp/e$b;
    //   1430: aastore
    //   1431: aload_0
    //   1432: iload #4
    //   1434: invokevirtual k1 : (I)V
    //   1437: iconst_1
    //   1438: istore_2
    //   1439: iconst_1
    //   1440: istore #11
    //   1442: iload_2
    //   1443: istore_3
    //   1444: iload #11
    //   1446: istore #12
    //   1448: aload_0
    //   1449: getfield Z : [Lp/e$b;
    //   1452: iconst_1
    //   1453: aaload
    //   1454: aload #18
    //   1456: if_acmpne -> 1513
    //   1459: iload_2
    //   1460: istore_3
    //   1461: iload #11
    //   1463: istore #12
    //   1465: iload #5
    //   1467: ifle -> 1513
    //   1470: iload_2
    //   1471: istore_3
    //   1472: iload #11
    //   1474: istore #12
    //   1476: aload_0
    //   1477: invokevirtual x : ()I
    //   1480: iload #5
    //   1482: if_icmple -> 1513
    //   1485: aload_0
    //   1486: iconst_1
    //   1487: putfield i1 : Z
    //   1490: aload_0
    //   1491: getfield Z : [Lp/e$b;
    //   1494: iconst_1
    //   1495: getstatic p/e$b.FIXED : Lp/e$b;
    //   1498: aastore
    //   1499: aload_0
    //   1500: iload #5
    //   1502: invokevirtual L0 : (I)V
    //   1505: iconst_1
    //   1506: istore #10
    //   1508: iconst_1
    //   1509: istore_1
    //   1510: goto -> 1519
    //   1513: iload_3
    //   1514: istore_1
    //   1515: iload #12
    //   1517: istore #10
    //   1519: iload #8
    //   1521: bipush #8
    //   1523: if_icmple -> 1532
    //   1526: iconst_0
    //   1527: istore #11
    //   1529: goto -> 1536
    //   1532: iload #10
    //   1534: istore #11
    //   1536: iload #8
    //   1538: istore_2
    //   1539: goto -> 571
    //   1542: aload_0
    //   1543: aload #16
    //   1545: putfield L0 : Ljava/util/ArrayList;
    //   1548: iload_1
    //   1549: ifeq -> 1570
    //   1552: aload_0
    //   1553: getfield Z : [Lp/e$b;
    //   1556: astore #16
    //   1558: aload #16
    //   1560: iconst_0
    //   1561: aload #15
    //   1563: aastore
    //   1564: aload #16
    //   1566: iconst_1
    //   1567: aload #14
    //   1569: aastore
    //   1570: aload_0
    //   1571: aload_0
    //   1572: getfield R0 : Lm/d;
    //   1575: invokevirtual v : ()Lm/c;
    //   1578: invokevirtual w0 : (Lm/c;)V
    //   1581: return
    // Exception table:
    //   from	to	target	type
    //   585	592	950	java/lang/Exception
    //   596	600	950	java/lang/Exception
    //   604	612	950	java/lang/Exception
    //   624	642	950	java/lang/Exception
    //   653	663	950	java/lang/Exception
    //   667	673	950	java/lang/Exception
    //   682	690	950	java/lang/Exception
    //   694	719	950	java/lang/Exception
    //   723	728	950	java/lang/Exception
    //   732	738	950	java/lang/Exception
    //   747	755	950	java/lang/Exception
    //   759	784	950	java/lang/Exception
    //   788	793	950	java/lang/Exception
    //   797	803	950	java/lang/Exception
    //   812	820	950	java/lang/Exception
    //   824	849	950	java/lang/Exception
    //   853	858	950	java/lang/Exception
    //   862	868	950	java/lang/Exception
    //   877	885	950	java/lang/Exception
    //   889	914	950	java/lang/Exception
    //   918	923	950	java/lang/Exception
    //   936	943	950	java/lang/Exception
  }
  
  public void t0() {
    this.R0.D();
    this.S0 = 0;
    this.U0 = 0;
    this.T0 = 0;
    this.V0 = 0;
    this.g1 = false;
    super.t0();
  }
  
  void v1(e parame, int paramInt) {
    if (paramInt == 0) {
      x1(parame);
      return;
    } 
    if (paramInt == 1)
      C1(parame); 
  }
  
  public boolean w1(d paramd) {
    boolean bool1 = T1(64);
    g(paramd, bool1);
    int j = this.L0.size();
    int i = 0;
    boolean bool = false;
    while (i < j) {
      e e1 = this.L0.get(i);
      e1.S0(0, false);
      e1.S0(1, false);
      if (e1 instanceof a)
        bool = true; 
      i++;
    } 
    if (bool)
      for (i = 0; i < j; i++) {
        e e1 = this.L0.get(i);
        if (e1 instanceof a)
          ((a)e1).y1(); 
      }  
    this.o1.clear();
    for (i = 0; i < j; i++) {
      e e1 = this.L0.get(i);
      if (e1.f())
        if (e1 instanceof l) {
          this.o1.add(e1);
        } else {
          e1.g(paramd, bool1);
        }  
    } 
    while (this.o1.size() > 0) {
      i = this.o1.size();
      for (l l : this.o1) {
        if (l.v1(this.o1)) {
          l.g(paramd, bool1);
          this.o1.remove(l);
          break;
        } 
      } 
      if (i == this.o1.size()) {
        Iterator<e> iterator = this.o1.iterator();
        while (iterator.hasNext())
          ((e)iterator.next()).g(paramd, bool1); 
        this.o1.clear();
      } 
    } 
    if (d.r) {
      HashSet<e> hashSet = new HashSet();
      for (i = 0; i < j; i++) {
        e e1 = this.L0.get(i);
        if (!e1.f())
          hashSet.add(e1); 
      } 
      if (A() == e.b.WRAP_CONTENT) {
        i = 0;
      } else {
        i = 1;
      } 
      e(this, paramd, hashSet, i, false);
      for (e e1 : hashSet) {
        k.a(this, paramd, e1);
        e1.g(paramd, bool1);
      } 
    } else {
      for (i = 0; i < j; i++) {
        e e1 = this.L0.get(i);
        if (e1 instanceof f) {
          e.b[] arrayOfB = e1.Z;
          e.b b1 = arrayOfB[0];
          e.b b2 = arrayOfB[1];
          e.b b3 = e.b.WRAP_CONTENT;
          if (b1 == b3)
            e1.P0(e.b.FIXED); 
          if (b2 == b3)
            e1.g1(e.b.FIXED); 
          e1.g(paramd, bool1);
          if (b1 == b3)
            e1.P0(b1); 
          if (b2 == b3)
            e1.g1(b2); 
        } else {
          k.a(this, paramd, e1);
          if (!e1.f())
            e1.g(paramd, bool1); 
        } 
      } 
    } 
    if (this.W0 > 0)
      b.b(this, paramd, null, 0); 
    if (this.X0 > 0)
      b.b(this, paramd, null, 1); 
    return true;
  }
  
  public void y1(d paramd) {
    WeakReference<d> weakReference = this.n1;
    if (weakReference == null || weakReference.get() == null || paramd.e() > ((d)this.n1.get()).e())
      this.n1 = new WeakReference<d>(paramd); 
  }
  
  public void z1(d paramd) {
    WeakReference<d> weakReference = this.l1;
    if (weakReference == null || weakReference.get() == null || paramd.e() > ((d)this.l1.get()).e())
      this.l1 = new WeakReference<d>(paramd); 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */