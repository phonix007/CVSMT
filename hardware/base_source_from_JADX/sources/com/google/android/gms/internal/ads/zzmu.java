package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

public final class zzmu implements zzlo {
    private Handler handler;
    private zzov zzagy;
    private final int zzawn;
    private zzlp zzawp;
    private zzpf zzawt;
    private final zzkt zzbah;
    private final zzmr zzbax;
    private zznj zzbbd;
    private final boolean zzbbk;
    private final zzow zzbbl;
    private final long zzbbm;
    private final zzpm<? extends zznj> zzbbn;
    private final zzmz zzbbo;
    private final Object zzbbp;
    private final SparseArray<zzms> zzbbq;
    private final Runnable zzbbr;
    private final Runnable zzbbs;
    private zzpk zzbbt;
    private Uri zzbbu;
    private long zzbbv;
    private long zzbbw;
    private long zzbbx;
    private int zzbby;

    public zzmu(Uri uri, zzow zzow, zzmr zzmr, Handler handler2, zzks zzks) {
        this(uri, zzow, zzmr, 3, -1, handler2, (zzks) null);
    }

    private zzmu(Uri uri, zzow zzow, zzmr zzmr, int i, long j, Handler handler2, zzks zzks) {
        this(uri, zzow, new zznk(), zzmr, 3, -1, handler2, (zzks) null);
    }

    private zzmu(Uri uri, zzow zzow, zzpm<? extends zznj> zzpm, zzmr zzmr, int i, long j, Handler handler2, zzks zzks) {
        this((zznj) null, uri, zzow, zzpm, zzmr, 3, -1, handler2, zzks);
    }

    private zzmu(zznj zznj, Uri uri, zzow zzow, zzpm<? extends zznj> zzpm, zzmr zzmr, int i, long j, Handler handler2, zzks zzks) {
        this.zzbbd = null;
        this.zzbbu = uri;
        this.zzbbl = zzow;
        this.zzbbn = zzpm;
        this.zzbax = zzmr;
        this.zzawn = i;
        this.zzbbm = j;
        this.zzbbk = false;
        this.zzbah = new zzkt(handler2, zzks);
        this.zzbbp = new Object();
        this.zzbbq = new SparseArray<>();
        this.zzbbo = new zzmz(this, (zzmv) null);
        this.zzbbr = new zzmv(this);
        this.zzbbs = new zzmw(this);
    }

    public final void zza(zzfg zzfg, boolean z, zzlp zzlp) {
        this.zzawp = zzlp;
        this.zzagy = this.zzbbl.zzgs();
        this.zzawt = new zzpf("Loader:DashMediaSource");
        this.zzbbt = this.zzawt;
        this.handler = new Handler();
        zzgb();
    }

    public final void zzfg() throws IOException {
        this.zzbbt.zzev();
    }

    public final zzlm zza(int i, zzot zzot) {
        int i2 = i;
        zzms zzms = new zzms(this.zzbby + i, this.zzbbd, i2, this.zzbax, this.zzawn, this.zzbah.zzw(this.zzbbd.zzba(i).zzbdj), this.zzbbx, this.zzbbt, zzot);
        this.zzbbq.put(zzms.f50id, zzms);
        return zzms;
    }

    public final void zzb(zzlm zzlm) {
        zzms zzms = (zzms) zzlm;
        zzms.release();
        this.zzbbq.remove(zzms.f50id);
    }

    public final void zzfh() {
        this.zzagy = null;
        this.zzbbt = null;
        if (this.zzawt != null) {
            this.zzawt.zza((Runnable) null);
            this.zzawt = null;
        }
        this.zzbbv = 0;
        this.zzbbw = 0;
        this.zzbbd = null;
        if (this.handler != null) {
            this.handler.removeCallbacksAndMessages((Object) null);
            this.handler = null;
        }
        this.zzbbx = 0;
        this.zzbbq.clear();
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzpl<zznj> zzpl, long j, long j2) {
        this.zzbah.zza(zzpl.zzazo, zzpl.type, j, j2, zzpl.zzfv());
        zznj result = zzpl.getResult();
        int i = 0;
        int zzcl = this.zzbbd == null ? 0 : this.zzbbd.zzcl();
        long j3 = result.zzba(0).zzbdj;
        while (i < zzcl && this.zzbbd.zzba(i).zzbdj < j3) {
            i++;
        }
        if (zzcl - i > result.zzcl()) {
            Log.w("DashMediaSource", "Out of sync manifest");
            zzgc();
            return;
        }
        this.zzbbd = result;
        this.zzbbv = j - j2;
        this.zzbbw = j;
        if (this.zzbbd.zzbcx != null) {
            synchronized (this.zzbbp) {
                if (zzpl.zzazo.uri == this.zzbbu) {
                    this.zzbbu = this.zzbbd.zzbcx;
                }
            }
        }
        if (zzcl != 0) {
            this.zzbby += i;
            zzi(true);
        } else if (this.zzbbd.zzbcw != null) {
            zzob zzob = this.zzbbd.zzbcw;
            String str = zzob.zzbdi;
            if (zzqe.zza((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || zzqe.zza((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    zzah(zzqe.zzal(zzob.value) - this.zzbbw);
                } catch (zzfx e) {
                    zzc(e);
                }
            } else if (zzqe.zza((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || zzqe.zza((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
                zza(zzob, (zzpm<Long>) new zzmy((zzmv) null));
            } else if (zzqe.zza((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") || zzqe.zza((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
                zza(zzob, (zzpm<Long>) new zznc((zzmv) null));
            } else {
                zzc(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            zzi(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzpl<zznj> zzpl, long j, long j2, IOException iOException) {
        zzpl<zznj> zzpl2 = zzpl;
        IOException iOException2 = iOException;
        boolean z = iOException2 instanceof zzfx;
        this.zzbah.zza(zzpl2.zzazo, zzpl2.type, j, j2, zzpl.zzfv(), iOException2, z);
        return z ? 3 : 0;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzpl<Long> zzpl, long j, long j2) {
        this.zzbah.zza(zzpl.zzazo, zzpl.type, j, j2, zzpl.zzfv());
        zzah(zzpl.getResult().longValue() - j);
    }

    /* access modifiers changed from: package-private */
    public final int zzb(zzpl<Long> zzpl, long j, long j2, IOException iOException) {
        zzpl<Long> zzpl2 = zzpl;
        zzkt zzkt = this.zzbah;
        zzoz zzoz = zzpl2.zzazo;
        int i = zzpl2.type;
        zzkt.zza(zzoz, i, j, j2, zzpl.zzfv(), iOException, true);
        zzc(iOException);
        return 2;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzpl<?> zzpl, long j, long j2) {
        this.zzbah.zzb(zzpl.zzazo, zzpl.type, j, j2, zzpl.zzfv());
    }

    /* access modifiers changed from: private */
    public final void zzgb() {
        Uri uri;
        synchronized (this.zzbbp) {
            uri = this.zzbbu;
        }
        zza(new zzpl(this.zzagy, uri, 4, this.zzbbn), this.zzbbo, this.zzawn);
    }

    private final void zza(zzob zzob, zzpm<Long> zzpm) {
        zza(new zzpl(this.zzagy, Uri.parse(zzob.value), 5, zzpm), new zznb(this, (zzmv) null), 1);
    }

    private final void zzah(long j) {
        this.zzbbx = j;
        zzi(true);
    }

    private final void zzc(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        zzi(true);
    }

    /* access modifiers changed from: private */
    public final void zzi(boolean z) {
        long j;
        boolean z2;
        long j2;
        long zzbb;
        for (int i = 0; i < this.zzbbq.size(); i++) {
            int keyAt = this.zzbbq.keyAt(i);
            if (keyAt >= this.zzbby) {
                this.zzbbq.valueAt(i).zza(this.zzbbd, keyAt - this.zzbby);
            }
        }
        int zzcl = this.zzbbd.zzcl() - 1;
        zzna zza = zzna.zza(this.zzbbd.zzba(0), this.zzbbd.zzbb(0));
        zzna zza2 = zzna.zza(this.zzbbd.zzba(zzcl), this.zzbbd.zzbb(zzcl));
        long j3 = zza.zzbcc;
        long j4 = zza2.zzbcd;
        long j5 = 0;
        if (!this.zzbbd.zzbcs || zza2.zzbcb) {
            j = j3;
            z2 = false;
        } else {
            if (this.zzbbx != 0) {
                j2 = zzfe.zzg(SystemClock.elapsedRealtime() + this.zzbbx);
            } else {
                j2 = zzfe.zzg(System.currentTimeMillis());
            }
            j4 = Math.min((j2 - zzfe.zzg(this.zzbbd.zzbcq)) - zzfe.zzg(this.zzbbd.zzba(zzcl).zzbdj), j4);
            if (this.zzbbd.zzbcu != -9223372036854775807L) {
                long zzg = j4 - zzfe.zzg(this.zzbbd.zzbcu);
                while (zzg < 0 && zzcl > 0) {
                    zzcl--;
                    zzg += this.zzbbd.zzbb(zzcl);
                }
                if (zzcl == 0) {
                    zzbb = Math.max(j3, zzg);
                } else {
                    zzbb = this.zzbbd.zzbb(0);
                }
                j3 = zzbb;
            }
            j = j3;
            z2 = true;
        }
        long j6 = j4 - j;
        for (int i2 = 0; i2 < this.zzbbd.zzcl() - 1; i2++) {
            j6 += this.zzbbd.zzbb(i2);
        }
        if (this.zzbbd.zzbcs) {
            long j7 = this.zzbbm;
            if (j7 == -1) {
                j7 = this.zzbbd.zzbcv != -9223372036854775807L ? this.zzbbd.zzbcv : 30000;
            }
            j5 = j6 - zzfe.zzg(j7);
            if (j5 < 5000000) {
                j5 = Math.min(5000000, j6 / 2);
            }
        }
        this.zzawp.zzb(new zzmx(this.zzbbd.zzbcq, this.zzbbd.zzbcq + this.zzbbd.zzba(0).zzbdj + zzfe.zzf(j), this.zzbby, j, j6, j5, this.zzbbd), this.zzbbd);
        this.handler.removeCallbacks(this.zzbbs);
        if (z2) {
            this.handler.postDelayed(this.zzbbs, 5000);
        }
        if (z) {
            zzgc();
        }
    }

    private final void zzgc() {
        if (this.zzbbd.zzbcs) {
            long j = this.zzbbd.zzbct;
            if (j == 0) {
                j = 5000;
            }
            this.handler.postDelayed(this.zzbbr, Math.max(0, (this.zzbbv + j) - SystemClock.elapsedRealtime()));
        }
    }

    private final <T> void zza(zzpl<T> zzpl, zzpg<zzpl<T>> zzpg, int i) {
        this.zzbah.zza(zzpl.zzazo, zzpl.type, this.zzawt.zza(zzpl, zzpg, i));
    }
}
