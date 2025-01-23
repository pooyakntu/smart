package e4;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.d;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
  private static final String[] c = new String[] { "*", "FCM", "GCM", "" };
  
  private final SharedPreferences a;
  
  private final String b;
  
  public b(d paramd) {
    this.a = paramd.j().getSharedPreferences("com.google.android.gms.appid", 0);
    this.b = b(paramd);
  }
  
  private String a(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("|T|");
    stringBuilder.append(paramString1);
    stringBuilder.append("|");
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  private static String b(d paramd) {
    String str3 = paramd.m().d();
    if (str3 != null)
      return str3; 
    String str2 = paramd.m().c();
    if (!str2.startsWith("1:") && !str2.startsWith("2:"))
      return str2; 
    String[] arrayOfString = str2.split(":");
    if (arrayOfString.length != 4)
      return null; 
    String str1 = arrayOfString[1];
    return str1.isEmpty() ? null : str1;
  }
  
  private static String c(PublicKey paramPublicKey) {
    byte[] arrayOfByte = paramPublicKey.getEncoded();
    try {
      arrayOfByte = MessageDigest.getInstance("SHA1").digest(arrayOfByte);
      arrayOfByte[0] = (byte)((arrayOfByte[0] & 0xF) + 112 & 0xFF);
      return Base64.encodeToString(arrayOfByte, 0, 8, 11);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      return null;
    } 
  }
  
  private String d(String paramString) {
    try {
      return (new JSONObject(paramString)).getString("token");
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  private PublicKey e(String paramString) {
    try {
      byte[] arrayOfByte = Base64.decode(paramString, 8);
      return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arrayOfByte));
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (InvalidKeySpecException invalidKeySpecException) {
    
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid key stored ");
    stringBuilder.append(noSuchAlgorithmException);
    return null;
  }
  
  private String g() {
    synchronized (this.a) {
      return this.a.getString("|S|id", null);
    } 
  }
  
  private String h() {
    synchronized (this.a) {
      String str = this.a.getString("|S||P|", null);
      if (str == null)
        return null; 
      PublicKey publicKey = e(str);
      if (publicKey == null)
        return null; 
      return c(publicKey);
    } 
  }
  
  public String f() {
    synchronized (this.a) {
      String str = g();
      if (str != null)
        return str; 
      str = h();
      return str;
    } 
  }
  
  public String i() {
    synchronized (this.a) {
      String[] arrayOfString = c;
      int j = arrayOfString.length;
      for (int i = 0;; i++) {
        if (i < j) {
          String str = arrayOfString[i];
          str = a(this.b, str);
          str = this.a.getString(str, null);
          if (str != null && !str.isEmpty()) {
            String str1 = str;
            if (str.startsWith("{"))
              str1 = d(str); 
            return str1;
          } 
        } else {
          return null;
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e4\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */