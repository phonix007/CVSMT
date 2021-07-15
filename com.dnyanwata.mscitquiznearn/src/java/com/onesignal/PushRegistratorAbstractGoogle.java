/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.onesignal.GooglePlayServicesUpgradePrompt
 *  com.onesignal.OSUtils
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.PushRegistrator
 *  com.onesignal.PushRegistrator$RegisteredHandler
 *  com.onesignal.PushRegistratorAbstractGoogle$1
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.GooglePlayServicesUpgradePrompt;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;
import com.onesignal.PushRegistratorAbstractGoogle;
import java.io.IOException;

abstract class PushRegistratorAbstractGoogle
implements PushRegistrator {
    private static int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static int REGISTRATION_RETRY_COUNT = 5;
    private boolean firedCallback;
    private Thread registerThread;
    private PushRegistrator.RegisteredHandler registeredHandler;

    PushRegistratorAbstractGoogle() {
    }

    static /* synthetic */ int access$000() {
        return REGISTRATION_RETRY_COUNT;
    }

    static /* synthetic */ boolean access$100(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, String string2, int n) {
        return pushRegistratorAbstractGoogle.attemptRegistration(string2, n);
    }

    static /* synthetic */ int access$200() {
        return REGISTRATION_RETRY_BACKOFF_MS;
    }

    private boolean attemptRegistration(String string2, int n) {
        try {
            String string3 = this.getToken(string2);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Device registered, push token = ");
            stringBuilder.append(string3);
            OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            this.registeredHandler.complete(string3, 1);
            return true;
        }
        catch (Throwable throwable) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown error getting ");
            stringBuilder.append(this.getProviderName());
            stringBuilder.append(" Token");
            OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString(), (Throwable)throwable);
            this.registeredHandler.complete(null, -12);
            return true;
        }
        catch (IOException iOException) {
            if (!"SERVICE_NOT_AVAILABLE".equals((Object)iOException.getMessage())) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error Getting ");
                stringBuilder.append(this.getProviderName());
                stringBuilder.append(" Token");
                OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString(), (Throwable)iOException);
                if (!this.firedCallback) {
                    this.registeredHandler.complete(null, -11);
                }
                return true;
            }
            if (n >= REGISTRATION_RETRY_COUNT - 1) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Retry count of ");
                stringBuilder.append(REGISTRATION_RETRY_COUNT);
                stringBuilder.append(" exceed! Could not get a ");
                stringBuilder.append(this.getProviderName());
                stringBuilder.append(" Token.");
                OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString(), (Throwable)iOException);
            } else {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("'Google Play services' returned SERVICE_NOT_AVAILABLE error. Current retry count: ");
                stringBuilder.append(n);
                OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString(), (Throwable)iOException);
                if (n == 2) {
                    this.registeredHandler.complete(null, -9);
                    this.firedCallback = true;
                    return true;
                }
            }
            return false;
        }
    }

    private void internalRegisterForPush(String string2) {
        try {
            if (OSUtils.isGMSInstalledAndEnabled()) {
                this.registerInBackground(string2);
                return;
            }
            GooglePlayServicesUpgradePrompt.showUpdateGPSDialog();
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"'Google Play services' app not installed or disabled on the device.");
            this.registeredHandler.complete(null, -7);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not register with ");
            stringBuilder.append(this.getProviderName());
            stringBuilder.append(" due to an issue with your AndroidManifest.xml or with 'Google Play services'.");
            OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString(), (Throwable)throwable);
            this.registeredHandler.complete(null, -8);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean isValidProjectNumber(String var1, PushRegistrator.RegisteredHandler var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9 : ILOAD_3 : trying to set 1 previously set to 0
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

    private void registerInBackground(String string2) {
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle = this;
        synchronized (pushRegistratorAbstractGoogle) {
            Thread thread;
            block5 : {
                Thread thread2 = this.registerThread;
                if (thread2 == null) break block5;
                boolean bl = thread2.isAlive();
                if (!bl) break block5;
                return;
            }
            this.registerThread = thread = new Thread((Runnable)new 1(this, string2));
            thread.start();
            return;
        }
    }

    abstract String getProviderName();

    abstract String getToken(String var1) throws Throwable;

    public void registerForPush(Context context, String string2, PushRegistrator.RegisteredHandler registeredHandler) {
        this.registeredHandler = registeredHandler;
        if (this.isValidProjectNumber(string2, registeredHandler)) {
            this.internalRegisterForPush(string2);
        }
    }
}

