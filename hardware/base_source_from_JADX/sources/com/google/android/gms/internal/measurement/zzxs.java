package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvx;

final class zzxs implements zzxc {
    private final int flags;
    private final String info;
    private final Object[] zzcbv;
    private final zzxe zzcby;

    zzxs(zzxe zzxe, String str, Object[] objArr) {
        this.zzcby = zzxe;
        this.info = str;
        this.zzcbv = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.flags = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzyc() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzyd() {
        return this.zzcbv;
    }

    public final zzxe zzxv() {
        return this.zzcby;
    }

    public final int zzxt() {
        return (this.flags & 1) == 1 ? zzvx.zze.zzbzw : zzvx.zze.zzbzx;
    }

    public final boolean zzxu() {
        return (this.flags & 2) == 2;
    }
}
