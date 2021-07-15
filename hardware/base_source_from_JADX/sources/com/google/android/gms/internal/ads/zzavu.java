package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzark
public final class zzavu extends zzaxv implements zzavt {
    private final Context mContext;
    private final Object mLock;
    private final zzaxg zzdsk;
    private final long zzeet;
    private final ArrayList<zzavk> zzefh;
    private final List<zzavn> zzefi;
    private final HashSet<String> zzefj;
    private final zzauk zzefk;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzavu(android.content.Context r8, com.google.android.gms.internal.ads.zzaxg r9, com.google.android.gms.internal.ads.zzauk r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzaac<java.lang.Long> r0 = com.google.android.gms.internal.ads.zzaan.zzcrj
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavu.<init>(android.content.Context, com.google.android.gms.internal.ads.zzaxg, com.google.android.gms.internal.ads.zzauk):void");
    }

    public final void onStop() {
    }

    public final void zza(String str, int i) {
    }

    @VisibleForTesting
    private zzavu(Context context, zzaxg zzaxg, zzauk zzauk, long j) {
        this.zzefh = new ArrayList<>();
        this.zzefi = new ArrayList();
        this.zzefj = new HashSet<>();
        this.mLock = new Object();
        this.mContext = context;
        this.zzdsk = zzaxg;
        this.zzefk = zzauk;
        this.zzeet = j;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0163 */
    public final void zzki() {
        /*
            r19 = this;
            r11 = r19
            com.google.android.gms.internal.ads.zzaxg r0 = r11.zzdsk
            com.google.android.gms.internal.ads.zzakr r0 = r0.zzehj
            java.util.List<com.google.android.gms.internal.ads.zzakq> r0 = r0.zzdlp
            java.util.Iterator r12 = r0.iterator()
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r12.next()
            r13 = r0
            com.google.android.gms.internal.ads.zzakq r13 = (com.google.android.gms.internal.ads.zzakq) r13
            java.lang.String r14 = r13.zzdle
            java.util.List<java.lang.String> r0 = r13.zzdkw
            java.util.Iterator r15 = r0.iterator()
        L_0x0021:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r0
            goto L_0x004c
        L_0x0040:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b9 }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x00b9 }
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00b9 }
            goto L_0x003e
        L_0x004c:
            java.lang.Object r9 = r11.mLock
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzauk r0 = r11.zzefk     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.internal.ads.zzavy r7 = r0.zzdd(r3)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzavs r0 = r7.zzxo()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzalj r0 = r7.zzxn()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0064
            goto L_0x008a
        L_0x0064:
            com.google.android.gms.internal.ads.zzavk r0 = new com.google.android.gms.internal.ads.zzavk     // Catch:{ all -> 0x00b2 }
            android.content.Context r2 = r11.mContext     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.internal.ads.zzaxg r6 = r11.zzdsk     // Catch:{ all -> 0x00b2 }
            long r4 = r11.zzeet     // Catch:{ all -> 0x00b2 }
            r1 = r0
            r16 = r4
            r4 = r14
            r5 = r13
            r8 = r19
            r18 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzauk r1 = r11.zzefk     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.ads.internal.gmsg.zzb r1 = r1.zzxb()     // Catch:{ all -> 0x00b7 }
            r0.zza((com.google.android.gms.ads.internal.gmsg.zzb) r1)     // Catch:{ all -> 0x00b7 }
            java.util.ArrayList<com.google.android.gms.internal.ads.zzavk> r1 = r11.zzefh     // Catch:{ all -> 0x00b7 }
            r1.add(r0)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b7 }
            goto L_0x0021
        L_0x008a:
            r18 = r9
            java.util.List<com.google.android.gms.internal.ads.zzavn> r0 = r11.zzefi     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzavp r1 = new com.google.android.gms.internal.ads.zzavp     // Catch:{ all -> 0x00b7 }
            r1.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = r13.zzdkx     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzavp r1 = r1.zzdg(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzavp r1 = r1.zzdf(r3)     // Catch:{ all -> 0x00b7 }
            r2 = 0
            com.google.android.gms.internal.ads.zzavp r1 = r1.zzar(r2)     // Catch:{ all -> 0x00b7 }
            r2 = 7
            com.google.android.gms.internal.ads.zzavp r1 = r1.zzcu(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzavn r1 = r1.zzxm()     // Catch:{ all -> 0x00b7 }
            r0.add(r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b7 }
            goto L_0x0021
        L_0x00b2:
            r0 = move-exception
            r18 = r9
        L_0x00b5:
            monitor-exit(r18)     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x00b7:
            r0 = move-exception
            goto L_0x00b5
        L_0x00b9:
            r0 = move-exception
            java.lang.String r1 = "Unable to determine custom event class name, skipping..."
            com.google.android.gms.internal.ads.zzaxz.zzb(r1, r0)
            goto L_0x0021
        L_0x00c1:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList<com.google.android.gms.internal.ads.zzavk> r1 = r11.zzefh
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x00d0:
            if (r4 >= r2) goto L_0x00e6
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.zzavk r5 = (com.google.android.gms.internal.ads.zzavk) r5
            java.lang.String r6 = r5.zzdml
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x00d0
            r5.zzxi()
            goto L_0x00d0
        L_0x00e6:
            java.util.ArrayList<com.google.android.gms.internal.ads.zzavk> r0 = r11.zzefh
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L_0x00ef:
            if (r3 >= r2) goto L_0x019c
            java.lang.Object r0 = r1.get(r3)
            int r3 = r3 + 1
            r4 = r0
            com.google.android.gms.internal.ads.zzavk r4 = (com.google.android.gms.internal.ads.zzavk) r4
            java.util.concurrent.Future r0 = r4.zzxi()     // Catch:{ InterruptedException -> 0x0163, Exception -> 0x0144 }
            r0.get()     // Catch:{ InterruptedException -> 0x0163, Exception -> 0x0144 }
            java.lang.Object r5 = r11.mLock
            monitor-enter(r5)
            java.lang.String r0 = r4.zzdml     // Catch:{ all -> 0x013f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0115
            java.util.List<com.google.android.gms.internal.ads.zzavn> r0 = r11.zzefi     // Catch:{ all -> 0x013f }
            com.google.android.gms.internal.ads.zzavn r6 = r4.zzxj()     // Catch:{ all -> 0x013f }
            r0.add(r6)     // Catch:{ all -> 0x013f }
        L_0x0115:
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            java.lang.Object r6 = r11.mLock
            monitor-enter(r6)
            java.util.HashSet<java.lang.String> r0 = r11.zzefj     // Catch:{ all -> 0x013c }
            java.lang.String r5 = r4.zzdml     // Catch:{ all -> 0x013c }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = r4.zzdml     // Catch:{ all -> 0x013c }
            com.google.android.gms.internal.ads.zzakq r1 = r4.zzxk()     // Catch:{ all -> 0x013c }
            r2 = -2
            com.google.android.gms.internal.ads.zzaxf r0 = r11.zza(r2, r0, r1)     // Catch:{ all -> 0x013c }
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzbat.zztu     // Catch:{ all -> 0x013c }
            com.google.android.gms.internal.ads.zzavv r2 = new com.google.android.gms.internal.ads.zzavv     // Catch:{ all -> 0x013c }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x013c }
            r1.post(r2)     // Catch:{ all -> 0x013c }
            monitor-exit(r6)     // Catch:{ all -> 0x013c }
            return
        L_0x013a:
            monitor-exit(r6)     // Catch:{ all -> 0x013c }
            goto L_0x00ef
        L_0x013c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x013c }
            throw r0
        L_0x013f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            throw r0
        L_0x0142:
            r0 = move-exception
            goto L_0x0183
        L_0x0144:
            r0 = move-exception
            java.lang.String r5 = "Unable to resolve rewarded adapter."
            com.google.android.gms.internal.ads.zzaxz.zzc(r5, r0)     // Catch:{ all -> 0x0142 }
            java.lang.Object r5 = r11.mLock
            monitor-enter(r5)
            java.lang.String r0 = r4.zzdml     // Catch:{ all -> 0x0160 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0160 }
            if (r0 != 0) goto L_0x015e
            java.util.List<com.google.android.gms.internal.ads.zzavn> r0 = r11.zzefi     // Catch:{ all -> 0x0160 }
            com.google.android.gms.internal.ads.zzavn r4 = r4.zzxj()     // Catch:{ all -> 0x0160 }
            r0.add(r4)     // Catch:{ all -> 0x0160 }
        L_0x015e:
            monitor-exit(r5)     // Catch:{ all -> 0x0160 }
            goto L_0x00ef
        L_0x0160:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0160 }
            throw r0
        L_0x0163:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0142 }
            r0.interrupt()     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r11.mLock
            monitor-enter(r1)
            java.lang.String r0 = r4.zzdml     // Catch:{ all -> 0x0180 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x017e
            java.util.List<com.google.android.gms.internal.ads.zzavn> r0 = r11.zzefi     // Catch:{ all -> 0x0180 }
            com.google.android.gms.internal.ads.zzavn r2 = r4.zzxj()     // Catch:{ all -> 0x0180 }
            r0.add(r2)     // Catch:{ all -> 0x0180 }
        L_0x017e:
            monitor-exit(r1)     // Catch:{ all -> 0x0180 }
            goto L_0x019c
        L_0x0180:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0180 }
            throw r0
        L_0x0183:
            java.lang.Object r1 = r11.mLock
            monitor-enter(r1)
            java.lang.String r2 = r4.zzdml     // Catch:{ all -> 0x0199 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0199 }
            if (r2 != 0) goto L_0x0197
            java.util.List<com.google.android.gms.internal.ads.zzavn> r2 = r11.zzefi     // Catch:{ all -> 0x0199 }
            com.google.android.gms.internal.ads.zzavn r3 = r4.zzxj()     // Catch:{ all -> 0x0199 }
            r2.add(r3)     // Catch:{ all -> 0x0199 }
        L_0x0197:
            monitor-exit(r1)     // Catch:{ all -> 0x0199 }
            throw r0
        L_0x0199:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0199 }
            throw r0
        L_0x019c:
            r0 = 3
            r1 = 0
            com.google.android.gms.internal.ads.zzaxf r0 = r11.zza(r0, r1, r1)
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzbat.zztu
            com.google.android.gms.internal.ads.zzavw r2 = new com.google.android.gms.internal.ads.zzavw
            r2.<init>(r11, r0)
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavu.zzki():void");
    }

    public final void zzde(String str) {
        synchronized (this.mLock) {
            this.zzefj.add(str);
        }
    }

    private final zzaxf zza(int i, @Nullable String str, @Nullable zzakq zzakq) {
        boolean z;
        long j;
        String str2;
        zzwf zzwf;
        String str3;
        long j2;
        int i2;
        zzwb zzwb = this.zzdsk.zzeag.zzdwg;
        List<String> list = this.zzdsk.zzehy.zzdlq;
        List<String> list2 = this.zzdsk.zzehy.zzdlr;
        List<String> list3 = this.zzdsk.zzehy.zzdyf;
        int i3 = this.zzdsk.zzehy.orientation;
        long j3 = this.zzdsk.zzehy.zzdlx;
        String str4 = this.zzdsk.zzeag.zzdwj;
        boolean z2 = this.zzdsk.zzehy.zzdyd;
        zzakr zzakr = this.zzdsk.zzehj;
        long j4 = this.zzdsk.zzehy.zzdye;
        zzwf zzwf2 = this.zzdsk.zzbst;
        long j5 = j4;
        zzakr zzakr2 = zzakr;
        long j6 = this.zzdsk.zzehy.zzdyc;
        long j7 = this.zzdsk.zzehn;
        long j8 = this.zzdsk.zzehy.zzdyh;
        String str5 = this.zzdsk.zzehy.zzdyi;
        JSONObject jSONObject = this.zzdsk.zzehh;
        zzawd zzawd = this.zzdsk.zzehy.zzdyr;
        JSONObject jSONObject2 = jSONObject;
        List<String> list4 = this.zzdsk.zzehy.zzdys;
        List<String> list5 = this.zzdsk.zzehy.zzdyt;
        boolean z3 = this.zzdsk.zzehy.zzdyu;
        zzaso zzaso = this.zzdsk.zzehy.zzdyv;
        zzawd zzawd2 = zzawd;
        StringBuilder sb = new StringBuilder(BuildConfig.FLAVOR);
        if (this.zzefi == null) {
            str3 = sb.toString();
            zzwf = zzwf2;
            z = z2;
            str2 = str5;
            j = j8;
        } else {
            Iterator<zzavn> it = this.zzefi.iterator();
            while (true) {
                zzwf = zzwf2;
                if (it.hasNext()) {
                    zzavn next = it.next();
                    if (next != null) {
                        Iterator<zzavn> it2 = it;
                        if (!TextUtils.isEmpty(next.zzdkx)) {
                            String str6 = next.zzdkx;
                            String str7 = str5;
                            switch (next.errorCode) {
                                case 3:
                                    j2 = j8;
                                    i2 = 1;
                                    break;
                                case 4:
                                    j2 = j8;
                                    i2 = 2;
                                    break;
                                case 5:
                                    j2 = j8;
                                    i2 = 4;
                                    break;
                                case 6:
                                    j2 = j8;
                                    i2 = 0;
                                    break;
                                case 7:
                                    j2 = j8;
                                    i2 = 3;
                                    break;
                                default:
                                    j2 = j8;
                                    i2 = 6;
                                    break;
                            }
                            long j9 = next.zzdng;
                            boolean z4 = z2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 33);
                            sb2.append(str6);
                            sb2.append(".");
                            sb2.append(i2);
                            sb2.append(".");
                            sb2.append(j9);
                            sb.append(String.valueOf(sb2.toString()).concat("_"));
                            zzwf2 = zzwf;
                            it = it2;
                            str5 = str7;
                            j8 = j2;
                            z2 = z4;
                        } else {
                            zzwf2 = zzwf;
                            it = it2;
                        }
                    } else {
                        zzwf2 = zzwf;
                    }
                } else {
                    z = z2;
                    str2 = str5;
                    j = j8;
                    str3 = sb.substring(0, Math.max(0, sb.length() - 1));
                }
            }
        }
        return new zzaxf(zzwb, (zzbgg) null, list, i, list2, list3, i3, j3, str4, z, zzakq, (zzalj) null, str, zzakr2, (zzakt) null, j5, zzwf, j6, j7, j, str2, jSONObject2, (zzacf) null, zzawd2, list4, list5, z3, zzaso, str3, this.zzdsk.zzehy.zzdlu, this.zzdsk.zzehy.zzdyy, this.zzdsk.zzehw, this.zzdsk.zzehy.zzbph, this.zzdsk.zzehx, this.zzdsk.zzehy.zzdzc, this.zzdsk.zzehy.zzdls, this.zzdsk.zzehy.zzbpi, this.zzdsk.zzehy.zzdzd, this.zzdsk.zzehy.zzdzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzaxf zzaxf) {
        this.zzefk.zzxc().zzb(zzaxf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzaxf zzaxf) {
        this.zzefk.zzxc().zzb(zzaxf);
    }
}
