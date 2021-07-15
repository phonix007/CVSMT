package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzej extends zzr implements zzei {
    public zzej() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                onEvent(parcel.readString(), parcel.readString(), (Bundle) zzs.zza(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 2:
                int id = mo11897id();
                parcel2.writeNoException();
                parcel2.writeInt(id);
                return true;
            default:
                return false;
        }
    }
}
