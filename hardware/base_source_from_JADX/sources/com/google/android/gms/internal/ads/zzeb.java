package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzeb extends zzeu {
    public zzeb(zzdl zzdl, String str, String str2, zzbl zzbl, int i, int i2) {
        super(zzdl, str, str2, zzbl, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zzas() throws IllegalAccessException, InvocationTargetException {
        this.zzun.zzdz = -1L;
        this.zzun.zzea = -1L;
        int[] iArr = (int[]) this.zzuw.invoke((Object) null, new Object[]{this.zzqo.getContext()});
        synchronized (this.zzun) {
            this.zzun.zzdz = Long.valueOf((long) iArr[0]);
            this.zzun.zzea = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzun.zzfr = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
