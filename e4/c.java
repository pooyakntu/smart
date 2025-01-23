package e4;

import com.google.firebase.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
  private File a;
  
  private final d b;
  
  public c(d paramd) {
    this.b = paramd;
  }
  
  private File a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/io/File;
    //   4: ifnonnull -> 87
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield a : Ljava/io/File;
    //   13: ifnonnull -> 77
    //   16: aload_0
    //   17: getfield b : Lcom/google/firebase/d;
    //   20: invokevirtual j : ()Landroid/content/Context;
    //   23: invokevirtual getFilesDir : ()Ljava/io/File;
    //   26: astore_1
    //   27: new java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_2
    //   35: aload_2
    //   36: ldc 'PersistedInstallation.'
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_2
    //   43: aload_0
    //   44: getfield b : Lcom/google/firebase/d;
    //   47: invokevirtual n : ()Ljava/lang/String;
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload_2
    //   55: ldc '.json'
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_0
    //   62: new java/io/File
    //   65: dup
    //   66: aload_1
    //   67: aload_2
    //   68: invokevirtual toString : ()Ljava/lang/String;
    //   71: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   74: putfield a : Ljava/io/File;
    //   77: aload_0
    //   78: monitorexit
    //   79: goto -> 87
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    //   87: aload_0
    //   88: getfield a : Ljava/io/File;
    //   91: areturn
    // Exception table:
    //   from	to	target	type
    //   9	77	82	finally
    //   77	79	82	finally
    //   83	85	82	finally
  }
  
  private JSONObject c() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[16384];
    try {
      FileInputStream fileInputStream = new FileInputStream(a());
      try {
        while (true) {
          JSONObject jSONObject;
          int i = fileInputStream.read(arrayOfByte, 0, 16384);
          if (i < 0) {
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            return jSONObject;
          } 
          jSONObject.write(arrayOfByte, 0, i);
        } 
      } finally {
        try {
          fileInputStream.close();
        } finally {
          fileInputStream = null;
        } 
      } 
    } catch (IOException|JSONException iOException) {
      return new JSONObject();
    } 
  }
  
  public d b(d paramd) {
    try {
      JSONObject jSONObject = new JSONObject();
      jSONObject.put("Fid", paramd.d());
      jSONObject.put("Status", paramd.g().ordinal());
      jSONObject.put("AuthToken", paramd.b());
      jSONObject.put("RefreshToken", paramd.f());
      jSONObject.put("TokenCreationEpochInSecs", paramd.h());
      jSONObject.put("ExpiresInSecs", paramd.c());
      jSONObject.put("FisError", paramd.e());
      File file = File.createTempFile("PersistedInstallation", "tmp", this.b.j().getFilesDir());
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
      fileOutputStream.close();
      if (file.renameTo(a()))
        return paramd; 
      throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    } catch (JSONException|IOException jSONException) {
      return paramd;
    } 
  }
  
  public d d() {
    JSONObject jSONObject = c();
    String str1 = jSONObject.optString("Fid", null);
    int i = jSONObject.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
    String str2 = jSONObject.optString("AuthToken", null);
    String str3 = jSONObject.optString("RefreshToken", null);
    long l1 = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
    long l2 = jSONObject.optLong("ExpiresInSecs", 0L);
    String str4 = jSONObject.optString("FisError", null);
    return d.a().d(str1).g(a.values()[i]).b(str2).f(str3).h(l1).c(l2).e(str4).a();
  }
  
  public enum a {
    ATTEMPT_MIGRATION, NOT_GENERATED, REGISTERED, REGISTER_ERROR, UNREGISTERED;
    
    static {
      a a1 = new a("ATTEMPT_MIGRATION", 0);
      ATTEMPT_MIGRATION = a1;
      a a2 = new a("NOT_GENERATED", 1);
      NOT_GENERATED = a2;
      a a3 = new a("UNREGISTERED", 2);
      UNREGISTERED = a3;
      a a4 = new a("REGISTERED", 3);
      REGISTERED = a4;
      a a5 = new a("REGISTER_ERROR", 4);
      REGISTER_ERROR = a5;
      $VALUES = new a[] { a1, a2, a3, a4, a5 };
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e4\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */