package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbne;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzbkb {
    private static final Logger logger = Logger.getLogger(zzbkb.class.getName());
    private static final ConcurrentMap<String, zzbjt> zzfdi = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzfdj = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzbjn> zzfdk = new ConcurrentHashMap();

    public static synchronized <P> void zza(String str, zzbjn<P> zzbjn) throws GeneralSecurityException {
        synchronized (zzbkb.class) {
            if (!zzfdk.containsKey(str.toLowerCase()) || zzbjn.getClass().equals(((zzbjn) zzfdk.get(str.toLowerCase())).getClass())) {
                zzfdk.put(str.toLowerCase(), zzbjn);
            } else {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger2.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    public static <P> zzbjn<P> zzfi(String str) throws GeneralSecurityException {
        if (str != null) {
            zzbjn<P> zzbjn = (zzbjn) zzfdk.get(str.toLowerCase());
            if (zzbjn != null) {
                return zzbjn;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static synchronized <P> void zza(zzbjt<P> zzbjt) throws GeneralSecurityException {
        synchronized (zzbkb.class) {
            zza(zzbjt, true);
        }
    }

    public static synchronized <P> void zza(zzbjt<P> zzbjt, boolean z) throws GeneralSecurityException {
        synchronized (zzbkb.class) {
            if (zzbjt != null) {
                String keyType = zzbjt.getKeyType();
                if (zzfdi.containsKey(keyType)) {
                    zzbjt zzfj = zzfj(keyType);
                    boolean booleanValue = ((Boolean) zzfdj.get(keyType)).booleanValue();
                    if (!zzbjt.getClass().equals(zzfj.getClass()) || (!booleanValue && z)) {
                        Logger logger2 = logger;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(keyType);
                        logger2.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{keyType, zzfj.getClass().getName(), zzbjt.getClass().getName()}));
                    }
                }
                zzfdi.put(keyType, zzbjt);
                zzfdj.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    private static <P> zzbjt<P> zzfj(String str) throws GeneralSecurityException {
        zzbjt<P> zzbjt = (zzbjt) zzfdi.get(str);
        if (zzbjt != null) {
            return zzbjt;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized <P> zzbmv zza(zzbna zzbna) throws GeneralSecurityException {
        zzbmv zzc;
        synchronized (zzbkb.class) {
            zzbjt zzfj = zzfj(zzbna.zzaig());
            if (((Boolean) zzfdj.get(zzbna.zzaig())).booleanValue()) {
                zzc = zzfj.zzc(zzbna.zzaih());
            } else {
                String valueOf = String.valueOf(zzbna.zzaig());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzc;
    }

    public static synchronized <P> zzbsl zzb(zzbna zzbna) throws GeneralSecurityException {
        zzbsl zzb;
        synchronized (zzbkb.class) {
            zzbjt zzfj = zzfj(zzbna.zzaig());
            if (((Boolean) zzfdj.get(zzbna.zzaig())).booleanValue()) {
                zzb = zzfj.zzb(zzbna.zzaih());
            } else {
                String valueOf = String.valueOf(zzbna.zzaig());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzb;
    }

    public static synchronized <P> zzbsl zza(String str, zzbsl zzbsl) throws GeneralSecurityException {
        zzbsl zzb;
        synchronized (zzbkb.class) {
            zzbjt zzfj = zzfj(str);
            if (((Boolean) zzfdj.get(str)).booleanValue()) {
                zzb = zzfj.zzb(zzbsl);
            } else {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzb;
    }

    public static <P> P zzb(String str, zzbsl zzbsl) throws GeneralSecurityException {
        return zzfj(str).zza(zzbsl);
    }

    private static <P> P zza(String str, zzbpu zzbpu) throws GeneralSecurityException {
        return zzfj(str).zza(zzbpu);
    }

    public static <P> P zza(String str, byte[] bArr) throws GeneralSecurityException {
        return zza(str, zzbpu.zzr(bArr));
    }

    public static <P> zzbjz<P> zza(zzbju zzbju, zzbjt<P> zzbjt) throws GeneralSecurityException {
        zzbkc.zzc(zzbju.zzafp());
        zzbjz<P> zzbjz = new zzbjz<>();
        for (zzbne.zzb next : zzbju.zzafp().zzaiv()) {
            if (next.zzaja() == zzbmy.ENABLED) {
                zzbka<P> zza = zzbjz.zza(zza(next.zzaiz().zzaig(), next.zzaiz().zzaih()), next);
                if (next.zzajb() == zzbju.zzafp().zzaiu()) {
                    zzbjz.zza(zza);
                }
            }
        }
        return zzbjz;
    }
}
