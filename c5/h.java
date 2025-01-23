package c5;

import android.app.Activity;
import android.content.Context;
import com.android.volley.VolleyError;
import com.smartpek.App;
import com.smartpek.data.local.db.DB;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.MainAct;
import com.smartpek.utils.connection.ConnMngr;
import com.smartpek.utils.connection.mqtt.MqttRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import p7.c0;
import p7.t;
import p7.v1;

public interface h {
  public static final a d = a.a;
  
  boolean D(Context paramContext, b5.b.a parama, Device paramDevice, boolean paramBoolean, c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super String, e8.q> paraml);
  
  void j(Context paramContext, Device paramDevice, String paramString);
  
  boolean q(Activity paramActivity, b5.b.a parama, Device paramDevice, boolean paramBoolean, c paramc, q8.a<e8.q> parama1, q8.a<e8.q> parama2, q8.l<? super String, e8.q> paraml);
  
  void y(Context paramContext, Device paramDevice, String paramString);
  
  public static final class a {
    private static HashMap<String, Long> b = new HashMap<String, Long>();
    
    private static HashMap<String, Long> c = new HashMap<String, Long>();
    
    public final HashMap<String, Long> a() {
      return b;
    }
    
    public final HashMap<String, Long> b() {
      return c;
    }
    
    public final void c(HashMap<String, Long> param1HashMap) {
      b = param1HashMap;
    }
    
    public final void d(HashMap<String, Long> param1HashMap) {
      c = param1HashMap;
    }
  }
  
  public static final class b {
    public static void b(h param1h, Context param1Context, Device param1Device, String param1String) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'activity'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_3
      //   7: ldc 'url'
      //   9: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_2
      //   13: ifnull -> 24
      //   16: aload_2
      //   17: invokevirtual getMac : ()Ljava/lang/String;
      //   20: astore_0
      //   21: goto -> 26
      //   24: aconst_null
      //   25: astore_0
      //   26: iconst_0
      //   27: istore #5
      //   29: aload_0
      //   30: ifnull -> 51
      //   33: aload_0
      //   34: invokeinterface length : ()I
      //   39: ifne -> 45
      //   42: goto -> 51
      //   45: iconst_0
      //   46: istore #4
      //   48: goto -> 54
      //   51: iconst_1
      //   52: istore #4
      //   54: lconst_0
      //   55: lstore #8
      //   57: iload #4
      //   59: ifeq -> 245
      //   62: getstatic c5/h.d : Lc5/h$a;
      //   65: astore_0
      //   66: aload_0
      //   67: invokevirtual b : ()Ljava/util/HashMap;
      //   70: ifnonnull -> 84
      //   73: aload_0
      //   74: new java/util/HashMap
      //   77: dup
      //   78: invokespecial <init> : ()V
      //   81: invokevirtual d : (Ljava/util/HashMap;)V
      //   84: invokestatic a : ()J
      //   87: lstore #10
      //   89: aload_0
      //   90: invokevirtual b : ()Ljava/util/HashMap;
      //   93: astore #13
      //   95: aload #13
      //   97: ifnull -> 167
      //   100: aload_2
      //   101: ifnull -> 112
      //   104: aload_2
      //   105: invokevirtual getSsid : ()Ljava/lang/String;
      //   108: astore_0
      //   109: goto -> 114
      //   112: aconst_null
      //   113: astore_0
      //   114: aload_0
      //   115: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   118: astore #14
      //   120: aload #13
      //   122: aload #14
      //   124: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   129: astore #12
      //   131: aload #12
      //   133: astore_0
      //   134: aload #12
      //   136: ifnonnull -> 155
      //   139: lconst_0
      //   140: invokestatic valueOf : (J)Ljava/lang/Long;
      //   143: astore_0
      //   144: aload #13
      //   146: aload #14
      //   148: aload_0
      //   149: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   154: pop
      //   155: aload_0
      //   156: checkcast java/lang/Number
      //   159: invokevirtual longValue : ()J
      //   162: lstore #6
      //   164: goto -> 170
      //   167: lconst_0
      //   168: lstore #6
      //   170: lload #10
      //   172: lload #6
      //   174: lsub
      //   175: ldc2_w 10000
      //   178: lcmp
      //   179: ifle -> 245
      //   182: new p6/e
      //   185: dup
      //   186: aload_1
      //   187: invokespecial <init> : (Landroid/content/Context;)V
      //   190: astore_0
      //   191: new java/lang/StringBuilder
      //   194: dup
      //   195: invokespecial <init> : ()V
      //   198: astore #12
      //   200: aload #12
      //   202: aload_3
      //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   206: pop
      //   207: aload #12
      //   209: ldc 'Networks?'
      //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   214: pop
      //   215: aload_0
      //   216: aload #12
      //   218: invokevirtual toString : ()Ljava/lang/String;
      //   221: invokevirtual m : (Ljava/lang/String;)Lp6/e;
      //   224: ldc 'CMD'
      //   226: ldc '1'
      //   228: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   231: new c5/h$b$a
      //   234: dup
      //   235: aload_2
      //   236: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;)V
      //   239: getstatic c5/h$b$b.g : Lc5/h$b$b;
      //   242: invokevirtual i : (Lq8/l;Lq8/l;)V
      //   245: aload_2
      //   246: ifnull -> 263
      //   249: aload_2
      //   250: invokevirtual isDemo : ()Z
      //   253: iconst_1
      //   254: if_icmpne -> 263
      //   257: iconst_1
      //   258: istore #4
      //   260: goto -> 266
      //   263: iconst_0
      //   264: istore #4
      //   266: iload #4
      //   268: ifne -> 531
      //   271: aload_2
      //   272: ifnull -> 283
      //   275: aload_2
      //   276: invokevirtual getMqttUsername : ()Ljava/lang/String;
      //   279: astore_0
      //   280: goto -> 285
      //   283: aconst_null
      //   284: astore_0
      //   285: aload_0
      //   286: ifnull -> 307
      //   289: aload_0
      //   290: invokeinterface length : ()I
      //   295: ifne -> 301
      //   298: goto -> 307
      //   301: iconst_0
      //   302: istore #4
      //   304: goto -> 310
      //   307: iconst_1
      //   308: istore #4
      //   310: iload #4
      //   312: ifne -> 354
      //   315: aload_2
      //   316: ifnull -> 327
      //   319: aload_2
      //   320: invokevirtual getMqttPassword : ()Ljava/lang/String;
      //   323: astore_0
      //   324: goto -> 329
      //   327: aconst_null
      //   328: astore_0
      //   329: aload_0
      //   330: ifnull -> 346
      //   333: iload #5
      //   335: istore #4
      //   337: aload_0
      //   338: invokeinterface length : ()I
      //   343: ifne -> 349
      //   346: iconst_1
      //   347: istore #4
      //   349: iload #4
      //   351: ifeq -> 531
      //   354: getstatic c5/h.d : Lc5/h$a;
      //   357: astore_0
      //   358: aload_0
      //   359: invokevirtual b : ()Ljava/util/HashMap;
      //   362: ifnonnull -> 376
      //   365: aload_0
      //   366: new java/util/HashMap
      //   369: dup
      //   370: invokespecial <init> : ()V
      //   373: invokevirtual d : (Ljava/util/HashMap;)V
      //   376: invokestatic a : ()J
      //   379: lstore #10
      //   381: aload_0
      //   382: invokevirtual b : ()Ljava/util/HashMap;
      //   385: astore #13
      //   387: lload #8
      //   389: lstore #6
      //   391: aload #13
      //   393: ifnull -> 460
      //   396: aload_2
      //   397: ifnull -> 408
      //   400: aload_2
      //   401: invokevirtual getSsid : ()Ljava/lang/String;
      //   404: astore_0
      //   405: goto -> 410
      //   408: aconst_null
      //   409: astore_0
      //   410: aload_0
      //   411: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   414: astore #14
      //   416: aload #13
      //   418: aload #14
      //   420: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   425: astore #12
      //   427: aload #12
      //   429: astore_0
      //   430: aload #12
      //   432: ifnonnull -> 451
      //   435: lconst_0
      //   436: invokestatic valueOf : (J)Ljava/lang/Long;
      //   439: astore_0
      //   440: aload #13
      //   442: aload #14
      //   444: aload_0
      //   445: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   450: pop
      //   451: aload_0
      //   452: checkcast java/lang/Number
      //   455: invokevirtual longValue : ()J
      //   458: lstore #6
      //   460: lload #10
      //   462: lload #6
      //   464: lsub
      //   465: ldc2_w 10000
      //   468: lcmp
      //   469: ifle -> 531
      //   472: new p6/e
      //   475: dup
      //   476: aload_1
      //   477: invokespecial <init> : (Landroid/content/Context;)V
      //   480: astore_0
      //   481: new java/lang/StringBuilder
      //   484: dup
      //   485: invokespecial <init> : ()V
      //   488: astore_1
      //   489: aload_1
      //   490: aload_3
      //   491: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   494: pop
      //   495: aload_1
      //   496: ldc 'Networks?'
      //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   501: pop
      //   502: aload_0
      //   503: aload_1
      //   504: invokevirtual toString : ()Ljava/lang/String;
      //   507: invokevirtual m : (Ljava/lang/String;)Lp6/e;
      //   510: ldc 'CMD'
      //   512: ldc '13'
      //   514: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   517: new c5/h$b$c
      //   520: dup
      //   521: aload_2
      //   522: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;)V
      //   525: getstatic c5/h$b$d.g : Lc5/h$b$d;
      //   528: invokevirtual i : (Lq8/l;Lq8/l;)V
      //   531: return
    }
    
    private static void c(h param1h, r6.f param1f, Context param1Context, Device param1Device, q8.a<e8.q> param1a, q8.l<? super String, e8.q> param1l) {
      if (param1Context != null && param1f == r6.f.CONNECTED) {
        if (param1Device != null) {
          r6.e e = param1Device.getConnType();
        } else {
          param1f = null;
        } 
        if (param1f != null) {
          if (param1Device.getConnType() == r6.e.UDP || param1Device.getConnType() == r6.e.UNKNOWN) {
            int i = 0;
            ArrayList<Byte> arrayList = f8.o.e((Object[])new Byte[] { 
                  Byte.valueOf((byte)1), Byte.valueOf((byte)3), Byte.valueOf((byte)1), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
                  Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
            char[] arrayOfChar = p6.m.O(param1Device).toCharArray();
            r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
            int j = arrayOfChar.length;
            while (i < j) {
              arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48)));
              i++;
            } 
            p6.m.g(param1Context, param1Device, arrayList, true, 0, 0L, 1000, false, false, false, new f(param1Device, param1l, param1a, param1h, param1Context), 216, null);
            return;
          } 
          p6.m.Y(param1Context, true, param1Device, MqttRequest.Companion.a(), false, null, new g(param1Device, param1l), new h(param1Device, param1a), 24, null);
          return;
        } 
      } 
      if (param1Device != null)
        Device.updateState$default(param1Device, null, false, 0, 6, null); 
      c0.q(new e(param1a));
      aa.c.d().m(r6.e.UNKNOWN);
    }
    
    private static boolean d(h param1h, Activity param1Activity, Context param1Context, b5.b.a param1a, Device param1Device, boolean param1Boolean, c param1c, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.l<? super String, e8.q> param1l) {
      Object object;
      App.a a1 = App.g;
      if (param1Device != null) {
        object = param1Device.getType();
      } else {
        object = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("State > onGetState() ");
      stringBuilder.append(object);
      a1.a(stringBuilder.toString());
      p p = new p(param1h, param1Activity, param1Context, param1Device, param1a2, param1l);
      param1a1.invoke();
      aa.c.d().m(a5.a.PROGRESSING);
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (param1Device != null) {
        bool1 = bool2;
        if (param1Device.isDemo() == true)
          bool1 = true; 
      } 
      if (!bool1) {
        ConnMngr.w((ConnMngr)ConnMngr.j.a(param1Activity, param1Context), param1Device, param1a, 0, false, false, false, param1Boolean, param1c, new i(param1c, p, param1Activity, param1Context), 60, null);
        return true;
      } 
      p.invoke(r6.f.CONNECTED);
      return true;
    }
    
    public static boolean e(h param1h, Activity param1Activity, b5.b.a param1a, Device param1Device, boolean param1Boolean, c param1c, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.l<? super String, e8.q> param1l) {
      Context context;
      r8.m.j(param1a, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a1, "onProgress");
      r8.m.j(param1a2, "onError");
      r8.m.j(param1l, "onResponse");
      if (param1Activity != null) {
        context = param1Activity.getApplicationContext();
      } else {
        context = null;
      } 
      return d(param1h, param1Activity, context, param1a, param1Device, param1Boolean, param1c, param1a1, param1a2, param1l);
    }
    
    public static boolean f(h param1h, Context param1Context, b5.b.a param1a, Device param1Device, boolean param1Boolean, c param1c, q8.a<e8.q> param1a1, q8.a<e8.q> param1a2, q8.l<? super String, e8.q> param1l) {
      r8.m.j(param1a, "tab");
      r8.m.j(param1c, "commandFrom");
      r8.m.j(param1a1, "onProgress");
      r8.m.j(param1a2, "onError");
      r8.m.j(param1l, "onResponse");
      return d(param1h, null, param1Context, param1a, param1Device, param1Boolean, param1c, param1a1, param1a2, param1l);
    }
    
    public static void i(h param1h, Context param1Context, Device param1Device, String param1String) {
      // Byte code:
      //   0: aload_3
      //   1: ldc 'url'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: getstatic c5/h.d : Lc5/h$a;
      //   9: astore_0
      //   10: aload_0
      //   11: invokevirtual a : ()Ljava/util/HashMap;
      //   14: ifnonnull -> 28
      //   17: aload_0
      //   18: new java/util/HashMap
      //   21: dup
      //   22: invokespecial <init> : ()V
      //   25: invokevirtual c : (Ljava/util/HashMap;)V
      //   28: aload_0
      //   29: invokevirtual a : ()Ljava/util/HashMap;
      //   32: astore #13
      //   34: aload #13
      //   36: invokestatic g : (Ljava/lang/Object;)V
      //   39: aload_2
      //   40: ifnull -> 51
      //   43: aload_2
      //   44: invokevirtual getSsid : ()Ljava/lang/String;
      //   47: astore_0
      //   48: goto -> 53
      //   51: aconst_null
      //   52: astore_0
      //   53: aload_0
      //   54: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   57: astore #14
      //   59: aload #13
      //   61: aload #14
      //   63: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   68: astore #12
      //   70: aload #12
      //   72: astore_0
      //   73: aload #12
      //   75: ifnonnull -> 94
      //   78: lconst_0
      //   79: invokestatic valueOf : (J)Ljava/lang/Long;
      //   82: astore_0
      //   83: aload #13
      //   85: aload #14
      //   87: aload_0
      //   88: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   93: pop
      //   94: aload_0
      //   95: checkcast java/lang/Number
      //   98: invokevirtual longValue : ()J
      //   101: lstore #10
      //   103: invokestatic a : ()J
      //   106: lload #10
      //   108: lsub
      //   109: ldc2_w 60000
      //   112: lcmp
      //   113: ifle -> 284
      //   116: aload_2
      //   117: ifnull -> 138
      //   120: aload_2
      //   121: invokevirtual getVersion : ()Ljava/lang/Double;
      //   124: astore_0
      //   125: aload_0
      //   126: ifnull -> 138
      //   129: aload_0
      //   130: invokevirtual doubleValue : ()D
      //   133: dstore #4
      //   135: goto -> 141
      //   138: dconst_0
      //   139: dstore #4
      //   141: dload #4
      //   143: ldc2_w 3.6
      //   146: dcmpl
      //   147: iflt -> 284
      //   150: invokestatic getInstance : ()Ljava/util/Calendar;
      //   153: astore_0
      //   154: aload_0
      //   155: bipush #7
      //   157: invokevirtual get : (I)I
      //   160: istore #6
      //   162: aload_0
      //   163: bipush #11
      //   165: invokevirtual get : (I)I
      //   168: istore #7
      //   170: aload_0
      //   171: bipush #12
      //   173: invokevirtual get : (I)I
      //   176: istore #8
      //   178: aload_0
      //   179: bipush #13
      //   181: invokevirtual get : (I)I
      //   184: istore #9
      //   186: new p6/e
      //   189: dup
      //   190: aload_1
      //   191: invokespecial <init> : (Landroid/content/Context;)V
      //   194: astore_0
      //   195: new java/lang/StringBuilder
      //   198: dup
      //   199: invokespecial <init> : ()V
      //   202: astore_1
      //   203: aload_1
      //   204: aload_3
      //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   208: pop
      //   209: aload_1
      //   210: ldc_w 'Clock?'
      //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   216: pop
      //   217: aload_0
      //   218: aload_1
      //   219: invokevirtual toString : ()Ljava/lang/String;
      //   222: invokevirtual m : (Ljava/lang/String;)Lp6/e;
      //   225: ldc 'CMD'
      //   227: ldc_w '2'
      //   230: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   233: ldc_w 'unix'
      //   236: iload #6
      //   238: bipush #7
      //   240: irem
      //   241: bipush #24
      //   243: imul
      //   244: sipush #3600
      //   247: imul
      //   248: iload #7
      //   250: sipush #3600
      //   253: imul
      //   254: iadd
      //   255: iload #8
      //   257: bipush #60
      //   259: imul
      //   260: iadd
      //   261: iload #9
      //   263: iadd
      //   264: invokestatic valueOf : (I)Ljava/lang/String;
      //   267: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   270: new c5/h$b$q
      //   273: dup
      //   274: aload_2
      //   275: invokespecial <init> : (Lcom/smartpek/data/local/db/models/Device;)V
      //   278: aconst_null
      //   279: iconst_2
      //   280: aconst_null
      //   281: invokestatic j : (Lp6/e;Lq8/l;Lq8/l;ILjava/lang/Object;)V
      //   284: return
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(Device param2Device) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          JSONObject jSONObject = new JSONObject(param2String);
          Device device2 = this.g;
          if (device2 != null) {
            String str1 = jSONObject.getString("APmacAddress");
            r8.m.i(str1, "json.getString(\"APmacAddress\")");
            Locale locale = Locale.US;
            r8.m.i(locale, "US");
            str1 = str1.toUpperCase(locale);
            r8.m.i(str1, "this as java.lang.String).toUpperCase(locale)");
            device2.setMac(str1);
          } 
          DB dB = App.g.e();
          if (dB != null) {
            u4.a a1 = dB.H();
            if (a1 != null) {
              Device device = this.g;
              r8.m.g(device);
              q7.j.M((q7.j)a1, device, null, 2, null);
            } 
          } 
          aa.c.d().m(a5.a.DEVICES_CHANGED);
          Device device1 = this.g;
          r8.m.g(device1);
          String str = device1.getSsid();
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
        r8.m.j(param2VolleyError, "error");
        param2VolleyError.printStackTrace();
      }
    }
    
    static final class c extends r8.n implements q8.l<String, e8.q> {
      c(Device param2Device) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          JSONObject jSONObject = new JSONObject(param2String);
          Device device2 = this.g;
          if (device2 != null)
            device2.setMqttUsername(jSONObject.getString("ID")); 
          device2 = this.g;
          if (device2 != null)
            device2.setMqttPassword(jSONObject.getString("pass")); 
          DB dB = App.g.e();
          if (dB != null) {
            u4.a a = dB.H();
            if (a != null) {
              device2 = this.g;
              r8.m.g(device2);
              q7.j.M((q7.j)a, device2, null, 2, null);
            } 
          } 
          aa.c.d().m(a5.a.DEVICES_CHANGED);
          Device device1 = this.g;
          r8.m.g(device1);
          String str = device1.getSsid();
        } finally {
          param2String = null;
        } 
      }
    }
    
    static final class d extends r8.n implements q8.l<VolleyError, e8.q> {
      public static final d g = new d();
      
      d() {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "error");
        param2VolleyError.printStackTrace();
      }
    }
    
    static final class e extends r8.n implements q8.a<e8.q> {
      e(q8.a<e8.q> param2a) {
        super(0);
      }
      
      public final void invoke() {
        this.g.invoke();
      }
    }
    
    static final class f extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
      f(Device param2Device, q8.l<? super String, e8.q> param2l, q8.a<e8.q> param2a, h param2h, Context param2Context) {
        super(2);
      }
      
      public final void a(p6.n param2n, Throwable param2Throwable) {
        String str;
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (param2n != null) {
          str = param2n.b();
          bool1 = bool2;
          if (str != null) {
            boolean bool;
            if (str.length() > 0) {
              bool = true;
            } else {
              bool = false;
            } 
            bool1 = bool2;
            if (bool == true)
              bool1 = true; 
          } 
        } 
        if (bool1) {
          str = param2n.b();
          c0.l(500, new a(this.j, this.k, this.g, str));
          c0.l(1000, new b(this.j, this.k, this.g, str));
        } 
        Device device = this.g;
        Throwable throwable = null;
        if (param2n != null) {
          str = param2n.a();
        } else {
          param2Throwable = null;
        } 
        Device.updateState$default(device, (String)param2Throwable, false, 0, 6, null);
        param2Throwable = throwable;
        if (param2n != null)
          str = param2n.a(); 
        if (str != null) {
          aa.c.d().m(r6.e.UDP);
          this.h.invoke(param2n.a());
          return;
        } 
        aa.c.d().m(r6.e.UNKNOWN);
        this.i.invoke();
      }
      
      static final class a extends r8.n implements q8.a<e8.q> {
        a(h param3h, Context param3Context, Device param3Device, String param3String) {
          super(0);
        }
        
        public final void invoke() {
          this.g.j(this.h, this.i, this.j);
        }
      }
      
      static final class b extends r8.n implements q8.a<e8.q> {
        b(h param3h, Context param3Context, Device param3Device, String param3String) {
          super(0);
        }
        
        public final void invoke() {
          this.g.y(this.h, this.i, this.j);
        }
      }
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(h param2h, Context param2Context, Device param2Device, String param2String) {
        super(0);
      }
      
      public final void invoke() {
        this.g.j(this.h, this.i, this.j);
      }
    }
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(h param2h, Context param2Context, Device param2Device, String param2String) {
        super(0);
      }
      
      public final void invoke() {
        this.g.y(this.h, this.i, this.j);
      }
    }
    
    static final class g extends r8.n implements q8.l<Object, e8.q> {
      g(Device param2Device, q8.l<? super String, e8.q> param2l) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        // Byte code:
        //   0: aload_1
        //   1: ldc 'response'
        //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
        //   6: new java/lang/StringBuilder
        //   9: dup
        //   10: invokespecial <init> : ()V
        //   13: astore #4
        //   15: aload #4
        //   17: ldc 'onGetState() > '
        //   19: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   22: pop
        //   23: aload #4
        //   25: aload_1
        //   26: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   29: pop
        //   30: invokestatic d : ()Laa/c;
        //   33: getstatic r6/e.MQTT : Lr6/e;
        //   36: invokevirtual m : (Ljava/lang/Object;)V
        //   39: aload_1
        //   40: checkcast com/smartpek/utils/connection/mqtt/MqttResponse
        //   43: astore #6
        //   45: aload #6
        //   47: invokevirtual getStr : ()Ljava/lang/String;
        //   50: astore_1
        //   51: aload_1
        //   52: ifnull -> 70
        //   55: aload_1
        //   56: invokestatic a : (Ljava/lang/String;)Z
        //   59: istore_3
        //   60: iconst_1
        //   61: istore_2
        //   62: iload_3
        //   63: iconst_1
        //   64: if_icmpne -> 70
        //   67: goto -> 72
        //   70: iconst_0
        //   71: istore_2
        //   72: ldc ''
        //   74: astore_1
        //   75: aconst_null
        //   76: astore #4
        //   78: aconst_null
        //   79: astore #5
        //   81: iload_2
        //   82: ifeq -> 240
        //   85: aload_0
        //   86: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   89: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
        //   92: astore #7
        //   94: aload #5
        //   96: astore #4
        //   98: aload #7
        //   100: ifnull -> 110
        //   103: aload #7
        //   105: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
        //   108: astore #4
        //   110: aload #4
        //   112: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
        //   115: if_acmpne -> 189
        //   118: new com/google/gson/Gson
        //   121: dup
        //   122: invokespecial <init> : ()V
        //   125: aload #6
        //   127: invokevirtual getStr : ()Ljava/lang/String;
        //   130: ldc com/smartpek/data/remote/Response
        //   132: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   135: checkcast com/smartpek/data/remote/Response
        //   138: astore #4
        //   140: aload #4
        //   142: invokevirtual getData : ()Ljava/util/List;
        //   145: invokeinterface iterator : ()Ljava/util/Iterator;
        //   150: astore #5
        //   152: aload #5
        //   154: invokeinterface hasNext : ()Z
        //   159: ifeq -> 179
        //   162: aload #5
        //   164: invokeinterface next : ()Ljava/lang/Object;
        //   169: checkcast com/smartpek/data/remote/Response$Data
        //   172: iconst_0
        //   173: invokevirtual setPowerState : (I)V
        //   176: goto -> 152
        //   179: aload #6
        //   181: aload #4
        //   183: invokevirtual toJsonString : ()Ljava/lang/String;
        //   186: invokevirtual setStr : (Ljava/lang/String;)V
        //   189: aload_0
        //   190: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   193: aload #6
        //   195: invokevirtual getStr : ()Ljava/lang/String;
        //   198: iconst_0
        //   199: iconst_0
        //   200: bipush #6
        //   202: aconst_null
        //   203: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   206: aload_0
        //   207: getfield h : Lq8/l;
        //   210: astore #5
        //   212: aload #6
        //   214: invokevirtual getStr : ()Ljava/lang/String;
        //   217: astore #4
        //   219: aload #4
        //   221: ifnonnull -> 227
        //   224: goto -> 230
        //   227: aload #4
        //   229: astore_1
        //   230: aload #5
        //   232: aload_1
        //   233: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   238: pop
        //   239: return
        //   240: aload_0
        //   241: getfield g : Lcom/smartpek/data/local/db/models/Device;
        //   244: astore #5
        //   246: aload #6
        //   248: invokevirtual getStrSplited : ()Ljava/util/List;
        //   251: astore #7
        //   253: aload #7
        //   255: ifnull -> 275
        //   258: aload #7
        //   260: ldc ''
        //   262: aconst_null
        //   263: aconst_null
        //   264: iconst_0
        //   265: aconst_null
        //   266: aconst_null
        //   267: bipush #62
        //   269: aconst_null
        //   270: invokestatic S : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lq8/l;ILjava/lang/Object;)Ljava/lang/String;
        //   273: astore #4
        //   275: aload #5
        //   277: aload #4
        //   279: iconst_0
        //   280: iconst_0
        //   281: bipush #6
        //   283: aconst_null
        //   284: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
        //   287: aload_0
        //   288: getfield h : Lq8/l;
        //   291: astore #5
        //   293: aload #6
        //   295: invokevirtual getStrSplited : ()Ljava/util/List;
        //   298: astore #6
        //   300: aload_1
        //   301: astore #4
        //   303: aload #6
        //   305: ifnull -> 336
        //   308: aload #6
        //   310: ldc ''
        //   312: aconst_null
        //   313: aconst_null
        //   314: iconst_0
        //   315: aconst_null
        //   316: aconst_null
        //   317: bipush #62
        //   319: aconst_null
        //   320: invokestatic S : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lq8/l;ILjava/lang/Object;)Ljava/lang/String;
        //   323: astore #4
        //   325: aload #4
        //   327: ifnonnull -> 336
        //   330: aload_1
        //   331: astore #4
        //   333: goto -> 336
        //   336: aload #5
        //   338: aload #4
        //   340: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   345: pop
        //   346: return
      }
    }
    
    static final class h extends r8.n implements q8.l<Throwable, e8.q> {
      h(Device param2Device, q8.a<e8.q> param2a) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        r8.m.j(param2Throwable, "it");
        aa.c.d().m(r6.e.UNKNOWN);
        Device.updateState$default(this.g, null, false, 0, 6, null);
        this.h.invoke();
      }
    }
    
    static final class i extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
      i(c param2c, q8.l<? super r6.f, e8.q> param2l, Activity param2Activity, Context param2Context) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        r8.m.j(param2f, "state");
        int j = b.a[param2f.ordinal()];
        if (j != 1) {
          if (j != 2 && j != 3 && j != 4)
            return; 
          this.h.invoke(param2f);
          return;
        } 
        if (this.g != c.NTFY || !MainAct.v.c())
          c0.q(new a(this.i, this.j)); 
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
    
    static final class j extends r8.n implements q8.a<e8.q> {
      public static final j g = new j();
      
      j() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class k extends r8.n implements q8.a<e8.q> {
      public static final k g = new k();
      
      k() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class l extends r8.n implements q8.l<String, e8.q> {
      public static final l g = new l();
      
      l() {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "it");
      }
    }
    
    static final class m extends r8.n implements q8.a<e8.q> {
      public static final m g = new m();
      
      m() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class n extends r8.n implements q8.a<e8.q> {
      public static final n g = new n();
      
      n() {
        super(0);
      }
      
      public final void invoke() {}
    }
    
    static final class o extends r8.n implements q8.l<String, e8.q> {
      public static final o g = new o();
      
      o() {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "it");
      }
    }
    
    static final class p extends r8.n implements q8.l<r6.f, e8.q> {
      p(h param2h, Activity param2Activity, Context param2Context, Device param2Device, q8.a<e8.q> param2a, q8.l<? super String, e8.q> param2l) {
        super(1);
      }
      
      public final void a(r6.f param2f) {
        Context context;
        r8.m.j(param2f, "it");
        aa.c.d().m(a5.a.CONNECTED);
        h h1 = this.g;
        Activity activity = this.h;
        if (activity == null)
          context = this.i; 
        h.b.a(h1, param2f, context, this.j, this.k, this.l);
      }
    }
    
    static final class q extends r8.n implements q8.l<String, e8.q> {
      q(Device param2Device) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "it");
        Device device = this.g;
        r8.m.g(device);
        String str = device.getSsid();
        if (str != null) {
          HashMap<String, Long> hashMap = h.d.a();
          if (hashMap != null)
            Long long_ = hashMap.put(str, Long.valueOf(t.a())); 
        } 
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(Device param1Device) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        JSONObject jSONObject = new JSONObject(param1String);
        Device device2 = this.g;
        if (device2 != null) {
          String str1 = jSONObject.getString("APmacAddress");
          r8.m.i(str1, "json.getString(\"APmacAddress\")");
          Locale locale = Locale.US;
          r8.m.i(locale, "US");
          str1 = str1.toUpperCase(locale);
          r8.m.i(str1, "this as java.lang.String).toUpperCase(locale)");
          device2.setMac(str1);
        } 
        DB dB = App.g.e();
        if (dB != null) {
          u4.a a1 = dB.H();
          if (a1 != null) {
            Device device = this.g;
            r8.m.g(device);
            q7.j.M((q7.j)a1, device, null, 2, null);
          } 
        } 
        aa.c.d().m(a5.a.DEVICES_CHANGED);
        Device device1 = this.g;
        r8.m.g(device1);
        String str = device1.getSsid();
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
      r8.m.j(param1VolleyError, "error");
      param1VolleyError.printStackTrace();
    }
  }
  
  static final class c extends r8.n implements q8.l<String, e8.q> {
    c(Device param1Device) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        JSONObject jSONObject = new JSONObject(param1String);
        Device device2 = this.g;
        if (device2 != null)
          device2.setMqttUsername(jSONObject.getString("ID")); 
        device2 = this.g;
        if (device2 != null)
          device2.setMqttPassword(jSONObject.getString("pass")); 
        DB dB = App.g.e();
        if (dB != null) {
          u4.a a = dB.H();
          if (a != null) {
            device2 = this.g;
            r8.m.g(device2);
            q7.j.M((q7.j)a, device2, null, 2, null);
          } 
        } 
        aa.c.d().m(a5.a.DEVICES_CHANGED);
        Device device1 = this.g;
        r8.m.g(device1);
        String str = device1.getSsid();
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class d extends r8.n implements q8.l<VolleyError, e8.q> {
    public static final d g = new d();
    
    d() {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "error");
      param1VolleyError.printStackTrace();
    }
  }
  
  static final class e extends r8.n implements q8.a<e8.q> {
    e(q8.a<e8.q> param1a) {
      super(0);
    }
    
    public final void invoke() {
      this.g.invoke();
    }
  }
  
  static final class f extends r8.n implements q8.p<p6.n, Throwable, e8.q> {
    f(Device param1Device, q8.l<? super String, e8.q> param1l, q8.a<e8.q> param1a, h param1h, Context param1Context) {
      super(2);
    }
    
    public final void a(p6.n param1n, Throwable param1Throwable) {
      String str;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (param1n != null) {
        str = param1n.b();
        bool1 = bool2;
        if (str != null) {
          boolean bool;
          if (str.length() > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          bool1 = bool2;
          if (bool == true)
            bool1 = true; 
        } 
      } 
      if (bool1) {
        str = param1n.b();
        c0.l(500, new a(this.j, this.k, this.g, str));
        c0.l(1000, new b(this.j, this.k, this.g, str));
      } 
      Device device = this.g;
      Throwable throwable = null;
      if (param1n != null) {
        str = param1n.a();
      } else {
        param1Throwable = null;
      } 
      Device.updateState$default(device, (String)param1Throwable, false, 0, 6, null);
      param1Throwable = throwable;
      if (param1n != null)
        str = param1n.a(); 
      if (str != null) {
        aa.c.d().m(r6.e.UDP);
        this.h.invoke(param1n.a());
        return;
      } 
      aa.c.d().m(r6.e.UNKNOWN);
      this.i.invoke();
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(h param3h, Context param3Context, Device param3Device, String param3String) {
        super(0);
      }
      
      public final void invoke() {
        this.g.j(this.h, this.i, this.j);
      }
    }
    
    static final class b extends r8.n implements q8.a<e8.q> {
      b(h param3h, Context param3Context, Device param3Device, String param3String) {
        super(0);
      }
      
      public final void invoke() {
        this.g.y(this.h, this.i, this.j);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(h param1h, Context param1Context, Device param1Device, String param1String) {
      super(0);
    }
    
    public final void invoke() {
      this.g.j(this.h, this.i, this.j);
    }
  }
  
  static final class b extends r8.n implements q8.a<e8.q> {
    b(h param1h, Context param1Context, Device param1Device, String param1String) {
      super(0);
    }
    
    public final void invoke() {
      this.g.y(this.h, this.i, this.j);
    }
  }
  
  static final class g extends r8.n implements q8.l<Object, e8.q> {
    g(Device param1Device, q8.l<? super String, e8.q> param1l) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'response'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: new java/lang/StringBuilder
      //   9: dup
      //   10: invokespecial <init> : ()V
      //   13: astore #4
      //   15: aload #4
      //   17: ldc 'onGetState() > '
      //   19: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   22: pop
      //   23: aload #4
      //   25: aload_1
      //   26: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   29: pop
      //   30: invokestatic d : ()Laa/c;
      //   33: getstatic r6/e.MQTT : Lr6/e;
      //   36: invokevirtual m : (Ljava/lang/Object;)V
      //   39: aload_1
      //   40: checkcast com/smartpek/utils/connection/mqtt/MqttResponse
      //   43: astore #6
      //   45: aload #6
      //   47: invokevirtual getStr : ()Ljava/lang/String;
      //   50: astore_1
      //   51: aload_1
      //   52: ifnull -> 70
      //   55: aload_1
      //   56: invokestatic a : (Ljava/lang/String;)Z
      //   59: istore_3
      //   60: iconst_1
      //   61: istore_2
      //   62: iload_3
      //   63: iconst_1
      //   64: if_icmpne -> 70
      //   67: goto -> 72
      //   70: iconst_0
      //   71: istore_2
      //   72: ldc ''
      //   74: astore_1
      //   75: aconst_null
      //   76: astore #4
      //   78: aconst_null
      //   79: astore #5
      //   81: iload_2
      //   82: ifeq -> 240
      //   85: aload_0
      //   86: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   89: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
      //   92: astore #7
      //   94: aload #5
      //   96: astore #4
      //   98: aload #7
      //   100: ifnull -> 110
      //   103: aload #7
      //   105: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
      //   108: astore #4
      //   110: aload #4
      //   112: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
      //   115: if_acmpne -> 189
      //   118: new com/google/gson/Gson
      //   121: dup
      //   122: invokespecial <init> : ()V
      //   125: aload #6
      //   127: invokevirtual getStr : ()Ljava/lang/String;
      //   130: ldc com/smartpek/data/remote/Response
      //   132: invokevirtual fromJson : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      //   135: checkcast com/smartpek/data/remote/Response
      //   138: astore #4
      //   140: aload #4
      //   142: invokevirtual getData : ()Ljava/util/List;
      //   145: invokeinterface iterator : ()Ljava/util/Iterator;
      //   150: astore #5
      //   152: aload #5
      //   154: invokeinterface hasNext : ()Z
      //   159: ifeq -> 179
      //   162: aload #5
      //   164: invokeinterface next : ()Ljava/lang/Object;
      //   169: checkcast com/smartpek/data/remote/Response$Data
      //   172: iconst_0
      //   173: invokevirtual setPowerState : (I)V
      //   176: goto -> 152
      //   179: aload #6
      //   181: aload #4
      //   183: invokevirtual toJsonString : ()Ljava/lang/String;
      //   186: invokevirtual setStr : (Ljava/lang/String;)V
      //   189: aload_0
      //   190: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   193: aload #6
      //   195: invokevirtual getStr : ()Ljava/lang/String;
      //   198: iconst_0
      //   199: iconst_0
      //   200: bipush #6
      //   202: aconst_null
      //   203: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   206: aload_0
      //   207: getfield h : Lq8/l;
      //   210: astore #5
      //   212: aload #6
      //   214: invokevirtual getStr : ()Ljava/lang/String;
      //   217: astore #4
      //   219: aload #4
      //   221: ifnonnull -> 227
      //   224: goto -> 230
      //   227: aload #4
      //   229: astore_1
      //   230: aload #5
      //   232: aload_1
      //   233: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   238: pop
      //   239: return
      //   240: aload_0
      //   241: getfield g : Lcom/smartpek/data/local/db/models/Device;
      //   244: astore #5
      //   246: aload #6
      //   248: invokevirtual getStrSplited : ()Ljava/util/List;
      //   251: astore #7
      //   253: aload #7
      //   255: ifnull -> 275
      //   258: aload #7
      //   260: ldc ''
      //   262: aconst_null
      //   263: aconst_null
      //   264: iconst_0
      //   265: aconst_null
      //   266: aconst_null
      //   267: bipush #62
      //   269: aconst_null
      //   270: invokestatic S : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lq8/l;ILjava/lang/Object;)Ljava/lang/String;
      //   273: astore #4
      //   275: aload #5
      //   277: aload #4
      //   279: iconst_0
      //   280: iconst_0
      //   281: bipush #6
      //   283: aconst_null
      //   284: invokestatic updateState$default : (Lcom/smartpek/data/local/db/models/Device;Ljava/lang/String;ZIILjava/lang/Object;)V
      //   287: aload_0
      //   288: getfield h : Lq8/l;
      //   291: astore #5
      //   293: aload #6
      //   295: invokevirtual getStrSplited : ()Ljava/util/List;
      //   298: astore #6
      //   300: aload_1
      //   301: astore #4
      //   303: aload #6
      //   305: ifnull -> 336
      //   308: aload #6
      //   310: ldc ''
      //   312: aconst_null
      //   313: aconst_null
      //   314: iconst_0
      //   315: aconst_null
      //   316: aconst_null
      //   317: bipush #62
      //   319: aconst_null
      //   320: invokestatic S : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lq8/l;ILjava/lang/Object;)Ljava/lang/String;
      //   323: astore #4
      //   325: aload #4
      //   327: ifnonnull -> 336
      //   330: aload_1
      //   331: astore #4
      //   333: goto -> 336
      //   336: aload #5
      //   338: aload #4
      //   340: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   345: pop
      //   346: return
    }
  }
  
  static final class h extends r8.n implements q8.l<Throwable, e8.q> {
    h(Device param1Device, q8.a<e8.q> param1a) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      r8.m.j(param1Throwable, "it");
      aa.c.d().m(r6.e.UNKNOWN);
      Device.updateState$default(this.g, null, false, 0, 6, null);
      this.h.invoke();
    }
  }
  
  static final class i extends r8.n implements q8.p<r6.f, r6.e, e8.q> {
    i(c param1c, q8.l<? super r6.f, e8.q> param1l, Activity param1Activity, Context param1Context) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      r8.m.j(param1f, "state");
      int j = b.a[param1f.ordinal()];
      if (j != 1) {
        if (j != 2 && j != 3 && j != 4)
          return; 
        this.h.invoke(param1f);
        return;
      } 
      if (this.g != c.NTFY || !MainAct.v.c())
        c0.q(new a(this.i, this.j)); 
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
  
  static final class j extends r8.n implements q8.a<e8.q> {
    public static final j g = new j();
    
    j() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class k extends r8.n implements q8.a<e8.q> {
    public static final k g = new k();
    
    k() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class l extends r8.n implements q8.l<String, e8.q> {
    public static final l g = new l();
    
    l() {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "it");
    }
  }
  
  static final class m extends r8.n implements q8.a<e8.q> {
    public static final m g = new m();
    
    m() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class n extends r8.n implements q8.a<e8.q> {
    public static final n g = new n();
    
    n() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class o extends r8.n implements q8.l<String, e8.q> {
    public static final o g = new o();
    
    o() {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "it");
    }
  }
  
  static final class p extends r8.n implements q8.l<r6.f, e8.q> {
    p(h param1h, Activity param1Activity, Context param1Context, Device param1Device, q8.a<e8.q> param1a, q8.l<? super String, e8.q> param1l) {
      super(1);
    }
    
    public final void a(r6.f param1f) {
      Context context;
      r8.m.j(param1f, "it");
      aa.c.d().m(a5.a.CONNECTED);
      h h1 = this.g;
      Activity activity = this.h;
      if (activity == null)
        context = this.i; 
      h.b.a(h1, param1f, context, this.j, this.k, this.l);
    }
  }
  
  static final class q extends r8.n implements q8.l<String, e8.q> {
    q(Device param1Device) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "it");
      Device device = this.g;
      r8.m.g(device);
      String str = device.getSsid();
      if (str != null) {
        HashMap<String, Long> hashMap = h.d.a();
        if (hashMap != null)
          Long long_ = hashMap.put(str, Long.valueOf(t.a())); 
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c5\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */