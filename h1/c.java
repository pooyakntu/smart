package h1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c {
  private final Map<String, a> a = new HashMap<String, a>();
  
  private final b b = new b();
  
  void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast h1/c$a
    //   15: astore_3
    //   16: aload_3
    //   17: astore_2
    //   18: aload_3
    //   19: ifnonnull -> 42
    //   22: aload_0
    //   23: getfield b : Lh1/c$b;
    //   26: invokevirtual a : ()Lh1/c$a;
    //   29: astore_2
    //   30: aload_0
    //   31: getfield a : Ljava/util/Map;
    //   34: aload_1
    //   35: aload_2
    //   36: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   41: pop
    //   42: aload_2
    //   43: aload_2
    //   44: getfield b : I
    //   47: iconst_1
    //   48: iadd
    //   49: putfield b : I
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_2
    //   55: getfield a : Ljava/util/concurrent/locks/Lock;
    //   58: invokeinterface lock : ()V
    //   63: return
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	64	finally
    //   22	42	64	finally
    //   42	54	64	finally
    //   65	67	64	finally
  }
  
  void b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast h1/c$a
    //   18: astore_3
    //   19: aload_3
    //   20: getfield b : I
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_1
    //   26: if_icmplt -> 158
    //   29: iload_2
    //   30: iconst_1
    //   31: isub
    //   32: istore_2
    //   33: aload_3
    //   34: iload_2
    //   35: putfield b : I
    //   38: iload_2
    //   39: ifne -> 146
    //   42: aload_0
    //   43: getfield a : Ljava/util/Map;
    //   46: aload_1
    //   47: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast h1/c$a
    //   55: astore #4
    //   57: aload #4
    //   59: aload_3
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 78
    //   66: aload_0
    //   67: getfield b : Lh1/c$b;
    //   70: aload #4
    //   72: invokevirtual b : (Lh1/c$a;)V
    //   75: goto -> 146
    //   78: new java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: astore #5
    //   87: aload #5
    //   89: ldc 'Removed the wrong lock, expected to remove: '
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload #5
    //   97: aload_3
    //   98: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: ldc ', but actually removed: '
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload #5
    //   112: aload #4
    //   114: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload #5
    //   120: ldc ', safeKey: '
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #5
    //   128: aload_1
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: new java/lang/IllegalStateException
    //   136: dup
    //   137: aload #5
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: invokespecial <init> : (Ljava/lang/String;)V
    //   145: athrow
    //   146: aload_0
    //   147: monitorexit
    //   148: aload_3
    //   149: getfield a : Ljava/util/concurrent/locks/Lock;
    //   152: invokeinterface unlock : ()V
    //   157: return
    //   158: new java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: astore #4
    //   167: aload #4
    //   169: ldc 'Cannot release a lock that is not held, safeKey: '
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #4
    //   177: aload_1
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #4
    //   184: ldc ', interestedThreads: '
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload #4
    //   192: aload_3
    //   193: getfield b : I
    //   196: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: new java/lang/IllegalStateException
    //   203: dup
    //   204: aload #4
    //   206: invokevirtual toString : ()Ljava/lang/String;
    //   209: invokespecial <init> : (Ljava/lang/String;)V
    //   212: athrow
    //   213: astore_1
    //   214: aload_0
    //   215: monitorexit
    //   216: aload_1
    //   217: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	213	finally
    //   33	38	213	finally
    //   42	75	213	finally
    //   78	146	213	finally
    //   146	148	213	finally
    //   158	213	213	finally
    //   214	216	213	finally
  }
  
  private static class a {
    final Lock a = new ReentrantLock();
    
    int b;
  }
  
  private static class b {
    private final Queue<c.a> a = new ArrayDeque<c.a>();
    
    c.a a() {
      Queue<c.a> queue;
      c.a a;
      synchronized (this.a) {
        c.a a1 = this.a.poll();
        a = a1;
        if (a1 == null)
          a = new c.a(); 
        return a;
      } 
    }
    
    void b(c.a param1a) {
      synchronized (this.a) {
        if (this.a.size() < 10)
          this.a.offer(param1a); 
        return;
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h1\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */