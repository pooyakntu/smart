package e9;

import d9.p;
import e8.q;
import f9.d;
import j8.d;
import j8.g;
import j8.h;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import q8.p;
import r8.g;

final class a<T> extends b<T> {
  private final p<p<? super T>, d<? super q>, Object> k;
  
  public a(p<? super p<? super T>, ? super d<? super q>, ? extends Object> paramp, g paramg, int paramInt, d9.a parama) {
    super(paramp, paramg, paramInt, parama);
    this.k = (p)paramp;
  }
  
  protected Object e(p<? super T> paramp, d<? super q> paramd) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof e9/a$a
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast e9/a$a
    //   11: astore #4
    //   13: aload #4
    //   15: getfield j : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield j : I
    //   35: aload #4
    //   37: astore_2
    //   38: goto -> 51
    //   41: new e9/a$a
    //   44: dup
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial <init> : (Le9/a;Lj8/d;)V
    //   50: astore_2
    //   51: aload_2
    //   52: getfield h : Ljava/lang/Object;
    //   55: astore #5
    //   57: invokestatic d : ()Ljava/lang/Object;
    //   60: astore #6
    //   62: aload_2
    //   63: getfield j : I
    //   66: istore_3
    //   67: iload_3
    //   68: ifeq -> 103
    //   71: iload_3
    //   72: iconst_1
    //   73: if_icmpne -> 93
    //   76: aload_2
    //   77: getfield g : Ljava/lang/Object;
    //   80: checkcast d9/p
    //   83: astore #4
    //   85: aload #5
    //   87: invokestatic b : (Ljava/lang/Object;)V
    //   90: goto -> 135
    //   93: new java/lang/IllegalStateException
    //   96: dup
    //   97: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: athrow
    //   103: aload #5
    //   105: invokestatic b : (Ljava/lang/Object;)V
    //   108: aload_2
    //   109: aload_1
    //   110: putfield g : Ljava/lang/Object;
    //   113: aload_2
    //   114: iconst_1
    //   115: putfield j : I
    //   118: aload_1
    //   119: astore #4
    //   121: aload_0
    //   122: aload_1
    //   123: aload_2
    //   124: invokespecial e : (Ld9/p;Lj8/d;)Ljava/lang/Object;
    //   127: aload #6
    //   129: if_acmpne -> 135
    //   132: aload #6
    //   134: areturn
    //   135: aload #4
    //   137: invokeinterface i : ()Z
    //   142: ifeq -> 149
    //   145: getstatic e8/q.a : Le8/q;
    //   148: areturn
    //   149: new java/lang/IllegalStateException
    //   152: dup
    //   153: ldc ''awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\\nOtherwise, a callback/listener may leak in case of external cancellation.\\nSee callbackFlow API documentation for the details.'
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: athrow
  }
  
  protected d<T> f(g paramg, int paramInt, d9.a parama) {
    return new a(this.k, paramg, paramInt, parama);
  }
  
  @f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
  static final class a extends d {
    Object g;
    
    int j;
    
    a(a<T> param1a, d<? super a> param1d) {
      super(param1d);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      this.h = param1Object;
      this.j |= Integer.MIN_VALUE;
      return this.i.e(null, (d<? super q>)this);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */