package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class zzpb implements zzov {
    private static final Pattern zzbgd = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbge = new AtomicReference<>();
    private zzoz zzazo;
    private boolean zzbfr;
    private final boolean zzbgf;
    private final int zzbgg;
    private final int zzbgh;
    private final String zzbgi;
    private final zzpz<String> zzbgj;
    private final zzpe zzbgk;
    private final zzpe zzbgl;
    private final zzpn<? super zzpb> zzbgm;
    private HttpURLConnection zzbgn;
    private InputStream zzbgo;
    private long zzbgp;
    private long zzbgq;
    private long zzbgr;
    private long zzcd;

    public zzpb(String str, zzpz<String> zzpz, zzpn<? super zzpb> zzpn, int i, int i2, boolean z, zzpe zzpe) {
        if (!TextUtils.isEmpty(str)) {
            this.zzbgi = str;
            this.zzbgj = null;
            this.zzbgm = zzpn;
            this.zzbgl = new zzpe();
            this.zzbgg = i;
            this.zzbgh = i2;
            this.zzbgf = true;
            this.zzbgk = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Uri getUri() {
        if (this.zzbgn == null) {
            return null;
        }
        return Uri.parse(this.zzbgn.getURL().toString());
    }

    public final Map<String, List<String>> getResponseHeaders() {
        if (this.zzbgn == null) {
            return null;
        }
        return this.zzbgn.getHeaderFields();
    }

    public final long zza(zzoz zzoz) throws zzpc {
        HttpURLConnection httpURLConnection;
        HttpURLConnection zza;
        zzoz zzoz2 = zzoz;
        this.zzazo = zzoz2;
        long j = 0;
        this.zzcd = 0;
        this.zzbgr = 0;
        try {
            URL url = new URL(zzoz2.uri.toString());
            byte[] bArr = zzoz2.zzbft;
            long j2 = zzoz2.zzaha;
            long j3 = zzoz2.zzcc;
            boolean zzbg = zzoz2.zzbg(1);
            if (!this.zzbgf) {
                httpURLConnection = zza(url, bArr, j2, j3, zzbg, true);
            } else {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        long j5 = j2;
                        zza = zza(url2, bArr2, j2, j3, zzbg, false);
                        int responseCode = zza.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                            if (bArr2 == null) {
                                if (responseCode != 307) {
                                    if (responseCode != 308) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        bArr2 = null;
                        String headerField = zza.getHeaderField("Location");
                        zza.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if ("https".equals(protocol) || "http".equals(protocol)) {
                                i = i3;
                                j3 = j4;
                                j2 = j5;
                            } else {
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                            }
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
                httpURLConnection = zza;
            }
            this.zzbgn = httpURLConnection;
            try {
                int responseCode2 = this.zzbgn.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.zzbgn.getHeaderFields();
                    zzgw();
                    zzpd zzpd = new zzpd(responseCode2, headerFields, zzoz2);
                    if (responseCode2 == 416) {
                        zzpd.initCause(new zzox(0));
                    }
                    throw zzpd;
                }
                this.zzbgn.getContentType();
                if (responseCode2 == 200 && zzoz2.zzaha != 0) {
                    j = zzoz2.zzaha;
                }
                this.zzbgp = j;
                if (!zzoz2.zzbg(1)) {
                    long j6 = -1;
                    if (zzoz2.zzcc != -1) {
                        this.zzbgq = zzoz2.zzcc;
                    } else {
                        long zzc = zzc(this.zzbgn);
                        if (zzc != -1) {
                            j6 = zzc - this.zzbgp;
                        }
                        this.zzbgq = j6;
                    }
                } else {
                    this.zzbgq = zzoz2.zzcc;
                }
                try {
                    this.zzbgo = this.zzbgn.getInputStream();
                    this.zzbfr = true;
                    if (this.zzbgm != null) {
                        this.zzbgm.zza(this, zzoz2);
                    }
                    return this.zzbgq;
                } catch (IOException e) {
                    zzgw();
                    throw new zzpc(e, zzoz2, 1);
                }
            } catch (IOException e2) {
                zzgw();
                String valueOf2 = String.valueOf(zzoz2.uri.toString());
                throw new zzpc(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), e2, zzoz2, 1);
            }
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(zzoz2.uri.toString());
            throw new zzpc(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e3, zzoz2, 1);
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws zzpc {
        try {
            if (this.zzbgr != this.zzbgp) {
                byte[] andSet = zzbge.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.zzbgr != this.zzbgp) {
                    int read = this.zzbgo.read(andSet, 0, (int) Math.min(this.zzbgp - this.zzbgr, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.zzbgr += (long) read;
                        if (this.zzbgm != null) {
                            this.zzbgm.zzc(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                zzbge.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.zzbgq != -1) {
                long j = this.zzbgq - this.zzcd;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.zzbgo.read(bArr, i, i2);
            if (read2 != -1) {
                this.zzcd += (long) read2;
                if (this.zzbgm != null) {
                    this.zzbgm.zzc(this, read2);
                }
                return read2;
            } else if (this.zzbgq == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new zzpc(e, this.zzazo, 2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 > android.support.p000v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) goto L_0x003b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws com.google.android.gms.internal.ads.zzpc {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.zzbgo     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007c
            java.net.HttpURLConnection r2 = r10.zzbgn     // Catch:{ all -> 0x0092 }
            long r3 = r10.zzbgq     // Catch:{ all -> 0x0092 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r10.zzbgq     // Catch:{ all -> 0x0092 }
            goto L_0x0019
        L_0x0013:
            long r3 = r10.zzbgq     // Catch:{ all -> 0x0092 }
            long r7 = r10.zzcd     // Catch:{ all -> 0x0092 }
            r9 = 0
            long r3 = r3 - r7
        L_0x0019:
            int r7 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ all -> 0x0092 }
            r8 = 19
            if (r7 == r8) goto L_0x0025
            int r7 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ all -> 0x0092 }
            r8 = 20
            if (r7 != r8) goto L_0x006c
        L_0x0025:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006c }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0035
            int r3 = r2.read()     // Catch:{ Exception -> 0x006c }
            r4 = -1
            if (r3 != r4) goto L_0x003b
            goto L_0x006c
        L_0x0035:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006c
        L_0x003b:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006c }
            if (r4 != 0) goto L_0x0053
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006c }
            if (r3 == 0) goto L_0x006c
        L_0x0053:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006c }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            java.io.InputStream r2 = r10.zzbgo     // Catch:{ IOException -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzpc r3 = new com.google.android.gms.internal.ads.zzpc     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzoz r4 = r10.zzazo     // Catch:{ all -> 0x0092 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzoz) r4, (int) r5)     // Catch:{ all -> 0x0092 }
            throw r3     // Catch:{ all -> 0x0092 }
        L_0x007c:
            r10.zzbgo = r0
            r10.zzgw()
            boolean r0 = r10.zzbfr
            if (r0 == 0) goto L_0x0091
            r10.zzbfr = r1
            com.google.android.gms.internal.ads.zzpn<? super com.google.android.gms.internal.ads.zzpb> r0 = r10.zzbgm
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzpn<? super com.google.android.gms.internal.ads.zzpb> r0 = r10.zzbgm
            r0.zze(r10)
            return
        L_0x0091:
            return
        L_0x0092:
            r2 = move-exception
            r10.zzbgo = r0
            r10.zzgw()
            boolean r0 = r10.zzbfr
            if (r0 == 0) goto L_0x00a7
            r10.zzbfr = r1
            com.google.android.gms.internal.ads.zzpn<? super com.google.android.gms.internal.ads.zzpb> r0 = r10.zzbgm
            if (r0 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzpn<? super com.google.android.gms.internal.ads.zzpb> r0 = r10.zzbgm
            r0.zze(r10)
        L_0x00a7:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpb.close():void");
    }

    private final HttpURLConnection zza(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzbgg);
        httpURLConnection.setReadTimeout(this.zzbgh);
        for (Map.Entry next : this.zzbgl.zzgx().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.zzbgi);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zzc(java.net.HttpURLConnection r8) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r8.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0036
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0038
        L_0x0011:
            java.lang.String r1 = "DefaultHttpDataSource"
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected Content-Length ["
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.e(r1, r2)
        L_0x0036:
            r1 = -1
        L_0x0038:
            java.lang.String r3 = "Content-Range"
            java.lang.String r8 = r8.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00d4
            java.util.regex.Pattern r3 = zzbgd
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r4 = r3.find()
            if (r4 == 0) goto L_0x00d4
            r4 = 2
            java.lang.String r4 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x00af }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x00af }
            r6 = 1
            java.lang.String r3 = r3.group(r6)     // Catch:{ NumberFormatException -> 0x00af }
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00af }
            r3 = 0
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            r6 = 0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            r1 = r4
            goto L_0x00d4
        L_0x006f:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00d4
            java.lang.String r3 = "DefaultHttpDataSource"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00af }
            int r6 = r6.length()     // Catch:{ NumberFormatException -> 0x00af }
            int r6 = r6 + 26
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00af }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x00af }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00af }
            r7.<init>(r6)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r6 = "Inconsistent headers ["
            r7.append(r6)     // Catch:{ NumberFormatException -> 0x00af }
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00af }
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x00af }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00af }
            long r3 = java.lang.Math.max(r1, r4)     // Catch:{ NumberFormatException -> 0x00af }
            r1 = r3
            goto L_0x00d4
        L_0x00af:
            java.lang.String r0 = "DefaultHttpDataSource"
            java.lang.String r3 = java.lang.String.valueOf(r8)
            int r3 = r3.length()
            int r3 = r3 + 27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r8)
            java.lang.String r8 = "]"
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            android.util.Log.e(r0, r8)
        L_0x00d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpb.zzc(java.net.HttpURLConnection):long");
    }

    private final void zzgw() {
        if (this.zzbgn != null) {
            try {
                this.zzbgn.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzbgn = null;
        }
    }
}
