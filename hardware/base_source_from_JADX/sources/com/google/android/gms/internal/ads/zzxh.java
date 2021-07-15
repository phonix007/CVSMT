package com.google.android.gms.internal.ads;

public abstract class zzxh extends zzex implements zzxg {
    public zzxh() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzxa] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.zzxz] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00e9;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00aa;
                case 5: goto L_0x008f;
                case 6: goto L_0x0080;
                case 7: goto L_0x005e;
                case 8: goto L_0x0046;
                case 9: goto L_0x0036;
                case 10: goto L_0x0026;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0016;
                case 14: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzagf r1 = com.google.android.gms.internal.ads.zzagg.zzt(r1)
            r0.zza((com.google.android.gms.internal.ads.zzagf) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0016:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzafz> r1 = com.google.android.gms.internal.ads.zzafz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzafz r1 = (com.google.android.gms.internal.ads.zzafz) r1
            r0.zza((com.google.android.gms.internal.ads.zzafz) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0026:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaeq r1 = com.google.android.gms.internal.ads.zzaer.zzs(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaeq) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.zza((com.google.android.gms.ads.formats.PublisherAdViewOptions) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0046:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaen r1 = com.google.android.gms.internal.ads.zzaeo.zzr(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r4 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r4)
            com.google.android.gms.internal.ads.zzwf r2 = (com.google.android.gms.internal.ads.zzwf) r2
            r0.zza(r1, r2)
            r3.writeNoException()
            goto L_0x00f3
        L_0x005e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0065
            goto L_0x0078
        L_0x0065:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxz
            if (r4 == 0) goto L_0x0073
            r4 = r2
            com.google.android.gms.internal.ads.zzxz r4 = (com.google.android.gms.internal.ads.zzxz) r4
            goto L_0x0078
        L_0x0073:
            com.google.android.gms.internal.ads.zzyb r4 = new com.google.android.gms.internal.ads.zzyb
            r4.<init>(r1)
        L_0x0078:
            r0.zzb((com.google.android.gms.internal.ads.zzxz) r4)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0080:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzacp> r1 = com.google.android.gms.internal.ads.zzacp.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzacp r1 = (com.google.android.gms.internal.ads.zzacp) r1
            r0.zza((com.google.android.gms.internal.ads.zzacp) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x008f:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaek r4 = com.google.android.gms.internal.ads.zzael.zzq(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaeh r2 = com.google.android.gms.internal.ads.zzaei.zzp(r2)
            r0.zza(r1, r4, r2)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00aa:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaee r1 = com.google.android.gms.internal.ads.zzaef.zzo(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaee) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00b9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaeb r1 = com.google.android.gms.internal.ads.zzaec.zzn(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaeb) r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00c8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00cf
            goto L_0x00e2
        L_0x00cf:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxa
            if (r4 == 0) goto L_0x00dd
            r4 = r2
            com.google.android.gms.internal.ads.zzxa r4 = (com.google.android.gms.internal.ads.zzxa) r4
            goto L_0x00e2
        L_0x00dd:
            com.google.android.gms.internal.ads.zzxc r4 = new com.google.android.gms.internal.ads.zzxc
            r4.<init>(r1)
        L_0x00e2:
            r0.zzb((com.google.android.gms.internal.ads.zzxa) r4)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00e9:
            com.google.android.gms.internal.ads.zzxd r1 = r0.zzkd()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
        L_0x00f3:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
