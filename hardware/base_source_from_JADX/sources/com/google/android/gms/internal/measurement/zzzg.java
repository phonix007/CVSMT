package com.google.android.gms.internal.measurement;

import com.apps.saiinfo.computerhardware.BuildConfig;

public enum zzzg {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(zzun.zzbuu),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzcau;

    private zzzg(Object obj) {
        this.zzcau = obj;
    }
}
