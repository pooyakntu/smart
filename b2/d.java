package b2;

import java.util.Arrays;

final class d extends o {
  private final String a;
  
  private final byte[] b;
  
  private final z1.d c;
  
  private d(String paramString, byte[] paramArrayOfbyte, z1.d paramd) {
    this.a = paramString;
    this.b = paramArrayOfbyte;
    this.c = paramd;
  }
  
  public String b() {
    return this.a;
  }
  
  public byte[] c() {
    return this.b;
  }
  
  public z1.d d() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof o) {
      o o1 = (o)paramObject;
      if (this.a.equals(o1.b())) {
        byte[] arrayOfByte = this.b;
        if (o1 instanceof d) {
          paramObject = ((d)o1).b;
        } else {
          paramObject = o1.c();
        } 
        if (Arrays.equals(arrayOfByte, (byte[])paramObject) && this.c.equals(o1.d()))
          return true; 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
  }
  
  static final class b extends o.a {
    private String a;
    
    private byte[] b;
    
    private z1.d c;
    
    public o a() {
      String str2 = this.a;
      String str1 = "";
      if (str2 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" backendName");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" priority");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new d(this.a, this.b, this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public o.a b(String param1String) {
      if (param1String != null) {
        this.a = param1String;
        return this;
      } 
      throw new NullPointerException("Null backendName");
    }
    
    public o.a c(byte[] param1ArrayOfbyte) {
      this.b = param1ArrayOfbyte;
      return this;
    }
    
    public o.a d(z1.d param1d) {
      if (param1d != null) {
        this.c = param1d;
        return this;
      } 
      throw new NullPointerException("Null priority");
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */