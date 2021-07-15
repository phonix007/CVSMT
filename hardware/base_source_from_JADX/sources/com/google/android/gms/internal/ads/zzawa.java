package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzawa extends zzex implements zzavz {
    public zzawa() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzavz zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzavz) {
            return (zzavz) queryLocalInterface;
        }
        return new zzawb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzs(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 2:
                zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzt(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 4:
                zzu(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 5:
                zzv(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 6:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzawd) zzey.zza(parcel, zzawd.CREATOR));
                break;
            case 8:
                zzx(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 9:
                zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 11:
                zzz(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 12:
                zzc((Bundle) zzey.zza(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
