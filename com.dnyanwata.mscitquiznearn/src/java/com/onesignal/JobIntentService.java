/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobParameters
 *  android.app.job.JobScheduler
 *  android.app.job.JobServiceEngine
 *  android.app.job.JobWorkItem
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.concurrent.Executor
 */
package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

abstract class JobIntentService
extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> sClassWorkEnqueuer;
    static final Object sLock;
    final ArrayList<CompatWorkItem> mCompatQueue = new ArrayList();
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    CompatJobEngine mJobImpl;
    boolean mStopped = false;

    static {
        sLock = new Object();
        sClassWorkEnqueuer = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void enqueueWork(Context context, ComponentName componentName, int n, Intent intent, boolean bl) {
        Object object;
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        Object object2 = object = sLock;
        synchronized (object2) {
            IllegalStateException illegalStateException2;
            block5 : {
                WorkEnqueuer workEnqueuer = JobIntentService.getWorkEnqueuer(context, componentName, true, n, bl);
                workEnqueuer.ensureJobId(n);
                try {
                    workEnqueuer.enqueueWork(intent);
                }
                catch (IllegalStateException illegalStateException2) {
                    if (!bl) break block5;
                    JobIntentService.getWorkEnqueuer(context, componentName, true, n, false).enqueueWork(intent);
                }
                return;
            }
            throw illegalStateException2;
        }
    }

    public static void enqueueWork(Context context, Class class_, int n, Intent intent, boolean bl) {
        JobIntentService.enqueueWork(context, new ComponentName(context, class_), n, intent, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean bl, int n, boolean bl2) {
        void var8_10;
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = sClassWorkEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, bl2);
        WorkEnqueuer workEnqueuer = (WorkEnqueuer)hashMap.get((Object)componentNameWithWakeful);
        if (workEnqueuer != null) return workEnqueuer;
        if (Build.VERSION.SDK_INT >= 26 && !bl2) {
            if (!bl) throw new IllegalArgumentException("Can't be here without a job id");
            WorkEnqueuer workEnqueuer2 = new WorkEnqueuer(context, componentName, n){
                private final JobInfo mJobInfo;
                private final JobScheduler mJobScheduler;
                {
                    this.ensureJobId(n);
                    this.mJobInfo = new JobInfo.Builder(n, this.mComponentName).setOverrideDeadline(0L).build();
                    this.mJobScheduler = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
                }

                @Override
                void enqueueWork(Intent intent) {
                    this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
                }
            };
        } else {
            WorkEnqueuer workEnqueuer3 = new WorkEnqueuer(context, componentName){
                private final Context mContext;
                private final PowerManager.WakeLock mLaunchWakeLock;
                boolean mLaunchingService;
                private final PowerManager.WakeLock mRunWakeLock;
                boolean mServiceProcessing;
                {
                    PowerManager.WakeLock wakeLock;
                    PowerManager.WakeLock wakeLock2;
                    super(componentName);
                    this.mContext = context.getApplicationContext();
                    PowerManager powerManager = (PowerManager)context.getSystemService("power");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(componentName.getClassName());
                    stringBuilder.append(":launch");
                    this.mLaunchWakeLock = wakeLock = powerManager.newWakeLock(1, stringBuilder.toString());
                    wakeLock.setReferenceCounted(false);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(componentName.getClassName());
                    stringBuilder2.append(":run");
                    this.mRunWakeLock = wakeLock2 = powerManager.newWakeLock(1, stringBuilder2.toString());
                    wakeLock2.setReferenceCounted(false);
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                void enqueueWork(Intent intent) {
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(this.mComponentName);
                    if (this.mContext.startService(intent2) == null) {
                        return;
                    }
                    CompatWorkEnqueuer compatWorkEnqueuer = this;
                    synchronized (compatWorkEnqueuer) {
                        if (!this.mLaunchingService) {
                            this.mLaunchingService = true;
                            if (!this.mServiceProcessing) {
                                this.mLaunchWakeLock.acquire(60000L);
                            }
                        }
                        return;
                    }
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void serviceProcessingFinished() {
                    CompatWorkEnqueuer compatWorkEnqueuer = this;
                    synchronized (compatWorkEnqueuer) {
                        if (this.mServiceProcessing) {
                            if (this.mLaunchingService) {
                                this.mLaunchWakeLock.acquire(60000L);
                            }
                            this.mServiceProcessing = false;
                            this.mRunWakeLock.release();
                        }
                        return;
                    }
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void serviceProcessingStarted() {
                    CompatWorkEnqueuer compatWorkEnqueuer = this;
                    synchronized (compatWorkEnqueuer) {
                        if (!this.mServiceProcessing) {
                            this.mServiceProcessing = true;
                            this.mRunWakeLock.acquire(600000L);
                            this.mLaunchWakeLock.release();
                        }
                        return;
                    }
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void serviceStartReceived() {
                    CompatWorkEnqueuer compatWorkEnqueuer = this;
                    synchronized (compatWorkEnqueuer) {
                        this.mLaunchingService = false;
                        return;
                    }
                }
            };
        }
        workEnqueuer = var8_10;
        hashMap.put((Object)componentNameWithWakeful, (Object)workEnqueuer);
        return workEnqueuer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    GenericWorkItem dequeueWork() {
        GenericWorkItem genericWorkItem;
        ArrayList<CompatWorkItem> arrayList;
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null && (genericWorkItem = compatJobEngine.dequeueWork()) != null) {
            return genericWorkItem;
        }
        ArrayList<CompatWorkItem> arrayList2 = arrayList = this.mCompatQueue;
        synchronized (arrayList2) {
            if (this.mCompatQueue.size() <= 0) return null;
            return (GenericWorkItem)this.mCompatQueue.remove(0);
        }
    }

    boolean doStopCurrentWork() {
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return this.onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean bl) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && bl) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new CompatJobEngine(this){
                static final boolean DEBUG = false;
                static final String TAG = "JobServiceEngineImpl";
                final Object mLock = new Object();
                JobParameters mParams;
                final JobIntentService mService;
                {
                    this.mService = jobIntentService;
                }

                @Override
                public IBinder compatGetBinder() {
                    return this.getBinder();
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Converted monitor instructions to comments
                 * Lifted jumps to return sites
                 */
                @Override
                public GenericWorkItem dequeueWork() {
                    JobWorkItem jobWorkItem;
                    Object object;
                    Object object2 = object = this.mLock;
                    // MONITORENTER : object2
                    JobParameters jobParameters = this.mParams;
                    if (jobParameters == null) {
                        // MONITOREXIT : object2
                        return null;
                    }
                    try {
                        jobWorkItem = jobParameters.dequeueWork();
                        // MONITOREXIT : object2
                        if (jobWorkItem == null) return null;
                    }
                    catch (SecurityException securityException) {
                        Log.e((String)TAG, (String)"Failed to run mParams.dequeueWork()!", (Throwable)securityException);
                        // MONITOREXIT : object2
                        return null;
                    }
                    jobWorkItem.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                    return new WrapperWorkItem(jobWorkItem);
                }

                public boolean onStartJob(JobParameters jobParameters) {
                    this.mParams = jobParameters;
                    this.mService.ensureProcessorRunningLocked(false);
                    return true;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public boolean onStopJob(JobParameters jobParameters) {
                    Object object;
                    boolean bl = this.mService.doStopCurrentWork();
                    Object object2 = object = this.mLock;
                    synchronized (object2) {
                        this.mParams = null;
                        return bl;
                    }
                }

                final class WrapperWorkItem
                implements GenericWorkItem {
                    final JobWorkItem mJobWork;

                    WrapperWorkItem(JobWorkItem jobWorkItem) {
                        this.mJobWork = jobWorkItem;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Override
                    public void complete() {
                        Object object;
                        Object object2 = object = JobServiceEngineImpl.this.mLock;
                        synchronized (object2) {
                            JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                            if (jobParameters != null) {
                                try {
                                    JobServiceEngineImpl.this.mParams.completeWork(this.mJobWork);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    Log.e((String)JobServiceEngineImpl.TAG, (String)"IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", (Throwable)illegalArgumentException);
                                }
                                catch (SecurityException securityException) {
                                    Log.e((String)JobServiceEngineImpl.TAG, (String)"SecurityException: Failed to run mParams.completeWork(mJobWork)!", (Throwable)securityException);
                                }
                            }
                            return;
                        }
                    }

                    @Override
                    public Intent getIntent() {
                        return this.mJobWork.getIntent();
                    }
                }

            };
            this.mCompatWorkEnqueuer = null;
        }
        this.mCompatWorkEnqueuer = JobIntentService.getWorkEnqueuer((Context)this, new ComponentName((Context)this, this.getClass()), false, 0, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        ArrayList<CompatWorkItem> arrayList;
        super.onDestroy();
        this.doStopCurrentWork();
        ArrayList<CompatWorkItem> arrayList2 = arrayList = this.mCompatQueue;
        synchronized (arrayList2) {
            this.mDestroyed = true;
            this.mCompatWorkEnqueuer.serviceProcessingFinished();
            return;
        }
    }

    protected abstract void onHandleWork(Intent var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int onStartCommand(Intent intent, int n, int n2) {
        ArrayList<CompatWorkItem> arrayList;
        this.mCompatWorkEnqueuer.serviceStartReceived();
        ArrayList<CompatWorkItem> arrayList2 = arrayList = this.mCompatQueue;
        synchronized (arrayList2) {
            ArrayList<CompatWorkItem> arrayList3 = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList3.add((Object)new GenericWorkItem(intent, n2){
                final Intent mIntent;
                final int mStartId;
                {
                    this.mIntent = intent;
                    this.mStartId = n;
                }

                @Override
                public void complete() {
                    JobIntentService.this.stopSelf(this.mStartId);
                }

                @Override
                public Intent getIntent() {
                    return this.mIntent;
                }
            });
            this.ensureProcessorRunningLocked(true);
            return 3;
        }
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void processorFinished() {
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList == null) {
            return;
        }
        ArrayList<CompatWorkItem> arrayList2 = arrayList;
        synchronized (arrayList2) {
            this.mCurProcessor = null;
            ArrayList<CompatWorkItem> arrayList3 = this.mCompatQueue;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.ensureProcessorRunningLocked(false);
            } else if (!this.mDestroyed) {
                this.mCompatWorkEnqueuer.serviceProcessingFinished();
            }
            return;
        }
    }

    public void setInterruptIfStopped(boolean bl) {
        this.mInterruptIfStopped = bl;
    }

    final class CommandProcessor
    extends AsyncTask<Void, Void, Void> {
        CommandProcessor() {
        }

        protected /* varargs */ Void doInBackground(Void ... arrvoid) {
            GenericWorkItem genericWorkItem;
            while ((genericWorkItem = JobIntentService.this.dequeueWork()) != null) {
                JobIntentService.this.onHandleWork(genericWorkItem.getIntent());
                genericWorkItem.complete();
            }
            return null;
        }

        protected void onCancelled(Void void_) {
            JobIntentService.this.processorFinished();
        }

        protected void onPostExecute(Void void_) {
            JobIntentService.this.processorFinished();
        }
    }

    static interface CompatJobEngine {
        public IBinder compatGetBinder();

        public GenericWorkItem dequeueWork();
    }

    private static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        ComponentNameWithWakeful(ComponentName componentName, boolean bl) {
            this.componentName = componentName;
            this.useWakefulService = bl;
        }
    }

    static interface GenericWorkItem {
        public void complete();

        public Intent getIntent();
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        abstract void enqueueWork(Intent var1);

        void ensureJobId(int n) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = n;
                return;
            }
            if (this.mJobId == n) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Given job ID ");
            stringBuilder.append(n);
            stringBuilder.append(" is different than previous ");
            stringBuilder.append(this.mJobId);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

}

