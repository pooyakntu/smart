package d1;

public enum h {
  DISPLAY_P3, SRGB;
  
  static {
    h h1 = new h("SRGB", 0);
    SRGB = h1;
    h h2 = new h("DISPLAY_P3", 1);
    DISPLAY_P3 = h2;
    $VALUES = new h[] { h1, h2 };
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d1\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */