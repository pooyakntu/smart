package b2;

import java.util.concurrent.Executor;

class m implements Executor {
  private final Executor g;
  
  m(Executor paramExecutor) {
    this.g = paramExecutor;
  }
  
  public void execute(Runnable paramRunnable) {
    this.g.execute(new a(paramRunnable));
  }
  
  static class a implements Runnable {
    private final Runnable g;
    
    a(Runnable param1Runnable) {
      this.g = param1Runnable;
    }
    
    public void run() {
      try {
        this.g.run();
        return;
      } catch (Exception exception) {
        g2.a.d("Executor", "Background execution failure.", exception);
        return;
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */