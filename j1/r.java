package j1;

import androidx.core.util.e;
import d1.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import x1.k;

public class r {
  private static final c e = new c();
  
  private static final n<Object, Object> f = new a();
  
  private final List<b<?, ?>> a = new ArrayList<b<?, ?>>();
  
  private final c b;
  
  private final Set<b<?, ?>> c = new HashSet<b<?, ?>>();
  
  private final e<List<Throwable>> d;
  
  public r(e<List<Throwable>> parame) {
    this(parame, e);
  }
  
  r(e<List<Throwable>> parame, c paramc) {
    this.d = parame;
    this.b = paramc;
  }
  
  private <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo, boolean paramBoolean) {
    boolean bool;
    b<Model, Data> b = new b<Model, Data>(paramClass, paramClass1, paramo);
    List<b<?, ?>> list = this.a;
    if (paramBoolean) {
      bool = list.size();
    } else {
      bool = false;
    } 
    list.add(bool, b);
  }
  
  private <Model, Data> n<Model, Data> c(b<?, ?> paramb) {
    return (n<Model, Data>)k.d(paramb.c.a(this));
  }
  
  private static <Model, Data> n<Model, Data> f() {
    return (n)f;
  }
  
  <Model, Data> void b(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: aload_2
    //   5: aload_3
    //   6: iconst_1
    //   7: invokespecial a : (Ljava/lang/Class;Ljava/lang/Class;Lj1/o;Z)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	13	finally
  }
  
  public <Model, Data> n<Model, Data> d(Class<Model> paramClass, Class<Data> paramClass1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore #4
    //   11: aload_0
    //   12: getfield a : Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #5
    //   22: iconst_0
    //   23: istore_3
    //   24: aload #5
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 116
    //   34: aload #5
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast j1/r$b
    //   44: astore #6
    //   46: aload_0
    //   47: getfield c : Ljava/util/Set;
    //   50: aload #6
    //   52: invokeinterface contains : (Ljava/lang/Object;)Z
    //   57: ifeq -> 65
    //   60: iconst_1
    //   61: istore_3
    //   62: goto -> 24
    //   65: aload #6
    //   67: aload_1
    //   68: aload_2
    //   69: invokevirtual b : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   72: ifeq -> 24
    //   75: aload_0
    //   76: getfield c : Ljava/util/Set;
    //   79: aload #6
    //   81: invokeinterface add : (Ljava/lang/Object;)Z
    //   86: pop
    //   87: aload #4
    //   89: aload_0
    //   90: aload #6
    //   92: invokespecial c : (Lj1/r$b;)Lj1/n;
    //   95: invokeinterface add : (Ljava/lang/Object;)Z
    //   100: pop
    //   101: aload_0
    //   102: getfield c : Ljava/util/Set;
    //   105: aload #6
    //   107: invokeinterface remove : (Ljava/lang/Object;)Z
    //   112: pop
    //   113: goto -> 24
    //   116: aload #4
    //   118: invokeinterface size : ()I
    //   123: iconst_1
    //   124: if_icmple -> 145
    //   127: aload_0
    //   128: getfield b : Lj1/r$c;
    //   131: aload #4
    //   133: aload_0
    //   134: getfield d : Landroidx/core/util/e;
    //   137: invokevirtual a : (Ljava/util/List;Landroidx/core/util/e;)Lj1/q;
    //   140: astore_1
    //   141: aload_0
    //   142: monitorexit
    //   143: aload_1
    //   144: areturn
    //   145: aload #4
    //   147: invokeinterface size : ()I
    //   152: iconst_1
    //   153: if_icmpne -> 172
    //   156: aload #4
    //   158: iconst_0
    //   159: invokeinterface get : (I)Ljava/lang/Object;
    //   164: checkcast j1/n
    //   167: astore_1
    //   168: aload_0
    //   169: monitorexit
    //   170: aload_1
    //   171: areturn
    //   172: iload_3
    //   173: ifeq -> 184
    //   176: invokestatic f : ()Lj1/n;
    //   179: astore_1
    //   180: aload_0
    //   181: monitorexit
    //   182: aload_1
    //   183: areturn
    //   184: new com/bumptech/glide/Registry$NoModelLoaderAvailableException
    //   187: dup
    //   188: aload_1
    //   189: aload_2
    //   190: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Class;)V
    //   193: athrow
    //   194: astore_1
    //   195: aload_0
    //   196: getfield c : Ljava/util/Set;
    //   199: invokeinterface clear : ()V
    //   204: aload_1
    //   205: athrow
    //   206: astore_1
    //   207: aload_0
    //   208: monitorexit
    //   209: aload_1
    //   210: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	194	finally
    //   24	60	194	finally
    //   65	113	194	finally
    //   116	141	194	finally
    //   145	168	194	finally
    //   176	180	194	finally
    //   184	194	194	finally
    //   195	206	206	finally
  }
  
  <Model> List<n<Model, ?>> e(Class<Model> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_2
    //   10: aload_0
    //   11: getfield a : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 106
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast j1/r$b
    //   38: astore #4
    //   40: aload_0
    //   41: getfield c : Ljava/util/Set;
    //   44: aload #4
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: ifeq -> 57
    //   54: goto -> 20
    //   57: aload #4
    //   59: aload_1
    //   60: invokevirtual a : (Ljava/lang/Class;)Z
    //   63: ifeq -> 20
    //   66: aload_0
    //   67: getfield c : Ljava/util/Set;
    //   70: aload #4
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_2
    //   79: aload_0
    //   80: aload #4
    //   82: invokespecial c : (Lj1/r$b;)Lj1/n;
    //   85: invokeinterface add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: aload_0
    //   92: getfield c : Ljava/util/Set;
    //   95: aload #4
    //   97: invokeinterface remove : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: goto -> 20
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: areturn
    //   110: astore_1
    //   111: aload_0
    //   112: getfield c : Ljava/util/Set;
    //   115: invokeinterface clear : ()V
    //   120: aload_1
    //   121: athrow
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	110	finally
    //   20	54	110	finally
    //   57	103	110	finally
    //   111	122	122	finally
  }
  
  List<Class<?>> g(Class<?> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_2
    //   10: aload_0
    //   11: getfield a : Ljava/util/List;
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 78
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast j1/r$b
    //   38: astore #4
    //   40: aload_2
    //   41: aload #4
    //   43: getfield b : Ljava/lang/Class;
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: ifne -> 20
    //   54: aload #4
    //   56: aload_1
    //   57: invokevirtual a : (Ljava/lang/Class;)Z
    //   60: ifeq -> 20
    //   63: aload_2
    //   64: aload #4
    //   66: getfield b : Ljava/lang/Class;
    //   69: invokeinterface add : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: goto -> 20
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: areturn
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	82	finally
    //   20	75	82	finally
  }
  
  private static class a implements n<Object, Object> {
    public boolean a(Object param1Object) {
      return false;
    }
    
    public n.a<Object> b(Object param1Object, int param1Int1, int param1Int2, g param1g) {
      return null;
    }
  }
  
  private static class b<Model, Data> {
    private final Class<Model> a;
    
    final Class<Data> b;
    
    final o<? extends Model, ? extends Data> c;
    
    public b(Class<Model> param1Class, Class<Data> param1Class1, o<? extends Model, ? extends Data> param1o) {
      this.a = param1Class;
      this.b = param1Class1;
      this.c = param1o;
    }
    
    public boolean a(Class<?> param1Class) {
      return this.a.isAssignableFrom(param1Class);
    }
    
    public boolean b(Class<?> param1Class1, Class<?> param1Class2) {
      return (a(param1Class1) && this.b.isAssignableFrom(param1Class2));
    }
  }
  
  static class c {
    public <Model, Data> q<Model, Data> a(List<n<Model, Data>> param1List, e<List<Throwable>> param1e) {
      return new q<Model, Data>(param1List, param1e);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */