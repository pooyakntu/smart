package a7;

public enum a {
  ANDROID_10_IMMEDIATELY_DROPPED_CONNECTION, AUTHENTICATION_ERROR_OCCURRED, COULD_NOT_CONNECT, COULD_NOT_ENABLE_WIFI, COULD_NOT_SCAN, DID_NOT_FIND_NETWORK_BY_SCANNING, TIMEOUT_OCCURRED, USER_CANCELLED;
  
  static {
    a a1 = new a("COULD_NOT_ENABLE_WIFI", 0);
    COULD_NOT_ENABLE_WIFI = a1;
    a a2 = new a("COULD_NOT_SCAN", 1);
    COULD_NOT_SCAN = a2;
    a a3 = new a("DID_NOT_FIND_NETWORK_BY_SCANNING", 2);
    DID_NOT_FIND_NETWORK_BY_SCANNING = a3;
    a a4 = new a("AUTHENTICATION_ERROR_OCCURRED", 3);
    AUTHENTICATION_ERROR_OCCURRED = a4;
    a a5 = new a("TIMEOUT_OCCURRED", 4);
    TIMEOUT_OCCURRED = a5;
    a a6 = new a("ANDROID_10_IMMEDIATELY_DROPPED_CONNECTION", 5);
    ANDROID_10_IMMEDIATELY_DROPPED_CONNECTION = a6;
    a a7 = new a("USER_CANCELLED", 6);
    USER_CANCELLED = a7;
    a a8 = new a("COULD_NOT_CONNECT", 7);
    COULD_NOT_CONNECT = a8;
    $VALUES = new a[] { a1, a2, a3, a4, a5, a6, a7, a8 };
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a7\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */