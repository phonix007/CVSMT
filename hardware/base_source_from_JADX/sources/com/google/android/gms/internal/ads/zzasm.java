package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@SafeParcelable.Class(creator = "AdResponseParcelCreator")
@ParametersAreNonnullByDefault
public final class zzasm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasm> CREATOR = new zzasn();
    @SafeParcelable.Field(mo8233id = 5)
    public final int errorCode;
    @SafeParcelable.Field(mo8233id = 12)
    public final int orientation;
    @SafeParcelable.Field(mo8233id = 1)
    private final int versionCode;
    @SafeParcelable.Field(mo8233id = 2)
    public final String zzbde;
    @SafeParcelable.Field(mo8233id = 49)
    public final boolean zzbph;
    @SafeParcelable.Field(mo8233id = 53)
    public final boolean zzbpi;
    @SafeParcelable.Field(mo8233id = 30)
    public final String zzcgx;
    @SafeParcelable.Field(mo8233id = 23)
    public final boolean zzckn;
    @SafeParcelable.Field(mo8233id = 31)
    public final boolean zzcko;
    @SafeParcelable.Field(mo8233id = 32)
    public final boolean zzckp;
    @SafeParcelable.Field(mo8233id = 4)
    public final List<String> zzdlq;
    @SafeParcelable.Field(mo8233id = 6)
    public final List<String> zzdlr;
    @SafeParcelable.Field(mo8233id = 52)
    public final List<String> zzdls;
    @SafeParcelable.Field(mo8233id = 40)
    public final List<String> zzdlu;
    @SafeParcelable.Field(mo8233id = 42)
    public final boolean zzdlv;
    @SafeParcelable.Field(mo8233id = 11)
    public final long zzdlx;
    private zzasi zzdnh;
    @SafeParcelable.Field(mo8233id = 24)
    public final boolean zzdwn;
    @SafeParcelable.Field(mo8233id = 38)
    public final boolean zzdxb;
    @Nullable
    @SafeParcelable.Field(mo8233id = 39)
    public String zzdxc;
    @SafeParcelable.Field(mo8233id = 47)
    public final boolean zzdxn;
    @SafeParcelable.Field(mo8233id = 3)
    public String zzdyb;
    @SafeParcelable.Field(mo8233id = 7)
    public final long zzdyc;
    @SafeParcelable.Field(mo8233id = 8)
    public final boolean zzdyd;
    @SafeParcelable.Field(mo8233id = 9)
    public final long zzdye;
    @SafeParcelable.Field(mo8233id = 10)
    public final List<String> zzdyf;
    @SafeParcelable.Field(mo8233id = 13)
    public final String zzdyg;
    @SafeParcelable.Field(mo8233id = 14)
    public final long zzdyh;
    @SafeParcelable.Field(mo8233id = 15)
    public final String zzdyi;
    @SafeParcelable.Field(mo8233id = 18)
    public final boolean zzdyj;
    @SafeParcelable.Field(mo8233id = 19)
    public final String zzdyk;
    @SafeParcelable.Field(mo8233id = 21)
    public final String zzdyl;
    @SafeParcelable.Field(mo8233id = 22)
    public final boolean zzdym;
    @SafeParcelable.Field(mo8233id = 25)
    public final boolean zzdyn;
    @SafeParcelable.Field(mo8233id = 26)
    public final boolean zzdyo;
    @SafeParcelable.Field(mo8233id = 28)
    private zzasy zzdyp;
    @SafeParcelable.Field(mo8233id = 29)
    public String zzdyq;
    @Nullable
    @SafeParcelable.Field(mo8233id = 33)
    public final zzawd zzdyr;
    @Nullable
    @SafeParcelable.Field(mo8233id = 34)
    public final List<String> zzdys;
    @Nullable
    @SafeParcelable.Field(mo8233id = 35)
    public final List<String> zzdyt;
    @SafeParcelable.Field(mo8233id = 36)
    public final boolean zzdyu;
    @Nullable
    @SafeParcelable.Field(mo8233id = 37)
    public final zzaso zzdyv;
    @Nullable
    @SafeParcelable.Field(mo8233id = 43)
    public final String zzdyw;
    @Nullable
    @SafeParcelable.Field(mo8233id = 44)
    public final zzawo zzdyx;
    @Nullable
    @SafeParcelable.Field(mo8233id = 45)
    public final String zzdyy;
    @SafeParcelable.Field(mo8233id = 46)
    public final boolean zzdyz;
    @SafeParcelable.Field(mo8233id = 48)
    private Bundle zzdza;
    @SafeParcelable.Field(mo8233id = 50)
    public final int zzdzb;
    @SafeParcelable.Field(mo8233id = 51)
    public final boolean zzdzc;
    @Nullable
    @SafeParcelable.Field(mo8233id = 54)
    public final String zzdzd;
    @Nullable
    @SafeParcelable.Field(mo8233id = 55)
    public String zzdze;
    @SafeParcelable.Field(mo8233id = 56)
    public boolean zzdzf;

    public zzasm(zzasi zzasi, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzawd zzawd, List<String> list4, List<String> list5, boolean z10, zzaso zzaso, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzawo zzawo, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11, @Nullable String str12, boolean z18) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, (zzasy) null, (String) null, str7, z8, z9, zzawd, list4, list5, z10, zzaso, z11, str8, list6, z12, str9, zzawo, str10, z13, z14, (Bundle) null, z15, 0, z16, list7, z17, str11, str12, z18);
        this.zzdnh = zzasi;
    }

    public zzasm(zzasi zzasi, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzawd zzawd, List<String> list4, List<String> list5, boolean z9, zzaso zzaso, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzawo zzawo, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10, @Nullable String str11, boolean z17) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, (String) null, str5, z2, z3, z4, z5, false, (zzasy) null, (String) null, str6, z7, z8, zzawd, list4, list5, z9, zzaso, z10, str7, list6, z11, str8, zzawo, str9, z12, z13, (Bundle) null, z14, i2, z15, list7, z16, str10, str11, z17);
        this.zzdnh = zzasi;
    }

    public zzasm(int i) {
        this(19, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, -1, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (zzasy) null, (String) null, (String) null, false, false, (zzawd) null, (List<String>) null, (List<String>) null, false, (zzaso) null, false, (String) null, (List<String>) null, false, (String) null, (zzawo) null, (String) null, true, false, (Bundle) null, false, 0, false, (List<String>) null, false, (String) null, (String) null, false);
    }

    public zzasm(int i, long j) {
        this(19, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, j, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, true, false, (zzasy) null, (String) null, (String) null, false, false, (zzawd) null, (List<String>) null, (List<String>) null, false, (zzaso) null, false, (String) null, (List<String>) null, false, (String) null, (zzawo) null, (String) null, true, false, (Bundle) null, false, 0, false, (List<String>) null, false, (String) null, (String) null, false);
    }

    @SafeParcelable.Constructor
    zzasm(@SafeParcelable.Param(mo8236id = 1) int i, @SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) String str2, @SafeParcelable.Param(mo8236id = 4) List<String> list, @SafeParcelable.Param(mo8236id = 5) int i2, @SafeParcelable.Param(mo8236id = 6) List<String> list2, @SafeParcelable.Param(mo8236id = 7) long j, @SafeParcelable.Param(mo8236id = 8) boolean z, @SafeParcelable.Param(mo8236id = 9) long j2, @SafeParcelable.Param(mo8236id = 10) List<String> list3, @SafeParcelable.Param(mo8236id = 11) long j3, @SafeParcelable.Param(mo8236id = 12) int i3, @SafeParcelable.Param(mo8236id = 13) String str3, @SafeParcelable.Param(mo8236id = 14) long j4, @SafeParcelable.Param(mo8236id = 15) String str4, @SafeParcelable.Param(mo8236id = 18) boolean z2, @SafeParcelable.Param(mo8236id = 19) String str5, @SafeParcelable.Param(mo8236id = 21) String str6, @SafeParcelable.Param(mo8236id = 22) boolean z3, @SafeParcelable.Param(mo8236id = 23) boolean z4, @SafeParcelable.Param(mo8236id = 24) boolean z5, @SafeParcelable.Param(mo8236id = 25) boolean z6, @SafeParcelable.Param(mo8236id = 26) boolean z7, @SafeParcelable.Param(mo8236id = 28) zzasy zzasy, @SafeParcelable.Param(mo8236id = 29) String str7, @SafeParcelable.Param(mo8236id = 30) String str8, @SafeParcelable.Param(mo8236id = 31) boolean z8, @SafeParcelable.Param(mo8236id = 32) boolean z9, @SafeParcelable.Param(mo8236id = 33) zzawd zzawd, @SafeParcelable.Param(mo8236id = 34) List<String> list4, @SafeParcelable.Param(mo8236id = 35) List<String> list5, @SafeParcelable.Param(mo8236id = 36) boolean z10, @SafeParcelable.Param(mo8236id = 37) zzaso zzaso, @SafeParcelable.Param(mo8236id = 38) boolean z11, @SafeParcelable.Param(mo8236id = 39) String str9, @SafeParcelable.Param(mo8236id = 40) List<String> list6, @SafeParcelable.Param(mo8236id = 42) boolean z12, @SafeParcelable.Param(mo8236id = 43) String str10, @SafeParcelable.Param(mo8236id = 44) zzawo zzawo, @SafeParcelable.Param(mo8236id = 45) String str11, @SafeParcelable.Param(mo8236id = 46) boolean z13, @SafeParcelable.Param(mo8236id = 47) boolean z14, @SafeParcelable.Param(mo8236id = 48) Bundle bundle, @SafeParcelable.Param(mo8236id = 49) boolean z15, @SafeParcelable.Param(mo8236id = 50) int i4, @SafeParcelable.Param(mo8236id = 51) boolean z16, @SafeParcelable.Param(mo8236id = 52) List<String> list7, @SafeParcelable.Param(mo8236id = 53) boolean z17, @SafeParcelable.Param(mo8236id = 54) String str12, @Nullable @SafeParcelable.Param(mo8236id = 55) String str13, @SafeParcelable.Param(mo8236id = 56) boolean z18) {
        zzatm zzatm;
        this.versionCode = i;
        this.zzbde = str;
        this.zzdyb = str2;
        List<String> list8 = null;
        this.zzdlq = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzdlr = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzdyc = j;
        this.zzdyd = z;
        this.zzdye = j2;
        this.zzdyf = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.zzdlx = j3;
        this.orientation = i3;
        this.zzdyg = str3;
        this.zzdyh = j4;
        this.zzdyi = str4;
        this.zzdyj = z2;
        this.zzdyk = str5;
        this.zzdyl = str6;
        this.zzdym = z3;
        this.zzckn = z4;
        this.zzdwn = z5;
        this.zzdyn = z6;
        this.zzdyz = z13;
        this.zzdyo = z7;
        this.zzdyp = zzasy;
        this.zzdyq = str7;
        this.zzcgx = str8;
        if (this.zzdyb == null && this.zzdyp != null && (zzatm = (zzatm) this.zzdyp.zza(zzatm.CREATOR)) != null && !TextUtils.isEmpty(zzatm.zzczq)) {
            this.zzdyb = zzatm.zzczq;
        }
        this.zzcko = z8;
        this.zzckp = z9;
        this.zzdyr = zzawd;
        this.zzdys = list4;
        this.zzdyt = list5;
        this.zzdyu = z10;
        this.zzdyv = zzaso;
        this.zzdxb = z11;
        this.zzdxc = str9;
        this.zzdlu = list6;
        this.zzdlv = z12;
        this.zzdyw = str10;
        this.zzdyx = zzawo;
        this.zzdyy = str11;
        this.zzdxn = z14;
        this.zzdza = bundle;
        this.zzbph = z15;
        this.zzdzb = i4;
        this.zzdzc = z16;
        this.zzdls = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.zzbpi = z17;
        this.zzdzd = str12;
        this.zzdze = str13;
        this.zzdzf = z18;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.zzdnh != null && this.zzdnh.versionCode >= 9 && !TextUtils.isEmpty(this.zzdyb)) {
            this.zzdyp = new zzasy((SafeParcelable) new zzatm(this.zzdyb));
            this.zzdyb = null;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzbde, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdyb, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzdlq, false);
        SafeParcelWriter.writeInt(parcel, 5, this.errorCode);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdlr, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzdyc);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdyd);
        SafeParcelWriter.writeLong(parcel, 9, this.zzdye);
        SafeParcelWriter.writeStringList(parcel, 10, this.zzdyf, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzdlx);
        SafeParcelWriter.writeInt(parcel, 12, this.orientation);
        SafeParcelWriter.writeString(parcel, 13, this.zzdyg, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzdyh);
        SafeParcelWriter.writeString(parcel, 15, this.zzdyi, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzdyj);
        SafeParcelWriter.writeString(parcel, 19, this.zzdyk, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzdyl, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzdym);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzckn);
        SafeParcelWriter.writeBoolean(parcel, 24, this.zzdwn);
        SafeParcelWriter.writeBoolean(parcel, 25, this.zzdyn);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzdyo);
        SafeParcelWriter.writeParcelable(parcel, 28, this.zzdyp, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.zzdyq, false);
        SafeParcelWriter.writeString(parcel, 30, this.zzcgx, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzcko);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzckp);
        SafeParcelWriter.writeParcelable(parcel, 33, this.zzdyr, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.zzdys, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.zzdyt, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzdyu);
        SafeParcelWriter.writeParcelable(parcel, 37, this.zzdyv, i, false);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdxb);
        SafeParcelWriter.writeString(parcel, 39, this.zzdxc, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.zzdlu, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdlv);
        SafeParcelWriter.writeString(parcel, 43, this.zzdyw, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.zzdyx, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdyy, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.zzdyz);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdxn);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdza, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.zzbph);
        SafeParcelWriter.writeInt(parcel, 50, this.zzdzb);
        SafeParcelWriter.writeBoolean(parcel, 51, this.zzdzc);
        SafeParcelWriter.writeStringList(parcel, 52, this.zzdls, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.zzbpi);
        SafeParcelWriter.writeString(parcel, 54, this.zzdzd, false);
        SafeParcelWriter.writeString(parcel, 55, this.zzdze, false);
        SafeParcelWriter.writeBoolean(parcel, 56, this.zzdzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
