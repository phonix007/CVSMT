package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;
import java.io.IOException;
import java.util.Arrays;

public final class zzbtv {
    private static final zzbtv zzftx = new zzbtv(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzfla;
    private int zzfpv;
    private Object[] zzfsj;
    private int[] zzfty;

    public static zzbtv zzaoz() {
        return zzftx;
    }

    static zzbtv zzapa() {
        return new zzbtv();
    }

    static zzbtv zza(zzbtv zzbtv, zzbtv zzbtv2) {
        int i = zzbtv.count + zzbtv2.count;
        int[] copyOf = Arrays.copyOf(zzbtv.zzfty, i);
        System.arraycopy(zzbtv2.zzfty, 0, copyOf, zzbtv.count, zzbtv2.count);
        Object[] copyOf2 = Arrays.copyOf(zzbtv.zzfsj, i);
        System.arraycopy(zzbtv2.zzfsj, 0, copyOf2, zzbtv.count, zzbtv2.count);
        return new zzbtv(i, copyOf, copyOf2, true);
    }

    private zzbtv() {
        this(0, new int[8], new Object[8], true);
    }

    private zzbtv(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzfpv = -1;
        this.count = i;
        this.zzfty = iArr;
        this.zzfsj = objArr;
        this.zzfla = z;
    }

    public final void zzakj() {
        this.zzfla = false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbup zzbup) throws IOException {
        if (zzbup.zzaly() == zzbrd.zze.zzfqn) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzbup.zzb(this.zzfty[i] >>> 3, this.zzfsj[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzbup.zzb(this.zzfty[i2] >>> 3, this.zzfsj[i2]);
        }
    }

    public final void zzb(zzbup zzbup) throws IOException {
        if (this.count != 0) {
            if (zzbup.zzaly() == zzbrd.zze.zzfqm) {
                for (int i = 0; i < this.count; i++) {
                    zzb(this.zzfty[i], this.zzfsj[i], zzbup);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzb(this.zzfty[i2], this.zzfsj[i2], zzbup);
            }
        }
    }

    private static void zzb(int i, Object obj, zzbup zzbup) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    zzbup.zzr(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    zzbup.zzl(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    zzbup.zza(i2, (zzbpu) obj);
                    return;
                case 3:
                    if (zzbup.zzaly() == zzbrd.zze.zzfqm) {
                        zzbup.zzfm(i2);
                        ((zzbtv) obj).zzb(zzbup);
                        zzbup.zzfn(i2);
                        return;
                    }
                    zzbup.zzfn(i2);
                    ((zzbtv) obj).zzb(zzbup);
                    zzbup.zzfm(i2);
                    return;
                default:
                    throw new RuntimeException(zzbrl.zzanh());
            }
        } else {
            zzbup.zzy(i2, ((Integer) obj).intValue());
        }
    }

    public final int zzapb() {
        int i = this.zzfpv;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzbqk.zzd(this.zzfty[i3] >>> 3, (zzbpu) this.zzfsj[i3]);
        }
        this.zzfpv = i2;
        return i2;
    }

    public final int zzamj() {
        int i;
        int i2 = this.zzfpv;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.zzfty[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = zzbqk.zzn(i6, ((Long) this.zzfsj[i4]).longValue());
                        break;
                    case 1:
                        i = zzbqk.zzp(i6, ((Long) this.zzfsj[i4]).longValue());
                        break;
                    case 2:
                        i = zzbqk.zzc(i6, (zzbpu) this.zzfsj[i4]);
                        break;
                    case 3:
                        i = (zzbqk.zzfd(i6) << 1) + ((zzbtv) this.zzfsj[i4]).zzamj();
                        break;
                    default:
                        throw new IllegalStateException(zzbrl.zzanh());
                }
            } else {
                i = zzbqk.zzac(i6, ((Integer) this.zzfsj[i4]).intValue());
            }
            i3 += i;
        }
        this.zzfpv = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbtv)) {
            return false;
        }
        zzbtv zzbtv = (zzbtv) obj;
        if (this.count == zzbtv.count) {
            int[] iArr = this.zzfty;
            int[] iArr2 = zzbtv.zzfty;
            int i = this.count;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zzfsj;
                Object[] objArr2 = zzbtv.zzfsj;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = (this.count + 527) * 31;
        int[] iArr = this.zzfty;
        int i2 = this.count;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i + i4) * 31;
        Object[] objArr = this.zzfsj;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzbso.zza(sb, i, String.valueOf(this.zzfty[i2] >>> 3), this.zzfsj[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i, Object obj) {
        if (this.zzfla) {
            if (this.count == this.zzfty.length) {
                int i2 = this.count + (this.count < 4 ? 8 : this.count >> 1);
                this.zzfty = Arrays.copyOf(this.zzfty, i2);
                this.zzfsj = Arrays.copyOf(this.zzfsj, i2);
            }
            this.zzfty[this.count] = i;
            this.zzfsj[this.count] = obj;
            this.count++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
