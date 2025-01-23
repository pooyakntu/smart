package a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import b5.a;
import b9.a2;
import b9.e0;
import b9.o0;
import b9.t0;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Group;
import com.smartpek.data.local.db.models.GroupJoinDevices;
import com.smartpek.ui.MainAct;
import e8.q;
import f8.o;
import ir.am3n.needtool.views.recyclerview.RtlStaggeredLayoutManager;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p7.c0;
import p7.c1;
import p7.e1;
import p7.f0;
import p7.h1;
import p7.n0;
import q8.p;
import s7.f;
import x4.w;

public final class h extends a implements w, Observer<List<? extends GroupJoinDevices>>, f<Group>, a.b {
  public static final a n = new a(null);
  
  private static h o;
  
  private a k;
  
  private int l = -1;
  
  public Map<Integer, View> m;
  
  private final void W(int paramInt) {
    b9.f.d((e0)f0.k((Fragment)this), null, null, new c(this, paramInt, null), 3, null);
  }
  
  private final MainAct Z() {
    return (MainAct)getActivity();
  }
  
  private final void a0() {
    RelativeLayout relativeLayout = (RelativeLayout)O(r4.h.X4);
    if (relativeLayout == null)
      return; 
    int i = Y();
    boolean bool = false;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0) {
      i = bool;
    } else {
      i = 8;
    } 
    relativeLayout.setVisibility(i);
  }
  
  private final void b0(Bundle paramBundle) {
    b9.f.d((e0)f0.k((Fragment)this), null, null, new d(this, null), 3, null);
  }
  
  private final void c0() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
  }
  
  private static final boolean f0(Group paramGroup) {
    return (paramGroup.getCount() == 0);
  }
  
  private static final void g0(h paramh) {
    r8.m.j(paramh, "this$0");
    RecyclerView recyclerView = (RecyclerView)paramh.O(r4.h.H4);
    if (recyclerView != null)
      recyclerView.t1(0); 
  }
  
  private static final void k0(com.smartpek.utils.sweetalert.i parami1, com.smartpek.utils.sweetalert.i parami2) {
    r8.m.j(parami1, "$dialog");
    parami1.j();
  }
  
  private static final void l0(h paramh, com.smartpek.utils.sweetalert.i parami) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'this$0'
    //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: invokevirtual j : ()V
    //   10: aload_0
    //   11: getfield k : La6/a;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnull -> 82
    //   19: aload_1
    //   20: invokevirtual R : ()Ljava/util/List;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull -> 82
    //   28: new java/util/ArrayList
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore_2
    //   36: aload_1
    //   37: invokeinterface iterator : ()Ljava/util/Iterator;
    //   42: astore_3
    //   43: aload_2
    //   44: astore_1
    //   45: aload_3
    //   46: invokeinterface hasNext : ()Z
    //   51: ifeq -> 86
    //   54: aload_3
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: astore_1
    //   61: aload_1
    //   62: checkcast com/smartpek/data/local/db/models/Group
    //   65: invokevirtual isSelected : ()Z
    //   68: ifeq -> 43
    //   71: aload_2
    //   72: aload_1
    //   73: invokeinterface add : (Ljava/lang/Object;)Z
    //   78: pop
    //   79: goto -> 43
    //   82: invokestatic i : ()Ljava/util/List;
    //   85: astore_1
    //   86: new java/util/ArrayList
    //   89: dup
    //   90: aload_1
    //   91: invokespecial <init> : (Ljava/util/Collection;)V
    //   94: astore_1
    //   95: aload_0
    //   96: invokevirtual d0 : ()Z
    //   99: pop
    //   100: aload_0
    //   101: invokestatic k : (Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleCoroutineScope;
    //   104: aconst_null
    //   105: aconst_null
    //   106: new a6/h$j
    //   109: dup
    //   110: aload_1
    //   111: aconst_null
    //   112: invokespecial <init> : (Ljava/util/ArrayList;Lj8/d;)V
    //   115: iconst_3
    //   116: aconst_null
    //   117: invokestatic d : (Lb9/e0;Lj8/g;Lb9/g0;Lq8/p;ILjava/lang/Object;)Lb9/n1;
    //   120: pop
    //   121: return
  }
  
  private static final boolean m0(h paramh, View paramView) {
    r8.m.j(paramh, "this$0");
    return true;
  }
  
  private final void n0(Group paramGroup) {
    f0.k((Fragment)this).launchWhenResumed(new m(this, paramGroup, null));
  }
  
  private final Object p0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, j8.d<? super q> paramd) {
    // Byte code:
    //   0: aload #4
    //   2: instanceof a6/h$n
    //   5: ifeq -> 49
    //   8: aload #4
    //   10: checkcast a6/h$n
    //   13: astore #7
    //   15: aload #7
    //   17: getfield n : I
    //   20: istore #5
    //   22: iload #5
    //   24: ldc_w -2147483648
    //   27: iand
    //   28: ifeq -> 49
    //   31: aload #7
    //   33: iload #5
    //   35: ldc_w -2147483648
    //   38: iadd
    //   39: putfield n : I
    //   42: aload #7
    //   44: astore #4
    //   46: goto -> 61
    //   49: new a6/h$n
    //   52: dup
    //   53: aload_0
    //   54: aload #4
    //   56: invokespecial <init> : (La6/h;Lj8/d;)V
    //   59: astore #4
    //   61: aload #4
    //   63: getfield l : Ljava/lang/Object;
    //   66: astore #10
    //   68: invokestatic d : ()Ljava/lang/Object;
    //   71: astore #11
    //   73: aload #4
    //   75: getfield n : I
    //   78: istore #5
    //   80: iload #5
    //   82: ifeq -> 152
    //   85: iload #5
    //   87: iconst_1
    //   88: if_icmpne -> 141
    //   91: aload #4
    //   93: getfield k : Z
    //   96: istore_2
    //   97: aload #4
    //   99: getfield j : Z
    //   102: istore_1
    //   103: aload #4
    //   105: getfield i : Ljava/lang/Object;
    //   108: checkcast java/util/Iterator
    //   111: astore #9
    //   113: aload #4
    //   115: getfield h : Ljava/lang/Object;
    //   118: checkcast r8/y
    //   121: astore #8
    //   123: aload #4
    //   125: getfield g : Ljava/lang/Object;
    //   128: checkcast a6/h
    //   131: astore #7
    //   133: aload #10
    //   135: invokestatic b : (Ljava/lang/Object;)V
    //   138: goto -> 365
    //   141: new java/lang/IllegalStateException
    //   144: dup
    //   145: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   148: invokespecial <init> : (Ljava/lang/String;)V
    //   151: athrow
    //   152: aload #10
    //   154: invokestatic b : (Ljava/lang/Object;)V
    //   157: iload_1
    //   158: ifne -> 404
    //   161: new r8/y
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: astore #8
    //   170: aload #8
    //   172: ldc_w 2147483647
    //   175: putfield g : I
    //   178: iload_2
    //   179: ifeq -> 380
    //   182: aload_0
    //   183: getfield k : La6/a;
    //   186: astore #7
    //   188: aload #7
    //   190: ifnull -> 380
    //   193: aload #7
    //   195: invokevirtual R : ()Ljava/util/List;
    //   198: astore #7
    //   200: aload #7
    //   202: ifnull -> 380
    //   205: aload #7
    //   207: invokeinterface iterator : ()Ljava/util/Iterator;
    //   212: astore #9
    //   214: aload_0
    //   215: astore #7
    //   217: iload_3
    //   218: istore_2
    //   219: aload #9
    //   221: invokeinterface hasNext : ()Z
    //   226: ifeq -> 375
    //   229: aload #9
    //   231: invokeinterface next : ()Ljava/lang/Object;
    //   236: checkcast com/smartpek/data/local/db/models/Group
    //   239: astore #10
    //   241: aload #8
    //   243: getfield g : I
    //   246: istore #5
    //   248: aload #8
    //   250: iload #5
    //   252: iconst_1
    //   253: isub
    //   254: putfield g : I
    //   257: aload #10
    //   259: iload #5
    //   261: invokevirtual setOrder : (I)V
    //   264: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   267: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
    //   270: astore #12
    //   272: aload #12
    //   274: ifnull -> 219
    //   277: aload #12
    //   279: invokevirtual I : ()Lu4/c;
    //   282: astore #12
    //   284: aload #12
    //   286: ifnull -> 219
    //   289: aload #10
    //   291: invokevirtual getOrder : ()I
    //   294: istore #5
    //   296: aload #10
    //   298: invokevirtual getId : ()I
    //   301: istore #6
    //   303: aload #4
    //   305: aload #7
    //   307: putfield g : Ljava/lang/Object;
    //   310: aload #4
    //   312: aload #8
    //   314: putfield h : Ljava/lang/Object;
    //   317: aload #4
    //   319: aload #9
    //   321: putfield i : Ljava/lang/Object;
    //   324: aload #4
    //   326: iload_1
    //   327: putfield j : Z
    //   330: aload #4
    //   332: iload_2
    //   333: putfield k : Z
    //   336: aload #4
    //   338: iconst_1
    //   339: putfield n : I
    //   342: aload #12
    //   344: iload #5
    //   346: iload #6
    //   348: aload #4
    //   350: invokevirtual X : (IILj8/d;)Ljava/lang/Object;
    //   353: astore #10
    //   355: aload #10
    //   357: aload #11
    //   359: if_acmpne -> 365
    //   362: aload #11
    //   364: areturn
    //   365: aload #10
    //   367: checkcast java/lang/Integer
    //   370: astore #10
    //   372: goto -> 219
    //   375: iload_2
    //   376: istore_3
    //   377: goto -> 383
    //   380: aload_0
    //   381: astore #7
    //   383: aload #7
    //   385: getstatic r4/h.Q0 : I
    //   388: invokevirtual O : (I)Landroid/view/View;
    //   391: checkcast com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton
    //   394: invokevirtual D : ()V
    //   397: aload #7
    //   399: astore #4
    //   401: goto -> 420
    //   404: aload_0
    //   405: getstatic r4/h.Q0 : I
    //   408: invokevirtual O : (I)Landroid/view/View;
    //   411: checkcast com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton
    //   414: invokevirtual x : ()V
    //   417: aload_0
    //   418: astore #4
    //   420: aload #4
    //   422: invokespecial Z : ()Lcom/smartpek/ui/MainAct;
    //   425: astore #4
    //   427: aload #4
    //   429: invokestatic g : (Ljava/lang/Object;)V
    //   432: aload #4
    //   434: iload_1
    //   435: iload_3
    //   436: invokevirtual n0 : (ZZ)V
    //   439: getstatic e8/q.a : Le8/q;
    //   442: areturn
  }
  
  public void H() {
    this.m.clear();
  }
  
  public View O(int paramInt) {
    Map<Integer, View> map = this.m;
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
  
  public final void U() {
    v v = f0.g((Fragment)this).n();
    r8.m.i(v, "sfm.beginTransaction()");
    p6.m.g0(f0.c(v, 2131362190, (Fragment)new z5.h())).j();
  }
  
  public final boolean V() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : La6/a;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 22
    //   9: aload_2
    //   10: invokevirtual T : ()Z
    //   13: iconst_1
    //   14: if_icmpne -> 22
    //   17: iconst_1
    //   18: istore_1
    //   19: goto -> 24
    //   22: iconst_0
    //   23: istore_1
    //   24: iload_1
    //   25: ifne -> 81
    //   28: aload_0
    //   29: invokespecial Z : ()Lcom/smartpek/ui/MainAct;
    //   32: astore_2
    //   33: aload_2
    //   34: ifnull -> 70
    //   37: aload_2
    //   38: invokevirtual W : ()Landroid/widget/RelativeLayout;
    //   41: astore_2
    //   42: aload_2
    //   43: ifnull -> 70
    //   46: aload_2
    //   47: invokevirtual getVisibility : ()I
    //   50: ifne -> 58
    //   53: iconst_1
    //   54: istore_1
    //   55: goto -> 60
    //   58: iconst_0
    //   59: istore_1
    //   60: iload_1
    //   61: iconst_1
    //   62: if_icmpne -> 70
    //   65: iconst_1
    //   66: istore_1
    //   67: goto -> 72
    //   70: iconst_0
    //   71: istore_1
    //   72: iload_1
    //   73: ifeq -> 79
    //   76: goto -> 81
    //   79: iconst_0
    //   80: ireturn
    //   81: aload_0
    //   82: invokevirtual getView : ()Landroid/view/View;
    //   85: ifnull -> 109
    //   88: aload_0
    //   89: invokestatic k : (Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleCoroutineScope;
    //   92: aconst_null
    //   93: aconst_null
    //   94: new a6/h$b
    //   97: dup
    //   98: aload_0
    //   99: aconst_null
    //   100: invokespecial <init> : (La6/h;Lj8/d;)V
    //   103: iconst_3
    //   104: aconst_null
    //   105: invokestatic d : (Lb9/e0;Lj8/g;Lb9/g0;Lq8/p;ILjava/lang/Object;)Lb9/n1;
    //   108: pop
    //   109: aload_0
    //   110: getfield k : La6/a;
    //   113: astore_2
    //   114: aload_2
    //   115: ifnull -> 159
    //   118: aload_2
    //   119: invokevirtual R : ()Ljava/util/List;
    //   122: astore_2
    //   123: aload_2
    //   124: ifnull -> 159
    //   127: aload_2
    //   128: invokeinterface iterator : ()Ljava/util/Iterator;
    //   133: astore_2
    //   134: aload_2
    //   135: invokeinterface hasNext : ()Z
    //   140: ifeq -> 159
    //   143: aload_2
    //   144: invokeinterface next : ()Ljava/lang/Object;
    //   149: checkcast com/smartpek/data/local/db/models/Group
    //   152: iconst_0
    //   153: invokevirtual setSelected : (Z)V
    //   156: goto -> 134
    //   159: aload_0
    //   160: getfield k : La6/a;
    //   163: astore_2
    //   164: aload_2
    //   165: ifnull -> 191
    //   168: aload_2
    //   169: ifnull -> 180
    //   172: aload_2
    //   173: invokevirtual j : ()I
    //   176: istore_1
    //   177: goto -> 182
    //   180: iconst_0
    //   181: istore_1
    //   182: aload_2
    //   183: iconst_0
    //   184: iload_1
    //   185: getstatic a6/a$a.SELECT_STATE_CHANGED : La6/a$a;
    //   188: invokevirtual t : (IILjava/lang/Object;)V
    //   191: aload_0
    //   192: getfield k : La6/a;
    //   195: astore_2
    //   196: aload_2
    //   197: ifnull -> 223
    //   200: aload_2
    //   201: ifnull -> 212
    //   204: aload_2
    //   205: invokevirtual j : ()I
    //   208: istore_1
    //   209: goto -> 214
    //   212: iconst_0
    //   213: istore_1
    //   214: aload_2
    //   215: iconst_0
    //   216: iload_1
    //   217: getstatic a6/a$a.SORT_MODE_LOCKED : La6/a$a;
    //   220: invokevirtual t : (IILjava/lang/Object;)V
    //   223: iconst_1
    //   224: ireturn
  }
  
  public final a X() {
    return this.k;
  }
  
  public final int Y() {
    if (this.l == -1) {
      Context context = getContext();
      byte b1 = 0;
      int i = b1;
      if (context != null) {
        SharedPreferences sharedPreferences = h1.f(context, "Main", 0, 2, null);
        i = b1;
        if (sharedPreferences != null)
          i = h1.c(sharedPreferences, "group_counts", 0, 2, null); 
      } 
      this.l = i;
    } 
    return this.l;
  }
  
  public void d(int paramInt, Group paramGroup) {
    r8.m.j(paramGroup, "item");
    b9.f.d((e0)f0.k((Fragment)this), null, null, new h(paramGroup, this, paramInt, null), 3, null);
  }
  
  public final boolean d0() {
    if (V())
      return true; 
    androidx.fragment.app.m m = getParentFragmentManager();
    y5.i.a a2 = y5.i.j;
    if (m.i0(a2.b()) != null) {
      Fragment fragment = getParentFragmentManager().i0(a2.b());
      r8.m.h(fragment, "null cannot be cast to non-null type com.smartpek.ui.group.GroupFrg");
      ((y5.i)fragment).S();
      return true;
    } 
    m = f0.g((Fragment)this);
    z5.h.a a1 = z5.h.m;
    if (m.i0(a1.b()) != null) {
      Fragment fragment = f0.g((Fragment)this).i0(a1.b());
      r8.m.h(fragment, "null cannot be cast to non-null type com.smartpek.ui.group.edit.EditGroupFrg");
      ((z5.h)fragment).c0();
      return true;
    } 
    return false;
  }
  
  public void e() {
    if (!isAdded())
      return; 
    c0.q(new k(this));
  }
  
  public void e0(List<GroupJoinDevices> paramList) {
    x7.c.a a1 = x7.c.a;
    str = f0.i((Fragment)this);
    if (paramList != null) {
      arrayList1 = (ArrayList<Group>)Integer.valueOf(paramList.size());
    } else {
      arrayList1 = null;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onChanged() > observed ");
    stringBuilder.append(arrayList1);
    stringBuilder.append(" groups");
    x7.c.a.b(a1, str, stringBuilder.toString(), false, 4, null);
    if (paramList == null)
      return; 
    ArrayList<Group> arrayList1 = new ArrayList(o.s(paramList, 10));
    Iterator<GroupJoinDevices> iterator = paramList.iterator();
    while (iterator.hasNext())
      arrayList1.add(((GroupJoinDevices)iterator.next()).getGroup()); 
    List list = n0.b(arrayList1, new d());
    o0(list.size());
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator1 = list.iterator();
    while (true) {
      boolean bool = iterator1.hasNext();
      boolean bool2 = true;
      if (bool) {
        str = iterator1.next();
        Group group = (Group)str;
        a a3 = this.k;
        if (a3 != null) {
          List list1 = a3.R();
          if (list1 != null) {
            boolean bool4;
            if (list1.isEmpty())
              continue; 
            Iterator<Group> iterator3 = list1.iterator();
            while (true) {
              if (iterator3.hasNext()) {
                boolean bool5;
                Group group1 = iterator3.next();
                if (group.getId() == group1.getId()) {
                  bool5 = true;
                } else {
                  bool5 = false;
                } 
                if (bool5) {
                  bool5 = false;
                  break;
                } 
                continue;
              } 
              bool4 = true;
              break;
            } 
            if (bool4 == true) {
              bool4 = bool2;
              continue;
            } 
          } 
        } 
        boolean bool3 = false;
        continue;
      } 
      Iterator<String> iterator2 = arrayList.iterator();
      boolean bool1;
      for (bool1 = false; iterator2.hasNext(); bool1 = true) {
        Group group = (Group)iterator2.next();
        a a3 = this.k;
        if (a3 != null)
          a3.M(Integer.valueOf(0), group); 
      } 
      if (bool1) {
        i i = i.i.b();
        r8.m.g(i);
        if (!i.isHidden()) {
          RecyclerView recyclerView = (RecyclerView)O(r4.h.H4);
          if (recyclerView != null)
            recyclerView.postDelayed(new e(this), 800L); 
        } 
      } 
      a a2 = this.k;
      if (a2 != null) {
        List list1 = a2.R();
        if (list1 != null) {
          ArrayList<String> arrayList2 = new ArrayList();
          for (String str : list1) {
            Group group = (Group)str;
            if (list.isEmpty())
              continue; 
            Iterator<Group> iterator4 = list.iterator();
            while (true) {
              if (iterator4.hasNext()) {
                Group group1 = iterator4.next();
                if (group.getId() == group1.getId()) {
                  bool1 = true;
                } else {
                  bool1 = false;
                } 
                if (bool1) {
                  bool1 = false;
                  break;
                } 
                continue;
              } 
              bool1 = true;
              break;
            } 
            if (bool1)
              arrayList2.add(str); 
          } 
          Iterator<String> iterator3 = arrayList2.iterator();
          while (true) {
            while (true)
              break; 
            if (list1 != null)
              list1.Z(bool1); 
          } 
        } 
      } 
      a2 = this.k;
      if (a2 != null) {
        List list1 = a2.R();
      } else {
        a2 = null;
      } 
      for (Group group : n0.a(list, (List)a2, f.g)) {
        a2 = this.k;
        if (a2 != null) {
          List list1 = a2.R();
          if (list1 != null) {
            Iterator iterator3 = list1.iterator();
            while (true) {
              while (true)
                break; 
              if (!bool2) {
                a a3 = this.k;
                if (a3 != null) {
                  List<Group> list2 = a3.R();
                  if (list2 != null)
                    Group group1 = list2.set(bool1, group); 
                } 
                a3 = this.k;
                if (a3 != null)
                  a3.p(bool1, a.a.UPDATE); 
              } 
            } 
            continue;
          } 
        } 
        a2 = null;
        continue;
      } 
      a0();
      return;
      if (SYNTHETIC_LOCAL_VARIABLE_2 != null)
        arrayList.add(str); 
    } 
  }
  
  public void h0(int paramInt, Group paramGroup, View paramView) {
    r8.m.j(paramGroup, "item");
    if (paramInt < 0)
      return; 
    try {
      a a1 = this.k;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (a1 != null) {
        bool1 = bool2;
        if (a1.T() == true)
          bool1 = true; 
      } 
      return;
    } finally {
      paramGroup = null;
      paramGroup.printStackTrace();
    } 
  }
  
  public final void i0(boolean paramBoolean) {
    if (!paramBoolean) {
      byte b1;
      AppCompatImageButton appCompatImageButton;
      MainAct mainAct1 = Z();
      MainAct mainAct2 = null;
      if (mainAct1 != null) {
        PullRefreshLayout pullRefreshLayout = mainAct1.V();
      } else {
        mainAct1 = null;
      } 
      boolean bool2 = true;
      byte b2 = 0;
      if (mainAct1 != null) {
        y5.f f1 = y5.f.m.b();
        if (f1 != null && f1.isAdded() == true) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        } 
        mainAct1.setEnabled(paramBoolean);
      } 
      MainAct mainAct3 = Z();
      mainAct1 = mainAct2;
      if (mainAct3 != null)
        appCompatImageButton = mainAct3.S(); 
      if (appCompatImageButton == null)
        return; 
      y5.g g = y5.g.l.b();
      if (g != null && g.isAdded() == true) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      boolean bool1 = bool2;
      if (!b1) {
        y5.f f1 = y5.f.m.b();
        if (f1 != null && f1.isAdded() == true) {
          b1 = 1;
        } else {
          b1 = 0;
        } 
        if (b1) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
      } 
      if (bool1) {
        b1 = b2;
      } else {
        b1 = 8;
      } 
      appCompatImageButton.setVisibility(b1);
    } 
  }
  
  public boolean j0(int paramInt, Group paramGroup, View paramView) {
    r8.m.j(paramGroup, "item");
    if (paramInt < 0)
      return true; 
    a a1 = this.k;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (a1 != null) {
      bool1 = bool2;
      if (a1.T() == true)
        bool1 = true; 
    } 
    if (bool1)
      return true; 
    W(paramInt);
    return true;
  }
  
  public final void o0(int paramInt) {
    this.l = paramInt;
    Context context = getContext();
    if (context != null) {
      SharedPreferences sharedPreferences = h1.f(context, "Main", 0, 2, null);
      if (sharedPreferences != null) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (editor != null) {
          editor = editor.putInt("group_counts", paramInt);
          if (editor != null)
            editor.apply(); 
        } 
      } 
    } 
  }
  
  public void onAttach(Context paramContext) {
    r8.m.j(paramContext, "context");
    super.onAttach(paramContext);
    o = this;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    r8.m.j(paramLayoutInflater, "inflater");
    return paramLayoutInflater.inflate(2131558520, paramViewGroup, false);
  }
  
  public void onPause() {
    super.onPause();
    b9.f.d((e0)f0.k((Fragment)this), null, null, new g(this, null), 3, null);
  }
  
  public void onResume() {
    super.onResume();
    b9.f.d((e0)f0.k((Fragment)this), null, null, new i(this, null), 3, null);
  }
  
  public void onStop() {
    V();
    super.onStop();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    r8.m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    b0(paramBundle);
    int i = r4.h.Q0;
    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)O(i);
    r8.m.i(extendedFloatingActionButton, "fabAddGroup");
    e1.b((View)extendedFloatingActionButton, new l(this));
    ((ExtendedFloatingActionButton)O(i)).setOnLongClickListener(new c(this));
  }
  
  public void s() {
    try {
      String str;
      if (!isAdded())
        return; 
      com.smartpek.utils.sweetalert.i i = new com.smartpek.utils.sweetalert.i(getContext(), true, 3);
      Context context1 = getContext();
      Context context2 = null;
      if (context1 != null) {
        str = c1.g(context1, 2131951823);
      } else {
        context1 = null;
      } 
      i.G((String)context1);
      context1 = getContext();
      if (context1 != null) {
        str = c1.g(context1, 2131952325);
      } else {
        context1 = null;
      } 
      i.y((String)context1);
      context1 = getContext();
      if (context1 != null) {
        str = c1.g(context1, 2131952105);
      } else {
        context1 = null;
      } 
      i.C((String)context1, new f(i));
      Context context3 = getContext();
      context1 = context2;
      if (context3 != null)
        str = c1.g(context3, 2131952340); 
      i.u(str, new g(this));
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static final class a {
    private a() {}
    
    public final h a() {
      if (b() == null)
        c(new h()); 
      h h = b();
      r8.m.g(h);
      return h;
    }
    
    public final h b() {
      return h.P();
    }
    
    public final void c(h param1h) {
      h.S(param1h);
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$checkAndDismissIfInSelectMode$1", f = "GroupsFrg.kt", l = {253}, m = "invokeSuspend")
  static final class b extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    b(h param1h, j8.d<? super b> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new b(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((b)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      // Byte code:
      //   0: invokestatic d : ()Ljava/lang/Object;
      //   3: astore #4
      //   5: aload_0
      //   6: getfield g : I
      //   9: istore_2
      //   10: iload_2
      //   11: ifeq -> 36
      //   14: iload_2
      //   15: iconst_1
      //   16: if_icmpne -> 26
      //   19: aload_1
      //   20: invokestatic b : (Ljava/lang/Object;)V
      //   23: goto -> 136
      //   26: new java/lang/IllegalStateException
      //   29: dup
      //   30: ldc 'call to 'resume' before 'invoke' with coroutine'
      //   32: invokespecial <init> : (Ljava/lang/String;)V
      //   35: athrow
      //   36: aload_1
      //   37: invokestatic b : (Ljava/lang/Object;)V
      //   40: aload_0
      //   41: getfield h : La6/h;
      //   44: astore_1
      //   45: aload_1
      //   46: getstatic r4/h.H4 : I
      //   49: invokevirtual O : (I)Landroid/view/View;
      //   52: checkcast androidx/recyclerview/widget/RecyclerView
      //   55: astore #5
      //   57: aload #5
      //   59: ifnull -> 71
      //   62: aload #5
      //   64: invokevirtual computeVerticalScrollOffset : ()I
      //   67: istore_2
      //   68: goto -> 73
      //   71: iconst_0
      //   72: istore_2
      //   73: iload_2
      //   74: bipush #20
      //   76: if_icmpge -> 113
      //   79: aload_0
      //   80: getfield h : La6/h;
      //   83: invokevirtual X : ()La6/a;
      //   86: astore #5
      //   88: aload #5
      //   90: ifnull -> 102
      //   93: aload #5
      //   95: invokevirtual T : ()Z
      //   98: istore_3
      //   99: goto -> 104
      //   102: iconst_0
      //   103: istore_3
      //   104: iload_3
      //   105: ifne -> 113
      //   108: iconst_1
      //   109: istore_3
      //   110: goto -> 115
      //   113: iconst_0
      //   114: istore_3
      //   115: aload_0
      //   116: iconst_1
      //   117: putfield g : I
      //   120: aload_1
      //   121: iconst_0
      //   122: iconst_1
      //   123: iload_3
      //   124: aload_0
      //   125: invokestatic T : (La6/h;ZZZLj8/d;)Ljava/lang/Object;
      //   128: aload #4
      //   130: if_acmpne -> 136
      //   133: aload #4
      //   135: areturn
      //   136: getstatic e8/q.a : Le8/q;
      //   139: areturn
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$doOnLongClick$1", f = "GroupsFrg.kt", l = {289, 296}, m = "invokeSuspend")
  static final class c extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    c(h param1h, int param1Int, j8.d<? super c> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new c(this.h, this.i, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((c)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      // Byte code:
      //   0: invokestatic d : ()Ljava/lang/Object;
      //   3: astore #4
      //   5: aload_0
      //   6: getfield g : I
      //   9: istore_2
      //   10: iload_2
      //   11: ifeq -> 48
      //   14: iload_2
      //   15: iconst_1
      //   16: if_icmpeq -> 37
      //   19: iload_2
      //   20: iconst_2
      //   21: if_icmpne -> 27
      //   24: goto -> 37
      //   27: new java/lang/IllegalStateException
      //   30: dup
      //   31: ldc 'call to 'resume' before 'invoke' with coroutine'
      //   33: invokespecial <init> : (Ljava/lang/String;)V
      //   36: athrow
      //   37: aload_1
      //   38: invokestatic b : (Ljava/lang/Object;)V
      //   41: goto -> 383
      //   44: astore_1
      //   45: goto -> 379
      //   48: aload_1
      //   49: invokestatic b : (Ljava/lang/Object;)V
      //   52: aload_0
      //   53: getfield h : La6/h;
      //   56: invokevirtual X : ()La6/a;
      //   59: astore_1
      //   60: aload_1
      //   61: ifnull -> 102
      //   64: aload_1
      //   65: invokevirtual R : ()Ljava/util/List;
      //   68: astore_1
      //   69: aload_1
      //   70: ifnull -> 102
      //   73: aload_1
      //   74: aload_0
      //   75: getfield i : I
      //   78: invokeinterface get : (I)Ljava/lang/Object;
      //   83: checkcast com/smartpek/data/local/db/models/Group
      //   86: astore_1
      //   87: aload_1
      //   88: ifnull -> 102
      //   91: aload_1
      //   92: aload_1
      //   93: invokevirtual isSelected : ()Z
      //   96: invokestatic a : (Z)Z
      //   99: invokevirtual setSelected : (Z)V
      //   102: aload_0
      //   103: getfield h : La6/h;
      //   106: invokevirtual X : ()La6/a;
      //   109: astore_1
      //   110: aload_1
      //   111: ifnull -> 125
      //   114: aload_1
      //   115: aload_0
      //   116: getfield i : I
      //   119: getstatic a6/a$a.SELECT_STATE_CHANGED : La6/a$a;
      //   122: invokevirtual p : (ILjava/lang/Object;)V
      //   125: aload_0
      //   126: getfield h : La6/h;
      //   129: invokevirtual X : ()La6/a;
      //   132: astore_1
      //   133: aload_1
      //   134: ifnull -> 387
      //   137: aload_1
      //   138: invokevirtual T : ()Z
      //   141: iconst_1
      //   142: if_icmpne -> 387
      //   145: iconst_1
      //   146: istore_2
      //   147: goto -> 150
      //   150: iload_2
      //   151: ifeq -> 224
      //   154: aload_0
      //   155: getfield h : La6/h;
      //   158: invokevirtual X : ()La6/a;
      //   161: astore_1
      //   162: aload_1
      //   163: ifnull -> 198
      //   166: aload_0
      //   167: getfield h : La6/h;
      //   170: invokevirtual X : ()La6/a;
      //   173: astore #5
      //   175: aload #5
      //   177: ifnull -> 392
      //   180: aload #5
      //   182: invokevirtual j : ()I
      //   185: istore_2
      //   186: goto -> 189
      //   189: aload_1
      //   190: iconst_0
      //   191: iload_2
      //   192: getstatic a6/a$a.SORT_MODE_ACTIVE : La6/a$a;
      //   195: invokevirtual t : (IILjava/lang/Object;)V
      //   198: aload_0
      //   199: getfield h : La6/h;
      //   202: astore_1
      //   203: aload_0
      //   204: iconst_1
      //   205: putfield g : I
      //   208: aload_1
      //   209: iconst_1
      //   210: iconst_1
      //   211: iconst_0
      //   212: aload_0
      //   213: invokestatic T : (La6/h;ZZZLj8/d;)Ljava/lang/Object;
      //   216: aload #4
      //   218: if_acmpne -> 383
      //   221: aload #4
      //   223: areturn
      //   224: aload_0
      //   225: getfield h : La6/h;
      //   228: invokevirtual X : ()La6/a;
      //   231: astore_1
      //   232: aload_1
      //   233: ifnull -> 397
      //   236: aload_1
      //   237: invokevirtual T : ()Z
      //   240: ifne -> 397
      //   243: iconst_1
      //   244: istore_2
      //   245: goto -> 248
      //   248: iload_2
      //   249: ifeq -> 383
      //   252: aload_0
      //   253: getfield h : La6/h;
      //   256: invokevirtual X : ()La6/a;
      //   259: astore_1
      //   260: aload_1
      //   261: ifnull -> 296
      //   264: aload_0
      //   265: getfield h : La6/h;
      //   268: invokevirtual X : ()La6/a;
      //   271: astore #5
      //   273: aload #5
      //   275: ifnull -> 402
      //   278: aload #5
      //   280: invokevirtual j : ()I
      //   283: istore_2
      //   284: goto -> 287
      //   287: aload_1
      //   288: iconst_0
      //   289: iload_2
      //   290: getstatic a6/a$a.SORT_MODE_LOCKED : La6/a$a;
      //   293: invokevirtual t : (IILjava/lang/Object;)V
      //   296: aload_0
      //   297: getfield h : La6/h;
      //   300: astore_1
      //   301: aload_1
      //   302: getstatic r4/h.H4 : I
      //   305: invokevirtual O : (I)Landroid/view/View;
      //   308: checkcast androidx/recyclerview/widget/RecyclerView
      //   311: astore #5
      //   313: aload #5
      //   315: ifnull -> 407
      //   318: aload #5
      //   320: invokevirtual computeVerticalScrollOffset : ()I
      //   323: istore_2
      //   324: goto -> 327
      //   327: iload_2
      //   328: bipush #20
      //   330: if_icmpge -> 423
      //   333: aload_0
      //   334: getfield h : La6/h;
      //   337: invokevirtual X : ()La6/a;
      //   340: astore #5
      //   342: aload #5
      //   344: ifnull -> 412
      //   347: aload #5
      //   349: invokevirtual T : ()Z
      //   352: istore_3
      //   353: goto -> 414
      //   356: aload_0
      //   357: iconst_2
      //   358: putfield g : I
      //   361: aload_1
      //   362: iconst_0
      //   363: iconst_1
      //   364: iload_3
      //   365: aload_0
      //   366: invokestatic T : (La6/h;ZZZLj8/d;)Ljava/lang/Object;
      //   369: astore_1
      //   370: aload_1
      //   371: aload #4
      //   373: if_acmpne -> 383
      //   376: aload #4
      //   378: areturn
      //   379: aload_1
      //   380: invokevirtual printStackTrace : ()V
      //   383: getstatic e8/q.a : Le8/q;
      //   386: areturn
      //   387: iconst_0
      //   388: istore_2
      //   389: goto -> 150
      //   392: iconst_0
      //   393: istore_2
      //   394: goto -> 189
      //   397: iconst_0
      //   398: istore_2
      //   399: goto -> 248
      //   402: iconst_0
      //   403: istore_2
      //   404: goto -> 287
      //   407: iconst_0
      //   408: istore_2
      //   409: goto -> 327
      //   412: iconst_0
      //   413: istore_3
      //   414: iload_3
      //   415: ifne -> 423
      //   418: iconst_1
      //   419: istore_3
      //   420: goto -> 356
      //   423: iconst_0
      //   424: istore_3
      //   425: goto -> 356
      // Exception table:
      //   from	to	target	type
      //   37	41	44	finally
      //   52	60	44	finally
      //   64	69	44	finally
      //   73	87	44	finally
      //   91	102	44	finally
      //   102	110	44	finally
      //   114	125	44	finally
      //   125	133	44	finally
      //   137	145	44	finally
      //   154	162	44	finally
      //   166	175	44	finally
      //   180	186	44	finally
      //   189	198	44	finally
      //   198	221	44	finally
      //   224	232	44	finally
      //   236	243	44	finally
      //   252	260	44	finally
      //   264	273	44	finally
      //   278	284	44	finally
      //   287	296	44	finally
      //   296	313	44	finally
      //   318	324	44	finally
      //   333	342	44	finally
      //   347	353	44	finally
      //   356	370	44	finally
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$init$1", f = "GroupsFrg.kt", l = {348}, m = "invokeSuspend")
  static final class d extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    d(h param1h, j8.d<? super d> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new d(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((d)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      // Byte code:
      //   0: invokestatic d : ()Ljava/lang/Object;
      //   3: astore #5
      //   5: aload_0
      //   6: getfield g : I
      //   9: istore_2
      //   10: iload_2
      //   11: ifeq -> 36
      //   14: iload_2
      //   15: iconst_1
      //   16: if_icmpne -> 26
      //   19: aload_1
      //   20: invokestatic b : (Ljava/lang/Object;)V
      //   23: goto -> 267
      //   26: new java/lang/IllegalStateException
      //   29: dup
      //   30: ldc 'call to 'resume' before 'invoke' with coroutine'
      //   32: invokespecial <init> : (Ljava/lang/String;)V
      //   35: athrow
      //   36: aload_1
      //   37: invokestatic b : (Ljava/lang/Object;)V
      //   40: aload_0
      //   41: getfield h : La6/h;
      //   44: astore_1
      //   45: new v0/n
      //   48: dup
      //   49: invokespecial <init> : ()V
      //   52: astore #6
      //   54: aload #6
      //   56: ldc2_w 100
      //   59: invokevirtual k0 : (J)Lv0/i0;
      //   62: pop
      //   63: aload_1
      //   64: aload #6
      //   66: invokevirtual setEnterTransition : (Ljava/lang/Object;)V
      //   69: aload_0
      //   70: getfield h : La6/h;
      //   73: getstatic r4/h.X4 : I
      //   76: invokevirtual O : (I)Landroid/view/View;
      //   79: checkcast android/widget/RelativeLayout
      //   82: bipush #8
      //   84: invokevirtual setVisibility : (I)V
      //   87: aload_0
      //   88: getfield h : La6/h;
      //   91: invokestatic R : (La6/h;)V
      //   94: aload_0
      //   95: getfield h : La6/h;
      //   98: astore_1
      //   99: getstatic r4/h.H4 : I
      //   102: istore_3
      //   103: aload_1
      //   104: iload_3
      //   105: invokevirtual O : (I)Landroid/view/View;
      //   108: checkcast androidx/recyclerview/widget/RecyclerView
      //   111: new a6/h$d$a
      //   114: dup
      //   115: aload_0
      //   116: getfield h : La6/h;
      //   119: invokespecial <init> : (La6/h;)V
      //   122: invokevirtual l : (Landroidx/recyclerview/widget/RecyclerView$u;)V
      //   125: aload_0
      //   126: getfield h : La6/h;
      //   129: iload_3
      //   130: invokevirtual O : (I)Landroid/view/View;
      //   133: checkcast androidx/recyclerview/widget/RecyclerView
      //   136: invokevirtual computeVerticalScrollOffset : ()I
      //   139: ifne -> 158
      //   142: aload_0
      //   143: getfield h : La6/h;
      //   146: iload_3
      //   147: invokevirtual O : (I)Landroid/view/View;
      //   150: checkcast androidx/recyclerview/widget/RecyclerView
      //   153: iconst_0
      //   154: iconst_1
      //   155: invokevirtual scrollTo : (II)V
      //   158: aload_0
      //   159: getfield h : La6/h;
      //   162: astore_1
      //   163: getstatic a6/i.i : La6/i$a;
      //   166: invokevirtual b : ()La6/i;
      //   169: astore #6
      //   171: aload #6
      //   173: ifnull -> 189
      //   176: aload #6
      //   178: invokevirtual isHidden : ()Z
      //   181: ifne -> 189
      //   184: iconst_1
      //   185: istore_2
      //   186: goto -> 191
      //   189: iconst_0
      //   190: istore_2
      //   191: iload_2
      //   192: ifeq -> 242
      //   195: aload_0
      //   196: getfield h : La6/h;
      //   199: iload_3
      //   200: invokevirtual O : (I)Landroid/view/View;
      //   203: checkcast androidx/recyclerview/widget/RecyclerView
      //   206: invokevirtual computeVerticalScrollOffset : ()I
      //   209: bipush #20
      //   211: if_icmpge -> 242
      //   214: aload_0
      //   215: getfield h : La6/h;
      //   218: invokevirtual X : ()La6/a;
      //   221: astore #6
      //   223: aload #6
      //   225: invokestatic g : (Ljava/lang/Object;)V
      //   228: aload #6
      //   230: invokevirtual T : ()Z
      //   233: ifne -> 242
      //   236: iconst_1
      //   237: istore #4
      //   239: goto -> 245
      //   242: iconst_0
      //   243: istore #4
      //   245: aload_0
      //   246: iconst_1
      //   247: putfield g : I
      //   250: aload_1
      //   251: iconst_0
      //   252: iconst_0
      //   253: iload #4
      //   255: aload_0
      //   256: invokestatic T : (La6/h;ZZZLj8/d;)Ljava/lang/Object;
      //   259: aload #5
      //   261: if_acmpne -> 267
      //   264: aload #5
      //   266: areturn
      //   267: getstatic e8/q.a : Le8/q;
      //   270: areturn
    }
    
    public static final class a extends RecyclerView.u {
      a(h param2h) {}
      
      public void b(RecyclerView param2RecyclerView, int param2Int1, int param2Int2) {
        r8.m.j(param2RecyclerView, "recyclerView");
        super.b(param2RecyclerView, param2Int1, param2Int2);
        boolean bool1 = this.a.isRemoving();
        boolean bool2 = this.a.isResumed();
        boolean bool3 = this.a.isVisible();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("init() > setOnScrollChangeListener()  isRemoving:");
        stringBuilder.append(bool1);
        stringBuilder.append("  isResumed:");
        stringBuilder.append(bool2);
        stringBuilder.append("  isVisible:");
        stringBuilder.append(bool3);
        h h1 = this.a;
        param2Int2 = r4.h.H4;
        RecyclerView recyclerView = (RecyclerView)h1.O(param2Int2);
        if (recyclerView != null) {
          param2Int1 = recyclerView.computeVerticalScrollOffset();
        } else {
          param2Int1 = 0;
        } 
        if (this.a.isResumed()) {
          try {
            recyclerView = (RecyclerView)this.a.O(param2Int2);
            String str = null;
            if (recyclerView != null) {
              RecyclerView.p p = recyclerView.getLayoutManager();
            } else {
              recyclerView = null;
            } 
            RtlStaggeredLayoutManager rtlStaggeredLayoutManager = (RtlStaggeredLayoutManager)recyclerView;
            if (rtlStaggeredLayoutManager != null) {
              int[] arrayOfInt = rtlStaggeredLayoutManager.n2(null);
            } else {
              rtlStaggeredLayoutManager = null;
            } 
            if (rtlStaggeredLayoutManager != null)
              str = f8.i.E((int[])rtlStaggeredLayoutManager, null, null, null, 0, null, null, 63, null); 
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("init() > addOnScrollChangedListener()  arr: ");
            stringBuilder1.append(str);
            stringBuilder1.append("  scrollY: ");
            stringBuilder1.append(param2Int1);
          } finally {}
          if (param2Int1 == 0)
            try {
              recyclerView = (RecyclerView)this.a.O(r4.h.H4);
            } finally {
              recyclerView = null;
            }  
        } 
      }
    }
  }
  
  public static final class a extends RecyclerView.u {
    a(h param1h) {}
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      r8.m.j(param1RecyclerView, "recyclerView");
      super.b(param1RecyclerView, param1Int1, param1Int2);
      boolean bool1 = this.a.isRemoving();
      boolean bool2 = this.a.isResumed();
      boolean bool3 = this.a.isVisible();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("init() > setOnScrollChangeListener()  isRemoving:");
      stringBuilder.append(bool1);
      stringBuilder.append("  isResumed:");
      stringBuilder.append(bool2);
      stringBuilder.append("  isVisible:");
      stringBuilder.append(bool3);
      h h1 = this.a;
      param1Int2 = r4.h.H4;
      RecyclerView recyclerView = (RecyclerView)h1.O(param1Int2);
      if (recyclerView != null) {
        param1Int1 = recyclerView.computeVerticalScrollOffset();
      } else {
        param1Int1 = 0;
      } 
      if (this.a.isResumed()) {
        try {
          recyclerView = (RecyclerView)this.a.O(param1Int2);
          String str = null;
          if (recyclerView != null) {
            RecyclerView.p p = recyclerView.getLayoutManager();
          } else {
            recyclerView = null;
          } 
          RtlStaggeredLayoutManager rtlStaggeredLayoutManager = (RtlStaggeredLayoutManager)recyclerView;
          if (rtlStaggeredLayoutManager != null) {
            int[] arrayOfInt = rtlStaggeredLayoutManager.n2(null);
          } else {
            rtlStaggeredLayoutManager = null;
          } 
          if (rtlStaggeredLayoutManager != null)
            str = f8.i.E((int[])rtlStaggeredLayoutManager, null, null, null, 0, null, null, 63, null); 
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("init() > addOnScrollChangedListener()  arr: ");
          stringBuilder1.append(str);
          stringBuilder1.append("  scrollY: ");
          stringBuilder1.append(param1Int1);
        } finally {}
        if (param1Int1 == 0)
          try {
            recyclerView = (RecyclerView)this.a.O(r4.h.H4);
          } finally {
            recyclerView = null;
          }  
      } 
    }
  }
  
  static final class e extends r8.n implements q8.a<Boolean> {
    e(h param1h) {
      super(0);
    }
    
    public final Boolean a() {
      Resources resources = this.g.getResources();
      r8.m.i(resources, "resources");
      return Boolean.valueOf(c1.f(resources));
    }
  }
  
  static final class f extends r8.n implements p<Group, Group, Boolean> {
    public static final f g = new f();
    
    f() {
      super(2);
    }
    
    public final Boolean a(Group param1Group1, Group param1Group2) {
      boolean bool;
      r8.m.j(param1Group1, "n");
      r8.m.j(param1Group2, "o");
      if (param1Group1.getId() == param1Group2.getId()) {
        bool = true;
      } else {
        bool = false;
      } 
      return Boolean.valueOf(bool);
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1", f = "GroupsFrg.kt", l = {120}, m = "invokeSuspend")
  static final class g extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    g(h param1h, j8.d<? super g> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new g(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((g)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        param1Object = a2.g;
        a a = new a(this.h, null);
        this.g = 1;
        if (b9.f.e((j8.g)param1Object, a, (j8.d)this) == object)
          return object; 
      } 
      return q.a;
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1$1", f = "GroupsFrg.kt", l = {121}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
      int g;
      
      a(h param2h, j8.d<? super a> param2d) {
        super(2, param2d);
      }
      
      public final j8.d<q> create(Object param2Object, j8.d<?> param2d) {
        return (j8.d<q>)new a(this.h, (j8.d)param2d);
      }
      
      public final Object invoke(e0 param2e0, j8.d<? super q> param2d) {
        return ((a)create(param2e0, param2d)).invokeSuspend(q.a);
      }
      
      public final Object invokeSuspend(Object param2Object) {
        Object object1 = k8.b.d();
        int i = this.g;
        Object object = null;
        boolean bool = true;
        if (i != 0) {
          if (i == 1) {
            e8.l.b(param2Object);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
        } else {
          e8.l.b(param2Object);
          param2Object = t0.b();
          a a1 = new a(null);
          this.g = 1;
          if (b9.f.e((j8.g)param2Object, a1, (j8.d)this) == object1)
            return object1; 
        } 
        param2Object = i.i.b();
        if (param2Object == null || param2Object.isHidden())
          bool = false; 
        if (bool) {
          object1 = h.Q(this.h);
          param2Object = object;
          if (object1 != null)
            param2Object = object1.S(); 
          if (param2Object != null)
            param2Object.setVisibility(0); 
        } 
        return q.a;
      }
      
      @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1$1$1", f = "GroupsFrg.kt", l = {121}, m = "invokeSuspend")
      static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
        int g;
        
        a(j8.d<? super a> param3d) {
          super(2, param3d);
        }
        
        public final j8.d<q> create(Object param3Object, j8.d<?> param3d) {
          return (j8.d<q>)new a((j8.d)param3d);
        }
        
        public final Object invoke(e0 param3e0, j8.d<? super q> param3d) {
          return ((a)create(param3e0, param3d)).invokeSuspend(q.a);
        }
        
        public final Object invokeSuspend(Object param3Object) {
          Object object = k8.b.d();
          int i = this.g;
          if (i != 0) {
            if (i == 1) {
              e8.l.b(param3Object);
            } else {
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } 
          } else {
            e8.l.b(param3Object);
            this.g = 1;
            if (o0.a(900L, (j8.d)this) == object)
              return object; 
          } 
          return q.a;
        }
      }
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1$1$1", f = "GroupsFrg.kt", l = {121}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
      int g;
      
      a(j8.d<? super a> param2d) {
        super(2, param2d);
      }
      
      public final j8.d<q> create(Object param2Object, j8.d<?> param2d) {
        return (j8.d<q>)new a((j8.d)param2d);
      }
      
      public final Object invoke(e0 param2e0, j8.d<? super q> param2d) {
        return ((a)create(param2e0, param2d)).invokeSuspend(q.a);
      }
      
      public final Object invokeSuspend(Object param2Object) {
        Object object = k8.b.d();
        int i = this.g;
        if (i != 0) {
          if (i == 1) {
            e8.l.b(param2Object);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
        } else {
          e8.l.b(param2Object);
          this.g = 1;
          if (o0.a(900L, (j8.d)this) == object)
            return object; 
        } 
        return q.a;
      }
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1$1", f = "GroupsFrg.kt", l = {121}, m = "invokeSuspend")
  static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    a(h param1h, j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new a(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object1 = k8.b.d();
      int i = this.g;
      Object object = null;
      boolean bool = true;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        param1Object = t0.b();
        a a1 = new a(null);
        this.g = 1;
        if (b9.f.e((j8.g)param1Object, a1, (j8.d)this) == object1)
          return object1; 
      } 
      param1Object = i.i.b();
      if (param1Object == null || param1Object.isHidden())
        bool = false; 
      if (bool) {
        object1 = h.Q(this.h);
        param1Object = object;
        if (object1 != null)
          param1Object = object1.S(); 
        if (param1Object != null)
          param1Object.setVisibility(0); 
      } 
      return q.a;
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1$1$1", f = "GroupsFrg.kt", l = {121}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
      int g;
      
      a(j8.d<? super a> param3d) {
        super(2, param3d);
      }
      
      public final j8.d<q> create(Object param3Object, j8.d<?> param3d) {
        return (j8.d<q>)new a((j8.d)param3d);
      }
      
      public final Object invoke(e0 param3e0, j8.d<? super q> param3d) {
        return ((a)create(param3e0, param3d)).invokeSuspend(q.a);
      }
      
      public final Object invokeSuspend(Object param3Object) {
        Object object = k8.b.d();
        int i = this.g;
        if (i != 0) {
          if (i == 1) {
            e8.l.b(param3Object);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
        } else {
          e8.l.b(param3Object);
          this.g = 1;
          if (o0.a(900L, (j8.d)this) == object)
            return object; 
        } 
        return q.a;
      }
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPause$1$1$1", f = "GroupsFrg.kt", l = {121}, m = "invokeSuspend")
  static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    a(j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new a((j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        this.g = 1;
        if (o0.a(900L, (j8.d)this) == object)
          return object; 
      } 
      return q.a;
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onPowerStateChanged$1", f = "GroupsFrg.kt", l = {226}, m = "invokeSuspend")
  static final class h extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    h(Group param1Group, h param1h, int param1Int, j8.d<? super h> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new h(this.h, this.i, this.j, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((h)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        param1Object = App.g.e();
        r8.m.g(param1Object);
        param1Object = param1Object.I();
        i = this.h.getId();
        this.g = 1;
        Object object1 = param1Object.W(i, (j8.d)this);
        param1Object = object1;
        if (object1 == object)
          return object; 
      } 
      param1Object = param1Object;
      if (param1Object != null) {
        param1Object = param1Object.getDevices();
        if (param1Object != null) {
          h h1 = this.i;
          object = h1.requireActivity();
          r8.m.i(object, "requireActivity()");
          ConstraintLayout constraintLayout = (ConstraintLayout)this.i.O(r4.h.c1);
          r8.m.i(constraintLayout, "frgGroups");
          Group group = this.h;
          h1.I((androidx.fragment.app.e)object, (View)constraintLayout, group, (List)param1Object, group.getPowerState(), new a(this.i, this.j));
          return q.a;
        } 
      } 
      return q.a;
    }
    
    static final class a extends r8.n implements q8.l<List<? extends String>, q> {
      a(h param2h, int param2Int) {
        super(1);
      }
      
      public final void a(List<String> param2List) {
        r8.m.j(param2List, "it");
        c0.q(new a(this.g, this.h));
      }
      
      static final class a extends r8.n implements q8.a<q> {
        a(h param3h, int param3Int) {
          super(0);
        }
        
        public final void invoke() {
          a a1 = this.g.X();
          if (a1 != null)
            a1.p(this.h, a.a.HIDE_SWITCH_PROGRESS); 
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<q> {
      a(h param2h, int param2Int) {
        super(0);
      }
      
      public final void invoke() {
        a a1 = this.g.X();
        if (a1 != null)
          a1.p(this.h, a.a.HIDE_SWITCH_PROGRESS); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<List<? extends String>, q> {
    a(h param1h, int param1Int) {
      super(1);
    }
    
    public final void a(List<String> param1List) {
      r8.m.j(param1List, "it");
      c0.q(new a(this.g, this.h));
    }
    
    static final class a extends r8.n implements q8.a<q> {
      a(h param3h, int param3Int) {
        super(0);
      }
      
      public final void invoke() {
        a a1 = this.g.X();
        if (a1 != null)
          a1.p(this.h, a.a.HIDE_SWITCH_PROGRESS); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<q> {
    a(h param1h, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      a a1 = this.g.X();
      if (a1 != null)
        a1.p(this.h, a.a.HIDE_SWITCH_PROGRESS); 
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onResume$1", f = "GroupsFrg.kt", l = {110}, m = "invokeSuspend")
  static final class i extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    i(h param1h, j8.d<? super i> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new i(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((i)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object1 = k8.b.d();
      int j = this.g;
      Object object = null;
      if (j != 0) {
        if (j == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        param1Object = i.i.b();
        if (param1Object != null && !param1Object.isHidden()) {
          j = 1;
        } else {
          j = 0;
        } 
        if (j != 0) {
          param1Object = h.Q(this.h);
          if (param1Object != null) {
            param1Object = param1Object.S();
          } else {
            param1Object = null;
          } 
          if (param1Object != null)
            param1Object.setVisibility(8); 
          param1Object = t0.b();
          a a = new a(null);
          this.g = 1;
          if (b9.f.e((j8.g)param1Object, a, (j8.d)this) == object1)
            return object1; 
        } else {
          return q.a;
        } 
      } 
      object1 = h.Q(this.h);
      param1Object = object;
      if (object1 != null)
        param1Object = object1.V(); 
      if (param1Object != null)
        param1Object.setEnabled(false); 
      return q.a;
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onResume$1$1", f = "GroupsFrg.kt", l = {110}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
      int g;
      
      a(j8.d<? super a> param2d) {
        super(2, param2d);
      }
      
      public final j8.d<q> create(Object param2Object, j8.d<?> param2d) {
        return (j8.d<q>)new a((j8.d)param2d);
      }
      
      public final Object invoke(e0 param2e0, j8.d<? super q> param2d) {
        return ((a)create(param2e0, param2d)).invokeSuspend(q.a);
      }
      
      public final Object invokeSuspend(Object param2Object) {
        Object object = k8.b.d();
        int i = this.g;
        if (i != 0) {
          if (i == 1) {
            e8.l.b(param2Object);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
        } else {
          e8.l.b(param2Object);
          this.g = 1;
          if (o0.a(200L, (j8.d)this) == object)
            return object; 
        } 
        return q.a;
      }
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onResume$1$1", f = "GroupsFrg.kt", l = {110}, m = "invokeSuspend")
  static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    a(j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new a((j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        this.g = 1;
        if (o0.a(200L, (j8.d)this) == object)
          return object; 
      } 
      return q.a;
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onToolbarDeleteClicked$2$1", f = "GroupsFrg.kt", l = {155}, m = "invokeSuspend")
  static final class j extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    j(ArrayList<Group> param1ArrayList, j8.d<? super j> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new j(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((j)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        param1Object = t0.b();
        a a = new a(null);
        this.g = 1;
        if (b9.f.e((j8.g)param1Object, a, (j8.d)this) == object)
          return object; 
      } 
      param1Object = App.g.e();
      r8.m.g(param1Object);
      q7.j.m((q7.j)param1Object.I(), this.h, null, 2, null);
      return q.a;
    }
    
    @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onToolbarDeleteClicked$2$1$1", f = "GroupsFrg.kt", l = {155}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
      int g;
      
      a(j8.d<? super a> param2d) {
        super(2, param2d);
      }
      
      public final j8.d<q> create(Object param2Object, j8.d<?> param2d) {
        return (j8.d<q>)new a((j8.d)param2d);
      }
      
      public final Object invoke(e0 param2e0, j8.d<? super q> param2d) {
        return ((a)create(param2e0, param2d)).invokeSuspend(q.a);
      }
      
      public final Object invokeSuspend(Object param2Object) {
        Object object = k8.b.d();
        int i = this.g;
        if (i != 0) {
          if (i == 1) {
            e8.l.b(param2Object);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          } 
        } else {
          e8.l.b(param2Object);
          this.g = 1;
          if (o0.a(600L, (j8.d)this) == object)
            return object; 
        } 
        return q.a;
      }
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$onToolbarDeleteClicked$2$1$1", f = "GroupsFrg.kt", l = {155}, m = "invokeSuspend")
  static final class a extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    a(j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new a((j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          e8.l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        e8.l.b(param1Object);
        this.g = 1;
        if (o0.a(600L, (j8.d)this) == object)
          return object; 
      } 
      return q.a;
    }
  }
  
  static final class k extends r8.n implements q8.a<q> {
    k(h param1h) {
      super(0);
    }
    
    public final void invoke() {
      // Byte code:
      //   0: aload_0
      //   1: getfield g : La6/h;
      //   4: invokevirtual X : ()La6/a;
      //   7: astore_3
      //   8: aload_3
      //   9: ifnull -> 73
      //   12: aload_3
      //   13: invokevirtual R : ()Ljava/util/List;
      //   16: astore_3
      //   17: aload_3
      //   18: ifnull -> 73
      //   21: aload_3
      //   22: invokeinterface isEmpty : ()Z
      //   27: ifeq -> 33
      //   30: goto -> 73
      //   33: aload_3
      //   34: invokeinterface iterator : ()Ljava/util/Iterator;
      //   39: astore_3
      //   40: aload_3
      //   41: invokeinterface hasNext : ()Z
      //   46: ifeq -> 73
      //   49: aload_3
      //   50: invokeinterface next : ()Ljava/lang/Object;
      //   55: checkcast com/smartpek/data/local/db/models/Group
      //   58: invokevirtual isSelected : ()Z
      //   61: istore_2
      //   62: iconst_1
      //   63: istore_1
      //   64: iload_2
      //   65: iconst_1
      //   66: ixor
      //   67: ifeq -> 40
      //   70: goto -> 75
      //   73: iconst_0
      //   74: istore_1
      //   75: aload_0
      //   76: getfield g : La6/h;
      //   79: invokevirtual X : ()La6/a;
      //   82: astore_3
      //   83: aload_3
      //   84: ifnull -> 128
      //   87: aload_3
      //   88: invokevirtual R : ()Ljava/util/List;
      //   91: astore_3
      //   92: aload_3
      //   93: ifnull -> 128
      //   96: aload_3
      //   97: invokeinterface iterator : ()Ljava/util/Iterator;
      //   102: astore_3
      //   103: aload_3
      //   104: invokeinterface hasNext : ()Z
      //   109: ifeq -> 128
      //   112: aload_3
      //   113: invokeinterface next : ()Ljava/lang/Object;
      //   118: checkcast com/smartpek/data/local/db/models/Group
      //   121: iload_1
      //   122: invokevirtual setSelected : (Z)V
      //   125: goto -> 103
      //   128: aload_0
      //   129: getfield g : La6/h;
      //   132: invokevirtual X : ()La6/a;
      //   135: astore_3
      //   136: aload_3
      //   137: ifnull -> 167
      //   140: aload_0
      //   141: getfield g : La6/h;
      //   144: invokevirtual X : ()La6/a;
      //   147: astore #4
      //   149: aload #4
      //   151: invokestatic g : (Ljava/lang/Object;)V
      //   154: aload_3
      //   155: iconst_0
      //   156: aload #4
      //   158: invokevirtual j : ()I
      //   161: getstatic a6/a$a.SELECT_STATE_CHANGED : La6/a$a;
      //   164: invokevirtual t : (IILjava/lang/Object;)V
      //   167: return
    }
  }
  
  static final class l extends r8.n implements q8.l<View, q> {
    l(h param1h) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.U();
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg$openGroup$1", f = "GroupsFrg.kt", l = {}, m = "invokeSuspend")
  static final class m extends kotlin.coroutines.jvm.internal.l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    m(h param1h, Group param1Group, j8.d<? super m> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new m(this.h, this.i, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((m)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      k8.b.d();
      if (this.g == 0) {
        e8.l.b(param1Object);
        param1Object = this.h.getParentFragmentManager().n().x(true);
        r8.m.i(param1Object, "parentFragmentManager.be…etReorderingAllowed(true)");
        p6.m.g0(f0.q((v)param1Object, 2131362201, (Fragment)y5.i.j.a(this.i))).j();
        return q.a;
      } 
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.ui.groups.GroupsFrg", f = "GroupsFrg.kt", l = {396}, m = "showActions")
  static final class n extends kotlin.coroutines.jvm.internal.d {
    Object g;
    
    Object h;
    
    Object i;
    
    boolean j;
    
    boolean k;
    
    int n;
    
    n(h param1h, j8.d<? super n> param1d) {
      super(param1d);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      this.l = param1Object;
      this.n |= Integer.MIN_VALUE;
      return h.T(this.m, false, false, false, (j8.d)this);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a6\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */