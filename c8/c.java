package c8;

public class c {
  private static final char[] a = new char[] { '۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹' };
  
  private static final char[] b = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
  
  public static String a(String paramString) {
    if (paramString.isEmpty())
      return ""; 
    StringBuilder stringBuilder = new StringBuilder();
    int j = paramString.length();
    for (int i = 0; i < j; i++) {
      char c1 = paramString.charAt(i);
      if ('0' <= c1 && c1 <= '9') {
        int k = Integer.parseInt(String.valueOf(c1));
        stringBuilder.append(a[k]);
      } else if (c1 == '٫') {
        stringBuilder.append('،');
      } else {
        stringBuilder.append(c1);
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c8\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */