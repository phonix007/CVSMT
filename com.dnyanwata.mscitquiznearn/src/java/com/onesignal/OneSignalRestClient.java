/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$State
 *  java.lang.Throwable
 *  java.net.ConnectException
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.UnknownHostException
 *  java.util.Scanner
 *  org.json.JSONObject
 */
package com.onesignal;

import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.OSThrowable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;
import org.json.JSONObject;

class OneSignalRestClient {
    private static final String BASE_URL = "https://api.onesignal.com/";
    static final String CACHE_KEY_GET_TAGS = "CACHE_KEY_GET_TAGS";
    static final String CACHE_KEY_REMOTE_PARAMS = "CACHE_KEY_REMOTE_PARAMS";
    private static final int GET_TIMEOUT = 60000;
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private static final int TIMEOUT = 120000;

    OneSignalRestClient() {
    }

    private static Thread callResponseHandlerOnFailure(final ResponseHandler responseHandler, final int n, final String string2, final Throwable throwable) {
        if (responseHandler == null) {
            return null;
        }
        Thread thread = new Thread(new Runnable(){

            public void run() {
                responseHandler.onFailure(n, string2, throwable);
            }
        }, "OS_REST_FAILURE_CALLBACK");
        thread.start();
        return thread;
    }

    private static Thread callResponseHandlerOnSuccess(final ResponseHandler responseHandler, final String string2) {
        if (responseHandler == null) {
            return null;
        }
        Thread thread = new Thread(new Runnable(){

            public void run() {
                responseHandler.onSuccess(string2);
            }
        }, "OS_REST_SUCCESS_CALLBACK");
        thread.start();
        return thread;
    }

    public static void get(final String string2, final ResponseHandler responseHandler, final String string3) {
        new Thread(new Runnable(){

            public void run() {
                OneSignalRestClient.makeRequest(string2, null, null, responseHandler, 60000, string3);
            }
        }, "OS_REST_ASYNC_GET").start();
    }

    public static void getSync(String string2, ResponseHandler responseHandler, String string3) {
        OneSignalRestClient.makeRequest(string2, null, null, responseHandler, 60000, string3);
    }

    private static int getThreadTimeout(int n) {
        return n + 5000;
    }

    private static void makeRequest(final String string2, final String string3, final JSONObject jSONObject, final ResponseHandler responseHandler, final int n, final String string4) {
        if (!OSUtils.isRunningOnMainThread()) {
            if (string3 != null && OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName(null)) {
                return;
            }
            final Thread[] arrthread = new Thread[1];
            Runnable runnable = new Runnable(){

                public void run() {
                    arrthread[0] = OneSignalRestClient.startHTTPConnection(string2, string3, jSONObject, responseHandler, n, string4);
                }
            };
            Thread thread = new Thread(runnable, "OS_HTTPConnection");
            thread.start();
            try {
                thread.join((long)OneSignalRestClient.getThreadTimeout(n));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (arrthread[0] != null) {
                    arrthread[0].join();
                    return;
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method: ");
        stringBuilder.append(string3);
        stringBuilder.append(" was called from the Main Thread!");
        throw new OSThrowable.OSMainThreadException(stringBuilder.toString());
    }

    private static HttpURLConnection newHttpURLConnection(String string2) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(BASE_URL);
        stringBuilder.append(string2);
        return (HttpURLConnection)new URL(stringBuilder.toString()).openConnection();
    }

    public static void post(final String string2, final JSONObject jSONObject, final ResponseHandler responseHandler) {
        new Thread(new Runnable(){

            public void run() {
                OneSignalRestClient.makeRequest(string2, "POST", jSONObject, responseHandler, 120000, null);
            }
        }, "OS_REST_ASYNC_POST").start();
    }

    public static void postSync(String string2, JSONObject jSONObject, ResponseHandler responseHandler) {
        OneSignalRestClient.makeRequest(string2, "POST", jSONObject, responseHandler, 120000, null);
    }

    public static void put(final String string2, final JSONObject jSONObject, final ResponseHandler responseHandler) {
        new Thread(new Runnable(){

            public void run() {
                OneSignalRestClient.makeRequest(string2, "PUT", jSONObject, responseHandler, 120000, null);
            }
        }, "OS_REST_ASYNC_PUT").start();
    }

    public static void putSync(String string2, JSONObject jSONObject, ResponseHandler responseHandler) {
        OneSignalRestClient.makeRequest(string2, "PUT", jSONObject, responseHandler, 120000, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static Thread startHTTPConnection(String var0, String var1_1, JSONObject var2_2, ResponseHandler var3_3, int var4_4, String var5_5) {
        block27 : {
            block31 : {
                block30 : {
                    block29 : {
                        block28 : {
                            block32 : {
                                block26 : {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        TrafficStats.setThreadStatsTag((int)10000);
                                    }
                                    var6_6 = -1;
                                    var20_7 = OneSignal.LOG_LEVEL.DEBUG;
                                    var21_8 = new StringBuilder();
                                    var21_8.append("OneSignalRestClient: Making request to: https://api.onesignal.com/");
                                    var21_8.append(var0);
                                    OneSignal.Log(var20_7, var21_8.toString());
                                    var8_9 = OneSignalRestClient.newHttpURLConnection(var0);
                                    var8_9.setUseCaches(false);
                                    var8_9.setConnectTimeout(var4_4);
                                    var8_9.setReadTimeout(var4_4);
                                    var24_10 = new StringBuilder();
                                    var24_10.append("onesignal/android/");
                                    var24_10.append(OneSignal.getSdkVersionRaw());
                                    var8_9.setRequestProperty("SDK-Version", var24_10.toString());
                                    var8_9.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
                                    if (var2_2 != null) {
                                        var8_9.setDoInput(true);
                                    }
                                    if (var1_1 != null) {
                                        var8_9.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                                        var8_9.setRequestMethod(var1_1);
                                        var8_9.setDoOutput(true);
                                    }
                                    if (var2_2 != null) {
                                        var99_11 = var2_2.toString();
                                        var100_12 = OneSignal.LOG_LEVEL.DEBUG;
                                        var101_13 = new StringBuilder();
                                        var101_13.append("OneSignalRestClient: ");
                                        var101_13.append(var1_1);
                                        var101_13.append(" SEND JSON: ");
                                        var101_13.append(var99_11);
                                        OneSignal.Log(var100_12, var101_13.toString());
                                        var106_14 = var99_11.getBytes("UTF-8");
                                        var8_9.setFixedLengthStreamingMode(var106_14.length);
                                        var8_9.getOutputStream().write(var106_14);
                                    }
                                    if (var5_5 != null) {
                                        var90_15 = OneSignalPrefs.PREFS_ONESIGNAL;
                                        var91_16 = new StringBuilder();
                                        var91_16.append("PREFS_OS_ETAG_PREFIX_");
                                        var91_16.append(var5_5);
                                        var94_17 = OneSignalPrefs.getString(var90_15, var91_16.toString(), null);
                                        if (var94_17 != null) {
                                            var8_9.setRequestProperty("if-none-match", var94_17);
                                            var95_18 = OneSignal.LOG_LEVEL.DEBUG;
                                            var96_19 = new StringBuilder();
                                            var96_19.append("OneSignalRestClient: Adding header if-none-match: ");
                                            var96_19.append(var94_17);
                                            OneSignal.Log(var95_18, var96_19.toString());
                                        }
                                    }
                                    var6_6 = var8_9.getResponseCode();
                                    try {
                                        var28_20 = OneSignal.LOG_LEVEL.VERBOSE;
                                        var29_21 = new StringBuilder();
                                        var29_21.append("OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/");
                                        var29_21.append(var0);
                                        OneSignal.Log(var28_20, var29_21.toString());
                                        var32_22 = "";
                                        var33_23 = "GET";
                                        if (var6_6 == 200 || var6_6 == 202) break block26;
                                        if (var6_6 == 304) ** GOTO lbl96
                                    }
                                    catch (Throwable var7_52) {}
                                    var71_24 = OneSignal.LOG_LEVEL.DEBUG;
                                    var72_25 = new StringBuilder();
                                    var72_25.append("OneSignalRestClient: Failed request to: https://api.onesignal.com/");
                                    var72_25.append(var0);
                                    OneSignal.Log(var71_24, var72_25.toString());
                                    var75_26 = var8_9.getErrorStream();
                                    if (var75_26 == null) {
                                        var75_26 = var8_9.getInputStream();
                                    }
                                    if (var75_26 != null) {
                                        var76_27 = new Scanner(var75_26, "UTF-8");
                                        if (var76_27.useDelimiter("\\A").hasNext()) {
                                            var32_22 = var76_27.next();
                                        }
                                        var76_27.close();
                                        var77_28 = OneSignal.LOG_LEVEL.WARN;
                                        var78_29 = new StringBuilder();
                                        var78_29.append("OneSignalRestClient: ");
                                        var78_29.append(var1_1);
                                        var78_29.append(" RECEIVED JSON: ");
                                        var78_29.append(var32_22);
                                        OneSignal.Log(var77_28, var78_29.toString());
                                    } else {
                                        var83_30 = OneSignal.LOG_LEVEL.WARN;
                                        var84_31 = new StringBuilder();
                                        var84_31.append("OneSignalRestClient: ");
                                        var84_31.append(var1_1);
                                        var84_31.append(" HTTP Code: ");
                                        var84_31.append(var6_6);
                                        var84_31.append(" No response body!");
                                        OneSignal.Log(var83_30, var84_31.toString());
                                        var32_22 = null;
                                    }
                                    var14_32 = OneSignalRestClient.callResponseHandlerOnFailure(var3_3, var6_6, var32_22, null);
                                    break block27;
lbl96: // 1 sources:
                                    var60_33 = OneSignalPrefs.PREFS_ONESIGNAL;
                                    var61_34 = new StringBuilder();
                                    var61_34.append("PREFS_OS_HTTP_CACHE_PREFIX_");
                                    var61_34.append(var5_5);
                                    var64_35 = OneSignalPrefs.getString(var60_33, var61_34.toString(), null);
                                    var65_36 = OneSignal.LOG_LEVEL.DEBUG;
                                    var66_37 = new StringBuilder();
                                    var66_37.append("OneSignalRestClient: ");
                                    if (var1_1 != null) break block28;
                                    break block29;
                                }
                                var34_38 = OneSignal.LOG_LEVEL.DEBUG;
                                var35_39 = new StringBuilder();
                                var36_40 = var6_6;
                                try {
                                    var35_39.append("OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/");
                                    var35_39.append(var0);
                                    OneSignal.Log(var34_38, var35_39.toString());
                                    var39_41 = new Scanner(var8_9.getInputStream(), "UTF-8");
                                    if (var39_41.useDelimiter("\\A").hasNext()) {
                                        var32_22 = var39_41.next();
                                    }
                                    var39_41.close();
                                    var40_42 = OneSignal.LOG_LEVEL.DEBUG;
                                    var41_43 = new StringBuilder();
                                    var41_43.append("OneSignalRestClient: ");
                                    if (var1_1 != null) break block30;
                                    break block31;
                                }
                                catch (Throwable var7_51) {
                                    var6_6 = var36_40;
                                    break block32;
                                }
                                break block32;
                                catch (Throwable var7_53) {}
                                break block32;
                                catch (Throwable var7_54) {
                                    var8_9 = null;
                                }
                            }
                            try {
                                if (!(var7_55 instanceof ConnectException) && !(var7_55 instanceof UnknownHostException)) {
                                    var15_56 = OneSignal.LOG_LEVEL.WARN;
                                    var16_57 = new StringBuilder();
                                    var16_57.append("OneSignalRestClient: ");
                                    var16_57.append(var1_1);
                                    var16_57.append(" Error thrown from network stack. ");
                                    OneSignal.Log(var15_56, var16_57.toString(), (Throwable)var7_55);
                                } else {
                                    var10_58 = OneSignal.LOG_LEVEL.INFO;
                                    var11_59 = new StringBuilder();
                                    var11_59.append("OneSignalRestClient: Could not send last request, device is offline. Throwable: ");
                                    var11_59.append(var7_55.getClass().getName());
                                    OneSignal.Log(var10_58, var11_59.toString());
                                }
                                var14_32 = OneSignalRestClient.callResponseHandlerOnFailure(var3_3, var6_6, null, (Throwable)var7_55);
                                if (var8_9 == null) return var14_32;
                            }
                            catch (Throwable var9_60) {
                                if (var8_9 == null) throw var9_60;
                                var8_9.disconnect();
                                throw var9_60;
                            }
                        }
                        var33_23 = var1_1;
                    }
                    var66_37.append(var33_23);
                    var66_37.append(" - Using Cached response due to 304: ");
                    var66_37.append(var64_35);
                    OneSignal.Log(var65_36, var66_37.toString());
                    var14_32 = OneSignalRestClient.callResponseHandlerOnSuccess(var3_3, var64_35);
                    break block27;
                }
                var33_23 = var1_1;
            }
            var41_43.append(var33_23);
            var41_43.append(" RECEIVED JSON: ");
            var41_43.append(var32_22);
            OneSignal.Log(var40_42, var41_43.toString());
            if (var5_5 != null && (var46_44 = var8_9.getHeaderField("etag")) != null) {
                var47_45 = OneSignal.LOG_LEVEL.DEBUG;
                var48_46 = new StringBuilder();
                var48_46.append("OneSignalRestClient: Response has etag of ");
                var48_46.append(var46_44);
                var48_46.append(" so caching the response.");
                OneSignal.Log(var47_45, var48_46.toString());
                var52_47 = OneSignalPrefs.PREFS_ONESIGNAL;
                var53_48 = new StringBuilder();
                var53_48.append("PREFS_OS_ETAG_PREFIX_");
                var53_48.append(var5_5);
                OneSignalPrefs.saveString(var52_47, var53_48.toString(), var46_44);
                var56_49 = OneSignalPrefs.PREFS_ONESIGNAL;
                var57_50 = new StringBuilder();
                var57_50.append("PREFS_OS_HTTP_CACHE_PREFIX_");
                var57_50.append(var5_5);
                OneSignalPrefs.saveString(var56_49, var57_50.toString(), var32_22);
            }
            var14_32 = OneSignalRestClient.callResponseHandlerOnSuccess(var3_3, var32_22);
        }
        if (var8_9 == null) return var14_32;
        var8_9.disconnect();
        return var14_32;
    }

    static abstract class ResponseHandler {
        ResponseHandler() {
        }

        void onFailure(int n, String string2, Throwable throwable) {
        }

        void onSuccess(String string2) {
        }
    }

}

