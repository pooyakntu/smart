package a2;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class o {
  public static a a() {
    return new i.b();
  }
  
  public abstract b b();
  
  public abstract c c();
  
  @Builder
  public static abstract class a {
    public abstract o a();
    
    public abstract a b(o.b param1b);
    
    public abstract a c(o.c param1c);
  }
  
  public enum b {
    CDMA, COMBINED, EDGE, EHRPD, EVDO_0, EVDO_A, EVDO_B, GPRS, GSM, HSDPA, HSPA, HSPAP, HSUPA, IDEN, IWLAN, LTE, LTE_CA, RTT, TD_SCDMA, UMTS, UNKNOWN_MOBILE_SUBTYPE;
    
    private static final SparseArray<b> valueMap;
    
    private final int value;
    
    static {
      b b1 = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
      UNKNOWN_MOBILE_SUBTYPE = b1;
      b b2 = new b("GPRS", 1, 1);
      GPRS = b2;
      b b3 = new b("EDGE", 2, 2);
      EDGE = b3;
      b b4 = new b("UMTS", 3, 3);
      UMTS = b4;
      b b5 = new b("CDMA", 4, 4);
      CDMA = b5;
      b b6 = new b("EVDO_0", 5, 5);
      EVDO_0 = b6;
      b b7 = new b("EVDO_A", 6, 6);
      EVDO_A = b7;
      b b8 = new b("RTT", 7, 7);
      RTT = b8;
      b b9 = new b("HSDPA", 8, 8);
      HSDPA = b9;
      b b10 = new b("HSUPA", 9, 9);
      HSUPA = b10;
      b b11 = new b("HSPA", 10, 10);
      HSPA = b11;
      b b12 = new b("IDEN", 11, 11);
      IDEN = b12;
      b b13 = new b("EVDO_B", 12, 12);
      EVDO_B = b13;
      b b14 = new b("LTE", 13, 13);
      LTE = b14;
      b b15 = new b("EHRPD", 14, 14);
      EHRPD = b15;
      b b16 = new b("HSPAP", 15, 15);
      HSPAP = b16;
      b b17 = new b("GSM", 16, 16);
      GSM = b17;
      b b18 = new b("TD_SCDMA", 17, 17);
      TD_SCDMA = b18;
      b b19 = new b("IWLAN", 18, 18);
      IWLAN = b19;
      b b20 = new b("LTE_CA", 19, 19);
      LTE_CA = b20;
      b b21 = new b("COMBINED", 20, 100);
      COMBINED = b21;
      $VALUES = new b[] { 
          b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, 
          b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, 
          b21 };
      SparseArray<b> sparseArray = new SparseArray();
      valueMap = sparseArray;
      sparseArray.put(0, b1);
      sparseArray.put(1, b2);
      sparseArray.put(2, b3);
      sparseArray.put(3, b4);
      sparseArray.put(4, b5);
      sparseArray.put(5, b6);
      sparseArray.put(6, b7);
      sparseArray.put(7, b8);
      sparseArray.put(8, b9);
      sparseArray.put(9, b10);
      sparseArray.put(10, b11);
      sparseArray.put(11, b12);
      sparseArray.put(12, b13);
      sparseArray.put(13, b14);
      sparseArray.put(14, b15);
      sparseArray.put(15, b16);
      sparseArray.put(16, b17);
      sparseArray.put(17, b18);
      sparseArray.put(18, b19);
      sparseArray.put(19, b20);
    }
    
    b(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static b forNumber(int param1Int) {
      return (b)valueMap.get(param1Int);
    }
    
    public int getValue() {
      return this.value;
    }
  }
  
  public enum c {
    BLUETOOTH, DUMMY, ETHERNET, MOBILE, MOBILE_CBS, MOBILE_DUN, MOBILE_EMERGENCY, MOBILE_FOTA, MOBILE_HIPRI, MOBILE_IA, MOBILE_IMS, MOBILE_MMS, MOBILE_SUPL, NONE, PROXY, VPN, WIFI, WIFI_P2P, WIMAX;
    
    private static final SparseArray<c> valueMap;
    
    private final int value;
    
    static {
      c c1 = new c("MOBILE", 0, 0);
      MOBILE = c1;
      c c2 = new c("WIFI", 1, 1);
      WIFI = c2;
      c c3 = new c("MOBILE_MMS", 2, 2);
      MOBILE_MMS = c3;
      c c4 = new c("MOBILE_SUPL", 3, 3);
      MOBILE_SUPL = c4;
      c c5 = new c("MOBILE_DUN", 4, 4);
      MOBILE_DUN = c5;
      c c6 = new c("MOBILE_HIPRI", 5, 5);
      MOBILE_HIPRI = c6;
      c c7 = new c("WIMAX", 6, 6);
      WIMAX = c7;
      c c8 = new c("BLUETOOTH", 7, 7);
      BLUETOOTH = c8;
      c c9 = new c("DUMMY", 8, 8);
      DUMMY = c9;
      c c10 = new c("ETHERNET", 9, 9);
      ETHERNET = c10;
      c c11 = new c("MOBILE_FOTA", 10, 10);
      MOBILE_FOTA = c11;
      c c12 = new c("MOBILE_IMS", 11, 11);
      MOBILE_IMS = c12;
      c c13 = new c("MOBILE_CBS", 12, 12);
      MOBILE_CBS = c13;
      c c14 = new c("WIFI_P2P", 13, 13);
      WIFI_P2P = c14;
      c c15 = new c("MOBILE_IA", 14, 14);
      MOBILE_IA = c15;
      c c16 = new c("MOBILE_EMERGENCY", 15, 15);
      MOBILE_EMERGENCY = c16;
      c c17 = new c("PROXY", 16, 16);
      PROXY = c17;
      c c18 = new c("VPN", 17, 17);
      VPN = c18;
      c c19 = new c("NONE", 18, -1);
      NONE = c19;
      $VALUES = new c[] { 
          c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, 
          c11, c12, c13, c14, c15, c16, c17, c18, c19 };
      SparseArray<c> sparseArray = new SparseArray();
      valueMap = sparseArray;
      sparseArray.put(0, c1);
      sparseArray.put(1, c2);
      sparseArray.put(2, c3);
      sparseArray.put(3, c4);
      sparseArray.put(4, c5);
      sparseArray.put(5, c6);
      sparseArray.put(6, c7);
      sparseArray.put(7, c8);
      sparseArray.put(8, c9);
      sparseArray.put(9, c10);
      sparseArray.put(10, c11);
      sparseArray.put(11, c12);
      sparseArray.put(12, c13);
      sparseArray.put(13, c14);
      sparseArray.put(14, c15);
      sparseArray.put(15, c16);
      sparseArray.put(16, c17);
      sparseArray.put(17, c18);
      sparseArray.put(-1, c19);
    }
    
    c(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static c forNumber(int param1Int) {
      return (c)valueMap.get(param1Int);
    }
    
    public int getValue() {
      return this.value;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */