package e2;

import d2.a;

public final class c<T> implements b<T>, a<T> {
  private static final c<Object> b = new c(null);
  
  private final T a;
  
  private c(T paramT) {
    this.a = paramT;
  }
  
  public static <T> b<T> a(T paramT) {
    return new c<T>(d.c(paramT, "instance cannot be null"));
  }
  
  public T get() {
    return this.a;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e2\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */