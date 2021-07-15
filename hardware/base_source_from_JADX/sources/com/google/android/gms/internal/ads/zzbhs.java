package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@zzark
public final class zzbhs extends MutableContextWrapper {
    private Context zzbup;
    private Activity zzeoa;
    private Context zzfau;

    public zzbhs(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.zzbup = context.getApplicationContext();
        this.zzeoa = context instanceof Activity ? (Activity) context : null;
        this.zzfau = context;
        super.setBaseContext(this.zzbup);
    }

    public final void startActivity(Intent intent) {
        if (this.zzeoa != null) {
            this.zzeoa.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.zzbup.startActivity(intent);
    }

    public final Activity zzabw() {
        return this.zzeoa;
    }

    public final Object getSystemService(String str) {
        return this.zzfau.getSystemService(str);
    }

    public final Context zzadg() {
        return this.zzfau;
    }
}
