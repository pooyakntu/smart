package c4;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class f {
  private static final byte a = Byte.parseByte("01110000", 2);
  
  private static final byte b = Byte.parseByte("00001111", 2);
  
  private static String b(byte[] paramArrayOfbyte) {
    return (new String(Base64.encode(paramArrayOfbyte, 11), Charset.defaultCharset())).substring(0, 22);
  }
  
  private static byte[] c(UUID paramUUID, byte[] paramArrayOfbyte) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
    byteBuffer.putLong(paramUUID.getMostSignificantBits());
    byteBuffer.putLong(paramUUID.getLeastSignificantBits());
    return byteBuffer.array();
  }
  
  public String a() {
    byte[] arrayOfByte = c(UUID.randomUUID(), new byte[17]);
    byte b = arrayOfByte[0];
    arrayOfByte[16] = b;
    arrayOfByte[0] = (byte)(b & b | a);
    return b(arrayOfByte);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c4\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */