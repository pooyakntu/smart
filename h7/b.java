package h7;

public class b<T> {
  private boolean a;
  
  private final T b;
  
  public b(T paramT) {
    this.b = paramT;
  }
  
  public final T a() {
    if (this.a)
      return null; 
    this.a = true;
    return this.b;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h7\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */