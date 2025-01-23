package c3;

public final class a {
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return (float)Math.hypot((paramFloat3 - paramFloat1), (paramFloat4 - paramFloat2));
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    return d(a(paramFloat1, paramFloat2, paramFloat3, paramFloat4), a(paramFloat1, paramFloat2, paramFloat5, paramFloat4), a(paramFloat1, paramFloat2, paramFloat5, paramFloat6), a(paramFloat1, paramFloat2, paramFloat3, paramFloat6));
  }
  
  public static float c(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (1.0F - paramFloat3) * paramFloat1 + paramFloat3 * paramFloat2;
  }
  
  private static float d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return (paramFloat1 > paramFloat2 && paramFloat1 > paramFloat3 && paramFloat1 > paramFloat4) ? paramFloat1 : ((paramFloat2 > paramFloat3 && paramFloat2 > paramFloat4) ? paramFloat2 : ((paramFloat3 > paramFloat4) ? paramFloat3 : paramFloat4));
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c3\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */