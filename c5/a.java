package c5;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.m;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.db.models.Group;
import com.smartpek.data.local.models.Channel;
import com.smartpek.data.local.models.j;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.customviews.TriStateSwitch;
import com.smartpek.utils.connection.ConnMngr;
import e8.q;
import f8.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p7.c0;
import q8.l;
import q8.p;
import q8.r;
import r8.m;
import r8.n;
import r8.y;

public interface a extends d {
  public static final class a {
    private static boolean c(a param1a, androidx.fragment.app.e param1e, View param1View, Group param1Group, int param1Int1, int param1Int2, int param1Int3, int param1Int4, List<String> param1List, l<? super List<String>, q> param1l) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: new java/lang/StringBuilder
      //   5: dup
      //   6: invokespecial <init> : ()V
      //   9: astore #10
      //   11: aload #10
      //   13: ldc 'checkAndResponse()  request: '
      //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   18: pop
      //   19: aload #10
      //   21: iload #4
      //   23: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   26: pop
      //   27: aload #10
      //   29: ldc '   success: '
      //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   34: pop
      //   35: aload #10
      //   37: iload #5
      //   39: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   42: pop
      //   43: aload #10
      //   45: ldc '   error: '
      //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   50: pop
      //   51: aload #10
      //   53: iload #6
      //   55: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   58: pop
      //   59: aload #10
      //   61: ldc '   ignore: '
      //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   66: pop
      //   67: aload #10
      //   69: iload #7
      //   71: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   74: pop
      //   75: iload #5
      //   77: iload #4
      //   79: if_icmpne -> 291
      //   82: iload #6
      //   84: ifne -> 291
      //   87: aload #8
      //   89: invokeinterface isEmpty : ()Z
      //   94: ifeq -> 179
      //   97: aload_3
      //   98: invokevirtual getName : ()Ljava/lang/String;
      //   101: astore_3
      //   102: aload_1
      //   103: ldc 2131951853
      //   105: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   108: astore #10
      //   110: new java/lang/StringBuilder
      //   113: dup
      //   114: invokespecial <init> : ()V
      //   117: astore #11
      //   119: aload #11
      //   121: aload_3
      //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   125: pop
      //   126: aload #11
      //   128: ldc ': '
      //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   133: pop
      //   134: aload #11
      //   136: aload #10
      //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   141: pop
      //   142: aload_1
      //   143: aload_2
      //   144: aconst_null
      //   145: aload #11
      //   147: invokevirtual toString : ()Ljava/lang/String;
      //   150: iconst_m1
      //   151: bipush #48
      //   153: aconst_null
      //   154: aconst_null
      //   155: ldc 2131296258
      //   157: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   160: ldc 2131100551
      //   162: fconst_0
      //   163: ldc 2131099779
      //   165: aconst_null
      //   166: iconst_0
      //   167: aconst_null
      //   168: sipush #14946
      //   171: aconst_null
      //   172: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
      //   175: pop
      //   176: goto -> 273
      //   179: aload_3
      //   180: invokevirtual getName : ()Ljava/lang/String;
      //   183: astore_3
      //   184: aload_1
      //   185: ldc 2131951853
      //   187: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   190: astore #10
      //   192: new java/lang/StringBuilder
      //   195: dup
      //   196: invokespecial <init> : ()V
      //   199: astore #11
      //   201: aload #11
      //   203: aload_3
      //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   207: pop
      //   208: aload #11
      //   210: ldc ': '
      //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   215: pop
      //   216: aload #11
      //   218: aload #10
      //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   223: pop
      //   224: aload_1
      //   225: aload_2
      //   226: aconst_null
      //   227: aload #11
      //   229: invokevirtual toString : ()Ljava/lang/String;
      //   232: iconst_0
      //   233: bipush #48
      //   235: aconst_null
      //   236: aconst_null
      //   237: ldc 2131296258
      //   239: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   242: ldc 2131100551
      //   244: fconst_0
      //   245: ldc 2131099779
      //   247: aload_1
      //   248: ldc 2131951828
      //   250: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   253: ldc 2131099861
      //   255: new c5/a$a$a
      //   258: dup
      //   259: aload #8
      //   261: aload_1
      //   262: invokespecial <init> : (Ljava/util/List;Landroidx/fragment/app/e;)V
      //   265: sipush #610
      //   268: aconst_null
      //   269: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
      //   272: pop
      //   273: aload #9
      //   275: aload #8
      //   277: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   282: pop
      //   283: aload_0
      //   284: monitorexit
      //   285: iconst_1
      //   286: ireturn
      //   287: astore_1
      //   288: goto -> 517
      //   291: iload #6
      //   293: iload #4
      //   295: if_icmpeq -> 424
      //   298: iload #4
      //   300: ifne -> 306
      //   303: goto -> 424
      //   306: iload #5
      //   308: iload #6
      //   310: iadd
      //   311: iload #4
      //   313: if_icmpne -> 521
      //   316: aload_3
      //   317: invokevirtual getName : ()Ljava/lang/String;
      //   320: astore_3
      //   321: aload_1
      //   322: ldc 2131951854
      //   324: invokevirtual getString : (I)Ljava/lang/String;
      //   327: astore #10
      //   329: new java/lang/StringBuilder
      //   332: dup
      //   333: invokespecial <init> : ()V
      //   336: astore #11
      //   338: aload #11
      //   340: aload_3
      //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   344: pop
      //   345: aload #11
      //   347: ldc ': '
      //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   352: pop
      //   353: aload #11
      //   355: aload #10
      //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   360: pop
      //   361: aload_1
      //   362: aload_2
      //   363: aconst_null
      //   364: aload #11
      //   366: invokevirtual toString : ()Ljava/lang/String;
      //   369: iconst_0
      //   370: bipush #48
      //   372: aconst_null
      //   373: aconst_null
      //   374: ldc 2131296258
      //   376: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   379: ldc 2131100551
      //   381: fconst_0
      //   382: ldc 2131099778
      //   384: aload_1
      //   385: ldc 2131951828
      //   387: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   390: ldc 2131099861
      //   392: new c5/a$a$b
      //   395: dup
      //   396: aload #8
      //   398: aload_1
      //   399: invokespecial <init> : (Ljava/util/List;Landroidx/fragment/app/e;)V
      //   402: sipush #610
      //   405: aconst_null
      //   406: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
      //   409: pop
      //   410: aload #9
      //   412: aload #8
      //   414: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   419: pop
      //   420: aload_0
      //   421: monitorexit
      //   422: iconst_1
      //   423: ireturn
      //   424: aload_3
      //   425: invokevirtual getName : ()Ljava/lang/String;
      //   428: astore_3
      //   429: aload_1
      //   430: ldc 2131952122
      //   432: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   435: astore #10
      //   437: new java/lang/StringBuilder
      //   440: dup
      //   441: invokespecial <init> : ()V
      //   444: astore #11
      //   446: aload #11
      //   448: aload_3
      //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   452: pop
      //   453: aload #11
      //   455: ldc ': '
      //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   460: pop
      //   461: aload #11
      //   463: aload #10
      //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   468: pop
      //   469: aload_1
      //   470: aload_2
      //   471: aconst_null
      //   472: aload #11
      //   474: invokevirtual toString : ()Ljava/lang/String;
      //   477: iconst_0
      //   478: bipush #48
      //   480: aconst_null
      //   481: aconst_null
      //   482: ldc 2131296258
      //   484: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   487: ldc 2131100551
      //   489: fconst_0
      //   490: ldc 2131099777
      //   492: aconst_null
      //   493: iconst_0
      //   494: aconst_null
      //   495: sipush #14954
      //   498: aconst_null
      //   499: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
      //   502: pop
      //   503: aload #9
      //   505: aload #8
      //   507: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
      //   512: pop
      //   513: aload_0
      //   514: monitorexit
      //   515: iconst_1
      //   516: ireturn
      //   517: aload_1
      //   518: invokevirtual printStackTrace : ()V
      //   521: aload_0
      //   522: monitorexit
      //   523: iconst_0
      //   524: ireturn
      //   525: astore_1
      //   526: aload_0
      //   527: monitorexit
      //   528: aload_1
      //   529: athrow
      // Exception table:
      //   from	to	target	type
      //   2	75	525	finally
      //   87	176	287	finally
      //   179	273	287	finally
      //   273	283	287	finally
      //   316	420	287	finally
      //   424	513	287	finally
      //   517	521	525	finally
    }
    
    public static void d(a param1a, Context param1Context, b5.b.a param1a1, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, q8.a<q> param1a2, q8.a<q> param1a3, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> param1r) {
      m.j(param1a1, "tab");
      m.j(param1c1, "commandFrom");
      m.j(param1a2, "onProgress");
      m.j(param1a3, "onError");
      m.j(param1r, "onResponse");
      d.b.f(param1a, param1Context, param1a1, param1Int, param1Integer, param1Device, param1c, param1c1, param1a2, param1a3, param1r);
    }
    
    public static void e(a param1a, androidx.fragment.app.e param1e, View param1View, Group param1Group, List<? extends Device> param1List, TriStateSwitch.b param1b, l<? super List<String>, q> param1l) {
      m.j(param1e, "context");
      m.j(param1View, "view");
      m.j(param1Group, "group");
      m.j(param1List, "devices");
      m.j(param1b, "triState");
      m.j(param1l, "callback");
      y y4 = new y();
      y y5 = new y();
      y y6 = new y();
      y y3 = new y();
      y y2 = new y();
      y y7 = new y();
      ArrayList<String> arrayList1 = new ArrayList();
      d d = new d(y2, y7);
      ArrayList<Device> arrayList = new ArrayList();
      for (Device device : param1List) {
        boolean bool;
        if (((Device)device).getGroup() == j.PSH115) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          arrayList.add(device); 
      } 
      arrayList2 = new ArrayList(o.s(arrayList, 10));
      Iterator<Device> iterator2 = arrayList.iterator();
      while (iterator2.hasNext()) {
        String str = param1e.getString(2131952258, new Object[] { ((Device)iterator2.next()).getName() });
        m.i(str, "context.getString(R.stri…ice_was_ignored, it.name)");
        arrayList2.add(str);
      } 
      arrayList1.addAll(arrayList2);
      y3.g += arrayList.size();
      arrayList = new ArrayList<Device>();
      for (ArrayList<String> arrayList2 : param1List) {
        boolean bool;
        if (((Device)arrayList2).getGroup() != j.PSH115) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          arrayList.add(arrayList2); 
      } 
      y7.g = arrayList.size();
      Iterator<Device> iterator1 = arrayList.iterator();
      y y1 = y3;
      while (iterator1.hasNext()) {
        Device device = iterator1.next();
        String str = device.getSsid();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onClickPower() > connect()  device: ");
        stringBuilder.append(str);
        ConnMngr.w(ConnMngr.j.e(param1e), device, b5.b.a.UNKNOWN, 0, false, false, false, false, null, new c(device, y2, arrayList1, param1e, y4, y5, d, param1a, param1View, param1Group, y6, y1, param1l, param1b), 172, null);
      } 
    }
    
    public static void f(a param1a, androidx.fragment.app.e param1e, b5.b.a param1a1, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, q8.a<q> param1a2, q8.a<q> param1a3, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> param1r) {
      m.j(param1a1, "tab");
      m.j(param1c1, "commandFrom");
      m.j(param1a2, "onProgress");
      m.j(param1a3, "onError");
      m.j(param1r, "onResponse");
      d.b.h(param1a, param1e, param1a1, param1Int, param1Integer, param1Device, param1c, param1c1, param1a2, param1a3, param1r);
    }
    
    public static void g(a param1a, androidx.fragment.app.e param1e, b5.b.a param1a1, int param1Int, Device param1Device, PowerButton param1PowerButton, c param1c, q8.a<q> param1a2, q8.a<q> param1a3, p<? super String, ? super com.smartpek.data.local.models.b, q> param1p) {
      m.j(param1a1, "tab");
      m.j(param1c, "commandFrom");
      m.j(param1a2, "onProgress");
      m.j(param1a3, "onError");
      m.j(param1p, "onResponse");
      d.b.k(param1a, param1e, param1a1, param1Int, param1Device, param1PowerButton, param1c, param1a2, param1a3, param1p);
    }
    
    public static boolean h(a param1a, androidx.fragment.app.e param1e, Context param1Context, b5.b.a param1a1, int param1Int, Device param1Device, PowerButton param1PowerButton, c param1c, q8.a<q> param1a2, q8.a<q> param1a3, p<? super String, ? super com.smartpek.data.local.models.b, q> param1p) {
      m.j(param1a1, "tab");
      m.j(param1c, "commandFrom");
      m.j(param1a2, "onProgress");
      m.j(param1a3, "onError");
      m.j(param1p, "onResponse");
      return d.b.l(param1a, param1e, param1Context, param1a1, param1Int, param1Device, param1PowerButton, param1c, param1a2, param1a3, param1p);
    }
    
    private static void i(a param1a, androidx.fragment.app.e param1e, View param1View, int param1Int1, int param1Int2, Device param1Device, q8.a<q> param1a1, q8.a<q> param1a2, int param1Int3) {
      param1a.l(param1e, (Context)param1e, param1Int1, Integer.valueOf(param1Int2), param1Device, null, c.APP, false, true, new e(param1Int3, param1Device, param1Int1, param1a1, param1a, param1e, param1View, param1Int2, param1a2), new f(param1a2));
    }
    
    public static void k(a param1a, androidx.fragment.app.e param1e, Context param1Context, int param1Int, Integer param1Integer, Device param1Device, com.smartpek.ui.customviews.c param1c, c param1c1, boolean param1Boolean1, boolean param1Boolean2, q8.a<q> param1a1, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> param1r) {
      m.j(param1c1, "commandFrom");
      m.j(param1a1, "onError");
      m.j(param1r, "onResponse");
      d.b.t(param1a, param1e, param1Context, param1Int, param1Integer, param1Device, param1c, param1c1, param1Boolean1, param1Boolean2, param1a1, param1r);
    }
    
    static final class a extends n implements q8.a<q> {
      a(List<String> param2List, androidx.fragment.app.e param2e) {
        super(0);
      }
      
      public final void invoke() {
        String str = o.S(this.g, "\n", null, null, 0, null, null, 62, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("results:\n");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        x4.b b = x4.b.i.a(this.g);
        if (b != null) {
          m m = this.h.getSupportFragmentManager();
          m.i(m, "context.supportFragmentManager");
          b.show(m, "BatchResultsDialog");
        } 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(List<String> param2List, androidx.fragment.app.e param2e) {
        super(0);
      }
      
      public final void invoke() {
        String str = o.S(this.g, "\n", null, null, 0, null, null, 62, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("results:\n");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        x4.b b1 = x4.b.i.a(this.g);
        if (b1 != null) {
          m m = this.h.getSupportFragmentManager();
          m.i(m, "context.supportFragmentManager");
          b1.show(m, "BatchResultsDialog");
        } 
      }
    }
    
    static final class c extends n implements p<r6.f, r6.e, q> {
      c(Device param2Device, y param2y1, List<String> param2List, androidx.fragment.app.e param2e, y param2y2, y param2y3, q8.a<Boolean> param2a, a param2a1, View param2View, Group param2Group, y param2y4, y param2y5, l<? super List<String>, q> param2l, TriStateSwitch.b param2b) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        m.j(param2f, "connectionState");
        String str = this.g.getSsid();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onClickPower() > connect() > callback()  device: ");
        stringBuilder.append(str);
        stringBuilder.append("   state: ");
        stringBuilder.append(param2f);
        int i = c.a[param2f.ordinal()];
        if (i != 2) {
          if (i != 3 && i != 4)
            return; 
          List<String> list = this.i;
          str = this.j.getString(2131951896, new Object[] { this.g.getName() });
          m.i(str, "context.getString(R.stri…nect_to_the, device.name)");
          list.add(str);
          y y1 = this.h;
          y1.g++;
          y1 = this.k;
          y1.g++;
          y1 = this.l;
          y1.g++;
          if (((Boolean)this.m.invoke()).booleanValue()) {
            a.a.a(this.n, this.j, this.o, this.p, this.k.g, this.q.g, this.l.g, this.r.g, this.i, this.s);
            return;
          } 
        } else {
          Channel[] arrayOfChannel = this.g.getChannels();
          if (arrayOfChannel != null) {
            Device device = this.g;
            List<String> list = this.i;
            androidx.fragment.app.e e1 = this.j;
            y y2 = this.r;
            TriStateSwitch.b b1 = this.t;
            y y3 = this.k;
            a a1 = this.n;
            View view = this.o;
            y y4 = this.l;
            q8.a<Boolean> a2 = this.m;
            Group group = this.p;
            y y5 = this.q;
            l<List<String>, q> l1 = this.s;
            i = arrayOfChannel.length;
            int j;
            for (j = 0; j < i; j++) {
              Channel channel = arrayOfChannel[j];
              int k = channel.getId();
              if ((device.getGroup() != j.PSH212 || k <= 0) && (device.getGroup() != j.PSH215 || k <= 0))
                if (device.getGroup() == j.PSH213 && channel.getClickAction() == com.smartpek.data.local.models.b.ON_THEN_OFF) {
                  String str1 = e1.getString(2131951881, new Object[] { channel.getName(), device.getName() });
                  m.i(str1, "context.getString(\n     …                        )");
                  list.add(str1);
                  y2.g++;
                } else if (channel.getTwoStepAction()) {
                  String str1 = e1.getString(2131951882, new Object[] { channel.getName(), device.getName() });
                  m.i(str1, "context.getString(\n     …                        )");
                  list.add(str1);
                  y2.g++;
                } else {
                  boolean bool;
                  com.smartpek.data.local.models.b b3 = channel.getClickAction();
                  if (b1 != TriStateSwitch.b.ON) {
                    bool = true;
                  } else {
                    bool = false;
                  } 
                  byte b2 = b3.code(Boolean.valueOf(bool), device.getConnType(), device.getGroup(), device.getVersion());
                  y3.g++;
                  Group group1 = group;
                  q8.a<Boolean> a3 = a2;
                  y y6 = y4;
                  View view1 = view;
                  a a4 = a1;
                  y y7 = y3;
                  y y8 = y2;
                  androidx.fragment.app.e e2 = e1;
                  a.a.j(a4, e2, view1, k, b2, device, new a(list, e1, channel, device, y6, a3, a4, view1, group1, y7, y5, y8, l1), new b(y5, a3, a4, e2, view1, group1, y7, y6, y8, list, l1), 0, 128, null);
                }  
            } 
          } 
          y y1 = this.h;
          y1.g++;
        } 
      }
      
      static final class a extends n implements q8.a<q> {
        a(List<String> param3List, androidx.fragment.app.e param3e, Channel param3Channel, Device param3Device, y param3y1, q8.a<Boolean> param3a, a param3a1, View param3View, Group param3Group, y param3y2, y param3y3, y param3y4, l<? super List<String>, q> param3l) {
          super(0);
        }
        
        public final void invoke() {
          List<String> list = this.g;
          String str = this.h.getString(2131951880, new Object[] { this.i.getName(), this.j.getName() });
          m.i(str, "context.getString(R.stri…hannel.name, device.name)");
          list.add(str);
          y y1 = this.k;
          y1.g++;
          if (((Boolean)this.l.invoke()).booleanValue())
            a.a.a(this.m, this.h, this.n, this.o, this.p.g, this.q.g, this.k.g, this.r.g, this.g, this.s); 
        }
      }
      
      static final class b extends n implements q8.a<q> {
        b(y param3y1, q8.a<Boolean> param3a, a param3a1, androidx.fragment.app.e param3e, View param3View, Group param3Group, y param3y2, y param3y3, y param3y4, List<String> param3List, l<? super List<String>, q> param3l) {
          super(0);
        }
        
        public final void invoke() {
          y y1 = this.g;
          y1.g++;
          if (((Boolean)this.h.invoke()).booleanValue())
            a.a.a(this.i, this.j, this.k, this.l, this.m.g, this.g.g, this.n.g, this.o.g, this.p, this.q); 
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(List<String> param2List, androidx.fragment.app.e param2e, Channel param2Channel, Device param2Device, y param2y1, q8.a<Boolean> param2a, a param2a1, View param2View, Group param2Group, y param2y2, y param2y3, y param2y4, l<? super List<String>, q> param2l) {
        super(0);
      }
      
      public final void invoke() {
        List<String> list = this.g;
        String str = this.h.getString(2131951880, new Object[] { this.i.getName(), this.j.getName() });
        m.i(str, "context.getString(R.stri…hannel.name, device.name)");
        list.add(str);
        y y1 = this.k;
        y1.g++;
        if (((Boolean)this.l.invoke()).booleanValue())
          a.a.a(this.m, this.h, this.n, this.o, this.p.g, this.q.g, this.k.g, this.r.g, this.g, this.s); 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(y param2y1, q8.a<Boolean> param2a, a param2a1, androidx.fragment.app.e param2e, View param2View, Group param2Group, y param2y2, y param2y3, y param2y4, List<String> param2List, l<? super List<String>, q> param2l) {
        super(0);
      }
      
      public final void invoke() {
        y y1 = this.g;
        y1.g++;
        if (((Boolean)this.h.invoke()).booleanValue())
          a.a.a(this.i, this.j, this.k, this.l, this.m.g, this.g.g, this.n.g, this.o.g, this.p, this.q); 
      }
    }
    
    static final class d extends n implements q8.a<Boolean> {
      d(y param2y1, y param2y2) {
        super(0);
      }
      
      public final Boolean a() {
        boolean bool;
        int i = this.g.g;
        int j = this.h.g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onClickPower() > allRequestsSent()  connectCount: ");
        stringBuilder.append(i);
        stringBuilder.append("   deviceCount: ");
        stringBuilder.append(j);
        if (this.g.g == this.h.g) {
          bool = true;
        } else {
          bool = false;
        } 
        return Boolean.valueOf(bool);
      }
    }
    
    static final class e extends n implements q8.a<q> {
      e(int param2Int1, Device param2Device, int param2Int2, q8.a<q> param2a1, a param2a, androidx.fragment.app.e param2e, View param2View, int param2Int3, q8.a<q> param2a2) {
        super(0);
      }
      
      public final void invoke() {
        if (this.g == 0) {
          String str1 = this.h.getSsid();
          int j = this.i;
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("runToggle() > retry  device: ");
          stringBuilder1.append(str1);
          stringBuilder1.append("   index: ");
          stringBuilder1.append(j);
          c0.e(1000, new a(this.k, this.l, this.m, this.i, this.n, this.h, this.j, this.o));
          return;
        } 
        String str = this.h.getSsid();
        int i = this.i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("runToggle() > error  device: ");
        stringBuilder.append(str);
        stringBuilder.append("   index: ");
        stringBuilder.append(i);
        this.j.invoke();
      }
      
      static final class a extends n implements q8.a<q> {
        a(a param3a, androidx.fragment.app.e param3e, View param3View, int param3Int1, int param3Int2, Device param3Device, q8.a<q> param3a1, q8.a<q> param3a2) {
          super(0);
        }
        
        public final void invoke() {
          a.a.b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, 1);
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(a param2a, androidx.fragment.app.e param2e, View param2View, int param2Int1, int param2Int2, Device param2Device, q8.a<q> param2a1, q8.a<q> param2a2) {
        super(0);
      }
      
      public final void invoke() {
        a.a.b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, 1);
      }
    }
    
    static final class f extends n implements r<String, String, com.smartpek.data.local.models.b, Boolean, q> {
      f(q8.a<q> param2a) {
        super(4);
      }
      
      public final void a(String param2String1, String param2String2, com.smartpek.data.local.models.b param2b, boolean param2Boolean) {
        this.g.invoke();
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(List<String> param1List, androidx.fragment.app.e param1e) {
      super(0);
    }
    
    public final void invoke() {
      String str = o.S(this.g, "\n", null, null, 0, null, null, 62, null);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("results:\n");
      stringBuilder.append(str);
      stringBuilder.append("\n");
      x4.b b = x4.b.i.a(this.g);
      if (b != null) {
        m m = this.h.getSupportFragmentManager();
        m.i(m, "context.supportFragmentManager");
        b.show(m, "BatchResultsDialog");
      } 
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(List<String> param1List, androidx.fragment.app.e param1e) {
      super(0);
    }
    
    public final void invoke() {
      String str = o.S(this.g, "\n", null, null, 0, null, null, 62, null);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("results:\n");
      stringBuilder.append(str);
      stringBuilder.append("\n");
      x4.b b1 = x4.b.i.a(this.g);
      if (b1 != null) {
        m m = this.h.getSupportFragmentManager();
        m.i(m, "context.supportFragmentManager");
        b1.show(m, "BatchResultsDialog");
      } 
    }
  }
  
  static final class c extends n implements p<r6.f, r6.e, q> {
    c(Device param1Device, y param1y1, List<String> param1List, androidx.fragment.app.e param1e, y param1y2, y param1y3, q8.a<Boolean> param1a, a param1a1, View param1View, Group param1Group, y param1y4, y param1y5, l<? super List<String>, q> param1l, TriStateSwitch.b param1b) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      m.j(param1f, "connectionState");
      String str = this.g.getSsid();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onClickPower() > connect() > callback()  device: ");
      stringBuilder.append(str);
      stringBuilder.append("   state: ");
      stringBuilder.append(param1f);
      int i = c.a[param1f.ordinal()];
      if (i != 2) {
        if (i != 3 && i != 4)
          return; 
        List<String> list = this.i;
        str = this.j.getString(2131951896, new Object[] { this.g.getName() });
        m.i(str, "context.getString(R.stri…nect_to_the, device.name)");
        list.add(str);
        y y1 = this.h;
        y1.g++;
        y1 = this.k;
        y1.g++;
        y1 = this.l;
        y1.g++;
        if (((Boolean)this.m.invoke()).booleanValue()) {
          a.a.a(this.n, this.j, this.o, this.p, this.k.g, this.q.g, this.l.g, this.r.g, this.i, this.s);
          return;
        } 
      } else {
        Channel[] arrayOfChannel = this.g.getChannels();
        if (arrayOfChannel != null) {
          Device device = this.g;
          List<String> list = this.i;
          androidx.fragment.app.e e1 = this.j;
          y y2 = this.r;
          TriStateSwitch.b b1 = this.t;
          y y3 = this.k;
          a a1 = this.n;
          View view = this.o;
          y y4 = this.l;
          q8.a<Boolean> a2 = this.m;
          Group group = this.p;
          y y5 = this.q;
          l<List<String>, q> l1 = this.s;
          i = arrayOfChannel.length;
          int j;
          for (j = 0; j < i; j++) {
            Channel channel = arrayOfChannel[j];
            int k = channel.getId();
            if ((device.getGroup() != j.PSH212 || k <= 0) && (device.getGroup() != j.PSH215 || k <= 0))
              if (device.getGroup() == j.PSH213 && channel.getClickAction() == com.smartpek.data.local.models.b.ON_THEN_OFF) {
                String str1 = e1.getString(2131951881, new Object[] { channel.getName(), device.getName() });
                m.i(str1, "context.getString(\n     …                        )");
                list.add(str1);
                y2.g++;
              } else if (channel.getTwoStepAction()) {
                String str1 = e1.getString(2131951882, new Object[] { channel.getName(), device.getName() });
                m.i(str1, "context.getString(\n     …                        )");
                list.add(str1);
                y2.g++;
              } else {
                boolean bool;
                com.smartpek.data.local.models.b b3 = channel.getClickAction();
                if (b1 != TriStateSwitch.b.ON) {
                  bool = true;
                } else {
                  bool = false;
                } 
                byte b2 = b3.code(Boolean.valueOf(bool), device.getConnType(), device.getGroup(), device.getVersion());
                y3.g++;
                Group group1 = group;
                q8.a<Boolean> a3 = a2;
                y y6 = y4;
                View view1 = view;
                a a4 = a1;
                y y7 = y3;
                y y8 = y2;
                androidx.fragment.app.e e2 = e1;
                a.a.j(a4, e2, view1, k, b2, device, new a(list, e1, channel, device, y6, a3, a4, view1, group1, y7, y5, y8, l1), new b(y5, a3, a4, e2, view1, group1, y7, y6, y8, list, l1), 0, 128, null);
              }  
          } 
        } 
        y y1 = this.h;
        y1.g++;
      } 
    }
    
    static final class a extends n implements q8.a<q> {
      a(List<String> param3List, androidx.fragment.app.e param3e, Channel param3Channel, Device param3Device, y param3y1, q8.a<Boolean> param3a, a param3a1, View param3View, Group param3Group, y param3y2, y param3y3, y param3y4, l<? super List<String>, q> param3l) {
        super(0);
      }
      
      public final void invoke() {
        List<String> list = this.g;
        String str = this.h.getString(2131951880, new Object[] { this.i.getName(), this.j.getName() });
        m.i(str, "context.getString(R.stri…hannel.name, device.name)");
        list.add(str);
        y y1 = this.k;
        y1.g++;
        if (((Boolean)this.l.invoke()).booleanValue())
          a.a.a(this.m, this.h, this.n, this.o, this.p.g, this.q.g, this.k.g, this.r.g, this.g, this.s); 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(y param3y1, q8.a<Boolean> param3a, a param3a1, androidx.fragment.app.e param3e, View param3View, Group param3Group, y param3y2, y param3y3, y param3y4, List<String> param3List, l<? super List<String>, q> param3l) {
        super(0);
      }
      
      public final void invoke() {
        y y1 = this.g;
        y1.g++;
        if (((Boolean)this.h.invoke()).booleanValue())
          a.a.a(this.i, this.j, this.k, this.l, this.m.g, this.g.g, this.n.g, this.o.g, this.p, this.q); 
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(List<String> param1List, androidx.fragment.app.e param1e, Channel param1Channel, Device param1Device, y param1y1, q8.a<Boolean> param1a, a param1a1, View param1View, Group param1Group, y param1y2, y param1y3, y param1y4, l<? super List<String>, q> param1l) {
      super(0);
    }
    
    public final void invoke() {
      List<String> list = this.g;
      String str = this.h.getString(2131951880, new Object[] { this.i.getName(), this.j.getName() });
      m.i(str, "context.getString(R.stri…hannel.name, device.name)");
      list.add(str);
      y y1 = this.k;
      y1.g++;
      if (((Boolean)this.l.invoke()).booleanValue())
        a.a.a(this.m, this.h, this.n, this.o, this.p.g, this.q.g, this.k.g, this.r.g, this.g, this.s); 
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(y param1y1, q8.a<Boolean> param1a, a param1a1, androidx.fragment.app.e param1e, View param1View, Group param1Group, y param1y2, y param1y3, y param1y4, List<String> param1List, l<? super List<String>, q> param1l) {
      super(0);
    }
    
    public final void invoke() {
      y y1 = this.g;
      y1.g++;
      if (((Boolean)this.h.invoke()).booleanValue())
        a.a.a(this.i, this.j, this.k, this.l, this.m.g, this.g.g, this.n.g, this.o.g, this.p, this.q); 
    }
  }
  
  static final class d extends n implements q8.a<Boolean> {
    d(y param1y1, y param1y2) {
      super(0);
    }
    
    public final Boolean a() {
      boolean bool;
      int i = this.g.g;
      int j = this.h.g;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onClickPower() > allRequestsSent()  connectCount: ");
      stringBuilder.append(i);
      stringBuilder.append("   deviceCount: ");
      stringBuilder.append(j);
      if (this.g.g == this.h.g) {
        bool = true;
      } else {
        bool = false;
      } 
      return Boolean.valueOf(bool);
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(int param1Int1, Device param1Device, int param1Int2, q8.a<q> param1a1, a param1a, androidx.fragment.app.e param1e, View param1View, int param1Int3, q8.a<q> param1a2) {
      super(0);
    }
    
    public final void invoke() {
      if (this.g == 0) {
        String str1 = this.h.getSsid();
        int j = this.i;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("runToggle() > retry  device: ");
        stringBuilder1.append(str1);
        stringBuilder1.append("   index: ");
        stringBuilder1.append(j);
        c0.e(1000, new a(this.k, this.l, this.m, this.i, this.n, this.h, this.j, this.o));
        return;
      } 
      String str = this.h.getSsid();
      int i = this.i;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("runToggle() > error  device: ");
      stringBuilder.append(str);
      stringBuilder.append("   index: ");
      stringBuilder.append(i);
      this.j.invoke();
    }
    
    static final class a extends n implements q8.a<q> {
      a(a param3a, androidx.fragment.app.e param3e, View param3View, int param3Int1, int param3Int2, Device param3Device, q8.a<q> param3a1, q8.a<q> param3a2) {
        super(0);
      }
      
      public final void invoke() {
        a.a.b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, 1);
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(a param1a, androidx.fragment.app.e param1e, View param1View, int param1Int1, int param1Int2, Device param1Device, q8.a<q> param1a1, q8.a<q> param1a2) {
      super(0);
    }
    
    public final void invoke() {
      a.a.b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, 1);
    }
  }
  
  static final class f extends n implements r<String, String, com.smartpek.data.local.models.b, Boolean, q> {
    f(q8.a<q> param1a) {
      super(4);
    }
    
    public final void a(String param1String1, String param1String2, com.smartpek.data.local.models.b param1b, boolean param1Boolean) {
      this.g.invoke();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c5\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */