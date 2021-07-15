package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzark
public final class zzbfs extends zzbfk {
    private static final Set<String> zzewz = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzexa = new DecimalFormat("#,###");
    private File zzexb;
    private boolean zzexc;

    public zzbfs(zzbdz zzbdz) {
        super(zzbdz);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzaxz.zzeo("Context.getCacheDir() returned null");
            return;
        }
        this.zzexb = new File(cacheDir, "admobVideoStreams");
        if (!this.zzexb.isDirectory() && !this.zzexb.mkdirs()) {
            String valueOf = String.valueOf(this.zzexb.getAbsolutePath());
            zzaxz.zzeo(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzexb = null;
        } else if (!this.zzexb.setReadable(true, false) || !this.zzexb.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.zzexb.getAbsolutePath());
            zzaxz.zzeo(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzexb = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v17, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v18, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v22, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:211|212|213|214|215|216) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f2, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fd, code lost:
        if (r1 < 400) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r3 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020f, code lost:
        if (r3.length() == 0) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0211, code lost:
        r3 = "HTTP request failed. Code: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0217, code lost:
        r3 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r5.append("HTTP status code ");
        r5.append(r1);
        r5.append(" at ");
        r5.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0244, code lost:
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0245, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0246, code lost:
        r15 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0248, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0249, code lost:
        r15 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x024f, code lost:
        if (r7 >= 0) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025b, code lost:
        if (r1.length() == 0) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025d, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0262, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0268, code lost:
        com.google.android.gms.internal.ads.zzaxz.zzeo(r0);
        zza(r9, r12.getAbsolutePath(), "contentLengthMissing", (java.lang.String) null);
        zzewz.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0279, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1 = zzexa.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzwu.zzpz().zzd(com.google.android.gms.internal.ads.zzaan.zzcou)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0291, code lost:
        if (r7 <= r3) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r9);
        com.google.android.gms.internal.ads.zzaxz.zzeo(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02cc, code lost:
        if (r1.length() == 0) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ce, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d3, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d9, code lost:
        zza(r9, r12.getAbsolutePath(), "sizeExceeded", r0);
        zzewz.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e7, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r9);
        com.google.android.gms.internal.ads.zzaxz.zzdn(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzbv.zzlm();
        r17 = r16.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0341, code lost:
        r20 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r10 = new com.google.android.gms.internal.ads.zzbai(((java.lang.Long) com.google.android.gms.internal.ads.zzwu.zzpz().zzd(com.google.android.gms.internal.ads.zzaan.zzcox)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzwu.zzpz().zzd(com.google.android.gms.internal.ads.zzaan.zzcow)).longValue();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035d, code lost:
        r21 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0361, code lost:
        if (r21 < 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0363, code lost:
        r6 = r6 + r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0365, code lost:
        if (r6 <= r3) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0377, code lost:
        if (r2.length() == 0) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0379, code lost:
        r10 = "File too big for full file cache. Size: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0384, code lost:
        r10 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038c, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x038d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038e, code lost:
        r15 = "sizeExceeded";
        r3 = r10;
        r1 = r20;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0395, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0396, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0399, code lost:
        r10 = r4;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a5, code lost:
        if (r2.write(r1) > 0) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a7, code lost:
        r1.clear();
        r25 = ((r16.currentTimeMillis() - r17) > (1000 * r13) ? 1 : ((r16.currentTimeMillis() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b8, code lost:
        if (r25 > 0) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03bc, code lost:
        if (r8.zzexc != false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c2, code lost:
        if (r10.tryAcquire() == false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c4, code lost:
        r11 = r12.getAbsolutePath();
        r26 = r10;
        r10 = com.google.android.gms.internal.ads.zzbat.zztu;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03cc, code lost:
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ce, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d0, code lost:
        r22 = r1;
        r1 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r4 = r11;
        r11 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03eb, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r1 = new com.google.android.gms.internal.ads.zzbfl(r30, r31, r4, r6, r7, false);
        r10.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03f2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f3, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f7, code lost:
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r11 = r5;
        r19 = r6;
        r29 = r7;
        r26 = r10;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x040a, code lost:
        r5 = r11;
        r6 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r10 = r26;
        r15 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041e, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x042b, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x042c, code lost:
        r25 = r4;
        r27 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x045d, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x045e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x045f, code lost:
        r3 = r2.toString();
        r1 = r20;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0466, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0469, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x046f, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0476, code lost:
        if (com.google.android.gms.internal.ads.zzaxz.isLoggable(3) == false) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0478, code lost:
        r1 = zzexa.format((long) r6);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r9);
        com.google.android.gms.internal.ads.zzaxz.zzdn(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04ae, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b7, code lost:
        if (r0.isFile() == false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04b9, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c4, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        zza(r9, r12.getAbsolutePath(), r6);
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04cd, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        zzewz.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04d2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d4, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d6, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d7, code lost:
        r1 = r20;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d9, code lost:
        r10 = r25;
        r15 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04df, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04e3, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04e7, code lost:
        r25 = r4;
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ec, code lost:
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ee, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04f0, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04fa, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04fb, code lost:
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0505, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0506, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0507, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x050a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x050b, code lost:
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x050e, code lost:
        r3 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0512, code lost:
        if ((r0 instanceof java.lang.RuntimeException) != false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0514, code lost:
        com.google.android.gms.ads.internal.zzbv.zzlj().zza(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0522, code lost:
        if (r8.zzexc == false) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0524, code lost:
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r2.append("Preload aborted for URL \"");
        r2.append(r9);
        r2.append("\"");
        com.google.android.gms.internal.ads.zzaxz.zzen(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0548, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r9);
        r4.append("\"");
        com.google.android.gms.internal.ads.zzaxz.zzc(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0577, code lost:
        r2 = java.lang.String.valueOf(r12.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0585, code lost:
        if (r2.length() == 0) goto L_0x058c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0587, code lost:
        r0 = "Could not delete partial cache file at ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x058c, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0592, code lost:
        com.google.android.gms.internal.ads.zzaxz.zzeo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0595, code lost:
        zza(r9, r12.getAbsolutePath(), r15, r3);
        zzewz.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05a2, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x040a, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.zzbv.zzls();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzwu.zzpz().zzd(com.google.android.gms.internal.ads.zzaan.zzcoy)).intValue();
        r3 = new java.net.URL(r9);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (r2 > 20) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0154, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0160, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0162, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.zzbax();
        r6.zza(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.zza(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0179, code lost:
        if ((r7 / 100) != 3) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0181, code lost:
        if (r4 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018c, code lost:
        if (r3 == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        if (r3.equals("http") != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if (r3.equals("https") != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019e, code lost:
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01aa, code lost:
        if (r2.length() == 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ac, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b1, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ba, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bb, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c5, code lost:
        if (r4.length() == 0) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c7, code lost:
        r3 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cc, code lost:
        r3 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d2, code lost:
        com.google.android.gms.internal.ads.zzaxz.zzdn(r3);
        r5.disconnect();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e2, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ea, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ec, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ed, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x04c4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x058c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzex(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.zzexb
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
            r8.zza(r9, r10, r0, r10)
            return r11
        L_0x0010:
            java.io.File r0 = r8.zzexb
            if (r0 != 0) goto L_0x0016
            r3 = 0
            goto L_0x0034
        L_0x0016:
            java.io.File r0 = r8.zzexb
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001f:
            if (r2 >= r1) goto L_0x0034
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x0031
            int r3 = r3 + 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0034:
            com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r0 = com.google.android.gms.internal.ads.zzaan.zzcot
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x009a
            java.io.File r0 = r8.zzexb
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x008d
        L_0x004c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File r2 = r8.zzexb
            java.io.File[] r2 = r2.listFiles()
            int r3 = r2.length
            r4 = r0
            r1 = r10
            r0 = 0
        L_0x005b:
            if (r0 >= r3) goto L_0x0078
            r6 = r2[r0]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0075
            long r12 = r6.lastModified()
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0075
            r1 = r6
            r4 = r12
        L_0x0075:
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0078:
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.delete()
            java.io.File r1 = r8.zzc(r1)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x008d
            boolean r1 = r1.delete()
            r0 = r0 & r1
        L_0x008d:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)
            java.lang.String r0 = "expireFailed"
            r8.zza(r9, r10, r0, r10)
            return r11
        L_0x009a:
            java.lang.String r0 = r30.zzey(r31)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r8.zzexb
            r12.<init>(r1, r0)
            java.io.File r0 = r8.zzc(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00dd
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00dd
            long r0 = r12.length()
            int r0 = (int) r0
            java.lang.String r1 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00cc
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00d2
        L_0x00cc:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00d2:
            com.google.android.gms.internal.ads.zzaxz.zzdn(r1)
            java.lang.String r1 = r12.getAbsolutePath()
            r8.zza((java.lang.String) r9, (java.lang.String) r1, (int) r0)
            return r13
        L_0x00dd:
            java.io.File r1 = r8.zzexb
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00f7
            java.lang.String r1 = r1.concat(r2)
            r14 = r1
            goto L_0x00fd
        L_0x00f7:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r14 = r2
        L_0x00fd:
            java.util.Set<java.lang.String> r1 = zzewz
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = zzewz     // Catch:{ all -> 0x05a3 }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x05a3 }
            if (r2 == 0) goto L_0x012d
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x05a3 }
            int r3 = r2.length()     // Catch:{ all -> 0x05a3 }
            if (r3 == 0) goto L_0x0119
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x05a3 }
            goto L_0x011f
        L_0x0119:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05a3 }
            r2.<init>(r0)     // Catch:{ all -> 0x05a3 }
            r0 = r2
        L_0x011f:
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)     // Catch:{ all -> 0x05a3 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05a3 }
            java.lang.String r2 = "inProgress"
            r8.zza(r9, r0, r2, r10)     // Catch:{ all -> 0x05a3 }
            monitor-exit(r1)     // Catch:{ all -> 0x05a3 }
            return r11
        L_0x012d:
            java.util.Set<java.lang.String> r2 = zzewz     // Catch:{ all -> 0x05a3 }
            r2.add(r14)     // Catch:{ all -> 0x05a3 }
            monitor-exit(r1)     // Catch:{ all -> 0x05a3 }
            java.lang.String r15 = "error"
            com.google.android.gms.ads.internal.zzbv.zzls()     // Catch:{ IOException | RuntimeException -> 0x050a }
            com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzaan.zzcoy     // Catch:{ IOException | RuntimeException -> 0x050a }
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r1 = r1.intValue()     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException | RuntimeException -> 0x050a }
            r2.<init>(r9)     // Catch:{ IOException | RuntimeException -> 0x050a }
            r3 = r2
            r2 = 0
        L_0x014f:
            int r2 = r2 + r13
            r4 = 20
            if (r2 > r4) goto L_0x04fb
            java.net.URLConnection r5 = r3.openConnection()     // Catch:{ IOException | RuntimeException -> 0x050a }
            r5.setConnectTimeout(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            r5.setReadTimeout(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException | RuntimeException -> 0x050a }
            if (r6 == 0) goto L_0x04f0
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException | RuntimeException -> 0x050a }
            com.google.android.gms.internal.ads.zzbax r6 = new com.google.android.gms.internal.ads.zzbax     // Catch:{ IOException | RuntimeException -> 0x050a }
            r6.<init>()     // Catch:{ IOException | RuntimeException -> 0x050a }
            r6.zza((java.net.HttpURLConnection) r5, (byte[]) r10)     // Catch:{ IOException | RuntimeException -> 0x050a }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r7 = r5.getResponseCode()     // Catch:{ IOException | RuntimeException -> 0x050a }
            r6.zza((java.net.HttpURLConnection) r5, (int) r7)     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r7 = r7 / 100
            r6 = 3
            if (r7 != r6) goto L_0x01f0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r4 == 0) goto L_0x01e3
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r6.<init>(r3, r4)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r3 = r6.getProtocol()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r3 == 0) goto L_0x01db
            java.lang.String r7 = "http"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r7 != 0) goto L_0x01bb
            java.lang.String r7 = "https"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r7 != 0) goto L_0x01bb
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r3 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r3 == 0) goto L_0x01b1
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            goto L_0x01b7
        L_0x01b1:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r2.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r1 = r2
        L_0x01b7:
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01eb }
        L_0x01bb:
            java.lang.String r3 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r7 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r7 == 0) goto L_0x01cc
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            goto L_0x01d2
        L_0x01cc:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r4.<init>(r3)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r3 = r4
        L_0x01d2:
            com.google.android.gms.internal.ads.zzaxz.zzdn(r3)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r5.disconnect()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r3 = r6
            goto L_0x014f
        L_0x01db:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01eb }
        L_0x01e3:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
        L_0x01ec:
            r3 = r10
        L_0x01ed:
            r1 = r14
            goto L_0x0510
        L_0x01f0:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException | RuntimeException -> 0x050a }
            if (r1 == 0) goto L_0x024b
            r1 = r5
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r1 = r1.getResponseCode()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x024b
            java.lang.String r2 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r3 = java.lang.Integer.toString(r1)     // Catch:{ IOException | RuntimeException -> 0x0248 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x0248 }
            int r4 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x0248 }
            if (r4 == 0) goto L_0x0217
            java.lang.String r0 = r0.concat(r3)     // Catch:{ IOException | RuntimeException -> 0x0248 }
            r3 = r0
            goto L_0x021c
        L_0x0217:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0248 }
            r3.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0248 }
        L_0x021c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0245 }
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            int r4 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x0245 }
            int r4 = r4 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0245 }
            r5.<init>(r4)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            java.lang.String r4 = "HTTP status code "
            r5.append(r4)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            r5.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            java.lang.String r1 = " at "
            r5.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            r5.append(r9)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException | RuntimeException -> 0x0245 }
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            r15 = r2
            goto L_0x01ed
        L_0x0248:
            r0 = move-exception
            r15 = r2
            goto L_0x01ec
        L_0x024b:
            int r7 = r5.getContentLength()     // Catch:{ IOException | RuntimeException -> 0x050a }
            if (r7 >= 0) goto L_0x027a
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r2 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r2 == 0) goto L_0x0262
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            goto L_0x0268
        L_0x0262:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r0 = r1
        L_0x0268:
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r1 = "contentLengthMissing"
            r8.zza(r9, r0, r1, r10)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.util.Set<java.lang.String> r0 = zzewz     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r0.remove(r14)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            return r11
        L_0x027a:
            java.text.DecimalFormat r1 = zzexa     // Catch:{ IOException | RuntimeException -> 0x050a }
            long r2 = (long) r7     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException | RuntimeException -> 0x050a }
            com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r2 = com.google.android.gms.internal.ads.zzaan.zzcou     // Catch:{ IOException | RuntimeException -> 0x050a }
            com.google.android.gms.internal.ads.zzaak r3 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.Object r2 = r3.zzd(r2)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r3 = r2.intValue()     // Catch:{ IOException | RuntimeException -> 0x050a }
            if (r7 <= r3) goto L_0x02e8
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r0 = r0.length()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r2.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r2.append(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r2.append(r9)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            int r2 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            if (r2 == 0) goto L_0x02d3
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            goto L_0x02d9
        L_0x02d3:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r0 = r1
        L_0x02d9:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.lang.String r2 = "sizeExceeded"
            r8.zza(r9, r1, r2, r0)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            java.util.Set<java.lang.String> r0 = zzewz     // Catch:{ IOException | RuntimeException -> 0x01eb }
            r0.remove(r14)     // Catch:{ IOException | RuntimeException -> 0x01eb }
            return r11
        L_0x02e8:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r2 = r2 + r4
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r4 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x050a }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x050a }
            r4.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.String r2 = "Caching "
            r4.append(r2)     // Catch:{ IOException | RuntimeException -> 0x050a }
            r4.append(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            r4.append(r9)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException | RuntimeException -> 0x050a }
            com.google.android.gms.internal.ads.zzaxz.zzdn(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException | RuntimeException -> 0x050a }
            r4.<init>(r12)     // Catch:{ IOException | RuntimeException -> 0x050a }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            long r17 = r16.currentTimeMillis()     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            com.google.android.gms.internal.ads.zzaac<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaan.zzcox     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            com.google.android.gms.internal.ads.zzaak r10 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            java.lang.Object r6 = r10.zzd(r6)     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException | RuntimeException -> 0x04e6 }
            r20 = r14
            long r13 = r6.longValue()     // Catch:{ IOException | RuntimeException -> 0x04de }
            com.google.android.gms.internal.ads.zzbai r10 = new com.google.android.gms.internal.ads.zzbai     // Catch:{ IOException | RuntimeException -> 0x04de }
            r10.<init>(r13)     // Catch:{ IOException | RuntimeException -> 0x04de }
            com.google.android.gms.internal.ads.zzaac<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzaan.zzcow     // Catch:{ IOException | RuntimeException -> 0x04de }
            com.google.android.gms.internal.ads.zzaak r13 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ IOException | RuntimeException -> 0x04de }
            java.lang.Object r6 = r13.zzd(r6)     // Catch:{ IOException | RuntimeException -> 0x04de }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException | RuntimeException -> 0x04de }
            long r13 = r6.longValue()     // Catch:{ IOException | RuntimeException -> 0x04de }
            r6 = 0
        L_0x035d:
            int r21 = r5.read(r1)     // Catch:{ IOException | RuntimeException -> 0x04de }
            if (r21 < 0) goto L_0x0469
            int r6 = r6 + r21
            if (r6 <= r3) goto L_0x039e
            java.lang.String r1 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ IOException | RuntimeException -> 0x0395 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | RuntimeException -> 0x0395 }
            int r3 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x0395 }
            if (r3 == 0) goto L_0x037f
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException | RuntimeException -> 0x0395 }
            r10 = r0
            goto L_0x0385
        L_0x037f:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0395 }
            r2.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0395 }
            r10 = r2
        L_0x0385:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x038d }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x038d }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x038d }
        L_0x038d:
            r0 = move-exception
            r15 = r1
            r3 = r10
            r1 = r20
            r10 = r4
            goto L_0x0510
        L_0x0395:
            r0 = move-exception
            r15 = r1
            goto L_0x0399
        L_0x0398:
            r0 = move-exception
        L_0x0399:
            r10 = r4
            r1 = r20
            goto L_0x04ee
        L_0x039e:
            r1.flip()     // Catch:{ IOException | RuntimeException -> 0x04de }
        L_0x03a1:
            int r21 = r2.write(r1)     // Catch:{ IOException | RuntimeException -> 0x04de }
            if (r21 > 0) goto L_0x03a1
            r1.clear()     // Catch:{ IOException | RuntimeException -> 0x04de }
            long r21 = r16.currentTimeMillis()     // Catch:{ IOException | RuntimeException -> 0x04de }
            r23 = 0
            long r21 = r21 - r17
            r23 = 1000(0x3e8, double:4.94E-321)
            long r23 = r23 * r13
            int r25 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r25 > 0) goto L_0x042c
            boolean r11 = r8.zzexc     // Catch:{ IOException | RuntimeException -> 0x04de }
            if (r11 != 0) goto L_0x041e
            boolean r11 = r10.tryAcquire()     // Catch:{ IOException | RuntimeException -> 0x04de }
            if (r11 == 0) goto L_0x03f7
            java.lang.String r11 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x04de }
            r26 = r10
            android.os.Handler r10 = com.google.android.gms.internal.ads.zzbat.zztu     // Catch:{ IOException | RuntimeException -> 0x04de }
            r27 = r15
            com.google.android.gms.internal.ads.zzbfl r15 = new com.google.android.gms.internal.ads.zzbfl     // Catch:{ IOException | RuntimeException -> 0x03f2 }
            r21 = 0
            r22 = r1
            r1 = r15
            r23 = r2
            r2 = r30
            r24 = r3
            r3 = r31
            r25 = r4
            r4 = r11
            r11 = r5
            r5 = r6
            r19 = r6
            r28 = 3
            r6 = r7
            r29 = r7
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r10.post(r15)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            goto L_0x040a
        L_0x03f2:
            r0 = move-exception
            r25 = r4
            goto L_0x04d7
        L_0x03f7:
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r11 = r5
            r19 = r6
            r29 = r7
            r26 = r10
            r27 = r15
            r28 = 3
        L_0x040a:
            r5 = r11
            r6 = r19
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r10 = r26
            r15 = r27
            r7 = r29
            r11 = 0
            goto L_0x035d
        L_0x041e:
            r25 = r4
            r27 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0466 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0466 }
        L_0x042c:
            r25 = r4
            r27 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            int r1 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x0466 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0466 }
            r2.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0466 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException | RuntimeException -> 0x0466 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x045e }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x045e }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x045e }
        L_0x045e:
            r0 = move-exception
            r3 = r10
            r1 = r20
            r10 = r25
            goto L_0x0510
        L_0x0466:
            r0 = move-exception
            goto L_0x04e3
        L_0x0469:
            r25 = r4
            r27 = r15
            r28 = 3
            r25.close()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            boolean r1 = com.google.android.gms.internal.ads.zzaxz.isLoggable(r28)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            if (r1 == 0) goto L_0x04ae
            java.text.DecimalFormat r1 = zzexa     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            long r2 = (long) r6     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            int r3 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r3.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r3.append(r1)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r3.append(r9)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            com.google.android.gms.internal.ads.zzaxz.zzdn(r1)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
        L_0x04ae:
            r1 = 0
            r2 = 1
            r12.setReadable(r2, r1)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            boolean r1 = r0.isFile()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            if (r1 == 0) goto L_0x04c1
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r0.setLastModified(r1)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            goto L_0x04c4
        L_0x04c1:
            r0.createNewFile()     // Catch:{ IOException -> 0x04c4 }
        L_0x04c4:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r8.zza((java.lang.String) r9, (java.lang.String) r0, (int) r6)     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            java.util.Set<java.lang.String> r0 = zzewz     // Catch:{ IOException | RuntimeException -> 0x04d6 }
            r1 = r20
            r0.remove(r1)     // Catch:{ IOException | RuntimeException -> 0x04d4 }
            r0 = 1
            return r0
        L_0x04d4:
            r0 = move-exception
            goto L_0x04d9
        L_0x04d6:
            r0 = move-exception
        L_0x04d7:
            r1 = r20
        L_0x04d9:
            r10 = r25
            r15 = r27
            goto L_0x04ee
        L_0x04de:
            r0 = move-exception
            r25 = r4
            r27 = r15
        L_0x04e3:
            r1 = r20
            goto L_0x04ec
        L_0x04e6:
            r0 = move-exception
            r25 = r4
            r1 = r14
            r27 = r15
        L_0x04ec:
            r10 = r25
        L_0x04ee:
            r3 = 0
            goto L_0x0510
        L_0x04f0:
            r1 = r14
            r27 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0506 }
            java.lang.String r2 = "Invalid protocol."
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0506 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0506 }
        L_0x04fb:
            r1 = r14
            r27 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0506 }
            java.lang.String r2 = "Too many redirects (20)"
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0506 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0506 }
        L_0x0506:
            r0 = move-exception
            r15 = r27
            goto L_0x050e
        L_0x050a:
            r0 = move-exception
            r1 = r14
            r27 = r15
        L_0x050e:
            r3 = 0
            r10 = 0
        L_0x0510:
            boolean r2 = r0 instanceof java.lang.RuntimeException
            if (r2 == 0) goto L_0x051d
            com.google.android.gms.internal.ads.zzaxk r2 = com.google.android.gms.ads.internal.zzbv.zzlj()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r2.zza(r0, r4)
        L_0x051d:
            r10.close()     // Catch:{ IOException | NullPointerException -> 0x0520 }
        L_0x0520:
            boolean r2 = r8.zzexc
            if (r2 == 0) goto L_0x0548
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "\""
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.zzaxz.zzen(r0)
            goto L_0x056b
        L_0x0548:
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r2 = r2.length()
            int r2 = r2 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Preload failed for URL \""
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = "\""
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzaxz.zzc(r2, r0)
        L_0x056b:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0595
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x0595
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r2 = r12.getAbsolutePath()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x058c
            java.lang.String r0 = r0.concat(r2)
            goto L_0x0592
        L_0x058c:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x0592:
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)
        L_0x0595:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.zza(r9, r0, r15, r3)
            java.util.Set<java.lang.String> r0 = zzewz
            r0.remove(r1)
            r1 = 0
            return r1
        L_0x05a3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05a3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfs.zzex(java.lang.String):boolean");
    }

    public final void abort() {
        this.zzexc = true;
    }

    private final File zzc(File file) {
        return new File(this.zzexb, String.valueOf(file.getName()).concat(".done"));
    }
}
