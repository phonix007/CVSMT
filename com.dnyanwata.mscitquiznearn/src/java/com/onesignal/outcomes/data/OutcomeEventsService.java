/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.Metadata
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.data;

import com.onesignal.OneSignalApiResponseHandler;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2={"Lcom/onesignal/outcomes/data/OutcomeEventsService;", "", "sendOutcomeEvent", "", "jsonObject", "Lorg/json/JSONObject;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "onesignal_release"}, k=1, mv={1, 1, 16})
public interface OutcomeEventsService {
    public void sendOutcomeEvent(JSONObject var1, OneSignalApiResponseHandler var2);
}

