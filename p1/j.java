package p1;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import d1.g;
import d1.i;
import f1.c;
import g1.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements i<InputStream, c> {
  private final List<ImageHeaderParser> a;
  
  private final i<ByteBuffer, c> b;
  
  private final b c;
  
  public j(List<ImageHeaderParser> paramList, i<ByteBuffer, c> parami, b paramb) {
    this.a = paramList;
    this.b = parami;
    this.c = paramb;
  }
  
  private static byte[] e(InputStream paramInputStream) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
    try {
      byte[] arrayOfByte = new byte[16384];
      while (true) {
        int k = paramInputStream.read(arrayOfByte);
        if (k != -1) {
          byteArrayOutputStream.write(arrayOfByte, 0, k);
          continue;
        } 
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public c<c> c(InputStream paramInputStream, int paramInt1, int paramInt2, g paramg) throws IOException {
    byte[] arrayOfByte = e(paramInputStream);
    if (arrayOfByte == null)
      return null; 
    ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte);
    return this.b.a(byteBuffer, paramInt1, paramInt2, paramg);
  }
  
  public boolean d(InputStream paramInputStream, g paramg) throws IOException {
    return (!((Boolean)paramg.c(i.b)).booleanValue() && a.f(this.a, paramInputStream, this.c) == ImageHeaderParser.ImageType.GIF);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */