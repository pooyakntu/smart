package p6;

import java.net.DatagramPacket;
import r8.m;
import z8.d;

public final class n {
  private String a;
  
  private String b;
  
  public n(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public n(DatagramPacket paramDatagramPacket) {
    this("", "");
    String str2 = paramDatagramPacket.getAddress().getHostAddress();
    byte[] arrayOfByte = paramDatagramPacket.getData();
    m.i(arrayOfByte, "datagramPacket.data");
    String str1 = new String(arrayOfByte, 0, paramDatagramPacket.getLength(), d.b);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("http://");
    stringBuilder.append(str2);
    stringBuilder.append("/");
    this.a = stringBuilder.toString();
    this.b = str1;
  }
  
  public final String a() {
    return this.b;
  }
  
  public final String b() {
    return this.a;
  }
  
  public final void c(String paramString) {
    m.j(paramString, "<set-?>");
    this.a = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof n))
      return false; 
    paramObject = paramObject;
    return !m.e(this.a, ((n)paramObject).a) ? false : (!!m.e(this.b, ((n)paramObject).b));
  }
  
  public int hashCode() {
    return this.a.hashCode() * 31 + this.b.hashCode();
  }
  
  public String toString() {
    String str1 = this.a;
    String str2 = this.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UdpResponse(url=");
    stringBuilder.append(str1);
    stringBuilder.append(", response=");
    stringBuilder.append(str2);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p6\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */