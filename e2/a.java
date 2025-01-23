package e2;

import d2.a;
import d8.a;

public final class a<T> implements a<T>, a<T> {
  private static final Object c = new Object();
  
  private volatile a<T> a;
  
  private volatile Object b = c;
  
  private a(a<T> parama) {
    this.a = parama;
  }
  
  public static <P extends a<T>, T> a<T> a(P paramP) {
    return (paramP instanceof a) ? (a<T>)paramP : new a<T>(d.<a<T>>b((a<T>)paramP));
  }
  
  public static <P extends a<T>, T> a<T> b(P paramP) {
    d.b(paramP);
    return (a<T>)((paramP instanceof a) ? (Object)paramP : new a<T>((a<T>)paramP));
  }
  
  public static Object c(Object paramObject1, Object paramObject2) {
    boolean bool;
    if (paramObject1 != c) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      if (paramObject1 == paramObject2)
        return paramObject2; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
      stringBuilder.append(paramObject1);
      stringBuilder.append(" & ");
      stringBuilder.append(paramObject2);
      stringBuilder.append(". This is likely due to a circular dependency.");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    return paramObject2;
  }
  
  public T get() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/lang/Object;
    //   4: astore_1
    //   5: getstatic e2/a.c : Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_1
    //   10: aload_3
    //   11: if_acmpne -> 64
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield b : Ljava/lang/Object;
    //   20: astore_2
    //   21: aload_2
    //   22: astore_1
    //   23: aload_2
    //   24: aload_3
    //   25: if_acmpne -> 55
    //   28: aload_0
    //   29: getfield a : Ld8/a;
    //   32: invokeinterface get : ()Ljava/lang/Object;
    //   37: astore_1
    //   38: aload_0
    //   39: aload_0
    //   40: getfield b : Ljava/lang/Object;
    //   43: aload_1
    //   44: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: putfield b : Ljava/lang/Object;
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield a : Ld8/a;
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: areturn
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    //   64: aload_1
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   16	21	59	finally
    //   28	55	59	finally
    //   55	57	59	finally
    //   60	62	59	finally
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e2\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */