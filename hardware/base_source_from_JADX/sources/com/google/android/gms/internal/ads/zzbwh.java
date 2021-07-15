package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzbwh {
    public static final zzbwh zzgda = new zzbwh(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzbwh zzgdb = new zzbwh(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzbwh zzgdc = new zzbwh(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzbwh zzgdd = new zzbwh(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    private final double f41a;

    /* renamed from: b */
    private final double f42b;

    /* renamed from: c */
    private final double f43c;

    /* renamed from: d */
    private final double f44d;

    /* renamed from: w */
    private final double f45w;
    private final double zzgcw;
    private final double zzgcx;
    private final double zzgcy;
    private final double zzgcz;

    private zzbwh(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zzgcw = d5;
        this.zzgcx = d6;
        this.f45w = d7;
        this.f41a = d;
        this.f42b = d2;
        this.f43c = d3;
        this.f44d = d4;
        this.zzgcy = d8;
        this.zzgcz = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbwh zzbwh = (zzbwh) obj;
        return Double.compare(zzbwh.f41a, this.f41a) == 0 && Double.compare(zzbwh.f42b, this.f42b) == 0 && Double.compare(zzbwh.f43c, this.f43c) == 0 && Double.compare(zzbwh.f44d, this.f44d) == 0 && Double.compare(zzbwh.zzgcy, this.zzgcy) == 0 && Double.compare(zzbwh.zzgcz, this.zzgcz) == 0 && Double.compare(zzbwh.zzgcw, this.zzgcw) == 0 && Double.compare(zzbwh.zzgcx, this.zzgcx) == 0 && Double.compare(zzbwh.f45w, this.f45w) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzgcw);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzgcx);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45w);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f41a);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f42b);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f43c);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44d);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzgcy);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzgcz);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(zzgda)) {
            return "Rotate 0°";
        }
        if (equals(zzgdb)) {
            return "Rotate 90°";
        }
        if (equals(zzgdc)) {
            return "Rotate 180°";
        }
        if (equals(zzgdd)) {
            return "Rotate 270°";
        }
        double d = this.zzgcw;
        double d2 = this.zzgcx;
        double d3 = this.f45w;
        double d4 = this.f41a;
        double d5 = this.f42b;
        double d6 = this.f43c;
        double d7 = this.f44d;
        double d8 = this.zzgcy;
        double d9 = this.zzgcz;
        double d10 = d7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d10);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    public static zzbwh zzq(ByteBuffer byteBuffer) {
        double zzd = zzbb.zzd(byteBuffer);
        double zzd2 = zzbb.zzd(byteBuffer);
        double zze = zzbb.zze(byteBuffer);
        return new zzbwh(zzd, zzd2, zzbb.zzd(byteBuffer), zzbb.zzd(byteBuffer), zze, zzbb.zze(byteBuffer), zzbb.zze(byteBuffer), zzbb.zzd(byteBuffer), zzbb.zzd(byteBuffer));
    }
}
