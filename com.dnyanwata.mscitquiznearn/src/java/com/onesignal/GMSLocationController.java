/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Handler
 *  com.google.android.gms.common.ConnectionResult
 *  com.google.android.gms.common.api.Api
 *  com.google.android.gms.common.api.GoogleApiClient
 *  com.google.android.gms.common.api.GoogleApiClient$Builder
 *  com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
 *  com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
 *  com.google.android.gms.common.api.PendingResult
 *  com.google.android.gms.location.FusedLocationProviderApi
 *  com.google.android.gms.location.LocationListener
 *  com.google.android.gms.location.LocationServices
 *  com.onesignal.GMSLocationController$1
 *  com.onesignal.GMSLocationController$FusedLocationApiWrapper
 *  com.onesignal.GMSLocationController$LocationUpdateListener
 *  com.onesignal.GoogleApiClientCompatProxy
 *  com.onesignal.LocationController
 *  com.onesignal.LocationController$LocationHandlerThread
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.PermissionsActivity
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.onesignal.GMSLocationController;
import com.onesignal.GoogleApiClientCompatProxy;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;

/*
 * Exception performing whole class analysis.
 */
class GMSLocationController
extends LocationController {
    static final int API_FALLBACK_TIME = 30000;
    private static GoogleApiClientCompatProxy googleApiClient;
    static LocationUpdateListener locationUpdateListener;

    GMSLocationController() {
    }

    static /* synthetic */ int access$100() {
        return GMSLocationController.getApiFallbackWait();
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
            GoogleApiClientCompatProxy googleApiClientCompatProxy = googleApiClient;
            if (googleApiClientCompatProxy != null) {
                googleApiClientCompatProxy.disconnect();
            }
            googleApiClient = null;
            return;
        }
    }

    private static int getApiFallbackWait() {
        return 30000;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void initGoogleLocation() {
        Object object;
        if (fallbackFailThread != null) {
            return;
        }
        Object object2 = object = syncLock;
        synchronized (object2) {
            GMSLocationController.startFallBackThread();
            if (googleApiClient != null && lastLocation != null) {
                GMSLocationController.fireCompleteForLocation((Location)lastLocation);
            } else {
                GoogleApiClientCompatProxy googleApiClientCompatProxy;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = new GoogleApiClient.ConnectionCallbacks(null){
                    {
                        this();
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public void onConnected(Bundle bundle) {
                        Object object;
                        Object object2 = object = LocationController.syncLock;
                        synchronized (object2) {
                            PermissionsActivity.answered = false;
                            if (googleApiClient != null && googleApiClient.realInstance() != null) {
                                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("GMSLocationController GoogleApiClientListener onConnected lastLocation: ");
                                stringBuilder.append((Object)LocationController.lastLocation);
                                OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                                if (LocationController.lastLocation == null) {
                                    LocationController.lastLocation = FusedLocationApiWrapper.getLastLocation((GoogleApiClient)googleApiClient.realInstance());
                                    OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.DEBUG;
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("GMSLocationController GoogleApiClientListener lastLocation: ");
                                    stringBuilder2.append((Object)LocationController.lastLocation);
                                    OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL2, (String)stringBuilder2.toString());
                                    if (LocationController.lastLocation != null) {
                                        LocationController.fireCompleteForLocation((Location)LocationController.lastLocation);
                                    }
                                }
                                GMSLocationController.locationUpdateListener = new /* Unavailable Anonymous Inner Class!! */;
                                return;
                            }
                            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
                            return;
                        }
                    }

                    public void onConnectionFailed(ConnectionResult connectionResult) {
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: ");
                        stringBuilder.append((Object)connectionResult);
                        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                        GMSLocationController.fireFailedComplete();
                    }

                    public void onConnectionSuspended(int n) {
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("GMSLocationController GoogleApiClientListener onConnectionSuspended i: ");
                        stringBuilder.append(n);
                        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                        GMSLocationController.fireFailedComplete();
                    }
                };
                googleApiClient = googleApiClientCompatProxy = new GoogleApiClientCompatProxy(new GoogleApiClient.Builder(classContext).addApi(LocationServices.API).addConnectionCallbacks(connectionCallbacks).addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)connectionCallbacks).setHandler(GMSLocationController.getLocationHandlerThread().mHandler).build());
                googleApiClientCompatProxy.connect();
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
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"GMSLocationController onFocusChange!");
            GoogleApiClientCompatProxy googleApiClientCompatProxy = googleApiClient;
            if (googleApiClientCompatProxy != null && googleApiClientCompatProxy.realInstance().isConnected()) {
                GoogleApiClientCompatProxy googleApiClientCompatProxy2 = googleApiClient;
                if (googleApiClientCompatProxy2 != null) {
                    GoogleApiClient googleApiClient = googleApiClientCompatProxy2.realInstance();
                    if (locationUpdateListener != null) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, (LocationListener)locationUpdateListener);
                    }
                    locationUpdateListener = new /* Unavailable Anonymous Inner Class!! */;
                }
                return;
            }
            return;
        }
    }

    private static void startFallBackThread() {
        fallbackFailThread = new Thread((Runnable)new 1(), "OS_GMS_LOCATION_FALLBACK");
        fallbackFailThread.start();
    }

    static void startGetLocation() {
        GMSLocationController.initGoogleLocation();
    }

}

