package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzfs implements Parcelable {
    public static final Parcelable.Creator<zzfs> CREATOR = new zzft();
    public final int height;
    public final int width;
    public final String zzaaa;
    private final int zzaab;
    private int zzaac;
    public final String zzze;
    public final int zzzf;
    public final String zzzg;
    private final zzki zzzh;
    public final String zzzi;
    public final String zzzj;
    public final int zzzk;
    public final List<byte[]> zzzl;
    public final zzhp zzzm;
    public final float zzzn;
    public final int zzzo;
    public final float zzzp;
    private final int zzzq;
    private final byte[] zzzr;
    private final zzqi zzzs;
    public final int zzzt;
    public final int zzzu;
    public final int zzzv;
    private final int zzzw;
    private final int zzzx;
    public final long zzzy;
    public final int zzzz;

    public static zzfs zza(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new zzfs(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i4, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    public final int describeContents() {
        return 0;
    }

    public static zzfs zza(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzqi zzqi, zzhp zzhp) {
        return new zzfs(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzqi, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzhp, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzhp zzhp, int i5, String str4) {
        return zza(str, str2, (String) null, -1, -1, i3, i4, -1, (List<byte[]>) null, zzhp, 0, str4);
    }

    public static zzfs zza(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzhp zzhp, int i6, String str4) {
        return new zzfs(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzhp, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, int i, int i2, String str4, zzhp zzhp) {
        return zza(str, str2, (String) null, -1, i2, str4, -1, zzhp, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    public static zzfs zza(String str, String str2, String str3, int i, int i2, String str4, int i3, zzhp zzhp, long j, List<byte[]> list) {
        return new zzfs(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzhp, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzhp zzhp) {
        return new zzfs(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzhp, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return new zzfs(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    public static zzfs zza(String str, String str2, long j) {
        return new zzfs((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zzhp) null, (zzki) null);
    }

    public static zzfs zza(String str, String str2, String str3, int i, zzhp zzhp) {
        return new zzfs(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzqi) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, zzhp, (zzki) null);
    }

    private zzfs(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzqi zzqi, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzhp zzhp, zzki zzki) {
        this.zzze = str;
        this.zzzi = str2;
        this.zzzj = str3;
        this.zzzg = str4;
        this.zzzf = i;
        this.zzzk = i2;
        this.width = i3;
        this.height = i4;
        this.zzzn = f;
        this.zzzo = i5;
        this.zzzp = f2;
        this.zzzr = bArr;
        this.zzzq = i6;
        this.zzzs = zzqi;
        this.zzzt = i7;
        this.zzzu = i8;
        this.zzzv = i9;
        this.zzzw = i10;
        this.zzzx = i11;
        this.zzzz = i12;
        this.zzaaa = str5;
        this.zzaab = i13;
        this.zzzy = j;
        this.zzzl = list == null ? Collections.emptyList() : list;
        this.zzzm = zzhp;
        this.zzzh = zzki;
    }

    zzfs(Parcel parcel) {
        this.zzze = parcel.readString();
        this.zzzi = parcel.readString();
        this.zzzj = parcel.readString();
        this.zzzg = parcel.readString();
        this.zzzf = parcel.readInt();
        this.zzzk = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.zzzn = parcel.readFloat();
        this.zzzo = parcel.readInt();
        this.zzzp = parcel.readFloat();
        this.zzzr = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzzq = parcel.readInt();
        this.zzzs = (zzqi) parcel.readParcelable(zzqi.class.getClassLoader());
        this.zzzt = parcel.readInt();
        this.zzzu = parcel.readInt();
        this.zzzv = parcel.readInt();
        this.zzzw = parcel.readInt();
        this.zzzx = parcel.readInt();
        this.zzzz = parcel.readInt();
        this.zzaaa = parcel.readString();
        this.zzaab = parcel.readInt();
        this.zzzy = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzzl = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzzl.add(parcel.createByteArray());
        }
        this.zzzm = (zzhp) parcel.readParcelable(zzhp.class.getClassLoader());
        this.zzzh = (zzki) parcel.readParcelable(zzki.class.getClassLoader());
    }

    public final zzfs zzj(int i) {
        String str = this.zzze;
        return new zzfs(str, this.zzzi, this.zzzj, this.zzzg, this.zzzf, i, this.width, this.height, this.zzzn, this.zzzo, this.zzzp, this.zzzr, this.zzzq, this.zzzs, this.zzzt, this.zzzu, this.zzzv, this.zzzw, this.zzzx, this.zzzz, this.zzaaa, this.zzaab, this.zzzy, this.zzzl, this.zzzm, this.zzzh);
    }

    public final zzfs zzj(long j) {
        return new zzfs(this.zzze, this.zzzi, this.zzzj, this.zzzg, this.zzzf, this.zzzk, this.width, this.height, this.zzzn, this.zzzo, this.zzzp, this.zzzr, this.zzzq, this.zzzs, this.zzzt, this.zzzu, this.zzzv, this.zzzw, this.zzzx, this.zzzz, this.zzaaa, this.zzaab, j, this.zzzl, this.zzzm, this.zzzh);
    }

    public final zzfs zza(zzfs zzfs) {
        zzhp zzhp;
        zzfs zzfs2 = zzfs;
        if (this == zzfs2) {
            return this;
        }
        String str = zzfs2.zzze;
        String str2 = this.zzzg == null ? zzfs2.zzzg : this.zzzg;
        int i = this.zzzf == -1 ? zzfs2.zzzf : this.zzzf;
        float f = this.zzzn == -1.0f ? zzfs2.zzzn : this.zzzn;
        int i2 = this.zzzz | zzfs2.zzzz;
        String str3 = this.zzaaa == null ? zzfs2.zzaaa : this.zzaaa;
        if (zzfs2.zzzm != null) {
            zzhp = zzfs2.zzzm;
        } else {
            zzhp = this.zzzm;
        }
        return new zzfs(str, this.zzzi, this.zzzj, str2, i, this.zzzk, this.width, this.height, f, this.zzzo, this.zzzp, this.zzzr, this.zzzq, this.zzzs, this.zzzt, this.zzzu, this.zzzv, this.zzzw, this.zzzx, i2, str3, this.zzaab, this.zzzy, this.zzzl, zzhp, this.zzzh);
    }

    public final zzfs zza(int i, int i2) {
        String str = this.zzze;
        return new zzfs(str, this.zzzi, this.zzzj, this.zzzg, this.zzzf, this.zzzk, this.width, this.height, this.zzzn, this.zzzo, this.zzzp, this.zzzr, this.zzzq, this.zzzs, this.zzzt, this.zzzu, this.zzzv, i, i2, this.zzzz, this.zzaaa, this.zzaab, this.zzzy, this.zzzl, this.zzzm, this.zzzh);
    }

    public final zzfs zza(zzhp zzhp) {
        String str = this.zzze;
        return new zzfs(str, this.zzzi, this.zzzj, this.zzzg, this.zzzf, this.zzzk, this.width, this.height, this.zzzn, this.zzzo, this.zzzp, this.zzzr, this.zzzq, this.zzzs, this.zzzt, this.zzzu, this.zzzv, this.zzzw, this.zzzx, this.zzzz, this.zzaaa, this.zzaab, this.zzzy, this.zzzl, zzhp, this.zzzh);
    }

    public final zzfs zza(zzki zzki) {
        String str = this.zzze;
        return new zzfs(str, this.zzzi, this.zzzj, this.zzzg, this.zzzf, this.zzzk, this.width, this.height, this.zzzn, this.zzzo, this.zzzp, this.zzzr, this.zzzq, this.zzzs, this.zzzt, this.zzzu, this.zzzv, this.zzzw, this.zzzx, this.zzzz, this.zzaaa, this.zzaab, this.zzzy, this.zzzl, this.zzzm, zzki);
    }

    public final int zzce() {
        if (this.width == -1 || this.height == -1) {
            return -1;
        }
        return this.width * this.height;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzcf() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzzj);
        String str = this.zzaaa;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zza(mediaFormat, "max-input-size", this.zzzk);
        zza(mediaFormat, "width", this.width);
        zza(mediaFormat, "height", this.height);
        float f = this.zzzn;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zza(mediaFormat, "rotation-degrees", this.zzzo);
        zza(mediaFormat, "channel-count", this.zzzt);
        zza(mediaFormat, "sample-rate", this.zzzu);
        zza(mediaFormat, "encoder-delay", this.zzzw);
        zza(mediaFormat, "encoder-padding", this.zzzx);
        for (int i = 0; i < this.zzzl.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.zzzl.get(i)));
        }
        zzqi zzqi = this.zzzs;
        if (zzqi != null) {
            zza(mediaFormat, "color-transfer", zzqi.zzakd);
            zza(mediaFormat, "color-standard", zzqi.zzakc);
            zza(mediaFormat, "color-range", zzqi.zzake);
            byte[] bArr = zzqi.zzbii;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.zzze;
        String str2 = this.zzzi;
        String str3 = this.zzzj;
        int i = this.zzzf;
        String str4 = this.zzaaa;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.zzzn;
        int i4 = this.zzzt;
        int i5 = this.zzzu;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzaac == 0) {
            int i = 0;
            int hashCode = ((((((((((((((((((((((((this.zzze == null ? 0 : this.zzze.hashCode()) + 527) * 31) + (this.zzzi == null ? 0 : this.zzzi.hashCode())) * 31) + (this.zzzj == null ? 0 : this.zzzj.hashCode())) * 31) + (this.zzzg == null ? 0 : this.zzzg.hashCode())) * 31) + this.zzzf) * 31) + this.width) * 31) + this.height) * 31) + this.zzzt) * 31) + this.zzzu) * 31) + (this.zzaaa == null ? 0 : this.zzaaa.hashCode())) * 31) + this.zzaab) * 31) + (this.zzzm == null ? 0 : this.zzzm.hashCode())) * 31;
            if (this.zzzh != null) {
                i = this.zzzh.hashCode();
            }
            this.zzaac = hashCode + i;
        }
        return this.zzaac;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzfs zzfs = (zzfs) obj;
        if (this.zzzf != zzfs.zzzf || this.zzzk != zzfs.zzzk || this.width != zzfs.width || this.height != zzfs.height || this.zzzn != zzfs.zzzn || this.zzzo != zzfs.zzzo || this.zzzp != zzfs.zzzp || this.zzzq != zzfs.zzzq || this.zzzt != zzfs.zzzt || this.zzzu != zzfs.zzzu || this.zzzv != zzfs.zzzv || this.zzzw != zzfs.zzzw || this.zzzx != zzfs.zzzx || this.zzzy != zzfs.zzzy || this.zzzz != zzfs.zzzz || !zzqe.zza((Object) this.zzze, (Object) zzfs.zzze) || !zzqe.zza((Object) this.zzaaa, (Object) zzfs.zzaaa) || this.zzaab != zzfs.zzaab || !zzqe.zza((Object) this.zzzi, (Object) zzfs.zzzi) || !zzqe.zza((Object) this.zzzj, (Object) zzfs.zzzj) || !zzqe.zza((Object) this.zzzg, (Object) zzfs.zzzg) || !zzqe.zza((Object) this.zzzm, (Object) zzfs.zzzm) || !zzqe.zza((Object) this.zzzh, (Object) zzfs.zzzh) || !zzqe.zza((Object) this.zzzs, (Object) zzfs.zzzs) || !Arrays.equals(this.zzzr, zzfs.zzzr) || this.zzzl.size() != zzfs.zzzl.size()) {
            return false;
        }
        for (int i = 0; i < this.zzzl.size(); i++) {
            if (!Arrays.equals(this.zzzl.get(i), zzfs.zzzl.get(i))) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(16)
    private static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzze);
        parcel.writeString(this.zzzi);
        parcel.writeString(this.zzzj);
        parcel.writeString(this.zzzg);
        parcel.writeInt(this.zzzf);
        parcel.writeInt(this.zzzk);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.zzzn);
        parcel.writeInt(this.zzzo);
        parcel.writeFloat(this.zzzp);
        parcel.writeInt(this.zzzr != null ? 1 : 0);
        if (this.zzzr != null) {
            parcel.writeByteArray(this.zzzr);
        }
        parcel.writeInt(this.zzzq);
        parcel.writeParcelable(this.zzzs, i);
        parcel.writeInt(this.zzzt);
        parcel.writeInt(this.zzzu);
        parcel.writeInt(this.zzzv);
        parcel.writeInt(this.zzzw);
        parcel.writeInt(this.zzzx);
        parcel.writeInt(this.zzzz);
        parcel.writeString(this.zzaaa);
        parcel.writeInt(this.zzaab);
        parcel.writeLong(this.zzzy);
        int size = this.zzzl.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.zzzl.get(i2));
        }
        parcel.writeParcelable(this.zzzm, 0);
        parcel.writeParcelable(this.zzzh, 0);
    }
}
