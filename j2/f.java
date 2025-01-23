package j2;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import z1.d;

@AutoValue
public abstract class f {
  private long a(int paramInt, long paramLong) {
    long l;
    paramInt--;
    if (paramLong > 1L) {
      l = paramLong;
    } else {
      l = 2L;
    } 
    double d = Math.max(1.0D, Math.log(10000.0D) / Math.log((l * paramInt)));
    return (long)(Math.pow(3.0D, paramInt) * paramLong * d);
  }
  
  public static a b() {
    return new a();
  }
  
  static f d(m2.a parama, Map<d, b> paramMap) {
    return new b(parama, paramMap);
  }
  
  public static f f(m2.a parama) {
    return b().a(d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(new c[] { c.NETWORK_UNMETERED, c.DEVICE_IDLE })).a()).c(parama).b();
  }
  
  private static <T> Set<T> i(T... paramVarArgs) {
    return Collections.unmodifiableSet(new HashSet<T>(Arrays.asList(paramVarArgs)));
  }
  
  private void j(JobInfo.Builder paramBuilder, Set<c> paramSet) {
    if (paramSet.contains(c.NETWORK_UNMETERED)) {
      paramBuilder.setRequiredNetworkType(2);
    } else {
      paramBuilder.setRequiredNetworkType(1);
    } 
    if (paramSet.contains(c.DEVICE_CHARGING))
      paramBuilder.setRequiresCharging(true); 
    if (paramSet.contains(c.DEVICE_IDLE))
      paramBuilder.setRequiresDeviceIdle(true); 
  }
  
  public JobInfo.Builder c(JobInfo.Builder paramBuilder, d paramd, long paramLong, int paramInt) {
    paramBuilder.setMinimumLatency(g(paramd, paramLong, paramInt));
    j(paramBuilder, ((b)h().get(paramd)).c());
    return paramBuilder;
  }
  
  abstract m2.a e();
  
  public long g(d paramd, long paramLong, int paramInt) {
    long l = e().a();
    b b = h().get(paramd);
    return Math.min(Math.max(a(paramInt, b.b()), paramLong - l), b.d());
  }
  
  abstract Map<d, b> h();
  
  public static class a {
    private m2.a a;
    
    private Map<d, f.b> b = new HashMap<d, f.b>();
    
    public a a(d param1d, f.b param1b) {
      this.b.put(param1d, param1b);
      return this;
    }
    
    public f b() {
      if (this.a != null) {
        if (this.b.keySet().size() >= (d.values()).length) {
          Map<d, f.b> map = this.b;
          this.b = new HashMap<d, f.b>();
          return f.d(this.a, map);
        } 
        throw new IllegalStateException("Not all priorities have been configured");
      } 
      throw new NullPointerException("missing required property: clock");
    }
    
    public a c(m2.a param1a) {
      this.a = param1a;
      return this;
    }
  }
  
  @AutoValue
  public static abstract class b {
    public static a a() {
      return (new c.b()).c(Collections.emptySet());
    }
    
    abstract long b();
    
    abstract Set<f.c> c();
    
    abstract long d();
    
    @Builder
    public static abstract class a {
      public abstract f.b a();
      
      public abstract a b(long param2Long);
      
      public abstract a c(Set<f.c> param2Set);
      
      public abstract a d(long param2Long);
    }
  }
  
  @Builder
  public static abstract class a {
    public abstract f.b a();
    
    public abstract a b(long param1Long);
    
    public abstract a c(Set<f.c> param1Set);
    
    public abstract a d(long param1Long);
  }
  
  public enum c {
    DEVICE_CHARGING, DEVICE_IDLE, NETWORK_UNMETERED;
    
    static {
      c c1 = new c("NETWORK_UNMETERED", 0);
      NETWORK_UNMETERED = c1;
      c c2 = new c("DEVICE_IDLE", 1);
      DEVICE_IDLE = c2;
      c c3 = new c("DEVICE_CHARGING", 2);
      DEVICE_CHARGING = c3;
      $VALUES = new c[] { c1, c2, c3 };
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j2\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */