package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class zzbge implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzexq;
    private final /* synthetic */ EditText zzexr;

    zzbge(JsPromptResult jsPromptResult, EditText editText) {
        this.zzexq = jsPromptResult;
        this.zzexr = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzexq.confirm(this.zzexr.getText().toString());
    }
}
