package com.google.android.gms.internal.measurement;

public class zzwl {
    private static final zzvk zzbuo = zzvk.zzvy();
    private zzun zzcay;
    private volatile zzxe zzcaz;
    private volatile zzun zzcba;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwl)) {
            return false;
        }
        zzwl zzwl = (zzwl) obj;
        zzxe zzxe = this.zzcaz;
        zzxe zzxe2 = zzwl.zzcaz;
        if (zzxe == null && zzxe2 == null) {
            return zzud().equals(zzwl.zzud());
        }
        if (zzxe != null && zzxe2 != null) {
            return zzxe.equals(zzxe2);
        }
        if (zzxe != null) {
            return zzxe.equals(zzwl.zzh(zzxe.zzwq()));
        }
        return zzh(zzxe2.zzwq()).equals(zzxe2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzxe zzh(com.google.android.gms.internal.measurement.zzxe r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzxe r0 = r1.zzcaz
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzxe r0 = r1.zzcaz     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzcaz = r2     // Catch:{ zzwe -> 0x0012 }
            com.google.android.gms.internal.measurement.zzun r0 = com.google.android.gms.internal.measurement.zzun.zzbuu     // Catch:{ zzwe -> 0x0012 }
            r1.zzcba = r0     // Catch:{ zzwe -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzcaz = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzun r2 = com.google.android.gms.internal.measurement.zzun.zzbuu     // Catch:{ all -> 0x001a }
            r1.zzcba = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.zzxe r2 = r1.zzcaz
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzwl.zzh(com.google.android.gms.internal.measurement.zzxe):com.google.android.gms.internal.measurement.zzxe");
    }

    public final zzxe zzi(zzxe zzxe) {
        zzxe zzxe2 = this.zzcaz;
        this.zzcay = null;
        this.zzcba = null;
        this.zzcaz = zzxe;
        return zzxe2;
    }

    public final int zzwe() {
        if (this.zzcba != null) {
            return this.zzcba.size();
        }
        if (this.zzcaz != null) {
            return this.zzcaz.zzwe();
        }
        return 0;
    }

    public final zzun zzud() {
        if (this.zzcba != null) {
            return this.zzcba;
        }
        synchronized (this) {
            if (this.zzcba != null) {
                zzun zzun = this.zzcba;
                return zzun;
            }
            if (this.zzcaz == null) {
                this.zzcba = zzun.zzbuu;
            } else {
                this.zzcba = this.zzcaz.zzud();
            }
            zzun zzun2 = this.zzcba;
            return zzun2;
        }
    }
}
