/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 */
package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.onesignal.OneSignal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class OneSignalPrefs {
    static final String PREFS_EXISTING_PURCHASES = "ExistingPurchases";
    public static final String PREFS_GT_APP_ID = "GT_APP_ID";
    public static final String PREFS_GT_DO_NOT_SHOW_MISSING_GPS = "GT_DO_NOT_SHOW_MISSING_GPS";
    public static final String PREFS_GT_FIREBASE_TRACKING_ENABLED = "GT_FIREBASE_TRACKING_ENABLED";
    public static final String PREFS_GT_PLAYER_ID = "GT_PLAYER_ID";
    public static final String PREFS_GT_REGISTRATION_ID = "GT_REGISTRATION_ID";
    public static final String PREFS_GT_SOUND_ENABLED = "GT_SOUND_ENABLED";
    public static final String PREFS_GT_UNSENT_ACTIVE_TIME = "GT_UNSENT_ACTIVE_TIME";
    public static final String PREFS_GT_VIBRATE_ENABLED = "GT_VIBRATE_ENABLED";
    public static final String PREFS_ONESIGNAL = OneSignal.class.getSimpleName();
    public static final String PREFS_ONESIGNAL_ACCEPTED_NOTIFICATION_LAST = "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST";
    public static final String PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST = "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST";
    public static final String PREFS_ONESIGNAL_EMAIL_ID_LAST = "PREFS_ONESIGNAL_EMAIL_ID_LAST";
    public static final String PREFS_ONESIGNAL_PERMISSION_ACCEPTED_LAST = "ONESIGNAL_PERMISSION_ACCEPTED_LAST";
    public static final String PREFS_ONESIGNAL_PLAYER_ID_LAST = "ONESIGNAL_PLAYER_ID_LAST";
    public static final String PREFS_ONESIGNAL_PUSH_TOKEN_LAST = "ONESIGNAL_PUSH_TOKEN_LAST";
    public static final String PREFS_ONESIGNAL_SUBSCRIPTION = "ONESIGNAL_SUBSCRIPTION";
    public static final String PREFS_ONESIGNAL_SUBSCRIPTION_LAST = "ONESIGNAL_SUBSCRIPTION_LAST";
    public static final String PREFS_ONESIGNAL_SYNCED_SUBSCRIPTION = "ONESIGNAL_SYNCED_SUBSCRIPTION";
    public static final String PREFS_ONESIGNAL_USERSTATE_DEPENDVALYES_ = "ONESIGNAL_USERSTATE_DEPENDVALYES_";
    public static final String PREFS_ONESIGNAL_USERSTATE_SYNCVALYES_ = "ONESIGNAL_USERSTATE_SYNCVALYES_";
    public static final String PREFS_ONESIGNAL_USER_PROVIDED_CONSENT = "ONESIGNAL_USER_PROVIDED_CONSENT";
    public static final String PREFS_OS_ATTRIBUTED_INFLUENCES = "PREFS_OS_ATTRIBUTED_INFLUENCES";
    public static final String PREFS_OS_CACHED_IAMS = "PREFS_OS_CACHED_IAMS";
    public static final String PREFS_OS_CLEAR_GROUP_SUMMARY_CLICK = "OS_CLEAR_GROUP_SUMMARY_CLICK";
    public static final String PREFS_OS_CLICKED_CLICK_IDS_IAMS = "PREFS_OS_CLICKED_CLICK_IDS_IAMS";
    public static final String PREFS_OS_DISABLE_GMS_MISSING_PROMPT = "PREFS_OS_DISABLE_GMS_MISSING_PROMPT";
    public static final String PREFS_OS_DISMISSED_IAMS = "PREFS_OS_DISPLAYED_IAMS";
    public static final String PREFS_OS_EMAIL_ID = "OS_EMAIL_ID";
    public static final String PREFS_OS_ETAG_PREFIX = "PREFS_OS_ETAG_PREFIX_";
    public static final String PREFS_OS_FILTER_OTHER_GCM_RECEIVERS = "OS_FILTER_OTHER_GCM_RECEIVERS";
    public static final String PREFS_OS_HTTP_CACHE_PREFIX = "PREFS_OS_HTTP_CACHE_PREFIX_";
    public static final String PREFS_OS_IMPRESSIONED_IAMS = "PREFS_OS_IMPRESSIONED_IAMS";
    public static final String PREFS_OS_LAST_LOCATION_TIME = "OS_LAST_LOCATION_TIME";
    public static final String PREFS_OS_LAST_SESSION_TIME = "OS_LAST_SESSION_TIME";
    public static final String PREFS_OS_LOCATION_SHARED = "PREFS_OS_LOCATION_SHARED";
    static final String PREFS_OS_OUTCOMES_V2 = "PREFS_OS_OUTCOMES_V2";
    public static final String PREFS_OS_PAGE_IMPRESSIONED_IAMS = "PREFS_OS_PAGE_IMPRESSIONED_IAMS";
    public static final String PREFS_OS_RECEIVE_RECEIPTS_ENABLED = "PREFS_OS_RECEIVE_RECEIPTS_ENABLED";
    public static final String PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT = "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT";
    public static final String PREFS_OS_RESTORE_TTL_FILTER = "OS_RESTORE_TTL_FILTER";
    public static final String PREFS_OS_SMS_ID = "PREFS_OS_SMS_ID";
    public static final String PREFS_OS_SMS_ID_LAST = "PREFS_OS_SMS_ID_LAST";
    public static final String PREFS_OS_SMS_NUMBER_LAST = "PREFS_OS_SMS_NUMBER_LAST";
    public static final String PREFS_OS_UNSENT_ATTRIBUTED_ACTIVE_TIME = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
    public static final String PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED = "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED";
    public static final String PREFS_PLAYER_PURCHASES = "GTPlayerPurchases";
    static final String PREFS_PURCHASE_TOKENS = "purchaseTokens";
    public static final String PREFS_TRIGGERS = "OneSignalTriggers";
    public static WritePrefHandlerThread prefsHandler;
    static HashMap<String, HashMap<String, Object>> prefsToApply;

    static {
        OneSignalPrefs.initializePool();
    }

    OneSignalPrefs() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object get(String string2, String string3, Class class_, Object object) {
        HashMap hashMap;
        HashMap hashMap2 = hashMap = (HashMap)prefsToApply.get((Object)string2);
        synchronized (hashMap2) {
            if (class_.equals(Object.class) && hashMap.containsKey((Object)string3)) {
                return true;
            }
            Object object2 = hashMap.get((Object)string3);
            if (object2 != null) return object2;
            if (!hashMap.containsKey((Object)string3)) {
                // MONITOREXIT [2, 9] lbl8 : w: MONITOREXIT : var9_5
                SharedPreferences sharedPreferences = OneSignalPrefs.getSharedPrefsByName(string2);
                if (sharedPreferences == null) {
                    return object;
                }
                if (class_.equals(String.class)) {
                    return sharedPreferences.getString(string3, (String)object);
                }
                if (class_.equals(Boolean.class)) {
                    return sharedPreferences.getBoolean(string3, ((Boolean)object).booleanValue());
                }
                if (class_.equals(Integer.class)) {
                    return sharedPreferences.getInt(string3, ((Integer)object).intValue());
                }
                if (class_.equals(Long.class)) {
                    return sharedPreferences.getLong(string3, ((Long)object).longValue());
                }
                if (class_.equals(Set.class)) {
                    return sharedPreferences.getStringSet(string3, (Set)object);
                }
                if (!class_.equals(Object.class)) return null;
                return sharedPreferences.contains(string3);
            }
            return object2;
        }
    }

    static boolean getBool(String string2, String string3, boolean bl) {
        return (Boolean)OneSignalPrefs.get(string2, string3, Boolean.class, bl);
    }

    static int getInt(String string2, String string3, int n) {
        return (Integer)OneSignalPrefs.get(string2, string3, Integer.class, n);
    }

    static long getLong(String string2, String string3, long l) {
        return (Long)OneSignalPrefs.get(string2, string3, Long.class, l);
    }

    static Object getObject(String string2, String string3, Object object) {
        return OneSignalPrefs.get(string2, string3, Object.class, object);
    }

    static SharedPreferences getSharedPrefsByName(String string2) {
        Class<OneSignalPrefs> class_ = OneSignalPrefs.class;
        synchronized (OneSignalPrefs.class) {
            block4 : {
                if (OneSignal.appContext != null) break block4;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OneSignal.appContext null, could not read ");
                stringBuilder.append(string2);
                stringBuilder.append(" from getSharedPreferences.");
                String string3 = stringBuilder.toString();
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, string3, new Throwable());
                // ** MonitorExit[var8_1] (shouldn't be in output)
                return null;
            }
            SharedPreferences sharedPreferences = OneSignal.appContext.getSharedPreferences(string2, 0);
            // ** MonitorExit[var8_1] (shouldn't be in output)
            return sharedPreferences;
        }
    }

    static String getString(String string2, String string3, String string4) {
        return (String)OneSignalPrefs.get(string2, string3, String.class, string4);
    }

    public static Set<String> getStringSet(String string2, String string3, Set<String> set) {
        return (Set)OneSignalPrefs.get(string2, string3, Set.class, set);
    }

    public static void initializePool() {
        HashMap hashMap;
        prefsToApply = hashMap = new HashMap();
        hashMap.put((Object)PREFS_ONESIGNAL, (Object)new HashMap());
        prefsToApply.put((Object)PREFS_PLAYER_PURCHASES, (Object)new HashMap());
        prefsToApply.put((Object)PREFS_TRIGGERS, (Object)new HashMap());
        prefsHandler = new WritePrefHandlerThread("OSH_WritePrefs");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void save(String string2, String string3, Object object) {
        HashMap hashMap;
        HashMap hashMap2 = hashMap = (HashMap)prefsToApply.get((Object)string2);
        synchronized (hashMap2) {
            hashMap.put((Object)string3, object);
        }
        OneSignalPrefs.startDelayedWrite();
    }

    public static void saveBool(String string2, String string3, boolean bl) {
        OneSignalPrefs.save(string2, string3, bl);
    }

    public static void saveInt(String string2, String string3, int n) {
        OneSignalPrefs.save(string2, string3, n);
    }

    public static void saveLong(String string2, String string3, long l) {
        OneSignalPrefs.save(string2, string3, l);
    }

    public static void saveObject(String string2, String string3, Object object) {
        OneSignalPrefs.save(string2, string3, object);
    }

    public static void saveString(String string2, String string3, String string4) {
        OneSignalPrefs.save(string2, string3, string4);
    }

    public static void saveStringSet(String string2, String string3, Set<String> set) {
        OneSignalPrefs.save(string2, string3, set);
    }

    public static void startDelayedWrite() {
        OneSignalPrefs.prefsHandler.startDelayedWrite();
    }

    public static class WritePrefHandlerThread
    extends HandlerThread {
        private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
        private long lastSyncTime = 0L;
        private Handler mHandler;
        private boolean threadStartCalled;

        WritePrefHandlerThread(String string2) {
            super(string2);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void flushBufferToDisk() {
            Iterator iterator = OneSignalPrefs.prefsToApply.keySet().iterator();
            do {
                HashMap hashMap;
                if (!iterator.hasNext()) {
                    this.lastSyncTime = OneSignal.getTime().getCurrentTimeMillis();
                    return;
                }
                String string2 = (String)iterator.next();
                SharedPreferences.Editor editor = OneSignalPrefs.getSharedPrefsByName(string2).edit();
                HashMap hashMap2 = hashMap = (HashMap)OneSignalPrefs.prefsToApply.get((Object)string2);
                synchronized (hashMap2) {
                    for (String string3 : hashMap.keySet()) {
                        Object object = hashMap.get((Object)string3);
                        if (object instanceof String) {
                            editor.putString(string3, (String)object);
                            continue;
                        }
                        if (object instanceof Boolean) {
                            editor.putBoolean(string3, ((Boolean)object).booleanValue());
                            continue;
                        }
                        if (object instanceof Integer) {
                            editor.putInt(string3, ((Integer)object).intValue());
                            continue;
                        }
                        if (object instanceof Long) {
                            editor.putLong(string3, ((Long)object).longValue());
                            continue;
                        }
                        if (!(object instanceof Set)) continue;
                        editor.putStringSet(string3, (Set)object);
                    }
                    hashMap.clear();
                }
                editor.apply();
            } while (true);
        }

        private void scheduleFlushToDisk() {
            WritePrefHandlerThread writePrefHandlerThread = this;
            synchronized (writePrefHandlerThread) {
                Handler handler;
                block5 : {
                    handler = this.mHandler;
                    if (handler != null) break block5;
                    return;
                }
                handler.removeCallbacksAndMessages(null);
                if (this.lastSyncTime == 0L) {
                    this.lastSyncTime = OneSignal.getTime().getCurrentTimeMillis();
                }
                long l = 200L + (this.lastSyncTime - OneSignal.getTime().getCurrentTimeMillis());
                Runnable runnable = new Runnable(){

                    public void run() {
                        WritePrefHandlerThread.this.flushBufferToDisk();
                    }
                };
                this.mHandler.postDelayed(runnable, l);
                return;
            }
        }

        private void startDelayedWrite() {
            WritePrefHandlerThread writePrefHandlerThread = this;
            synchronized (writePrefHandlerThread) {
                block4 : {
                    Context context = OneSignal.appContext;
                    if (context != null) break block4;
                    return;
                }
                this.startThread();
                this.scheduleFlushToDisk();
                return;
            }
        }

        private void startThread() {
            if (this.threadStartCalled) {
                return;
            }
            this.start();
            this.threadStartCalled = true;
        }

        protected void onLooperPrepared() {
            super.onLooperPrepared();
            this.mHandler = new Handler(this.getLooper());
            this.scheduleFlushToDisk();
        }

    }

}

