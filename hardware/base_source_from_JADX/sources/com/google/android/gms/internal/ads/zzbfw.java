package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@zzark
@TargetApi(16)
public final class zzbfw extends zzbfk implements zzbez {
    private String url;
    private boolean zzexf;
    private zzbes zzexl;
    private Exception zzexm;
    private boolean zzexn;

    public zzbfw(zzbdz zzbdz, zzbdy zzbdy) {
        super(zzbdz);
        this.zzexl = new zzbes(zzbdz.getContext(), zzbdy);
        this.zzexl.zza((zzbez) this);
    }

    public final void zzdd(int i) {
    }

    public final void zzp(int i, int i2) {
    }

    public final void zzb(boolean z, long j) {
        zzbdz zzbdz = (zzbdz) this.zzewo.get();
        if (zzbdz != null) {
            zzbcg.zzepo.execute(new zzbfx(zzbdz, z, j));
        }
    }

    public final void zza(String str, Exception exc) {
        this.zzexm = exc;
        zzaxz.zzc("Precache error", exc);
        zzfa(str);
    }

    public final void zzda(int i) {
        this.zzexl.zzacz().zzdg(i);
    }

    public final void zzcz(int i) {
        this.zzexl.zzacz().zzdf(i);
    }

    public final void zzdb(int i) {
        this.zzexl.zzacz().zzdb(i);
    }

    public final void zzdc(int i) {
        this.zzexl.zzacz().zzdc(i);
    }

    public final void release() {
        if (this.zzexl != null) {
            this.zzexl.zza((zzbez) null);
            this.zzexl.release();
        }
        super.release();
    }

    /* access modifiers changed from: protected */
    public final String zzey(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.zzey(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r11.zzexm == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        throw r11.zzexm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzex(java.lang.String r33) {
        /*
            r32 = this;
            r11 = r32
            r12 = r33
            r11.url = r12
            java.lang.String r13 = r32.zzey(r33)
            java.lang.String r14 = "error"
            android.net.Uri r0 = android.net.Uri.parse(r33)     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzbes r1 = r11.zzexl     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r11.zzeiz     // Catch:{ Exception -> 0x0157 }
            r1.zza((android.net.Uri) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.ref.WeakReference r0 = r11.zzewo     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzbdz r0 = (com.google.android.gms.internal.ads.zzbdz) r0     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x0028
            r0.zza((java.lang.String) r13, (com.google.android.gms.internal.ads.zzbfk) r11)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            goto L_0x015a
        L_0x0028:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ Exception -> 0x0157 }
            long r16 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzaac<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaan.zzcox     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0157 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzaac<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaan.zzcow     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0157 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0157 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r1 * r3
            com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzaan.zzcov     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0157 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0157 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0157 }
            r1 = -1
        L_0x0067:
            monitor-enter(r32)     // Catch:{ Exception -> 0x0157 }
            long r18 = r0.currentTimeMillis()     // Catch:{ all -> 0x0150 }
            r3 = 0
            long r18 = r18 - r16
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0123
            boolean r3 = r11.zzexf     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x008a
            java.lang.Exception r0 = r11.zzexm     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r11.zzexm     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0080:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x008a:
            boolean r3 = r11.zzexn     // Catch:{ all -> 0x0150 }
            r18 = 1
            if (r3 == 0) goto L_0x0093
            monitor-exit(r32)     // Catch:{ all -> 0x0155 }
            goto L_0x00f4
        L_0x0093:
            com.google.android.gms.internal.ads.zzbes r3 = r11.zzexl     // Catch:{ all -> 0x0150 }
            com.google.android.gms.internal.ads.zzfg r3 = r3.zzacw()     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x0117
            r20 = r14
            long r14 = r3.getDuration()     // Catch:{ all -> 0x014c }
            r21 = 0
            int r8 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f9
            long r23 = r3.getBufferedPosition()     // Catch:{ all -> 0x014c }
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00d6
            int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b5
            r8 = 1
            goto L_0x00b6
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            int r19 = com.google.android.gms.internal.ads.zzbes.zzacx()     // Catch:{ all -> 0x014c }
            int r25 = com.google.android.gms.internal.ads.zzbes.zzacy()     // Catch:{ all -> 0x014c }
            r1 = r32
            r2 = r33
            r3 = r13
            r26 = r4
            r4 = r23
            r28 = r6
            r6 = r14
            r30 = r9
            r9 = r19
            r10 = r25
            r1.zza(r2, r3, r4, r6, r8, r9, r10)     // Catch:{ all -> 0x014c }
            r1 = r23
            goto L_0x00dc
        L_0x00d6:
            r26 = r4
            r28 = r6
            r30 = r9
        L_0x00dc:
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00e5
            r11.zzc(r12, r13, r14)     // Catch:{ all -> 0x014c }
            monitor-exit(r32)     // Catch:{ all -> 0x014c }
            goto L_0x00f4
        L_0x00e5:
            com.google.android.gms.internal.ads.zzbes r3 = r11.zzexl     // Catch:{ all -> 0x014c }
            long r3 = r3.getBytesTransferred()     // Catch:{ all -> 0x014c }
            int r5 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r5 < 0) goto L_0x00f5
            int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f5
            monitor-exit(r32)     // Catch:{ all -> 0x014c }
        L_0x00f4:
            return r18
        L_0x00f5:
            r3 = r1
            r1 = r30
            goto L_0x00ff
        L_0x00f9:
            r26 = r4
            r28 = r6
            r3 = r1
            r1 = r9
        L_0x00ff:
            r11.wait(r1)     // Catch:{ InterruptedException -> 0x010d }
            monitor-exit(r32)     // Catch:{ all -> 0x014c }
            r9 = r1
            r1 = r3
            r14 = r20
            r4 = r26
            r6 = r28
            goto L_0x0067
        L_0x010d:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0117:
            r20 = r14
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0123:
            r28 = r6
            r20 = r14
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            r3.<init>(r2)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0149 }
            r4 = r28
            r3.append(r4)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0149 }
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            r14 = r1
            goto L_0x0153
        L_0x014c:
            r0 = move-exception
            r14 = r20
            goto L_0x0153
        L_0x0150:
            r0 = move-exception
            r20 = r14
        L_0x0153:
            monitor-exit(r32)     // Catch:{ all -> 0x0155 }
            throw r0     // Catch:{ Exception -> 0x0025 }
        L_0x0155:
            r0 = move-exception
            goto L_0x0153
        L_0x0157:
            r0 = move-exception
            r20 = r14
        L_0x015a:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r33)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " Exception: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzaxz.zzeo(r1)
            r32.release()
            java.lang.String r0 = zzb((java.lang.String) r14, (java.lang.Exception) r0)
            r11.zza(r12, r13, r14, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfw.zzex(java.lang.String):boolean");
    }

    public final void abort() {
        zzfa((String) null);
    }

    private final void zzfa(String str) {
        synchronized (this) {
            this.zzexf = true;
            notify();
            release();
        }
        if (this.url != null) {
            String zzey = zzey(this.url);
            if (this.zzexm != null) {
                zza(this.url, zzey, "badUrl", zzb(str, this.zzexm));
            } else {
                zza(this.url, zzey, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbes zzadd() {
        synchronized (this) {
            this.zzexn = true;
            notify();
        }
        this.zzexl.zza((zzbez) null);
        zzbes zzbes = this.zzexl;
        this.zzexl = null;
        return zzbes;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
