package e8;

import java.io.Serializable;
import r8.g;
import r8.m;

public final class k<T> implements Serializable {
  public static final a g = new a(null);
  
  public static <T> Object a(Object paramObject) {
    return paramObject;
  }
  
  public static final Throwable c(Object paramObject) {
    return (paramObject instanceof b) ? ((b)paramObject).g : null;
  }
  
  public static final boolean d(Object paramObject) {
    return paramObject instanceof b;
  }
  
  public static final boolean e(Object paramObject) {
    return paramObject instanceof b ^ true;
  }
  
  public static final class a {
    private a() {}
  }
  
  public static final class b implements Serializable {
    public final Throwable g;
    
    public b(Throwable param1Throwable) {
      this.g = param1Throwable;
    }
    
    public boolean equals(Object param1Object) {
      return (param1Object instanceof b && m.e(this.g, ((b)param1Object).g));
    }
    
    public int hashCode() {
      return this.g.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failure(");
      stringBuilder.append(this.g);
      stringBuilder.append(')');
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e8\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */