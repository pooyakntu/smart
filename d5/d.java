package d5;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b5.b;
import c5.h;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.customviews.PowerButton;
import e8.q;
import f8.o;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q8.l;
import q8.r;
import r4.h;
import r8.m;
import r8.n;

public final class d extends b {
  public static final a r = new a(null);
  
  private static List<d> s;
  
  public Map<Integer, View> q;
  
  private final PowerButton n0() {
    return (PowerButton)I(h.b4);
  }
  
  private final PowerButton o0() {
    return (PowerButton)I(h.f4);
  }
  
  private final PowerButton p0() {
    return (PowerButton)I(h.c4);
  }
  
  private final List<PowerButton> q0() {
    return o.l((Object[])new PowerButton[] { n0(), o0(), p0() });
  }
  
  private final void r0(int paramInt, Integer paramInteger) {
    c5.d.b.j((c5.d)this, getActivity(), O(), paramInt, paramInteger, L(), (com.smartpek.ui.customviews.c)q0().get(paramInt), null, new b(this, paramInt), new c(this, paramInt), new d(this), 64, null);
  }
  
  private static final void t0(d paramd, View paramView) {
    m.j(paramd, "this$0");
    s0(paramd, 0, null, 2, null);
  }
  
  private static final void u0(d paramd, View paramView) {
    m.j(paramd, "this$0");
    s0(paramd, 1, null, 2, null);
  }
  
  private static final void v0(d paramd, View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'this$0'
    //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnull -> 59
    //   15: aload_1
    //   16: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   19: astore_1
    //   20: aload_1
    //   21: ifnull -> 59
    //   24: aload_1
    //   25: iconst_2
    //   26: aaload
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull -> 59
    //   32: aload_1
    //   33: invokevirtual getClickAction : ()Lcom/smartpek/data/local/models/b;
    //   36: astore_1
    //   37: aload_1
    //   38: ifnull -> 59
    //   41: aload_1
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: bipush #15
    //   48: aconst_null
    //   49: invokestatic code$default : (Lcom/smartpek/data/local/models/b;Ljava/lang/Boolean;Lr6/e;Lcom/smartpek/data/local/models/j;Ljava/lang/Double;ILjava/lang/Object;)B
    //   52: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   55: astore_1
    //   56: goto -> 61
    //   59: aconst_null
    //   60: astore_1
    //   61: aload_0
    //   62: iconst_2
    //   63: aload_1
    //   64: invokespecial r0 : (ILjava/lang/Integer;)V
    //   67: return
  }
  
  private final void w0(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: ifnull -> 572
    //   6: aload_1
    //   7: invokestatic a : (Ljava/lang/String;)Z
    //   10: iconst_1
    //   11: if_icmpne -> 572
    //   14: iconst_1
    //   15: istore_2
    //   16: goto -> 19
    //   19: iload_2
    //   20: ifeq -> 320
    //   23: new com/google/gson/Gson
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: aload_1
    //   31: ldc com/smartpek/data/remote/Response
    //   33: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   36: checkcast com/smartpek/data/remote/Response
    //   39: astore_1
    //   40: aload_1
    //   41: invokevirtual getSection : ()Lv4/b;
    //   44: getstatic v4/b.State : Lv4/b;
    //   47: if_acmpne -> 567
    //   50: aload_0
    //   51: getstatic r4/h.b4 : I
    //   54: invokevirtual I : (I)Landroid/view/View;
    //   57: checkcast com/smartpek/ui/customviews/PowerButton
    //   60: astore #6
    //   62: aload #6
    //   64: ifnull -> 96
    //   67: aload #6
    //   69: ldc 'power'
    //   71: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   74: aload_1
    //   75: ldc 'response'
    //   77: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   80: aload #6
    //   82: aload_1
    //   83: iconst_0
    //   84: aconst_null
    //   85: iconst_2
    //   86: aconst_null
    //   87: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   90: iconst_0
    //   91: iconst_2
    //   92: aconst_null
    //   93: invokestatic I : (Lcom/smartpek/ui/customviews/c;Ljava/lang/Integer;IILjava/lang/Object;)V
    //   96: aload_0
    //   97: getstatic r4/h.f4 : I
    //   100: invokevirtual I : (I)Landroid/view/View;
    //   103: checkcast com/smartpek/ui/customviews/PowerButton
    //   106: astore #6
    //   108: aload #6
    //   110: ifnull -> 142
    //   113: aload #6
    //   115: ldc 'powerWater'
    //   117: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   120: aload_1
    //   121: ldc 'response'
    //   123: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   126: aload #6
    //   128: aload_1
    //   129: iconst_1
    //   130: aconst_null
    //   131: iconst_2
    //   132: aconst_null
    //   133: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   136: iconst_0
    //   137: iconst_2
    //   138: aconst_null
    //   139: invokestatic I : (Lcom/smartpek/ui/customviews/c;Ljava/lang/Integer;IILjava/lang/Object;)V
    //   142: getstatic r4/h.c4 : I
    //   145: istore_2
    //   146: aload_0
    //   147: iload_2
    //   148: invokevirtual I : (I)Landroid/view/View;
    //   151: checkcast com/smartpek/ui/customviews/PowerButton
    //   154: astore #6
    //   156: aload #6
    //   158: ifnull -> 190
    //   161: aload #6
    //   163: ldc 'powerFanSpeed'
    //   165: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   168: aload_1
    //   169: ldc 'response'
    //   171: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   174: aload #6
    //   176: aload_1
    //   177: iconst_0
    //   178: aconst_null
    //   179: iconst_2
    //   180: aconst_null
    //   181: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   184: iconst_0
    //   185: iconst_2
    //   186: aconst_null
    //   187: invokestatic I : (Lcom/smartpek/ui/customviews/c;Ljava/lang/Integer;IILjava/lang/Object;)V
    //   190: aload_1
    //   191: ldc 'response'
    //   193: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   196: aload_1
    //   197: iconst_0
    //   198: aconst_null
    //   199: iconst_2
    //   200: aconst_null
    //   201: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   204: astore #6
    //   206: aload #6
    //   208: ifnonnull -> 214
    //   211: goto -> 286
    //   214: aload #6
    //   216: invokevirtual intValue : ()I
    //   219: iconst_1
    //   220: if_icmpne -> 286
    //   223: aload_0
    //   224: iload_2
    //   225: invokevirtual I : (I)Landroid/view/View;
    //   228: checkcast com/smartpek/ui/customviews/PowerButton
    //   231: astore #6
    //   233: aload #6
    //   235: ifnull -> 567
    //   238: aload #6
    //   240: invokevirtual getImg : ()Landroidx/appcompat/widget/AppCompatImageView;
    //   243: astore #6
    //   245: aload #6
    //   247: ifnull -> 567
    //   250: aload_1
    //   251: iconst_2
    //   252: aconst_null
    //   253: iconst_2
    //   254: aconst_null
    //   255: invokestatic powerStateOf$default : (Lcom/smartpek/data/remote/Response;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/Integer;
    //   258: astore_1
    //   259: iload_3
    //   260: istore_2
    //   261: aload_1
    //   262: ifnull -> 577
    //   265: aload_1
    //   266: invokevirtual intValue : ()I
    //   269: istore_2
    //   270: goto -> 577
    //   273: aload #6
    //   275: iconst_0
    //   276: iconst_1
    //   277: aconst_null
    //   278: lload #4
    //   280: iconst_5
    //   281: aconst_null
    //   282: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   285: return
    //   286: aload_0
    //   287: iload_2
    //   288: invokevirtual I : (I)Landroid/view/View;
    //   291: checkcast com/smartpek/ui/customviews/PowerButton
    //   294: astore_1
    //   295: aload_1
    //   296: ifnull -> 567
    //   299: aload_1
    //   300: invokevirtual getImg : ()Landroidx/appcompat/widget/AppCompatImageView;
    //   303: astore_1
    //   304: aload_1
    //   305: ifnull -> 567
    //   308: aload_1
    //   309: iconst_0
    //   310: iconst_0
    //   311: aconst_null
    //   312: lconst_0
    //   313: bipush #14
    //   315: aconst_null
    //   316: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   319: return
    //   320: aload_1
    //   321: ifnull -> 605
    //   324: aload_1
    //   325: invokeinterface length : ()I
    //   330: ifne -> 600
    //   333: goto -> 605
    //   336: iload_2
    //   337: ifne -> 540
    //   340: aload_0
    //   341: getstatic r4/h.b4 : I
    //   344: invokevirtual I : (I)Landroid/view/View;
    //   347: checkcast com/smartpek/ui/customviews/PowerButton
    //   350: astore #6
    //   352: aload #6
    //   354: ifnull -> 370
    //   357: aload #6
    //   359: aload_1
    //   360: iconst_0
    //   361: invokevirtual charAt : (I)C
    //   364: iconst_0
    //   365: iconst_2
    //   366: aconst_null
    //   367: invokestatic G : (Lcom/smartpek/ui/customviews/c;CIILjava/lang/Object;)V
    //   370: aload_0
    //   371: getstatic r4/h.f4 : I
    //   374: invokevirtual I : (I)Landroid/view/View;
    //   377: checkcast com/smartpek/ui/customviews/PowerButton
    //   380: astore #6
    //   382: aload #6
    //   384: ifnull -> 400
    //   387: aload #6
    //   389: aload_1
    //   390: iconst_1
    //   391: invokevirtual charAt : (I)C
    //   394: iconst_0
    //   395: iconst_2
    //   396: aconst_null
    //   397: invokestatic G : (Lcom/smartpek/ui/customviews/c;CIILjava/lang/Object;)V
    //   400: getstatic r4/h.c4 : I
    //   403: istore_2
    //   404: aload_0
    //   405: iload_2
    //   406: invokevirtual I : (I)Landroid/view/View;
    //   409: checkcast com/smartpek/ui/customviews/PowerButton
    //   412: astore #6
    //   414: aload #6
    //   416: ifnull -> 432
    //   419: aload #6
    //   421: aload_1
    //   422: iconst_0
    //   423: invokevirtual charAt : (I)C
    //   426: iconst_0
    //   427: iconst_2
    //   428: aconst_null
    //   429: invokestatic G : (Lcom/smartpek/ui/customviews/c;CIILjava/lang/Object;)V
    //   432: aload_1
    //   433: iconst_0
    //   434: invokevirtual charAt : (I)C
    //   437: invokestatic a : (C)I
    //   440: iconst_1
    //   441: if_icmpne -> 506
    //   444: aload_0
    //   445: iload_2
    //   446: invokevirtual I : (I)Landroid/view/View;
    //   449: checkcast com/smartpek/ui/customviews/PowerButton
    //   452: astore #6
    //   454: aload #6
    //   456: ifnull -> 567
    //   459: aload #6
    //   461: invokevirtual getImg : ()Landroidx/appcompat/widget/AppCompatImageView;
    //   464: astore #6
    //   466: aload #6
    //   468: ifnull -> 567
    //   471: aload_1
    //   472: iconst_2
    //   473: invokevirtual charAt : (I)C
    //   476: invokestatic a : (C)I
    //   479: iconst_1
    //   480: iadd
    //   481: iconst_1
    //   482: if_icmpne -> 610
    //   485: ldc2_w 900
    //   488: lstore #4
    //   490: goto -> 493
    //   493: aload #6
    //   495: iconst_0
    //   496: iconst_1
    //   497: aconst_null
    //   498: lload #4
    //   500: iconst_5
    //   501: aconst_null
    //   502: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   505: return
    //   506: aload_0
    //   507: iload_2
    //   508: invokevirtual I : (I)Landroid/view/View;
    //   511: checkcast com/smartpek/ui/customviews/PowerButton
    //   514: astore_1
    //   515: aload_1
    //   516: ifnull -> 567
    //   519: aload_1
    //   520: invokevirtual getImg : ()Landroidx/appcompat/widget/AppCompatImageView;
    //   523: astore_1
    //   524: aload_1
    //   525: ifnull -> 567
    //   528: aload_1
    //   529: iconst_0
    //   530: iconst_0
    //   531: aconst_null
    //   532: lconst_0
    //   533: bipush #14
    //   535: aconst_null
    //   536: invokestatic f : (Landroid/view/View;ZZLandroid/view/animation/Interpolator;JILjava/lang/Object;)V
    //   539: return
    //   540: aload_0
    //   541: getstatic r4/h.b4 : I
    //   544: invokevirtual I : (I)Landroid/view/View;
    //   547: checkcast com/smartpek/ui/customviews/PowerButton
    //   550: astore_1
    //   551: aload_1
    //   552: ifnull -> 567
    //   555: aload_1
    //   556: iconst_0
    //   557: iconst_1
    //   558: aconst_null
    //   559: invokestatic j : (Lcom/smartpek/ui/customviews/c;IILjava/lang/Object;)V
    //   562: return
    //   563: aload_1
    //   564: invokevirtual printStackTrace : ()V
    //   567: return
    //   568: astore_1
    //   569: goto -> 563
    //   572: iconst_0
    //   573: istore_2
    //   574: goto -> 19
    //   577: iload_2
    //   578: iconst_1
    //   579: iadd
    //   580: iconst_1
    //   581: if_icmpne -> 592
    //   584: ldc2_w 900
    //   587: lstore #4
    //   589: goto -> 273
    //   592: ldc2_w 450
    //   595: lstore #4
    //   597: goto -> 273
    //   600: iconst_0
    //   601: istore_2
    //   602: goto -> 336
    //   605: iconst_1
    //   606: istore_2
    //   607: goto -> 336
    //   610: ldc2_w 450
    //   613: lstore #4
    //   615: goto -> 493
    // Exception table:
    //   from	to	target	type
    //   6	14	568	finally
    //   23	62	568	finally
    //   67	96	568	finally
    //   96	108	568	finally
    //   113	142	568	finally
    //   142	156	568	finally
    //   161	190	568	finally
    //   190	206	568	finally
    //   214	233	568	finally
    //   238	245	568	finally
    //   250	259	568	finally
    //   265	270	568	finally
    //   273	285	568	finally
    //   286	295	568	finally
    //   299	304	568	finally
    //   308	319	568	finally
    //   324	333	568	finally
    //   340	352	568	finally
    //   357	370	568	finally
    //   370	382	568	finally
    //   387	400	568	finally
    //   400	414	568	finally
    //   419	432	568	finally
    //   432	454	568	finally
    //   459	466	568	finally
    //   471	485	568	finally
    //   493	505	568	finally
    //   506	515	568	finally
    //   519	524	568	finally
    //   528	539	568	finally
    //   540	551	568	finally
    //   555	562	568	finally
  }
  
  public void H() {
    this.q.clear();
  }
  
  public View I(int paramInt) {
    Map<Integer, View> map = this.q;
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
    return !!super.K(paramMotionEvent);
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
    //   85: invokespecial w0 : (Ljava/lang/String;)V
    //   88: return
    //   89: aload_2
    //   90: ifnull -> 122
    //   93: aload_0
    //   94: invokespecial q0 : ()Ljava/util/List;
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
    //   123: invokespecial q0 : ()Ljava/util/List;
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
    return paramLayoutInflater.inflate(2131558497, paramViewGroup, false);
  }
  
  public void onStart() {
    super.onStart();
    Z();
  }
  
  public void onStop() {
    a0(q0());
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
    int k = h.c4;
    powerButton = (PowerButton)I(k);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.s((com.smartpek.ui.customviews.c)powerButton, Color.parseColor("#F7F9FB"), 0, 0, 0, 0, 30, null); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setOnClickListener(new a(this)); 
    powerButton = (PowerButton)I(j);
    if (powerButton != null)
      powerButton.setOnClickListener(new b(this)); 
    powerButton = (PowerButton)I(k);
    if (powerButton != null)
      powerButton.setOnClickListener(new c(this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final d a(Device param1Device) {
      m.j(param1Device, "device");
      if (b() == null)
        c(new ArrayList<d>()); 
      d d = new d();
      d.c0(param1Device);
      List<d> list = b();
      if (list != null)
        list.add(d); 
      return d;
    }
    
    public final List<d> b() {
      return d.j0();
    }
    
    public final void c(List<d> param1List) {
      d.l0(param1List);
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(d param1d, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = d.k0(this.g).get(this.h);
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 3, null); 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(d param1d, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      b.V(this.g, null, Integer.valueOf(this.h), null, true, false, false, 53, null);
    }
  }
  
  static final class d extends n implements r<String, String, com.smartpek.data.local.models.b, Boolean, q> {
    d(d param1d) {
      super(4);
    }
    
    public final void a(String param1String1, String param1String2, com.smartpek.data.local.models.b param1b, boolean param1Boolean) {
      b.V(this.g, param1String1, null, param1b, false, param1Boolean, false, 42, null);
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(boolean param1Boolean, d param1d) {
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
    f(PullRefreshLayout param1PullRefreshLayout, d param1d) {
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
    g(PullRefreshLayout param1PullRefreshLayout, d param1d) {
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


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d5\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */