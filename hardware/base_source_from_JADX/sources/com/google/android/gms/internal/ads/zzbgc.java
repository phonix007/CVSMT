package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zzbgc implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzexq;

    zzbgc(JsPromptResult jsPromptResult) {
        this.zzexq = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzexq.cancel();
    }
}
