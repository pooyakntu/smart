package e;

import android.content.Context;
import android.content.Intent;
import r8.m;

public abstract class a<I, O> {
  public abstract Intent a(Context paramContext, I paramI);
  
  public a<O> b(Context paramContext, I paramI) {
    m.j(paramContext, "context");
    return null;
  }
  
  public abstract O c(int paramInt, Intent paramIntent);
  
  public static final class a<T> {
    private final T a;
    
    public a(T param1T) {
      this.a = param1T;
    }
    
    public final T a() {
      return this.a;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */