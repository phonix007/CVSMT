package com.google.android.gms.internal.ads;

final class zzjd implements zzja {
    private final zzpx zzaos;
    private final int zzapk = this.zzaos.zzhg();
    private final int zzapl = (this.zzaos.zzhg() & 255);
    private int zzapm;
    private int zzapn;

    public zzjd(zzix zzix) {
        this.zzaos = zzix.zzaos;
        this.zzaos.setPosition(12);
    }

    public final boolean zzeh() {
        return false;
    }

    public final int zzef() {
        return this.zzapk;
    }

    public final int zzeg() {
        if (this.zzapl == 8) {
            return this.zzaos.readUnsignedByte();
        }
        if (this.zzapl == 16) {
            return this.zzaos.readUnsignedShort();
        }
        int i = this.zzapm;
        this.zzapm = i + 1;
        if (i % 2 != 0) {
            return this.zzapn & 15;
        }
        this.zzapn = this.zzaos.readUnsignedByte();
        return (this.zzapn & 240) >> 4;
    }
}
