package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;

@zzark
public final class zzbes implements zzfh, zzll, zzpn<zzov>, zzqu {
    @VisibleForTesting
    private static int zzevp;
    @VisibleForTesting
    private static int zzevq;
    private int bytesTransferred;
    private final zzbdy zzeuo;
    private final zzber zzevr = new zzber();
    private final zzfz zzevs = new zzqo(this.zzsp, zzka.zzavh, 0, zzayh.zzelc, this, -1);
    private final zzfz zzevt = new zzhd(zzka.zzavh);
    private final zzoj zzevu = new zzog();
    private zzfg zzevv;
    private ByteBuffer zzevw;
    private boolean zzevx;
    private zzbez zzevy;
    private final Context zzsp;

    public zzbes(Context context, zzbdy zzbdy) {
        this.zzsp = context;
        this.zzeuo = zzbdy;
        if (zzaxz.zzza()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzaxz.m30v(sb.toString());
        }
        zzevp++;
        this.zzevv = zzfk.zza(new zzfz[]{this.zzevt, this.zzevs}, this.zzevu, this.zzevr);
        this.zzevv.zza((zzfh) this);
    }

    public final void zza(Surface surface) {
    }

    public final void zza(zzfy zzfy) {
    }

    public final void zza(zzgc zzgc, Object obj) {
    }

    public final void zza(zzma zzma, zzoo zzoo) {
    }

    public final void zzbs() {
    }

    public final void zzd(String str, long j, long j2) {
    }

    public final void zzd(boolean z) {
    }

    public final void zze(zzhn zzhn) {
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj) {
    }

    public final void zzf(zzhn zzhn) {
    }

    public final void zzh(int i, long j) {
    }

    public final void zzl(zzfs zzfs) {
    }

    public final zzfg zzacw() {
        return this.zzevv;
    }

    public static int zzacx() {
        return zzevp;
    }

    public static int zzacy() {
        return zzevq;
    }

    public final void zza(zzbez zzbez) {
        this.zzevy = zzbez;
    }

    public final zzber zzacz() {
        return this.zzevr;
    }

    public final void zza(Uri uri, String str) {
        zza(uri, str, ByteBuffer.allocate(0), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.google.android.gms.internal.ads.zzmu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.zzlk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.internal.ads.zzmu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.gms.internal.ads.zzmu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.net.Uri r11, java.lang.String r12, java.nio.ByteBuffer r13, boolean r14) {
        /*
            r10 = this;
            r10.zzevw = r13
            r10.zzevx = r14
            com.google.android.gms.internal.ads.zzbdy r1 = r10.zzeuo
            boolean r1 = r1.zzett
            if (r1 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzow r4 = r10.zzev(r12)
            com.google.android.gms.internal.ads.zzmu r0 = new com.google.android.gms.internal.ads.zzmu
            com.google.android.gms.internal.ads.zzng r5 = new com.google.android.gms.internal.ads.zzng
            r5.<init>(r4)
            android.os.Handler r6 = com.google.android.gms.internal.ads.zzayh.zzelc
            r7 = 0
            r2 = r0
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0034
        L_0x001e:
            com.google.android.gms.internal.ads.zzlk r9 = new com.google.android.gms.internal.ads.zzlk
            com.google.android.gms.internal.ads.zzow r2 = r10.zzev(r12)
            com.google.android.gms.internal.ads.zzic r3 = com.google.android.gms.internal.ads.zzbex.zzewd
            r4 = -1
            android.os.Handler r5 = com.google.android.gms.internal.ads.zzayh.zzelc
            r7 = 0
            com.google.android.gms.internal.ads.zzbdy r0 = r10.zzeuo
            int r8 = r0.zzetq
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0034:
            com.google.android.gms.internal.ads.zzfg r1 = r10.zzevv
            r1.zza((com.google.android.gms.internal.ads.zzlo) r0)
            int r0 = zzevq
            int r0 = r0 + 1
            zzevq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbes.zza(android.net.Uri, java.lang.String, java.nio.ByteBuffer, boolean):void");
    }

    public final void release() {
        if (this.zzevv != null) {
            this.zzevv.zzb((zzfh) this);
            this.zzevv.release();
            this.zzevv = null;
            zzevq--;
        }
    }

    public final long getBytesTransferred() {
        return (long) this.bytesTransferred;
    }

    public final void zzb(IOException iOException) {
        if (this.zzevy != null) {
            this.zzevy.zza("onLoadError", iOException);
        }
    }

    public final void zza(int i, int i2, int i3, float f) {
        if (this.zzevy != null) {
            this.zzevy.zzp(i, i2);
        }
    }

    public final void zza(boolean z, int i) {
        if (this.zzevy != null) {
            this.zzevy.zzdd(i);
        }
    }

    public final void zza(zzff zzff) {
        if (this.zzevy != null) {
            this.zzevy.zza("onPlayerError", zzff);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        zzfj zzfj = new zzfj(this.zzevs, 1, surface);
        if (z) {
            this.zzevv.zzb(zzfj);
            return;
        }
        this.zzevv.zza(zzfj);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        zzfj zzfj = new zzfj(this.zzevt, 2, Float.valueOf(f));
        if (z) {
            this.zzevv.zzb(zzfj);
            return;
        }
        this.zzevv.zza(zzfj);
    }

    /* access modifiers changed from: package-private */
    public final void zzau(boolean z) {
        for (int i = 0; i < this.zzevv.zzbq(); i++) {
            this.zzevu.zzf(i, !z);
        }
    }

    @VisibleForTesting
    private final zzow zzev(String str) {
        if (!this.zzevx || this.zzevw.limit() <= 0) {
            zzbeu zzbeu = new zzbeu(this, str);
            zzow zzbev = this.zzeuo.zzets ? new zzbev(this, zzbeu) : zzbeu;
            if (this.zzevw.limit() <= 0) {
                return zzbev;
            }
            byte[] bArr = new byte[this.zzevw.limit()];
            this.zzevw.get(bArr);
            return new zzbew(zzbev, bArr);
        }
        byte[] bArr2 = new byte[this.zzevw.limit()];
        this.zzevw.get(bArr2);
        return new zzbet(bArr2);
    }

    public final void finalize() throws Throwable {
        zzevp--;
        if (zzaxz.zzza()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzaxz.m30v(sb.toString());
        }
    }

    public final /* synthetic */ void zzc(Object obj, int i) {
        this.bytesTransferred += i;
    }

    public final /* synthetic */ void zza(Object obj, zzoz zzoz) {
        this.bytesTransferred = 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzov zza(zzow zzow) {
        return new zzbep(this.zzsp, zzow.zzgs(), this, new zzbey(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        if (this.zzevy != null) {
            this.zzevy.zzb(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzov zzew(String str) {
        return new zzpb(str, (zzpz<String>) null, this.zzeuo.zzets ? null : this, this.zzeuo.zzetn, this.zzeuo.zzetp, true, (zzpe) null);
    }
}
