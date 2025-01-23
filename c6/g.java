package c6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.nightlight.NightLightState;
import com.smartpek.utils.colorpicker.ColorPicker;
import com.smartpek.utils.connection.mqtt.MqttRequest;
import com.smartpek.utils.connection.mqtt.MqttResponse;
import ir.am3n.needtool.views.A3SeekBar;
import ir.am3n.needtool.views.A3Toolbar;
import ir.am3n.needtool.views.nspicker.NSPicker;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.ArrayList;
import java.util.Map;
import p7.c1;
import p7.e1;
import p7.v1;
import p7.w1;

@SuppressLint({"ClickableViewAccessibility"})
public final class g extends Fragment implements a {
  public static final a p = new a(null);
  
  private static g q;
  
  private long g;
  
  private Device h;
  
  private NightLightState i;
  
  private int j = -1;
  
  private int k = -1;
  
  private int l = -1;
  
  private int m = -1;
  
  private final String[] n = (String[])f8.i.H((Object[])new String[] { 
        "0.5x", "1.0x", "1.5x", "2.0x", "2.5x", "3.0x", "3.5x", "4.0x", "4.5x", "5.0x", 
        "5.5x", "6.0x", "6.5x", "7.0x", "7.5x", "8.0x", "8.5x", "9.0x", "9.5x", "10x" });
  
  public Map<Integer, View> o;
  
  private final void c0() {
    boolean bool;
    Context context2 = getContext();
    if (context2 != null) {
      bool = w1.d(context2);
    } else {
      bool = false;
    } 
    LinearLayout linearLayout3 = (LinearLayout)N(r4.h.H3);
    if (linearLayout3 != null)
      linearLayout3.setVisibility(0); 
    ProgressBar progressBar = (ProgressBar)N(r4.h.E4);
    if (progressBar != null)
      progressBar.setVisibility(0); 
    AppCompatImageButton appCompatImageButton = (AppCompatImageButton)N(r4.h.p2);
    if (appCompatImageButton != null)
      appCompatImageButton.setVisibility(8); 
    AppCompatTextView appCompatTextView = (AppCompatTextView)N(r4.h.b7);
    if (appCompatTextView != null)
      appCompatTextView.setText(2131952152); 
    LinearLayout linearLayout2 = (LinearLayout)N(r4.h.o3);
    if (linearLayout2 != null) {
      if (bool) {
        j = 16;
      } else {
        j = 64;
      } 
      int j = p7.v.e(j);
      linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), j);
    } 
    RelativeLayout relativeLayout = (RelativeLayout)N(r4.h.c5);
    if (relativeLayout != null) {
      ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
      if (layoutParams != null) {
        char c;
        LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)layoutParams;
        if (bool) {
          c = 'P';
        } else {
          c = '';
        } 
        layoutParams1.height = p7.v.e(c);
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams1);
      } else {
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
      } 
    } 
    LinearLayout linearLayout1 = (LinearLayout)N(r4.h.z3);
    if (linearLayout1 != null) {
      ViewGroup.LayoutParams layoutParams = linearLayout1.getLayoutParams();
      if (layoutParams != null) {
        char c;
        LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)layoutParams;
        if (bool) {
          c = 'È';
        } else {
          c = 'Ü';
        } 
        layoutParams1.height = p7.v.e(c);
        linearLayout1.setLayoutParams((ViewGroup.LayoutParams)layoutParams1);
      } else {
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
      } 
    } 
    Context context1 = getContext();
    String str = null;
    if (context1 != null) {
      String str1 = c1.g(context1, 2131951801);
    } else {
      context1 = null;
    } 
    Context context3 = getContext();
    if (context3 != null) {
      String str1 = c1.g(context3, 2131951705);
    } else {
      context3 = null;
    } 
    Context context4 = getContext();
    if (context4 != null) {
      String str1 = c1.g(context4, 2131951743);
    } else {
      context4 = null;
    } 
    Context context5 = getContext();
    if (context5 != null)
      str = c1.g(context5, 2131952162); 
    int i = r4.h.V3;
    NSPicker nSPicker2 = (NSPicker)N(i);
    if (nSPicker2 != null)
      nSPicker2.setMinValue(1); 
    nSPicker2 = (NSPicker)N(i);
    if (nSPicker2 != null)
      nSPicker2.setMaxValue(4); 
    nSPicker2 = (NSPicker)N(i);
    if (nSPicker2 != null)
      nSPicker2.setDisplayedValues(new String[] { (String)context1, (String)context3, (String)context4, str }); 
    i = r4.h.Y3;
    NSPicker nSPicker1 = (NSPicker)N(i);
    if (nSPicker1 != null)
      nSPicker1.setMinValue(1); 
    nSPicker1 = (NSPicker)N(i);
    if (nSPicker1 != null)
      nSPicker1.setMaxValue(this.n.length); 
    nSPicker1 = (NSPicker)N(i);
    if (nSPicker1 == null)
      return; 
    nSPicker1.setDisplayedValues(this.n);
  }
  
  private static final void f0(g paramg) {
    r8.m.j(paramg, "this$0");
    paramg.k0();
  }
  
  private static final void g0(g paramg, NSPicker paramNSPicker, int paramInt) {
    r8.m.j(paramg, "this$0");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("nspMode setOnScrollListener() > ");
    stringBuilder.append(paramInt);
    if (paramInt == 0)
      paramg.r0(); 
  }
  
  private static final void h0(g paramg, int paramInt) {
    r8.m.j(paramg, "this$0");
    App.a a1 = App.g;
    String str = p7.f0.i(paramg);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onCreate() > colorPicker setOnColorChangedListener");
    a1.a(stringBuilder.toString());
    int i = paramg.j;
    if (i < 0) {
      paramg.j = i + 1;
      return;
    } 
    i = r4.h.D1;
    if ((AppCompatImageView)paramg.N(i) != null)
      androidx.core.widget.h.c((ImageView)paramg.N(i), c1.d(paramInt)); 
    A3SeekBar a3SeekBar = (A3SeekBar)paramg.N(r4.h.l7);
    if (a3SeekBar != null) {
      GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { paramInt, paramInt });
      gradientDrawable.setCornerRadius(0.0F);
      gradientDrawable.setTintList(c1.d(paramInt));
      a3SeekBar.setBarProgressDrawable((Drawable)gradientDrawable);
    } 
    paramg.o0(paramInt, false);
  }
  
  private static final void i0(g paramg, int paramInt) {
    r8.m.j(paramg, "this$0");
    App.a a1 = App.g;
    String str = p7.f0.i(paramg);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onCreate() > colorPicker setOnColorSelectedListener");
    a1.a(stringBuilder.toString());
    p0(paramg, paramInt, false, 2, null);
    p7.c0.l(500, new h(paramg));
  }
  
  private static final void j0(g paramg, NSPicker paramNSPicker, int paramInt) {
    r8.m.j(paramg, "this$0");
    if (paramInt == 0)
      paramg.s0(); 
  }
  
  private final void k0() {
    a.a.j(this, getContext(), b5.b.a.UNKNOWN, this.h, true, null, u.g, new v(this), new w(this), 16, null);
  }
  
  private final void m0(int paramInt, boolean paramBoolean) {
    r6.e e1;
    char[] arrayOfChar2;
    r6.e e2 = r6.e.UDP;
    boolean bool = false;
    Byte byte_ = Byte.valueOf((byte)0);
    r6.e e3 = r6.e.UNKNOWN;
    Device device1 = this.h;
    Device device2 = null;
    if (device1 != null) {
      e1 = device1.getConnType();
    } else {
      device1 = null;
    } 
    if (f8.i.r((Object[])new r6.e[] { e2, e3 }, device1)) {
      ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
            Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)6), Byte.valueOf((byte)paramInt), byte_, byte_, byte_, byte_, byte_, byte_, 
            byte_, byte_, byte_, byte_, byte_ });
      device2 = this.h;
      if (device2 != null) {
        String str = device2.getSsid();
        if (str != null) {
          str = p6.m.F(str);
          if (str != null) {
            arrayOfChar2 = str.toCharArray();
            r8.m.i(arrayOfChar2, "this as java.lang.String).toCharArray()");
            if (arrayOfChar2 != null) {
              int i = arrayOfChar2.length;
              for (paramInt = bool; paramInt < i; paramInt++)
                arrayList.add(Byte.valueOf((byte)(arrayOfChar2[paramInt] - 48))); 
            } 
          } 
        } 
      } 
      p6.m.i(this, this.h, arrayList, true, 0, 0L, 0, false, false, false, null, 1016, null);
      return;
    } 
    Device device3 = this.h;
    char[] arrayOfChar1 = arrayOfChar2;
    if (device3 != null)
      e1 = device3.getConnType(); 
    if (e1 == r6.e.MQTT && paramBoolean) {
      MqttRequest mqttRequest = new MqttRequest("Control", f8.j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(1)), e8.n.a("action", "Bright"), e8.n.a("bright", Integer.valueOf(paramInt)) }));
      p6.m.X(this, true, this.h, mqttRequest, true, x.g, new y(this), z.g);
    } 
  }
  
  private final void o0(int paramInt, boolean paramBoolean) {
    r6.e e1;
    char[] arrayOfChar2;
    r6.e e2 = r6.e.UDP;
    boolean bool = false;
    Byte byte_ = Byte.valueOf((byte)0);
    r6.e e3 = r6.e.UNKNOWN;
    Device device1 = this.h;
    Device device2 = null;
    if (device1 != null) {
      e1 = device1.getConnType();
    } else {
      device1 = null;
    } 
    if (f8.i.r((Object[])new r6.e[] { e2, e3 }, device1)) {
      int[] arrayOfInt = p7.q.a(paramInt);
      ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
            Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)4), Byte.valueOf((byte)arrayOfInt[0]), Byte.valueOf((byte)arrayOfInt[1]), Byte.valueOf((byte)arrayOfInt[2]), byte_, byte_, byte_, byte_, 
            byte_, byte_, byte_, byte_, byte_ });
      device2 = this.h;
      if (device2 != null) {
        String str = device2.getSsid();
        if (str != null) {
          str = p6.m.F(str);
          if (str != null) {
            arrayOfChar2 = str.toCharArray();
            r8.m.i(arrayOfChar2, "this as java.lang.String).toCharArray()");
            if (arrayOfChar2 != null) {
              int i = arrayOfChar2.length;
              for (paramInt = bool; paramInt < i; paramInt++)
                arrayList.add(Byte.valueOf((byte)(arrayOfChar2[paramInt] - 48))); 
            } 
          } 
        } 
      } 
      p6.m.i(this, this.h, arrayList, true, 0, 0L, 0, false, false, false, null, 1016, null);
      return;
    } 
    Device device3 = this.h;
    char[] arrayOfChar1 = arrayOfChar2;
    if (device3 != null)
      e1 = device3.getConnType(); 
    if (e1 == r6.e.MQTT && paramBoolean) {
      MqttRequest mqttRequest = new MqttRequest("Control", f8.j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(1)), e8.n.a("action", "Color"), e8.n.a("r", Integer.valueOf(Color.red(paramInt))), e8.n.a("g", Integer.valueOf(Color.green(paramInt))), e8.n.a("b", Integer.valueOf(Color.blue(paramInt))) }));
      p6.m.Z(this, true, this.h, mqttRequest, true, null, new a0(this), b0.g, 16, null);
    } 
  }
  
  private final void q0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   4: astore #8
    //   6: iconst_m1
    //   7: istore #4
    //   9: aload #8
    //   11: ifnull -> 23
    //   14: aload #8
    //   16: invokevirtual getColor : ()I
    //   19: istore_3
    //   20: goto -> 25
    //   23: iconst_m1
    //   24: istore_3
    //   25: aload_0
    //   26: iconst_m1
    //   27: putfield j : I
    //   30: getstatic r4/h.s0 : I
    //   33: istore #5
    //   35: aload_0
    //   36: iload #5
    //   38: invokevirtual N : (I)Landroid/view/View;
    //   41: checkcast com/smartpek/utils/colorpicker/ColorPicker
    //   44: astore #8
    //   46: aload #8
    //   48: ifnonnull -> 54
    //   51: goto -> 60
    //   54: aload #8
    //   56: iload_3
    //   57: invokevirtual setColor : (I)V
    //   60: getstatic r4/h.b4 : I
    //   63: istore #6
    //   65: aload_0
    //   66: iload #6
    //   68: invokevirtual N : (I)Landroid/view/View;
    //   71: checkcast com/smartpek/ui/customviews/PowerButton
    //   74: astore #8
    //   76: aload #8
    //   78: ifnull -> 94
    //   81: aload #8
    //   83: iconst_0
    //   84: iconst_0
    //   85: iconst_0
    //   86: iconst_0
    //   87: iconst_0
    //   88: bipush #31
    //   90: aconst_null
    //   91: invokestatic s : (Lcom/smartpek/ui/customviews/c;IIIIIILjava/lang/Object;)V
    //   94: aload_0
    //   95: iload #6
    //   97: invokevirtual N : (I)Landroid/view/View;
    //   100: checkcast com/smartpek/ui/customviews/PowerButton
    //   103: astore #8
    //   105: aload #8
    //   107: ifnull -> 168
    //   110: aload_0
    //   111: getfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   114: astore #9
    //   116: aload #9
    //   118: ifnull -> 154
    //   121: aload #9
    //   123: invokevirtual getPower : ()Ljava/lang/String;
    //   126: astore #9
    //   128: aload #9
    //   130: ifnull -> 154
    //   133: aload #9
    //   135: invokestatic k : (Ljava/lang/String;)Ljava/lang/Integer;
    //   138: astore #9
    //   140: aload #9
    //   142: ifnull -> 154
    //   145: aload #9
    //   147: invokevirtual intValue : ()I
    //   150: istore_2
    //   151: goto -> 156
    //   154: iconst_0
    //   155: istore_2
    //   156: aload #8
    //   158: iload_2
    //   159: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   162: iconst_0
    //   163: iconst_2
    //   164: aconst_null
    //   165: invokestatic I : (Lcom/smartpek/ui/customviews/c;Ljava/lang/Integer;IILjava/lang/Object;)V
    //   168: getstatic r4/h.D1 : I
    //   171: istore_2
    //   172: aload_0
    //   173: iload_2
    //   174: invokevirtual N : (I)Landroid/view/View;
    //   177: checkcast androidx/appcompat/widget/AppCompatImageView
    //   180: ifnull -> 271
    //   183: aload_0
    //   184: iload_2
    //   185: invokevirtual N : (I)Landroid/view/View;
    //   188: checkcast androidx/appcompat/widget/AppCompatImageView
    //   191: astore #8
    //   193: aload_0
    //   194: iload #6
    //   196: invokevirtual N : (I)Landroid/view/View;
    //   199: checkcast com/smartpek/ui/customviews/PowerButton
    //   202: astore #9
    //   204: aload #9
    //   206: ifnull -> 224
    //   209: aload #9
    //   211: iconst_1
    //   212: invokevirtual t : (I)Z
    //   215: iconst_1
    //   216: if_icmpne -> 224
    //   219: iconst_1
    //   220: istore_2
    //   221: goto -> 226
    //   224: iconst_0
    //   225: istore_2
    //   226: iload_2
    //   227: ifeq -> 258
    //   230: aload_0
    //   231: iload #5
    //   233: invokevirtual N : (I)Landroid/view/View;
    //   236: checkcast com/smartpek/utils/colorpicker/ColorPicker
    //   239: astore #9
    //   241: iload #4
    //   243: istore_2
    //   244: aload #9
    //   246: ifnull -> 262
    //   249: aload #9
    //   251: invokevirtual getColor : ()I
    //   254: istore_2
    //   255: goto -> 262
    //   258: ldc_w -16777216
    //   261: istore_2
    //   262: aload #8
    //   264: iload_2
    //   265: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   268: invokestatic c : (Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
    //   271: aload_0
    //   272: getfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   275: astore #8
    //   277: aload #8
    //   279: ifnull -> 303
    //   282: aload #8
    //   284: invokevirtual getMode : ()Ljava/lang/String;
    //   287: astore #8
    //   289: aload #8
    //   291: ifnull -> 303
    //   294: aload #8
    //   296: invokestatic parseInt : (Ljava/lang/String;)I
    //   299: istore_2
    //   300: goto -> 305
    //   303: iconst_0
    //   304: istore_2
    //   305: aload_0
    //   306: getstatic r4/h.V3 : I
    //   309: invokevirtual N : (I)Landroid/view/View;
    //   312: checkcast ir/am3n/needtool/views/nspicker/NSPicker
    //   315: astore #8
    //   317: aload #8
    //   319: ifnonnull -> 325
    //   322: goto -> 331
    //   325: aload #8
    //   327: iload_2
    //   328: invokevirtual setValue : (I)V
    //   331: getstatic r4/h.Y3 : I
    //   334: istore #5
    //   336: aload_0
    //   337: iload #5
    //   339: invokevirtual N : (I)Landroid/view/View;
    //   342: checkcast ir/am3n/needtool/views/nspicker/NSPicker
    //   345: astore #8
    //   347: aload #8
    //   349: ifnonnull -> 355
    //   352: goto -> 376
    //   355: iload_2
    //   356: iconst_1
    //   357: if_icmple -> 366
    //   360: iconst_1
    //   361: istore #7
    //   363: goto -> 369
    //   366: iconst_0
    //   367: istore #7
    //   369: aload #8
    //   371: iload #7
    //   373: invokevirtual setEnabled : (Z)V
    //   376: aload_0
    //   377: getstatic r4/h.h5 : I
    //   380: invokevirtual N : (I)Landroid/view/View;
    //   383: checkcast android/widget/RelativeLayout
    //   386: astore #8
    //   388: aload #8
    //   390: ifnonnull -> 396
    //   393: goto -> 416
    //   396: iload_2
    //   397: iconst_1
    //   398: if_icmple -> 406
    //   401: fconst_1
    //   402: fstore_1
    //   403: goto -> 410
    //   406: ldc_w 0.2
    //   409: fstore_1
    //   410: aload #8
    //   412: fload_1
    //   413: invokevirtual setAlpha : (F)V
    //   416: aload_0
    //   417: getfield n : [Ljava/lang/String;
    //   420: arraylength
    //   421: istore #4
    //   423: aload_0
    //   424: getfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   427: astore #8
    //   429: aload #8
    //   431: ifnull -> 455
    //   434: aload #8
    //   436: invokevirtual getSpeed : ()Ljava/lang/String;
    //   439: astore #8
    //   441: aload #8
    //   443: ifnull -> 455
    //   446: aload #8
    //   448: invokestatic parseInt : (Ljava/lang/String;)I
    //   451: istore_2
    //   452: goto -> 457
    //   455: iconst_0
    //   456: istore_2
    //   457: aload_0
    //   458: getfield n : [Ljava/lang/String;
    //   461: astore #8
    //   463: iload #4
    //   465: iload_2
    //   466: bipush #100
    //   468: aload #8
    //   470: arraylength
    //   471: idiv
    //   472: idiv
    //   473: isub
    //   474: istore #4
    //   476: iload #4
    //   478: aload #8
    //   480: arraylength
    //   481: if_icmple -> 491
    //   484: aload #8
    //   486: arraylength
    //   487: istore_2
    //   488: goto -> 502
    //   491: iload #4
    //   493: istore_2
    //   494: iload #4
    //   496: iconst_1
    //   497: if_icmpge -> 502
    //   500: iconst_1
    //   501: istore_2
    //   502: aload_0
    //   503: iload #5
    //   505: invokevirtual N : (I)Landroid/view/View;
    //   508: checkcast ir/am3n/needtool/views/nspicker/NSPicker
    //   511: astore #8
    //   513: aload #8
    //   515: ifnonnull -> 521
    //   518: goto -> 527
    //   521: aload #8
    //   523: iload_2
    //   524: invokevirtual setValue : (I)V
    //   527: getstatic r4/h.l7 : I
    //   530: istore #4
    //   532: aload_0
    //   533: iload #4
    //   535: invokevirtual N : (I)Landroid/view/View;
    //   538: checkcast ir/am3n/needtool/views/A3SeekBar
    //   541: astore #8
    //   543: aload #8
    //   545: ifnonnull -> 551
    //   548: goto -> 591
    //   551: aload_0
    //   552: getfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   555: astore #9
    //   557: aload #9
    //   559: ifnull -> 583
    //   562: aload #9
    //   564: invokevirtual getBrightness : ()Ljava/lang/String;
    //   567: astore #9
    //   569: aload #9
    //   571: ifnull -> 583
    //   574: aload #9
    //   576: invokestatic parseInt : (Ljava/lang/String;)I
    //   579: istore_2
    //   580: goto -> 585
    //   583: iconst_0
    //   584: istore_2
    //   585: aload #8
    //   587: iload_2
    //   588: invokevirtual setProgress : (I)V
    //   591: aload_0
    //   592: iload #4
    //   594: invokevirtual N : (I)Landroid/view/View;
    //   597: checkcast ir/am3n/needtool/views/A3SeekBar
    //   600: astore #8
    //   602: aload #8
    //   604: ifnonnull -> 608
    //   607: return
    //   608: new android/graphics/drawable/GradientDrawable
    //   611: dup
    //   612: getstatic android/graphics/drawable/GradientDrawable$Orientation.TOP_BOTTOM : Landroid/graphics/drawable/GradientDrawable$Orientation;
    //   615: iconst_2
    //   616: newarray int
    //   618: dup
    //   619: iconst_0
    //   620: iload_3
    //   621: iastore
    //   622: dup
    //   623: iconst_1
    //   624: iload_3
    //   625: iastore
    //   626: invokespecial <init> : (Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
    //   629: astore #9
    //   631: aload #9
    //   633: fconst_0
    //   634: invokevirtual setCornerRadius : (F)V
    //   637: aload #9
    //   639: iload_3
    //   640: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   643: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   646: aload #8
    //   648: aload #9
    //   650: invokevirtual setBarProgressDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   653: return
  }
  
  private final void r0() {
    int i;
    NSPicker nSPicker = (NSPicker)N(r4.h.V3);
    if (nSPicker != null) {
      i = nSPicker.getValue();
    } else {
      i = 1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("setMode() ");
    stringBuilder.append(i);
    p7.c0.l(500, new c0(this));
    r6.e e1 = r6.e.UDP;
    byte b = 0;
    r6.e e2 = r6.e.UNKNOWN;
    Device device = this.h;
    if (device != null) {
      r6.e e = device.getConnType();
    } else {
      device = null;
    } 
    if (f8.i.r((Object[])new r6.e[] { e1, e2 }, device)) {
      ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
            Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)7), Byte.valueOf((byte)i), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
            Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
      Device device1 = this.h;
      if (device1 != null) {
        String str = device1.getSsid();
        if (str != null) {
          str = p6.m.F(str);
          if (str != null) {
            char[] arrayOfChar = str.toCharArray();
            r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
            if (arrayOfChar != null) {
              int j = arrayOfChar.length;
              for (i = b; i < j; i++)
                arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48))); 
            } 
          } 
        } 
      } 
      p6.m.i(this, this.h, arrayList, true, 0, 0L, 0, false, false, false, null, 1016, null);
      return;
    } 
    MqttRequest mqttRequest = new MqttRequest("Control", f8.j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(1)), e8.n.a("action", "Mode"), e8.n.a("mode", Integer.valueOf(i)) }));
    p6.m.X(this, true, this.h, mqttRequest, true, d0.g, new e0(this), f0.g);
  }
  
  private final void s0() {
    r6.e e1;
    char[] arrayOfChar2;
    int j = this.n.length;
    NSPicker nSPicker = (NSPicker)N(r4.h.Y3);
    boolean bool = false;
    Byte byte_ = Byte.valueOf((byte)0);
    if (nSPicker != null) {
      i = nSPicker.getValue();
    } else {
      i = 0;
    } 
    int i = (j - i + 1) * 100 / this.n.length;
    p7.c0.l(500, new g0(this));
    r6.e e2 = r6.e.UDP;
    r6.e e3 = r6.e.UNKNOWN;
    Device device1 = this.h;
    Device device2 = null;
    if (device1 != null) {
      e1 = device1.getConnType();
    } else {
      device1 = null;
    } 
    if (f8.i.r((Object[])new r6.e[] { e2, e3 }, device1)) {
      ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
            Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)5), Byte.valueOf((byte)i), byte_, byte_, byte_, byte_, byte_, byte_, 
            byte_, byte_, byte_, byte_, byte_ });
      device2 = this.h;
      if (device2 != null) {
        String str = device2.getSsid();
        if (str != null) {
          str = p6.m.F(str);
          if (str != null) {
            arrayOfChar2 = str.toCharArray();
            r8.m.i(arrayOfChar2, "this as java.lang.String).toCharArray()");
            if (arrayOfChar2 != null) {
              j = arrayOfChar2.length;
              for (i = bool; i < j; i++)
                arrayList.add(Byte.valueOf((byte)(arrayOfChar2[i] - 48))); 
            } 
          } 
        } 
      } 
      p6.m.i(this, this.h, arrayList, true, 0, 0L, 0, false, false, false, null, 1016, null);
      return;
    } 
    Device device3 = this.h;
    char[] arrayOfChar1 = arrayOfChar2;
    if (device3 != null)
      e1 = device3.getConnType(); 
    if (e1 == r6.e.MQTT) {
      MqttRequest mqttRequest = new MqttRequest("Control", f8.j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(1)), e8.n.a("action", "Speed"), e8.n.a("speed", Integer.valueOf(i)) }));
      p6.m.X(this, true, this.h, mqttRequest, true, h0.g, new i0(this), j0.g);
    } 
  }
  
  public boolean F(Context paramContext, b5.b.a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super NightLightState, e8.q> paraml) {
    return a.a.h(this, paramContext, parama, paramDevice, paramBoolean, paramc, parama1, parama2, paraml);
  }
  
  public void M() {
    this.o.clear();
  }
  
  public View N(int paramInt) {
    Map<Integer, View> map = this.o;
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
  
  public void a(long paramLong) {
    this.g = paramLong;
  }
  
  public long b() {
    return this.g;
  }
  
  public void c(Activity paramActivity, Context paramContext, b5.b.a parama, Device paramDevice, PowerButton paramPowerButton, Integer paramInteger, boolean paramBoolean, c5.c paramc, q8.l<? super NightLightState, e8.q> paraml) {
    a.a.l(this, paramActivity, paramContext, parama, paramDevice, paramPowerButton, paramInteger, paramBoolean, paramc, paraml);
  }
  
  public final boolean d0() {
    App.a a1 = App.g;
    String str = p7.f0.i(this);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onBackPressed()");
    a1.a(stringBuilder.toString());
    androidx.fragment.app.m m = getParentFragmentManager();
    r8.m.i(m, "parentFragmentManager");
    p7.f0.p(m, "NightLightFrg");
    return true;
  }
  
  public final void e0(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #4
    //   3: iload_2
    //   4: ifeq -> 13
    //   7: aconst_null
    //   8: astore #5
    //   10: goto -> 64
    //   13: aload_1
    //   14: astore #5
    //   16: aload_1
    //   17: ifnonnull -> 64
    //   20: aload_0
    //   21: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   24: astore_1
    //   25: aload_1
    //   26: ifnull -> 50
    //   29: aload_1
    //   30: invokevirtual getState : ()[Ljava/lang/String;
    //   33: astore_1
    //   34: aload_1
    //   35: ifnull -> 50
    //   38: aload_1
    //   39: iconst_1
    //   40: invokestatic v : ([Ljava/lang/Object;I)Ljava/lang/Object;
    //   43: checkcast java/lang/String
    //   46: astore_1
    //   47: goto -> 52
    //   50: aconst_null
    //   51: astore_1
    //   52: aload_1
    //   53: astore #5
    //   55: aload_1
    //   56: ifnonnull -> 64
    //   59: ldc_w ''
    //   62: astore #5
    //   64: iload #4
    //   66: istore_3
    //   67: aload #5
    //   69: ifnull -> 90
    //   72: aload #5
    //   74: invokeinterface length : ()I
    //   79: ifne -> 88
    //   82: iload #4
    //   84: istore_3
    //   85: goto -> 90
    //   88: iconst_0
    //   89: istore_3
    //   90: iload_3
    //   91: ifne -> 127
    //   94: aload #5
    //   96: invokestatic a : (Ljava/lang/String;)Z
    //   99: ifeq -> 127
    //   102: aload_0
    //   103: new com/google/gson/Gson
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: aload #5
    //   112: ldc_w com/smartpek/ui/nightlight/NightLightState
    //   115: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   118: checkcast com/smartpek/ui/nightlight/NightLightState
    //   121: putfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   124: goto -> 132
    //   127: aload_0
    //   128: aconst_null
    //   129: putfield i : Lcom/smartpek/ui/nightlight/NightLightState;
    //   132: aload_0
    //   133: invokespecial q0 : ()V
    //   136: return
  }
  
  public boolean i(Activity paramActivity, Context paramContext, b5.b.a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super NightLightState, e8.q> paraml) {
    return a.a.f(this, paramActivity, paramContext, parama, paramDevice, paramBoolean, paramc, parama1, parama2, paraml);
  }
  
  public void l0(Context paramContext, Device paramDevice) {
    a.a.k(this, paramContext, paramDevice);
  }
  
  public boolean o(Activity paramActivity, b5.b.a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super NightLightState, e8.q> paraml) {
    return a.a.g(this, paramActivity, parama, paramDevice, paramBoolean, paramc, parama1, parama2, paraml);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    r8.m.j(paramLayoutInflater, "inflater");
    return paramLayoutInflater.inflate(2131558526, paramViewGroup, false);
  }
  
  public void onDestroy() {
    super.onDestroy();
    this.j = -1;
    this.k = -1;
    this.l = -1;
    this.m = -1;
  }
  
  public void onPause() {
    App.a a1 = App.g;
    String str = p7.f0.i(this);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onPause()");
    a1.a(stringBuilder.toString());
    l0(getContext(), this.h);
    super.onPause();
  }
  
  public void onStart() {
    App.a a1 = App.g;
    String str = p7.f0.i(this);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onStart()");
    a1.a(stringBuilder.toString());
    super.onStart();
  }
  
  public void onStop() {
    App.a a1 = App.g;
    String str = p7.f0.i(this);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onStop()");
    a1.a(stringBuilder.toString());
    super.onStop();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    r8.m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    App.a a1 = App.g;
    String str = p7.f0.i(this);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" > onViewCreated()");
    a1.a(stringBuilder.toString());
    if (this.h == null) {
      d0();
      return;
    } 
    OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
    r8.m.i(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
    androidx.activity.k.b(onBackPressedDispatcher, p7.f0.j(this), false, new k(this), 2, null);
    Device device = this.h;
    byte b = 0;
    int i = b;
    if (device != null) {
      i = b;
      if (device.isDemo() == true)
        i = 1; 
    } 
    if (i) {
      device = this.h;
      if (device != null) {
        i = com.smartpek.data.local.models.e.CREATOR.f();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("127.0.0.1:");
        stringBuilder1.append(i);
        device.setConnIp(stringBuilder1.toString());
      } 
    } 
    c0();
    A3Toolbar a3Toolbar = (A3Toolbar)N(r4.h.Z5);
    if (a3Toolbar != null)
      a3Toolbar.f(new n(this)); 
    i = r4.h.F4;
    PullRefreshLayout pullRefreshLayout = (PullRefreshLayout)N(i);
    if (pullRefreshLayout != null)
      pullRefreshLayout.x = true; 
    pullRefreshLayout = (PullRefreshLayout)N(i);
    if (pullRefreshLayout != null)
      pullRefreshLayout.y = 5000L; 
    pullRefreshLayout = (PullRefreshLayout)N(i);
    if (pullRefreshLayout != null)
      pullRefreshLayout.setOnRefreshListener(new b(this)); 
    AppCompatImageButton appCompatImageButton = (AppCompatImageButton)N(r4.h.p2);
    if (appCompatImageButton != null)
      e1.b((View)appCompatImageButton, new o(this)); 
    PowerButton powerButton = (PowerButton)N(r4.h.b4);
    if (powerButton != null)
      e1.b((View)powerButton, new p(this)); 
    i = r4.h.V3;
    NSPicker nSPicker2 = (NSPicker)N(i);
    if (nSPicker2 != null)
      nSPicker2.setOnValueChangedListener(new q(this)); 
    nSPicker2 = (NSPicker)N(i);
    if (nSPicker2 != null)
      nSPicker2.setOnScrollListener(new c(this)); 
    t t = new t(this);
    AppCompatImageView appCompatImageView = (AppCompatImageView)N(r4.h.r);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new r(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.s);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new s(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.t);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new b(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.u);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new c(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.v);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new d(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.w);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new e(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.x);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new f(t)); 
    appCompatImageView = (AppCompatImageView)N(r4.h.y);
    if (appCompatImageView != null)
      e1.b((View)appCompatImageView, new g(t)); 
    i = r4.h.s0;
    ColorPicker colorPicker = (ColorPicker)N(i);
    if (colorPicker != null)
      colorPicker.setOnColorChangedListener(new d(this)); 
    colorPicker = (ColorPicker)N(i);
    if (colorPicker != null)
      colorPicker.setOnColorSelectedListener(new e(this)); 
    i = r4.h.l7;
    A3SeekBar a3SeekBar = (A3SeekBar)N(i);
    if (a3SeekBar != null)
      a3SeekBar.setOnProgressChangeListener(new i(this)); 
    a3SeekBar = (A3SeekBar)N(i);
    if (a3SeekBar != null)
      a3SeekBar.setOnPressListener(j.g); 
    a3SeekBar = (A3SeekBar)N(i);
    if (a3SeekBar != null)
      a3SeekBar.setOnReleaseListener(new l(this)); 
    i = r4.h.Y3;
    NSPicker nSPicker1 = (NSPicker)N(i);
    if (nSPicker1 != null)
      nSPicker1.setOnValueChangedListener(new m(this)); 
    nSPicker1 = (NSPicker)N(i);
    if (nSPicker1 != null)
      nSPicker1.setOnScrollListener(new f(this)); 
    k0();
  }
  
  public void r(Context paramContext, b5.b.a parama, Device paramDevice, PowerButton paramPowerButton, Integer paramInteger, c5.c paramc, q8.l<? super NightLightState, e8.q> paraml) {
    a.a.c(this, paramContext, parama, paramDevice, paramPowerButton, paramInteger, paramc, paraml);
  }
  
  public void x(androidx.fragment.app.e parame, Context paramContext, b5.b.a parama, Device paramDevice, PowerButton paramPowerButton, Integer paramInteger, c5.c paramc, q8.l<? super NightLightState, e8.q> paraml) {
    a.a.d(this, parame, paramContext, parama, paramDevice, paramPowerButton, paramInteger, paramc, paraml);
  }
  
  public static final class a {
    private a() {}
    
    public final g a(Device param1Device) {
      c(new g());
      g g2 = b();
      r8.m.g(g2);
      g.X(g2, param1Device);
      g g1 = b();
      r8.m.g(g1);
      return g1;
    }
    
    public final g b() {
      return g.R();
    }
    
    public final void c(g param1g) {
      g.Y(param1g);
    }
  }
  
  static final class a0 extends r8.n implements q8.l<Object, e8.q> {
    a0(g param1g) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "response");
      MqttResponse mqttResponse = (MqttResponse)param1Object;
      String str = p7.f0.i(this.g);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Me-");
      stringBuilder.append(str);
      String.valueOf(param1Object);
    }
  }
  
  static final class b extends r8.n implements q8.l<View, e8.q> {
    b(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class b0 extends r8.n implements q8.l<Throwable, e8.q> {
    public static final b0 g = new b0();
    
    b0() {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
    }
  }
  
  static final class c extends r8.n implements q8.l<View, e8.q> {
    c(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class c0 extends r8.n implements q8.a<e8.q> {
    c0(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      g.S(this.g);
    }
  }
  
  static final class d extends r8.n implements q8.l<View, e8.q> {
    d(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class d0 extends r8.n implements q8.a<e8.q> {
    public static final d0 g = new d0();
    
    d0() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class e extends r8.n implements q8.l<View, e8.q> {
    e(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class e0 extends r8.n implements q8.l<Object, e8.q> {
    e0(g param1g) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "json");
      String str = p7.f0.i(this.g);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Me-");
      stringBuilder.append(str);
      String.valueOf(param1Object);
    }
  }
  
  static final class f extends r8.n implements q8.l<View, e8.q> {
    f(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class f0 extends r8.n implements q8.l<Throwable, e8.q> {
    public static final f0 g = new f0();
    
    f0() {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
    }
  }
  
  static final class g extends r8.n implements q8.l<View, e8.q> {
    g(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class g0 extends r8.n implements q8.a<e8.q> {
    g0(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      g.S(this.g);
    }
  }
  
  static final class h extends r8.n implements q8.a<e8.q> {
    h(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      g.S(this.g);
    }
  }
  
  static final class h0 extends r8.n implements q8.a<e8.q> {
    public static final h0 g = new h0();
    
    h0() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class i extends r8.n implements q8.l<Integer, e8.q> {
    i(g param1g) {
      super(1);
    }
    
    public final void a(int param1Int) {
      if (this.g.getContext() != null) {
        g g1 = this.g;
        int j = r4.h.l7;
        A3SeekBar a3SeekBar = (A3SeekBar)g1.N(j);
        if (a3SeekBar != null) {
          Context context = this.g.requireContext();
          float f = param1Int;
          A3SeekBar a3SeekBar1 = (A3SeekBar)this.g.N(j);
          if (a3SeekBar1 != null) {
            j = a3SeekBar1.getMaxValue();
          } else {
            j = 1;
          } 
          int k = t8.a.b(f / j * 100);
          if (k >= 0 && k < 13) {
            j = 1;
          } else {
            j = 0;
          } 
          if (j != 0) {
            j = 2131231221;
          } else {
            if (12 <= k && k < 25) {
              j = 1;
            } else {
              j = 0;
            } 
            if (j != 0) {
              j = 2131231222;
            } else {
              if (24 <= k && k < 37) {
                j = 1;
              } else {
                j = 0;
              } 
              if (j != 0) {
                j = 2131231223;
              } else {
                if (36 <= k && k < 49) {
                  j = 1;
                } else {
                  j = 0;
                } 
                if (j != 0) {
                  j = 2131231224;
                } else {
                  if (48 <= k && k < 61) {
                    j = 1;
                  } else {
                    j = 0;
                  } 
                  if (j != 0) {
                    j = 2131231225;
                  } else {
                    if (60 <= k && k < 73) {
                      j = 1;
                    } else {
                      j = 0;
                    } 
                    if (j != 0) {
                      j = 2131231226;
                    } else {
                      if (72 <= k && k < 85) {
                        j = 1;
                      } else {
                        j = 0;
                      } 
                      if (j != 0) {
                        j = 2131231227;
                      } else {
                        j = 2131231228;
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
          a3SeekBar.setMidPlaceholderDrawable(androidx.core.content.a.e(context, j));
        } 
      } 
      if (g.O(this.g) <= 0) {
        g g1 = this.g;
        g.U(g1, g.O(g1) + 1);
        return;
      } 
      g.T(this.g, param1Int, false);
    }
  }
  
  static final class i0 extends r8.n implements q8.l<Object, e8.q> {
    i0(g param1g) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "json");
      String str = p7.f0.i(this.g);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Me-");
      stringBuilder.append(str);
      String.valueOf(param1Object);
    }
  }
  
  static final class j extends r8.n implements q8.l<Integer, e8.q> {
    public static final j g = new j();
    
    j() {
      super(1);
    }
    
    public final void a(int param1Int) {}
  }
  
  static final class j0 extends r8.n implements q8.l<Throwable, e8.q> {
    public static final j0 g = new j0();
    
    j0() {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
    }
  }
  
  static final class k extends r8.n implements q8.l<androidx.activity.g, e8.q> {
    k(g param1g) {
      super(1);
    }
    
    public final void a(androidx.activity.g param1g) {
      r8.m.j(param1g, "$this$addCallback");
      this.g.d0();
    }
  }
  
  static final class l extends r8.n implements q8.l<Integer, e8.q> {
    l(g param1g) {
      super(1);
    }
    
    public final void a(int param1Int) {
      g.n0(this.g, param1Int, false, 2, null);
      p7.c0.l(500, new a(this.g));
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(g param2g) {
        super(0);
      }
      
      public final void invoke() {
        g.S(this.g);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      g.S(this.g);
    }
  }
  
  public static final class m implements NSPicker.e {
    private final Runnable a;
    
    m(g param1g) {
      this.a = new h(param1g);
    }
    
    private static final void c(g param1g) {
      r8.m.j(param1g, "this$0");
      g.b0(param1g);
    }
    
    public void a(NSPicker param1NSPicker, int param1Int1, int param1Int2) {
      param1Int2 = 0;
      param1Int1 = param1Int2;
      if (param1NSPicker != null) {
        param1Int1 = param1Int2;
        if (param1NSPicker.w0 == 0)
          param1Int1 = 1; 
      } 
      if (param1Int1 != 0) {
        p7.c0.d(this.a);
        p7.c0.k(500, this.a);
      } 
    }
  }
  
  static final class n extends r8.n implements q8.a<e8.q> {
    n(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      this.g.d0();
    }
  }
  
  static final class o extends r8.n implements q8.l<View, e8.q> {
    o(g param1g) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      ProgressBar progressBar = (ProgressBar)this.g.N(r4.h.E4);
      if (progressBar != null)
        progressBar.setVisibility(0); 
      AppCompatImageButton appCompatImageButton = (AppCompatImageButton)this.g.N(r4.h.p2);
      if (appCompatImageButton != null)
        appCompatImageButton.setVisibility(8); 
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.N(r4.h.b7);
      if (appCompatTextView != null)
        appCompatTextView.setText(2131952152); 
      g.S(this.g);
    }
  }
  
  static final class p extends r8.n implements q8.l<View, e8.q> {
    p(g param1g) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      g g1 = this.g;
      a.a.e(g1, g1.getContext(), b5.b.a.UNKNOWN, g.Q(this.g), (PowerButton)this.g.N(r4.h.b4), null, null, new a(this.g), 48, null);
    }
    
    static final class a extends r8.n implements q8.l<NightLightState, e8.q> {
      a(g param2g) {
        super(1);
      }
      
      public final void a(NightLightState param2NightLightState) {
        g.a0(this.g, param2NightLightState);
        if (param2NightLightState != null) {
          g.W(this.g);
          return;
        } 
        PowerButton powerButton = (PowerButton)this.g.N(r4.h.b4);
        if (powerButton != null)
          com.smartpek.ui.customviews.c.j((com.smartpek.ui.customviews.c)powerButton, 0, 1, null); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<NightLightState, e8.q> {
    a(g param1g) {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {
      g.a0(this.g, param1NightLightState);
      if (param1NightLightState != null) {
        g.W(this.g);
        return;
      } 
      PowerButton powerButton = (PowerButton)this.g.N(r4.h.b4);
      if (powerButton != null)
        com.smartpek.ui.customviews.c.j((com.smartpek.ui.customviews.c)powerButton, 0, 1, null); 
    }
  }
  
  public static final class q implements NSPicker.e {
    private final Runnable a;
    
    q(g param1g) {
      this.a = new i(param1g);
    }
    
    private static final void c(g param1g) {
      r8.m.j(param1g, "this$0");
      g.Z(param1g);
    }
    
    public void a(NSPicker param1NSPicker, int param1Int1, int param1Int2) {
      g g1;
      Object object;
      int i = g.P(this.b);
      param1Int1 = 1;
      if (i < 0) {
        g1 = this.b;
        g.V(g1, g.P(g1) + 1);
        return;
      } 
      if (g1 != null) {
        object = Integer.valueOf(((NSPicker)g1).w0);
      } else {
        object = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("nspMode setOnValueChangedListener() > ");
      stringBuilder.append(param1Int2);
      stringBuilder.append(" - ");
      stringBuilder.append(object);
      if (g1 == null || ((NSPicker)g1).w0 != 0)
        param1Int1 = 0; 
      if (param1Int1 != 0) {
        p7.c0.d(this.a);
        p7.c0.k(500, this.a);
      } 
    }
  }
  
  static final class r extends r8.n implements q8.l<View, e8.q> {
    r(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class s extends r8.n implements q8.l<View, e8.q> {
    s(q8.l<? super View, e8.q> param1l) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View);
    }
  }
  
  static final class t extends r8.n implements q8.l<View, e8.q> {
    t(g param1g) {
      super(1);
    }
    
    public final void a(View param1View) {
      byte b;
      r8.m.j(param1View, "it");
      App.a a = App.g;
      String str = p7.f0.i(this.g);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append(" > onCreate() > btnRed setSafeOnClickListener");
      a.a(stringBuilder.toString());
      ColorStateList colorStateList = androidx.core.widget.h.a((ImageView)param1View);
      if (colorStateList != null) {
        b = colorStateList.getDefaultColor();
      } else {
        b = -1;
      } 
      g.p0(this.g, b, false, 2, null);
      p7.c0.l(500, new a(this.g));
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(g param2g) {
        super(0);
      }
      
      public final void invoke() {
        g.S(this.g);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      g.S(this.g);
    }
  }
  
  static final class u extends r8.n implements q8.a<e8.q> {
    public static final u g = new u();
    
    u() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class v extends r8.n implements q8.a<e8.q> {
    v(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      p7.c0.q(new a(this.g));
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(g param2g) {
        super(0);
      }
      
      public final void invoke() {
        try {
          v1.m(this.g, 2131952122, 0, null, 6, null);
          ProgressBar progressBar = (ProgressBar)this.g.N(r4.h.E4);
          if (progressBar != null)
            progressBar.setVisibility(4); 
          AppCompatImageButton appCompatImageButton = (AppCompatImageButton)this.g.N(r4.h.p2);
          if (appCompatImageButton != null)
            appCompatImageButton.setVisibility(0); 
          AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.N(r4.h.b7);
          if (appCompatTextView != null)
            appCompatTextView.setText(2131952306); 
          PullRefreshLayout pullRefreshLayout = (PullRefreshLayout)this.g.N(r4.h.F4);
          if (pullRefreshLayout != null)
            pullRefreshLayout.q(); 
          PowerButton powerButton = (PowerButton)this.g.N(r4.h.b4);
        } finally {
          Exception exception = null;
        } 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      try {
        v1.m(this.g, 2131952122, 0, null, 6, null);
        ProgressBar progressBar = (ProgressBar)this.g.N(r4.h.E4);
        if (progressBar != null)
          progressBar.setVisibility(4); 
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton)this.g.N(r4.h.p2);
        if (appCompatImageButton != null)
          appCompatImageButton.setVisibility(0); 
        AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.N(r4.h.b7);
        if (appCompatTextView != null)
          appCompatTextView.setText(2131952306); 
        PullRefreshLayout pullRefreshLayout = (PullRefreshLayout)this.g.N(r4.h.F4);
        if (pullRefreshLayout != null)
          pullRefreshLayout.q(); 
        PowerButton powerButton = (PowerButton)this.g.N(r4.h.b4);
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  static final class w extends r8.n implements q8.l<NightLightState, e8.q> {
    w(g param1g) {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {
      r8.m.j(param1NightLightState, "nlState");
      g.a0(this.g, param1NightLightState);
      p7.c0.l(500, new a(this.g));
      p7.c0.q(new b(this.g));
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(g param2g) {
        super(0);
      }
      
      public final void invoke() {
        try {
          LinearLayout linearLayout = (LinearLayout)this.g.N(r4.h.H3);
          if (linearLayout == null)
            return; 
          return;
        } finally {
          Exception exception = null;
        } 
      }
    }
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(g param2g) {
        super(0);
      }
      
      public final void invoke() {
        try {
          PullRefreshLayout pullRefreshLayout = (PullRefreshLayout)this.g.N(r4.h.F4);
          return;
        } finally {
          Exception exception = null;
          exception.printStackTrace();
        } 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      try {
        LinearLayout linearLayout = (LinearLayout)this.g.N(r4.h.H3);
        if (linearLayout == null)
          return; 
        return;
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  static final class b extends r8.n implements q8.a<e8.q> {
    b(g param1g) {
      super(0);
    }
    
    public final void invoke() {
      try {
        PullRefreshLayout pullRefreshLayout = (PullRefreshLayout)this.g.N(r4.h.F4);
        return;
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      } 
    }
  }
  
  static final class x extends r8.n implements q8.a<e8.q> {
    public static final x g = new x();
    
    x() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class y extends r8.n implements q8.l<Object, e8.q> {
    y(g param1g) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "json");
      String str = p7.f0.i(this.g);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Me-");
      stringBuilder.append(str);
      String.valueOf(param1Object);
    }
  }
  
  static final class z extends r8.n implements q8.l<Throwable, e8.q> {
    public static final z g = new z();
    
    z() {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c6\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */