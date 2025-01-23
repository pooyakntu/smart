package a7;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import y6.l;
import y6.o;
import y6.x;
import z6.c;

public class g {
  private final WifiManager a;
  
  private final o b;
  
  private final h c;
  
  private ScanResult d;
  
  private final Runnable e = new a(this);
  
  public g(WifiManager paramWifiManager, o paramo, h paramh) {
    this.a = paramWifiManager;
    this.b = paramo;
    this.c = paramh;
  }
  
  public void e(ScanResult paramScanResult, long paramLong) {
    this.b.b(this.e);
    this.d = paramScanResult;
    this.b.a(this.e, paramLong);
  }
  
  public void f() {
    this.b.b(this.e);
  }
  
  class a implements Runnable {
    a(g this$0) {}
    
    public void run() {
      x.J("Connection Timed out...");
      if (!c.a())
        l.v(g.a(this.g), g.b(this.g)); 
      if (l.p(g.a(this.g), (String)z6.a.d(g.b(this.g)).c(new f()).a())) {
        g.c(this.g).b();
      } else {
        g.c(this.g).a(a.TIMEOUT_OCCURRED);
      } 
      g.d(this.g).b(this);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a7\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */