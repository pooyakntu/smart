package h1;

import java.io.File;

public class d implements a.a {
  private final long a;
  
  private final a b;
  
  public d(a parama, long paramLong) {
    this.a = paramLong;
    this.b = parama;
  }
  
  public a build() {
    File file = this.b.a();
    return (file == null) ? null : ((file.isDirectory() || file.mkdirs()) ? e.c(file, this.a) : null);
  }
  
  public static interface a {
    File a();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h1\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */