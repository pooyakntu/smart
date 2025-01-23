package a2;

import android.util.SparseArray;

public enum p {
  DEFAULT, FAST_IF_RADIO_AWAKE, NEVER, UNMETERED_ONLY, UNMETERED_OR_DAILY, UNRECOGNIZED;
  
  private static final SparseArray<p> valueMap;
  
  private final int value;
  
  static {
    p p1 = new p("DEFAULT", 0, 0);
    DEFAULT = p1;
    p p2 = new p("UNMETERED_ONLY", 1, 1);
    UNMETERED_ONLY = p2;
    p p3 = new p("UNMETERED_OR_DAILY", 2, 2);
    UNMETERED_OR_DAILY = p3;
    p p4 = new p("FAST_IF_RADIO_AWAKE", 3, 3);
    FAST_IF_RADIO_AWAKE = p4;
    p p5 = new p("NEVER", 4, 4);
    NEVER = p5;
    p p6 = new p("UNRECOGNIZED", 5, -1);
    UNRECOGNIZED = p6;
    $VALUES = new p[] { p1, p2, p3, p4, p5, p6 };
    SparseArray<p> sparseArray = new SparseArray();
    valueMap = sparseArray;
    sparseArray.put(0, p1);
    sparseArray.put(1, p2);
    sparseArray.put(2, p3);
    sparseArray.put(3, p4);
    sparseArray.put(4, p5);
    sparseArray.put(-1, p6);
  }
  
  p(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static p forNumber(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? null : NEVER) : FAST_IF_RADIO_AWAKE) : UNMETERED_OR_DAILY) : UNMETERED_ONLY) : DEFAULT;
  }
  
  public final int getNumber() {
    return this.value;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */