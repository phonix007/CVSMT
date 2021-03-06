package com.google.android.gms.internal.measurement;

final class zzwv implements zzxd {
    private zzxd[] zzcbl;

    zzwv(zzxd... zzxdArr) {
        this.zzcbl = zzxdArr;
    }

    public final boolean zze(Class<?> cls) {
        for (zzxd zze : this.zzcbl) {
            if (zze.zze(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzxc zzf(Class<?> cls) {
        for (zzxd zzxd : this.zzcbl) {
            if (zzxd.zze(cls)) {
                return zzxd.zzf(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
