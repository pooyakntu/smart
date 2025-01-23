package e2;

public final class d {
  public static <T> void a(T paramT, Class<T> paramClass) {
    if (paramT != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramClass.getCanonicalName());
    stringBuilder.append(" must be set");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public static <T> T b(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T c(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e2\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */