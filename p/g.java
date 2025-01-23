package p;

import java.util.ArrayList;
import m.d;

public class g extends l {
  private int a1 = -1;
  
  private int b1 = -1;
  
  private int c1 = -1;
  
  private int d1 = -1;
  
  private int e1 = -1;
  
  private int f1 = -1;
  
  private float g1 = 0.5F;
  
  private float h1 = 0.5F;
  
  private float i1 = 0.5F;
  
  private float j1 = 0.5F;
  
  private float k1 = 0.5F;
  
  private float l1 = 0.5F;
  
  private int m1 = 0;
  
  private int n1 = 0;
  
  private int o1 = 2;
  
  private int p1 = 2;
  
  private int q1 = 0;
  
  private int r1 = -1;
  
  private int s1 = 0;
  
  private ArrayList<a> t1 = new ArrayList<a>();
  
  private e[] u1 = null;
  
  private e[] v1 = null;
  
  private int[] w1 = null;
  
  private e[] x1;
  
  private int y1 = 0;
  
  private void j2(boolean paramBoolean) {
    if (this.w1 != null && this.v1 != null) {
      e e1;
      if (this.u1 == null)
        return; 
      int i;
      for (i = 0; i < this.y1; i++)
        this.x1[i].u0(); 
      int[] arrayOfInt = this.w1;
      int j = arrayOfInt[0];
      int k = arrayOfInt[1];
      float f = this.g1;
      arrayOfInt = null;
      i = 0;
      while (i < j) {
        int m;
        e e2;
        if (paramBoolean) {
          m = j - i - 1;
          f = 1.0F - this.g1;
        } else {
          m = i;
        } 
        e e3 = this.v1[m];
        int[] arrayOfInt1 = arrayOfInt;
        if (e3 != null)
          if (e3.V() == 8) {
            arrayOfInt1 = arrayOfInt;
          } else {
            if (i == 0) {
              e3.k(e3.O, this.O, z1());
              e3.N0(this.a1);
              e3.M0(f);
            } 
            if (i == j - 1)
              e3.k(e3.Q, this.Q, A1()); 
            if (i > 0 && arrayOfInt != null) {
              e3.k(e3.O, ((e)arrayOfInt).Q, this.m1);
              arrayOfInt.k(((e)arrayOfInt).Q, e3.O, 0);
            } 
            e2 = e3;
          }  
        i++;
        e1 = e2;
      } 
      i = 0;
      while (i < k) {
        e e3 = this.u1[i];
        e e2 = e1;
        if (e3 != null)
          if (e3.V() == 8) {
            e2 = e1;
          } else {
            if (i == 0) {
              e3.k(e3.P, this.P, B1());
              e3.e1(this.b1);
              e3.d1(this.h1);
            } 
            if (i == k - 1)
              e3.k(e3.R, this.R, y1()); 
            if (i > 0 && e1 != null) {
              e3.k(e3.P, e1.R, this.n1);
              e1.k(e1.R, e3.P, 0);
            } 
            e2 = e3;
          }  
        i++;
        e1 = e2;
      } 
      for (i = 0; i < j; i++) {
        int m;
        for (m = 0; m < k; m++) {
          int n = m * j + i;
          if (this.s1 == 1)
            n = i * k + m; 
          e[] arrayOfE = this.x1;
          if (n < arrayOfE.length) {
            e e2 = arrayOfE[n];
            if (e2 != null && e2.V() != 8) {
              e e3 = this.v1[i];
              e e4 = this.u1[m];
              if (e2 != e3) {
                e2.k(e2.O, e3.O, 0);
                e2.k(e2.Q, e3.Q, 0);
              } 
              if (e2 != e4) {
                e2.k(e2.P, e4.P, 0);
                e2.k(e2.R, e4.R, 0);
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  private final int k2(e parame, int paramInt) {
    if (parame == null)
      return 0; 
    if (parame.T() == e.b.MATCH_CONSTRAINT) {
      int i = parame.x;
      if (i == 0)
        return 0; 
      if (i == 2) {
        paramInt = (int)(parame.E * paramInt);
        if (paramInt != parame.x()) {
          parame.Y0(true);
          D1(parame, parame.A(), parame.W(), e.b.FIXED, paramInt);
        } 
        return paramInt;
      } 
      if (i == 1)
        return parame.x(); 
      if (i == 3)
        return (int)(parame.W() * parame.d0 + 0.5F); 
    } 
    return parame.x();
  }
  
  private final int l2(e parame, int paramInt) {
    if (parame == null)
      return 0; 
    if (parame.A() == e.b.MATCH_CONSTRAINT) {
      int i = parame.w;
      if (i == 0)
        return 0; 
      if (i == 2) {
        paramInt = (int)(parame.B * paramInt);
        if (paramInt != parame.W()) {
          parame.Y0(true);
          D1(parame, e.b.FIXED, paramInt, parame.T(), parame.x());
        } 
        return paramInt;
      } 
      if (i == 1)
        return parame.W(); 
      if (i == 3)
        return (int)(parame.x() * parame.d0 + 0.5F); 
    } 
    return parame.W();
  }
  
  private void m2(e[] paramArrayOfe, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 126
    //   4: aload_0
    //   5: getfield r1 : I
    //   8: istore #6
    //   10: iload #6
    //   12: istore #8
    //   14: iload #6
    //   16: ifgt -> 116
    //   19: iconst_0
    //   20: istore #6
    //   22: iconst_0
    //   23: istore #9
    //   25: iconst_0
    //   26: istore #7
    //   28: iload #6
    //   30: istore #8
    //   32: iload #9
    //   34: iload_2
    //   35: if_icmpge -> 116
    //   38: iload #7
    //   40: istore #8
    //   42: iload #9
    //   44: ifle -> 56
    //   47: iload #7
    //   49: aload_0
    //   50: getfield m1 : I
    //   53: iadd
    //   54: istore #8
    //   56: aload_1
    //   57: iload #9
    //   59: aaload
    //   60: astore #13
    //   62: aload #13
    //   64: ifnonnull -> 74
    //   67: iload #8
    //   69: istore #7
    //   71: goto -> 107
    //   74: iload #8
    //   76: aload_0
    //   77: aload #13
    //   79: iload #4
    //   81: invokespecial l2 : (Lp/e;I)I
    //   84: iadd
    //   85: istore #7
    //   87: iload #7
    //   89: iload #4
    //   91: if_icmple -> 101
    //   94: iload #6
    //   96: istore #8
    //   98: goto -> 116
    //   101: iload #6
    //   103: iconst_1
    //   104: iadd
    //   105: istore #6
    //   107: iload #9
    //   109: iconst_1
    //   110: iadd
    //   111: istore #9
    //   113: goto -> 28
    //   116: iload #8
    //   118: istore #7
    //   120: iconst_0
    //   121: istore #6
    //   123: goto -> 245
    //   126: aload_0
    //   127: getfield r1 : I
    //   130: istore #6
    //   132: iload #6
    //   134: istore #8
    //   136: iload #6
    //   138: ifgt -> 238
    //   141: iconst_0
    //   142: istore #6
    //   144: iconst_0
    //   145: istore #9
    //   147: iconst_0
    //   148: istore #7
    //   150: iload #6
    //   152: istore #8
    //   154: iload #9
    //   156: iload_2
    //   157: if_icmpge -> 238
    //   160: iload #7
    //   162: istore #8
    //   164: iload #9
    //   166: ifle -> 178
    //   169: iload #7
    //   171: aload_0
    //   172: getfield n1 : I
    //   175: iadd
    //   176: istore #8
    //   178: aload_1
    //   179: iload #9
    //   181: aaload
    //   182: astore #13
    //   184: aload #13
    //   186: ifnonnull -> 196
    //   189: iload #8
    //   191: istore #7
    //   193: goto -> 229
    //   196: iload #8
    //   198: aload_0
    //   199: aload #13
    //   201: iload #4
    //   203: invokespecial k2 : (Lp/e;I)I
    //   206: iadd
    //   207: istore #7
    //   209: iload #7
    //   211: iload #4
    //   213: if_icmple -> 223
    //   216: iload #6
    //   218: istore #8
    //   220: goto -> 238
    //   223: iload #6
    //   225: iconst_1
    //   226: iadd
    //   227: istore #6
    //   229: iload #9
    //   231: iconst_1
    //   232: iadd
    //   233: istore #9
    //   235: goto -> 150
    //   238: iconst_0
    //   239: istore #7
    //   241: iload #8
    //   243: istore #6
    //   245: aload_0
    //   246: getfield w1 : [I
    //   249: ifnonnull -> 259
    //   252: aload_0
    //   253: iconst_2
    //   254: newarray int
    //   256: putfield w1 : [I
    //   259: iload #6
    //   261: ifne -> 277
    //   264: iload #6
    //   266: istore #11
    //   268: iload #7
    //   270: istore #9
    //   272: iload_3
    //   273: iconst_1
    //   274: if_icmpeq -> 294
    //   277: iload #7
    //   279: ifne -> 308
    //   282: iload_3
    //   283: ifne -> 308
    //   286: iload #7
    //   288: istore #9
    //   290: iload #6
    //   292: istore #11
    //   294: iconst_1
    //   295: istore #12
    //   297: iload #11
    //   299: istore #6
    //   301: iload #9
    //   303: istore #7
    //   305: goto -> 311
    //   308: iconst_0
    //   309: istore #12
    //   311: iload #12
    //   313: ifne -> 844
    //   316: iload_3
    //   317: ifne -> 336
    //   320: iload_2
    //   321: i2f
    //   322: iload #7
    //   324: i2f
    //   325: fdiv
    //   326: f2d
    //   327: invokestatic ceil : (D)D
    //   330: d2i
    //   331: istore #6
    //   333: goto -> 349
    //   336: iload_2
    //   337: i2f
    //   338: iload #6
    //   340: i2f
    //   341: fdiv
    //   342: f2d
    //   343: invokestatic ceil : (D)D
    //   346: d2i
    //   347: istore #7
    //   349: aload_0
    //   350: getfield v1 : [Lp/e;
    //   353: astore #13
    //   355: aload #13
    //   357: ifnull -> 380
    //   360: aload #13
    //   362: arraylength
    //   363: iload #7
    //   365: if_icmpge -> 371
    //   368: goto -> 380
    //   371: aload #13
    //   373: aconst_null
    //   374: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
    //   377: goto -> 389
    //   380: aload_0
    //   381: iload #7
    //   383: anewarray p/e
    //   386: putfield v1 : [Lp/e;
    //   389: aload_0
    //   390: getfield u1 : [Lp/e;
    //   393: astore #13
    //   395: aload #13
    //   397: ifnull -> 420
    //   400: aload #13
    //   402: arraylength
    //   403: iload #6
    //   405: if_icmpge -> 411
    //   408: goto -> 420
    //   411: aload #13
    //   413: aconst_null
    //   414: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
    //   417: goto -> 429
    //   420: aload_0
    //   421: iload #6
    //   423: anewarray p/e
    //   426: putfield u1 : [Lp/e;
    //   429: iconst_0
    //   430: istore #8
    //   432: iload #8
    //   434: iload #7
    //   436: if_icmpge -> 602
    //   439: iconst_0
    //   440: istore #9
    //   442: iload #9
    //   444: iload #6
    //   446: if_icmpge -> 593
    //   449: iload #9
    //   451: iload #7
    //   453: imul
    //   454: iload #8
    //   456: iadd
    //   457: istore #10
    //   459: iload_3
    //   460: iconst_1
    //   461: if_icmpne -> 474
    //   464: iload #8
    //   466: iload #6
    //   468: imul
    //   469: iload #9
    //   471: iadd
    //   472: istore #10
    //   474: iload #10
    //   476: aload_1
    //   477: arraylength
    //   478: if_icmplt -> 484
    //   481: goto -> 584
    //   484: aload_1
    //   485: iload #10
    //   487: aaload
    //   488: astore #13
    //   490: aload #13
    //   492: ifnonnull -> 498
    //   495: goto -> 584
    //   498: aload_0
    //   499: aload #13
    //   501: iload #4
    //   503: invokespecial l2 : (Lp/e;I)I
    //   506: istore #10
    //   508: aload_0
    //   509: getfield v1 : [Lp/e;
    //   512: iload #8
    //   514: aaload
    //   515: astore #14
    //   517: aload #14
    //   519: ifnull -> 532
    //   522: aload #14
    //   524: invokevirtual W : ()I
    //   527: iload #10
    //   529: if_icmpge -> 541
    //   532: aload_0
    //   533: getfield v1 : [Lp/e;
    //   536: iload #8
    //   538: aload #13
    //   540: aastore
    //   541: aload_0
    //   542: aload #13
    //   544: iload #4
    //   546: invokespecial k2 : (Lp/e;I)I
    //   549: istore #10
    //   551: aload_0
    //   552: getfield u1 : [Lp/e;
    //   555: iload #9
    //   557: aaload
    //   558: astore #14
    //   560: aload #14
    //   562: ifnull -> 575
    //   565: aload #14
    //   567: invokevirtual x : ()I
    //   570: iload #10
    //   572: if_icmpge -> 584
    //   575: aload_0
    //   576: getfield u1 : [Lp/e;
    //   579: iload #9
    //   581: aload #13
    //   583: aastore
    //   584: iload #9
    //   586: iconst_1
    //   587: iadd
    //   588: istore #9
    //   590: goto -> 442
    //   593: iload #8
    //   595: iconst_1
    //   596: iadd
    //   597: istore #8
    //   599: goto -> 432
    //   602: iconst_0
    //   603: istore #9
    //   605: iconst_0
    //   606: istore #8
    //   608: iload #9
    //   610: iload #7
    //   612: if_icmpge -> 677
    //   615: aload_0
    //   616: getfield v1 : [Lp/e;
    //   619: iload #9
    //   621: aaload
    //   622: astore #13
    //   624: iload #8
    //   626: istore #10
    //   628: aload #13
    //   630: ifnull -> 664
    //   633: iload #8
    //   635: istore #10
    //   637: iload #9
    //   639: ifle -> 651
    //   642: iload #8
    //   644: aload_0
    //   645: getfield m1 : I
    //   648: iadd
    //   649: istore #10
    //   651: iload #10
    //   653: aload_0
    //   654: aload #13
    //   656: iload #4
    //   658: invokespecial l2 : (Lp/e;I)I
    //   661: iadd
    //   662: istore #10
    //   664: iload #9
    //   666: iconst_1
    //   667: iadd
    //   668: istore #9
    //   670: iload #10
    //   672: istore #8
    //   674: goto -> 608
    //   677: iconst_0
    //   678: istore #9
    //   680: iconst_0
    //   681: istore #10
    //   683: iload #9
    //   685: iload #6
    //   687: if_icmpge -> 752
    //   690: aload_0
    //   691: getfield u1 : [Lp/e;
    //   694: iload #9
    //   696: aaload
    //   697: astore #13
    //   699: iload #10
    //   701: istore #11
    //   703: aload #13
    //   705: ifnull -> 739
    //   708: iload #10
    //   710: istore #11
    //   712: iload #9
    //   714: ifle -> 726
    //   717: iload #10
    //   719: aload_0
    //   720: getfield n1 : I
    //   723: iadd
    //   724: istore #11
    //   726: iload #11
    //   728: aload_0
    //   729: aload #13
    //   731: iload #4
    //   733: invokespecial k2 : (Lp/e;I)I
    //   736: iadd
    //   737: istore #11
    //   739: iload #9
    //   741: iconst_1
    //   742: iadd
    //   743: istore #9
    //   745: iload #11
    //   747: istore #10
    //   749: goto -> 683
    //   752: aload #5
    //   754: iconst_0
    //   755: iload #8
    //   757: iastore
    //   758: aload #5
    //   760: iconst_1
    //   761: iload #10
    //   763: iastore
    //   764: iload_3
    //   765: ifne -> 806
    //   768: iload #6
    //   770: istore #11
    //   772: iload #7
    //   774: istore #9
    //   776: iload #8
    //   778: iload #4
    //   780: if_icmple -> 294
    //   783: iload #6
    //   785: istore #11
    //   787: iload #7
    //   789: istore #9
    //   791: iload #7
    //   793: iconst_1
    //   794: if_icmple -> 294
    //   797: iload #7
    //   799: iconst_1
    //   800: isub
    //   801: istore #7
    //   803: goto -> 311
    //   806: iload #6
    //   808: istore #11
    //   810: iload #7
    //   812: istore #9
    //   814: iload #10
    //   816: iload #4
    //   818: if_icmple -> 294
    //   821: iload #6
    //   823: istore #11
    //   825: iload #7
    //   827: istore #9
    //   829: iload #6
    //   831: iconst_1
    //   832: if_icmple -> 294
    //   835: iload #6
    //   837: iconst_1
    //   838: isub
    //   839: istore #6
    //   841: goto -> 311
    //   844: aload_0
    //   845: getfield w1 : [I
    //   848: astore_1
    //   849: aload_1
    //   850: iconst_0
    //   851: iload #7
    //   853: iastore
    //   854: aload_1
    //   855: iconst_1
    //   856: iload #6
    //   858: iastore
    //   859: return
  }
  
  private void n2(e[] paramArrayOfe, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    e e1;
    if (paramInt1 == 0)
      return; 
    this.t1.clear();
    a a = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
    this.t1.add(a);
    if (paramInt2 == 0) {
      Object object;
      boolean bool = false;
      int i3 = 0;
      int i4 = 0;
      while (true) {
        Object object1 = object;
        if (i4 < paramInt1) {
          boolean bool1;
          a a1;
          e1 = paramArrayOfe[i4];
          int i5 = l2(e1, paramInt3);
          object1 = object;
          if (e1.A() == e.b.MATCH_CONSTRAINT)
            i = object + 1; 
          if ((i3 == paramInt3 || this.m1 + i3 + i5 > paramInt3) && a.a(a) != null) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          boolean bool2 = bool1;
          if (!bool1) {
            bool2 = bool1;
            if (i4 > 0) {
              int i6 = this.r1;
              bool2 = bool1;
              if (i6 > 0) {
                bool2 = bool1;
                if (i4 % i6 == 0)
                  bool2 = true; 
              } 
            } 
          } 
          if (bool2) {
            a1 = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
            a1.i(i4);
            this.t1.add(a1);
          } else {
            a1 = a;
            if (i4 > 0) {
              i3 += this.m1 + i5;
              continue;
            } 
          } 
          i3 = i5;
          a = a1;
          continue;
        } 
        break;
        a.b((e)SYNTHETIC_LOCAL_VARIABLE_16);
        i4++;
        object = SYNTHETIC_LOCAL_VARIABLE_7;
      } 
    } else {
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      while (true) {
        i = i3;
        if (i5 < paramInt1) {
          a a1;
          e1 = paramArrayOfe[i5];
          int i7 = k2(e1, paramInt3);
          i = i3;
          if (e1.T() == e.b.MATCH_CONSTRAINT)
            i = i3 + 1; 
          if ((i4 == paramInt3 || this.n1 + i4 + i7 > paramInt3) && a.a(a) != null) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          int i6 = i3;
          if (i3 == 0) {
            i6 = i3;
            if (i5 > 0) {
              int i8 = this.r1;
              i6 = i3;
              if (i8 > 0) {
                i6 = i3;
                if (i5 % i8 == 0)
                  i6 = 1; 
              } 
            } 
          } 
          if (i6 != 0) {
            a1 = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
            a1.i(i5);
            this.t1.add(a1);
          } else {
            a1 = a;
            if (i5 > 0) {
              i4 += this.n1 + i7;
              continue;
            } 
          } 
          i4 = i7;
          a = a1;
          continue;
        } 
        break;
        a.b(e1);
        i5++;
        i3 = i;
      } 
    } 
    int i2 = this.t1.size();
    d d1 = this.O;
    d d4 = this.P;
    d d2 = this.Q;
    d d3 = this.R;
    int j = z1();
    int k = B1();
    int n = A1();
    int m = y1();
    e.b b1 = A();
    e.b b2 = e.b.WRAP_CONTENT;
    if (b1 == b2 || T() == b2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (i > 0 && paramInt1 != 0)
      for (paramInt1 = 0; paramInt1 < i2; paramInt1++) {
        a a1 = this.t1.get(paramInt1);
        if (paramInt2 == 0) {
          a1.g(paramInt3 - a1.f());
        } else {
          a1.g(paramInt3 - a1.e());
        } 
      }  
    int i = 0;
    int i1 = 0;
    paramInt1 = 0;
    while (paramInt1 < i2) {
      int i3;
      a a1 = this.t1.get(paramInt1);
      if (paramInt2 == 0) {
        if (paramInt1 < i2 - 1) {
          d3 = (a.a((a)this.t1.get(paramInt1 + 1))).P;
          i3 = 0;
        } else {
          d3 = this.R;
          i3 = y1();
        } 
        d d = (a.a(a1)).R;
        a1.j(paramInt2, d1, d4, d2, d3, j, k, n, i3, paramInt3);
        k = Math.max(i1, a1.f());
        m = i + a1.e();
        i = m;
        if (paramInt1 > 0)
          i = m + this.n1; 
        d4 = d;
        i1 = 0;
        m = i3;
        i3 = k;
        k = i1;
      } else {
        n = paramInt1;
        if (n < i2 - 1) {
          d2 = (a.a((a)this.t1.get(n + 1))).O;
          i3 = 0;
        } else {
          d2 = this.Q;
          i3 = A1();
        } 
        d d = (a.a(a1)).Q;
        a1.j(paramInt2, d1, d4, d2, d3, j, k, i3, m, paramInt3);
        j = i1 + a1.f();
        i1 = Math.max(i, a1.e());
        i = j;
        if (n > 0)
          i = j + this.m1; 
        j = i1;
        n = i3;
        d1 = d;
        i1 = 0;
        i3 = i;
        i = j;
        j = i1;
      } 
      paramInt1++;
      i1 = i3;
    } 
    paramArrayOfint[0] = i1;
    paramArrayOfint[1] = i;
  }
  
  private void o2(e[] paramArrayOfe, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    if (paramInt1 == 0)
      return; 
    this.t1.clear();
    a a = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
    this.t1.add(a);
    if (paramInt2 == 0) {
      int i6 = 0;
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      while (true) {
        i = i3;
        if (i5 < paramInt1) {
          int i8 = i6 + 1;
          e e1 = paramArrayOfe[i5];
          i6 = l2(e1, paramInt3);
          i = i3;
          if (e1.A() == e.b.MATCH_CONSTRAINT)
            i = i3 + 1; 
          if ((i4 == paramInt3 || this.m1 + i4 + i6 > paramInt3) && a.a(a) != null) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          int i7 = i3;
          if (i3 == 0) {
            i7 = i3;
            if (i5 > 0) {
              int i9 = this.r1;
              i7 = i3;
              if (i9 > 0) {
                i7 = i3;
                if (i8 > i9)
                  i7 = 1; 
              } 
            } 
          } 
          if (i7 != 0) {
            a = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
            a.i(i5);
            this.t1.add(a);
            i3 = i8;
            i4 = i6;
          } else {
            if (i5 > 0) {
              i4 += this.m1 + i6;
            } else {
              i4 = i6;
            } 
            i3 = 0;
          } 
          a.b(e1);
          i5++;
          i6 = i3;
          i3 = i;
          continue;
        } 
        break;
      } 
    } else {
      int i5 = 0;
      int i3 = 0;
      int i4 = 0;
      while (true) {
        i = i3;
        if (i4 < paramInt1) {
          a a1;
          e e1 = paramArrayOfe[i4];
          int i7 = k2(e1, paramInt3);
          i = i3;
          if (e1.T() == e.b.MATCH_CONSTRAINT)
            i = i3 + 1; 
          if ((i5 == paramInt3 || this.n1 + i5 + i7 > paramInt3) && a.a(a) != null) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          int i6 = i3;
          if (i3 == 0) {
            i6 = i3;
            if (i4 > 0) {
              int i8 = this.r1;
              i6 = i3;
              if (i8 > 0) {
                i6 = i3;
                if (i8 < 0)
                  i6 = 1; 
              } 
            } 
          } 
          if (i6 != 0) {
            a1 = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
            a1.i(i4);
            this.t1.add(a1);
          } else {
            a1 = a;
            if (i4 > 0) {
              i3 = i5 + this.n1 + i7;
              continue;
            } 
          } 
          i3 = i7;
          a = a1;
          continue;
        } 
        break;
        a.b((e)SYNTHETIC_LOCAL_VARIABLE_16);
        i4++;
        i5 = i3;
        i3 = i;
      } 
    } 
    int i2 = this.t1.size();
    d d1 = this.O;
    d d4 = this.P;
    d d2 = this.Q;
    d d3 = this.R;
    int j = z1();
    int k = B1();
    int n = A1();
    int m = y1();
    e.b b1 = A();
    e.b b2 = e.b.WRAP_CONTENT;
    if (b1 == b2 || T() == b2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (i > 0 && paramInt1 != 0)
      for (paramInt1 = 0; paramInt1 < i2; paramInt1++) {
        a a1 = this.t1.get(paramInt1);
        if (paramInt2 == 0) {
          a1.g(paramInt3 - a1.f());
        } else {
          a1.g(paramInt3 - a1.e());
        } 
      }  
    int i = 0;
    int i1 = 0;
    paramInt1 = 0;
    while (paramInt1 < i2) {
      int i3;
      a a1 = this.t1.get(paramInt1);
      if (paramInt2 == 0) {
        if (paramInt1 < i2 - 1) {
          d3 = (a.a((a)this.t1.get(paramInt1 + 1))).P;
          i3 = 0;
        } else {
          d3 = this.R;
          i3 = y1();
        } 
        d d = (a.a(a1)).R;
        a1.j(paramInt2, d1, d4, d2, d3, j, k, n, i3, paramInt3);
        k = Math.max(i1, a1.f());
        m = i + a1.e();
        i = m;
        if (paramInt1 > 0)
          i = m + this.n1; 
        d4 = d;
        i1 = 0;
        m = i3;
        i3 = k;
        k = i1;
      } else {
        n = paramInt1;
        if (n < i2 - 1) {
          d2 = (a.a((a)this.t1.get(n + 1))).O;
          i3 = 0;
        } else {
          d2 = this.Q;
          i3 = A1();
        } 
        d d = (a.a(a1)).Q;
        a1.j(paramInt2, d1, d4, d2, d3, j, k, i3, m, paramInt3);
        j = i1 + a1.f();
        i1 = Math.max(i, a1.e());
        i = j;
        if (n > 0)
          i = j + this.m1; 
        j = i1;
        n = i3;
        d1 = d;
        i1 = 0;
        i3 = i;
        i = j;
        j = i1;
      } 
      paramInt1++;
      i1 = i3;
    } 
    paramArrayOfint[0] = i1;
    paramArrayOfint[1] = i;
  }
  
  private void p2(e[] paramArrayOfe, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    a a;
    if (paramInt1 == 0)
      return; 
    if (this.t1.size() == 0) {
      a = new a(this, paramInt2, this.O, this.P, this.Q, this.R, paramInt3);
      this.t1.add(a);
    } else {
      a = this.t1.get(0);
      a.c();
      d d1 = this.O;
      d d2 = this.P;
      d d3 = this.Q;
      d d4 = this.R;
      int i = z1();
      int j = B1();
      int k = A1();
      int m = y1();
      a.j(paramInt2, d1, d2, d3, d4, i, j, k, m, paramInt3);
    } 
    for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++)
      a.b(paramArrayOfe[paramInt2]); 
    paramArrayOfint[0] = a.f();
    paramArrayOfint[1] = a.e();
  }
  
  public void A2(float paramFloat) {
    this.l1 = paramFloat;
  }
  
  public void B2(int paramInt) {
    this.f1 = paramInt;
  }
  
  public void C1(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.M0 > 0 && !E1()) {
      H1(0, 0);
      G1(false);
      return;
    } 
    int i1 = z1();
    int i2 = A1();
    int m = B1();
    int n = y1();
    int[] arrayOfInt = new int[2];
    int j = paramInt2 - i1 - i2;
    int i = this.s1;
    if (i == 1)
      j = paramInt4 - m - n; 
    if (i == 0) {
      if (this.a1 == -1)
        this.a1 = 0; 
      if (this.b1 == -1)
        this.b1 = 0; 
    } else {
      if (this.a1 == -1)
        this.a1 = 0; 
      if (this.b1 == -1)
        this.b1 = 0; 
    } 
    e[] arrayOfE = this.L0;
    i = 0;
    int k = 0;
    while (true) {
      int i3 = this.M0;
      if (i < i3) {
        i3 = k;
        if (this.L0[i].V() == 8)
          i3 = k + 1; 
        i++;
        k = i3;
        continue;
      } 
      if (k > 0) {
        arrayOfE = new e[i3 - k];
        k = 0;
        for (i = 0; k < this.M0; i = i3) {
          e e1 = this.L0[k];
          i3 = i;
          if (e1.V() != 8) {
            arrayOfE[i] = e1;
            i3 = i + 1;
          } 
          k++;
        } 
      } else {
        i = i3;
      } 
      this.x1 = arrayOfE;
      this.y1 = i;
      k = this.q1;
      if (k != 0) {
        if (k != 1) {
          if (k != 2) {
            if (k == 3)
              o2(arrayOfE, i, this.s1, j, arrayOfInt); 
          } else {
            m2(arrayOfE, i, this.s1, j, arrayOfInt);
          } 
        } else {
          n2(arrayOfE, i, this.s1, j, arrayOfInt);
        } 
      } else {
        p2(arrayOfE, i, this.s1, j, arrayOfInt);
      } 
      boolean bool = true;
      j = arrayOfInt[0] + i1 + i2;
      i = arrayOfInt[1] + m + n;
      if (paramInt1 == 1073741824) {
        paramInt1 = paramInt2;
      } else if (paramInt1 == Integer.MIN_VALUE) {
        paramInt1 = Math.min(j, paramInt2);
      } else if (paramInt1 == 0) {
        paramInt1 = j;
      } else {
        paramInt1 = 0;
      } 
      if (paramInt3 == 1073741824) {
        paramInt2 = paramInt4;
      } else if (paramInt3 == Integer.MIN_VALUE) {
        paramInt2 = Math.min(i, paramInt4);
      } else if (paramInt3 == 0) {
        paramInt2 = i;
      } else {
        paramInt2 = 0;
      } 
      H1(paramInt1, paramInt2);
      k1(paramInt1);
      L0(paramInt2);
      if (this.M0 <= 0)
        bool = false; 
      G1(bool);
      return;
    } 
  }
  
  public void C2(int paramInt) {
    this.r1 = paramInt;
  }
  
  public void D2(int paramInt) {
    this.s1 = paramInt;
  }
  
  public void E2(int paramInt) {
    this.p1 = paramInt;
  }
  
  public void F2(float paramFloat) {
    this.h1 = paramFloat;
  }
  
  public void G2(int paramInt) {
    this.n1 = paramInt;
  }
  
  public void H2(int paramInt) {
    this.b1 = paramInt;
  }
  
  public void I2(int paramInt) {
    this.q1 = paramInt;
  }
  
  public void g(d paramd, boolean paramBoolean) {
    super.g(paramd, paramBoolean);
    if (K() != null && ((f)K()).P1()) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    int i = this.q1;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            int j = this.t1.size();
            for (i = 0; i < j; i++) {
              boolean bool;
              a a = this.t1.get(i);
              if (i == j - 1) {
                bool = true;
              } else {
                bool = false;
              } 
              a.d(paramBoolean, i, bool);
            } 
          } 
        } else {
          j2(paramBoolean);
        } 
      } else {
        int j = this.t1.size();
        for (i = 0; i < j; i++) {
          boolean bool;
          a a = this.t1.get(i);
          if (i == j - 1) {
            bool = true;
          } else {
            bool = false;
          } 
          a.d(paramBoolean, i, bool);
        } 
      } 
    } else if (this.t1.size() > 0) {
      ((a)this.t1.get(0)).d(paramBoolean, 0, true);
    } 
    G1(false);
  }
  
  public void q2(float paramFloat) {
    this.i1 = paramFloat;
  }
  
  public void r2(int paramInt) {
    this.c1 = paramInt;
  }
  
  public void s2(float paramFloat) {
    this.j1 = paramFloat;
  }
  
  public void t2(int paramInt) {
    this.d1 = paramInt;
  }
  
  public void u2(int paramInt) {
    this.o1 = paramInt;
  }
  
  public void v2(float paramFloat) {
    this.g1 = paramFloat;
  }
  
  public void w2(int paramInt) {
    this.m1 = paramInt;
  }
  
  public void x2(int paramInt) {
    this.a1 = paramInt;
  }
  
  public void y2(float paramFloat) {
    this.k1 = paramFloat;
  }
  
  public void z2(int paramInt) {
    this.e1 = paramInt;
  }
  
  private class a {
    private int a;
    
    private e b = null;
    
    int c = 0;
    
    private d d;
    
    private d e;
    
    private d f;
    
    private d g;
    
    private int h = 0;
    
    private int i = 0;
    
    private int j = 0;
    
    private int k = 0;
    
    private int l = 0;
    
    private int m = 0;
    
    private int n = 0;
    
    private int o = 0;
    
    private int p = 0;
    
    private int q = 0;
    
    public a(g this$0, int param1Int1, d param1d1, d param1d2, d param1d3, d param1d4, int param1Int2) {
      this.a = param1Int1;
      this.d = param1d1;
      this.e = param1d2;
      this.f = param1d3;
      this.g = param1d4;
      this.h = this$0.z1();
      this.i = this$0.B1();
      this.j = this$0.A1();
      this.k = this$0.y1();
      this.q = param1Int2;
    }
    
    private void h() {
      this.l = 0;
      this.m = 0;
      this.b = null;
      this.c = 0;
      int j = this.o;
      for (int i = 0; i < j; i++) {
        if (this.n + i >= g.d2(this.r))
          return; 
        e e1 = g.e2(this.r)[this.n + i];
        if (this.a == 0) {
          int m = e1.W();
          int k = g.P1(this.r);
          if (e1.V() == 8)
            k = 0; 
          this.l += m + k;
          k = g.c2(this.r, e1, this.q);
          if (this.b == null || this.c < k) {
            this.b = e1;
            this.c = k;
            this.m = k;
          } 
        } else {
          int m = g.b2(this.r, e1, this.q);
          int n = g.c2(this.r, e1, this.q);
          int k = g.Q1(this.r);
          if (e1.V() == 8)
            k = 0; 
          this.m += n + k;
          if (this.b == null || this.c < m) {
            this.b = e1;
            this.c = m;
            this.l = m;
          } 
        } 
      } 
    }
    
    public void b(e param1e) {
      int i = this.a;
      int j = 0;
      int k = 0;
      if (i == 0) {
        i = g.b2(this.r, param1e, this.q);
        if (param1e.A() == e.b.MATCH_CONSTRAINT) {
          this.p++;
          i = 0;
        } 
        j = g.P1(this.r);
        if (param1e.V() == 8)
          j = k; 
        this.l += i + j;
        i = g.c2(this.r, param1e, this.q);
        if (this.b == null || this.c < i) {
          this.b = param1e;
          this.c = i;
          this.m = i;
        } 
      } else {
        int m = g.b2(this.r, param1e, this.q);
        i = g.c2(this.r, param1e, this.q);
        if (param1e.T() == e.b.MATCH_CONSTRAINT) {
          this.p++;
          i = 0;
        } 
        k = g.Q1(this.r);
        if (param1e.V() != 8)
          j = k; 
        this.m += i + j;
        if (this.b == null || this.c < m) {
          this.b = param1e;
          this.c = m;
          this.l = m;
        } 
      } 
      this.o++;
    }
    
    public void c() {
      this.c = 0;
      this.b = null;
      this.l = 0;
      this.m = 0;
      this.n = 0;
      this.o = 0;
      this.p = 0;
    }
    
    public void d(boolean param1Boolean1, int param1Int, boolean param1Boolean2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield o : I
      //   4: istore #12
      //   6: iconst_0
      //   7: istore #6
      //   9: iload #6
      //   11: iload #12
      //   13: if_icmpge -> 72
      //   16: aload_0
      //   17: getfield n : I
      //   20: iload #6
      //   22: iadd
      //   23: aload_0
      //   24: getfield r : Lp/g;
      //   27: invokestatic d2 : (Lp/g;)I
      //   30: if_icmplt -> 36
      //   33: goto -> 72
      //   36: aload_0
      //   37: getfield r : Lp/g;
      //   40: invokestatic e2 : (Lp/g;)[Lp/e;
      //   43: aload_0
      //   44: getfield n : I
      //   47: iload #6
      //   49: iadd
      //   50: aaload
      //   51: astore #13
      //   53: aload #13
      //   55: ifnull -> 63
      //   58: aload #13
      //   60: invokevirtual u0 : ()V
      //   63: iload #6
      //   65: iconst_1
      //   66: iadd
      //   67: istore #6
      //   69: goto -> 9
      //   72: iload #12
      //   74: ifeq -> 1791
      //   77: aload_0
      //   78: getfield b : Lp/e;
      //   81: ifnonnull -> 85
      //   84: return
      //   85: iload_3
      //   86: ifeq -> 99
      //   89: iload_2
      //   90: ifne -> 99
      //   93: iconst_1
      //   94: istore #9
      //   96: goto -> 102
      //   99: iconst_0
      //   100: istore #9
      //   102: iconst_0
      //   103: istore #6
      //   105: iconst_m1
      //   106: istore #7
      //   108: iconst_m1
      //   109: istore #8
      //   111: iload #6
      //   113: iload #12
      //   115: if_icmpge -> 243
      //   118: iload_1
      //   119: ifeq -> 134
      //   122: iload #12
      //   124: iconst_1
      //   125: isub
      //   126: iload #6
      //   128: isub
      //   129: istore #10
      //   131: goto -> 138
      //   134: iload #6
      //   136: istore #10
      //   138: aload_0
      //   139: getfield n : I
      //   142: iload #10
      //   144: iadd
      //   145: aload_0
      //   146: getfield r : Lp/g;
      //   149: invokestatic d2 : (Lp/g;)I
      //   152: if_icmplt -> 158
      //   155: goto -> 243
      //   158: aload_0
      //   159: getfield r : Lp/g;
      //   162: invokestatic e2 : (Lp/g;)[Lp/e;
      //   165: aload_0
      //   166: getfield n : I
      //   169: iload #10
      //   171: iadd
      //   172: aaload
      //   173: astore #13
      //   175: iload #7
      //   177: istore #11
      //   179: iload #8
      //   181: istore #10
      //   183: aload #13
      //   185: ifnull -> 226
      //   188: iload #7
      //   190: istore #11
      //   192: iload #8
      //   194: istore #10
      //   196: aload #13
      //   198: invokevirtual V : ()I
      //   201: ifne -> 226
      //   204: iload #7
      //   206: istore #8
      //   208: iload #7
      //   210: iconst_m1
      //   211: if_icmpne -> 218
      //   214: iload #6
      //   216: istore #8
      //   218: iload #6
      //   220: istore #10
      //   222: iload #8
      //   224: istore #11
      //   226: iload #6
      //   228: iconst_1
      //   229: iadd
      //   230: istore #6
      //   232: iload #11
      //   234: istore #7
      //   236: iload #10
      //   238: istore #8
      //   240: goto -> 111
      //   243: aload_0
      //   244: getfield a : I
      //   247: istore #6
      //   249: aconst_null
      //   250: astore #14
      //   252: aconst_null
      //   253: astore #13
      //   255: iload #6
      //   257: ifne -> 1063
      //   260: aload_0
      //   261: getfield b : Lp/e;
      //   264: astore #16
      //   266: aload #16
      //   268: aload_0
      //   269: getfield r : Lp/g;
      //   272: invokestatic f2 : (Lp/g;)I
      //   275: invokevirtual e1 : (I)V
      //   278: aload_0
      //   279: getfield i : I
      //   282: istore #10
      //   284: iload #10
      //   286: istore #6
      //   288: iload_2
      //   289: ifle -> 304
      //   292: iload #10
      //   294: aload_0
      //   295: getfield r : Lp/g;
      //   298: invokestatic Q1 : (Lp/g;)I
      //   301: iadd
      //   302: istore #6
      //   304: aload #16
      //   306: getfield P : Lp/d;
      //   309: aload_0
      //   310: getfield e : Lp/d;
      //   313: iload #6
      //   315: invokevirtual a : (Lp/d;I)Z
      //   318: pop
      //   319: iload_3
      //   320: ifeq -> 340
      //   323: aload #16
      //   325: getfield R : Lp/d;
      //   328: aload_0
      //   329: getfield g : Lp/d;
      //   332: aload_0
      //   333: getfield k : I
      //   336: invokevirtual a : (Lp/d;I)Z
      //   339: pop
      //   340: iload_2
      //   341: ifle -> 364
      //   344: aload_0
      //   345: getfield e : Lp/d;
      //   348: getfield d : Lp/e;
      //   351: getfield R : Lp/d;
      //   354: aload #16
      //   356: getfield P : Lp/d;
      //   359: iconst_0
      //   360: invokevirtual a : (Lp/d;I)Z
      //   363: pop
      //   364: aload_0
      //   365: getfield r : Lp/g;
      //   368: invokestatic g2 : (Lp/g;)I
      //   371: iconst_3
      //   372: if_icmpne -> 464
      //   375: aload #16
      //   377: invokevirtual Z : ()Z
      //   380: ifne -> 464
      //   383: iconst_0
      //   384: istore_2
      //   385: iload_2
      //   386: iload #12
      //   388: if_icmpge -> 464
      //   391: iload_1
      //   392: ifeq -> 406
      //   395: iload #12
      //   397: iconst_1
      //   398: isub
      //   399: iload_2
      //   400: isub
      //   401: istore #6
      //   403: goto -> 409
      //   406: iload_2
      //   407: istore #6
      //   409: aload_0
      //   410: getfield n : I
      //   413: iload #6
      //   415: iadd
      //   416: aload_0
      //   417: getfield r : Lp/g;
      //   420: invokestatic d2 : (Lp/g;)I
      //   423: if_icmplt -> 429
      //   426: goto -> 464
      //   429: aload_0
      //   430: getfield r : Lp/g;
      //   433: invokestatic e2 : (Lp/g;)[Lp/e;
      //   436: aload_0
      //   437: getfield n : I
      //   440: iload #6
      //   442: iadd
      //   443: aaload
      //   444: astore #14
      //   446: aload #14
      //   448: invokevirtual Z : ()Z
      //   451: ifeq -> 457
      //   454: goto -> 468
      //   457: iload_2
      //   458: iconst_1
      //   459: iadd
      //   460: istore_2
      //   461: goto -> 385
      //   464: aload #16
      //   466: astore #14
      //   468: iconst_0
      //   469: istore #6
      //   471: iload #6
      //   473: iload #12
      //   475: if_icmpge -> 1791
      //   478: iload_1
      //   479: ifeq -> 493
      //   482: iload #12
      //   484: iconst_1
      //   485: isub
      //   486: iload #6
      //   488: isub
      //   489: istore_2
      //   490: goto -> 496
      //   493: iload #6
      //   495: istore_2
      //   496: aload_0
      //   497: getfield n : I
      //   500: iload_2
      //   501: iadd
      //   502: aload_0
      //   503: getfield r : Lp/g;
      //   506: invokestatic d2 : (Lp/g;)I
      //   509: if_icmplt -> 513
      //   512: return
      //   513: aload_0
      //   514: getfield r : Lp/g;
      //   517: invokestatic e2 : (Lp/g;)[Lp/e;
      //   520: aload_0
      //   521: getfield n : I
      //   524: iload_2
      //   525: iadd
      //   526: aaload
      //   527: astore #15
      //   529: aload #15
      //   531: ifnonnull -> 537
      //   534: goto -> 1054
      //   537: iload #6
      //   539: ifne -> 560
      //   542: aload #15
      //   544: aload #15
      //   546: getfield O : Lp/d;
      //   549: aload_0
      //   550: getfield d : Lp/d;
      //   553: aload_0
      //   554: getfield h : I
      //   557: invokevirtual k : (Lp/d;Lp/d;I)V
      //   560: iload_2
      //   561: ifne -> 738
      //   564: aload_0
      //   565: getfield r : Lp/g;
      //   568: invokestatic h2 : (Lp/g;)I
      //   571: istore #10
      //   573: aload_0
      //   574: getfield r : Lp/g;
      //   577: invokestatic i2 : (Lp/g;)F
      //   580: fstore #5
      //   582: fload #5
      //   584: fstore #4
      //   586: iload_1
      //   587: ifeq -> 596
      //   590: fconst_1
      //   591: fload #5
      //   593: fsub
      //   594: fstore #4
      //   596: aload_0
      //   597: getfield n : I
      //   600: ifne -> 660
      //   603: aload_0
      //   604: getfield r : Lp/g;
      //   607: invokestatic R1 : (Lp/g;)I
      //   610: iconst_m1
      //   611: if_icmpeq -> 660
      //   614: aload_0
      //   615: getfield r : Lp/g;
      //   618: invokestatic R1 : (Lp/g;)I
      //   621: istore_2
      //   622: iload_1
      //   623: ifeq -> 644
      //   626: aload_0
      //   627: getfield r : Lp/g;
      //   630: invokestatic S1 : (Lp/g;)F
      //   633: fstore #4
      //   635: fconst_1
      //   636: fload #4
      //   638: fsub
      //   639: fstore #4
      //   641: goto -> 653
      //   644: aload_0
      //   645: getfield r : Lp/g;
      //   648: invokestatic S1 : (Lp/g;)F
      //   651: fstore #4
      //   653: fload #4
      //   655: fstore #5
      //   657: goto -> 725
      //   660: iload #10
      //   662: istore_2
      //   663: fload #4
      //   665: fstore #5
      //   667: iload_3
      //   668: ifeq -> 725
      //   671: iload #10
      //   673: istore_2
      //   674: fload #4
      //   676: fstore #5
      //   678: aload_0
      //   679: getfield r : Lp/g;
      //   682: invokestatic T1 : (Lp/g;)I
      //   685: iconst_m1
      //   686: if_icmpeq -> 725
      //   689: aload_0
      //   690: getfield r : Lp/g;
      //   693: invokestatic T1 : (Lp/g;)I
      //   696: istore_2
      //   697: iload_1
      //   698: ifeq -> 713
      //   701: aload_0
      //   702: getfield r : Lp/g;
      //   705: invokestatic U1 : (Lp/g;)F
      //   708: fstore #4
      //   710: goto -> 635
      //   713: aload_0
      //   714: getfield r : Lp/g;
      //   717: invokestatic U1 : (Lp/g;)F
      //   720: fstore #4
      //   722: goto -> 653
      //   725: aload #15
      //   727: iload_2
      //   728: invokevirtual N0 : (I)V
      //   731: aload #15
      //   733: fload #5
      //   735: invokevirtual M0 : (F)V
      //   738: iload #6
      //   740: iload #12
      //   742: iconst_1
      //   743: isub
      //   744: if_icmpne -> 765
      //   747: aload #15
      //   749: aload #15
      //   751: getfield Q : Lp/d;
      //   754: aload_0
      //   755: getfield f : Lp/d;
      //   758: aload_0
      //   759: getfield j : I
      //   762: invokevirtual k : (Lp/d;Lp/d;I)V
      //   765: aload #13
      //   767: ifnull -> 846
      //   770: aload #15
      //   772: getfield O : Lp/d;
      //   775: aload #13
      //   777: getfield Q : Lp/d;
      //   780: aload_0
      //   781: getfield r : Lp/g;
      //   784: invokestatic P1 : (Lp/g;)I
      //   787: invokevirtual a : (Lp/d;I)Z
      //   790: pop
      //   791: iload #6
      //   793: iload #7
      //   795: if_icmpne -> 810
      //   798: aload #15
      //   800: getfield O : Lp/d;
      //   803: aload_0
      //   804: getfield h : I
      //   807: invokevirtual u : (I)V
      //   810: aload #13
      //   812: getfield Q : Lp/d;
      //   815: aload #15
      //   817: getfield O : Lp/d;
      //   820: iconst_0
      //   821: invokevirtual a : (Lp/d;I)Z
      //   824: pop
      //   825: iload #6
      //   827: iload #8
      //   829: iconst_1
      //   830: iadd
      //   831: if_icmpne -> 846
      //   834: aload #13
      //   836: getfield Q : Lp/d;
      //   839: aload_0
      //   840: getfield j : I
      //   843: invokevirtual u : (I)V
      //   846: aload #15
      //   848: astore #13
      //   850: aload #15
      //   852: aload #16
      //   854: if_acmpeq -> 534
      //   857: aload_0
      //   858: getfield r : Lp/g;
      //   861: invokestatic g2 : (Lp/g;)I
      //   864: iconst_3
      //   865: if_icmpne -> 913
      //   868: aload #14
      //   870: invokevirtual Z : ()Z
      //   873: ifeq -> 913
      //   876: aload #15
      //   878: aload #14
      //   880: if_acmpeq -> 913
      //   883: aload #15
      //   885: invokevirtual Z : ()Z
      //   888: ifeq -> 913
      //   891: aload #15
      //   893: getfield S : Lp/d;
      //   896: aload #14
      //   898: getfield S : Lp/d;
      //   901: iconst_0
      //   902: invokevirtual a : (Lp/d;I)Z
      //   905: pop
      //   906: aload #15
      //   908: astore #13
      //   910: goto -> 1054
      //   913: aload_0
      //   914: getfield r : Lp/g;
      //   917: invokestatic g2 : (Lp/g;)I
      //   920: istore_2
      //   921: iload_2
      //   922: ifeq -> 1035
      //   925: iload_2
      //   926: iconst_1
      //   927: if_icmpeq -> 1013
      //   930: iload #9
      //   932: ifeq -> 976
      //   935: aload #15
      //   937: getfield P : Lp/d;
      //   940: aload_0
      //   941: getfield e : Lp/d;
      //   944: aload_0
      //   945: getfield i : I
      //   948: invokevirtual a : (Lp/d;I)Z
      //   951: pop
      //   952: aload #15
      //   954: getfield R : Lp/d;
      //   957: aload_0
      //   958: getfield g : Lp/d;
      //   961: aload_0
      //   962: getfield k : I
      //   965: invokevirtual a : (Lp/d;I)Z
      //   968: pop
      //   969: aload #15
      //   971: astore #13
      //   973: goto -> 1054
      //   976: aload #15
      //   978: getfield P : Lp/d;
      //   981: aload #16
      //   983: getfield P : Lp/d;
      //   986: iconst_0
      //   987: invokevirtual a : (Lp/d;I)Z
      //   990: pop
      //   991: aload #15
      //   993: getfield R : Lp/d;
      //   996: aload #16
      //   998: getfield R : Lp/d;
      //   1001: iconst_0
      //   1002: invokevirtual a : (Lp/d;I)Z
      //   1005: pop
      //   1006: aload #15
      //   1008: astore #13
      //   1010: goto -> 1054
      //   1013: aload #15
      //   1015: getfield R : Lp/d;
      //   1018: aload #16
      //   1020: getfield R : Lp/d;
      //   1023: iconst_0
      //   1024: invokevirtual a : (Lp/d;I)Z
      //   1027: pop
      //   1028: aload #15
      //   1030: astore #13
      //   1032: goto -> 1054
      //   1035: aload #15
      //   1037: getfield P : Lp/d;
      //   1040: aload #16
      //   1042: getfield P : Lp/d;
      //   1045: iconst_0
      //   1046: invokevirtual a : (Lp/d;I)Z
      //   1049: pop
      //   1050: aload #15
      //   1052: astore #13
      //   1054: iload #6
      //   1056: iconst_1
      //   1057: iadd
      //   1058: istore #6
      //   1060: goto -> 471
      //   1063: aload_0
      //   1064: getfield b : Lp/e;
      //   1067: astore #15
      //   1069: aload #15
      //   1071: aload_0
      //   1072: getfield r : Lp/g;
      //   1075: invokestatic h2 : (Lp/g;)I
      //   1078: invokevirtual N0 : (I)V
      //   1081: aload_0
      //   1082: getfield h : I
      //   1085: istore #10
      //   1087: iload #10
      //   1089: istore #6
      //   1091: iload_2
      //   1092: ifle -> 1107
      //   1095: iload #10
      //   1097: aload_0
      //   1098: getfield r : Lp/g;
      //   1101: invokestatic P1 : (Lp/g;)I
      //   1104: iadd
      //   1105: istore #6
      //   1107: iload_1
      //   1108: ifeq -> 1174
      //   1111: aload #15
      //   1113: getfield Q : Lp/d;
      //   1116: aload_0
      //   1117: getfield f : Lp/d;
      //   1120: iload #6
      //   1122: invokevirtual a : (Lp/d;I)Z
      //   1125: pop
      //   1126: iload_3
      //   1127: ifeq -> 1147
      //   1130: aload #15
      //   1132: getfield O : Lp/d;
      //   1135: aload_0
      //   1136: getfield d : Lp/d;
      //   1139: aload_0
      //   1140: getfield j : I
      //   1143: invokevirtual a : (Lp/d;I)Z
      //   1146: pop
      //   1147: iload_2
      //   1148: ifle -> 1234
      //   1151: aload_0
      //   1152: getfield f : Lp/d;
      //   1155: getfield d : Lp/e;
      //   1158: getfield O : Lp/d;
      //   1161: aload #15
      //   1163: getfield Q : Lp/d;
      //   1166: iconst_0
      //   1167: invokevirtual a : (Lp/d;I)Z
      //   1170: pop
      //   1171: goto -> 1234
      //   1174: aload #15
      //   1176: getfield O : Lp/d;
      //   1179: aload_0
      //   1180: getfield d : Lp/d;
      //   1183: iload #6
      //   1185: invokevirtual a : (Lp/d;I)Z
      //   1188: pop
      //   1189: iload_3
      //   1190: ifeq -> 1210
      //   1193: aload #15
      //   1195: getfield Q : Lp/d;
      //   1198: aload_0
      //   1199: getfield f : Lp/d;
      //   1202: aload_0
      //   1203: getfield j : I
      //   1206: invokevirtual a : (Lp/d;I)Z
      //   1209: pop
      //   1210: iload_2
      //   1211: ifle -> 1234
      //   1214: aload_0
      //   1215: getfield d : Lp/d;
      //   1218: getfield d : Lp/e;
      //   1221: getfield Q : Lp/d;
      //   1224: aload #15
      //   1226: getfield O : Lp/d;
      //   1229: iconst_0
      //   1230: invokevirtual a : (Lp/d;I)Z
      //   1233: pop
      //   1234: iconst_0
      //   1235: istore #6
      //   1237: aload #14
      //   1239: astore #13
      //   1241: iload #6
      //   1243: iload #12
      //   1245: if_icmpge -> 1791
      //   1248: aload_0
      //   1249: getfield n : I
      //   1252: iload #6
      //   1254: iadd
      //   1255: aload_0
      //   1256: getfield r : Lp/g;
      //   1259: invokestatic d2 : (Lp/g;)I
      //   1262: if_icmplt -> 1266
      //   1265: return
      //   1266: aload_0
      //   1267: getfield r : Lp/g;
      //   1270: invokestatic e2 : (Lp/g;)[Lp/e;
      //   1273: aload_0
      //   1274: getfield n : I
      //   1277: iload #6
      //   1279: iadd
      //   1280: aaload
      //   1281: astore #14
      //   1283: aload #14
      //   1285: ifnonnull -> 1291
      //   1288: goto -> 1782
      //   1291: iload #6
      //   1293: ifne -> 1429
      //   1296: aload #14
      //   1298: aload #14
      //   1300: getfield P : Lp/d;
      //   1303: aload_0
      //   1304: getfield e : Lp/d;
      //   1307: aload_0
      //   1308: getfield i : I
      //   1311: invokevirtual k : (Lp/d;Lp/d;I)V
      //   1314: aload_0
      //   1315: getfield r : Lp/g;
      //   1318: invokestatic f2 : (Lp/g;)I
      //   1321: istore #10
      //   1323: aload_0
      //   1324: getfield r : Lp/g;
      //   1327: invokestatic V1 : (Lp/g;)F
      //   1330: fstore #5
      //   1332: aload_0
      //   1333: getfield n : I
      //   1336: ifne -> 1370
      //   1339: aload_0
      //   1340: getfield r : Lp/g;
      //   1343: invokestatic W1 : (Lp/g;)I
      //   1346: iconst_m1
      //   1347: if_icmpeq -> 1370
      //   1350: aload_0
      //   1351: getfield r : Lp/g;
      //   1354: invokestatic W1 : (Lp/g;)I
      //   1357: istore_2
      //   1358: aload_0
      //   1359: getfield r : Lp/g;
      //   1362: invokestatic X1 : (Lp/g;)F
      //   1365: fstore #4
      //   1367: goto -> 1416
      //   1370: iload #10
      //   1372: istore_2
      //   1373: fload #5
      //   1375: fstore #4
      //   1377: iload_3
      //   1378: ifeq -> 1416
      //   1381: iload #10
      //   1383: istore_2
      //   1384: fload #5
      //   1386: fstore #4
      //   1388: aload_0
      //   1389: getfield r : Lp/g;
      //   1392: invokestatic Y1 : (Lp/g;)I
      //   1395: iconst_m1
      //   1396: if_icmpeq -> 1416
      //   1399: aload_0
      //   1400: getfield r : Lp/g;
      //   1403: invokestatic Y1 : (Lp/g;)I
      //   1406: istore_2
      //   1407: aload_0
      //   1408: getfield r : Lp/g;
      //   1411: invokestatic Z1 : (Lp/g;)F
      //   1414: fstore #4
      //   1416: aload #14
      //   1418: iload_2
      //   1419: invokevirtual e1 : (I)V
      //   1422: aload #14
      //   1424: fload #4
      //   1426: invokevirtual d1 : (F)V
      //   1429: iload #6
      //   1431: iload #12
      //   1433: iconst_1
      //   1434: isub
      //   1435: if_icmpne -> 1456
      //   1438: aload #14
      //   1440: aload #14
      //   1442: getfield R : Lp/d;
      //   1445: aload_0
      //   1446: getfield g : Lp/d;
      //   1449: aload_0
      //   1450: getfield k : I
      //   1453: invokevirtual k : (Lp/d;Lp/d;I)V
      //   1456: aload #13
      //   1458: ifnull -> 1537
      //   1461: aload #14
      //   1463: getfield P : Lp/d;
      //   1466: aload #13
      //   1468: getfield R : Lp/d;
      //   1471: aload_0
      //   1472: getfield r : Lp/g;
      //   1475: invokestatic Q1 : (Lp/g;)I
      //   1478: invokevirtual a : (Lp/d;I)Z
      //   1481: pop
      //   1482: iload #6
      //   1484: iload #7
      //   1486: if_icmpne -> 1501
      //   1489: aload #14
      //   1491: getfield P : Lp/d;
      //   1494: aload_0
      //   1495: getfield i : I
      //   1498: invokevirtual u : (I)V
      //   1501: aload #13
      //   1503: getfield R : Lp/d;
      //   1506: aload #14
      //   1508: getfield P : Lp/d;
      //   1511: iconst_0
      //   1512: invokevirtual a : (Lp/d;I)Z
      //   1515: pop
      //   1516: iload #6
      //   1518: iload #8
      //   1520: iconst_1
      //   1521: iadd
      //   1522: if_icmpne -> 1537
      //   1525: aload #13
      //   1527: getfield R : Lp/d;
      //   1530: aload_0
      //   1531: getfield k : I
      //   1534: invokevirtual u : (I)V
      //   1537: aload #14
      //   1539: aload #15
      //   1541: if_acmpeq -> 1778
      //   1544: iload_1
      //   1545: ifeq -> 1642
      //   1548: aload_0
      //   1549: getfield r : Lp/g;
      //   1552: invokestatic a2 : (Lp/g;)I
      //   1555: istore_2
      //   1556: iload_2
      //   1557: ifeq -> 1624
      //   1560: iload_2
      //   1561: iconst_1
      //   1562: if_icmpeq -> 1606
      //   1565: iload_2
      //   1566: iconst_2
      //   1567: if_icmpeq -> 1573
      //   1570: goto -> 1778
      //   1573: aload #14
      //   1575: getfield O : Lp/d;
      //   1578: aload #15
      //   1580: getfield O : Lp/d;
      //   1583: iconst_0
      //   1584: invokevirtual a : (Lp/d;I)Z
      //   1587: pop
      //   1588: aload #14
      //   1590: getfield Q : Lp/d;
      //   1593: aload #15
      //   1595: getfield Q : Lp/d;
      //   1598: iconst_0
      //   1599: invokevirtual a : (Lp/d;I)Z
      //   1602: pop
      //   1603: goto -> 1778
      //   1606: aload #14
      //   1608: getfield O : Lp/d;
      //   1611: aload #15
      //   1613: getfield O : Lp/d;
      //   1616: iconst_0
      //   1617: invokevirtual a : (Lp/d;I)Z
      //   1620: pop
      //   1621: goto -> 1778
      //   1624: aload #14
      //   1626: getfield Q : Lp/d;
      //   1629: aload #15
      //   1631: getfield Q : Lp/d;
      //   1634: iconst_0
      //   1635: invokevirtual a : (Lp/d;I)Z
      //   1638: pop
      //   1639: goto -> 1778
      //   1642: aload_0
      //   1643: getfield r : Lp/g;
      //   1646: invokestatic a2 : (Lp/g;)I
      //   1649: istore_2
      //   1650: iload_2
      //   1651: ifeq -> 1760
      //   1654: iload_2
      //   1655: iconst_1
      //   1656: if_icmpeq -> 1742
      //   1659: iload_2
      //   1660: iconst_2
      //   1661: if_icmpeq -> 1667
      //   1664: goto -> 1778
      //   1667: iload #9
      //   1669: ifeq -> 1709
      //   1672: aload #14
      //   1674: getfield O : Lp/d;
      //   1677: aload_0
      //   1678: getfield d : Lp/d;
      //   1681: aload_0
      //   1682: getfield h : I
      //   1685: invokevirtual a : (Lp/d;I)Z
      //   1688: pop
      //   1689: aload #14
      //   1691: getfield Q : Lp/d;
      //   1694: aload_0
      //   1695: getfield f : Lp/d;
      //   1698: aload_0
      //   1699: getfield j : I
      //   1702: invokevirtual a : (Lp/d;I)Z
      //   1705: pop
      //   1706: goto -> 1778
      //   1709: aload #14
      //   1711: getfield O : Lp/d;
      //   1714: aload #15
      //   1716: getfield O : Lp/d;
      //   1719: iconst_0
      //   1720: invokevirtual a : (Lp/d;I)Z
      //   1723: pop
      //   1724: aload #14
      //   1726: getfield Q : Lp/d;
      //   1729: aload #15
      //   1731: getfield Q : Lp/d;
      //   1734: iconst_0
      //   1735: invokevirtual a : (Lp/d;I)Z
      //   1738: pop
      //   1739: goto -> 1778
      //   1742: aload #14
      //   1744: getfield Q : Lp/d;
      //   1747: aload #15
      //   1749: getfield Q : Lp/d;
      //   1752: iconst_0
      //   1753: invokevirtual a : (Lp/d;I)Z
      //   1756: pop
      //   1757: goto -> 1778
      //   1760: aload #14
      //   1762: getfield O : Lp/d;
      //   1765: aload #15
      //   1767: getfield O : Lp/d;
      //   1770: iconst_0
      //   1771: invokevirtual a : (Lp/d;I)Z
      //   1774: pop
      //   1775: goto -> 1778
      //   1778: aload #14
      //   1780: astore #13
      //   1782: iload #6
      //   1784: iconst_1
      //   1785: iadd
      //   1786: istore #6
      //   1788: goto -> 1241
      //   1791: return
    }
    
    public int e() {
      return (this.a == 1) ? (this.m - g.Q1(this.r)) : this.m;
    }
    
    public int f() {
      return (this.a == 0) ? (this.l - g.P1(this.r)) : this.l;
    }
    
    public void g(int param1Int) {
      int j = this.p;
      if (j == 0)
        return; 
      int i = this.o;
      j = param1Int / j;
      for (param1Int = 0; param1Int < i && this.n + param1Int < g.d2(this.r); param1Int++) {
        e e1 = g.e2(this.r)[this.n + param1Int];
        if (this.a == 0) {
          if (e1 != null && e1.A() == e.b.MATCH_CONSTRAINT && e1.w == 0)
            this.r.D1(e1, e.b.FIXED, j, e1.T(), e1.x()); 
        } else if (e1 != null && e1.T() == e.b.MATCH_CONSTRAINT && e1.x == 0) {
          this.r.D1(e1, e1.A(), e1.W(), e.b.FIXED, j);
        } 
      } 
      h();
    }
    
    public void i(int param1Int) {
      this.n = param1Int;
    }
    
    public void j(int param1Int1, d param1d1, d param1d2, d param1d3, d param1d4, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.a = param1Int1;
      this.d = param1d1;
      this.e = param1d2;
      this.f = param1d3;
      this.g = param1d4;
      this.h = param1Int2;
      this.i = param1Int3;
      this.j = param1Int4;
      this.k = param1Int5;
      this.q = param1Int6;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */