package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zzbgd implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzexq;

    zzbgd(JsPromptResult jsPromptResult) {
        this.zzexq = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzexq.cancel();
    }
}
