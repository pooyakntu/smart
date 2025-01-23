package c0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b extends c {
  public static b h(ByteBuffer paramByteBuffer) {
    return i(paramByteBuffer, new b());
  }
  
  public static b i(ByteBuffer paramByteBuffer, b paramb) {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return paramb.f(paramByteBuffer.getInt(paramByteBuffer.position()) + paramByteBuffer.position(), paramByteBuffer);
  }
  
  public b f(int paramInt, ByteBuffer paramByteBuffer) {
    g(paramInt, paramByteBuffer);
    return this;
  }
  
  public void g(int paramInt, ByteBuffer paramByteBuffer) {
    c(paramInt, paramByteBuffer);
  }
  
  public a j(a parama, int paramInt) {
    int i = b(6);
    return (i != 0) ? parama.f(a(d(i) + paramInt * 4), this.b) : null;
  }
  
  public int k() {
    int i = b(6);
    return (i != 0) ? e(i) : 0;
  }
  
  public int l() {
    int i = b(4);
    return (i != 0) ? this.b.getInt(i + this.a) : 0;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c0\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */