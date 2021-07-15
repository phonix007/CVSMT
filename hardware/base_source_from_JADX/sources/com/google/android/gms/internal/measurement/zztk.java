package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.util.List;

final class zztk extends zzth {
    private final zzti zzbsu = new zzti();

    zztk() {
    }

    public final void zza(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> zza = this.zzbsu.zza(th, false);
        if (zza != null) {
            synchronized (zza) {
                for (Throwable printStackTrace : zza) {
                    printStream.print("Suppressed: ");
                    printStackTrace.printStackTrace(printStream);
                }
            }
        }
    }
}
