package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaf;
import java.util.Collections;
import java.util.Map;

public abstract class zzr<T> implements Comparable<zzr<T>> {
    private final Object mLock;
    /* access modifiers changed from: private */
    public final zzaf.zza zzae;
    private final int zzaf;
    private final String zzag;
    private final int zzah;
    @Nullable
    @GuardedBy("mLock")
    private zzy zzai;
    private Integer zzaj;
    private zzv zzak;
    private boolean zzal;
    @GuardedBy("mLock")
    private boolean zzam;
    @GuardedBy("mLock")
    private boolean zzan;
    private boolean zzao;
    private zzab zzap;
    private zzc zzaq;
    @GuardedBy("mLock")
    private zzt zzar;

    public zzr(int i, String str, @Nullable zzy zzy) {
        Uri parse;
        String host;
        this.zzae = zzaf.zza.zzbk ? new zzaf.zza() : null;
        this.mLock = new Object();
        this.zzal = true;
        int i2 = 0;
        this.zzam = false;
        this.zzan = false;
        this.zzao = false;
        this.zzaq = null;
        this.zzaf = i;
        this.zzag = str;
        this.zzai = zzy;
        this.zzap = new zzh();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.zzah = i2;
    }

    /* access modifiers changed from: protected */
    public abstract zzx<T> zza(zzp zzp);

    /* access modifiers changed from: protected */
    public abstract void zza(T t);

    public byte[] zzh() throws zza {
        return null;
    }

    public final int getMethod() {
        return this.zzaf;
    }

    public final int zze() {
        return this.zzah;
    }

    public final void zzb(String str) {
        if (zzaf.zza.zzbk) {
            this.zzae.zza(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(String str) {
        if (this.zzak != null) {
            this.zzak.zzf(this);
        }
        if (zzaf.zza.zzbk) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzs(this, str, id));
                return;
            }
            this.zzae.zza(str, id);
            this.zzae.zzc(toString());
        }
    }

    public final zzr<?> zza(zzv zzv) {
        this.zzak = zzv;
        return this;
    }

    public final zzr<?> zza(int i) {
        this.zzaj = Integer.valueOf(i);
        return this;
    }

    public final String getUrl() {
        return this.zzag;
    }

    public final String zzf() {
        String str = this.zzag;
        int i = this.zzaf;
        if (i == 0 || i == -1) {
            return str;
        }
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final zzr<?> zza(zzc zzc) {
        this.zzaq = zzc;
        return this;
    }

    public final zzc zzg() {
        return this.zzaq;
    }

    public final boolean isCanceled() {
        synchronized (this.mLock) {
        }
        return false;
    }

    public Map<String, String> getHeaders() throws zza {
        return Collections.emptyMap();
    }

    public final boolean zzi() {
        return this.zzal;
    }

    public final int zzj() {
        return this.zzap.zzc();
    }

    public final zzab zzk() {
        return this.zzap;
    }

    public final void zzl() {
        synchronized (this.mLock) {
            this.zzan = true;
        }
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzan;
        }
        return z;
    }

    public final void zzb(zzae zzae2) {
        zzy zzy;
        synchronized (this.mLock) {
            zzy = this.zzai;
        }
        if (zzy != null) {
            zzy.zzd(zzae2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzt zzt) {
        synchronized (this.mLock) {
            this.zzar = zzt;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzx<?> zzx) {
        zzt zzt;
        synchronized (this.mLock) {
            zzt = this.zzar;
        }
        if (zzt != null) {
            zzt.zza(this, zzx);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn() {
        zzt zzt;
        synchronized (this.mLock) {
            zzt = this.zzar;
        }
        if (zzt != null) {
            zzt.zza(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzah));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        isCanceled();
        String str = this.zzag;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.zzaj);
        StringBuilder sb = new StringBuilder(String.valueOf("[ ] ").length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public /* synthetic */ int compareTo(Object obj) {
        zzr zzr = (zzr) obj;
        zzu zzu = zzu.NORMAL;
        zzu zzu2 = zzu.NORMAL;
        return zzu == zzu2 ? this.zzaj.intValue() - zzr.zzaj.intValue() : zzu2.ordinal() - zzu.ordinal();
    }
}
