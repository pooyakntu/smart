package d1;

public enum b {
  PREFER_ARGB_8888, PREFER_RGB_565;
  
  public static final b DEFAULT;
  
  static {
    b b1 = new b("PREFER_ARGB_8888", 0);
    PREFER_ARGB_8888 = b1;
    b b2 = new b("PREFER_RGB_565", 1);
    PREFER_RGB_565 = b2;
    $VALUES = new b[] { b1, b2 };
    DEFAULT = b1;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d1\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */