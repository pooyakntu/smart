package c2;

import android.content.Context;
import d8.a;
import e2.b;

public final class l implements b<k> {
  private final a<Context> a;
  
  private final a<i> b;
  
  public l(a<Context> parama, a<i> parama1) {
    this.a = parama;
    this.b = parama1;
  }
  
  public static l a(a<Context> parama, a<i> parama1) {
    return new l(parama, parama1);
  }
  
  public static k c(Context paramContext, Object paramObject) {
    return new k(paramContext, (i)paramObject);
  }
  
  public k b() {
    return c((Context)this.a.get(), this.b.get());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c2\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */