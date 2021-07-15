package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzhp implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzhp> CREATOR = new zzhq();
    private int zzaac;
    private final zza[] zzagq;
    public final int zzagr;

    public zzhp(List<zza> list) {
        this(false, (zza[]) list.toArray(new zza[list.size()]));
    }

    public final int describeContents() {
        return 0;
    }

    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new zzhr();
        private final byte[] data;
        private final String mimeType;
        /* access modifiers changed from: private */
        public final UUID uuid;
        private int zzaac;
        public final boolean zzags;

        public zza(UUID uuid2, String str, byte[] bArr) {
            this(uuid2, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        public zza(UUID uuid2, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) zzpo.checkNotNull(uuid2);
            this.mimeType = (String) zzpo.checkNotNull(str);
            this.data = (byte[]) zzpo.checkNotNull(bArr);
            this.zzags = z;
        }

        zza(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.zzags = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.mimeType.equals(zza.mimeType) && zzqe.zza((Object) this.uuid, (Object) zza.uuid) && Arrays.equals(this.data, zza.data);
        }

        public final int hashCode() {
            if (this.zzaac == 0) {
                this.zzaac = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.zzaac;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte(this.zzags ? (byte) 1 : 0);
        }
    }

    public zzhp(zza... zzaArr) {
        this(true, zzaArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.gms.internal.ads.zzhp$zza[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzhp(boolean r3, com.google.android.gms.internal.ads.zzhp.zza... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.zzhp$zza[] r4 = (com.google.android.gms.internal.ads.zzhp.zza[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0055
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.uuid
            r1 = r4[r3]
            java.util.UUID r1 = r1.uuid
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.uuid
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r4 = "Duplicate data for uuid: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0055:
            r2.zzagq = r4
            int r3 = r4.length
            r2.zzagr = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhp.<init>(boolean, com.google.android.gms.internal.ads.zzhp$zza[]):void");
    }

    zzhp(Parcel parcel) {
        this.zzagq = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.zzagr = this.zzagq.length;
    }

    public final zza zzu(int i) {
        return this.zzagq[i];
    }

    public final int hashCode() {
        if (this.zzaac == 0) {
            this.zzaac = Arrays.hashCode(this.zzagq);
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
        return Arrays.equals(this.zzagq, ((zzhp) obj).zzagq);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzagq, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (zzfe.zzwm.equals(zza2.uuid)) {
            return zzfe.zzwm.equals(zza3.uuid) ? 0 : 1;
        }
        return zza2.uuid.compareTo(zza3.uuid);
    }
}
