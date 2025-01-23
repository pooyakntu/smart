package a2;

import java.util.List;

final class d extends j {
  private final List<m> a;
  
  d(List<m> paramList) {
    if (paramList != null) {
      this.a = paramList;
      return;
    } 
    throw new NullPointerException("Null logRequests");
  }
  
  public List<m> c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof j) {
      paramObject = paramObject;
      return this.a.equals(paramObject.c());
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode() ^ 0xF4243;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("BatchedLogRequest{logRequests=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */