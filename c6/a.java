package c6;

import android.app.Activity;
import android.content.Context;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.nightlight.NightLightState;
import com.smartpek.utils.connection.ConnMngr;
import com.smartpek.utils.connection.mqtt.MqttRequest;
import com.smartpek.utils.connection.mqtt.MqttResponse;
import f8.j0;
import java.util.ArrayList;
import p7.c0;
import p7.v1;

public interface a {
  boolean F(Context paramContext, b5.b.a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super NightLightState, e8.q> paraml);
  
  void a(long paramLong);
  
  long b();
  
  void c(Activity paramActivity, Context paramContext, b5.b.a parama, Device paramDevice, PowerButton paramPowerButton, Integer paramInteger, boolean paramBoolean, c5.c paramc, q8.l<? super NightLightState, e8.q> paraml);
  
  boolean i(Activity paramActivity, Context paramContext, b5.b.a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super NightLightState, e8.q> paraml);
  
  boolean o(Activity paramActivity, b5.b.a parama, Device paramDevice, boolean paramBoolean, c5.c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super NightLightState, e8.q> paraml);
  
  void r(Context paramContext, b5.b.a parama, Device paramDevice, PowerButton paramPowerButton, Integer paramInteger, c5.c paramc, q8.l<? super NightLightState, e8.q> paraml);
  
  void x(androidx.fragment.app.e parame, Context paramContext, b5.b.a parama, Device paramDevice, PowerButton paramPowerButton, Integer paramInteger, c5.c paramc, q8.l<? super NightLightState, e8.q> paraml);
  
  public static final class a {
    private static void b(a param1a, r6.f param1f, Context param1Context, Device param1Device, q8.a<e8.q> param1a1, q8.l<? super NightLightState, e8.q> param1l) {
      if (param1Context != null && param1f == r6.f.CONNECTED) {
        if (param1Device != null) {
          r6.e e = param1Device.getConnType();
        } else {
          param1a = null;
        } 
        if (param1a != null) {
          r6.e e1 = param1Device.getConnType();
          r6.e e2 = r6.e.UDP;
          int i = 0;
          if (e1 == e2 || param1Device.getConnType() == r6.e.UNKNOWN) {
            ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
                  Byte.valueOf((byte)1), Byte.valueOf((byte)3), Byte.valueOf((byte)6), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
                  Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
            char[] arrayOfChar = p6.m.O(param1Device).toCharArray();
            r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
            int j = arrayOfChar.length;
            while (i < j) {
              arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48)));
              i++;
            } 
            p6.m.g(param1Context, param1Device, arrayList, true, 0, 0L, 1000, false, false, false, new a(param1Device, param1l, param1a1), 216, null);
            return;
          } 
          p6.m.Y(param1Context, true, param1Device, new MqttRequest("Control", j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(1)), e8.n.a("action", "State") })), true, null, new b(param1Device, param1l, param1a1), new c(param1Device, param1a1), 16, null);
          return;
        } 
      } 
      if (param1Device != null)
        Device.updateState$default(param1Device, null, false, 1, 2, null); 
      param1a1.invoke();
      aa.c.d().m(r6.e.UNKNOWN);
    }
    
    public static void c(a param1a, Context param1Context, b5.b.a param1a1, Device param1Device, PowerButton param1PowerButton, Integer param1Integer, c5.c param1c, q8.l<? super NightLightState, e8.q> param1l) {
      r8.m.j(param1a1, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1l, "callback");
      param1a.x(null, param1Context, param1a1, param1Device, param1PowerButton, param1Integer, param1c, param1l);
    }
    
    public static void d(a param1a, androidx.fragment.app.e param1e, Context param1Context, b5.b.a param1a1, Device param1Device, PowerButton param1PowerButton, Integer param1Integer, c5.c param1c, q8.l<? super NightLightState, e8.q> param1l) {
      DeviceType deviceType;
      com.smartpek.ui.customviews.c.d d;
      r8.m.j(param1a1, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1l, "callback");
      App.a a2 = App.g;
      if (param1Device != null) {
        deviceType = param1Device.getType();
      } else {
        deviceType = null;
      } 
      boolean bool = true;
      if (param1PowerButton != null) {
        d = param1PowerButton.p(1);
      } else {
        d = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("NightLight > onClickPowerOrMode() ");
      stringBuilder.append(deviceType);
      stringBuilder.append(" power.state: ");
      stringBuilder.append(d);
      a2.a(stringBuilder.toString());
      x7.c.a a1 = x7.c.a;
      if (param1Device != null) {
        deviceType = param1Device.getType();
      } else {
        deviceType = null;
      } 
      if (param1PowerButton != null) {
        d = param1PowerButton.p(1);
      } else {
        d = null;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("onClickPowerOrMode() ");
      stringBuilder.append(deviceType);
      stringBuilder.append(" power.state: ");
      stringBuilder.append(d);
      x7.c.a.b(a1, "Me-NightLight", stringBuilder.toString(), false, 4, null);
      if (param1a.b() == 0L || p7.t.a() - param1a.b() >= 0L) {
        boolean bool1;
        param1a.a(p7.t.a());
        if (param1PowerButton != null) {
          com.smartpek.ui.customviews.c.d d1 = param1PowerButton.p(1);
        } else {
          deviceType = null;
        } 
        if (deviceType == com.smartpek.ui.customviews.c.d.ERR || (param1PowerButton == null && param1Integer == null)) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (param1PowerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)param1PowerButton, false, 0, 3, null); 
        aa.c.d().m(a5.a.PROGRESSING);
        g g = new g(param1a, param1e, param1Context, param1a1, param1Device, param1PowerButton, param1Integer, bool1, param1c, param1l);
        if (param1Device == null || param1Device.isDemo() != true)
          bool = false; 
        if (!bool) {
          ConnMngr.w((ConnMngr)ConnMngr.j.a(param1e, param1Context), param1Device, param1a1, 0, false, false, false, false, param1c, new e(param1a, g, param1e, param1Context, param1PowerButton, param1Device), 124, null);
          return;
        } 
        g.invoke();
        c0.e(500, f.g);
      } 
    }
    
    public static boolean f(a param1a, Activity param1Activity, Context param1Context, b5.b.a param1a1, Device param1Device, boolean param1Boolean, c5.c param1c, q8.a<e8.q> param1a2, q8.a<e8.q> param1a3, q8.l<? super NightLightState, e8.q> param1l) {
      o o;
      Context context;
      Object object;
      r8.m.j(param1a1, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a2, "onProgress");
      r8.m.j(param1a3, "onError");
      r8.m.j(param1l, "onResponse");
      App.a a1 = App.g;
      if (param1Device != null) {
        object = param1Device.getType();
      } else {
        object = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("State > onGetNightLightState() ");
      stringBuilder.append(object);
      a1.a(stringBuilder.toString());
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (param1Device != null) {
        bool1 = bool2;
        if (param1Device.isDemo() == true)
          bool1 = true; 
      } 
      if (!bool1) {
        o = new o(param1a, param1Activity, param1Context, param1Device, param1a3, param1l);
        param1a2.invoke();
        aa.c.d().m(a5.a.PROGRESSING);
        ConnMngr.w((ConnMngr)ConnMngr.j.a(param1Activity, param1Context), param1Device, param1a1, 0, false, false, false, param1Boolean, param1c, new h(o, param1Activity, param1Context), 60, null);
        return true;
      } 
      param1a2.invoke();
      aa.c.d().m(a5.a.PROGRESSING);
      r6.f f = r6.f.CONNECTED;
      if (param1Activity == null)
        context = param1Context; 
      b((a)o, f, context, param1Device, param1a3, param1l);
      return true;
    }
    
    public static boolean g(a param1a, Activity param1Activity, b5.b.a param1a1, Device param1Device, boolean param1Boolean, c5.c param1c, q8.a<e8.q> param1a2, q8.a<e8.q> param1a3, q8.l<? super NightLightState, e8.q> param1l) {
      Context context;
      r8.m.j(param1a1, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a2, "onProgress");
      r8.m.j(param1a3, "onError");
      r8.m.j(param1l, "onResponse");
      if (param1Activity != null) {
        context = param1Activity.getApplicationContext();
      } else {
        context = null;
      } 
      return param1a.i(param1Activity, context, param1a1, param1Device, param1Boolean, param1c, param1a2, param1a3, param1l);
    }
    
    public static boolean h(a param1a, Context param1Context, b5.b.a param1a1, Device param1Device, boolean param1Boolean, c5.c param1c, q8.a<e8.q> param1a2, q8.a<e8.q> param1a3, q8.l<? super NightLightState, e8.q> param1l) {
      r8.m.j(param1a1, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a2, "onProgress");
      r8.m.j(param1a3, "onError");
      r8.m.j(param1l, "onResponse");
      return param1a.i(null, param1Context, param1a1, param1Device, param1Boolean, param1c, param1a2, param1a3, param1l);
    }
    
    public static void k(a param1a, Context param1Context, Device param1Device) {
      // Byte code:
      //   0: iconst_0
      //   1: istore #5
      //   3: aload_2
      //   4: ifnull -> 418
      //   7: aload_2
      //   8: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   11: astore_0
      //   12: aload_0
      //   13: ifnull -> 418
      //   16: aload_0
      //   17: iconst_0
      //   18: invokestatic v : ([Ljava/lang/Object;I)Ljava/lang/Object;
      //   21: checkcast java/lang/Integer
      //   24: astore_0
      //   25: aload_0
      //   26: ifnull -> 418
      //   29: aload_0
      //   30: invokevirtual intValue : ()I
      //   33: istore #4
      //   35: goto -> 38
      //   38: getstatic r6/e.UDP : Lr6/e;
      //   41: astore #7
      //   43: getstatic r6/e.UNKNOWN : Lr6/e;
      //   46: astore #8
      //   48: aload_2
      //   49: ifnull -> 424
      //   52: aload_2
      //   53: invokevirtual getConnType : ()Lr6/e;
      //   56: astore_0
      //   57: goto -> 60
      //   60: iconst_2
      //   61: anewarray r6/e
      //   64: dup
      //   65: iconst_0
      //   66: aload #7
      //   68: aastore
      //   69: dup
      //   70: iconst_1
      //   71: aload #8
      //   73: aastore
      //   74: aload_0
      //   75: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
      //   78: ifeq -> 316
      //   81: iload #4
      //   83: ifne -> 429
      //   86: bipush #8
      //   88: istore_3
      //   89: goto -> 92
      //   92: bipush #15
      //   94: anewarray java/lang/Byte
      //   97: dup
      //   98: iconst_0
      //   99: iconst_1
      //   100: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   103: aastore
      //   104: dup
      //   105: iconst_1
      //   106: iconst_2
      //   107: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   110: aastore
      //   111: dup
      //   112: iconst_2
      //   113: iload_3
      //   114: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   117: aastore
      //   118: dup
      //   119: iconst_3
      //   120: iconst_0
      //   121: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   124: aastore
      //   125: dup
      //   126: iconst_4
      //   127: iconst_0
      //   128: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   131: aastore
      //   132: dup
      //   133: iconst_5
      //   134: iconst_0
      //   135: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   138: aastore
      //   139: dup
      //   140: bipush #6
      //   142: iconst_0
      //   143: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   146: aastore
      //   147: dup
      //   148: bipush #7
      //   150: iconst_0
      //   151: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   154: aastore
      //   155: dup
      //   156: bipush #8
      //   158: iconst_0
      //   159: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   162: aastore
      //   163: dup
      //   164: bipush #9
      //   166: iconst_0
      //   167: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   170: aastore
      //   171: dup
      //   172: bipush #10
      //   174: iconst_0
      //   175: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   178: aastore
      //   179: dup
      //   180: bipush #11
      //   182: iconst_0
      //   183: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   186: aastore
      //   187: dup
      //   188: bipush #12
      //   190: iconst_0
      //   191: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   194: aastore
      //   195: dup
      //   196: bipush #13
      //   198: iconst_0
      //   199: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   202: aastore
      //   203: dup
      //   204: bipush #14
      //   206: iconst_0
      //   207: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   210: aastore
      //   211: invokestatic e : ([Ljava/lang/Object;)Ljava/util/ArrayList;
      //   214: astore_0
      //   215: aload_2
      //   216: ifnull -> 291
      //   219: aload_2
      //   220: invokestatic O : (Lcom/smartpek/data/local/db/models/Device;)Ljava/lang/String;
      //   223: astore #7
      //   225: aload #7
      //   227: ifnull -> 291
      //   230: aload #7
      //   232: invokevirtual toCharArray : ()[C
      //   235: astore #7
      //   237: aload #7
      //   239: ldc 'this as java.lang.String).toCharArray()'
      //   241: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   244: aload #7
      //   246: ifnull -> 291
      //   249: aload #7
      //   251: arraylength
      //   252: istore #6
      //   254: iload #5
      //   256: istore #4
      //   258: iload #4
      //   260: iload #6
      //   262: if_icmpge -> 291
      //   265: aload_0
      //   266: aload #7
      //   268: iload #4
      //   270: caload
      //   271: bipush #48
      //   273: isub
      //   274: i2b
      //   275: invokestatic valueOf : (B)Ljava/lang/Byte;
      //   278: invokevirtual add : (Ljava/lang/Object;)Z
      //   281: pop
      //   282: iload #4
      //   284: iconst_1
      //   285: iadd
      //   286: istore #4
      //   288: goto -> 258
      //   291: aload_1
      //   292: ifnull -> 413
      //   295: aload_1
      //   296: aload_2
      //   297: aload_0
      //   298: iconst_0
      //   299: iconst_0
      //   300: lconst_0
      //   301: iconst_0
      //   302: iconst_0
      //   303: iconst_0
      //   304: iconst_0
      //   305: getstatic c6/a$a$p.g : Lc6/a$a$p;
      //   308: sipush #504
      //   311: aconst_null
      //   312: invokestatic g : (Landroid/content/Context;Lcom/smartpek/data/local/db/models/Device;Ljava/util/ArrayList;ZIJIZZZLq8/p;ILjava/lang/Object;)V
      //   315: return
      //   316: ldc 'CMD'
      //   318: iconst_2
      //   319: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   322: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Le8/j;
      //   325: astore #7
      //   327: ldc 'c'
      //   329: iconst_1
      //   330: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   333: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Le8/j;
      //   336: astore #8
      //   338: iload #4
      //   340: ifne -> 435
      //   343: ldc_w 'Save'
      //   346: astore_0
      //   347: goto -> 350
      //   350: new com/smartpek/utils/connection/mqtt/MqttRequest
      //   353: dup
      //   354: ldc 'Control'
      //   356: iconst_3
      //   357: anewarray e8/j
      //   360: dup
      //   361: iconst_0
      //   362: aload #7
      //   364: aastore
      //   365: dup
      //   366: iconst_1
      //   367: aload #8
      //   369: aastore
      //   370: dup
      //   371: iconst_2
      //   372: ldc 'action'
      //   374: aload_0
      //   375: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Le8/j;
      //   378: aastore
      //   379: invokestatic j : ([Le8/j;)Ljava/util/Map;
      //   382: invokespecial <init> : (Ljava/lang/String;Ljava/util/Map;)V
      //   385: astore_0
      //   386: aload_1
      //   387: ifnull -> 413
      //   390: aload_1
      //   391: iconst_1
      //   392: aload_2
      //   393: aload_0
      //   394: iconst_0
      //   395: aconst_null
      //   396: getstatic c6/a$a$q.g : Lc6/a$a$q;
      //   399: getstatic c6/a$a$r.g : Lc6/a$a$r;
      //   402: bipush #16
      //   404: aconst_null
      //   405: invokestatic Y : (Landroid/content/Context;ZLcom/smartpek/data/local/db/models/Device;Ljava/lang/Object;ZLq8/a;Lq8/l;Lq8/l;ILjava/lang/Object;)V
      //   408: return
      //   409: aload_0
      //   410: invokevirtual printStackTrace : ()V
      //   413: return
      //   414: astore_0
      //   415: goto -> 409
      //   418: iconst_0
      //   419: istore #4
      //   421: goto -> 38
      //   424: aconst_null
      //   425: astore_0
      //   426: goto -> 60
      //   429: bipush #9
      //   431: istore_3
      //   432: goto -> 92
      //   435: ldc_w 'Clear'
      //   438: astore_0
      //   439: goto -> 350
      // Exception table:
      //   from	to	target	type
      //   7	12	414	finally
      //   16	25	414	finally
      //   29	35	414	finally
      //   38	48	414	finally
      //   52	57	414	finally
      //   60	81	414	finally
      //   92	215	414	finally
      //   219	225	414	finally
      //   230	244	414	finally
      //   249	254	414	finally
      //   265	282	414	finally
      //   295	315	414	finally
      //   316	338	414	finally
      //   350	386	414	finally
      //   390	408	414	finally
    }
    
    public static void l(a param1a, Activity param1Activity, Context param1Context, b5.b.a param1a1, Device param1Device, PowerButton param1PowerButton, Integer param1Integer, boolean param1Boolean, c5.c param1c, q8.l<? super NightLightState, e8.q> param1l) {
      int i;
      r8.m.j(param1a1, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1l, "callback");
      if (param1Integer != null) {
        i = param1Integer.intValue();
      } else if (param1PowerButton == null) {
        i = 3;
      } else if (param1PowerButton.t(1)) {
        i = 1;
      } else {
        i = 2;
      } 
      r6.e e1 = r6.e.UDP;
      byte b = 0;
      r6.e e2 = r6.e.UNKNOWN;
      if (param1Device != null) {
        r6.e e = param1Device.getConnType();
      } else {
        param1PowerButton = null;
      } 
      if (f8.i.r((Object[])new r6.e[] { e1, e2 }, param1PowerButton)) {
        Context context;
        byte b1;
        if (param1Boolean || param1Device != null) {
          b1 = 1;
        } else {
          b1 = 2;
        } 
        ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
              Byte.valueOf(b1), Byte.valueOf((byte)2), Byte.valueOf((byte)i), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
              Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
        if (param1Device != null) {
          String str = param1Device.getSsid();
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
        if (param1Activity != null) {
          Activity activity = param1Activity;
        } else {
          context = param1Context;
        } 
        if (context != null) {
          p6.m.g(context, param1Device, arrayList, true, 0, 0L, 300, true, false, false, new s(param1a, param1Activity, param1Context, param1a1, param1Device, param1c, param1l), 408, null);
          return;
        } 
      } else {
        Context context;
        MqttRequest mqttRequest = new MqttRequest("Control", j0.j(new e8.j[] { e8.n.a("CMD", Integer.valueOf(2)), e8.n.a("c", Integer.valueOf(1)), e8.n.a("action", "Power"), e8.n.a("power", Integer.valueOf(i)) }));
        if (param1Activity == null)
          context = param1Context; 
        if (context != null)
          p6.m.Y(context, true, param1Device, mqttRequest, true, null, new t(param1l), new u(param1l), 16, null); 
      } 
    }
    
    static final class a extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      a(Device param2Device, q8.l<? super NightLightState, e8.q> param2l, q8.a<e8.q> param2a) {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        // Byte code:
        //   0: aconst_null
        //   1: astore #5
        //   3: aload_1
        //   4: ifnull -> 15
        //   7: aload_1
        //   8: invokevirtual a : ()Ljava/lang/String;
        //   11: astore_2
        //   12: goto -> 17
        //   15: aconst_null
        //   16: astore_2
        //   17: new java/lang/StringBuilder
        //   20: dup
        //   21: invokespecial <init> : ()V
        //   24: astore #6
        //   26: aload #6
        //   28: ldc 'onGetNightLightState() > '
        //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   33: pop
        //   34: aload #6
        //   36: aload_2
        //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   40: pop
        //   41: aload #5
        //   43: astore_2
        //   44: aload_1
        //   45: ifnull -> 56
        //   48: aload_1
        //   49: invokevirtual a : ()Ljava/lang/String;
        //   52: astore_2
        //   53: goto -> 56
        //   56: iconst_0
        //   57: istore #4
        //   59: aload_2
        //   60: ifnull -> 226
        //   63: aload_2
        //   64: invokeinterface length : ()I
        //   69: ifne -> 221
        //   72: goto -> 226
        //   75: iload_3
        //   76: ifne -> 167
        //   79: iload #4
        //   81: istore_3
        //   82: aload_1
        //   83: ifnull -> 111
        //   86: aload_1
        //   87: invokevirtual a : ()Ljava/lang/String;
        //   90: astore_2
        //   91: iload #4
        //   93: istore_3
        //   94: aload_2
        //   95: ifnull -> 111
        //   98: iload #4
        //   100: istore_3
        //   101: aload_2
        //   102: invokestatic a : (Ljava/lang/String;)Z
        //   105: iconst_1
        //   106: if_icmpne -> 111
        //   109: iconst_1
        //   110: istore_3
        //   111: iload_3
        //   112: ifeq -> 167
        //   115: aload_0
        //   116: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   119: aload_1
        //   120: invokevirtual a : ()Ljava/lang/String;
        //   123: iconst_0
        //   124: iconst_1
        //   125: iconst_2
        //   126: aconst_null
        //   127: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   130: aload_0
        //   131: getfield h : Lq8/l;
        //   134: astore_2
        //   135: new com/google/gson/Gson
        //   138: dup
        //   139: invokespecial <init> : ()V
        //   142: aload_1
        //   143: invokevirtual a : ()Ljava/lang/String;
        //   146: ldc com/smartpek/ui/nightlight/NightLightState
        //   148: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   151: astore_1
        //   152: aload_1
        //   153: ldc 'Gson().fromJson(udpRespo…htLightState::class.java)'
        //   155: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
        //   158: aload_2
        //   159: aload_1
        //   160: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   165: pop
        //   166: return
        //   167: aload_0
        //   168: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   171: aconst_null
        //   172: iconst_0
        //   173: iconst_1
        //   174: iconst_2
        //   175: aconst_null
        //   176: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   179: aload_0
        //   180: getfield i : Lq8/a;
        //   183: invokeinterface invoke : ()Ljava/lang/Object;
        //   188: pop
        //   189: return
        //   190: aload_1
        //   191: invokevirtual printStackTrace : ()V
        //   194: aload_0
        //   195: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   198: aconst_null
        //   199: iconst_0
        //   200: iconst_1
        //   201: iconst_2
        //   202: aconst_null
        //   203: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   206: aload_0
        //   207: getfield i : Lq8/a;
        //   210: invokeinterface invoke : ()Ljava/lang/Object;
        //   215: pop
        //   216: return
        //   217: astore_1
        //   218: goto -> 190
        //   221: iconst_0
        //   222: istore_3
        //   223: goto -> 75
        //   226: iconst_1
        //   227: istore_3
        //   228: goto -> 75
        // Exception table:
        //   from	to	target	type
        //   48	53	217	finally
        //   63	72	217	finally
        //   86	91	217	finally
        //   101	109	217	finally
        //   115	166	217	finally
        //   167	189	217	finally
      }
    }
    
    static final class b extends r8.n implements q8.l<Object, e8.q> {
      b(Device param2Device, q8.l<? super NightLightState, e8.q> param2l, q8.a<e8.q> param2a) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        r8.m.j(param2Object, "mqttResponse");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onGetNightLightState() > ");
        stringBuilder.append(param2Object);
        MqttResponse mqttResponse = (MqttResponse)param2Object;
        try {
          return;
        } finally {
          param2Object = null;
          param2Object.printStackTrace();
          Device.updateState$default(this.g, null, false, 1, 2, null);
          this.i.invoke();
        } 
      }
    }
    
    static final class c extends r8.n implements q8.l<Throwable, e8.q> {
      c(Device param2Device, q8.a<e8.q> param2a) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "it");
        Device.updateState$default(this.g, null, false, 1, 2, null);
        this.h.invoke();
      }
    }
    
    static final class d extends r8.n implements q8.l<NightLightState, e8.q> {
      public static final d g = new d();
      
      d() {
        super(1);
      }
      
      public final void a(NightLightState param2NightLightState) {}
    }
    
    static final class e extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
      e(a param2a, q8.a<e8.q> param2a1, androidx.fragment.app.e param2e, Context param2Context, PowerButton param2PowerButton, Device param2Device) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        r8.m.j(param2f, "connectionState");
        int i = c.a[param2f.ordinal()];
        if (i != 1) {
          if (i != 2 && i != 3) {
            if (i != 4)
              return; 
            this.g.a(p7.t.a() + 1000L);
            aa.c.d().m(a5.a.COMMAND_MESSAGE_SEND_FAILED);
            c0.q(new b(this.k, this.l));
            return;
          } 
          this.h.invoke();
          return;
        } 
        this.g.a(p7.t.a() + 5000L);
        c0.q(new a(this.i, this.j));
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
      
      static final class b extends r8.n implements q8.a<e8.q> {
        b(PowerButton param3PowerButton, Device param3Device) {
          super(0);
        }
        
        public final void invoke() {
          PowerButton powerButton = this.g;
          if (powerButton != null)
            com.smartpek.ui.customviews.c.j((com.smartpek.ui.customviews.c)powerButton, 0, 1, null); 
          Device device = this.h;
          if (device != null)
            Device.errorInConnection$default(device, false, 1, 1, null); 
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
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(PowerButton param2PowerButton, Device param2Device) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.j((com.smartpek.ui.customviews.c)powerButton, 0, 1, null); 
        Device device = this.h;
        if (device != null)
          Device.errorInConnection$default(device, false, 1, 1, null); 
      }
    }
    
    static final class f extends r8.n implements q8.a<e8.q> {
      public static final f g = new f();
      
      f() {
        super(0);
      }
      
      public final void invoke() {
        aa.c.d().m(r6.e.UDP);
      }
    }
    
    static final class g extends r8.n implements q8.a<e8.q> {
      g(a param2a, androidx.fragment.app.e param2e, Context param2Context, b5.b.a param2a1, Device param2Device, PowerButton param2PowerButton, Integer param2Integer, boolean param2Boolean, c5.c param2c, q8.l<? super NightLightState, e8.q> param2l) {
        super(0);
      }
      
      public final void invoke() {
        this.g.a(p7.t.a());
        aa.c.d().m(a5.a.CONNECTED);
        a a1 = this.g;
        androidx.fragment.app.e e1 = this.h;
        Context context = this.i;
        b5.b.a a2 = this.j;
        Device device = this.k;
        a1.c((Activity)e1, context, a2, device, this.l, this.m, this.n, this.o, new a(device, this.p));
      }
      
      static final class a extends r8.n implements q8.l<NightLightState, e8.q> {
        a(Device param3Device, q8.l<? super NightLightState, e8.q> param3l) {
          super(1);
        }
        
        public final void a(NightLightState param3NightLightState) {
          if (param3NightLightState != null) {
            try {
              Device device = this.g;
              if (device != null)
                device.errorInConnection(false, 1); 
              device = this.g;
            } finally {
              Exception exception = null;
            } 
          } else {
            Device device = this.g;
            if (device != null)
              Device.errorInConnection$default(device, false, 1, 1, null); 
          } 
          this.h.invoke(param3NightLightState);
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<NightLightState, e8.q> {
      a(Device param2Device, q8.l<? super NightLightState, e8.q> param2l) {
        super(1);
      }
      
      public final void a(NightLightState param2NightLightState) {
        if (param2NightLightState != null) {
          try {
            Device device = this.g;
            if (device != null)
              device.errorInConnection(false, 1); 
            device = this.g;
          } finally {
            Exception exception = null;
          } 
        } else {
          Device device = this.g;
          if (device != null)
            Device.errorInConnection$default(device, false, 1, 1, null); 
        } 
        this.h.invoke(param2NightLightState);
      }
    }
    
    static final class h extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
      h(q8.l<? super r6.f, e8.q> param2l, Activity param2Activity, Context param2Context) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        r8.m.j(param2f, "state");
        int i = b.a[param2f.ordinal()];
        if (i != 1) {
          if (i != 2 && i != 3 && i != 4)
            return; 
          this.g.invoke(param2f);
          return;
        } 
        c0.q(new a(this.h, this.i));
        aa.c.d().m(a5.a.CONNECTING);
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
            v1.k(context, 2131951793, 0, null, 6, null); 
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
          v1.k(context, 2131951793, 0, null, 6, null); 
      }
    }
    
    static final class i extends r8.n implements q8.a<e8.q> {
      public static final i g = new i();
      
      i() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class j extends r8.n implements q8.a<e8.q> {
      public static final j g = new j();
      
      j() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class k extends r8.n implements q8.l<NightLightState, e8.q> {
      public static final k g = new k();
      
      k() {
        super(1);
      }
      
      public final void a(NightLightState param2NightLightState) {
        r8.m.j(param2NightLightState, "it");
      }
    }
    
    static final class l extends r8.n implements q8.a<e8.q> {
      public static final l g = new l();
      
      l() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class m extends r8.n implements q8.a<e8.q> {
      public static final m g = new m();
      
      m() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class n extends r8.n implements q8.l<NightLightState, e8.q> {
      public static final n g = new n();
      
      n() {
        super(1);
      }
      
      public final void a(NightLightState param2NightLightState) {
        r8.m.j(param2NightLightState, "it");
      }
    }
    
    static final class o extends r8.n implements q8.l<r6.f, e8.q> {
      o(a param2a, Activity param2Activity, Context param2Context, Device param2Device, q8.a<e8.q> param2a1, q8.l<? super NightLightState, e8.q> param2l) {
        super(1);
      }
      
      public final void a(r6.f param2f) {
        r8.m.j(param2f, "it");
        aa.c.d().m(a5.a.CONNECTED);
        c0.q(new a(this.g, param2f, this.h, this.i, this.j, this.k, this.l));
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        a(a param3a, r6.f param3f, Activity param3Activity, Context param3Context, Device param3Device, q8.a<e8.q> param3a1, q8.l<? super NightLightState, e8.q> param3l) {
          super(0);
        }
        
        public final void invoke() {
          Context context;
          a a1 = this.g;
          r6.f f1 = this.h;
          Activity activity = this.i;
          if (activity == null)
            context = this.j; 
          a.a.a(a1, f1, context, this.k, this.l, this.m);
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(a param2a, r6.f param2f, Activity param2Activity, Context param2Context, Device param2Device, q8.a<e8.q> param2a1, q8.l<? super NightLightState, e8.q> param2l) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        a a1 = this.g;
        r6.f f1 = this.h;
        Activity activity = this.i;
        if (activity == null)
          context = this.j; 
        a.a.a(a1, f1, context, this.k, this.l, this.m);
      }
    }
    
    static final class p extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      public static final p g = new p();
      
      p() {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        if (param2Throwable != null)
          param2Throwable.printStackTrace(); 
      }
    }
    
    static final class q extends r8.n implements q8.l<Object, e8.q> {
      public static final q g = new q();
      
      q() {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        r8.m.j(param2Object, "it");
      }
    }
    
    static final class r extends r8.n implements q8.l<Throwable, e8.q> {
      public static final r g = new r();
      
      r() {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "error");
        param2Throwable.printStackTrace();
      }
    }
    
    static final class s extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      s(a param2a, Activity param2Activity, Context param2Context, b5.b.a param2a1, Device param2Device, c5.c param2c, q8.l<? super NightLightState, e8.q> param2l) {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        this.g.i(this.h, this.i, this.j, this.k, true, this.l, a.g, new b(this.m), new c(this.m));
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        public static final a g = new a();
        
        a() {
          super(0);
        }
        
        public final void invoke() {}
      }
      
      static final class b extends r8.n implements q8.a<e8.q> {
        b(q8.l<? super NightLightState, e8.q> param3l) {
          super(0);
        }
        
        public final void invoke() {
          this.g.invoke(null);
        }
      }
      
      static final class c extends r8.n implements q8.l<NightLightState, e8.q> {
        c(q8.l<? super NightLightState, e8.q> param3l) {
          super(1);
        }
        
        public final void a(NightLightState param3NightLightState) {
          r8.m.j(param3NightLightState, "state");
          this.g.invoke(param3NightLightState);
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      public static final a g = new a();
      
      a() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(q8.l<? super NightLightState, e8.q> param2l) {
        super(0);
      }
      
      public final void invoke() {
        this.g.invoke(null);
      }
    }
    
    static final class c extends r8.n implements q8.l<NightLightState, e8.q> {
      c(q8.l<? super NightLightState, e8.q> param2l) {
        super(1);
      }
      
      public final void a(NightLightState param2NightLightState) {
        r8.m.j(param2NightLightState, "state");
        this.g.invoke(param2NightLightState);
      }
    }
    
    static final class t extends r8.n implements q8.l<Object, e8.q> {
      t(q8.l<? super NightLightState, e8.q> param2l) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        r8.m.j(param2Object, "mqttResponse");
        String.valueOf(param2Object);
        try {
          return;
        } finally {
          param2Object = null;
          param2Object.printStackTrace();
          this.g.invoke(null);
        } 
      }
    }
    
    static final class u extends r8.n implements q8.l<Throwable, e8.q> {
      u(q8.l<? super NightLightState, e8.q> param2l) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "it");
        this.g.invoke(null);
      }
    }
  }
  
  static final class a extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    a(Device param1Device, q8.l<? super NightLightState, e8.q> param1l, q8.a<e8.q> param1a) {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      // Byte code:
      //   0: aconst_null
      //   1: astore #5
      //   3: aload_1
      //   4: ifnull -> 15
      //   7: aload_1
      //   8: invokevirtual a : ()Ljava/lang/String;
      //   11: astore_2
      //   12: goto -> 17
      //   15: aconst_null
      //   16: astore_2
      //   17: new java/lang/StringBuilder
      //   20: dup
      //   21: invokespecial <init> : ()V
      //   24: astore #6
      //   26: aload #6
      //   28: ldc 'onGetNightLightState() > '
      //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   33: pop
      //   34: aload #6
      //   36: aload_2
      //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   40: pop
      //   41: aload #5
      //   43: astore_2
      //   44: aload_1
      //   45: ifnull -> 56
      //   48: aload_1
      //   49: invokevirtual a : ()Ljava/lang/String;
      //   52: astore_2
      //   53: goto -> 56
      //   56: iconst_0
      //   57: istore #4
      //   59: aload_2
      //   60: ifnull -> 226
      //   63: aload_2
      //   64: invokeinterface length : ()I
      //   69: ifne -> 221
      //   72: goto -> 226
      //   75: iload_3
      //   76: ifne -> 167
      //   79: iload #4
      //   81: istore_3
      //   82: aload_1
      //   83: ifnull -> 111
      //   86: aload_1
      //   87: invokevirtual a : ()Ljava/lang/String;
      //   90: astore_2
      //   91: iload #4
      //   93: istore_3
      //   94: aload_2
      //   95: ifnull -> 111
      //   98: iload #4
      //   100: istore_3
      //   101: aload_2
      //   102: invokestatic a : (Ljava/lang/String;)Z
      //   105: iconst_1
      //   106: if_icmpne -> 111
      //   109: iconst_1
      //   110: istore_3
      //   111: iload_3
      //   112: ifeq -> 167
      //   115: aload_0
      //   116: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   119: aload_1
      //   120: invokevirtual a : ()Ljava/lang/String;
      //   123: iconst_0
      //   124: iconst_1
      //   125: iconst_2
      //   126: aconst_null
      //   127: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   130: aload_0
      //   131: getfield h : Lq8/l;
      //   134: astore_2
      //   135: new com/google/gson/Gson
      //   138: dup
      //   139: invokespecial <init> : ()V
      //   142: aload_1
      //   143: invokevirtual a : ()Ljava/lang/String;
      //   146: ldc com/smartpek/ui/nightlight/NightLightState
      //   148: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      //   151: astore_1
      //   152: aload_1
      //   153: ldc 'Gson().fromJson(udpRespo…htLightState::class.java)'
      //   155: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   158: aload_2
      //   159: aload_1
      //   160: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   165: pop
      //   166: return
      //   167: aload_0
      //   168: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   171: aconst_null
      //   172: iconst_0
      //   173: iconst_1
      //   174: iconst_2
      //   175: aconst_null
      //   176: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   179: aload_0
      //   180: getfield i : Lq8/a;
      //   183: invokeinterface invoke : ()Ljava/lang/Object;
      //   188: pop
      //   189: return
      //   190: aload_1
      //   191: invokevirtual printStackTrace : ()V
      //   194: aload_0
      //   195: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   198: aconst_null
      //   199: iconst_0
      //   200: iconst_1
      //   201: iconst_2
      //   202: aconst_null
      //   203: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   206: aload_0
      //   207: getfield i : Lq8/a;
      //   210: invokeinterface invoke : ()Ljava/lang/Object;
      //   215: pop
      //   216: return
      //   217: astore_1
      //   218: goto -> 190
      //   221: iconst_0
      //   222: istore_3
      //   223: goto -> 75
      //   226: iconst_1
      //   227: istore_3
      //   228: goto -> 75
      // Exception table:
      //   from	to	target	type
      //   48	53	217	finally
      //   63	72	217	finally
      //   86	91	217	finally
      //   101	109	217	finally
      //   115	166	217	finally
      //   167	189	217	finally
    }
  }
  
  static final class b extends r8.n implements q8.l<Object, e8.q> {
    b(Device param1Device, q8.l<? super NightLightState, e8.q> param1l, q8.a<e8.q> param1a) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "mqttResponse");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onGetNightLightState() > ");
      stringBuilder.append(param1Object);
      MqttResponse mqttResponse = (MqttResponse)param1Object;
      try {
        return;
      } finally {
        param1Object = null;
        param1Object.printStackTrace();
        Device.updateState$default(this.g, null, false, 1, 2, null);
        this.i.invoke();
      } 
    }
  }
  
  static final class c extends r8.n implements q8.l<Throwable, e8.q> {
    c(Device param1Device, q8.a<e8.q> param1a) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
      Device.updateState$default(this.g, null, false, 1, 2, null);
      this.h.invoke();
    }
  }
  
  static final class d extends r8.n implements q8.l<NightLightState, e8.q> {
    public static final d g = new d();
    
    d() {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {}
  }
  
  static final class e extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
    e(a param1a, q8.a<e8.q> param1a1, androidx.fragment.app.e param1e, Context param1Context, PowerButton param1PowerButton, Device param1Device) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      r8.m.j(param1f, "connectionState");
      int i = c.a[param1f.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3) {
          if (i != 4)
            return; 
          this.g.a(p7.t.a() + 1000L);
          aa.c.d().m(a5.a.COMMAND_MESSAGE_SEND_FAILED);
          c0.q(new b(this.k, this.l));
          return;
        } 
        this.h.invoke();
        return;
      } 
      this.g.a(p7.t.a() + 5000L);
      c0.q(new a(this.i, this.j));
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
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(PowerButton param3PowerButton, Device param3Device) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.j((com.smartpek.ui.customviews.c)powerButton, 0, 1, null); 
        Device device = this.h;
        if (device != null)
          Device.errorInConnection$default(device, false, 1, 1, null); 
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
  
  static final class b extends r8.n implements q8.a<e8.q> {
    b(PowerButton param1PowerButton, Device param1Device) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = this.g;
      if (powerButton != null)
        com.smartpek.ui.customviews.c.j((com.smartpek.ui.customviews.c)powerButton, 0, 1, null); 
      Device device = this.h;
      if (device != null)
        Device.errorInConnection$default(device, false, 1, 1, null); 
    }
  }
  
  static final class f extends r8.n implements q8.a<e8.q> {
    public static final f g = new f();
    
    f() {
      super(0);
    }
    
    public final void invoke() {
      aa.c.d().m(r6.e.UDP);
    }
  }
  
  static final class g extends r8.n implements q8.a<e8.q> {
    g(a param1a, androidx.fragment.app.e param1e, Context param1Context, b5.b.a param1a1, Device param1Device, PowerButton param1PowerButton, Integer param1Integer, boolean param1Boolean, c5.c param1c, q8.l<? super NightLightState, e8.q> param1l) {
      super(0);
    }
    
    public final void invoke() {
      this.g.a(p7.t.a());
      aa.c.d().m(a5.a.CONNECTED);
      a a1 = this.g;
      androidx.fragment.app.e e1 = this.h;
      Context context = this.i;
      b5.b.a a2 = this.j;
      Device device = this.k;
      a1.c((Activity)e1, context, a2, device, this.l, this.m, this.n, this.o, new a(device, this.p));
    }
    
    static final class a extends r8.n implements q8.l<NightLightState, e8.q> {
      a(Device param3Device, q8.l<? super NightLightState, e8.q> param3l) {
        super(1);
      }
      
      public final void a(NightLightState param3NightLightState) {
        if (param3NightLightState != null) {
          try {
            Device device = this.g;
            if (device != null)
              device.errorInConnection(false, 1); 
            device = this.g;
          } finally {
            Exception exception = null;
          } 
        } else {
          Device device = this.g;
          if (device != null)
            Device.errorInConnection$default(device, false, 1, 1, null); 
        } 
        this.h.invoke(param3NightLightState);
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<NightLightState, e8.q> {
    a(Device param1Device, q8.l<? super NightLightState, e8.q> param1l) {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {
      if (param1NightLightState != null) {
        try {
          Device device = this.g;
          if (device != null)
            device.errorInConnection(false, 1); 
          device = this.g;
        } finally {
          Exception exception = null;
        } 
      } else {
        Device device = this.g;
        if (device != null)
          Device.errorInConnection$default(device, false, 1, 1, null); 
      } 
      this.h.invoke(param1NightLightState);
    }
  }
  
  static final class h extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
    h(q8.l<? super r6.f, e8.q> param1l, Activity param1Activity, Context param1Context) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      r8.m.j(param1f, "state");
      int i = b.a[param1f.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3 && i != 4)
          return; 
        this.g.invoke(param1f);
        return;
      } 
      c0.q(new a(this.h, this.i));
      aa.c.d().m(a5.a.CONNECTING);
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
          v1.k(context, 2131951793, 0, null, 6, null); 
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
        v1.k(context, 2131951793, 0, null, 6, null); 
    }
  }
  
  static final class i extends r8.n implements q8.a<e8.q> {
    public static final i g = new i();
    
    i() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class j extends r8.n implements q8.a<e8.q> {
    public static final j g = new j();
    
    j() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class k extends r8.n implements q8.l<NightLightState, e8.q> {
    public static final k g = new k();
    
    k() {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {
      r8.m.j(param1NightLightState, "it");
    }
  }
  
  static final class l extends r8.n implements q8.a<e8.q> {
    public static final l g = new l();
    
    l() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class m extends r8.n implements q8.a<e8.q> {
    public static final m g = new m();
    
    m() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class n extends r8.n implements q8.l<NightLightState, e8.q> {
    public static final n g = new n();
    
    n() {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {
      r8.m.j(param1NightLightState, "it");
    }
  }
  
  static final class o extends r8.n implements q8.l<r6.f, e8.q> {
    o(a param1a, Activity param1Activity, Context param1Context, Device param1Device, q8.a<e8.q> param1a1, q8.l<? super NightLightState, e8.q> param1l) {
      super(1);
    }
    
    public final void a(r6.f param1f) {
      r8.m.j(param1f, "it");
      aa.c.d().m(a5.a.CONNECTED);
      c0.q(new a(this.g, param1f, this.h, this.i, this.j, this.k, this.l));
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(a param3a, r6.f param3f, Activity param3Activity, Context param3Context, Device param3Device, q8.a<e8.q> param3a1, q8.l<? super NightLightState, e8.q> param3l) {
        super(0);
      }
      
      public final void invoke() {
        Context context;
        a a1 = this.g;
        r6.f f1 = this.h;
        Activity activity = this.i;
        if (activity == null)
          context = this.j; 
        a.a.a(a1, f1, context, this.k, this.l, this.m);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(a param1a, r6.f param1f, Activity param1Activity, Context param1Context, Device param1Device, q8.a<e8.q> param1a1, q8.l<? super NightLightState, e8.q> param1l) {
      super(0);
    }
    
    public final void invoke() {
      Context context;
      a a1 = this.g;
      r6.f f1 = this.h;
      Activity activity = this.i;
      if (activity == null)
        context = this.j; 
      a.a.a(a1, f1, context, this.k, this.l, this.m);
    }
  }
  
  static final class p extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    public static final p g = new p();
    
    p() {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      if (param1Throwable != null)
        param1Throwable.printStackTrace(); 
    }
  }
  
  static final class q extends r8.n implements q8.l<Object, e8.q> {
    public static final q g = new q();
    
    q() {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "it");
    }
  }
  
  static final class r extends r8.n implements q8.l<Throwable, e8.q> {
    public static final r g = new r();
    
    r() {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "error");
      param1Throwable.printStackTrace();
    }
  }
  
  static final class s extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    s(a param1a, Activity param1Activity, Context param1Context, b5.b.a param1a1, Device param1Device, c5.c param1c, q8.l<? super NightLightState, e8.q> param1l) {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      this.g.i(this.h, this.i, this.j, this.k, true, this.l, a.g, new b(this.m), new c(this.m));
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      public static final a g = new a();
      
      a() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(q8.l<? super NightLightState, e8.q> param3l) {
        super(0);
      }
      
      public final void invoke() {
        this.g.invoke(null);
      }
    }
    
    static final class c extends r8.n implements q8.l<NightLightState, e8.q> {
      c(q8.l<? super NightLightState, e8.q> param3l) {
        super(1);
      }
      
      public final void a(NightLightState param3NightLightState) {
        r8.m.j(param3NightLightState, "state");
        this.g.invoke(param3NightLightState);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    public static final a g = new a();
    
    a() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class b extends r8.n implements q8.a<e8.q> {
    b(q8.l<? super NightLightState, e8.q> param1l) {
      super(0);
    }
    
    public final void invoke() {
      this.g.invoke(null);
    }
  }
  
  static final class c extends r8.n implements q8.l<NightLightState, e8.q> {
    c(q8.l<? super NightLightState, e8.q> param1l) {
      super(1);
    }
    
    public final void a(NightLightState param1NightLightState) {
      r8.m.j(param1NightLightState, "state");
      this.g.invoke(param1NightLightState);
    }
  }
  
  static final class t extends r8.n implements q8.l<Object, e8.q> {
    t(q8.l<? super NightLightState, e8.q> param1l) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      r8.m.j(param1Object, "mqttResponse");
      String.valueOf(param1Object);
      try {
        return;
      } finally {
        param1Object = null;
        param1Object.printStackTrace();
        this.g.invoke(null);
      } 
    }
  }
  
  static final class u extends r8.n implements q8.l<Throwable, e8.q> {
    u(q8.l<? super NightLightState, e8.q> param1l) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
      this.g.invoke(null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c6\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */