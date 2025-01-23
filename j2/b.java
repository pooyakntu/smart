package j2;

import java.util.Map;
import m2.a;
import z1.d;

final class b extends f {
  private final a a;
  
  private final Map<d, f.b> b;
  
  b(a parama, Map<d, f.b> paramMap) {
    if (parama != null) {
      this.a = parama;
      if (paramMap != null) {
        this.b = paramMap;
        return;
      } 
      throw new NullPointerException("Null values");
    } 
    throw new NullPointerException("Null clock");
  }
  
  a e() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.e()) && this.b.equals(paramObject.h()));
    } 
    return false;
  }
  
  Map<d, f.b> h() {
    return this.b;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SchedulerConfig{clock=");
    stringBuilder.append(this.a);
    stringBuilder.append(", values=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j2\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */