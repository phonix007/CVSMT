/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import org.json.JSONObject;

public class OSNotificationAction {
    private final String actionId;
    private final ActionType type;

    public OSNotificationAction(ActionType actionType, String string2) {
        this.type = actionType;
        this.actionId = string2;
    }

    public String getActionId() {
        return this.actionId;
    }

    public ActionType getType() {
        return this.type;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.type.ordinal());
            jSONObject.put("actionId", (Object)this.actionId);
            return jSONObject;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return jSONObject;
        }
    }

    public static final class ActionType
    extends Enum<ActionType> {
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final /* enum */ ActionType ActionTaken;
        public static final /* enum */ ActionType Opened;

        static {
            ActionType actionType;
            ActionType actionType2;
            Opened = actionType2 = new ActionType();
            ActionTaken = actionType = new ActionType();
            $VALUES = new ActionType[]{actionType2, actionType};
        }

        public static ActionType valueOf(String string2) {
            return (ActionType)Enum.valueOf(ActionType.class, (String)string2);
        }

        public static ActionType[] values() {
            return (ActionType[])$VALUES.clone();
        }
    }

}

