package b5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c5.b;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.ui.customviews.PowerButton;
import e8.q;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.List;
import java.util.Map;
import p7.c0;
import p7.e1;
import p7.x1;
import q8.l;
import q8.p;
import q8.r;
import r4.h;
import r8.m;
import r8.n;
import y4.k;

@SuppressLint({"ClickableViewAccessibility"})
public abstract class b extends Fragment implements b {
  private a g = a.DEVICES;
  
  private String h = "";
  
  private l i;
  
  private Device j;
  
  private int k;
  
  private long l;
  
  private boolean m = true;
  
  private boolean n = true;
  
  private q8.a<q> o = c.g;
  
  public Map<Integer, View> p;
  
  public boolean A() {
    return this.m;
  }
  
  public boolean D(Context paramContext, a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<q> parama1, q8.a<q> parama2, l<? super String, q> paraml) {
    return b.a.d(this, paramContext, parama, paramDevice, paramBoolean, paramc, parama1, parama2, paraml);
  }
  
  public void E(androidx.fragment.app.e parame, a parama, int paramInt, Device paramDevice, PowerButton paramPowerButton, c5.c paramc, q8.a<q> parama1, q8.a<q> parama2, p<? super String, ? super com.smartpek.data.local.models.b, q> paramp) {
    b.a.i(this, parame, parama, paramInt, paramDevice, paramPowerButton, paramc, parama1, parama2, paramp);
  }
  
  public void G(androidx.fragment.app.e parame, a parama, int paramInt, Integer paramInteger, Device paramDevice, com.smartpek.ui.customviews.c paramc, c5.c paramc1, q8.a<q> parama1, q8.a<q> parama2, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> paramr) {
    b.a.f(this, parame, parama, paramInt, paramInteger, paramDevice, paramc, paramc1, parama1, parama2, paramr);
  }
  
  public void H() {
    this.p.clear();
  }
  
  public View I(int paramInt) {
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
  
  public final void J(Device paramDevice) {
    // Byte code:
    //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnull -> 17
    //   9: aload_1
    //   10: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   13: astore_3
    //   14: goto -> 19
    //   17: aconst_null
    //   18: astore_3
    //   19: new java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #5
    //   28: aload #5
    //   30: ldc 'Controller > delete() '
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #5
    //   38: aload_3
    //   39: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload #4
    //   45: aload #5
    //   47: invokevirtual toString : ()Ljava/lang/String;
    //   50: invokevirtual a : (Ljava/lang/String;)V
    //   53: aload_1
    //   54: invokestatic g : (Ljava/lang/Object;)V
    //   57: aload_1
    //   58: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   61: astore_3
    //   62: aload_3
    //   63: ifnonnull -> 71
    //   66: iconst_m1
    //   67: istore_2
    //   68: goto -> 2255
    //   71: getstatic b5/b$b.a : [I
    //   74: aload_3
    //   75: invokevirtual ordinal : ()I
    //   78: iaload
    //   79: istore_2
    //   80: goto -> 2255
    //   83: getstatic v5/a.r : Lv5/a$a;
    //   86: invokevirtual b : ()Ljava/util/List;
    //   89: astore_3
    //   90: aload_3
    //   91: ifnull -> 2349
    //   94: aload_3
    //   95: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   98: astore_3
    //   99: goto -> 102
    //   102: aload_3
    //   103: invokestatic g : (Ljava/lang/Object;)V
    //   106: aload_3
    //   107: invokeinterface iterator : ()Ljava/util/Iterator;
    //   112: astore #4
    //   114: aload #4
    //   116: invokeinterface hasNext : ()Z
    //   121: ifeq -> 2254
    //   124: aload #4
    //   126: invokeinterface next : ()Ljava/lang/Object;
    //   131: checkcast f8/d0
    //   134: astore_3
    //   135: aload_3
    //   136: invokevirtual a : ()I
    //   139: istore_2
    //   140: aload_3
    //   141: invokevirtual b : ()Ljava/lang/Object;
    //   144: checkcast v5/a
    //   147: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   150: astore_3
    //   151: aload_3
    //   152: ifnull -> 2354
    //   155: aload_3
    //   156: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   159: astore_3
    //   160: goto -> 163
    //   163: aload_3
    //   164: aload_1
    //   165: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   168: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   171: ifeq -> 114
    //   174: getstatic v5/a.r : Lv5/a$a;
    //   177: invokevirtual b : ()Ljava/util/List;
    //   180: astore_1
    //   181: aload_1
    //   182: ifnull -> 2359
    //   185: aload_1
    //   186: iload_2
    //   187: invokeinterface remove : (I)Ljava/lang/Object;
    //   192: checkcast v5/a
    //   195: astore_1
    //   196: return
    //   197: getstatic u5/b.r : Lu5/b$a;
    //   200: invokevirtual b : ()Ljava/util/List;
    //   203: astore_3
    //   204: aload_3
    //   205: ifnull -> 2360
    //   208: aload_3
    //   209: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   212: astore_3
    //   213: goto -> 216
    //   216: aload_3
    //   217: invokestatic g : (Ljava/lang/Object;)V
    //   220: aload_3
    //   221: invokeinterface iterator : ()Ljava/util/Iterator;
    //   226: astore #4
    //   228: aload #4
    //   230: invokeinterface hasNext : ()Z
    //   235: ifeq -> 2254
    //   238: aload #4
    //   240: invokeinterface next : ()Ljava/lang/Object;
    //   245: checkcast f8/d0
    //   248: astore_3
    //   249: aload_3
    //   250: invokevirtual a : ()I
    //   253: istore_2
    //   254: aload_3
    //   255: invokevirtual b : ()Ljava/lang/Object;
    //   258: checkcast u5/b
    //   261: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   264: astore_3
    //   265: aload_3
    //   266: ifnull -> 2365
    //   269: aload_3
    //   270: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   273: astore_3
    //   274: goto -> 277
    //   277: aload_3
    //   278: aload_1
    //   279: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   282: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   285: ifeq -> 228
    //   288: getstatic u5/b.r : Lu5/b$a;
    //   291: invokevirtual b : ()Ljava/util/List;
    //   294: astore_1
    //   295: aload_1
    //   296: ifnull -> 2370
    //   299: aload_1
    //   300: iload_2
    //   301: invokeinterface remove : (I)Ljava/lang/Object;
    //   306: checkcast u5/b
    //   309: astore_1
    //   310: return
    //   311: getstatic j5/f.r : Lj5/f$a;
    //   314: invokevirtual b : ()Ljava/util/List;
    //   317: astore_3
    //   318: aload_3
    //   319: ifnull -> 2371
    //   322: aload_3
    //   323: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   326: astore_3
    //   327: goto -> 330
    //   330: aload_3
    //   331: invokestatic g : (Ljava/lang/Object;)V
    //   334: aload_3
    //   335: invokeinterface iterator : ()Ljava/util/Iterator;
    //   340: astore #4
    //   342: aload #4
    //   344: invokeinterface hasNext : ()Z
    //   349: ifeq -> 2254
    //   352: aload #4
    //   354: invokeinterface next : ()Ljava/lang/Object;
    //   359: checkcast f8/d0
    //   362: astore_3
    //   363: aload_3
    //   364: invokevirtual a : ()I
    //   367: istore_2
    //   368: aload_3
    //   369: invokevirtual b : ()Ljava/lang/Object;
    //   372: checkcast j5/f
    //   375: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   378: astore_3
    //   379: aload_3
    //   380: ifnull -> 2376
    //   383: aload_3
    //   384: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   387: astore_3
    //   388: goto -> 391
    //   391: aload_3
    //   392: aload_1
    //   393: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   396: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   399: ifeq -> 342
    //   402: getstatic j5/f.r : Lj5/f$a;
    //   405: invokevirtual b : ()Ljava/util/List;
    //   408: astore_1
    //   409: aload_1
    //   410: ifnull -> 2381
    //   413: aload_1
    //   414: iload_2
    //   415: invokeinterface remove : (I)Ljava/lang/Object;
    //   420: checkcast j5/f
    //   423: astore_1
    //   424: return
    //   425: getstatic g5/f.s : Lg5/f$a;
    //   428: invokevirtual b : ()Ljava/util/List;
    //   431: astore_3
    //   432: aload_3
    //   433: ifnull -> 2382
    //   436: aload_3
    //   437: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   440: astore_3
    //   441: goto -> 444
    //   444: aload_3
    //   445: invokestatic g : (Ljava/lang/Object;)V
    //   448: aload_3
    //   449: invokeinterface iterator : ()Ljava/util/Iterator;
    //   454: astore #4
    //   456: aload #4
    //   458: invokeinterface hasNext : ()Z
    //   463: ifeq -> 2254
    //   466: aload #4
    //   468: invokeinterface next : ()Ljava/lang/Object;
    //   473: checkcast f8/d0
    //   476: astore_3
    //   477: aload_3
    //   478: invokevirtual a : ()I
    //   481: istore_2
    //   482: aload_3
    //   483: invokevirtual b : ()Ljava/lang/Object;
    //   486: checkcast g5/f
    //   489: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   492: astore_3
    //   493: aload_3
    //   494: ifnull -> 2387
    //   497: aload_3
    //   498: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   501: astore_3
    //   502: goto -> 505
    //   505: aload_3
    //   506: aload_1
    //   507: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   510: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   513: ifeq -> 456
    //   516: getstatic g5/f.s : Lg5/f$a;
    //   519: invokevirtual b : ()Ljava/util/List;
    //   522: astore_1
    //   523: aload_1
    //   524: ifnull -> 2392
    //   527: aload_1
    //   528: iload_2
    //   529: invokeinterface remove : (I)Ljava/lang/Object;
    //   534: checkcast g5/f
    //   537: astore_1
    //   538: return
    //   539: getstatic f5/e.r : Lf5/e$a;
    //   542: invokevirtual b : ()Ljava/util/List;
    //   545: astore_3
    //   546: aload_3
    //   547: ifnull -> 2393
    //   550: aload_3
    //   551: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   554: astore_3
    //   555: goto -> 558
    //   558: aload_3
    //   559: invokestatic g : (Ljava/lang/Object;)V
    //   562: aload_3
    //   563: invokeinterface iterator : ()Ljava/util/Iterator;
    //   568: astore #4
    //   570: aload #4
    //   572: invokeinterface hasNext : ()Z
    //   577: ifeq -> 2254
    //   580: aload #4
    //   582: invokeinterface next : ()Ljava/lang/Object;
    //   587: checkcast f8/d0
    //   590: astore_3
    //   591: aload_3
    //   592: invokevirtual a : ()I
    //   595: istore_2
    //   596: aload_3
    //   597: invokevirtual b : ()Ljava/lang/Object;
    //   600: checkcast f5/e
    //   603: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   606: astore_3
    //   607: aload_3
    //   608: ifnull -> 2398
    //   611: aload_3
    //   612: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   615: astore_3
    //   616: goto -> 619
    //   619: aload_3
    //   620: aload_1
    //   621: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   624: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   627: ifeq -> 570
    //   630: getstatic f5/e.r : Lf5/e$a;
    //   633: invokevirtual b : ()Ljava/util/List;
    //   636: astore_1
    //   637: aload_1
    //   638: ifnull -> 2403
    //   641: aload_1
    //   642: iload_2
    //   643: invokeinterface remove : (I)Ljava/lang/Object;
    //   648: checkcast f5/e
    //   651: astore_1
    //   652: return
    //   653: getstatic d5/d.r : Ld5/d$a;
    //   656: invokevirtual b : ()Ljava/util/List;
    //   659: astore_3
    //   660: aload_3
    //   661: ifnull -> 2404
    //   664: aload_3
    //   665: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   668: astore_3
    //   669: goto -> 672
    //   672: aload_3
    //   673: invokestatic g : (Ljava/lang/Object;)V
    //   676: aload_3
    //   677: invokeinterface iterator : ()Ljava/util/Iterator;
    //   682: astore #4
    //   684: aload #4
    //   686: invokeinterface hasNext : ()Z
    //   691: ifeq -> 2254
    //   694: aload #4
    //   696: invokeinterface next : ()Ljava/lang/Object;
    //   701: checkcast f8/d0
    //   704: astore_3
    //   705: aload_3
    //   706: invokevirtual a : ()I
    //   709: istore_2
    //   710: aload_3
    //   711: invokevirtual b : ()Ljava/lang/Object;
    //   714: checkcast d5/d
    //   717: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   720: astore_3
    //   721: aload_3
    //   722: ifnull -> 2409
    //   725: aload_3
    //   726: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   729: astore_3
    //   730: goto -> 733
    //   733: aload_3
    //   734: aload_1
    //   735: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   738: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   741: ifeq -> 684
    //   744: getstatic d5/d.r : Ld5/d$a;
    //   747: invokevirtual b : ()Ljava/util/List;
    //   750: astore_1
    //   751: aload_1
    //   752: ifnull -> 2414
    //   755: aload_1
    //   756: iload_2
    //   757: invokeinterface remove : (I)Ljava/lang/Object;
    //   762: checkcast d5/d
    //   765: astore_1
    //   766: return
    //   767: getstatic m5/e.r : Lm5/e$a;
    //   770: invokevirtual b : ()Ljava/util/List;
    //   773: astore_3
    //   774: aload_3
    //   775: ifnull -> 2415
    //   778: aload_3
    //   779: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   782: astore_3
    //   783: goto -> 786
    //   786: aload_3
    //   787: invokestatic g : (Ljava/lang/Object;)V
    //   790: aload_3
    //   791: invokeinterface iterator : ()Ljava/util/Iterator;
    //   796: astore #4
    //   798: aload #4
    //   800: invokeinterface hasNext : ()Z
    //   805: ifeq -> 2254
    //   808: aload #4
    //   810: invokeinterface next : ()Ljava/lang/Object;
    //   815: checkcast f8/d0
    //   818: astore_3
    //   819: aload_3
    //   820: invokevirtual a : ()I
    //   823: istore_2
    //   824: aload_3
    //   825: invokevirtual b : ()Ljava/lang/Object;
    //   828: checkcast m5/e
    //   831: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   834: astore_3
    //   835: aload_3
    //   836: ifnull -> 2420
    //   839: aload_3
    //   840: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   843: astore_3
    //   844: goto -> 847
    //   847: aload_3
    //   848: aload_1
    //   849: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   852: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   855: ifeq -> 798
    //   858: getstatic m5/e.r : Lm5/e$a;
    //   861: invokevirtual b : ()Ljava/util/List;
    //   864: astore_1
    //   865: aload_1
    //   866: ifnull -> 2425
    //   869: aload_1
    //   870: iload_2
    //   871: invokeinterface remove : (I)Ljava/lang/Object;
    //   876: checkcast m5/e
    //   879: astore_1
    //   880: return
    //   881: getstatic m5/e.r : Lm5/e$a;
    //   884: invokevirtual b : ()Ljava/util/List;
    //   887: astore_3
    //   888: aload_3
    //   889: ifnull -> 2426
    //   892: aload_3
    //   893: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   896: astore_3
    //   897: goto -> 900
    //   900: aload_3
    //   901: invokestatic g : (Ljava/lang/Object;)V
    //   904: aload_3
    //   905: invokeinterface iterator : ()Ljava/util/Iterator;
    //   910: astore #4
    //   912: aload #4
    //   914: invokeinterface hasNext : ()Z
    //   919: ifeq -> 2254
    //   922: aload #4
    //   924: invokeinterface next : ()Ljava/lang/Object;
    //   929: checkcast f8/d0
    //   932: astore_3
    //   933: aload_3
    //   934: invokevirtual a : ()I
    //   937: istore_2
    //   938: aload_3
    //   939: invokevirtual b : ()Ljava/lang/Object;
    //   942: checkcast m5/e
    //   945: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   948: astore_3
    //   949: aload_3
    //   950: ifnull -> 2431
    //   953: aload_3
    //   954: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   957: astore_3
    //   958: goto -> 961
    //   961: aload_3
    //   962: aload_1
    //   963: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   966: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   969: ifeq -> 912
    //   972: getstatic m5/e.r : Lm5/e$a;
    //   975: invokevirtual b : ()Ljava/util/List;
    //   978: astore_1
    //   979: aload_1
    //   980: ifnull -> 2436
    //   983: aload_1
    //   984: iload_2
    //   985: invokeinterface remove : (I)Ljava/lang/Object;
    //   990: checkcast m5/e
    //   993: astore_1
    //   994: return
    //   995: getstatic n5/g.r : Ln5/g$a;
    //   998: invokevirtual b : ()Ljava/util/List;
    //   1001: astore_3
    //   1002: aload_3
    //   1003: ifnull -> 2437
    //   1006: aload_3
    //   1007: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1010: astore_3
    //   1011: goto -> 1014
    //   1014: aload_3
    //   1015: invokestatic g : (Ljava/lang/Object;)V
    //   1018: aload_3
    //   1019: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1024: astore #4
    //   1026: aload #4
    //   1028: invokeinterface hasNext : ()Z
    //   1033: ifeq -> 2254
    //   1036: aload #4
    //   1038: invokeinterface next : ()Ljava/lang/Object;
    //   1043: checkcast f8/d0
    //   1046: astore_3
    //   1047: aload_3
    //   1048: invokevirtual a : ()I
    //   1051: istore_2
    //   1052: aload_3
    //   1053: invokevirtual b : ()Ljava/lang/Object;
    //   1056: checkcast n5/g
    //   1059: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1062: astore_3
    //   1063: aload_3
    //   1064: ifnull -> 2442
    //   1067: aload_3
    //   1068: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1071: astore_3
    //   1072: goto -> 1075
    //   1075: aload_3
    //   1076: aload_1
    //   1077: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1080: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1083: ifeq -> 1026
    //   1086: getstatic n5/g.r : Ln5/g$a;
    //   1089: invokevirtual b : ()Ljava/util/List;
    //   1092: astore_1
    //   1093: aload_1
    //   1094: ifnull -> 2447
    //   1097: aload_1
    //   1098: iload_2
    //   1099: invokeinterface remove : (I)Ljava/lang/Object;
    //   1104: checkcast n5/g
    //   1107: astore_1
    //   1108: return
    //   1109: getstatic m5/e.r : Lm5/e$a;
    //   1112: invokevirtual b : ()Ljava/util/List;
    //   1115: astore_3
    //   1116: aload_3
    //   1117: ifnull -> 2448
    //   1120: aload_3
    //   1121: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1124: astore_3
    //   1125: goto -> 1128
    //   1128: aload_3
    //   1129: invokestatic g : (Ljava/lang/Object;)V
    //   1132: aload_3
    //   1133: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1138: astore #4
    //   1140: aload #4
    //   1142: invokeinterface hasNext : ()Z
    //   1147: ifeq -> 2254
    //   1150: aload #4
    //   1152: invokeinterface next : ()Ljava/lang/Object;
    //   1157: checkcast f8/d0
    //   1160: astore_3
    //   1161: aload_3
    //   1162: invokevirtual a : ()I
    //   1165: istore_2
    //   1166: aload_3
    //   1167: invokevirtual b : ()Ljava/lang/Object;
    //   1170: checkcast m5/e
    //   1173: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1176: astore_3
    //   1177: aload_3
    //   1178: ifnull -> 2453
    //   1181: aload_3
    //   1182: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1185: astore_3
    //   1186: goto -> 1189
    //   1189: aload_3
    //   1190: aload_1
    //   1191: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1194: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1197: ifeq -> 1140
    //   1200: getstatic m5/e.r : Lm5/e$a;
    //   1203: invokevirtual b : ()Ljava/util/List;
    //   1206: astore_1
    //   1207: aload_1
    //   1208: ifnull -> 2458
    //   1211: aload_1
    //   1212: iload_2
    //   1213: invokeinterface remove : (I)Ljava/lang/Object;
    //   1218: checkcast m5/e
    //   1221: astore_1
    //   1222: return
    //   1223: getstatic m5/e.r : Lm5/e$a;
    //   1226: invokevirtual b : ()Ljava/util/List;
    //   1229: astore_3
    //   1230: aload_3
    //   1231: ifnull -> 2459
    //   1234: aload_3
    //   1235: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1238: astore_3
    //   1239: goto -> 1242
    //   1242: aload_3
    //   1243: invokestatic g : (Ljava/lang/Object;)V
    //   1246: aload_3
    //   1247: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1252: astore #4
    //   1254: aload #4
    //   1256: invokeinterface hasNext : ()Z
    //   1261: ifeq -> 2254
    //   1264: aload #4
    //   1266: invokeinterface next : ()Ljava/lang/Object;
    //   1271: checkcast f8/d0
    //   1274: astore_3
    //   1275: aload_3
    //   1276: invokevirtual a : ()I
    //   1279: istore_2
    //   1280: aload_3
    //   1281: invokevirtual b : ()Ljava/lang/Object;
    //   1284: checkcast m5/e
    //   1287: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1290: astore_3
    //   1291: aload_3
    //   1292: ifnull -> 2464
    //   1295: aload_3
    //   1296: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1299: astore_3
    //   1300: goto -> 1303
    //   1303: aload_3
    //   1304: aload_1
    //   1305: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1308: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1311: ifeq -> 1254
    //   1314: getstatic m5/e.r : Lm5/e$a;
    //   1317: invokevirtual b : ()Ljava/util/List;
    //   1320: astore_1
    //   1321: aload_1
    //   1322: ifnull -> 2469
    //   1325: aload_1
    //   1326: iload_2
    //   1327: invokeinterface remove : (I)Ljava/lang/Object;
    //   1332: checkcast m5/e
    //   1335: astore_1
    //   1336: return
    //   1337: getstatic p5/d.r : Lp5/d$a;
    //   1340: invokevirtual b : ()Ljava/util/List;
    //   1343: astore_3
    //   1344: aload_3
    //   1345: ifnull -> 2470
    //   1348: aload_3
    //   1349: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1352: astore_3
    //   1353: goto -> 1356
    //   1356: aload_3
    //   1357: invokestatic g : (Ljava/lang/Object;)V
    //   1360: aload_3
    //   1361: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1366: astore #4
    //   1368: aload #4
    //   1370: invokeinterface hasNext : ()Z
    //   1375: ifeq -> 2254
    //   1378: aload #4
    //   1380: invokeinterface next : ()Ljava/lang/Object;
    //   1385: checkcast f8/d0
    //   1388: astore_3
    //   1389: aload_3
    //   1390: invokevirtual a : ()I
    //   1393: istore_2
    //   1394: aload_3
    //   1395: invokevirtual b : ()Ljava/lang/Object;
    //   1398: checkcast p5/d
    //   1401: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1404: astore_3
    //   1405: aload_3
    //   1406: ifnull -> 2475
    //   1409: aload_3
    //   1410: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1413: astore_3
    //   1414: goto -> 1417
    //   1417: aload_3
    //   1418: aload_1
    //   1419: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1422: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1425: ifeq -> 1368
    //   1428: getstatic p5/d.r : Lp5/d$a;
    //   1431: invokevirtual b : ()Ljava/util/List;
    //   1434: astore_1
    //   1435: aload_1
    //   1436: ifnull -> 2480
    //   1439: aload_1
    //   1440: iload_2
    //   1441: invokeinterface remove : (I)Ljava/lang/Object;
    //   1446: checkcast p5/d
    //   1449: astore_1
    //   1450: return
    //   1451: getstatic q5/g.r : Lq5/g$a;
    //   1454: invokevirtual b : ()Ljava/util/List;
    //   1457: astore_3
    //   1458: aload_3
    //   1459: ifnull -> 2481
    //   1462: aload_3
    //   1463: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1466: astore_3
    //   1467: goto -> 1470
    //   1470: aload_3
    //   1471: invokestatic g : (Ljava/lang/Object;)V
    //   1474: aload_3
    //   1475: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1480: astore #4
    //   1482: aload #4
    //   1484: invokeinterface hasNext : ()Z
    //   1489: ifeq -> 2254
    //   1492: aload #4
    //   1494: invokeinterface next : ()Ljava/lang/Object;
    //   1499: checkcast f8/d0
    //   1502: astore_3
    //   1503: aload_3
    //   1504: invokevirtual a : ()I
    //   1507: istore_2
    //   1508: aload_3
    //   1509: invokevirtual b : ()Ljava/lang/Object;
    //   1512: checkcast q5/g
    //   1515: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1518: astore_3
    //   1519: aload_3
    //   1520: ifnull -> 2486
    //   1523: aload_3
    //   1524: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1527: astore_3
    //   1528: goto -> 1531
    //   1531: aload_3
    //   1532: aload_1
    //   1533: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1536: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1539: ifeq -> 1482
    //   1542: getstatic q5/g.r : Lq5/g$a;
    //   1545: invokevirtual b : ()Ljava/util/List;
    //   1548: astore_1
    //   1549: aload_1
    //   1550: ifnull -> 2491
    //   1553: aload_1
    //   1554: iload_2
    //   1555: invokeinterface remove : (I)Ljava/lang/Object;
    //   1560: checkcast q5/g
    //   1563: astore_1
    //   1564: return
    //   1565: getstatic s5/a.s : Ls5/a$a;
    //   1568: invokevirtual b : ()Ljava/util/List;
    //   1571: astore_3
    //   1572: aload_3
    //   1573: ifnull -> 2492
    //   1576: aload_3
    //   1577: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1580: astore_3
    //   1581: goto -> 1584
    //   1584: aload_3
    //   1585: invokestatic g : (Ljava/lang/Object;)V
    //   1588: aload_3
    //   1589: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1594: astore #4
    //   1596: aload #4
    //   1598: invokeinterface hasNext : ()Z
    //   1603: ifeq -> 2254
    //   1606: aload #4
    //   1608: invokeinterface next : ()Ljava/lang/Object;
    //   1613: checkcast f8/d0
    //   1616: astore_3
    //   1617: aload_3
    //   1618: invokevirtual a : ()I
    //   1621: istore_2
    //   1622: aload_3
    //   1623: invokevirtual b : ()Ljava/lang/Object;
    //   1626: checkcast s5/a
    //   1629: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1632: astore_3
    //   1633: aload_3
    //   1634: ifnull -> 2497
    //   1637: aload_3
    //   1638: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1641: astore_3
    //   1642: goto -> 1645
    //   1645: aload_3
    //   1646: aload_1
    //   1647: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1650: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1653: ifeq -> 1596
    //   1656: getstatic s5/a.s : Ls5/a$a;
    //   1659: invokevirtual b : ()Ljava/util/List;
    //   1662: astore_1
    //   1663: aload_1
    //   1664: ifnull -> 2502
    //   1667: aload_1
    //   1668: iload_2
    //   1669: invokeinterface remove : (I)Ljava/lang/Object;
    //   1674: checkcast s5/a
    //   1677: astore_1
    //   1678: return
    //   1679: getstatic t5/s.r : Lt5/s$a;
    //   1682: invokevirtual b : ()Ljava/util/List;
    //   1685: astore_3
    //   1686: aload_3
    //   1687: ifnull -> 2503
    //   1690: aload_3
    //   1691: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1694: astore_3
    //   1695: goto -> 1698
    //   1698: aload_3
    //   1699: invokestatic g : (Ljava/lang/Object;)V
    //   1702: aload_3
    //   1703: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1708: astore #4
    //   1710: aload #4
    //   1712: invokeinterface hasNext : ()Z
    //   1717: ifeq -> 2254
    //   1720: aload #4
    //   1722: invokeinterface next : ()Ljava/lang/Object;
    //   1727: checkcast f8/d0
    //   1730: astore_3
    //   1731: aload_3
    //   1732: invokevirtual a : ()I
    //   1735: istore_2
    //   1736: aload_3
    //   1737: invokevirtual b : ()Ljava/lang/Object;
    //   1740: checkcast t5/s
    //   1743: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1746: astore_3
    //   1747: aload_3
    //   1748: ifnull -> 2508
    //   1751: aload_3
    //   1752: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1755: astore_3
    //   1756: goto -> 1759
    //   1759: aload_3
    //   1760: aload_1
    //   1761: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1764: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1767: ifeq -> 1710
    //   1770: getstatic t5/s.r : Lt5/s$a;
    //   1773: invokevirtual b : ()Ljava/util/List;
    //   1776: astore_1
    //   1777: aload_1
    //   1778: ifnull -> 2513
    //   1781: aload_1
    //   1782: iload_2
    //   1783: invokeinterface remove : (I)Ljava/lang/Object;
    //   1788: checkcast t5/s
    //   1791: astore_1
    //   1792: return
    //   1793: getstatic r5/m.r : Lr5/m$a;
    //   1796: invokevirtual b : ()Ljava/util/List;
    //   1799: astore_3
    //   1800: aload_3
    //   1801: ifnull -> 2514
    //   1804: aload_3
    //   1805: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1808: astore_3
    //   1809: goto -> 1812
    //   1812: aload_3
    //   1813: invokestatic g : (Ljava/lang/Object;)V
    //   1816: aload_3
    //   1817: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1822: astore #4
    //   1824: aload #4
    //   1826: invokeinterface hasNext : ()Z
    //   1831: ifeq -> 2254
    //   1834: aload #4
    //   1836: invokeinterface next : ()Ljava/lang/Object;
    //   1841: checkcast f8/d0
    //   1844: astore_3
    //   1845: aload_3
    //   1846: invokevirtual a : ()I
    //   1849: istore_2
    //   1850: aload_3
    //   1851: invokevirtual b : ()Ljava/lang/Object;
    //   1854: checkcast r5/m
    //   1857: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1860: astore_3
    //   1861: aload_3
    //   1862: ifnull -> 2519
    //   1865: aload_3
    //   1866: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1869: astore_3
    //   1870: goto -> 1873
    //   1873: aload_3
    //   1874: aload_1
    //   1875: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1878: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1881: ifeq -> 1824
    //   1884: getstatic r5/m.r : Lr5/m$a;
    //   1887: invokevirtual b : ()Ljava/util/List;
    //   1890: astore_1
    //   1891: aload_1
    //   1892: ifnull -> 2524
    //   1895: aload_1
    //   1896: iload_2
    //   1897: invokeinterface remove : (I)Ljava/lang/Object;
    //   1902: checkcast r5/m
    //   1905: astore_1
    //   1906: return
    //   1907: getstatic q5/g.r : Lq5/g$a;
    //   1910: invokevirtual b : ()Ljava/util/List;
    //   1913: astore_3
    //   1914: aload_3
    //   1915: ifnull -> 2525
    //   1918: aload_3
    //   1919: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   1922: astore_3
    //   1923: goto -> 1926
    //   1926: aload_3
    //   1927: invokestatic g : (Ljava/lang/Object;)V
    //   1930: aload_3
    //   1931: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1936: astore #4
    //   1938: aload #4
    //   1940: invokeinterface hasNext : ()Z
    //   1945: ifeq -> 2254
    //   1948: aload #4
    //   1950: invokeinterface next : ()Ljava/lang/Object;
    //   1955: checkcast f8/d0
    //   1958: astore_3
    //   1959: aload_3
    //   1960: invokevirtual a : ()I
    //   1963: istore_2
    //   1964: aload_3
    //   1965: invokevirtual b : ()Ljava/lang/Object;
    //   1968: checkcast q5/g
    //   1971: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   1974: astore_3
    //   1975: aload_3
    //   1976: ifnull -> 2530
    //   1979: aload_3
    //   1980: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1983: astore_3
    //   1984: goto -> 1987
    //   1987: aload_3
    //   1988: aload_1
    //   1989: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   1992: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1995: ifeq -> 1938
    //   1998: getstatic q5/g.r : Lq5/g$a;
    //   2001: invokevirtual b : ()Ljava/util/List;
    //   2004: astore_1
    //   2005: aload_1
    //   2006: ifnull -> 2535
    //   2009: aload_1
    //   2010: iload_2
    //   2011: invokeinterface remove : (I)Ljava/lang/Object;
    //   2016: checkcast q5/g
    //   2019: astore_1
    //   2020: return
    //   2021: getstatic p5/d.r : Lp5/d$a;
    //   2024: invokevirtual b : ()Ljava/util/List;
    //   2027: astore_3
    //   2028: aload_3
    //   2029: ifnull -> 2536
    //   2032: aload_3
    //   2033: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   2036: astore_3
    //   2037: goto -> 2040
    //   2040: aload_3
    //   2041: invokestatic g : (Ljava/lang/Object;)V
    //   2044: aload_3
    //   2045: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2050: astore #4
    //   2052: aload #4
    //   2054: invokeinterface hasNext : ()Z
    //   2059: ifeq -> 2254
    //   2062: aload #4
    //   2064: invokeinterface next : ()Ljava/lang/Object;
    //   2069: checkcast f8/d0
    //   2072: astore_3
    //   2073: aload_3
    //   2074: invokevirtual a : ()I
    //   2077: istore_2
    //   2078: aload_3
    //   2079: invokevirtual b : ()Ljava/lang/Object;
    //   2082: checkcast p5/d
    //   2085: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   2088: astore_3
    //   2089: aload_3
    //   2090: ifnull -> 2541
    //   2093: aload_3
    //   2094: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   2097: astore_3
    //   2098: goto -> 2101
    //   2101: aload_3
    //   2102: aload_1
    //   2103: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   2106: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2109: ifeq -> 2052
    //   2112: getstatic p5/d.r : Lp5/d$a;
    //   2115: invokevirtual b : ()Ljava/util/List;
    //   2118: astore_1
    //   2119: aload_1
    //   2120: ifnull -> 2546
    //   2123: aload_1
    //   2124: iload_2
    //   2125: invokeinterface remove : (I)Ljava/lang/Object;
    //   2130: checkcast p5/d
    //   2133: astore_1
    //   2134: return
    //   2135: getstatic i5/d.s : Li5/d$a;
    //   2138: invokevirtual b : ()Ljava/util/List;
    //   2141: astore_3
    //   2142: aload_3
    //   2143: ifnull -> 2547
    //   2146: aload_3
    //   2147: invokestatic l0 : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   2150: astore_3
    //   2151: goto -> 2154
    //   2154: aload_3
    //   2155: invokestatic g : (Ljava/lang/Object;)V
    //   2158: aload_3
    //   2159: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2164: astore #4
    //   2166: aload #4
    //   2168: invokeinterface hasNext : ()Z
    //   2173: ifeq -> 2254
    //   2176: aload #4
    //   2178: invokeinterface next : ()Ljava/lang/Object;
    //   2183: checkcast f8/d0
    //   2186: astore_3
    //   2187: aload_3
    //   2188: invokevirtual a : ()I
    //   2191: istore_2
    //   2192: aload_3
    //   2193: invokevirtual b : ()Ljava/lang/Object;
    //   2196: checkcast i5/d
    //   2199: invokevirtual L : ()Lcom/smartpek/data/local/db/models/Device;
    //   2202: astore_3
    //   2203: aload_3
    //   2204: ifnull -> 2552
    //   2207: aload_3
    //   2208: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   2211: astore_3
    //   2212: goto -> 2215
    //   2215: aload_3
    //   2216: aload_1
    //   2217: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   2220: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2223: ifeq -> 2166
    //   2226: getstatic i5/d.s : Li5/d$a;
    //   2229: invokevirtual b : ()Ljava/util/List;
    //   2232: astore_1
    //   2233: aload_1
    //   2234: ifnull -> 2248
    //   2237: aload_1
    //   2238: iload_2
    //   2239: invokeinterface remove : (I)Ljava/lang/Object;
    //   2244: checkcast i5/d
    //   2247: astore_1
    //   2248: return
    //   2249: astore_1
    //   2250: aload_1
    //   2251: invokevirtual printStackTrace : ()V
    //   2254: return
    //   2255: iload_2
    //   2256: tableswitch default -> 2348, 2 -> 2135, 3 -> 2021, 4 -> 1907, 5 -> 1793, 6 -> 1679, 7 -> 1565, 8 -> 1451, 9 -> 1337, 10 -> 1223, 11 -> 1109, 12 -> 995, 13 -> 881, 14 -> 767, 15 -> 653, 16 -> 539, 17 -> 425, 18 -> 311, 19 -> 197, 20 -> 83
    //   2348: return
    //   2349: aconst_null
    //   2350: astore_3
    //   2351: goto -> 102
    //   2354: aconst_null
    //   2355: astore_3
    //   2356: goto -> 163
    //   2359: return
    //   2360: aconst_null
    //   2361: astore_3
    //   2362: goto -> 216
    //   2365: aconst_null
    //   2366: astore_3
    //   2367: goto -> 277
    //   2370: return
    //   2371: aconst_null
    //   2372: astore_3
    //   2373: goto -> 330
    //   2376: aconst_null
    //   2377: astore_3
    //   2378: goto -> 391
    //   2381: return
    //   2382: aconst_null
    //   2383: astore_3
    //   2384: goto -> 444
    //   2387: aconst_null
    //   2388: astore_3
    //   2389: goto -> 505
    //   2392: return
    //   2393: aconst_null
    //   2394: astore_3
    //   2395: goto -> 558
    //   2398: aconst_null
    //   2399: astore_3
    //   2400: goto -> 619
    //   2403: return
    //   2404: aconst_null
    //   2405: astore_3
    //   2406: goto -> 672
    //   2409: aconst_null
    //   2410: astore_3
    //   2411: goto -> 733
    //   2414: return
    //   2415: aconst_null
    //   2416: astore_3
    //   2417: goto -> 786
    //   2420: aconst_null
    //   2421: astore_3
    //   2422: goto -> 847
    //   2425: return
    //   2426: aconst_null
    //   2427: astore_3
    //   2428: goto -> 900
    //   2431: aconst_null
    //   2432: astore_3
    //   2433: goto -> 961
    //   2436: return
    //   2437: aconst_null
    //   2438: astore_3
    //   2439: goto -> 1014
    //   2442: aconst_null
    //   2443: astore_3
    //   2444: goto -> 1075
    //   2447: return
    //   2448: aconst_null
    //   2449: astore_3
    //   2450: goto -> 1128
    //   2453: aconst_null
    //   2454: astore_3
    //   2455: goto -> 1189
    //   2458: return
    //   2459: aconst_null
    //   2460: astore_3
    //   2461: goto -> 1242
    //   2464: aconst_null
    //   2465: astore_3
    //   2466: goto -> 1303
    //   2469: return
    //   2470: aconst_null
    //   2471: astore_3
    //   2472: goto -> 1356
    //   2475: aconst_null
    //   2476: astore_3
    //   2477: goto -> 1417
    //   2480: return
    //   2481: aconst_null
    //   2482: astore_3
    //   2483: goto -> 1470
    //   2486: aconst_null
    //   2487: astore_3
    //   2488: goto -> 1531
    //   2491: return
    //   2492: aconst_null
    //   2493: astore_3
    //   2494: goto -> 1584
    //   2497: aconst_null
    //   2498: astore_3
    //   2499: goto -> 1645
    //   2502: return
    //   2503: aconst_null
    //   2504: astore_3
    //   2505: goto -> 1698
    //   2508: aconst_null
    //   2509: astore_3
    //   2510: goto -> 1759
    //   2513: return
    //   2514: aconst_null
    //   2515: astore_3
    //   2516: goto -> 1812
    //   2519: aconst_null
    //   2520: astore_3
    //   2521: goto -> 1873
    //   2524: return
    //   2525: aconst_null
    //   2526: astore_3
    //   2527: goto -> 1926
    //   2530: aconst_null
    //   2531: astore_3
    //   2532: goto -> 1987
    //   2535: return
    //   2536: aconst_null
    //   2537: astore_3
    //   2538: goto -> 2040
    //   2541: aconst_null
    //   2542: astore_3
    //   2543: goto -> 2101
    //   2546: return
    //   2547: aconst_null
    //   2548: astore_3
    //   2549: goto -> 2154
    //   2552: aconst_null
    //   2553: astore_3
    //   2554: goto -> 2215
    // Exception table:
    //   from	to	target	type
    //   53	62	2249	finally
    //   71	80	2249	finally
    //   83	90	2249	finally
    //   94	99	2249	finally
    //   102	114	2249	finally
    //   114	151	2249	finally
    //   155	160	2249	finally
    //   163	181	2249	finally
    //   185	196	2249	finally
    //   197	204	2249	finally
    //   208	213	2249	finally
    //   216	228	2249	finally
    //   228	265	2249	finally
    //   269	274	2249	finally
    //   277	295	2249	finally
    //   299	310	2249	finally
    //   311	318	2249	finally
    //   322	327	2249	finally
    //   330	342	2249	finally
    //   342	379	2249	finally
    //   383	388	2249	finally
    //   391	409	2249	finally
    //   413	424	2249	finally
    //   425	432	2249	finally
    //   436	441	2249	finally
    //   444	456	2249	finally
    //   456	493	2249	finally
    //   497	502	2249	finally
    //   505	523	2249	finally
    //   527	538	2249	finally
    //   539	546	2249	finally
    //   550	555	2249	finally
    //   558	570	2249	finally
    //   570	607	2249	finally
    //   611	616	2249	finally
    //   619	637	2249	finally
    //   641	652	2249	finally
    //   653	660	2249	finally
    //   664	669	2249	finally
    //   672	684	2249	finally
    //   684	721	2249	finally
    //   725	730	2249	finally
    //   733	751	2249	finally
    //   755	766	2249	finally
    //   767	774	2249	finally
    //   778	783	2249	finally
    //   786	798	2249	finally
    //   798	835	2249	finally
    //   839	844	2249	finally
    //   847	865	2249	finally
    //   869	880	2249	finally
    //   881	888	2249	finally
    //   892	897	2249	finally
    //   900	912	2249	finally
    //   912	949	2249	finally
    //   953	958	2249	finally
    //   961	979	2249	finally
    //   983	994	2249	finally
    //   995	1002	2249	finally
    //   1006	1011	2249	finally
    //   1014	1026	2249	finally
    //   1026	1063	2249	finally
    //   1067	1072	2249	finally
    //   1075	1093	2249	finally
    //   1097	1108	2249	finally
    //   1109	1116	2249	finally
    //   1120	1125	2249	finally
    //   1128	1140	2249	finally
    //   1140	1177	2249	finally
    //   1181	1186	2249	finally
    //   1189	1207	2249	finally
    //   1211	1222	2249	finally
    //   1223	1230	2249	finally
    //   1234	1239	2249	finally
    //   1242	1254	2249	finally
    //   1254	1291	2249	finally
    //   1295	1300	2249	finally
    //   1303	1321	2249	finally
    //   1325	1336	2249	finally
    //   1337	1344	2249	finally
    //   1348	1353	2249	finally
    //   1356	1368	2249	finally
    //   1368	1405	2249	finally
    //   1409	1414	2249	finally
    //   1417	1435	2249	finally
    //   1439	1450	2249	finally
    //   1451	1458	2249	finally
    //   1462	1467	2249	finally
    //   1470	1482	2249	finally
    //   1482	1519	2249	finally
    //   1523	1528	2249	finally
    //   1531	1549	2249	finally
    //   1553	1564	2249	finally
    //   1565	1572	2249	finally
    //   1576	1581	2249	finally
    //   1584	1596	2249	finally
    //   1596	1633	2249	finally
    //   1637	1642	2249	finally
    //   1645	1663	2249	finally
    //   1667	1678	2249	finally
    //   1679	1686	2249	finally
    //   1690	1695	2249	finally
    //   1698	1710	2249	finally
    //   1710	1747	2249	finally
    //   1751	1756	2249	finally
    //   1759	1777	2249	finally
    //   1781	1792	2249	finally
    //   1793	1800	2249	finally
    //   1804	1809	2249	finally
    //   1812	1824	2249	finally
    //   1824	1861	2249	finally
    //   1865	1870	2249	finally
    //   1873	1891	2249	finally
    //   1895	1906	2249	finally
    //   1907	1914	2249	finally
    //   1918	1923	2249	finally
    //   1926	1938	2249	finally
    //   1938	1975	2249	finally
    //   1979	1984	2249	finally
    //   1987	2005	2249	finally
    //   2009	2020	2249	finally
    //   2021	2028	2249	finally
    //   2032	2037	2249	finally
    //   2040	2052	2249	finally
    //   2052	2089	2249	finally
    //   2093	2098	2249	finally
    //   2101	2119	2249	finally
    //   2123	2134	2249	finally
    //   2135	2142	2249	finally
    //   2146	2151	2249	finally
    //   2154	2166	2249	finally
    //   2166	2203	2249	finally
    //   2207	2212	2249	finally
    //   2215	2233	2249	finally
    //   2237	2248	2249	finally
  }
  
  public boolean K(MotionEvent paramMotionEvent) {
    this.k++;
    return false;
  }
  
  public final Device L() {
    return this.j;
  }
  
  public abstract com.smartpek.ui.customviews.c M();
  
  public final q8.a<q> N() {
    return this.o;
  }
  
  public final a O() {
    return this.g;
  }
  
  public final int P() {
    return this.k;
  }
  
  public abstract boolean Q();
  
  public void R(androidx.fragment.app.e parame, a parama, Device paramDevice, PowerButton paramPowerButton, com.smartpek.ui.customviews.c paramc) {
    b.a.g(this, parame, parama, paramDevice, paramPowerButton, paramc);
  }
  
  public void S(androidx.fragment.app.e parame, a parama, Device paramDevice, PowerButton paramPowerButton, com.smartpek.ui.customviews.c paramc) {
    b.a.h(this, parame, parama, paramDevice, paramPowerButton, paramc);
  }
  
  public void T() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getContext : ()Landroid/content/Context;
    //   4: astore #6
    //   6: aconst_null
    //   7: astore #5
    //   9: aload #6
    //   11: ifnull -> 27
    //   14: aload #6
    //   16: ldc_w 'Main'
    //   19: iconst_0
    //   20: iconst_2
    //   21: aconst_null
    //   22: invokestatic f : (Landroid/content/Context;Ljava/lang/String;IILjava/lang/Object;)Landroid/content/SharedPreferences;
    //   25: astore #5
    //   27: aload #5
    //   29: ifnull -> 48
    //   32: aload #5
    //   34: ldc_w 'battery_charging_protection_enabled'
    //   37: iconst_0
    //   38: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   43: istore #4
    //   45: goto -> 51
    //   48: iconst_0
    //   49: istore #4
    //   51: iload #4
    //   53: ifne -> 233
    //   56: aload_0
    //   57: getfield j : Lcom/smartpek/data/local/db/models/Device;
    //   60: astore #5
    //   62: aload #5
    //   64: ifnull -> 126
    //   67: aload #5
    //   69: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   72: astore #5
    //   74: aload #5
    //   76: ifnull -> 126
    //   79: aload #5
    //   81: arraylength
    //   82: istore_3
    //   83: iconst_0
    //   84: istore_1
    //   85: iconst_1
    //   86: istore_2
    //   87: iload_1
    //   88: iload_3
    //   89: if_icmpge -> 114
    //   92: aload #5
    //   94: iload_1
    //   95: aaload
    //   96: invokevirtual getBatteryChargingProtectionActive : ()Z
    //   99: ifeq -> 107
    //   102: iconst_1
    //   103: istore_1
    //   104: goto -> 116
    //   107: iload_1
    //   108: iconst_1
    //   109: iadd
    //   110: istore_1
    //   111: goto -> 85
    //   114: iconst_0
    //   115: istore_1
    //   116: iload_1
    //   117: iconst_1
    //   118: if_icmpne -> 126
    //   121: iload_2
    //   122: istore_1
    //   123: goto -> 128
    //   126: iconst_0
    //   127: istore_1
    //   128: iload_1
    //   129: ifeq -> 233
    //   132: aload_0
    //   133: getfield j : Lcom/smartpek/data/local/db/models/Device;
    //   136: astore #5
    //   138: aload #5
    //   140: ifnull -> 181
    //   143: aload #5
    //   145: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   148: astore #5
    //   150: aload #5
    //   152: ifnull -> 181
    //   155: aload #5
    //   157: arraylength
    //   158: istore_2
    //   159: iconst_0
    //   160: istore_1
    //   161: iload_1
    //   162: iload_2
    //   163: if_icmpge -> 181
    //   166: aload #5
    //   168: iload_1
    //   169: aaload
    //   170: iconst_0
    //   171: invokevirtual setBatteryChargingProtectionActive : (Z)V
    //   174: iload_1
    //   175: iconst_1
    //   176: iadd
    //   177: istore_1
    //   178: goto -> 161
    //   181: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   184: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
    //   187: astore #5
    //   189: aload #5
    //   191: ifnull -> 233
    //   194: aload #5
    //   196: invokevirtual H : ()Lu4/a;
    //   199: astore #5
    //   201: aload #5
    //   203: ifnull -> 233
    //   206: aload_0
    //   207: getfield j : Lcom/smartpek/data/local/db/models/Device;
    //   210: astore #6
    //   212: aload #6
    //   214: invokestatic g : (Ljava/lang/Object;)V
    //   217: aload #5
    //   219: aload #6
    //   221: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   224: pop
    //   225: return
    //   226: astore #5
    //   228: aload #5
    //   230: invokevirtual printStackTrace : ()V
    //   233: return
    // Exception table:
    //   from	to	target	type
    //   132	138	226	finally
    //   143	150	226	finally
    //   155	159	226	finally
    //   166	174	226	finally
    //   181	189	226	finally
    //   194	201	226	finally
    //   206	225	226	finally
  }
  
  public abstract void U(String paramString, Integer paramInteger, com.smartpek.data.local.models.b paramb, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  public void W() {
    b.a.k(this);
  }
  
  public abstract boolean X(PullRefreshLayout paramPullRefreshLayout, boolean paramBoolean);
  
  public final void Z() {
    App.a a1 = App.g;
    Device device = this.j;
    if (device != null) {
      DeviceType deviceType = device.getType();
    } else {
      device = null;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Controller > onstart() ");
    stringBuilder.append(device);
    a1.a(stringBuilder.toString());
    d0(true);
    z(true);
    if ((!a1.c() || a1.k()) && !a1.c() && !a1.k())
      c0.l(700, new e(this)); 
  }
  
  public void a(long paramLong) {
    this.l = paramLong;
  }
  
  public final void a0(List<? extends com.smartpek.ui.customviews.c> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 44
    //   4: aload_1
    //   5: invokeinterface iterator : ()Ljava/util/Iterator;
    //   10: astore_1
    //   11: aload_1
    //   12: invokeinterface hasNext : ()Z
    //   17: ifeq -> 44
    //   20: aload_1
    //   21: invokeinterface next : ()Ljava/lang/Object;
    //   26: checkcast com/smartpek/ui/customviews/c
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull -> 11
    //   34: aload_2
    //   35: iconst_0
    //   36: iconst_1
    //   37: aconst_null
    //   38: invokestatic h : (Lcom/smartpek/ui/customviews/c;IILjava/lang/Object;)V
    //   41: goto -> 11
    //   44: getstatic x5/p.j : Lx5/p$a;
    //   47: invokevirtual b : ()Lx5/p;
    //   50: astore_1
    //   51: aload_1
    //   52: ifnull -> 59
    //   55: aload_1
    //   56: invokevirtual dismissAllowingStateLoss : ()V
    //   59: aload_0
    //   60: iconst_0
    //   61: invokevirtual d0 : (Z)V
    //   64: aload_0
    //   65: iconst_0
    //   66: invokevirtual z : (Z)V
    //   69: return
    //   70: astore_1
    //   71: goto -> 44
    //   74: astore_2
    //   75: goto -> 11
    //   78: astore_1
    //   79: goto -> 59
    // Exception table:
    //   from	to	target	type
    //   4	11	70	finally
    //   11	30	70	finally
    //   34	41	74	finally
    //   44	51	78	finally
    //   55	59	78	finally
  }
  
  public long b() {
    return this.l;
  }
  
  public final void b0() {
    App.a a1 = App.g;
    Device device = this.j;
    if (device != null) {
      DeviceType deviceType = device.getType();
    } else {
      device = null;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Controller > onviewcrated() ");
    stringBuilder.append(device);
    a1.a(stringBuilder.toString());
    int i = h.X5;
    PowerButton powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setAppendStateToContentDescription(false); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.s((com.smartpek.ui.customviews.c)powerButton, 0, 0, 0, -65536, 0, 23, null); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      e1.b((View)powerButton, new f(this)); 
    i = h.x5;
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      powerButton.setAppendStateToContentDescription(false); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.s((com.smartpek.ui.customviews.c)powerButton, 0, 0, 0, -65536, 0, 23, null); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
    powerButton = (PowerButton)I(i);
    if (powerButton != null)
      e1.b((View)powerButton, new g(this)); 
  }
  
  public final void c0(Device paramDevice) {
    this.j = paramDevice;
  }
  
  public void d0(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public final void e0(a parama) {
    m.j(parama, "<set-?>");
    this.g = parama;
  }
  
  public boolean f(androidx.fragment.app.e parame, Context paramContext, a parama, int paramInt, Device paramDevice, PowerButton paramPowerButton, c5.c paramc, q8.a<q> parama1, q8.a<q> parama2, p<? super String, ? super com.smartpek.data.local.models.b, q> paramp) {
    return b.a.j(this, parame, paramContext, parama, paramInt, paramDevice, paramPowerButton, paramc, parama1, parama2, paramp);
  }
  
  public final void f0(com.smartpek.ui.customviews.c paramc) {
    try {
      k k = (k)k.k.a(getContext());
      if (k.e() == null && k.q(1))
        k.t(Boolean.TRUE); 
    } finally {
      paramc = null;
    } 
  }
  
  public void j(Context paramContext, Device paramDevice, String paramString) {
    b.a.l(this, paramContext, paramDevice, paramString);
  }
  
  public void l(androidx.fragment.app.e parame, Context paramContext, int paramInt, Integer paramInteger, Device paramDevice, com.smartpek.ui.customviews.c paramc, c5.c paramc1, boolean paramBoolean1, boolean paramBoolean2, q8.a<q> parama, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> paramr) {
    b.a.m(this, parame, paramContext, paramInt, paramInteger, paramDevice, paramc, paramc1, paramBoolean1, paramBoolean2, parama, paramr);
  }
  
  public void onAttach(Context paramContext) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'context'
    //   4: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield j : Lcom/smartpek/data/local/db/models/Device;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 24
    //   16: aload_2
    //   17: invokevirtual getName : ()Ljava/lang/String;
    //   20: astore_2
    //   21: goto -> 26
    //   24: aconst_null
    //   25: astore_2
    //   26: new java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: astore_3
    //   34: aload_3
    //   35: aload_2
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_3
    //   41: ldc_w ' > onAttach()'
    //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_0
    //   49: aload_1
    //   50: invokespecial onAttach : (Landroid/content/Context;)V
    //   53: aload_0
    //   54: getfield j : Lcom/smartpek/data/local/db/models/Device;
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull -> 73
    //   62: aload_1
    //   63: invokevirtual getUniqueId : ()Ljava/lang/String;
    //   66: astore_2
    //   67: aload_2
    //   68: astore_1
    //   69: aload_2
    //   70: ifnonnull -> 76
    //   73: ldc ''
    //   75: astore_1
    //   76: aload_0
    //   77: aload_1
    //   78: putfield h : Ljava/lang/String;
    //   81: aload_0
    //   82: getfield i : Lb5/l;
    //   85: ifnonnull -> 99
    //   88: aload_0
    //   89: aload_0
    //   90: invokevirtual getActivity : ()Landroidx/fragment/app/e;
    //   93: checkcast b5/l
    //   96: putfield i : Lb5/l;
    //   99: return
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    boolean bool = isHidden();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onCreateView()  isHidden: ");
    stringBuilder.append(bool);
    App.g.a("Controller > onCreateView()");
    return null;
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    x1.e(paramView, new d(this));
  }
  
  public boolean q(Activity paramActivity, a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<q> parama1, q8.a<q> parama2, l<? super String, q> paraml) {
    return b.a.c(this, paramActivity, parama, paramDevice, paramBoolean, paramc, parama1, parama2, paraml);
  }
  
  public void t(Context paramContext, a parama, int paramInt, Integer paramInteger, Device paramDevice, com.smartpek.ui.customviews.c paramc, c5.c paramc1, q8.a<q> parama1, q8.a<q> parama2, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> paramr) {
    b.a.e(this, paramContext, parama, paramInt, paramInteger, paramDevice, paramc, paramc1, parama1, parama2, paramr);
  }
  
  public boolean u() {
    return this.n;
  }
  
  public void w(androidx.fragment.app.e parame, Device paramDevice, PowerButton paramPowerButton) {
    b.a.b(this, parame, paramDevice, paramPowerButton);
  }
  
  public void y(Context paramContext, Device paramDevice, String paramString) {
    b.a.a(this, paramContext, paramDevice, paramString);
  }
  
  public void z(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public enum a {
    DEVICES, GROUPS, UNKNOWN;
    
    static {
      $VALUES = $values();
    }
  }
  
  static final class c extends n implements q8.a<q> {
    public static final c g = new c();
    
    c() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class d extends n implements q8.a<q> {
    d(b param1b) {
      super(0);
    }
    
    public final void invoke() {
      q8.a<q> a1 = this.g.N();
      if (a1 != null)
        a1.invoke(); 
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(b param1b) {
      super(0);
    }
    
    public final void invoke() {
      b.Y(this.g, null, false, 3, null);
    }
  }
  
  static final class f extends n implements l<View, q> {
    f(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      m.j(param1View, "it");
      b b1 = this.g;
      b1.S(b1.getActivity(), this.g.O(), this.g.L(), (PowerButton)this.g.I(h.X5), this.g.M());
    }
  }
  
  static final class g extends n implements l<View, q> {
    g(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      m.j(param1View, "it");
      b b1 = this.g;
      b1.R(b1.getActivity(), this.g.O(), this.g.L(), (PowerButton)this.g.I(h.x5), this.g.M());
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b5\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */