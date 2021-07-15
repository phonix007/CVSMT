package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;

@zzark
public final class zzbdr extends zzbdj {
    @Nullable
    public final zzbdi zza(Context context, zzbdz zzbdz, int i, boolean z, zzaba zzaba, zzbdy zzbdy) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        boolean z2 = true;
        if (!(PlatformVersion.isAtLeastIceCreamSandwich() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        zzbea zzbea = new zzbea(context, zzbdz.zzabz(), zzbdz.zzabx(), zzaba, zzbdz.zzabv());
        if (Build.VERSION.SDK_INT < 16 || i != 2) {
            z2 = false;
        }
        if (!z2) {
            zzbdy zzbdy2 = zzbdy;
        } else if (Arrays.asList(zzbdy.zzeto.split(",")).contains("3")) {
            return new zzbee(context, zzbea, zzbdz, z, zza(zzbdz), zzbdy);
        }
        return new zzbcx(context, z, zza(zzbdz), zzbdy, new zzbea(context, zzbdz.zzabz(), zzbdz.zzabx(), zzaba, zzbdz.zzabv()));
    }
}
