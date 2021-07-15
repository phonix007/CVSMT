/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignalAPIClient
 *  com.onesignal.OneSignalApiResponseHandler
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.OneSignalRestClient;
import org.json.JSONObject;

class OneSignalRestClientWrapper
implements OneSignalAPIClient {
    OneSignalRestClientWrapper() {
    }

    public void get(String string2, final OneSignalApiResponseHandler oneSignalApiResponseHandler, String string3) {
        OneSignalRestClient.get((String)string2, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            public void onFailure(int n, String string2, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(n, string2, throwable);
            }

            public void onSuccess(String string2) {
                oneSignalApiResponseHandler.onSuccess(string2);
            }
        }, (String)string3);
    }

    public void getSync(String string2, final OneSignalApiResponseHandler oneSignalApiResponseHandler, String string3) {
        OneSignalRestClient.getSync((String)string2, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            public void onFailure(int n, String string2, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(n, string2, throwable);
            }

            public void onSuccess(String string2) {
                oneSignalApiResponseHandler.onSuccess(string2);
            }
        }, (String)string3);
    }

    public void post(String string2, JSONObject jSONObject, final OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.post((String)string2, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            public void onFailure(int n, String string2, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(n, string2, throwable);
            }

            public void onSuccess(String string2) {
                oneSignalApiResponseHandler.onSuccess(string2);
            }
        });
    }

    public void postSync(String string2, JSONObject jSONObject, final OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.postSync((String)string2, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            public void onFailure(int n, String string2, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(n, string2, throwable);
            }

            public void onSuccess(String string2) {
                oneSignalApiResponseHandler.onSuccess(string2);
            }
        });
    }

    public void put(String string2, JSONObject jSONObject, final OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.put((String)string2, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            public void onFailure(int n, String string2, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(n, string2, throwable);
            }

            public void onSuccess(String string2) {
                oneSignalApiResponseHandler.onSuccess(string2);
            }
        });
    }

    public void putSync(String string2, JSONObject jSONObject, final OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        OneSignalRestClient.putSync((String)string2, (JSONObject)jSONObject, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            public void onFailure(int n, String string2, Throwable throwable) {
                oneSignalApiResponseHandler.onFailure(n, string2, throwable);
            }

            public void onSuccess(String string2) {
                oneSignalApiResponseHandler.onSuccess(string2);
            }
        });
    }

}

