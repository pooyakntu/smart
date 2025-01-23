package c2;

import android.content.Context;
import d8.a;
import e2.b;
import m2.a;

public final class j implements b<i> {
  private final a<Context> a;
  
  private final a<a> b;
  
  private final a<a> c;
  
  public j(a<Context> parama, a<a> parama1, a<a> parama2) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
  }
  
  public static j a(a<Context> parama, a<a> parama1, a<a> parama2) {
    return new j(parama, parama1, parama2);
  }
  
  public static i c(Context paramContext, a parama1, a parama2) {
    return new i(paramContext, parama1, parama2);
  }
  
  public i b() {
    return c((Context)this.a.get(), (a)this.b.get(), (a)this.c.get());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c2\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */