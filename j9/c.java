package j9;

import b9.k;
import e8.q;
import g9.g0;
import q8.l;
import q8.q;
import r8.n;

public final class c {
  private static final q<Object, Object, Object, Object> a = a.g;
  
  private static final g0 b = new g0("STATE_REG");
  
  private static final g0 c = new g0("STATE_COMPLETED");
  
  private static final g0 d = new g0("STATE_CANCELLED");
  
  private static final g0 e = new g0("NO_RESULT");
  
  private static final g0 f = new g0("PARAM_CLAUSE_0");
  
  private static final d a(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3)
            return d.ALREADY_SELECTED; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected internal result: ");
          stringBuilder.append(paramInt);
          throw new IllegalStateException(stringBuilder.toString().toString());
        } 
        return d.CANCELLED;
      } 
      return d.REREGISTER;
    } 
    return d.SUCCESSFUL;
  }
  
  private static final boolean h(k<? super q> paramk, l<? super Throwable, q> paraml) {
    Object object = paramk.l(q.a, null, paraml);
    if (object == null)
      return false; 
    paramk.m(object);
    return true;
  }
  
  static final class a extends n implements q {
    public static final a g = new a();
    
    a() {
      super(3);
    }
    
    public final Void a(Object param1Object1, Object param1Object2, Object param1Object3) {
      return null;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j9\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */