package e7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;
import r8.m;

public final class e {
  @SuppressLint({"NewApi"})
  private final void b(Configuration paramConfiguration, Locale paramLocale) {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray java/util/Locale
    //   4: dup
    //   5: iconst_0
    //   6: aload_2
    //   7: aastore
    //   8: invokestatic e : ([Ljava/lang/Object;)Ljava/util/LinkedHashSet;
    //   11: astore_2
    //   12: invokestatic a : ()Landroid/os/LocaleList;
    //   15: astore #5
    //   17: aload #5
    //   19: ldc 'LocaleList.getDefault()'
    //   21: invokestatic f : (Ljava/lang/Object;Ljava/lang/String;)V
    //   24: aload #5
    //   26: invokestatic a : (Landroid/os/LocaleList;)I
    //   29: istore #4
    //   31: new java/util/ArrayList
    //   34: dup
    //   35: iload #4
    //   37: invokespecial <init> : (I)V
    //   40: astore #6
    //   42: iconst_0
    //   43: istore_3
    //   44: iload_3
    //   45: iload #4
    //   47: if_icmpge -> 80
    //   50: aload #5
    //   52: iload_3
    //   53: invokestatic a : (Landroid/os/LocaleList;I)Ljava/util/Locale;
    //   56: astore #7
    //   58: aload #7
    //   60: ldc 'defaultLocales[it]'
    //   62: invokestatic f : (Ljava/lang/Object;Ljava/lang/String;)V
    //   65: aload #6
    //   67: aload #7
    //   69: invokevirtual add : (Ljava/lang/Object;)Z
    //   72: pop
    //   73: iload_3
    //   74: iconst_1
    //   75: iadd
    //   76: istore_3
    //   77: goto -> 44
    //   80: aload_2
    //   81: aload #6
    //   83: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   86: pop
    //   87: aload_2
    //   88: iconst_0
    //   89: anewarray java/util/Locale
    //   92: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   97: astore_2
    //   98: aload_2
    //   99: ifnull -> 128
    //   102: aload_2
    //   103: checkcast [Ljava/util/Locale;
    //   106: astore_2
    //   107: aload_1
    //   108: new android/os/LocaleList
    //   111: dup
    //   112: aload_2
    //   113: aload_2
    //   114: arraylength
    //   115: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   118: checkcast [Ljava/util/Locale;
    //   121: invokespecial <init> : ([Ljava/util/Locale;)V
    //   124: invokestatic a : (Landroid/content/res/Configuration;Landroid/os/LocaleList;)V
    //   127: return
    //   128: new kotlin/TypeCastException
    //   131: dup
    //   132: ldc 'null cannot be cast to non-null type kotlin.Array<T>'
    //   134: invokespecial <init> : (Ljava/lang/String;)V
    //   137: athrow
  }
  
  private final void c(Context paramContext, Locale paramLocale) {
    Locale.setDefault(paramLocale);
    Resources resources = paramContext.getResources();
    m.f(resources, "res");
    Configuration configuration = resources.getConfiguration();
    m.f(configuration, "res.configuration");
    if (m.e(a.a(configuration), paramLocale))
      return; 
    configuration = new Configuration(resources.getConfiguration());
    if (a.b(24)) {
      b(configuration, paramLocale);
    } else if (a.b(17)) {
      configuration.setLocale(paramLocale);
    } else {
      configuration.locale = paramLocale;
    } 
    resources.updateConfiguration(configuration, resources.getDisplayMetrics());
  }
  
  public final void a(Context paramContext, Locale paramLocale) {
    m.k(paramContext, "context");
    m.k(paramLocale, "locale");
    c(paramContext, paramLocale);
    Context context = paramContext.getApplicationContext();
    if (context != paramContext) {
      m.f(context, "appContext");
      c(context, paramLocale);
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e7\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */