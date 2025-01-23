package b5;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.e1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import b9.e0;
import b9.t0;
import com.android.volley.VolleyError;
import com.smartpek.App;
import com.smartpek.data.local.db.DB;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.utils.connection.ConnMngr;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.c1;
import p7.e1;
import p7.f0;
import p7.k0;
import p7.q1;
import p7.r1;
import p7.s1;
import p7.v1;
import p7.x1;
import v0.i0;
import v0.j0;

@SuppressLint({"ClickableViewAccessibility"})
public final class i extends Fragment implements Observer<Device> {
  public static final a q = new a(null);
  
  private static i r;
  
  private LiveData<Device> g;
  
  private boolean h;
  
  private long i = -1L;
  
  private Integer j;
  
  private long k = p7.t.a();
  
  private x4.h l;
  
  private x4.i m;
  
  private Device n;
  
  private boolean o = true;
  
  public Map<Integer, View> p;
  
  private final void a0(Context paramContext) {
    if (paramContext != null) {
      i0 i0 = j0.c(paramContext).e(2132148224);
      if (i0 != null)
        setSharedElementEnterTransition(i0); 
    } 
  }
  
  private final void e0() {
    App.g.a("DeviceFrg > init()");
    int j = r4.h.m3;
    View view3 = O(j);
    if (view3 != null)
      view3.setTransitionName(x5.g.F.c()); 
    AppCompatTextView appCompatTextView4 = (AppCompatTextView)O(r4.h.v6);
    if (appCompatTextView4 != null)
      appCompatTextView4.setTransitionName(x5.g.F.d()); 
    AppCompatImageView appCompatImageView3 = (AppCompatImageView)O(r4.h.r1);
    if (appCompatImageView3 != null)
      appCompatImageView3.setTransitionName(x5.g.F.a()); 
    AppCompatTextView appCompatTextView3 = (AppCompatTextView)O(r4.h.Y6);
    if (appCompatTextView3 != null)
      appCompatTextView3.setTransitionName(x5.g.F.f()); 
    appCompatTextView3 = (AppCompatTextView)O(r4.h.J6);
    if (appCompatTextView3 != null)
      appCompatTextView3.setTransitionName(x5.g.F.e()); 
    AppCompatImageButton appCompatImageButton = (AppCompatImageButton)O(r4.h.h2);
    if (appCompatImageButton != null)
      appCompatImageButton.setTransitionName(x5.g.F.b()); 
    View view2 = getView();
    if (view2 != null)
      x1.e(view2, new e(this)); 
    int k = r4.h.C0;
    AppCompatEditText appCompatEditText = (AppCompatEditText)O(k);
    if (appCompatEditText != null)
      appCompatEditText.addTextChangedListener(new d(this)); 
    appCompatEditText = (AppCompatEditText)O(k);
    if (appCompatEditText != null)
      appCompatEditText.setVisibility(4); 
    AppCompatTextView appCompatTextView2 = (AppCompatTextView)O(r4.h.D0);
    if (appCompatTextView2 != null)
      appCompatTextView2.setVisibility(4); 
    View view1 = O(j);
    if (view1 != null)
      view1.setAlpha(1.0F); 
    AppCompatImageView appCompatImageView2 = (AppCompatImageView)O(r4.h.s1);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(4); 
    int m = r4.h.l3;
    appCompatImageView2 = (AppCompatImageView)O(m);
    k = 2131231024;
    if (appCompatImageView2 != null) {
      if (this.o) {
        j = 0;
      } else {
        j = 2131231024;
      } 
      appCompatImageView2.setImageResource(j);
    } 
    int n = r4.h.M4;
    appCompatImageView2 = (AppCompatImageView)O(n);
    if (appCompatImageView2 != null) {
      j = k;
      if (this.o)
        j = 0; 
      appCompatImageView2.setImageResource(j);
    } 
    appCompatImageView2 = (AppCompatImageView)O(m);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(4); 
    appCompatImageView2 = (AppCompatImageView)O(n);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(4); 
    p7.c0.l(300, new f(this));
    appCompatImageView2 = (AppCompatImageView)O(r4.h.Q1);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(8); 
    appCompatImageView2 = (AppCompatImageView)O(r4.h.O1);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(8); 
    appCompatImageView2 = (AppCompatImageView)O(r4.h.P1);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(8); 
    appCompatImageView2 = (AppCompatImageView)O(r4.h.R1);
    if (appCompatImageView2 != null)
      appCompatImageView2.setVisibility(8); 
    AppCompatTextView appCompatTextView1 = (AppCompatTextView)O(r4.h.g6);
    if (appCompatTextView1 != null)
      appCompatTextView1.setAlpha(0.0F); 
    AppCompatImageView appCompatImageView1 = (AppCompatImageView)O(r4.h.o1);
    if (appCompatImageView1 != null)
      appCompatImageView1.setAlpha(0.0F); 
    FrameLayout frameLayout = (FrameLayout)O(r4.h.Y0);
    if (frameLayout != null)
      frameLayout.setAlpha(0.0F); 
    r0(this, false, null, 3, null);
  }
  
  private static final boolean k0(i parami, TextView paramTextView, int paramInt, KeyEvent paramKeyEvent) {
    r8.m.j(parami, "this$0");
    if (paramInt == 6) {
      AppCompatImageButton appCompatImageButton = (AppCompatImageButton)parami.O(r4.h.Y1);
      if (appCompatImageButton != null)
        appCompatImageButton.performClick(); 
      return true;
    } 
    return false;
  }
  
  private static final void l0(i parami, View paramView) {
    r8.m.j(parami, "this$0");
    Y(parami, r1.b.LEFT, null, 2, null);
  }
  
  private static final void m0(i parami, View paramView) {
    r8.m.j(parami, "this$0");
    Y(parami, r1.b.RIGHT, null, 2, null);
  }
  
  private static final void n0(i parami, View paramView) {
    r8.m.j(parami, "this$0");
    Y(parami, r1.b.LEFT, null, 2, null);
  }
  
  private static final void o0(i parami, View paramView) {
    r8.m.j(parami, "this$0");
    Y(parami, r1.b.RIGHT, null, 2, null);
  }
  
  private static final boolean p0(i parami, View paramView) {
    r8.m.j(parami, "this$0");
    Device device = parami.n;
    if (device != null) {
      r8.m.g(device);
      device.setConnType(device.getConnType().toggle());
    } 
    return true;
  }
  
  private final void q0(boolean paramBoolean, r1.b paramb) {
    // Byte code:
    //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   3: astore #5
    //   5: aload #5
    //   7: ldc_w 'DeviceFrg > openDeviceFrg()'
    //   10: invokevirtual a : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   17: astore #6
    //   19: new java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #7
    //   28: aload #7
    //   30: ldc_w 'openDeviceFrg()  device: '
    //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload #7
    //   39: aload #6
    //   41: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_0
    //   46: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   49: ifnonnull -> 53
    //   52: return
    //   53: aload_0
    //   54: getfield g : Landroidx/lifecycle/LiveData;
    //   57: astore #6
    //   59: aload #6
    //   61: ifnull -> 70
    //   64: aload #6
    //   66: aload_0
    //   67: invokevirtual removeObserver : (Landroidx/lifecycle/Observer;)V
    //   70: aload #5
    //   72: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
    //   75: astore #5
    //   77: aload #5
    //   79: invokestatic g : (Ljava/lang/Object;)V
    //   82: aload #5
    //   84: invokevirtual H : ()Lu4/a;
    //   87: astore #5
    //   89: aload_0
    //   90: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   93: astore #6
    //   95: aload #6
    //   97: invokestatic g : (Ljava/lang/Object;)V
    //   100: aload #5
    //   102: aload #6
    //   104: invokevirtual getId : ()I
    //   107: invokevirtual w : (I)Landroidx/lifecycle/LiveData;
    //   110: astore #5
    //   112: aload_0
    //   113: aload #5
    //   115: putfield g : Landroidx/lifecycle/LiveData;
    //   118: aload #5
    //   120: invokestatic g : (Ljava/lang/Object;)V
    //   123: aload #5
    //   125: aload_0
    //   126: invokestatic j : (Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleOwner;
    //   129: aload_0
    //   130: invokevirtual observe : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V
    //   133: aload_0
    //   134: getfield o : Z
    //   137: ifne -> 212
    //   140: new x4/j
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: aload_0
    //   148: invokevirtual getActivity : ()Landroidx/fragment/app/e;
    //   151: aload_0
    //   152: getstatic r4/h.Q1 : I
    //   155: invokevirtual O : (I)Landroid/view/View;
    //   158: checkcast androidx/appcompat/widget/AppCompatImageView
    //   161: aload_0
    //   162: getstatic r4/h.O1 : I
    //   165: invokevirtual O : (I)Landroid/view/View;
    //   168: checkcast androidx/appcompat/widget/AppCompatImageView
    //   171: aload_0
    //   172: getstatic r4/h.P1 : I
    //   175: invokevirtual O : (I)Landroid/view/View;
    //   178: checkcast androidx/appcompat/widget/AppCompatImageView
    //   181: invokevirtual a : (Landroidx/fragment/app/e;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)Z
    //   184: ifne -> 212
    //   187: new x4/j
    //   190: dup
    //   191: invokespecial <init> : ()V
    //   194: aload_0
    //   195: invokevirtual getActivity : ()Landroidx/fragment/app/e;
    //   198: aload_0
    //   199: getstatic r4/h.R1 : I
    //   202: invokevirtual O : (I)Landroid/view/View;
    //   205: checkcast androidx/appcompat/widget/AppCompatImageView
    //   208: invokevirtual b : (Landroidx/fragment/app/e;Landroidx/appcompat/widget/AppCompatImageView;)Z
    //   211: pop
    //   212: getstatic r4/h.v6 : I
    //   215: istore_3
    //   216: aload_0
    //   217: iload_3
    //   218: invokevirtual O : (I)Landroid/view/View;
    //   221: checkcast androidx/appcompat/widget/AppCompatTextView
    //   224: astore #5
    //   226: iconst_1
    //   227: istore #4
    //   229: aload #5
    //   231: ifnonnull -> 237
    //   234: goto -> 243
    //   237: aload #5
    //   239: iconst_1
    //   240: invokevirtual setSelected : (Z)V
    //   243: aload_0
    //   244: iload_3
    //   245: invokevirtual O : (I)Landroid/view/View;
    //   248: checkcast androidx/appcompat/widget/AppCompatTextView
    //   251: astore #7
    //   253: aconst_null
    //   254: astore #6
    //   256: aload #7
    //   258: ifnonnull -> 264
    //   261: goto -> 295
    //   264: aload_0
    //   265: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   268: astore #5
    //   270: aload #5
    //   272: ifnull -> 285
    //   275: aload #5
    //   277: invokevirtual getName : ()Ljava/lang/String;
    //   280: astore #5
    //   282: goto -> 288
    //   285: aconst_null
    //   286: astore #5
    //   288: aload #7
    //   290: aload #5
    //   292: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   295: aload_0
    //   296: getstatic r4/h.C0 : I
    //   299: invokevirtual O : (I)Landroid/view/View;
    //   302: checkcast androidx/appcompat/widget/AppCompatEditText
    //   305: astore #5
    //   307: aload #5
    //   309: ifnull -> 320
    //   312: aload #5
    //   314: ldc_w ''
    //   317: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   320: aload_0
    //   321: getstatic r4/h.D0 : I
    //   324: invokevirtual O : (I)Landroid/view/View;
    //   327: checkcast androidx/appcompat/widget/AppCompatTextView
    //   330: astore #5
    //   332: aload #5
    //   334: ifnonnull -> 340
    //   337: goto -> 346
    //   340: aload #5
    //   342: iconst_4
    //   343: invokevirtual setVisibility : (I)V
    //   346: aload_0
    //   347: getstatic r4/h.r1 : I
    //   350: invokevirtual O : (I)Landroid/view/View;
    //   353: checkcast androidx/appcompat/widget/AppCompatImageView
    //   356: astore #5
    //   358: aload #5
    //   360: ifnull -> 411
    //   363: aload_0
    //   364: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   367: astore #7
    //   369: aload #7
    //   371: ifnull -> 388
    //   374: aload #7
    //   376: invokevirtual isDemo : ()Z
    //   379: iconst_1
    //   380: if_icmpne -> 388
    //   383: iconst_1
    //   384: istore_3
    //   385: goto -> 390
    //   388: iconst_0
    //   389: istore_3
    //   390: iload_3
    //   391: ifeq -> 401
    //   394: ldc_w 2131231144
    //   397: istore_3
    //   398: goto -> 405
    //   401: ldc_w 2131231110
    //   404: istore_3
    //   405: aload #5
    //   407: iload_3
    //   408: invokevirtual setImageResource : (I)V
    //   411: aload_0
    //   412: getstatic r4/h.h2 : I
    //   415: invokevirtual O : (I)Landroid/view/View;
    //   418: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   421: astore #5
    //   423: aload #5
    //   425: ifnonnull -> 431
    //   428: goto -> 437
    //   431: aload #5
    //   433: iconst_0
    //   434: invokevirtual setVisibility : (I)V
    //   437: aload_0
    //   438: getstatic r4/h.s3 : I
    //   441: invokevirtual O : (I)Landroid/view/View;
    //   444: checkcast android/widget/RelativeLayout
    //   447: astore #5
    //   449: aload #5
    //   451: ifnonnull -> 457
    //   454: goto -> 463
    //   457: aload #5
    //   459: iconst_0
    //   460: invokevirtual setVisibility : (I)V
    //   463: getstatic r4/h.Y6 : I
    //   466: istore_3
    //   467: aload_0
    //   468: iload_3
    //   469: invokevirtual O : (I)Landroid/view/View;
    //   472: checkcast androidx/appcompat/widget/AppCompatTextView
    //   475: astore #5
    //   477: aload #5
    //   479: ifnonnull -> 485
    //   482: goto -> 491
    //   485: aload #5
    //   487: iconst_0
    //   488: invokevirtual setVisibility : (I)V
    //   491: aload_0
    //   492: iload_3
    //   493: invokevirtual O : (I)Landroid/view/View;
    //   496: checkcast androidx/appcompat/widget/AppCompatTextView
    //   499: astore #7
    //   501: aload #7
    //   503: ifnonnull -> 509
    //   506: goto -> 557
    //   509: aload_0
    //   510: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   513: astore #5
    //   515: aload #5
    //   517: ifnull -> 547
    //   520: aload #5
    //   522: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   525: astore #5
    //   527: aload #5
    //   529: ifnull -> 547
    //   532: aload #5
    //   534: aload_0
    //   535: invokevirtual getContext : ()Landroid/content/Context;
    //   538: iconst_0
    //   539: invokevirtual knownName : (Landroid/content/Context;Z)Ljava/lang/String;
    //   542: astore #5
    //   544: goto -> 550
    //   547: aconst_null
    //   548: astore #5
    //   550: aload #7
    //   552: aload #5
    //   554: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   557: aload_0
    //   558: iload_3
    //   559: invokevirtual O : (I)Landroid/view/View;
    //   562: checkcast androidx/appcompat/widget/AppCompatTextView
    //   565: astore #5
    //   567: aload #5
    //   569: ifnonnull -> 575
    //   572: goto -> 581
    //   575: aload #5
    //   577: iconst_1
    //   578: invokevirtual setSelected : (Z)V
    //   581: getstatic r4/h.J6 : I
    //   584: istore_3
    //   585: aload_0
    //   586: iload_3
    //   587: invokevirtual O : (I)Landroid/view/View;
    //   590: checkcast androidx/appcompat/widget/AppCompatTextView
    //   593: astore #5
    //   595: aload #5
    //   597: ldc_w 'txtSerial'
    //   600: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   603: aload #5
    //   605: iconst_0
    //   606: invokevirtual setVisibility : (I)V
    //   609: aload_0
    //   610: iload_3
    //   611: invokevirtual O : (I)Landroid/view/View;
    //   614: checkcast androidx/appcompat/widget/AppCompatTextView
    //   617: astore #7
    //   619: aload #7
    //   621: ifnonnull -> 627
    //   624: goto -> 670
    //   627: aload_0
    //   628: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   631: astore #5
    //   633: aload #5
    //   635: ifnull -> 660
    //   638: aload #5
    //   640: invokevirtual getSsid : ()Ljava/lang/String;
    //   643: astore #5
    //   645: aload #5
    //   647: ifnull -> 660
    //   650: aload #5
    //   652: invokestatic I : (Ljava/lang/String;)Ljava/lang/String;
    //   655: astore #5
    //   657: goto -> 663
    //   660: aconst_null
    //   661: astore #5
    //   663: aload #7
    //   665: aload #5
    //   667: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   670: aload_0
    //   671: iload_3
    //   672: invokevirtual O : (I)Landroid/view/View;
    //   675: checkcast androidx/appcompat/widget/AppCompatTextView
    //   678: astore #5
    //   680: aload #5
    //   682: ifnonnull -> 688
    //   685: goto -> 694
    //   688: aload #5
    //   690: iconst_1
    //   691: invokevirtual setSelected : (Z)V
    //   694: aload_0
    //   695: getstatic r4/h.g6 : I
    //   698: invokevirtual O : (I)Landroid/view/View;
    //   701: checkcast androidx/appcompat/widget/AppCompatTextView
    //   704: astore #5
    //   706: aload #5
    //   708: ifnonnull -> 714
    //   711: goto -> 720
    //   714: aload #5
    //   716: fconst_0
    //   717: invokevirtual setAlpha : (F)V
    //   720: aload_0
    //   721: getstatic r4/h.o1 : I
    //   724: invokevirtual O : (I)Landroid/view/View;
    //   727: checkcast androidx/appcompat/widget/AppCompatImageView
    //   730: astore #5
    //   732: aload #5
    //   734: ifnonnull -> 740
    //   737: goto -> 746
    //   740: aload #5
    //   742: fconst_0
    //   743: invokevirtual setAlpha : (F)V
    //   746: bipush #20
    //   748: new b5/i$a0
    //   751: dup
    //   752: aload_0
    //   753: invokespecial <init> : (Lb5/i;)V
    //   756: invokestatic l : (ILq8/a;)V
    //   759: aload_0
    //   760: invokespecial s0 : ()V
    //   763: getstatic x5/o.i : Lx5/o$a;
    //   766: astore #7
    //   768: aload #7
    //   770: invokevirtual b : ()Lx5/o;
    //   773: astore #5
    //   775: aload #5
    //   777: ifnull -> 790
    //   780: aload #5
    //   782: invokevirtual K : ()Lb5/b;
    //   785: astore #5
    //   787: goto -> 793
    //   790: aconst_null
    //   791: astore #5
    //   793: aload #5
    //   795: ifnonnull -> 801
    //   798: goto -> 842
    //   801: aload_2
    //   802: getstatic p7/r1$b.RIGHT : Lp7/r1$b;
    //   805: if_acmpne -> 813
    //   808: iconst_1
    //   809: istore_1
    //   810: goto -> 815
    //   813: iconst_0
    //   814: istore_1
    //   815: new o3/d
    //   818: dup
    //   819: iconst_0
    //   820: iload_1
    //   821: invokespecial <init> : (IZ)V
    //   824: astore #8
    //   826: aload #8
    //   828: ldc2_w 200
    //   831: invokevirtual k0 : (J)Lv0/i0;
    //   834: pop
    //   835: aload #5
    //   837: aload #8
    //   839: invokevirtual setExitTransition : (Ljava/lang/Object;)V
    //   842: getstatic r4/h.Y0 : I
    //   845: istore_3
    //   846: aload_0
    //   847: iload_3
    //   848: invokevirtual O : (I)Landroid/view/View;
    //   851: checkcast android/widget/FrameLayout
    //   854: astore #8
    //   856: aload #6
    //   858: astore #5
    //   860: aload #8
    //   862: ifnull -> 875
    //   865: aload #8
    //   867: invokevirtual getAlpha : ()F
    //   870: invokestatic valueOf : (F)Ljava/lang/Float;
    //   873: astore #5
    //   875: aload #5
    //   877: fconst_0
    //   878: invokestatic d : (Ljava/lang/Float;F)Z
    //   881: ifeq -> 959
    //   884: aload_0
    //   885: iload_3
    //   886: invokevirtual O : (I)Landroid/view/View;
    //   889: checkcast android/widget/FrameLayout
    //   892: astore #5
    //   894: aload #5
    //   896: ifnull -> 959
    //   899: aload #5
    //   901: invokevirtual animate : ()Landroid/view/ViewPropertyAnimator;
    //   904: astore #5
    //   906: aload #5
    //   908: ifnull -> 959
    //   911: aload #5
    //   913: fconst_1
    //   914: invokevirtual alpha : (F)Landroid/view/ViewPropertyAnimator;
    //   917: astore #5
    //   919: aload #5
    //   921: ifnull -> 959
    //   924: aload #5
    //   926: ldc2_w 300
    //   929: invokevirtual setStartDelay : (J)Landroid/view/ViewPropertyAnimator;
    //   932: astore #5
    //   934: aload #5
    //   936: ifnull -> 959
    //   939: aload #5
    //   941: ldc2_w 150
    //   944: invokevirtual setDuration : (J)Landroid/view/ViewPropertyAnimator;
    //   947: astore #5
    //   949: aload #5
    //   951: ifnull -> 959
    //   954: aload #5
    //   956: invokevirtual start : ()V
    //   959: aload_0
    //   960: invokestatic f : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/m;
    //   963: invokevirtual n : ()Landroidx/fragment/app/v;
    //   966: astore #6
    //   968: aload_0
    //   969: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   972: astore #5
    //   974: aload #5
    //   976: invokestatic g : (Ljava/lang/Object;)V
    //   979: aload #5
    //   981: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   984: astore #5
    //   986: aload #5
    //   988: ifnonnull -> 996
    //   991: iconst_m1
    //   992: istore_3
    //   993: goto -> 1006
    //   996: getstatic b5/i$b.b : [I
    //   999: aload #5
    //   1001: invokevirtual ordinal : ()I
    //   1004: iaload
    //   1005: istore_3
    //   1006: iload_3
    //   1007: tableswitch default -> 1112, -1 -> 1680, 0 -> 1112, 1 -> 1680, 2 -> 1652, 3 -> 1624, 4 -> 1596, 5 -> 1568, 6 -> 1540, 7 -> 1512, 8 -> 1484, 9 -> 1456, 10 -> 1428, 11 -> 1400, 12 -> 1372, 13 -> 1344, 14 -> 1316, 15 -> 1288, 16 -> 1260, 17 -> 1232, 18 -> 1204, 19 -> 1176, 20 -> 1148, 21 -> 1120
    //   1112: new kotlin/NoWhenBranchMatchedException
    //   1115: dup
    //   1116: invokespecial <init> : ()V
    //   1119: athrow
    //   1120: getstatic v5/a.r : Lv5/a$a;
    //   1123: astore #5
    //   1125: aload_0
    //   1126: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1129: astore #8
    //   1131: aload #8
    //   1133: invokestatic g : (Ljava/lang/Object;)V
    //   1136: aload #5
    //   1138: aload #8
    //   1140: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lv5/a;
    //   1143: astore #5
    //   1145: goto -> 1689
    //   1148: getstatic u5/b.r : Lu5/b$a;
    //   1151: astore #5
    //   1153: aload_0
    //   1154: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1157: astore #8
    //   1159: aload #8
    //   1161: invokestatic g : (Ljava/lang/Object;)V
    //   1164: aload #5
    //   1166: aload #8
    //   1168: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lu5/b;
    //   1171: astore #5
    //   1173: goto -> 1689
    //   1176: getstatic j5/f.r : Lj5/f$a;
    //   1179: astore #5
    //   1181: aload_0
    //   1182: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1185: astore #8
    //   1187: aload #8
    //   1189: invokestatic g : (Ljava/lang/Object;)V
    //   1192: aload #5
    //   1194: aload #8
    //   1196: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lj5/f;
    //   1199: astore #5
    //   1201: goto -> 1689
    //   1204: getstatic h5/e.s : Lh5/e$a;
    //   1207: astore #5
    //   1209: aload_0
    //   1210: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1213: astore #8
    //   1215: aload #8
    //   1217: invokestatic g : (Ljava/lang/Object;)V
    //   1220: aload #5
    //   1222: aload #8
    //   1224: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lh5/e;
    //   1227: astore #5
    //   1229: goto -> 1689
    //   1232: getstatic g5/f.s : Lg5/f$a;
    //   1235: astore #5
    //   1237: aload_0
    //   1238: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1241: astore #8
    //   1243: aload #8
    //   1245: invokestatic g : (Ljava/lang/Object;)V
    //   1248: aload #5
    //   1250: aload #8
    //   1252: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lg5/f;
    //   1255: astore #5
    //   1257: goto -> 1689
    //   1260: getstatic f5/e.r : Lf5/e$a;
    //   1263: astore #5
    //   1265: aload_0
    //   1266: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1269: astore #8
    //   1271: aload #8
    //   1273: invokestatic g : (Ljava/lang/Object;)V
    //   1276: aload #5
    //   1278: aload #8
    //   1280: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lf5/e;
    //   1283: astore #5
    //   1285: goto -> 1689
    //   1288: getstatic d5/d.r : Ld5/d$a;
    //   1291: astore #5
    //   1293: aload_0
    //   1294: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1297: astore #8
    //   1299: aload #8
    //   1301: invokestatic g : (Ljava/lang/Object;)V
    //   1304: aload #5
    //   1306: aload #8
    //   1308: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Ld5/d;
    //   1311: astore #5
    //   1313: goto -> 1689
    //   1316: getstatic m5/e.r : Lm5/e$a;
    //   1319: astore #5
    //   1321: aload_0
    //   1322: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1325: astore #8
    //   1327: aload #8
    //   1329: invokestatic g : (Ljava/lang/Object;)V
    //   1332: aload #5
    //   1334: aload #8
    //   1336: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lm5/e;
    //   1339: astore #5
    //   1341: goto -> 1689
    //   1344: getstatic l5/c.r : Ll5/c$a;
    //   1347: astore #5
    //   1349: aload_0
    //   1350: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1353: astore #8
    //   1355: aload #8
    //   1357: invokestatic g : (Ljava/lang/Object;)V
    //   1360: aload #5
    //   1362: aload #8
    //   1364: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Ll5/c;
    //   1367: astore #5
    //   1369: goto -> 1689
    //   1372: getstatic n5/g.r : Ln5/g$a;
    //   1375: astore #5
    //   1377: aload_0
    //   1378: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1381: astore #8
    //   1383: aload #8
    //   1385: invokestatic g : (Ljava/lang/Object;)V
    //   1388: aload #5
    //   1390: aload #8
    //   1392: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Ln5/g;
    //   1395: astore #5
    //   1397: goto -> 1689
    //   1400: getstatic m5/e.r : Lm5/e$a;
    //   1403: astore #5
    //   1405: aload_0
    //   1406: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1409: astore #8
    //   1411: aload #8
    //   1413: invokestatic g : (Ljava/lang/Object;)V
    //   1416: aload #5
    //   1418: aload #8
    //   1420: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lm5/e;
    //   1423: astore #5
    //   1425: goto -> 1689
    //   1428: getstatic l5/c.r : Ll5/c$a;
    //   1431: astore #5
    //   1433: aload_0
    //   1434: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1437: astore #8
    //   1439: aload #8
    //   1441: invokestatic g : (Ljava/lang/Object;)V
    //   1444: aload #5
    //   1446: aload #8
    //   1448: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Ll5/c;
    //   1451: astore #5
    //   1453: goto -> 1689
    //   1456: getstatic p5/d.r : Lp5/d$a;
    //   1459: astore #5
    //   1461: aload_0
    //   1462: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1465: astore #8
    //   1467: aload #8
    //   1469: invokestatic g : (Ljava/lang/Object;)V
    //   1472: aload #5
    //   1474: aload #8
    //   1476: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lp5/d;
    //   1479: astore #5
    //   1481: goto -> 1689
    //   1484: getstatic q5/g.r : Lq5/g$a;
    //   1487: astore #5
    //   1489: aload_0
    //   1490: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1493: astore #8
    //   1495: aload #8
    //   1497: invokestatic g : (Ljava/lang/Object;)V
    //   1500: aload #5
    //   1502: aload #8
    //   1504: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lq5/g;
    //   1507: astore #5
    //   1509: goto -> 1689
    //   1512: getstatic s5/a.s : Ls5/a$a;
    //   1515: astore #5
    //   1517: aload_0
    //   1518: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1521: astore #8
    //   1523: aload #8
    //   1525: invokestatic g : (Ljava/lang/Object;)V
    //   1528: aload #5
    //   1530: aload #8
    //   1532: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Ls5/a;
    //   1535: astore #5
    //   1537: goto -> 1689
    //   1540: getstatic t5/s.r : Lt5/s$a;
    //   1543: astore #5
    //   1545: aload_0
    //   1546: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1549: astore #8
    //   1551: aload #8
    //   1553: invokestatic g : (Ljava/lang/Object;)V
    //   1556: aload #5
    //   1558: aload #8
    //   1560: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lt5/s;
    //   1563: astore #5
    //   1565: goto -> 1689
    //   1568: getstatic r5/m.r : Lr5/m$a;
    //   1571: astore #5
    //   1573: aload_0
    //   1574: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1577: astore #8
    //   1579: aload #8
    //   1581: invokestatic g : (Ljava/lang/Object;)V
    //   1584: aload #5
    //   1586: aload #8
    //   1588: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lr5/m;
    //   1591: astore #5
    //   1593: goto -> 1689
    //   1596: getstatic q5/g.r : Lq5/g$a;
    //   1599: astore #5
    //   1601: aload_0
    //   1602: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1605: astore #8
    //   1607: aload #8
    //   1609: invokestatic g : (Ljava/lang/Object;)V
    //   1612: aload #5
    //   1614: aload #8
    //   1616: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lq5/g;
    //   1619: astore #5
    //   1621: goto -> 1689
    //   1624: getstatic p5/d.r : Lp5/d$a;
    //   1627: astore #5
    //   1629: aload_0
    //   1630: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1633: astore #8
    //   1635: aload #8
    //   1637: invokestatic g : (Ljava/lang/Object;)V
    //   1640: aload #5
    //   1642: aload #8
    //   1644: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Lp5/d;
    //   1647: astore #5
    //   1649: goto -> 1689
    //   1652: getstatic i5/d.s : Li5/d$a;
    //   1655: astore #5
    //   1657: aload_0
    //   1658: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1661: astore #8
    //   1663: aload #8
    //   1665: invokestatic g : (Ljava/lang/Object;)V
    //   1668: aload #5
    //   1670: aload #8
    //   1672: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;)Li5/d;
    //   1675: astore #5
    //   1677: goto -> 1689
    //   1680: new b5/m
    //   1683: dup
    //   1684: invokespecial <init> : ()V
    //   1687: astore #5
    //   1689: aload #5
    //   1691: getstatic b5/b$a.DEVICES : Lb5/b$a;
    //   1694: invokevirtual e0 : (Lb5/b$a;)V
    //   1697: aload #7
    //   1699: invokevirtual b : ()Lx5/o;
    //   1702: astore #7
    //   1704: aload #7
    //   1706: ifnonnull -> 1712
    //   1709: goto -> 1719
    //   1712: aload #7
    //   1714: aload #5
    //   1716: invokevirtual R : (Lb5/b;)V
    //   1719: aload_2
    //   1720: getstatic p7/r1$b.RIGHT : Lp7/r1$b;
    //   1723: if_acmpne -> 1732
    //   1726: iload #4
    //   1728: istore_1
    //   1729: goto -> 1734
    //   1732: iconst_0
    //   1733: istore_1
    //   1734: new o3/d
    //   1737: dup
    //   1738: iconst_0
    //   1739: iload_1
    //   1740: invokespecial <init> : (IZ)V
    //   1743: astore_2
    //   1744: aload_2
    //   1745: ldc2_w 300
    //   1748: invokevirtual k0 : (J)Lv0/i0;
    //   1751: pop
    //   1752: aload #5
    //   1754: aload_2
    //   1755: invokevirtual setEnterTransition : (Ljava/lang/Object;)V
    //   1758: getstatic e8/q.a : Le8/q;
    //   1761: astore_2
    //   1762: aload #6
    //   1764: ldc_w 2131362189
    //   1767: aload #5
    //   1769: ldc_w 'DeviceFrg-FrameContent'
    //   1772: invokevirtual u : (ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/v;
    //   1775: invokevirtual k : ()I
    //   1778: pop
    //   1779: getstatic com/smartpek/utils/connection/ConnMngr.j : Lcom/smartpek/utils/connection/ConnMngr$b;
    //   1782: aload_0
    //   1783: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1786: invokevirtual l : (Lcom/smartpek/data/local/db/models/Device;)V
    //   1789: getstatic x5/l.l : Lx5/l$a;
    //   1792: invokevirtual c : ()Lx5/l;
    //   1795: astore_2
    //   1796: aload_2
    //   1797: ifnull -> 1808
    //   1800: aload_2
    //   1801: aload_0
    //   1802: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   1805: invokevirtual l0 : (Lcom/smartpek/data/local/db/models/Device;)V
    //   1808: return
  }
  
  private final void s0() {
    Integer integer = this.j;
    int j = 2131231396;
    int k = 1;
    int m = 1;
    if (integer == null) {
      Device device = this.n;
      r8.m.g(device);
      this.j = Integer.valueOf(device.getBackgroundColor());
      if (Build.VERSION.SDK_INT > 21) {
        j = r4.h.m3;
        if (O(j) != null) {
          View view = O(j);
          Integer integer1 = this.j;
          if (integer1 != null) {
            ColorStateList colorStateList = c1.d(integer1.intValue());
          } else {
            integer1 = null;
          } 
          e1.C0(view, (ColorStateList)integer1);
          return;
        } 
      } else {
        View view = O(r4.h.m3);
        if (view != null) {
          Device device1 = this.n;
          if (device1 != null && device1.isDemo() == true) {
            k = m;
          } else {
            k = 0;
          } 
          if (!k)
            j = 2131231395; 
          view.setBackgroundResource(j);
          return;
        } 
      } 
    } else {
      Device device = this.n;
      r8.m.g(device);
      m = device.getBackgroundColor();
      if (Build.VERSION.SDK_INT > 21) {
        p7.l.b b = p7.l.a;
        Integer integer1 = this.j;
        r8.m.g(integer1);
        ValueAnimator valueAnimator = b.b(integer1.intValue(), m).b(new c0(this));
        valueAnimator.setStartDelay(300L);
        valueAnimator.setDuration(500L);
        valueAnimator.start();
      } else {
        View view = O(r4.h.m3);
        if (view != null) {
          Device device1 = this.n;
          if (device1 == null || device1.isDemo() != true)
            k = 0; 
          if (k == 0)
            j = 2131231395; 
          view.setBackgroundResource(j);
        } 
      } 
      this.j = Integer.valueOf(m);
    } 
  }
  
  public void N() {
    this.p.clear();
  }
  
  public View O(int paramInt) {
    Map<Integer, View> map = this.p;
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
  
  public final void X(r1.b paramb, c5.c paramc) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'direction'
    //   4: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_2
    //   8: ldc_w 'commandFrom'
    //   11: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   17: ldc_w 'DeviceFrg > changeDeviceFrg()'
    //   20: invokevirtual a : (Ljava/lang/String;)V
    //   23: aload_0
    //   24: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   27: astore #8
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #9
    //   38: aload #9
    //   40: ldc_w 'changeDeviceFrg()  device: '
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload #9
    //   49: aload #8
    //   51: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_0
    //   56: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   59: ifnonnull -> 63
    //   62: return
    //   63: aload_0
    //   64: getfield h : Z
    //   67: istore #7
    //   69: iconst_0
    //   70: istore #5
    //   72: iconst_0
    //   73: istore #4
    //   75: iload #7
    //   77: ifeq -> 86
    //   80: aload_0
    //   81: iconst_0
    //   82: invokevirtual b0 : (Z)V
    //   85: return
    //   86: aload_2
    //   87: getstatic c5/c.NTFY : Lc5/c;
    //   90: if_acmpeq -> 286
    //   93: aload_0
    //   94: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   97: astore_2
    //   98: aload_2
    //   99: ldc_w 'resources'
    //   102: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   105: aload_2
    //   106: invokestatic f : (Landroid/content/res/Resources;)Z
    //   109: ifeq -> 443
    //   112: iconst_1
    //   113: istore_3
    //   114: goto -> 117
    //   117: getstatic b5/i$b.a : [I
    //   120: aload_1
    //   121: invokevirtual ordinal : ()I
    //   124: iaload
    //   125: istore #6
    //   127: iload #6
    //   129: iconst_1
    //   130: if_icmpeq -> 167
    //   133: iload #6
    //   135: iconst_2
    //   136: if_icmpeq -> 142
    //   139: goto -> 189
    //   142: getstatic x5/l.l : Lx5/l$a;
    //   145: astore_2
    //   146: aload_2
    //   147: aload_0
    //   148: invokevirtual getContext : ()Landroid/content/Context;
    //   151: aload_2
    //   152: aload_0
    //   153: invokevirtual getContext : ()Landroid/content/Context;
    //   156: invokevirtual b : (Landroid/content/Context;)I
    //   159: iload_3
    //   160: isub
    //   161: invokevirtual d : (Landroid/content/Context;I)V
    //   164: goto -> 189
    //   167: getstatic x5/l.l : Lx5/l$a;
    //   170: astore_2
    //   171: aload_2
    //   172: aload_0
    //   173: invokevirtual getContext : ()Landroid/content/Context;
    //   176: aload_2
    //   177: aload_0
    //   178: invokevirtual getContext : ()Landroid/content/Context;
    //   181: invokevirtual b : (Landroid/content/Context;)I
    //   184: iload_3
    //   185: iadd
    //   186: invokevirtual d : (Landroid/content/Context;I)V
    //   189: getstatic x5/l.l : Lx5/l$a;
    //   192: astore_2
    //   193: aload_0
    //   194: invokevirtual getContext : ()Landroid/content/Context;
    //   197: astore #8
    //   199: aload_2
    //   200: aload_0
    //   201: invokevirtual getContext : ()Landroid/content/Context;
    //   204: invokevirtual b : (Landroid/content/Context;)I
    //   207: istore #6
    //   209: getstatic x5/o.i : Lx5/o$a;
    //   212: astore #9
    //   214: aload #9
    //   216: invokevirtual b : ()Lx5/o;
    //   219: astore #10
    //   221: aload #10
    //   223: ifnull -> 448
    //   226: aload #10
    //   228: invokevirtual M : ()I
    //   231: istore_3
    //   232: goto -> 450
    //   235: aload_2
    //   236: aload_0
    //   237: invokevirtual getContext : ()Landroid/content/Context;
    //   240: invokevirtual b : (Landroid/content/Context;)I
    //   243: ifge -> 270
    //   246: aload #9
    //   248: invokevirtual b : ()Lx5/o;
    //   251: astore #9
    //   253: iload #5
    //   255: istore_3
    //   256: aload #9
    //   258: ifnull -> 462
    //   261: aload #9
    //   263: invokevirtual M : ()I
    //   266: istore_3
    //   267: goto -> 462
    //   270: aload_2
    //   271: aload_0
    //   272: invokevirtual getContext : ()Landroid/content/Context;
    //   275: invokevirtual b : (Landroid/content/Context;)I
    //   278: istore_3
    //   279: aload_2
    //   280: aload #8
    //   282: iload_3
    //   283: invokevirtual d : (Landroid/content/Context;I)V
    //   286: getstatic x5/o.i : Lx5/o$a;
    //   289: invokevirtual b : ()Lx5/o;
    //   292: astore_2
    //   293: aload_2
    //   294: ifnull -> 469
    //   297: aload_2
    //   298: invokevirtual L : ()Ljava/util/List;
    //   301: astore_2
    //   302: aload_2
    //   303: ifnull -> 469
    //   306: aload_2
    //   307: getstatic x5/l.l : Lx5/l$a;
    //   310: aload_0
    //   311: invokevirtual getContext : ()Landroid/content/Context;
    //   314: invokevirtual b : (Landroid/content/Context;)I
    //   317: invokeinterface get : (I)Ljava/lang/Object;
    //   322: checkcast com/smartpek/data/local/db/models/Device
    //   325: astore_2
    //   326: goto -> 329
    //   329: aload_0
    //   330: aload_2
    //   331: putfield n : Lcom/smartpek/data/local/db/models/Device;
    //   334: aload_0
    //   335: getstatic r4/h.Q1 : I
    //   338: invokevirtual O : (I)Landroid/view/View;
    //   341: checkcast androidx/appcompat/widget/AppCompatImageView
    //   344: astore_2
    //   345: aload_2
    //   346: ifnonnull -> 352
    //   349: goto -> 358
    //   352: aload_2
    //   353: bipush #8
    //   355: invokevirtual setVisibility : (I)V
    //   358: aload_0
    //   359: getstatic r4/h.O1 : I
    //   362: invokevirtual O : (I)Landroid/view/View;
    //   365: checkcast androidx/appcompat/widget/AppCompatImageView
    //   368: astore_2
    //   369: aload_2
    //   370: ifnonnull -> 376
    //   373: goto -> 382
    //   376: aload_2
    //   377: bipush #8
    //   379: invokevirtual setVisibility : (I)V
    //   382: aload_0
    //   383: getstatic r4/h.P1 : I
    //   386: invokevirtual O : (I)Landroid/view/View;
    //   389: checkcast androidx/appcompat/widget/AppCompatImageView
    //   392: astore_2
    //   393: aload_2
    //   394: ifnonnull -> 400
    //   397: goto -> 406
    //   400: aload_2
    //   401: bipush #8
    //   403: invokevirtual setVisibility : (I)V
    //   406: aload_0
    //   407: getstatic r4/h.R1 : I
    //   410: invokevirtual O : (I)Landroid/view/View;
    //   413: checkcast androidx/appcompat/widget/AppCompatImageView
    //   416: astore_2
    //   417: aload_2
    //   418: ifnonnull -> 424
    //   421: goto -> 430
    //   424: aload_2
    //   425: bipush #8
    //   427: invokevirtual setVisibility : (I)V
    //   430: aload_0
    //   431: iconst_1
    //   432: aload_1
    //   433: invokespecial q0 : (ZLp7/r1$b;)V
    //   436: return
    //   437: astore_1
    //   438: aload_1
    //   439: invokevirtual printStackTrace : ()V
    //   442: return
    //   443: iconst_m1
    //   444: istore_3
    //   445: goto -> 117
    //   448: iconst_0
    //   449: istore_3
    //   450: iload #6
    //   452: iload_3
    //   453: if_icmplt -> 235
    //   456: iload #4
    //   458: istore_3
    //   459: goto -> 279
    //   462: iload_3
    //   463: iconst_1
    //   464: isub
    //   465: istore_3
    //   466: goto -> 279
    //   469: aconst_null
    //   470: astore_2
    //   471: goto -> 329
    // Exception table:
    //   from	to	target	type
    //   14	62	437	finally
    //   63	69	437	finally
    //   80	85	437	finally
    //   86	112	437	finally
    //   117	127	437	finally
    //   142	164	437	finally
    //   167	189	437	finally
    //   189	221	437	finally
    //   226	232	437	finally
    //   235	253	437	finally
    //   261	267	437	finally
    //   270	279	437	finally
    //   279	286	437	finally
    //   286	293	437	finally
    //   297	302	437	finally
    //   306	326	437	finally
    //   329	345	437	finally
    //   352	358	437	finally
    //   358	369	437	finally
    //   376	382	437	finally
    //   382	393	437	finally
    //   400	406	437	finally
    //   406	417	437	finally
    //   424	430	437	finally
    //   430	436	437	finally
  }
  
  public final boolean Z() {
    this.o = false;
    return f0();
  }
  
  public final void b0(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Z
    //   4: istore #7
    //   6: iconst_0
    //   7: istore_3
    //   8: iload #7
    //   10: ifeq -> 207
    //   13: iload_1
    //   14: ifne -> 207
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield h : Z
    //   22: aload_0
    //   23: ldc2_w -1
    //   26: putfield i : J
    //   29: aload_0
    //   30: invokevirtual getContext : ()Landroid/content/Context;
    //   33: astore #8
    //   35: aload #8
    //   37: ifnull -> 50
    //   40: aload #8
    //   42: aload_0
    //   43: invokevirtual getView : ()Landroid/view/View;
    //   46: invokestatic c : (Landroid/content/Context;Landroid/view/View;)Ljava/lang/Object;
    //   49: pop
    //   50: aload_0
    //   51: getstatic r4/h.v6 : I
    //   54: invokevirtual O : (I)Landroid/view/View;
    //   57: checkcast androidx/appcompat/widget/AppCompatTextView
    //   60: astore #8
    //   62: aload #8
    //   64: ifnonnull -> 70
    //   67: goto -> 76
    //   70: aload #8
    //   72: iconst_0
    //   73: invokevirtual setVisibility : (I)V
    //   76: aload_0
    //   77: getstatic r4/h.C0 : I
    //   80: invokevirtual O : (I)Landroid/view/View;
    //   83: checkcast androidx/appcompat/widget/AppCompatEditText
    //   86: astore #8
    //   88: aload #8
    //   90: ifnonnull -> 96
    //   93: goto -> 102
    //   96: aload #8
    //   98: iconst_4
    //   99: invokevirtual setVisibility : (I)V
    //   102: aload_0
    //   103: getstatic r4/h.D0 : I
    //   106: invokevirtual O : (I)Landroid/view/View;
    //   109: checkcast androidx/appcompat/widget/AppCompatTextView
    //   112: astore #8
    //   114: aload #8
    //   116: ifnonnull -> 122
    //   119: goto -> 128
    //   122: aload #8
    //   124: iconst_4
    //   125: invokevirtual setVisibility : (I)V
    //   128: aload_0
    //   129: getstatic r4/h.h2 : I
    //   132: invokevirtual O : (I)Landroid/view/View;
    //   135: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   138: astore #8
    //   140: aload #8
    //   142: ifnonnull -> 148
    //   145: goto -> 154
    //   148: aload #8
    //   150: iconst_0
    //   151: invokevirtual setVisibility : (I)V
    //   154: aload_0
    //   155: getstatic r4/h.Y1 : I
    //   158: invokevirtual O : (I)Landroid/view/View;
    //   161: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   164: astore #8
    //   166: aload #8
    //   168: ifnonnull -> 174
    //   171: goto -> 181
    //   174: aload #8
    //   176: bipush #8
    //   178: invokevirtual setVisibility : (I)V
    //   181: aload_0
    //   182: getstatic r4/h.X1 : I
    //   185: invokevirtual O : (I)Landroid/view/View;
    //   188: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   191: astore #8
    //   193: aload #8
    //   195: ifnonnull -> 199
    //   198: return
    //   199: aload #8
    //   201: bipush #8
    //   203: invokevirtual setVisibility : (I)V
    //   206: return
    //   207: iload #7
    //   209: ifne -> 618
    //   212: iload_1
    //   213: ifeq -> 618
    //   216: iconst_1
    //   217: istore #4
    //   219: aload_0
    //   220: iconst_1
    //   221: putfield h : Z
    //   224: aload_0
    //   225: ldc2_w -1
    //   228: putfield i : J
    //   231: getstatic r4/h.v6 : I
    //   234: istore #6
    //   236: aload_0
    //   237: iload #6
    //   239: invokevirtual O : (I)Landroid/view/View;
    //   242: checkcast androidx/appcompat/widget/AppCompatTextView
    //   245: astore #8
    //   247: aload #8
    //   249: ifnonnull -> 255
    //   252: goto -> 261
    //   255: aload #8
    //   257: iconst_4
    //   258: invokevirtual setVisibility : (I)V
    //   261: getstatic r4/h.C0 : I
    //   264: istore #5
    //   266: aload_0
    //   267: iload #5
    //   269: invokevirtual O : (I)Landroid/view/View;
    //   272: checkcast androidx/appcompat/widget/AppCompatEditText
    //   275: astore #8
    //   277: aload #8
    //   279: ifnonnull -> 285
    //   282: goto -> 291
    //   285: aload #8
    //   287: iconst_0
    //   288: invokevirtual setVisibility : (I)V
    //   291: aload_0
    //   292: getstatic r4/h.D0 : I
    //   295: invokevirtual O : (I)Landroid/view/View;
    //   298: checkcast androidx/appcompat/widget/AppCompatTextView
    //   301: astore #8
    //   303: aload #8
    //   305: ifnonnull -> 311
    //   308: goto -> 317
    //   311: aload #8
    //   313: iconst_4
    //   314: invokevirtual setVisibility : (I)V
    //   317: aload_0
    //   318: getstatic r4/h.h2 : I
    //   321: invokevirtual O : (I)Landroid/view/View;
    //   324: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   327: astore #8
    //   329: aload #8
    //   331: ifnonnull -> 337
    //   334: goto -> 343
    //   337: aload #8
    //   339: iconst_4
    //   340: invokevirtual setVisibility : (I)V
    //   343: aload_0
    //   344: getstatic r4/h.Y1 : I
    //   347: invokevirtual O : (I)Landroid/view/View;
    //   350: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   353: astore #8
    //   355: aload #8
    //   357: ifnonnull -> 363
    //   360: goto -> 369
    //   363: aload #8
    //   365: iconst_0
    //   366: invokevirtual setVisibility : (I)V
    //   369: aload_0
    //   370: getstatic r4/h.X1 : I
    //   373: invokevirtual O : (I)Landroid/view/View;
    //   376: checkcast androidx/appcompat/widget/AppCompatImageButton
    //   379: astore #8
    //   381: aload #8
    //   383: ifnonnull -> 389
    //   386: goto -> 395
    //   389: aload #8
    //   391: iconst_0
    //   392: invokevirtual setVisibility : (I)V
    //   395: aload_0
    //   396: iload #5
    //   398: invokevirtual O : (I)Landroid/view/View;
    //   401: checkcast androidx/appcompat/widget/AppCompatEditText
    //   404: astore #8
    //   406: aload #8
    //   408: ifnull -> 462
    //   411: aload #8
    //   413: invokevirtual getText : ()Landroid/text/Editable;
    //   416: astore #8
    //   418: aload #8
    //   420: ifnull -> 462
    //   423: aload #8
    //   425: invokevirtual toString : ()Ljava/lang/String;
    //   428: astore #8
    //   430: aload #8
    //   432: ifnull -> 462
    //   435: aload #8
    //   437: invokeinterface length : ()I
    //   442: ifne -> 450
    //   445: iconst_1
    //   446: istore_2
    //   447: goto -> 452
    //   450: iconst_0
    //   451: istore_2
    //   452: iload_2
    //   453: ifne -> 462
    //   456: iload #4
    //   458: istore_2
    //   459: goto -> 464
    //   462: iconst_0
    //   463: istore_2
    //   464: iload_2
    //   465: ifne -> 582
    //   468: aload_0
    //   469: iload #5
    //   471: invokevirtual O : (I)Landroid/view/View;
    //   474: checkcast androidx/appcompat/widget/AppCompatEditText
    //   477: astore #9
    //   479: aload #9
    //   481: ifnull -> 520
    //   484: aload_0
    //   485: iload #6
    //   487: invokevirtual O : (I)Landroid/view/View;
    //   490: checkcast androidx/appcompat/widget/AppCompatTextView
    //   493: astore #8
    //   495: aload #8
    //   497: ifnull -> 510
    //   500: aload #8
    //   502: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   505: astore #8
    //   507: goto -> 513
    //   510: aconst_null
    //   511: astore #8
    //   513: aload #9
    //   515: aload #8
    //   517: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   520: aload_0
    //   521: iload #5
    //   523: invokevirtual O : (I)Landroid/view/View;
    //   526: checkcast androidx/appcompat/widget/AppCompatEditText
    //   529: astore #8
    //   531: aload #8
    //   533: ifnull -> 582
    //   536: aload_0
    //   537: iload #5
    //   539: invokevirtual O : (I)Landroid/view/View;
    //   542: checkcast androidx/appcompat/widget/AppCompatEditText
    //   545: astore #9
    //   547: iload_3
    //   548: istore_2
    //   549: aload #9
    //   551: ifnull -> 576
    //   554: aload #9
    //   556: invokevirtual getText : ()Landroid/text/Editable;
    //   559: astore #9
    //   561: iload_3
    //   562: istore_2
    //   563: aload #9
    //   565: ifnull -> 576
    //   568: aload #9
    //   570: invokeinterface length : ()I
    //   575: istore_2
    //   576: aload #8
    //   578: iload_2
    //   579: invokevirtual setSelection : (I)V
    //   582: aload_0
    //   583: iload #5
    //   585: invokevirtual O : (I)Landroid/view/View;
    //   588: checkcast androidx/appcompat/widget/AppCompatEditText
    //   591: astore #8
    //   593: aload #8
    //   595: ifnull -> 604
    //   598: aload #8
    //   600: invokevirtual requestFocus : ()Z
    //   603: pop
    //   604: sipush #300
    //   607: new b5/i$c
    //   610: dup
    //   611: aload_0
    //   612: invokespecial <init> : (Lb5/i;)V
    //   615: invokestatic l : (ILq8/a;)V
    //   618: return
  }
  
  public final Device c0() {
    return this.n;
  }
  
  public final boolean d0() {
    return this.o;
  }
  
  public final boolean f0() {
    App.g.a("DeviceFrg > onBackPressed()");
    x7.c.a.b(x7.c.a, "Me-DeviceFrg", "onBackPress()", false, 4, null);
    boolean bool = false;
    try {
      if (this.h)
        return false; 
      AppCompatEditText appCompatEditText = (AppCompatEditText)O(r4.h.C0);
      if (appCompatEditText != null)
        appCompatEditText.setText(""); 
      AppCompatTextView appCompatTextView = (AppCompatTextView)O(r4.h.g6);
      if (appCompatTextView != null)
        appCompatTextView.setAlpha(0.0F); 
      AppCompatImageView appCompatImageView = (AppCompatImageView)O(r4.h.o1);
    } finally {
      Exception exception = null;
    } 
    try {
      return bool;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public void g0(Device paramDevice) {
    x5.o o;
    Device device1 = this.n;
    Device device2 = null;
    if (device1 != null) {
      Integer integer = Integer.valueOf(device1.getBackgroundColor());
    } else {
      device1 = null;
    } 
    if (paramDevice != null) {
      o = (x5.o)Integer.valueOf(paramDevice.getBackgroundColor());
    } else {
      o = null;
    } 
    if (!r8.m.e(device1, o)) {
      device1 = this.n;
      if (device1 != null) {
        boolean bool;
        if (paramDevice != null) {
          bool = paramDevice.getBackgroundColor();
        } else {
          bool = false;
        } 
        device1.setBackgroundColor(bool);
      } 
      s0();
    } 
    if (!r8.m.e(this.n, paramDevice)) {
      b b;
      this.n = paramDevice;
      AppCompatTextView appCompatTextView = (AppCompatTextView)O(r4.h.v6);
      if (appCompatTextView != null) {
        paramDevice = this.n;
        if (paramDevice != null) {
          String str = paramDevice.getName();
        } else {
          paramDevice = null;
        } 
        appCompatTextView.setText((CharSequence)paramDevice);
      } 
      x5.o.a a1 = x5.o.i;
      o = a1.b();
      paramDevice = device2;
      if (o != null)
        b = o.K(); 
      if (b != null)
        b.c0(this.n); 
      x5.o o1 = a1.b();
      if (o1 != null) {
        b b1 = o1.K();
        if (b1 != null)
          b1.T(); 
      } 
      o1 = a1.b();
      if (o1 != null) {
        b b1 = o1.K();
        if (b1 != null)
          b.V(b1, null, null, null, false, false, false, 63, null); 
      } 
    } 
  }
  
  public final void h0(int paramInt1, int paramInt2) {
    p7.c0.l(paramInt2, new g(this, paramInt1));
  }
  
  public final void j0(r6.e parame) {
    // Byte code:
    //   0: invokestatic a : ()J
    //   3: lstore #5
    //   5: aload_0
    //   6: getfield k : J
    //   9: lstore #7
    //   11: iconst_0
    //   12: istore #9
    //   14: lload #5
    //   16: lload #7
    //   18: lsub
    //   19: ldc2_w 300
    //   22: lcmp
    //   23: ifge -> 33
    //   26: sipush #200
    //   29: istore_2
    //   30: goto -> 35
    //   33: iconst_0
    //   34: istore_2
    //   35: iload_2
    //   36: new b5/i$h
    //   39: dup
    //   40: aload_0
    //   41: aload_1
    //   42: invokespecial <init> : (Lb5/i;Lr6/e;)V
    //   45: invokestatic l : (ILq8/a;)V
    //   48: aload_1
    //   49: getstatic r6/e.UDP : Lr6/e;
    //   52: if_acmpne -> 339
    //   55: aload_0
    //   56: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   59: astore_1
    //   60: aconst_null
    //   61: astore #10
    //   63: aload_1
    //   64: ifnull -> 75
    //   67: aload_1
    //   68: invokevirtual getVersion : ()Ljava/lang/Double;
    //   71: astore_1
    //   72: goto -> 77
    //   75: aconst_null
    //   76: astore_1
    //   77: iconst_1
    //   78: istore #4
    //   80: aload_1
    //   81: ifnull -> 116
    //   84: aload_0
    //   85: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   88: astore_1
    //   89: aload_1
    //   90: ifnull -> 101
    //   93: aload_1
    //   94: invokevirtual getVersion : ()Ljava/lang/Double;
    //   97: astore_1
    //   98: goto -> 103
    //   101: aconst_null
    //   102: astore_1
    //   103: aload_1
    //   104: dconst_0
    //   105: invokestatic b : (Ljava/lang/Double;D)Z
    //   108: ifne -> 116
    //   111: iconst_1
    //   112: istore_2
    //   113: goto -> 118
    //   116: iconst_0
    //   117: istore_2
    //   118: aload_0
    //   119: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull -> 135
    //   127: aload_1
    //   128: invokevirtual getMqttUsername : ()Ljava/lang/String;
    //   131: astore_1
    //   132: goto -> 137
    //   135: aconst_null
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull -> 158
    //   141: aload_1
    //   142: invokeinterface length : ()I
    //   147: ifne -> 153
    //   150: goto -> 158
    //   153: iconst_0
    //   154: istore_3
    //   155: goto -> 160
    //   158: iconst_1
    //   159: istore_3
    //   160: aload_0
    //   161: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   164: astore #11
    //   166: aload #10
    //   168: astore_1
    //   169: aload #11
    //   171: ifnull -> 180
    //   174: aload #11
    //   176: invokevirtual getModemsId : ()[Ljava/lang/Integer;
    //   179: astore_1
    //   180: aload_1
    //   181: ifnull -> 187
    //   184: goto -> 190
    //   187: iconst_0
    //   188: istore #4
    //   190: iload_2
    //   191: ifeq -> 231
    //   194: iload_3
    //   195: iconst_1
    //   196: ixor
    //   197: ifeq -> 231
    //   200: iload #4
    //   202: ifeq -> 231
    //   205: aload_0
    //   206: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   209: astore_1
    //   210: aload_1
    //   211: ifnull -> 226
    //   214: aload_1
    //   215: invokevirtual isSimilarType : ()Ljava/lang/Boolean;
    //   218: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   221: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   224: istore #9
    //   226: iload #9
    //   228: ifeq -> 339
    //   231: aload_0
    //   232: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   235: astore_1
    //   236: aload_1
    //   237: ifnull -> 254
    //   240: aload_1
    //   241: invokevirtual getConnIp : ()Ljava/lang/String;
    //   244: astore #10
    //   246: aload #10
    //   248: astore_1
    //   249: aload #10
    //   251: ifnonnull -> 258
    //   254: ldc_w ''
    //   257: astore_1
    //   258: new p6/e
    //   261: dup
    //   262: aload_0
    //   263: invokevirtual getContext : ()Landroid/content/Context;
    //   266: invokespecial <init> : (Landroid/content/Context;)V
    //   269: astore #10
    //   271: new java/lang/StringBuilder
    //   274: dup
    //   275: invokespecial <init> : ()V
    //   278: astore #11
    //   280: aload #11
    //   282: ldc_w 'http://'
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload #11
    //   291: aload_1
    //   292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: pop
    //   296: aload #11
    //   298: ldc_w '/Networks?'
    //   301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload #10
    //   307: aload #11
    //   309: invokevirtual toString : ()Ljava/lang/String;
    //   312: invokevirtual m : (Ljava/lang/String;)Lp6/e;
    //   315: ldc_w 'CMD'
    //   318: ldc_w '1'
    //   321: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
    //   324: new b5/i$i
    //   327: dup
    //   328: aload_0
    //   329: aload_1
    //   330: invokespecial <init> : (Lb5/i;Ljava/lang/String;)V
    //   333: getstatic b5/i$j.g : Lb5/i$j;
    //   336: invokevirtual i : (Lq8/l;Lq8/l;)V
    //   339: return
  }
  
  public void onAttach(Context paramContext) {
    r8.m.j(paramContext, "context");
    super.onAttach(paramContext);
    r = this;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    r8.m.j(paramLayoutInflater, "inflater");
    App.g.a("DeviceFrg > onCreateView()");
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    x7.c.a.b(x7.c.a, "Me-DeviceFrg", "onCreateView()", false, 4, null);
    if (paramBundle != null) {
      this.n = (Device)paramBundle.getParcelable("device");
      this.o = paramBundle.getBoolean("single");
    } 
    a0(getContext());
    postponeEnterTransition();
    this.k = p7.t.a();
    return paramLayoutInflater.inflate(2131558512, paramViewGroup, false);
  }
  
  public void onDestroyView() {
    App.g.a("DeviceFrg > onDestroy()");
    super.onDestroyView();
    x7.c.a.b(x7.c.a, "Me-DeviceFrg", "onDestroy()", false, 4, null);
    ConnMngr.j.l(null);
    N();
  }
  
  public void onPause() {
    boolean bool1;
    App.g.a("DeviceFrg > onPause()");
    x4.h h1 = this.l;
    boolean bool2 = true;
    if (h1 != null && h1.isShowing() == true) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      h1 = this.l;
      if (h1 != null)
        h1.dismiss(); 
    } 
    x4.i i1 = this.m;
    if (i1 != null && i1.isShowing() == true) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      i1 = this.m;
      if (i1 != null)
        i1.dismiss(); 
    } 
    b0(false);
    super.onPause();
    x7.c.a.b(x7.c.a, "Me-DeviceFrg", "onPause()", false, 4, null);
  }
  
  public void onResume() {
    // Byte code:
    //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   3: ldc_w 'DeviceFrg > onResume()'
    //   6: invokevirtual a : (Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokespecial onResume : ()V
    //   13: getstatic x7/c.a : Lx7/c$a;
    //   16: ldc_w 'Me-DeviceFrg'
    //   19: ldc_w 'onResume()'
    //   22: iconst_0
    //   23: iconst_4
    //   24: aconst_null
    //   25: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    //   28: aload_0
    //   29: getfield g : Landroidx/lifecycle/LiveData;
    //   32: astore #4
    //   34: aload #4
    //   36: ifnull -> 45
    //   39: aload #4
    //   41: aload_0
    //   42: invokevirtual removeObserver : (Landroidx/lifecycle/Observer;)V
    //   45: aload_0
    //   46: getfield g : Landroidx/lifecycle/LiveData;
    //   49: astore #4
    //   51: aload #4
    //   53: ifnull -> 66
    //   56: aload #4
    //   58: aload_0
    //   59: invokestatic j : (Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleOwner;
    //   62: aload_0
    //   63: invokevirtual observe : (Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V
    //   66: getstatic com/smartpek/utils/connection/ConnMngr.j : Lcom/smartpek/utils/connection/ConnMngr$b;
    //   69: aload_0
    //   70: getfield n : Lcom/smartpek/data/local/db/models/Device;
    //   73: invokevirtual l : (Lcom/smartpek/data/local/db/models/Device;)V
    //   76: getstatic r4/h.s1 : I
    //   79: istore_3
    //   80: aload_0
    //   81: iload_3
    //   82: invokevirtual O : (I)Landroid/view/View;
    //   85: checkcast androidx/appcompat/widget/AppCompatImageView
    //   88: astore #4
    //   90: aload #4
    //   92: ifnull -> 123
    //   95: aload #4
    //   97: invokevirtual getVisibility : ()I
    //   100: istore_1
    //   101: iconst_1
    //   102: istore_2
    //   103: iload_1
    //   104: ifne -> 112
    //   107: iconst_1
    //   108: istore_1
    //   109: goto -> 114
    //   112: iconst_0
    //   113: istore_1
    //   114: iload_1
    //   115: ifne -> 123
    //   118: iload_2
    //   119: istore_1
    //   120: goto -> 125
    //   123: iconst_0
    //   124: istore_1
    //   125: iload_1
    //   126: ifeq -> 252
    //   129: aload_0
    //   130: iload_3
    //   131: invokevirtual O : (I)Landroid/view/View;
    //   134: checkcast androidx/appcompat/widget/AppCompatImageView
    //   137: astore #4
    //   139: aload #4
    //   141: ifnonnull -> 147
    //   144: goto -> 153
    //   147: aload #4
    //   149: fconst_0
    //   150: invokevirtual setAlpha : (F)V
    //   153: aload_0
    //   154: iload_3
    //   155: invokevirtual O : (I)Landroid/view/View;
    //   158: checkcast androidx/appcompat/widget/AppCompatImageView
    //   161: astore #4
    //   163: aload #4
    //   165: ifnonnull -> 171
    //   168: goto -> 177
    //   171: aload #4
    //   173: iconst_0
    //   174: invokevirtual setVisibility : (I)V
    //   177: aload_0
    //   178: iload_3
    //   179: invokevirtual O : (I)Landroid/view/View;
    //   182: checkcast androidx/appcompat/widget/AppCompatImageView
    //   185: astore #4
    //   187: aload #4
    //   189: ifnull -> 252
    //   192: aload #4
    //   194: invokevirtual animate : ()Landroid/view/ViewPropertyAnimator;
    //   197: astore #4
    //   199: aload #4
    //   201: ifnull -> 252
    //   204: aload #4
    //   206: fconst_1
    //   207: invokevirtual alpha : (F)Landroid/view/ViewPropertyAnimator;
    //   210: astore #4
    //   212: aload #4
    //   214: ifnull -> 252
    //   217: aload #4
    //   219: ldc2_w 250
    //   222: invokevirtual setStartDelay : (J)Landroid/view/ViewPropertyAnimator;
    //   225: astore #4
    //   227: aload #4
    //   229: ifnull -> 252
    //   232: aload #4
    //   234: ldc2_w 50
    //   237: invokevirtual setDuration : (J)Landroid/view/ViewPropertyAnimator;
    //   240: astore #4
    //   242: aload #4
    //   244: ifnull -> 252
    //   247: aload #4
    //   249: invokevirtual start : ()V
    //   252: sipush #300
    //   255: new b5/i$k
    //   258: dup
    //   259: aload_0
    //   260: invokespecial <init> : (Lb5/i;)V
    //   263: invokestatic l : (ILq8/a;)V
    //   266: return
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    r8.m.j(paramBundle, "outState");
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("device", (Parcelable)this.n);
    paramBundle.putBoolean("single", this.o);
  }
  
  public void onStart() {
    App.g.a("DeviceFrg > onStart()");
    super.onStart();
    x7.c.a.b(x7.c.a, "Me-DeviceFrg", "onStart()", false, 4, null);
    ConnMngr.j.l(this.n);
  }
  
  public void onStop() {
    App.g.a("DeviceFrg > onStop()");
    super.onStop();
    x7.c.a.b(x7.c.a, "Me-DeviceFrg", "onStop()", false, 4, null);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    r8.m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    x7.c.a a2 = x7.c.a;
    boolean bool = isHidden();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onViewCreated()  isHidden: ");
    stringBuilder.append(bool);
    x7.c.a.b(a2, "Me-DeviceFrg", stringBuilder.toString(), false, 4, null);
    App.a a1 = App.g;
    bool = this.o;
    stringBuilder = new StringBuilder();
    stringBuilder.append("DeviceFrg > onViewCreated() single: ");
    stringBuilder.append(bool);
    a1.a(stringBuilder.toString());
    e0();
    this.m = new x4.i((Context)getActivity(), new m(this), new t(this), new u(this), new v(this));
    this.l = new x4.h((Context)getActivity(), new w(this));
    AppCompatImageButton appCompatImageButton = (AppCompatImageButton)O(r4.h.h2);
    if (appCompatImageButton != null)
      e1.b((View)appCompatImageButton, new x(this)); 
    appCompatImageButton = (AppCompatImageButton)O(r4.h.Y1);
    if (appCompatImageButton != null)
      e1.b((View)appCompatImageButton, new y(this)); 
    appCompatImageButton = (AppCompatImageButton)O(r4.h.X1);
    if (appCompatImageButton != null)
      e1.b((View)appCompatImageButton, new z(this)); 
    int j = r4.h.C0;
    AppCompatEditText appCompatEditText = (AppCompatEditText)O(j);
    if (appCompatEditText != null)
      appCompatEditText.addTextChangedListener(new l(this)); 
    appCompatEditText = (AppCompatEditText)O(j);
    if (appCompatEditText != null)
      appCompatEditText.setOnEditorActionListener(new c(this)); 
    j = r4.h.a6;
    View view = O(j);
    if (view != null)
      e1.a(view, 1500, new n(this)); 
    int k = r4.h.O5;
    view = O(k);
    if (view != null)
      e1.a(view, 1500, new o(this)); 
    if (!this.o) {
      view = O(j);
      if (view != null)
        s1.a(view, new p(this)); 
      AppCompatImageView appCompatImageView = (AppCompatImageView)O(r4.h.l3);
      if (appCompatImageView != null)
        appCompatImageView.setOnClickListener(new d(this)); 
      appCompatImageView = (AppCompatImageView)O(r4.h.M4);
      if (appCompatImageView != null)
        appCompatImageView.setOnClickListener(new e(this)); 
      View view1 = O(r4.h.h7);
      if (view1 != null)
        view1.setOnClickListener(new f(this)); 
      view1 = O(r4.h.j7);
      if (view1 != null)
        view1.setOnClickListener(new g(this)); 
      view1 = O(k);
      if (view1 != null)
        s1.a(view1, new q(this)); 
    } 
    AppCompatTextView appCompatTextView = (AppCompatTextView)O(r4.h.g6);
    if (appCompatTextView != null)
      appCompatTextView.setOnLongClickListener(new h(this)); 
    androidx.fragment.app.e e = getActivity();
    if (e != null) {
      k0 k0 = k0.d.a((Activity)e).g();
      if (k0 != null)
        k0.observe(f0.j(this), new b0(new r(this))); 
    } 
    x1.e(paramView, new s(this));
  }
  
  public final void t0(Device paramDevice) {
    this.n = paramDevice;
  }
  
  public final void u0(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public static final class a {
    private a() {}
    
    public final i a(Device param1Device, boolean param1Boolean) {
      if (b() == null)
        c(new i()); 
      i i2 = b();
      r8.m.g(i2);
      i2.t0(param1Device);
      i i1 = b();
      r8.m.g(i1);
      i1.u0(param1Boolean);
      i1 = b();
      r8.m.g(i1);
      return i1;
    }
    
    public final i b() {
      return i.S();
    }
    
    public final void c(i param1i) {
      i.V(param1i);
    }
  }
  
  static final class a0 extends r8.n implements q8.a<e8.q> {
    a0(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      int j;
      View view = this.g.O(r4.h.f7);
      if (view == null)
        return; 
      Device device = this.g.c0();
      if (device != null) {
        DeviceType deviceType = device.getType();
      } else {
        device = null;
      } 
      if (device == null) {
        j = -1;
      } else {
        j = a.a[device.ordinal()];
      } 
      boolean bool2 = false;
      boolean bool1 = true;
      if (j == 1)
        bool1 = false; 
      if (bool1) {
        j = bool2;
      } else {
        j = 8;
      } 
      view.setVisibility(j);
    }
  }
  
  static final class c extends r8.n implements q8.a<e8.q> {
    c(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      Context context = this.g.getContext();
      if (context != null)
        x1.f(context); 
      i.U(this.g, p7.t.a());
    }
  }
  
  public static final class c0 implements p7.l.c {
    c0(i param1i) {}
    
    public void a(int param1Int) {
      i i1 = this.a;
      int j = r4.h.m3;
      if (i1.O(j) != null)
        e1.C0(this.a.O(j), c1.d(param1Int)); 
    }
    
    public void b() {}
  }
  
  public static final class d implements TextWatcher {
    public d(i param1i) {}
    
    public void afterTextChanged(Editable param1Editable) {
      AppCompatEditText appCompatEditText = (AppCompatEditText)this.g.O(r4.h.C0);
      if (appCompatEditText == null)
        return; 
      appCompatEditText.setError(null);
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  static final class e extends r8.n implements q8.a<e8.q> {
    e(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      FrameLayout frameLayout;
      boolean bool = this.g.d0();
      int j = -1;
      ConstraintLayout constraintLayout = null;
      DeviceType deviceType = null;
      if (bool) {
        byte b;
        constraintLayout = (ConstraintLayout)this.g.O(r4.h.a1);
        if (constraintLayout != null) {
          k = constraintLayout.getHeight();
        } else {
          k = 0;
        } 
        i i1 = this.g;
        int m = r4.h.Y0;
        frameLayout = (FrameLayout)i1.O(m);
        if (frameLayout != null) {
          b = frameLayout.getHeight();
        } else {
          b = 0;
        } 
        int k = (k - b) / 2 / 2 / 2;
        i i2 = this.g;
        frameLayout = (FrameLayout)i2.O(m);
        if (frameLayout != null) {
          r8.m.i(frameLayout, "frameContent");
          ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
          if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams)layoutParams;
            Device device = i2.c0();
            if (device != null)
              deviceType = device.getType(); 
            if (deviceType != null)
              j = a.a[deviceType.ordinal()]; 
            if (j == 1) {
              layoutParams1.topMargin = p7.v.e(0);
              layoutParams1.bottomMargin = p7.v.e(8);
            } else {
              layoutParams1.topMargin = k;
              layoutParams1.bottomMargin = k;
            } 
            frameLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams1);
            return;
          } 
          throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        } 
      } else {
        FrameLayout frameLayout1 = (FrameLayout)this.g.O(r4.h.Y0);
        if (frameLayout1 != null) {
          i i1 = this.g;
          ViewGroup.LayoutParams layoutParams = frameLayout1.getLayoutParams();
          if (layoutParams != null) {
            DeviceType deviceType1;
            RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams)layoutParams;
            Device device = i1.c0();
            FrameLayout frameLayout2 = frameLayout;
            if (device != null)
              deviceType1 = device.getType(); 
            if (deviceType1 != null)
              j = a.a[deviceType1.ordinal()]; 
            if (j == 1) {
              layoutParams1.topMargin = p7.v.e(4);
              layoutParams1.bottomMargin = p7.v.e(4);
            } else {
              layoutParams1.topMargin = p7.v.e(16);
              layoutParams1.bottomMargin = p7.v.e(8);
            } 
            frameLayout1.setLayoutParams((ViewGroup.LayoutParams)layoutParams1);
            return;
          } 
          throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        } 
      } 
    }
  }
  
  static final class f extends r8.n implements q8.a<e8.q> {
    f(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      // Byte code:
      //   0: aload_0
      //   1: getfield g : Lb5/i;
      //   4: astore #4
      //   6: getstatic r4/h.l3 : I
      //   9: istore_3
      //   10: aload #4
      //   12: iload_3
      //   13: invokevirtual O : (I)Landroid/view/View;
      //   16: checkcast androidx/appcompat/widget/AppCompatImageView
      //   19: astore #4
      //   21: iconst_1
      //   22: istore_2
      //   23: aload #4
      //   25: ifnull -> 52
      //   28: aload #4
      //   30: invokevirtual getVisibility : ()I
      //   33: ifne -> 41
      //   36: iconst_1
      //   37: istore_1
      //   38: goto -> 43
      //   41: iconst_0
      //   42: istore_1
      //   43: iload_1
      //   44: ifne -> 52
      //   47: iconst_1
      //   48: istore_1
      //   49: goto -> 54
      //   52: iconst_0
      //   53: istore_1
      //   54: iload_1
      //   55: ifeq -> 85
      //   58: aload_0
      //   59: getfield g : Lb5/i;
      //   62: iload_3
      //   63: invokevirtual O : (I)Landroid/view/View;
      //   66: checkcast androidx/appcompat/widget/AppCompatImageView
      //   69: astore #4
      //   71: aload #4
      //   73: ifnonnull -> 79
      //   76: goto -> 85
      //   79: aload #4
      //   81: iconst_0
      //   82: invokevirtual setVisibility : (I)V
      //   85: aload_0
      //   86: getfield g : Lb5/i;
      //   89: astore #4
      //   91: getstatic r4/h.M4 : I
      //   94: istore_3
      //   95: aload #4
      //   97: iload_3
      //   98: invokevirtual O : (I)Landroid/view/View;
      //   101: checkcast androidx/appcompat/widget/AppCompatImageView
      //   104: astore #4
      //   106: aload #4
      //   108: ifnull -> 135
      //   111: aload #4
      //   113: invokevirtual getVisibility : ()I
      //   116: ifne -> 124
      //   119: iconst_1
      //   120: istore_1
      //   121: goto -> 126
      //   124: iconst_0
      //   125: istore_1
      //   126: iload_1
      //   127: ifne -> 135
      //   130: iload_2
      //   131: istore_1
      //   132: goto -> 137
      //   135: iconst_0
      //   136: istore_1
      //   137: iload_1
      //   138: ifeq -> 166
      //   141: aload_0
      //   142: getfield g : Lb5/i;
      //   145: iload_3
      //   146: invokevirtual O : (I)Landroid/view/View;
      //   149: checkcast androidx/appcompat/widget/AppCompatImageView
      //   152: astore #4
      //   154: aload #4
      //   156: ifnonnull -> 160
      //   159: return
      //   160: aload #4
      //   162: iconst_0
      //   163: invokevirtual setVisibility : (I)V
      //   166: return
    }
  }
  
  static final class g extends r8.n implements q8.a<e8.q> {
    g(i param1i, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      try {
        i i1 = this.g;
        int j = r4.h.o1;
        AppCompatImageView appCompatImageView = (AppCompatImageView)i1.O(j);
        if (appCompatImageView != null)
          appCompatImageView.setAlpha(1.0F); 
        appCompatImageView = (AppCompatImageView)this.g.O(j);
        if (appCompatImageView != null) {
          float f;
          byte b1;
          AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.O(r4.h.g6);
          if (appCompatTextView != null) {
            f = appCompatTextView.getAlpha();
          } else {
            f = 0.0F;
          } 
          byte b2 = 0;
          if (f == 0.0F) {
            b1 = 1;
          } else {
            b1 = 0;
          } 
          if (!b1) {
            b1 = b2;
          } else {
            b1 = 4;
          } 
          appCompatImageView.setVisibility(b1);
        } 
        appCompatImageView = (AppCompatImageView)this.g.O(j);
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  static final class h extends r8.n implements q8.a<e8.q> {
    h(i param1i, r6.e param1e) {
      super(0);
    }
    
    public final void invoke() {
      i i2 = this.g;
      int j = r4.h.g6;
      AppCompatTextView appCompatTextView1 = (AppCompatTextView)i2.O(j);
      if (appCompatTextView1 != null) {
        ViewPropertyAnimator viewPropertyAnimator = appCompatTextView1.animate();
        if (viewPropertyAnimator != null) {
          float f;
          r6.e e1 = this.h;
          if (e1 == r6.e.UDP || e1 == r6.e.MQTT) {
            f = 1.0F;
          } else {
            f = 0.0F;
          } 
          viewPropertyAnimator = viewPropertyAnimator.alpha(f);
          if (viewPropertyAnimator != null) {
            viewPropertyAnimator = viewPropertyAnimator.setDuration(50L);
            if (viewPropertyAnimator != null)
              viewPropertyAnimator.start(); 
          } 
        } 
      } 
      AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.g.O(j);
      if (appCompatTextView2 != null) {
        r6.e e1 = this.h;
        if (e1 != null) {
          String str = e1.getWellKnownName();
        } else {
          e1 = null;
        } 
        appCompatTextView2.setText((CharSequence)e1);
      } 
      i i1 = this.g;
      j = r4.h.o1;
      AppCompatImageView appCompatImageView = (AppCompatImageView)i1.O(j);
      if (appCompatImageView != null)
        appCompatImageView.setAlpha(1.0F); 
      if (this.h == r6.e.UNKNOWN) {
        appCompatImageView = (AppCompatImageView)this.g.O(j);
        if (appCompatImageView != null)
          appCompatImageView.setImageResource(2131231242); 
      } 
    }
  }
  
  static final class i extends r8.n implements q8.l<String, e8.q> {
    i(i param1i, String param1String) {
      super(1);
    }
    
    public final void a(String param1String) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'networkResponse'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: new org/json/JSONObject
      //   9: dup
      //   10: aload_1
      //   11: invokespecial <init> : (Ljava/lang/String;)V
      //   14: astore_1
      //   15: aload_1
      //   16: ldc 'APSSID'
      //   18: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   21: astore_2
      //   22: aload_2
      //   23: ldc 'networkJson.getString("APSSID")'
      //   25: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   28: aload_2
      //   29: invokestatic H : (Ljava/lang/String;)Ljava/lang/String;
      //   32: astore_2
      //   33: new r8/a0
      //   36: dup
      //   37: invokespecial <init> : ()V
      //   40: astore_3
      //   41: aload_1
      //   42: ldc 'yourIP'
      //   44: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   47: astore #4
      //   49: aload_3
      //   50: aload #4
      //   52: putfield g : Ljava/lang/Object;
      //   55: aload #4
      //   57: ldc 'connIp'
      //   59: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   62: aload #4
      //   64: checkcast java/lang/CharSequence
      //   67: ldc 'IP unset'
      //   69: iconst_0
      //   70: iconst_2
      //   71: aconst_null
      //   72: invokestatic N : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      //   75: ifeq -> 84
      //   78: aload_3
      //   79: ldc '192.168.2.1'
      //   81: putfield g : Ljava/lang/Object;
      //   84: new z8/j
      //   87: dup
      //   88: ldc '\d*\.?\d*$'
      //   90: invokespecial <init> : (Ljava/lang/String;)V
      //   93: astore #4
      //   95: aload_1
      //   96: ldc 'device_ver'
      //   98: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   101: astore_1
      //   102: aload_1
      //   103: ldc 'networkJson.getString("device_ver")'
      //   105: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   108: aload #4
      //   110: aload_1
      //   111: iconst_0
      //   112: iconst_2
      //   113: aconst_null
      //   114: invokestatic d : (Lz8/j;Ljava/lang/CharSequence;IILjava/lang/Object;)Lz8/h;
      //   117: astore_1
      //   118: aload_1
      //   119: ifnull -> 244
      //   122: aload_1
      //   123: invokeinterface getValue : ()Ljava/lang/String;
      //   128: astore_1
      //   129: aload_1
      //   130: ifnull -> 244
      //   133: aload_1
      //   134: invokestatic i : (Ljava/lang/String;)Ljava/lang/Double;
      //   137: astore_1
      //   138: goto -> 141
      //   141: new p6/e
      //   144: dup
      //   145: aload_0
      //   146: getfield g : Lb5/i;
      //   149: invokevirtual getContext : ()Landroid/content/Context;
      //   152: invokespecial <init> : (Landroid/content/Context;)V
      //   155: astore #4
      //   157: aload_0
      //   158: getfield h : Ljava/lang/String;
      //   161: astore #5
      //   163: new java/lang/StringBuilder
      //   166: dup
      //   167: invokespecial <init> : ()V
      //   170: astore #6
      //   172: aload #6
      //   174: ldc 'http://'
      //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   179: pop
      //   180: aload #6
      //   182: aload #5
      //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   187: pop
      //   188: aload #6
      //   190: ldc '/Networks?'
      //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   195: pop
      //   196: aload #4
      //   198: aload #6
      //   200: invokevirtual toString : ()Ljava/lang/String;
      //   203: invokevirtual m : (Ljava/lang/String;)Lp6/e;
      //   206: ldc 'CMD'
      //   208: ldc '13'
      //   210: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   213: new b5/i$i$a
      //   216: dup
      //   217: aload_0
      //   218: getfield g : Lb5/i;
      //   221: aload_0
      //   222: getfield h : Ljava/lang/String;
      //   225: aload_2
      //   226: aload_1
      //   227: aload_3
      //   228: invokespecial <init> : (Lb5/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lr8/a0;)V
      //   231: getstatic b5/i$i$b.g : Lb5/i$i$b;
      //   234: invokevirtual i : (Lq8/l;Lq8/l;)V
      //   237: return
      //   238: astore_1
      //   239: aload_1
      //   240: invokevirtual printStackTrace : ()V
      //   243: return
      //   244: aconst_null
      //   245: astore_1
      //   246: goto -> 141
      // Exception table:
      //   from	to	target	type
      //   6	84	238	finally
      //   84	118	238	finally
      //   122	129	238	finally
      //   133	138	238	finally
      //   141	237	238	finally
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(i param2i, String param2String1, String param2String2, Double param2Double, r8.a0<String> param2a0) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          JSONObject jSONObject = new JSONObject(param2String);
          param2String = jSONObject.getString("ID");
          String str1 = jSONObject.getString("pass");
          p6.e e = new p6.e(this.g.getContext());
          String str2 = this.h;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("http://");
          stringBuilder.append(str2);
          return;
        } finally {
          param2String = null;
          param2String.printStackTrace();
        } 
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(i param3i, String param3String1, Double param3Double, r8.a0<String> param3a0, String param3String2, String param3String3) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "deviceResponse");
          try {
            JSONObject jSONObject = new JSONObject(param3String);
            int j = q1.c(jSONObject.optString("lamp_type"));
            JSONArray jSONArray = jSONObject.getJSONArray("modem");
            String str1 = jSONObject.optString("known_name");
            r8.m.i(str1, "deviceJson.optString(\"known_name\")");
            byte[] arrayOfByte = str1.getBytes(z8.d.g);
            r8.m.i(arrayOfByte, "this as java.lang.String).getBytes(charset)");
            String str2 = new String(arrayOfByte, z8.d.b);
            Device device = this.g.c0();
            if (device != null) {
              String str = device.getSsid();
            } else {
              device = null;
            } 
          } finally {
            param3String = null;
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        public static final b g = new b();
        
        b() {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "it");
          param3VolleyError.printStackTrace();
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(i param2i, String param2String1, Double param2Double, r8.a0<String> param2a0, String param2String2, String param2String3) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "deviceResponse");
        try {
          JSONObject jSONObject = new JSONObject(param2String);
          int j = q1.c(jSONObject.optString("lamp_type"));
          JSONArray jSONArray = jSONObject.getJSONArray("modem");
          String str1 = jSONObject.optString("known_name");
          r8.m.i(str1, "deviceJson.optString(\"known_name\")");
          byte[] arrayOfByte = str1.getBytes(z8.d.g);
          r8.m.i(arrayOfByte, "this as java.lang.String).getBytes(charset)");
          String str2 = new String(arrayOfByte, z8.d.b);
          Device device = this.g.c0();
          if (device != null) {
            String str = device.getSsid();
          } else {
            device = null;
          } 
        } finally {
          param2String = null;
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      public static final b g = new b();
      
      b() {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        param2VolleyError.printStackTrace();
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      public static final b g = new b();
      
      b() {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        param2VolleyError.printStackTrace();
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(i param1i, String param1String1, String param1String2, Double param1Double, r8.a0<String> param1a0) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        JSONObject jSONObject = new JSONObject(param1String);
        param1String = jSONObject.getString("ID");
        String str1 = jSONObject.getString("pass");
        p6.e e = new p6.e(this.g.getContext());
        String str2 = this.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://");
        stringBuilder.append(str2);
        return;
      } finally {
        param1String = null;
        param1String.printStackTrace();
      } 
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(i param3i, String param3String1, Double param3Double, r8.a0<String> param3a0, String param3String2, String param3String3) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "deviceResponse");
        try {
          JSONObject jSONObject = new JSONObject(param3String);
          int j = q1.c(jSONObject.optString("lamp_type"));
          JSONArray jSONArray = jSONObject.getJSONArray("modem");
          String str1 = jSONObject.optString("known_name");
          r8.m.i(str1, "deviceJson.optString(\"known_name\")");
          byte[] arrayOfByte = str1.getBytes(z8.d.g);
          r8.m.i(arrayOfByte, "this as java.lang.String).getBytes(charset)");
          String str2 = new String(arrayOfByte, z8.d.b);
          Device device = this.g.c0();
          if (device != null) {
            String str = device.getSsid();
          } else {
            device = null;
          } 
        } finally {
          param3String = null;
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      public static final b g = new b();
      
      b() {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "it");
        param3VolleyError.printStackTrace();
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(i param1i, String param1String1, Double param1Double, r8.a0<String> param1a0, String param1String2, String param1String3) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "deviceResponse");
      try {
        JSONObject jSONObject = new JSONObject(param1String);
        int j = q1.c(jSONObject.optString("lamp_type"));
        JSONArray jSONArray = jSONObject.getJSONArray("modem");
        String str1 = jSONObject.optString("known_name");
        r8.m.i(str1, "deviceJson.optString(\"known_name\")");
        byte[] arrayOfByte = str1.getBytes(z8.d.g);
        r8.m.i(arrayOfByte, "this as java.lang.String).getBytes(charset)");
        String str2 = new String(arrayOfByte, z8.d.b);
        Device device = this.g.c0();
        if (device != null) {
          String str = device.getSsid();
        } else {
          device = null;
        } 
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    public static final b g = new b();
    
    b() {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      param1VolleyError.printStackTrace();
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    public static final b g = new b();
    
    b() {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      param1VolleyError.printStackTrace();
    }
  }
  
  static final class j extends r8.n implements q8.l<VolleyError, e8.q> {
    public static final j g = new j();
    
    j() {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      param1VolleyError.printStackTrace();
    }
  }
  
  static final class k extends r8.n implements q8.a<e8.q> {
    k(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      // Byte code:
      //   0: aload_0
      //   1: getfield g : Lb5/i;
      //   4: astore #4
      //   6: getstatic r4/h.l3 : I
      //   9: istore_3
      //   10: aload #4
      //   12: iload_3
      //   13: invokevirtual O : (I)Landroid/view/View;
      //   16: checkcast androidx/appcompat/widget/AppCompatImageView
      //   19: astore #4
      //   21: iconst_1
      //   22: istore_2
      //   23: aload #4
      //   25: ifnull -> 52
      //   28: aload #4
      //   30: invokevirtual getVisibility : ()I
      //   33: ifne -> 41
      //   36: iconst_1
      //   37: istore_1
      //   38: goto -> 43
      //   41: iconst_0
      //   42: istore_1
      //   43: iload_1
      //   44: ifne -> 52
      //   47: iconst_1
      //   48: istore_1
      //   49: goto -> 54
      //   52: iconst_0
      //   53: istore_1
      //   54: iload_1
      //   55: ifeq -> 85
      //   58: aload_0
      //   59: getfield g : Lb5/i;
      //   62: iload_3
      //   63: invokevirtual O : (I)Landroid/view/View;
      //   66: checkcast androidx/appcompat/widget/AppCompatImageView
      //   69: astore #4
      //   71: aload #4
      //   73: ifnonnull -> 79
      //   76: goto -> 85
      //   79: aload #4
      //   81: iconst_0
      //   82: invokevirtual setVisibility : (I)V
      //   85: aload_0
      //   86: getfield g : Lb5/i;
      //   89: astore #4
      //   91: getstatic r4/h.M4 : I
      //   94: istore_3
      //   95: aload #4
      //   97: iload_3
      //   98: invokevirtual O : (I)Landroid/view/View;
      //   101: checkcast androidx/appcompat/widget/AppCompatImageView
      //   104: astore #4
      //   106: aload #4
      //   108: ifnull -> 135
      //   111: aload #4
      //   113: invokevirtual getVisibility : ()I
      //   116: ifne -> 124
      //   119: iconst_1
      //   120: istore_1
      //   121: goto -> 126
      //   124: iconst_0
      //   125: istore_1
      //   126: iload_1
      //   127: ifne -> 135
      //   130: iload_2
      //   131: istore_1
      //   132: goto -> 137
      //   135: iconst_0
      //   136: istore_1
      //   137: iload_1
      //   138: ifeq -> 166
      //   141: aload_0
      //   142: getfield g : Lb5/i;
      //   145: iload_3
      //   146: invokevirtual O : (I)Landroid/view/View;
      //   149: checkcast androidx/appcompat/widget/AppCompatImageView
      //   152: astore #4
      //   154: aload #4
      //   156: ifnonnull -> 160
      //   159: return
      //   160: aload #4
      //   162: iconst_0
      //   163: invokevirtual setVisibility : (I)V
      //   166: return
    }
  }
  
  public static final class l implements TextWatcher {
    public l(i param1i) {}
    
    public void afterTextChanged(Editable param1Editable) {
      i i1 = this.g;
      int j = r4.h.D0;
      AppCompatTextView appCompatTextView = (AppCompatTextView)i1.O(j);
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (appCompatTextView != null) {
        bool1 = bool2;
        if (appCompatTextView.getVisibility() == 0)
          bool1 = true; 
      } 
      if (bool1) {
        appCompatTextView = (AppCompatTextView)this.g.O(j);
        if (appCompatTextView == null)
          return; 
        appCompatTextView.setVisibility(4);
      } 
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  static final class m extends r8.n implements q8.a<e8.q> {
    m(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      b9.f.d((e0)LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this.g), null, null, new a(this.g, null), 3, null);
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.device.DeviceFrg$onViewCreated$1$1", f = "DeviceFrg.kt", l = {128}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements q8.p<e0, j8.d<? super e8.q>, Object> {
      int g;
      
      a(i param2i, j8.d<? super a> param2d) {
        super(2, param2d);
      }
      
      public final j8.d<e8.q> create(Object param2Object, j8.d<?> param2d) {
        return (j8.d<e8.q>)new a(this.h, (j8.d)param2d);
      }
      
      public final Object invoke(e0 param2e0, j8.d<? super e8.q> param2d) {
        return ((a)create(param2e0, param2d)).invokeSuspend(e8.q.a);
      }
      
      public final Object invokeSuspend(Object param2Object) {
        Object object = k8.b.d();
        int j = this.g;
        if (j != 0) {
          if (j == 1) {
            e8.l.b(param2Object);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
        } else {
          e8.l.b(param2Object);
          param2Object = t0.b();
          a a1 = new a(this.h, null);
          this.g = 1;
          Object object1 = b9.f.e((j8.g)param2Object, a1, (j8.d)this);
          param2Object = object1;
          if (object1 == object)
            return object; 
        } 
        param2Object = param2Object;
        String str = c1.h(this.h, 2131952232);
        object = this.h.c0();
        r8.m.g(object);
        object = object.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        stringBuilder.append("\n\n");
        stringBuilder.append((String)param2Object);
        object = stringBuilder.toString();
        Context context = this.h.getContext();
        if (context != null) {
          param2Object = this.h.c0();
          r8.m.g(param2Object);
          str = param2Object.getName();
          param2Object = str;
          if (str == null)
            param2Object = c1.h(this.h, 2131951830); 
          p7.r.b(context, (String)object, (String)param2Object, false);
        } 
        v1.m(this.h, 2131951808, 0, null, 6, null);
        param2Object = this.h;
        p6.m.c0((Fragment)param2Object, (String)object, "", c1.h((Fragment)param2Object, 2131952212));
        return e8.q.a;
      }
      
      @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.device.DeviceFrg$onViewCreated$1$1$link$1", f = "DeviceFrg.kt", l = {128}, m = "invokeSuspend")
      static final class a extends kotlin.coroutines.jvm.internal.l implements q8.p<e0, j8.d<? super String>, Object> {
        int g;
        
        a(i param3i, j8.d<? super a> param3d) {
          super(2, param3d);
        }
        
        public final j8.d<e8.q> create(Object param3Object, j8.d<?> param3d) {
          return (j8.d<e8.q>)new a(this.h, (j8.d)param3d);
        }
        
        public final Object invoke(e0 param3e0, j8.d<? super String> param3d) {
          return ((a)create(param3e0, param3d)).invokeSuspend(e8.q.a);
        }
        
        public final Object invokeSuspend(Object param3Object) {
          Object object = k8.b.d();
          int j = this.g;
          if (j != 0) {
            if (j == 1) {
              e8.l.b(param3Object);
              return param3Object;
            } 
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
          e8.l.b(param3Object);
          param3Object = p6.b.a;
          Device device = this.h.c0();
          r8.m.g(device);
          this.g = 1;
          param3Object = param3Object.b(device, true, (j8.d)this);
          return (param3Object == object) ? object : param3Object;
        }
      }
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.device.DeviceFrg$onViewCreated$1$1$link$1", f = "DeviceFrg.kt", l = {128}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements q8.p<e0, j8.d<? super String>, Object> {
      int g;
      
      a(i param2i, j8.d<? super a> param2d) {
        super(2, param2d);
      }
      
      public final j8.d<e8.q> create(Object param2Object, j8.d<?> param2d) {
        return (j8.d<e8.q>)new a(this.h, (j8.d)param2d);
      }
      
      public final Object invoke(e0 param2e0, j8.d<? super String> param2d) {
        return ((a)create(param2e0, param2d)).invokeSuspend(e8.q.a);
      }
      
      public final Object invokeSuspend(Object param2Object) {
        Object object = k8.b.d();
        int j = this.g;
        if (j != 0) {
          if (j == 1) {
            e8.l.b(param2Object);
            return param2Object;
          } 
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
        e8.l.b(param2Object);
        param2Object = p6.b.a;
        Device device = this.h.c0();
        r8.m.g(device);
        this.g = 1;
        param2Object = param2Object.b(device, true, (j8.d)this);
        return (param2Object == object) ? object : param2Object;
      }
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.device.DeviceFrg$onViewCreated$1$1", f = "DeviceFrg.kt", l = {128}, m = "invokeSuspend")
  static final class a extends kotlin.coroutines.jvm.internal.l implements q8.p<e0, j8.d<? super e8.q>, Object> {
    int g;
    
    a(i param1i, j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<e8.q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<e8.q>)new a(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super e8.q> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(e8.q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int j = this.g;
      if (j != 0) {
        if (j == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        param1Object = t0.b();
        a a1 = new a(this.h, null);
        this.g = 1;
        Object object1 = b9.f.e((j8.g)param1Object, a1, (j8.d)this);
        param1Object = object1;
        if (object1 == object)
          return object; 
      } 
      param1Object = param1Object;
      String str = c1.h(this.h, 2131952232);
      object = this.h.c0();
      r8.m.g(object);
      object = object.getName();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(": ");
      stringBuilder.append((String)object);
      stringBuilder.append("\n\n");
      stringBuilder.append((String)param1Object);
      object = stringBuilder.toString();
      Context context = this.h.getContext();
      if (context != null) {
        param1Object = this.h.c0();
        r8.m.g(param1Object);
        str = param1Object.getName();
        param1Object = str;
        if (str == null)
          param1Object = c1.h(this.h, 2131951830); 
        p7.r.b(context, (String)object, (String)param1Object, false);
      } 
      v1.m(this.h, 2131951808, 0, null, 6, null);
      param1Object = this.h;
      p6.m.c0((Fragment)param1Object, (String)object, "", c1.h((Fragment)param1Object, 2131952212));
      return e8.q.a;
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.device.DeviceFrg$onViewCreated$1$1$link$1", f = "DeviceFrg.kt", l = {128}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements q8.p<e0, j8.d<? super String>, Object> {
      int g;
      
      a(i param3i, j8.d<? super a> param3d) {
        super(2, param3d);
      }
      
      public final j8.d<e8.q> create(Object param3Object, j8.d<?> param3d) {
        return (j8.d<e8.q>)new a(this.h, (j8.d)param3d);
      }
      
      public final Object invoke(e0 param3e0, j8.d<? super String> param3d) {
        return ((a)create(param3e0, param3d)).invokeSuspend(e8.q.a);
      }
      
      public final Object invokeSuspend(Object param3Object) {
        Object object = k8.b.d();
        int j = this.g;
        if (j != 0) {
          if (j == 1) {
            e8.l.b(param3Object);
            return param3Object;
          } 
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
        e8.l.b(param3Object);
        param3Object = p6.b.a;
        Device device = this.h.c0();
        r8.m.g(device);
        this.g = 1;
        param3Object = param3Object.b(device, true, (j8.d)this);
        return (param3Object == object) ? object : param3Object;
      }
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.device.DeviceFrg$onViewCreated$1$1$link$1", f = "DeviceFrg.kt", l = {128}, m = "invokeSuspend")
  static final class a extends kotlin.coroutines.jvm.internal.l implements q8.p<e0, j8.d<? super String>, Object> {
    int g;
    
    a(i param1i, j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<e8.q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<e8.q>)new a(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super String> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(e8.q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int j = this.g;
      if (j != 0) {
        if (j == 1) {
          e8.l.b(param1Object);
          return param1Object;
        } 
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      } 
      e8.l.b(param1Object);
      param1Object = p6.b.a;
      Device device = this.h.c0();
      r8.m.g(device);
      this.g = 1;
      param1Object = param1Object.b(device, true, (j8.d)this);
      return (param1Object == object) ? object : param1Object;
    }
  }
  
  static final class n extends r8.n implements q8.l<View, e8.q> {
    n(i param1i) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.f0();
    }
  }
  
  static final class o extends r8.n implements q8.l<View, e8.q> {
    o(i param1i) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.f0();
    }
  }
  
  static final class p extends r8.n implements q8.l<r1.b, e8.q> {
    p(i param1i) {
      super(1);
    }
    
    public final void a(r1.b param1b) {
      r8.m.j(param1b, "direction");
      int j = a.a[param1b.ordinal()];
      if (j != 1) {
        if (j != 2) {
          if (j != 3)
            return; 
          this.g.f0();
          return;
        } 
        i.Y(this.g, r1.b.LEFT, null, 2, null);
        return;
      } 
      i.Y(this.g, r1.b.RIGHT, null, 2, null);
    }
  }
  
  static final class q extends r8.n implements q8.l<r1.b, e8.q> {
    q(i param1i) {
      super(1);
    }
    
    public final void a(r1.b param1b) {
      r8.m.j(param1b, "direction");
      int j = a.a[param1b.ordinal()];
      if (j != 1) {
        if (j != 2) {
          if (j != 3)
            return; 
          this.g.f0();
          return;
        } 
        i.Y(this.g, r1.b.LEFT, null, 2, null);
        return;
      } 
      i.Y(this.g, r1.b.RIGHT, null, 2, null);
    }
  }
  
  static final class r extends r8.n implements q8.l<k0.b, e8.q> {
    r(i param1i) {
      super(1);
    }
    
    public final void a(k0.b param1b) {
      if (param1b == k0.b.CLOSED && i.R(this.g) > 0L && p7.t.a() - i.R(this.g) > 800L && i.Q(this.g)) {
        i.U(this.g, -1L);
        this.g.b0(true);
      } 
    }
  }
  
  static final class s extends r8.n implements q8.a<e8.q> {
    s(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      this.g.startPostponedEnterTransition();
      i.W(this.g, p7.t.a());
    }
  }
  
  static final class t extends r8.n implements q8.a<e8.q> {
    t(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      this.g.b0(true);
    }
  }
  
  static final class u extends r8.n implements q8.a<e8.q> {
    u(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      x4.h h = i.P(this.g);
      if (h != null) {
        byte b;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton)this.g.O(r4.h.h2);
        r8.m.i(appCompatImageButton, "imgbOptions");
        Resources resources = this.g.getResources();
        r8.m.i(resources, "resources");
        if (c1.f(resources)) {
          b = 3;
        } else {
          b = 4;
        } 
        r7.a.k((r7.a)h, (View)appCompatImageButton, 3, b, 0, 0, false, 56, null);
      } 
    }
  }
  
  static final class v extends r8.n implements q8.a<e8.q> {
    v(i param1i) {
      super(0);
    }
    
    private static final void d(com.smartpek.utils.sweetalert.i param1i1, com.smartpek.utils.sweetalert.i param1i2) {
      r8.m.j(param1i1, "$dialog");
      param1i1.j();
    }
    
    private static final void e(i param1i, com.smartpek.utils.sweetalert.i param1i1) {
      r8.m.j(param1i, "this$0");
      param1i1.j();
      if (!param1i.d0()) {
        x5.l l1 = x5.l.l.c();
        if (l1 != null)
          x5.l.Z(l1, param1i.c0(), 0, 2, null); 
        param1i.f0();
        return;
      } 
      x5.l l = x5.l.l.c();
      if (l != null)
        l.Y(param1i.c0(), 0); 
      p7.c0.l(100, new a(param1i));
    }
    
    public final void invoke() {
      String str;
      com.smartpek.utils.sweetalert.i i1 = new com.smartpek.utils.sweetalert.i(this.g.getContext(), true, 3);
      Context context1 = this.g.getContext();
      Context context2 = null;
      if (context1 != null) {
        str = c1.g(context1, 2131951822);
      } else {
        context1 = null;
      } 
      i1.G((String)context1);
      Context context3 = this.g.getContext();
      if (context3 != null) {
        Device device = this.g.c0();
        if (device != null) {
          String str1 = device.getName();
        } else {
          device = null;
        } 
        str = context3.getString(2131952323, new Object[] { device });
      } else {
        context1 = null;
      } 
      i1.y((String)context1);
      context1 = this.g.getContext();
      if (context1 != null) {
        str = c1.g(context1, 2131952105);
      } else {
        context1 = null;
      } 
      i1.C((String)context1, new j(i1));
      context3 = this.g.getContext();
      context1 = context2;
      if (context3 != null)
        str = c1.g(context3, 2131952340); 
      i1.u(str, new k(this.g));
      i1.show();
      i1.l(-2).setVisibility(8);
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(i param2i) {
        super(0);
      }
      
      public final void invoke() {
        this.g.Z();
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(i param1i) {
      super(0);
    }
    
    public final void invoke() {
      this.g.Z();
    }
  }
  
  static final class w extends r8.n implements q8.l<Integer, e8.q> {
    w(i param1i) {
      super(1);
    }
    
    public final void a(int param1Int) {
      App.a a = App.g;
      DB dB = a.e();
      r8.m.g(dB);
      u4.a a1 = dB.H();
      Device device2 = this.g.c0();
      r8.m.g(device2);
      Device device1 = (Device)a1.z(device2.getId());
      if (device1 != null) {
        device1.setBackgroundColor(param1Int);
        DB dB1 = a.e();
        if (dB1 != null) {
          u4.a a2 = dB1.H();
          if (a2 != null)
            a2.O(device1); 
        } 
      } 
    }
  }
  
  static final class x extends r8.n implements q8.l<View, e8.q> {
    x(i param1i) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      x4.i i1 = i.T(this.g);
      if (i1 != null)
        i1.l(this.g.c0()); 
      i1 = i.T(this.g);
      if (i1 != null) {
        byte b;
        Resources resources = this.g.getResources();
        r8.m.i(resources, "resources");
        if (c1.f(resources)) {
          b = 3;
        } else {
          b = 4;
        } 
        r7.a.k((r7.a)i1, param1View, 3, b, 0, 0, false, 56, null);
      } 
    }
  }
  
  static final class y extends r8.n implements q8.l<View, e8.q> {
    y(i param1i) {
      super(1);
    }
    
    public final void a(View param1View) {
      // Byte code:
      //   0: ldc ''
      //   2: astore #6
      //   4: aload_1
      //   5: ldc 'it'
      //   7: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   10: aload_0
      //   11: getfield g : Lb5/i;
      //   14: invokestatic Q : (Lb5/i;)Z
      //   17: ifeq -> 720
      //   20: iconst_1
      //   21: istore_3
      //   22: aconst_null
      //   23: astore #5
      //   25: aload_0
      //   26: getfield g : Lb5/i;
      //   29: getstatic r4/h.C0 : I
      //   32: invokevirtual O : (I)Landroid/view/View;
      //   35: checkcast androidx/appcompat/widget/AppCompatEditText
      //   38: astore_1
      //   39: aload_1
      //   40: ifnull -> 721
      //   43: aload_1
      //   44: invokevirtual getText : ()Landroid/text/Editable;
      //   47: astore_1
      //   48: aload_1
      //   49: ifnull -> 721
      //   52: aload_1
      //   53: invokevirtual toString : ()Ljava/lang/String;
      //   56: astore_1
      //   57: aload_1
      //   58: ifnull -> 721
      //   61: aload_1
      //   62: invokestatic S0 : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      //   65: invokevirtual toString : ()Ljava/lang/String;
      //   68: astore #4
      //   70: aload #4
      //   72: astore_1
      //   73: aload #4
      //   75: ifnonnull -> 81
      //   78: goto -> 721
      //   81: aload_1
      //   82: invokeinterface length : ()I
      //   87: ifne -> 727
      //   90: iconst_1
      //   91: istore_2
      //   92: goto -> 729
      //   95: aload_1
      //   96: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   99: astore #7
      //   101: aload_0
      //   102: getfield g : Lb5/i;
      //   105: invokevirtual c0 : ()Lcom/smartpek/data/local/db/models/Device;
      //   108: astore #4
      //   110: aload #4
      //   112: ifnull -> 734
      //   115: aload #4
      //   117: invokevirtual getName : ()Ljava/lang/String;
      //   120: astore #4
      //   122: aload #4
      //   124: ifnull -> 734
      //   127: aload #4
      //   129: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   132: astore #4
      //   134: goto -> 137
      //   137: aload #7
      //   139: aload #4
      //   141: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   144: ifeq -> 156
      //   147: aload_0
      //   148: getfield g : Lb5/i;
      //   151: iconst_0
      //   152: invokevirtual b0 : (Z)V
      //   155: return
      //   156: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   159: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   162: astore #4
      //   164: aload #4
      //   166: ifnull -> 746
      //   169: aload #4
      //   171: invokevirtual H : ()Lu4/a;
      //   174: astore #4
      //   176: aload #4
      //   178: ifnull -> 746
      //   181: aload #4
      //   183: invokevirtual W : ()Ljava/util/List;
      //   186: astore #7
      //   188: aload #7
      //   190: ifnull -> 746
      //   193: new java/util/ArrayList
      //   196: dup
      //   197: aload #7
      //   199: bipush #10
      //   201: invokestatic s : (Ljava/lang/Iterable;I)I
      //   204: invokespecial <init> : (I)V
      //   207: astore #4
      //   209: aload #7
      //   211: invokeinterface iterator : ()Ljava/util/Iterator;
      //   216: astore #7
      //   218: aload #7
      //   220: invokeinterface hasNext : ()Z
      //   225: ifeq -> 252
      //   228: aload #4
      //   230: aload #7
      //   232: invokeinterface next : ()Ljava/lang/Object;
      //   237: checkcast com/smartpek/data/local/db/models/Device
      //   240: invokevirtual getName : ()Ljava/lang/String;
      //   243: invokeinterface add : (Ljava/lang/Object;)Z
      //   248: pop
      //   249: goto -> 218
      //   252: new java/util/ArrayList
      //   255: dup
      //   256: invokespecial <init> : ()V
      //   259: astore #7
      //   261: aload #4
      //   263: invokeinterface iterator : ()Ljava/util/Iterator;
      //   268: astore #8
      //   270: aload #8
      //   272: invokeinterface hasNext : ()Z
      //   277: ifeq -> 336
      //   280: aload #8
      //   282: invokeinterface next : ()Ljava/lang/Object;
      //   287: astore #9
      //   289: aload #9
      //   291: checkcast java/lang/String
      //   294: astore #4
      //   296: aload #4
      //   298: ifnull -> 740
      //   301: aload #4
      //   303: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   306: astore #4
      //   308: goto -> 311
      //   311: aload #4
      //   313: aload_1
      //   314: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   317: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   320: ifeq -> 270
      //   323: aload #7
      //   325: aload #9
      //   327: invokeinterface add : (Ljava/lang/Object;)Z
      //   332: pop
      //   333: goto -> 270
      //   336: aload #7
      //   338: invokeinterface size : ()I
      //   343: istore_2
      //   344: goto -> 347
      //   347: iload_2
      //   348: ifle -> 429
      //   351: aload_0
      //   352: getfield g : Lb5/i;
      //   355: astore_1
      //   356: getstatic r4/h.D0 : I
      //   359: istore_2
      //   360: aload_1
      //   361: iload_2
      //   362: invokevirtual O : (I)Landroid/view/View;
      //   365: checkcast androidx/appcompat/widget/AppCompatTextView
      //   368: astore_1
      //   369: aload_1
      //   370: ifnonnull -> 376
      //   373: goto -> 381
      //   376: aload_1
      //   377: iconst_0
      //   378: invokevirtual setVisibility : (I)V
      //   381: aload_0
      //   382: getfield g : Lb5/i;
      //   385: iload_2
      //   386: invokevirtual O : (I)Landroid/view/View;
      //   389: checkcast androidx/appcompat/widget/AppCompatTextView
      //   392: astore #4
      //   394: aload #4
      //   396: ifnonnull -> 400
      //   399: return
      //   400: aload_0
      //   401: getfield g : Lb5/i;
      //   404: invokevirtual getContext : ()Landroid/content/Context;
      //   407: astore_1
      //   408: aload_1
      //   409: ifnull -> 751
      //   412: aload_1
      //   413: ldc 2131952256
      //   415: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   418: astore_1
      //   419: goto -> 422
      //   422: aload #4
      //   424: aload_1
      //   425: invokevirtual setText : (Ljava/lang/CharSequence;)V
      //   428: return
      //   429: aload_0
      //   430: getfield g : Lb5/i;
      //   433: invokevirtual c0 : ()Lcom/smartpek/data/local/db/models/Device;
      //   436: astore #4
      //   438: aload #4
      //   440: ifnonnull -> 446
      //   443: goto -> 452
      //   446: aload #4
      //   448: aload_1
      //   449: invokevirtual setName : (Ljava/lang/String;)V
      //   452: aload_0
      //   453: getfield g : Lb5/i;
      //   456: iconst_0
      //   457: invokevirtual b0 : (Z)V
      //   460: aload_0
      //   461: getfield g : Lb5/i;
      //   464: getstatic r4/h.v6 : I
      //   467: invokevirtual O : (I)Landroid/view/View;
      //   470: checkcast androidx/appcompat/widget/AppCompatTextView
      //   473: astore #4
      //   475: aload #4
      //   477: ifnonnull -> 483
      //   480: goto -> 509
      //   483: aload_0
      //   484: getfield g : Lb5/i;
      //   487: invokevirtual c0 : ()Lcom/smartpek/data/local/db/models/Device;
      //   490: astore_1
      //   491: aload_1
      //   492: ifnull -> 756
      //   495: aload_1
      //   496: invokevirtual getName : ()Ljava/lang/String;
      //   499: astore_1
      //   500: goto -> 503
      //   503: aload #4
      //   505: aload_1
      //   506: invokevirtual setText : (Ljava/lang/CharSequence;)V
      //   509: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   512: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   515: astore_1
      //   516: aload_1
      //   517: ifnull -> 720
      //   520: aload_1
      //   521: invokevirtual H : ()Lu4/a;
      //   524: astore_1
      //   525: aload_1
      //   526: ifnull -> 720
      //   529: aload_0
      //   530: getfield g : Lb5/i;
      //   533: invokevirtual c0 : ()Lcom/smartpek/data/local/db/models/Device;
      //   536: astore #4
      //   538: aload #4
      //   540: invokestatic g : (Ljava/lang/Object;)V
      //   543: aload_1
      //   544: aload #4
      //   546: aconst_null
      //   547: iconst_2
      //   548: aconst_null
      //   549: invokestatic M : (Lq7/j;Ljava/lang/Object;Landroidx/lifecycle/Observer;ILjava/lang/Object;)V
      //   552: return
      //   553: astore_1
      //   554: aload_1
      //   555: invokevirtual printStackTrace : ()V
      //   558: aload_1
      //   559: invokevirtual getMessage : ()Ljava/lang/String;
      //   562: astore_1
      //   563: aload_1
      //   564: ifnull -> 585
      //   567: aload_1
      //   568: ldc 'UNIQUE constraint failed: Device.name'
      //   570: iconst_0
      //   571: iconst_2
      //   572: aconst_null
      //   573: invokestatic N : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      //   576: iconst_1
      //   577: if_icmpne -> 585
      //   580: iload_3
      //   581: istore_2
      //   582: goto -> 587
      //   585: iconst_0
      //   586: istore_2
      //   587: iload_2
      //   588: ifeq -> 720
      //   591: aload_0
      //   592: getfield g : Lb5/i;
      //   595: invokevirtual c0 : ()Lcom/smartpek/data/local/db/models/Device;
      //   598: astore #4
      //   600: aload #4
      //   602: ifnonnull -> 608
      //   605: goto -> 668
      //   608: aload_0
      //   609: getfield g : Lb5/i;
      //   612: getstatic r4/h.v6 : I
      //   615: invokevirtual O : (I)Landroid/view/View;
      //   618: checkcast androidx/appcompat/widget/AppCompatTextView
      //   621: astore #7
      //   623: aload #6
      //   625: astore_1
      //   626: aload #7
      //   628: ifnull -> 662
      //   631: aload #7
      //   633: invokevirtual getText : ()Ljava/lang/CharSequence;
      //   636: astore #7
      //   638: aload #6
      //   640: astore_1
      //   641: aload #7
      //   643: ifnull -> 662
      //   646: aload #7
      //   648: invokevirtual toString : ()Ljava/lang/String;
      //   651: astore_1
      //   652: aload_1
      //   653: ifnonnull -> 662
      //   656: aload #6
      //   658: astore_1
      //   659: goto -> 662
      //   662: aload #4
      //   664: aload_1
      //   665: invokevirtual setName : (Ljava/lang/String;)V
      //   668: aload_0
      //   669: getfield g : Lb5/i;
      //   672: getstatic r4/h.C0 : I
      //   675: invokevirtual O : (I)Landroid/view/View;
      //   678: checkcast androidx/appcompat/widget/AppCompatEditText
      //   681: astore #4
      //   683: aload #4
      //   685: ifnonnull -> 689
      //   688: return
      //   689: aload_0
      //   690: getfield g : Lb5/i;
      //   693: invokevirtual getContext : ()Landroid/content/Context;
      //   696: astore #6
      //   698: aload #5
      //   700: astore_1
      //   701: aload #6
      //   703: ifnull -> 714
      //   706: aload #6
      //   708: ldc 2131952256
      //   710: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   713: astore_1
      //   714: aload #4
      //   716: aload_1
      //   717: invokevirtual setError : (Ljava/lang/CharSequence;)V
      //   720: return
      //   721: ldc ''
      //   723: astore_1
      //   724: goto -> 81
      //   727: iconst_0
      //   728: istore_2
      //   729: iload_2
      //   730: ifeq -> 95
      //   733: return
      //   734: aconst_null
      //   735: astore #4
      //   737: goto -> 137
      //   740: aconst_null
      //   741: astore #4
      //   743: goto -> 311
      //   746: iconst_0
      //   747: istore_2
      //   748: goto -> 347
      //   751: aconst_null
      //   752: astore_1
      //   753: goto -> 422
      //   756: aconst_null
      //   757: astore_1
      //   758: goto -> 503
      // Exception table:
      //   from	to	target	type
      //   25	39	553	finally
      //   43	48	553	finally
      //   52	57	553	finally
      //   61	70	553	finally
      //   81	90	553	finally
      //   95	110	553	finally
      //   115	122	553	finally
      //   127	134	553	finally
      //   137	155	553	finally
      //   156	164	553	finally
      //   169	176	553	finally
      //   181	188	553	finally
      //   193	218	553	finally
      //   218	249	553	finally
      //   252	270	553	finally
      //   270	296	553	finally
      //   301	308	553	finally
      //   311	333	553	finally
      //   336	344	553	finally
      //   351	369	553	finally
      //   376	381	553	finally
      //   381	394	553	finally
      //   400	408	553	finally
      //   412	419	553	finally
      //   422	428	553	finally
      //   429	438	553	finally
      //   446	452	553	finally
      //   452	475	553	finally
      //   483	491	553	finally
      //   495	500	553	finally
      //   503	509	553	finally
      //   509	516	553	finally
      //   520	525	553	finally
      //   529	552	553	finally
    }
  }
  
  static final class z extends r8.n implements q8.l<View, e8.q> {
    z(i param1i) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.b0(false);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b5\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */