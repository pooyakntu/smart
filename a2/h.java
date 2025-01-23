package a2;

final class h extends n {
  private final long a;
  
  h(long paramLong) {
    this.a = paramLong;
  }
  
  public long c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof n) {
      paramObject = paramObject;
      return (this.a == paramObject.c());
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    return 0xF4243 ^ (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LogResponse{nextRequestWaitMillis=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */