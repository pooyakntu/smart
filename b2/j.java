package b2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

abstract class j {
  @Singleton
  static Executor a() {
    return new m(Executors.newSingleThreadExecutor());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */