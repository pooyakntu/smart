package a2;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class k {
  public static a a() {
    return new e.b();
  }
  
  public abstract a b();
  
  public abstract b c();
  
  @Builder
  public static abstract class a {
    public abstract k a();
    
    public abstract a b(a param1a);
    
    public abstract a c(k.b param1b);
  }
  
  public enum b {
    ANDROID_FIREBASE, UNKNOWN;
    
    private final int value;
    
    static {
      b b1 = new b("UNKNOWN", 0, 0);
      UNKNOWN = b1;
      b b2 = new b("ANDROID_FIREBASE", 1, 23);
      ANDROID_FIREBASE = b2;
      $VALUES = new b[] { b1, b2 };
    }
    
    b(int param1Int1) {
      this.value = param1Int1;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */