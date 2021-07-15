/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Build
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.util.LinkedList
 *  java.util.List
 */
package com.onesignal.shortcutbadger;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public final class ShortcutBadger {
    private static final List<Class<? extends Badger>> BADGERS;
    private static final String LOG_TAG = "ShortcutBadger";
    private static final int SUPPORTED_CHECK_ATTEMPTS = 3;
    private static ComponentName sComponentName;
    private static final Object sCounterSupportedLock;
    private static volatile Boolean sIsBadgeCounterSupported;
    private static Badger sShortcutBadger;

    static {
        LinkedList linkedList;
        BADGERS = linkedList = new LinkedList();
        sCounterSupportedLock = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    private ShortcutBadger() {
    }

    public static boolean applyCount(Context context, int n) {
        try {
            ShortcutBadger.applyCountOrThrow(context, n);
            return true;
        }
        catch (ShortcutBadgeException shortcutBadgeException) {
            if (Log.isLoggable((String)LOG_TAG, (int)3)) {
                Log.d((String)LOG_TAG, (String)"Unable to execute badge", (Throwable)shortcutBadgeException);
            }
            return false;
        }
    }

    public static void applyCountOrThrow(Context context, int n) throws ShortcutBadgeException {
        if (sShortcutBadger == null && !ShortcutBadger.initBadger(context)) {
            throw new ShortcutBadgeException("No default launcher available");
        }
        try {
            sShortcutBadger.executeBadge(context, sComponentName, n);
            return;
        }
        catch (Exception exception) {
            throw new ShortcutBadgeException("Unable to execute badge", exception);
        }
    }

    public static void applyNotification(Context context, Notification notification, int n) {
        block3 : {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                try {
                    Object object = notification.getClass().getDeclaredField("extraNotification").get((Object)notification);
                    Class class_ = object.getClass();
                    Class[] arrclass = new Class[]{Integer.TYPE};
                    Method method = class_.getDeclaredMethod("setMessageCount", arrclass);
                    Object[] arrobject = new Object[]{n};
                    method.invoke(object, arrobject);
                    return;
                }
                catch (Exception exception) {
                    if (!Log.isLoggable((String)LOG_TAG, (int)3)) break block3;
                    Log.d((String)LOG_TAG, (String)"Unable to execute badge", (Throwable)exception);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    private static boolean initBadger(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl81.1 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean isBadgeCounterSupported(Context context) {
        if (sIsBadgeCounterSupported == null) {
            Object object;
            Object object2 = object = sCounterSupportedLock;
            synchronized (object2) {
                Boolean bl = sIsBadgeCounterSupported;
                if (bl == null) {
                    String string2 = null;
                    for (int i = 0; i < 3; ++i) {
                        try {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Checking if platform supports badge counters, attempt ");
                            Object[] arrobject = new Object[]{i + 1, 3};
                            stringBuilder.append(String.format((String)"%d/%d.", (Object[])arrobject));
                            Log.i((String)LOG_TAG, (String)stringBuilder.toString());
                            if (ShortcutBadger.initBadger(context)) {
                                sShortcutBadger.executeBadge(context, sComponentName, 0);
                                sIsBadgeCounterSupported = true;
                                Log.i((String)LOG_TAG, (String)"Badge counter is supported in this platform.");
                                break;
                            }
                            string2 = "Failed to initialize the badge counter.";
                            continue;
                        }
                        catch (Exception exception) {
                            string2 = exception.getMessage();
                        }
                    }
                    if (sIsBadgeCounterSupported == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Badge counter seems not supported for this platform: ");
                        stringBuilder.append(string2);
                        Log.w((String)LOG_TAG, (String)stringBuilder.toString());
                        sIsBadgeCounterSupported = false;
                    }
                }
            }
        }
        return sIsBadgeCounterSupported;
    }

    public static boolean removeCount(Context context) {
        return ShortcutBadger.applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) throws ShortcutBadgeException {
        ShortcutBadger.applyCountOrThrow(context, 0);
    }
}

