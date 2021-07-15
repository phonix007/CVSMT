package com.google.android.gms.internal.ads;

import android.support.p000v4.provider.FontsContractCompat;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzls implements zzii {
    private final zzpx zzahz = new zzpx(32);
    private final zzot zzawq;
    private final int zzaym;
    private final zzlq zzayn = new zzlq();
    private final zzlr zzayo = new zzlr();
    private final AtomicInteger zzayp = new AtomicInteger();
    private zzlt zzayq = new zzlt(0, this.zzaym);
    private zzlt zzayr = this.zzayq;
    private zzfs zzays;
    private boolean zzayt;
    private zzfs zzayu;
    private long zzayv;
    private long zzayw;
    private int zzayx = this.zzaym;
    private zzlu zzayy;

    public zzls(zzot zzot) {
        this.zzawq = zzot;
        this.zzaym = zzot.zzgr();
    }

    public final void zzh(boolean z) {
        int andSet = this.zzayp.getAndSet(z ? 0 : 2);
        zzfi();
        this.zzayn.zzfj();
        if (andSet == 2) {
            this.zzays = null;
        }
    }

    public final int zzfk() {
        return this.zzayn.zzfk();
    }

    public final void zzar(int i) {
        this.zzayw = this.zzayn.zzaq(i);
        long j = this.zzayw;
        if (j == this.zzayq.zzayz) {
            zza(this.zzayq);
            this.zzayq = new zzlt(j, this.zzaym);
            this.zzayr = this.zzayq;
            return;
        }
        zzlt zzlt = this.zzayq;
        zzlt zzlt2 = this.zzayq.zzazc;
        while (true) {
            zzlt zzlt3 = zzlt2;
            zzlt zzlt4 = zzlt;
            zzlt = zzlt3;
            if (j > zzlt.zzayz) {
                zzlt2 = zzlt.zzazc;
            } else {
                zza(zzlt);
                this.zzayr = zzlt4;
                this.zzayr.zzazc = new zzlt(this.zzayr.zzaop, this.zzaym);
                this.zzayx = (int) (j - this.zzayr.zzayz);
                return;
            }
        }
    }

    public final void disable() {
        if (this.zzayp.getAndSet(2) == 0) {
            zzfi();
        }
    }

    public final boolean zzfm() {
        return this.zzayn.zzfm();
    }

    public final int zzfl() {
        return this.zzayn.zzfl();
    }

    public final zzfs zzfn() {
        return this.zzayn.zzfn();
    }

    public final long zzfc() {
        return this.zzayn.zzfc();
    }

    public final void zzfp() {
        long zzfo = this.zzayn.zzfo();
        if (zzfo != -1) {
            zzad(zzfo);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzayn.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzad(zzd);
        return true;
    }

    public final int zza(zzfu zzfu, zzho zzho, boolean z, boolean z2, long j) {
        int i;
        switch (this.zzayn.zza(zzfu, zzho, z, z2, this.zzays, this.zzayo)) {
            case -5:
                this.zzays = zzfu.zzaad;
                return -5;
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION:
                if (zzho.zzdp()) {
                    return -4;
                }
                if (zzho.zzago < j) {
                    zzho.zzq(Integer.MIN_VALUE);
                }
                if (zzho.zzdt()) {
                    zzlr zzlr = this.zzayo;
                    long j2 = zzlr.zzapb;
                    this.zzahz.reset(1);
                    zza(j2, this.zzahz.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzahz.data[0];
                    boolean z3 = (b & 128) != 0;
                    byte b2 = b & Byte.MAX_VALUE;
                    if (zzho.zzagn.f46iv == null) {
                        zzho.zzagn.f46iv = new byte[16];
                    }
                    zza(j3, zzho.zzagn.f46iv, (int) b2);
                    long j4 = j3 + ((long) b2);
                    if (z3) {
                        this.zzahz.reset(2);
                        zza(j4, this.zzahz.data, 2);
                        j4 += 2;
                        i = this.zzahz.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zzho.zzagn.numBytesOfClearData;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzho.zzagn.numBytesOfEncryptedData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i2 = i * 6;
                        this.zzahz.reset(i2);
                        zza(j4, this.zzahz.data, i2);
                        j4 += (long) i2;
                        this.zzahz.setPosition(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.zzahz.readUnsignedShort();
                            iArr4[i3] = this.zzahz.zzhg();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzlr.size - ((int) (j4 - zzlr.zzapb));
                    }
                    zzij zzij = zzlr.zzajw;
                    zzho.zzagn.set(i, iArr2, iArr4, zzij.zzahh, zzho.zzagn.f46iv, zzij.zzahg);
                    int i4 = (int) (j4 - zzlr.zzapb);
                    zzlr.zzapb += (long) i4;
                    zzlr.size -= i4;
                }
                zzho.zzs(this.zzayo.size);
                long j5 = this.zzayo.zzapb;
                ByteBuffer byteBuffer = zzho.zzdd;
                int i5 = this.zzayo.size;
                zzad(j5);
                while (i5 > 0) {
                    int i6 = (int) (j5 - this.zzayq.zzayz);
                    int min = Math.min(i5, this.zzaym - i6);
                    zzos zzos = this.zzayq.zzazb;
                    byteBuffer.put(zzos.data, zzos.zzbf(i6), min);
                    j5 += (long) min;
                    i5 -= min;
                    if (j5 == this.zzayq.zzaop) {
                        this.zzawq.zza(zzos);
                        this.zzayq = this.zzayq.zzfs();
                    }
                }
                zzad(this.zzayo.zzayl);
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzad(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzayq.zzayz);
            int min = Math.min(i - i2, this.zzaym - i3);
            zzos zzos = this.zzayq.zzazb;
            System.arraycopy(zzos.data, zzos.zzbf(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zzayq.zzaop) {
                this.zzawq.zza(zzos);
                this.zzayq = this.zzayq.zzfs();
            }
        }
    }

    private final void zzad(long j) {
        while (j >= this.zzayq.zzaop) {
            this.zzawq.zza(this.zzayq.zzazb);
            this.zzayq = this.zzayq.zzfs();
        }
    }

    public final void zza(zzlu zzlu) {
        this.zzayy = zzlu;
    }

    public final void zzae(long j) {
        if (this.zzayv != j) {
            this.zzayv = j;
            this.zzayt = true;
        }
    }

    public final void zzf(zzfs zzfs) {
        zzfs zzfs2;
        long j = this.zzayv;
        if (zzfs == null) {
            zzfs2 = null;
        } else {
            zzfs2 = (j == 0 || zzfs.zzzy == Long.MAX_VALUE) ? zzfs : zzfs.zzj(zzfs.zzzy + j);
        }
        boolean zzh = this.zzayn.zzh(zzfs2);
        this.zzayu = zzfs;
        this.zzayt = false;
        if (this.zzayy != null && zzh) {
            this.zzayy.zzg(zzfs2);
        }
    }

    public final int zza(zzia zzia, int i, boolean z) throws IOException, InterruptedException {
        if (!zzfq()) {
            int zzv = zzia.zzv(i);
            if (zzv != -1) {
                return zzv;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int zzas = zzas(i);
            zzos zzos = this.zzayr.zzazb;
            int read = zzia.read(zzos.data, zzos.zzbf(this.zzayx), zzas);
            if (read != -1) {
                this.zzayx += read;
                this.zzayw += (long) read;
                zzfr();
                return read;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            zzfr();
        }
    }

    public final void zza(zzpx zzpx, int i) {
        if (!zzfq()) {
            zzpx.zzbl(i);
            return;
        }
        while (i > 0) {
            int zzas = zzas(i);
            zzos zzos = this.zzayr.zzazb;
            zzpx.zze(zzos.data, zzos.zzbf(this.zzayx), zzas);
            this.zzayx += zzas;
            this.zzayw += (long) zzas;
            i -= zzas;
        }
        zzfr();
    }

    public final void zza(long j, int i, int i2, int i3, zzij zzij) {
        long j2 = j;
        if (this.zzayt) {
            zzf(this.zzayu);
        }
        if (!zzfq()) {
            this.zzayn.zzac(j2);
            return;
        }
        try {
            this.zzayn.zza(j2 + this.zzayv, i, (this.zzayw - ((long) i2)) - ((long) i3), i2, zzij);
        } finally {
            zzfr();
        }
    }

    private final boolean zzfq() {
        return this.zzayp.compareAndSet(0, 1);
    }

    private final void zzfr() {
        if (!this.zzayp.compareAndSet(1, 0)) {
            zzfi();
        }
    }

    private final void zzfi() {
        this.zzayn.zzfi();
        zza(this.zzayq);
        this.zzayq = new zzlt(0, this.zzaym);
        this.zzayr = this.zzayq;
        this.zzayw = 0;
        this.zzayx = this.zzaym;
        this.zzawq.zzo();
    }

    private final void zza(zzlt zzlt) {
        if (zzlt.zzaza) {
            zzos[] zzosArr = new zzos[((this.zzayr.zzaza ? 1 : 0) + (((int) (this.zzayr.zzayz - zzlt.zzayz)) / this.zzaym))];
            for (int i = 0; i < zzosArr.length; i++) {
                zzosArr[i] = zzlt.zzazb;
                zzlt = zzlt.zzfs();
            }
            this.zzawq.zza(zzosArr);
        }
    }

    private final int zzas(int i) {
        if (this.zzayx == this.zzaym) {
            this.zzayx = 0;
            if (this.zzayr.zzaza) {
                this.zzayr = this.zzayr.zzazc;
            }
            zzlt zzlt = this.zzayr;
            zzos zzgq = this.zzawq.zzgq();
            zzlt zzlt2 = new zzlt(this.zzayr.zzaop, this.zzaym);
            zzlt.zzazb = zzgq;
            zzlt.zzazc = zzlt2;
            zzlt.zzaza = true;
        }
        return Math.min(i, this.zzaym - this.zzayx);
    }
}
