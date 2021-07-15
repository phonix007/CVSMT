package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzem extends zzeu {
    private final StackTraceElement[] zzus;

    public zzem(zzdl zzdl, String str, String str2, zzbl zzbl, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzdl, str, str2, zzbl, i, 45);
        this.zzus = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zzas() throws IllegalAccessException, InvocationTargetException {
        if (this.zzus != null) {
            zzdj zzdj = new zzdj((String) this.zzuw.invoke((Object) null, new Object[]{this.zzus}));
            synchronized (this.zzun) {
                this.zzun.zzfe = zzdj.zzsk;
                if (zzdj.zzsl.booleanValue()) {
                    this.zzun.zzfm = Integer.valueOf(zzdj.zzsm.booleanValue() ^ true ? 1 : 0);
                } else {
                    this.zzun.zzfm = 2;
                }
            }
        }
    }
}
