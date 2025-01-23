package h7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e8.q;
import f8.o;
import i7.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o8.l;
import r8.g;
import r8.m;
import z8.d;
import z8.m;

public final class c extends a {
  public static final a s = new a(null);
  
  private final List<String> r = new ArrayList<String>();
  
  public void M() {
    Runtime.getRuntime().exec("logcat -c");
    this.r.clear();
  }
  
  @SuppressLint({"LogNotTimber"})
  public List<String> O() {
    try {
      BufferedReader bufferedReader;
      Process process = Runtime.getRuntime().exec("logcat -dv time");
      m.f(process, "process");
      InputStream inputStream = process.getInputStream();
      m.f(inputStream, "process.inputStream");
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream, d.b);
      if (inputStreamReader instanceof BufferedReader) {
        bufferedReader = (BufferedReader)inputStreamReader;
      } else {
        bufferedReader = new BufferedReader(bufferedReader, 8192);
      } 
      try {
        List list = l.e(bufferedReader);
        ArrayList<q> arrayList = new ArrayList(o.s(list, 10));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
          String str = m.C(m.C(m.C(m.C(m.C(iterator.next(), " W/", " W: ", false, 4, null), " E/", " E: ", false, 4, null), " V/", " V: ", false, 4, null), " I/", " I: ", false, 4, null), " D/", " D: ", false, 4, null);
          if (!this.r.contains(str))
            this.r.add(str); 
          arrayList.add(q.a);
        } 
      } finally {
        Exception exception = null;
      } 
    } catch (IOException iOException) {
      if (iOException.getMessage() == null)
        m.u(); 
    } 
    return this.r;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.k(paramLayoutInflater, "inflater");
    R(true);
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public static final class a {
    private a() {}
    
    public final c a(String param1String1, String param1String2, String param1String3) {
      m.k(param1String1, "targetFileName");
      m.k(param1String2, "searchHint");
      m.k(param1String3, "logMail");
      c c = new c();
      Bundle bundle = new Bundle();
      bundle.putString("targetFilename", param1String1);
      bundle.putString("search_hint", param1String2);
      bundle.putString("mail_logger", param1String3);
      c.setArguments(bundle);
      return c;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h7\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */