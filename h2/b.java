package h2;

public final class b {
  public static <TInput, TResult, TException extends Throwable> TResult a(int paramInt, TInput paramTInput, a<TInput, TResult, TException> parama, c<TInput, TResult> paramc) throws TException {
    int i = paramInt;
    TInput tInput = paramTInput;
    if (paramInt < 1)
      return parama.apply(paramTInput); 
    while (true) {
      paramTInput = (TInput)parama.apply(tInput);
      tInput = paramc.a(tInput, (TResult)paramTInput);
      if (tInput != null) {
        paramInt = i - 1;
        i = paramInt;
        if (paramInt < 1)
          break; 
        continue;
      } 
      break;
    } 
    return (TResult)paramTInput;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h2\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */