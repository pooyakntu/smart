package c0;

import java.nio.ByteBuffer;

public class c {
  protected int a;
  
  protected ByteBuffer b;
  
  private int c;
  
  private int d;
  
  d e = d.a();
  
  protected int a(int paramInt) {
    return paramInt + this.b.getInt(paramInt);
  }
  
  protected int b(int paramInt) {
    return (paramInt < this.d) ? this.b.getShort(this.c + paramInt) : 0;
  }
  
  protected void c(int paramInt, ByteBuffer paramByteBuffer) {
    this.b = paramByteBuffer;
    if (paramByteBuffer != null) {
      this.a = paramInt;
      paramInt -= paramByteBuffer.getInt(paramInt);
      this.c = paramInt;
      this.d = this.b.getShort(paramInt);
      return;
    } 
    this.a = 0;
    this.c = 0;
    this.d = 0;
  }
  
  protected int d(int paramInt) {
    paramInt += this.a;
    return paramInt + this.b.getInt(paramInt) + 4;
  }
  
  protected int e(int paramInt) {
    paramInt += this.a;
    int i = this.b.getInt(paramInt);
    return this.b.getInt(paramInt + i);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c0\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */