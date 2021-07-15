package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public class zzayy extends zzayw {
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public final ViewGroup.LayoutParams zzzz() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
