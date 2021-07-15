/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  com.huawei.hmf.tasks.OnFailureListener
 *  com.huawei.hmf.tasks.OnSuccessListener
 *  com.huawei.hmf.tasks.Task
 *  com.huawei.hms.location.FusedLocationProviderClient
 *  com.huawei.hms.location.LocationCallback
 *  com.huawei.hms.location.LocationServices
 *  com.onesignal.HMSLocationController$1
 *  com.onesignal.HMSLocationController$2
 *  com.onesignal.HMSLocationController$LocationUpdateListener
 *  com.onesignal.LocationController
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.Context;
import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationServices;
import com.onesignal.HMSLocationController;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;

/*
 * Exception performing whole class analysis.
 */
class HMSLocationController
extends LocationController {
    private static FusedLocationProviderClient hmsFusedLocationClient;
    static LocationUpdateListener locationUpdateListener;

    HMSLocationController() {
    }

    static /* synthetic */ FusedLocationProviderClient access$000() {
        return hmsFusedLocationClient;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void fireFailedComplete() {
        Object object;
        Object object2 = object = syncLock;
        synchronized (object2) {
            hmsFusedLocationClient = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void initHuaweiLocation() {
        Object object;
        Object object2 = object = syncLock;
        synchronized (object2) {
            FusedLocationProviderClient fusedLocationProviderClient = hmsFusedLocationClient;
            if (fusedLocationProviderClient == null) {
                try {
                    hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient((Context)classContext);
                }
                catch (Exception exception) {
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Huawei LocationServices getFusedLocationProviderClient failed! ");
                    stringBuilder.append((Object)exception);
                    OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                    HMSLocationController.fireFailedComplete();
                    return;
                }
            }
            if (lastLocation != null) {
                HMSLocationController.fireCompleteForLocation((Location)lastLocation);
            } else {
                hmsFusedLocationClient.getLastLocation().addOnSuccessListener((OnSuccessListener)new 2()).addOnFailureListener((OnFailureListener)new 1());
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void onFocusChange() {
        Object object;
        Object object2 = object = syncLock;
        synchronized (object2) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"HMSLocationController onFocusChange!");
            if (HMSLocationController.isHMSAvailable() && hmsFusedLocationClient == null) {
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = hmsFusedLocationClient;
            if (fusedLocationProviderClient != null) {
                LocationUpdateListener locationUpdateListener = HMSLocationController.locationUpdateListener;
                if (locationUpdateListener != null) {
                    fusedLocationProviderClient.removeLocationUpdates((LocationCallback)locationUpdateListener);
                }
                HMSLocationController.locationUpdateListener = new /* Unavailable Anonymous Inner Class!! */;
            }
            return;
        }
    }

    static void startGetLocation() {
        HMSLocationController.initHuaweiLocation();
    }
}

