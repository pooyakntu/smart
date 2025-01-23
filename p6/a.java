package p6;

import r8.m;

public final class a {
  private final String a;
  
  private final long b;
  
  public a(String paramString, long paramLong) {
    this.a = paramString;
    this.b = paramLong;
  }
  
  public final long a() {
    return this.b;
  }
  
  public final String b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return !m.e(this.a, ((a)paramObject).a) ? false : (!(this.b != ((a)paramObject).b));
  }
  
  public int hashCode() {
    int i;
    String str = this.a;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    return i * 31 + com.smartpek.data.local.models.a.a(this.b);
  }
  
  public String toString() {
    String str = this.a;
    long l = this.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CalledDevice(url=");
    stringBuilder.append(str);
    stringBuilder.append(", t=");
    stringBuilder.append(l);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p6\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */