package b1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class d {
  static final Charset a = Charset.forName("US-ASCII");
  
  static final Charset b = Charset.forName("UTF-8");
  
  static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {
        return;
      }  
  }
  
  static void b(File paramFile) throws IOException {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j) {
        paramFile = arrayOfFile[i];
        if (paramFile.isDirectory())
          b(paramFile); 
        if (paramFile.delete()) {
          i++;
          continue;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("failed to delete file: ");
        stringBuilder1.append(paramFile);
        throw new IOException(stringBuilder1.toString());
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("not a readable directory: ");
    stringBuilder.append(paramFile);
    throw new IOException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b1\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */