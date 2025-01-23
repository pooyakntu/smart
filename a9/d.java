package a9;

import java.util.concurrent.TimeUnit;

public enum d {
  DAYS,
  HOURS,
  MICROSECONDS,
  MILLISECONDS,
  MINUTES,
  NANOSECONDS(TimeUnit.NANOSECONDS),
  SECONDS(TimeUnit.NANOSECONDS);
  
  private final TimeUnit timeUnit;
  
  static {
    MICROSECONDS = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    MILLISECONDS = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    SECONDS = new d("SECONDS", 3, TimeUnit.SECONDS);
    MINUTES = new d("MINUTES", 4, TimeUnit.MINUTES);
    HOURS = new d("HOURS", 5, TimeUnit.HOURS);
    DAYS = new d("DAYS", 6, TimeUnit.DAYS);
    $VALUES = $values();
  }
  
  d(TimeUnit paramTimeUnit) {
    this.timeUnit = paramTimeUnit;
  }
  
  public final TimeUnit getTimeUnit$kotlin_stdlib() {
    return this.timeUnit;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a9\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */