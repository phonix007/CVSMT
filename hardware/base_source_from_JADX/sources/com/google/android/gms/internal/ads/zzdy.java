package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

public final class zzdy extends zzeu {
    public zzdy(zzdl zzdl, String str, String str2, zzbl zzbl, int i, int i2) {
        super(zzdl, str, str2, zzbl, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void zzas() throws IllegalAccessException, InvocationTargetException {
        this.zzun.zzfg = 2;
        try {
            boolean booleanValue = ((Boolean) this.zzuw.invoke((Object) null, new Object[]{this.zzqo.getContext()})).booleanValue();
            this.zzun.zzfg = Integer.valueOf(booleanValue ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
