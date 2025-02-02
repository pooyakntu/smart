package j1;

import androidx.core.util.e;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p {
  private final r a;
  
  private final a b = new a();
  
  public p(e<List<Throwable>> parame) {
    this(new r(parame));
  }
  
  private p(r paramr) {
    this.a = paramr;
  }
  
  private static <A> Class<A> b(A paramA) {
    return (Class)paramA.getClass();
  }
  
  private <A> List<n<A, ?>> e(Class<A> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lj1/p$a;
    //   6: aload_1
    //   7: invokevirtual b : (Ljava/lang/Class;)Ljava/util/List;
    //   10: astore_3
    //   11: aload_3
    //   12: astore_2
    //   13: aload_3
    //   14: ifnonnull -> 38
    //   17: aload_0
    //   18: getfield a : Lj1/r;
    //   21: aload_1
    //   22: invokevirtual e : (Ljava/lang/Class;)Ljava/util/List;
    //   25: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   28: astore_2
    //   29: aload_0
    //   30: getfield b : Lj1/p$a;
    //   33: aload_1
    //   34: aload_2
    //   35: invokevirtual c : (Ljava/lang/Class;Ljava/util/List;)V
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_2
    //   41: areturn
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	42	finally
    //   17	38	42	finally
  }
  
  public <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, o<? extends Model, ? extends Data> paramo) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lj1/r;
    //   6: aload_1
    //   7: aload_2
    //   8: aload_3
    //   9: invokevirtual b : (Ljava/lang/Class;Ljava/lang/Class;Lj1/o;)V
    //   12: aload_0
    //   13: getfield b : Lj1/p$a;
    //   16: invokevirtual a : ()V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  public List<Class<?>> c(Class<?> paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lj1/r;
    //   6: aload_1
    //   7: invokevirtual g : (Ljava/lang/Class;)Ljava/util/List;
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: areturn
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
  
  public <A> List<n<A, ?>> d(A paramA) {
    List<n<?, ?>> list = e(b(paramA));
    if (!list.isEmpty()) {
      int j = list.size();
      List<?> list1 = Collections.emptyList();
      boolean bool = true;
      int i = 0;
      while (i < j) {
        n n = list.get(i);
        List<?> list2 = list1;
        boolean bool1 = bool;
        if (n.a(paramA)) {
          bool1 = bool;
          if (bool) {
            list1 = new ArrayList(j - i);
            bool1 = false;
          } 
          list1.add(n);
          list2 = list1;
        } 
        i++;
        list1 = list2;
        bool = bool1;
      } 
      if (!list1.isEmpty())
        return (List)list1; 
      throw new Registry.NoModelLoaderAvailableException(paramA, list);
    } 
    throw new Registry.NoModelLoaderAvailableException(paramA);
  }
  
  private static class a {
    private final Map<Class<?>, a<?>> a = new HashMap<Class<?>, a<?>>();
    
    public void a() {
      this.a.clear();
    }
    
    public <Model> List<n<Model, ?>> b(Class<Model> param1Class) {
      a a1 = this.a.get(param1Class);
      return (a1 == null) ? null : a1.a;
    }
    
    public <Model> void c(Class<Model> param1Class, List<n<Model, ?>> param1List) {
      if ((a)this.a.put(param1Class, new a(param1List)) == null)
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Already cached loaders for model: ");
      stringBuilder.append(param1Class);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    private static class a<Model> {
      final List<n<Model, ?>> a;
      
      public a(List<n<Model, ?>> param2List) {
        this.a = param2List;
      }
    }
  }
  
  private static class a<Model> {
    final List<n<Model, ?>> a;
    
    public a(List<n<Model, ?>> param1List) {
      this.a = param1List;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */