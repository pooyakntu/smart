package c0;

import java.nio.ByteBuffer;

public final class a extends c {
  public a f(int paramInt, ByteBuffer paramByteBuffer) {
    g(paramInt, paramByteBuffer);
    return this;
  }
  
  public void g(int paramInt, ByteBuffer paramByteBuffer) {
    c(paramInt, paramByteBuffer);
  }
  
  public int h(int paramInt) {
    int i = b(16);
    return (i != 0) ? this.b.getInt(d(i) + paramInt * 4) : 0;
  }
  
  public int i() {
    int i = b(16);
    return (i != 0) ? e(i) : 0;
  }
  
  public boolean j() {
    int i = b(6);
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i != 0) {
      bool1 = bool2;
      if (this.b.get(i + this.a) != 0)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public short k() {
    int i = b(14);
    return (i != 0) ? this.b.getShort(i + this.a) : 0;
  }
  
  public int l() {
    int i = b(4);
    return (i != 0) ? this.b.getInt(i + this.a) : 0;
  }
  
  public short m() {
    int i = b(8);
    return (i != 0) ? this.b.getShort(i + this.a) : 0;
  }
  
  public short n() {
    int i = b(12);
    return (i != 0) ? this.b.getShort(i + this.a) : 0;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */