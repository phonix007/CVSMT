package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class zzam implements zzb {
    private final Map<String, zzan> zzbw;
    private long zzbx;
    private final File zzby;
    private final int zzbz;

    public zzam(File file, int i) {
        this.zzbw = new LinkedHashMap(16, 0.75f, true);
        this.zzbx = 0;
        this.zzby = file;
        this.zzbz = i;
    }

    public zzam(File file) {
        this(file, 5242880);
    }

    public final synchronized zzc zza(String str) {
        zzao zzao;
        zzan zzan = this.zzbw.get(str);
        if (zzan == null) {
            return null;
        }
        File zze = zze(str);
        try {
            zzao = new zzao(new BufferedInputStream(zza(zze)), zze.length());
            zzan zzc = zzan.zzc(zzao);
            if (!TextUtils.equals(str, zzc.zzcb)) {
                zzaf.m27d("%s: key=%s, found=%s", zze.getAbsolutePath(), str, zzc.zzcb);
                removeEntry(str);
                zzao.close();
                return null;
            }
            byte[] zza = zza(zzao, zzao.zzp());
            zzc zzc2 = new zzc();
            zzc2.data = zza;
            zzc2.zza = zzan.zza;
            zzc2.zzb = zzan.zzb;
            zzc2.zzc = zzan.zzc;
            zzc2.zzd = zzan.zzd;
            zzc2.zze = zzan.zze;
            List<zzl> list = zzan.zzg;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzl next : list) {
                treeMap.put(next.getName(), next.getValue());
            }
            zzc2.zzf = treeMap;
            zzc2.zzg = Collections.unmodifiableList(zzan.zzg);
            zzao.close();
            return zzc2;
        } catch (IOException e) {
            zzaf.m27d("%s: %s", zze.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        } catch (Throwable th) {
            zzao.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.zzby     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.zzby     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.zzby     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzaf.m28e(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.zzby     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.zzao r6 = new com.google.android.gms.internal.ads.zzao     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = zza((java.io.File) r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.zzan r7 = com.google.android.gms.internal.ads.zzan.zzc(r6)     // Catch:{ all -> 0x0054 }
            r7.zzca = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.zzcb     // Catch:{ all -> 0x0054 }
            r9.zza((java.lang.String) r4, (com.google.android.gms.internal.ads.zzan) r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzam.zza():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(1:36)|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        if (r3.delete() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        com.google.android.gms.internal.ads.zzaf.m27d("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ff */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(java.lang.String r20, com.google.android.gms.internal.ads.zzc r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            monitor-enter(r19)
            byte[] r3 = r2.data     // Catch:{ all -> 0x0116 }
            int r3 = r3.length     // Catch:{ all -> 0x0116 }
            long r4 = r1.zzbx     // Catch:{ all -> 0x0116 }
            long r6 = (long) r3     // Catch:{ all -> 0x0116 }
            long r4 = r4 + r6
            int r3 = r1.zzbz     // Catch:{ all -> 0x0116 }
            long r8 = (long) r3     // Catch:{ all -> 0x0116 }
            r10 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00c1
            boolean r4 = com.google.android.gms.internal.ads.zzaf.DEBUG     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "Pruning old cache entries."
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zzaf.m29v(r4, r5)     // Catch:{ all -> 0x0116 }
        L_0x0021:
            long r4 = r1.zzbx     // Catch:{ all -> 0x0116 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0116 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zzan> r11 = r1.zzbw     // Catch:{ all -> 0x0116 }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0116 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0116 }
            r12 = 0
        L_0x0032:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0116 }
            r14 = 2
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0116 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x0116 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zzan r13 = (com.google.android.gms.internal.ads.zzan) r13     // Catch:{ all -> 0x0116 }
            java.lang.String r15 = r13.zzcb     // Catch:{ all -> 0x0116 }
            java.io.File r15 = r1.zze(r15)     // Catch:{ all -> 0x0116 }
            boolean r15 = r15.delete()     // Catch:{ all -> 0x0116 }
            if (r15 == 0) goto L_0x005e
            r16 = r4
            long r3 = r1.zzbx     // Catch:{ all -> 0x0116 }
            r18 = r11
            long r10 = r13.zzca     // Catch:{ all -> 0x0116 }
            r5 = 0
            long r3 = r3 - r10
            r1.zzbx = r3     // Catch:{ all -> 0x0116 }
            goto L_0x0077
        L_0x005e:
            r16 = r4
            r18 = r11
            java.lang.String r3 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r13.zzcb     // Catch:{ all -> 0x0116 }
            r10 = 0
            r4[r10] = r5     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r13.zzcb     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = zzd(r5)     // Catch:{ all -> 0x0116 }
            r10 = 1
            r4[r10] = r5     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zzaf.m27d(r3, r4)     // Catch:{ all -> 0x0116 }
        L_0x0077:
            r18.remove()     // Catch:{ all -> 0x0116 }
            int r12 = r12 + 1
            long r3 = r1.zzbx     // Catch:{ all -> 0x0116 }
            r5 = 0
            long r3 = r3 + r6
            float r3 = (float) r3     // Catch:{ all -> 0x0116 }
            int r4 = r1.zzbz     // Catch:{ all -> 0x0116 }
            float r4 = (float) r4     // Catch:{ all -> 0x0116 }
            r5 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            r4 = r16
            r11 = r18
            r10 = 0
            goto L_0x0032
        L_0x0094:
            r16 = r4
        L_0x0096:
            boolean r3 = com.google.android.gms.internal.ads.zzaf.DEBUG     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0116 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0116 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0116 }
            long r5 = r1.zzbx     // Catch:{ all -> 0x0116 }
            r7 = 0
            long r5 = r5 - r16
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0116 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0116 }
            r7 = 0
            long r5 = r5 - r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            r4[r14] = r5     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zzaf.m29v(r3, r4)     // Catch:{ all -> 0x0116 }
        L_0x00c1:
            java.io.File r3 = r19.zze(r20)     // Catch:{ all -> 0x0116 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ff }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ff }
            r5.<init>(r3)     // Catch:{ IOException -> 0x00ff }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00ff }
            com.google.android.gms.internal.ads.zzan r5 = new com.google.android.gms.internal.ads.zzan     // Catch:{ IOException -> 0x00ff }
            r5.<init>(r0, r2)     // Catch:{ IOException -> 0x00ff }
            boolean r6 = r5.zza(r4)     // Catch:{ IOException -> 0x00ff }
            if (r6 == 0) goto L_0x00e7
            byte[] r2 = r2.data     // Catch:{ IOException -> 0x00ff }
            r4.write(r2)     // Catch:{ IOException -> 0x00ff }
            r4.close()     // Catch:{ IOException -> 0x00ff }
            r1.zza((java.lang.String) r0, (com.google.android.gms.internal.ads.zzan) r5)     // Catch:{ IOException -> 0x00ff }
            monitor-exit(r19)
            return
        L_0x00e7:
            r4.close()     // Catch:{ IOException -> 0x00ff }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00ff }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00ff }
            r5 = 0
            r4[r5] = r2     // Catch:{ IOException -> 0x00ff }
            com.google.android.gms.internal.ads.zzaf.m27d(r0, r4)     // Catch:{ IOException -> 0x00ff }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ff }
            r0.<init>()     // Catch:{ IOException -> 0x00ff }
            throw r0     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "Could not clean up file %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0116 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zzaf.m27d(r0, r2)     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r19)
            return
        L_0x0116:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzam.zza(java.lang.String, com.google.android.gms.internal.ads.zzc):void");
    }

    private final synchronized void remove(String str) {
        boolean delete = zze(str).delete();
        removeEntry(str);
        if (!delete) {
            zzaf.m27d("Could not delete cache entry for key=%s, filename=%s", str, zzd(str));
        }
    }

    private static String zzd(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File zze(String str) {
        return new File(this.zzby, zzd(str));
    }

    private final void zza(String str, zzan zzan) {
        if (!this.zzbw.containsKey(str)) {
            this.zzbx += zzan.zzca;
        } else {
            this.zzbx += zzan.zzca - this.zzbw.get(str).zzca;
        }
        this.zzbw.put(str, zzan);
    }

    private final void removeEntry(String str) {
        zzan remove = this.zzbw.remove(str);
        if (remove != null) {
            this.zzbx -= remove.zzca;
        }
    }

    private static byte[] zza(zzao zzao, long j) throws IOException {
        long zzp = zzao.zzp();
        if (j >= 0 && j <= zzp) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzao).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zzp);
        throw new IOException(sb.toString());
    }

    private static InputStream zza(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static int zzb(InputStream inputStream) throws IOException {
        return (zza(inputStream) << 24) | zza(inputStream) | 0 | (zza(inputStream) << 8) | (zza(inputStream) << 16);
    }

    static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static long zzc(InputStream inputStream) throws IOException {
        return (((long) zza(inputStream)) & 255) | 0 | ((((long) zza(inputStream)) & 255) << 8) | ((((long) zza(inputStream)) & 255) << 16) | ((((long) zza(inputStream)) & 255) << 24) | ((((long) zza(inputStream)) & 255) << 32) | ((((long) zza(inputStream)) & 255) << 40) | ((((long) zza(inputStream)) & 255) << 48) | ((255 & ((long) zza(inputStream))) << 56);
    }

    static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zza(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static String zza(zzao zzao) throws IOException {
        return new String(zza(zzao, zzc(zzao)), "UTF-8");
    }

    static List<zzl> zzb(zzao zzao) throws IOException {
        int zzb = zzb((InputStream) zzao);
        if (zzb >= 0) {
            List<zzl> emptyList = zzb == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < zzb; i++) {
                emptyList.add(new zzl(zza(zzao).intern(), zza(zzao).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(zzb);
        throw new IOException(sb.toString());
    }
}
