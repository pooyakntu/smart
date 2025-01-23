package a;

public final class b {
  private static final String a = "_COROUTINE";
  
  private static final StackTraceElement b(Throwable paramThrowable, String paramString) {
    StackTraceElement stackTraceElement = paramThrowable.getStackTrace()[0];
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a);
    stringBuilder.append('.');
    stringBuilder.append(paramString);
    return new StackTraceElement(stringBuilder.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */