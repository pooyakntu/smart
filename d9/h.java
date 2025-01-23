package d9;

import r8.g;
import r8.m;

public final class h<T> {
  public static final b b = new b(null);
  
  private static final c c = new c();
  
  private final Object a;
  
  public static <T> Object c(Object paramObject) {
    return paramObject;
  }
  
  public static boolean d(Object paramObject1, Object paramObject2) {
    return !(paramObject2 instanceof h) ? false : (!!m.e(paramObject1, ((h)paramObject2).j()));
  }
  
  public static final Throwable e(Object paramObject) {
    boolean bool = paramObject instanceof a;
    Throwable throwable = null;
    if (bool) {
      paramObject = paramObject;
    } else {
      paramObject = null;
    } 
    if (paramObject != null)
      throwable = ((a)paramObject).a; 
    return throwable;
  }
  
  public static int f(Object paramObject) {
    return (paramObject == null) ? 0 : paramObject.hashCode();
  }
  
  public static final boolean g(Object paramObject) {
    return paramObject instanceof a;
  }
  
  public static final boolean h(Object paramObject) {
    return paramObject instanceof c ^ true;
  }
  
  public static String i(Object paramObject) {
    if (paramObject instanceof a)
      return ((a)paramObject).toString(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Value(");
    stringBuilder.append(paramObject);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    return d(this.a, paramObject);
  }
  
  public int hashCode() {
    return f(this.a);
  }
  
  public String toString() {
    return i(this.a);
  }
  
  public static final class a extends c {
    public final Throwable a;
    
    public a(Throwable param1Throwable) {
      this.a = param1Throwable;
    }
    
    public boolean equals(Object param1Object) {
      return (param1Object instanceof a && m.e(this.a, ((a)param1Object).a));
    }
    
    public int hashCode() {
      Throwable throwable = this.a;
      return (throwable != null) ? throwable.hashCode() : 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Closed(");
      stringBuilder.append(this.a);
      stringBuilder.append(')');
      return stringBuilder.toString();
    }
  }
  
  public static final class b {
    private b() {}
    
    public final <E> Object a(Throwable param1Throwable) {
      return h.c(new h.a(param1Throwable));
    }
    
    public final <E> Object b() {
      return h.c(h.a());
    }
    
    public final <E> Object c(E param1E) {
      return h.c(param1E);
    }
  }
  
  public static class c {
    public String toString() {
      return "Failed";
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */