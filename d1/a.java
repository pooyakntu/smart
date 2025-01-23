package d1;

public enum a {
  DATA_DISK_CACHE, LOCAL, MEMORY_CACHE, REMOTE, RESOURCE_DISK_CACHE;
  
  static {
    a a1 = new a("LOCAL", 0);
    LOCAL = a1;
    a a2 = new a("REMOTE", 1);
    REMOTE = a2;
    a a3 = new a("DATA_DISK_CACHE", 2);
    DATA_DISK_CACHE = a3;
    a a4 = new a("RESOURCE_DISK_CACHE", 3);
    RESOURCE_DISK_CACHE = a4;
    a a5 = new a("MEMORY_CACHE", 4);
    MEMORY_CACHE = a5;
    $VALUES = new a[] { a1, a2, a3, a4, a5 };
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d1\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */