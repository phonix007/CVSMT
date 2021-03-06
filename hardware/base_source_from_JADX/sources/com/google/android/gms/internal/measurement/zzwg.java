package com.google.android.gms.internal.measurement;

import com.apps.saiinfo.computerhardware.BuildConfig;

public enum zzwg {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(zzun.class, zzun.class, zzun.zzbuu),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzcas;
    private final Class<?> zzcat;
    private final Object zzcau;

    private zzwg(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzcas = cls;
        this.zzcat = cls2;
        this.zzcau = obj;
    }

    public final Class<?> zzxf() {
        return this.zzcat;
    }
}
