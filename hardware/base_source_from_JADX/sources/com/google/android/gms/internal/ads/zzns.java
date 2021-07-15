package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public final class zzns extends zznp {
    private final Uri uri;
    private final long zzbdr;
    private final String zzbds;
    private final zzno zzbdt;
    private final zznz zzbdu;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzns(String str, long j, zzfs zzfs, String str2, zzny zzny, List<zznm> list, String str3, long j2) {
        super(str, -1, zzfs, str2, zzny, list);
        zzno zzno;
        String str4;
        String str5 = str;
        zzny zzny2 = zzny;
        this.uri = Uri.parse(str2);
        zznz zznz = null;
        if (zzny2.zzbed <= 0) {
            zzno = null;
        } else {
            zzno = new zzno((String) null, zzny2.zzbec, zzny2.zzbed);
        }
        this.zzbdt = zzno;
        if (str5 != null) {
            String str6 = zzfs.zzze;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str6).length());
            sb.append(str);
            sb.append(".");
            sb.append(str6);
            sb.append(".-1");
            str4 = sb.toString();
        } else {
            str4 = null;
        }
        this.zzbds = str4;
        this.zzbdr = -1;
        this.zzbdu = this.zzbdt == null ? new zznz(new zzno((String) null, 0, -1)) : zznz;
    }

    public final zzno zzgi() {
        return this.zzbdt;
    }

    public final zznd zzgj() {
        return this.zzbdu;
    }

    public final String zzf() {
        return this.zzbds;
    }
}
