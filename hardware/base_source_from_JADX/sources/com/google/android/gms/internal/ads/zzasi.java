package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
@ParametersAreNonnullByDefault
public final class zzasi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasi> CREATOR = new zzask();
    @SafeParcelable.Field(mo8233id = 6)
    public final ApplicationInfo applicationInfo;
    @SafeParcelable.Field(mo8233id = 1)
    public final int versionCode;
    @SafeParcelable.Field(mo8233id = 28)
    public final String zzbsm;
    @SafeParcelable.Field(mo8233id = 5)
    public final String zzbsn;
    @SafeParcelable.Field(mo8233id = 11)
    public final zzbbi zzbsp;
    @SafeParcelable.Field(mo8233id = 4)
    public final zzwf zzbst;
    @SafeParcelable.Field(mo8233id = 29)
    public final zzacp zzbti;
    @SafeParcelable.Field(mo8233id = 63)
    public final zzafz zzbtk;
    @Nullable
    @SafeParcelable.Field(mo8233id = 46)
    public final zzyv zzbtl;
    @SafeParcelable.Field(mo8233id = 53)
    public final List<Integer> zzbtn;
    @SafeParcelable.Field(mo8233id = 14)
    public final List<String> zzbtt;
    @SafeParcelable.Field(mo8233id = 20)
    public final float zzbwv;
    @SafeParcelable.Field(mo8233id = 10)
    public final String zzclm;
    @SafeParcelable.Field(mo8233id = 42)
    public final boolean zzdlv;
    @Nullable
    @SafeParcelable.Field(mo8233id = 2)
    public final Bundle zzdwf;
    @SafeParcelable.Field(mo8233id = 3)
    public final zzwb zzdwg;
    @Nullable
    @SafeParcelable.Field(mo8233id = 7)
    public final PackageInfo zzdwh;
    @SafeParcelable.Field(mo8233id = 8)
    public final String zzdwi;
    @SafeParcelable.Field(mo8233id = 9)
    public final String zzdwj;
    @SafeParcelable.Field(mo8233id = 12)
    public final Bundle zzdwk;
    @SafeParcelable.Field(mo8233id = 13)
    public final int zzdwl;
    @SafeParcelable.Field(mo8233id = 15)
    public final Bundle zzdwm;
    @SafeParcelable.Field(mo8233id = 16)
    public final boolean zzdwn;
    @SafeParcelable.Field(mo8233id = 18)
    public final int zzdwo;
    @SafeParcelable.Field(mo8233id = 19)
    public final int zzdwp;
    @SafeParcelable.Field(mo8233id = 21)
    public final String zzdwq;
    @SafeParcelable.Field(mo8233id = 25)
    public final long zzdwr;
    @SafeParcelable.Field(mo8233id = 26)
    public final String zzdws;
    @Nullable
    @SafeParcelable.Field(mo8233id = 27)
    public final List<String> zzdwt;
    @SafeParcelable.Field(mo8233id = 30)
    public final List<String> zzdwu;
    @SafeParcelable.Field(mo8233id = 31)
    public final long zzdwv;
    @SafeParcelable.Field(mo8233id = 33)
    public final String zzdww;
    @SafeParcelable.Field(mo8233id = 34)
    public final float zzdwx;
    @SafeParcelable.Field(mo8233id = 35)
    public final int zzdwy;
    @SafeParcelable.Field(mo8233id = 36)
    public final int zzdwz;
    @SafeParcelable.Field(mo8233id = 37)
    public final boolean zzdxa;
    @SafeParcelable.Field(mo8233id = 38)
    public final boolean zzdxb;
    @SafeParcelable.Field(mo8233id = 39)
    public final String zzdxc;
    @SafeParcelable.Field(mo8233id = 40)
    public final boolean zzdxd;
    @SafeParcelable.Field(mo8233id = 41)
    public final String zzdxe;
    @SafeParcelable.Field(mo8233id = 43)
    public final int zzdxf;
    @SafeParcelable.Field(mo8233id = 44)
    public final Bundle zzdxg;
    @SafeParcelable.Field(mo8233id = 45)
    public final String zzdxh;
    @SafeParcelable.Field(mo8233id = 47)
    public final boolean zzdxi;
    @SafeParcelable.Field(mo8233id = 48)
    public final Bundle zzdxj;
    @Nullable
    @SafeParcelable.Field(mo8233id = 49)
    public final String zzdxk;
    @Nullable
    @SafeParcelable.Field(mo8233id = 50)
    public final String zzdxl;
    @Nullable
    @SafeParcelable.Field(mo8233id = 51)
    public final String zzdxm;
    @SafeParcelable.Field(mo8233id = 52)
    public final boolean zzdxn;
    @SafeParcelable.Field(mo8233id = 54)
    public final String zzdxo;
    @SafeParcelable.Field(mo8233id = 55)
    public final List<String> zzdxp;
    @SafeParcelable.Field(mo8233id = 56)
    public final int zzdxq;
    @SafeParcelable.Field(mo8233id = 57)
    public final boolean zzdxr;
    @SafeParcelable.Field(mo8233id = 58)
    public final boolean zzdxs;
    @SafeParcelable.Field(mo8233id = 59)
    public final boolean zzdxt;
    @SafeParcelable.Field(mo8233id = 60)
    public final ArrayList<String> zzdxu;
    @SafeParcelable.Field(mo8233id = 61)
    public final String zzdxv;
    @Nullable
    @SafeParcelable.Field(mo8233id = 64)
    public final String zzdxw;
    @SafeParcelable.Field(mo8233id = 65)
    public final Bundle zzdxx;

    @VisibleForTesting
    private zzasi(@Nullable Bundle bundle, zzwb zzwb, zzwf zzwf, String str, ApplicationInfo applicationInfo2, @Nullable PackageInfo packageInfo, String str2, String str3, String str4, zzbbi zzbbi, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, @Nullable List<String> list3, String str7, zzacp zzacp, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, @Nullable zzyv zzyv, boolean z6, Bundle bundle5, @Nullable String str12, @Nullable String str13, @Nullable String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzafz zzafz, @Nullable String str17, Bundle bundle6) {
        this(24, bundle, zzwb, zzwf, str, applicationInfo2, packageInfo, str2, str3, str4, zzbbi, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzacp, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzyv, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList, str16, zzafz, str17, bundle6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzasi(com.google.android.gms.internal.ads.zzasj r68, long r69, @android.support.annotation.Nullable java.lang.String r71, @android.support.annotation.Nullable java.lang.String r72, @android.support.annotation.Nullable java.lang.String r73, @android.support.annotation.Nullable java.lang.String r74) {
        /*
            r67 = this;
            r0 = r68
            r1 = r67
            r28 = r69
            r46 = r71
            r47 = r72
            r48 = r73
            r60 = r74
            android.os.Bundle r2 = r0.zzdwf
            com.google.android.gms.internal.ads.zzwb r3 = r0.zzdwg
            com.google.android.gms.internal.ads.zzwf r4 = r0.zzbst
            java.lang.String r5 = r0.zzbsn
            android.content.pm.ApplicationInfo r6 = r0.applicationInfo
            android.content.pm.PackageInfo r7 = r0.zzdwh
            java.util.concurrent.Future<java.lang.String> r8 = r0.zzdxz
            java.lang.String r9 = ""
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbbq.zza(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r0.zzdwj
            java.lang.String r10 = r0.zzclm
            com.google.android.gms.internal.ads.zzbbi r11 = r0.zzbsp
            android.os.Bundle r12 = r0.zzdwk
            int r13 = r0.zzdwl
            java.util.List<java.lang.String> r14 = r0.zzbtt
            java.util.List<java.lang.String> r15 = r0.zzdwu
            r62 = r1
            android.os.Bundle r1 = r0.zzdwm
            r16 = r1
            boolean r1 = r0.zzdwn
            r17 = r1
            int r1 = r0.zzdwo
            r18 = r1
            int r1 = r0.zzdwp
            r19 = r1
            float r1 = r0.zzbwv
            r20 = r1
            java.lang.String r1 = r0.zzdwq
            r21 = r1
            r63 = r2
            long r1 = r0.zzdwr
            r22 = r1
            java.lang.String r1 = r0.zzdws
            r24 = r1
            java.util.List<java.lang.String> r1 = r0.zzdwt
            r25 = r1
            java.lang.String r1 = r0.zzbsm
            r26 = r1
            com.google.android.gms.internal.ads.zzacp r1 = r0.zzbti
            r27 = r1
            java.lang.String r1 = r0.zzdww
            r30 = r1
            float r1 = r0.zzdwx
            r31 = r1
            boolean r1 = r0.zzdxd
            r32 = r1
            int r1 = r0.zzdwy
            r33 = r1
            int r1 = r0.zzdwz
            r34 = r1
            boolean r1 = r0.zzdxa
            r35 = r1
            boolean r1 = r0.zzdxb
            r36 = r1
            java.util.concurrent.Future<java.lang.String> r1 = r0.zzdxy
            java.lang.String r2 = ""
            r64 = r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r65 = r4
            r66 = r5
            r4 = 1
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbbq.zza(r1, r2, (long) r4, (java.util.concurrent.TimeUnit) r3)
            r37 = r1
            java.lang.String r37 = (java.lang.String) r37
            java.lang.String r1 = r0.zzdxe
            r38 = r1
            boolean r1 = r0.zzdlv
            r39 = r1
            int r1 = r0.zzdxf
            r40 = r1
            android.os.Bundle r1 = r0.zzdxg
            r41 = r1
            java.lang.String r1 = r0.zzdxh
            r42 = r1
            com.google.android.gms.internal.ads.zzyv r1 = r0.zzbtl
            r43 = r1
            boolean r1 = r0.zzdxi
            r44 = r1
            android.os.Bundle r1 = r0.zzdxj
            r45 = r1
            boolean r1 = r0.zzdxn
            r49 = r1
            java.util.List<java.lang.Integer> r1 = r0.zzbtn
            r50 = r1
            java.lang.String r1 = r0.zzdxo
            r51 = r1
            java.util.List<java.lang.String> r1 = r0.zzdxp
            r52 = r1
            int r1 = r0.zzdxq
            r53 = r1
            boolean r1 = r0.zzdxr
            r54 = r1
            boolean r1 = r0.zzdxs
            r55 = r1
            boolean r1 = r0.zzdxt
            r56 = r1
            java.util.ArrayList<java.lang.String> r1 = r0.zzdxu
            r57 = r1
            java.lang.String r1 = r0.zzdxv
            r58 = r1
            com.google.android.gms.internal.ads.zzafz r1 = r0.zzbtk
            r59 = r1
            android.os.Bundle r0 = r0.zzdxx
            r61 = r0
            r1 = r62
            r2 = r63
            r3 = r64
            r4 = r65
            r5 = r66
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasi.<init>(com.google.android.gms.internal.ads.zzasj, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @SafeParcelable.Constructor
    zzasi(@SafeParcelable.Param(mo8236id = 1) int i, @SafeParcelable.Param(mo8236id = 2) Bundle bundle, @SafeParcelable.Param(mo8236id = 3) zzwb zzwb, @SafeParcelable.Param(mo8236id = 4) zzwf zzwf, @SafeParcelable.Param(mo8236id = 5) String str, @SafeParcelable.Param(mo8236id = 6) ApplicationInfo applicationInfo2, @SafeParcelable.Param(mo8236id = 7) PackageInfo packageInfo, @SafeParcelable.Param(mo8236id = 8) String str2, @SafeParcelable.Param(mo8236id = 9) String str3, @SafeParcelable.Param(mo8236id = 10) String str4, @SafeParcelable.Param(mo8236id = 11) zzbbi zzbbi, @SafeParcelable.Param(mo8236id = 12) Bundle bundle2, @SafeParcelable.Param(mo8236id = 13) int i2, @SafeParcelable.Param(mo8236id = 14) List<String> list, @SafeParcelable.Param(mo8236id = 15) Bundle bundle3, @SafeParcelable.Param(mo8236id = 16) boolean z, @SafeParcelable.Param(mo8236id = 18) int i3, @SafeParcelable.Param(mo8236id = 19) int i4, @SafeParcelable.Param(mo8236id = 20) float f, @SafeParcelable.Param(mo8236id = 21) String str5, @SafeParcelable.Param(mo8236id = 25) long j, @SafeParcelable.Param(mo8236id = 26) String str6, @SafeParcelable.Param(mo8236id = 27) List<String> list2, @SafeParcelable.Param(mo8236id = 28) String str7, @SafeParcelable.Param(mo8236id = 29) zzacp zzacp, @SafeParcelable.Param(mo8236id = 30) List<String> list3, @SafeParcelable.Param(mo8236id = 31) long j2, @SafeParcelable.Param(mo8236id = 33) String str8, @SafeParcelable.Param(mo8236id = 34) float f2, @SafeParcelable.Param(mo8236id = 40) boolean z2, @SafeParcelable.Param(mo8236id = 35) int i5, @SafeParcelable.Param(mo8236id = 36) int i6, @SafeParcelable.Param(mo8236id = 37) boolean z3, @SafeParcelable.Param(mo8236id = 38) boolean z4, @SafeParcelable.Param(mo8236id = 39) String str9, @SafeParcelable.Param(mo8236id = 41) String str10, @SafeParcelable.Param(mo8236id = 42) boolean z5, @SafeParcelable.Param(mo8236id = 43) int i7, @SafeParcelable.Param(mo8236id = 44) Bundle bundle4, @SafeParcelable.Param(mo8236id = 45) String str11, @SafeParcelable.Param(mo8236id = 46) zzyv zzyv, @SafeParcelable.Param(mo8236id = 47) boolean z6, @SafeParcelable.Param(mo8236id = 48) Bundle bundle5, @Nullable @SafeParcelable.Param(mo8236id = 49) String str12, @Nullable @SafeParcelable.Param(mo8236id = 50) String str13, @Nullable @SafeParcelable.Param(mo8236id = 51) String str14, @SafeParcelable.Param(mo8236id = 52) boolean z7, @SafeParcelable.Param(mo8236id = 53) List<Integer> list4, @SafeParcelable.Param(mo8236id = 54) String str15, @SafeParcelable.Param(mo8236id = 55) List<String> list5, @SafeParcelable.Param(mo8236id = 56) int i8, @SafeParcelable.Param(mo8236id = 57) boolean z8, @SafeParcelable.Param(mo8236id = 58) boolean z9, @SafeParcelable.Param(mo8236id = 59) boolean z10, @SafeParcelable.Param(mo8236id = 60) ArrayList<String> arrayList, @SafeParcelable.Param(mo8236id = 61) String str16, @SafeParcelable.Param(mo8236id = 63) zzafz zzafz, @Nullable @SafeParcelable.Param(mo8236id = 64) String str17, @SafeParcelable.Param(mo8236id = 65) Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.versionCode = i;
        this.zzdwf = bundle;
        this.zzdwg = zzwb;
        this.zzbst = zzwf;
        this.zzbsn = str;
        this.applicationInfo = applicationInfo2;
        this.zzdwh = packageInfo;
        this.zzdwi = str2;
        this.zzdwj = str3;
        this.zzclm = str4;
        this.zzbsp = zzbbi;
        this.zzdwk = bundle2;
        this.zzdwl = i2;
        this.zzbtt = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.zzdwu = list6;
        this.zzdwm = bundle3;
        this.zzdwn = z;
        this.zzdwo = i3;
        this.zzdwp = i4;
        this.zzbwv = f;
        this.zzdwq = str5;
        this.zzdwr = j;
        this.zzdws = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.zzdwt = list7;
        this.zzbsm = str7;
        this.zzbti = zzacp;
        this.zzdwv = j2;
        this.zzdww = str8;
        this.zzdwx = f2;
        this.zzdxd = z2;
        this.zzdwy = i5;
        this.zzdwz = i6;
        this.zzdxa = z3;
        this.zzdxb = z4;
        this.zzdxc = str9;
        this.zzdxe = str10;
        this.zzdlv = z5;
        this.zzdxf = i7;
        this.zzdxg = bundle4;
        this.zzdxh = str11;
        this.zzbtl = zzyv;
        this.zzdxi = z6;
        this.zzdxj = bundle5;
        this.zzdxk = str12;
        this.zzdxl = str13;
        this.zzdxm = str14;
        this.zzdxn = z7;
        this.zzbtn = list4;
        this.zzdxo = str15;
        this.zzdxp = list5;
        this.zzdxq = i8;
        this.zzdxr = z8;
        this.zzdxs = z9;
        this.zzdxt = z10;
        this.zzdxu = arrayList;
        this.zzdxv = str16;
        this.zzbtk = zzafz;
        this.zzdxw = str17;
        this.zzdxx = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdwf, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdwg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbst, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbsn, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.applicationInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdwh, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdwi, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdwj, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzclm, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzbsp, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzdwk, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdwl);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzbtt, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzdwm, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzdwn);
        SafeParcelWriter.writeInt(parcel, 18, this.zzdwo);
        SafeParcelWriter.writeInt(parcel, 19, this.zzdwp);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzbwv);
        SafeParcelWriter.writeString(parcel, 21, this.zzdwq, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzdwr);
        SafeParcelWriter.writeString(parcel, 26, this.zzdws, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzdwt, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzbsm, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzbti, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzdwu, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzdwv);
        SafeParcelWriter.writeString(parcel, 33, this.zzdww, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzdwx);
        SafeParcelWriter.writeInt(parcel, 35, this.zzdwy);
        SafeParcelWriter.writeInt(parcel, 36, this.zzdwz);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzdxa);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdxb);
        SafeParcelWriter.writeString(parcel, 39, this.zzdxc, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzdxd);
        SafeParcelWriter.writeString(parcel, 41, this.zzdxe, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdlv);
        SafeParcelWriter.writeInt(parcel, 43, this.zzdxf);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzdxg, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdxh, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzbtl, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdxi);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdxj, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzdxk, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzdxl, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzdxm, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzdxn);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzbtn, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzdxo, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzdxp, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzdxq);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdxr);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzdxs);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzdxt);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzdxu, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzdxv, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzbtk, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzdxw, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzdxx, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
