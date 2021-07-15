package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C0523R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@zzark
public final class zzaod extends zzaok {
    /* access modifiers changed from: private */
    public final Context mContext;
    private final Map<String, String> zzczl;

    public zzaod(zzbgg zzbgg, Map<String, String> map) {
        super(zzbgg, "storePicture");
        this.zzczl = map;
        this.mContext = zzbgg.zzabw();
    }

    public final void execute() {
        if (this.mContext == null) {
            zzda("Activity context is not available");
            return;
        }
        zzbv.zzlf();
        if (!zzayh.zzam(this.mContext).zzqt()) {
            zzda("Feature is not supported by the device.");
            return;
        }
        String str = this.zzczl.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzda("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            zzda(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzbv.zzlf();
            if (!zzayh.zzdz(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                zzda(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources resources = zzbv.zzlj().getResources();
            zzbv.zzlf();
            AlertDialog.Builder zzal = zzayh.zzal(this.mContext);
            zzal.setTitle(resources != null ? resources.getString(C0523R.string.f33s1) : "Save image");
            zzal.setMessage(resources != null ? resources.getString(C0523R.string.f34s2) : "Allow Ad to store image in Picture gallery?");
            zzal.setPositiveButton(resources != null ? resources.getString(C0523R.string.f35s3) : "Accept", new zzaoe(this, str, lastPathSegment));
            zzal.setNegativeButton(resources != null ? resources.getString(C0523R.string.f36s4) : "Decline", new zzaof(this));
            zzal.create().show();
        }
    }
}
