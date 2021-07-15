package com.google.android.gms.internal.ads;

final class zzbdb implements Runnable {
    private final /* synthetic */ zzbcx zzeqv;
    private final /* synthetic */ String zzeqw;
    private final /* synthetic */ String zzeqx;

    zzbdb(zzbcx zzbcx, String str, String str2) {
        this.zzeqv = zzbcx;
        this.zzeqw = str;
        this.zzeqx = str2;
    }

    public final void run() {
        if (this.zzeqv.zzeqt != null) {
            this.zzeqv.zzeqt.zzi(this.zzeqw, this.zzeqx);
        }
    }
}
