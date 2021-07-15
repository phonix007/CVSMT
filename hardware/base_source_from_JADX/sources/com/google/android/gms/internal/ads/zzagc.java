package com.google.android.gms.internal.ads;

public abstract class zzagc extends zzex implements zzagb {
    public zzagc() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 3: goto L_0x0037;
                case 4: goto L_0x0030;
                case 5: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0015
            r3 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r5 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzagd
            if (r0 == 0) goto L_0x0023
            r3 = r5
            com.google.android.gms.internal.ads.zzagd r3 = (com.google.android.gms.internal.ads.zzagd) r3
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.internal.ads.zzage r5 = new com.google.android.gms.internal.ads.zzage
            r5.<init>(r3)
            r3 = r5
        L_0x0029:
            r1.zza(r2, r3)
            r4.writeNoException()
            goto L_0x0041
        L_0x0030:
            r1.destroy()
            r4.writeNoException()
            goto L_0x0041
        L_0x0037:
            com.google.android.gms.internal.ads.zzyp r2 = r1.getVideoController()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r4, (android.os.IInterface) r2)
        L_0x0041:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
