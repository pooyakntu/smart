package c2;

import b2.i;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class f {
  public static a a() {
    return new a.b();
  }
  
  public abstract Iterable<i> b();
  
  public abstract byte[] c();
  
  @Builder
  public static abstract class a {
    public abstract f a();
    
    public abstract a b(Iterable<i> param1Iterable);
    
    public abstract a c(byte[] param1ArrayOfbyte);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c2\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */