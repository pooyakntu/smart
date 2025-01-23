package h7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import i7.a;
import i7.b;
import j7.b;
import j7.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import o8.b;
import o8.l;
import r8.g;
import r8.m;
import y8.j;
import z8.m;

public final class d extends a implements Observer<b<? extends String>> {
  public static final a s = new a(null);
  
  private String r;
  
  public void M() {
    b b = c.a();
    if (b != null) {
      String str = b.l().getParent();
      if (str != null) {
        File[] arrayOfFile = (new File(str)).listFiles();
        if (arrayOfFile != null) {
          ArrayList<File> arrayList = new ArrayList();
          int j = arrayOfFile.length;
          for (int i = 0; i < j; i++) {
            File file = arrayOfFile[i];
            m.f(file, "it");
            String str1 = file.getName();
            m.f(str1, "it.name");
            if (m.s(str1, ".log", false, 2, null))
              arrayList.add(file); 
          } 
          for (File file : arrayList) {
            if (file.exists())
              file.delete(); 
          } 
        } 
      } 
    } 
  }
  
  public List<String> O() {
    Exception exception;
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = arrayList1;
    try {
      b b = c.a();
      Charset charset2 = null;
      ArrayList arrayList = arrayList1;
      Charset charset1 = charset2;
      if (b != null) {
        arrayList2 = arrayList1;
        String str = b.m();
        arrayList = arrayList1;
        charset1 = charset2;
        if (str != null) {
          BufferedReader bufferedReader;
          arrayList2 = arrayList1;
          File file = new File(str);
          arrayList2 = arrayList1;
          charset1 = z8.d.b;
          arrayList2 = arrayList1;
          InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset1);
          arrayList2 = arrayList1;
          if (inputStreamReader instanceof BufferedReader) {
            arrayList2 = arrayList1;
            bufferedReader = (BufferedReader)inputStreamReader;
          } else {
            arrayList2 = arrayList1;
            bufferedReader = new BufferedReader(bufferedReader, 8192);
          } 
          try {
            List<String> list = j.r(l.d(bufferedReader));
            arrayList2 = arrayList1;
            b.a(bufferedReader, null);
            return list;
          } finally {
            charset1 = null;
          } 
        } 
      } 
      exception = exception1;
      this.r = (String)charset1;
      return (List<String>)exception1;
    } catch (Exception exception1) {
      return (List<String>)exception;
    } 
  }
  
  public void U(b<String> paramb) {
    if (paramb != null) {
      String str = paramb.a();
      if (str != null && this.r != null) {
        b b1 = N();
        if (b1 != null)
          b1.K(str); 
      } 
    } 
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.k(paramLayoutInflater, "inflater");
    View view = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    b b = c.a();
    if (b != null) {
      LiveData liveData = b.n();
      if (liveData != null)
        liveData.observe(getViewLifecycleOwner(), this); 
    } 
    return view;
  }
  
  public static final class a {
    private a() {}
    
    public final d a(String param1String1, String param1String2, String param1String3) {
      m.k(param1String1, "targetFileName");
      m.k(param1String2, "searchHint");
      m.k(param1String3, "logMail");
      d d = new d();
      Bundle bundle = new Bundle();
      bundle.putString("targetFilename", param1String1);
      bundle.putString("search_hint", param1String2);
      bundle.putString("mail_logger", param1String3);
      d.setArguments(bundle);
      return d;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h7\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */