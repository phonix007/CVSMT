package com.google.android.gms.internal.ads;

import com.apps.saiinfo.computerhardware.BuildConfig;

public enum zzbuo {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(zzbpu.zzfli),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzfrh;

    private zzbuo(Object obj) {
        this.zzfrh = obj;
    }
}
