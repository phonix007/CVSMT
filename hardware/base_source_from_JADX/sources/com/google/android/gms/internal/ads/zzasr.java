package com.google.android.gms.internal.ads;

public abstract class zzasr extends zzex implements zzasq {
    public zzasr() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zzast] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzasw] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.zzasw] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0056;
                case 3: goto L_0x0004;
                case 4: goto L_0x002e;
                case 5: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzatb> r2 = com.google.android.gms.internal.ads.zzatb.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzatb r2 = (com.google.android.gms.internal.ads.zzatb) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0015
            goto L_0x0027
        L_0x0015:
            java.lang.String r5 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzasw
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzasw r5 = (com.google.android.gms.internal.ads.zzasw) r5
            goto L_0x0027
        L_0x0022:
            com.google.android.gms.internal.ads.zzasx r5 = new com.google.android.gms.internal.ads.zzasx
            r5.<init>(r3)
        L_0x0027:
            r1.zzb(r2, r5)
            r4.writeNoException()
            goto L_0x0090
        L_0x002e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzatb> r2 = com.google.android.gms.internal.ads.zzatb.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzatb r2 = (com.google.android.gms.internal.ads.zzatb) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzasw
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzasw r5 = (com.google.android.gms.internal.ads.zzasw) r5
            goto L_0x004f
        L_0x004a:
            com.google.android.gms.internal.ads.zzasx r5 = new com.google.android.gms.internal.ads.zzasx
            r5.<init>(r3)
        L_0x004f:
            r1.zza((com.google.android.gms.internal.ads.zzatb) r2, (com.google.android.gms.internal.ads.zzasw) r5)
            r4.writeNoException()
            goto L_0x0090
        L_0x0056:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasi> r2 = com.google.android.gms.internal.ads.zzasi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzasi r2 = (com.google.android.gms.internal.ads.zzasi) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            java.lang.String r5 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzast
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.internal.ads.zzast r5 = (com.google.android.gms.internal.ads.zzast) r5
            goto L_0x0077
        L_0x0072:
            com.google.android.gms.internal.ads.zzasv r5 = new com.google.android.gms.internal.ads.zzasv
            r5.<init>(r3)
        L_0x0077:
            r1.zza((com.google.android.gms.internal.ads.zzasi) r2, (com.google.android.gms.internal.ads.zzast) r5)
            r4.writeNoException()
            goto L_0x0090
        L_0x007e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasi> r2 = com.google.android.gms.internal.ads.zzasi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzasi r2 = (com.google.android.gms.internal.ads.zzasi) r2
            com.google.android.gms.internal.ads.zzasm r2 = r1.zzb(r2)
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzey.zzb(r4, r2)
        L_0x0090:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasr.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
