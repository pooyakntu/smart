package c5;

import android.app.Activity;
import android.content.Context;
import com.android.volley.VolleyError;
import com.smartpek.App;
import com.smartpek.data.local.db.DB;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.Channel;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.data.remote.Response;
import com.smartpek.ui.MainAct;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.utils.connection.ConnMngr;
import com.smartpek.utils.connection.mqtt.MqttRequest;
import com.smartpek.utils.connection.mqtt.MqttResponse;
import f8.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p7.c0;
import p7.c1;
import p7.p1;
import p7.q1;
import p7.v1;
import p7.x1;

public interface d {
  public static final a c = a.a;
  
  boolean A();
  
  void E(androidx.fragment.app.e parame, b5.b.a parama, int paramInt, Device paramDevice, PowerButton paramPowerButton, c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> paramp);
  
  void G(androidx.fragment.app.e parame, b5.b.a parama, int paramInt, Integer paramInteger, Device paramDevice, com.smartpek.ui.customviews.c paramc, c paramc1, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> paramr);
  
  void a(long paramLong);
  
  long b();
  
  boolean f(androidx.fragment.app.e parame, Context paramContext, b5.b.a parama, int paramInt, Device paramDevice, PowerButton paramPowerButton, c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> paramp);
  
  void l(androidx.fragment.app.e parame, Context paramContext, int paramInt, Integer paramInteger, Device paramDevice, com.smartpek.ui.customviews.c paramc, c paramc1, boolean paramBoolean1, boolean paramBoolean2, q8.a<e8.q> parama, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> paramr);
  
  void t(Context paramContext, b5.b.a parama, int paramInt, Integer paramInteger, Device paramDevice, com.smartpek.ui.customviews.c paramc, c paramc1, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> paramr);
  
  boolean u();
  
  void z(boolean paramBoolean);
  
  public static final class a {
    private static Thread b;
    
    private static Map<String, Runnable> c = new LinkedHashMap<String, Runnable>();
    
    public final Map<String, Runnable> c() {
      return c;
    }
  }
  
  public static final class b {
    private static void e(d param1d, Activity param1Activity, Context param1Context, int param1Int, Device param1Device, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param1p) {
      x7.c.a.b(x7.c.a, "Me-PowerLongClick", "longToggle()", false, 4, null);
      if (!param1d.u()) {
        param1a2.invoke();
        if (param1Device != null)
          Device.errorInConnection$default(param1Device, false, 0, 3, null); 
        return;
      } 
      param1a1.invoke();
      if (param1Device != null) {
        r6.e e = param1Device.getConnType();
      } else {
        param1a1 = null;
      } 
      r(param1d, param1Activity, param1Context, param1Int, param1Device, (r6.e)param1a1, new a(param1Device, param1p, param1a2, param1Activity, param1Context), new b(param1Device, param1a2, param1p));
    }
    
    public static void f(d param1d, Context param1Context, b5.b.a param1a, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r) {
      r8.m.j(param1a, "tab");
      r8.m.j(param1c1, "commandFrom");
      r8.m.j(param1a1, "onProgress");
      r8.m.j(param1a2, "onError");
      r8.m.j(param1r, "onResponse");
      g(param1d, null, param1Context, param1a, param1Int, param1Integer, param1Device, param1c, param1c1, param1a1, param1a2, param1r);
    }
    
    private static void g(d param1d, androidx.fragment.app.e param1e, Context param1Context, b5.b.a param1a, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r) {
      DeviceType deviceType1;
      com.smartpek.ui.customviews.c.d d1;
      App.a a2 = App.g;
      DeviceType deviceType2 = null;
      if (param1Device != null) {
        deviceType1 = param1Device.getType();
      } else {
        deviceType1 = null;
      } 
      if (param1c != null) {
        d1 = param1c.p(param1Int);
      } else {
        d1 = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Power > onClickPower() ");
      stringBuilder.append(deviceType1);
      stringBuilder.append(" power.state: ");
      stringBuilder.append(d1);
      a2.a(stringBuilder.toString());
      x7.c.a a1 = x7.c.a;
      if (param1Device != null) {
        deviceType1 = param1Device.getType();
      } else {
        deviceType1 = null;
      } 
      if (param1c != null) {
        d1 = param1c.p(param1Int);
      } else {
        d1 = null;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("onClickPower() ");
      stringBuilder.append(deviceType1);
      stringBuilder.append(" power.state: ");
      stringBuilder.append(d1);
      x7.c.a.b(a1, "Me-Power", stringBuilder.toString(), false, 4, null);
      if (param1d.b() == 0L || p7.t.a() - param1d.b() >= 0L) {
        boolean bool2;
        com.smartpek.ui.customviews.c.d d2;
        param1d.a(p7.t.a());
        r8.x x = new r8.x();
        deviceType1 = deviceType2;
        if (param1c != null)
          d2 = param1c.p(param1Int); 
        if (d2 == com.smartpek.ui.customviews.c.d.ERR || (param1c == null && param1Integer == null)) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        x.g = bool2;
        param1a1.invoke();
        aa.c.d().m(a5.a.PROGRESSING);
        boolean bool1 = true;
        k k = new k(param1d, param1e, param1Context, param1Int, param1Integer, param1Device, param1c, param1c1, x, param1a2, param1r);
        if (param1Device != null && param1Device.isDemo() == true) {
          param1Int = bool1;
        } else {
          param1Int = 0;
        } 
        if (param1Int == 0) {
          ConnMngr.w((ConnMngr)ConnMngr.j.a(param1e, param1Context), param1Device, param1a, 0, false, false, false, false, param1c1, new i(param1d, x, param1c1, k, param1e, param1Context), 124, null);
          return;
        } 
        k.invoke();
        if (param1e != null && param1c1 == c.APP)
          p1.g((Context)param1e, x1.a((Activity)param1e), null, c1.g((Context)param1e, 2131952264), 0, 0, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14970, null); 
        c0.e(500, j.g);
      } 
    }
    
    public static void h(d param1d, androidx.fragment.app.e param1e, b5.b.a param1a, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r) {
      Context context;
      r8.m.j(param1a, "tab");
      r8.m.j(param1c1, "commandFrom");
      r8.m.j(param1a1, "onProgress");
      r8.m.j(param1a2, "onError");
      r8.m.j(param1r, "onResponse");
      if (param1e != null) {
        context = param1e.getApplicationContext();
      } else {
        context = null;
      } 
      g(param1d, param1e, context, param1a, param1Int, param1Integer, param1Device, param1c, param1c1, param1a1, param1a2, param1r);
    }
    
    public static void k(d param1d, androidx.fragment.app.e param1e, b5.b.a param1a, int param1Int, Device param1Device, PowerButton param1PowerButton, c param1c, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param1p) {
      Context context;
      r8.m.j(param1a, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a1, "onProgress");
      r8.m.j(param1a2, "onError");
      r8.m.j(param1p, "onResponse");
      if (param1e != null) {
        context = param1e.getApplicationContext();
      } else {
        context = null;
      } 
      param1d.f(param1e, context, param1a, param1Int, param1Device, param1PowerButton, param1c, param1a1, param1a2, param1p);
    }
    
    public static boolean l(d param1d, androidx.fragment.app.e param1e, Context param1Context, b5.b.a param1a, int param1Int, Device param1Device, PowerButton param1PowerButton, c param1c, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param1p) {
      r8.m.j(param1a, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a1, "onProgress");
      r8.m.j(param1a2, "onError");
      r8.m.j(param1p, "onResponse");
      App.a a1 = App.g;
      if (param1Device != null) {
        DeviceType deviceType = param1Device.getType();
      } else {
        param1PowerButton = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Power > onLongClickPower() ");
      stringBuilder.append(param1PowerButton);
      a1.a(stringBuilder.toString());
      if (param1d.b() == 0L || p7.t.a() - param1d.b() > 200L) {
        param1d.a(p7.t.a() + 1000L);
        param1d.z(true);
        param1a1.invoke();
        n n = new n(param1d, param1e, param1Context, param1Int, param1Device, param1a1, param1a2, param1p);
        boolean bool = false;
        param1Int = bool;
        if (param1Device != null) {
          param1Int = bool;
          if (param1Device.isDemo() == true)
            param1Int = 1; 
        } 
        if (param1Int == 0) {
          ConnMngr.w((ConnMngr)ConnMngr.j.a(param1e, param1Context), param1Device, param1a, 0, false, false, false, false, param1c, new l(param1d, param1c, n, param1e, param1Context), 124, null);
          return true;
        } 
        n.invoke();
        c0.e(500, m.g);
      } 
      return true;
    }
    
    public static void n(d param1d) {
      try {
        param1d.z(false);
        Thread thread = d.a.a();
        return;
      } finally {
        param1d = null;
      } 
    }
    
    private static void o(d param1d, androidx.fragment.app.e param1e, Context param1Context, int param1Int, Device param1Device, r6.e param1e1, byte param1Byte, c param1c, boolean param1Boolean1, boolean param1Boolean2, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r1) {
      // Byte code:
      //   0: getstatic x7/c.a : Lx7/c$a;
      //   3: astore #18
      //   5: aload #18
      //   7: ldc 'Me-Power'
      //   9: ldc_w 'run()'
      //   12: iconst_0
      //   13: iconst_4
      //   14: aconst_null
      //   15: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   18: aload #4
      //   20: ifnull -> 62
      //   23: aload #4
      //   25: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   28: astore #16
      //   30: aload #16
      //   32: ifnull -> 62
      //   35: aload #16
      //   37: iload_3
      //   38: aaload
      //   39: astore #16
      //   41: aload #16
      //   43: ifnull -> 62
      //   46: aload #16
      //   48: invokevirtual getClickAction : ()Lcom/smartpek/data/local/models/b;
      //   51: astore #17
      //   53: aload #17
      //   55: astore #16
      //   57: aload #17
      //   59: ifnonnull -> 67
      //   62: getstatic com/smartpek/data/local/models/b.TOGGLE_ON_OFF : Lcom/smartpek/data/local/models/b;
      //   65: astore #16
      //   67: aload #4
      //   69: ifnull -> 105
      //   72: aload #4
      //   74: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   77: astore #17
      //   79: aload #17
      //   81: ifnull -> 105
      //   84: aload #17
      //   86: iload_3
      //   87: aaload
      //   88: astore #17
      //   90: aload #17
      //   92: ifnull -> 105
      //   95: aload #17
      //   97: invokevirtual getTwoStepAction : ()Z
      //   100: istore #13
      //   102: goto -> 108
      //   105: iconst_0
      //   106: istore #13
      //   108: iload #13
      //   110: ifne -> 168
      //   113: aload #4
      //   115: ifnull -> 151
      //   118: aload #4
      //   120: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   123: astore #17
      //   125: aload #17
      //   127: ifnull -> 151
      //   130: aload #17
      //   132: iload_3
      //   133: aaload
      //   134: astore #17
      //   136: aload #17
      //   138: ifnull -> 151
      //   141: aload #17
      //   143: invokevirtual getBatteryChargingProtectionActive : ()Z
      //   146: istore #13
      //   148: goto -> 154
      //   151: iconst_0
      //   152: istore #13
      //   154: iload #13
      //   156: ifeq -> 162
      //   159: goto -> 168
      //   162: iconst_0
      //   163: istore #12
      //   165: goto -> 171
      //   168: iconst_1
      //   169: istore #12
      //   171: aload_0
      //   172: invokeinterface A : ()Z
      //   177: ifne -> 249
      //   180: aload #5
      //   182: getstatic r6/e.UDP : Lr6/e;
      //   185: if_acmpeq -> 224
      //   188: aload #5
      //   190: getstatic r6/e.UNKNOWN : Lr6/e;
      //   193: if_acmpne -> 199
      //   196: goto -> 224
      //   199: aload #11
      //   201: aconst_null
      //   202: aload #16
      //   204: new java/lang/Throwable
      //   207: dup
      //   208: ldc_w ''
      //   211: invokespecial <init> : (Ljava/lang/String;)V
      //   214: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
      //   217: invokeinterface n : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   222: pop
      //   223: return
      //   224: aload #10
      //   226: aconst_null
      //   227: aload #16
      //   229: new java/lang/Throwable
      //   232: dup
      //   233: ldc_w ''
      //   236: invokespecial <init> : (Ljava/lang/String;)V
      //   239: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
      //   242: invokeinterface n : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   247: pop
      //   248: return
      //   249: new java/lang/StringBuilder
      //   252: dup
      //   253: invokespecial <init> : ()V
      //   256: astore #17
      //   258: aload #17
      //   260: ldc_w 'run() action: '
      //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   266: pop
      //   267: aload #17
      //   269: aload #16
      //   271: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   274: pop
      //   275: aload #17
      //   277: ldc_w ', connType: '
      //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   283: pop
      //   284: aload #17
      //   286: aload #5
      //   288: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   291: pop
      //   292: aload #18
      //   294: ldc 'Me-Power'
      //   296: aload #17
      //   298: invokevirtual toString : ()Ljava/lang/String;
      //   301: iconst_0
      //   302: iconst_4
      //   303: aconst_null
      //   304: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   307: new c5/d$b$p
      //   310: dup
      //   311: aload_0
      //   312: aload_1
      //   313: aload_2
      //   314: iload_3
      //   315: iload #6
      //   317: aload #16
      //   319: aload #4
      //   321: aload #5
      //   323: iload #8
      //   325: iload #9
      //   327: aload #10
      //   329: aload #11
      //   331: invokespecial <init> : (Lc5/d;Landroidx/fragment/app/e;Landroid/content/Context;IBLcom/smartpek/data/local/models/b;Lcom/smartpek/data/local/db/models/Device;Lr6/e;ZZLq8/r;Lq8/r;)V
      //   334: astore_2
      //   335: new c5/d$b$r
      //   338: dup
      //   339: aload #5
      //   341: aload #10
      //   343: aload #16
      //   345: aload #11
      //   347: invokespecial <init> : (Lr6/e;Lq8/r;Lcom/smartpek/data/local/models/b;Lq8/r;)V
      //   350: astore #17
      //   352: new c5/d$b$q
      //   355: dup
      //   356: aload #5
      //   358: aload #10
      //   360: aload #16
      //   362: aload #11
      //   364: invokespecial <init> : (Lr6/e;Lq8/r;Lcom/smartpek/data/local/models/b;Lq8/r;)V
      //   367: astore_0
      //   368: iload #12
      //   370: ifeq -> 705
      //   373: iload #8
      //   375: ifne -> 705
      //   378: aload #7
      //   380: getstatic c5/c.APP : Lc5/c;
      //   383: if_acmpne -> 430
      //   386: getstatic x5/p.j : Lx5/p$a;
      //   389: aload #4
      //   391: new c5/d$b$o
      //   394: dup
      //   395: aload_2
      //   396: aload #17
      //   398: invokespecial <init> : (Lq8/a;Lq8/a;)V
      //   401: invokevirtual a : (Lcom/smartpek/data/local/db/models/Device;Lq8/l;)Lx5/p;
      //   404: astore_2
      //   405: aload_1
      //   406: invokestatic g : (Ljava/lang/Object;)V
      //   409: aload_1
      //   410: invokevirtual getSupportFragmentManager : ()Landroidx/fragment/app/m;
      //   413: astore_1
      //   414: aload_1
      //   415: ldc_w 'activity!!.supportFragmentManager'
      //   418: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   421: aload_2
      //   422: aload_1
      //   423: ldc_w 'TwoStepActionDialog'
      //   426: invokevirtual show : (Landroidx/fragment/app/m;Ljava/lang/String;)V
      //   429: return
      //   430: aload #7
      //   432: getstatic c5/c.NTFY : Lc5/c;
      //   435: if_acmpne -> 684
      //   438: aload #4
      //   440: invokestatic g : (Ljava/lang/Object;)V
      //   443: aload #4
      //   445: invokevirtual getSsid : ()Ljava/lang/String;
      //   448: astore_1
      //   449: new java/lang/StringBuilder
      //   452: dup
      //   453: invokespecial <init> : ()V
      //   456: astore #5
      //   458: aload #5
      //   460: aload_1
      //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   464: pop
      //   465: aload #5
      //   467: ldc_w '__channel['
      //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   473: pop
      //   474: aload #5
      //   476: iload_3
      //   477: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   480: pop
      //   481: aload #5
      //   483: ldc_w ']'
      //   486: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   489: pop
      //   490: aload #5
      //   492: invokevirtual toString : ()Ljava/lang/String;
      //   495: astore_1
      //   496: getstatic c5/d.c : Lc5/d$a;
      //   499: astore #5
      //   501: aload #5
      //   503: invokevirtual c : ()Ljava/util/Map;
      //   506: aload_1
      //   507: invokeinterface containsKey : (Ljava/lang/Object;)Z
      //   512: ifne -> 537
      //   515: aload #5
      //   517: invokevirtual c : ()Ljava/util/Map;
      //   520: aload_1
      //   521: new c5/e
      //   524: dup
      //   525: aload #4
      //   527: iload_3
      //   528: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;I)V
      //   531: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   536: pop
      //   537: aload #5
      //   539: invokevirtual c : ()Ljava/util/Map;
      //   542: aload_1
      //   543: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   548: checkcast java/lang/Runnable
      //   551: invokestatic d : (Ljava/lang/Runnable;)V
      //   554: invokestatic a : ()J
      //   557: lstore #14
      //   559: aload #4
      //   561: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   564: astore #7
      //   566: aload #7
      //   568: invokestatic g : (Ljava/lang/Object;)V
      //   571: lload #14
      //   573: aload #7
      //   575: iload_3
      //   576: aaload
      //   577: invokevirtual getUnlockedAt : ()J
      //   580: lsub
      //   581: ldc2_w 3000
      //   584: lcmp
      //   585: ifle -> 659
      //   588: aload #4
      //   590: invokevirtual clone : ()Lcom/smartpek/data/local/db/models/Device;
      //   593: astore_2
      //   594: aload_2
      //   595: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   598: astore #4
      //   600: aload #4
      //   602: invokestatic g : (Ljava/lang/Object;)V
      //   605: aload #4
      //   607: iload_3
      //   608: aaload
      //   609: invokestatic a : ()J
      //   612: invokevirtual setUnlockedAt : (J)V
      //   615: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   618: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   621: astore #4
      //   623: aload #4
      //   625: invokestatic g : (Ljava/lang/Object;)V
      //   628: aload #4
      //   630: invokevirtual H : ()Lu4/a;
      //   633: aload_2
      //   634: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   637: pop
      //   638: aload #5
      //   640: invokevirtual c : ()Ljava/util/Map;
      //   643: aload_1
      //   644: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   649: checkcast java/lang/Runnable
      //   652: sipush #3000
      //   655: invokestatic o : (Ljava/lang/Runnable;I)V
      //   658: return
      //   659: aload #4
      //   661: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   664: astore_1
      //   665: aload_1
      //   666: invokestatic g : (Ljava/lang/Object;)V
      //   669: aload_1
      //   670: iload_3
      //   671: aaload
      //   672: lconst_0
      //   673: invokevirtual setUnlockedAt : (J)V
      //   676: aload_2
      //   677: invokeinterface invoke : ()Ljava/lang/Object;
      //   682: pop
      //   683: return
      //   684: aload_2
      //   685: invokeinterface invoke : ()Ljava/lang/Object;
      //   690: pop
      //   691: return
      //   692: astore_1
      //   693: aload_0
      //   694: invokeinterface invoke : ()Ljava/lang/Object;
      //   699: pop
      //   700: aload_1
      //   701: invokevirtual printStackTrace : ()V
      //   704: return
      //   705: aload_2
      //   706: invokeinterface invoke : ()Ljava/lang/Object;
      //   711: pop
      //   712: return
      // Exception table:
      //   from	to	target	type
      //   378	429	692	finally
      //   430	537	692	finally
      //   537	658	692	finally
      //   659	683	692	finally
      //   684	691	692	finally
    }
    
    private static void p(Device param1Device, int param1Int) {
      try {
        App.a a = App.g;
        DB dB2 = a.e();
        r8.m.g(dB2);
        param1Device = dB2.H().d0(param1Device.getSsid());
        r8.m.g(param1Device);
        Channel[] arrayOfChannel = param1Device.getChannels();
        r8.m.g(arrayOfChannel);
        arrayOfChannel[param1Int].setUnlockedAt(0L);
        DB dB1 = a.e();
        return;
      } finally {
        param1Device = null;
        param1Device.printStackTrace();
      } 
    }
    
    private static void q(d param1d, androidx.fragment.app.e param1e, Context param1Context, int param1Int, byte param1Byte, com.smartpek.data.local.models.b param1b, Device param1Device, r6.e param1e1, boolean param1Boolean1, boolean param1Boolean2, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r1) {
      // Byte code:
      //   0: getstatic r6/e.UDP : Lr6/e;
      //   3: astore_0
      //   4: aconst_null
      //   5: astore #18
      //   7: aconst_null
      //   8: astore #19
      //   10: iconst_1
      //   11: istore #15
      //   13: aload #7
      //   15: aload_0
      //   16: if_acmpeq -> 329
      //   19: aload #7
      //   21: getstatic r6/e.UNKNOWN : Lr6/e;
      //   24: if_acmpne -> 30
      //   27: goto -> 329
      //   30: iconst_3
      //   31: anewarray e8/j
      //   34: dup
      //   35: iconst_0
      //   36: ldc_w 'CMD'
      //   39: iconst_2
      //   40: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   43: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Le8/j;
      //   46: aastore
      //   47: dup
      //   48: iconst_1
      //   49: ldc_w 'c'
      //   52: iload_3
      //   53: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   56: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Le8/j;
      //   59: aastore
      //   60: dup
      //   61: iconst_2
      //   62: ldc_w 'power'
      //   65: iload #4
      //   67: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   70: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Le8/j;
      //   73: aastore
      //   74: invokestatic j : ([Le8/j;)Ljava/util/Map;
      //   77: astore #18
      //   79: aload #19
      //   81: astore_0
      //   82: aload #6
      //   84: ifnull -> 108
      //   87: aload #6
      //   89: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
      //   92: astore #10
      //   94: aload #19
      //   96: astore_0
      //   97: aload #10
      //   99: ifnull -> 108
      //   102: aload #10
      //   104: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
      //   107: astore_0
      //   108: aload_0
      //   109: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
      //   112: if_acmpne -> 240
      //   115: aload #6
      //   117: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   120: astore_0
      //   121: aload_0
      //   122: ifnull -> 751
      //   125: aload_0
      //   126: iload_3
      //   127: aaload
      //   128: astore_0
      //   129: aload_0
      //   130: ifnull -> 751
      //   133: aload_0
      //   134: invokevirtual getCustomCode : ()Ljava/lang/String;
      //   137: astore_0
      //   138: aload_0
      //   139: ifnull -> 751
      //   142: aload_0
      //   143: invokestatic a : (Ljava/lang/String;)Z
      //   146: iconst_1
      //   147: if_icmpne -> 751
      //   150: goto -> 153
      //   153: iload #15
      //   155: ifeq -> 240
      //   158: aload #6
      //   160: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   163: astore_0
      //   164: aload_0
      //   165: ifnull -> 757
      //   168: aload_0
      //   169: iload_3
      //   170: aaload
      //   171: astore_0
      //   172: aload_0
      //   173: ifnull -> 757
      //   176: aload_0
      //   177: invokevirtual getCustomCode : ()Ljava/lang/String;
      //   180: astore #10
      //   182: aload #10
      //   184: astore_0
      //   185: aload #10
      //   187: ifnonnull -> 193
      //   190: goto -> 757
      //   193: aload #18
      //   195: ldc_w 'data'
      //   198: new org/json/JSONObject
      //   201: dup
      //   202: aload_0
      //   203: invokespecial <init> : (Ljava/lang/String;)V
      //   206: ldc_w 'd'
      //   209: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
      //   212: invokestatic c : (Ljava/lang/String;)I
      //   215: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   218: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   223: pop
      //   224: aload #18
      //   226: ldc_w 'length'
      //   229: bipush #24
      //   231: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   234: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   239: pop
      //   240: new com/smartpek/utils/connection/mqtt/MqttRequest
      //   243: dup
      //   244: ldc_w 'Control'
      //   247: aload #18
      //   249: invokestatic r : (Ljava/util/Map;)Ljava/util/Map;
      //   252: invokespecial <init> : (Ljava/lang/String;Ljava/util/Map;)V
      //   255: astore #10
      //   257: aload_1
      //   258: ifnull -> 764
      //   261: aload_1
      //   262: astore_0
      //   263: goto -> 266
      //   266: aload_0
      //   267: ifnull -> 750
      //   270: iload #8
      //   272: ifeq -> 769
      //   275: getstatic com/smartpek/utils/connection/mqtt/MqttRequest.Companion : Lcom/smartpek/utils/connection/mqtt/MqttRequest$a;
      //   278: invokevirtual a : ()Lcom/smartpek/utils/connection/mqtt/MqttRequest;
      //   281: astore_1
      //   282: goto -> 285
      //   285: aload_0
      //   286: iload #9
      //   288: aload #6
      //   290: aload_1
      //   291: iconst_1
      //   292: aconst_null
      //   293: new c5/d$b$u
      //   296: dup
      //   297: aload #5
      //   299: aload #7
      //   301: aload #6
      //   303: aload #11
      //   305: iload_3
      //   306: invokespecial <init> : (Lcom/smartpek/data/local/models/b;Lr6/e;Lcom/smartpek/data/local/db/models/Device;Lq8/r;I)V
      //   309: new c5/d$b$v
      //   312: dup
      //   313: aload #5
      //   315: aload #7
      //   317: aload #11
      //   319: invokespecial <init> : (Lcom/smartpek/data/local/models/b;Lr6/e;Lq8/r;)V
      //   322: bipush #16
      //   324: aconst_null
      //   325: invokestatic Y : (Landroid/content/Context;ZLcom/smartpek/data/local/db/models/Device;Ljava/lang/Object;ZLq8/a;Lq8/l;Lq8/l;ILjava/lang/Object;)V
      //   328: return
      //   329: aload #6
      //   331: ifnull -> 775
      //   334: aload #6
      //   336: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
      //   339: astore_0
      //   340: aload_0
      //   341: ifnull -> 775
      //   344: aload_0
      //   345: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
      //   348: astore_0
      //   349: goto -> 352
      //   352: aload_0
      //   353: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
      //   356: if_acmpne -> 401
      //   359: aload_1
      //   360: ifnull -> 780
      //   363: aload_1
      //   364: astore_0
      //   365: goto -> 368
      //   368: aload_0
      //   369: ifnull -> 750
      //   372: aload_0
      //   373: aload #6
      //   375: iconst_0
      //   376: iconst_0
      //   377: new c5/d$b$s
      //   380: dup
      //   381: aload #6
      //   383: aload_1
      //   384: iload #8
      //   386: aload #10
      //   388: aload #5
      //   390: iload_3
      //   391: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;Landroidx/fragment/app/e;ZLq8/r;Lcom/smartpek/data/local/models/b;I)V
      //   394: bipush #6
      //   396: aconst_null
      //   397: invokestatic l : (Landroid/content/Context;Lcom/smartpek/data/local/db/models/Device;IZLq8/l;ILjava/lang/Object;)V
      //   400: return
      //   401: iload #8
      //   403: ifeq -> 791
      //   406: goto -> 785
      //   409: iload #8
      //   411: ifeq -> 805
      //   414: iconst_3
      //   415: istore #13
      //   417: goto -> 420
      //   420: iload #8
      //   422: ifeq -> 811
      //   425: iconst_1
      //   426: istore #4
      //   428: goto -> 431
      //   431: iload #8
      //   433: ifeq -> 814
      //   436: iconst_0
      //   437: istore #14
      //   439: goto -> 442
      //   442: bipush #15
      //   444: anewarray java/lang/Byte
      //   447: dup
      //   448: iconst_0
      //   449: iload #12
      //   451: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   454: aastore
      //   455: dup
      //   456: iconst_1
      //   457: iload #13
      //   459: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   462: aastore
      //   463: dup
      //   464: iconst_2
      //   465: iload #4
      //   467: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   470: aastore
      //   471: dup
      //   472: iconst_3
      //   473: iload #14
      //   475: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   478: aastore
      //   479: dup
      //   480: iconst_4
      //   481: iconst_0
      //   482: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   485: aastore
      //   486: dup
      //   487: iconst_5
      //   488: iconst_0
      //   489: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   492: aastore
      //   493: dup
      //   494: bipush #6
      //   496: iconst_0
      //   497: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   500: aastore
      //   501: dup
      //   502: bipush #7
      //   504: iconst_0
      //   505: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   508: aastore
      //   509: dup
      //   510: bipush #8
      //   512: iconst_0
      //   513: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   516: aastore
      //   517: dup
      //   518: bipush #9
      //   520: iconst_0
      //   521: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   524: aastore
      //   525: dup
      //   526: bipush #10
      //   528: iconst_0
      //   529: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   532: aastore
      //   533: dup
      //   534: bipush #11
      //   536: iconst_0
      //   537: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   540: aastore
      //   541: dup
      //   542: bipush #12
      //   544: iconst_0
      //   545: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   548: aastore
      //   549: dup
      //   550: bipush #13
      //   552: iconst_0
      //   553: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   556: aastore
      //   557: dup
      //   558: bipush #14
      //   560: iconst_0
      //   561: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   564: aastore
      //   565: invokestatic e : ([Ljava/lang/Object;)Ljava/util/ArrayList;
      //   568: astore #11
      //   570: aload #6
      //   572: ifnull -> 821
      //   575: aload #6
      //   577: invokestatic O : (Lcom/smartpek/data/local/db/models/Device;)Ljava/lang/String;
      //   580: astore_0
      //   581: aload_0
      //   582: ifnull -> 821
      //   585: aload_0
      //   586: invokevirtual toCharArray : ()[C
      //   589: astore_0
      //   590: aload_0
      //   591: ldc_w 'this as java.lang.String).toCharArray()'
      //   594: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   597: aload_0
      //   598: ifnull -> 821
      //   601: aload_0
      //   602: arraylength
      //   603: istore #15
      //   605: iconst_0
      //   606: istore_3
      //   607: iload_3
      //   608: iload #15
      //   610: if_icmpge -> 821
      //   613: aload #11
      //   615: aload_0
      //   616: iload_3
      //   617: caload
      //   618: bipush #48
      //   620: isub
      //   621: i2b
      //   622: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   625: invokevirtual add : (Ljava/lang/Object;)Z
      //   628: pop
      //   629: iload_3
      //   630: iconst_1
      //   631: iadd
      //   632: istore_3
      //   633: goto -> 607
      //   636: aload_0
      //   637: ifnull -> 750
      //   640: aload #6
      //   642: ifnull -> 835
      //   645: aload #6
      //   647: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
      //   650: astore_1
      //   651: goto -> 654
      //   654: getstatic com/smartpek/data/local/models/DeviceType.REMOTE : Lcom/smartpek/data/local/models/DeviceType;
      //   657: astore_2
      //   658: aload_1
      //   659: aload_2
      //   660: if_acmpne -> 670
      //   663: sipush #3000
      //   666: istore_3
      //   667: goto -> 844
      //   670: aload #5
      //   672: getstatic com/smartpek/data/local/models/b.ON_THEN_OFF : Lcom/smartpek/data/local/models/b;
      //   675: if_acmpne -> 840
      //   678: sipush #1500
      //   681: istore_3
      //   682: goto -> 844
      //   685: aload #5
      //   687: getstatic com/smartpek/data/local/models/b.ON_THEN_OFF : Lcom/smartpek/data/local/models/b;
      //   690: if_acmpeq -> 877
      //   693: aload #18
      //   695: astore_1
      //   696: aload #6
      //   698: ifnull -> 863
      //   701: aload #6
      //   703: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
      //   706: astore_1
      //   707: goto -> 863
      //   710: aload_0
      //   711: aload #7
      //   713: aload #11
      //   715: iconst_1
      //   716: iconst_0
      //   717: lload #16
      //   719: iload_3
      //   720: iload #8
      //   722: iconst_0
      //   723: iconst_0
      //   724: new c5/d$b$t
      //   727: dup
      //   728: aload #5
      //   730: aload #7
      //   732: aload #10
      //   734: invokespecial <init> : (Lcom/smartpek/data/local/models/b;Lr6/e;Lq8/r;)V
      //   737: sipush #392
      //   740: aconst_null
      //   741: invokestatic h : (Landroid/content/Context;Lr6/e;Ljava/util/ArrayList;ZIJIZZZLq8/p;ILjava/lang/Object;)V
      //   744: return
      //   745: astore_0
      //   746: aload_0
      //   747: invokevirtual printStackTrace : ()V
      //   750: return
      //   751: iconst_0
      //   752: istore #15
      //   754: goto -> 153
      //   757: ldc_w ''
      //   760: astore_0
      //   761: goto -> 193
      //   764: aload_2
      //   765: astore_0
      //   766: goto -> 266
      //   769: aload #10
      //   771: astore_1
      //   772: goto -> 285
      //   775: aconst_null
      //   776: astore_0
      //   777: goto -> 352
      //   780: aload_2
      //   781: astore_0
      //   782: goto -> 368
      //   785: iconst_1
      //   786: istore #12
      //   788: goto -> 409
      //   791: aload #6
      //   793: ifnull -> 799
      //   796: goto -> 785
      //   799: iconst_2
      //   800: istore #12
      //   802: goto -> 409
      //   805: iconst_1
      //   806: istore #13
      //   808: goto -> 420
      //   811: goto -> 431
      //   814: iload_3
      //   815: i2b
      //   816: istore #14
      //   818: goto -> 442
      //   821: aload_1
      //   822: ifnull -> 830
      //   825: aload_1
      //   826: astore_0
      //   827: goto -> 636
      //   830: aload_2
      //   831: astore_0
      //   832: goto -> 636
      //   835: aconst_null
      //   836: astore_1
      //   837: goto -> 654
      //   840: sipush #1000
      //   843: istore_3
      //   844: aload #6
      //   846: ifnull -> 855
      //   849: lconst_0
      //   850: lstore #16
      //   852: goto -> 685
      //   855: ldc2_w 3000
      //   858: lstore #16
      //   860: goto -> 685
      //   863: aload_1
      //   864: aload_2
      //   865: if_acmpne -> 871
      //   868: goto -> 877
      //   871: iconst_0
      //   872: istore #8
      //   874: goto -> 710
      //   877: iconst_1
      //   878: istore #8
      //   880: goto -> 710
      // Exception table:
      //   from	to	target	type
      //   0	4	745	finally
      //   19	27	745	finally
      //   30	79	745	finally
      //   87	94	745	finally
      //   102	108	745	finally
      //   108	121	745	finally
      //   133	138	745	finally
      //   142	150	745	finally
      //   158	164	745	finally
      //   176	182	745	finally
      //   193	240	745	finally
      //   240	257	745	finally
      //   275	282	745	finally
      //   285	328	745	finally
      //   334	340	745	finally
      //   344	349	745	finally
      //   352	359	745	finally
      //   372	400	745	finally
      //   442	570	745	finally
      //   575	581	745	finally
      //   585	597	745	finally
      //   601	605	745	finally
      //   613	629	745	finally
      //   645	651	745	finally
      //   654	658	745	finally
      //   670	678	745	finally
      //   685	693	745	finally
      //   701	707	745	finally
      //   710	744	745	finally
    }
    
    private static void r(d param1d, Activity param1Activity, Context param1Context, int param1Int, Device param1Device, r6.e param1e, q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q1) {
      // Byte code:
      //   0: invokestatic a : ()Ljava/lang/Thread;
      //   3: astore #8
      //   5: aload #8
      //   7: ifnull -> 15
      //   10: aload #8
      //   12: invokevirtual stop : ()V
      //   15: invokestatic a : ()Ljava/lang/Thread;
      //   18: astore #8
      //   20: aload #8
      //   22: ifnull -> 33
      //   25: aload #8
      //   27: invokevirtual interrupt : ()V
      //   30: goto -> 33
      //   33: getstatic c5/d.c : Lc5/d$a;
      //   36: astore #8
      //   38: aconst_null
      //   39: invokestatic b : (Ljava/lang/Thread;)V
      //   42: aload_0
      //   43: iconst_1
      //   44: invokeinterface z : (Z)V
      //   49: aload #4
      //   51: ifnull -> 93
      //   54: aload #4
      //   56: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   59: astore #8
      //   61: aload #8
      //   63: ifnull -> 93
      //   66: aload #8
      //   68: iload_3
      //   69: aaload
      //   70: astore #8
      //   72: aload #8
      //   74: ifnull -> 93
      //   77: aload #8
      //   79: invokevirtual getClickAction : ()Lcom/smartpek/data/local/models/b;
      //   82: astore #9
      //   84: aload #9
      //   86: astore #8
      //   88: aload #9
      //   90: ifnonnull -> 98
      //   93: getstatic com/smartpek/data/local/models/b.TOGGLE_ON_OFF : Lcom/smartpek/data/local/models/b;
      //   96: astore #8
      //   98: new java/lang/Thread
      //   101: dup
      //   102: new c5/f
      //   105: dup
      //   106: aload_0
      //   107: new c5/d$b$z
      //   110: dup
      //   111: aload #5
      //   113: aload #4
      //   115: iload_3
      //   116: aload_1
      //   117: aload_2
      //   118: aload #6
      //   120: aload #8
      //   122: aload #7
      //   124: invokespecial <init> : (Lr6/e;Lcom/smartpek/data/local/db/models/Device;ILandroid/app/Activity;Landroid/content/Context;Lq8/q;Lcom/smartpek/data/local/models/b;Lq8/q;)V
      //   127: aload #5
      //   129: aload #4
      //   131: iload_3
      //   132: aload_1
      //   133: aload_2
      //   134: aload #6
      //   136: aload #8
      //   138: aload #7
      //   140: invokespecial <init> : (Lc5/d;Lq8/a;Lr6/e;Lcom/smartpek/data/local/db/models/Device;ILandroid/app/Activity;Landroid/content/Context;Lq8/q;Lcom/smartpek/data/local/models/b;Lq8/q;)V
      //   143: invokespecial <init> : (Ljava/lang/Runnable;)V
      //   146: invokestatic b : (Ljava/lang/Thread;)V
      //   149: invokestatic a : ()Ljava/lang/Thread;
      //   152: astore_0
      //   153: aload_0
      //   154: ifnull -> 161
      //   157: aload_0
      //   158: invokevirtual start : ()V
      //   161: return
      //   162: astore #8
      //   164: goto -> 15
      //   167: astore #8
      //   169: goto -> 33
      // Exception table:
      //   from	to	target	type
      //   0	5	162	finally
      //   10	15	162	finally
      //   15	20	167	finally
      //   25	30	167	finally
    }
    
    private static void s(d param1d, q8.a param1a, r6.e param1e, Device param1Device, int param1Int, Activity param1Activity, Context param1Context, q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q1, com.smartpek.data.local.models.b param1b, q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q2) {
      Context context1;
      ArrayList<Byte> arrayList;
      Context context2;
      r8.m.j(param1d, "this$0");
      r8.m.j(param1a, "$push");
      r8.m.j(param1q1, "$udpCallback");
      r8.m.j(param1b, "$action");
      r8.m.j(param1q2, "$mqttCallback");
      while (true) {
        if (param1d.u()) {
          param1a.invoke();
          try {
            Thread.sleep(500L);
            x7.c.a.b(x7.c.a, "Me-PowerLongClick", "looping", false, 4, null);
          } finally {
            Exception exception;
          } 
          continue;
        } 
        try {
          Thread.sleep(300L);
        } finally {}
        try {
          r6.e e1 = r6.e.UDP;
          boolean bool = false;
          if (param1e == e1 || param1e == r6.e.UNKNOWN) {
            byte b1;
            if (param1Device != null) {
              b1 = 1;
            } else {
              b1 = 2;
            } 
            arrayList = f8.o.e((Object[])new Byte[] { 
                  Byte.valueOf(b1), Byte.valueOf((byte)1), Byte.valueOf((byte)8), Byte.valueOf((byte)param1Int), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
                  Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
            if (param1Device != null) {
              String str = p6.m.O(param1Device);
              if (str != null) {
                char[] arrayOfChar = str.toCharArray();
                r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
                if (arrayOfChar != null) {
                  int i = arrayOfChar.length;
                  for (param1Int = bool; param1Int < i; param1Int++)
                    arrayList.add(Byte.valueOf((byte)(arrayOfChar[param1Int] - 48))); 
                } 
              } 
            } 
            break;
          } 
          MqttRequest mqttRequest = new MqttRequest("Control", j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(param1Int)), e8.n.a("power", Integer.valueOf(8)) }));
          if (param1Activity == null)
            context2 = param1Context; 
        } finally {
          param1d = null;
        } 
        return;
      } 
      if (context2 != null) {
        context1 = context2;
      } else {
        context1 = param1Context;
      } 
      if (context1 != null) {
        p6.m.g(context1, param1Device, arrayList, true, 0, 0L, 0, false, false, false, new w(param1q1, param1b), 504, null);
        return;
      } 
    }
    
    public static void t(d param1d, androidx.fragment.app.e param1e, Context param1Context, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, boolean param1Boolean1, boolean param1Boolean2, q8.a<e8.q> param1a, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r) {
      // Byte code:
      //   0: aload #7
      //   2: ldc 'commandFrom'
      //   4: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   7: aload #10
      //   9: ldc 'onError'
      //   11: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   14: aload #11
      //   16: ldc 'onResponse'
      //   18: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   21: getstatic x7/c.a : Lx7/c$a;
      //   24: ldc 'Me-Power'
      //   26: ldc_w 'toggle()'
      //   29: iconst_0
      //   30: iconst_4
      //   31: aconst_null
      //   32: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   35: aload #5
      //   37: ifnull -> 60
      //   40: aload #5
      //   42: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   45: astore #14
      //   47: aload #14
      //   49: ifnull -> 60
      //   52: aload #14
      //   54: arraylength
      //   55: istore #13
      //   57: goto -> 63
      //   60: iconst_0
      //   61: istore #13
      //   63: iload_3
      //   64: iload #13
      //   66: if_icmplt -> 70
      //   69: return
      //   70: aload #4
      //   72: ifnull -> 86
      //   75: aload #4
      //   77: invokevirtual intValue : ()I
      //   80: i2b
      //   81: istore #12
      //   83: goto -> 193
      //   86: aload #5
      //   88: ifnull -> 175
      //   91: aload #5
      //   93: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
      //   96: astore #4
      //   98: aload #4
      //   100: ifnull -> 175
      //   103: aload #4
      //   105: iload_3
      //   106: aaload
      //   107: astore #4
      //   109: aload #4
      //   111: ifnull -> 175
      //   114: aload #4
      //   116: invokevirtual getClickAction : ()Lcom/smartpek/data/local/models/b;
      //   119: astore #14
      //   121: aload #14
      //   123: ifnull -> 175
      //   126: aload #6
      //   128: ifnull -> 145
      //   131: aload #6
      //   133: iload_3
      //   134: invokevirtual t : (I)Z
      //   137: invokestatic valueOf : (Z)Ljava/lang/Boolean;
      //   140: astore #4
      //   142: goto -> 148
      //   145: aconst_null
      //   146: astore #4
      //   148: aload #14
      //   150: aload #4
      //   152: aload #5
      //   154: invokevirtual getConnType : ()Lr6/e;
      //   157: aload #5
      //   159: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
      //   162: aload #5
      //   164: invokevirtual getVersion : ()Ljava/lang/Double;
      //   167: invokevirtual code : (Ljava/lang/Boolean;Lr6/e;Lcom/smartpek/data/local/models/j;Ljava/lang/Double;)B
      //   170: istore #12
      //   172: goto -> 83
      //   175: getstatic com/smartpek/data/local/models/b.TOGGLE_ON_OFF : Lcom/smartpek/data/local/models/b;
      //   178: aconst_null
      //   179: aconst_null
      //   180: aconst_null
      //   181: aconst_null
      //   182: bipush #15
      //   184: aconst_null
      //   185: invokestatic code$default : (Lcom/smartpek/data/local/models/b;Ljava/lang/Boolean;Lr6/e;Lcom/smartpek/data/local/models/j;Ljava/lang/Double;ILjava/lang/Object;)B
      //   188: istore #12
      //   190: goto -> 83
      //   193: aload #5
      //   195: ifnull -> 208
      //   198: aload #5
      //   200: invokevirtual getConnType : ()Lr6/e;
      //   203: astore #4
      //   205: goto -> 211
      //   208: aconst_null
      //   209: astore #4
      //   211: aload_0
      //   212: aload_1
      //   213: aload_2
      //   214: iload_3
      //   215: aload #5
      //   217: aload #4
      //   219: iload #12
      //   221: aload #7
      //   223: iload #8
      //   225: iload #9
      //   227: new c5/d$b$a0
      //   230: dup
      //   231: aload #5
      //   233: aload #11
      //   235: aload #10
      //   237: aload_1
      //   238: aload_2
      //   239: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;Lq8/r;Lq8/a;Landroidx/fragment/app/e;Landroid/content/Context;)V
      //   242: new c5/d$b$b0
      //   245: dup
      //   246: aload #5
      //   248: aload #10
      //   250: aload #11
      //   252: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;Lq8/a;Lq8/r;)V
      //   255: invokestatic o : (Lc5/d;Landroidx/fragment/app/e;Landroid/content/Context;ILcom/smartpek/data/local/db/models/Device;Lr6/e;BLc5/c;ZZLq8/r;Lq8/r;)V
      //   258: return
    }
    
    static final class a extends r8.n implements q8.q<p6.n, com.smartpek.data.local.models.b, Throwable, e8.q> {
      a(Device param2Device, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param2p, q8.a<e8.q> param2a, Activity param2Activity, Context param2Context) {
        super(3);
      }
      
      public final void a(p6.n param2n, com.smartpek.data.local.models.b param2b, Throwable param2Throwable) {
        // Byte code:
        //   0: aload_2
        //   1: ldc 'action'
        //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
        //   6: aconst_null
        //   7: astore #6
        //   9: iconst_0
        //   10: istore #5
        //   12: aload_3
        //   13: ifnonnull -> 139
        //   16: getstatic x7/c.a : Lx7/c$a;
        //   19: astore #8
        //   21: aload_1
        //   22: ifnull -> 39
        //   25: aload_1
        //   26: invokevirtual a : ()Ljava/lang/String;
        //   29: astore #7
        //   31: aload #7
        //   33: astore_3
        //   34: aload #7
        //   36: ifnonnull -> 42
        //   39: ldc 'null'
        //   41: astore_3
        //   42: aload #8
        //   44: ldc 'Me-Power'
        //   46: aload_3
        //   47: iconst_0
        //   48: iconst_4
        //   49: aconst_null
        //   50: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
        //   53: aload_0
        //   54: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   57: astore_3
        //   58: aload_3
        //   59: ifnull -> 70
        //   62: aload_3
        //   63: iconst_0
        //   64: iconst_0
        //   65: iconst_2
        //   66: aconst_null
        //   67: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
        //   70: aload_0
        //   71: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   74: astore #7
        //   76: aload #7
        //   78: ifnull -> 104
        //   81: aload #6
        //   83: astore_3
        //   84: aload_1
        //   85: ifnull -> 93
        //   88: aload_1
        //   89: invokevirtual a : ()Ljava/lang/String;
        //   92: astore_3
        //   93: aload #7
        //   95: aload_3
        //   96: iconst_0
        //   97: iconst_0
        //   98: bipush #6
        //   100: aconst_null
        //   101: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   104: aload_0
        //   105: getfield h : Lq8/p;
        //   108: astore #6
        //   110: aload_1
        //   111: ifnull -> 125
        //   114: aload_1
        //   115: invokevirtual a : ()Ljava/lang/String;
        //   118: astore_3
        //   119: aload_3
        //   120: astore_1
        //   121: aload_3
        //   122: ifnonnull -> 128
        //   125: ldc ''
        //   127: astore_1
        //   128: aload #6
        //   130: aload_1
        //   131: aload_2
        //   132: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop
        //   138: return
        //   139: aload_0
        //   140: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   143: astore_1
        //   144: aload_1
        //   145: ifnull -> 156
        //   148: aload_1
        //   149: iconst_0
        //   150: iconst_0
        //   151: iconst_3
        //   152: aconst_null
        //   153: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
        //   156: aload_0
        //   157: getfield i : Lq8/a;
        //   160: invokeinterface invoke : ()Ljava/lang/Object;
        //   165: pop
        //   166: getstatic android/os/Build$VERSION.SDK_INT : I
        //   169: bipush #28
        //   171: if_icmplt -> 277
        //   174: aload_0
        //   175: getfield j : Landroid/app/Activity;
        //   178: astore_1
        //   179: aload_1
        //   180: ifnull -> 186
        //   183: goto -> 191
        //   186: aload_0
        //   187: getfield k : Landroid/content/Context;
        //   190: astore_1
        //   191: aload_1
        //   192: ifnull -> 208
        //   195: aload_1
        //   196: invokestatic a : (Landroid/content/Context;)Z
        //   199: ifne -> 208
        //   202: iconst_1
        //   203: istore #4
        //   205: goto -> 211
        //   208: iconst_0
        //   209: istore #4
        //   211: iload #4
        //   213: ifne -> 258
        //   216: aload_0
        //   217: getfield j : Landroid/app/Activity;
        //   220: astore_1
        //   221: aload_1
        //   222: ifnull -> 228
        //   225: goto -> 233
        //   228: aload_0
        //   229: getfield k : Landroid/content/Context;
        //   232: astore_1
        //   233: aload_1
        //   234: ifnull -> 250
        //   237: aload_1
        //   238: invokestatic a : (Landroid/content/Context;)Z
        //   241: ifne -> 250
        //   244: iconst_1
        //   245: istore #4
        //   247: goto -> 253
        //   250: iconst_0
        //   251: istore #4
        //   253: iload #4
        //   255: ifeq -> 277
        //   258: getstatic t6/c.f : Lt6/c$a;
        //   261: aload_0
        //   262: getfield j : Landroid/app/Activity;
        //   265: invokevirtual a : (Landroid/app/Activity;)Lt6/c;
        //   268: aconst_null
        //   269: lconst_0
        //   270: aconst_null
        //   271: bipush #7
        //   273: aconst_null
        //   274: invokestatic q : (Lt6/c;Lt6/c$b;JLq8/l;ILjava/lang/Object;)V
        //   277: aload_0
        //   278: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   281: astore_1
        //   282: iload #5
        //   284: istore #4
        //   286: aload_1
        //   287: ifnull -> 305
        //   290: iload #5
        //   292: istore #4
        //   294: aload_1
        //   295: invokevirtual isDemo : ()Z
        //   298: iconst_1
        //   299: if_icmpne -> 305
        //   302: iconst_1
        //   303: istore #4
        //   305: iload #4
        //   307: ifeq -> 337
        //   310: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
        //   313: invokevirtual j : ()Z
        //   316: ifne -> 337
        //   319: new c5/d$b$a$a
        //   322: dup
        //   323: aload_0
        //   324: getfield j : Landroid/app/Activity;
        //   327: aload_0
        //   328: getfield k : Landroid/content/Context;
        //   331: invokespecial <init> : (Landroid/app/Activity;Landroid/content/Context;)V
        //   334: invokestatic q : (Lq8/a;)V
        //   337: return
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        a(Activity param3Activity, Context param3Context) {
          super(0);
        }
        
        public final void invoke() {
          Context context;
          Activity activity = this.g;
          if (activity == null)
            context = this.h; 
          if (context != null)
            v1.k(context, 2131952299, 0, null, 6, null); 
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(Activity param2Activity, Context param2Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        Activity activity = this.g;
        if (activity == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131952299, 0, null, 6, null); 
      }
    }
    
    static final class a0 extends r8.n implements q8.r<p6.n, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> {
      a0(Device param2Device, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param2r, q8.a<e8.q> param2a, androidx.fragment.app.e param2e, Context param2Context) {
        super(4);
      }
      
      public final void a(p6.n param2n, com.smartpek.data.local.models.b param2b, Throwable param2Throwable, boolean param2Boolean) {
        // Byte code:
        //   0: aload_2
        //   1: ldc 'action'
        //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
        //   6: aconst_null
        //   7: astore #7
        //   9: iconst_0
        //   10: istore #6
        //   12: aload_3
        //   13: ifnonnull -> 159
        //   16: getstatic x7/c.a : Lx7/c$a;
        //   19: astore #9
        //   21: aload_1
        //   22: ifnull -> 39
        //   25: aload_1
        //   26: invokevirtual a : ()Ljava/lang/String;
        //   29: astore #8
        //   31: aload #8
        //   33: astore_3
        //   34: aload #8
        //   36: ifnonnull -> 42
        //   39: ldc 'null'
        //   41: astore_3
        //   42: aload #9
        //   44: ldc 'Me-Power'
        //   46: aload_3
        //   47: iconst_0
        //   48: iconst_4
        //   49: aconst_null
        //   50: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
        //   53: aload_0
        //   54: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   57: astore_3
        //   58: aload_3
        //   59: ifnull -> 70
        //   62: aload_3
        //   63: iconst_0
        //   64: iconst_0
        //   65: iconst_2
        //   66: aconst_null
        //   67: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
        //   70: iload #4
        //   72: ifne -> 111
        //   75: aload_0
        //   76: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   79: astore #8
        //   81: aload #8
        //   83: ifnull -> 111
        //   86: aload_1
        //   87: ifnull -> 98
        //   90: aload_1
        //   91: invokevirtual a : ()Ljava/lang/String;
        //   94: astore_3
        //   95: goto -> 100
        //   98: aconst_null
        //   99: astore_3
        //   100: aload #8
        //   102: aload_3
        //   103: iconst_0
        //   104: iconst_0
        //   105: bipush #6
        //   107: aconst_null
        //   108: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   111: aload_0
        //   112: getfield h : Lq8/r;
        //   115: astore #8
        //   117: aload_1
        //   118: ifnull -> 129
        //   121: aload_1
        //   122: invokevirtual a : ()Ljava/lang/String;
        //   125: astore_3
        //   126: goto -> 131
        //   129: aconst_null
        //   130: astore_3
        //   131: aload_1
        //   132: ifnull -> 141
        //   135: aload_1
        //   136: invokevirtual b : ()Ljava/lang/String;
        //   139: astore #7
        //   141: aload #8
        //   143: aload_3
        //   144: aload #7
        //   146: aload_2
        //   147: iload #4
        //   149: invokestatic valueOf : (Z)Ljava/lang/Boolean;
        //   152: invokeinterface n : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   157: pop
        //   158: return
        //   159: aload_0
        //   160: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   163: astore_1
        //   164: aload_1
        //   165: ifnull -> 176
        //   168: aload_1
        //   169: iconst_0
        //   170: iconst_0
        //   171: iconst_3
        //   172: aconst_null
        //   173: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
        //   176: aload_0
        //   177: getfield i : Lq8/a;
        //   180: invokeinterface invoke : ()Ljava/lang/Object;
        //   185: pop
        //   186: getstatic android/os/Build$VERSION.SDK_INT : I
        //   189: bipush #28
        //   191: if_icmplt -> 297
        //   194: aload_0
        //   195: getfield j : Landroidx/fragment/app/e;
        //   198: astore_1
        //   199: aload_1
        //   200: ifnull -> 206
        //   203: goto -> 211
        //   206: aload_0
        //   207: getfield k : Landroid/content/Context;
        //   210: astore_1
        //   211: aload_1
        //   212: ifnull -> 228
        //   215: aload_1
        //   216: invokestatic a : (Landroid/content/Context;)Z
        //   219: ifne -> 228
        //   222: iconst_1
        //   223: istore #5
        //   225: goto -> 231
        //   228: iconst_0
        //   229: istore #5
        //   231: iload #5
        //   233: ifne -> 278
        //   236: aload_0
        //   237: getfield j : Landroidx/fragment/app/e;
        //   240: astore_1
        //   241: aload_1
        //   242: ifnull -> 248
        //   245: goto -> 253
        //   248: aload_0
        //   249: getfield k : Landroid/content/Context;
        //   252: astore_1
        //   253: aload_1
        //   254: ifnull -> 270
        //   257: aload_1
        //   258: invokestatic a : (Landroid/content/Context;)Z
        //   261: ifne -> 270
        //   264: iconst_1
        //   265: istore #5
        //   267: goto -> 273
        //   270: iconst_0
        //   271: istore #5
        //   273: iload #5
        //   275: ifeq -> 297
        //   278: getstatic t6/c.f : Lt6/c$a;
        //   281: aload_0
        //   282: getfield j : Landroidx/fragment/app/e;
        //   285: invokevirtual a : (Landroid/app/Activity;)Lt6/c;
        //   288: aconst_null
        //   289: lconst_0
        //   290: aconst_null
        //   291: bipush #7
        //   293: aconst_null
        //   294: invokestatic q : (Lt6/c;Lt6/c$b;JLq8/l;ILjava/lang/Object;)V
        //   297: aload_0
        //   298: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   301: astore_1
        //   302: iload #6
        //   304: istore #5
        //   306: aload_1
        //   307: ifnull -> 325
        //   310: iload #6
        //   312: istore #5
        //   314: aload_1
        //   315: invokevirtual isDemo : ()Z
        //   318: iconst_1
        //   319: if_icmpne -> 325
        //   322: iconst_1
        //   323: istore #5
        //   325: iload #5
        //   327: ifeq -> 357
        //   330: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
        //   333: invokevirtual j : ()Z
        //   336: ifne -> 357
        //   339: new c5/d$b$a0$a
        //   342: dup
        //   343: aload_0
        //   344: getfield j : Landroidx/fragment/app/e;
        //   347: aload_0
        //   348: getfield k : Landroid/content/Context;
        //   351: invokespecial <init> : (Landroidx/fragment/app/e;Landroid/content/Context;)V
        //   354: invokestatic q : (Lq8/a;)V
        //   357: return
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        a(androidx.fragment.app.e param3e, Context param3Context) {
          super(0);
        }
        
        public final void invoke() {
          Context context;
          androidx.fragment.app.e e1 = this.g;
          if (e1 == null)
            context = this.h; 
          if (context != null)
            v1.k(context, 2131952299, 0, null, 6, null); 
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(androidx.fragment.app.e param2e, Context param2Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        androidx.fragment.app.e e1 = this.g;
        if (e1 == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131952299, 0, null, 6, null); 
      }
    }
    
    static final class b extends r8.n implements q8.q<MqttResponse, com.smartpek.data.local.models.b, Throwable, e8.q> {
      b(Device param2Device, q8.a<e8.q> param2a, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param2p) {
        super(3);
      }
      
      public final void a(MqttResponse param2MqttResponse, com.smartpek.data.local.models.b param2b, Throwable param2Throwable) {
        // Byte code:
        //   0: aload_2
        //   1: ldc 'action'
        //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
        //   6: aconst_null
        //   7: astore #4
        //   9: aload_3
        //   10: ifnull -> 41
        //   13: aload_0
        //   14: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   17: astore_1
        //   18: aload_1
        //   19: ifnull -> 30
        //   22: aload_1
        //   23: iconst_0
        //   24: iconst_0
        //   25: iconst_3
        //   26: aconst_null
        //   27: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
        //   30: aload_0
        //   31: getfield h : Lq8/a;
        //   34: invokeinterface invoke : ()Ljava/lang/Object;
        //   39: pop
        //   40: return
        //   41: getstatic x7/c.a : Lx7/c$a;
        //   44: astore_3
        //   45: new java/lang/StringBuilder
        //   48: dup
        //   49: invokespecial <init> : ()V
        //   52: astore #5
        //   54: aload #5
        //   56: ldc 'toggle() > '
        //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   61: pop
        //   62: aload #5
        //   64: aload_1
        //   65: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   68: pop
        //   69: aload_3
        //   70: ldc 'Me-Power'
        //   72: aload #5
        //   74: invokevirtual toString : ()Ljava/lang/String;
        //   77: iconst_0
        //   78: iconst_4
        //   79: aconst_null
        //   80: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
        //   83: aload_0
        //   84: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   87: astore_3
        //   88: aload_3
        //   89: ifnull -> 100
        //   92: aload_3
        //   93: iconst_0
        //   94: iconst_0
        //   95: iconst_2
        //   96: aconst_null
        //   97: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
        //   100: aload_0
        //   101: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   104: astore #5
        //   106: aload #5
        //   108: ifnull -> 134
        //   111: aload #4
        //   113: astore_3
        //   114: aload_1
        //   115: ifnull -> 123
        //   118: aload_1
        //   119: invokevirtual getStr : ()Ljava/lang/String;
        //   122: astore_3
        //   123: aload #5
        //   125: aload_3
        //   126: iconst_0
        //   127: iconst_0
        //   128: bipush #6
        //   130: aconst_null
        //   131: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   134: aload_0
        //   135: getfield i : Lq8/p;
        //   138: astore #4
        //   140: aload_1
        //   141: ifnull -> 155
        //   144: aload_1
        //   145: invokevirtual getStr : ()Ljava/lang/String;
        //   148: astore_3
        //   149: aload_3
        //   150: astore_1
        //   151: aload_3
        //   152: ifnonnull -> 158
        //   155: ldc ''
        //   157: astore_1
        //   158: aload #4
        //   160: aload_1
        //   161: aload_2
        //   162: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   167: pop
        //   168: return
      }
    }
    
    static final class b0 extends r8.n implements q8.r<MqttResponse, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> {
      b0(Device param2Device, q8.a<e8.q> param2a, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param2r) {
        super(4);
      }
      
      public final void a(MqttResponse param2MqttResponse, com.smartpek.data.local.models.b param2b, Throwable param2Throwable, boolean param2Boolean) {
        Device device1;
        r8.m.j(param2b, "action");
        if (param2Throwable != null) {
          device1 = this.g;
          if (device1 != null)
            Device.errorInConnection$default(device1, false, 0, 3, null); 
          this.h.invoke();
          return;
        } 
        x7.c.a a1 = x7.c.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("toggle() > ");
        stringBuilder.append(device1);
        x7.c.a.b(a1, "Me-Power", stringBuilder.toString(), false, 4, null);
        Device device2 = this.g;
        if (device2 != null)
          Device.errorInConnection$default(device2, false, 0, 2, null); 
        if (!param2Boolean) {
          Device device = this.g;
          if (device != null) {
            if (device1 != null) {
              String str = device1.getStr();
            } else {
              device2 = null;
            } 
            Device.updateState$default(device, (String)device2, false, 0, 6, null);
          } 
        } 
        q8.r<String, String, com.smartpek.data.local.models.b, Boolean, e8.q> r1 = this.i;
        if (device1 != null) {
          String str = device1.getStr();
        } else {
          device1 = null;
        } 
        r1.n(device1, null, param2b, Boolean.valueOf(param2Boolean));
      }
    }
    
    static final class c extends r8.n implements q8.a<e8.q> {
      public static final c g = new c();
      
      c() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class d extends r8.n implements q8.a<e8.q> {
      public static final d g = new d();
      
      d() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class e extends r8.n implements q8.r<String, String, com.smartpek.data.local.models.b, Boolean, e8.q> {
      public static final e g = new e();
      
      e() {
        super(4);
      }
      
      public final void a(String param2String1, String param2String2, com.smartpek.data.local.models.b param2b, boolean param2Boolean) {}
    }
    
    static final class f extends r8.n implements q8.a<e8.q> {
      public static final f g = new f();
      
      f() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class g extends r8.n implements q8.a<e8.q> {
      public static final g g = new g();
      
      g() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class h extends r8.n implements q8.r<String, String, com.smartpek.data.local.models.b, Boolean, e8.q> {
      public static final h g = new h();
      
      h() {
        super(4);
      }
      
      public final void a(String param2String1, String param2String2, com.smartpek.data.local.models.b param2b, boolean param2Boolean) {}
    }
    
    static final class i extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
      i(d param2d, r8.x param2x, c param2c, q8.a<e8.q> param2a, androidx.fragment.app.e param2e, Context param2Context) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        r8.m.j(param2f, "s");
        int j = b.a[param2f.ordinal()];
        if (j != 1) {
          if (j != 2 && j != 3 && j != 4)
            return; 
          this.j.invoke();
          return;
        } 
        this.g.a(p7.t.a() + 5000L);
        this.h.g = true;
        if (this.i != c.NTFY || !MainAct.v.c())
          c0.q(new a(this.k, this.l)); 
        aa.c.d().m(a5.a.CONNECTING);
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        a(androidx.fragment.app.e param3e, Context param3Context) {
          super(0);
        }
        
        public final void invoke() {
          Context context;
          androidx.fragment.app.e e1 = this.g;
          if (e1 == null)
            context = this.h; 
          if (context != null)
            v1.k(context, 2131951793, 0, null, 6, null); 
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(androidx.fragment.app.e param2e, Context param2Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        androidx.fragment.app.e e1 = this.g;
        if (e1 == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131951793, 0, null, 6, null); 
      }
    }
    
    static final class j extends r8.n implements q8.a<e8.q> {
      public static final j g = new j();
      
      j() {
        super(0);
      }
      
      public final void invoke() {
        aa.c.d().m(r6.e.UDP);
      }
    }
    
    static final class k extends r8.n implements q8.a<e8.q> {
      k(d param2d, androidx.fragment.app.e param2e, Context param2Context, int param2Int, Integer param2Integer, Device param2Device, com.smartpek.ui.customviews.c param2c, c param2c1, r8.x param2x, q8.a<e8.q> param2a, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param2r) {
        super(0);
      }
      
      public final void invoke() {
        this.g.a(p7.t.a());
        aa.c.d().m(a5.a.CONNECTED);
        d.b.u(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o.g, false, this.p, this.q, 256, null);
      }
    }
    
    static final class l extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
      l(d param2d, c param2c, q8.a<e8.q> param2a, androidx.fragment.app.e param2e, Context param2Context) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        r8.m.j(param2f, "state");
        int i = b.a[param2f.ordinal()];
        if (i != 1) {
          if (i != 2 && i != 3 && i != 4)
            return; 
          this.i.invoke();
          return;
        } 
        this.g.a(p7.t.a() + 8000L);
        if (this.h != c.NTFY || !MainAct.v.c())
          c0.q(new a(this.j, this.k)); 
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        a(androidx.fragment.app.e param3e, Context param3Context) {
          super(0);
        }
        
        public final void invoke() {
          Context context;
          androidx.fragment.app.e e1 = this.g;
          if (e1 == null)
            context = this.h; 
          if (context != null)
            v1.k(context, 2131951793, 0, null, 6, null); 
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(androidx.fragment.app.e param2e, Context param2Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        androidx.fragment.app.e e1 = this.g;
        if (e1 == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131951793, 0, null, 6, null); 
      }
    }
    
    static final class m extends r8.n implements q8.a<e8.q> {
      public static final m g = new m();
      
      m() {
        super(0);
      }
      
      public final void invoke() {
        aa.c.d().m(r6.e.UDP);
      }
    }
    
    static final class n extends r8.n implements q8.a<e8.q> {
      n(d param2d, androidx.fragment.app.e param2e, Context param2Context, int param2Int, Device param2Device, q8.a<e8.q> param2a1, q8.a<e8.q> param2a2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param2p) {
        super(0);
      }
      
      public final void invoke() {
        this.g.a(p7.t.a());
        d.b.c(this.g, (Activity)this.h, this.i, this.j, this.k, this.l, this.m, this.n);
      }
    }
    
    static final class o extends r8.n implements q8.l<Boolean, e8.q> {
      o(q8.a<e8.q> param2a1, q8.a<e8.q> param2a2) {
        super(1);
      }
      
      public final void a(boolean param2Boolean) {
        q8.a<e8.q> a1;
        if (param2Boolean) {
          a1 = this.g;
        } else {
          a1 = this.h;
        } 
        a1.invoke();
      }
    }
    
    static final class p extends r8.n implements q8.a<e8.q> {
      p(d param2d, androidx.fragment.app.e param2e, Context param2Context, int param2Int, byte param2Byte, com.smartpek.data.local.models.b param2b, Device param2Device, r6.e param2e1, boolean param2Boolean1, boolean param2Boolean2, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r1) {
        super(0);
      }
      
      public final void invoke() {
        d.b.d(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
      }
    }
    
    static final class q extends r8.n implements q8.a<e8.q> {
      q(r6.e param2e, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, com.smartpek.data.local.models.b param2b, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r1) {
        super(0);
      }
      
      public final void invoke() {
        r6.e e1 = this.g;
        if (e1 == r6.e.UDP || e1 == r6.e.UNKNOWN) {
          this.h.n(null, this.i, new Exception(""), Boolean.FALSE);
          return;
        } 
        this.j.n(null, this.i, new Exception(""), Boolean.FALSE);
      }
    }
    
    static final class r extends r8.n implements q8.a<e8.q> {
      r(r6.e param2e, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, com.smartpek.data.local.models.b param2b, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r1) {
        super(0);
      }
      
      public final void invoke() {
        try {
          r6.e e1 = this.g;
          return;
        } finally {
          Exception exception = null;
          exception.printStackTrace();
        } 
      }
    }
    
    static final class s extends r8.n implements q8.l<p6.n, e8.q> {
      s(Device param2Device, androidx.fragment.app.e param2e, boolean param2Boolean, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, com.smartpek.data.local.models.b param2b, int param2Int) {
        super(1);
      }
      
      public final void a(p6.n param2n) {
        Device device = null;
        if (param2n != null) {
          String str1;
          if (this.g.isDemo()) {
            int j = com.smartpek.data.local.models.e.CREATOR.f();
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("http://127.0.0.1:");
            stringBuilder1.append(j);
            stringBuilder1.append("/");
            param2n.c(stringBuilder1.toString());
          } 
          p6.e e1 = new p6.e((Context)this.h);
          String str2 = param2n.b();
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append("Device?");
          p6.e e2 = e1.m(stringBuilder.toString());
          if (this.i) {
            str1 = "7";
          } else {
            str1 = "8";
          } 
          e2 = e2.h("CMD", str1);
          boolean bool = this.i;
          int i = this.l;
          Device device1 = this.g;
          if (!bool) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("ch");
            stringBuilder.append(i);
            e2.h("control_type", stringBuilder.toString());
            e2.h("action", "on");
            try {
              String str;
              Channel[] arrayOfChannel = device1.getChannels();
              device1 = device;
              if (arrayOfChannel != null) {
                Channel channel = arrayOfChannel[i];
                device1 = device;
                if (channel != null)
                  str = channel.getCustomCode(); 
              } 
              r8.m.g(str);
              e2.h("data", String.valueOf(q1.c((new JSONObject(str)).optString("d"))));
            } finally {
              device1 = null;
            } 
          } 
          e2.i(new a(this.j, param2n, this.l, this.k), new b(this.j, this.k));
          return;
        } 
        this.j.n(null, this.k, new Exception(""), Boolean.FALSE);
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param3r, p6.n param3n, int param3Int, com.smartpek.data.local.models.b param3b) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "response");
          try {
            int i;
            JSONObject jSONObject = new JSONObject(param3String);
            q8.r<p6.n, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> r1 = this.g;
            String str = this.h.b();
            v4.b b1 = v4.b.State;
            if (this.i == 0) {
              i = jSONObject.getInt("ch0_state");
            } else {
              i = 0;
            } 
            Response.Data data1 = new Response.Data(0, i, 1000L, 0.0F, 8, null);
            if (this.i == 1) {
              i = jSONObject.getInt("ch1_state");
            } else {
              i = 0;
            } 
            Response.Data data2 = new Response.Data(1, i, 1000L, 0.0F, 8, null);
            if (this.i == 2) {
              i = jSONObject.getInt("ch2_state");
            } else {
              i = 0;
            } 
            return;
          } finally {
            param3String = null;
            param3String.printStackTrace();
            this.g.n(null, this.j, param3String, Boolean.FALSE);
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param3r, com.smartpek.data.local.models.b param3b) {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "error");
          this.g.n(null, this.h, param3VolleyError, Boolean.FALSE);
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, p6.n param2n, int param2Int, com.smartpek.data.local.models.b param2b) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          int i;
          JSONObject jSONObject = new JSONObject(param2String);
          q8.r<p6.n, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> r1 = this.g;
          String str = this.h.b();
          v4.b b1 = v4.b.State;
          if (this.i == 0) {
            i = jSONObject.getInt("ch0_state");
          } else {
            i = 0;
          } 
          Response.Data data1 = new Response.Data(0, i, 1000L, 0.0F, 8, null);
          if (this.i == 1) {
            i = jSONObject.getInt("ch1_state");
          } else {
            i = 0;
          } 
          Response.Data data2 = new Response.Data(1, i, 1000L, 0.0F, 8, null);
          if (this.i == 2) {
            i = jSONObject.getInt("ch2_state");
          } else {
            i = 0;
          } 
          return;
        } finally {
          param2String = null;
          param2String.printStackTrace();
          this.g.n(null, this.j, param2String, Boolean.FALSE);
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, com.smartpek.data.local.models.b param2b) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "error");
        this.g.n(null, this.h, param2VolleyError, Boolean.FALSE);
      }
    }
    
    static final class t extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      t(com.smartpek.data.local.models.b param2b, r6.e param2e, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r) {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        x7.c.a a = x7.c.a;
        com.smartpek.data.local.models.b b1 = this.g;
        r6.e e1 = this.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("run() action: ");
        stringBuilder.append(b1);
        stringBuilder.append(", connType: ");
        stringBuilder.append(e1);
        stringBuilder.append(" > ");
        stringBuilder.append(param2n);
        x7.c.a.b(a, "Me-Power", stringBuilder.toString(), false, 4, null);
        this.i.n(param2n, this.g, param2Throwable, Boolean.FALSE);
      }
    }
    
    static final class u extends r8.n implements q8.l<Object, e8.q> {
      u(com.smartpek.data.local.models.b param2b, r6.e param2e, Device param2Device, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r, int param2Int) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        // Byte code:
        //   0: aload_1
        //   1: ldc 'response'
        //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
        //   6: getstatic x7/c.a : Lx7/c$a;
        //   9: astore #4
        //   11: aload_0
        //   12: getfield g : Lcom/smartpek/data/local/models/b;
        //   15: astore #5
        //   17: aload_0
        //   18: getfield h : Lr6/e;
        //   21: astore #6
        //   23: new java/lang/StringBuilder
        //   26: dup
        //   27: invokespecial <init> : ()V
        //   30: astore #7
        //   32: aload #7
        //   34: ldc 'run() action: '
        //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   39: pop
        //   40: aload #7
        //   42: aload #5
        //   44: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   47: pop
        //   48: aload #7
        //   50: ldc ', connType: '
        //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   55: pop
        //   56: aload #7
        //   58: aload #6
        //   60: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   63: pop
        //   64: aload #7
        //   66: ldc ' > '
        //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   71: pop
        //   72: aload #7
        //   74: aload_1
        //   75: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   78: pop
        //   79: aload #4
        //   81: ldc 'Me-Power'
        //   83: aload #7
        //   85: invokevirtual toString : ()Ljava/lang/String;
        //   88: iconst_0
        //   89: iconst_4
        //   90: aconst_null
        //   91: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
        //   94: aload_1
        //   95: checkcast com/smartpek/utils/connection/mqtt/MqttResponse
        //   98: astore #5
        //   100: aload_0
        //   101: getfield i : Lcom/smartpek/data/local/db/models/Device;
        //   104: astore #4
        //   106: aload #4
        //   108: ifnull -> 133
        //   111: aload #4
        //   113: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
        //   116: astore #4
        //   118: aload #4
        //   120: ifnull -> 133
        //   123: aload #4
        //   125: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
        //   128: astore #4
        //   130: goto -> 136
        //   133: aconst_null
        //   134: astore #4
        //   136: aload #4
        //   138: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
        //   141: if_acmpne -> 250
        //   144: new com/google/gson/Gson
        //   147: dup
        //   148: invokespecial <init> : ()V
        //   151: aload #5
        //   153: invokevirtual getStr : ()Ljava/lang/String;
        //   156: ldc com/smartpek/data/remote/Response
        //   158: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   161: astore #4
        //   163: aload_0
        //   164: getfield k : I
        //   167: istore_3
        //   168: aload #4
        //   170: checkcast com/smartpek/data/remote/Response
        //   173: astore #4
        //   175: aload #4
        //   177: invokevirtual getData : ()Ljava/util/List;
        //   180: invokeinterface iterator : ()Ljava/util/Iterator;
        //   185: astore #6
        //   187: iconst_0
        //   188: istore_2
        //   189: aload #6
        //   191: invokeinterface hasNext : ()Z
        //   196: ifeq -> 240
        //   199: aload #6
        //   201: invokeinterface next : ()Ljava/lang/Object;
        //   206: astore #7
        //   208: iload_2
        //   209: ifge -> 215
        //   212: invokestatic r : ()V
        //   215: aload #7
        //   217: checkcast com/smartpek/data/remote/Response$Data
        //   220: astore #7
        //   222: iload_3
        //   223: iload_2
        //   224: if_icmpeq -> 233
        //   227: aload #7
        //   229: iconst_0
        //   230: invokevirtual setPowerState : (I)V
        //   233: iload_2
        //   234: iconst_1
        //   235: iadd
        //   236: istore_2
        //   237: goto -> 189
        //   240: aload #5
        //   242: aload #4
        //   244: invokevirtual toJsonString : ()Ljava/lang/String;
        //   247: invokevirtual setStr : (Ljava/lang/String;)V
        //   250: aload_0
        //   251: getfield j : Lq8/r;
        //   254: aload_1
        //   255: aload_0
        //   256: getfield g : Lcom/smartpek/data/local/models/b;
        //   259: aconst_null
        //   260: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
        //   263: invokeinterface n : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   268: pop
        //   269: return
      }
    }
    
    static final class v extends r8.n implements q8.l<Throwable, e8.q> {
      v(com.smartpek.data.local.models.b param2b, r6.e param2e, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param2r) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "it");
        x7.c.a a = x7.c.a;
        com.smartpek.data.local.models.b b1 = this.g;
        r6.e e1 = this.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("run() action: ");
        stringBuilder.append(b1);
        stringBuilder.append(", connType: ");
        stringBuilder.append(e1);
        stringBuilder.append(" > ");
        stringBuilder.append(param2Throwable);
        x7.c.a.b(a, "Me-Power", stringBuilder.toString(), false, 4, null);
        this.i.n(null, this.g, param2Throwable, Boolean.FALSE);
      }
    }
    
    static final class w extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      w(q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b) {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        this.g.g(param2n, this.h, param2Throwable);
      }
    }
    
    static final class x extends r8.n implements q8.l<Object, e8.q> {
      x(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        r8.m.j(param2Object, "response");
        this.g.g(param2Object, this.h, null);
      }
    }
    
    static final class y extends r8.n implements q8.l<Throwable, e8.q> {
      y(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "it");
        this.g.g(null, this.h, param2Throwable);
      }
    }
    
    static final class z extends r8.n implements q8.a<e8.q> {
      z(r6.e param2e, Device param2Device, int param2Int, Activity param2Activity, Context param2Context, q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b, q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q1) {
        super(0);
      }
      
      public final e8.q a() {
        e8.q q1;
        try {
          Context context;
          r6.e e1 = this.g;
          r6.e e2 = r6.e.UDP;
          q1 = null;
          int i = 0;
          if (e1 == e2 || e1 == r6.e.UNKNOWN) {
            byte b1;
            if (this.h != null) {
              b1 = 1;
            } else {
              b1 = 2;
            } 
            ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
                  Byte.valueOf(b1), Byte.valueOf((byte)1), Byte.valueOf((byte)6), Byte.valueOf((byte)this.i), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
                  Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
            Device device = this.h;
            if (device != null) {
              String str = p6.m.O(device);
              if (str != null) {
                char[] arrayOfChar = str.toCharArray();
                r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
                if (arrayOfChar != null) {
                  int j = arrayOfChar.length;
                  while (i < j) {
                    arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48)));
                    i++;
                  } 
                } 
              } 
            } 
            Activity activity1 = this.j;
            return q1;
          } 
          MqttRequest mqttRequest = new MqttRequest("Control", j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(this.i)), e8.n.a("power", Integer.valueOf(6)) }));
          Activity activity = this.j;
        } finally {
          Exception exception = null;
          exception.printStackTrace();
        } 
        return q1;
      }
      
      static final class a extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
        a(q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param3q, com.smartpek.data.local.models.b param3b) {
          super(2);
        }
        
        public final void a(p6.n param3n, Throwable param3Throwable) {
          this.g.g(param3n, this.h, param3Throwable);
        }
      }
      
      static final class b extends r8.n implements q8.l<Object, e8.q> {
        b(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param3q, com.smartpek.data.local.models.b param3b) {
          super(1);
        }
        
        public final void invoke(Object param3Object) {
          r8.m.j(param3Object, "response");
          this.g.g(param3Object, this.h, null);
        }
      }
      
      static final class c extends r8.n implements q8.l<Throwable, e8.q> {
        c(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param3q, com.smartpek.data.local.models.b param3b) {
          super(1);
        }
        
        public final void invoke(Throwable param3Throwable) {
          r8.m.j(param3Throwable, "it");
          this.g.g(null, this.h, param3Throwable);
        }
      }
    }
    
    static final class a extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      a(q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b) {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        this.g.g(param2n, this.h, param2Throwable);
      }
    }
    
    static final class b extends r8.n implements q8.l<Object, e8.q> {
      b(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        r8.m.j(param2Object, "response");
        this.g.g(param2Object, this.h, null);
      }
    }
    
    static final class c extends r8.n implements q8.l<Throwable, e8.q> {
      c(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param2q, com.smartpek.data.local.models.b param2b) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "it");
        this.g.g(null, this.h, param2Throwable);
      }
    }
  }
  
  static final class a extends r8.n implements q8.q<p6.n, com.smartpek.data.local.models.b, Throwable, e8.q> {
    a(Device param1Device, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param1p, q8.a<e8.q> param1a, Activity param1Activity, Context param1Context) {
      super(3);
    }
    
    public final void a(p6.n param1n, com.smartpek.data.local.models.b param1b, Throwable param1Throwable) {
      // Byte code:
      //   0: aload_2
      //   1: ldc 'action'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aconst_null
      //   7: astore #6
      //   9: iconst_0
      //   10: istore #5
      //   12: aload_3
      //   13: ifnonnull -> 139
      //   16: getstatic x7/c.a : Lx7/c$a;
      //   19: astore #8
      //   21: aload_1
      //   22: ifnull -> 39
      //   25: aload_1
      //   26: invokevirtual a : ()Ljava/lang/String;
      //   29: astore #7
      //   31: aload #7
      //   33: astore_3
      //   34: aload #7
      //   36: ifnonnull -> 42
      //   39: ldc 'null'
      //   41: astore_3
      //   42: aload #8
      //   44: ldc 'Me-Power'
      //   46: aload_3
      //   47: iconst_0
      //   48: iconst_4
      //   49: aconst_null
      //   50: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   53: aload_0
      //   54: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   57: astore_3
      //   58: aload_3
      //   59: ifnull -> 70
      //   62: aload_3
      //   63: iconst_0
      //   64: iconst_0
      //   65: iconst_2
      //   66: aconst_null
      //   67: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
      //   70: aload_0
      //   71: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   74: astore #7
      //   76: aload #7
      //   78: ifnull -> 104
      //   81: aload #6
      //   83: astore_3
      //   84: aload_1
      //   85: ifnull -> 93
      //   88: aload_1
      //   89: invokevirtual a : ()Ljava/lang/String;
      //   92: astore_3
      //   93: aload #7
      //   95: aload_3
      //   96: iconst_0
      //   97: iconst_0
      //   98: bipush #6
      //   100: aconst_null
      //   101: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   104: aload_0
      //   105: getfield h : Lq8/p;
      //   108: astore #6
      //   110: aload_1
      //   111: ifnull -> 125
      //   114: aload_1
      //   115: invokevirtual a : ()Ljava/lang/String;
      //   118: astore_3
      //   119: aload_3
      //   120: astore_1
      //   121: aload_3
      //   122: ifnonnull -> 128
      //   125: ldc ''
      //   127: astore_1
      //   128: aload #6
      //   130: aload_1
      //   131: aload_2
      //   132: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   137: pop
      //   138: return
      //   139: aload_0
      //   140: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   143: astore_1
      //   144: aload_1
      //   145: ifnull -> 156
      //   148: aload_1
      //   149: iconst_0
      //   150: iconst_0
      //   151: iconst_3
      //   152: aconst_null
      //   153: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
      //   156: aload_0
      //   157: getfield i : Lq8/a;
      //   160: invokeinterface invoke : ()Ljava/lang/Object;
      //   165: pop
      //   166: getstatic android/os/Build$VERSION.SDK_INT : I
      //   169: bipush #28
      //   171: if_icmplt -> 277
      //   174: aload_0
      //   175: getfield j : Landroid/app/Activity;
      //   178: astore_1
      //   179: aload_1
      //   180: ifnull -> 186
      //   183: goto -> 191
      //   186: aload_0
      //   187: getfield k : Landroid/content/Context;
      //   190: astore_1
      //   191: aload_1
      //   192: ifnull -> 208
      //   195: aload_1
      //   196: invokestatic a : (Landroid/content/Context;)Z
      //   199: ifne -> 208
      //   202: iconst_1
      //   203: istore #4
      //   205: goto -> 211
      //   208: iconst_0
      //   209: istore #4
      //   211: iload #4
      //   213: ifne -> 258
      //   216: aload_0
      //   217: getfield j : Landroid/app/Activity;
      //   220: astore_1
      //   221: aload_1
      //   222: ifnull -> 228
      //   225: goto -> 233
      //   228: aload_0
      //   229: getfield k : Landroid/content/Context;
      //   232: astore_1
      //   233: aload_1
      //   234: ifnull -> 250
      //   237: aload_1
      //   238: invokestatic a : (Landroid/content/Context;)Z
      //   241: ifne -> 250
      //   244: iconst_1
      //   245: istore #4
      //   247: goto -> 253
      //   250: iconst_0
      //   251: istore #4
      //   253: iload #4
      //   255: ifeq -> 277
      //   258: getstatic t6/c.f : Lt6/c$a;
      //   261: aload_0
      //   262: getfield j : Landroid/app/Activity;
      //   265: invokevirtual a : (Landroid/app/Activity;)Lt6/c;
      //   268: aconst_null
      //   269: lconst_0
      //   270: aconst_null
      //   271: bipush #7
      //   273: aconst_null
      //   274: invokestatic q : (Lt6/c;Lt6/c$b;JLq8/l;ILjava/lang/Object;)V
      //   277: aload_0
      //   278: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   281: astore_1
      //   282: iload #5
      //   284: istore #4
      //   286: aload_1
      //   287: ifnull -> 305
      //   290: iload #5
      //   292: istore #4
      //   294: aload_1
      //   295: invokevirtual isDemo : ()Z
      //   298: iconst_1
      //   299: if_icmpne -> 305
      //   302: iconst_1
      //   303: istore #4
      //   305: iload #4
      //   307: ifeq -> 337
      //   310: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   313: invokevirtual j : ()Z
      //   316: ifne -> 337
      //   319: new c5/d$b$a$a
      //   322: dup
      //   323: aload_0
      //   324: getfield j : Landroid/app/Activity;
      //   327: aload_0
      //   328: getfield k : Landroid/content/Context;
      //   331: invokespecial <init> : (Landroid/app/Activity;Landroid/content/Context;)V
      //   334: invokestatic q : (Lq8/a;)V
      //   337: return
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(Activity param3Activity, Context param3Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        Activity activity = this.g;
        if (activity == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131952299, 0, null, 6, null); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(Activity param1Activity, Context param1Context) {
      super(0);
    }
    
    public final void invoke() {
      Context context;
      Activity activity = this.g;
      if (activity == null)
        context = this.h; 
      if (context != null)
        v1.k(context, 2131952299, 0, null, 6, null); 
    }
  }
  
  static final class a0 extends r8.n implements q8.r<p6.n, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> {
    a0(Device param1Device, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r, q8.a<e8.q> param1a, androidx.fragment.app.e param1e, Context param1Context) {
      super(4);
    }
    
    public final void a(p6.n param1n, com.smartpek.data.local.models.b param1b, Throwable param1Throwable, boolean param1Boolean) {
      // Byte code:
      //   0: aload_2
      //   1: ldc 'action'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aconst_null
      //   7: astore #7
      //   9: iconst_0
      //   10: istore #6
      //   12: aload_3
      //   13: ifnonnull -> 159
      //   16: getstatic x7/c.a : Lx7/c$a;
      //   19: astore #9
      //   21: aload_1
      //   22: ifnull -> 39
      //   25: aload_1
      //   26: invokevirtual a : ()Ljava/lang/String;
      //   29: astore #8
      //   31: aload #8
      //   33: astore_3
      //   34: aload #8
      //   36: ifnonnull -> 42
      //   39: ldc 'null'
      //   41: astore_3
      //   42: aload #9
      //   44: ldc 'Me-Power'
      //   46: aload_3
      //   47: iconst_0
      //   48: iconst_4
      //   49: aconst_null
      //   50: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   53: aload_0
      //   54: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   57: astore_3
      //   58: aload_3
      //   59: ifnull -> 70
      //   62: aload_3
      //   63: iconst_0
      //   64: iconst_0
      //   65: iconst_2
      //   66: aconst_null
      //   67: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
      //   70: iload #4
      //   72: ifne -> 111
      //   75: aload_0
      //   76: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   79: astore #8
      //   81: aload #8
      //   83: ifnull -> 111
      //   86: aload_1
      //   87: ifnull -> 98
      //   90: aload_1
      //   91: invokevirtual a : ()Ljava/lang/String;
      //   94: astore_3
      //   95: goto -> 100
      //   98: aconst_null
      //   99: astore_3
      //   100: aload #8
      //   102: aload_3
      //   103: iconst_0
      //   104: iconst_0
      //   105: bipush #6
      //   107: aconst_null
      //   108: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   111: aload_0
      //   112: getfield h : Lq8/r;
      //   115: astore #8
      //   117: aload_1
      //   118: ifnull -> 129
      //   121: aload_1
      //   122: invokevirtual a : ()Ljava/lang/String;
      //   125: astore_3
      //   126: goto -> 131
      //   129: aconst_null
      //   130: astore_3
      //   131: aload_1
      //   132: ifnull -> 141
      //   135: aload_1
      //   136: invokevirtual b : ()Ljava/lang/String;
      //   139: astore #7
      //   141: aload #8
      //   143: aload_3
      //   144: aload #7
      //   146: aload_2
      //   147: iload #4
      //   149: invokestatic valueOf : (Z)Ljava/lang/Boolean;
      //   152: invokeinterface n : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   157: pop
      //   158: return
      //   159: aload_0
      //   160: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   163: astore_1
      //   164: aload_1
      //   165: ifnull -> 176
      //   168: aload_1
      //   169: iconst_0
      //   170: iconst_0
      //   171: iconst_3
      //   172: aconst_null
      //   173: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
      //   176: aload_0
      //   177: getfield i : Lq8/a;
      //   180: invokeinterface invoke : ()Ljava/lang/Object;
      //   185: pop
      //   186: getstatic android/os/Build$VERSION.SDK_INT : I
      //   189: bipush #28
      //   191: if_icmplt -> 297
      //   194: aload_0
      //   195: getfield j : Landroidx/fragment/app/e;
      //   198: astore_1
      //   199: aload_1
      //   200: ifnull -> 206
      //   203: goto -> 211
      //   206: aload_0
      //   207: getfield k : Landroid/content/Context;
      //   210: astore_1
      //   211: aload_1
      //   212: ifnull -> 228
      //   215: aload_1
      //   216: invokestatic a : (Landroid/content/Context;)Z
      //   219: ifne -> 228
      //   222: iconst_1
      //   223: istore #5
      //   225: goto -> 231
      //   228: iconst_0
      //   229: istore #5
      //   231: iload #5
      //   233: ifne -> 278
      //   236: aload_0
      //   237: getfield j : Landroidx/fragment/app/e;
      //   240: astore_1
      //   241: aload_1
      //   242: ifnull -> 248
      //   245: goto -> 253
      //   248: aload_0
      //   249: getfield k : Landroid/content/Context;
      //   252: astore_1
      //   253: aload_1
      //   254: ifnull -> 270
      //   257: aload_1
      //   258: invokestatic a : (Landroid/content/Context;)Z
      //   261: ifne -> 270
      //   264: iconst_1
      //   265: istore #5
      //   267: goto -> 273
      //   270: iconst_0
      //   271: istore #5
      //   273: iload #5
      //   275: ifeq -> 297
      //   278: getstatic t6/c.f : Lt6/c$a;
      //   281: aload_0
      //   282: getfield j : Landroidx/fragment/app/e;
      //   285: invokevirtual a : (Landroid/app/Activity;)Lt6/c;
      //   288: aconst_null
      //   289: lconst_0
      //   290: aconst_null
      //   291: bipush #7
      //   293: aconst_null
      //   294: invokestatic q : (Lt6/c;Lt6/c$b;JLq8/l;ILjava/lang/Object;)V
      //   297: aload_0
      //   298: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   301: astore_1
      //   302: iload #6
      //   304: istore #5
      //   306: aload_1
      //   307: ifnull -> 325
      //   310: iload #6
      //   312: istore #5
      //   314: aload_1
      //   315: invokevirtual isDemo : ()Z
      //   318: iconst_1
      //   319: if_icmpne -> 325
      //   322: iconst_1
      //   323: istore #5
      //   325: iload #5
      //   327: ifeq -> 357
      //   330: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   333: invokevirtual j : ()Z
      //   336: ifne -> 357
      //   339: new c5/d$b$a0$a
      //   342: dup
      //   343: aload_0
      //   344: getfield j : Landroidx/fragment/app/e;
      //   347: aload_0
      //   348: getfield k : Landroid/content/Context;
      //   351: invokespecial <init> : (Landroidx/fragment/app/e;Landroid/content/Context;)V
      //   354: invokestatic q : (Lq8/a;)V
      //   357: return
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(androidx.fragment.app.e param3e, Context param3Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        androidx.fragment.app.e e1 = this.g;
        if (e1 == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131952299, 0, null, 6, null); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(androidx.fragment.app.e param1e, Context param1Context) {
      super(0);
    }
    
    public final void invoke() {
      Context context;
      androidx.fragment.app.e e1 = this.g;
      if (e1 == null)
        context = this.h; 
      if (context != null)
        v1.k(context, 2131952299, 0, null, 6, null); 
    }
  }
  
  static final class b extends r8.n implements q8.q<MqttResponse, com.smartpek.data.local.models.b, Throwable, e8.q> {
    b(Device param1Device, q8.a<e8.q> param1a, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param1p) {
      super(3);
    }
    
    public final void a(MqttResponse param1MqttResponse, com.smartpek.data.local.models.b param1b, Throwable param1Throwable) {
      // Byte code:
      //   0: aload_2
      //   1: ldc 'action'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aconst_null
      //   7: astore #4
      //   9: aload_3
      //   10: ifnull -> 41
      //   13: aload_0
      //   14: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   17: astore_1
      //   18: aload_1
      //   19: ifnull -> 30
      //   22: aload_1
      //   23: iconst_0
      //   24: iconst_0
      //   25: iconst_3
      //   26: aconst_null
      //   27: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
      //   30: aload_0
      //   31: getfield h : Lq8/a;
      //   34: invokeinterface invoke : ()Ljava/lang/Object;
      //   39: pop
      //   40: return
      //   41: getstatic x7/c.a : Lx7/c$a;
      //   44: astore_3
      //   45: new java/lang/StringBuilder
      //   48: dup
      //   49: invokespecial <init> : ()V
      //   52: astore #5
      //   54: aload #5
      //   56: ldc 'toggle() > '
      //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   61: pop
      //   62: aload #5
      //   64: aload_1
      //   65: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   68: pop
      //   69: aload_3
      //   70: ldc 'Me-Power'
      //   72: aload #5
      //   74: invokevirtual toString : ()Ljava/lang/String;
      //   77: iconst_0
      //   78: iconst_4
      //   79: aconst_null
      //   80: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   83: aload_0
      //   84: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   87: astore_3
      //   88: aload_3
      //   89: ifnull -> 100
      //   92: aload_3
      //   93: iconst_0
      //   94: iconst_0
      //   95: iconst_2
      //   96: aconst_null
      //   97: invokestatic errorInConnection$default : (Lcom/smartpek/data/local/db/models/Device;ZIILjava/lang/Object;)V
      //   100: aload_0
      //   101: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   104: astore #5
      //   106: aload #5
      //   108: ifnull -> 134
      //   111: aload #4
      //   113: astore_3
      //   114: aload_1
      //   115: ifnull -> 123
      //   118: aload_1
      //   119: invokevirtual getStr : ()Ljava/lang/String;
      //   122: astore_3
      //   123: aload #5
      //   125: aload_3
      //   126: iconst_0
      //   127: iconst_0
      //   128: bipush #6
      //   130: aconst_null
      //   131: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   134: aload_0
      //   135: getfield i : Lq8/p;
      //   138: astore #4
      //   140: aload_1
      //   141: ifnull -> 155
      //   144: aload_1
      //   145: invokevirtual getStr : ()Ljava/lang/String;
      //   148: astore_3
      //   149: aload_3
      //   150: astore_1
      //   151: aload_3
      //   152: ifnonnull -> 158
      //   155: ldc ''
      //   157: astore_1
      //   158: aload #4
      //   160: aload_1
      //   161: aload_2
      //   162: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   167: pop
      //   168: return
    }
  }
  
  static final class b0 extends r8.n implements q8.r<MqttResponse, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> {
    b0(Device param1Device, q8.a<e8.q> param1a, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r) {
      super(4);
    }
    
    public final void a(MqttResponse param1MqttResponse, com.smartpek.data.local.models.b param1b, Throwable param1Throwable, boolean param1Boolean) {
      Device device1;
      r8.m.j(param1b, "action");
      if (param1Throwable != null) {
        device1 = this.g;
        if (device1 != null)
          Device.errorInConnection$default(device1, false, 0, 3, null); 
        this.h.invoke();
        return;
      } 
      x7.c.a a1 = x7.c.a;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("toggle() > ");
      stringBuilder.append(device1);
      x7.c.a.b(a1, "Me-Power", stringBuilder.toString(), false, 4, null);
      Device device2 = this.g;
      if (device2 != null)
        Device.errorInConnection$default(device2, false, 0, 2, null); 
      if (!param1Boolean) {
        Device device = this.g;
        if (device != null) {
          if (device1 != null) {
            String str = device1.getStr();
          } else {
            device2 = null;
          } 
          Device.updateState$default(device, (String)device2, false, 0, 6, null);
        } 
      } 
      q8.r<String, String, com.smartpek.data.local.models.b, Boolean, e8.q> r1 = this.i;
      if (device1 != null) {
        String str = device1.getStr();
      } else {
        device1 = null;
      } 
      r1.n(device1, null, param1b, Boolean.valueOf(param1Boolean));
    }
  }
  
  static final class c extends r8.n implements q8.a<e8.q> {
    public static final c g = new c();
    
    c() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class d extends r8.n implements q8.a<e8.q> {
    public static final d g = new d();
    
    d() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class e extends r8.n implements q8.r<String, String, com.smartpek.data.local.models.b, Boolean, e8.q> {
    public static final e g = new e();
    
    e() {
      super(4);
    }
    
    public final void a(String param1String1, String param1String2, com.smartpek.data.local.models.b param1b, boolean param1Boolean) {}
  }
  
  static final class f extends r8.n implements q8.a<e8.q> {
    public static final f g = new f();
    
    f() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class g extends r8.n implements q8.a<e8.q> {
    public static final g g = new g();
    
    g() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class h extends r8.n implements q8.r<String, String, com.smartpek.data.local.models.b, Boolean, e8.q> {
    public static final h g = new h();
    
    h() {
      super(4);
    }
    
    public final void a(String param1String1, String param1String2, com.smartpek.data.local.models.b param1b, boolean param1Boolean) {}
  }
  
  static final class i extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
    i(d param1d, r8.x param1x, c param1c, q8.a<e8.q> param1a, androidx.fragment.app.e param1e, Context param1Context) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      r8.m.j(param1f, "s");
      int j = b.a[param1f.ordinal()];
      if (j != 1) {
        if (j != 2 && j != 3 && j != 4)
          return; 
        this.j.invoke();
        return;
      } 
      this.g.a(p7.t.a() + 5000L);
      this.h.g = true;
      if (this.i != c.NTFY || !MainAct.v.c())
        c0.q(new a(this.k, this.l)); 
      aa.c.d().m(a5.a.CONNECTING);
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(androidx.fragment.app.e param3e, Context param3Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        androidx.fragment.app.e e1 = this.g;
        if (e1 == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131951793, 0, null, 6, null); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(androidx.fragment.app.e param1e, Context param1Context) {
      super(0);
    }
    
    public final void invoke() {
      Context context;
      androidx.fragment.app.e e1 = this.g;
      if (e1 == null)
        context = this.h; 
      if (context != null)
        v1.k(context, 2131951793, 0, null, 6, null); 
    }
  }
  
  static final class j extends r8.n implements q8.a<e8.q> {
    public static final j g = new j();
    
    j() {
      super(0);
    }
    
    public final void invoke() {
      aa.c.d().m(r6.e.UDP);
    }
  }
  
  static final class k extends r8.n implements q8.a<e8.q> {
    k(d param1d, androidx.fragment.app.e param1e, Context param1Context, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, r8.x param1x, q8.a<e8.q> param1a, q8.r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, e8.q> param1r) {
      super(0);
    }
    
    public final void invoke() {
      this.g.a(p7.t.a());
      aa.c.d().m(a5.a.CONNECTED);
      d.b.u(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o.g, false, this.p, this.q, 256, null);
    }
  }
  
  static final class l extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
    l(d param1d, c param1c, q8.a<e8.q> param1a, androidx.fragment.app.e param1e, Context param1Context) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      r8.m.j(param1f, "state");
      int i = b.a[param1f.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3 && i != 4)
          return; 
        this.i.invoke();
        return;
      } 
      this.g.a(p7.t.a() + 8000L);
      if (this.h != c.NTFY || !MainAct.v.c())
        c0.q(new a(this.j, this.k)); 
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(androidx.fragment.app.e param3e, Context param3Context) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        androidx.fragment.app.e e1 = this.g;
        if (e1 == null)
          context = this.h; 
        if (context != null)
          v1.k(context, 2131951793, 0, null, 6, null); 
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(androidx.fragment.app.e param1e, Context param1Context) {
      super(0);
    }
    
    public final void invoke() {
      Context context;
      androidx.fragment.app.e e1 = this.g;
      if (e1 == null)
        context = this.h; 
      if (context != null)
        v1.k(context, 2131951793, 0, null, 6, null); 
    }
  }
  
  static final class m extends r8.n implements q8.a<e8.q> {
    public static final m g = new m();
    
    m() {
      super(0);
    }
    
    public final void invoke() {
      aa.c.d().m(r6.e.UDP);
    }
  }
  
  static final class n extends r8.n implements q8.a<e8.q> {
    n(d param1d, androidx.fragment.app.e param1e, Context param1Context, int param1Int, Device param1Device, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.p<? super String, ? super com.smartpek.data.local.models.b, e8.q> param1p) {
      super(0);
    }
    
    public final void invoke() {
      this.g.a(p7.t.a());
      d.b.c(this.g, (Activity)this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }
  }
  
  static final class o extends r8.n implements q8.l<Boolean, e8.q> {
    o(q8.a<e8.q> param1a1, q8.a<e8.q> param1a2) {
      super(1);
    }
    
    public final void a(boolean param1Boolean) {
      q8.a<e8.q> a1;
      if (param1Boolean) {
        a1 = this.g;
      } else {
        a1 = this.h;
      } 
      a1.invoke();
    }
  }
  
  static final class p extends r8.n implements q8.a<e8.q> {
    p(d param1d, androidx.fragment.app.e param1e, Context param1Context, int param1Int, byte param1Byte, com.smartpek.data.local.models.b param1b, Device param1Device, r6.e param1e1, boolean param1Boolean1, boolean param1Boolean2, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r1) {
      super(0);
    }
    
    public final void invoke() {
      d.b.d(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }
  }
  
  static final class q extends r8.n implements q8.a<e8.q> {
    q(r6.e param1e, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, com.smartpek.data.local.models.b param1b, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r1) {
      super(0);
    }
    
    public final void invoke() {
      r6.e e1 = this.g;
      if (e1 == r6.e.UDP || e1 == r6.e.UNKNOWN) {
        this.h.n(null, this.i, new Exception(""), Boolean.FALSE);
        return;
      } 
      this.j.n(null, this.i, new Exception(""), Boolean.FALSE);
    }
  }
  
  static final class r extends r8.n implements q8.a<e8.q> {
    r(r6.e param1e, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, com.smartpek.data.local.models.b param1b, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r1) {
      super(0);
    }
    
    public final void invoke() {
      try {
        r6.e e1 = this.g;
        return;
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      } 
    }
  }
  
  static final class s extends r8.n implements q8.l<p6.n, e8.q> {
    s(Device param1Device, androidx.fragment.app.e param1e, boolean param1Boolean, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, com.smartpek.data.local.models.b param1b, int param1Int) {
      super(1);
    }
    
    public final void a(p6.n param1n) {
      Device device = null;
      if (param1n != null) {
        String str1;
        if (this.g.isDemo()) {
          int j = com.smartpek.data.local.models.e.CREATOR.f();
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("http://127.0.0.1:");
          stringBuilder1.append(j);
          stringBuilder1.append("/");
          param1n.c(stringBuilder1.toString());
        } 
        p6.e e1 = new p6.e((Context)this.h);
        String str2 = param1n.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append("Device?");
        p6.e e2 = e1.m(stringBuilder.toString());
        if (this.i) {
          str1 = "7";
        } else {
          str1 = "8";
        } 
        e2 = e2.h("CMD", str1);
        boolean bool = this.i;
        int i = this.l;
        Device device1 = this.g;
        if (!bool) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("ch");
          stringBuilder.append(i);
          e2.h("control_type", stringBuilder.toString());
          e2.h("action", "on");
          try {
            String str;
            Channel[] arrayOfChannel = device1.getChannels();
            device1 = device;
            if (arrayOfChannel != null) {
              Channel channel = arrayOfChannel[i];
              device1 = device;
              if (channel != null)
                str = channel.getCustomCode(); 
            } 
            r8.m.g(str);
            e2.h("data", String.valueOf(q1.c((new JSONObject(str)).optString("d"))));
          } finally {
            device1 = null;
          } 
        } 
        e2.i(new a(this.j, param1n, this.l, this.k), new b(this.j, this.k));
        return;
      } 
      this.j.n(null, this.k, new Exception(""), Boolean.FALSE);
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param3r, p6.n param3n, int param3Int, com.smartpek.data.local.models.b param3b) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "response");
        try {
          int i;
          JSONObject jSONObject = new JSONObject(param3String);
          q8.r<p6.n, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> r1 = this.g;
          String str = this.h.b();
          v4.b b1 = v4.b.State;
          if (this.i == 0) {
            i = jSONObject.getInt("ch0_state");
          } else {
            i = 0;
          } 
          Response.Data data1 = new Response.Data(0, i, 1000L, 0.0F, 8, null);
          if (this.i == 1) {
            i = jSONObject.getInt("ch1_state");
          } else {
            i = 0;
          } 
          Response.Data data2 = new Response.Data(1, i, 1000L, 0.0F, 8, null);
          if (this.i == 2) {
            i = jSONObject.getInt("ch2_state");
          } else {
            i = 0;
          } 
          return;
        } finally {
          param3String = null;
          param3String.printStackTrace();
          this.g.n(null, this.j, param3String, Boolean.FALSE);
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param3r, com.smartpek.data.local.models.b param3b) {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "error");
        this.g.n(null, this.h, param3VolleyError, Boolean.FALSE);
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, p6.n param1n, int param1Int, com.smartpek.data.local.models.b param1b) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        int i;
        JSONObject jSONObject = new JSONObject(param1String);
        q8.r<p6.n, com.smartpek.data.local.models.b, Throwable, Boolean, e8.q> r1 = this.g;
        String str = this.h.b();
        v4.b b1 = v4.b.State;
        if (this.i == 0) {
          i = jSONObject.getInt("ch0_state");
        } else {
          i = 0;
        } 
        Response.Data data1 = new Response.Data(0, i, 1000L, 0.0F, 8, null);
        if (this.i == 1) {
          i = jSONObject.getInt("ch1_state");
        } else {
          i = 0;
        } 
        Response.Data data2 = new Response.Data(1, i, 1000L, 0.0F, 8, null);
        if (this.i == 2) {
          i = jSONObject.getInt("ch2_state");
        } else {
          i = 0;
        } 
        return;
      } finally {
        param1String = null;
        param1String.printStackTrace();
        this.g.n(null, this.j, param1String, Boolean.FALSE);
      } 
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, com.smartpek.data.local.models.b param1b) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "error");
      this.g.n(null, this.h, param1VolleyError, Boolean.FALSE);
    }
  }
  
  static final class t extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    t(com.smartpek.data.local.models.b param1b, r6.e param1e, q8.r<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r) {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      x7.c.a a = x7.c.a;
      com.smartpek.data.local.models.b b1 = this.g;
      r6.e e1 = this.h;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("run() action: ");
      stringBuilder.append(b1);
      stringBuilder.append(", connType: ");
      stringBuilder.append(e1);
      stringBuilder.append(" > ");
      stringBuilder.append(param1n);
      x7.c.a.b(a, "Me-Power", stringBuilder.toString(), false, 4, null);
      this.i.n(param1n, this.g, param1Throwable, Boolean.FALSE);
    }
  }
  
  static final class u extends r8.n implements q8.l<Object, e8.q> {
    u(com.smartpek.data.local.models.b param1b, r6.e param1e, Device param1Device, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r, int param1Int) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'response'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: getstatic x7/c.a : Lx7/c$a;
      //   9: astore #4
      //   11: aload_0
      //   12: getfield g : Lcom/smartpek/data/local/models/b;
      //   15: astore #5
      //   17: aload_0
      //   18: getfield h : Lr6/e;
      //   21: astore #6
      //   23: new java/lang/StringBuilder
      //   26: dup
      //   27: invokespecial <init> : ()V
      //   30: astore #7
      //   32: aload #7
      //   34: ldc 'run() action: '
      //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   39: pop
      //   40: aload #7
      //   42: aload #5
      //   44: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   47: pop
      //   48: aload #7
      //   50: ldc ', connType: '
      //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   55: pop
      //   56: aload #7
      //   58: aload #6
      //   60: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   63: pop
      //   64: aload #7
      //   66: ldc ' > '
      //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   71: pop
      //   72: aload #7
      //   74: aload_1
      //   75: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   78: pop
      //   79: aload #4
      //   81: ldc 'Me-Power'
      //   83: aload #7
      //   85: invokevirtual toString : ()Ljava/lang/String;
      //   88: iconst_0
      //   89: iconst_4
      //   90: aconst_null
      //   91: invokestatic b : (Lx7/c$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
      //   94: aload_1
      //   95: checkcast com/smartpek/utils/connection/mqtt/MqttResponse
      //   98: astore #5
      //   100: aload_0
      //   101: getfield i : Lcom/smartpek/data/local/db/models/Device;
      //   104: astore #4
      //   106: aload #4
      //   108: ifnull -> 133
      //   111: aload #4
      //   113: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
      //   116: astore #4
      //   118: aload #4
      //   120: ifnull -> 133
      //   123: aload #4
      //   125: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
      //   128: astore #4
      //   130: goto -> 136
      //   133: aconst_null
      //   134: astore #4
      //   136: aload #4
      //   138: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
      //   141: if_acmpne -> 250
      //   144: new com/google/gson/Gson
      //   147: dup
      //   148: invokespecial <init> : ()V
      //   151: aload #5
      //   153: invokevirtual getStr : ()Ljava/lang/String;
      //   156: ldc com/smartpek/data/remote/Response
      //   158: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      //   161: astore #4
      //   163: aload_0
      //   164: getfield k : I
      //   167: istore_3
      //   168: aload #4
      //   170: checkcast com/smartpek/data/remote/Response
      //   173: astore #4
      //   175: aload #4
      //   177: invokevirtual getData : ()Ljava/util/List;
      //   180: invokeinterface iterator : ()Ljava/util/Iterator;
      //   185: astore #6
      //   187: iconst_0
      //   188: istore_2
      //   189: aload #6
      //   191: invokeinterface hasNext : ()Z
      //   196: ifeq -> 240
      //   199: aload #6
      //   201: invokeinterface next : ()Ljava/lang/Object;
      //   206: astore #7
      //   208: iload_2
      //   209: ifge -> 215
      //   212: invokestatic r : ()V
      //   215: aload #7
      //   217: checkcast com/smartpek/data/remote/Response$Data
      //   220: astore #7
      //   222: iload_3
      //   223: iload_2
      //   224: if_icmpeq -> 233
      //   227: aload #7
      //   229: iconst_0
      //   230: invokevirtual setPowerState : (I)V
      //   233: iload_2
      //   234: iconst_1
      //   235: iadd
      //   236: istore_2
      //   237: goto -> 189
      //   240: aload #5
      //   242: aload #4
      //   244: invokevirtual toJsonString : ()Ljava/lang/String;
      //   247: invokevirtual setStr : (Ljava/lang/String;)V
      //   250: aload_0
      //   251: getfield j : Lq8/r;
      //   254: aload_1
      //   255: aload_0
      //   256: getfield g : Lcom/smartpek/data/local/models/b;
      //   259: aconst_null
      //   260: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
      //   263: invokeinterface n : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   268: pop
      //   269: return
    }
  }
  
  static final class v extends r8.n implements q8.l<Throwable, e8.q> {
    v(com.smartpek.data.local.models.b param1b, r6.e param1e, q8.r<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, ? super Boolean, e8.q> param1r) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
      x7.c.a a = x7.c.a;
      com.smartpek.data.local.models.b b1 = this.g;
      r6.e e1 = this.h;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("run() action: ");
      stringBuilder.append(b1);
      stringBuilder.append(", connType: ");
      stringBuilder.append(e1);
      stringBuilder.append(" > ");
      stringBuilder.append(param1Throwable);
      x7.c.a.b(a, "Me-Power", stringBuilder.toString(), false, 4, null);
      this.i.n(null, this.g, param1Throwable, Boolean.FALSE);
    }
  }
  
  static final class w extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    w(q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b) {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      this.g.g(param1n, this.h, param1Throwable);
    }
  }
  
  static final class x extends r8.n implements q8.l<Object, e8.q> {
    x(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "response");
      this.g.g(param1Object, this.h, null);
    }
  }
  
  static final class y extends r8.n implements q8.l<Throwable, e8.q> {
    y(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
      this.g.g(null, this.h, param1Throwable);
    }
  }
  
  static final class z extends r8.n implements q8.a<e8.q> {
    z(r6.e param1e, Device param1Device, int param1Int, Activity param1Activity, Context param1Context, q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b, q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q1) {
      super(0);
    }
    
    public final e8.q a() {
      e8.q q1;
      try {
        Context context;
        r6.e e1 = this.g;
        r6.e e2 = r6.e.UDP;
        q1 = null;
        int i = 0;
        if (e1 == e2 || e1 == r6.e.UNKNOWN) {
          byte b1;
          if (this.h != null) {
            b1 = 1;
          } else {
            b1 = 2;
          } 
          ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
                Byte.valueOf(b1), Byte.valueOf((byte)1), Byte.valueOf((byte)6), Byte.valueOf((byte)this.i), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
                Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
          Device device = this.h;
          if (device != null) {
            String str = p6.m.O(device);
            if (str != null) {
              char[] arrayOfChar = str.toCharArray();
              r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
              if (arrayOfChar != null) {
                int j = arrayOfChar.length;
                while (i < j) {
                  arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48)));
                  i++;
                } 
              } 
            } 
          } 
          Activity activity1 = this.j;
          return q1;
        } 
        MqttRequest mqttRequest = new MqttRequest("Control", j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(this.i)), e8.n.a("power", Integer.valueOf(6)) }));
        Activity activity = this.j;
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      } 
      return q1;
    }
    
    static final class a extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      a(q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param3q, com.smartpek.data.local.models.b param3b) {
        super(2);
      }
      
      public final void a(p6.n param3n, Throwable param3Throwable) {
        this.g.g(param3n, this.h, param3Throwable);
      }
    }
    
    static final class b extends r8.n implements q8.l<Object, e8.q> {
      b(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param3q, com.smartpek.data.local.models.b param3b) {
        super(1);
      }
      
      public final void invoke(Object param3Object) {
        r8.m.j(param3Object, "response");
        this.g.g(param3Object, this.h, null);
      }
    }
    
    static final class c extends r8.n implements q8.l<Throwable, e8.q> {
      c(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param3q, com.smartpek.data.local.models.b param3b) {
        super(1);
      }
      
      public final void invoke(Throwable param3Throwable) {
        r8.m.j(param3Throwable, "it");
        this.g.g(null, this.h, param3Throwable);
      }
    }
  }
  
  static final class a extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    a(q8.q<? super p6.n, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b) {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      this.g.g(param1n, this.h, param1Throwable);
    }
  }
  
  static final class b extends r8.n implements q8.l<Object, e8.q> {
    b(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "response");
      this.g.g(param1Object, this.h, null);
    }
  }
  
  static final class c extends r8.n implements q8.l<Throwable, e8.q> {
    c(q8.q<? super MqttResponse, ? super com.smartpek.data.local.models.b, ? super Throwable, e8.q> param1q, com.smartpek.data.local.models.b param1b) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
      this.g.g(null, this.h, param1Throwable);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c5\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */