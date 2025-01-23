package j1;

import d1.d;
import d1.g;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import x1.a;

public class c implements d<ByteBuffer> {
  public boolean c(ByteBuffer paramByteBuffer, File paramFile, g paramg) {
    try {
      a.f(paramByteBuffer, paramFile);
      return true;
    } catch (IOException iOException) {
      return false;
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */