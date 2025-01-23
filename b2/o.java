package b2;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import z1.d;

@AutoValue
public abstract class o {
  public static a a() {
    return (new d.b()).d(d.DEFAULT);
  }
  
  public abstract String b();
  
  public abstract byte[] c();
  
  public abstract d d();
  
  public boolean e() {
    return (c() != null);
  }
  
  public o f(d paramd) {
    return a().b(b()).d(paramd).c(c()).a();
  }
  
  public final String toString() {
    String str1;
    String str2 = b();
    d d = d();
    if (c() == null) {
      str1 = "";
    } else {
      str1 = Base64.encodeToString(c(), 2);
    } 
    return String.format("TransportContext(%s, %s, %s)", new Object[] { str2, d, str1 });
  }
  
  @Builder
  public static abstract class a {
    public abstract o a();
    
    public abstract a b(String param1String);
    
    public abstract a c(byte[] param1ArrayOfbyte);
    
    public abstract a d(d param1d);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */