package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsCallback;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzabk implements zzbwk {
    @Nullable
    private CustomTabsSession zzczs;
    @Nullable
    private CustomTabsClient zzczt;
    @Nullable
    private CustomTabsServiceConnection zzczu;
    @Nullable
    private zzabl zzczv;

    public static boolean zzj(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzbwi.zzbp(context));
                }
            }
        }
        return false;
    }

    public final void zzc(Activity activity) {
        if (this.zzczu != null) {
            activity.unbindService(this.zzczu);
            this.zzczt = null;
            this.zzczs = null;
            this.zzczu = null;
        }
    }

    public final void zza(zzabl zzabl) {
        this.zzczv = zzabl;
    }

    public final void zzd(Activity activity) {
        String zzbp;
        if (this.zzczt == null && (zzbp = zzbwi.zzbp(activity)) != null) {
            this.zzczu = new zzbwj(this);
            CustomTabsClient.bindCustomTabsService(activity, zzbp, this.zzczu);
        }
    }

    public final boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.zzczt == null) {
            return false;
        }
        if (this.zzczt == null) {
            this.zzczs = null;
        } else if (this.zzczs == null) {
            this.zzczs = this.zzczt.newSession((CustomTabsCallback) null);
        }
        CustomTabsSession customTabsSession = this.zzczs;
        if (customTabsSession == null) {
            return false;
        }
        return customTabsSession.mayLaunchUrl(uri, (Bundle) null, (List<Bundle>) null);
    }

    public final void zza(CustomTabsClient customTabsClient) {
        this.zzczt = customTabsClient;
        this.zzczt.warmup(0);
        if (this.zzczv != null) {
            this.zzczv.zzrm();
        }
    }

    public final void zzrl() {
        this.zzczt = null;
        this.zzczs = null;
        if (this.zzczv != null) {
            this.zzczv.zzrn();
        }
    }
}
