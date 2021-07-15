/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OSOutcomeEvent
 *  com.onesignal.OneSignalApiResponseHandler
 *  com.onesignal.influence.domain.OSInfluenceType
 *  com.onesignal.outcomes.data.OSOutcomeEventsCache
 *  com.onesignal.outcomes.data.OSOutcomeEventsRepository
 *  com.onesignal.outcomes.data.OSOutcomeEventsV1Repository$WhenMappings
 *  com.onesignal.outcomes.data.OutcomeEventsService
 *  com.onesignal.outcomes.domain.OSOutcomeEventParams
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OSOutcomeEvent;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.data.OSOutcomeEventsCache;
import com.onesignal.outcomes.data.OSOutcomeEventsRepository;
import com.onesignal.outcomes.data.OSOutcomeEventsV1Repository;
import com.onesignal.outcomes.data.OutcomeEventsService;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension(value="SMAP\nOSOutcomeEventsV1Repository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSOutcomeEventsV1Repository.kt\ncom/onesignal/outcomes/data/OSOutcomeEventsV1Repository\n*L\n1#1,65:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00a8\u0006\u0018"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsV1Repository;", "Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "logger", "Lcom/onesignal/OSLogger;", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "outcomeEventsService", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;Lcom/onesignal/outcomes/data/OutcomeEventsService;)V", "requestMeasureDirectOutcomeEvent", "", "appId", "", "deviceType", "", "event", "Lcom/onesignal/OSOutcomeEvent;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "requestMeasureIndirectOutcomeEvent", "requestMeasureOutcomeEvent", "eventParams", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "requestMeasureUnattributedOutcomeEvent", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSOutcomeEventsV1Repository
extends OSOutcomeEventsRepository {
    public OSOutcomeEventsV1Repository(OSLogger oSLogger, OSOutcomeEventsCache oSOutcomeEventsCache, OutcomeEventsService outcomeEventsService) {
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventsCache, (String)"outcomeEventsCache");
        Intrinsics.checkParameterIsNotNull((Object)outcomeEventsService, (String)"outcomeEventsService");
        super(oSLogger, oSOutcomeEventsCache, outcomeEventsService);
    }

    private final void requestMeasureDirectOutcomeEvent(String string, int n, OSOutcomeEvent oSOutcomeEvent, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        try {
            JSONObject jSONObject = oSOutcomeEvent.toJSONObjectForMeasure().put("app_id", (Object)string).put("device_type", n).put("direct", true);
            OutcomeEventsService outcomeEventsService = this.getOutcomeEventsService();
            Intrinsics.checkExpressionValueIsNotNull((Object)jSONObject, (String)"jsonObject");
            outcomeEventsService.sendOutcomeEvent(jSONObject, oneSignalApiResponseHandler);
            return;
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating direct outcome:JSON Failed.", (Throwable)jSONException);
            return;
        }
    }

    private final void requestMeasureIndirectOutcomeEvent(String string, int n, OSOutcomeEvent oSOutcomeEvent, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        try {
            JSONObject jSONObject = oSOutcomeEvent.toJSONObjectForMeasure().put("app_id", (Object)string).put("device_type", n).put("direct", false);
            OutcomeEventsService outcomeEventsService = this.getOutcomeEventsService();
            Intrinsics.checkExpressionValueIsNotNull((Object)jSONObject, (String)"jsonObject");
            outcomeEventsService.sendOutcomeEvent(jSONObject, oneSignalApiResponseHandler);
            return;
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating indirect outcome:JSON Failed.", (Throwable)jSONException);
            return;
        }
    }

    private final void requestMeasureUnattributedOutcomeEvent(String string, int n, OSOutcomeEvent oSOutcomeEvent, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        try {
            JSONObject jSONObject = oSOutcomeEvent.toJSONObjectForMeasure().put("app_id", (Object)string).put("device_type", n);
            OutcomeEventsService outcomeEventsService = this.getOutcomeEventsService();
            Intrinsics.checkExpressionValueIsNotNull((Object)jSONObject, (String)"jsonObject");
            outcomeEventsService.sendOutcomeEvent(jSONObject, oneSignalApiResponseHandler);
            return;
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating unattributed outcome:JSON Failed.", (Throwable)jSONException);
            return;
        }
    }

    public void requestMeasureOutcomeEvent(String string, int n, OSOutcomeEventParams oSOutcomeEventParams, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"appId");
        Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"eventParams");
        Intrinsics.checkParameterIsNotNull((Object)oneSignalApiResponseHandler, (String)"responseHandler");
        OSOutcomeEvent oSOutcomeEvent = OSOutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1((OSOutcomeEventParams)oSOutcomeEventParams);
        Intrinsics.checkExpressionValueIsNotNull((Object)oSOutcomeEvent, (String)"event");
        OSInfluenceType oSInfluenceType = oSOutcomeEvent.getSession();
        if (oSInfluenceType == null) {
            return;
        }
        int n2 = WhenMappings.$EnumSwitchMapping$0[oSInfluenceType.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return;
                }
                this.requestMeasureUnattributedOutcomeEvent(string, n, oSOutcomeEvent, oneSignalApiResponseHandler);
                return;
            }
            this.requestMeasureIndirectOutcomeEvent(string, n, oSOutcomeEvent, oneSignalApiResponseHandler);
            return;
        }
        this.requestMeasureDirectOutcomeEvent(string, n, oSOutcomeEvent, oneSignalApiResponseHandler);
    }
}

