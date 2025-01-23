package p1;

import d1.c;
import d1.g;
import d1.j;
import f1.c;
import java.io.File;
import java.io.IOException;
import x1.a;

public class d implements j<c> {
  public c b(g paramg) {
    return c.SOURCE;
  }
  
  public boolean c(c<c> paramc, File paramFile, g paramg) {
    c c1 = (c)paramc.get();
    try {
      a.f(c1.c(), paramFile);
      return true;
    } catch (IOException iOException) {
      return false;
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */