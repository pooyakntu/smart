package e5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.smartpek.ui.device.coolerctrl.auto.CoolerStep;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p7.c1;
import p7.q1;
import p7.v;
import r4.h;
import r8.m;
import s7.i;
import z8.m;

@SuppressLint({"SetTextI18n"})
public final class e extends i<CoolerStep> {
  private final View D;
  
  public Map<Integer, View> E;
  
  public e(View paramView) {
    super(paramView);
  }
  
  public View Z(int paramInt) {
    Map<Integer, View> map = this.E;
    View view2 = map.get(Integer.valueOf(paramInt));
    View view1 = view2;
    if (view2 == null) {
      view1 = c0();
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
  
  public void a() {
    int j = h.f0;
    MaterialCardView materialCardView = (MaterialCardView)Z(j);
    if (materialCardView != null)
      materialCardView.setCardElevation(v.a(2)); 
    materialCardView = (MaterialCardView)Z(j);
    if (materialCardView != null) {
      ViewPropertyAnimator viewPropertyAnimator = materialCardView.animate();
      if (viewPropertyAnimator != null) {
        viewPropertyAnimator = viewPropertyAnimator.scaleX(1.0F);
        if (viewPropertyAnimator != null) {
          viewPropertyAnimator = viewPropertyAnimator.scaleY(1.0F);
          if (viewPropertyAnimator != null) {
            viewPropertyAnimator = viewPropertyAnimator.setDuration(100L);
            if (viewPropertyAnimator != null)
              viewPropertyAnimator.start(); 
          } 
        } 
      } 
    } 
    materialCardView = (MaterialCardView)Z(j);
    if (materialCardView == null)
      return; 
    Context context = ((RecyclerView.e0)this).g.getContext();
    m.i(context, "itemView.context");
    materialCardView.setBackgroundTintList(c1.d(c1.a(context, 2131099770)));
  }
  
  public void a0(CoolerStep paramCoolerStep, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic r4/h.Q6 : I
    //   4: invokevirtual Z : (I)Landroid/view/View;
    //   7: checkcast androidx/appcompat/widget/AppCompatTextView
    //   10: astore #4
    //   12: iconst_0
    //   13: istore_3
    //   14: aload #4
    //   16: ifnonnull -> 22
    //   19: goto -> 47
    //   22: aload_1
    //   23: ifnull -> 34
    //   26: aload_1
    //   27: invokevirtual getIndex : ()I
    //   30: istore_2
    //   31: goto -> 36
    //   34: iconst_0
    //   35: istore_2
    //   36: aload #4
    //   38: iload_2
    //   39: iconst_1
    //   40: iadd
    //   41: invokestatic valueOf : (I)Ljava/lang/String;
    //   44: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   47: aload_0
    //   48: getstatic r4/h.P6 : I
    //   51: invokevirtual Z : (I)Landroid/view/View;
    //   54: checkcast androidx/appcompat/widget/AppCompatTextView
    //   57: astore #7
    //   59: aconst_null
    //   60: astore #6
    //   62: aload #7
    //   64: ifnonnull -> 70
    //   67: goto -> 359
    //   70: getstatic e5/c.i : Le5/c$a;
    //   73: invokevirtual d : ()[Ljava/lang/String;
    //   76: astore #4
    //   78: aload #4
    //   80: ifnull -> 108
    //   83: aload_1
    //   84: ifnull -> 95
    //   87: aload_1
    //   88: invokevirtual getIndex : ()I
    //   91: istore_2
    //   92: goto -> 97
    //   95: iconst_0
    //   96: istore_2
    //   97: aload #4
    //   99: iload_2
    //   100: iconst_1
    //   101: iadd
    //   102: aaload
    //   103: astore #4
    //   105: goto -> 111
    //   108: aconst_null
    //   109: astore #4
    //   111: aload_0
    //   112: getfield g : Landroid/view/View;
    //   115: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   118: astore #5
    //   120: aload #5
    //   122: ldc 'itemView.resources'
    //   124: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   127: aload #5
    //   129: invokestatic c : (Landroid/content/res/Resources;)Ljava/util/Locale;
    //   132: invokevirtual getLanguage : ()Ljava/lang/String;
    //   135: astore #5
    //   137: aload #5
    //   139: ldc 'itemView.resources.currentLocale().language'
    //   141: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   144: aload #5
    //   146: ldc 'fa'
    //   148: iconst_0
    //   149: iconst_2
    //   150: aconst_null
    //   151: invokestatic N : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   154: ifeq -> 236
    //   157: aload_0
    //   158: getfield g : Landroid/view/View;
    //   161: invokevirtual getContext : ()Landroid/content/Context;
    //   164: astore #5
    //   166: aload #5
    //   168: ifnull -> 190
    //   171: aload #5
    //   173: ldc 'context'
    //   175: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   178: aload #5
    //   180: ldc 2131952240
    //   182: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   185: astore #5
    //   187: goto -> 193
    //   190: aconst_null
    //   191: astore #5
    //   193: new java/lang/StringBuilder
    //   196: dup
    //   197: invokespecial <init> : ()V
    //   200: astore #8
    //   202: aload #8
    //   204: aload #5
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload #8
    //   212: ldc ' '
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload #8
    //   220: aload #4
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload #8
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: astore #4
    //   233: goto -> 352
    //   236: aload #4
    //   238: ifnull -> 251
    //   241: aload #4
    //   243: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   246: astore #4
    //   248: goto -> 254
    //   251: aconst_null
    //   252: astore #4
    //   254: aload_0
    //   255: getfield g : Landroid/view/View;
    //   258: invokevirtual getContext : ()Landroid/content/Context;
    //   261: astore #5
    //   263: aload #5
    //   265: ifnull -> 309
    //   268: aload #5
    //   270: ldc 'context'
    //   272: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   275: aload #5
    //   277: ldc 2131952240
    //   279: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
    //   282: astore #5
    //   284: aload #5
    //   286: ifnull -> 309
    //   289: aload #5
    //   291: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   294: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   297: astore #5
    //   299: aload #5
    //   301: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
    //   303: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   306: goto -> 312
    //   309: aconst_null
    //   310: astore #5
    //   312: new java/lang/StringBuilder
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: astore #8
    //   321: aload #8
    //   323: aload #4
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload #8
    //   331: ldc ' '
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: aload #8
    //   339: aload #5
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: pop
    //   345: aload #8
    //   347: invokevirtual toString : ()Ljava/lang/String;
    //   350: astore #4
    //   352: aload #7
    //   354: aload #4
    //   356: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   359: aload_0
    //   360: getstatic r4/h.d6 : I
    //   363: invokevirtual Z : (I)Landroid/view/View;
    //   366: checkcast androidx/appcompat/widget/AppCompatTextView
    //   369: astore #5
    //   371: aload #5
    //   373: ifnonnull -> 379
    //   376: goto -> 444
    //   379: getstatic e5/c.i : Le5/c$a;
    //   382: invokevirtual a : ()Ljava/util/List;
    //   385: astore #4
    //   387: aload #4
    //   389: ifnull -> 434
    //   392: aload_1
    //   393: ifnull -> 416
    //   396: aload_1
    //   397: invokevirtual getAction : ()Lcom/smartpek/ui/device/coolerctrl/auto/CoolerStep$Action;
    //   400: astore #7
    //   402: aload #7
    //   404: ifnull -> 416
    //   407: aload #7
    //   409: invokevirtual ordinal : ()I
    //   412: istore_2
    //   413: goto -> 418
    //   416: iconst_0
    //   417: istore_2
    //   418: aload #4
    //   420: iload_2
    //   421: invokeinterface get : (I)Ljava/lang/Object;
    //   426: checkcast java/lang/String
    //   429: astore #4
    //   431: goto -> 437
    //   434: aconst_null
    //   435: astore #4
    //   437: aload #5
    //   439: aload #4
    //   441: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   444: aload_0
    //   445: getstatic r4/h.q3 : I
    //   448: invokevirtual Z : (I)Landroid/view/View;
    //   451: checkcast ir/am3n/needtool/views/A3LinearLayout
    //   454: astore #4
    //   456: aload #4
    //   458: ifnonnull -> 464
    //   461: goto -> 503
    //   464: aload_1
    //   465: ifnull -> 481
    //   468: aload_1
    //   469: invokevirtual getDelay : ()I
    //   472: iconst_m1
    //   473: if_icmpne -> 481
    //   476: iconst_1
    //   477: istore_2
    //   478: goto -> 483
    //   481: iconst_0
    //   482: istore_2
    //   483: iconst_1
    //   484: iload_2
    //   485: ixor
    //   486: ifeq -> 494
    //   489: iconst_0
    //   490: istore_2
    //   491: goto -> 497
    //   494: bipush #8
    //   496: istore_2
    //   497: aload #4
    //   499: iload_2
    //   500: invokevirtual setVisibility : (I)V
    //   503: aload_1
    //   504: ifnull -> 515
    //   507: aload_1
    //   508: invokevirtual getDelay : ()I
    //   511: istore_2
    //   512: goto -> 517
    //   515: iconst_0
    //   516: istore_2
    //   517: iload_2
    //   518: iflt -> 587
    //   521: aload_0
    //   522: getstatic r4/h.n6 : I
    //   525: invokevirtual Z : (I)Landroid/view/View;
    //   528: checkcast androidx/appcompat/widget/AppCompatTextView
    //   531: astore #5
    //   533: aload #5
    //   535: ifnonnull -> 539
    //   538: return
    //   539: getstatic e5/c.i : Le5/c$a;
    //   542: invokevirtual b : ()Ljava/util/List;
    //   545: astore #7
    //   547: aload #6
    //   549: astore #4
    //   551: aload #7
    //   553: ifnull -> 580
    //   556: iload_3
    //   557: istore_2
    //   558: aload_1
    //   559: ifnull -> 567
    //   562: aload_1
    //   563: invokevirtual getDelay : ()I
    //   566: istore_2
    //   567: aload #7
    //   569: iload_2
    //   570: invokeinterface get : (I)Ljava/lang/Object;
    //   575: checkcast java/lang/String
    //   578: astore #4
    //   580: aload #5
    //   582: aload #4
    //   584: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   587: return
  }
  
  public View b() {
    return this.D;
  }
  
  public void b0(CoolerStep paramCoolerStep, int paramInt, List<Object> paramList) {
    m.j(paramList, "payloads");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("changed() >  pos: ");
    stringBuilder.append(paramInt);
    stringBuilder.append("  -  payloads: ");
    stringBuilder.append(paramList);
    Iterator<d.a> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() == d.a.STEP_CHANGE) {
        String str1;
        StringBuilder stringBuilder1;
        AppCompatTextView appCompatTextView1 = (AppCompatTextView)Z(h.Q6);
        if (appCompatTextView1 != null) {
          if (paramCoolerStep != null) {
            paramInt = paramCoolerStep.getIndex();
          } else {
            paramInt = 0;
          } 
          appCompatTextView1.setText(String.valueOf(paramInt + 1));
        } 
        AppCompatTextView appCompatTextView2 = (AppCompatTextView)Z(h.P6);
        if (appCompatTextView2 == null)
          continue; 
        String[] arrayOfString = c.i.d();
        Context context = null;
        stringBuilder = null;
        if (arrayOfString != null) {
          if (paramCoolerStep != null) {
            paramInt = paramCoolerStep.getIndex();
          } else {
            paramInt = 0;
          } 
          str1 = arrayOfString[paramInt + 1];
        } else {
          arrayOfString = null;
        } 
        Resources resources = ((RecyclerView.e0)this).g.getResources();
        m.i(resources, "itemView.resources");
        String str2 = c1.c(resources).getLanguage();
        m.i(str2, "itemView.resources.currentLocale().language");
        if (m.N(str2, "fa", false, 2, null)) {
          String str;
          context = ((RecyclerView.e0)this).g.getContext();
          if (context != null) {
            m.i(context, "context");
            str = c1.g(context, 2131952240);
          } 
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(str);
          stringBuilder1.append(" ");
          stringBuilder1.append((String)arrayOfString);
          str1 = stringBuilder1.toString();
        } else {
          String str;
          if (str1 != null) {
            str1 = q1.b(str1);
          } else {
            str1 = null;
          } 
          Context context1 = ((RecyclerView.e0)this).g.getContext();
          stringBuilder = stringBuilder1;
          if (context1 != null) {
            m.i(context1, "context");
            String str3 = c1.g(context1, 2131952240);
            stringBuilder = stringBuilder1;
            if (str3 != null) {
              str = str3.toLowerCase(Locale.ROOT);
              m.i(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } 
          } 
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(str1);
          stringBuilder1.append(" ");
          stringBuilder1.append(str);
          str1 = stringBuilder1.toString();
        } 
        appCompatTextView2.setText(str1);
      } 
    } 
  }
  
  public void c() {
    int j = h.f0;
    MaterialCardView materialCardView = (MaterialCardView)Z(j);
    if (materialCardView != null)
      materialCardView.setCardElevation(v.a(10)); 
    materialCardView = (MaterialCardView)Z(j);
    if (materialCardView != null) {
      ViewPropertyAnimator viewPropertyAnimator = materialCardView.animate();
      if (viewPropertyAnimator != null) {
        viewPropertyAnimator = viewPropertyAnimator.scaleX(1.04F);
        if (viewPropertyAnimator != null) {
          viewPropertyAnimator = viewPropertyAnimator.scaleY(1.04F);
          if (viewPropertyAnimator != null) {
            viewPropertyAnimator = viewPropertyAnimator.setDuration(200L);
            if (viewPropertyAnimator != null)
              viewPropertyAnimator.start(); 
          } 
        } 
      } 
    } 
    materialCardView = (MaterialCardView)Z(j);
    if (materialCardView == null)
      return; 
    Context context = ((RecyclerView.e0)this).g.getContext();
    m.i(context, "itemView.context");
    materialCardView.setBackgroundTintList(c1.d(c1.a(context, 2131099773)));
  }
  
  public View c0() {
    View view = ((RecyclerView.e0)this).g;
    m.i(view, "itemView");
    return view;
  }
  
  public View k() {
    return null;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e5\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */