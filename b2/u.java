package b2;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;
import k2.d;

@Singleton
abstract class u implements Closeable {
  abstract d c();
  
  public void close() throws IOException {
    c().close();
  }
  
  abstract t d();
  
  static interface a {
    a a(Context param1Context);
    
    u build();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */