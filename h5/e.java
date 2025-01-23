package h5;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b5.b;
import c5.h;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.customviews.PowerButton;
import e8.q;
import f8.o;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p7.t;
import q8.l;
import q8.r;
import r4.h;
import r8.m;
import r8.n;

public final class e extends b {
  public static final a s = new a(null);
  
  private static List<e> t;
  
  private long q;
  
  public Map<Integer, View> r;
  
  private final PowerButton n0() {
    return (PowerButton)I(h.b4);
  }
  
  private final PowerButton o0() {
    return (PowerButton)I(h.f4);
  }
  
  private final PowerButton p0() {
    return (PowerButton)I(h.d4);
  }
  
  private final PowerButton q0() {
    return (PowerButton)I(h.e4);
  }
  
  private final List<PowerButton> r0() {
    return o.l((Object[])new PowerButton[] { n0(), o0(), q0(), p0() });
  }
  
  private final void s0(com.smartpek.ui.customviews.c paramc, int paramInt, Integer paramInteger) {
    c5.d.b.j((c5.d)this, getActivity(), O(), paramInt, paramInteger, L(), paramc, null, new b(paramc), new c(this, paramInt), new d(this), 64, null);
  }
  
  private static final void u0(e parame, View paramView) {
    m.j(parame, "this$0");
    t0(parame, (com.smartpek.ui.customviews.c)parame.I(h.b4), 0, null, 4, null);
  }
  
  private static final void v0(e parame, View paramView) {
    m.j(parame, "this$0");
    t0(parame, (com.smartpek.ui.customviews.c)parame.I(h.f4), 1, null, 4, null);
  }
  
  private static final void w0(e parame, View paramView) {
    m.j(parame, "this$0");
    if (t.a() - parame.q < 2000L)
      return; 
    parame.q = t.a();
    parame.s0((com.smartpek.ui.customviews.c)parame.I(h.e4), 2, Integer.valueOf(com.smartpek.data.local.models.b.TOGGLE_ON_OFF.code(parame.L(), Boolean.FALSE)));
  }
  
  private static final void x0(e parame, View paramView) {
    m.j(parame, "this$0");
    if (t.a() - parame.q < 2000L)
      return; 
    parame.q = t.a();
    parame.s0((com.smartpek.ui.customviews.c)parame.I(h.d4), 2, Integer.valueOf(com.smartpek.data.local.models.b.TOGGLE_ON_OFF.code(parame.L(), Boolean.TRUE)));
  }
  
  private final void y0(String paramString) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #4
    //   3: iconst_0
    //   4: istore_3
    //   5: aload_1
    //   6: ifnull -> 30
    //   9: aload_1
    //   10: invokestatic a : (Ljava/lang/String;)Z
    //   13: istore #5
    //   15: iload #5
    //   17: iconst_1
    //   18: if_icmpne -> 30
    //   21: iconst_1
    //   22: istore_2
    //   23: goto -> 32
    //   26: astore_1
    //   27: goto -> 671
    //   30: iconst_0
    //   31: istore_2
    //   32: iload_2
    //   33: ifeq -> 551
    //   36: new com/google/gson/Gson
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: aload_1
    //   44: ldc com/smartpek/data/remote/Response
    //   46: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   49: checkcast com/smartpek/data/remote/Response
    //   52: astore_1
    //   53: aload_1
    //   54: invokevirtual getSection : ()Lv4/b;
    //   57: getstatic v4/b.State : Lv4/b;
    //   60: if_acmpne -> 675
    //   63: aload_0
    //   64: getstatic r4/h.b4 : I
    //   67: invokevirtual I : (I)Landroid/view/View;
    //   70: checkcast com/smartpek/ui/customviews/PowerButton
    //   73: astore #8
    //   75: aload #8
    //   77: ifnull -> 109
    //   80: aload #8
    //   82: ldc 'power'
    //   84: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   87: aload_1
    //   88: ldc 'response'
    //   90: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   93: aload #8
    //   95: aload_1
    //   96: iconst_0
    //   97: aconst_null
    //   98: iconst_2
    //   99: aconst_null
    //   100: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   103: iconst_0
    //   104: iconst_2
    //   105: aconst_null
    //   106: invokestatic I : (Lcom/smartpek/ui/customviews/c;Ljava/lang/Integer;IILjava/lang/Object;)V
    //   109: aload_0
    //   110: getstatic r4/h.f4 : I
    //   113: invokevirtual I : (I)Landroid/view/View;
    //   116: checkcast com/smartpek/ui/customviews/PowerButton
    //   119: astore #8
    //   121: aload #8
    //   123: ifnull -> 155
    //   126: aload #8
    //   128: ldc 'powerWater'
    //   130: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   133: aload_1
    //   134: ldc 'response'
    //   136: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   139: aload #8
    //   141: aload_1
    //   142: iconst_1
    //   143: aconst_null
    //   144: iconst_2
    //   145: aconst_null
    //   146: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   149: iconst_0
    //   150: iconst_2
    //   151: aconst_null
    //   152: invokestatic I : (Lcom/smartpek/ui/customviews/c;Ljava/lang/Integer;IILjava/lang/Object;)V
    //   155: aload_0
    //   156: getstatic r4/h.e4 : I
    //   159: invokevirtual I : (I)Landroid/view/View;
    //   162: checkcast com/smartpek/ui/customviews/PowerButton
    //   165: astore #8
    //   167: aload #8
    //   169: ifnull -> 190
    //   172: aload #8
    //   174: ldc 'powerFanSpeedUp'
    //   176: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   179: aload #8
    //   181: getstatic com/smartpek/ui/customviews/c$d.OFF : Lcom/smartpek/ui/customviews/c$d;
    //   184: iconst_0
    //   185: iconst_2
    //   186: aconst_null
    //   187: invokestatic H : (Lcom/smartpek/ui/customviews/c;Lcom/smartpek/ui/customviews/c$d;IILjava/lang/Object;)V
    //   190: aload_0
    //   191: getstatic r4/h.d4 : I
    //   194: invokevirtual I : (I)Landroid/view/View;
    //   197: checkcast com/smartpek/ui/customviews/PowerButton
    //   200: astore #8
    //   202: aload #8
    //   204: ifnull -> 225
    //   207: aload #8
    //   209: ldc 'powerFanSpeedDown'
    //   211: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   214: aload #8
    //   216: getstatic com/smartpek/ui/customviews/c$d.OFF : Lcom/smartpek/ui/customviews/c$d;
    //   219: iconst_0
    //   220: iconst_2
    //   221: aconst_null
    //   222: invokestatic H : (Lcom/smartpek/ui/customviews/c;Lcom/smartpek/ui/customviews/c$d;IILjava/lang/Object;)V
    //   225: aload_1
    //   226: ldc 'response'
    //   228: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   231: aload_1
    //   232: iconst_0
    //   233: aconst_null
    //   234: iconst_2
    //   235: aconst_null
    //   236: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   239: astore #8
    //   241: aload #8
    //   243: ifnonnull -> 249
    //   246: goto -> 375
    //   249: aload #8
    //   251: invokevirtual intValue : ()I
    //   254: iconst_1
    //   255: if_icmpne -> 375
    //   258: getstatic r4/h.x1 : I
    //   261: istore_2
    //   262: aload_0
    //   263: iload_2
    //   264: invokevirtual I : (I)Landroid/view/View;
    //   267: checkcast androidx/appcompat/widget/AppCompatImageView
    //   270: iconst_m1
    //   271: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   274: invokestatic c : (Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
    //   277: aload_0
    //   278: getstatic r4/h.q6 : I
    //   281: invokevirtual I : (I)Landroid/view/View;
    //   284: checkcast androidx/appcompat/widget/AppCompatTextView
    //   287: astore #8
    //   289: aload #8
    //   291: ifnonnull -> 297
    //   294: goto -> 313
    //   297: aload #8
    //   299: aload_1
    //   300: iconst_2
    //   301: aconst_null
    //   302: iconst_2
    //   303: aconst_null
    //   304: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   307: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   310: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   313: aload_0
    //   314: iload_2
    //   315: invokevirtual I : (I)Landroid/view/View;
    //   318: checkcast androidx/appcompat/widget/AppCompatImageView
    //   321: astore #8
    //   323: aload #8
    //   325: ifnull -> 459
    //   328: aload #8
    //   330: ldc_w 'imgFanSpeed'
    //   333: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   336: aload_1
    //   337: iconst_2
    //   338: aconst_null
    //   339: iconst_2
    //   340: aconst_null
    //   341: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   344: astore #9
    //   346: aload #9
    //   348: ifnull -> 676
    //   351: aload #9
    //   353: invokevirtual intValue : ()I
    //   356: istore_2
    //   357: goto -> 678
    //   360: aload #8
    //   362: iconst_0
    //   363: iconst_1
    //   364: aconst_null
    //   365: lload #6
    //   367: iconst_5
    //   368: aconst_null
    //   369: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   372: goto -> 459
    //   375: getstatic r4/h.x1 : I
    //   378: istore_2
    //   379: aload_0
    //   380: iload_2
    //   381: invokevirtual I : (I)Landroid/view/View;
    //   384: checkcast androidx/appcompat/widget/AppCompatImageView
    //   387: ldc_w -7829368
    //   390: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   393: invokestatic c : (Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
    //   396: aload_0
    //   397: getstatic r4/h.q6 : I
    //   400: invokevirtual I : (I)Landroid/view/View;
    //   403: checkcast androidx/appcompat/widget/AppCompatTextView
    //   406: astore #8
    //   408: aload #8
    //   410: ifnonnull -> 416
    //   413: goto -> 424
    //   416: aload #8
    //   418: ldc_w ''
    //   421: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   424: aload_0
    //   425: iload_2
    //   426: invokevirtual I : (I)Landroid/view/View;
    //   429: checkcast androidx/appcompat/widget/AppCompatImageView
    //   432: astore #8
    //   434: aload #8
    //   436: ifnull -> 459
    //   439: aload #8
    //   441: ldc_w 'imgFanSpeed'
    //   444: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   447: aload #8
    //   449: iconst_0
    //   450: iconst_0
    //   451: aconst_null
    //   452: lconst_0
    //   453: bipush #14
    //   455: aconst_null
    //   456: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   459: aload_0
    //   460: getstatic r4/h.v1 : I
    //   463: invokevirtual I : (I)Landroid/view/View;
    //   466: checkcast androidx/appcompat/widget/AppCompatImageView
    //   469: astore #8
    //   471: aload #8
    //   473: ifnonnull -> 479
    //   476: goto -> 505
    //   479: aload #8
    //   481: ldc_w 'imgError'
    //   484: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   487: aload_1
    //   488: invokevirtual getError : ()Lcom/smartpek/data/remote/Response$Error;
    //   491: ifnull -> 772
    //   494: iconst_1
    //   495: istore_2
    //   496: goto -> 774
    //   499: aload #8
    //   501: iload_2
    //   502: invokevirtual setVisibility : (I)V
    //   505: aload_0
    //   506: getstatic r4/h.p6 : I
    //   509: invokevirtual I : (I)Landroid/view/View;
    //   512: checkcast androidx/appcompat/widget/AppCompatTextView
    //   515: astore #8
    //   517: aload #8
    //   519: ifnonnull -> 523
    //   522: return
    //   523: aload #8
    //   525: ldc_w 'txtError'
    //   528: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   531: aload_1
    //   532: invokevirtual getError : ()Lcom/smartpek/data/remote/Response$Error;
    //   535: ifnull -> 789
    //   538: iload #4
    //   540: istore_2
    //   541: goto -> 791
    //   544: aload #8
    //   546: iload_2
    //   547: invokevirtual setVisibility : (I)V
    //   550: return
    //   551: aload_0
    //   552: getstatic r4/h.q6 : I
    //   555: invokevirtual I : (I)Landroid/view/View;
    //   558: checkcast androidx/appcompat/widget/AppCompatTextView
    //   561: astore_1
    //   562: aload_1
    //   563: ifnonnull -> 569
    //   566: goto -> 576
    //   569: aload_1
    //   570: ldc_w ''
    //   573: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   576: aload_0
    //   577: getstatic r4/h.x1 : I
    //   580: invokevirtual I : (I)Landroid/view/View;
    //   583: checkcast androidx/appcompat/widget/AppCompatImageView
    //   586: astore_1
    //   587: aload_1
    //   588: ifnull -> 602
    //   591: aload_1
    //   592: iconst_0
    //   593: iconst_0
    //   594: aconst_null
    //   595: lconst_0
    //   596: bipush #14
    //   598: aconst_null
    //   599: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   602: aload_0
    //   603: getstatic r4/h.b4 : I
    //   606: invokevirtual I : (I)Landroid/view/View;
    //   609: checkcast com/smartpek/ui/customviews/PowerButton
    //   612: astore_1
    //   613: aload_1
    //   614: ifnull -> 624
    //   617: aload_1
    //   618: iconst_0
    //   619: iconst_1
    //   620: aconst_null
    //   621: invokestatic j : (Lcom/smartpek/ui/customviews/c;IILjava/lang/Object;)V
    //   624: aload_0
    //   625: getstatic r4/h.v1 : I
    //   628: invokevirtual I : (I)Landroid/view/View;
    //   631: checkcast androidx/appcompat/widget/AppCompatImageView
    //   634: astore_1
    //   635: aload_1
    //   636: ifnonnull -> 642
    //   639: goto -> 648
    //   642: aload_1
    //   643: bipush #8
    //   645: invokevirtual setVisibility : (I)V
    //   648: aload_0
    //   649: getstatic r4/h.p6 : I
    //   652: invokevirtual I : (I)Landroid/view/View;
    //   655: checkcast androidx/appcompat/widget/AppCompatTextView
    //   658: astore_1
    //   659: aload_1
    //   660: ifnonnull -> 664
    //   663: return
    //   664: aload_1
    //   665: bipush #8
    //   667: invokevirtual setVisibility : (I)V
    //   670: return
    //   671: aload_1
    //   672: invokevirtual printStackTrace : ()V
    //   675: return
    //   676: iconst_1
    //   677: istore_2
    //   678: iload_2
    //   679: tableswitch default -> 716, 1 -> 764, 2 -> 756, 3 -> 748, 4 -> 740, 5 -> 732, 6 -> 724
    //   716: ldc2_w 300
    //   719: lstore #6
    //   721: goto -> 360
    //   724: ldc2_w 400
    //   727: lstore #6
    //   729: goto -> 360
    //   732: ldc2_w 600
    //   735: lstore #6
    //   737: goto -> 360
    //   740: ldc2_w 800
    //   743: lstore #6
    //   745: goto -> 360
    //   748: ldc2_w 1000
    //   751: lstore #6
    //   753: goto -> 360
    //   756: ldc2_w 1200
    //   759: lstore #6
    //   761: goto -> 360
    //   764: ldc2_w 1400
    //   767: lstore #6
    //   769: goto -> 360
    //   772: iconst_0
    //   773: istore_2
    //   774: iload_2
    //   775: ifeq -> 783
    //   778: iconst_0
    //   779: istore_2
    //   780: goto -> 499
    //   783: bipush #8
    //   785: istore_2
    //   786: goto -> 499
    //   789: iconst_0
    //   790: istore_2
    //   791: iload_2
    //   792: ifeq -> 800
    //   795: iload_3
    //   796: istore_2
    //   797: goto -> 544
    //   800: bipush #8
    //   802: istore_2
    //   803: goto -> 544
    // Exception table:
    //   from	to	target	type
    //   9	15	26	finally
    //   36	75	26	finally
    //   80	109	26	finally
    //   109	121	26	finally
    //   126	155	26	finally
    //   155	167	26	finally
    //   172	190	26	finally
    //   190	202	26	finally
    //   207	225	26	finally
    //   225	241	26	finally
    //   249	289	26	finally
    //   297	313	26	finally
    //   313	323	26	finally
    //   328	346	26	finally
    //   351	357	26	finally
    //   360	372	26	finally
    //   375	408	26	finally
    //   416	424	26	finally
    //   424	434	26	finally
    //   439	459	26	finally
    //   459	471	26	finally
    //   479	494	26	finally
    //   499	505	26	finally
    //   505	517	26	finally
    //   523	538	26	finally
    //   544	550	26	finally
    //   551	562	26	finally
    //   569	576	26	finally
    //   576	587	26	finally
    //   591	602	26	finally
    //   602	613	26	finally
    //   617	624	26	finally
    //   624	635	26	finally
    //   642	648	26	finally
    //   648	659	26	finally
    //   664	670	26	finally
  }
  
  public void H() {
    this.r.clear();
  }
  
  public View I(int paramInt) {
    Map<Integer, View> map = this.r;
    View view2 = map.get(Integer.valueOf(paramInt));
    View view1 = view2;
    if (view2 == null) {
      view1 = getView();
      if (view1 != null) {
        view1 = view1.findViewById(paramInt);
        if (view1 != null) {
          map.put(Integer.valueOf(paramInt), view1);
          return view1;
        } 
      } 
      view1 = null;
    } 
    return view1;
  }
  
  public boolean K(MotionEvent paramMotionEvent) {
    boolean bool1 = super.K(paramMotionEvent);
    boolean bool = true;
    if (!bool1) {
      if (paramMotionEvent == null || paramMotionEvent.getAction() != 0)
        bool = false; 
      if (bool && !App.g.k())
        P(); 
      return false;
    } 
    return true;
  }
  
  public boolean Q() {
    return false;
  }
  
  public void T() {
    super.T();
  }
  
  public void U(String paramString, Integer paramInteger, com.smartpek.data.local.models.b paramb, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: iload #4
    //   2: ifeq -> 10
    //   5: aconst_null
    //   6: astore_3
    //   7: goto -> 53
    //   10: aload_1
    //   11: astore_3
    //   12: aload_1
    //   13: ifnonnull -> 53
    //   16: aload_0
    //   17: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull -> 41
    //   25: aload_1
    //   26: invokevirtual getState : ()[Ljava/lang/String;
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull -> 41
    //   34: aload_1
    //   35: iconst_0
    //   36: aaload
    //   37: astore_1
    //   38: goto -> 43
    //   41: aconst_null
    //   42: astore_1
    //   43: aload_1
    //   44: astore_3
    //   45: aload_1
    //   46: ifnonnull -> 53
    //   49: ldc_w ''
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull -> 75
    //   57: aload_3
    //   58: invokeinterface length : ()I
    //   63: ifne -> 69
    //   66: goto -> 75
    //   69: iconst_0
    //   70: istore #7
    //   72: goto -> 78
    //   75: iconst_1
    //   76: istore #7
    //   78: iload #7
    //   80: ifne -> 89
    //   83: aload_0
    //   84: aload_3
    //   85: invokespecial y0 : (Ljava/lang/String;)V
    //   88: return
    //   89: aload_2
    //   90: ifnull -> 122
    //   93: aload_0
    //   94: invokespecial r0 : ()Ljava/util/List;
    //   97: aload_2
    //   98: invokevirtual intValue : ()I
    //   101: invokeinterface get : (I)Ljava/lang/Object;
    //   106: checkcast com/smartpek/ui/customviews/PowerButton
    //   109: astore_1
    //   110: aload_1
    //   111: ifnull -> 165
    //   114: aload_1
    //   115: iconst_0
    //   116: iconst_1
    //   117: aconst_null
    //   118: invokestatic j : (Lcom/smartpek/ui/customviews/c;IILjava/lang/Object;)V
    //   121: return
    //   122: aload_0
    //   123: invokespecial r0 : ()Ljava/util/List;
    //   126: invokeinterface iterator : ()Ljava/util/Iterator;
    //   131: astore_1
    //   132: aload_1
    //   133: invokeinterface hasNext : ()Z
    //   138: ifeq -> 165
    //   141: aload_1
    //   142: invokeinterface next : ()Ljava/lang/Object;
    //   147: checkcast com/smartpek/ui/customviews/PowerButton
    //   150: astore_2
    //   151: aload_2
    //   152: ifnull -> 132
    //   155: aload_2
    //   156: iconst_0
    //   157: iconst_1
    //   158: aconst_null
    //   159: invokestatic j : (Lcom/smartpek/ui/customviews/c;IILjava/lang/Object;)V
    //   162: goto -> 132
    //   165: return
  }
  
  public boolean X(PullRefreshLayout paramPullRefreshLayout, boolean paramBoolean) {
    return h.b.g((h)this, (Activity)getActivity(), O(), L(), paramBoolean, null, new e(paramBoolean, this), new f(paramPullRefreshLayout, this), new g(paramPullRefreshLayout, this), 16, null);
  }
  
  public PowerButton m0() {
    return (PowerButton)I(h.b4);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    return paramLayoutInflater.inflate(2131558500, paramViewGroup, false);
  }
  
  public void onStart() {
    super.onStart();
    Z();
  }
  
  public void onStop() {
    a0(r0());
    super.onStop();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    b0();
    int i = h.b4;
    PowerButton powerButton = (PowerButton)I(i);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.s((com.smartpek.ui.customviews.c)powerButton, 0, 0, 0, 0, 0, 31, null); 
    int j = h.f4;
    powerButton = (PowerButton)I(j);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.s((com.smartpek.ui.customviews.c)powerButton, Color.parseColor("#38A8FF"), 0, 0, 0, 0, 30, null); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setOnClickListener(new a(this)); 
    powerButton = (PowerButton)I(j);
    if (powerButton != null)
      powerButton.setOnClickListener(new b(this)); 
    i = h.e4;
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setAppendStateToContentDescription(false); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setOnClickListener(new c(this)); 
    i = h.d4;
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setAppendStateToContentDescription(false); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setOnClickListener(new d(this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final e a(Device param1Device) {
      m.j(param1Device, "device");
      if (b() == null)
        c(new ArrayList<e>()); 
      e e = new e();
      e.c0(param1Device);
      List<e> list = b();
      if (list != null)
        list.add(e); 
      return e;
    }
    
    public final List<e> b() {
      return e.k0();
    }
    
    public final void c(List<e> param1List) {
      e.l0(param1List);
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(com.smartpek.ui.customviews.c param1c) {
      super(0);
    }
    
    public final void invoke() {
      com.smartpek.ui.customviews.c c1 = this.g;
      if (c1 != null)
        com.smartpek.ui.customviews.c.v(c1, false, 0, 3, null); 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(e param1e, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      b.V(this.g, null, Integer.valueOf(this.h), null, true, false, false, 53, null);
    }
  }
  
  static final class d extends n implements r<String, String, com.smartpek.data.local.models.b, Boolean, q> {
    d(e param1e) {
      super(4);
    }
    
    public final void a(String param1String1, String param1String2, com.smartpek.data.local.models.b param1b, boolean param1Boolean) {
      b.V(this.g, param1String1, null, param1b, false, param1Boolean, false, 42, null);
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(boolean param1Boolean, e param1e) {
      super(0);
    }
    
    public final void invoke() {
      if (this.g) {
        PowerButton powerButton = (PowerButton)this.h.I(h.b4);
        if (powerButton != null) {
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 3, null);
          return;
        } 
      } else {
        PowerButton powerButton = (PowerButton)this.h.I(h.b4);
        if (powerButton != null)
          com.smartpek.ui.customviews.c.y((com.smartpek.ui.customviews.c)powerButton, false, 1, null); 
      } 
    }
  }
  
  static final class f extends n implements q8.a<q> {
    f(PullRefreshLayout param1PullRefreshLayout, e param1e) {
      super(0);
    }
    
    public final void invoke() {
      PullRefreshLayout pullRefreshLayout = this.g;
      if (pullRefreshLayout != null)
        pullRefreshLayout.q(); 
      b.V(this.h, null, null, null, true, false, false, 55, null);
    }
  }
  
  static final class g extends n implements l<String, q> {
    g(PullRefreshLayout param1PullRefreshLayout, e param1e) {
      super(1);
    }
    
    public final void a(String param1String) {
      m.j(param1String, "response");
      try {
        PullRefreshLayout pullRefreshLayout = this.g;
        return;
      } finally {
        param1String = null;
        param1String.printStackTrace();
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h5\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */