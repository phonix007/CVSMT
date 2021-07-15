package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.LinkedList;

public abstract class zzcr implements zzcq {
    protected static volatile zzdl zzqo;
    protected MotionEvent zzqu;
    protected LinkedList<MotionEvent> zzqv = new LinkedList<>();
    protected long zzqw = 0;
    protected long zzqx = 0;
    protected long zzqy = 0;
    protected long zzqz = 0;
    protected long zzra = 0;
    protected long zzrb = 0;
    protected long zzrc = 0;
    protected double zzrd;
    private double zzre;
    private double zzrf;
    protected float zzrg;
    protected float zzrh;
    protected float zzri;
    protected float zzrj;
    private boolean zzrk = false;
    protected boolean zzrl = false;
    protected DisplayMetrics zzrm;

    protected zzcr(Context context) {
        try {
            if (((Boolean) zzwu.zzpz().zzd(zzaan.zzctq)).booleanValue()) {
                zzbw.zzw();
            } else {
                zzdq.zzb(zzqo);
            }
            this.zzrm = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzdi;

    /* access modifiers changed from: protected */
    public abstract zzbl zza(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract zzbl zza(Context context, zzbi zzbi);

    /* access modifiers changed from: protected */
    public abstract zzdr zzb(MotionEvent motionEvent) throws zzdi;

    public void zzb(View view) {
    }

    public final String zza(Context context) {
        if (zzds.isMainThread()) {
            if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcts)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, (String) null, false, (View) null, (Activity) null, (byte[]) null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, true, view, activity, (byte[]) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.zzrk
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r12.zzqz = r2
            r12.zzqy = r2
            r12.zzqx = r2
            r12.zzqw = r2
            r12.zzra = r2
            r12.zzrc = r2
            r12.zzrb = r2
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.zzqv
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r2.recycle()
            goto L_0x001b
        L_0x002b:
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.zzqv
            r0.clear()
            r0 = 0
            r12.zzqu = r0
            r12.zzrk = r1
        L_0x0035:
            int r0 = r13.getAction()
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007a
        L_0x003d:
            float r0 = r13.getRawX()
            double r2 = (double) r0
            float r0 = r13.getRawY()
            double r4 = (double) r0
            double r6 = r12.zzre
            java.lang.Double.isNaN(r2)
            double r6 = r2 - r6
            double r8 = r12.zzrf
            java.lang.Double.isNaN(r4)
            double r8 = r4 - r8
            double r10 = r12.zzrd
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            double r10 = r10 + r6
            r12.zzrd = r10
            r12.zzre = r2
            r12.zzrf = r4
            goto L_0x007a
        L_0x0068:
            r2 = 0
            r12.zzrd = r2
            float r0 = r13.getRawX()
            double r2 = (double) r0
            r12.zzre = r2
            float r0 = r13.getRawY()
            double r2 = (double) r0
            r12.zzrf = r2
        L_0x007a:
            int r0 = r13.getAction()
            r2 = 1
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0119;
                case 1: goto L_0x00e3;
                case 2: goto L_0x008d;
                case 3: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0136
        L_0x0086:
            long r0 = r12.zzqz
            long r0 = r0 + r2
            r12.zzqz = r0
            goto L_0x0136
        L_0x008d:
            long r2 = r12.zzqx
            int r0 = r13.getHistorySize()
            int r0 = r0 + r4
            long r5 = (long) r0
            long r2 = r2 + r5
            r12.zzqx = r2
            com.google.android.gms.internal.ads.zzdr r13 = r12.zzb((android.view.MotionEvent) r13)     // Catch:{ zzdi -> 0x0136 }
            if (r13 == 0) goto L_0x00a8
            java.lang.Long r0 = r13.zzgn     // Catch:{ zzdi -> 0x0136 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Long r0 = r13.zztp     // Catch:{ zzdi -> 0x0136 }
            if (r0 == 0) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            long r2 = r12.zzrb     // Catch:{ zzdi -> 0x0136 }
            java.lang.Long r0 = r13.zzgn     // Catch:{ zzdi -> 0x0136 }
            long r5 = r0.longValue()     // Catch:{ zzdi -> 0x0136 }
            java.lang.Long r0 = r13.zztp     // Catch:{ zzdi -> 0x0136 }
            long r7 = r0.longValue()     // Catch:{ zzdi -> 0x0136 }
            r0 = 0
            long r5 = r5 + r7
            long r2 = r2 + r5
            r12.zzrb = r2     // Catch:{ zzdi -> 0x0136 }
        L_0x00be:
            android.util.DisplayMetrics r0 = r12.zzrm     // Catch:{ zzdi -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            if (r13 == 0) goto L_0x00cd
            java.lang.Long r0 = r13.zzgl     // Catch:{ zzdi -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Long r0 = r13.zztq     // Catch:{ zzdi -> 0x0136 }
            if (r0 == 0) goto L_0x00cd
            r1 = 1
        L_0x00cd:
            if (r1 == 0) goto L_0x0136
            long r0 = r12.zzrc     // Catch:{ zzdi -> 0x0136 }
            java.lang.Long r2 = r13.zzgl     // Catch:{ zzdi -> 0x0136 }
            long r2 = r2.longValue()     // Catch:{ zzdi -> 0x0136 }
            java.lang.Long r13 = r13.zztq     // Catch:{ zzdi -> 0x0136 }
            long r5 = r13.longValue()     // Catch:{ zzdi -> 0x0136 }
            r13 = 0
            long r2 = r2 + r5
            long r0 = r0 + r2
            r12.zzrc = r0     // Catch:{ zzdi -> 0x0136 }
            goto L_0x0136
        L_0x00e3:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r12.zzqu = r13
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.zzqv
            android.view.MotionEvent r0 = r12.zzqu
            r13.add(r0)
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.zzqv
            int r13 = r13.size()
            r0 = 6
            if (r13 <= r0) goto L_0x0104
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.zzqv
            java.lang.Object r13 = r13.remove()
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r13.recycle()
        L_0x0104:
            long r0 = r12.zzqy
            long r0 = r0 + r2
            r12.zzqy = r0
            java.lang.Throwable r13 = new java.lang.Throwable     // Catch:{ zzdi -> 0x0136 }
            r13.<init>()     // Catch:{ zzdi -> 0x0136 }
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch:{ zzdi -> 0x0136 }
            long r0 = r12.zza((java.lang.StackTraceElement[]) r13)     // Catch:{ zzdi -> 0x0136 }
            r12.zzra = r0     // Catch:{ zzdi -> 0x0136 }
            goto L_0x0136
        L_0x0119:
            float r0 = r13.getX()
            r12.zzrg = r0
            float r0 = r13.getY()
            r12.zzrh = r0
            float r0 = r13.getRawX()
            r12.zzri = r0
            float r13 = r13.getRawY()
            r12.zzrj = r13
            long r0 = r12.zzqw
            long r0 = r0 + r2
            r12.zzqw = r0
        L_0x0136:
            r12.zzrl = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcr.zza(android.view.MotionEvent):void");
    }

    public final void zza(int i, int i2, int i3) {
        if (this.zzqu != null) {
            this.zzqu.recycle();
        }
        if (this.zzrm != null) {
            this.zzqu = MotionEvent.obtain(0, (long) i3, 1, this.zzrm.density * ((float) i), this.zzrm.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzqu = null;
        }
        this.zzrl = false;
    }

    private final String zza(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        zzbl zzbl;
        if (z) {
            try {
                zzbl = zza(context, view, activity);
                this.zzrk = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                return Integer.toString(7);
            } catch (Throwable unused2) {
                return Integer.toString(3);
            }
        } else {
            zzbl = zza(context, (zzbi) null);
        }
        if (zzbl != null) {
            if (zzbl.zzamj() != 0) {
                return zzbw.zza(zzbl, str);
            }
        }
        return Integer.toString(5);
    }
}
