package j2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import b2.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g2.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import n2.a;

public class d implements x {
  private final Context a;
  
  private final k2.d b;
  
  private final f c;
  
  public d(Context paramContext, k2.d paramd, f paramf) {
    this.a = paramContext;
    this.b = paramd;
    this.c = paramf;
  }
  
  private boolean d(JobScheduler paramJobScheduler, int paramInt1, int paramInt2) {
    boolean bool;
    Iterator<JobInfo> iterator = paramJobScheduler.getAllPendingJobs().iterator();
    while (true) {
      boolean bool2 = iterator.hasNext();
      boolean bool1 = false;
      bool = bool1;
      if (bool2) {
        JobInfo jobInfo = iterator.next();
        int i = jobInfo.getExtras().getInt("attemptNumber");
        if (jobInfo.getId() == paramInt1) {
          bool = bool1;
          if (i >= paramInt2)
            bool = true; 
          break;
        } 
        continue;
      } 
      break;
    } 
    return bool;
  }
  
  public void a(o paramo, int paramInt, boolean paramBoolean) {
    ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
    JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
    int i = c(paramo);
    if (!paramBoolean && d(jobScheduler, i, paramInt)) {
      a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", paramo);
      return;
    } 
    long l = this.b.B0(paramo);
    JobInfo.Builder builder = this.c.c(new JobInfo.Builder(i, componentName), paramo.d(), l, paramInt);
    PersistableBundle persistableBundle = new PersistableBundle();
    persistableBundle.putInt("attemptNumber", paramInt);
    persistableBundle.putString("backendName", paramo.b());
    persistableBundle.putInt("priority", a.a(paramo.d()));
    if (paramo.c() != null)
      persistableBundle.putString("extras", Base64.encodeToString(paramo.c(), 0)); 
    builder.setExtras(persistableBundle);
    a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramo, Integer.valueOf(i), Long.valueOf(this.c.g(paramo.d(), l, paramInt)), Long.valueOf(l), Integer.valueOf(paramInt) });
    jobScheduler.schedule(builder.build());
  }
  
  public void b(o paramo, int paramInt) {
    a(paramo, paramInt, false);
  }
  
  int c(o paramo) {
    Adler32 adler32 = new Adler32();
    adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
    adler32.update(paramo.b().getBytes(Charset.forName("UTF-8")));
    adler32.update(ByteBuffer.allocate(4).putInt(a.a(paramo.d())).array());
    if (paramo.c() != null)
      adler32.update(paramo.c()); 
    return (int)adler32.getValue();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j2\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */