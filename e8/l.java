package e8;

import r8.m;

public final class l {
  public static final Object a(Throwable paramThrowable) {
    m.j(paramThrowable, "exception");
    return new k.b(paramThrowable);
  }
  
  public static final void b(Object paramObject) {
    if (!(paramObject instanceof k.b))
      return; 
    throw ((k.b)paramObject).g;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e8\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */