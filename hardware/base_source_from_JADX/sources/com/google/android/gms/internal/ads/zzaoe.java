package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;

final class zzaoe implements DialogInterface.OnClickListener {
    private final /* synthetic */ String zzdpv;
    private final /* synthetic */ String zzdpw;
    private final /* synthetic */ zzaod zzdpx;

    zzaoe(zzaod zzaod, String str, String str2) {
        this.zzdpx = zzaod;
        this.zzdpv = str;
        this.zzdpw = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.zzdpx.mContext.getSystemService("download");
        try {
            String str = this.zzdpv;
            String str2 = this.zzdpw;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzbv.zzlh().zza(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzdpx.zzda("Could not store picture.");
        }
    }
}
