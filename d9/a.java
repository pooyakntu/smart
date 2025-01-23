package d9;

public enum a {
  DROP_LATEST, DROP_OLDEST, SUSPEND;
  
  static {
    DROP_OLDEST = new a("DROP_OLDEST", 1);
    DROP_LATEST = new a("DROP_LATEST", 2);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */