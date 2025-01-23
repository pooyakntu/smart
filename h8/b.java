package h8;

import java.util.Comparator;
import r8.m;

class b {
  public static <T extends Comparable<?>> int a(T paramT1, T paramT2) {
    return (paramT1 == paramT2) ? 0 : ((paramT1 == null) ? -1 : ((paramT2 == null) ? 1 : paramT1.compareTo(paramT2)));
  }
  
  public static <T extends Comparable<? super T>> Comparator<T> b() {
    e e = e.a;
    m.h(e, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
    return e;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h8\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */