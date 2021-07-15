package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzark
public final class zzald implements zzakp {
    private final Context mContext;
    private final Object mLock = new Object();
    private final long mStartTime;
    private final zzaba zzbln;
    private final zzalg zzbma;
    private final boolean zzbum;
    private final zzakr zzdmn;
    private final boolean zzdms;
    private final boolean zzdmt;
    private final zzasi zzdnh;
    private final long zzdni;
    private boolean zzdnk = false;
    private final String zzdnm;
    private List<zzakx> zzdnn = new ArrayList();
    private zzaku zzdnr;

    public zzald(Context context, zzasi zzasi, zzalg zzalg, zzakr zzakr, boolean z, boolean z2, String str, long j, long j2, zzaba zzaba, boolean z3) {
        this.mContext = context;
        this.zzdnh = zzasi;
        this.zzbma = zzalg;
        this.zzdmn = zzakr;
        this.zzbum = z;
        this.zzdms = z2;
        this.zzdnm = str;
        this.mStartTime = j;
        this.zzdni = j2;
        this.zzbln = zzaba;
        this.zzdmt = z3;
    }

    public final zzakx zzh(List<zzakq> list) {
        Object obj;
        zzakx zzakx;
        zzaxz.zzdn("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzaay zzrg = this.zzbln.zzrg();
        zzwf zzwf = this.zzdnh.zzbst;
        int[] iArr = new int[2];
        if (zzwf.zzckm != null) {
            zzbv.zzlz();
            if (zzakz.zza(this.zzdnm, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                zzwf[] zzwfArr = zzwf.zzckm;
                int length = zzwfArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    zzwf zzwf2 = zzwfArr[i3];
                    if (i == zzwf2.width && i2 == zzwf2.height) {
                        zzwf = zzwf2;
                        break;
                    }
                    i3++;
                }
            }
        }
        Iterator<zzakq> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            zzakq next = it.next();
            String valueOf = String.valueOf(next.zzdkv);
            zzaxz.zzen(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            Iterator<String> it2 = next.zzdkw.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next2 = it2.next();
                    zzaay zzrg2 = this.zzbln.zzrg();
                    Object obj2 = this.mLock;
                    synchronized (obj2) {
                        try {
                            if (this.zzdnk) {
                                zzakx = new zzakx(-1);
                            } else {
                                Iterator<zzakq> it3 = it;
                                Iterator<String> it4 = it2;
                                zzaay zzaay = zzrg;
                                zzaay zzaay2 = zzrg2;
                                zzaku zzaku = r11;
                                obj = obj2;
                                try {
                                    zzaku zzaku2 = new zzaku(this.mContext, next2, this.zzbma, this.zzdmn, next, this.zzdnh.zzdwg, zzwf, this.zzdnh.zzbsp, this.zzbum, this.zzdms, this.zzdnh.zzbti, this.zzdnh.zzbtt, this.zzdnh.zzdwu, this.zzdnh.zzdxp, this.zzdmt);
                                    this.zzdnr = zzaku;
                                    zzakx zzj = this.zzdnr.zzj(this.mStartTime, this.zzdni);
                                    this.zzdnn.add(zzj);
                                    if (zzj.zzdna == 0) {
                                        zzaxz.zzdn("Adapter succeeded.");
                                        this.zzbln.zzg("mediation_network_succeed", next2);
                                        if (!arrayList.isEmpty()) {
                                            this.zzbln.zzg("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.zzbln.zza(zzaay2, "mls");
                                        this.zzbln.zza(zzaay, "ttm");
                                        return zzj;
                                    }
                                    zzaay zzaay3 = zzaay;
                                    int i5 = zzj.zzdna;
                                    arrayList.add(next2);
                                    this.zzbln.zza(zzaay2, "mlf");
                                    if (zzj.zzdnc != null) {
                                        zzayh.zzelc.post(new zzale(this, zzj));
                                    }
                                    zzrg = zzaay3;
                                    i4 = i5;
                                    it = it3;
                                    it2 = it4;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return zzakx;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.zzbln.zzg("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcxm)).booleanValue()) {
            return new zzakx(i4);
        }
        return new zzakx(1);
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzdnk = true;
            if (this.zzdnr != null) {
                this.zzdnr.cancel();
            }
        }
    }

    public final List<zzakx> zzui() {
        return this.zzdnn;
    }
}
