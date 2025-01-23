package h6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.android.volley.VolleyError;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.j;
import com.smartpek.utils.sweetalert.i;
import e8.q;
import java.util.Map;
import p6.j;
import p7.c0;
import p7.c1;
import p7.x1;
import q8.l;
import r8.g;
import r8.m;
import r8.n;

public final class e extends Fragment {
  public static final a i = new a(null);
  
  private Device g;
  
  public Map<Integer, View> h;
  
  private static final void P(e parame, View paramView) {
    m.j(parame, "this$0");
    if (j.b.a((Activity)parame.getActivity(), parame.g))
      return; 
    parame.T("4", "1");
  }
  
  private static final void Q(e parame, View paramView) {
    m.j(parame, "this$0");
    if (j.b.a((Activity)parame.getActivity(), parame.g))
      return; 
    parame.T("4", "0");
  }
  
  private static final void R(e parame, View paramView) {
    m.j(parame, "this$0");
    if (j.b.a((Activity)parame.getActivity(), parame.g))
      return; 
    parame.T("startup", "1");
  }
  
  private static final void S(e parame, View paramView) {
    m.j(parame, "this$0");
    if (j.b.a((Activity)parame.getActivity(), parame.g))
      return; 
    parame.T("startup", "0");
  }
  
  private final void T(String paramString1, String paramString2) {
    String str;
    i i = new i((Context)getActivity(), true, 5);
    i.F(Color.parseColor("#CC0606"));
    Context context1 = getContext();
    Context context2 = null;
    if (context1 != null) {
      str = c1.g(context1, 2131951777);
    } else {
      context1 = null;
    } 
    i.setTitle((CharSequence)context1);
    context1 = getContext();
    if (context1 != null) {
      str = c1.g(context1, 2131951780);
    } else {
      context1 = null;
    } 
    i.y((String)context1);
    i.show();
    i.setCancelable(false);
    p6.e e1 = new p6.e((Context)getActivity());
    androidx.fragment.app.e e2 = getActivity();
    context1 = context2;
    if (e2 != null) {
      Intent intent = e2.getIntent();
      context1 = context2;
      if (intent != null)
        str = intent.getStringExtra("url"); 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append("Device?");
    e1.m(stringBuilder.toString()).h("CMD", "2").h("action", paramString1).h("mode", paramString2).i(new e(i, this), new f(i, this));
  }
  
  public void L() {
    this.h.clear();
  }
  
  public View M(int paramInt) {
    Map<Integer, View> map = this.h;
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
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    return paramLayoutInflater.inflate(2131558531, paramViewGroup, false);
  }
  
  public void onPause() {
    Context context = getContext();
    if (context != null)
      x1.c(context, getView()); 
    super.onPause();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'view'
    //   4: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_0
    //   8: aload_1
    //   9: aload_2
    //   10: invokespecial onViewCreated : (Landroid/view/View;Landroid/os/Bundle;)V
    //   13: aload_0
    //   14: getstatic r4/h.W4 : I
    //   17: invokevirtual M : (I)Landroid/view/View;
    //   20: checkcast ir/am3n/needtool/views/A3RelativeLayout
    //   23: astore_1
    //   24: bipush #8
    //   26: istore #4
    //   28: iconst_1
    //   29: istore #5
    //   31: aload_1
    //   32: ifnonnull -> 38
    //   35: goto -> 90
    //   38: aload_0
    //   39: getfield g : Lcom/smartpek/data/local/db/models/Device;
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull -> 71
    //   47: aload_2
    //   48: invokevirtual getCtrlType : ()Ljava/lang/Integer;
    //   51: astore_2
    //   52: aload_2
    //   53: ifnonnull -> 59
    //   56: goto -> 71
    //   59: aload_2
    //   60: invokevirtual intValue : ()I
    //   63: ifne -> 71
    //   66: iconst_1
    //   67: istore_3
    //   68: goto -> 73
    //   71: iconst_0
    //   72: istore_3
    //   73: iload_3
    //   74: ifeq -> 83
    //   77: bipush #8
    //   79: istore_3
    //   80: goto -> 85
    //   83: iconst_0
    //   84: istore_3
    //   85: aload_1
    //   86: iload_3
    //   87: invokevirtual setVisibility : (I)V
    //   90: aload_0
    //   91: getstatic r4/h.D : I
    //   94: invokevirtual M : (I)Landroid/view/View;
    //   97: checkcast com/google/android/material/button/MaterialButton
    //   100: astore_1
    //   101: aload_1
    //   102: ifnull -> 117
    //   105: aload_1
    //   106: new h6/a
    //   109: dup
    //   110: aload_0
    //   111: invokespecial <init> : (Lh6/e;)V
    //   114: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   117: aload_0
    //   118: getstatic r4/h.E : I
    //   121: invokevirtual M : (I)Landroid/view/View;
    //   124: checkcast com/google/android/material/button/MaterialButton
    //   127: astore_1
    //   128: aload_1
    //   129: ifnull -> 144
    //   132: aload_1
    //   133: new h6/b
    //   136: dup
    //   137: aload_0
    //   138: invokespecial <init> : (Lh6/e;)V
    //   141: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   144: aload_0
    //   145: getstatic r4/h.b5 : I
    //   148: invokevirtual M : (I)Landroid/view/View;
    //   151: checkcast ir/am3n/needtool/views/A3RelativeLayout
    //   154: astore #8
    //   156: aconst_null
    //   157: astore_2
    //   158: aload #8
    //   160: ifnonnull -> 166
    //   163: goto -> 396
    //   166: aload_0
    //   167: getfield g : Lcom/smartpek/data/local/db/models/Device;
    //   170: astore_1
    //   171: aload_1
    //   172: ifnull -> 192
    //   175: aload_1
    //   176: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   179: astore_1
    //   180: aload_1
    //   181: ifnull -> 192
    //   184: aload_1
    //   185: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   188: astore_1
    //   189: goto -> 194
    //   192: aconst_null
    //   193: astore_1
    //   194: aload_1
    //   195: ifnonnull -> 203
    //   198: iconst_m1
    //   199: istore_3
    //   200: goto -> 212
    //   203: getstatic h6/e$b.a : [I
    //   206: aload_1
    //   207: invokevirtual ordinal : ()I
    //   210: iaload
    //   211: istore_3
    //   212: iload_3
    //   213: iconst_1
    //   214: if_icmpeq -> 340
    //   217: iload_3
    //   218: iconst_2
    //   219: if_icmpeq -> 289
    //   222: iload_3
    //   223: iconst_3
    //   224: if_icmpeq -> 289
    //   227: iload_3
    //   228: iconst_4
    //   229: if_icmpeq -> 238
    //   232: bipush #8
    //   234: istore_3
    //   235: goto -> 390
    //   238: aload_0
    //   239: getstatic r4/h.y6 : I
    //   242: invokevirtual M : (I)Landroid/view/View;
    //   245: checkcast androidx/appcompat/widget/AppCompatTextView
    //   248: astore #9
    //   250: aload #9
    //   252: ifnonnull -> 258
    //   255: goto -> 388
    //   258: aload_0
    //   259: invokevirtual getContext : ()Landroid/content/Context;
    //   262: astore_1
    //   263: aload_1
    //   264: ifnull -> 278
    //   267: aload_1
    //   268: ldc_w 2131952329
    //   271: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   274: astore_1
    //   275: goto -> 280
    //   278: aconst_null
    //   279: astore_1
    //   280: aload #9
    //   282: aload_1
    //   283: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   286: goto -> 388
    //   289: aload_0
    //   290: getstatic r4/h.y6 : I
    //   293: invokevirtual M : (I)Landroid/view/View;
    //   296: checkcast androidx/appcompat/widget/AppCompatTextView
    //   299: astore #9
    //   301: aload #9
    //   303: ifnonnull -> 309
    //   306: goto -> 388
    //   309: aload_0
    //   310: invokevirtual getContext : ()Landroid/content/Context;
    //   313: astore_1
    //   314: aload_1
    //   315: ifnull -> 329
    //   318: aload_1
    //   319: ldc_w 2131952329
    //   322: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   325: astore_1
    //   326: goto -> 331
    //   329: aconst_null
    //   330: astore_1
    //   331: aload #9
    //   333: aload_1
    //   334: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   337: goto -> 388
    //   340: aload_0
    //   341: getstatic r4/h.y6 : I
    //   344: invokevirtual M : (I)Landroid/view/View;
    //   347: checkcast androidx/appcompat/widget/AppCompatTextView
    //   350: astore #9
    //   352: aload #9
    //   354: ifnonnull -> 360
    //   357: goto -> 388
    //   360: aload_0
    //   361: invokevirtual getContext : ()Landroid/content/Context;
    //   364: astore_1
    //   365: aload_1
    //   366: ifnull -> 380
    //   369: aload_1
    //   370: ldc_w 2131952333
    //   373: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   376: astore_1
    //   377: goto -> 382
    //   380: aconst_null
    //   381: astore_1
    //   382: aload #9
    //   384: aload_1
    //   385: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   388: iconst_0
    //   389: istore_3
    //   390: aload #8
    //   392: iload_3
    //   393: invokevirtual setVisibility : (I)V
    //   396: aload_0
    //   397: getstatic r4/h.Q : I
    //   400: invokevirtual M : (I)Landroid/view/View;
    //   403: checkcast com/google/android/material/button/MaterialButton
    //   406: astore_1
    //   407: aload_1
    //   408: ifnull -> 423
    //   411: aload_1
    //   412: new h6/c
    //   415: dup
    //   416: aload_0
    //   417: invokespecial <init> : (Lh6/e;)V
    //   420: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   423: aload_0
    //   424: getstatic r4/h.P : I
    //   427: invokevirtual M : (I)Landroid/view/View;
    //   430: checkcast com/google/android/material/button/MaterialButton
    //   433: astore_1
    //   434: aload_1
    //   435: ifnull -> 450
    //   438: aload_1
    //   439: new h6/d
    //   442: dup
    //   443: aload_0
    //   444: invokespecial <init> : (Lh6/e;)V
    //   447: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   450: aload_0
    //   451: getstatic r4/h.a5 : I
    //   454: invokevirtual M : (I)Landroid/view/View;
    //   457: checkcast ir/am3n/needtool/views/A3RelativeLayout
    //   460: astore #8
    //   462: aload #8
    //   464: ifnonnull -> 470
    //   467: goto -> 526
    //   470: aload_0
    //   471: getfield g : Lcom/smartpek/data/local/db/models/Device;
    //   474: astore_1
    //   475: aload_1
    //   476: ifnull -> 496
    //   479: aload_1
    //   480: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   483: astore_1
    //   484: aload_1
    //   485: ifnull -> 496
    //   488: aload_1
    //   489: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   492: astore_1
    //   493: goto -> 498
    //   496: aconst_null
    //   497: astore_1
    //   498: aload_1
    //   499: getstatic com/smartpek/data/local/models/j.PSH212 : Lcom/smartpek/data/local/models/j;
    //   502: if_acmpne -> 510
    //   505: iconst_1
    //   506: istore_3
    //   507: goto -> 512
    //   510: iconst_0
    //   511: istore_3
    //   512: iload_3
    //   513: ifeq -> 519
    //   516: iconst_0
    //   517: istore #4
    //   519: aload #8
    //   521: iload #4
    //   523: invokevirtual setVisibility : (I)V
    //   526: getstatic r4/h.O : I
    //   529: istore #6
    //   531: aload_0
    //   532: iload #6
    //   534: invokevirtual M : (I)Landroid/view/View;
    //   537: checkcast com/google/android/material/button/MaterialButton
    //   540: astore #8
    //   542: ldc_w 2131099856
    //   545: istore #4
    //   547: aload #8
    //   549: ifnonnull -> 555
    //   552: goto -> 647
    //   555: aload_0
    //   556: getfield g : Lcom/smartpek/data/local/db/models/Device;
    //   559: astore_1
    //   560: aload_1
    //   561: ifnull -> 601
    //   564: aload_1
    //   565: invokevirtual getFlags : ()[Ljava/lang/Integer;
    //   568: astore_1
    //   569: aload_1
    //   570: ifnull -> 601
    //   573: aload_1
    //   574: iconst_0
    //   575: invokestatic v : ([Ljava/lang/Object;I)Ljava/lang/Object;
    //   578: checkcast java/lang/Integer
    //   581: astore_1
    //   582: aload_1
    //   583: ifnonnull -> 589
    //   586: goto -> 601
    //   589: aload_1
    //   590: invokevirtual intValue : ()I
    //   593: ifne -> 601
    //   596: iconst_1
    //   597: istore_3
    //   598: goto -> 603
    //   601: iconst_0
    //   602: istore_3
    //   603: iload_3
    //   604: ifeq -> 614
    //   607: ldc_w 2131099856
    //   610: istore_3
    //   611: goto -> 618
    //   614: ldc_w 2131099773
    //   617: istore_3
    //   618: aload_0
    //   619: iload_3
    //   620: invokestatic b : (Landroidx/fragment/app/Fragment;I)Ljava/lang/Integer;
    //   623: astore_1
    //   624: aload_1
    //   625: ifnull -> 639
    //   628: aload_1
    //   629: invokevirtual intValue : ()I
    //   632: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   635: astore_1
    //   636: goto -> 641
    //   639: aconst_null
    //   640: astore_1
    //   641: aload #8
    //   643: aload_1
    //   644: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
    //   647: getstatic r4/h.N : I
    //   650: istore #7
    //   652: aload_0
    //   653: iload #7
    //   655: invokevirtual M : (I)Landroid/view/View;
    //   658: checkcast com/google/android/material/button/MaterialButton
    //   661: astore #8
    //   663: aload #8
    //   665: ifnonnull -> 671
    //   668: goto -> 764
    //   671: aload_0
    //   672: getfield g : Lcom/smartpek/data/local/db/models/Device;
    //   675: astore_1
    //   676: aload_1
    //   677: ifnull -> 719
    //   680: aload_1
    //   681: invokevirtual getFlags : ()[Ljava/lang/Integer;
    //   684: astore_1
    //   685: aload_1
    //   686: ifnull -> 719
    //   689: aload_1
    //   690: iconst_0
    //   691: invokestatic v : ([Ljava/lang/Object;I)Ljava/lang/Object;
    //   694: checkcast java/lang/Integer
    //   697: astore_1
    //   698: aload_1
    //   699: ifnonnull -> 705
    //   702: goto -> 719
    //   705: aload_1
    //   706: invokevirtual intValue : ()I
    //   709: iconst_1
    //   710: if_icmpne -> 719
    //   713: iload #5
    //   715: istore_3
    //   716: goto -> 721
    //   719: iconst_0
    //   720: istore_3
    //   721: iload_3
    //   722: ifeq -> 731
    //   725: iload #4
    //   727: istore_3
    //   728: goto -> 735
    //   731: ldc_w 2131099773
    //   734: istore_3
    //   735: aload_0
    //   736: iload_3
    //   737: invokestatic b : (Landroidx/fragment/app/Fragment;I)Ljava/lang/Integer;
    //   740: astore #9
    //   742: aload_2
    //   743: astore_1
    //   744: aload #9
    //   746: ifnull -> 758
    //   749: aload #9
    //   751: invokevirtual intValue : ()I
    //   754: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   757: astore_1
    //   758: aload #8
    //   760: aload_1
    //   761: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
    //   764: aload_0
    //   765: iload #6
    //   767: invokevirtual M : (I)Landroid/view/View;
    //   770: checkcast com/google/android/material/button/MaterialButton
    //   773: astore_1
    //   774: aload_1
    //   775: ifnull -> 790
    //   778: aload_1
    //   779: new h6/e$c
    //   782: dup
    //   783: aload_0
    //   784: invokespecial <init> : (Lh6/e;)V
    //   787: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   790: aload_0
    //   791: iload #7
    //   793: invokevirtual M : (I)Landroid/view/View;
    //   796: checkcast com/google/android/material/button/MaterialButton
    //   799: astore_1
    //   800: aload_1
    //   801: ifnull -> 816
    //   804: aload_1
    //   805: new h6/e$d
    //   808: dup
    //   809: aload_0
    //   810: invokespecial <init> : (Lh6/e;)V
    //   813: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   816: return
  }
  
  public static final class a {
    private a() {}
    
    public final e a(Device param1Device) {
      e e = new e();
      e.O(e, param1Device);
      return e;
    }
  }
  
  static final class c extends n implements l<View, q> {
    c(e param1e) {
      super(1);
    }
    
    public final void a(View param1View) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'it'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_0
      //   7: getfield g : Lh6/e;
      //   10: invokestatic N : (Lh6/e;)Lcom/smartpek/data/local/db/models/Device;
      //   13: astore_1
      //   14: aload_1
      //   15: ifnull -> 241
      //   18: aload_0
      //   19: getfield g : Lh6/e;
      //   22: astore #4
      //   24: aload_1
      //   25: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   28: astore_3
      //   29: aload_3
      //   30: ifnull -> 57
      //   33: aload_3
      //   34: arraylength
      //   35: ifne -> 43
      //   38: iconst_1
      //   39: istore_2
      //   40: goto -> 45
      //   43: iconst_0
      //   44: istore_2
      //   45: iload_2
      //   46: ifeq -> 52
      //   49: goto -> 57
      //   52: iconst_0
      //   53: istore_2
      //   54: goto -> 59
      //   57: iconst_1
      //   58: istore_2
      //   59: iload_2
      //   60: ifeq -> 78
      //   63: aload_1
      //   64: iconst_1
      //   65: anewarray java/lang/Integer
      //   68: dup
      //   69: iconst_0
      //   70: iconst_0
      //   71: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   74: aastore
      //   75: invokevirtual setFlags : ([Ljava/lang/Integer;)V
      //   78: aload_1
      //   79: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   82: astore_3
      //   83: aload_3
      //   84: ifnull -> 94
      //   87: aload_3
      //   88: iconst_0
      //   89: iconst_0
      //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   93: aastore
      //   94: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   97: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   100: astore_3
      //   101: aload_3
      //   102: ifnull -> 120
      //   105: aload_3
      //   106: invokevirtual H : ()Lu4/a;
      //   109: astore_3
      //   110: aload_3
      //   111: ifnull -> 120
      //   114: aload_3
      //   115: aload_1
      //   116: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   119: pop
      //   120: aload #4
      //   122: getstatic r4/h.O : I
      //   125: invokevirtual M : (I)Landroid/view/View;
      //   128: checkcast com/google/android/material/button/MaterialButton
      //   131: astore #5
      //   133: aconst_null
      //   134: astore_3
      //   135: aload #5
      //   137: ifnonnull -> 143
      //   140: goto -> 174
      //   143: aload #4
      //   145: ldc 2131099856
      //   147: invokestatic b : (Landroidx/fragment/app/Fragment;I)Ljava/lang/Integer;
      //   150: astore_1
      //   151: aload_1
      //   152: ifnull -> 166
      //   155: aload_1
      //   156: invokevirtual intValue : ()I
      //   159: invokestatic d : (I)Landroid/content/res/ColorStateList;
      //   162: astore_1
      //   163: goto -> 168
      //   166: aconst_null
      //   167: astore_1
      //   168: aload #5
      //   170: aload_1
      //   171: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
      //   174: aload #4
      //   176: getstatic r4/h.N : I
      //   179: invokevirtual M : (I)Landroid/view/View;
      //   182: checkcast com/google/android/material/button/MaterialButton
      //   185: astore #5
      //   187: aload #5
      //   189: ifnonnull -> 195
      //   192: goto -> 226
      //   195: aload #4
      //   197: ldc 2131099773
      //   199: invokestatic b : (Landroidx/fragment/app/Fragment;I)Ljava/lang/Integer;
      //   202: astore #6
      //   204: aload_3
      //   205: astore_1
      //   206: aload #6
      //   208: ifnull -> 220
      //   211: aload #6
      //   213: invokevirtual intValue : ()I
      //   216: invokestatic d : (I)Landroid/content/res/ColorStateList;
      //   219: astore_1
      //   220: aload #5
      //   222: aload_1
      //   223: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
      //   226: aload #4
      //   228: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   231: astore_1
      //   232: aload_1
      //   233: ifnull -> 241
      //   236: aload_1
      //   237: iconst_m1
      //   238: invokevirtual setResult : (I)V
      //   241: return
    }
  }
  
  static final class d extends n implements l<View, q> {
    d(e param1e) {
      super(1);
    }
    
    public final void a(View param1View) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'it'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_0
      //   7: getfield g : Lh6/e;
      //   10: invokestatic N : (Lh6/e;)Lcom/smartpek/data/local/db/models/Device;
      //   13: astore_1
      //   14: aload_1
      //   15: ifnull -> 241
      //   18: aload_0
      //   19: getfield g : Lh6/e;
      //   22: astore #4
      //   24: aload_1
      //   25: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   28: astore_3
      //   29: aload_3
      //   30: ifnull -> 57
      //   33: aload_3
      //   34: arraylength
      //   35: ifne -> 43
      //   38: iconst_1
      //   39: istore_2
      //   40: goto -> 45
      //   43: iconst_0
      //   44: istore_2
      //   45: iload_2
      //   46: ifeq -> 52
      //   49: goto -> 57
      //   52: iconst_0
      //   53: istore_2
      //   54: goto -> 59
      //   57: iconst_1
      //   58: istore_2
      //   59: iload_2
      //   60: ifeq -> 78
      //   63: aload_1
      //   64: iconst_1
      //   65: anewarray java/lang/Integer
      //   68: dup
      //   69: iconst_0
      //   70: iconst_0
      //   71: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   74: aastore
      //   75: invokevirtual setFlags : ([Ljava/lang/Integer;)V
      //   78: aload_1
      //   79: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   82: astore_3
      //   83: aload_3
      //   84: ifnull -> 94
      //   87: aload_3
      //   88: iconst_0
      //   89: iconst_1
      //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   93: aastore
      //   94: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   97: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   100: astore_3
      //   101: aload_3
      //   102: ifnull -> 120
      //   105: aload_3
      //   106: invokevirtual H : ()Lu4/a;
      //   109: astore_3
      //   110: aload_3
      //   111: ifnull -> 120
      //   114: aload_3
      //   115: aload_1
      //   116: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   119: pop
      //   120: aload #4
      //   122: getstatic r4/h.O : I
      //   125: invokevirtual M : (I)Landroid/view/View;
      //   128: checkcast com/google/android/material/button/MaterialButton
      //   131: astore #5
      //   133: aconst_null
      //   134: astore_3
      //   135: aload #5
      //   137: ifnonnull -> 143
      //   140: goto -> 174
      //   143: aload #4
      //   145: ldc 2131099773
      //   147: invokestatic b : (Landroidx/fragment/app/Fragment;I)Ljava/lang/Integer;
      //   150: astore_1
      //   151: aload_1
      //   152: ifnull -> 166
      //   155: aload_1
      //   156: invokevirtual intValue : ()I
      //   159: invokestatic d : (I)Landroid/content/res/ColorStateList;
      //   162: astore_1
      //   163: goto -> 168
      //   166: aconst_null
      //   167: astore_1
      //   168: aload #5
      //   170: aload_1
      //   171: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
      //   174: aload #4
      //   176: getstatic r4/h.N : I
      //   179: invokevirtual M : (I)Landroid/view/View;
      //   182: checkcast com/google/android/material/button/MaterialButton
      //   185: astore #5
      //   187: aload #5
      //   189: ifnonnull -> 195
      //   192: goto -> 226
      //   195: aload #4
      //   197: ldc 2131099856
      //   199: invokestatic b : (Landroidx/fragment/app/Fragment;I)Ljava/lang/Integer;
      //   202: astore #6
      //   204: aload_3
      //   205: astore_1
      //   206: aload #6
      //   208: ifnull -> 220
      //   211: aload #6
      //   213: invokevirtual intValue : ()I
      //   216: invokestatic d : (I)Landroid/content/res/ColorStateList;
      //   219: astore_1
      //   220: aload #5
      //   222: aload_1
      //   223: invokevirtual setBackgroundTintList : (Landroid/content/res/ColorStateList;)V
      //   226: aload #4
      //   228: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   231: astore_1
      //   232: aload_1
      //   233: ifnull -> 241
      //   236: aload_1
      //   237: iconst_m1
      //   238: invokevirtual setResult : (I)V
      //   241: return
    }
  }
  
  static final class e extends n implements l<String, q> {
    e(i param1i, e param1e) {
      super(1);
    }
    
    public final void a(String param1String) {
      m.j(param1String, "it");
      this.g.h(2);
      i i1 = this.g;
      Context context = this.h.getContext();
      if (context != null) {
        String str = c1.g(context, 2131951778);
      } else {
        context = null;
      } 
      i1.y((String)context);
    }
  }
  
  static final class f extends n implements l<VolleyError, q> {
    f(i param1i, e param1e) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      m.j(param1VolleyError, "it");
      this.g.h(1);
      i i1 = this.g;
      Context context = this.h.getContext();
      if (context != null) {
        String str = c1.g(context, 2131951779);
      } else {
        context = null;
      } 
      i1.y((String)context);
      c0.l(1000, new a(this.g));
    }
    
    static final class a extends n implements q8.a<q> {
      a(i param2i) {
        super(0);
      }
      
      public final void invoke() {
        this.g.j();
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      this.g.j();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h6\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */