package p6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.db.models.Modem;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.ui.device_upgrade.DeviceUpgradeAct;
import com.smartpek.utils.connection.ConnMngr;
import com.smartpek.utils.connection.mqtt.MqttRequest;
import e8.q;
import f8.o;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p7.b2;
import p7.c0;
import p7.c1;
import p7.n0;
import p7.o0;
import p7.p1;
import p7.t;
import p7.w0;
import p7.y;
import q8.p;
import q8.q;
import r8.a0;
import r8.n;
import r8.x;

public final class m {
  private static Map<String, a> a = new LinkedHashMap<String, a>();
  
  private static boolean b;
  
  private static final Map<String, com.smartpek.data.local.models.e> c = new LinkedHashMap<String, com.smartpek.data.local.models.e>();
  
  public static final String A(String paramString) {
    r8.m.j(paramString, "<this>");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("t/");
    stringBuilder.append(paramString);
    stringBuilder.append("/sub");
    return stringBuilder.toString();
  }
  
  public static final String B(String paramString) {
    r8.m.j(paramString, "<this>");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("t/");
    stringBuilder.append(paramString);
    stringBuilder.append("/pub");
    return stringBuilder.toString();
  }
  
  public static final String C(String paramString) {
    r8.m.j(paramString, "<this>");
    return z8.m.C(z8.m.C(H(paramString), " ", "", false, 4, null), "聽", "", false, 4, null);
  }
  
  public static final String D(String paramString) {
    r8.m.j(paramString, "<this>");
    return z8.m.C(z8.m.C(C(paramString), "PEK(", "", false, 4, null), ")", "-", false, 4, null);
  }
  
  public static final String E(String paramString) {
    r8.m.j(paramString, "<this>");
    paramString = C(paramString);
    return (new z8.j("[()]")).g(paramString, "_");
  }
  
  public static final String F(String paramString) {
    r8.m.j(paramString, "<this>");
    paramString = C(paramString);
    return (new z8.j("^[ 聽\"]{0,2}PEK\\(PSH.+\\)")).g(paramString, "");
  }
  
  public static final String G(String paramString) {
    r8.m.j(paramString, "<this>");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" ");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  public static final String H(String paramString) {
    r8.m.j(paramString, "<this>");
    return z8.m.C(z8.m.C(paramString, "Â", "", false, 4, null), "\"", "", false, 4, null);
  }
  
  public static final String I(String paramString) {
    r8.m.j(paramString, "<this>");
    String str = J(paramString);
    paramString = F(paramString);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append("-");
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  public static final String J(String paramString) {
    r8.m.j(paramString, "<this>");
    z8.h h = z8.j.d(new z8.j("PSH\\d+\\w*-?\\d*\\w*"), paramString, 0, 2, null);
    if (h != null) {
      String str2 = h.getValue();
      String str1 = str2;
      return (str2 == null) ? "" : str1;
    } 
    return "";
  }
  
  public static final int K(String paramString) {
    r8.m.j(paramString, "<this>");
    z8.h h = z8.j.d(new z8.j("-\\d+"), paramString, 0, 2, null);
    if (h != null) {
      String str = h.getValue();
      if (str != null) {
        str = z8.m.C(str, "-", "", false, 4, null);
        if (str != null) {
          Integer integer = z8.m.k(str);
          if (integer != null)
            return integer.intValue(); 
        } 
      } 
    } 
    return 1;
  }
  
  public static final String L(String paramString) {
    r8.m.j(paramString, "<this>");
    z8.h h = z8.j.d(new z8.j("PSH\\d+"), paramString, 0, 2, null);
    if (h != null) {
      String str = h.getValue();
      if (str != null) {
        String str1 = z8.m.C(str, "PSH", "", false, 4, null);
        str = str1;
        return (str1 == null) ? "" : str;
      } 
    } 
    return "";
  }
  
  public static final String M(String paramString) {
    StringBuilder stringBuilder;
    r8.m.j(paramString, "<this>");
    if (K(paramString) > 1) {
      String str = L(paramString);
      int i = K(paramString);
      stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("-");
      stringBuilder.append(i);
      return stringBuilder.toString();
    } 
    return L((String)stringBuilder);
  }
  
  public static final String N(Device paramDevice) {
    r8.m.j(paramDevice, "<this>");
    null = paramDevice.getSsid();
    if (null != null) {
      String str = C(null);
      null = str;
      return (str == null) ? "" : null;
    } 
    return "";
  }
  
  public static final String O(Device paramDevice) {
    r8.m.j(paramDevice, "<this>");
    null = paramDevice.getSsid();
    if (null != null) {
      String str = F(null);
      null = str;
      return (str == null) ? "" : null;
    } 
    return "";
  }
  
  public static final boolean P(Device paramDevice) {
    r8.m.j(paramDevice, "<this>");
    DeviceType deviceType2 = paramDevice.getType();
    DeviceType deviceType1 = DeviceType.B_PATROM;
    if (deviceType2 == deviceType1) {
      double d;
      Double double_ = paramDevice.getVersion();
      if (double_ != null) {
        d = double_.doubleValue();
      } else {
        d = 0.0D;
      } 
      if (d >= 3.7D)
        return true; 
    } 
    return (paramDevice.getType() != deviceType1);
  }
  
  public static final boolean Q(Device paramDevice) {
    r8.m.j(paramDevice, "<this>");
    DeviceType deviceType2 = paramDevice.getType();
    DeviceType deviceType1 = DeviceType.B_PATROM;
    if (deviceType2 == deviceType1) {
      double d;
      Double double_ = paramDevice.getVersion();
      if (double_ != null) {
        d = double_.doubleValue();
      } else {
        d = 0.0D;
      } 
      if (d >= 3.7D)
        return true; 
    } 
    return (paramDevice.getType() != deviceType1);
  }
  
  public static final boolean R(String paramString) {
    r8.m.j(paramString, "<this>");
    return (new z8.j("^[Â 聽\"]{0,2}PEK\\(PSH.+\\)\\d+\"?")).e(paramString);
  }
  
  public static final List<ScanResult> S(List<ScanResult> paramList, List<? extends Device> paramList1) {
    r8.m.j(paramList, "<this>");
    ArrayList<ScanResult> arrayList = new ArrayList();
    for (ScanResult scanResult1 : paramList) {
      ScanResult scanResult2 = scanResult1;
      String str = scanResult2.SSID;
      r8.m.i(str, "it.SSID");
      int i = str.length();
      boolean bool = true;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0 && y(scanResult2.SSID.charAt(0)) == ' ') {
        i = bool;
      } else {
        i = 0;
      } 
      if (i != 0)
        arrayList.add(scanResult1); 
    } 
    return n0.b(o.i0(arrayList), new l(paramList1));
  }
  
  private static final boolean T(List paramList, ScanResult paramScanResult) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: istore_3
    //   6: aload_0
    //   7: ifnull -> 90
    //   10: aload_0
    //   11: invokeinterface isEmpty : ()Z
    //   16: ifeq -> 24
    //   19: iconst_0
    //   20: istore_2
    //   21: goto -> 80
    //   24: aload_0
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore #5
    //   32: aload #5
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 19
    //   42: aload #5
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: checkcast com/smartpek/data/local/db/models/Device
    //   52: astore_0
    //   53: aload_0
    //   54: ifnull -> 65
    //   57: aload_0
    //   58: invokevirtual getSsid : ()Ljava/lang/String;
    //   61: astore_0
    //   62: goto -> 67
    //   65: aconst_null
    //   66: astore_0
    //   67: aload_0
    //   68: aload_1
    //   69: getfield SSID : Ljava/lang/String;
    //   72: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   75: ifeq -> 32
    //   78: iconst_1
    //   79: istore_2
    //   80: iload #4
    //   82: istore_3
    //   83: iload_2
    //   84: iconst_1
    //   85: if_icmpne -> 90
    //   88: iconst_1
    //   89: istore_3
    //   90: iload_3
    //   91: ireturn
  }
  
  public static final void U(Context paramContext, Device paramDevice, boolean paramBoolean1, boolean paramBoolean2, q<? super Boolean, ? super r6.e, ? super String, q> paramq) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: new r8/a0
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #8
    //   15: aload #8
    //   17: aload #4
    //   19: putfield g : Ljava/lang/Object;
    //   22: new r8/x
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #9
    //   31: new r8/x
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #10
    //   40: new r8/x
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore #11
    //   49: iload_2
    //   50: ifne -> 59
    //   53: aload #9
    //   55: iconst_1
    //   56: putfield g : Z
    //   59: iconst_0
    //   60: istore #6
    //   62: iload_3
    //   63: ifeq -> 92
    //   66: aload_1
    //   67: ifnull -> 84
    //   70: aload_1
    //   71: invokevirtual isDemo : ()Z
    //   74: iconst_1
    //   75: if_icmpne -> 84
    //   78: iconst_1
    //   79: istore #5
    //   81: goto -> 87
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: ifeq -> 98
    //   92: aload #10
    //   94: iconst_1
    //   95: putfield g : Z
    //   98: getstatic com/smartpek/utils/connection/ConnMngr.j : Lcom/smartpek/utils/connection/ConnMngr$b;
    //   101: aload_0
    //   102: invokevirtual h : (Landroid/content/Context;)Ljava/lang/String;
    //   105: invokestatic H : (Ljava/lang/String;)Ljava/lang/String;
    //   108: astore #12
    //   110: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
    //   113: invokevirtual m : ()Lcom/smartpek/App$b;
    //   116: astore #4
    //   118: getstatic com/smartpek/App$b.WIFI : Lcom/smartpek/App$b;
    //   121: astore #13
    //   123: aconst_null
    //   124: astore #7
    //   126: aload #4
    //   128: aload #13
    //   130: if_acmpne -> 201
    //   133: aload #12
    //   135: invokestatic R : (Ljava/lang/String;)Z
    //   138: ifeq -> 201
    //   141: aload_1
    //   142: ifnull -> 154
    //   145: aload_1
    //   146: invokevirtual getSsid : ()Ljava/lang/String;
    //   149: astore #4
    //   151: goto -> 157
    //   154: aconst_null
    //   155: astore #4
    //   157: aload #12
    //   159: aload #4
    //   161: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   164: ifne -> 201
    //   167: aload #8
    //   169: getfield g : Ljava/lang/Object;
    //   172: checkcast q8/q
    //   175: astore_0
    //   176: aload_0
    //   177: ifnull -> 194
    //   180: aload_0
    //   181: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   184: getstatic r6/e.UDP : Lr6/e;
    //   187: aconst_null
    //   188: invokeinterface g : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   193: pop
    //   194: aload #8
    //   196: aconst_null
    //   197: putfield g : Ljava/lang/Object;
    //   200: return
    //   201: iload_3
    //   202: ifeq -> 300
    //   205: iload #6
    //   207: istore #5
    //   209: aload_1
    //   210: ifnull -> 228
    //   213: iload #6
    //   215: istore #5
    //   217: aload_1
    //   218: invokevirtual isDemo : ()Z
    //   221: iconst_1
    //   222: if_icmpne -> 228
    //   225: iconst_1
    //   226: istore #5
    //   228: iload #5
    //   230: ifne -> 300
    //   233: getstatic s6/c.d : Ls6/c$a;
    //   236: aload_0
    //   237: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   240: invokevirtual a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   243: checkcast s6/c
    //   246: astore #12
    //   248: aload_1
    //   249: ifnull -> 261
    //   252: aload_1
    //   253: invokevirtual getMqttUsername : ()Ljava/lang/String;
    //   256: astore #4
    //   258: goto -> 264
    //   261: aconst_null
    //   262: astore #4
    //   264: aload_1
    //   265: ifnull -> 274
    //   268: aload_1
    //   269: invokevirtual getMqttPassword : ()Ljava/lang/String;
    //   272: astore #7
    //   274: aload #12
    //   276: aload #4
    //   278: aload #7
    //   280: iconst_1
    //   281: new p6/m$h
    //   284: dup
    //   285: aload #10
    //   287: aload #9
    //   289: aload #8
    //   291: aload_1
    //   292: aload #11
    //   294: invokespecial <init> : (Lr8/x;Lr8/x;Lr8/a0;Lcom/smartpek/data/local/db/models/Device;Lr8/x;)V
    //   297: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;ZLq8/p;)V
    //   300: iload_2
    //   301: ifeq -> 331
    //   304: aload_0
    //   305: aload_1
    //   306: sipush #1000
    //   309: iconst_0
    //   310: new p6/m$i
    //   313: dup
    //   314: aload #9
    //   316: aload #8
    //   318: aload #10
    //   320: aload #11
    //   322: aload_0
    //   323: invokespecial <init> : (Lr8/x;Lr8/a0;Lr8/x;Lr8/x;Landroid/content/Context;)V
    //   326: iconst_4
    //   327: aconst_null
    //   328: invokestatic l : (Landroid/content/Context;Lcom/smartpek/data/local/db/models/Device;IZLq8/l;ILjava/lang/Object;)V
    //   331: return
  }
  
  public static final void W(Context paramContext, boolean paramBoolean1, Device paramDevice, Object paramObject, boolean paramBoolean2, q8.a<q> parama, q8.l<Object, q> paraml, q8.l<? super Throwable, q> paraml1) {
    r8.m.j(paramContext, "<this>");
    r8.m.j(paramObject, "request");
    r8.m.j(parama, "onConn");
    r8.m.j(paraml, "onSucc");
    r8.m.j(paraml1, "onError");
    if (paramDevice != null) {
      double d;
      Double double_ = paramDevice.getVersion();
      if (double_ != null) {
        d = double_.doubleValue();
      } else {
        d = 4.0D;
      } 
      if (d >= 4.0D && !paramDevice.isDemo()) {
        ((s6.c)s6.c.d.a(paramContext.getApplicationContext())).d(paramDevice.getMqttUsername(), paramDevice.getMqttPassword(), paramBoolean1, new l(paraml1, parama, paramDevice, paramObject, paramBoolean2, paraml));
        return;
      } 
    } 
    paraml1.invoke(new Exception(""));
  }
  
  public static final void X(Fragment paramFragment, boolean paramBoolean1, Device paramDevice, Object paramObject, boolean paramBoolean2, q8.a<q> parama, q8.l<Object, q> paraml, q8.l<? super Throwable, q> paraml1) {
    r8.m.j(paramFragment, "<this>");
    r8.m.j(paramObject, "request");
    r8.m.j(parama, "onConn");
    r8.m.j(paraml, "onSucc");
    r8.m.j(paraml1, "onError");
    Context context = paramFragment.getContext();
    if (context != null)
      W(context, paramBoolean1, paramDevice, paramObject, paramBoolean2, parama, paraml, paraml1); 
  }
  
  public static final void a0(ViewPager2 paramViewPager2) {
    r8.m.j(paramViewPager2, "<this>");
    try {
      Field field = ViewPager2.class.getDeclaredField("p");
      field.setAccessible(true);
      Object object1 = field.get(paramViewPager2);
      r8.m.h(object1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
      object1 = object1;
      field = RecyclerView.class.getDeclaredField("e0");
      field.setAccessible(true);
      Object object2 = field.get(object1);
      return;
    } finally {
      paramViewPager2 = null;
      paramViewPager2.printStackTrace();
    } 
  }
  
  public static final void b0(boolean paramBoolean) {
    b = paramBoolean;
  }
  
  public static final boolean c(Device paramDevice, Activity paramActivity, View paramView) {
    r8.m.j(paramDevice, "<this>");
    if (paramDevice.getType() == DeviceType.B_PATROM) {
      double d;
      Double double_ = paramDevice.getVersion();
      if (double_ != null) {
        d = double_.doubleValue();
      } else {
        d = 0.0D;
      } 
      if (d < 3.6D) {
        if (paramActivity != null)
          p1.g((Context)paramActivity, paramView, null, c1.g((Context)paramActivity, 2131952265), 10000, 0, null, null, Integer.valueOf(App.g.i((Context)paramActivity)), 0, 0.0F, 0, c1.g((Context)paramActivity, 2131952308), 2131100508, new a(paramActivity), 1906, null); 
        return false;
      } 
    } 
    return true;
  }
  
  public static final q c0(Fragment paramFragment, String paramString1, String paramString2, String paramString3) {
    r8.m.j(paramFragment, "<this>");
    r8.m.j(paramString1, "body");
    r8.m.j(paramString2, "subject");
    r8.m.j(paramString3, "title");
    Context context = paramFragment.getContext();
    if (context != null) {
      d0(context, paramString1, paramString2, paramString3);
      return q.a;
    } 
    return null;
  }
  
  public static final void d(Context paramContext, Device paramDevice, ArrayList<Byte> paramArrayList, boolean paramBoolean1, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, p<? super n, ? super Throwable, q> paramp) {
    r8.m.j(paramContext, "<this>");
    r8.m.j(paramArrayList, "buffer");
    if (paramDevice != null) {
      r6.e e = paramDevice.getConnType();
    } else {
      paramDevice = null;
    } 
    e(paramContext, (r6.e)paramDevice, paramArrayList, paramBoolean1, paramInt1, paramLong, paramInt2, paramBoolean2, paramBoolean3, paramBoolean4, paramp);
  }
  
  public static final void d0(Context paramContext, String paramString1, String paramString2, String paramString3) {
    r8.m.j(paramContext, "<this>");
    r8.m.j(paramString1, "body");
    r8.m.j(paramString2, "subject");
    r8.m.j(paramString3, "title");
    Intent intent = new Intent("android.intent.action.SEND");
    intent.setType("text/plain");
    intent.putExtra("android.intent.extra.SUBJECT", paramString2);
    intent.putExtra("android.intent.extra.TEXT", paramString1);
    paramContext.startActivity(Intent.createChooser(intent, paramString3));
  }
  
  public static final void e(Context paramContext, r6.e parame, ArrayList<Byte> paramArrayList, boolean paramBoolean1, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, p<? super n, ? super Throwable, q> paramp) {
    r8.m.j(paramContext, "<this>");
    r8.m.j(paramArrayList, "buffer");
    (new Thread(new k(paramContext, paramArrayList, paramInt1, paramLong, paramInt2, paramBoolean1, paramp, paramBoolean2, paramBoolean3, parame, paramBoolean4))).start();
  }
  
  private static final void e0(Context paramContext) {
    y4.k.a a = y4.k.k;
    y4.k k = (y4.k)a.a(paramContext);
    k.s(k.d() + 1);
    if (((y4.k)a.a(paramContext)).d() > 1)
      ((y4.k)a.a(paramContext)).s(0); 
  }
  
  public static final void f(Fragment paramFragment, Device paramDevice, ArrayList<Byte> paramArrayList, boolean paramBoolean1, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, p<? super n, ? super Throwable, q> paramp) {
    r8.m.j(paramFragment, "<this>");
    r8.m.j(paramArrayList, "buffer");
    Context context = paramFragment.getContext();
    if (context != null) {
      if (paramDevice != null) {
        r6.e e = paramDevice.getConnType();
      } else {
        paramFragment = null;
      } 
      e(context, (r6.e)paramFragment, paramArrayList, paramBoolean1, paramInt1, paramLong, paramInt2, paramBoolean2, paramBoolean3, paramBoolean4, paramp);
    } 
  }
  
  public static final void f0(File paramFile, String paramString, p<? super Integer, ? super String, q> paramp) throws Throwable {
    r8.m.j(paramString, "link");
    r8.m.j(paramp, "callback");
    URLConnection uRLConnection = (new URL(paramString)).openConnection();
    r8.m.h(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
    HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
    httpURLConnection.setDoInput(true);
    httpURLConnection.setDoOutput(true);
    httpURLConnection.setUseCaches(false);
    httpURLConnection.setRequestMethod("POST");
    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("multipart/form-data;boundary=");
    stringBuilder2.append("*****");
    httpURLConnection.setRequestProperty("Content-Type", stringBuilder2.toString());
    httpURLConnection.connect();
    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append("--");
    stringBuilder2.append("*****");
    stringBuilder2.append("\r\n");
    dataOutputStream.writeBytes(stringBuilder2.toString());
    if (paramFile != null) {
      String str = paramFile.getName();
    } else {
      stringBuilder2 = null;
    } 
    StringBuilder stringBuilder4 = new StringBuilder();
    stringBuilder4.append("Content-Disposition: form-data; name=\"firmware\";filename=\"");
    stringBuilder4.append((String)stringBuilder2);
    stringBuilder4.append("\"");
    stringBuilder4.append("\r\n");
    dataOutputStream.writeBytes(stringBuilder4.toString());
    dataOutputStream.writeBytes("\r\n");
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    int j = Math.min(fileInputStream.available(), 2048);
    byte[] arrayOfByte = new byte[j];
    int i;
    for (i = fileInputStream.read(arrayOfByte, 0, j); i > 0; i = fileInputStream.read(arrayOfByte, 0, j)) {
      dataOutputStream.write(arrayOfByte, 0, j);
      dataOutputStream.flush();
      j = Math.min(fileInputStream.available(), 2048);
    } 
    dataOutputStream.writeBytes("\r\n");
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("--");
    stringBuilder1.append("*****");
    stringBuilder1.append("--");
    stringBuilder1.append("\r\n");
    dataOutputStream.writeBytes(stringBuilder1.toString());
    DataInputStream dataInputStream = new DataInputStream(httpURLConnection.getInputStream());
    String str2 = new String(o8.a.c(dataInputStream), z8.d.b);
    i = httpURLConnection.getResponseCode();
    String str1 = httpURLConnection.getResponseMessage();
    paramp.invoke(Integer.valueOf(i), str2);
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append("HTTP Response is : ");
    stringBuilder3.append(str1);
    stringBuilder3.append(": ");
    stringBuilder3.append(i);
    stringBuilder3.append("\r\n");
    stringBuilder3.append(str2);
    fileInputStream.close();
    dataOutputStream.flush();
    dataOutputStream.close();
    dataInputStream.close();
  }
  
  public static final v g0(v paramv) {
    r8.m.j(paramv, "<this>");
    paramv.v(2130772029, 2130772030, 2130772029, 2130772030);
    return paramv;
  }
  
  private static final void j(Context paramContext, ArrayList paramArrayList, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean1, p paramp, boolean paramBoolean2, boolean paramBoolean3, r6.e parame, boolean paramBoolean4) {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w '$this_broadcast'
    //   4: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_1
    //   8: ldc_w '$buffer'
    //   11: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: new r8/a0
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #15
    //   23: iconst_1
    //   24: istore #12
    //   26: aload_0
    //   27: invokestatic q : (Landroid/content/Context;)Ljava/net/InetAddress;
    //   30: astore #14
    //   32: new java/net/DatagramPacket
    //   35: dup
    //   36: aload_1
    //   37: invokestatic d0 : (Ljava/util/Collection;)[B
    //   40: aload_1
    //   41: invokevirtual size : ()I
    //   44: aload #14
    //   46: iload_2
    //   47: invokespecial <init> : ([BILjava/net/InetAddress;I)V
    //   50: astore #16
    //   52: aload #16
    //   54: aload_1
    //   55: invokevirtual size : ()I
    //   58: invokevirtual setLength : (I)V
    //   61: new java/net/DatagramSocket
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: astore #17
    //   70: aload #15
    //   72: aload #17
    //   74: putfield g : Ljava/lang/Object;
    //   77: aload #17
    //   79: iconst_1
    //   80: invokevirtual setBroadcast : (Z)V
    //   83: lload_3
    //   84: lconst_0
    //   85: lcmp
    //   86: istore #13
    //   88: iload #13
    //   90: ifgt -> 508
    //   93: aload #15
    //   95: getfield g : Ljava/lang/Object;
    //   98: checkcast java/net/DatagramSocket
    //   101: astore #17
    //   103: aload #17
    //   105: iload #5
    //   107: invokevirtual setSoTimeout : (I)V
    //   110: goto -> 113
    //   113: aload #15
    //   115: getfield g : Ljava/lang/Object;
    //   118: checkcast java/net/DatagramSocket
    //   121: aload #16
    //   123: invokevirtual send : (Ljava/net/DatagramPacket;)V
    //   126: iload #6
    //   128: ifeq -> 140
    //   131: invokestatic d : ()Laa/c;
    //   134: getstatic a5/a.COMMAND_MESSAGE_SENT : La5/a;
    //   137: invokevirtual m : (Ljava/lang/Object;)V
    //   140: aload_1
    //   141: ldc_w ', '
    //   144: aconst_null
    //   145: aconst_null
    //   146: iconst_0
    //   147: aconst_null
    //   148: aconst_null
    //   149: bipush #62
    //   151: aconst_null
    //   152: invokestatic S : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lq8/l;ILjava/lang/Object;)Ljava/lang/String;
    //   155: astore #16
    //   157: aload #14
    //   159: invokevirtual getHostAddress : ()Ljava/lang/String;
    //   162: astore #14
    //   164: new java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: astore #17
    //   173: aload #17
    //   175: ldc_w 'broadcast() > send: '
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #17
    //   184: aload #16
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload #17
    //   192: ldc_w '  -  address: '
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload #17
    //   201: aload #14
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: iload #13
    //   209: ifle -> 225
    //   212: lload_3
    //   213: new p6/m$b
    //   216: dup
    //   217: aload #15
    //   219: invokespecial <init> : (Lr8/a0;)V
    //   222: invokestatic f : (JLq8/a;)V
    //   225: new java/net/DatagramPacket
    //   228: dup
    //   229: sipush #16384
    //   232: newarray byte
    //   234: sipush #16384
    //   237: invokespecial <init> : ([BI)V
    //   240: astore #14
    //   242: aload #7
    //   244: ifnull -> 316
    //   247: aload #15
    //   249: getfield g : Ljava/lang/Object;
    //   252: checkcast java/net/DatagramSocket
    //   255: aload #14
    //   257: invokevirtual receive : (Ljava/net/DatagramPacket;)V
    //   260: new p6/n
    //   263: dup
    //   264: aload #14
    //   266: invokespecial <init> : (Ljava/net/DatagramPacket;)V
    //   269: astore #16
    //   271: new java/lang/StringBuilder
    //   274: dup
    //   275: invokespecial <init> : ()V
    //   278: astore #17
    //   280: aload #17
    //   282: ldc_w 'broadcast() > recv: '
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload #17
    //   291: aload #16
    //   293: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: new p6/m$c
    //   300: dup
    //   301: aload #7
    //   303: aload #16
    //   305: invokespecial <init> : (Lq8/p;Lp6/n;)V
    //   308: invokestatic q : (Lq8/a;)V
    //   311: iload #13
    //   313: ifgt -> 242
    //   316: aload #15
    //   318: getfield g : Ljava/lang/Object;
    //   321: checkcast java/net/DatagramSocket
    //   324: astore_0
    //   325: aload_0
    //   326: ifnull -> 470
    //   329: aload_0
    //   330: invokevirtual close : ()V
    //   333: return
    //   334: astore #14
    //   336: aload_0
    //   337: invokestatic e0 : (Landroid/content/Context;)V
    //   340: iload #8
    //   342: ifne -> 423
    //   345: iload #9
    //   347: ifeq -> 423
    //   350: lload_3
    //   351: lconst_0
    //   352: lcmp
    //   353: ifgt -> 423
    //   356: aload #14
    //   358: invokevirtual getMessage : ()Ljava/lang/String;
    //   361: astore #16
    //   363: aload #16
    //   365: ifnull -> 393
    //   368: aload #16
    //   370: ldc_w 'Poll timed out'
    //   373: iconst_0
    //   374: iconst_2
    //   375: aconst_null
    //   376: invokestatic N : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   379: istore #8
    //   381: iload #8
    //   383: iconst_1
    //   384: if_icmpne -> 393
    //   387: goto -> 396
    //   390: goto -> 454
    //   393: iconst_0
    //   394: istore #12
    //   396: iload #12
    //   398: ifeq -> 423
    //   401: aload_0
    //   402: aload #10
    //   404: aload_1
    //   405: iload #6
    //   407: iload_2
    //   408: lload_3
    //   409: iload #5
    //   411: iconst_0
    //   412: iconst_0
    //   413: iload #11
    //   415: aload #7
    //   417: invokestatic e : (Landroid/content/Context;Lr6/e;Ljava/util/ArrayList;ZIJIZZZLq8/p;)V
    //   420: goto -> 454
    //   423: iload #6
    //   425: ifeq -> 437
    //   428: invokestatic d : ()Laa/c;
    //   431: getstatic a5/a.COMMAND_MESSAGE_SEND_FAILED : La5/a;
    //   434: invokevirtual m : (Ljava/lang/Object;)V
    //   437: new p6/m$d
    //   440: dup
    //   441: aload #7
    //   443: aload #14
    //   445: invokespecial <init> : (Lq8/p;Ljava/lang/Throwable;)V
    //   448: invokestatic q : (Lq8/a;)V
    //   451: goto -> 454
    //   454: aload #15
    //   456: getfield g : Ljava/lang/Object;
    //   459: checkcast java/net/DatagramSocket
    //   462: astore_0
    //   463: aload_0
    //   464: ifnull -> 470
    //   467: goto -> 329
    //   470: return
    //   471: astore_0
    //   472: aload #15
    //   474: getfield g : Ljava/lang/Object;
    //   477: checkcast java/net/DatagramSocket
    //   480: astore_1
    //   481: aload_1
    //   482: ifnull -> 489
    //   485: aload_1
    //   486: invokevirtual close : ()V
    //   489: aload_0
    //   490: athrow
    //   491: astore_0
    //   492: goto -> 511
    //   495: astore_0
    //   496: goto -> 390
    //   499: astore_0
    //   500: goto -> 454
    //   503: astore #14
    //   505: goto -> 336
    //   508: goto -> 113
    //   511: goto -> 454
    // Exception table:
    //   from	to	target	type
    //   26	83	334	finally
    //   93	103	503	finally
    //   103	110	334	finally
    //   113	126	334	finally
    //   131	140	334	finally
    //   140	207	334	finally
    //   212	225	334	finally
    //   225	242	334	finally
    //   247	311	334	finally
    //   336	340	471	finally
    //   356	363	491	finally
    //   368	381	495	finally
    //   401	420	499	finally
    //   428	437	499	finally
    //   437	451	499	finally
  }
  
  public static final void k(Context paramContext, Device paramDevice, int paramInt, boolean paramBoolean, q8.l<? super n, q> paraml) {
    r6.e e;
    r8.m.j(paramContext, "<this>");
    r8.m.j(paraml, "callback");
    byte b = 0;
    try {
      if (a == null)
        a = new LinkedHashMap<String, a>(); 
      if (paramBoolean) {
        e = (r6.e)a;
        r8.m.g(e);
        r8.m.g(paramDevice);
        if (e.containsKey(paramDevice.getSsid())) {
          boolean bool;
          String str = paramDevice.getSsid();
          r8.m.g(str);
          if (str.length() > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool) {
            Map<String, a> map = a;
            r8.m.g(map);
            map = (Map<String, a>)map.get(paramDevice.getSsid());
            r8.m.g(map);
            a a = (a)map;
            String str1 = a.b();
            if (str1 == null || z8.m.v(str1)) {
              bool = true;
            } else {
              bool = false;
            } 
            if (!bool && t.a() - a.a() < 2000L) {
              c0.q(new e(paraml, a));
              return;
            } 
          } 
        } 
      } 
    } finally {}
    ArrayList<Byte> arrayList = o.e((Object[])new Byte[] { 
          Byte.valueOf((byte)1), Byte.valueOf((byte)3), Byte.valueOf((byte)1), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), 
          Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)0) });
    if (paramDevice != null) {
      e = (r6.e)O(paramDevice);
      if (e != null) {
        char[] arrayOfChar = e.toCharArray();
        r8.m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
        if (arrayOfChar != null) {
          int j = arrayOfChar.length;
          int i;
          for (i = b; i < j; i++)
            arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48))); 
        } 
      } 
    } 
    if (paramDevice != null) {
      e = paramDevice.getConnType();
    } else {
      e = null;
    } 
    h(paramContext, e, arrayList, false, 0, 0L, paramInt, false, false, false, new f(paraml, paramDevice), 476, null);
  }
  
  public static final void m(Activity paramActivity, q8.a<q> parama, p<? super Boolean, ? super List<ScanResult>, q> paramp) {
    r8.m.j(paramActivity, "<this>");
    r8.m.j(parama, "onstart");
    r8.m.j(paramp, "callback");
    x7.c.a a1 = x7.c.a;
    App.a a2 = App.g;
    boolean bool = a2.k();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("discover2() > scanning=");
    stringBuilder.append(bool);
    x7.c.a.b(a1, "Me-MainAct-PekUtils", stringBuilder.toString(), false, 4, null);
    if (!a2.k()) {
      StringBuilder stringBuilder2;
      if (Build.VERSION.SDK_INT >= 23 && (!w0.a((Context)paramActivity) || !o0.a((Context)paramActivity))) {
        bool = a2.k();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("discover2() > !hasLocationPerm || !isLocationEnabled > scanning=");
        stringBuilder2.append(bool);
        x7.c.a.b(a1, "Me-MainAct-PekUtils", stringBuilder2.toString(), false, 4, null);
        t6.c.f.a(paramActivity).p(t6.c.b.START_SCAN, 0L, new g(paramActivity, parama, paramp));
        return;
      } 
      stringBuilder2.s(true);
      bool = stringBuilder2.k();
      stringBuilder = new StringBuilder();
      stringBuilder.append("discover2() > invoke onstart()  scanning=");
      stringBuilder.append(bool);
      x7.c.a.b(a1, "Me-MainAct-PekUtils", stringBuilder.toString(), false, 4, null);
      parama.invoke();
      bool = stringBuilder2.k();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("discover2() > call scanWifi()  scanning=");
      stringBuilder1.append(bool);
      x7.c.a.b(a1, "Me-MainAct-PekUtils", stringBuilder1.toString(), false, 4, null);
      b2.i(paramActivity, paramp, null, 2, null);
    } 
  }
  
  public static final File n(w5.b paramb, Context paramContext) {
    r8.m.j(paramb, "<this>");
    try {
      (new File(p(paramContext))).mkdirs();
      String str2 = p(paramContext);
      String str1 = w(paramb);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append(str1);
      File file = new File(stringBuilder.toString());
      return file;
    } finally {
      paramb = null;
    } 
  }
  
  public static final File o(w5.b paramb, Context paramContext) {
    r8.m.j(paramb, "<this>");
    try {
      (new File(p(paramContext))).mkdirs();
      String str2 = p(paramContext);
      String str1 = x(paramb);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append(str1);
      File file = new File(stringBuilder.toString());
      boolean bool = file.exists();
      if (bool)
        return file; 
    } finally {}
    return null;
  }
  
  public static final String p(Context paramContext) {
    if (paramContext != null) {
      File file = paramContext.getFilesDir();
      if (file != null) {
        String str = file.getAbsolutePath();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append("/firmwares/");
        return stringBuilder1.toString();
      } 
    } 
    paramContext = null;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append((String)paramContext);
    stringBuilder.append("/firmwares/");
    return stringBuilder.toString();
  }
  
  private static final InetAddress q(Context paramContext) {
    if (((y4.k)y4.k.k.a(paramContext)).d() == 1) {
      InetAddress inetAddress1 = InetAddress.getByName("192.168.1.255");
      r8.m.i(inetAddress1, "getByName(\"192.168.1.255\")");
      return inetAddress1;
    } 
    InetAddress inetAddress = InetAddress.getByName("255.255.255.255");
    r8.m.i(inetAddress, "getByName(\"255.255.255.255\")");
    return inetAddress;
  }
  
  public static final Map<String, a> r() {
    return a;
  }
  
  public static final String s(String paramString) {
    r8.m.j(paramString, "<this>");
    return y.a(paramString, F("聽PEK(PSH213)158523647058376932Â9825490572 /pub"));
  }
  
  public static final boolean t() {
    return b;
  }
  
  public static final Map<String, com.smartpek.data.local.models.e> u() {
    return c;
  }
  
  public static final String v(String paramString) {
    r8.m.j(paramString, "<this>");
    return y.b(paramString, F("聽PEK(PSH213)158523647058376932Â9825490572 /pub"));
  }
  
  public static final String w(w5.b paramb) {
    r8.m.j(paramb, "<this>");
    String str = x(paramb);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(".html");
    return stringBuilder.toString();
  }
  
  public static final String x(w5.b paramb) {
    String str2;
    r8.m.j(paramb, "<this>");
    DeviceType deviceType2 = paramb.getType();
    DeviceType deviceType3 = DeviceType.B_PATROM;
    DeviceType deviceType1 = null;
    String str1 = null;
    if (deviceType2 == deviceType3) {
      double d;
      Double double_1 = paramb.getVersion();
      if (double_1 != null) {
        d = double_1.doubleValue();
      } else {
        d = 0.0D;
      } 
      if (d <= 3.5D) {
        deviceType1 = paramb.getType();
        if (deviceType1 != null)
          str1 = deviceType1.getTypeName(); 
        str2 = O((Device)paramb);
        double_ = paramb.getVersion();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append("_");
        stringBuilder1.append(str2);
        stringBuilder1.append("_");
        stringBuilder1.append(double_);
        stringBuilder1.append(".dll");
        return stringBuilder1.toString();
      } 
    } 
    deviceType2 = double_.getType();
    str1 = str2;
    if (deviceType2 != null)
      str1 = deviceType2.getTypeName(); 
    Double double_ = double_.getVersion();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append("_");
    stringBuilder.append(double_);
    stringBuilder.append(".dll");
    return stringBuilder.toString();
  }
  
  public static final char y(char paramChar) {
    char c = paramChar;
    if (paramChar == '聽')
      c = ' '; 
    return c;
  }
  
  public static final String z(String paramString) {
    r8.m.j(paramString, "<this>");
    return z8.m.C(z8.m.C(z8.m.C(z8.m.C(paramString, "%", "%25", false, 4, null), "#", "%23", false, 4, null), "&", "%26", false, 4, null), "+", "%2B", false, 4, null);
  }
  
  static final class a extends n implements q8.a<q> {
    a(Activity param1Activity) {
      super(0);
    }
    
    public final void invoke() {
      this.g.finish();
      this.g.startActivity(new Intent((Context)this.g, DeviceUpgradeAct.class));
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(a0<DatagramSocket> param1a0) {
      super(0);
    }
    
    public final void invoke() {
      try {
        return;
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(p<? super n, ? super Throwable, q> param1p, n param1n) {
      super(0);
    }
    
    public final void invoke() {
      this.g.invoke(this.h, null);
    }
  }
  
  static final class d extends n implements q8.a<q> {
    d(p<? super n, ? super Throwable, q> param1p, Throwable param1Throwable) {
      super(0);
    }
    
    public final void invoke() {
      p<n, Throwable, q> p1 = this.g;
      if (p1 != null)
        p1.invoke(null, this.h); 
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(q8.l<? super n, q> param1l, a param1a) {
      super(0);
    }
    
    public final void invoke() {
      this.g.invoke(new n(this.h.b(), ""));
    }
  }
  
  static final class f extends n implements p<n, Throwable, q> {
    f(q8.l<? super n, q> param1l, Device param1Device) {
      super(2);
    }
    
    public final void a(n param1n, Throwable param1Throwable) {
      if (param1Throwable != null) {
        this.g.invoke(null);
        return;
      } 
      this.g.invoke(param1n);
      try {
        Map<String, a> map = m.r();
      } finally {
        param1n = null;
      } 
    }
  }
  
  static final class g extends n implements q8.l<Boolean, q> {
    g(Activity param1Activity, q8.a<q> param1a, p<? super Boolean, ? super List<ScanResult>, q> param1p) {
      super(1);
    }
    
    public final void a(boolean param1Boolean) {
      x7.c.a a1 = x7.c.a;
      boolean bool = App.g.k();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("discover2() > NeededLocation callback()  it=");
      stringBuilder.append(param1Boolean);
      stringBuilder.append("  scanning=");
      stringBuilder.append(bool);
      x7.c.a.b(a1, "Me-MainAct-PekUtils", stringBuilder.toString(), false, 4, null);
      if (param1Boolean) {
        m.m(this.g, this.h, this.i);
        return;
      } 
      this.i.invoke(null, null);
    }
  }
  
  static final class h extends n implements p<Boolean, s6.c, q> {
    h(x param1x1, x param1x2, a0<q<Boolean, r6.e, String, q>> param1a0, Device param1Device, x param1x3) {
      super(2);
    }
    
    public final void a(boolean param1Boolean, s6.c param1c) {
      q q;
      if (!param1Boolean || param1c == null) {
        this.g.g = true;
        if (this.h.g) {
          q = (q)this.i.g;
          if (q != null)
            q.g(Boolean.FALSE, r6.e.UDP, null); 
          this.i.g = null;
        } 
        return;
      } 
      Device device = this.j;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (device != null) {
        Modem[] arrayOfModem = device.getModems();
        bool1 = bool2;
        if (arrayOfModem != null) {
          boolean bool;
          if (arrayOfModem.length == 0) {
            bool = true;
          } else {
            bool = false;
          } 
          bool1 = bool2;
          if ((bool ^ true) == 1)
            bool1 = true; 
        } 
      } 
      if (bool1)
        this.k.g = true; 
      q.f(this.j, MqttRequest.Companion.a(), 1000, false, new a(this.g, this.i, this.h));
    }
    
    static final class a extends n implements q8.l<r9.l, q> {
      a(x param2x1, a0<q<Boolean, r6.e, String, q>> param2a0, x param2x2) {
        super(1);
      }
      
      public final void a(r9.l param2l) {
        this.g.g = true;
        if (param2l != null) {
          q q = (q)this.h.g;
          if (q != null)
            q.g(Boolean.TRUE, r6.e.MQTT, null); 
          this.h.g = null;
          return;
        } 
        if (this.i.g) {
          q q = (q)this.h.g;
          if (q != null)
            q.g(Boolean.FALSE, r6.e.MQTT, null); 
          this.h.g = null;
        } 
      }
    }
  }
  
  static final class a extends n implements q8.l<r9.l, q> {
    a(x param1x1, a0<q<Boolean, r6.e, String, q>> param1a0, x param1x2) {
      super(1);
    }
    
    public final void a(r9.l param1l) {
      this.g.g = true;
      if (param1l != null) {
        q q = (q)this.h.g;
        if (q != null)
          q.g(Boolean.TRUE, r6.e.MQTT, null); 
        this.h.g = null;
        return;
      } 
      if (this.i.g) {
        q q = (q)this.h.g;
        if (q != null)
          q.g(Boolean.FALSE, r6.e.MQTT, null); 
        this.h.g = null;
      } 
    }
  }
  
  static final class i extends n implements q8.l<n, q> {
    i(x param1x1, a0<q<Boolean, r6.e, String, q>> param1a0, x param1x2, x param1x3, Context param1Context) {
      super(1);
    }
    
    public final void a(n param1n) {
      this.g.g = true;
      if (param1n != null) {
        q q = (q)this.h.g;
        if (q != null)
          q.g(Boolean.TRUE, r6.e.UDP, param1n.b()); 
        this.h.g = null;
        return;
      } 
      boolean bool = this.i.g;
      if (bool && !this.j.g) {
        q q = (q)this.h.g;
        if (q != null)
          q.g(Boolean.FALSE, r6.e.UDP, null); 
        this.h.g = null;
        return;
      } 
      if (bool) {
        q q = (q)this.h.g;
        if (q != null)
          q.g(Boolean.TRUE, r6.e.MQTT, null); 
        this.h.g = null;
        return;
      } 
      if (m.R(ConnMngr.j.h(this.k)) || !s6.c.d.i()) {
        q q = (q)this.h.g;
        if (q != null)
          q.g(Boolean.FALSE, r6.e.UDP, null); 
        this.h.g = null;
      } 
    }
  }
  
  static final class j extends n implements q8.a<q> {
    public static final j g = new j();
    
    j() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class k extends n implements q8.a<q> {
    public static final k g = new k();
    
    k() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class l extends n implements p<Boolean, s6.c, q> {
    l(q8.l<? super Throwable, q> param1l, q8.a<q> param1a, Device param1Device, Object param1Object, boolean param1Boolean, q8.l<Object, q> param1l1) {
      super(2);
    }
    
    public final void a(boolean param1Boolean, s6.c param1c) {
      if (!param1Boolean) {
        this.g.invoke(new Throwable("can not connect"));
        return;
      } 
      this.h.invoke();
      if (param1c != null)
        s6.c.i(param1c, this.i.getMqttUsername(), this.j, 0, this.k, new a(this.g, this.l), 4, null); 
    }
    
    static final class a extends n implements q8.l<r9.l, q> {
      a(q8.l<? super Throwable, q> param2l, q8.l<Object, q> param2l1) {
        super(1);
      }
      
      public final void a(r9.l param2l) {
        // Byte code:
        //   0: aload_1
        //   1: ifnonnull -> 24
        //   4: aload_0
        //   5: getfield g : Lq8/l;
        //   8: new java/lang/Throwable
        //   11: dup
        //   12: ldc 'null message'
        //   14: invokespecial <init> : (Ljava/lang/String;)V
        //   17: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   22: pop
        //   23: return
        //   24: aload_1
        //   25: invokevirtual e : ()[B
        //   28: astore_1
        //   29: aload_1
        //   30: ldc 'message.payload'
        //   32: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
        //   35: new org/json/JSONObject
        //   38: dup
        //   39: new java/lang/String
        //   42: dup
        //   43: aload_1
        //   44: getstatic z8/d.b : Ljava/nio/charset/Charset;
        //   47: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
        //   50: invokespecial <init> : (Ljava/lang/String;)V
        //   53: astore_1
        //   54: aload_1
        //   55: ldc 'section'
        //   57: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   60: astore_3
        //   61: aload_3
        //   62: ifnull -> 428
        //   65: aload_3
        //   66: invokevirtual hashCode : ()I
        //   69: istore_2
        //   70: iload_2
        //   71: lookupswitch default -> 112, 81069 -> 323, 65203182 -> 218, 80204913 -> 127, 1989569876 -> 115
        //   112: goto -> 428
        //   115: aload_3
        //   116: ldc 'Temperature'
        //   118: invokevirtual equals : (Ljava/lang/Object;)Z
        //   121: ifne -> 230
        //   124: goto -> 428
        //   127: aload_3
        //   128: ldc 'State'
        //   130: invokevirtual equals : (Ljava/lang/Object;)Z
        //   133: ifne -> 139
        //   136: goto -> 428
        //   139: aload_1
        //   140: ldc 'section'
        //   142: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   145: astore_3
        //   146: aload_3
        //   147: ldc 'json.getString("section")'
        //   149: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
        //   152: new com/smartpek/utils/connection/mqtt/MqttResponse
        //   155: dup
        //   156: aload_3
        //   157: aconst_null
        //   158: aconst_null
        //   159: aconst_null
        //   160: bipush #14
        //   162: aconst_null
        //   163: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
        //   166: astore_3
        //   167: aload_1
        //   168: ldc 'value'
        //   170: invokevirtual has : (Ljava/lang/String;)Z
        //   173: ifeq -> 189
        //   176: aload_3
        //   177: aload_1
        //   178: ldc 'value'
        //   180: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   183: invokevirtual setStr : (Ljava/lang/String;)V
        //   186: goto -> 206
        //   189: aload_1
        //   190: ldc 'data'
        //   192: invokevirtual has : (Ljava/lang/String;)Z
        //   195: ifeq -> 206
        //   198: aload_3
        //   199: aload_1
        //   200: invokevirtual toString : ()Ljava/lang/String;
        //   203: invokevirtual setStr : (Ljava/lang/String;)V
        //   206: aload_0
        //   207: getfield h : Lq8/l;
        //   210: aload_3
        //   211: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   216: pop
        //   217: return
        //   218: aload_3
        //   219: ldc 'Clock'
        //   221: invokevirtual equals : (Ljava/lang/Object;)Z
        //   224: ifne -> 230
        //   227: goto -> 428
        //   230: aload_1
        //   231: ldc 'section'
        //   233: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   236: astore_3
        //   237: aload_3
        //   238: ldc 'json.getString("section")'
        //   240: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
        //   243: new com/smartpek/utils/connection/mqtt/MqttResponse
        //   246: dup
        //   247: aload_3
        //   248: aconst_null
        //   249: aconst_null
        //   250: aconst_null
        //   251: bipush #14
        //   253: aconst_null
        //   254: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
        //   257: astore_3
        //   258: aload_1
        //   259: ldc 'value'
        //   261: invokevirtual has : (Ljava/lang/String;)Z
        //   264: ifeq -> 287
        //   267: aload_3
        //   268: new org/json/JSONArray
        //   271: dup
        //   272: aload_1
        //   273: ldc 'value'
        //   275: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   278: invokespecial <init> : (Ljava/lang/String;)V
        //   281: invokevirtual setArr : (Lorg/json/JSONArray;)V
        //   284: goto -> 311
        //   287: aload_1
        //   288: ldc 'data'
        //   290: invokevirtual has : (Ljava/lang/String;)Z
        //   293: ifeq -> 311
        //   296: aload_3
        //   297: new org/json/JSONArray
        //   300: dup
        //   301: aload_1
        //   302: invokevirtual toString : ()Ljava/lang/String;
        //   305: invokespecial <init> : (Ljava/lang/String;)V
        //   308: invokevirtual setArr : (Lorg/json/JSONArray;)V
        //   311: aload_0
        //   312: getfield h : Lq8/l;
        //   315: aload_3
        //   316: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   321: pop
        //   322: return
        //   323: aload_3
        //   324: ldc 'RGB'
        //   326: invokevirtual equals : (Ljava/lang/Object;)Z
        //   329: ifne -> 335
        //   332: goto -> 428
        //   335: aload_1
        //   336: ldc 'section'
        //   338: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   341: astore_3
        //   342: aload_3
        //   343: ldc 'json.getString("section")'
        //   345: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
        //   348: new com/smartpek/utils/connection/mqtt/MqttResponse
        //   351: dup
        //   352: aload_3
        //   353: aconst_null
        //   354: aconst_null
        //   355: aconst_null
        //   356: bipush #14
        //   358: aconst_null
        //   359: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
        //   362: astore_3
        //   363: aload_1
        //   364: ldc 'value'
        //   366: invokevirtual has : (Ljava/lang/String;)Z
        //   369: ifeq -> 392
        //   372: aload_3
        //   373: new org/json/JSONObject
        //   376: dup
        //   377: aload_1
        //   378: ldc 'value'
        //   380: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
        //   383: invokespecial <init> : (Ljava/lang/String;)V
        //   386: invokevirtual setObj : (Lorg/json/JSONObject;)V
        //   389: goto -> 416
        //   392: aload_1
        //   393: ldc 'data'
        //   395: invokevirtual has : (Ljava/lang/String;)Z
        //   398: ifeq -> 416
        //   401: aload_3
        //   402: new org/json/JSONObject
        //   405: dup
        //   406: aload_1
        //   407: invokevirtual toString : ()Ljava/lang/String;
        //   410: invokespecial <init> : (Ljava/lang/String;)V
        //   413: invokevirtual setObj : (Lorg/json/JSONObject;)V
        //   416: aload_0
        //   417: getfield h : Lq8/l;
        //   420: aload_3
        //   421: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   426: pop
        //   427: return
        //   428: aload_0
        //   429: getfield h : Lq8/l;
        //   432: astore_1
        //   433: aload_3
        //   434: ldc 'section'
        //   436: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
        //   439: aload_1
        //   440: new com/smartpek/utils/connection/mqtt/MqttResponse
        //   443: dup
        //   444: aload_3
        //   445: aconst_null
        //   446: aconst_null
        //   447: aconst_null
        //   448: bipush #14
        //   450: aconst_null
        //   451: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
        //   454: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   459: pop
        //   460: return
        //   461: astore_1
        //   462: aload_1
        //   463: invokevirtual printStackTrace : ()V
        //   466: aload_0
        //   467: getfield g : Lq8/l;
        //   470: aload_1
        //   471: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
        //   476: pop
        //   477: return
        // Exception table:
        //   from	to	target	type
        //   24	61	461	finally
        //   65	70	461	finally
        //   115	124	461	finally
        //   127	136	461	finally
        //   139	186	461	finally
        //   189	206	461	finally
        //   206	217	461	finally
        //   218	227	461	finally
        //   230	284	461	finally
        //   287	311	461	finally
        //   311	322	461	finally
        //   323	332	461	finally
        //   335	389	461	finally
        //   392	416	461	finally
        //   416	427	461	finally
        //   428	460	461	finally
      }
    }
  }
  
  static final class a extends n implements q8.l<r9.l, q> {
    a(q8.l<? super Throwable, q> param1l, q8.l<Object, q> param1l1) {
      super(1);
    }
    
    public final void a(r9.l param1l) {
      // Byte code:
      //   0: aload_1
      //   1: ifnonnull -> 24
      //   4: aload_0
      //   5: getfield g : Lq8/l;
      //   8: new java/lang/Throwable
      //   11: dup
      //   12: ldc 'null message'
      //   14: invokespecial <init> : (Ljava/lang/String;)V
      //   17: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   22: pop
      //   23: return
      //   24: aload_1
      //   25: invokevirtual e : ()[B
      //   28: astore_1
      //   29: aload_1
      //   30: ldc 'message.payload'
      //   32: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   35: new org/json/JSONObject
      //   38: dup
      //   39: new java/lang/String
      //   42: dup
      //   43: aload_1
      //   44: getstatic z8/d.b : Ljava/nio/charset/Charset;
      //   47: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
      //   50: invokespecial <init> : (Ljava/lang/String;)V
      //   53: astore_1
      //   54: aload_1
      //   55: ldc 'section'
      //   57: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   60: astore_3
      //   61: aload_3
      //   62: ifnull -> 428
      //   65: aload_3
      //   66: invokevirtual hashCode : ()I
      //   69: istore_2
      //   70: iload_2
      //   71: lookupswitch default -> 112, 81069 -> 323, 65203182 -> 218, 80204913 -> 127, 1989569876 -> 115
      //   112: goto -> 428
      //   115: aload_3
      //   116: ldc 'Temperature'
      //   118: invokevirtual equals : (Ljava/lang/Object;)Z
      //   121: ifne -> 230
      //   124: goto -> 428
      //   127: aload_3
      //   128: ldc 'State'
      //   130: invokevirtual equals : (Ljava/lang/Object;)Z
      //   133: ifne -> 139
      //   136: goto -> 428
      //   139: aload_1
      //   140: ldc 'section'
      //   142: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   145: astore_3
      //   146: aload_3
      //   147: ldc 'json.getString("section")'
      //   149: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   152: new com/smartpek/utils/connection/mqtt/MqttResponse
      //   155: dup
      //   156: aload_3
      //   157: aconst_null
      //   158: aconst_null
      //   159: aconst_null
      //   160: bipush #14
      //   162: aconst_null
      //   163: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
      //   166: astore_3
      //   167: aload_1
      //   168: ldc 'value'
      //   170: invokevirtual has : (Ljava/lang/String;)Z
      //   173: ifeq -> 189
      //   176: aload_3
      //   177: aload_1
      //   178: ldc 'value'
      //   180: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   183: invokevirtual setStr : (Ljava/lang/String;)V
      //   186: goto -> 206
      //   189: aload_1
      //   190: ldc 'data'
      //   192: invokevirtual has : (Ljava/lang/String;)Z
      //   195: ifeq -> 206
      //   198: aload_3
      //   199: aload_1
      //   200: invokevirtual toString : ()Ljava/lang/String;
      //   203: invokevirtual setStr : (Ljava/lang/String;)V
      //   206: aload_0
      //   207: getfield h : Lq8/l;
      //   210: aload_3
      //   211: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   216: pop
      //   217: return
      //   218: aload_3
      //   219: ldc 'Clock'
      //   221: invokevirtual equals : (Ljava/lang/Object;)Z
      //   224: ifne -> 230
      //   227: goto -> 428
      //   230: aload_1
      //   231: ldc 'section'
      //   233: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   236: astore_3
      //   237: aload_3
      //   238: ldc 'json.getString("section")'
      //   240: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   243: new com/smartpek/utils/connection/mqtt/MqttResponse
      //   246: dup
      //   247: aload_3
      //   248: aconst_null
      //   249: aconst_null
      //   250: aconst_null
      //   251: bipush #14
      //   253: aconst_null
      //   254: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
      //   257: astore_3
      //   258: aload_1
      //   259: ldc 'value'
      //   261: invokevirtual has : (Ljava/lang/String;)Z
      //   264: ifeq -> 287
      //   267: aload_3
      //   268: new org/json/JSONArray
      //   271: dup
      //   272: aload_1
      //   273: ldc 'value'
      //   275: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   278: invokespecial <init> : (Ljava/lang/String;)V
      //   281: invokevirtual setArr : (Lorg/json/JSONArray;)V
      //   284: goto -> 311
      //   287: aload_1
      //   288: ldc 'data'
      //   290: invokevirtual has : (Ljava/lang/String;)Z
      //   293: ifeq -> 311
      //   296: aload_3
      //   297: new org/json/JSONArray
      //   300: dup
      //   301: aload_1
      //   302: invokevirtual toString : ()Ljava/lang/String;
      //   305: invokespecial <init> : (Ljava/lang/String;)V
      //   308: invokevirtual setArr : (Lorg/json/JSONArray;)V
      //   311: aload_0
      //   312: getfield h : Lq8/l;
      //   315: aload_3
      //   316: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   321: pop
      //   322: return
      //   323: aload_3
      //   324: ldc 'RGB'
      //   326: invokevirtual equals : (Ljava/lang/Object;)Z
      //   329: ifne -> 335
      //   332: goto -> 428
      //   335: aload_1
      //   336: ldc 'section'
      //   338: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   341: astore_3
      //   342: aload_3
      //   343: ldc 'json.getString("section")'
      //   345: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   348: new com/smartpek/utils/connection/mqtt/MqttResponse
      //   351: dup
      //   352: aload_3
      //   353: aconst_null
      //   354: aconst_null
      //   355: aconst_null
      //   356: bipush #14
      //   358: aconst_null
      //   359: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
      //   362: astore_3
      //   363: aload_1
      //   364: ldc 'value'
      //   366: invokevirtual has : (Ljava/lang/String;)Z
      //   369: ifeq -> 392
      //   372: aload_3
      //   373: new org/json/JSONObject
      //   376: dup
      //   377: aload_1
      //   378: ldc 'value'
      //   380: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   383: invokespecial <init> : (Ljava/lang/String;)V
      //   386: invokevirtual setObj : (Lorg/json/JSONObject;)V
      //   389: goto -> 416
      //   392: aload_1
      //   393: ldc 'data'
      //   395: invokevirtual has : (Ljava/lang/String;)Z
      //   398: ifeq -> 416
      //   401: aload_3
      //   402: new org/json/JSONObject
      //   405: dup
      //   406: aload_1
      //   407: invokevirtual toString : ()Ljava/lang/String;
      //   410: invokespecial <init> : (Ljava/lang/String;)V
      //   413: invokevirtual setObj : (Lorg/json/JSONObject;)V
      //   416: aload_0
      //   417: getfield h : Lq8/l;
      //   420: aload_3
      //   421: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   426: pop
      //   427: return
      //   428: aload_0
      //   429: getfield h : Lq8/l;
      //   432: astore_1
      //   433: aload_3
      //   434: ldc 'section'
      //   436: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   439: aload_1
      //   440: new com/smartpek/utils/connection/mqtt/MqttResponse
      //   443: dup
      //   444: aload_3
      //   445: aconst_null
      //   446: aconst_null
      //   447: aconst_null
      //   448: bipush #14
      //   450: aconst_null
      //   451: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;ILr8/g;)V
      //   454: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   459: pop
      //   460: return
      //   461: astore_1
      //   462: aload_1
      //   463: invokevirtual printStackTrace : ()V
      //   466: aload_0
      //   467: getfield g : Lq8/l;
      //   470: aload_1
      //   471: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   476: pop
      //   477: return
      // Exception table:
      //   from	to	target	type
      //   24	61	461	finally
      //   65	70	461	finally
      //   115	124	461	finally
      //   127	136	461	finally
      //   139	186	461	finally
      //   189	206	461	finally
      //   206	217	461	finally
      //   218	227	461	finally
      //   230	284	461	finally
      //   287	311	461	finally
      //   311	322	461	finally
      //   323	332	461	finally
      //   335	389	461	finally
      //   392	416	461	finally
      //   416	427	461	finally
      //   428	460	461	finally
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p6\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */