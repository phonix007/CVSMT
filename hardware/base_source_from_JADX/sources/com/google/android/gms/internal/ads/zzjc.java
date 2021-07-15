package com.google.android.gms.internal.ads;

final class zzjc implements zzja {
    private final zzpx zzaos;
    private final int zzapj = this.zzaos.zzhg();
    private final int zzapk = this.zzaos.zzhg();

    public zzjc(zzix zzix) {
        this.zzaos = zzix.zzaos;
        this.zzaos.setPosition(12);
    }

    public final int zzef() {
        return this.zzapk;
    }

    public final int zzeg() {
        return this.zzapj == 0 ? this.zzaos.zzhg() : this.zzapj;
    }

    public final boolean zzeh() {
        return this.zzapj != 0;
    }
}
