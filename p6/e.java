package p6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.VolleyError;
import com.android.volley.f;
import com.android.volley.g;
import e8.q;
import java.util.HashMap;
import java.util.Map;
import q8.l;
import r8.g;
import r8.m;
import r8.n;
import z0.k;

public final class e {
  public static final a h = new a(null);
  
  private static f i;
  
  private final Context a;
  
  private String b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private HashMap<String, String> g;
  
  public e(Context paramContext) {
    this.a = paramContext;
    this.g = new HashMap<String, String>();
  }
  
  private static final void k(l paraml, String paramString) {
    if (paraml != null) {
      m.i(paramString, "st");
      paraml.invoke(paramString);
    } 
  }
  
  private static final void l(e parame, l<? super String, q> paraml1, l<? super VolleyError, q> paraml2, VolleyError paramVolleyError) {
    m.j(parame, "this$0");
    i8.a.b(false, false, null, null, 0, new c(parame, paraml1, paraml2, paramVolleyError), 31, null);
  }
  
  public final e h(String paramString1, String paramString2) {
    m.j(paramString1, "valid");
    m.j(paramString2, "string");
    HashMap<String, String> hashMap = this.g;
    if (hashMap != null)
      hashMap.put(paramString1, paramString2); 
    return this;
  }
  
  public final void i(l<? super String, q> paraml, l<? super VolleyError, q> paraml1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/lang/String;
    //   4: astore #4
    //   6: aload #4
    //   8: invokestatic g : (Ljava/lang/Object;)V
    //   11: new java/lang/StringBuilder
    //   14: dup
    //   15: aload #4
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: astore #5
    //   22: aload_0
    //   23: getfield f : I
    //   26: ifne -> 135
    //   29: aload_0
    //   30: getfield g : Ljava/util/HashMap;
    //   33: astore #4
    //   35: aload #4
    //   37: invokestatic g : (Ljava/lang/Object;)V
    //   40: aload #4
    //   42: invokeinterface entrySet : ()Ljava/util/Set;
    //   47: invokeinterface iterator : ()Ljava/util/Iterator;
    //   52: astore #4
    //   54: aload #4
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 135
    //   64: aload #4
    //   66: invokeinterface next : ()Ljava/lang/Object;
    //   71: checkcast java/util/Map$Entry
    //   74: astore #7
    //   76: aload #7
    //   78: invokeinterface getKey : ()Ljava/lang/Object;
    //   83: checkcast java/lang/String
    //   86: astore #6
    //   88: aload #7
    //   90: invokeinterface getValue : ()Ljava/lang/Object;
    //   95: checkcast java/lang/String
    //   98: astore #7
    //   100: aload #5
    //   102: aload #6
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload #5
    //   110: ldc '='
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload #5
    //   118: aload #7
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload #5
    //   126: ldc '&'
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: goto -> 54
    //   135: aload_0
    //   136: getfield f : I
    //   139: istore_3
    //   140: iload_3
    //   141: ifne -> 192
    //   144: aload_0
    //   145: getfield g : Ljava/util/HashMap;
    //   148: astore #4
    //   150: aload #4
    //   152: invokestatic g : (Ljava/lang/Object;)V
    //   155: aload #4
    //   157: invokeinterface isEmpty : ()Z
    //   162: iconst_1
    //   163: ixor
    //   164: ifeq -> 192
    //   167: aload #5
    //   169: aload #5
    //   171: invokevirtual length : ()I
    //   174: iconst_1
    //   175: isub
    //   176: aload #5
    //   178: invokevirtual length : ()I
    //   181: invokestatic p0 : (Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    //   184: invokevirtual toString : ()Ljava/lang/String;
    //   187: astore #4
    //   189: goto -> 206
    //   192: aload #5
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: astore #4
    //   199: aload #4
    //   201: ldc '{\\n                url.toString()\\n            }'
    //   203: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   206: new p6/e$b
    //   209: dup
    //   210: aload_0
    //   211: iload_3
    //   212: aload #4
    //   214: new p6/c
    //   217: dup
    //   218: aload_1
    //   219: invokespecial <init> : (Lq8/l;)V
    //   222: new p6/d
    //   225: dup
    //   226: aload_0
    //   227: aload_1
    //   228: aload_2
    //   229: invokespecial <init> : (Lp6/e;Lq8/l;Lq8/l;)V
    //   232: invokespecial <init> : (Lp6/e;ILjava/lang/String;Lcom/android/volley/g$b;Lcom/android/volley/g$a;)V
    //   235: astore_1
    //   236: aload_0
    //   237: getfield c : I
    //   240: istore_3
    //   241: iload_3
    //   242: ifeq -> 260
    //   245: aload_1
    //   246: new y0/a
    //   249: dup
    //   250: iload_3
    //   251: iconst_1
    //   252: fconst_1
    //   253: invokespecial <init> : (IIF)V
    //   256: invokevirtual J : (Ly0/f;)Lcom/android/volley/e;
    //   259: pop
    //   260: getstatic p6/e.i : Lcom/android/volley/f;
    //   263: ifnonnull -> 276
    //   266: aload_0
    //   267: getfield a : Landroid/content/Context;
    //   270: invokestatic a : (Landroid/content/Context;)Lcom/android/volley/f;
    //   273: putstatic p6/e.i : Lcom/android/volley/f;
    //   276: getstatic p6/e.i : Lcom/android/volley/f;
    //   279: astore_2
    //   280: aload_2
    //   281: ifnull -> 290
    //   284: aload_2
    //   285: aload_1
    //   286: invokevirtual a : (Lcom/android/volley/e;)Lcom/android/volley/e;
    //   289: pop
    //   290: new java/lang/StringBuilder
    //   293: dup
    //   294: invokespecial <init> : ()V
    //   297: astore_1
    //   298: aload_1
    //   299: ldc 'request: '
    //   301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload_1
    //   306: aload #5
    //   308: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: return
  }
  
  public final e m(String paramString) {
    m.j(paramString, "url");
    this.b = paramString;
    this.f = 0;
    return this;
  }
  
  public final e n(int paramInt) {
    this.c = paramInt;
    return this;
  }
  
  public final e o(int paramInt) {
    this.e = 0;
    this.d = paramInt;
    return this;
  }
  
  public static final class a {
    private a() {}
  }
  
  public static final class b extends k {
    b(e param1e, int param1Int, String param1String, g.b<String> param1b, g.a param1a) {
      super(param1Int, param1String, param1b, param1a);
    }
    
    protected HashMap<String, String> P() {
      return e.d(this.y);
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(e param1e, l<? super String, q> param1l, l<? super VolleyError, q> param1l1, VolleyError param1VolleyError) {
      super(0);
    }
    
    private static final void d(e param1e, l<? super String, q> param1l1, l<? super VolleyError, q> param1l2) {
      m.j(param1e, "this$0");
      param1e.i(param1l1, param1l2);
    }
    
    private static final void e(l param1l, VolleyError param1VolleyError) {
      if (param1l != null) {
        m.i(param1VolleyError, "er");
        param1l.invoke(param1VolleyError);
      } 
    }
    
    public final void invoke() {
      try {
        Thread.sleep(e.e(this.g));
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      if (e.f(this.g) < e.c(this.g)) {
        e e1 = this.g;
        e.g(e1, e.f(e1) + 1);
        (new Handler(Looper.getMainLooper())).post(new f(this.g, this.h, this.i));
        return;
      } 
      (new Handler(Looper.getMainLooper())).post(new g(this.i, this.j));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p6\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */