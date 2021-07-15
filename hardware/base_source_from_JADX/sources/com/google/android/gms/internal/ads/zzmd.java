package com.google.android.gms.internal.ads;

import android.util.Log;

final class zzmd implements zzmh {
    private final int[] zzazm;
    private final zzls[] zzazn;

    public zzmd(int[] iArr, zzls[] zzlsArr) {
        this.zzazm = iArr;
        this.zzazn = zzlsArr;
    }

    public final zzii zzb(int i, int i2) {
        for (int i3 = 0; i3 < this.zzazm.length; i3++) {
            if (i2 == this.zzazm[i3]) {
                return this.zzazn[i3];
            }
        }
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unmatched track of type: ");
        sb.append(i2);
        Log.e("BaseMediaChunkOutput", sb.toString());
        return new zzhy();
    }

    public final int[] zzfu() {
        int[] iArr = new int[this.zzazn.length];
        for (int i = 0; i < this.zzazn.length; i++) {
            if (this.zzazn[i] != null) {
                iArr[i] = this.zzazn[i].zzfk();
            }
        }
        return iArr;
    }

    public final void zzae(long j) {
        for (zzls zzls : this.zzazn) {
            if (zzls != null) {
                zzls.zzae(j);
            }
        }
    }
}
