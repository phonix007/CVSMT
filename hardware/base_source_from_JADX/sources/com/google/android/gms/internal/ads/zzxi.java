package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class zzxi extends zzew implements zzxg {
    zzxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzxd zzkd() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.obtainAndWriteInterfaceToken()
            r1 = 1
            android.os.Parcel r0 = r4.transactAndReadException(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzxd
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzxd r1 = (com.google.android.gms.internal.ads.zzxd) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzxf r2 = new com.google.android.gms.internal.ads.zzxf
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxi.zzkd():com.google.android.gms.internal.ads.zzxd");
    }

    public final void zzb(zzxa zzxa) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzxa);
        zza(2, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaeb zzaeb) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzaeb);
        zza(3, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaee zzaee) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzaee);
        zza(4, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, zzaek zzaek, zzaeh zzaeh) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzaek);
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzaeh);
        zza(5, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzacp zzacp) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (Parcelable) zzacp);
        zza(6, obtainAndWriteInterfaceToken);
    }

    public final void zzb(zzxz zzxz) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzxz);
        zza(7, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaen zzaen, zzwf zzwf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzaen);
        zzey.zza(obtainAndWriteInterfaceToken, (Parcelable) zzwf);
        zza(8, obtainAndWriteInterfaceToken);
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (Parcelable) publisherAdViewOptions);
        zza(9, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaeq zzaeq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzaeq);
        zza(10, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzafz zzafz) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (Parcelable) zzafz);
        zza(13, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzagf zzagf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzey.zza(obtainAndWriteInterfaceToken, (IInterface) zzagf);
        zza(14, obtainAndWriteInterfaceToken);
    }
}
