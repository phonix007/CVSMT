package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class zzbfz implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzexp;

    zzbfz(JsResult jsResult) {
        this.zzexp = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzexp.cancel();
    }
}
