package a2;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class n {
  static n a(long paramLong) {
    return new h(paramLong);
  }
  
  public static n b(Reader paramReader) throws IOException {
    JsonReader jsonReader = new JsonReader(paramReader);
    try {
      jsonReader.beginObject();
      while (jsonReader.hasNext()) {
        if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
          if (jsonReader.peek() == JsonToken.STRING)
            return a(Long.parseLong(jsonReader.nextString())); 
          return a(jsonReader.nextLong());
        } 
        jsonReader.skipValue();
      } 
      throw new IOException("Response is missing nextRequestWaitMillis field.");
    } finally {
      jsonReader.close();
    } 
  }
  
  public abstract long c();
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */