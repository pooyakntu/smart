package c2;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {
  public static g a() {
    return new b(a.FATAL_ERROR, -1L);
  }
  
  public static g d() {
    return new b(a.INVALID_PAYLOAD, -1L);
  }
  
  public static g e(long paramLong) {
    return new b(a.OK, paramLong);
  }
  
  public static g f() {
    return new b(a.TRANSIENT_ERROR, -1L);
  }
  
  public abstract long b();
  
  public abstract a c();
  
  public enum a {
    FATAL_ERROR, INVALID_PAYLOAD, OK, TRANSIENT_ERROR;
    
    static {
      a a1 = new a("OK", 0);
      OK = a1;
      a a2 = new a("TRANSIENT_ERROR", 1);
      TRANSIENT_ERROR = a2;
      a a3 = new a("FATAL_ERROR", 2);
      FATAL_ERROR = a3;
      a a4 = new a("INVALID_PAYLOAD", 3);
      INVALID_PAYLOAD = a4;
      $VALUES = new a[] { a1, a2, a3, a4 };
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c2\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */