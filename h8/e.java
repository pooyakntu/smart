package h8;

import java.util.Comparator;
import r8.m;

final class e implements Comparator<Comparable<? super Object>> {
  public static final e a = new e();
  
  public int a(Comparable<Object> paramComparable1, Comparable<Object> paramComparable2) {
    m.j(paramComparable1, "a");
    m.j(paramComparable2, "b");
    return paramComparable1.compareTo(paramComparable2);
  }
  
  public final Comparator<Comparable<Object>> reversed() {
    return f.a;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h8\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */