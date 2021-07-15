package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

final class zzbpi extends zzbpf {
    private final zzbpg zzfkt = new zzbpg();

    zzbpi() {
    }

    public final void zze(Throwable th) {
        th.printStackTrace();
        List<Throwable> zza = this.zzfkt.zza(th, false);
        if (zza != null) {
            synchronized (zza) {
                for (Throwable printStackTrace : zza) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }

    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> zza = this.zzfkt.zza(th, false);
        if (zza != null) {
            synchronized (zza) {
                for (Throwable printStackTrace : zza) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
