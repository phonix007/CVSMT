package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class zzlc implements zzib, zzlm, zzlu, zzpg<zzlh> {
    /* access modifiers changed from: private */
    public final Handler handler;
    private final Uri uri;
    private long zzaan;
    private final zzov zzagy;
    private final int zzawn;
    /* access modifiers changed from: private */
    public final zzll zzawo;
    private final zzlp zzawp;
    private final zzot zzawq;
    /* access modifiers changed from: private */
    public final String zzawr;
    /* access modifiers changed from: private */
    public final long zzaws;
    private final zzpf zzawt = new zzpf("Loader:ExtractorMediaPeriod");
    private final zzli zzawu;
    private final zzpq zzawv;
    private final Runnable zzaww;
    /* access modifiers changed from: private */
    public final Runnable zzawx;
    /* access modifiers changed from: private */
    public final SparseArray<zzls> zzawy;
    /* access modifiers changed from: private */
    public zzln zzawz;
    private zzig zzaxa;
    private boolean zzaxb;
    private boolean zzaxc;
    private boolean zzaxd;
    private int zzaxe;
    private zzma zzaxf;
    private boolean[] zzaxg;
    private boolean[] zzaxh;
    private boolean zzaxi;
    private long zzaxj;
    private long zzaxk;
    private int zzaxl;
    private boolean zzaxm;
    private long zzcc;
    private final Handler zzwx;
    /* access modifiers changed from: private */
    public boolean zzyb;
    private boolean zzyu;

    public zzlc(Uri uri2, zzov zzov, zzhz[] zzhzArr, int i, Handler handler2, zzll zzll, zzlp zzlp, zzot zzot, String str, int i2) {
        this.uri = uri2;
        this.zzagy = zzov;
        this.zzawn = i;
        this.zzwx = handler2;
        this.zzawo = zzll;
        this.zzawp = zzlp;
        this.zzawq = zzot;
        this.zzawr = str;
        this.zzaws = (long) i2;
        this.zzawu = new zzli(zzhzArr, this);
        this.zzawv = new zzpq();
        this.zzaww = new zzld(this);
        this.zzawx = new zzle(this);
        this.handler = new Handler();
        this.zzaxk = -9223372036854775807L;
        this.zzawy = new SparseArray<>();
        this.zzcc = -1;
    }

    public final void zzaa(long j) {
    }

    public final void release() {
        this.zzawt.zza((Runnable) new zzlf(this, this.zzawu));
        this.handler.removeCallbacksAndMessages((Object) null);
        this.zzyb = true;
    }

    public final void zza(zzln zzln, long j) {
        this.zzawz = zzln;
        this.zzawv.zzgz();
        startLoading();
    }

    public final void zzew() throws IOException {
        this.zzawt.zzbi(Integer.MIN_VALUE);
    }

    public final zzma zzex() {
        return this.zzaxf;
    }

    public final long zza(zzom[] zzomArr, boolean[] zArr, zzlv[] zzlvArr, boolean[] zArr2, long j) {
        zzpo.checkState(this.zzyu);
        for (int i = 0; i < zzomArr.length; i++) {
            if (zzlvArr[i] != null && (zzomArr[i] == null || !zArr[i])) {
                int zza = zzlvArr[i].track;
                zzpo.checkState(this.zzaxg[zza]);
                this.zzaxe--;
                this.zzaxg[zza] = false;
                this.zzawy.valueAt(zza).disable();
                zzlvArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < zzomArr.length; i2++) {
            if (zzlvArr[i2] == null && zzomArr[i2] != null) {
                zzom zzom = zzomArr[i2];
                zzpo.checkState(zzom.length() == 1);
                zzpo.checkState(zzom.zzbd(0) == 0);
                int zza2 = this.zzaxf.zza(zzom.zzgk());
                zzpo.checkState(!this.zzaxg[zza2]);
                this.zzaxe++;
                this.zzaxg[zza2] = true;
                zzlvArr[i2] = new zzlj(this, zza2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.zzaxc) {
            int size = this.zzawy.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.zzaxg[i3]) {
                    this.zzawy.valueAt(i3).disable();
                }
            }
        }
        if (this.zzaxe == 0) {
            this.zzaxd = false;
            if (this.zzawt.isLoading()) {
                this.zzawt.zzgy();
            }
        } else if (!this.zzaxc ? j != 0 : z) {
            j = zzab(j);
            for (int i4 = 0; i4 < zzlvArr.length; i4++) {
                if (zzlvArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.zzaxc = true;
        return j;
    }

    public final boolean zzy(long j) {
        if (this.zzaxm) {
            return false;
        }
        if (this.zzyu && this.zzaxe == 0) {
            return false;
        }
        boolean zzgz = this.zzawv.zzgz();
        if (this.zzawt.isLoading()) {
            return zzgz;
        }
        startLoading();
        return true;
    }

    public final long zzeu() {
        if (this.zzaxe == 0) {
            return Long.MIN_VALUE;
        }
        return zzez();
    }

    public final long zzey() {
        if (!this.zzaxd) {
            return -9223372036854775807L;
        }
        this.zzaxd = false;
        return this.zzaxj;
    }

    public final long zzez() {
        long j;
        if (this.zzaxm) {
            return Long.MIN_VALUE;
        }
        if (zzfd()) {
            return this.zzaxk;
        }
        if (this.zzaxi) {
            j = Long.MAX_VALUE;
            int size = this.zzawy.size();
            for (int i = 0; i < size; i++) {
                if (this.zzaxh[i]) {
                    j = Math.min(j, this.zzawy.valueAt(i).zzfc());
                }
            }
        } else {
            j = zzfc();
        }
        return j == Long.MIN_VALUE ? this.zzaxj : j;
    }

    public final long zzab(long j) {
        if (!this.zzaxa.zzdw()) {
            j = 0;
        }
        this.zzaxj = j;
        int size = this.zzawy.size();
        boolean z = !zzfd();
        int i = 0;
        while (z && i < size) {
            if (this.zzaxg[i]) {
                z = this.zzawy.valueAt(i).zze(j, false);
            }
            i++;
        }
        if (!z) {
            this.zzaxk = j;
            this.zzaxm = false;
            if (this.zzawt.isLoading()) {
                this.zzawt.zzgy();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzawy.valueAt(i2).zzh(this.zzaxg[i2]);
                }
            }
        }
        this.zzaxd = false;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzap(int i) {
        if (!this.zzaxm) {
            return !zzfd() && this.zzawy.valueAt(i).zzfm();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzev() throws IOException {
        this.zzawt.zzbi(Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i, zzfu zzfu, zzho zzho, boolean z) {
        if (this.zzaxd || zzfd()) {
            return -3;
        }
        return this.zzawy.valueAt(i).zza(zzfu, zzho, z, this.zzaxm, this.zzaxj);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j) {
        zzls valueAt = this.zzawy.valueAt(i);
        if (!this.zzaxm || j <= valueAt.zzfc()) {
            valueAt.zze(j, true);
        } else {
            valueAt.zzfp();
        }
    }

    public final zzii zzb(int i, int i2) {
        zzls zzls = this.zzawy.get(i);
        if (zzls != null) {
            return zzls;
        }
        zzls zzls2 = new zzls(this.zzawq);
        zzls2.zza((zzlu) this);
        this.zzawy.put(i, zzls2);
        return zzls2;
    }

    public final void zzdy() {
        this.zzaxb = true;
        this.handler.post(this.zzaww);
    }

    public final void zza(zzig zzig) {
        this.zzaxa = zzig;
        this.handler.post(this.zzaww);
    }

    public final void zzg(zzfs zzfs) {
        this.handler.post(this.zzaww);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void zzfa() {
        /*
            r8 = this;
            boolean r0 = r8.zzyb
            if (r0 != 0) goto L_0x009e
            boolean r0 = r8.zzyu
            if (r0 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzig r0 = r8.zzaxa
            if (r0 == 0) goto L_0x009e
            boolean r0 = r8.zzaxb
            if (r0 != 0) goto L_0x0012
            goto L_0x009e
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzls> r0 = r8.zzawy
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.zzls> r3 = r8.zzawy
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzls r3 = (com.google.android.gms.internal.ads.zzls) r3
            com.google.android.gms.internal.ads.zzfs r3 = r3.zzfn()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.zzpq r2 = r8.zzawv
            r2.zzha()
            com.google.android.gms.internal.ads.zzlz[] r2 = new com.google.android.gms.internal.ads.zzlz[r0]
            boolean[] r3 = new boolean[r0]
            r8.zzaxh = r3
            boolean[] r3 = new boolean[r0]
            r8.zzaxg = r3
            com.google.android.gms.internal.ads.zzig r3 = r8.zzaxa
            long r3 = r3.getDurationUs()
            r8.zzaan = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.zzls> r5 = r8.zzawy
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zzls r5 = (com.google.android.gms.internal.ads.zzls) r5
            com.google.android.gms.internal.ads.zzfs r5 = r5.zzfn()
            com.google.android.gms.internal.ads.zzlz r6 = new com.google.android.gms.internal.ads.zzlz
            com.google.android.gms.internal.ads.zzfs[] r7 = new com.google.android.gms.internal.ads.zzfs[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.zzzj
            boolean r6 = com.google.android.gms.internal.ads.zzpt.zzac(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.zzpt.zzab(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.zzaxh
            r5[r3] = r4
            boolean r5 = r8.zzaxi
            r4 = r4 | r5
            r8.zzaxi = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.zzma r0 = new com.google.android.gms.internal.ads.zzma
            r0.<init>(r2)
            r8.zzaxf = r0
            r8.zzyu = r4
            com.google.android.gms.internal.ads.zzlp r0 = r8.zzawp
            com.google.android.gms.internal.ads.zzly r1 = new com.google.android.gms.internal.ads.zzly
            long r2 = r8.zzaan
            com.google.android.gms.internal.ads.zzig r4 = r8.zzaxa
            boolean r4 = r4.zzdw()
            r1.<init>(r2, r4)
            r2 = 0
            r0.zzb(r1, r2)
            com.google.android.gms.internal.ads.zzln r0 = r8.zzawz
            r0.zza(r8)
            return
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlc.zzfa():void");
    }

    private final void zza(zzlh zzlh) {
        if (this.zzcc == -1) {
            this.zzcc = zzlh.zzcc;
        }
    }

    private final void startLoading() {
        zzlh zzlh = new zzlh(this, this.uri, this.zzagy, this.zzawu, this.zzawv);
        if (this.zzyu) {
            zzpo.checkState(zzfd());
            if (this.zzaan == -9223372036854775807L || this.zzaxk < this.zzaan) {
                zzlh.zze(this.zzaxa.zzr(this.zzaxk), this.zzaxk);
                this.zzaxk = -9223372036854775807L;
            } else {
                this.zzaxm = true;
                this.zzaxk = -9223372036854775807L;
                return;
            }
        }
        this.zzaxl = zzfb();
        int i = this.zzawn;
        if (i == -1) {
            i = (this.zzyu && this.zzcc == -1 && (this.zzaxa == null || this.zzaxa.getDurationUs() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzawt.zza(zzlh, this, i);
    }

    private final int zzfb() {
        int size = this.zzawy.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzawy.valueAt(i2).zzfk();
        }
        return i;
    }

    private final long zzfc() {
        int size = this.zzawy.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzawy.valueAt(i).zzfc());
        }
        return j;
    }

    private final boolean zzfd() {
        return this.zzaxk != -9223372036854775807L;
    }

    public final /* synthetic */ int zza(zzpi zzpi, long j, long j2, IOException iOException) {
        zzlh zzlh = (zzlh) zzpi;
        zza(zzlh);
        if (!(this.zzwx == null || this.zzawo == null)) {
            this.zzwx.post(new zzlg(this, iOException));
        }
        if (iOException instanceof zzmb) {
            return 3;
        }
        boolean z = zzfb() > this.zzaxl;
        if (this.zzcc == -1 && (this.zzaxa == null || this.zzaxa.getDurationUs() == -9223372036854775807L)) {
            this.zzaxj = 0;
            this.zzaxd = this.zzyu;
            int size = this.zzawy.size();
            for (int i = 0; i < size; i++) {
                this.zzawy.valueAt(i).zzh(!this.zzyu || this.zzaxg[i]);
            }
            zzlh.zze(0, 0);
        }
        this.zzaxl = zzfb();
        return z ? 1 : 0;
    }

    public final /* synthetic */ void zza(zzpi zzpi, long j, long j2, boolean z) {
        zza((zzlh) zzpi);
        if (!z && this.zzaxe > 0) {
            int size = this.zzawy.size();
            for (int i = 0; i < size; i++) {
                this.zzawy.valueAt(i).zzh(this.zzaxg[i]);
            }
            this.zzawz.zza(this);
        }
    }

    public final /* synthetic */ void zza(zzpi zzpi, long j, long j2) {
        zza((zzlh) zzpi);
        this.zzaxm = true;
        if (this.zzaan == -9223372036854775807L) {
            long zzfc = zzfc();
            this.zzaan = zzfc == Long.MIN_VALUE ? 0 : zzfc + 10000;
            this.zzawp.zzb(new zzly(this.zzaan, this.zzaxa.zzdw()), (Object) null);
        }
        this.zzawz.zza(this);
    }
}
