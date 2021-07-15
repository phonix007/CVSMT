/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.onesignal;

import com.onesignal.OSLogger;
import com.onesignal.OneSignal;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class OSTaskController {
    static final String OS_PENDING_EXECUTOR = "OS_PENDING_EXECUTOR_";
    private final AtomicLong lastTaskId = new AtomicLong();
    protected final OSLogger logger;
    private ExecutorService pendingTaskExecutor;
    private final ConcurrentLinkedQueue<Runnable> taskQueueWaitingForInit = new ConcurrentLinkedQueue();

    OSTaskController(OSLogger oSLogger) {
        this.logger = oSLogger;
    }

    private void addTaskToQueue(PendingTaskRunnable pendingTaskRunnable) {
        pendingTaskRunnable.taskId = this.lastTaskId.incrementAndGet();
        ExecutorService executorService = this.pendingTaskExecutor;
        if (executorService == null) {
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Adding a task to the pending queue with ID: ");
            stringBuilder.append(pendingTaskRunnable.taskId);
            oSLogger.debug(stringBuilder.toString());
            this.taskQueueWaitingForInit.add((Object)pendingTaskRunnable);
            return;
        }
        if (!executorService.isShutdown()) {
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Executor is still running, add to the executor with ID: ");
            stringBuilder.append(pendingTaskRunnable.taskId);
            oSLogger.debug(stringBuilder.toString());
            try {
                this.pendingTaskExecutor.submit((Runnable)pendingTaskRunnable);
                return;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                OSLogger oSLogger2 = this.logger;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Executor is shutdown, running task manually with ID: ");
                stringBuilder2.append(pendingTaskRunnable.taskId);
                oSLogger2.info(stringBuilder2.toString());
                pendingTaskRunnable.run();
                rejectedExecutionException.printStackTrace();
            }
        }
    }

    private void onTaskRan(long l) {
        if (this.lastTaskId.get() == l) {
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "Last Pending Task has ran, shutting down");
            this.pendingTaskExecutor.shutdown();
        }
    }

    void addTaskToQueue(Runnable runnable) {
        this.addTaskToQueue(new PendingTaskRunnable(this, runnable));
    }

    ConcurrentLinkedQueue<Runnable> getTaskQueueWaitingForInit() {
        return this.taskQueueWaitingForInit;
    }

    boolean shouldRunTaskThroughQueue() {
        if (Thread.currentThread().getName().contains((CharSequence)OS_PENDING_EXECUTOR)) {
            return false;
        }
        if (OneSignal.isInitDone() && this.pendingTaskExecutor == null) {
            return false;
        }
        if (!OneSignal.isInitDone() && this.pendingTaskExecutor == null) {
            return true;
        }
        return true ^ this.pendingTaskExecutor.isShutdown();
    }

    void startPendingTasks() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("startPendingTasks with task queue quantity: ");
        stringBuilder.append(this.taskQueueWaitingForInit.size());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (!this.taskQueueWaitingForInit.isEmpty()) {
            this.pendingTaskExecutor = Executors.newSingleThreadExecutor((ThreadFactory)new ThreadFactory(){

                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(OSTaskController.OS_PENDING_EXECUTOR);
                    stringBuilder.append(thread.getId());
                    thread.setName(stringBuilder.toString());
                    return thread;
                }
            });
            while (!this.taskQueueWaitingForInit.isEmpty()) {
                this.pendingTaskExecutor.submit((Runnable)this.taskQueueWaitingForInit.poll());
            }
        }
    }

    private static class PendingTaskRunnable
    implements Runnable {
        private OSTaskController controller;
        private Runnable innerTask;
        private long taskId;

        PendingTaskRunnable(OSTaskController oSTaskController, Runnable runnable) {
            this.controller = oSTaskController;
            this.innerTask = runnable;
        }

        public void run() {
            this.innerTask.run();
            this.controller.onTaskRan(this.taskId);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PendingTaskRunnable{innerTask=");
            stringBuilder.append((Object)this.innerTask);
            stringBuilder.append(", taskId=");
            stringBuilder.append(this.taskId);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

}

