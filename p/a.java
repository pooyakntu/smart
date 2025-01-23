package p;

import m.d;

public class a extends j {
  private int N0 = 0;
  
  private boolean O0 = true;
  
  private int P0 = 0;
  
  boolean Q0 = false;
  
  public void A1(int paramInt) {
    this.N0 = paramInt;
  }
  
  public void B1(int paramInt) {
    this.P0 = paramInt;
  }
  
  public void g(d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield W : [Lp/d;
    //   4: astore #7
    //   6: aload #7
    //   8: iconst_0
    //   9: aload_0
    //   10: getfield O : Lp/d;
    //   13: aastore
    //   14: aload #7
    //   16: iconst_2
    //   17: aload_0
    //   18: getfield P : Lp/d;
    //   21: aastore
    //   22: aload #7
    //   24: iconst_1
    //   25: aload_0
    //   26: getfield Q : Lp/d;
    //   29: aastore
    //   30: aload #7
    //   32: iconst_3
    //   33: aload_0
    //   34: getfield R : Lp/d;
    //   37: aastore
    //   38: iconst_0
    //   39: istore_3
    //   40: aload_0
    //   41: getfield W : [Lp/d;
    //   44: astore #7
    //   46: iload_3
    //   47: aload #7
    //   49: arraylength
    //   50: if_icmpge -> 77
    //   53: aload #7
    //   55: iload_3
    //   56: aaload
    //   57: astore #7
    //   59: aload #7
    //   61: aload_1
    //   62: aload #7
    //   64: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   67: putfield i : Lm/i;
    //   70: iload_3
    //   71: iconst_1
    //   72: iadd
    //   73: istore_3
    //   74: goto -> 40
    //   77: aload_0
    //   78: getfield N0 : I
    //   81: istore_3
    //   82: iload_3
    //   83: iflt -> 1004
    //   86: iload_3
    //   87: iconst_4
    //   88: if_icmpge -> 1004
    //   91: aload #7
    //   93: iload_3
    //   94: aaload
    //   95: astore #7
    //   97: aload_0
    //   98: getfield Q0 : Z
    //   101: ifne -> 109
    //   104: aload_0
    //   105: invokevirtual t1 : ()Z
    //   108: pop
    //   109: aload_0
    //   110: getfield Q0 : Z
    //   113: ifeq -> 210
    //   116: aload_0
    //   117: iconst_0
    //   118: putfield Q0 : Z
    //   121: aload_0
    //   122: getfield N0 : I
    //   125: istore_3
    //   126: iload_3
    //   127: ifeq -> 179
    //   130: iload_3
    //   131: iconst_1
    //   132: if_icmpne -> 138
    //   135: goto -> 179
    //   138: iload_3
    //   139: iconst_2
    //   140: if_icmpeq -> 148
    //   143: iload_3
    //   144: iconst_3
    //   145: if_icmpne -> 209
    //   148: aload_1
    //   149: aload_0
    //   150: getfield P : Lp/d;
    //   153: getfield i : Lm/i;
    //   156: aload_0
    //   157: getfield g0 : I
    //   160: invokevirtual f : (Lm/i;I)V
    //   163: aload_1
    //   164: aload_0
    //   165: getfield R : Lp/d;
    //   168: getfield i : Lm/i;
    //   171: aload_0
    //   172: getfield g0 : I
    //   175: invokevirtual f : (Lm/i;I)V
    //   178: return
    //   179: aload_1
    //   180: aload_0
    //   181: getfield O : Lp/d;
    //   184: getfield i : Lm/i;
    //   187: aload_0
    //   188: getfield f0 : I
    //   191: invokevirtual f : (Lm/i;I)V
    //   194: aload_1
    //   195: aload_0
    //   196: getfield Q : Lp/d;
    //   199: getfield i : Lm/i;
    //   202: aload_0
    //   203: getfield f0 : I
    //   206: invokevirtual f : (Lm/i;I)V
    //   209: return
    //   210: iconst_0
    //   211: istore_3
    //   212: iload_3
    //   213: aload_0
    //   214: getfield M0 : I
    //   217: if_icmpge -> 362
    //   220: aload_0
    //   221: getfield L0 : [Lp/e;
    //   224: iload_3
    //   225: aaload
    //   226: astore #8
    //   228: aload_0
    //   229: getfield O0 : Z
    //   232: ifne -> 246
    //   235: aload #8
    //   237: invokevirtual h : ()Z
    //   240: ifne -> 246
    //   243: goto -> 355
    //   246: aload_0
    //   247: getfield N0 : I
    //   250: istore #4
    //   252: iload #4
    //   254: ifeq -> 263
    //   257: iload #4
    //   259: iconst_1
    //   260: if_icmpne -> 301
    //   263: aload #8
    //   265: invokevirtual A : ()Lp/e$b;
    //   268: getstatic p/e$b.MATCH_CONSTRAINT : Lp/e$b;
    //   271: if_acmpne -> 301
    //   274: aload #8
    //   276: getfield O : Lp/d;
    //   279: getfield f : Lp/d;
    //   282: ifnull -> 301
    //   285: aload #8
    //   287: getfield Q : Lp/d;
    //   290: getfield f : Lp/d;
    //   293: ifnull -> 301
    //   296: iconst_1
    //   297: istore_2
    //   298: goto -> 364
    //   301: aload_0
    //   302: getfield N0 : I
    //   305: istore #4
    //   307: iload #4
    //   309: iconst_2
    //   310: if_icmpeq -> 319
    //   313: iload #4
    //   315: iconst_3
    //   316: if_icmpne -> 355
    //   319: aload #8
    //   321: invokevirtual T : ()Lp/e$b;
    //   324: getstatic p/e$b.MATCH_CONSTRAINT : Lp/e$b;
    //   327: if_acmpne -> 355
    //   330: aload #8
    //   332: getfield P : Lp/d;
    //   335: getfield f : Lp/d;
    //   338: ifnull -> 355
    //   341: aload #8
    //   343: getfield R : Lp/d;
    //   346: getfield f : Lp/d;
    //   349: ifnull -> 355
    //   352: goto -> 296
    //   355: iload_3
    //   356: iconst_1
    //   357: iadd
    //   358: istore_3
    //   359: goto -> 212
    //   362: iconst_0
    //   363: istore_2
    //   364: aload_0
    //   365: getfield O : Lp/d;
    //   368: invokevirtual l : ()Z
    //   371: ifne -> 392
    //   374: aload_0
    //   375: getfield Q : Lp/d;
    //   378: invokevirtual l : ()Z
    //   381: ifeq -> 387
    //   384: goto -> 392
    //   387: iconst_0
    //   388: istore_3
    //   389: goto -> 394
    //   392: iconst_1
    //   393: istore_3
    //   394: aload_0
    //   395: getfield P : Lp/d;
    //   398: invokevirtual l : ()Z
    //   401: ifne -> 423
    //   404: aload_0
    //   405: getfield R : Lp/d;
    //   408: invokevirtual l : ()Z
    //   411: ifeq -> 417
    //   414: goto -> 423
    //   417: iconst_0
    //   418: istore #4
    //   420: goto -> 426
    //   423: iconst_1
    //   424: istore #4
    //   426: iload_2
    //   427: ifne -> 482
    //   430: aload_0
    //   431: getfield N0 : I
    //   434: istore #5
    //   436: iload #5
    //   438: ifne -> 445
    //   441: iload_3
    //   442: ifne -> 477
    //   445: iload #5
    //   447: iconst_2
    //   448: if_icmpne -> 456
    //   451: iload #4
    //   453: ifne -> 477
    //   456: iload #5
    //   458: iconst_1
    //   459: if_icmpne -> 466
    //   462: iload_3
    //   463: ifne -> 477
    //   466: iload #5
    //   468: iconst_3
    //   469: if_icmpne -> 482
    //   472: iload #4
    //   474: ifeq -> 482
    //   477: iconst_1
    //   478: istore_3
    //   479: goto -> 484
    //   482: iconst_0
    //   483: istore_3
    //   484: iload_3
    //   485: ifne -> 493
    //   488: iconst_4
    //   489: istore_3
    //   490: goto -> 495
    //   493: iconst_5
    //   494: istore_3
    //   495: iconst_0
    //   496: istore #4
    //   498: iload #4
    //   500: aload_0
    //   501: getfield M0 : I
    //   504: if_icmpge -> 697
    //   507: aload_0
    //   508: getfield L0 : [Lp/e;
    //   511: iload #4
    //   513: aaload
    //   514: astore #9
    //   516: aload_0
    //   517: getfield O0 : Z
    //   520: ifne -> 534
    //   523: aload #9
    //   525: invokevirtual h : ()Z
    //   528: ifne -> 534
    //   531: goto -> 688
    //   534: aload_1
    //   535: aload #9
    //   537: getfield W : [Lp/d;
    //   540: aload_0
    //   541: getfield N0 : I
    //   544: aaload
    //   545: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   548: astore #8
    //   550: aload #9
    //   552: getfield W : [Lp/d;
    //   555: astore #9
    //   557: aload_0
    //   558: getfield N0 : I
    //   561: istore #6
    //   563: aload #9
    //   565: iload #6
    //   567: aaload
    //   568: astore #9
    //   570: aload #9
    //   572: aload #8
    //   574: putfield i : Lm/i;
    //   577: aload #9
    //   579: getfield f : Lp/d;
    //   582: astore #10
    //   584: aload #10
    //   586: ifnull -> 610
    //   589: aload #10
    //   591: getfield d : Lp/e;
    //   594: aload_0
    //   595: if_acmpne -> 610
    //   598: aload #9
    //   600: getfield g : I
    //   603: iconst_0
    //   604: iadd
    //   605: istore #5
    //   607: goto -> 613
    //   610: iconst_0
    //   611: istore #5
    //   613: iload #6
    //   615: ifeq -> 649
    //   618: iload #6
    //   620: iconst_2
    //   621: if_icmpne -> 627
    //   624: goto -> 649
    //   627: aload_1
    //   628: aload #7
    //   630: getfield i : Lm/i;
    //   633: aload #8
    //   635: aload_0
    //   636: getfield P0 : I
    //   639: iload #5
    //   641: iadd
    //   642: iload_2
    //   643: invokevirtual g : (Lm/i;Lm/i;IZ)V
    //   646: goto -> 668
    //   649: aload_1
    //   650: aload #7
    //   652: getfield i : Lm/i;
    //   655: aload #8
    //   657: aload_0
    //   658: getfield P0 : I
    //   661: iload #5
    //   663: isub
    //   664: iload_2
    //   665: invokevirtual i : (Lm/i;Lm/i;IZ)V
    //   668: aload_1
    //   669: aload #7
    //   671: getfield i : Lm/i;
    //   674: aload #8
    //   676: aload_0
    //   677: getfield P0 : I
    //   680: iload #5
    //   682: iadd
    //   683: iload_3
    //   684: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   687: pop
    //   688: iload #4
    //   690: iconst_1
    //   691: iadd
    //   692: istore #4
    //   694: goto -> 498
    //   697: aload_0
    //   698: getfield N0 : I
    //   701: istore_3
    //   702: iload_3
    //   703: ifne -> 777
    //   706: aload_1
    //   707: aload_0
    //   708: getfield Q : Lp/d;
    //   711: getfield i : Lm/i;
    //   714: aload_0
    //   715: getfield O : Lp/d;
    //   718: getfield i : Lm/i;
    //   721: iconst_0
    //   722: bipush #8
    //   724: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   727: pop
    //   728: aload_1
    //   729: aload_0
    //   730: getfield O : Lp/d;
    //   733: getfield i : Lm/i;
    //   736: aload_0
    //   737: getfield a0 : Lp/e;
    //   740: getfield Q : Lp/d;
    //   743: getfield i : Lm/i;
    //   746: iconst_0
    //   747: iconst_4
    //   748: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   751: pop
    //   752: aload_1
    //   753: aload_0
    //   754: getfield O : Lp/d;
    //   757: getfield i : Lm/i;
    //   760: aload_0
    //   761: getfield a0 : Lp/e;
    //   764: getfield O : Lp/d;
    //   767: getfield i : Lm/i;
    //   770: iconst_0
    //   771: iconst_0
    //   772: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   775: pop
    //   776: return
    //   777: iload_3
    //   778: iconst_1
    //   779: if_icmpne -> 853
    //   782: aload_1
    //   783: aload_0
    //   784: getfield O : Lp/d;
    //   787: getfield i : Lm/i;
    //   790: aload_0
    //   791: getfield Q : Lp/d;
    //   794: getfield i : Lm/i;
    //   797: iconst_0
    //   798: bipush #8
    //   800: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   803: pop
    //   804: aload_1
    //   805: aload_0
    //   806: getfield O : Lp/d;
    //   809: getfield i : Lm/i;
    //   812: aload_0
    //   813: getfield a0 : Lp/e;
    //   816: getfield O : Lp/d;
    //   819: getfield i : Lm/i;
    //   822: iconst_0
    //   823: iconst_4
    //   824: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   827: pop
    //   828: aload_1
    //   829: aload_0
    //   830: getfield O : Lp/d;
    //   833: getfield i : Lm/i;
    //   836: aload_0
    //   837: getfield a0 : Lp/e;
    //   840: getfield Q : Lp/d;
    //   843: getfield i : Lm/i;
    //   846: iconst_0
    //   847: iconst_0
    //   848: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   851: pop
    //   852: return
    //   853: iload_3
    //   854: iconst_2
    //   855: if_icmpne -> 929
    //   858: aload_1
    //   859: aload_0
    //   860: getfield R : Lp/d;
    //   863: getfield i : Lm/i;
    //   866: aload_0
    //   867: getfield P : Lp/d;
    //   870: getfield i : Lm/i;
    //   873: iconst_0
    //   874: bipush #8
    //   876: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   879: pop
    //   880: aload_1
    //   881: aload_0
    //   882: getfield P : Lp/d;
    //   885: getfield i : Lm/i;
    //   888: aload_0
    //   889: getfield a0 : Lp/e;
    //   892: getfield R : Lp/d;
    //   895: getfield i : Lm/i;
    //   898: iconst_0
    //   899: iconst_4
    //   900: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   903: pop
    //   904: aload_1
    //   905: aload_0
    //   906: getfield P : Lp/d;
    //   909: getfield i : Lm/i;
    //   912: aload_0
    //   913: getfield a0 : Lp/e;
    //   916: getfield P : Lp/d;
    //   919: getfield i : Lm/i;
    //   922: iconst_0
    //   923: iconst_0
    //   924: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   927: pop
    //   928: return
    //   929: iload_3
    //   930: iconst_3
    //   931: if_icmpne -> 1004
    //   934: aload_1
    //   935: aload_0
    //   936: getfield P : Lp/d;
    //   939: getfield i : Lm/i;
    //   942: aload_0
    //   943: getfield R : Lp/d;
    //   946: getfield i : Lm/i;
    //   949: iconst_0
    //   950: bipush #8
    //   952: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   955: pop
    //   956: aload_1
    //   957: aload_0
    //   958: getfield P : Lp/d;
    //   961: getfield i : Lm/i;
    //   964: aload_0
    //   965: getfield a0 : Lp/e;
    //   968: getfield P : Lp/d;
    //   971: getfield i : Lm/i;
    //   974: iconst_0
    //   975: iconst_4
    //   976: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   979: pop
    //   980: aload_1
    //   981: aload_0
    //   982: getfield P : Lp/d;
    //   985: getfield i : Lm/i;
    //   988: aload_0
    //   989: getfield a0 : Lp/e;
    //   992: getfield R : Lp/d;
    //   995: getfield i : Lm/i;
    //   998: iconst_0
    //   999: iconst_0
    //   1000: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   1003: pop
    //   1004: return
  }
  
  public boolean h() {
    return true;
  }
  
  public boolean n0() {
    return this.Q0;
  }
  
  public boolean o0() {
    return this.Q0;
  }
  
  public boolean t1() {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iconst_0
    //   4: istore_1
    //   5: iconst_1
    //   6: istore_2
    //   7: aload_0
    //   8: getfield M0 : I
    //   11: istore_3
    //   12: iload_1
    //   13: iload_3
    //   14: if_icmpge -> 114
    //   17: aload_0
    //   18: getfield L0 : [Lp/e;
    //   21: iload_1
    //   22: aaload
    //   23: astore #7
    //   25: aload_0
    //   26: getfield O0 : Z
    //   29: ifne -> 45
    //   32: aload #7
    //   34: invokevirtual h : ()Z
    //   37: ifne -> 45
    //   40: iload_2
    //   41: istore_3
    //   42: goto -> 105
    //   45: aload_0
    //   46: getfield N0 : I
    //   49: istore_3
    //   50: iload_3
    //   51: ifeq -> 59
    //   54: iload_3
    //   55: iconst_1
    //   56: if_icmpne -> 72
    //   59: aload #7
    //   61: invokevirtual n0 : ()Z
    //   64: ifne -> 72
    //   67: iconst_0
    //   68: istore_3
    //   69: goto -> 105
    //   72: aload_0
    //   73: getfield N0 : I
    //   76: istore #4
    //   78: iload #4
    //   80: iconst_2
    //   81: if_icmpeq -> 92
    //   84: iload_2
    //   85: istore_3
    //   86: iload #4
    //   88: iconst_3
    //   89: if_icmpne -> 105
    //   92: iload_2
    //   93: istore_3
    //   94: aload #7
    //   96: invokevirtual o0 : ()Z
    //   99: ifne -> 105
    //   102: goto -> 67
    //   105: iload_1
    //   106: iconst_1
    //   107: iadd
    //   108: istore_1
    //   109: iload_3
    //   110: istore_2
    //   111: goto -> 7
    //   114: iload_2
    //   115: ifeq -> 431
    //   118: iload_3
    //   119: ifle -> 431
    //   122: iconst_0
    //   123: istore_1
    //   124: iconst_0
    //   125: istore_3
    //   126: iload #5
    //   128: aload_0
    //   129: getfield M0 : I
    //   132: if_icmpge -> 385
    //   135: aload_0
    //   136: getfield L0 : [Lp/e;
    //   139: iload #5
    //   141: aaload
    //   142: astore #7
    //   144: aload_0
    //   145: getfield O0 : Z
    //   148: ifne -> 162
    //   151: aload #7
    //   153: invokevirtual h : ()Z
    //   156: ifne -> 162
    //   159: goto -> 376
    //   162: iload_1
    //   163: istore #4
    //   165: iload_3
    //   166: istore_2
    //   167: iload_3
    //   168: ifne -> 257
    //   171: aload_0
    //   172: getfield N0 : I
    //   175: istore_2
    //   176: iload_2
    //   177: ifne -> 195
    //   180: aload #7
    //   182: getstatic p/d$b.LEFT : Lp/d$b;
    //   185: invokevirtual o : (Lp/d$b;)Lp/d;
    //   188: invokevirtual e : ()I
    //   191: istore_1
    //   192: goto -> 252
    //   195: iload_2
    //   196: iconst_1
    //   197: if_icmpne -> 215
    //   200: aload #7
    //   202: getstatic p/d$b.RIGHT : Lp/d$b;
    //   205: invokevirtual o : (Lp/d$b;)Lp/d;
    //   208: invokevirtual e : ()I
    //   211: istore_1
    //   212: goto -> 252
    //   215: iload_2
    //   216: iconst_2
    //   217: if_icmpne -> 235
    //   220: aload #7
    //   222: getstatic p/d$b.TOP : Lp/d$b;
    //   225: invokevirtual o : (Lp/d$b;)Lp/d;
    //   228: invokevirtual e : ()I
    //   231: istore_1
    //   232: goto -> 252
    //   235: iload_2
    //   236: iconst_3
    //   237: if_icmpne -> 252
    //   240: aload #7
    //   242: getstatic p/d$b.BOTTOM : Lp/d$b;
    //   245: invokevirtual o : (Lp/d$b;)Lp/d;
    //   248: invokevirtual e : ()I
    //   251: istore_1
    //   252: iconst_1
    //   253: istore_2
    //   254: iload_1
    //   255: istore #4
    //   257: aload_0
    //   258: getfield N0 : I
    //   261: istore #6
    //   263: iload #6
    //   265: ifne -> 290
    //   268: iload #4
    //   270: aload #7
    //   272: getstatic p/d$b.LEFT : Lp/d$b;
    //   275: invokevirtual o : (Lp/d$b;)Lp/d;
    //   278: invokevirtual e : ()I
    //   281: invokestatic min : (II)I
    //   284: istore_1
    //   285: iload_2
    //   286: istore_3
    //   287: goto -> 376
    //   290: iload #6
    //   292: iconst_1
    //   293: if_icmpne -> 318
    //   296: iload #4
    //   298: aload #7
    //   300: getstatic p/d$b.RIGHT : Lp/d$b;
    //   303: invokevirtual o : (Lp/d$b;)Lp/d;
    //   306: invokevirtual e : ()I
    //   309: invokestatic max : (II)I
    //   312: istore_1
    //   313: iload_2
    //   314: istore_3
    //   315: goto -> 376
    //   318: iload #6
    //   320: iconst_2
    //   321: if_icmpne -> 346
    //   324: iload #4
    //   326: aload #7
    //   328: getstatic p/d$b.TOP : Lp/d$b;
    //   331: invokevirtual o : (Lp/d$b;)Lp/d;
    //   334: invokevirtual e : ()I
    //   337: invokestatic min : (II)I
    //   340: istore_1
    //   341: iload_2
    //   342: istore_3
    //   343: goto -> 376
    //   346: iload #4
    //   348: istore_1
    //   349: iload_2
    //   350: istore_3
    //   351: iload #6
    //   353: iconst_3
    //   354: if_icmpne -> 376
    //   357: iload #4
    //   359: aload #7
    //   361: getstatic p/d$b.BOTTOM : Lp/d$b;
    //   364: invokevirtual o : (Lp/d$b;)Lp/d;
    //   367: invokevirtual e : ()I
    //   370: invokestatic max : (II)I
    //   373: istore_1
    //   374: iload_2
    //   375: istore_3
    //   376: iload #5
    //   378: iconst_1
    //   379: iadd
    //   380: istore #5
    //   382: goto -> 126
    //   385: iload_1
    //   386: aload_0
    //   387: getfield P0 : I
    //   390: iadd
    //   391: istore_1
    //   392: aload_0
    //   393: getfield N0 : I
    //   396: istore_2
    //   397: iload_2
    //   398: ifeq -> 418
    //   401: iload_2
    //   402: iconst_1
    //   403: if_icmpne -> 409
    //   406: goto -> 418
    //   409: aload_0
    //   410: iload_1
    //   411: iload_1
    //   412: invokevirtual I0 : (II)V
    //   415: goto -> 424
    //   418: aload_0
    //   419: iload_1
    //   420: iload_1
    //   421: invokevirtual F0 : (II)V
    //   424: aload_0
    //   425: iconst_1
    //   426: putfield Q0 : Z
    //   429: iconst_1
    //   430: ireturn
    //   431: iconst_0
    //   432: ireturn
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("[Barrier] ");
    stringBuilder1.append(t());
    stringBuilder1.append(" {");
    String str = stringBuilder1.toString();
    for (int i = 0; i < this.M0; i++) {
      e e = this.L0[i];
      String str1 = str;
      if (i > 0) {
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append(", ");
        str1 = stringBuilder3.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(e.t());
      str = stringBuilder.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append("}");
    return stringBuilder2.toString();
  }
  
  public boolean u1() {
    return this.O0;
  }
  
  public int v1() {
    return this.N0;
  }
  
  public int w1() {
    return this.P0;
  }
  
  public int x1() {
    int i = this.N0;
    return (i != 0 && i != 1) ? ((i != 2 && i != 3) ? -1 : 1) : 0;
  }
  
  protected void y1() {
    for (int i = 0; i < this.M0; i++) {
      e e = this.L0[i];
      if (this.O0 || e.h()) {
        int k = this.N0;
        if (k == 0 || k == 1) {
          e.S0(0, true);
        } else if (k == 2 || k == 3) {
          e.S0(1, true);
        } 
      } 
    } 
  }
  
  public void z1(boolean paramBoolean) {
    this.O0 = paramBoolean;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */