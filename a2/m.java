package a2;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.List;

@AutoValue
public abstract class m {
  public static a a() {
    return new g.b();
  }
  
  public abstract k b();
  
  public abstract List<l> c();
  
  public abstract Integer d();
  
  public abstract String e();
  
  public abstract p f();
  
  public abstract long g();
  
  public abstract long h();
  
  @Builder
  public static abstract class a {
    public abstract m a();
    
    public abstract a b(k param1k);
    
    public abstract a c(List<l> param1List);
    
    abstract a d(Integer param1Integer);
    
    abstract a e(String param1String);
    
    public abstract a f(p param1p);
    
    public abstract a g(long param1Long);
    
    public abstract a h(long param1Long);
    
    public a i(int param1Int) {
      return d(Integer.valueOf(param1Int));
    }
    
    public a j(String param1String) {
      return e(param1String);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */